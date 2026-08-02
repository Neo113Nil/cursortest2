package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.internal.dto.DivKitTickerCustomPropsDto;
import com.ybsdk.feature.divkit.internal.dto.DivKitTickerCustomPropsDtoJsonAdapter;
import com.ybsdk.feature.divkit.internal.ui.MainDashboardTickerView;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gmk implements qr51 {
    public final YbDivKitCustomBlockTypes a = YbDivKitCustomBlockTypes.TICKER_BLOCK_TYPE;
    public final DivKitTickerCustomPropsDtoJsonAdapter b = new DivKitTickerCustomPropsDtoJsonAdapter(new Moshi.Builder().build());
    public final SharedPreferences c;

    public gmk(Context context) {
        this.c = context.getSharedPreferences("divkit_shared_preferences", 0);
    }

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        return new MainDashboardTickerView(div2View.getContext(), null, 0, l1i0.Widget_YB_Text_Caption2_Medium, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @Override // defpackage.qr51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
        DivKitTickerCustomPropsDto fromJson;
        ColorModel colorModel;
        String id;
        String text;
        boolean z;
        lrp0 lrp0Var = lrp0.v;
        if (!(view instanceof MainDashboardTickerView)) {
            return;
        }
        JSONObject jSONObject = clkVar.i;
        if (jSONObject != null) {
            try {
                fromJson = this.b.fromJson(jSONObject.toString());
            } catch (Exception e) {
                x4c.g("Failed to parse DivKit customProps in \"custom_type\"", e, YbDivKitCustomBlockTypes.SWITCH_BLOCK_TYPE, null, 8);
            }
            if (fromJson == null) {
                Themes<String> textColor = fromJson.getTextColor();
                String light = textColor != null ? textColor.getLight() : null;
                Themes<String> textColor2 = fromJson.getTextColor();
                colorModel = lvy0.e(light, textColor2 != null ? textColor2.getDark() : null);
            } else {
                colorModel = null;
            }
            id = fromJson == null ? fromJson.getId() : null;
            text = fromJson == null ? fromJson.getText() : null;
            if (colorModel != null) {
                ((MainDashboardTickerView) view).setTextColor(colorModel);
            }
            SharedPreferences sharedPreferences = this.c;
            if (id == null) {
                z = vgb1.d(sharedPreferences.getLong("main_dashboard_balance_animation_timestamp_".concat(id), -1L));
            } else {
                x4c.h("Try to show animation without screen id", new srp0[]{lrp0Var}, null, 12);
                z = false;
            }
            if (z) {
                ((MainDashboardTickerView) view).setAnimationEnabled(false);
            } else {
                ((MainDashboardTickerView) view).setAnimationEnabled(true);
                if (id != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong("main_dashboard_balance_animation_timestamp_".concat(id), currentTimeMillis);
                    edit.apply();
                } else {
                    x4c.h("Try to set animation show timestamp without screen id", new srp0[]{lrp0Var}, null, 12);
                }
            }
            if (text == null) {
                ((MainDashboardTickerView) view).setText(text);
                return;
            }
            return;
        }
        fromJson = null;
        if (fromJson == null) {
        }
        if (fromJson == null) {
        }
        if (fromJson == null) {
        }
        if (colorModel != null) {
        }
        SharedPreferences sharedPreferences2 = this.c;
        if (id == null) {
        }
        if (z) {
        }
        if (text == null) {
        }
    }

    @Override // defpackage.qr51
    public final YbDivKitCustomBlockTypes getCustomType() {
        return this.a;
    }

    @Override // defpackage.qr51
    public final boolean isCustomTypeSupported(String str) {
        return xz91.b(this, str);
    }

    @Override // defpackage.qr51
    public final void release() {
    }
}
