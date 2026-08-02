package yads;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class sk {
    public final Context a;
    public final qk b;
    public boolean c;

    public sk(Context context, Handler handler, xn0 xn0Var) {
        this.a = context.getApplicationContext();
        this.b = new qk(this, handler, xn0Var);
    }

    public final void a() {
        if (this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
