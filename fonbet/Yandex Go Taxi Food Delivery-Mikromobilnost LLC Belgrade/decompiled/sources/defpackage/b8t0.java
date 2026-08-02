package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes13.dex */
public final class b8t0 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final ImageView c;
    public final ListTitleComponent d;

    public b8t0(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ImageView imageView, ListTitleComponent listTitleComponent) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = imageView;
        this.d = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
