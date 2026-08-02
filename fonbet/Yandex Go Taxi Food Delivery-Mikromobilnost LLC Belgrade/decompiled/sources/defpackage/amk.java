package defpackage;

import android.view.View;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.internal.dto.DivKitSpoilerCustomPropsDto;
import com.ybsdk.feature.divkit.internal.dto.DivKitSpoilerCustomPropsDtoJsonAdapter;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class amk implements qr51 {
    public final DivKitSpoilerCustomPropsDtoJsonAdapter a = new DivKitSpoilerCustomPropsDtoJsonAdapter(new Moshi.Builder().build());
    public final YbDivKitCustomBlockTypes b = YbDivKitCustomBlockTypes.SPOILER_BLOCK_TYPE;

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        return new SpoilerFrameLayout(div2View.getContext(), null, 0, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // defpackage.qr51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
        DivKitSpoilerCustomPropsDto fromJson;
        DivKitSpoilerCustomPropsDto divKitSpoilerCustomPropsDto;
        if (view instanceof SpoilerFrameLayout) {
            JSONObject jSONObject = clkVar.i;
            ColorModel.Raw raw = null;
            if (jSONObject != null) {
                try {
                    fromJson = this.a.fromJson(String.valueOf(jSONObject));
                } catch (Exception e) {
                    x4c.g("Failed to parse DivKit customProps in \"custom_type\"", e, "spoiler_block", null, 8);
                }
                divKitSpoilerCustomPropsDto = fromJson;
                if (divKitSpoilerCustomPropsDto != null) {
                    Themes<String> particleColor = divKitSpoilerCustomPropsDto.getParticleColor();
                    String light = particleColor != null ? particleColor.getLight() : null;
                    Themes<String> particleColor2 = divKitSpoilerCustomPropsDto.getParticleColor();
                    ColorModel e2 = lvy0.e(light, particleColor2 != null ? particleColor2.getDark() : null);
                    if (e2 != null) {
                        raw = new ColorModel.Raw(e2.get(((SpoilerFrameLayout) view).getContext()));
                    }
                }
                ((SpoilerFrameLayout) view).updateSpoilerState(raw, true);
            }
            fromJson = null;
            divKitSpoilerCustomPropsDto = fromJson;
            if (divKitSpoilerCustomPropsDto != null) {
            }
            ((SpoilerFrameLayout) view).updateSpoilerState(raw, true);
        }
    }

    @Override // defpackage.qr51
    public final YbDivKitCustomBlockTypes getCustomType() {
        return this.b;
    }

    @Override // defpackage.qr51
    public final boolean isCustomTypeSupported(String str) {
        return xz91.b(this, str);
    }

    @Override // defpackage.qr51
    public final void release() {
    }
}
