package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class l4a0 implements zo31 {
    public final LinearLayout a;
    public final GoLinearLayout b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final AppCompatImageView e;
    public final GoLinearLayout f;
    public final RobotoTextView g;
    public final ListItemComponent h;
    public final ListItemComponent i;
    public final ListItemComponent j;
    public final ListItemComponent k;
    public final CardDivider l;
    public final AppCompatImageView m;
    public final GoImageView n;
    public final ListItemComponent o;
    public final ToolbarComponent p;

    public l4a0(LinearLayout linearLayout, GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView3, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ListItemComponent listItemComponent3, ListItemComponent listItemComponent4, CardDivider cardDivider, AppCompatImageView appCompatImageView2, GoImageView goImageView, ListItemComponent listItemComponent5, ToolbarComponent toolbarComponent) {
        this.a = linearLayout;
        this.b = goLinearLayout;
        this.c = robotoTextView;
        this.d = robotoTextView2;
        this.e = appCompatImageView;
        this.f = goLinearLayout2;
        this.g = robotoTextView3;
        this.h = listItemComponent;
        this.i = listItemComponent2;
        this.j = listItemComponent3;
        this.k = listItemComponent4;
        this.l = cardDivider;
        this.m = appCompatImageView2;
        this.n = goImageView;
        this.o = listItemComponent5;
        this.p = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
