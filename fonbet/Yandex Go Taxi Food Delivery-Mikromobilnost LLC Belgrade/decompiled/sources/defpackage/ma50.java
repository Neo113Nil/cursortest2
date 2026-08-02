package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.NavigationWithTextTrailView;
import ru.yandex.taxi.plus.design.view.GradientGlyphValueView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class ma50 implements zo31 {
    public final NavigationWithTextTrailView a;

    public ma50(NavigationWithTextTrailView navigationWithTextTrailView, GradientGlyphValueView gradientGlyphValueView, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView) {
        this.a = navigationWithTextTrailView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
