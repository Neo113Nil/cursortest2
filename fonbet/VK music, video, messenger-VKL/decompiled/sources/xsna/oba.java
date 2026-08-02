package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a080;
import xsna.mk50;
import xsna.o080;

/* compiled from: CatalogOnboardingBottomSheet.kt */
/* loaded from: classes5.dex */
public final class oba extends tl50<qba, o080, a080> {
    public static final /* synthetic */ qcy<Object>[] l1 = {new MutablePropertyReference1Impl(oba.class, "contentView", "getContentView()Lcom/vk/profile/core/onboarding/mvi/view/OldUserOnBoardingStateContentView;", 0), p5j.a(0, oba.class, "bottomView", "getBottomView()Lcom/vk/profile/core/onboarding/mvi/view/OldUserOnBoardingStateBottomView;", fpf0.a), new MutablePropertyReference1Impl(oba.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", 0)};
    public final nf3 i1 = new nf3();
    public final nf3 j1 = new nf3();
    public final nf3 k1 = new nf3();

    /* compiled from: CatalogOnboardingBottomSheet.kt */
    public static final class a extends kmu0 {
        public final ContentHintOnboardingResource h;

        public a(Context context, ContentHintOnboardingResource contentHintOnboardingResource, vq6 vq6Var) {
            super(context, tzp0.a(null, 3));
            this.h = contentHintOnboardingResource;
            x(0);
            F0(true);
            B(cn70.b(20), true, true);
            c(new cpo(false, 0, 7));
            a0(vq6Var);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            oba obaVar = new oba();
            obaVar.setArguments(yfb.b(new Pair("VIDEO_RESOURCES", this.h)));
            return obaVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qcy<Object>[] qcyVarArr = l1;
        l080 l080Var = new l080((xqi) this.k1.getValue(this, qcyVarArr[2]), requireContext(), this, new frv0(new nmo0(0L, 0L, b6s.j, u4s.b, 0L, null, null, 0, 0L, null, null, 0, 16777179), 2), false, 32);
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = l080Var;
        this.e0 = new y180(((l080) nf3Var.getValue(this, qcyVar)).c());
        return new mk50.c(((l080) nf3Var.getValue(this, qcyVarArr[0])).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((l080) this.i1.getValue(this, l1[0])).f((o080) ao50Var, new pba(1, this, oba.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((qba) vk50Var).f.a(new kf1(this, 9), this);
    }

    @Override // xsna.tl50
    public final void Yn(o080 o080Var, View view) {
        ((j080) this.j1.getValue(this, l1[1])).f(o080Var, new com.vk.channels.impl.channel_screen.send_msg.e(1, this, oba.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 3));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        qcy<Object>[] qcyVarArr = l1;
        j080 j080Var = new j080((xqi) this.k1.getValue(this, qcyVarArr[2]), requireContext(), this);
        qcy<Object> qcyVar = qcyVarArr[1];
        nf3 nf3Var = this.j1;
        nf3Var.c = j080Var;
        return new mk50.c(((j080) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Bundle arguments = getArguments();
        ContentHintOnboardingResource contentHintOnboardingResource = arguments != null ? (ContentHintOnboardingResource) arguments.getParcelable("VIDEO_RESOURCES") : null;
        if (contentHintOnboardingResource == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        qba qbaVar = new qba(new a080.d(contentHintOnboardingResource));
        xqi xqiVar = new xqi(o080.a.C3430a.a, this, Collections.singletonList(((o080) qbaVar.c.g()).a));
        qcy<Object> qcyVar = l1[2];
        this.k1.c = xqiVar;
        return qbaVar;
    }
}
