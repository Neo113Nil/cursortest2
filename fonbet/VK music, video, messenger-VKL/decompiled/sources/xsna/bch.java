package xsna;

import android.view.View;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.profile.CatchUpBanner;
import xsna.gch;

/* compiled from: CommunityPartnerBannerHolder.kt */
/* loaded from: classes5.dex */
public final class bch extends vif0<cch> {
    public boolean n;

    @Override // xsna.vif0
    public final void i6(cch cchVar) {
        ImageSize Cb;
        cch cchVar2 = cchVar;
        ech echVar = cchVar2.g;
        View view = this.itemView;
        String str = null;
        gch gchVar = view instanceof gch ? (gch) view : null;
        if (gchVar != null) {
            if (!this.n) {
                this.n = true;
                kpd kpdVar = cchVar2.i;
                if (kpdVar != null) {
                    kpdVar.invoke(echVar.b);
                }
            }
            CatchUpBanner catchUpBanner = echVar.b;
            String str2 = catchUpBanner.d;
            String str3 = catchUpBanner.e;
            String str4 = catchUpBanner.k;
            Image image = catchUpBanner.g;
            if (image != null && (Cb = image.Cb(iah0.a(89), true, false)) != null) {
                str = Cb.d.d;
            }
            gchVar.setData(new gch.a(str2, str3, str4, str));
        }
    }
}
