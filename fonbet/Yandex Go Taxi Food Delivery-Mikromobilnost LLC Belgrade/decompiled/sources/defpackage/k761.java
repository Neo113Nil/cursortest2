package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class k761 implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;

    public k761(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = frameLayout2;
    }

    public static k761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(snh0.ybsdk_screen_paymentsdk, viewGroup, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            return new k761(frameLayout, frameLayout);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
