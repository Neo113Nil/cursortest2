package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.lifetime.DestroyChecker;
import xsna.h12;

/* loaded from: classes8.dex */
public final class UnownedUserDataHost {
    private final DestroyChecker mDestroyChecker;
    private Handler mHandler;
    private final ThreadUtils.ThreadChecker mThreadChecker;
    private HashMap<UnownedUserDataKey<?>, WeakReference<? extends UnownedUserData>> mUnownedUserDataMap;

    public UnownedUserDataHost() {
        this(new Handler(retrieveNonNullLooperOrThrow()));
    }

    private void checkState() {
        this.mThreadChecker.assertOnValidThread();
        this.mDestroyChecker.checkNotDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$remove$0(UnownedUserData unownedUserData) {
        unownedUserData.onDetachedFromHost(this);
    }

    private static Looper retrieveNonNullLooperOrThrow() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        throw new IllegalStateException();
    }

    public void destroy() {
        this.mThreadChecker.assertOnValidThread();
        if (isDestroyed()) {
            return;
        }
        Iterator it = new HashSet(this.mUnownedUserDataMap.keySet()).iterator();
        while (it.hasNext()) {
            ((UnownedUserDataKey) it.next()).detachFromHost(this);
        }
        this.mUnownedUserDataMap = null;
        this.mHandler = null;
        this.mDestroyChecker.destroy();
    }

    public <T extends UnownedUserData> T get(UnownedUserDataKey<T> unownedUserDataKey) {
        checkState();
        WeakReference<? extends UnownedUserData> weakReference = this.mUnownedUserDataMap.get(unownedUserDataKey);
        if (weakReference == null) {
            return null;
        }
        UnownedUserData unownedUserData = weakReference.get();
        if (unownedUserData != null) {
            return unownedUserDataKey.getValueClass().cast(unownedUserData);
        }
        unownedUserDataKey.detachFromHost(this);
        return null;
    }

    public int getMapSize() {
        checkState();
        return this.mUnownedUserDataMap.size();
    }

    public boolean isDestroyed() {
        return this.mDestroyChecker.isDestroyed();
    }

    public <T extends UnownedUserData> void remove(UnownedUserDataKey<T> unownedUserDataKey) {
        UnownedUserData unownedUserData;
        checkState();
        WeakReference<? extends UnownedUserData> remove = this.mUnownedUserDataMap.remove(unownedUserDataKey);
        if (remove == null || (unownedUserData = remove.get()) == null || !unownedUserData.informOnDetachmentFromHost()) {
            return;
        }
        this.mHandler.post(new h12(12, this, unownedUserData));
    }

    public <T extends UnownedUserData> void set(UnownedUserDataKey<T> unownedUserDataKey, T t) {
        checkState();
        if (this.mUnownedUserDataMap.containsKey(unownedUserDataKey) && !t.equals(get(unownedUserDataKey))) {
            unownedUserDataKey.detachFromHost(this);
        }
        this.mUnownedUserDataMap.put(unownedUserDataKey, new WeakReference<>(t));
    }

    public UnownedUserDataHost(Handler handler) {
        this.mThreadChecker = new ThreadUtils.ThreadChecker();
        this.mDestroyChecker = new DestroyChecker();
        this.mUnownedUserDataMap = new HashMap<>();
        this.mHandler = handler;
    }
}
