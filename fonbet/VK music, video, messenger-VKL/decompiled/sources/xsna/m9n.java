package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;

/* compiled from: DiscoverStoriesController.kt */
/* loaded from: classes6.dex */
public final class m9n implements v1n, w8i {
    public static final m9n b = new m9n();
    public static final bpn0 c = new bpn0(new xu0(12));
    public static final bpn0 d = new bpn0(new yv2(14));
    public static final bpn0 e = new bpn0(new bv0(14));
    public static GetStoriesResponse f;

    public static io.reactivex.rxjava3.core.q a(Integer num, String str, String str2) {
        ArrayList<StoriesContainer> arrayList;
        GetStoriesResponse getStoriesResponse = f;
        if (((getStoriesResponse == null || (arrayList = getStoriesResponse.c) == null) ? 0 : arrayList.size()) > 0 && str2 == null) {
            return io.reactivex.rxjava3.core.q.T(getStoriesResponse);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = ((xsl0) d.getValue()).a(num, str, str2).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        qs2 qs2Var = new qs2(new l9n(str2, str), 13);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return a0.E(qs2Var, lVar, kVar, kVar);
    }
}
