package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.view.onboarding.VkOnboardingBanner;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.random.Random;
import xsna.f7v0;
import xsna.g7v0;
import xsna.q630;

/* compiled from: OnboardingScreenContent.kt */
/* loaded from: classes18.dex */
public final class wh80 {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1262801415);
        int i2 = 0;
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1262801415, i, -1, "com.vk.design.demo.presentation.screens.ComposeBanners (OnboardingScreenContent.kt:60)");
            }
            g7v0.a.getClass();
            for (g7v0 g7v0Var : (List) g7v0.a.b.getValue()) {
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new vo50(6);
                    M.R(x);
                }
                yp8 a = f7v0.a.a("Button", (gzs) x, M, 1572918);
                Object[] array = VkOnboarding$TintColor.h().toArray(new VkOnboarding$TintColor[i2]);
                Random.Default r7 = Random.b;
                if (array.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                int length = array.length;
                r7.getClass();
                VkOnboarding$TintColor vkOnboarding$TintColor = (VkOnboarding$TintColor) array[Random.c.k(length)];
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new hy2(27);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new uh80(0);
                    M.R(x3);
                }
                o7v0.c("Place your <u>awesome</u> text description here", a, null, g7v0Var, null, vkOnboarding$TintColor, null, null, gzsVar, (gzs) x3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 905969670, 0, 7380);
                i2 = i2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bv4(i);
        }
    }

    public static final void b(final int i, final long j, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1468895544);
        int i2 = (M.p(j) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1468895544, i2, -1, "com.vk.design.demo.presentation.screens.StaticBanners (OnboardingScreenContent.kt:77)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new sk4(28);
                M.R(x);
            }
            yp8 a = f7v0.a.a("Добавить", (gzs) x, M, 1572918);
            VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Lime;
            l5g l5gVar = new l5g(j);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new o6(22);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new xs6(18);
                M.R(x3);
            }
            int i3 = 906166278 | ((i2 << 21) & 29360128);
            o7v0.c("Добавьте <u>аккаунт</u> VK", a, null, g7v0.f.b, null, vkOnboarding$TintColor, null, l5gVar, gzsVar, (gzs) x3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, i3, 0, 7252);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new d14(20);
                M.R(x4);
            }
            yp8 a2 = f7v0.a.a("Включить", (gzs) x4, M, 1572918);
            VkOnboarding$TintColor vkOnboarding$TintColor2 = VkOnboarding$TintColor.Cyan;
            l5g l5gVar2 = new l5g(j);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new d2(26);
                M.R(x5);
            }
            gzs gzsVar2 = (gzs) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new com.vk.movika.sdk.base.ui.v(28);
                M.R(x6);
            }
            aVar2 = M;
            o7v0.c("Подключите <u>уведомления</u>", a2, null, g7v0.b.b, null, vkOnboarding$TintColor2, null, l5gVar2, gzsVar2, (gzs) x6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, i3, 0, 7252);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(j, i) { // from class: xsna.vh80
                public final /* synthetic */ long b;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wh80.b(ne7.I(1), this.b, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final String str, final String str2, final g7v0 g7v0Var, final VkOnboarding$TintColor vkOnboarding$TintColor, final long j, final gzs gzsVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-558089495, 199734, -1, "com.vk.design.demo.presentation.screens.OnboardingBannerView (OnboardingScreenContent.kt:38)");
        }
        final Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, 7);
        boolean y = aVar.y(context) | aVar.y(g7v0Var) | aVar.p(j);
        Object x = aVar.x();
        if (y || x == a.C0011a.a) {
            Object obj = new izs() { // from class: xsna.th80
                @Override // xsna.izs
                public final Object invoke(Object obj2) {
                    VkOnboardingBanner vkOnboardingBanner = new VkOnboardingBanner(context, null, 6);
                    vkOnboardingBanner.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    vkOnboardingBanner.setTitle(str);
                    vkOnboardingBanner.setButtonText(str2);
                    vkOnboardingBanner.setGraffiti(g7v0Var);
                    vkOnboardingBanner.setColor(vkOnboarding$TintColor);
                    vkOnboardingBanner.m83setHighlightedTextColorY2TPw74(new l5g(j));
                    vkOnboardingBanner.setOnDismiss(gzsVar);
                    return vkOnboardingBanner;
                }
            };
            aVar.R(obj);
            x = obj;
        }
        ae2.a(0, 4, aVar, (izs) x, null, H);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }
}
