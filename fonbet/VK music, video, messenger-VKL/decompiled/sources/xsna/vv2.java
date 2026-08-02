package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.antispam.SpammerModel;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.bw2;
import xsna.iw2;
import xsna.mk50;

/* compiled from: AntispamBottomSheet.kt */
/* loaded from: classes14.dex */
public final class vv2 extends tl50<zv2, iw2, sv2> {
    public static final /* synthetic */ int j1 = 0;
    public hw2 i1;

    /* compiled from: AntispamBottomSheet.kt */
    public static final class a extends kmu0 {
        public final SpammerModel h;
        public final String i;

        public a(Context context, SpammerModel spammerModel) {
            super(context, tzp0.a(null, 3));
            this.h = spammerModel;
            this.i = "antispam_modal_request_key";
            x(0);
            F0(true);
            B(iah0.a(12), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            vv2 vv2Var = new vv2();
            vv2Var.setArguments(yfb.b(new Pair("spam_actions_request_key", this.i), new Pair("spammer_key", this.h)));
            return vv2Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        SpammerModel bo = bo();
        String str = bo.b;
        List O0 = j5g.O0(bo.c.b);
        boolean z = bo.f;
        Peer peer = bo.d;
        yr5 yr5Var = new yr5(str, O0, z, peer, bo.e);
        ArrayList a2 = bw2.a.a(peer.c);
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(gw2.a((lhk0) it.next(), bo.b));
        }
        hw2 hw2Var = new hw2(requireContext, this, new iw2.a.b(yr5Var, arrayList));
        this.i1 = hw2Var;
        return new mk50.c(hw2Var.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        iw2 iw2Var = (iw2) ao50Var;
        hw2 hw2Var = this.i1;
        if (hw2Var != null) {
            hw2Var.f(iw2Var, new xv2(1, this, vv2.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((zv2) vk50Var).f.a(new wv2(1, this, vv2.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/antispam/mvi/AntispamSideEffect;)V", 0, 0), this);
    }

    public final SpammerModel bo() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("spammer_key", SpammerModel.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("spammer_key");
            if (!(parcelable3 instanceof SpammerModel)) {
                parcelable3 = null;
            }
            parcelable = (SpammerModel) parcelable3;
        }
        if (parcelable != null) {
            return (SpammerModel) parcelable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new zv2(bo());
    }
}
