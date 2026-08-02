package xsna;

import android.content.Context;
import com.vk.onboardingscreens.impl.recomthemes.presentation.fragment.UserRecomThemesFragment;
import com.vk.socialgraph.init.TopicsFragmentNewContainer;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;

/* compiled from: UserRecomThemesRouterImpl.kt */
/* loaded from: classes4.dex */
public final class ezq0 implements dzq0 {
    public final xyq0 a;

    public ezq0(xyq0 xyq0Var) {
        this.a = xyq0Var;
    }

    @Override // xsna.dzq0
    public final void a(Context context, TopicsFragmentNewContainer topicsFragmentNewContainer) {
        this.a.j();
        Boolean bool = Boolean.TRUE;
        new oz50(UserRecomThemesFragment.class, null, yfb.b(new Pair("no_bottom_navigation", bool), new Pair("no_left_menu", bool), new Pair("from_registration_key", bool))).g(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, topicsFragmentNewContainer);
    }
}
