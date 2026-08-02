package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class go2 {
    public final e9 a;
    public final jo2 b;
    public final Handler c;
    public boolean d;

    public go2(e9 e9Var, jo2 jo2Var) {
        this(e9Var, jo2Var, new Handler(Looper.getMainLooper()));
    }

    public go2(e9 e9Var, jo2 jo2Var, Handler handler) {
        this.a = e9Var;
        this.b = jo2Var;
        this.c = handler;
    }
}
