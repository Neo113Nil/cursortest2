package defpackage;

import android.view.View;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.items.DefaultOfferHeaderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class agh implements zo31 {
    public final DefaultOfferHeaderView a;
    public final RobotoTextView b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public agh(DefaultOfferHeaderView defaultOfferHeaderView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.a = defaultOfferHeaderView;
        this.b = robotoTextView;
        this.c = robotoTextView2;
        this.d = robotoTextView3;
        this.e = robotoTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
