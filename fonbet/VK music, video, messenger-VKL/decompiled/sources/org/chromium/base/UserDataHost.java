package org.chromium.base;

import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;

/* loaded from: classes8.dex */
public final class UserDataHost {
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();
    private HashMap<Class<? extends UserData>, UserData> mUserDataMap = new HashMap<>();

    private void checkThreadAndState() {
        this.mThreadChecker.assertOnValidThread();
        if (this.mUserDataMap == null) {
            throw new IllegalStateException("Operation is not allowed after destroy().");
        }
    }

    public void destroy() {
        checkThreadAndState();
        HashMap<Class<? extends UserData>, UserData> hashMap = this.mUserDataMap;
        this.mUserDataMap = null;
        Iterator<UserData> it = hashMap.values().iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    public <T extends UserData> T getUserData(Class<T> cls) {
        checkThreadAndState();
        if (cls != null) {
            return cls.cast(this.mUserDataMap.get(cls));
        }
        throw new IllegalArgumentException();
    }

    public <T extends UserData> T removeUserData(Class<T> cls) {
        checkThreadAndState();
        if (cls == null) {
            throw new IllegalArgumentException();
        }
        UserData remove = this.mUserDataMap.remove(cls);
        if (remove != null) {
            return cls.cast(remove);
        }
        throw new IllegalStateException("UserData for the key is not present.");
    }

    public <T extends UserData> T setUserData(Class<T> cls, T t) {
        checkThreadAndState();
        if (cls == null || t == null) {
            throw new IllegalArgumentException();
        }
        this.mUserDataMap.put(cls, t);
        return (T) getUserData(cls);
    }
}
