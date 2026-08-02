package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.vk.dto.common.id.UserId;
import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import com.vk.profile.user.api.domain.onboarding.analytics.OnBoardingType;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a080;
import xsna.mk50;
import xsna.o080;
import xsna.xn50;
import xsna.z180;

/* compiled from: OldUserOnBoardingBottomSheet.kt */
/* loaded from: classes5.dex */
public final class b080 extends tl50<c080, o080, a080> {
    public static final /* synthetic */ qcy<Object>[] q1 = {new MutablePropertyReference1Impl(b080.class, "contentView", "getContentView()Lcom/vk/profile/core/onboarding/mvi/view/OldUserOnBoardingStateContentView;", 0), p5j.a(0, b080.class, "bottomView", "getBottomView()Lcom/vk/profile/core/onboarding/mvi/view/OldUserOnBoardingStateBottomView;", fpf0.a), new MutablePropertyReference1Impl(b080.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", 0)};
    public b o1;
    public final nf3 i1 = new nf3();
    public final nf3 j1 = new nf3();
    public final nf3 k1 = new nf3();
    public final bpn0 l1 = new bpn0(new ag20(this, 16));
    public final bpn0 m1 = new bpn0(new yu60(this, 3));
    public final bpn0 n1 = new bpn0(new m1y(this, 20));
    public final bpn0 p1 = new bpn0(new x750(this, 6));

    /* compiled from: OldUserOnBoardingBottomSheet.kt */
    public static final class a extends kmu0 {
        public final ContentHintOnboardingResource h;
        public final String i;
        public final boolean j;
        public final String k;
        public final boolean l;
        public final OnBoardingType m;
        public final UserId n;
        public final b o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ContentHintOnboardingResource contentHintOnboardingResource, String str, boolean z, boolean z2, OnBoardingType onBoardingType, UserId userId, c cVar, int i) {
            super(context, tzp0.a(null, 3));
            cVar = (i & 256) != 0 ? null : cVar;
            this.h = contentHintOnboardingResource;
            this.i = str;
            this.j = z;
            this.k = "ONBOARDING_KEY";
            this.l = z2;
            this.m = onBoardingType;
            this.n = userId;
            this.o = cVar;
            x(0);
            F0(true);
            B(cn70.b(20), true, true);
            c(new cpo(false, 0, 7));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b080 b080Var = new b080();
            b080Var.setArguments(yfb.b(new Pair("VIDEO_HINT_KEY", this.h), new Pair("HINT_ID", this.i), new Pair("CLOSE_BNT_KEY", Boolean.valueOf(this.j)), new Pair("ONBOARDING_KEY", this.k), new Pair("SUCCESS_ON_SHOW_KEY", Boolean.valueOf(this.l)), new Pair(CredentialProviderBaseController.TYPE_TAG, this.m), new Pair("UID", this.n)));
            b080Var.o1 = this.o;
            return b080Var;
        }
    }

    /* compiled from: OldUserOnBoardingBottomSheet.kt */
    public interface b {
        void a();

        void b(Bundle bundle);

        void c(int i);

        void onClose();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        boolean z = requireArguments().getBoolean("CLOSE_BNT_KEY", false);
        qcy<Object>[] qcyVarArr = q1;
        l080 l080Var = new l080((xqi) this.k1.getValue(this, qcyVarArr[2]), requireContext(), this, null, z, 24);
        qcy<Object> qcyVar = qcyVarArr[0];
        this.i1.c = l080Var;
        this.e0 = new y180(bo().d);
        return new mk50.c(bo().d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        o080 o080Var = (o080) ao50Var;
        if (requireArguments().getBoolean("SUCCESS_ON_SHOW_KEY")) {
            getFeature().l.b(new z180.a(false, (String) this.l1.getValue()));
        }
        bo().f(o080Var, new ow4(1, this, b080.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((c080) vk50Var).l.a(new o010(this, 21), this);
    }

    @Override // xsna.tl50
    public final void Yn(o080 o080Var, View view) {
        ((j080) this.j1.getValue(this, q1[1])).f(o080Var, new s8(1, this, b080.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 12));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        qcy<Object>[] qcyVarArr = q1;
        j080 j080Var = new j080((xqi) this.k1.getValue(this, qcyVarArr[2]), requireContext(), this);
        qcy<Object> qcyVar = qcyVarArr[1];
        nf3 nf3Var = this.j1;
        nf3Var.c = j080Var;
        return new mk50.c(((j080) nf3Var.getValue(this, qcyVar)).d);
    }

    public final l080 bo() {
        return (l080) this.i1.getValue(this, q1[0]);
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            ((j080) this.j1.getValue(this, q1[1])).d.requestLayout();
            bo().d.requestLayout();
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            hide();
        }
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        xn50.a.c(this, new a080.a(true));
        b bVar = this.o1;
        if (bVar != null) {
            bVar.onClose();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Bundle arguments = getArguments();
        ContentHintOnboardingResource contentHintOnboardingResource = arguments != null ? (ContentHintOnboardingResource) arguments.getParcelable("VIDEO_HINT_KEY") : null;
        if (contentHintOnboardingResource == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c080 c080Var = new c080(new a080.d(contentHintOnboardingResource), ((w180) this.p1.getValue()).a((OnBoardingType) this.m1.getValue()), new ujg(requireContext()), (String) this.l1.getValue());
        xqi xqiVar = new xqi(o080.a.C3430a.a, this, Collections.singletonList(((o080) c080Var.c.g()).a));
        qcy<Object> qcyVar = q1[2];
        this.k1.c = xqiVar;
        return c080Var;
    }

    /* compiled from: OldUserOnBoardingBottomSheet.kt */
    public static final class c implements b {
        public final ie90 a;

        public c(ie90 ie90Var) {
            this.a = ie90Var;
        }

        @Override // xsna.b080.b
        public final void b(Bundle bundle) {
            ie90 ie90Var = this.a;
            if (ie90Var != null) {
                ie90Var.invoke(bundle);
            }
        }

        @Override // xsna.b080.b
        public final void a() {
        }

        @Override // xsna.b080.b
        public final void onClose() {
        }

        @Override // xsna.b080.b
        public final void c(int i) {
        }
    }
}
