package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class an80 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ an80(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                dn80 dn80Var = (dn80) this.c;
                dn80Var.a.m((String) this.d);
                break;
            case 1:
                wmq0.B((nnq0) this.c, (uu50) this.d, CommunityProfileContentItem.State.LOADED, null, 4);
                break;
            default:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.c;
                com.vk.video.ui.discovery.minimizable.q qVar = (com.vk.video.ui.discovery.minimizable.q) this.d;
                gVar.J.b(new VideoMinimizableDiscoverySideEffect.s.d(false));
                gVar.T(new n.a(com.vk.video.ui.discovery.minimizable.g.c1(gVar, qVar, null, Boolean.FALSE, 2)));
                break;
        }
    }
}
