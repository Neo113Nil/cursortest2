package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.items.DefaultOfferHeaderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class pxu implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final DefaultOfferHeaderView d;
    public final GoLinearLayout e;

    public pxu(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, GoImageView goImageView, DefaultOfferHeaderView defaultOfferHeaderView, GoLinearLayout goLinearLayout) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = defaultOfferHeaderView;
        this.e = goLinearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
