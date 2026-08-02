package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHintComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes13.dex */
public final class dve implements zo31 {
    public final FrameLayout a;
    public final ListItemComponent b;
    public final ListTitleComponent c;
    public final ListItemInputComponent d;
    public final View e;
    public final ListItemInputComponent f;
    public final ListItemInputComponent g;
    public final ButtonComponent h;
    public final ShimmeringFrameLayout i;
    public final ListItemComponent j;
    public final ListItemInputComponent k;
    public final ListHintComponent l;
    public final ListItemInputComponent m;
    public final ListItemCheckComponent n;

    public dve(FrameLayout frameLayout, ListItemComponent listItemComponent, ListTitleComponent listTitleComponent, ListItemInputComponent listItemInputComponent, View view, ListItemInputComponent listItemInputComponent2, ListItemInputComponent listItemInputComponent3, ButtonComponent buttonComponent, ShimmeringFrameLayout shimmeringFrameLayout, ListItemComponent listItemComponent2, ListItemInputComponent listItemInputComponent4, ListHintComponent listHintComponent, ListItemInputComponent listItemInputComponent5, ListItemCheckComponent listItemCheckComponent) {
        this.a = frameLayout;
        this.b = listItemComponent;
        this.c = listTitleComponent;
        this.d = listItemInputComponent;
        this.e = view;
        this.f = listItemInputComponent2;
        this.g = listItemInputComponent3;
        this.h = buttonComponent;
        this.i = shimmeringFrameLayout;
        this.j = listItemComponent2;
        this.k = listItemInputComponent4;
        this.l = listHintComponent;
        this.m = listItemInputComponent5;
        this.n = listItemCheckComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
