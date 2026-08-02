package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class eyj0 {
    public final Handler a;
    public final k020 c;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final zq60 d = new zq60();
    public final HashMap e = new HashMap();

    public eyj0(Looper looper, k020 k020Var) {
        this.a = new Handler(looper);
        this.c = k020Var;
    }
}
