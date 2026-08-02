package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: LiveSpectatorsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class plz extends tl50<qlz, dmz, nlz> {
    public static final /* synthetic */ int j1 = 0;
    public cmz i1;

    /* compiled from: LiveSpectatorsBottomSheet.kt */
    public static final class a extends dw20.b {
        public final int e;
        public final UserId f;

        /* compiled from: LiveSpectatorsBottomSheet.kt */
        /* renamed from: xsna.plz$a$a, reason: collision with other inner class name */
        public static final class C3518a implements fcn {
            @Override // xsna.fcn
            public final boolean M4() {
                return true;
            }

            @Override // xsna.fcn
            public final boolean N8() {
                return false;
            }

            @Override // xsna.fcn
            public final void b(boolean z) {
                b(false);
            }

            @Override // xsna.fcn
            public final void dismiss() {
                b(false);
            }

            @Override // xsna.fcn
            public final boolean v6() {
                return false;
            }
        }

        public a(int i, Context context, UserId userId) {
            super(context, new tzp0.c.a(new amz(), false));
            this.e = i;
            this.f = userId;
            v0(R.string.live_viewers_viewers_title);
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            l(context.getColor(R.color.vk_gray_900));
            S(context.getColor(R.color.vk_gray_900));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            plz plzVar = new plz();
            plzVar.setArguments(yfb.b(new Pair("video_id", Integer.valueOf(this.e)), new Pair("owner_id", this.f)));
            C3518a c3518a = new C3518a();
            d0(new com.vk.movika.tools.controls.seekbar.g(11, plzVar, c3518a));
            a0(new fqd(5, plzVar, c3518a));
            return plzVar;
        }
    }

    /* compiled from: LiveSpectatorsBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<nlz, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(nlz nlzVar) {
            plz plzVar = (plz) this.receiver;
            plzVar.getClass();
            xn50.a.c(plzVar, nlzVar);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        this.i1 = new cmz(this, requireContext(), new b(1, this, plz.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        cmz cmzVar = this.i1;
        if (cmzVar == null) {
            cmzVar = null;
        }
        this.i0 = new bpo(cmzVar.c);
        cmz cmzVar2 = this.i1;
        return new mk50.c((cmzVar2 != null ? cmzVar2 : null).c);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        dmz dmzVar = (dmz) ao50Var;
        cmz cmzVar = this.i1;
        if (cmzVar == null) {
            cmzVar = null;
        }
        cmzVar.getClass();
        gm50.a.b(cmzVar, dmzVar.a, new l2i(cmzVar, 23));
        gm50.a.b(cmzVar, dmzVar.b, new ire(cmzVar, 24));
        gm50.a.b(cmzVar, dmzVar.c, new cqv(cmzVar, 7));
        gm50.a.b(cmzVar, dmzVar.d, new wpg(cmzVar, 23));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        getFeature().i.a(new iou(this, 10), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        int i = requireArguments().getInt("video_id");
        Parcelable parcelable = requireArguments().getParcelable("owner_id");
        if (parcelable != null) {
            return new qlz(i, (UserId) parcelable, new crx0());
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
