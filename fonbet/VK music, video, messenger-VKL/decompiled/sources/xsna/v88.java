package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.video.polls.di.UxPollsComponent;
import com.vk.video.polls.di.UxPollsComponentImpl;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.polls.entrypoint.model.UxPollType;
import com.vk.video.polls.nav.PollNavParams;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.dw20;
import xsna.xn50;
import xsna.xrb0;

/* compiled from: BottomSheetPollFragment.kt */
/* loaded from: classes6.dex */
public abstract class v88 extends tl50<bqb0, ctb0, xrb0> {
    public static final /* synthetic */ int m1 = 0;
    public final f4z<pqb0> i1 = new f4z<>();
    public PollNavParams j1;
    public VkButton k1;
    public View l1;

    /* compiled from: BottomSheetPollFragment.kt */
    public static abstract class a extends dw20.b {
        public PollNavParams e;

        public final Bundle S0() {
            PollNavParams pollNavParams = this.e;
            if (pollNavParams != null) {
                return yfb.b(new Pair("key_nav_args", pollNavParams));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: BottomSheetPollFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UxPollType.values().length];
            try {
                iArr[UxPollType.DiscoveryPoll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UxPollType.RecommendationsPoll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        this.i1.a(new l00(this, 10), this);
    }

    @Override // xsna.tl50
    public /* bridge */ /* synthetic */ void Yn(ctb0 ctb0Var, View view) {
        eo(view);
    }

    public abstract dtb0 bo(UxPoll uxPoll);

    public final UxPollEntryPoint co() {
        PollNavParams pollNavParams = this.j1;
        if (pollNavParams == null) {
            pollNavParams = null;
        }
        return pollNavParams.b;
    }

    public void eo(View view) {
        VkButton vkButton = (VkButton) view.findViewById(R.id.poll_action_button);
        fo(vkButton);
        this.k1 = vkButton;
        View findViewById = view.findViewById(R.id.poll_action_button_underlay);
        PollNavParams pollNavParams = this.j1;
        if (pollNavParams == null) {
            pollNavParams = null;
        }
        int f = e3m.f(R.attr.vk_ui_background_modal, dhr0.q0(pollNavParams.e));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iah0.b(8.0f));
        gradientDrawable.setColor(ColorStateList.valueOf(f));
        findViewById.setBackground(gradientDrawable);
        this.l1 = findViewById;
        cxu0 cxu0Var = cxu0.a;
        Context context = view.getContext();
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        cxu0Var.getClass();
        GradientDrawable b2 = cxu0.b(orientation, context);
        b2.setCornerRadii(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.b(8.0f), iah0.b(8.0f), iah0.b(8.0f), iah0.b(8.0f)});
        view.setBackground(b2);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("key_nav_args", PollNavParams.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("key_nav_args");
                if (!(parcelable3 instanceof PollNavParams)) {
                    parcelable3 = null;
                }
                parcelable = (PollNavParams) parcelable3;
            }
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.j1 = (PollNavParams) parcelable;
        }
        super.onCreate(bundle);
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        xn50.a.c(this, xrb0.b.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        boolean z;
        UxPollsComponentImpl uxPollsComponentImpl = (UxPollsComponentImpl) ((UxPollsComponent) m7m.d(this).a(fpf0.a(UxPollsComponent.class)));
        UxPollEntryPointLocation.a aVar = UxPollEntryPointLocation.Companion;
        UxPollEntryPointLocation uxPollEntryPointLocation = co().c;
        aVar.getClass();
        int i = b.$EnumSwitchMapping$0[UxPollEntryPointLocation.a.a(uxPollEntryPointLocation).ordinal()];
        if (i == 1) {
            z = false;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        UxPoll uxPoll = co().b;
        PollNavParams pollNavParams = this.j1;
        if (pollNavParams == null) {
            pollNavParams = null;
        }
        Map<Integer, PollAnswer> map = pollNavParams.d;
        frb0 frb0Var = new frb0(bo(co().b));
        nwy nwyVar = uxPollsComponentImpl.e;
        qcy<Object>[] qcyVarArr = UxPollsComponentImpl.i;
        qcy<Object> qcyVar = qcyVarArr[1];
        m5r0 m5r0Var = (m5r0) nwyVar.c();
        PollNavParams pollNavParams2 = this.j1;
        if (pollNavParams2 == null) {
            pollNavParams2 = null;
        }
        UxPollEntryPoint uxPollEntryPoint = pollNavParams2.b;
        Context context = uxPollsComponentImpl.a.a;
        nwy nwyVar2 = uxPollsComponentImpl.f;
        qcy<Object> qcyVar2 = qcyVarArr[2];
        com.vk.video.polls.analytics.a aVar2 = new com.vk.video.polls.analytics.a(context, uxPollEntryPoint, (o4r0) nwyVar2.c(), uxPollsComponentImpl.b, uxPollsComponentImpl.c);
        PollNavParams pollNavParams3 = this.j1;
        return new bqb0(frb0Var, map, uxPoll, this.i1, m5r0Var, aVar2, (pollNavParams3 != null ? pollNavParams3 : null).b.c, z);
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        mhy.f(yn.getWindow());
        View view = this.l1;
        if (view != null) {
            float f = 8;
            f4m.u((View) view.getParent(), iah0.a(f), 0, iah0.a(f), 0);
        }
        return yn;
    }

    public void fo(VkButton vkButton) {
    }
}
