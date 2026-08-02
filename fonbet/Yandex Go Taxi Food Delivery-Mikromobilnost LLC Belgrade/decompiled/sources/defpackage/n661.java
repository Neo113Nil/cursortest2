package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;

/* loaded from: classes3.dex */
public final class n661 implements zo31 {
    public final DivSkeletonsView a;
    public final DivSkeletonsView b;

    public n661(DivSkeletonsView divSkeletonsView, DivSkeletonsView divSkeletonsView2) {
        this.a = divSkeletonsView;
        this.b = divSkeletonsView2;
    }

    public static n661 p(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(cnh0.ybsdk_screen_change_payment_method_div_skeleton, (ViewGroup) null, false);
        if (inflate != null) {
            DivSkeletonsView divSkeletonsView = (DivSkeletonsView) inflate;
            return new n661(divSkeletonsView, divSkeletonsView);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final DivSkeletonsView o() {
        return this.a;
    }
}
