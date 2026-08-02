package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.lh70;
import xsna.q630;
import xsna.vzi0;

/* compiled from: NotificationSettingsView.kt */
/* loaded from: classes5.dex */
public final class th70 extends i6v0<uh70, rf70> {
    public final wj50<vzi0> f;

    /* compiled from: NotificationSettingsView.kt */
    @b6l(c = "com.vk.settings.impl.presentation.base.mvi.settings.NotificationSettingsView$SpinnerChangeLaunchEffect$1$1", f = "NotificationSettingsView.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<izs<vzi0, s3q0>> $rememberedOnSideEffect$delegate;
        final /* synthetic */ vzi0 $settingChangeSpinnerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(vzi0 vzi0Var, mtk0<? extends izs<? super vzi0, s3q0>> mtk0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$settingChangeSpinnerState = vzi0Var;
            this.$rememberedOnSideEffect$delegate = mtk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$settingChangeSpinnerState, this.$rememberedOnSideEffect$delegate, spjVar);
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
                if (epx.f(this.$settingChangeSpinnerState, vzi0.c.a) || epx.f(this.$settingChangeSpinnerState, vzi0.a.a)) {
                    this.label = 1;
                    if (qsl.b(1000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$rememberedOnSideEffect$delegate.getValue().invoke(vzi0.b.a);
            return s3q0.a;
        }
    }

    public th70(f4z f4zVar, f5z f5zVar, Context context) {
        super(context, f5zVar);
        this.f = f4zVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((uh70) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final lh70.a aVar, final mtk0 mtk0Var, izs izsVar, final izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        final q630 q630Var2;
        wh50 wh50Var;
        final th70 th70Var = this;
        final izs izsVar3 = izsVar;
        androidx.compose.runtime.a M = aVar2.M(1702969675);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(mtk0Var) ? 32 : 16) | (M.y(izsVar3) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024) | 24576 | (M.y(th70Var) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1702969675, i2, -1, "com.vk.settings.impl.presentation.base.mvi.settings.NotificationSettingsView.ContentSurface (NotificationSettingsView.kt:95)");
            }
            yzt0<Boolean> yzt0Var = aVar.a;
            Boolean bool = Boolean.FALSE;
            final wh50 d = jk50.d(yzt0Var, bool, M, 48);
            final wh50 d2 = jk50.d(aVar.b, bool, M, 48);
            wh50 d3 = jk50.d(aVar.d, bool, M, 48);
            final wh50 d4 = jk50.d(aVar.e, -1, M, 48);
            wh50 a2 = jk50.a(aVar.f, M, 0, 3);
            wh50 c = jk50.c(aVar.c, M);
            wh50 a3 = jk50.a(aVar.g, M, 0, 3);
            boolean J = M.J((List) c.getValue());
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = (List) c.getValue();
                M.R(x);
            }
            final List list = (List) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bbk0.b(new w100(mtk0Var, 15));
                M.R(x2);
            }
            final mtk0 mtk0Var2 = (mtk0) x2;
            boolean z = ((String) a2.getValue()) != null;
            q630.a aVar4 = q630.a.a;
            q630 d5 = txj0.d(aVar4, 1.0f);
            jai c2 = kai.c(-791727452, new bpc(th70Var, z, izsVar3, a3), M);
            if (androidx.compose.runtime.b.d()) {
                wh50Var = d3;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                wh50Var = d3;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            final boolean z2 = z;
            final wh50 wh50Var2 = wh50Var;
            yzs yzsVar = new yzs() { // from class: xsna.qh70
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar5.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-611634065, intValue, -1, "com.vk.settings.impl.presentation.base.mvi.settings.NotificationSettingsView.ContentSurface.<anonymous> (NotificationSettingsView.kt:142)");
                        }
                        q630 d6 = txj0.d(q630.a.a, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar5.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getBackground().g;
                        final izs izsVar4 = izs.this;
                        final th70 th70Var2 = this;
                        final boolean z3 = z2;
                        final List list2 = list;
                        final mtk0 mtk0Var3 = d;
                        final mtk0 mtk0Var4 = d2;
                        final mtk0 mtk0Var5 = wh50Var2;
                        final mtk0 mtk0Var6 = d4;
                        final mtk0 mtk0Var7 = mtk0Var2;
                        uov0.a(d6, null, j2, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1548388344, new wzs(th70Var2, z3, list2, mtk0Var3, mtk0Var4, mtk0Var5, mtk0Var6, mtk0Var7) { // from class: xsna.sh70
                            public final /* synthetic */ boolean c;
                            public final /* synthetic */ List d;
                            public final /* synthetic */ mtk0 e;
                            public final /* synthetic */ mtk0 f;
                            public final /* synthetic */ mtk0 g;
                            public final /* synthetic */ mtk0 h;
                            public final /* synthetic */ mtk0 i;

                            {
                                this.c = z3;
                                this.d = list2;
                                this.e = mtk0Var3;
                                this.f = mtk0Var4;
                                this.g = mtk0Var5;
                                this.h = mtk0Var6;
                                this.i = mtk0Var7;
                            }

                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar6;
                                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar7.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1548388344, intValue2, -1, "com.vk.settings.impl.presentation.base.mvi.settings.NotificationSettingsView.ContentSurface.<anonymous>.<anonymous> (NotificationSettingsView.kt:146)");
                                    }
                                    q630.a aVar8 = q630.a.a;
                                    q630 d7 = txj0.d(aVar8, 1.0f);
                                    dt1.a.getClass();
                                    cp10 d8 = ja8.d(dt1.a.f, false);
                                    int hashCode = Long.hashCode(n34.n(aVar7));
                                    sy90 D = aVar7.D();
                                    q630 c3 = qri.c(aVar7, d7);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar9 = cri.a.b;
                                    if (aVar7.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar7.H();
                                    if (aVar7.L()) {
                                        aVar7.I(aVar9);
                                    } else {
                                        aVar7.f();
                                    }
                                    k9q0.w(aVar7, d8, cri.a.f);
                                    k9q0.w(aVar7, D, cri.a.e);
                                    k9q0.w(aVar7, Integer.valueOf(hashCode), cri.a.g);
                                    k9q0.t(aVar7, cri.a.h);
                                    k9q0.w(aVar7, c3, cri.a.d);
                                    boolean booleanValue = ((Boolean) this.e.getValue()).booleanValue();
                                    izs izsVar5 = izs.this;
                                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                    if (booleanValue) {
                                        aVar7.K(1902812336);
                                        q630 q = txj0.q(aVar8, 48);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var3 = (ylu0) aVar7.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        aVar6 = aVar7;
                                        mku0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 28, ylu0Var3.getIcon().f, aVar6, q);
                                        aVar6.j();
                                    } else {
                                        aVar6 = aVar7;
                                        if (((Boolean) this.f.getValue()).booleanValue()) {
                                            aVar6.K(1902819668);
                                            boolean J2 = aVar6.J(izsVar5);
                                            Object x3 = aVar6.x();
                                            if (J2 || x3 == c0012a2) {
                                                x3 = new e48(izsVar5, 2);
                                                aVar6.R(x3);
                                            }
                                            uwp.a(0, aVar6, (gzs) x3, null);
                                            aVar6.j();
                                        } else {
                                            aVar6.K(-1141961531);
                                            ng70.a(0, aVar6, this.d, izsVar5, ahn.E(aVar8, this.c ? "NotificationSectionList" : "NotificationSettingsList"));
                                            aVar6.j();
                                        }
                                    }
                                    if (((Boolean) this.g.getValue()).booleanValue()) {
                                        aVar6.K(1902835613);
                                        aVar6.j();
                                        aVar6.K(-1141610146);
                                        int intValue3 = ((Number) this.h.getValue()).intValue();
                                        boolean J3 = aVar6.J(izsVar5);
                                        Object x4 = aVar6.x();
                                        if (J3 || x4 == c0012a2) {
                                            x4 = new egt(izsVar5, 1);
                                            aVar6.R(x4);
                                        }
                                        izs izsVar6 = (izs) x4;
                                        boolean J4 = aVar6.J(izsVar5);
                                        Object x5 = aVar6.x();
                                        if (J4 || x5 == c0012a2) {
                                            x5 = new ph70(izsVar5, 0);
                                            aVar6.R(x5);
                                        }
                                        androidx.compose.runtime.a aVar10 = aVar6;
                                        i7g.a(intValue3, 0, aVar10, izsVar6, (izs) x5, null);
                                        aVar6 = aVar10;
                                    } else {
                                        aVar6.K(-1141636904);
                                        aVar6.j();
                                        aVar6.K(-1148923852);
                                    }
                                    aVar6.j();
                                    mtk0 mtk0Var8 = this.i;
                                    if (((SpinnerState) mtk0Var8.getValue()) != null) {
                                        aVar6.K(-1141200419);
                                        androidx.compose.runtime.a aVar11 = aVar6;
                                        zfr0.d((SpinnerState) mtk0Var8.getValue(), null, null, null, null, 0L, 0L, null, null, aVar11, 0, 510);
                                        aVar6 = aVar11;
                                    } else {
                                        aVar6.K(-1148923852);
                                    }
                                    aVar6.j();
                                    aVar6.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar7.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar5), aVar5, 1572870, 58);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            };
            izsVar3 = izsVar3;
            th70Var = this;
            phv0.b(d5, c2, null, null, null, 0, j, 0L, kai.c(-611634065, yzsVar, M), M, 805306416, 380);
            aVar3 = M;
            th70Var.i((vzi0) mtk0Var.getValue(), izsVar2, aVar3, ((i2 >> 6) & 112) | ((i2 >> 9) & 896));
            boolean z3 = (i2 & 896) == 256;
            Object x3 = aVar3.x();
            if (z3 || x3 == c0012a) {
                x3 = new i74(izsVar3, 2);
                aVar3.R(x3);
            }
            fo50.k(0, 1, aVar3, (gzs) x3, false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs(aVar, mtk0Var, izsVar3, izsVar2, q630Var2, i) { // from class: xsna.rh70
                public final /* synthetic */ lh70.a c;
                public final /* synthetic */ mtk0 d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    th70.this.h(this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void i(vzi0 vzi0Var, izs<? super vzi0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1540434541);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(vzi0Var) : M.y(vzi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1540434541, i2, -1, "com.vk.settings.impl.presentation.base.mvi.settings.NotificationSettingsView.SpinnerChangeLaunchEffect (NotificationSettingsView.kt:210)");
            }
            wh50 c = androidx.compose.runtime.k.c(izsVar, M, (i2 >> 3) & 14);
            int i3 = i2 & 14;
            if (i3 == 4 || ((i2 & 8) != 0 && M.y(vzi0Var))) {
                z = true;
            }
            boolean J = M.J(c) | z;
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new a(vzi0Var, c, null);
                M.R(x);
            }
            bap.g(vzi0Var, (wzs) x, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bku(i, 1, this, vzi0Var, izsVar);
        }
    }

    public final void j(uh70 uh70Var, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(119085068);
        int i2 = (M.J(uh70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(119085068, i2, -1, "com.vk.settings.impl.presentation.base.mvi.settings.NotificationSettingsView.ThemedContent (NotificationSettingsView.kt:53)");
            }
            wh50 d = d(lh70.b.a, new n0u0[]{uh70Var.a}, M, (i2 & 896) | 6);
            if (((lh70) d.getValue()) instanceof lh70.a) {
                M.K(20691709);
                int i3 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                M.K(21324698);
                rrv0.d(null, null, null, null, kai.c(-1821471192, new o3m(this, izsVar, d), M), M, 24576, 15);
                M.j();
            } else {
                M.K(18023446);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fe4(this, uh70Var, izsVar, i, 2);
        }
    }
}
