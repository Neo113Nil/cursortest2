package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class c861 implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;

    public c861(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = frameLayout2;
    }

    public static c861 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(mnh0.ybsdk_screen_sbp_account_info, viewGroup, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            return new c861(frameLayout, frameLayout);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final FrameLayout o() {
        return this.a;
    }
}
