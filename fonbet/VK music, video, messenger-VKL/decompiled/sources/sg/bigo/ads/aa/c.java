package sg.bigo.ads.aa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.aj.e;
import sg.bigo.ads.aj.f;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.core.g;

/* loaded from: classes9.dex */
public final class c extends sg.bigo.ads.z.d implements f {
    public boolean I;
    private e J;

    public c(@NonNull g gVar, e eVar) {
        super(gVar);
        this.I = false;
        this.J = eVar;
    }

    @Override // sg.bigo.ads.aj.f
    public final int I() {
        e eVar = this.J;
        if (eVar != null) {
            return eVar.M();
        }
        return 3;
    }

    @Override // sg.bigo.ads.aj.f
    public final void M() {
        if (this.J != null) {
            ((sg.bigo.ads.cp.a) f()).o(this.J.c(this));
        }
    }

    @Override // sg.bigo.ads.d.c
    public final void b(@Nullable i iVar, int i, int i2, @NonNull sg.bigo.ads.api.core.e eVar) {
        if (this.J != null) {
            ((sg.bigo.ads.cp.a) f()).o(this.J.c(this));
        }
        super.b(iVar, i, i2, eVar);
    }

    @Override // sg.bigo.ads.y.b, sg.bigo.ads.d.c
    public final void h() {
        if (this.J != null) {
            ((sg.bigo.ads.cp.a) f()).n(this.J.b(this));
        }
        super.h();
    }

    @Override // sg.bigo.ads.aj.f
    public final void h_() {
        e eVar = this.J;
        if (eVar != null) {
            eVar.J();
        }
    }

    @Override // sg.bigo.ads.d.c
    public final int i() {
        return ((sg.bigo.ads.cp.a) f()).bw();
    }

    @Override // sg.bigo.ads.aj.f
    public final boolean i_() {
        return this.I;
    }

    @Override // sg.bigo.ads.d.c
    public final int k() {
        return ((sg.bigo.ads.cp.a) f()).bx();
    }
}
