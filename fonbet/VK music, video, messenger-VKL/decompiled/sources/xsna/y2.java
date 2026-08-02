package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.ironsource.X3;
import com.vk.ads.yandex.impl.YandexAdFeatureImpl;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.onboardingscreens.impl.georequest.presentation.fragment.GeoRequestFragment;
import com.vk.utils.vectordrawable.EnhancedAnimatedVectorDrawable;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a3.b((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((d71) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                cfm cfmVar = (cfm) obj3;
                Context context = cfmVar.f;
                ?? r2 = cfmVar.J;
                if (r2.isInitialized()) {
                    com.vk.utils.vectordrawable.a.b((EnhancedAnimatedVectorDrawable) r2.getValue(), "path_1", e3m.f(R.attr.vk_ui_icon_accent_themed, context));
                    com.vk.utils.vectordrawable.a.b((EnhancedAnimatedVectorDrawable) r2.getValue(), "path_2", e3m.f(R.attr.vk_ui_accent_green, context));
                }
                return s3q0.a;
            case 3:
                GeoRequestFragment geoRequestFragment = (GeoRequestFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = GeoRequestFragment.O;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1784348556, intValue, -1, "com.vk.onboardingscreens.impl.georequest.presentation.fragment.GeoRequestFragment.onCreateView.<anonymous> (GeoRequestFragment.kt:37)");
                    }
                    boolean y = aVar.y(geoRequestFragment);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new nfj(geoRequestFragment, 23);
                        aVar.R(x);
                    }
                    zmt.a((izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                hh80 hh80Var = (hh80) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1632700500, intValue2, -1, "com.vk.onboardingpromo.impl.ui.view.Slides.<anonymous>.<anonymous> (OnboardingPromoDefaultSlides.kt:294)");
                    }
                    lg90 a = pg90.a(hh80Var.e ? R.drawable.vk_icon_mute_cross_16 : R.drawable.vk_icon_volume_16, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a, null, null, ylu0Var.getIcon().c, aVar2, 56, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-354891156, intValue3, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.SmartCropScreen.<anonymous> (SmartCropScreen.kt:55)");
                    }
                    i5k0.e(0, aVar3, izsVar, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 6:
                xan0 xan0Var = (xan0) obj3;
                long longValue = ((Long) obj2).longValue();
                for (JSONObject jSONObject : (List) obj) {
                    try {
                        xan0Var.a(longValue, jSONObject);
                    } catch (InterruptedException e) {
                        throw e;
                    } catch (Throwable th) {
                        Objects.toString(jSONObject);
                        com.vk.metrics.eventtracking.b.a.a(th);
                    }
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((bdn0) obj3).m6(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.b((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj).getClass();
                return ((knq0) obj3).b.j((String) obj2);
            case 10:
                gcs0 gcs0Var = (gcs0) obj3;
                pak pakVar = (pak) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i3 = pakVar.e;
                UserId userId = pakVar.f;
                String str = pakVar.g;
                Integer num = pakVar.b;
                if (num != null) {
                    intValue4 = num.intValue();
                }
                return new owt(i3, userId, str, Integer.valueOf(intValue4), pakVar.c, 0, null, null, gcs0Var.H, 992);
            case 11:
                Alert$Button alert$Button = (Alert$Button) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1948931884, intValue5, -1, "com.vk.core.compose.component.VkAlertNew.<anonymous> (VkAlertNew.kt:83)");
                    }
                    t7u0.a(alert$Button, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                int intValue6 = ((Integer) obj).intValue();
                String str2 = (String) obj2;
                ((YandexAdFeatureImpl) obj3).e = YandexAdFeatureImpl.InitializationState.NOT_INITIALIZED;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"YandexAdFeatureImpl", com.vk.movika.sdk.base.model.history.b.b(intValue6, X3.j.d, "]: ", str2)});
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ y2(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ y2(zan0 zan0Var, xan0 xan0Var) {
        this.b = 6;
        this.c = xan0Var;
    }
}
