package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.superapp.holders.stub.ComposableSingletons$SuperAppWidgetRedesignV6HolderKt;
import com.vk.voip.ui.VoipViewModelState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import ru.ok.gl.tf.Tensorflow;
import xsna.akv0;
import xsna.bap;
import xsna.c6j;
import xsna.dp10;
import xsna.e4p0;
import xsna.ep10;
import xsna.erv0;
import xsna.iyk0;
import xsna.izs;
import xsna.jgp;
import xsna.op10;
import xsna.q630;
import xsna.rrv0;
import xsna.s2x;
import xsna.s3q0;
import xsna.s5j;
import xsna.tgi0;
import xsna.tra0;
import xsna.txj0;
import xsna.wh50;
import xsna.wuv0;
import xsna.zo10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug4 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ug4(byte b, int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (com.vk.voip.ui.c.r0() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r1 == com.vk.voip.ui.VoipViewModelState.InCall) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        boolean z = true;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yg4.d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ((Integer) obj).getClass();
                return ((PostingAuthorUiModel) obj2).e();
            case 2:
                return new Pair((ShortVideoGetPlaylistsResponseDto) obj, (List) obj2);
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1748503990, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$ModalCardScreenContentKt.lambda$-1748503990.<anonymous> (ModalCardScreenContent.kt:330)");
                    }
                    Object x = aVar.x();
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b("");
                        aVar.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    String str = (String) wh50Var.getValue();
                    Object x2 = aVar.x();
                    if (x2 == c0012a) {
                        x2 = new uc8(z ? 1 : 0, wh50Var);
                        aVar.R(x2);
                    }
                    z0v0.a(s2x.a.C3649a.a(str, (izs) x2, "Ввод", null, null, aVar, Tensorflow.FRAME_WIDTH, 32760), null, null, false, aVar, 0, 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2065457417, intValue2, -1, "com.vk.superapp.holders.stub.ComposableSingletons$SuperAppWidgetRedesignV6HolderKt.lambda$-2065457417.<anonymous> (SuperAppWidgetRedesignV6Holder.kt:240)");
                    }
                    q630 D = s200.D(txj0.h(txj0.f(q630.a.a, 1.0f), Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE), 12);
                    aVar2.K(-1003410150);
                    aVar2.K(212064437);
                    aVar2.j();
                    azl azlVar = (azl) aVar2.r(uvi.h);
                    Object x3 = aVar2.x();
                    Object obj3 = x3;
                    if (x3 == c0012a) {
                        op10 op10Var = new op10(azlVar);
                        aVar2.R(op10Var);
                        obj3 = op10Var;
                    }
                    final op10 op10Var2 = (op10) obj3;
                    Object x4 = aVar2.x();
                    Object obj4 = x4;
                    if (x4 == c0012a) {
                        c6j c6jVar = new c6j();
                        aVar2.R(c6jVar);
                        obj4 = c6jVar;
                    }
                    final c6j c6jVar2 = (c6j) obj4;
                    Object x5 = aVar2.x();
                    Object obj5 = x5;
                    if (x5 == c0012a) {
                        wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);
                        aVar2.R(b);
                        obj5 = b;
                    }
                    final wh50 wh50Var2 = (wh50) obj5;
                    Object x6 = aVar2.x();
                    Object obj6 = x6;
                    if (x6 == c0012a) {
                        h6j h6jVar = new h6j(c6jVar2);
                        aVar2.R(h6jVar);
                        obj6 = h6jVar;
                    }
                    final h6j h6jVar2 = (h6j) obj6;
                    Object x7 = aVar2.x();
                    Object obj7 = x7;
                    if (x7 == c0012a) {
                        wh50 a = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                        aVar2.R(a);
                        obj7 = a;
                    }
                    final wh50 wh50Var3 = (wh50) obj7;
                    boolean y = aVar2.y(op10Var2) | aVar2.o(257);
                    Object x8 = aVar2.x();
                    Object obj8 = x8;
                    if (y || x8 == c0012a) {
                        cp10 cp10Var = new cp10() { // from class: com.vk.superapp.holders.stub.ComposableSingletons$SuperAppWidgetRedesignV6HolderKt$lambda__2065457417$lambda$7$$inlined$ConstraintLayout$2
                            @Override // xsna.cp10
                            public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                wh50.this.getValue();
                                long f = op10Var2.f(j, ep10Var.getLayoutDirection(), h6jVar2, list, linkedHashMap);
                                wh50Var2.getValue();
                                final op10 op10Var3 = op10Var2;
                                return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.superapp.holders.stub.ComposableSingletons$SuperAppWidgetRedesignV6HolderKt$lambda__2065457417$lambda$7$$inlined$ConstraintLayout$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // xsna.izs
                                    public final s3q0 invoke(tra0.a aVar3) {
                                        op10.this.e(aVar3, list, linkedHashMap);
                                        return s3q0.a;
                                    }
                                });
                            }
                        };
                        aVar2.R(cp10Var);
                        obj8 = cp10Var;
                    }
                    cp10 cp10Var2 = (cp10) obj8;
                    Object x9 = aVar2.x();
                    Object obj9 = x9;
                    if (x9 == c0012a) {
                        gzs<s3q0> gzsVar = new gzs<s3q0>() { // from class: com.vk.superapp.holders.stub.ComposableSingletons$SuperAppWidgetRedesignV6HolderKt$lambda__2065457417$lambda$7$$inlined$ConstraintLayout$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.gzs
                            public final s3q0 invoke() {
                                wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                h6jVar2.e = true;
                                return s3q0.a;
                            }
                        };
                        aVar2.R(gzsVar);
                        obj9 = gzsVar;
                    }
                    final gzs gzsVar2 = (gzs) obj9;
                    boolean y2 = aVar2.y(op10Var2);
                    Object x10 = aVar2.x();
                    Object obj10 = x10;
                    if (y2 || x10 == c0012a) {
                        izs<tgi0, s3q0> izsVar = new izs<tgi0, s3q0>() { // from class: com.vk.superapp.holders.stub.ComposableSingletons$SuperAppWidgetRedesignV6HolderKt$lambda__2065457417$lambda$7$$inlined$ConstraintLayout$4
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public final s3q0 invoke(tgi0 tgi0Var) {
                                e4p0.a(tgi0Var, op10.this);
                                return s3q0.a;
                            }
                        };
                        aVar2.R(izsVar);
                        obj10 = izsVar;
                    }
                    joy.a(egi0.b(D, false, (izs) obj10), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.superapp.holders.stub.ComposableSingletons$SuperAppWidgetRedesignV6HolderKt$lambda__2065457417$lambda$7$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // xsna.wzs
                        public final s3q0 invoke(a aVar3, Integer num) {
                            a aVar4 = aVar3;
                            int intValue3 = num.intValue();
                            if ((intValue3 & 3) == 2 && aVar4.e()) {
                                aVar4.h();
                            } else {
                                if (b.d()) {
                                    b.f(1200550679, intValue3, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                wh50.this.setValue(s3q0.a);
                                c6j c6jVar3 = c6jVar2;
                                int i2 = c6jVar3.b;
                                c6jVar3.l();
                                c6j c6jVar4 = c6jVar2;
                                aVar4.K(-571953602);
                                c6j c6jVar5 = c6j.this;
                                s5j j = c6jVar5.j();
                                s5j j2 = c6jVar5.j();
                                q630.a aVar5 = q630.a.a;
                                q630 v = txj0.v(txj0.h(aVar5, 28), 40);
                                Object x11 = aVar4.x();
                                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                if (x11 == c0012a2) {
                                    x11 = ComposableSingletons$SuperAppWidgetRedesignV6HolderKt.a.b;
                                    aVar4.R(x11);
                                }
                                akv0.a(SkeletonType.Block, c6j.i(v, j, (izs) x11), aVar4, 6);
                                float f = 48;
                                q630 v2 = txj0.v(txj0.h(aVar5, f), f);
                                Object x12 = aVar4.x();
                                if (x12 == c0012a2) {
                                    x12 = ComposableSingletons$SuperAppWidgetRedesignV6HolderKt.b.b;
                                    aVar4.R(x12);
                                }
                                akv0.a(SkeletonType.Circle, c6j.i(v2, j2, (izs) x12), aVar4, 6);
                                c6j c6jVar6 = c6j.this;
                                s5j j3 = c6jVar6.j();
                                s5j j4 = c6jVar6.j();
                                boolean J = aVar4.J(j4);
                                Object x13 = aVar4.x();
                                if (J || x13 == c0012a2) {
                                    x13 = new ComposableSingletons$SuperAppWidgetRedesignV6HolderKt.c(j4);
                                    aVar4.R(x13);
                                }
                                q630 i3 = c6j.i(aVar5, j3, (izs) x13);
                                float f2 = 100;
                                if (b.d()) {
                                    b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                }
                                iyk0 iyk0Var = rrv0.c;
                                wuv0 wuv0Var = (wuv0) aVar4.r(iyk0Var);
                                if (b.d()) {
                                    b.e();
                                }
                                erv0.a(1, wuv0Var.i0, i3, f2, aVar4, 3078, 0);
                                Object x14 = aVar4.x();
                                if (x14 == c0012a2) {
                                    x14 = ComposableSingletons$SuperAppWidgetRedesignV6HolderKt.d.b;
                                    aVar4.R(x14);
                                }
                                q630 i4 = c6j.i(aVar5, j4, (izs) x14);
                                if (b.d()) {
                                    b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                }
                                wuv0 wuv0Var2 = (wuv0) aVar4.r(iyk0Var);
                                if (b.d()) {
                                    b.e();
                                }
                                erv0.a(1, wuv0Var2.i0, i4, f, aVar4, 3078, 0);
                                aVar4.j();
                                if (c6jVar2.b != i2) {
                                    bap.i(gzsVar2, aVar4, 6);
                                }
                                if (b.d()) {
                                    b.e();
                                }
                            }
                            return s3q0.a;
                        }
                    }, aVar2), cp10Var2, aVar2, 48, 0);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1567250672, intValue3, -1, "com.vk.core.tool.view.onboarding.ComposableSingletons$VkOnboardingTooltipKt.lambda$1567250672.<anonymous> (VkOnboardingTooltip.kt:153)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 6:
                com.vk.photo.editor.features.colorgrading.a aVar4 = (com.vk.photo.editor.features.colorgrading.a) obj;
                return com.vk.photo.editor.features.colorgrading.a.a(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a.C1454a.a(aVar4.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 134086655), null, 6143);
            case 7:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 8:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar5.K(671624220);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(671624220, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:139)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.c;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return frv0Var;
            default:
                VoipViewModelState voipViewModelState = (VoipViewModelState) obj;
                dhw0 dhw0Var = (dhw0) ((it80) obj2).a;
                if (dhw0Var != null && dhw0Var.D) {
                    if (xbx0.b.contains(voipViewModelState)) {
                        com.vk.voip.ui.c.b.getClass();
                        break;
                    }
                    return Boolean.valueOf(r5);
                }
                break;
        }
    }
}
