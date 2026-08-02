package xsna;

import android.content.Context;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zmg implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ ContextUser c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ SearchStatsLoggingInfo f;

    public /* synthetic */ zmg(Context context, ContextUser contextUser, boolean z, boolean z2, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.b = context;
        this.c = contextUser;
        this.d = z;
        this.e = z2;
        this.f = searchStatsLoggingInfo;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        b.a aVar = (b.a) obj;
        com.vk.stickers.bridge.b.K(com.vk.stickers.bridge.b.a, this.b, aVar.a, aVar.b, this.c, this.d, this.e, null, this.f, 128);
        return s3q0.a;
    }
}
