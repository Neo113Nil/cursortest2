package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.adapter.internal.CommonCode;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.WalletPayMethod;
import com.vk.superapp.vkpay.checkout.feature.success.CheckoutStatusFragment;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.threedspayment.models.PaymentData3DS;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import xsna.bbv0;
import xsna.gku0;
import xsna.hku0;
import xsna.pr90;

/* compiled from: VkPayCheckoutBottomSheetRouter.kt */
/* loaded from: classes6.dex */
public final class gbv0 implements kku0 {
    public final WeakReference<ebv0> a;
    public final int b;
    public final Set<Class<? extends gi6<? extends fm6>>> c;
    public final Set<Class<? extends bb6<? extends fm6>>> d;

    public gbv0(WeakReference<ebv0> weakReference) {
        FragmentActivity activity;
        this.a = weakReference;
        ebv0 ebv0Var = weakReference.get();
        this.b = (ebv0Var == null || (activity = ebv0Var.getActivity()) == null) ? -1 : activity.getRequestedOrientation();
        this.c = rl3.y0(new Class[]{bpk0.class, CheckoutStatusFragment.class, n2c.class});
        this.d = rl3.y0(new Class[]{g37.class, a6c.class});
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    public static void o(iku0 iku0Var) {
        bbv0.g.getClass();
        io.reactivex.rxjava3.subjects.g<iku0> gVar = bbv0.i;
        if (gVar == null) {
            return;
        }
        ?? r1 = gVar.b;
        if (r1.size() != 0) {
            iku0 iku0Var2 = (iku0) r1.getValue();
            if (epx.f(iku0Var2 != null ? iku0Var2.a() : null, iku0Var.a())) {
                return;
            }
        }
        r1.d();
        gVar.onNext(iku0Var);
    }

    @Override // xsna.kku0
    public final void a(PayMethodData payMethodData) {
        pr90 g37Var;
        pr90.a aVar = new pr90.a();
        aVar.b = payMethodData;
        Bundle bundle = aVar.a;
        bundle.putSerializable("pay_method_data", payMethodData);
        PayMethodData payMethodData2 = aVar.b;
        if (payMethodData2 == null) {
            throw new IllegalArgumentException("Expected initialized pay method");
        }
        if (payMethodData2 instanceof VkPay) {
            g37Var = new nbv0();
        } else if (payMethodData2 instanceof GooglePay) {
            g37Var = new v9u();
        } else if (payMethodData2 instanceof Card) {
            g37Var = new ys9();
        } else {
            if (!(payMethodData2 instanceof AddCardMethod)) {
                StringBuilder sb = new StringBuilder("Unsupported pay method ");
                PayMethodData payMethodData3 = aVar.b;
                if (payMethodData3 == null) {
                    payMethodData3 = null;
                }
                sb.append(payMethodData3);
                throw new IllegalArgumentException(sb.toString());
            }
            g37Var = new g37();
        }
        g37Var.setArguments(bundle);
        n(g37Var, g37Var.yn());
    }

    @Override // xsna.kku0
    public final void b() {
        Activity h;
        ebv0 ebv0Var = this.a.get();
        Context requireContext = ebv0Var != null ? ebv0Var.requireContext() : null;
        HashSet hashSet = iah0.a;
        if (!fnj.b(requireContext) && (h = e3m.h(requireContext)) != null) {
            h.setRequestedOrientation(1);
        }
        n(new k6c(), null);
    }

    @Override // xsna.kku0
    public final void c() {
        bbv0.g.getClass();
        o(new lku0(bbv0.a.f().a.c));
        k();
    }

    @Override // xsna.kku0
    public final void d(VkCheckoutPayMethod vkCheckoutPayMethod, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("method", vkCheckoutPayMethod);
        bundle.putString(CommonCode.MapKey.TRANSACTION_ID, str);
        bundle.putString("backstack_tag", str2);
        bpk0 bpk0Var = new bpk0();
        bpk0Var.setArguments(bundle);
        n(bpk0Var, null);
    }

    @Override // xsna.kku0
    public final void e(WalletPayMethod walletPayMethod) {
        Activity h;
        ebv0 ebv0Var = this.a.get();
        Context requireContext = ebv0Var != null ? ebv0Var.requireContext() : null;
        HashSet hashSet = iah0.a;
        if (!fnj.b(requireContext) && (h = e3m.h(requireContext)) != null) {
            h.setRequestedOrientation(1);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("pay_method", walletPayMethod);
        as90 as90Var = new as90();
        as90Var.setArguments(bundle);
        n(as90Var, "as90");
    }

    @Override // xsna.kku0
    public final void f(Status status, CheckoutStatusFragment.OnBackPressedListener onBackPressedListener) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("status", status);
        bundle.putSerializable("on_back_listener", onBackPressedListener);
        CheckoutStatusFragment checkoutStatusFragment = new CheckoutStatusFragment();
        checkoutStatusFragment.setArguments(bundle);
        n(checkoutStatusFragment, null);
    }

    @Override // xsna.kku0
    public final void g() {
        n(new mma0(), null);
    }

    @Override // xsna.kku0
    public final void h(PaymentData3DS paymentData3DS, String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", paymentData3DS);
        bundle.putString("backstack_tag", str);
        n2c n2cVar = new n2c();
        n2cVar.setArguments(bundle);
        n(n2cVar, null);
    }

    @Override // xsna.kku0
    public final void i() {
        ebv0 ebv0Var = this.a.get();
        if (ebv0Var != null) {
            if (ebv0Var.getChildFragmentManager().K() > 1) {
                ebv0Var.An(ebv0Var.getChildFragmentManager().K() - 1 <= 1);
                ebv0Var.getChildFragmentManager().Y();
            } else {
                ebv0Var.getChildFragmentManager().Y();
                ebv0Var.Mn();
            }
        }
        p();
    }

    @Override // xsna.kku0
    public final void j(String str) {
        ebv0 ebv0Var = this.a.get();
        FragmentManager childFragmentManager = ebv0Var != null ? ebv0Var.getChildFragmentManager() : null;
        if (childFragmentManager != null) {
            childFragmentManager.Z(-1, 0, str);
        }
        p();
    }

    public final void k() {
        FragmentActivity activity;
        bbv0.g.getClass();
        bbv0 bbv0Var = bbv0.h;
        if (bbv0Var != null) {
            try {
                ebv0 ebv0Var = bbv0Var.c.get();
                if (ebv0Var != null) {
                    ebv0Var.tn();
                }
            } catch (Exception unused) {
            }
        }
        bbv0.h = null;
        ebv0 ebv0Var2 = this.a.get();
        if (ebv0Var2 == null || (activity = ebv0Var2.getActivity()) == null) {
            return;
        }
        activity.setRequestedOrientation(this.b);
    }

    public final void l() {
        iku0 hku0Var;
        bbv0.g.getClass();
        String str = bbv0.a.f().a.c;
        if (bbv0.a.f().f) {
            hku0Var = new lku0(str);
        } else {
            bbv0.a.f().e.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.FAILED);
            hku0Var = new hku0(str, new hku0.a(gku0.d.b));
        }
        o(hku0Var);
        k();
    }

