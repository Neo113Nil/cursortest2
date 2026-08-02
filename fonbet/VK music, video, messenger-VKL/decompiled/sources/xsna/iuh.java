package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.topbar.PassthroughThemedComposeView;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: CommunityProfileTopBarHost.kt */
/* loaded from: classes5.dex */
public final class iuh {
    public final PassthroughThemedComposeView a;
    public final wh50<CommunityProfileViewState.Data.e> b = androidx.compose.runtime.k.b(null);
    public final kg50 c = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final wh50<Boolean> d;
    public final rg50 e;
    public final wh50<Boolean> f;
    public final wh50<Boolean> g;
    public final wh50<tho0> h;
    public final rg50 i;
    public final rg50 j;
    public final rg50 k;
    public gzs<zhf0> l;
    public gzs<zhf0> m;
    public gzs<zhf0> n;
    public xax o;
    public WeakReference<View> p;

    public iuh(PassthroughThemedComposeView passthroughThemedComposeView) {
        this.a = passthroughThemedComposeView;
        Boolean bool = Boolean.FALSE;
        this.d = androidx.compose.runtime.k.b(bool);
        this.e = androidx.compose.runtime.i.a(R.string.community_search_posts);
        this.f = androidx.compose.runtime.k.b(bool);
        this.g = androidx.compose.runtime.k.b(bool);
        this.h = androidx.compose.runtime.k.b(new tho0((String) null, 0L, 7));
        this.i = androidx.compose.runtime.i.a(0);
        this.j = androidx.compose.runtime.i.a(0);
        this.k = androidx.compose.runtime.i.a(0);
        this.o = xax.e;
    }

    public final zhf0 a() {
        zhf0 invoke;
        gzs<zhf0> gzsVar = this.m;
        if (gzsVar == null || (invoke = gzsVar.invoke()) == null || !s200.B(invoke)) {
            return null;
        }
        return invoke;
    }

    public final zhf0 b() {
        zhf0 invoke;
        gzs<zhf0> gzsVar = this.n;
        if (gzsVar == null || (invoke = gzsVar.invoke()) == null || !s200.B(invoke)) {
            return null;
        }
        return invoke;
    }
}
