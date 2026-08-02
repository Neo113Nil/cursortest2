package defpackage;

import android.view.View;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.favorites.list.ui.HeaderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class dau implements zo31 {
    public final HeaderView a;
    public final BadgeView b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public dau(HeaderView headerView, BadgeView badgeView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = headerView;
        this.b = badgeView;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
