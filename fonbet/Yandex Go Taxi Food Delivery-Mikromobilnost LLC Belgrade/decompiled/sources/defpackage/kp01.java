package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.transfer_requirement.ui.date_selector.TransferDateSelectorView;
import com.yandex.go.transfer_requirement.ui.flight_input.TransferNumberInputView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class kp01 implements zo31 {
    public final GoFrameLayout a;
    public final ListHeaderComponent b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final GoLinearLayout e;
    public final GoView f;
    public final ListItemComponent g;
    public final ListItemSwitchComponent h;
    public final GoView i;
    public final ListGroupHeaderComponent j;
    public final TransferNumberInputView k;
    public final ListItemComponent l;
    public final GoLinearLayout m;
    public final ListGroupHeaderComponent n;
    public final ButtonComponent o;
    public final GoLinearLayout p;
    public final ButtonComponent q;
    public final View r;
    public final AnimatedListItemInputComponent s;
    public final FrameLayout t;
    public final TransferNumberInputView u;
    public final GoLinearLayout v;
    public final AnimatedListItemInputComponent w;
    public final TransferDateSelectorView x;

    public kp01(GoFrameLayout goFrameLayout, ListHeaderComponent listHeaderComponent, ButtonComponent buttonComponent, RobotoTextView robotoTextView, GoLinearLayout goLinearLayout, GoView goView, ListItemComponent listItemComponent, ListItemSwitchComponent listItemSwitchComponent, GoView goView2, ListGroupHeaderComponent listGroupHeaderComponent, TransferNumberInputView transferNumberInputView, ListItemComponent listItemComponent2, GoLinearLayout goLinearLayout2, ListGroupHeaderComponent listGroupHeaderComponent2, ButtonComponent buttonComponent2, GoLinearLayout goLinearLayout3, ButtonComponent buttonComponent3, View view, AnimatedListItemInputComponent animatedListItemInputComponent, FrameLayout frameLayout, TransferNumberInputView transferNumberInputView2, GoLinearLayout goLinearLayout4, AnimatedListItemInputComponent animatedListItemInputComponent2, TransferDateSelectorView transferDateSelectorView) {
        this.a = goFrameLayout;
        this.b = listHeaderComponent;
        this.c = buttonComponent;
        this.d = robotoTextView;
        this.e = goLinearLayout;
        this.f = goView;
        this.g = listItemComponent;
        this.h = listItemSwitchComponent;
        this.i = goView2;
        this.j = listGroupHeaderComponent;
        this.k = transferNumberInputView;
        this.l = listItemComponent2;
        this.m = goLinearLayout2;
        this.n = listGroupHeaderComponent2;
        this.o = buttonComponent2;
        this.p = goLinearLayout3;
        this.q = buttonComponent3;
        this.r = view;
        this.s = animatedListItemInputComponent;
        this.t = frameLayout;
        this.u = transferNumberInputView2;
        this.v = goLinearLayout4;
        this.w = animatedListItemInputComponent2;
        this.x = transferDateSelectorView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
