package xsna;

import android.view.View;
import xsna.tkj0;

/* compiled from: ExternalCustomControlViewAdapters.kt */
/* loaded from: classes16.dex */
public final class eeq implements fge {
    public final View a;
    public final /* synthetic */ tkj0.b b;

    public eeq(tkj0.b bVar) {
        this.b = bVar;
        this.a = bVar.a.a;
    }

    @Override // xsna.fge
    public final void b(rr8 rr8Var) {
        vof vofVar = this.b.a;
        boolean z = rr8Var.a;
        ily ilyVar = rr8Var.d;
        boolean z2 = ilyVar.a;
        String str = ilyVar.b;
        tl2 tl2Var = vofVar.b;
        tl2Var.setVisibility(z);
        tl2Var.a(str, z2);
    }

    @Override // xsna.fge
    public final View getView() {
        return this.a;
    }

    @Override // xsna.fge
    public final void d() {
    }

    @Override // xsna.fge
    public final void a(izs<? super View, s3q0> izsVar) {
    }

    @Override // xsna.fge
    public final void c(i4e i4eVar) {
    }
}
