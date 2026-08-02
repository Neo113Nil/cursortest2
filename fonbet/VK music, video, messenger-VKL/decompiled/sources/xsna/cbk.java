package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.log.L;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bbv0;

/* compiled from: CreateWalletSetPinPresenter.kt */
/* loaded from: classes6.dex */
public final class cbk extends ek6 implements abk {
    public final bbk e;
    public final a8c f;
    public final gbv0 g;
    public final io.reactivex.rxjava3.disposables.b h;
    public boolean i;
    public ona0 j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cbk(bbk bbkVar) {
        super(bbkVar, r1.i);
        a8c a8cVar = sdi.f;
        bbv0.a aVar = bbv0.g;
        aVar.getClass();
        gbv0 gbv0Var = bbv0.a.f().d;
        aVar.getClass();
        VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
        if (vkPayCheckoutConfig == null) {
            throw new IllegalStateException();
        }
        this.e = bbkVar;
        this.f = a8cVar;
        this.g = gbv0Var;
        this.h = new io.reactivex.rxjava3.disposables.b();
        this.j = sla0.a;
    }

    @Override // xsna.fm6
    public final boolean a0() {
        if (!this.i) {
            if (!(this.j instanceof ola0)) {
                return true;
            }
            this.j = sla0.a;
            a();
            bbk bbkVar = this.e;
            ViewGroup viewGroup = bbkVar.k;
            if (viewGroup != null) {
                zmp0.a(viewGroup, null);
                TextView textView = bbkVar.l;
                (textView != null ? textView : null).setText(R.string.vk_pay_checkout_enter_new_pin);
                return false;
            }
        }
        return false;
    }

    @Override // xsna.ek6
    public final void c() {
        ona0 ona0Var = this.j;
        boolean z = ona0Var instanceof sla0;
        StringBuilder sb = this.d;
        bbk bbkVar = this.e;
        if (z) {
            ViewGroup viewGroup = bbkVar.k;
            if (viewGroup != null) {
                zmp0.a(viewGroup, null);
                TextView textView = bbkVar.l;
                (textView != null ? textView : null).setText(R.string.vk_pay_checkout_repeat_pin_code);
            }
            this.j = new ola0(sb.toString());
            a();
            return;
        }
        if (!(ona0Var instanceof ola0)) {
            throw new NoWhenBranchMatchedException();
        }
        ola0 ola0Var = (ola0) ona0Var;
        if (sb.toString().equals(ola0Var.a)) {
            String str = ola0Var.a;
            bbv0.g.getClass();
            bbv0.a.f().e.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.NEW_WALLET_ACCEPT);
            bbkVar.vn();
            this.h.b(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(a8c.d(this.f.a.l(str)), new nf1(new t9e(this, 13), 24)), new l50(new nfj(this, 2), 17)), new ot1(this, 3)).subscribe(new tp0(new t50(1, this, cbk.class, "handleCreateWalletResponse", "handleCreateWalletResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/Statused;)V", 0, 6), 19), new tf(new yp1(L.a, 6), 20)));
            return;
        }
        a();
        PinDotsView pinDotsView = bbkVar.m;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.d();
        ViewGroup viewGroup2 = bbkVar.k;
        if (viewGroup2 != null) {
            mk5 mk5Var = new mk5();
            mk5Var.e(300L);
            mk5Var.addListener(new jmp0(new l9h(bbkVar, 5)));
            zmp0.a(viewGroup2, mk5Var);
            TextView textView2 = bbkVar.l;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(R.string.vk_pay_checkout_reenter_new_pin);
            TextView textView3 = bbkVar.n;
            (textView3 != null ? textView3 : null).setText(R.string.vk_pay_checkout_onboarding_create_wrong_pin);
        }
        this.j = sla0.a;
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.h.e();
    }

    @Override // xsna.fm6
    public final void d() {
    }

    @Override // xsna.fm6
    public final void onDestroy() {
    }

    @Override // xsna.fm6
    public final void onResume() {
    }

    @Override // xsna.fm6
    public final void onStart() {
    }
}
