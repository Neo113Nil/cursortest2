package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FullscreenAdFactoryProviderImpl.kt */
/* loaded from: classes6.dex */
public final class axs implements com.vk.superapp.advertisement.api.di.fullscreen_ad.b {
    @Override // com.vk.superapp.advertisement.api.di.fullscreen_ad.b
    public final zws a(List<? extends bxs> list) {
        hq50 hq50Var = new hq50();
        rhh0 rhh0Var = new rhh0();
        rhh0Var.b = e43.o(hq50Var);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ArrayList) rhh0Var.b).add((bxs) it.next());
        }
        return rhh0Var;
    }
}
