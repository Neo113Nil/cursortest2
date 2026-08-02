package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;

/* compiled from: DiscoverRepositoryUtils.kt */
/* loaded from: classes4.dex */
public final class m6n {
    public static final void a(DiscoverId discoverId) {
        wmi0 wmi0Var = wmi0.a;
        DiscoverId discoverId2 = DiscoverId.i;
        wmi0Var.c(DiscoverId.a.b(discoverId, "info"));
        wmi0Var.c(DiscoverId.a.b(discoverId, "items"));
    }

    public static final boolean b(DiscoverId discoverId, NewsEntriesContainer newsEntriesContainer) {
        String str = discoverId.b;
        if (newsEntriesContainer == null) {
            return false;
        }
        String str2 = newsEntriesContainer.b.d;
        return (str2 == null && str == null) || epx.f(str2, str);
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.p1 c(io.reactivex.rxjava3.internal.operators.observable.v2 v2Var, String str, NewsEntriesContainer newsEntriesContainer) {
        return new io.reactivex.rxjava3.internal.operators.observable.p1(v2Var, new rj4(new yu1(str, newsEntriesContainer), 10));
    }
}
