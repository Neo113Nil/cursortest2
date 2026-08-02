package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import xsna.ajz0;
import xsna.h8z0;
import xsna.hjz0;
import xsna.xoy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class woy0 implements ajz0.a, yads.v31, h8z0.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ woy0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.v31
    public void a(Drawable drawable) {
        yads.f51.a((yads.f51) this.b, (yads.x41) this.c, drawable);
    }

    @Override // xsna.ajz0.a
    public void a(wfy0 wfy0Var, int i, dhz0 dhz0Var, View view) {
        xoy0 xoy0Var = (xoy0) this.b;
        xoy0.b bVar = (xoy0.b) this.c;
        if (bVar != null) {
            ((pbz0) bVar).g(wfy0Var, i, dhz0Var, xoy0Var);
        }
    }

    @Override // xsna.h8z0.b
    public void a() {
        t6z0 t6z0Var = (t6z0) this.b;
        s4z0 s4z0Var = (s4z0) this.c;
        hjz0.a aVar = t6z0Var.a;
        String str = s4z0Var.F;
        yil0.d(aVar);
    }
}
