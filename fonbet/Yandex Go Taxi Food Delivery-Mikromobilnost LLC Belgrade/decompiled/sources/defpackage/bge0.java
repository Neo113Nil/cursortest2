package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes13.dex */
public final class bge0 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final KeyboardAwareRobotoEditText f;
    public final PlaceholderView g;

    public bge0(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ImageView imageView, ImageView imageView2, ImageView imageView3, KeyboardAwareRobotoEditText keyboardAwareRobotoEditText, PlaceholderView placeholderView) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = keyboardAwareRobotoEditText;
        this.g = placeholderView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
