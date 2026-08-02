package xsna;

import android.view.View;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import java.lang.ref.WeakReference;

/* compiled from: UserProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class oqq0 implements zih {
    public final /* synthetic */ nqq0 a;

    public oqq0(nqq0 nqq0Var) {
        this.a = nqq0Var;
    }

    @Override // xsna.zih
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.m(communityProfileContentItem));
    }

    @Override // xsna.zih
    public final void d(CommunityProfileContentItem communityProfileContentItem) {
        this.a.d.a(new UserProfileAction.g.n(communityProfileContentItem));
    }

    @Override // xsna.zih
    public final void e(nu50 nu50Var) {
        this.a.d.a(new UserProfileAction.g.f(nu50Var));
    }

    @Override // xsna.zih
    public final void f(CommunityProfileContentItem communityProfileContentItem, wfh wfhVar, WeakReference<View> weakReference, int i) {
        this.a.d.a(new UserProfileAction.g.e(communityProfileContentItem, wfhVar, weakReference, i));
    }

    @Override // xsna.zih
    public final void c() {
    }

    @Override // xsna.zih
    public final void g() {
    }
}
