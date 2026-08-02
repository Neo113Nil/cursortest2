package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class o4 {
    public final yp2 a;
    public final String b;
    public final Context c;

    public /* synthetic */ o4(Context context) {
        this(context, xp2.a());
    }

    public final void a(pn pnVar) {
        pnVar.q = this.b;
        yp2 yp2Var = this.a;
        Context context = this.c;
        synchronized (yp2Var) {
            t92.a(context).a(pnVar);
        }
    }

    public o4(Context context, yp2 yp2Var) {
        this.a = yp2Var;
        this.b = tb.a(this);
        this.c = context.getApplicationContext();
    }
}
