package xsna;

import androidx.compose.animation.EnterExitState;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Lambda;
import xsna.cri;
import xsna.q630;
import xsna.wlp0;

/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes11.dex */
public final class mm2 {

    /* compiled from: AnimatedVisibility.kt */
    public static final class a extends Lambda implements izs<Boolean, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class b extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ yzs<om2, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ qpp $enter;
        final /* synthetic */ d5q $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ spg0 $this_AnimatedVisibility;
        final /* synthetic */ bi50<Boolean> $visibleState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(spg0 spg0Var, bi50<Boolean> bi50Var, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, int i, int i2) {
            super(2);
            this.$this_AnimatedVisibility = spg0Var;
            this.$visibleState = bi50Var;
            this.$modifier = q630Var;
            this.$enter = qppVar;
            this.$exit = d5qVar;
            this.$label = str;
            this.$content = yzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            mm2.d(this.$this_AnimatedVisibility, this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class c extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ yzs<om2, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ qpp $enter;
        final /* synthetic */ d5q $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, int i, int i2) {
            super(2);
            this.$visible = z;
            this.$modifier = q630Var;
            this.$enter = qppVar;
            this.$exit = d5qVar;
            this.$label = str;
            this.$content = yzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            mm2.f(this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class d extends Lambda implements izs<Boolean, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class e extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ yzs<om2, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ qpp $enter;
        final /* synthetic */ d5q $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ spg0 $this_AnimatedVisibility;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(spg0 spg0Var, boolean z, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, int i, int i2) {
            super(2);
            this.$this_AnimatedVisibility = spg0Var;
            this.$visible = z;
            this.$modifier = q630Var;
            this.$enter = qppVar;
            this.$exit = d5qVar;
            this.$label = str;
            this.$content = yzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            mm2.e(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class f extends Lambda implements izs<Boolean, Boolean> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class g extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ yzs<om2, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ qpp $enter;
        final /* synthetic */ d5q $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ q9g $this_AnimatedVisibility;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(q9g q9gVar, boolean z, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, int i, int i2) {
            super(2);
            this.$this_AnimatedVisibility = q9gVar;
            this.$visible = z;
            this.$modifier = q630Var;
            this.$enter = qppVar;
            this.$exit = d5qVar;
            this.$label = str;
            this.$content = yzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            mm2.b(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class h extends Lambda implements izs<Boolean, Boolean> {
        public static final h i = new h(1);

        @Override // xsna.izs
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class i extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ yzs<om2, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ qpp $enter;
        final /* synthetic */ d5q $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ bi50<Boolean> $visibleState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(bi50<Boolean> bi50Var, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, int i, int i2) {
            super(2);
            this.$visibleState = bi50Var;
            this.$modifier = q630Var;
            this.$enter = qppVar;
            this.$exit = d5qVar;
            this.$label = str;
            this.$content = yzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            mm2.c(this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class j extends Lambda implements izs<Boolean, Boolean> {
        public static final j i = new j(1);

        @Override // xsna.izs
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class k extends Lambda implements yzs<ep10, zo10, o6j, dp10> {
        final /* synthetic */ wlp0<T> $transition;
        final /* synthetic */ izs<T, Boolean> $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(izs<? super T, Boolean> izsVar, wlp0<T> wlp0Var) {
            super(3);
            this.$visible = izsVar;
            this.$transition = wlp0Var;
        }

        @Override // xsna.yzs
        public final dp10 invoke(ep10 ep10Var, zo10 zo10Var, o6j o6jVar) {
            long j;
            ep10 ep10Var2 = ep10Var;
            tra0 N = zo10Var.N(o6jVar.a);
            if (!ep10Var2.z1() || this.$visible.invoke(((zak0) this.$transition.d).getValue()).booleanValue()) {
                j = (N.b << 32) | (N.c & 4294967295L);
            } else {
                j = 0;
            }
            return ep10Var2.Q((int) (j >> 32), (int) (4294967295L & j), jgp.b, new nm2(N));
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class l extends Lambda implements wzs<EnterExitState, EnterExitState, Boolean> {
        public static final l i = new l(2);

        @Override // xsna.wzs
        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
            EnterExitState enterExitState3 = enterExitState2;
            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState3 == EnterExitState.PostExit);
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class m extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ yzs<om2, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ qpp $enter;
        final /* synthetic */ d5q $exit;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ wlp0<T> $transition;
        final /* synthetic */ izs<T, Boolean> $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(wlp0<T> wlp0Var, izs<? super T, Boolean> izsVar, q630 q630Var, qpp qppVar, d5q d5qVar, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, int i) {
            super(2);
            this.$transition = wlp0Var;
            this.$visible = izsVar;
            this.$modifier = q630Var;
            this.$enter = qppVar;
            this.$exit = d5qVar;
            this.$content = yzsVar;
            this.$$changed = i;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            mm2.g(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, aVar, ne7.I(this.$$changed | 1));
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(wlp0 wlp0Var, izs izsVar, q630 q630Var, qpp qppVar, d5q d5qVar, wzs wzsVar, yzs yzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        yzs yzsVar2;
        int i5;
        int i6;
        int i7;
        jtp0 jtp0Var;
        a.C0011a.C0012a c0012a;
        wlp0 wlp0Var2;
        boolean z;
        wlp0.a aVar2;
        wlp0.a aVar3;
        wlp0.a aVar4;
        vsa vsaVar;
        wlp0.a aVar5;
        wlp0.a aVar6;
        wlp0.a aVar7;
        wlp0.a aVar8;
        final qpp qppVar2;
        final d5q d5qVar2;
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.a M = aVar.M(1912839215);
        if ((i2 & 6) == 0) {
            i4 = (M.J(wlp0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.J(q630Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.J(qppVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.J(d5qVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= M.y(wzsVar) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= (2097152 & i2) == 0 ? M.J(null) : M.y(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= M.y(yzsVar) ? 8388608 : 4194304;
        }
        boolean z2 = true;
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1912839215, i4, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:716)");
            }
            wh50 wh50Var = wlp0Var.d;
            z46 z46Var = wlp0Var.a;
            if (((Boolean) izsVar.invoke(((zak0) wh50Var).getValue())).booleanValue() || ((Boolean) izsVar.invoke(z46Var.B())).booleanValue() || wlp0Var.g() || wlp0Var.c()) {
                M.K(-232386135);
                int i8 = i4 & 14;
                int i9 = i8 | 48;
                int i10 = i9 & 14;
                boolean z3 = ((i10 ^ 6) > 4 && M.J(wlp0Var)) || (i9 & 6) == 4;
                Object x = M.x();
                boolean z4 = z3;
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (z4 || x == c0012a2) {
                    x = z46Var.B();
                    M.R(x);
                }
                if (wlp0Var.g()) {
                    x = z46Var.B();
                }
                M.K(1844425648);
                if (androidx.compose.runtime.b.d()) {
                    i5 = i4;
                    androidx.compose.runtime.b.f(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:725)");
                } else {
                    i5 = i4;
                }
                int i11 = i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                EnterExitState h2 = h(wlp0Var, izsVar, x, M, i11);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                Object value = ((zak0) wlp0Var.d).getValue();
                M.K(1844425648);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:725)");
                }
                EnterExitState h3 = h(wlp0Var, izsVar, value, M, i11);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                int i12 = i10 | 3072;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-198307638, i12, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1800)");
                }
                int i13 = (i12 & 14) ^ 6;
                boolean z5 = (i13 > 4 && M.J(wlp0Var)) || (i12 & 6) == 4;
                Object x2 = M.x();
                if (z5 || x2 == c0012a2) {
                    x2 = new wlp0(new bi50(h2), wlp0Var, i5s.a(new StringBuilder(), wlp0Var.c, " > EnterExitTransition"));
                    M.R(x2);
                }
                wlp0 wlp0Var3 = (wlp0) x2;
                boolean J = ((i13 > 4 && M.J(wlp0Var)) || (i12 & 6) == 4) | M.J(wlp0Var3);
                Object x3 = M.x();
                if (J || x3 == c0012a2) {
                    x3 = new csk0(3, wlp0Var, wlp0Var3);
                    M.R(x3);
                }
                bap.c(wlp0Var3, (izs) x3, M, 0);
                if (wlp0Var.g()) {
                    wlp0Var3.j(h2, h3);
                } else {
                    wlp0Var3.k(h3);
                    ((zak0) wlp0Var3.k).setValue(Boolean.FALSE);
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i14 = (i5 >> 6) & 112;
                jtp0 jtp0Var2 = anp.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(21614502, i14, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:1004)");
                }
                boolean J2 = M.J(wlp0Var3);
                Object x4 = M.x();
                if (J2 || x4 == c0012a2) {
                    x4 = androidx.compose.runtime.k.b(qppVar);
                    M.R(x4);
                }
                wh50 wh50Var2 = (wh50) x4;
                z46 z46Var2 = wlp0Var3.a;
                z46 z46Var3 = wlp0Var3.a;
                wh50 wh50Var3 = wlp0Var3.d;
                zak0 zak0Var = (zak0) wh50Var3;
                if (z46Var2.B() == zak0Var.getValue() && z46Var3.B() == EnterExitState.Visible) {
                    if (wlp0Var3.g()) {
                        wh50Var2.setValue(qppVar);
                    } else {
                        wh50Var2.setValue(qpp.a);
                    }
                } else if (zak0Var.getValue() == EnterExitState.Visible) {
                    wh50Var2.setValue(((qpp) wh50Var2.getValue()).b(qppVar));
                }
                qpp qppVar3 = (qpp) wh50Var2.getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i15 = (i5 >> 9) & 112;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1363864804, i15, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:1024)");
                }
                boolean J3 = M.J(wlp0Var3);
                Object x5 = M.x();
                if (J3 || x5 == c0012a2) {
                    x5 = androidx.compose.runtime.k.b(d5qVar);
                    M.R(x5);
                }
                wh50 wh50Var4 = (wh50) x5;
                zak0 zak0Var2 = (zak0) wh50Var3;
                if (z46Var3.B() == zak0Var2.getValue() && z46Var3.B() == EnterExitState.Visible) {
                    if (wlp0Var3.g()) {
                        wh50Var4.setValue(d5qVar);
                    } else {
                        wh50Var4.setValue(d5q.a);
                    }
                } else if (zak0Var2.getValue() != EnterExitState.Visible) {
                    wh50Var4.setValue(((d5q) wh50Var4.getValue()).b(d5qVar));
                }
                d5q d5qVar3 = (d5q) wh50Var4.getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                wh50 c2 = androidx.compose.runtime.k.c(wzsVar, M, (i5 >> 15) & 14);
                Object invoke = wzsVar.invoke(z46Var3.B(), ((zak0) wh50Var3).getValue());
                boolean J4 = M.J(wlp0Var3) | M.J(c2);
                Object x6 = M.x();
                if (J4 || x6 == c0012a2) {
                    x6 = new lm2(wlp0Var3, c2, null);
                    M.R(x6);
                }
                wh50 l2 = skd.l(invoke, (wzs) x6, M, 0);
                Object B = z46Var3.B();
                EnterExitState enterExitState = EnterExitState.PostExit;
                if ((B == enterExitState && ((zak0) wh50Var3).getValue() == enterExitState) && ((Boolean) l2.getValue()).booleanValue()) {
                    M.K(-229368781);
                    M.j();
                    q630Var2 = q630Var;
                    yzsVar2 = yzsVar;
                } else {
                    M.K(-230699766);
                    boolean z6 = i8 == 4;
                    Object x7 = M.x();
                    if (z6 || x7 == c0012a2) {
                        x7 = new pm2();
                        M.R(x7);
                    }
                    pm2 pm2Var = (pm2) x7;
                    jtp0 jtp0Var3 = rte0.k;
                    Object x8 = M.x();
                    if (x8 == c0012a2) {
                        x8 = inp.i;
                        M.R(x8);
                    }
                    gzs gzsVar = (gzs) x8;
                    if (androidx.compose.runtime.b.d()) {
                        i6 = -1;
                        androidx.compose.runtime.b.f(-1899614022, 199680, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:933)");
                    } else {
                        i6 = -1;
                    }
                    M.K(-167964673);
                    M.j();
                    M.K(-167961890);
                    M.j();
                    qppVar3.a().getClass();
                    d5qVar3.a().getClass();
                    boolean z7 = (qppVar3.a().b == null && d5qVar3.a().b == null) ? false : true;
                    boolean z8 = (qppVar3.a().c == null && d5qVar3.a().c == null) ? false : true;
                    if (z7) {
                        M.K(-911488127);
                        Object x9 = M.x();
                        if (x9 == c0012a2) {
                            x9 = "Built-in slide";
                            M.R("Built-in slide");
                        }
                        String str = (String) x9;
                        c0012a = c0012a2;
                        i7 = i6;
                        wlp0Var2 = wlp0Var3;
                        z = false;
                        wlp0.a b2 = ump0.b(wlp0Var2, jtp0Var3, str, M, 384, 0);
                        jtp0Var = jtp0Var3;
                        M.j();
                        aVar2 = b2;
                    } else {
                        i7 = i6;
                        jtp0Var = jtp0Var3;
                        c0012a = c0012a2;
                        wlp0Var2 = wlp0Var3;
                        z = false;
                        M.K(-911382324);
                        M.j();
                        aVar2 = null;
                    }
                    if (z8) {
                        M.K(-911290533);
                        jtp0 jtp0Var4 = rte0.l;
                        Object x10 = M.x();
                        if (x10 == c0012a) {
                            x10 = "Built-in shrink/expand";
                            M.R("Built-in shrink/expand");
                        }
                        wlp0.a b3 = ump0.b(wlp0Var2, jtp0Var4, (String) x10, M, 384, 0);
                        M.j();
                        aVar3 = b3;
                    } else {
                        M.K(-911179709);
                        M.j();
                        aVar3 = null;
                    }
                    if (z8) {
                        M.K(-911106083);
                        Object x11 = M.x();
                        if (x11 == c0012a) {
                            x11 = "Built-in InterruptionHandlingOffset";
                            M.R("Built-in InterruptionHandlingOffset");
                        }
                        wlp0.a b4 = ump0.b(wlp0Var2, jtp0Var, (String) x11, M, 384, 0);
                        M.j();
                        aVar4 = b4;
                    } else {
                        M.K(-910935677);
                        M.j();
                        aVar4 = null;
                    }
                    vsa vsaVar2 = qppVar3.a().c;
                    boolean z9 = ((vsaVar2 == null || vsaVar2.d) && ((vsaVar = d5qVar3.a().c) == null || vsaVar.d) && z8) ? z : true;
                    qppVar3.a().getClass();
                    qppVar3.a().getClass();
                    d5qVar3.a().getClass();
                    d5qVar3.a().getClass();
                    float[] fArr = h8g.a;
                    M.K(-910130296);
                    M.j();
                    qppVar3.a().getClass();
                    d5qVar3.a().getClass();
                    jtp0 jtp0Var5 = rte0.e;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(642253525, 3072, i7, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:1052)");
                    }
                    boolean z10 = (qppVar3.a().a == null && d5qVar3.a().a == null) ? z : true;
                    if (qppVar3.a().d == null && d5qVar3.a().d == null) {
                        z2 = z;
                    }
                    if (z10) {
                        M.K(-703879421);
                        Object x12 = M.x();
                        if (x12 == c0012a) {
                            x12 = "Built-in alpha";
                            M.R("Built-in alpha");
                        }
                        wlp0.a b5 = ump0.b(wlp0Var2, jtp0Var5, (String) x12, M, 384, 0);
                        M.j();
                        aVar5 = b5;
                    } else {
                        M.K(-703709976);
                        M.j();
                        aVar5 = null;
                    }
                    if (z2) {
                        M.K(-703642333);
                        Object x13 = M.x();
                        if (x13 == c0012a) {
                            x13 = "Built-in scale";
                            M.R("Built-in scale");
                        }
                        wlp0.a b6 = ump0.b(wlp0Var2, jtp0Var5, (String) x13, M, 384, 0);
                        M.j();
                        aVar6 = b6;
                    } else {
                        M.K(-703472888);
                        M.j();
                        aVar6 = null;
                    }
                    if (z2) {
                        M.K(-703395232);
                        aVar7 = aVar6;
                        aVar8 = ump0.b(wlp0Var2, anp.a, "TransformOriginInterruptionHandling", M, 384, 0);
                        M.j();
                    } else {
                        aVar7 = aVar6;
                        M.K(-703222904);
                        M.j();
                        aVar8 = null;
                    }
                    boolean y = M.y(aVar5) | M.J(qppVar3) | M.J(d5qVar3) | M.y(aVar7) | M.J(wlp0Var2) | M.y(aVar8);
                    Object x14 = M.x();
                    if (y || x14 == c0012a) {
                        final wlp0.a aVar9 = aVar5;
                        qppVar2 = qppVar3;
                        d5qVar2 = d5qVar3;
                        final wlp0.a aVar10 = aVar7;
                        final wlp0 wlp0Var4 = wlp0Var2;
                        final wlp0.a aVar11 = aVar8;
                        x14 = new ndu() { // from class: xsna.zmp
                            @Override // xsna.ndu
                            public final dnp init() {
                                lkp0 lkp0Var;
                                wlp0.a aVar12 = wlp0.a.this;
                                qpp qppVar4 = qppVar2;
                                d5q d5qVar4 = d5qVar2;
                                wlp0.a.C3941a a2 = aVar12 != null ? aVar12.a(new bnp(qppVar4, d5qVar4), new cnp(qppVar4, d5qVar4)) : null;
                                wlp0.a aVar13 = aVar10;
                                wlp0.a.C3941a a3 = aVar13 != null ? aVar13.a(new enp(qppVar4, d5qVar4), new fnp(qppVar4, d5qVar4)) : null;
                                if (wlp0Var4.a.B() == EnterExitState.PreEnter) {
                                    h4h0 h4h0Var = qppVar4.a().d;
                                    if (h4h0Var != null) {
                                        lkp0Var = new lkp0(h4h0Var.b);
                                    } else {
                                        h4h0 h4h0Var2 = d5qVar4.a().d;
                                        if (h4h0Var2 != null) {
                                            lkp0Var = new lkp0(h4h0Var2.b);
                                        }
                                        lkp0Var = null;
                                    }
                                } else {
                                    h4h0 h4h0Var3 = d5qVar4.a().d;
                                    if (h4h0Var3 != null) {
                                        lkp0Var = new lkp0(h4h0Var3.b);
                                    } else {
                                        h4h0 h4h0Var4 = qppVar4.a().d;
                                        if (h4h0Var4 != null) {
                                            lkp0Var = new lkp0(h4h0Var4.b);
                                        }
                                        lkp0Var = null;
                                    }
                                }
                                wlp0.a aVar14 = aVar11;
                                return new dnp(a2, a3, aVar14 != null ? aVar14.a(gnp.i, new hnp(lkp0Var, qppVar4, d5qVar4)) : null);
                            }
                        };
                        M.R(x14);
                    } else {
                        qppVar2 = qppVar3;
                        d5qVar2 = d5qVar3;
                    }
                    ndu nduVar = (ndu) x14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean l3 = M.l(z9) | M.J(gzsVar);
                    Object x15 = M.x();
                    if (l3 || x15 == c0012a) {
                        x15 = new jnp(z9, gzsVar);
                        M.R(x15);
                    }
                    q630.a aVar12 = q630.a.a;
                    q630 g2 = rdu.a(aVar12, (izs) x15).g(new ymp(wlp0Var2, aVar3, aVar4, aVar2, qppVar2, d5qVar2, gzsVar, nduVar)).g(aVar12);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.K(-7404393);
                    M.j();
                    q630Var2 = q630Var;
                    q630 g3 = q630Var2.g(g2.g(aVar12));
                    Object x16 = M.x();
                    if (x16 == c0012a) {
                        x16 = new jj2(pm2Var);
                        M.R(x16);
                    }
                    jj2 jj2Var = (jj2) x16;
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c3 = qri.c(M, g3);
                    cri.h7.getClass();
                    LayoutNode.a aVar13 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar13);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, jj2Var, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    if (M.L()) {
                        M.b(valueOf, bVar);
                    }
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c3, cri.a.d);
                    yzsVar2 = yzsVar;
                    yzsVar2.invoke(pm2Var, M, Integer.valueOf((i5 >> 18) & 112));
                    M.G();
                    M.j();
                }
                M.j();
            } else {
                M.K(-229362829);
                M.j();
                yzsVar2 = yzsVar;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            yzsVar2 = yzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new km2(wlp0Var, izsVar, q630Var2, qppVar, d5qVar, wzsVar, yzsVar2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q9g q9gVar, boolean z, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        qpp qppVar2;
        int i6;
        d5q d5qVar2;
        int i7;
        q630 q630Var3;
        qpp qppVar3;
        d5q d5qVar3;
        String str2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1799879339);
        if ((i2 & 48) == 0) {
            i4 = (M.l(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                qppVar2 = qppVar;
                i4 |= M.J(qppVar2) ? 2048 : 1024;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    d5qVar2 = d5qVar;
                    i4 |= M.J(d5qVar2) ? 16384 : 8192;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((196608 & i2) == 0) {
                        i4 |= M.J(str) ? 131072 : 65536;
                        if ((1572864 & i2) == 0) {
                            i4 |= M.y(yzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                            q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                            if (i5 != 0) {
                                qppVar2 = anp.e(null, 3).b(anp.d(null, null, null, 15));
                            }
                            d5q b2 = i6 != 0 ? anp.f(null, 3).b(anp.k(null, null, 15)) : d5qVar2;
                            String str3 = i7 != 0 ? "AnimatedVisibility" : str;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1799879339, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                            }
                            int i9 = i4 >> 3;
                            wlp0 e2 = ump0.e(Boolean.valueOf(z), str3, M, (i9 & 14) | ((i4 >> 12) & 112), 0);
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = f.i;
                                M.R(x);
                            }
                            qpp qppVar4 = qppVar2;
                            g(e2, (izs) x, q630Var4, qppVar4, b2, yzsVar, M, (i4 & 896) | 48 | (i4 & 7168) | (i4 & 57344) | (458752 & i9));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            str2 = str3;
                            q630Var3 = q630Var4;
                            qppVar3 = qppVar4;
                            d5qVar3 = b2;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            qppVar3 = qppVar2;
                            d5qVar3 = d5qVar2;
                            str2 = str;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new g(q9gVar, z, q630Var3, qppVar3, d5qVar3, str2, yzsVar, i2, i3);
                            return;
                        }
                        return;
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                d5qVar2 = d5qVar;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            qppVar2 = qppVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            d5qVar2 = d5qVar;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if (M.t(i4 & 1, (599185 & i4) != 599184)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        qppVar2 = qppVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        d5qVar2 = d5qVar;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (M.t(i4 & 1, (599185 & i4) != 599184)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(bi50<Boolean> bi50Var, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        qpp qppVar2;
        int i6;
        d5q d5qVar2;
        int i7;
        String str2;
        q630 q630Var3;
        qpp qppVar3;
        d5q d5qVar3;
        androidx.compose.runtime.f s;
        int i8;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(657024243);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? M.J(bi50Var) : M.y(bi50Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                qppVar2 = qppVar;
                i4 |= M.J(qppVar2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    d5qVar2 = d5qVar;
                    i4 |= M.J(d5qVar2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i4 |= M.J(str) ? 16384 : 8192;
                        if ((196608 & i2) == 0) {
                            i4 |= M.y(yzsVar) ? 131072 : 65536;
                        }
                        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
                            if (i9 != 0) {
                                q630Var4 = q630.a.a;
                                i8 = i7;
                            } else {
                                i8 = i7;
                                q630Var4 = q630Var2;
                            }
                            qpp b2 = i5 != 0 ? anp.e(null, 3).b(anp.c(null, 15)) : qppVar2;
                            d5q b3 = i6 != 0 ? anp.f(null, 3).b(anp.j(null, 15)) : d5qVar2;
                            String str3 = i8 != 0 ? "AnimatedVisibility" : str;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(657024243, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                            }
                            wlp0 d2 = ump0.d(bi50Var, str3, M, (i4 & 14) | ((i4 >> 9) & 112));
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = h.i;
                                M.R(x);
                            }
                            izs izsVar = (izs) x;
                            int i10 = i4 << 3;
                            g(d2, izsVar, q630Var4, b2, b3, yzsVar, M, (i10 & 57344) | (i10 & 896) | 48 | (i10 & 7168) | (i4 & 458752));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            str2 = str3;
                            q630Var3 = q630Var4;
                            qppVar3 = b2;
                            d5qVar3 = b3;
                        } else {
                            M.h();
                            str2 = str;
                            q630Var3 = q630Var2;
                            qppVar3 = qppVar2;
                            d5qVar3 = d5qVar2;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new i(bi50Var, q630Var3, qppVar3, d5qVar3, str2, yzsVar, i2, i3);
                            return;
                        }
                        return;
                    }
                    if ((196608 & i2) == 0) {
                    }
                    if (M.t(i4 & 1, (74899 & i4) != 74898)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                d5qVar2 = d5qVar;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((196608 & i2) == 0) {
                }
                if (M.t(i4 & 1, (74899 & i4) != 74898)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            qppVar2 = qppVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            d5qVar2 = d5qVar;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        qppVar2 = qppVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        d5qVar2 = d5qVar;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(spg0 spg0Var, bi50<Boolean> bi50Var, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        qpp qppVar2;
        int i6;
        d5q d5qVar2;
        int i7;
        q630 q630Var3;
        qpp qppVar3;
        d5q d5qVar3;
        String str2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1763490971);
        if ((i2 & 48) == 0) {
            i4 = ((i2 & 64) == 0 ? M.J(bi50Var) : M.y(bi50Var) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                qppVar2 = qppVar;
                i4 |= M.J(qppVar2) ? 2048 : 1024;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    d5qVar2 = d5qVar;
                    i4 |= M.J(d5qVar2) ? 16384 : 8192;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((196608 & i2) == 0) {
                        i4 |= M.J(str) ? 131072 : 65536;
                        if ((1572864 & i2) == 0) {
                            i4 |= M.y(yzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                            q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                            qpp b2 = i5 != 0 ? anp.a().b(anp.e(null, 3)) : qppVar2;
                            d5q b3 = i6 != 0 ? anp.h().b(anp.f(null, 3)) : d5qVar2;
                            String str3 = i7 != 0 ? "AnimatedVisibility" : str;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1763490971, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                            }
                            int i9 = i4 >> 3;
                            wlp0 d2 = ump0.d(bi50Var, str3, M, (i9 & 14) | ((i4 >> 12) & 112));
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = j.i;
                                M.R(x);
                            }
                            g(d2, (izs) x, q630Var4, b2, b3, yzsVar, M, (i4 & 57344) | (i4 & 896) | 48 | (i4 & 7168) | (i9 & 458752));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            str2 = str3;
                            q630Var3 = q630Var4;
                            qppVar3 = b2;
                            d5qVar3 = b3;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            qppVar3 = qppVar2;
                            d5qVar3 = d5qVar2;
                            str2 = str;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new b(spg0Var, bi50Var, q630Var3, qppVar3, d5qVar3, str2, yzsVar, i2, i3);
                            return;
                        }
                        return;
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                d5qVar2 = d5qVar;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            qppVar2 = qppVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            d5qVar2 = d5qVar;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if (M.t(i4 & 1, (599185 & i4) != 599184)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        qppVar2 = qppVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        d5qVar2 = d5qVar;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (M.t(i4 & 1, (599185 & i4) != 599184)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(spg0 spg0Var, boolean z, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        qpp qppVar2;
        int i6;
        d5q d5qVar2;
        int i7;
        q630 q630Var3;
        qpp qppVar3;
        d5q d5qVar3;
        String str2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(234057107);
        if ((i2 & 48) == 0) {
            i4 = (M.l(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                qppVar2 = qppVar;
                i4 |= M.J(qppVar2) ? 2048 : 1024;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    d5qVar2 = d5qVar;
                    i4 |= M.J(d5qVar2) ? 16384 : 8192;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((196608 & i2) == 0) {
                        i4 |= M.J(str) ? 131072 : 65536;
                        if ((1572864 & i2) == 0) {
                            i4 |= M.y(yzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                            q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                            qpp b2 = i5 != 0 ? anp.e(null, 3).b(anp.a()) : qppVar2;
                            d5q b3 = i6 != 0 ? anp.f(null, 3).b(anp.h()) : d5qVar2;
                            String str3 = i7 != 0 ? "AnimatedVisibility" : str;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(234057107, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                            }
                            int i9 = i4 >> 3;
                            wlp0 e2 = ump0.e(Boolean.valueOf(z), str3, M, (i9 & 14) | ((i4 >> 12) & 112), 0);
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = d.i;
                                M.R(x);
                            }
                            g(e2, (izs) x, q630Var4, b2, b3, yzsVar, M, (i4 & 896) | 48 | (i4 & 7168) | (i4 & 57344) | (458752 & i9));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            str2 = str3;
                            q630Var3 = q630Var4;
                            qppVar3 = b2;
                            d5qVar3 = b3;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            qppVar3 = qppVar2;
                            d5qVar3 = d5qVar2;
                            str2 = str;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new e(spg0Var, z, q630Var3, qppVar3, d5qVar3, str2, yzsVar, i2, i3);
                            return;
                        }
                        return;
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                d5qVar2 = d5qVar;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                if (M.t(i4 & 1, (599185 & i4) != 599184)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            qppVar2 = qppVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            d5qVar2 = d5qVar;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if (M.t(i4 & 1, (599185 & i4) != 599184)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        qppVar2 = qppVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        d5qVar2 = d5qVar;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (M.t(i4 & 1, (599185 & i4) != 599184)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(boolean z, q630 q630Var, qpp qppVar, d5q d5qVar, String str, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        boolean z2;
        int i4;
        q630 q630Var2;
        int i5;
        qpp qppVar2;
        int i6;
        d5q d5qVar2;
        int i7;
        String str2;
        q630 q630Var3;
        qpp qppVar3;
        d5q d5qVar3;
        androidx.compose.runtime.f s;
        int i8;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-1448730565);
        if ((i2 & 6) == 0) {
            z2 = z;
            i4 = (M.l(z2) ? 4 : 2) | i2;
        } else {
            z2 = z;
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                qppVar2 = qppVar;
                i4 |= M.J(qppVar2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    d5qVar2 = d5qVar;
                    i4 |= M.J(d5qVar2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i4 |= M.J(str) ? 16384 : 8192;
                        if ((196608 & i2) == 0) {
                            i4 |= M.y(yzsVar) ? 131072 : 65536;
                        }
                        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
                            if (i9 != 0) {
                                q630Var4 = q630.a.a;
                                i8 = i7;
                            } else {
                                i8 = i7;
                                q630Var4 = q630Var2;
                            }
                            qpp b2 = i5 != 0 ? anp.e(null, 3).b(anp.c(null, 15)) : qppVar2;
                            d5q b3 = i6 != 0 ? anp.j(null, 15).b(anp.f(null, 3)) : d5qVar2;
                            String str3 = i8 != 0 ? "AnimatedVisibility" : str;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1448730565, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                            }
                            wlp0 e2 = ump0.e(Boolean.valueOf(z2), str3, M, (i4 & 14) | ((i4 >> 9) & 112), 0);
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = a.i;
                                M.R(x);
                            }
                            izs izsVar = (izs) x;
                            int i10 = i4 << 3;
                            g(e2, izsVar, q630Var4, b2, b3, yzsVar, M, (i10 & 57344) | (i10 & 896) | 48 | (i10 & 7168) | (i4 & 458752));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            str2 = str3;
                            q630Var3 = q630Var4;
                            qppVar3 = b2;
                            d5qVar3 = b3;
                        } else {
                            M.h();
                            str2 = str;
                            q630Var3 = q630Var2;
                            qppVar3 = qppVar2;
                            d5qVar3 = d5qVar2;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new c(z2, q630Var3, qppVar3, d5qVar3, str2, yzsVar, i2, i3);
                            return;
                        }
                        return;
                    }
                    if ((196608 & i2) == 0) {
                    }
                    if (M.t(i4 & 1, (74899 & i4) != 74898)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                d5qVar2 = d5qVar;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((196608 & i2) == 0) {
                }
                if (M.t(i4 & 1, (74899 & i4) != 74898)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            qppVar2 = qppVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            d5qVar2 = d5qVar;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        qppVar2 = qppVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        d5qVar2 = d5qVar;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final <T> void g(wlp0<T> wlp0Var, izs<? super T, Boolean> izsVar, q630 q630Var, qpp qppVar, d5q d5qVar, yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        qpp qppVar2;
        d5q d5qVar2;
        yzs<? super om2, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar2;
        androidx.compose.runtime.a M = aVar.M(1706321816);
        if ((i2 & 6) == 0) {
            i3 = (M.J(wlp0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            qppVar2 = qppVar;
            i3 |= M.J(qppVar2) ? 2048 : 1024;
        } else {
            qppVar2 = qppVar;
        }
        if ((i2 & 24576) == 0) {
            d5qVar2 = d5qVar;
            i3 |= M.J(d5qVar2) ? 16384 : 8192;
        } else {
            d5qVar2 = d5qVar;
        }
        if ((i2 & 196608) == 0) {
            yzsVar2 = yzsVar;
            i3 |= M.y(yzsVar2) ? 131072 : 65536;
        } else {
            yzsVar2 = yzsVar;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1706321816, i3, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:678)");
            }
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new k(izsVar, wlp0Var);
                M.R(x);
            }
            q630 i6 = dd80.i(q630Var, (yzs) x);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = l.i;
                M.R(x2);
            }
            int i7 = i4 | 196608 | i5 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128);
            a(wlp0Var, izsVar, i6, qppVar2, d5qVar2, (wzs) x2, yzsVar2, M, i7, 64);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m(wlp0Var, izsVar, q630Var, qppVar, d5qVar, yzsVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> EnterExitState h(wlp0<T> wlp0Var, izs<? super T, Boolean> izsVar, T t, androidx.compose.runtime.a aVar, int i2) {
        EnterExitState enterExitState;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(361571134, i2, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:848)");
        }
        aVar.W(-422486745, wlp0Var);
        boolean g2 = wlp0Var.g();
        z46 z46Var = wlp0Var.a;
        if (g2) {
            aVar.K(-212166497);
            aVar.j();
            enterExitState = izsVar.invoke(t).booleanValue() ? EnterExitState.Visible : izsVar.invoke(z46Var.B()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            aVar.K(-211892364);
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                aVar.R(x);
            }
            wh50 wh50Var = (wh50) x;
            if (izsVar.invoke(z46Var.B()).booleanValue()) {
                wh50Var.setValue(Boolean.TRUE);
            }
            enterExitState = izsVar.invoke(t).booleanValue() ? EnterExitState.Visible : ((Boolean) wh50Var.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            aVar.j();
        }
        aVar.a0();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return enterExitState;
    }
}
