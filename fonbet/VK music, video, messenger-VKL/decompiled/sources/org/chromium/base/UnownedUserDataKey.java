package org.chromium.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.base.UnownedUserData;

/* loaded from: classes8.dex */
public final class UnownedUserDataKey<T extends UnownedUserData> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Class<T> mClazz;
    private final Set<UnownedUserDataHost> mWeakHostAttachments = Collections.newSetFromMap(new WeakHashMap());

    public UnownedUserDataKey(Class<T> cls) {
        this.mClazz = cls;
    }

    private void removeHostAttachment(UnownedUserDataHost unownedUserDataHost) {
        unownedUserDataHost.remove(this);
        this.mWeakHostAttachments.remove(unownedUserDataHost);
    }

    public final void attachToHost(UnownedUserDataHost unownedUserDataHost, T t) {
        Objects.requireNonNull(t);
        unownedUserDataHost.set(this, t);
        if (isAttachedToHost(unownedUserDataHost)) {
            return;
        }
        this.mWeakHostAttachments.add(unownedUserDataHost);
    }

    public final void detachFromAllHosts(T t) {
        assertNoDestroyedAttachments();
        Iterator it = new ArrayList(this.mWeakHostAttachments).iterator();
        while (it.hasNext()) {
            UnownedUserDataHost unownedUserDataHost = (UnownedUserDataHost) it.next();
            if (t.equals(unownedUserDataHost.get(this))) {
                removeHostAttachment(unownedUserDataHost);
            }
        }
    }

    public final void detachFromHost(UnownedUserDataHost unownedUserDataHost) {
        assertNoDestroyedAttachments();
        Iterator it = new ArrayList(this.mWeakHostAttachments).iterator();
        while (it.hasNext()) {
            UnownedUserDataHost unownedUserDataHost2 = (UnownedUserDataHost) it.next();
            if (unownedUserDataHost.equals(unownedUserDataHost2)) {
                removeHostAttachment(unownedUserDataHost2);
            }
        }
    }

    public int getHostAttachmentCount(T t) {
        assertNoDestroyedAttachments();
        Iterator<UnownedUserDataHost> it = this.mWeakHostAttachments.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (t.equals(it.next().get(this))) {
                i++;
            }
        }
        return i;
    }

    public final Class<T> getValueClass() {
        return this.mClazz;
    }

    public final boolean isAttachedToAnyHost(T t) {
        return getHostAttachmentCount(t) > 0;
    }

    public final boolean isAttachedToHost(UnownedUserDataHost unownedUserDataHost) {
        return retrieveDataFromHost(unownedUserDataHost) != null;
    }

    public final T retrieveDataFromHost(UnownedUserDataHost unownedUserDataHost) {
        assertNoDestroyedAttachments();
        Iterator<UnownedUserDataHost> it = this.mWeakHostAttachments.iterator();
        while (it.hasNext()) {
            if (unownedUserDataHost.equals(it.next())) {
                return (T) unownedUserDataHost.get(this);
            }
        }
        return null;
    }

    private void assertNoDestroyedAttachments() {
    }
}
