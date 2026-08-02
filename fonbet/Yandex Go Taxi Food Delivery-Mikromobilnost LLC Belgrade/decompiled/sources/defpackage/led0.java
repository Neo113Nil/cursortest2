package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.pay.ui.core.mobile.view.payment.methods.PlusPayPaymentMethodsView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class led0 {
    public static final /* synthetic */ kgx[] g = {new PropertyReference1Impl("progressView", 0, "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", led0.class), b64.x(qoi0.a, led0.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("methodsRecyclerView", 0, "getMethodsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", led0.class), new PropertyReference1Impl("promosRecyclerView", 0, "getPromosRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", led0.class)};
    public final wv5 a;
    public final wv5 b;
    public final wv5 c;
    public final wv5 d;
    public final e9a0 e;
    public final yha0 f;

    public led0(PlusTheme plusTheme, PlusPayPaymentMethodsView plusPayPaymentMethodsView, b5d0 b5d0Var, gv40 gv40Var, gv40 gv40Var2) {
        fnb0 fnb0Var = new fnb0(23);
        this.a = new wv5(new ged0(plusPayPaymentMethodsView, y9h0.payment_methods_progress_view, 3));
        this.b = new wv5(new ged0(plusPayPaymentMethodsView, y9h0.payment_methods_title, 4));
        wv5 wv5Var = new wv5(new ged0(plusPayPaymentMethodsView, y9h0.payment_methods_recycler, 5));
        this.c = wv5Var;
        wv5 wv5Var2 = new wv5(new ged0(plusPayPaymentMethodsView, y9h0.payment_promos_recycler, 6));
        this.d = wv5Var2;
        boolean z = plusPayPaymentMethodsView.getContext().getResources().getBoolean(nog0.pay_sdk_isTabletMode);
        e9a0 e9a0Var = new e9a0(plusTheme, b5d0Var, gv40Var, (tls) fnb0Var);
        this.e = e9a0Var;
        yha0 yha0Var = new yha0(z, plusTheme, b5d0Var, gv40Var2);
        this.f = yha0Var;
        kgx[] kgxVarArr = g;
        ((RecyclerView) wv5Var.a(kgxVarArr[2])).setAdapter(e9a0Var);
        ((RecyclerView) wv5Var.a(kgxVarArr[2])).setItemAnimator(null);
        ((RecyclerView) wv5Var2.a(kgxVarArr[3])).setItemAnimator(null);
        RecyclerView recyclerView = (RecyclerView) wv5Var2.a(kgxVarArr[3]);
        if (!z) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
            linearLayoutManager.c2(true);
            linearLayoutManager.d2(true);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        recyclerView.addItemDecoration(new rha0(z));
        recyclerView.setAdapter(yha0Var);
    }
}
