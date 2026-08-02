package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class l661 implements zo31 {
    public final FrameLayout a;

    public l661(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    public static l661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_settings_term, viewGroup, false);
        if (inflate != null) {
            return new l661((FrameLayout) inflate);
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
