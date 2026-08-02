package com.yandex.go.payments.shared.members.invitation;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.shared.details.experiments.ForceZaloginForFamilyExperiment;
import com.yandex.go.payments.shared.members.invitation.InvitationView;
import defpackage.bww;
import defpackage.cww;
import defpackage.d6z;
import defpackage.e6h0;
import defpackage.fww;
import defpackage.gww;
import defpackage.kv90;
import defpackage.luh0;
import defpackage.lv90;
import defpackage.mbp;
import defpackage.r7v;
import defpackage.rp31;
import defpackage.ycq0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/go/payments/shared/members/invitation/InvitationView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lcww;", "presenter", "<init>", "(Landroid/content/Context;Lcww;)V", "Lzy11;", "initListeners", "()V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onAttachedToWindow", "onDetachedFromWindow", "Lcww;", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTextComponent;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "paymentSwitch", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "doneButton", "Lru/yandex/taxi/design/ButtonComponent;", "fww", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InvitationView extends ModalView {
    public static final int $stable = 8;
    private final View content;
    private final ListTextComponent description;
    private final ButtonComponent doneButton;
    private final ListItemSwitchComponent paymentSwitch;
    private final cww presenter;
    private final ListTitleComponent title;

    public InvitationView(Context context, cww cwwVar) {
        super(context);
        this.presenter = cwwVar;
        c.q(this, luh0.shared_payment_invitation, true);
        int i = e6h0.shared_payment_invitation_content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        this.title = (ListTitleComponent) ((View) rp31.d(this, e6h0.shared_payment_invitation_title));
        this.description = (ListTextComponent) ((View) rp31.d(this, e6h0.shared_payment_invitation_description));
        this.paymentSwitch = (ListItemSwitchComponent) ((View) rp31.d(this, e6h0.shared_payment_invitation_payment_switch));
        this.doneButton = (ButtonComponent) ((View) rp31.d(this, e6h0.shared_payment_invitation_done));
    }

    private final void initListeners() {
        final int i = 0;
        this.paymentSwitch.setDebounceClickListener(new Runnable(this) { // from class: eww
            public final /* synthetic */ InvitationView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                InvitationView invitationView = this.b;
                switch (i2) {
                    case 0:
                        InvitationView.initListeners$lambda$0(invitationView);
                        break;
                    default:
                        InvitationView.initListeners$lambda$1(invitationView);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.doneButton.setDebounceClickListener(new Runnable(this) { // from class: eww
            public final /* synthetic */ InvitationView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                InvitationView invitationView = this.b;
                switch (i22) {
                    case 0:
                        InvitationView.initListeners$lambda$0(invitationView);
                        break;
                    default:
                        InvitationView.initListeners$lambda$1(invitationView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$0(InvitationView invitationView) {
        cww cwwVar = invitationView.presenter;
        gww gwwVar = cwwVar.B;
        gwwVar.e = !gwwVar.e;
        ((bww) cwwVar.Dg()).C5(gwwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$1(InvitationView invitationView) {
        ForceZaloginForFamilyExperiment.Screen c;
        cww cwwVar = invitationView.presenter;
        String str = cwwVar.C;
        gww gwwVar = cwwVar.B;
        if (gwwVar.e) {
            ycq0 ycq0Var = cwwVar.y;
            kv90 kv90Var = lv90.Companion;
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.SHARED;
            kv90Var.getClass();
            ycq0Var.b(kv90.b(str, paymentMethod$Type));
        }
        if (cwwVar.z.a.Mg() && gwwVar.g) {
            ForceZaloginForFamilyExperiment forceZaloginForFamilyExperiment = (ForceZaloginForFamilyExperiment) cwwVar.D.b();
            if (forceZaloginForFamilyExperiment.b && (c = forceZaloginForFamilyExperiment.c(forceZaloginForFamilyExperiment.d.c)) != null) {
                cwwVar.A.c(SharedPaymentContext.INVITE_CARD, new mbp(d6z.Y(forceZaloginForFamilyExperiment, c.a), d6z.Y(forceZaloginForFamilyExperiment, c.b), c.c, d6z.Y(forceZaloginForFamilyExperiment, c.d)), new r7v(12, cwwVar, str));
            }
        }
        ((bww) cwwVar.Dg()).dismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cww cwwVar = this.presenter;
        fww fwwVar = new fww(this);
        cwwVar.Bg(fwwVar);
        fwwVar.C5(cwwVar.B);
        com.yandex.go.coroutines.b.g(cwwVar.Jg(), null, null, new InvitationPresenter$setInvitationRead$1(cwwVar, null), 3);
        initListeners();
        requestFocus();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
