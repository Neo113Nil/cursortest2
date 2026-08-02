package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import android.view.Window;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;

/* compiled from: InviteFriendsBottomSheet.kt */
/* loaded from: classes14.dex */
public final class yqx extends tl50<drx, lsx, gqx> {
    public static final b n1;
    public static final /* synthetic */ qcy<Object>[] o1;
    public final nf3 i1 = new nf3();
    public final bpn0 j1 = new bpn0(new wqf(this, 28));
    public final mzp0 k1;
    public final yw90 l1;
    public ikv0 m1;

    /* compiled from: InviteFriendsBottomSheet.kt */
    public static final class a extends kmu0 {
        public final UserId h;
        public final UserId i;
        public final InviteFriendsAnalytics.InviteFriendsSource j;
        public final boolean k;

        public a(Context context, UserId userId, UserId userId2, InviteFriendsAnalytics.InviteFriendsSource inviteFriendsSource, boolean z) {
            super(context, tzp0.a(null, 3));
            this.h = userId;
            this.i = userId2;
            this.j = inviteFriendsSource;
            this.k = z;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            yqx yqxVar = new yqx();
            yqxVar.setArguments(yfb.b(new Pair("COMMUNITY_ID_KEY", this.i), new Pair("USER_ID_KEY", this.h), new Pair("SOURCE_KEY", this.j), new Pair("with_invited_tab_key", Boolean.valueOf(this.k))));
            return yqxVar;
        }
    }

    /* compiled from: InviteFriendsBottomSheet.kt */
    public static final class b {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(yqx.class, "contentView", "getContentView()Lcom/vk/friends/groupinvite/impl/ui/InviteFriendsMviView;", 0);
        fpf0.a.getClass();
        o1 = new qcy[]{mutablePropertyReference1Impl};
        n1 = new b();
    }

    public yqx() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.INVITE_FRIENDS_BIZ, null, false, 62).j();
        this.k1 = mzp0Var;
        mzp0Var.init();
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.INVITE_FRIENDS_BIZ).j();
        yw90Var.init();
        this.l1 = yw90Var;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        krx krxVar = new krx(this, requireContext(), this.k1, this.l1);
        qcy<Object> qcyVar = o1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = krxVar;
        return new mk50.c(((krx) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((krx) this.i1.getValue(this, o1[0])).f((lsx) ao50Var, new hy0(1, this, yqx.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6));
        this.k1.e(view);
        this.l1.d3(view);
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((drx) vk50Var).k.a(new a2a(1, this, yqx.class, "handleEvent", "handleEvent(Lcom/vk/friends/groupinvite/impl/presentation/feature/InviteFriendsEvent;)V", 0, 8), this);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.k1.start();
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int f = e3m.f(R.attr.vk_ui_transparent, requireContext());
        Window window = kn().getWindow();
        int[] iArr = u1u0.a;
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(f);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.k1.g();
        this.l1.stop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.k1.g();
        this.l1.deactivate();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.k1.h();
        this.l1.c();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object obj;
        Object parcelable3;
        Object parcelable4;
        Bundle requireArguments = requireArguments();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable4 = requireArguments.getParcelable("USER_ID_KEY", UserId.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = requireArguments.getParcelable("USER_ID_KEY");
            if (!(parcelable5 instanceof UserId)) {
                parcelable5 = null;
            }
            parcelable = (UserId) parcelable5;
        }
        if (((UserId) parcelable) == null) {
            throw new IllegalStateException("communityId argument must not be null");
        }
        Bundle requireArguments2 = requireArguments();
        if (i >= 33) {
            parcelable3 = requireArguments2.getParcelable("COMMUNITY_ID_KEY", UserId.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = requireArguments2.getParcelable("COMMUNITY_ID_KEY");
            if (!(parcelable6 instanceof UserId)) {
                parcelable6 = null;
            }
            parcelable2 = (UserId) parcelable6;
        }
        UserId userId = (UserId) parcelable2;
        if (userId == null) {
            throw new IllegalStateException("communityId argument must not be null");
        }
        Bundle requireArguments3 = requireArguments();
        if (i >= 33) {
            obj = requireArguments3.getSerializable("SOURCE_KEY", InviteFriendsAnalytics.InviteFriendsSource.class);
        } else {
            Object serializable = requireArguments3.getSerializable("SOURCE_KEY");
            obj = (InviteFriendsAnalytics.InviteFriendsSource) (serializable instanceof InviteFriendsAnalytics.InviteFriendsSource ? serializable : null);
        }
        InviteFriendsAnalytics.InviteFriendsSource inviteFriendsSource = (InviteFriendsAnalytics.InviteFriendsSource) obj;
        if (inviteFriendsSource != null) {
            return new drx(userId, inviteFriendsSource, new uy9(userId), this.k1, requireArguments().getBoolean("with_invited_tab_key", true));
        }
        throw new IllegalStateException("source argument must not be null");
    }
}
