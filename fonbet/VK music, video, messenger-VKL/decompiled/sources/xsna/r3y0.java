package xsna;

import android.content.Context;

/* loaded from: classes11.dex */
public final class r3y0 {
    public static final b c = new b();
    public static r3y0 d;
    public final qvp0 a;
    public final hl20 b;

    public static final class a {
    }

    public static final class b {
        public final r3y0 a(Context context) {
            r3y0 r3y0Var;
            synchronized (this) {
                r3y0Var = r3y0.d;
                if (r3y0Var == null) {
                    r3y0Var = new r3y0(context.getApplicationContext());
                    r3y0.d = r3y0Var;
                }
            }
            return r3y0Var;
        }
    }

    public r3y0(Context context) {
        w5y0 w5y0Var = new w5y0();
        a aVar = new a();
        o04 o04Var = new o04(context);
        owu owuVar = new owu(new slv(new m7z0(context, new qu5()), aVar), new g620(), new a75(), aVar);
        qvp0 qvp0Var = new qvp0(owuVar, new nrn0(owuVar, new mwg0(new uey0(o04Var, new vhk0()), new ru8(context), new v03(new icz0(new gau(), new zle0(), aVar)), new ru.rustore.sdk.metrics.internal.e0(context))));
        this.a = qvp0Var;
        this.b = new hl20(new h6z0(qvp0Var, new tib(owuVar), new i6r0(context, new yfb()), w5y0Var, aVar));
    }
}
