package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.bridges.di.BridgeComponent;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.dw20;
import xsna.mk50;

/* compiled from: ModerationConfirmAdultDialog.kt */
/* loaded from: classes18.dex */
public final class l430 extends tl50<m430, y430, k430> implements w8i {
    public static final /* synthetic */ qcy<Object>[] l1;
    public final nf3 i1 = new nf3();
    public gzs<s3q0> j1;
    public gzs<s3q0> k1;

    /* compiled from: ModerationConfirmAdultDialog.kt */
    public static final class a extends dw20.b {
        public final boolean e;
        public gzs<s3q0> f;
        public gzs<s3q0> g;

        public a(Context context, boolean z) {
            super(context, null);
            this.e = z;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            l430 l430Var = new l430();
            l430Var.j1 = this.f;
            l430Var.k1 = this.g;
            l430Var.setArguments(yfb.b(new Pair("force_dark_theme", Boolean.valueOf(this.e))));
            return l430Var;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(l430.class, "contentView", "getContentView()Lcom/vk/ecomm/moderation/impl/restrictions/dialogs/confirm/ModerationConfirmAdultView;", 0);
        fpf0.a.getClass();
        l1 = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        x430 x430Var = new x430(requireContext(), this, requireArguments().getBoolean("force_dark_theme"));
        qcy<Object> qcyVar = l1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = x430Var;
        return new mk50.c(((x430) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((x430) this.i1.getValue(this, l1[0])).f((y430) ao50Var, new lp1(1, this, l430.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((m430) vk50Var).f.a(new j9k(this, 28), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new m430(new r430(new t430(false)), ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).s());
    }
}
