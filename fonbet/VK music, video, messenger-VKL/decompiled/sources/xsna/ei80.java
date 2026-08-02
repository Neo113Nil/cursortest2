package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import java.util.Map;
import kotlin.Pair;
import xsna.dt1;
import xsna.q630;

/* compiled from: OnboardingTooltipScreenContent.kt */
/* loaded from: classes18.dex */
public final class ei80 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(wh50 wh50Var, Map map, String str, androidx.compose.runtime.a aVar, int i) {
        wh50 wh50Var2;
        Map map2;
        androidx.compose.runtime.a M = aVar.M(-457464579);
        if (M.t(i & 1, (i & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-457464579, i, -1, "com.vk.design.demo.presentation.screens.BuildButtonWithContextMenu (OnboardingTooltipScreenContent.kt:266)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var3 = (wh50) x;
            dt1.a.getClass();
            gcv gcvVar = new gcv(dt1.a.o);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new rf20(wh50Var3, 8);
                M.R(x2);
            }
            mpj0.a(390, 0, M, str, (gzs) x2, gcvVar);
            ty6 ty6Var = dt1.a.f;
            boolean booleanValue = ((Boolean) wh50Var3.getValue()).booleanValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new di80(0, wh50Var3);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                wh50Var2 = wh50Var;
                map2 = map;
                x4 = new z14(map2, wh50Var2, wh50Var3, 7);
                M.R(x4);
            } else {
                wh50Var2 = wh50Var;
                map2 = map;
            }
            aou0.g(booleanValue, gzsVar, q630.a.a, ty6Var, 0L, null, null, (izs) x4, M, X2.b.f, PsExtractor.VIDEO_STREAM_MASK);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            wh50Var2 = wh50Var;
            map2 = map;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tnc(i, 6, wh50Var2, map2, str);
        }
    }

    public static final void b(wh50 wh50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(463064637);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(463064637, i, -1, "com.vk.design.demo.presentation.screens.SelectMarkerColor (OnboardingTooltipScreenContent.kt:242)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                bpw bpwVar = new bpw(pn00.k(new Pair(VkOnboarding$TintColor.Lime, "Lime"), new Pair(VkOnboarding$TintColor.Cyan, "Cyan"), new Pair(VkOnboarding$TintColor.Pink, "Pink"), new Pair(VkOnboarding$TintColor.Azure, "Azure")));
                M.R(bpwVar);
                x = bpwVar;
            }
            a(wh50Var, ((bpw) x).b, "Select marker color", M, 3510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new om9(wh50Var, i, 8);
        }
    }

    public static final void c(wh50 wh50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(33027767);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(33027767, i, -1, "com.vk.design.demo.presentation.screens.SelectMarkerSize (OnboardingTooltipScreenContent.kt:218)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                bpw bpwVar = new bpw(pn00.k(new Pair(VkTooltip$MarkerSize.Size48, "Size 48"), new Pair(VkTooltip$MarkerSize.Size56, "Size 56"), new Pair(VkTooltip$MarkerSize.Size64, "Size 64"), new Pair(VkTooltip$MarkerSize.Size72, "Size 72"), new Pair(VkTooltip$MarkerSize.Size96, "Size 96"), new Pair(VkTooltip$MarkerSize.Size146, "Size 146")));
                M.R(bpwVar);
                x = bpwVar;
            }
            a(wh50Var, ((bpw) x).b, "Select marker size", M, 3510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.m(wh50Var, i, 8);
        }
    }

    public static final void d(wh50 wh50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(659671215);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(659671215, i, -1, "com.vk.design.demo.presentation.screens.SelectMarkerStyle (OnboardingTooltipScreenContent.kt:194)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                bpw bpwVar = new bpw(pn00.k(new Pair(VkTooltip$MarkerStyle.Style1, "Style 1"), new Pair(VkTooltip$MarkerStyle.Style2, "Style 2"), new Pair(VkTooltip$MarkerStyle.Style3, "Style 3"), new Pair(VkTooltip$MarkerStyle.Style4, "Style 4"), new Pair(VkTooltip$MarkerStyle.Style5, "Style 5"), new Pair(VkTooltip$MarkerStyle.Style6, "Style 6")));
                M.R(bpwVar);
                x = bpwVar;
            }
            a(wh50Var, ((bpw) x).b, "Select marker style", M, 3510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.l(wh50Var, i, 9);
        }
    }
}
