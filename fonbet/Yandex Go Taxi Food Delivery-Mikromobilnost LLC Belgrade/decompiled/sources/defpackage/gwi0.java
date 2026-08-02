package defpackage;

import com.google.firebase.sessions.settings.a;
import com.google.firebase.sessions.settings.b;
import com.google.firebase.sessions.settings.c;

/* loaded from: classes.dex */
public final class gwi0 implements wvf0 {
    public final /* synthetic */ int a = 1;
    public final yvf0 b;
    public final yvf0 c;
    public final wvf0 d;
    public final yvf0 e;
    public final yvf0 f;

    public gwi0(wvf0 wvf0Var, m3w m3wVar, wvf0 wvf0Var2, wvf0 wvf0Var3, wvf0 wvf0Var4) {
        this.b = wvf0Var;
        this.c = m3wVar;
        this.e = wvf0Var2;
        this.f = wvf0Var3;
        this.d = wvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.e;
        wvf0 wvf0Var = this.d;
        yvf0 yvf0Var2 = this.c;
        yvf0 yvf0Var3 = this.b;
        yvf0 yvf0Var4 = this.f;
        switch (i) {
            case 0:
                return new a((e7z0) yvf0Var3.get(), (hcr) yvf0Var2.get(), (d03) yvf0Var.get(), (fwi0) yvf0Var4.get(), (c) wvf0Var.get());
            default:
                return new com.google.firebase.sessions.c((com.google.firebase.a) ((m3w) yvf0Var4).b, (hcr) yvf0Var3.get(), (b) yvf0Var2.get(), (gfo) wvf0Var.get(), (fse) yvf0Var.get());
        }
    }

    public gwi0(m3w m3wVar, m3w m3wVar2, wvf0 wvf0Var, wvf0 wvf0Var2, m3w m3wVar3) {
        this.f = m3wVar;
        this.b = m3wVar2;
        this.c = wvf0Var;
        this.d = wvf0Var2;
        this.e = m3wVar3;
    }
}
