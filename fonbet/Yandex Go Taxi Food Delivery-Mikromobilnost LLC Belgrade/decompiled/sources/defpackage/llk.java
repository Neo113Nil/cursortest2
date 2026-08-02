package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import com.ybsdk.feature.divkit.internal.ui.cardinput.NfcCardInputViewContainer;

/* loaded from: classes3.dex */
public final class llk implements qr51 {
    public final YbDivKitCustomBlockTypes a = YbDivKitCustomBlockTypes.CARD_INPUT_TYPE;

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        return new NfcCardInputViewContainer(div2View.getContext(), null, 0, 6, null);
    }

    @Override // defpackage.qr51
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
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
