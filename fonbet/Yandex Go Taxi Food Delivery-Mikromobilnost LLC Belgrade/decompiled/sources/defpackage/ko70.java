package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentContainerView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class ko70 implements zo31 {
    public final LinearLayout a;
    public final FragmentContainerView b;
    public final LinearLayout c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final ListItemComponent f;

    public ko70(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ListItemComponent listItemComponent) {
        this.a = linearLayout;
        this.b = fragmentContainerView;
        this.c = linearLayout2;
        this.d = appCompatImageView;
        this.e = appCompatImageView2;
        this.f = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
