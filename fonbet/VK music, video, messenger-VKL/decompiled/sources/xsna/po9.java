package xsna;

import android.content.Context;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class po9 implements ub9.c, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ po9(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        vo9 vo9Var = (vo9) this.b;
        Context context = (Context) this.c;
        synchronized (vo9.m) {
            p0t a = p0t.a(vo9.q);
            qo9 qo9Var = new qo9(0, vo9Var, context);
            mzm g = xo9.g();
            a.getClass();
            r0t.a(r0t.g(a, qo9Var, g), new uo9(aVar, vo9Var), xo9.g());
        }
        return "CameraX-initialize";
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }
}
