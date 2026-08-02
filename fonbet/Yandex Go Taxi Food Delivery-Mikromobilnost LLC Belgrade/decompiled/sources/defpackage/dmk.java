package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.feature.divkit.internal.dto.DivKitSwitchCustomPropsDto;
import com.ybsdk.feature.divkit.internal.dto.DivKitSwitchCustomPropsDtoJsonAdapter;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dmk implements qr51 {
    public final HashMap a = new HashMap();
    public final DivKitSwitchCustomPropsDtoJsonAdapter b = new DivKitSwitchCustomPropsDtoJsonAdapter(new Moshi.Builder().build());
    public final YbDivKitCustomBlockTypes c = YbDivKitCustomBlockTypes.SWITCH_BLOCK_TYPE;
    public boolean d;

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        String str = clkVar.p;
        if (str == null) {
            x4c.g("div.id is null in DivCustom", null, clkVar.j, null, 10);
            SwitchCompat switchCompat = new SwitchCompat(div2View.getContext());
            qh91.c(switchCompat);
            return switchCompat;
        }
        HashMap hashMap = this.a;
        azw0 azw0Var = (azw0) hashMap.get(str);
        if (azw0Var == null) {
            SwitchCompat switchCompat2 = new SwitchCompat(div2View.getContext());
            qh91.c(switchCompat2);
            hashMap.put(str, new azw0(switchCompat2, false));
            return switchCompat2;
        }
        View view = azw0Var.a;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        hashMap.put(str, new azw0(view, true));
        return view;
    }

    @Override // defpackage.qr51
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
        if (view instanceof SwitchCompat) {
            this.d = true;
            JSONObject jSONObject = clkVar.i;
            DivKitSwitchCustomPropsDto divKitSwitchCustomPropsDto = null;
            if (jSONObject != null) {
                try {
                    divKitSwitchCustomPropsDto = this.b.fromJson(String.valueOf(jSONObject));
                } catch (Exception e) {
                    x4c.g("Failed to parse DivKit customProps in \"custom_type\"", e, YbDivKitCustomBlockTypes.SWITCH_BLOCK_TYPE, null, 8);
                }
            }
            DivKitSwitchCustomPropsDto divKitSwitchCustomPropsDto2 = divKitSwitchCustomPropsDto;
            boolean isChecked = divKitSwitchCustomPropsDto2 != null ? divKitSwitchCustomPropsDto2.isChecked() : false;
            azw0 azw0Var = (azw0) this.a.get(clkVar.p);
            if (azw0Var == null || !azw0Var.b) {
                ((SwitchCompat) view).setChecked(isChecked);
            } else {
                view.postDelayed(new cmk(view, isChecked), 50L);
            }
            ((SwitchCompat) view).setEnabled(divKitSwitchCustomPropsDto2 != null ? divKitSwitchCustomPropsDto2.isEnabled() : true);
            view.setOnTouchListener(new bmk(0, clkVar, this, div2View));
        }
    }

    @Override // defpackage.qr51
    public final YbDivKitCustomBlockTypes getCustomType() {
        return this.c;
    }

    @Override // defpackage.qr51
    public final boolean isCustomTypeSupported(String str) {
        return xz91.b(this, str);
    }

    @Override // defpackage.qr51
    public final void release() {
        if (this.d) {
            this.a.clear();
        }
    }
}
