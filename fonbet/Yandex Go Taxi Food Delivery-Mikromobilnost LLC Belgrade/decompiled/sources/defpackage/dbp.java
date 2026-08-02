package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes13.dex */
public final class dbp implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final PlaceholderView e;
    public final Group f;
    public final AppCompatTextView g;
    public final AppCompatTextView h;
    public final AppCompatTextView i;

    public dbp(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, PlaceholderView placeholderView, Group group, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = placeholderView;
        this.f = group;
        this.g = appCompatTextView;
        this.h = appCompatTextView2;
        this.i = appCompatTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
