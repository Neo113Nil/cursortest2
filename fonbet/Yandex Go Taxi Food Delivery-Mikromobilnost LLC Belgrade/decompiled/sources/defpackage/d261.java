package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.YbDivView;

/* loaded from: classes3.dex */
public final class d261 implements zo31 {
    public final YbDivView a;
    public final YbDivView b;

    public d261(YbDivView ybDivView, YbDivView ybDivView2) {
        this.a = ybDivView;
        this.b = ybDivView2;
    }

    public static d261 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(fnh0.ybsdk_item_div_view, viewGroup, false);
        if (inflate != null) {
            YbDivView ybDivView = (YbDivView) inflate;
            return new d261(ybDivView, ybDivView);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
