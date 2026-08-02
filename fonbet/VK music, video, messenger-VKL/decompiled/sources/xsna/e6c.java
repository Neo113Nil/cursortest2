package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.bbv0;
import xsna.sr90;

/* compiled from: CheckoutMethodsPresenter.kt */
/* loaded from: classes6.dex */
public final class e6c implements z5c {
    public final a6c b;
    public final a8c c;
    public final kku0 d;
    public final shn0 e;
    public final io.reactivex.rxjava3.disposables.b f;
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: CheckoutMethodsPresenter.kt */
    public static final class a {
        public static final a a = new a();
    }

    /* compiled from: CheckoutMethodsPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<List<? extends PayMethodData>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends PayMethodData> list) {
            ebv0 ebv0Var;
            View findViewById;
            List<? extends PayMethodData> list2 = list;
            e6c e6cVar = (e6c) this.receiver;
            e6cVar.e.a.g = new ven0(list2);
            List C0 = j5g.C0(j5g.u0(Collections.singletonList(AddCardMethod.c), list2));
            ArrayList arrayList = new ArrayList(c5g.u(C0, 10));
            Iterator it = C0.iterator();
            while (it.hasNext()) {
                arrayList.add(sr90.a.a((PayMethodData) it.next()));
            }
            a6c a6cVar = e6cVar.b;
            a6cVar.un().setItems(arrayList);
            try {
                kbv0.d.b(a6cVar.mo2getContext());
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
            ProgressBar progressBar = a6cVar.m;
            if (epx.d(progressBar != null ? Float.valueOf(progressBar.getAlpha()) : null, 1.0f)) {
                AnimatorSet animatorSet = new AnimatorSet();
                ProgressBar progressBar2 = a6cVar.m;
                Property property = View.ALPHA;
                animatorSet.play(ObjectAnimator.ofFloat(progressBar2, (Property<ProgressBar, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(ObjectAnimator.ofFloat(a6cVar.l, (Property<RecyclerView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                animatorSet.setDuration(800L);
                animatorSet.start();
            }
            kku0 kku0Var = e6cVar.d;
            if ((kku0Var instanceof gbv0) && (ebv0Var = ((gbv0) kku0Var).a.get()) != null) {
                Dialog dialog = ebv0Var.s;
                com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
                if (bVar != null && (findViewById = bVar.findViewById(R$id.design_bottom_sheet)) != null) {
                    BottomSheetBehavior.L(findViewById).X(3);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: CheckoutMethodsPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Status status;
            Throwable th2 = th;
            e6c e6cVar = (e6c) this.receiver;
            Context mo2getContext = e6cVar.b.mo2getContext();
            if (mo2getContext != null) {
                bbv0.g.getClass();
                bbv0.a.c(th2);
                com.vk.movika.sdk.base.logic.interactor.l lVar = new com.vk.movika.sdk.base.logic.interactor.l(8);
                Throwable cause = th2.getCause();
                if (cause == null || !(((cause instanceof VKApiExecutionException) && ((VKApiExecutionException) cause).s() == -1) || (cause instanceof IOException))) {
                    status = new Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext.getString(R.string.vk_pay_checkout_something_wrong_hint)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), lVar));
                } else {
                    status = new Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_internet_connection_error), mo2getContext.getString(R.string.vk_pay_checkout_internet_connection_error_hint)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), lVar));
                }
                e6cVar.d.f(status, new c6c());
            }
            return s3q0.a;
        }
    }

    /* compiled from: CheckoutMethodsPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public e6c(a6c a6cVar, a8c a8cVar, kku0 kku0Var) {
        bbv0.g.getClass();
        shn0 shn0Var = bbv0.a.f().e;
        this.b = a6cVar;
        this.c = a8cVar;
        this.d = kku0Var;
        this.e = shn0Var;
        this.f = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.z5c
    public final void X3() {
        int i = 8;
        this.g = ysg0.b.a.b0(a.class).subscribe(new zl0(new ka(this, 19), i), new mf1(new d(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i));
    }

    @Override // xsna.fm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.z5c
    public final void e0(PayMethodData payMethodData, int i) {
        if (payMethodData instanceof Card) {
            shn0 shn0Var = this.e;
            shn0Var.a.b(payMethodData);
            shn0Var.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.DELETE_PS);
            shn0Var.a.b(null);
            String id = ((Card) payMethodData).getId();
            a8c a8cVar = this.c;
            this.f.b(a8c.d(new io.reactivex.rxjava3.internal.operators.single.o(a8cVar.a.b(id), new cw(new nk0(7, a8cVar, id), 10))).subscribe(new ea(new d6c(this, i, 0), 16), new el6(new ci7(9), 7)));
        }
    }

    @Override // xsna.z5c
    public final void f0() {
        this.e.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.ADD_NEW_PS);
        this.d.a(AddCardMethod.c);
    }

    @Override // xsna.z5c
    public final void i0(PayMethodData payMethodData) {
        shn0 shn0Var = this.e;
        shn0Var.a.b(payMethodData);
        shn0Var.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.CHOOSE_PS);
        this.c.b = payMethodData;
        this.d.a(payMethodData);
    }

    @Override // xsna.fm6
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = null;
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.f.e();
    }

    @Override // xsna.z5c
    public final void s2() {
        this.e.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.CREATE_VK_PAY_WALLET);
        this.d.b();
    }

    @Override // xsna.z5c
    public final void t3(boolean z) {
        this.f.b(this.c.c(z).q(io.reactivex.rxjava3.schedulers.a.b()).l(new as(new y40(12), 11)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f50(new b(1, this, e6c.class, "handlePayMethodsResponse", "handlePayMethodsResponse(Ljava/util/List;)V", 0), 12), new ia(new c(1, this, e6c.class, "handleFailedFetchPaymentMethods", "handleFailedFetchPaymentMethods(Ljava/lang/Throwable;)V", 0), 11)));
    }

    @Override // xsna.fm6
    public final void d() {
    }

    @Override // xsna.fm6
    public final void onResume() {
    }

    @Override // xsna.fm6
    public final void onStart() {
    }
}
