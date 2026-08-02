package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.tips.ui.TipsView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class ghz0 implements zo31 {
    public final LinearLayout a;
    public final RobotoTextView b;
    public final ButtonComponent c;
    public final ListHeaderComponent d;
    public final TipsView e;

    public ghz0(LinearLayout linearLayout, RobotoTextView robotoTextView, ButtonComponent buttonComponent, ListHeaderComponent listHeaderComponent, TipsView tipsView) {
        this.a = linearLayout;
        this.b = robotoTextView;
        this.c = buttonComponent;
        this.d = listHeaderComponent;
        this.e = tipsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
