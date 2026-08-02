package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.api.ui.theme.DivKitThemedFrameLayout;

/* loaded from: classes12.dex */
public final class g0y implements zo31 {
    public final DivKitThemedFrameLayout a;
    public final GoFrameLayout b;

    public g0y(DivKitThemedFrameLayout divKitThemedFrameLayout, GoFrameLayout goFrameLayout) {
        this.a = divKitThemedFrameLayout;
        this.b = goFrameLayout;
    }

    public static g0y o(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(kth0.layout_fullscreen_flex_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = mih0.flex_container;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
        if (goFrameLayout != null) {
            return new g0y((DivKitThemedFrameLayout) inflate, goFrameLayout);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
