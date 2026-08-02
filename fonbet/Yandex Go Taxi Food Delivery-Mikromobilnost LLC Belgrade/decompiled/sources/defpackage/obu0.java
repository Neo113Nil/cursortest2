package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes3.dex */
public final class obu0 implements zo31 {
    public final LinearLayout a;
    public final ListTitleComponent b;

    public obu0(LinearLayout linearLayout, ListTitleComponent listTitleComponent) {
        this.a = linearLayout;
        this.b = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
