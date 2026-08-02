package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes11.dex */
public abstract class nx21 {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static final void a(sls slsVar) {
        a.post(new u601(5, slsVar));
    }
}
