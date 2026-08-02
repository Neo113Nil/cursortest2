package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;
import xsna.oe10;
import xsna.tzp0;
import xsna.ve10;

/* compiled from: MarketShopConditionsBottomSheet.kt */
/* loaded from: classes18.dex */
public final class ee10 extends tl50<he10, ve10, ce10> {
    public static final /* synthetic */ qcy<Object>[] q1 = {new MutablePropertyReference1Impl(ee10.class, "contentView", "getContentView()Lcom/vk/ecomm/shop_conditions/impl/ui/dovdialog/presentation/compose/MarketShopConditionsView;", 0), p5j.a(0, ee10.class, "bottomContentView", "getBottomContentView()Lcom/vk/ecomm/shop_conditions/impl/ui/dovdialog/presentation/compose/MarketShopConditionsBottomView;", fpf0.a), new MutablePropertyReference1Impl(ee10.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", 0)};
    public final ComposeView i1;
    public final ComposeView j1;
    public final nf3 k1 = new nf3();
    public final nf3 l1 = new nf3();
    public final nf3 m1 = new nf3();
    public final Object n1;
    public final Object o1;
    public final ebx p1;

    /* compiled from: MarketShopConditionsBottomSheet.kt */
    public static final class a extends kmu0 {
        public final UserId h;
        public final Long i;

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
        public a(Context context, UserId userId, Long l) {
            super(context, new tzp0.c.a(new lej0(), false));
            this.h = userId;
            this.i = l;
            T0();
            ((ComposeView) this.f.getValue()).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            c(new kej0(S0(), (ComposeView) this.f.getValue()));
            F0(true);
            x(0);
            B(iah0.b(12.0f), false, true);
            D();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ee10 ee10Var = new ee10(S0(), (ComposeView) this.f.getValue());
            ee10Var.setArguments(yfb.b(new Pair("extra_user_id", this.h), new Pair("extra_item_id", this.i)));
            return ee10Var;
        }
    }

    public ee10(ComposeView composeView, ComposeView composeView2) {
        this.i1 = composeView;
        this.j1 = composeView2;
        fgm fgmVar = new fgm(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.n1 = msy.a(lazyThreadSafetyMode, fgmVar);
        this.o1 = msy.a(lazyThreadSafetyMode, new hvz(this, 4));
        this.p1 = new ebx(this, 5);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qcy<Object>[] qcyVarArr = q1;
        te10 te10Var = new te10(this.i1, (xqi) this.m1.getValue(this, qcyVarArr[2]), this, requireContext());
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.k1;
        nf3Var.c = te10Var;
        return new mk50.c(((te10) nf3Var.getValue(this, qcyVar)).f);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((te10) this.k1.getValue(this, q1[0])).f((ve10) ao50Var, new wg1(1, this, ee10.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 13));
    }

    @Override // xsna.tl50
    public final void Yn(ve10 ve10Var, View view) {
        ((fe10) this.l1.getValue(this, q1[1])).f(ve10Var, new gl6(1, this, ee10.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        qcy<Object>[] qcyVarArr = q1;
        fe10 fe10Var = new fe10(this.j1, (xqi) this.m1.getValue(this, qcyVarArr[2]), this, requireContext());
        qcy<Object> qcyVar = qcyVarArr[1];
        nf3 nf3Var = this.l1;
        nf3Var.c = fe10Var;
        return new mk50.c(((fe10) nf3Var.getValue(this, qcyVar)).f);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int f = e3m.f(R.attr.vk_ui_background_modal, this.A0 == -1 ? requireContext() : new lpj(requireContext(), this.A0));
        kn().getWindow().addFlags(Integer.MIN_VALUE);
        kn().getWindow().setNavigationBarColor(f);
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("extra_user_id")) == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        Bundle arguments2 = getArguments();
        Long valueOf = arguments2 != null ? Long.valueOf(arguments2.getLong("extra_item_id")) : null;
        ie10 ie10Var = new ie10(requireContext(), (maz) this.n1.getValue(), this.p1);
        ke10 ke10Var = new ke10(oe10.c.b);
        he10 he10Var = new he10(ke10Var, userId2, valueOf, ie10Var, new le10((sdz) this.o1.getValue()));
        VS vs = ke10Var.b;
        xqi xqiVar = new xqi(ve10.a.c.a, this, e43.l(((ve10) vs).a, ((ve10) vs).c, ((ve10) vs).b));
        qcy<Object> qcyVar = q1[2];
        this.m1.c = xqiVar;
        return he10Var;
    }
}
