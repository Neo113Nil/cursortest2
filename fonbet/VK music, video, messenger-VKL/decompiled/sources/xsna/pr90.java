package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vkontakte.android.R;
import xsna.icl;
import xsna.iv9;
import xsna.or90;

/* compiled from: PayMethodConfirmationFragment.kt */
/* loaded from: classes6.dex */
public abstract class pr90<T extends PayMethodData, P extends or90> extends jrz<P> {
    public RecyclerView l;
    public final vlp0 k = new l3c().excludeChildren(R.id.vk_checkout_confirmation_recycler, true);
    public final bpn0 m = new bpn0(new b290(this, 1));
    public final bpn0 n = new bpn0(new in60(this, 5));

    /* compiled from: PayMethodConfirmationFragment.kt */
    public static final class a {
        public final Bundle a = new Bundle();
        public PayMethodData b;
    }

    /* compiled from: PayMethodConfirmationFragment.kt */
    public static class b implements icl.a {
        public final or90 a;

        public b(or90 or90Var) {
            this.a = or90Var;
        }

        @Override // xsna.osa.a
        public final void a() {
            or90 or90Var = this.a;
            if (or90Var != null) {
                or90Var.x0();
            }
        }

        @Override // xsna.hv9.a
        public final void c(iv9.a aVar) {
            xgx0.a.getClass();
            xgx0.a("onPromoClicked called with " + aVar);
        }

        @Override // xsna.zb.a
        public final void d() {
            or90 or90Var = this.a;
            if (or90Var != null) {
                or90Var.S1();
            }
        }

        @Override // xsna.em7.a
        public final void g(boolean z) {
            or90 or90Var = this.a;
            if (or90Var != null) {
                or90Var.g(z);
            }
        }
    }

    public abstract P An(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.uhv0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        this.h = An((PayMethodData) (arguments != null ? arguments.getSerializable("pay_method_data") : null));
    }

    @Override // xsna.jrz, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.vk_pay_checkout_method_confirmation_fragment, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vk_checkout_confirmation_recycler);
        this.l = recyclerView;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(wn());
        gpu0 gpu0Var = new gpu0(requireContext());
        gpu0Var.j = wn();
        gpu0Var.c = R.attr.vk_legacy_separator_common;
        gpu0Var.Ng();
        RecyclerView recyclerView3 = this.l;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(gpu0Var);
        RecyclerView recyclerView4 = this.l;
        (recyclerView4 != null ? recyclerView4 : null).addItemDecoration(new tgk0());
        return inflate;
    }

    public final icl wn() {
        return (icl) this.n.getValue();
    }

    public icl.a xn() {
        return (icl.a) this.m.getValue();
    }

    public abstract String yn();

    public icl zn() {
        return new icl(xn());
    }
}
