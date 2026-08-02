package androidx.compose.animation;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aa10;
import defpackage.jl40;
import defpackage.jt1;
import defpackage.jw01;
import defpackage.k6w;
import defpackage.m2k0;
import defpackage.m3u0;
import defpackage.nx01;
import defpackage.ox01;
import defpackage.p8e;
import defpackage.q2o;
import defpackage.qar;
import defpackage.r2o;
import defpackage.rf9;
import defpackage.rx01;
import defpackage.s2o;
import defpackage.sls;
import defpackage.sns0;
import defpackage.t2o;
import defpackage.tkm0;
import defpackage.tls;
import defpackage.u2o;
import defpackage.uo5;
import defpackage.v2o;
import defpackage.w2o;
import defpackage.w511;
import defpackage.x0y;
import defpackage.x4c;
import defpackage.x910;
import defpackage.ymo;
import defpackage.z5w;
import defpackage.z7p;
import defpackage.zmo;
import defpackage.zx01;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class l extends x0y {
    public q2o A;
    public long B = -9223372034707292160L;
    public jt1 C;
    public final tls D;
    public final tls E;
    public zx01 a;
    public ox01 b;
    public ox01 c;
    public ox01 w;
    public v2o x;
    public ymo y;
    public sls z;

    public l(zx01 zx01Var, ox01 ox01Var, ox01 ox01Var2, ox01 ox01Var3, v2o v2oVar, ymo ymoVar, sls slsVar, q2o q2oVar) {
        this.a = zx01Var;
        this.b = ox01Var;
        this.c = ox01Var2;
        this.w = ox01Var3;
        this.x = v2oVar;
        this.y = ymoVar;
        this.z = slsVar;
        this.A = q2oVar;
        p8e.b(0, 0, 0, 0, 15);
        this.D = new tls() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                rx01 rx01Var = (rx01) obj;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                Object obj2 = null;
                if (rx01Var.a(enterExitState, enterExitState2)) {
                    rf9 rf9Var = ((w2o) l.this.x).b.c;
                    if (rf9Var != null) {
                        obj2 = rf9Var.c;
                    }
                } else if (rx01Var.a(enterExitState2, EnterExitState.PostExit)) {
                    rf9 rf9Var2 = ((zmo) l.this.y).c.c;
                    if (rf9Var2 != null) {
                        obj2 = rf9Var2.c;
                    }
                } else {
                    obj2 = k.d;
                }
                return obj2 == null ? k.d : obj2;
            }
        };
        this.E = new tls() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qar qarVar;
                qar qarVar2;
                rx01 rx01Var = (rx01) obj;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (rx01Var.a(enterExitState, enterExitState2)) {
                    sns0 sns0Var = ((w2o) l.this.x).b.b;
                    return (sns0Var == null || (qarVar2 = sns0Var.b) == null) ? k.c : qarVar2;
                }
                if (!rx01Var.a(enterExitState2, EnterExitState.PostExit)) {
                    return k.c;
                }
                sns0 sns0Var2 = ((zmo) l.this.y).c.b;
                return (sns0Var2 == null || (qarVar = sns0Var2.b) == null) ? k.c : qarVar;
            }
        };
    }

    public final jt1 E0() {
        if (this.a.f().a(EnterExitState.PreEnter, EnterExitState.Visible)) {
            rf9 rf9Var = ((w2o) this.x).b.c;
            if (rf9Var != null) {
                return rf9Var.a;
            }
            rf9 rf9Var2 = ((zmo) this.y).c.c;
            if (rf9Var2 != null) {
                return rf9Var2.a;
            }
            return null;
        }
        rf9 rf9Var3 = ((zmo) this.y).c.c;
        if (rf9Var3 != null) {
            return rf9Var3.a;
        }
        rf9 rf9Var4 = ((w2o) this.x).b.c;
        if (rf9Var4 != null) {
            return rf9Var4.a;
        }
        return null;
    }

    @Override // defpackage.v0y
    public final aa10 e(androidx.compose.ui.layout.k kVar, x910 x910Var, long j) {
        final jw01 jw01Var;
        char c;
        long j2;
        if (this.a.c() == this.a.d.getValue()) {
            this.C = null;
        } else if (this.C == null) {
            jt1 E0 = E0();
            if (E0 == null) {
                E0 = x4c.b;
            }
            this.C = E0;
        }
        if (kVar.d0()) {
            final o l0 = x910Var.l0(j);
            long j3 = (l0.a << 32) | (l0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            this.B = j3;
            return kVar.w((int) (j3 >> 32), (int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ((o.a) obj).g(o.this, 0, 0, 0.0f);
                    return zy11.a;
                }
            });
        }
        if (!((Boolean) this.z.invoke()).booleanValue()) {
            final o l02 = x910Var.l0(j);
            return kVar.w(l02.a, l02.b, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ((o.a) obj).g(o.this, 0, 0, 0.0f);
                    return zy11.a;
                }
            });
        }
        q2o q2oVar = this.A;
        ox01 ox01Var = q2oVar.a;
        ox01 ox01Var2 = q2oVar.b;
        zx01 zx01Var = q2oVar.c;
        final v2o v2oVar = q2oVar.d;
        final ymo ymoVar = q2oVar.e;
        ox01 ox01Var3 = q2oVar.f;
        final nx01 a = ox01Var != null ? ox01Var.a(new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qar qarVar;
                qar qarVar2;
                rx01 rx01Var = (rx01) obj;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (rx01Var.a(enterExitState, enterExitState2)) {
                    z7p z7pVar = ((w2o) v2o.this).b.a;
                    return (z7pVar == null || (qarVar2 = z7pVar.b) == null) ? k.b : qarVar2;
                }
                if (!rx01Var.a(enterExitState2, EnterExitState.PostExit)) {
                    return k.b;
                }
                z7p z7pVar2 = ((zmo) ymoVar).c.a;
                return (z7pVar2 == null || (qarVar = z7pVar2.b) == null) ? k.b : qarVar;
            }
        }, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i = r2o.a[((EnterExitState) obj).ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        z7p z7pVar = ((w2o) v2o.this).b.a;
                        if (z7pVar != null) {
                            f = z7pVar.a;
                        }
                    } else {
                        if (i != 3) {
                            w511.b();
                            return null;
                        }
                        z7p z7pVar2 = ((zmo) ymoVar).c.a;
                        if (z7pVar2 != null) {
                            f = z7pVar2.a;
                        }
                    }
                }
                return Float.valueOf(f);
            }
        }) : null;
        final nx01 a2 = ox01Var2 != null ? ox01Var2.a(new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qar qarVar;
                qar qarVar2;
                rx01 rx01Var = (rx01) obj;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (rx01Var.a(enterExitState, enterExitState2)) {
                    tkm0 tkm0Var = ((w2o) v2o.this).b.d;
                    return (tkm0Var == null || (qarVar2 = tkm0Var.c) == null) ? k.b : qarVar2;
                }
                if (!rx01Var.a(enterExitState2, EnterExitState.PostExit)) {
                    return k.b;
                }
                tkm0 tkm0Var2 = ((zmo) ymoVar).c.d;
                return (tkm0Var2 == null || (qarVar = tkm0Var2.c) == null) ? k.b : qarVar;
            }
        }, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i = s2o.a[((EnterExitState) obj).ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        tkm0 tkm0Var = ((w2o) v2o.this).b.d;
                        if (tkm0Var != null) {
                            f = tkm0Var.a;
                        }
                    } else {
                        if (i != 3) {
                            w511.b();
                            return null;
                        }
                        tkm0 tkm0Var2 = ((zmo) ymoVar).c.d;
                        if (tkm0Var2 != null) {
                            f = tkm0Var2.a;
                        }
                    }
                }
                return Float.valueOf(f);
            }
        }) : null;
        if (zx01Var.c() == EnterExitState.PreEnter) {
            tkm0 tkm0Var = ((w2o) v2oVar).b.d;
            if (tkm0Var != null) {
                jw01Var = new jw01(tkm0Var.b);
            } else {
                tkm0 tkm0Var2 = ((zmo) ymoVar).c.d;
                if (tkm0Var2 != null) {
                    jw01Var = new jw01(tkm0Var2.b);
                }
                jw01Var = null;
            }
        } else {
            tkm0 tkm0Var3 = ((zmo) ymoVar).c.d;
            if (tkm0Var3 != null) {
                jw01Var = new jw01(tkm0Var3.b);
            } else {
                tkm0 tkm0Var4 = ((w2o) v2oVar).b.d;
                if (tkm0Var4 != null) {
                    jw01Var = new jw01(tkm0Var4.b);
                }
                jw01Var = null;
            }
        }
        final nx01 a3 = ox01Var3 != null ? ox01Var3.a(EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.w, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                jw01 jw01Var2;
                int i = t2o.a[((EnterExitState) obj).ordinal()];
                if (i != 1) {
                    jw01Var2 = null;
                    if (i == 2) {
                        tkm0 tkm0Var5 = ((w2o) v2oVar).b.d;
                        if (tkm0Var5 != null) {
                            jw01Var2 = new jw01(tkm0Var5.b);
                        } else {
                            tkm0 tkm0Var6 = ((zmo) ymoVar).c.d;
                            if (tkm0Var6 != null) {
                                jw01Var2 = new jw01(tkm0Var6.b);
                            }
                        }
                    } else {
                        if (i != 3) {
                            w511.b();
                            return null;
                        }
                        tkm0 tkm0Var7 = ((zmo) ymoVar).c.d;
                        if (tkm0Var7 != null) {
                            jw01Var2 = new jw01(tkm0Var7.b);
                        } else {
                            tkm0 tkm0Var8 = ((w2o) v2oVar).b.d;
                            if (tkm0Var8 != null) {
                                jw01Var2 = new jw01(tkm0Var8.b);
                            }
                        }
                    }
                } else {
                    jw01Var2 = jw01.this;
                }
                return new jw01(jw01Var2 != null ? jw01Var2.a : jw01.b);
            }
        }) : null;
        final tls tlsVar = new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                m2k0 m2k0Var = (m2k0) obj;
                m3u0 m3u0Var = a;
                m2k0Var.b(m3u0Var != null ? ((Number) m3u0Var.getValue()).floatValue() : 1.0f);
                m3u0 m3u0Var2 = a2;
                m2k0Var.u(m3u0Var2 != null ? ((Number) m3u0Var2.getValue()).floatValue() : 1.0f);
                m3u0 m3u0Var3 = a2;
                m2k0Var.v(m3u0Var3 != null ? ((Number) m3u0Var3.getValue()).floatValue() : 1.0f);
                m3u0 m3u0Var4 = a3;
                m2k0Var.B(m3u0Var4 != null ? ((jw01) m3u0Var4.getValue()).a : jw01.b);
                return zy11.a;
            }
        };
        final o l03 = x910Var.l0(j);
        long j4 = (l03.a << 32) | (l03.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        final long j5 = !k6w.a(this.B, -9223372034707292160L) ? this.B : j4;
        ox01 ox01Var4 = this.b;
        nx01 a4 = ox01Var4 != null ? ox01Var4.a(this.D, new tls() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                l lVar = l.this;
                long j6 = j5;
                lVar.getClass();
                int i = u2o.a[((EnterExitState) obj).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        rf9 rf9Var = ((w2o) lVar.x).b.c;
                        if (rf9Var != null) {
                            j6 = ((k6w) rf9Var.b.invoke(new k6w(j6))).a;
                        }
                    } else {
                        if (i != 3) {
                            w511.b();
                            return null;
                        }
                        rf9 rf9Var2 = ((zmo) lVar.y).c.c;
                        if (rf9Var2 != null) {
                            j6 = ((k6w) rf9Var2.b.invoke(new k6w(j6))).a;
                        }
                    }
                }
                return new k6w(j6);
            }
        }) : null;
        if (a4 != null) {
            j4 = ((k6w) a4.getValue()).a;
        }
        long d = p8e.d(j, j4);
        ox01 ox01Var5 = this.c;
        final long j6 = ox01Var5 != null ? ((z5w) ox01Var5.a(EnterExitTransitionModifierNode$measure$offsetDelta$1.w, new tls() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                long j7;
                int i;
                EnterExitState enterExitState = (EnterExitState) obj;
                l lVar = l.this;
                long j8 = j5;
                if (lVar.C != null && lVar.E0() != null && !jl40.l(lVar.C, lVar.E0()) && (i = u2o.a[enterExitState.ordinal()]) != 1 && i != 2) {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    rf9 rf9Var = ((zmo) lVar.y).c.c;
                    if (rf9Var != null) {
                        long j9 = ((k6w) rf9Var.b.invoke(new k6w(j8))).a;
                        jt1 E02 = lVar.E0();
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        j7 = z5w.b(((uo5) E02).a(j8, j9, layoutDirection), lVar.C.a(j8, j9, layoutDirection));
                        return new z5w(j7);
                    }
                }
                j7 = 0;
                return new z5w(j7);
            }
        }).getValue()).a : 0L;
        ox01 ox01Var6 = this.w;
        if (ox01Var6 != null) {
            c = ' ';
            j2 = ((z5w) ox01Var6.a(this.E, new tls() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    EnterExitState enterExitState = (EnterExitState) obj;
                    l lVar = l.this;
                    long j7 = j5;
                    sns0 sns0Var = ((w2o) lVar.x).b.b;
                    long j8 = 0;
                    long j9 = sns0Var != null ? ((z5w) sns0Var.a.invoke(new k6w(j7))).a : 0L;
                    sns0 sns0Var2 = ((zmo) lVar.y).c.b;
                    long j10 = sns0Var2 != null ? ((z5w) sns0Var2.a.invoke(new k6w(j7))).a : 0L;
                    int i = u2o.a[enterExitState.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            j8 = j9;
                        } else {
                            if (i != 3) {
                                w511.b();
                                return null;
                            }
                            j8 = j10;
                        }
                    }
                    return new z5w(j8);
                }
            }).getValue()).a;
        } else {
            c = ' ';
            j2 = 0;
        }
        jt1 jt1Var = this.C;
        final long c2 = z5w.c(jt1Var != null ? jt1Var.a(j5, d, LayoutDirection.Ltr) : 0L, j2);
        return kVar.w((int) (d >> c), (int) (d & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o oVar = o.this;
                long j7 = c2;
                long j8 = j6;
                ((o.a) obj).v(oVar, ((int) (j7 >> 32)) + ((int) (j8 >> 32)), ((int) (j7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (j8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), 0.0f, tlsVar);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.e530
    public final void onAttach() {
        this.B = -9223372034707292160L;
    }
}
