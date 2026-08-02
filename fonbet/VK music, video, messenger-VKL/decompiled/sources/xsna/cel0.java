package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StickyBannerAdFactoriesProviderImpl.kt */
/* loaded from: classes6.dex */
public final class cel0 implements com.vk.superapp.advertisement.api.di.sticky_banner_ad.b {
    @Override // com.vk.superapp.advertisement.api.di.sticky_banner_ad.b
    public final mel0 a() {
        return new nel0();
    }

    @Override // com.vk.superapp.advertisement.api.di.sticky_banner_ad.b
    public final mel0 b() {
        return new fel0();
    }

    @Override // com.vk.superapp.advertisement.api.di.sticky_banner_ad.b
    public final del0 c(List<? extends iel0> list) {
        vob vobVar = new vob(new zs50());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ArrayList) vobVar.b).add((iel0) it.next());
        }
        return vobVar;
    }
}
