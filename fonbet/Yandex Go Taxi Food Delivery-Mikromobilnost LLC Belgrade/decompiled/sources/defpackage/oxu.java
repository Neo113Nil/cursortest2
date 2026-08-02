package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.items.DefaultOfferHeaderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class oxu implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final DefaultOfferHeaderView c;
    public final GoImageView d;

    public oxu(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, DefaultOfferHeaderView defaultOfferHeaderView, GoImageView goImageView) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = defaultOfferHeaderView;
        this.d = goImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
