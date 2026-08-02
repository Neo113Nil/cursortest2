package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.n7b;

/* compiled from: ChannelPayoutBottomSheet.kt */
/* loaded from: classes16.dex */
public final class q7b extends tl50<s7b, g8b, n7b> {
    public static final /* synthetic */ int l1 = 0;
    public f8b i1;
    public y7b j1;
    public a8b k1;

    /* compiled from: ChannelPayoutBottomSheet.kt */
    public static final class a extends dw20.b {
        public final UserId e;

        public a(Context context, UserId userId) {
            super(context, tzp0.a(null, 3));
            this.e = userId;
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            B(cn70.c(12), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            q7b q7bVar = new q7b();
            q7bVar.setArguments(yfb.b(new Pair("owner_id_key", this.e)));
            return q7bVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = getLayoutInflater().inflate(R.layout.im_channel_payout_bottom_sheet, (ViewGroup) null);
        this.i1 = new f8b(inflate, this, new com.vk.movika.sdk.base.data.a(this, 17));
        this.e0 = new jgj(inflate, 0, 0, 14);
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        g8b g8bVar = (g8b) ao50Var;
        f8b f8bVar = this.i1;
        if (f8bVar != null) {
            gm50.a.b(this, g8bVar.a, new il7(1, this, f8bVar));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        s7b s7bVar = (s7b) vk50Var;
        s7bVar.i.a(new po1(this, 12), this);
        s7bVar.j.a(new ix2(this, 15), this);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j1 = new y7b(requireContext(), ((LinksBridgeComponent) m7m.d(this).a(fpf0.a(LinksBridgeComponent.class))).p(), new t5(this, 17));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.j1 = null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        a8b a8bVar = this.k1;
        if (a8bVar != null) {
            ikv0 ikv0Var = a8bVar.d;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            ikv0 ikv0Var2 = a8bVar.e;
            if (ikv0Var2 != null) {
                ikv0Var2.a();
            }
        }
        this.k1 = null;
        super.onDestroyView();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getFeature().C(n7b.a.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
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
                parcelable2 = arguments.getParcelable("owner_id_key", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("owner_id_key");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            userId = (UserId) parcelable;
        }
        userId = UserId.d;
        return new s7b(userId, new dy2(), ((AuthBridgeComponent) m7m.d(this).a(fpf0.a(AuthBridgeComponent.class))).s());
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        this.k1 = new a8b(requireContext(), yn.getWindow(), new j9(this, 19));
        return yn;
    }
}
