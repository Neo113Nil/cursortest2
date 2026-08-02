package xsna;

import android.os.Parcelable;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.xt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gu60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Parcelable e;

    public /* synthetic */ gu60(Object obj, Parcelable parcelable, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = parcelable;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                AdsintEventTypeDto adsintEventTypeDto = (AdsintEventTypeDto) this.d;
                PromoPost promoPost = (PromoPost) this.e;
                String str = promoPost.l;
                String Gb = promoPost.Gb();
                int i = this.c;
                return new xt0.a(adsintEventTypeDto, str, Gb, i < 0 ? xt0.c.b.a : new xt0.c.a(i));
            default:
                qgp0 qgp0Var = (qgp0) this.d;
                UserId userId = (UserId) this.e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b});
                }
                return Integer.valueOf(qgp0Var.b.z(this.c, String.valueOf(userId.b)));
        }
    }
}
