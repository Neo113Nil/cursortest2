package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes5.dex */
public final class a2i implements zo31 {
    public final ViewGroup a;
    public final NestedScrollViewAdvanced b;

    public a2i(ViewGroup viewGroup, NestedScrollViewAdvanced nestedScrollViewAdvanced) {
        this.a = viewGroup;
        this.b = nestedScrollViewAdvanced;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
