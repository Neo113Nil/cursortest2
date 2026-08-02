package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import java.util.List;
import xsna.y31;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k1y implements izs {
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ n1y d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ WebAdConfig f;

    public /* synthetic */ k1y(long j, Activity activity, WebAdConfig webAdConfig, List list, n1y n1yVar) {
        this.b = list;
        this.c = j;
        this.d = n1yVar;
        this.e = activity;
        this.f = webAdConfig;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        for (AdvertisementType advertisementType : this.b) {
            this.d.h().e(this.e, new y31.a(this.c, advertisementType, true, advertisementType), this.f);
        }
        return s3q0.a;
    }
}
