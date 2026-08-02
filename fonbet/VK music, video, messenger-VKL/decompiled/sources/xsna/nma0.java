package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.log.L;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.bbv0;

/* compiled from: PinRestorePresenter.kt */
/* loaded from: classes6.dex */
public final class nma0 extends ek6 implements lma0 {
    public final mma0 e;
    public final a8c f;
    public final kku0 g;
    public final ahn h;
    public final shn0 i;
    public final pma0 j;
    public final io.reactivex.rxjava3.disposables.b k;
    public io.reactivex.rxjava3.disposables.c l;
    public String m;
    public ona0 n;
    public x7s o;

    /* compiled from: PinRestorePresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nma0(mma0 mma0Var, kku0 kku0Var, ahn ahnVar) {
        super(mma0Var, r2.i);
        a8c a8cVar = sdi.f;
        bbv0.a aVar = bbv0.g;
        aVar.getClass();
        VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
        aVar.getClass();
        shn0 shn0Var = bbv0.a.f().e;
        this.e = mma0Var;
        this.f = a8cVar;
        this.g = kku0Var;
        this.h = ahnVar;
        this.i = shn0Var;
        a8cVar.getClass();
        this.j = new pma0(a8c.a().j);
        this.k = new io.reactivex.rxjava3.disposables.b();
        this.n = sla0.a;
    }

    @Override // xsna.lma0
    public final void Y0() {
        f();
    }

    @Override // xsna.fm6
    public final boolean a0() {
        if (!(this.n instanceof ola0)) {
            return true;
        }
        this.n = sla0.a;
        a();
        mma0 mma0Var = this.e;
        ViewGroup viewGroup = mma0Var.t;
        if (viewGroup == null) {
            viewGroup = null;
        }
        zmp0.a(viewGroup, null);
        TextView textView = mma0Var.q;
        (textView != null ? textView : null).setText(R.string.vk_pay_checkout_enter_new_pin);
        return false;
    }

    @Override // xsna.lma0
    public final void a4() {
        mma0 mma0Var = this.e;
        ViewGroup viewGroup = mma0Var.l;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = mma0Var.k;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        f4m.j(viewGroup2);
        ViewGroup viewGroup3 = mma0Var.m;
        f4m.j(viewGroup3 != null ? viewGroup3 : null);
        f();
    }

    @Override // xsna.ek6
    public final void c() {
        ona0 ona0Var = this.n;
        boolean z = ona0Var instanceof sla0;
        mma0 mma0Var = this.e;
        StringBuilder sb = this.d;
        if (z) {
            this.n = new ola0(sb.toString());
            ViewGroup viewGroup = mma0Var.t;
            if (viewGroup == null) {
                viewGroup = null;
            }
            zmp0.a(viewGroup, null);
            TextView textView = mma0Var.s;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(4);
            TextView textView2 = mma0Var.q;
            (textView2 != null ? textView2 : null).setText(R.string.vk_pay_checkout_repeat_pin_code);
            a();
            return;
        }
        if (!(ona0Var instanceof ola0)) {
            throw new NoWhenBranchMatchedException();
        }
        String sb2 = sb.toString();
        if (sb2.equals(((ola0) ona0Var).a)) {
            String str = this.m;
            if (str == null) {
                return;
            }
            x7s x7sVar = this.o;
            int i = 0;
            this.k.b(new io.reactivex.rxjava3.internal.operators.single.m(new io.reactivex.rxjava3.internal.operators.single.n(a8c.d(this.f.a.m(str, sb2, (x7sVar != null ? x7sVar : null).a)), new o330(new i750(this, 9), 10)), new nh40(new qw6(this, 11), 6)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new skz(new ud8(1, this, nma0.class, "handleSetNewPinResponse", "handleSetNewPinResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/Statused;)V", i, 9), 14), new o7y(new wd8(1, this, nma0.class, "handleSetNewPinFailed", "handleSetNewPinFailed(Ljava/lang/Throwable;)V", i, 12), 8)));
            return;
        }
        a();
        TextView textView3 = mma0Var.s;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setVisibility(0);
        TextView textView4 = mma0Var.s;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setText(R.string.vk_pay_checkout_onboarding_create_wrong_pin);
        PinDotsView pinDotsView = mma0Var.r;
        if (pinDotsView == null) {
            pinDotsView = null;
        }
        pinDotsView.d();
        ViewGroup viewGroup2 = mma0Var.t;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        mk5 mk5Var = new mk5();
        mk5Var.e(300L);
        mk5Var.addListener(new jmp0(new a040(mma0Var, 17)));
        zmp0.a(viewGroup2, mk5Var);
        TextView textView5 = mma0Var.q;
        (textView5 != null ? textView5 : null).setText(R.string.vk_pay_checkout_reenter_new_pin);
        this.n = sla0.a;
    }

    @Override // xsna.fm6
    public final void d() {
        this.f.getClass();
        n34.l(a8c.a().j);
        mma0 mma0Var = this.e;
        ViewGroup viewGroup = mma0Var.k;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = mma0Var.l;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        f4m.j(viewGroup2);
        ViewGroup viewGroup3 = mma0Var.m;
        f4m.j(viewGroup3 != null ? viewGroup3 : null);
    }

    public final void f() {
        this.k.b(new io.reactivex.rxjava3.internal.operators.single.n(a8c.d(this.f.a.d()), new fsq(new ba40(this, 11), 18)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m1r(new sg3(1, this, nma0.class, "handlePinForgotResponse", "handlePinForgotResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/PinForgot;)V", 0, 7), 15), new b0y(new qi3(1, this, nma0.class, "handlePinForgotFailed", "handlePinForgotFailed(Ljava/lang/Throwable;)V", 0, 11), 15)));
    }

    @Override // xsna.lma0
    public final void g0(String str) {
        if (str.length() != 4) {
            return;
        }
        this.m = str;
        x7s x7sVar = this.o;
        if (x7sVar == null) {
            x7sVar = null;
        }
        this.k.b(new io.reactivex.rxjava3.internal.operators.single.n(a8c.d(this.f.a.k(str, x7sVar.a)), new fl30(new ebx(this, 18), 12)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m330(new t50(1, this, nma0.class, "handleCheckCodeResponse", "handleCheckCodeResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/Statused;)V", 0, 10), 10), new hms(new yp1(1, this, nma0.class, "handleCheckCodeFailed", "handleCheckCodeFailed(Ljava/lang/Throwable;)V", 0, 8), 23)));
    }

    public final void h(int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long a2 = qni0.a();
        x7s x7sVar = this.o;
        if (x7sVar == null) {
            x7sVar = null;
        }
        long seconds = this.j.a - timeUnit.toSeconds(a2 - x7sVar.b);
        if (seconds < 0) {
            seconds = 0;
        }
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.q.R(1L, TimeUnit.SECONDS).t0(1 + seconds).U(new e4t(new oma0(seconds), 9)).r0(io.reactivex.rxjava3.schedulers.a.a()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).C(new f3a(this, 3)).subscribe(new uu60(new wlw(this, i, 2), 6), new ubq(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 23));
        this.k.b(subscribe);
        this.l = subscribe;
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.k.dispose();
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
