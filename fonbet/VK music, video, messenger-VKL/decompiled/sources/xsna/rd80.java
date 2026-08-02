package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import java.util.Map;
import kotlin.Pair;
import xsna.dt1;
import xsna.q630;

/* compiled from: OnboardingHighlighterScreenContent.kt */
/* loaded from: classes18.dex */
public final class rd80 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(wh50 wh50Var, Map map, String str, androidx.compose.runtime.a aVar, int i) {
        wh50 wh50Var2;
        Map map2;
        androidx.compose.runtime.a M = aVar.M(634318171);
        if (M.t(i & 1, (i & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(634318171, i, -1, "com.vk.design.demo.presentation.screens.BuildButtonWithContextMenu (OnboardingHighlighterScreenContent.kt:237)");
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
                x2 = new meo(1, wh50Var3);
                M.R(x2);
            }
            mpj0.a(390, 0, M, str, (gzs) x2, gcvVar);
            ty6 ty6Var = dt1.a.f;
            boolean booleanValue = ((Boolean) wh50Var3.getValue()).booleanValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new neo(1, wh50Var3);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                wh50Var2 = wh50Var;
                map2 = map;
                x4 = new yf1(map2, wh50Var2, wh50Var3, 5);
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
            s.d = new fyl(i, 2, wh50Var2, map2, str);
        }
    }

    public static final void b(wh50 wh50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(49706651);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(49706651, i, -1, "com.vk.design.demo.presentation.screens.SelectMarkerColor (OnboardingHighlighterScreenContent.kt:213)");
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
            s.d = new com.vk.movika.tools.controls.seekbar.t(wh50Var, i, 9);
        }
    }

    public static final void c(wh50 wh50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(923482171);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(923482171, i, -1, "com.vk.design.demo.presentation.screens.SelectMarkerTyoe (OnboardingHighlighterScreenContent.kt:191)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                bpw bpwVar = new bpw(pn00.k(new Pair(VkOnboarding$HighlighterMarkerType.Type1, "Type 1"), new Pair(VkOnboarding$HighlighterMarkerType.Type2, "Type 2"), new Pair(VkOnboarding$HighlighterMarkerType.Type3, "Type 3"), new Pair(VkOnboarding$HighlighterMarkerType.Type4, "Type 4")));
                M.R(bpwVar);
                x = bpwVar;
            }
            a(wh50Var, ((bpw) x).b, "Select marker type", M, 3510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.u(wh50Var, i, 8);
        }
    }
}
