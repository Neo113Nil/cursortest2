package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.accessibility.AccessibilityButtonLinearLayout;

/* loaded from: classes6.dex */
public final class a051 implements zo31 {
    public final LinearLayout a;
    public final AppCompatImageView b;
    public final AccessibilityButtonLinearLayout c;
    public final LinearLayout d;
    public final ToolbarComponent e;
    public final AccessibilityButtonLinearLayout f;

    public a051(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AccessibilityButtonLinearLayout accessibilityButtonLinearLayout, LinearLayout linearLayout2, ToolbarComponent toolbarComponent, AccessibilityButtonLinearLayout accessibilityButtonLinearLayout2) {
        this.a = linearLayout;
        this.b = appCompatImageView;
        this.c = accessibilityButtonLinearLayout;
        this.d = linearLayout2;
        this.e = toolbarComponent;
        this.f = accessibilityButtonLinearLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
