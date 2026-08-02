package androidx.compose.ui.draw;

import androidx.compose.ui.node.u;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bs6;
import defpackage.c1y;
import defpackage.dr60;
import defpackage.e530;
import defpackage.fwi;
import defpackage.pam;
import defpackage.qje;
import defpackage.rzo;
import defpackage.sls;
import defpackage.tls;
import defpackage.x4e;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final class a extends e530 implements dr60, bs6, pam {
    public final b a;
    public boolean b;
    public tls c;

    public a(b bVar, tls tlsVar) {
        this.a = bVar;
        this.c = tlsVar;
        bVar.a = this;
    }

    public final void E0() {
        this.b = false;
        this.a.b = null;
        rzo.D(this);
    }

    @Override // defpackage.pam
    public final void G() {
        E0();
    }

    @Override // defpackage.bs6
    public final long c() {
        return rzo.a0(qje.N(this, 4).c);
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        boolean z = this.b;
        final b bVar = this.a;
        if (!z) {
            bVar.b = null;
            u.e(this, new sls() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a.this.c.invoke(bVar);
                    return zy11.a;
                }
            });
            if (bVar.b == null) {
                throw x4e.v("DrawResult not defined, did you forget to call onDraw?");
            }
            this.b = true;
        }
        bVar.b.a.invoke(c1yVar);
    }

    @Override // defpackage.dr60
    public final void e0() {
        E0();
    }

    @Override // defpackage.bs6
    public final fwi getDensity() {
        return qje.P(this).R;
    }

    @Override // defpackage.bs6
    public final LayoutDirection getLayoutDirection() {
        return qje.P(this).S;
    }

    @Override // defpackage.cqh, defpackage.gwd0
    public final void onDensityChange() {
        E0();
    }

    @Override // defpackage.e530
    public final void onDetach() {
    }

    @Override // defpackage.cqh
    public final void onLayoutDirectionChange() {
        E0();
    }

    @Override // defpackage.e530
    public final void onReset() {
        super.onReset();
        E0();
    }
}
