package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;

/* loaded from: classes15.dex */
public final class eav0 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final ListTextComponent d;
    public final AppCompatImageView e;
    public final ListHeaderComponent f;

    public eav0(LinearLayout linearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ListTextComponent listTextComponent, AppCompatImageView appCompatImageView, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = listTextComponent;
        this.e = appCompatImageView;
        this.f = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
