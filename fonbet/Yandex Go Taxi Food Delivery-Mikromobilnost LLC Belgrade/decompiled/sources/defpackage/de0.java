package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class de0 implements zo31 {
    public final View a;
    public final AddressInputComponent b;
    public final RecyclerView c;
    public final RobotoTextView d;
    public final LinearLayout e;
    public final ListItemInputComponent f;
    public final ButtonComponent g;
    public final ShimmeringBar h;
    public final ListTitleComponent i;

    public de0(ViewGroup viewGroup, AddressInputComponent addressInputComponent, RecyclerView recyclerView, RobotoTextView robotoTextView, LinearLayout linearLayout, ListItemInputComponent listItemInputComponent, ButtonComponent buttonComponent, ShimmeringBar shimmeringBar, ListTitleComponent listTitleComponent) {
        this.a = viewGroup;
        this.b = addressInputComponent;
        this.c = recyclerView;
        this.d = robotoTextView;
        this.e = linearLayout;
        this.f = listItemInputComponent;
        this.g = buttonComponent;
        this.h = shimmeringBar;
        this.i = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
