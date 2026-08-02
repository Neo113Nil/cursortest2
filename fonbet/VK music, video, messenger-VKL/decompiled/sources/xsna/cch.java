package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.dto.profile.CatchUpBanner;
import com.vkontakte.android.R;
import org.chromium.net.NetError;

/* compiled from: CommunityPartnerBannerItem.kt */
/* loaded from: classes5.dex */
public final class cch extends we6 {
    public final ech g;
    public final lp1 h;
    public final kpd i;
    public final mre j;
    public final frg k;

    /* compiled from: CommunityPartnerBannerItem.kt */
    public static final class a extends vif0<we6> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(we6 we6Var) {
        }
    }

    public cch(ech echVar, lp1 lp1Var, kpd kpdVar, mre mreVar, frg frgVar) {
        this.g = echVar;
        this.h = lp1Var;
        this.i = kpdVar;
        this.j = mreVar;
        this.k = frgVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        CatchUpBanner.Style style = this.g.b.l;
        if (style == CatchUpBanner.Style.ONLINE_BOOKING_SECTION) {
            return new urg(new VkBanner(viewGroup.getContext(), null, 6));
        }
        CatchUpBanner.Style style2 = CatchUpBanner.Style.SOCCOM_DEFAULT_BANNER;
        if (style == style2) {
            return style == style2 ? new zdh(viewGroup) : new a(new View(viewGroup.getContext()));
        }
        bch bchVar = new bch(new gch(viewGroup.getContext()));
        View view = bchVar.itemView;
        view.setForeground(view.getContext().getDrawable(R.drawable.ripple_16dp));
        bwt0.i0(bchVar.itemView, new oce(bchVar, 5));
        View view2 = bchVar.itemView;
        gch gchVar = view2 instanceof gch ? (gch) view2 : null;
        if (gchVar != null) {
            gchVar.setCloseButtonClickListener(new e4(bchVar, 26));
        }
        return bchVar;
    }

    @Override // xsna.we6
    public final int h() {
        return NetError.ERR_CERT_END;
    }
}