    public final void m(gku0 gku0Var) {
        hku0.a aVar = new hku0.a(gku0Var);
        bbv0.g.getClass();
        o(new hku0(bbv0.a.f().a.c, aVar));
        k();
    }

    public final void n(gi6 gi6Var, String str) {
        ebv0 ebv0Var = this.a.get();
        if (ebv0Var != null) {
            ebv0Var.An(ebv0Var.getChildFragmentManager().K() + 1 <= 1);
            FragmentManager childFragmentManager = ebv0Var.getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
            Fragment fragment = (Fragment) j5g.b0(0, ebv0Var.getChildFragmentManager().c.f());
            View view = fragment != null ? fragment.getView() : null;
            if (view == null) {
                bbv0.g.getClass();
                bbv0.a.d("Fragment " + gi6Var + " doesn't have a view");
            }
            if (view != null) {
                aVar.c(view, view.getTransitionName());
                gi6Var.setSharedElementEnterTransition(new x88());
                aVar.r = true;
            }
            aVar.g(R.id.fragment_container, gi6Var, str);
            aVar.d(str);
            aVar.k(false);
        }
    }

    public final void p() {
        FragmentManager childFragmentManager;
        List<Fragment> f;
        Fragment fragment;
        ebv0 ebv0Var = this.a.get();
        if (ebv0Var == null || (childFragmentManager = ebv0Var.getChildFragmentManager()) == null || (f = childFragmentManager.c.f()) == null || (fragment = (Fragment) j5g.a0(f)) == null) {
            return;
        }
        if (j5g.P(this.d, fragment.getClass())) {
            bbv0.g.getClass();
            bbv0.a.f().e.a.b(null);
        }
        if (j5g.P(this.c, fragment.getClass())) {
            return;
        }
        bbv0.g.getClass();
        bbv0.a.f().e.a.d = new ten0(null);
    }
}
