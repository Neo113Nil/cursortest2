package androidx.compose.animation;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aa10;
import defpackage.jl40;
import defpackage.jt1;
import defpackage.k6w;
import defpackage.m3u0;
import defpackage.nx01;
import defpackage.ox01;
import defpackage.oz40;
import defpackage.qar;
import defpackage.rx01;
import defpackage.sb2;
import defpackage.tls;
import defpackage.ujs0;
import defpackage.x0y;
import defpackage.x910;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class d extends x0y {
    public ox01 a;
    public oz40 b;
    public e c;
    public long w;

    @Override // defpackage.v0y
    public final aa10 e(androidx.compose.ui.layout.k kVar, x910 x910Var, long j) {
        final long j2;
        final o l0 = x910Var.l0(j);
        if (kVar.d0()) {
            j2 = (l0.a << 32) | (l0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        } else {
            ox01 ox01Var = this.a;
            int i = l0.a;
            if (ox01Var == null) {
                j2 = (i << 32) | (l0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                this.w = j2;
            } else {
                final long j3 = (l0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32);
                nx01 a = ox01Var.a(new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        long j4;
                        qar qarVar;
                        rx01 rx01Var = (rx01) obj;
                        boolean l = jl40.l(rx01Var.c(), d.this.c.c());
                        d dVar = d.this;
                        if (l) {
                            j4 = j3;
                            if (!k6w.a(dVar.w, -9223372034707292160L)) {
                                j4 = dVar.w;
                            }
                        } else {
                            m3u0 m3u0Var = (m3u0) dVar.c.e.d(rx01Var.c());
                            j4 = m3u0Var != null ? ((k6w) m3u0Var.getValue()).a : 0L;
                        }
                        m3u0 m3u0Var2 = (m3u0) d.this.c.e.d(rx01Var.b());
                        long j5 = m3u0Var2 != null ? ((k6w) m3u0Var2.getValue()).a : 0L;
                        ujs0 ujs0Var = (ujs0) d.this.b.getValue();
                        return (ujs0Var == null || (qarVar = (qar) ujs0Var.b.invoke(new k6w(j4), new k6w(j5))) == null) ? sb2.G(0.0f, 400.0f, 5, null) : qarVar;
                    }
                }, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        long j4;
                        boolean l = jl40.l(obj, d.this.c.c());
                        d dVar = d.this;
                        if (l) {
                            j4 = j3;
                            if (!k6w.a(dVar.w, -9223372034707292160L)) {
                                j4 = dVar.w;
                            }
                        } else {
                            m3u0 m3u0Var = (m3u0) dVar.c.e.d(obj);
                            j4 = m3u0Var != null ? ((k6w) m3u0Var.getValue()).a : 0L;
                        }
                        return new k6w(j4);
                    }
                });
                this.c.f = a;
                j2 = ((k6w) a.getValue()).a;
                this.w = ((k6w) a.getValue()).a;
            }
        }
        return kVar.w((int) (j2 >> 32), (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j2), kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                jt1 jt1Var = d.this.c.b;
                o oVar = l0;
                o.a.m((o.a) obj, l0, jt1Var.a((oVar.a << 32) | (oVar.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), j2, LayoutDirection.Ltr));
                return zy11.a;
            }
        });
    }

    @Override // defpackage.e530
    public final void onReset() {
        super.onReset();
        this.w = -9223372034707292160L;
    }
}
