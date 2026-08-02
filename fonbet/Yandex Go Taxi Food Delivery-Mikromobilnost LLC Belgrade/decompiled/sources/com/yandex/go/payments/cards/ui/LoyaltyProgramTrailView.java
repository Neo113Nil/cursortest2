package com.yandex.go.payments.cards.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.loyalty.impl.common.ui.tablet.LoyaltyTablet;
import defpackage.dzg0;
import defpackage.evz;
import defpackage.reu;
import defpackage.rxz;
import defpackage.sxz;
import defpackage.tje;
import defpackage.txz;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/payments/cards/ui/LoyaltyProgramTrailView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lrxz;", "loyaltyTabletFactory", "<init>", "(Landroid/content/Context;Lrxz;)V", "Landroid/view/View;", "createNavigationIcon", "()Landroid/view/View;", "Levz;", "loyaltyProgram", "Lzy11;", "updateLoyaltyProgram", "(Levz;)V", "Ltxz;", "loyaltyTablet", "Ltxz;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoyaltyProgramTrailView extends GoLinearLayout {
    public static final int $stable = 8;
    private final txz loyaltyTablet;

    public LoyaltyProgramTrailView(Context context, rxz rxzVar) {
        super(context, null, 0, 0, 14, null);
        ((sxz) rxzVar).getClass();
        LoyaltyTablet loyaltyTablet = new LoyaltyTablet(context);
        loyaltyTablet.setLayoutParams(new FrameLayout.LayoutParams(-2, tje.u(24, context), 16));
        reu reuVar = new reu(24, loyaltyTablet);
        addView(loyaltyTablet);
        this.loyaltyTablet = reuVar;
        setLayoutParams(new LinearLayout.LayoutParams(-2, tje.u(56, getContext())));
        setPadding(tje.u(8, getContext()), 0, tje.u(8, getContext()), 0);
        setGravity(16);
        addView(createNavigationIcon());
    }

    private final View createNavigationIcon() {
        GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
        goImageView.setImageResource(dzg0.chevron_next);
        goImageView.setLayoutParams(new LinearLayout.LayoutParams(tje.u(24, getContext()), tje.u(24, getContext())));
        goImageView.setPadding(tje.u(9, getContext()), tje.u(7, getContext()), tje.u(9, getContext()), tje.u(7, getContext()));
        return goImageView;
    }

    public final void updateLoyaltyProgram(evz loyaltyProgram) {
        ((LoyaltyTablet) ((reu) this.loyaltyTablet).b).updateProgram(loyaltyProgram);
    }
}
