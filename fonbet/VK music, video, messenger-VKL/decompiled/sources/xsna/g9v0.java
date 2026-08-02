package xsna;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.core.graphics.BlendModeCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a9v0;
import xsna.b9v0;
import xsna.c700;
import xsna.c9v0;
import xsna.cri;
import xsna.d9v0;
import xsna.dp10;
import xsna.dt1;
import xsna.e4p0;
import xsna.e9v0;
import xsna.egi0;
import xsna.ep10;
import xsna.gzs;
import xsna.izs;
import xsna.jgp;
import xsna.mqh;
import xsna.ojc;
import xsna.op10;
import xsna.pco;
import xsna.q630;
import xsna.rdu;
import xsna.s3q0;
import xsna.sg50;
import xsna.tgi0;
import xsna.tra0;
import xsna.txj0;
import xsna.u700;
import xsna.vua0;
import xsna.w8v0;
import xsna.wh50;
import xsna.wkj;
import xsna.z600;
import xsna.z8v0;
import xsna.zo10;

/* compiled from: VkOnboardingTooltip.kt */
/* loaded from: classes17.dex */
public final class g9v0 {

    /* compiled from: VkOnboardingTooltip.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[VkTooltip$BalloonPosition.values().length];
            try {
                iArr[VkTooltip$BalloonPosition.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.TopLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.TopRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.BottomRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.BottomLeft.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkTooltip$MarkerSize.values().length];
            try {
                iArr2[VkTooltip$MarkerSize.Size48.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VkTooltip$MarkerSize.Size56.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VkTooltip$MarkerSize.Size64.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VkTooltip$MarkerSize.Size72.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VkTooltip$MarkerSize.Size96.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VkTooltip$MarkerSize.Size146.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VkTooltip$MarkerStyle.values().length];
            try {
                iArr3[VkTooltip$MarkerStyle.Style1.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[VkTooltip$MarkerStyle.Style2.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[VkTooltip$MarkerStyle.Style3.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[VkTooltip$MarkerStyle.Style4.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[VkTooltip$MarkerStyle.Style5.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[VkTooltip$MarkerStyle.Style6.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[VkTooltip$BalloonTilt.values().length];
            try {
                iArr4[VkTooltip$BalloonTilt.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[VkTooltip$BalloonTilt.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0461  */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final etv0 etv0Var, final String str, q630 q630Var, final VkTooltip$MarkerStyle vkTooltip$MarkerStyle, final VkTooltip$MarkerSize vkTooltip$MarkerSize, final VkOnboarding$TintColor vkOnboarding$TintColor, final VkTooltip$BalloonPosition vkTooltip$BalloonPosition, final VkTooltip$BalloonTilt vkTooltip$BalloonTilt, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final gzs gzsVar4, final gzs gzsVar5, final VkOnboardingStat$Delegate vkOnboardingStat$Delegate, final float f, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        Object y8v0Var;
        wh50 wh50Var;
        int i2;
        Object obj;
        boolean z;
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition2;
        Object obj2;
        q630 q630Var3;
        Object x;
        Object x2;
        Object x3;
        final wh50 wh50Var2;
        Object x4;
        final op10 op10Var;
        boolean y;
        Object x5;
        goy goyVar;
        Object obj3;
        boolean z2;
        boolean z3;
        Object x6;
        int i3;
        final VkOnboardingStat$Delegate vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
        androidx.compose.runtime.a M = aVar.M(-330443153);
        int i4 = i | (M.J(etv0Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | 384 | (M.o(vkTooltip$MarkerStyle == null ? -1 : vkTooltip$MarkerStyle.ordinal()) ? 2048 : 1024) | (M.o(vkTooltip$MarkerSize == null ? -1 : vkTooltip$MarkerSize.ordinal()) ? 16384 : 8192) | (M.o(vkOnboarding$TintColor == null ? -1 : vkOnboarding$TintColor.ordinal()) ? 131072 : 65536) | (M.o(vkTooltip$BalloonPosition == null ? -1 : vkTooltip$BalloonPosition.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.o(vkTooltip$BalloonTilt == null ? -1 : vkTooltip$BalloonTilt.ordinal()) ? 8388608 : 4194304) | (M.y(gzsVar) ? 67108864 : 33554432) | (M.y(gzsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i5 = (M.y(gzsVar3) ? 4 : 2) | (M.y(gzsVar4) ? 32 : 16) | (M.y(gzsVar5) ? 256 : 128) | (M.J(vkOnboardingStat$Delegate2) ? 2048 : 1024) | (M.n(f) ? 16384 : 8192);
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-330443153, i4, i5, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltip (VkOnboardingTooltip.kt:72)");
            }
            Object x7 = M.x();
            Object obj4 = a.C0011a.a;
            if (x7 == obj4) {
                switch (a.$EnumSwitchMapping$2[vkTooltip$MarkerStyle.ordinal()]) {
                    case 1:
                        switch (a.$EnumSwitchMapping$1[vkTooltip$MarkerSize.ordinal()]) {
                            case 1:
                                i3 = R.raw.circle_marker_1_48;
                                break;
                            case 2:
                                i3 = R.raw.circle_marker_1_56;
                                break;
                            case 3:
                                i3 = R.raw.circle_marker_1_64;
                                break;
                            case 4:
                                i3 = R.raw.circle_marker_1_72;
                                break;
                            case 5:
                                i3 = R.raw.circle_marker_1_96;
                                break;
                            case 6:
                                i3 = R.raw.circle_marker_1_146;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case 2:
                        switch (a.$EnumSwitchMapping$1[vkTooltip$MarkerSize.ordinal()]) {
                            case 1:
                                i3 = R.raw.circle_marker_2_48;
                                break;
                            case 2:
                                i3 = R.raw.circle_marker_2_56;
                                break;
                            case 3:
                                i3 = R.raw.circle_marker_2_64;
                                break;
                            case 4:
                                i3 = R.raw.circle_marker_2_72;
                                break;
                            case 5:
                                i3 = R.raw.circle_marker_2_96;
                                break;
                            case 6:
                                i3 = R.raw.circle_marker_2_146;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case 3:
                        switch (a.$EnumSwitchMapping$1[vkTooltip$MarkerSize.ordinal()]) {
                            case 1:
                                i3 = R.raw.circle_marker_3_48;
                                break;
                            case 2:
                                i3 = R.raw.circle_marker_3_56;
                                break;
                            case 3:
                                i3 = R.raw.circle_marker_3_64;
                                break;
                            case 4:
                                i3 = R.raw.circle_marker_3_72;
                                break;
                            case 5:
                                i3 = R.raw.circle_marker_3_96;
                                break;
                            case 6:
                                i3 = R.raw.circle_marker_3_146;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case 4:
                        switch (a.$EnumSwitchMapping$1[vkTooltip$MarkerSize.ordinal()]) {
                            case 1:
                                i3 = R.raw.circle_marker_4_48;
                                break;
                            case 2:
                                i3 = R.raw.circle_marker_4_56;
                                break;
                            case 3:
                                i3 = R.raw.circle_marker_4_64;
                                break;
                            case 4:
                                i3 = R.raw.circle_marker_4_72;
                                break;
                            case 5:
                                i3 = R.raw.circle_marker_4_96;
                                break;
                            case 6:
                                i3 = R.raw.circle_marker_4_146;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case 5:
                        switch (a.$EnumSwitchMapping$1[vkTooltip$MarkerSize.ordinal()]) {
                            case 1:
                                i3 = R.raw.circle_marker_5_48;
                                break;
                            case 2:
                                i3 = R.raw.circle_marker_5_56;
                                break;
                            case 3:
                                i3 = R.raw.circle_marker_5_64;
                                break;
                            case 4:
                                i3 = R.raw.circle_marker_5_72;
                                break;
                            case 5:
                                i3 = R.raw.circle_marker_5_96;
                                break;
                            case 6:
                                i3 = R.raw.circle_marker_5_146;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case 6:
                        switch (a.$EnumSwitchMapping$1[vkTooltip$MarkerSize.ordinal()]) {
                            case 1:
                                i3 = R.raw.circle_marker_6_48;
                                break;
                            case 2:
                                i3 = R.raw.circle_marker_6_56;
                                break;
                            case 3:
                                i3 = R.raw.circle_marker_6_64;
                                break;
                            case 4:
                                i3 = R.raw.circle_marker_6_72;
                                break;
                            case 5:
                                i3 = R.raw.circle_marker_6_96;
                                break;
                            case 6:
                                i3 = R.raw.circle_marker_6_146;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                x7 = Integer.valueOf(i3);
                M.R(x7);
            }
            final t700 c = guf0.c(new u700.e(((Number) x7).intValue()), M, 6);
            ColorFilter colorFilter = t800.I;
            long a2 = j0t.a(vkOnboarding$TintColor, M, (i4 >> 15) & 14);
            int i6 = l5g.l;
            final l800 x8 = qxm0.x(new n800[]{qxm0.y(colorFilter, pe7.a(Long.hashCode(a2), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M);
            final s600 k = emi.k((i700) c.getValue(), false, false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 0, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            Object x9 = M.x();
            if (x9 == obj4) {
                x9 = ir.h(M);
            }
            final sg50 sg50Var = (sg50) x9;
            Object x10 = M.x();
            if (x10 == obj4) {
                x10 = j0t.c(vkTooltip$MarkerStyle, vkTooltip$MarkerSize);
                M.R(x10);
            }
            final Pair pair = (Pair) x10;
            Object x11 = M.x();
            if (x11 == obj4) {
                x11 = androidx.compose.runtime.k.b(b(vkTooltip$BalloonPosition, pair, vkTooltip$BalloonTilt));
                M.R(x11);
            }
            wh50 wh50Var3 = (wh50) x11;
            boolean z4 = ((i4 & 3670016) == 1048576) | ((29360128 & i4) == 8388608);
            Object x12 = M.x();
            if (z4 || x12 == obj4) {
                wh50Var = wh50Var3;
                i2 = i5;
                obj = obj4;
                z = false;
                vkTooltip$BalloonPosition2 = vkTooltip$BalloonPosition;
                y8v0Var = new y8v0(vkTooltip$BalloonPosition2, pair, vkTooltip$BalloonTilt, wh50Var, null);
                M.R(y8v0Var);
            } else {
                obj = obj4;
                z = false;
                vkTooltip$BalloonPosition2 = vkTooltip$BalloonPosition;
                y8v0Var = x12;
                i2 = i5;
                wh50Var = wh50Var3;
            }
            bap.g(vkTooltip$BalloonPosition2, (wzs) y8v0Var, M, (i4 >> 18) & 14);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, z);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630.a.a;
            q630 c2 = qri.c(M, q630Var2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            k9q0.t(M, cri.a.h);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            final g6j g6jVar = (g6j) wh50Var.getValue();
            q630 B = txj0.B(q630Var2, null, 3);
            int i7 = i2 & 7168;
            boolean z5 = (i7 == 2048) | ((i4 & 14) == 4);
            Object x13 = M.x();
            if (z5) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (x13 != obj2) {
                    q630Var3 = B;
                    q630 d2 = ojc.d(q630Var3, sg50Var, null, false, null, null, (gzs) x13, IronSourceError.ERROR_CODE_INIT_FAILED);
                    x = M.x();
                    if (x == obj2) {
                        x = new iiu0(2);
                        M.R(x);
                    }
                    q630 b = egi0.b(d2, false, (izs) x);
                    M.K(-1998673515);
                    x2 = M.x();
                    if (x2 == obj2) {
                        x2 = androidx.compose.runtime.j.a(0L);
                        M.R(x2);
                    }
                    ah50 ah50Var = (ah50) x2;
                    x3 = M.x();
                    if (x3 == obj2) {
                        x3 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                        M.R(x3);
                    }
                    wh50Var2 = (wh50) x3;
                    azl azlVar = (azl) M.r(uvi.h);
                    x4 = M.x();
                    if (x4 == obj2) {
                        x4 = new op10(azlVar);
                        M.R(x4);
                    }
                    op10Var = (op10) x4;
                    y = M.y(op10Var) | M.J(g6jVar) | M.o(257);
                    x5 = M.x();
                    if (!y || x5 == obj2) {
                        x5 = new cp10() { // from class: com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip_mSLTCI4$lambda$24$$inlined$ConstraintLayout$4
                            @Override // xsna.cp10
                            public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                wh50.this.getValue();
                                long f2 = op10Var.f(j, ep10Var.getLayoutDirection(), g6jVar, list, linkedHashMap);
                                final op10 op10Var2 = op10Var;
                                return ep10Var.Q((int) (f2 >> 32), (int) (f2 & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip_mSLTCI4$lambda$24$$inlined$ConstraintLayout$4.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // xsna.izs
                                    public final s3q0 invoke(tra0.a aVar4) {
                                        op10.this.e(aVar4, list, linkedHashMap);
                                        return s3q0.a;
                                    }
                                });
                            }
                        };
                        M.R(x5);
                    }
                    cp10 cp10Var = (cp10) x5;
                    if (g6jVar instanceof a2p) {
                        ((a2p) g6jVar).a = ah50Var;
                    }
                    goyVar = !(g6jVar instanceof goy) ? (goy) g6jVar : null;
                    op10Var.a = goyVar;
                    if (goyVar != null) {
                        goyVar.a();
                    }
                    if (Float.isNaN(op10Var.i)) {
                        M.K(-1997256040);
                        float f2 = op10Var.i;
                        q630 o = l2l0.o(b, f2, f2);
                        cp10 d3 = ja8.d(ty6Var, false);
                        int m = n34.m(M);
                        sy90 D2 = M.D();
                        q630 c3 = qri.c(M, q630Var2);
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
                        k9q0.w(M, d3, cVar);
                        k9q0.w(M, D2, eVar);
                        if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                            kr.a(m, M, m, bVar);
                        }
                        k9q0.w(M, c3, dVar);
                        boolean y2 = M.y(op10Var);
                        Object x14 = M.x();
                        if (y2 || x14 == obj2) {
                            x14 = new izs<tgi0, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip_mSLTCI4$lambda$24$$inlined$ConstraintLayout$5
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final s3q0 invoke(tgi0 tgi0Var) {
                                    e4p0.a(tgi0Var, op10.this);
                                    return s3q0.a;
                                }
                            };
                            M.R(x14);
                        }
                        q630 b2 = egi0.b(o, false, (izs) x14);
                        obj3 = obj2;
                        aVar2 = M;
                        joy.a(b2, kai.c(1131308473, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip_mSLTCI4$lambda$24$$inlined$ConstraintLayout$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // xsna.wzs
                            public final s3q0 invoke(a aVar4, Integer num) {
                                gzs gzsVar6;
                                a aVar5 = aVar4;
                                int intValue = num.intValue();
                                if ((intValue & 3) == 2 && aVar5.e()) {
                                    aVar5.h();
                                } else {
                                    if (b.d()) {
                                        b.f(1131308473, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous>.<anonymous> (ConstraintLayout.kt:841)");
                                    }
                                    aVar5.K(-54974232);
                                    String str2 = str;
                                    VkTooltip$BalloonPosition vkTooltip$BalloonPosition3 = vkTooltip$BalloonPosition;
                                    VkTooltip$BalloonTilt vkTooltip$BalloonTilt2 = vkTooltip$BalloonTilt;
                                    c700 c700Var = k;
                                    gzs gzsVar7 = gzsVar5;
                                    float f3 = f;
                                    q630.a aVar6 = q630.a.a;
                                    q630 u = vua0.u(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, aVar6), "balloon");
                                    gzs gzsVar8 = gzsVar4;
                                    Object obj5 = a.C0011a.a;
                                    gzs gzsVar9 = null;
                                    if (gzsVar8 == null) {
                                        aVar5.K(-54249144);
                                        aVar5.j();
                                        gzsVar6 = null;
                                    } else {
                                        aVar5.K(-54249143);
                                        gzs gzsVar10 = gzsVar4;
                                        boolean J = aVar5.J(gzsVar10);
                                        Object x15 = aVar5.x();
                                        if (J || x15 == obj5) {
                                            x15 = new z8v0(gzsVar10);
                                            aVar5.R(x15);
                                        }
                                        aVar5.j();
                                        gzsVar6 = (gzs) x15;
                                    }
                                    sg50 sg50Var2 = sg50Var;
                                    boolean J2 = aVar5.J(vkOnboardingStat$Delegate) | aVar5.J(gzsVar2);
                                    Object x16 = aVar5.x();
                                    if (J2 || x16 == obj5) {
                                        x16 = new a9v0(vkOnboardingStat$Delegate, gzsVar2);
                                        aVar5.R(x16);
                                    }
                                    q630 d4 = ojc.d(u, sg50Var2, null, false, null, gzsVar6, (gzs) x16, 444);
                                    Object x17 = aVar5.x();
                                    if (x17 == obj5) {
                                        x17 = b9v0.b;
                                        aVar5.R(x17);
                                    }
                                    w8v0.a(str2, vkTooltip$BalloonPosition3, vkTooltip$BalloonTilt2, c700Var, gzsVar7, egi0.b(d4, false, (izs) x17), aVar5, 0);
                                    aVar5.K(1522278843);
                                    if (Build.VERSION.SDK_INT <= 28) {
                                        Object x18 = aVar5.x();
                                        if (x18 == obj5) {
                                            x18 = c9v0.b;
                                            aVar5.R(x18);
                                        }
                                        rdu.a(aVar6, (izs) x18);
                                    }
                                    aVar5.j();
                                    q630 h = txj0.h(txj0.v(vua0.u(aVar6, "anchor"), ((pco) pair.i()).b), ((pco) pair.j()).b);
                                    if (gzsVar3 == null) {
                                        aVar5.K(-53250200);
                                    } else {
                                        aVar5.K(-53250199);
                                        gzs gzsVar11 = gzsVar3;
                                        boolean J3 = aVar5.J(gzsVar11);
                                        Object x19 = aVar5.x();
                                        if (J3 || x19 == obj5) {
                                            x19 = new d9v0(gzsVar11);
                                            aVar5.R(x19);
                                        }
                                        gzsVar9 = (gzs) x19;
                                    }
                                    aVar5.j();
                                    gzs gzsVar12 = gzsVar9;
                                    sg50 sg50Var3 = sg50Var;
                                    boolean J4 = aVar5.J(vkOnboardingStat$Delegate) | aVar5.J(gzsVar);
                                    Object x20 = aVar5.x();
                                    if (J4 || x20 == obj5) {
                                        x20 = new e9v0(vkOnboardingStat$Delegate, gzsVar);
                                        aVar5.R(x20);
                                    }
                                    q630 d5 = ojc.d(h, sg50Var3, null, false, null, gzsVar12, (gzs) x20, 444);
                                    boolean J5 = aVar5.J(str);
                                    Object x21 = aVar5.x();
                                    if (J5 || x21 == obj5) {
                                        x21 = new mqh(str);
                                        aVar5.R(x21);
                                    }
                                    z600.b(c.getValue(), egi0.b(d5, false, (izs) x21), false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, false, false, false, false, null, false, false, x8, null, wkj.a.e, false, false, null, false, null, aVar5, 0, 1605632, 0, 4112380);
                                    aVar5.j();
                                    if (b.d()) {
                                        b.e();
                                    }
                                }
                                return s3q0.a;
                            }
                        }, aVar2), cp10Var, aVar2, 48, 0);
                        aVar2.G();
                        aVar2.j();
                        vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
                        z2 = false;
                    } else {
                        obj3 = obj2;
                        aVar2 = M;
                        aVar2.K(-1996827620);
                        boolean y3 = aVar2.y(op10Var);
                        Object x15 = aVar2.x();
                        if (y3 || x15 == obj3) {
                            x15 = new izs<tgi0, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip_mSLTCI4$lambda$24$$inlined$ConstraintLayout$7
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final s3q0 invoke(tgi0 tgi0Var) {
                                    e4p0.a(tgi0Var, op10.this);
                                    return s3q0.a;
                                }
                            };
                            aVar2.R(x15);
                        }
                        z2 = false;
                        vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
                        joy.a(egi0.b(b, false, (izs) x15), kai.c(-207512644, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip_mSLTCI4$lambda$24$$inlined$ConstraintLayout$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // xsna.wzs
                            public final s3q0 invoke(a aVar4, Integer num) {
                                gzs gzsVar6;
                                a aVar5 = aVar4;
                                int intValue = num.intValue();
                                if ((intValue & 3) == 2 && aVar5.e()) {
                                    aVar5.h();
                                } else {
                                    if (b.d()) {
                                        b.f(-207512644, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:853)");
                                    }
                                    wh50.this.setValue(s3q0.a);
                                    aVar5.K(-54974232);
                                    String str2 = str;
                                    VkTooltip$BalloonPosition vkTooltip$BalloonPosition3 = vkTooltip$BalloonPosition;
                                    VkTooltip$BalloonTilt vkTooltip$BalloonTilt2 = vkTooltip$BalloonTilt;
                                    c700 c700Var = k;
                                    gzs gzsVar7 = gzsVar5;
                                    float f3 = f;
                                    q630.a aVar6 = q630.a.a;
                                    q630 u = vua0.u(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, aVar6), "balloon");
                                    gzs gzsVar8 = gzsVar4;
                                    Object obj5 = a.C0011a.a;
                                    gzs gzsVar9 = null;
                                    if (gzsVar8 == null) {
                                        aVar5.K(-54249144);
                                        aVar5.j();
                                        gzsVar6 = null;
                                    } else {
                                        aVar5.K(-54249143);
                                        gzs gzsVar10 = gzsVar4;
                                        boolean J = aVar5.J(gzsVar10);
                                        Object x16 = aVar5.x();
                                        if (J || x16 == obj5) {
                                            x16 = new z8v0(gzsVar10);
                                            aVar5.R(x16);
                                        }
                                        aVar5.j();
                                        gzsVar6 = (gzs) x16;
                                    }
                                    sg50 sg50Var2 = sg50Var;
                                    boolean J2 = aVar5.J(vkOnboardingStat$Delegate) | aVar5.J(gzsVar2);
                                    Object x17 = aVar5.x();
                                    if (J2 || x17 == obj5) {
                                        x17 = new a9v0(vkOnboardingStat$Delegate, gzsVar2);
                                        aVar5.R(x17);
                                    }
                                    q630 d4 = ojc.d(u, sg50Var2, null, false, null, gzsVar6, (gzs) x17, 444);
                                    Object x18 = aVar5.x();
                                    if (x18 == obj5) {
                                        x18 = b9v0.b;
                                        aVar5.R(x18);
                                    }
                                    w8v0.a(str2, vkTooltip$BalloonPosition3, vkTooltip$BalloonTilt2, c700Var, gzsVar7, egi0.b(d4, false, (izs) x18), aVar5, 0);
                                    aVar5.K(1522278843);
                                    if (Build.VERSION.SDK_INT <= 28) {
                                        Object x19 = aVar5.x();
                                        if (x19 == obj5) {
                                            x19 = c9v0.b;
                                            aVar5.R(x19);
                                        }
                                        rdu.a(aVar6, (izs) x19);
                                    }
                                    aVar5.j();
                                    q630 h = txj0.h(txj0.v(vua0.u(aVar6, "anchor"), ((pco) pair.i()).b), ((pco) pair.j()).b);
                                    if (gzsVar3 == null) {
                                        aVar5.K(-53250200);
                                    } else {
                                        aVar5.K(-53250199);
                                        gzs gzsVar11 = gzsVar3;
                                        boolean J3 = aVar5.J(gzsVar11);
                                        Object x20 = aVar5.x();
                                        if (J3 || x20 == obj5) {
                                            x20 = new d9v0(gzsVar11);
                                            aVar5.R(x20);
                                        }
                                        gzsVar9 = (gzs) x20;
                                    }
                                    aVar5.j();
                                    gzs gzsVar12 = gzsVar9;
                                    sg50 sg50Var3 = sg50Var;
                                    boolean J4 = aVar5.J(vkOnboardingStat$Delegate) | aVar5.J(gzsVar);
                                    Object x21 = aVar5.x();
                                    if (J4 || x21 == obj5) {
                                        x21 = new e9v0(vkOnboardingStat$Delegate, gzsVar);
                                        aVar5.R(x21);
                                    }
                                    q630 d5 = ojc.d(h, sg50Var3, null, false, null, gzsVar12, (gzs) x21, 444);
                                    boolean J5 = aVar5.J(str);
                                    Object x22 = aVar5.x();
                                    if (J5 || x22 == obj5) {
                                        x22 = new mqh(str);
                                        aVar5.R(x22);
                                    }
                                    z600.b(c.getValue(), egi0.b(d5, false, (izs) x22), false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, false, false, false, false, null, false, false, x8, null, wkj.a.e, false, false, null, false, null, aVar5, 0, 1605632, 0, 4112380);
                                    aVar5.j();
                                    if (b.d()) {
                                        b.e();
                                    }
                                }
                                return s3q0.a;
                            }
                        }, aVar2), cp10Var, aVar2, 48, 0);
                        aVar2.j();
                    }
                    aVar2.j();
                    s3q0 s3q0Var = s3q0.a;
                    z3 = i7 != 2048 ? z2 : true;
                    x6 = aVar2.x();
                    if (!z3 || x6 == obj3) {
                        x6 = new f9v0(vkOnboardingStat$Delegate2, null);
                        aVar2.R(x6);
                    }
                    bap.g(s3q0Var, (wzs) x6, aVar2, 6);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            q630Var3 = B;
            x13 = new vq6(28, vkOnboardingStat$Delegate2, etv0Var);
            M.R(x13);
            q630 d22 = ojc.d(q630Var3, sg50Var, null, false, null, null, (gzs) x13, IronSourceError.ERROR_CODE_INIT_FAILED);
            x = M.x();
            if (x == obj2) {
            }
            q630 b3 = egi0.b(d22, false, (izs) x);
            M.K(-1998673515);
            x2 = M.x();
            if (x2 == obj2) {
            }
            ah50 ah50Var2 = (ah50) x2;
            x3 = M.x();
            if (x3 == obj2) {
            }
            wh50Var2 = (wh50) x3;
            azl azlVar2 = (azl) M.r(uvi.h);
            x4 = M.x();
            if (x4 == obj2) {
            }
            op10Var = (op10) x4;
            y = M.y(op10Var) | M.J(g6jVar) | M.o(257);
            x5 = M.x();
            if (!y) {
            }
            x5 = new cp10() { // from class: com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip_mSLTCI4$lambda$24$$inlined$ConstraintLayout$4
                @Override // xsna.cp10
                public final dp10 b(ep10 ep10Var, final List list, long j) {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    wh50.this.getValue();
                    long f22 = op10Var.f(j, ep10Var.getLayoutDirection(), g6jVar, list, linkedHashMap);
                    final op10 op10Var2 = op10Var;
                    return ep10Var.Q((int) (f22 >> 32), (int) (f22 & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipKt$VkOnboardingTooltip_mSLTCI4$lambda$24$$inlined$ConstraintLayout$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public final s3q0 invoke(tra0.a aVar4) {
                            op10.this.e(aVar4, list, linkedHashMap);
                            return s3q0.a;
                        }
                    });
                }
            };
            M.R(x5);
            cp10 cp10Var2 = (cp10) x5;
            if (g6jVar instanceof a2p) {
            }
            if (!(g6jVar instanceof goy)) {
            }
            op10Var.a = goyVar;
            if (goyVar != null) {
            }
            if (Float.isNaN(op10Var.i)) {
            }
            aVar2.j();
            s3q0 s3q0Var2 = s3q0.a;
            if (i7 != 2048) {
            }
            x6 = aVar2.x();
            if (!z3) {
            }
            x6 = new f9v0(vkOnboardingStat$Delegate2, null);
            aVar2.R(x6);
            bap.g(s3q0Var2, (wzs) x6, aVar2, 6);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, q630Var2, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, vkOnboarding$TintColor, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, gzsVar, gzsVar2, gzsVar3, gzsVar4, gzsVar5, vkOnboardingStat$Delegate2, f, i) { // from class: xsna.x8v0
                public final /* synthetic */ String c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ VkTooltip$MarkerStyle e;
                public final /* synthetic */ VkTooltip$MarkerSize f;
                public final /* synthetic */ VkOnboarding$TintColor g;
                public final /* synthetic */ VkTooltip$BalloonPosition h;
                public final /* synthetic */ VkTooltip$BalloonTilt i;
                public final /* synthetic */ gzs j;
                public final /* synthetic */ gzs k;
                public final /* synthetic */ gzs l;
                public final /* synthetic */ gzs m;
                public final /* synthetic */ gzs n;
                public final /* synthetic */ VkOnboardingStat$Delegate o;
                public final /* synthetic */ float p;

                @Override // xsna.wzs
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int I = ne7.I(1);
                    g9v0.a(etv0.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (androidx.compose.runtime.a) obj5, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final dno b(VkTooltip$BalloonPosition vkTooltip$BalloonPosition, Pair pair, VkTooltip$BalloonTilt vkTooltip$BalloonTilt) {
        switch (a.$EnumSwitchMapping$0[vkTooltip$BalloonPosition.ordinal()]) {
            case 1:
                return new dno(new kvm0(pair, 15));
            case 2:
                return new dno(new mdk0(pair, 20));
            case 3:
                return new dno(new lx60(19, pair, vkTooltip$BalloonTilt));
            case 4:
                return new dno(new q4x0(1, pair, vkTooltip$BalloonTilt));
            case 5:
                return new dno(new jp5(27, pair, vkTooltip$BalloonTilt));
            case 6:
                return new dno(new wze0(8, pair, vkTooltip$BalloonTilt));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
