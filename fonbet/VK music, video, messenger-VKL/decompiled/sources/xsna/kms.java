package xsna;

import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: FriendsCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class kms extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ kms(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) obj;
                FriendsCatalogRootVh friendsCatalogRootVh = (FriendsCatalogRootVh) this.receiver;
                SearchResultsVh.cb(friendsCatalogRootVh.u, str, null, friendsCatalogRootVh.v, false, null, false, 50);
                break;
            default:
                fsk0.i((fsk0) this.receiver, ((Boolean) obj).booleanValue(), false, null, 6);
                break;
        }
        return s3q0.a;
    }

    public kms(Object obj) {
        super(1, obj, fsk0.class, "sendBenchmarkEvents", "sendBenchmarkEvents(ZZLkotlin/jvm/functions/Function0;)V", 0);
    }
}
