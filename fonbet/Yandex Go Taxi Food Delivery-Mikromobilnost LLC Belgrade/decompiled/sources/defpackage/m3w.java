package defpackage;

import com.google.firebase.sessions.SessionsActivityLifecycleCallbacks;

/* loaded from: classes.dex */
public final class m3w implements wvf0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m3w(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static m3w a(Object obj) {
        if (obj != null) {
            return new m3w(0, obj);
        }
        ny61.t("instance cannot be null");
        return null;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return obj;
            case 1:
                return new xyq0((pzq0) ((yvf0) obj).get());
            default:
                return new SessionsActivityLifecycleCallbacks((wpr0) ((wvf0) obj).get());
        }
    }
}
