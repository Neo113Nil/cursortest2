package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.k;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: VkTopBar.kt */
/* loaded from: classes17.dex */
public final class muv0 {

    /* compiled from: VkTopBar.kt */
    @b6l(c = "com.vk.core.compose.component.VkTopBarKt$VkTopBar$2$1", f = "VkTopBar.kt", l = {88}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ if2<Float, sq2> $alphaAnimatable;
        final /* synthetic */ float $slotAlpha;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(if2<Float, sq2> if2Var, float f, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$alphaAnimatable = if2Var;
            this.$slotAlpha = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$alphaAnimatable, this.$slotAlpha, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if2<Float, sq2> if2Var = this.$alphaAnimatable;
                Float f = new Float(this.$slotAlpha);
                dtp0 d = jq2.d(300, 0, luo.d, 2);
                this.label = 1;
                if (if2.c(if2Var, f, d, null, this, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public static final void a(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-240522414);
        int i2 = (M.J(mtk0Var) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-240522414, i2, -1, "com.vk.core.compose.component.Divider (VkTopBar.kt:262)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ra8.a.b(f, dt1.a.i));
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new oy5(mtk0Var, 2);
                M.R(x);
            }
            jqu0.a(rdu.a(F, (izs) x), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.u(mtk0Var, i, 15);
        }
    }

    public static final void b(final TopBar$Middle topBar$Middle, final e7p0 e7p0Var, final mtk0 mtk0Var, final float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1191469651);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(topBar$Middle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(e7p0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(mtk0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.n(f) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1191469651, i2, -1, "com.vk.core.compose.component.Middle (VkTopBar.kt:224)");
            }
            q630.a aVar2 = q630.a.a;
            q630 b = tpg0Var.b(1.0f, aVar2, true);
            znk0.z().getClass();
            float f2 = 0;
            q630 C = s200.C(b, new u890(f2, f2, f2, f2));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, C);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                M.K(900669717);
                q630 a2 = o19.a(aVar2, f);
                if (!(topBar$Middle instanceof e7p0) || e7p0Var != null) {
                    float floatValue = ((Number) mtk0Var.getValue()).floatValue();
                    a2 = a2.g(o19.a(aVar2, floatValue <= 0.7f ? (0.7f - floatValue) / 0.7f : 0.0f));
                }
                topBar$Middle.a(a2, M, i2 & 112);
                if ((topBar$Middle instanceof e7p0) && e7p0Var == null) {
                    M.K(892112539);
                } else {
                    M.K(-802211975);
                    if (e7p0Var == null) {
                        M.K(901263831);
                    } else {
                        M.K(-802210966);
                        float floatValue2 = ((Number) mtk0Var.getValue()).floatValue();
                        if (floatValue2 >= 0.5f) {
                            f3 = (floatValue2 - 0.5f) / 0.5f;
                        }
                        e7p0Var.a(o19.a(aVar2, f3), M, (i2 >> 3) & 112);
                    }
                    M.j();
                }
                M.j();
            } else {
                M.K(892112539);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.luv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    muv0.b(TopBar$Middle.this, e7p0Var, mtk0Var, f, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var, lg90 lg90Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(83804742);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.l(true) ? 32 : 16) | (M.y(lg90Var) ? 256 : 128) | (M.J(str) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(83804742, i2, -1, "com.vk.core.compose.component.PanelHeaderIconButton (VkTopBar.kt:416)");
            }
            float f = kqu0.t;
            q630.a aVar2 = q630.a.a;
            nzu0.e(gzsVar, txj0.q(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 28), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, null, null, kai.c(-2042999301, new au7(10, lg90Var, str), M), M, (i2 & 14) | 100663296 | ((i2 << 12) & 458752), Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p750(gzsVar, lg90Var, str, q630Var2, i);
        }
    }

    public static final void d(spg0 spg0Var, String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1680745168);
        if ((i & 6) == 0) {
            i2 = i | (M.J(spg0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= M.J(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1680745168, i3, -1, "com.vk.core.compose.component.TitleText (VkTopBar.kt:397)");
            }
            q630.a aVar3 = q630.a.a;
            q630 b = spg0Var.b(1.0f, aVar3, true);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str2, b, j, null, null, 0, 0, null, 2, true, 0, 1, null, wuv0Var.g, aVar2, ((i3 >> 3) & 14) | 905969664, 48, 5368);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new iu6(i, 6, spg0Var, str, q630Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, q630 q630Var, l5g l5gVar, final lg90 lg90Var, String str2, final gzs gzsVar, boolean z, lg90 lg90Var2, boolean z2, gzs gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        l5g l5gVar2;
        int i6;
        String str3;
        int i7;
        int i8;
        int i9;
        int i10;
        final boolean z3;
        final boolean z4;
        final q630 q630Var3;
        androidx.compose.runtime.a aVar2;
        final l5g l5gVar3;
        final String str4;
        final lg90 lg90Var3;
        final gzs gzsVar3;
        androidx.compose.runtime.f s;
        int i11;
        gzs gzsVar4;
        androidx.compose.runtime.a M = aVar.M(-1023311146);
        if ((i & 6) == 0) {
            i4 = (M.J(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                l5gVar2 = l5gVar;
                i4 |= M.J(l5gVar2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i4 |= (i & 4096) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    str3 = str2;
                    i4 |= M.J(str3) ? 16384 : 8192;
                    if ((i & 196608) == 0) {
                        i4 |= M.y(gzsVar) ? 131072 : 65536;
                    }
                    int i13 = i4 | 1572864;
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i13 = i4 | 14155776;
                    } else if ((12582912 & i) == 0) {
                        i13 |= (i & C.DEFAULT_MUXED_BUFFER_SIZE) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 8388608 : 4194304;
                    }
                    i8 = i13 | 905969664;
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i10 = 6;
                    } else if ((i2 & 6) == 0) {
                        i10 = i2 | (M.y(gzsVar2) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                        M.h();
                        z3 = z;
                        z4 = z2;
                        q630Var3 = q630Var2;
                        aVar2 = M;
                        l5gVar3 = l5gVar2;
                        str4 = str3;
                        lg90Var3 = lg90Var2;
                        gzsVar3 = gzsVar2;
                    } else {
                        q630 q630Var4 = i12 != 0 ? q630.a.a : q630Var2;
                        l5g l5gVar4 = i5 == 0 ? l5gVar2 : null;
                        String str5 = i6 != 0 ? null : str3;
                        if (i7 != 0) {
                            lg90Var3 = null;
                            i11 = i9;
                        } else {
                            i11 = i9;
                            lg90Var3 = lg90Var2;
                        }
                        if (i11 != 0) {
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = new q0s0(6);
                                M.R(x);
                            }
                            gzsVar4 = (gzs) x;
                        } else {
                            gzsVar4 = gzsVar2;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1023311146, i8, i10, "com.vk.core.compose.component.VkPanelHeader (VkTopBar.kt:377)");
                        }
                        q630 q630Var5 = q630Var4;
                        f(kai.c(462076287, new qe8(str, 2), M), q630Var5, l5gVar4, lg90Var, str5, gzsVar, lg90Var3, gzsVar4, M, (i8 & 112) | 6 | (i8 & 896) | 4096 | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8) | C.DEFAULT_MUXED_BUFFER_SIZE | (29360128 & i8) | (234881024 & i8) | (i8 & 1879048192), i10 & 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var5;
                        l5gVar3 = l5gVar4;
                        str4 = str5;
                        aVar2 = M;
                        z3 = true;
                        gzsVar3 = gzsVar4;
                        z4 = true;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.huv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                muv0.e(str, q630Var3, l5gVar3, lg90Var, str4, gzsVar, z3, lg90Var3, z4, gzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2), i3);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                str3 = str2;
                if ((i & 196608) == 0) {
                }
                int i132 = i4 | 1572864;
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i132 | 905969664;
                i9 = i3 & 1024;
                if (i9 == 0) {
                }
                if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            l5gVar2 = l5gVar;
            if ((i & 3072) == 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str3 = str2;
            if ((i & 196608) == 0) {
            }
            int i1322 = i4 | 1572864;
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i1322 | 905969664;
            i9 = i3 & 1024;
            if (i9 == 0) {
            }
            if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i10 & 3) != 2)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        l5gVar2 = l5gVar;
        if ((i & 3072) == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str3 = str2;
        if ((i & 196608) == 0) {
        }
        int i13222 = i4 | 1572864;
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i13222 | 905969664;
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i10 & 3) != 2)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    @ozl
    public static final void f(final jai jaiVar, final q630 q630Var, final l5g l5gVar, final lg90 lg90Var, final String str, final gzs gzsVar, final lg90 lg90Var2, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        l5g l5gVar2;
        int i4;
        jai jaiVar2;
        jai jaiVar3;
        androidx.compose.runtime.a M = aVar.M(211240239);
        if ((i & 6) == 0) {
            i3 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 384) == 0) {
            l5gVar2 = l5gVar;
            i3 |= M.J(l5gVar2) ? 256 : 128;
        } else {
            l5gVar2 = l5gVar;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.l(true) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= (16777216 & i) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= M.J(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= M.l(true) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.y(gzsVar2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(211240239, i3, i4, "com.vk.core.compose.component.VkPanelHeader (VkTopBar.kt:336)");
            }
            if (lg90Var == null) {
                M.K(931549876);
                M.j();
                jaiVar2 = null;
            } else {
                M.K(931549877);
                jai c = kai.c(-329186314, new bkb0(gzsVar, lg90Var, str, 1), M);
                M.j();
                jaiVar2 = c;
            }
            if (lg90Var2 == null) {
                M.K(931803394);
                M.j();
                jaiVar3 = null;
            } else {
                M.K(931803395);
                jai c2 = kai.c(-1121890121, new yzs() { // from class: xsna.iuv0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1121890121, intValue, -1, "com.vk.core.compose.component.VkPanelHeader.<anonymous>.<anonymous> (VkTopBar.kt:351)");
                            }
                            muv0.c(512, aVar2, null, gzs.this, null, lg90Var2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M);
                M.j();
                jaiVar3 = c2;
            }
            g(jaiVar, q630Var2, l5gVar2, jaiVar2, jaiVar3, M, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.juv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    muv0.f(jai.this, q630Var, l5gVar, lg90Var, str, gzsVar, lg90Var2, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(jai jaiVar, q630 q630Var, l5g l5gVar, yzs yzsVar, yzs yzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1159705745);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(l5gVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(yzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(yzsVar2) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1159705745, i2, -1, "com.vk.core.compose.component.VkPanelHeader (VkTopBar.kt:288)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            com.vk.core.compose.component.topbar.b.e.getClass();
            q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, m7p0.a, 1, f);
            if (l5gVar == null) {
                M.K(-2080675681);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getHeader().a;
                M.j();
            } else {
                M.K(-2080676952);
                M.j();
                j = l5gVar.a;
            }
            q630 F = s200.F(com.vk.core.compose.component.topbar.b.c(k.b.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(b, j, androidx.compose.ui.graphics.e.a));
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(yg90.a), bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            tpg0 tpg0Var = tpg0.a;
            if (yzsVar == null) {
                M.K(1500929514);
            } else {
                M.K(2126627063);
                yzsVar.invoke(tpg0Var, M, Integer.valueOf(((i2 >> 6) & 112) | 6));
            }
            M.j();
            jaiVar.invoke(tpg0Var, M, Integer.valueOf(((i2 << 3) & 112) | 6));
            if (yzsVar2 == null) {
                M.K(1500979114);
            } else {
                M.K(2126628663);
                yzsVar2.invoke(tpg0Var, M, Integer.valueOf(6 | ((i2 >> 9) & 112)));
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bvp0(jaiVar, q630Var, l5gVar, yzsVar, yzsVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0472 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final TopBar$Middle topBar$Middle, q630 q630Var, com.vk.core.compose.component.topbar.k kVar, e7p0 e7p0Var, TopBar$Before topBar$Before, TopBar$Before topBar$Before2, com.vk.core.compose.component.topbar.d dVar, yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, boolean z, long j, mtk0<Float> mtk0Var, com.vk.core.compose.component.topbar.g gVar, float f, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        com.vk.core.compose.component.topbar.k kVar2;
        int i6;
        e7p0 e7p0Var2;
        int i7;
        int i8;
        TopBar$Before topBar$Before3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        androidx.compose.runtime.a aVar2;
        final TopBar$Before topBar$Before4;
        final com.vk.core.compose.component.topbar.d dVar2;
        final boolean z2;
        final com.vk.core.compose.component.topbar.g gVar2;
        final float f2;
        final com.vk.core.compose.component.topbar.k kVar3;
        final e7p0 e7p0Var3;
        final TopBar$Before topBar$Before5;
        final q630 q630Var3;
        final yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar2;
        final long j2;
        final mtk0<Float> mtk0Var2;
        androidx.compose.runtime.f s;
        TopBar$Before topBar$Before6;
        com.vk.core.compose.component.topbar.d dVar3;
        boolean z3;
        float f3;
        com.vk.core.compose.component.topbar.k kVar4;
        long j3;
        int i22;
        mtk0<Float> mtk0Var3;
        float f4;
        mtk0<Float> mtk0Var4;
        q630.a aVar3;
        int i23;
        yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar3;
        com.vk.core.compose.component.topbar.g gVar3;
        long j4;
        long j5;
        q630 q630Var4;
        float f5;
        com.vk.core.compose.component.topbar.g gVar4;
        q630 q630Var5;
        long j6;
        com.vk.core.compose.component.topbar.g gVar5;
        boolean z4;
        Object x;
        boolean z5;
        float f6;
        int i24;
        wh50<Float> wh50Var;
        wh50<Float> wh50Var2;
        wh50<Float> wh50Var3;
        wh50<Float> wh50Var4;
        int i25;
        int i26;
        androidx.compose.runtime.a M = aVar.M(-539563172);
        if ((i & 6) == 0) {
            i4 = (M.J(topBar$Middle) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i27 = i3 & 2;
        if (i27 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                kVar2 = kVar;
                i4 |= M.J(kVar2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    e7p0Var2 = e7p0Var;
                    i4 |= M.J(e7p0Var2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= M.J(topBar$Before != null ? new com.vk.core.compose.component.topbar.e(topBar$Before) : null) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                        topBar$Before3 = topBar$Before2;
                    } else {
                        topBar$Before3 = topBar$Before2;
                        if ((i & 196608) == 0) {
                            i4 |= M.J(topBar$Before3) ? 131072 : 65536;
                        }
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= M.J(dVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= M.y(yzsVar) ? 8388608 : 4194304;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i12 = i11;
                        i4 |= M.l(z) ? 67108864 : 33554432;
                        if ((i & 805306368) == 0) {
                            if ((i3 & 512) == 0) {
                                i25 = i4;
                                if (M.p(j)) {
                                    i26 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                                    i13 = i25 | i26;
                                }
                            } else {
                                i25 = i4;
                            }
                            i26 = 268435456;
                            i13 = i25 | i26;
                        } else {
                            i13 = i4;
                        }
                        i14 = i13;
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                            i17 = i2 | 6;
                            i16 = i15;
                        } else if ((i2 & 6) == 0) {
                            i16 = i15;
                            i17 = i2 | (M.J(mtk0Var) ? 4 : 2);
                        } else {
                            i16 = i15;
                            i17 = i2;
                        }
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                            i17 |= 48;
                            i19 = i18;
                        } else if ((i2 & 48) == 0) {
                            i19 = i18;
                            i17 |= M.J(gVar) ? 32 : 16;
                        } else {
                            i19 = i18;
                        }
                        int i28 = i17;
                        i20 = i3 & 4096;
                        if (i20 != 0) {
                            i21 = i28 | 384;
                        } else {
                            int i29 = i28;
                            if ((i2 & 384) == 0) {
                                i29 |= M.n(f) ? 256 : 128;
                            }
                            i21 = i29;
                        }
                        if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i21 & 147) != 146)) {
                            M.V();
                            int i30 = i & 1;
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            q630.a aVar4 = q630.a.a;
                            if (i30 == 0 || M.i()) {
                                if (i27 != 0) {
                                    q630Var2 = aVar4;
                                }
                                if (i5 != 0) {
                                    kVar2 = k.b.a;
                                }
                                if (i6 != 0) {
                                    e7p0Var2 = null;
                                }
                                topBar$Before6 = i7 != 0 ? null : topBar$Before;
                                if (i8 != 0) {
                                    topBar$Before3 = null;
                                }
                                dVar3 = i9 != 0 ? null : dVar;
                                yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar4 = i10 != 0 ? xoi.a : yzsVar;
                                z3 = i12 != 0 ? false : z;
                                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                if ((i3 & 512) != 0) {
                                    kVar4 = kVar2;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    j3 = ylu0Var.getHeader().a;
                                    i22 = i14 & (-1879048193);
                                } else {
                                    kVar4 = kVar2;
                                    j3 = j;
                                    i22 = i14;
                                }
                                long j7 = j3;
                                if (i16 != 0) {
                                    Object x2 = M.x();
                                    if (x2 == c0012a) {
                                        x2 = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                                        M.R(x2);
                                    }
                                    mtk0Var3 = (wh50) x2;
                                } else {
                                    mtk0Var3 = mtk0Var;
                                }
                                com.vk.core.compose.component.topbar.g gVar6 = i19 != 0 ? null : gVar;
                                if (i20 != 0) {
                                    mtk0Var4 = mtk0Var3;
                                    aVar3 = aVar4;
                                    i23 = i22;
                                    yzsVar3 = yzsVar4;
                                    f4 = 1.0f;
                                } else {
                                    f4 = f;
                                    mtk0Var4 = mtk0Var3;
                                    aVar3 = aVar4;
                                    i23 = i22;
                                    yzsVar3 = yzsVar4;
                                }
                                kVar2 = kVar4;
                                gVar3 = gVar6;
                                j4 = j7;
                            } else {
                                M.h();
                                if ((i3 & 512) != 0) {
                                    dVar3 = dVar;
                                    yzsVar3 = yzsVar;
                                    z3 = z;
                                    j4 = j;
                                    mtk0Var4 = mtk0Var;
                                    gVar3 = gVar;
                                    f4 = f;
                                    aVar3 = aVar4;
                                    i23 = i14 & (-1879048193);
                                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    topBar$Before6 = topBar$Before;
                                } else {
                                    topBar$Before6 = topBar$Before;
                                    dVar3 = dVar;
                                    yzsVar3 = yzsVar;
                                    z3 = z;
                                    j4 = j;
                                    mtk0Var4 = mtk0Var;
                                    gVar3 = gVar;
                                    f4 = f;
                                    aVar3 = aVar4;
                                    i23 = i14;
                                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                q630Var4 = q630Var2;
                                j5 = j4;
                                androidx.compose.runtime.b.f(-539563172, i23, i21, "com.vk.core.compose.component.VkTopBar (VkTopBar.kt:85)");
                            } else {
                                j5 = j4;
                                q630Var4 = q630Var2;
                            }
                            Object x3 = M.x();
                            if (x3 == c0012a) {
                                x3 = qf2.a(f4);
                                M.R(x3);
                            }
                            if2 if2Var = (if2) x3;
                            Float valueOf = Float.valueOf(f4);
                            int i31 = i21;
                            boolean y = M.y(if2Var) | ((i21 & 896) == 256);
                            Object x4 = M.x();
                            if (y || x4 == c0012a) {
                                f5 = f4;
                                gVar4 = gVar3;
                                x4 = new a(if2Var, f5, null);
                                M.R(x4);
                            } else {
                                f5 = f4;
                                gVar4 = gVar3;
                            }
                            bap.g(valueOf, (wzs) x4, M, (i31 >> 6) & 14);
                            mtk0 mtk0Var5 = if2Var.c;
                            boolean z6 = (i23 & 896) == 256;
                            Object x5 = M.x();
                            if (z6 || x5 == c0012a) {
                                x5 = bbk0.b(new s(24, mtk0Var4, kVar2));
                                M.R(x5);
                            }
                            mtk0 mtk0Var6 = (mtk0) x5;
                            float f7 = f5;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            float e = l5g.e(ylu0Var2.getHeader().a);
                            Object x6 = M.x();
                            if (x6 == c0012a) {
                                x6 = androidx.compose.runtime.k.b(Float.valueOf(e));
                                M.R(x6);
                            }
                            wh50 wh50Var5 = (wh50) x6;
                            wh50Var5.setValue(Float.valueOf(q6x.z(e, f3, ((Number) mtk0Var6.getValue()).floatValue())));
                            com.vk.core.compose.component.topbar.b z7 = znk0.z();
                            float floatValue = ((Number) mtk0Var6.getValue()).floatValue();
                            z7.getClass();
                            if (!(kVar2 instanceof k.b) && !(kVar2 instanceof k.a.C0761a)) {
                                if (!(kVar2 instanceof k.a.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                floatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                            if (topBar$Before6 != null && (wh50Var4 = topBar$Before6.a) != null) {
                                ((zak0) wh50Var4).setValue(Float.valueOf(floatValue));
                                s3q0 s3q0Var = s3q0.a;
                            }
                            if (topBar$Before3 != null && (wh50Var3 = topBar$Before3.a) != null) {
                                ((zak0) wh50Var3).setValue(Float.valueOf(floatValue));
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            if (dVar3 != null && (wh50Var2 = dVar3.a) != null) {
                                ((zak0) wh50Var2).setValue(Float.valueOf(floatValue));
                                s3q0 s3q0Var3 = s3q0.a;
                            }
                            if (topBar$Before6 != null) {
                                ((zak0) topBar$Before6.b).setValue(kVar2);
                                s3q0 s3q0Var4 = s3q0.a;
                            }
                            if (topBar$Before3 != null) {
                                ((zak0) topBar$Before3.b).setValue(kVar2);
                                s3q0 s3q0Var5 = s3q0.a;
                            }
                            ((zak0) topBar$Middle.b).setValue(kVar2);
                            if (e7p0Var2 != null) {
                                ((zak0) e7p0Var2.b).setValue(kVar2);
                                s3q0 s3q0Var6 = s3q0.a;
                            }
                            if (dVar3 != null) {
                                ((zak0) dVar3.b).setValue(kVar2);
                                s3q0 s3q0Var7 = s3q0.a;
                            }
                            com.vk.core.compose.component.topbar.g gVar7 = gVar4;
                            if (gVar4 != null) {
                                ((zak0) gVar7.a).setValue(kVar2);
                                s3q0 s3q0Var8 = s3q0.a;
                            }
                            ((zak0) topBar$Middle.a).setValue(mtk0Var6.getValue());
                            if (e7p0Var2 != null && (wh50Var = e7p0Var2.a) != null) {
                                ((zak0) wh50Var).setValue(mtk0Var6.getValue());
                                s3q0 s3q0Var9 = s3q0.a;
                            }
                            if (gVar7 == null || (q630Var5 = gVar7.a()) == null) {
                                q630Var5 = aVar3;
                            }
                            if (((1879048192 & i23) ^ 805306368) > 536870912) {
                                j6 = j5;
                                if (M.p(j6)) {
                                    gVar5 = gVar7;
                                    z4 = true;
                                    x = M.x();
                                    if (!z4 || x == c0012a) {
                                        x = new job(j6, wh50Var5);
                                        M.R(x);
                                    }
                                    q630 e2 = bu00.e(q630Var5, (izs) x);
                                    if (gVar5 != null) {
                                        f6 = gVar5.b();
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                        f6 = 0;
                                    }
                                    q630 H = s200.H(e2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                    q630 q630Var6 = q630Var4;
                                    q630 g = H.g(q630Var6);
                                    dt1.a.getClass();
                                    cp10 d = ja8.d(dt1.a.b, z5);
                                    int hashCode = Long.hashCode(n34.n(M));
                                    long j8 = j6;
                                    sy90 D = M.D();
                                    q630 c = qri.c(M, g);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar5 = cri.a.b;
                                    if (M.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    M.H();
                                    if (M.L()) {
                                        M.I(aVar5);
                                    } else {
                                        M.f();
                                    }
                                    cri.a.c cVar = cri.a.f;
                                    k9q0.w(M, d, cVar);
                                    cri.a.e eVar = cri.a.e;
                                    k9q0.w(M, D, eVar);
                                    Integer valueOf2 = Integer.valueOf(hashCode);
                                    cri.a.b bVar = cri.a.g;
                                    k9q0.w(M, valueOf2, bVar);
                                    cri.a.C2678a c2678a = cri.a.h;
                                    k9q0.t(M, c2678a);
                                    cri.a.d dVar4 = cri.a.d;
                                    k9q0.w(M, c, dVar4);
                                    if (z3) {
                                        M.K(1711996291);
                                        a(mtk0Var6, M, 6);
                                    } else {
                                        M.K(1706215628);
                                    }
                                    M.j();
                                    int i32 = i23;
                                    e7p0 e7p0Var4 = e7p0Var2;
                                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
                                    int hashCode2 = Long.hashCode(n34.n(M));
                                    sy90 D2 = M.D();
                                    q630.a aVar6 = aVar3;
                                    mtk0<Float> mtk0Var7 = mtk0Var4;
                                    q630 c2 = qri.c(M, aVar6);
                                    if (M.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    M.H();
                                    if (M.L()) {
                                        M.I(aVar5);
                                    } else {
                                        M.f();
                                    }
                                    k9q0.w(M, a2, cVar);
                                    k9q0.w(M, D2, eVar);
                                    ur.d(hashCode2, M, bVar, M, c2678a);
                                    k9q0.w(M, c2, dVar4);
                                    q630 f8 = txj0.f(aVar6, 1.0f);
                                    znk0.z().getClass();
                                    q630 C = s200.C(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, m7p0.a, 1, f8), znk0.z().g(kVar2, ((Number) mtk0Var6.getValue()).floatValue()));
                                    ty6.b bVar2 = dt1.a.l;
                                    znk0.z().getClass();
                                    float f9 = 0;
                                    com.vk.core.compose.component.topbar.k kVar5 = kVar2;
                                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f9), bVar2, M, 48);
                                    int hashCode3 = Long.hashCode(n34.n(M));
                                    sy90 D3 = M.D();
                                    q630 c3 = qri.c(M, C);
                                    if (M.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    M.H();
                                    if (M.L()) {
                                        M.I(aVar5);
                                    } else {
                                        M.f();
                                    }
                                    k9q0.w(M, a3, cVar);
                                    k9q0.w(M, D3, eVar);
                                    ur.d(hashCode3, M, bVar, M, c2678a);
                                    k9q0.w(M, c3, dVar4);
                                    if (topBar$Before6 == null) {
                                        M.K(-1828477796);
                                        M.j();
                                    } else {
                                        M.K(-336077819);
                                        com.vk.core.compose.component.topbar.e.a(topBar$Before6, null, M, (i32 >> 9) & 112, 1);
                                        M.j();
                                        s3q0 s3q0Var10 = s3q0.a;
                                    }
                                    qv1 qv1Var = topBar$Before3 != null ? new qv1(topBar$Before3, ((Number) mtk0Var5.getValue()).floatValue()) : null;
                                    if (qv1Var == null) {
                                        M.K(-1828408449);
                                        M.j();
                                    } else {
                                        M.K(-336075582);
                                        znk0.z().getClass();
                                        qv1Var.e(ahn.E(s200.C(aVar6, new u890(f9, f9, f9, f9)), "topBarLeftContent"), M, 0);
                                        M.j();
                                        s3q0 s3q0Var11 = s3q0.a;
                                    }
                                    b(topBar$Middle, e7p0Var4, mtk0Var6, ((Number) mtk0Var5.getValue()).floatValue(), M, ((i32 << 3) & 112) | 6 | ((i32 >> 3) & 896));
                                    aVar2 = M;
                                    ov1 ov1Var = dVar3 != null ? new ov1(dVar3, ((Number) mtk0Var5.getValue()).floatValue()) : null;
                                    if (ov1Var == null) {
                                        aVar2.K(-1828091071);
                                        aVar2.j();
                                        i24 = 6;
                                    } else {
                                        aVar2.K(-336065344);
                                        i24 = 6;
                                        ov1Var.a(ahn.E(aVar6, "topBarRightContent"), aVar2, 6);
                                        aVar2.j();
                                        s3q0 s3q0Var12 = s3q0.a;
                                    }
                                    aVar2.G();
                                    yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar5 = yzsVar3;
                                    yzsVar5.invoke(txj0.f(aVar6, 1.0f), aVar2, Integer.valueOf(((i32 >> 18) & 112) | i24));
                                    aVar2.G();
                                    aVar2.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    topBar$Before4 = topBar$Before6;
                                    e7p0Var3 = e7p0Var4;
                                    topBar$Before5 = topBar$Before3;
                                    dVar2 = dVar3;
                                    yzsVar2 = yzsVar5;
                                    z2 = z3;
                                    kVar3 = kVar5;
                                    mtk0Var2 = mtk0Var7;
                                    f2 = f7;
                                    q630Var3 = q630Var6;
                                    j2 = j8;
                                    gVar2 = gVar5;
                                }
                            } else {
                                j6 = j5;
                            }
                            gVar5 = gVar7;
                            if ((i23 & 805306368) != 536870912) {
                                z4 = false;
                                x = M.x();
                                if (!z4) {
                                }
                                x = new job(j6, wh50Var5);
                                M.R(x);
                                q630 e22 = bu00.e(q630Var5, (izs) x);
                                if (gVar5 != null) {
                                }
                                q630 H2 = s200.H(e22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                q630 q630Var62 = q630Var4;
                                q630 g2 = H2.g(q630Var62);
                                dt1.a.getClass();
                                cp10 d2 = ja8.d(dt1.a.b, z5);
                                int hashCode4 = Long.hashCode(n34.n(M));
                                long j82 = j6;
                                sy90 D4 = M.D();
                                q630 c4 = qri.c(M, g2);
                                cri.h7.getClass();
                                LayoutNode.a aVar52 = cri.a.b;
                                if (M.N() == null) {
                                }
                            }
                            z4 = true;
                            x = M.x();
                            if (!z4) {
                            }
                            x = new job(j6, wh50Var5);
                            M.R(x);
                            q630 e222 = bu00.e(q630Var5, (izs) x);
                            if (gVar5 != null) {
                            }
                            q630 H22 = s200.H(e222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            q630 q630Var622 = q630Var4;
                            q630 g22 = H22.g(q630Var622);
                            dt1.a.getClass();
                            cp10 d22 = ja8.d(dt1.a.b, z5);
                            int hashCode42 = Long.hashCode(n34.n(M));
                            long j822 = j6;
                            sy90 D42 = M.D();
                            q630 c42 = qri.c(M, g22);
                            cri.h7.getClass();
                            LayoutNode.a aVar522 = cri.a.b;
                            if (M.N() == null) {
                            }
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            topBar$Before4 = topBar$Before;
                            dVar2 = dVar;
                            z2 = z;
                            gVar2 = gVar;
                            f2 = f;
                            kVar3 = kVar2;
                            e7p0Var3 = e7p0Var2;
                            topBar$Before5 = topBar$Before3;
                            q630Var3 = q630Var2;
                            yzsVar2 = yzsVar;
                            j2 = j;
                            mtk0Var2 = mtk0Var;
                        }
                        s = aVar2.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.kuv0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int I = ne7.I(i | 1);
                                    int I2 = ne7.I(i2);
                                    muv0.h(TopBar$Middle.this, q630Var3, kVar3, e7p0Var3, topBar$Before4, topBar$Before5, dVar2, yzsVar2, z2, j2, mtk0Var2, gVar2, f2, (androidx.compose.runtime.a) obj, I, I2, i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i12 = i11;
                    if ((i & 805306368) == 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    int i282 = i17;
                    i20 = i3 & 4096;
                    if (i20 != 0) {
                    }
                    if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i21 & 147) != 146)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                e7p0Var2 = e7p0Var;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i & 805306368) == 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 != 0) {
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                int i2822 = i17;
                i20 = i3 & 4096;
                if (i20 != 0) {
                }
                if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i21 & 147) != 146)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            kVar2 = kVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            e7p0Var2 = e7p0Var;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i & 805306368) == 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            int i28222 = i17;
            i20 = i3 & 4096;
            if (i20 != 0) {
            }
            if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i21 & 147) != 146)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        kVar2 = kVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        e7p0Var2 = e7p0Var;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i & 805306368) == 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        int i282222 = i17;
        i20 = i3 & 4096;
        if (i20 != 0) {
        }
        if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i21 & 147) != 146)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
