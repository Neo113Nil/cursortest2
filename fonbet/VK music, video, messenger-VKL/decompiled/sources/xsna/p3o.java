package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.i3o;
import xsna.mk50;

/* compiled from: DonutTeaserModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class p3o extends tl50<n3o, y3o, i3o> implements w8i {
    public static final /* synthetic */ qcy<Object>[] j1;
    public final nf3 i1 = new nf3();

    /* compiled from: DonutTeaserModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final String h;
        public final String i;

        public a(Context context, String str, String str2) {
            super(context, tzp0.a(null, 1));
            this.h = str;
            this.i = str2;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            cpo cpoVar = new cpo(false, 0, 5);
            cpoVar.e = cn70.b(Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
            c(cpoVar);
            F0(true);
            x(0);
            B(cn70.c(12), true, true);
            p3o p3oVar = new p3o();
            Bundle a = yfb.a();
            a.putString("arg_donut_teaser_text", this.h);
            a.putString("arg_default_donut_teaser_text", this.i);
            p3oVar.setArguments(a);
            return p3oVar;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(p3o.class, "contentView", "getContentView()Lcom/vk/newsfeed/posting/donut_teaser/presentation/DonutTeaserContentView;", 0);
        fpf0.a.getClass();
        j1 = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        m3o m3oVar = new m3o(requireContext(), this);
        qcy<Object> qcyVar = j1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = m3oVar;
        return new mk50.c(((m3o) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((m3o) this.i1.getValue(this, j1[0])).f((y3o) ao50Var, new ee8(1, this, p3o.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((n3o) vk50Var).f.a(new eqd(this, 16), this);
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        getFeature().C(i3o.d.b);
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new n3o(bundle.getString("arg_donut_teaser_text"), bundle.getString("arg_default_donut_teaser_text", ""));
    }
}
