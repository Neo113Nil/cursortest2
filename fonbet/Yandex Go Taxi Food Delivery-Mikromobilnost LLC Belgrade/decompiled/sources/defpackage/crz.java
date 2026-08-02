package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class crz implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final GoLinearLayout c;
    public final ListItemComponent d;
    public final ListHeaderComponent e;
    public final GoImageView f;
    public final GoImageView g;
    public final GoLinearLayout h;

    public crz(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, GoLinearLayout goLinearLayout2, ListItemComponent listItemComponent, ListHeaderComponent listHeaderComponent, GoImageView goImageView, GoImageView goImageView2, GoLinearLayout goLinearLayout3) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = goLinearLayout2;
        this.d = listItemComponent;
        this.e = listHeaderComponent;
        this.f = goImageView;
        this.g = goImageView2;
        this.h = goLinearLayout3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
