package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.hab;
import xsna.mk50;

/* compiled from: ChannelReactionQuantitySelectorBottomSheet.kt */
/* loaded from: classes16.dex */
public final class iab extends tl50<kab, vab, hab> {
    public static final /* synthetic */ int l1 = 0;
    public uab i1;
    public mab j1;
    public oab k1;

    /* compiled from: ChannelReactionQuantitySelectorBottomSheet.kt */
    public static final class a extends dw20.b {
        public final UserId e;
        public final int f;

        public a(FragmentActivity fragmentActivity, UserId userId, int i) {
            super(fragmentActivity, tzp0.a(null, 3));
            this.e = userId;
            this.f = i;
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            B(cn70.c(12), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            iab iabVar = new iab();
            new Bundle();
            iabVar.setArguments(yfb.b(new Pair("channel_id_key", this.e), new Pair("cmid_key", Integer.valueOf(this.f))));
            return iabVar;
        }
    }

    /* compiled from: ChannelReactionQuantitySelectorBottomSheet.kt */
    public static final class b {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = getLayoutInflater().inflate(R.layout.im_channel_reaction_quantity_selector_bottom_sheet, (ViewGroup) null);
        this.i1 = new uab(inflate, this, new jy(this, 25));
        this.e0 = new jgj(inflate, 0, 0, 62);
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        vab vabVar = (vab) ao50Var;
        uab uabVar = this.i1;
        if (uabVar != null) {
            gm50.a.b(this, vabVar.a, new ab(4, this, uabVar));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        kab kabVar = (kab) vk50Var;
        kabVar.j.a(new r7(this, 18), this);
        kabVar.k.a(new za(this, 23), this);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j1 = new mab(requireContext(), ((LinksBridgeComponent) m7m.d(this).a(fpf0.a(LinksBridgeComponent.class))).p(), new bb(this, 13));
        this.k1 = new oab(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.j1 = null;
        this.k1 = null;
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getFeature().C(hab.a.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r5 == null) goto L13;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("channel_id_key", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("channel_id_key");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            userId = (UserId) parcelable;
        }
        userId = UserId.d;
        Bundle arguments2 = getArguments();
        int i = arguments2 != null ? arguments2.getInt("cmid_key") : -1;
        a1w a1wVar = q1w.a;
        return new kab(userId, i, a1wVar != null ? a1wVar : null, new oib());
    }
}
