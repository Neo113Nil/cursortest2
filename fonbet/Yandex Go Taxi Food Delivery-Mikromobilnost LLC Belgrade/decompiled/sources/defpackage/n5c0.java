package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class n5c0 implements zo31 {
    public final GoLinearLayout a;
    public final GoFrameLayout b;
    public final CompressionResistantListComponent c;
    public final RobotoTextView d;

    public n5c0(GoLinearLayout goLinearLayout, GoFrameLayout goFrameLayout, CompressionResistantListComponent compressionResistantListComponent, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = goFrameLayout;
        this.c = compressionResistantListComponent;
        this.d = robotoTextView;
    }

    public static n5c0 o(View view) {
        int i = o6h0.booking_icons_container;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, view);
        if (goFrameLayout != null) {
            i = o6h0.booking_subtitle;
            CompressionResistantListComponent compressionResistantListComponent = (CompressionResistantListComponent) cma1.O(i, view);
            if (compressionResistantListComponent != null) {
                i = o6h0.booking_title;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, view);
                if (robotoTextView != null) {
                    return new n5c0((GoLinearLayout) view, goFrameLayout, compressionResistantListComponent, robotoTextView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
