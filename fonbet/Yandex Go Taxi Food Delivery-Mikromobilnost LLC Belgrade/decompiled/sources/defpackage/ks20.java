package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner.MobileAdsNativeBannerView;
import com.yandex.go.flex.main_screen.presentation.divkit.azimuth.SuperappAzimuthRotatableIconView;
import com.yandex.go.flex.main_screen.presentation.divkit.azimuth.e;
import com.yandex.go.flex.main_screen.presentation.divkit.custom_view.MainScreenDivCustomViewTypes;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class ks20 implements plk {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ ks20(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        JSONObject jSONObject;
        String J;
        String J2;
        d9w0 d9w0Var;
        gs20 gs20Var = null;
        gs20Var = null;
        switch (this.b) {
            case 0:
                if ((view instanceof MobileAdsNativeBannerView) && (jSONObject = clkVar.i) != null) {
                    String J3 = cvw.J("ad_unit_id", jSONObject);
                    if (J3 == null || evu0.J(J3)) {
                        J3 = null;
                    }
                    if (J3 != null) {
                        String J4 = cvw.J("banner_id", jSONObject);
                        if (J4 == null || evu0.J(J4)) {
                            J4 = null;
                        }
                        String J5 = cvw.J("ready_response", jSONObject);
                        if (J5 == null || evu0.J(J5)) {
                            J5 = null;
                        }
                        if (J5 != null) {
                            gs20Var = new gs20(J3, jSONObject.optJSONObject("native_div_card"), J4, J5);
                        }
                    }
                    if (gs20Var != null) {
                        String str = gs20Var.b;
                        if (str != null) {
                            ((ums0) this.c).a.add(str);
                        }
                        ((MobileAdsNativeBannerView) view).loadAd(gs20Var);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject2 = clkVar.i;
                if (jSONObject2 == null || (J = cvw.J("background_image_tag", jSONObject2)) == null || (J2 = cvw.J("rotatable_image_tag", jSONObject2)) == null) {
                    d9w0Var = null;
                } else {
                    d9w0Var = new d9w0(cvw.J("button_id", jSONObject2), J, J2, (float) jSONObject2.optDouble("rotation_compensation", 0.0d), cvw.J("animation_url_light", jSONObject2), cvw.J("animation_url_dark", jSONObject2), jSONObject2.has("animation_repeat") ? Integer.valueOf(jSONObject2.optInt("animation_repeat")) : null, jSONObject2.optBoolean("animation_remove_after_playing", false));
                }
                if (d9w0Var != null) {
                    SuperappAzimuthRotatableIconView superappAzimuthRotatableIconView = view instanceof SuperappAzimuthRotatableIconView ? (SuperappAzimuthRotatableIconView) view : null;
                    if (superappAzimuthRotatableIconView != null) {
                        superappAzimuthRotatableIconView.bind(d9w0Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                return new MobileAdsNativeBannerView(div2View.getContext(), null, 0, 0, (exu0) obj3, (pwy0) obj2, (pdc) obj, 14, null);
            default:
                return new SuperappAzimuthRotatableIconView(div2View.getContext(), (e) this.c, (pav) obj3, (ytz) obj2, (yqq) obj);
        }
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        switch (this.b) {
            case 0:
                return jl40.l(str, "YXMobileAds-S2S-native-banner");
            default:
                return jl40.l(str, MainScreenDivCustomViewTypes.AZIMUTH_ROTATABLE_ICON.getType());
        }
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        switch (this.b) {
            case 0:
                if (view instanceof MobileAdsNativeBannerView) {
                    ((MobileAdsNativeBannerView) view).release();
                    break;
                }
                break;
            default:
                SuperappAzimuthRotatableIconView superappAzimuthRotatableIconView = view instanceof SuperappAzimuthRotatableIconView ? (SuperappAzimuthRotatableIconView) view : null;
                if (superappAzimuthRotatableIconView != null) {
                    superappAzimuthRotatableIconView.release();
                    break;
                }
                break;
        }
    }
}
