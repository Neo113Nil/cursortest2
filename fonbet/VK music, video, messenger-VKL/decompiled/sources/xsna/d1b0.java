package xsna;

import android.os.Bundle;
import android.view.View;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.c1b0;
import xsna.k840;
import xsna.mk50;
import xsna.ztp;

/* compiled from: PlayerEqualizerSettingsMviBottomSheet.kt */
/* loaded from: classes3.dex */
public final class d1b0 extends tl50<b1b0, n1b0, c1b0> {
    public static final /* synthetic */ qcy<Object>[] l1;
    public final nf3 i1 = new nf3();
    public final l1b0 j1 = new l1b0(new m1b0(false, -1000, 1000, e43.l(0, 0, 0, 0, 0), e43.l(0, 0, 0, 0, 0), ztp.j.d));
    public final Object k1 = msy.a(LazyThreadSafetyMode.NONE, new bi80(this, 4));

    /* compiled from: PlayerEqualizerSettingsMviBottomSheet.kt */
    public static final class a extends kmu0 {
        public boolean h;

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            d1b0 d1b0Var = new d1b0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("FORCE_DARK_THEME", this.h);
            d1b0Var.setArguments(bundle);
            return d1b0Var;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(d1b0.class, "contentView", "getContentView()Lcom/vk/music/bottomsheets/equalizer/PlayerEqualizerSettingsMviView;", 0);
        fpf0.a.getClass();
        l1 = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        i1b0 i1b0Var = new i1b0(this, requireContext(), requireArguments().getBoolean("FORCE_DARK_THEME", false));
        qcy<Object> qcyVar = l1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = i1b0Var;
        return new mk50.c(((i1b0) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((i1b0) this.i1.getValue(this, l1[0])).f((n1b0) ao50Var, new bi6(1, this, d1b0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9));
    }

    @Override // xsna.tl50, xsna.xn50
    public final /* bridge */ /* synthetic */ void R4(vk50 vk50Var) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        c1b0.c cVar = c1b0.c.b;
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        return new b1b0(cVar, this.j1, s750Var, (otp) this.k1.getValue());
    }
}
