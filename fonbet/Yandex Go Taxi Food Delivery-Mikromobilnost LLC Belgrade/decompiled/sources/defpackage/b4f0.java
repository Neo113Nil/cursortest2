package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class b4f0 {
    public final k020 a;
    public final Handler b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final zq60 d = new zq60();

    public b4f0(Looper looper, k020 k020Var) {
        this.a = k020Var;
        this.b = new Handler(looper);
    }
}
