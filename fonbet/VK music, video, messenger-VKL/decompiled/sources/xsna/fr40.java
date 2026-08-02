package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.music.bottomsheets.di.RecommendationOnboardingComponent;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import com.vk.music.bottomsheets.onboarding.presentation.model.OnboardingInfo;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ad80;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.xn50;

/* compiled from: MusicOnboardingModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final class fr40 extends tl50<kd80, gi80, ad80> implements w8i {
    public static final /* synthetic */ int j1 = 0;
    public kh80 i1;

    /* compiled from: MusicOnboardingModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final Bundle e;

        public a(Activity activity, OnboardingInfo onboardingInfo, String str) {
            super(activity, null);
            this.e = yfb.b(new Pair("KEY_ONBOARDING_INFO", onboardingInfo), new Pair("KEY_REQUEST_ID", str));
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            fr40 fr40Var = new fr40();
            fr40Var.setArguments(this.e);
            return fr40Var;
        }
    }

    /* compiled from: MusicOnboardingModalBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ad80, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ad80 ad80Var) {
            fr40 fr40Var = (fr40) this.receiver;
            fr40Var.getClass();
            xn50.a.c(fr40Var, ad80Var);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        b bVar = new b(1, this, fr40.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        Bundle arguments = getArguments();
        this.i1 = new kh80(requireContext, this, bVar, arguments != null ? arguments.getString("KEY_REQUEST_ID") : null);
        kh80 kh80Var = this.i1;
        if (kh80Var == null) {
            kh80Var = null;
        }
        this.e0 = new jgj(kh80Var.f, 0, cn70.b(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE), 42);
        kh80 kh80Var2 = this.i1;
        return new mk50.c((kh80Var2 != null ? kh80Var2 : null).f);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((gi80) ao50Var).a, new px30(this, 4));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((kd80) vk50Var).g.a(new wq20(this, 5), this);
    }

    public final OnboardingInfo bo() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("KEY_ONBOARDING_INFO", OnboardingInfo.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("KEY_ONBOARDING_INFO");
                if (!(parcelable3 instanceof OnboardingInfo)) {
                    parcelable3 = null;
                }
                parcelable = (OnboardingInfo) parcelable3;
            }
            OnboardingInfo onboardingInfo = (OnboardingInfo) parcelable;
            if (onboardingInfo != null) {
                return onboardingInfo;
            }
        }
        throw new IllegalStateException("KEY_ONBOARDING_INFO is required");
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        AudioOnboardingScenarioType audioOnboardingScenarioType = bo().b;
        Bundle arguments = getArguments();
        xn50.a.c(this, new ad80.a(audioOnboardingScenarioType, arguments != null ? arguments.getString("KEY_REQUEST_ID") : null));
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new kd80(new jh80(new xh80(bo())), ((RecommendationOnboardingComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(RecommendationOnboardingComponent.class))).W7());
    }
}
