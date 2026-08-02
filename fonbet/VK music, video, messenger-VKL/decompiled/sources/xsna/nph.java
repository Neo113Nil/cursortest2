package xsna;

import android.view.View;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import java.lang.ref.WeakReference;

/* compiled from: CommunityProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class nph implements zih {
    public final /* synthetic */ mph a;

    public nph(mph mphVar) {
        this.a = mphVar;
    }

    @Override // xsna.zih
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.p(communityProfileContentItem));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zih
    public final void c() {
        mph mphVar = this.a;
        ((VideoGrowthComponent) mphVar.b.a1.getValue()).Z7().e(CommunityGrowthTrapScreen.GROUP, CommunityGrowthTrapEvent.BANNER);
        mphVar.l.invoke(CommunityProfileAction.x.b);
    }

    @Override // xsna.zih
    public final void d(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.q(communityProfileContentItem));
    }

    @Override // xsna.zih
    public final void e(nu50 nu50Var) {
        this.a.l.invoke(new CommunityProfileAction.f.h(nu50Var));
    }

    @Override // xsna.zih
    public final void f(CommunityProfileContentItem communityProfileContentItem, wfh wfhVar, WeakReference<View> weakReference, int i) {
        this.a.l.invoke(new CommunityProfileAction.f.d(communityProfileContentItem, wfhVar, weakReference, i));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zih
    public final void g() {
        ((VideoGrowthComponent) this.a.b.a1.getValue()).Z7().f(CommunityGrowthTrapScreen.GROUP, CommunityGrowthTrapEvent.BANNER);
    }

    public final void h(omh<?> omhVar) {
        this.a.l.invoke(new CommunityProfileAction.f.e(omhVar));
    }

    public final void i(aih<?> aihVar) {
        this.a.l.invoke(new CommunityProfileAction.f.C1586f(aihVar));
    }

    public final void j(dfh<?> dfhVar) {
        this.a.l.invoke(new CommunityProfileAction.f.i(dfhVar));
    }
}
