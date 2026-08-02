package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.friendsreview.ReviewFriendsDialogArgs;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.mk50;

/* compiled from: ReviewFriendsDialog.kt */
/* loaded from: classes18.dex */
public final class mhg0 extends tl50<ohg0, uhg0, ehg0> implements w8i {
    public static final /* synthetic */ int l1 = 0;
    public khg0 i1;
    public final bpn0 j1 = new bpn0(new su80(this, 15));
    public final Object k1 = msy.a(LazyThreadSafetyMode.NONE, new wm80(this, 14));

    /* compiled from: ReviewFriendsDialog.kt */
    public static final class a extends wpi {
        public final ReviewFriendsDialogArgs g;

        public a(Context context, ReviewFriendsDialogArgs reviewFriendsDialogArgs) {
            super(context, tzp0.a(null, 3));
            this.g = reviewFriendsDialogArgs;
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            m(R.attr.vk_ui_background_content);
            F0(true);
            w();
            x(0);
            p(true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            mhg0 mhg0Var = new mhg0();
            mhg0Var.setArguments(yfb.b(new Pair("REVIEW_FRIENDS_KEY", this.g)));
            return mhg0Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        khg0 khg0Var = new khg0(requireContext(), this);
        this.i1 = khg0Var;
        return new mk50.c(khg0Var.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        uhg0 uhg0Var = (uhg0) ao50Var;
        khg0 khg0Var = this.i1;
        if (khg0Var == null) {
            khg0Var = null;
        }
        khg0Var.f(uhg0Var, new xd8(1, this, mhg0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ohg0) vk50Var).h.a(new yr00(this, 25), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.os.Parcelable] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("REVIEW_FRIENDS_KEY", ReviewFriendsDialogArgs.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments.getParcelable("REVIEW_FRIENDS_KEY");
                parcelable = parcelable3 instanceof ReviewFriendsDialogArgs ? parcelable3 : null;
            }
            r6 = (ReviewFriendsDialogArgs) parcelable;
        }
        return new ohg0(new shg0(new thg0(0)), new v7x(), r6 != null ? r6.b : UserId.d);
    }
}
