package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class ex80 implements y4e {
    public final Handler a;
    public final w3c b;
    public final o1b0 c;
    public long w = -2000;
    public wor0 x;

    public ex80(Handler handler, w3c w3cVar, o1b0 o1b0Var, a5e a5eVar) {
        this.a = handler;
        this.b = w3cVar;
        this.c = o1b0Var;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        a5eVar.a(this);
    }

    @Override // defpackage.y4e
    public final void c(wor0 wor0Var) {
        this.x = wor0Var;
    }

    @Override // defpackage.y4e
    public final void onConnectionClosed() {
        this.x = null;
    }
}
