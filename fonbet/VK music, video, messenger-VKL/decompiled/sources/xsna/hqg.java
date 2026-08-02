package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.mk50;

/* compiled from: CommunityAddDescriptionBottomSheet.kt */
/* loaded from: classes5.dex */
public final class hqg extends tl50<iqg, sqg, fqg> {
    public static final /* synthetic */ int k1 = 0;
    public rqg i1;
    public z63 j1;

    /* compiled from: CommunityAddDescriptionBottomSheet.kt */
    public static final class a extends dw20.b {
        public final z63 e;

        public a(Context context, z63 z63Var) {
            super(context, tzp0.a(null, 3));
            this.e = z63Var;
            c(new cpo(false, 0, 7));
            B(cn70.c(12), true, false);
            x(0);
            w0(context.getString(R.string.community_add_description_bs_title));
            t();
            I(true);
            K();
            this.d.p0 = new gqg((byte) 0, 0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            hqg hqgVar = new hqg();
            hqgVar.j1 = this.e;
            return hqgVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        rqg rqgVar = new rqg(requireContext(), this);
        vq.b(-1, -2, rqgVar.d);
        this.i1 = rqgVar;
        return new mk50.c(rqgVar.c());
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        sqg sqgVar = (sqg) ao50Var;
        rqg rqgVar = this.i1;
        if (rqgVar == null) {
            rqgVar = null;
        }
        rqgVar.f(sqgVar, new jnb(1, this, hqg.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 3));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((iqg) vk50Var).f.a(new q99(1, this, hqg.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/profile/community/details/impl/description/CommunityAddDescriptionSideEffect;)V", 0, 1), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new iqg();
    }
}
