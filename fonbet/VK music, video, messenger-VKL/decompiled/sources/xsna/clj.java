package xsna;

import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.ComFeatures;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ContentTabDelegateContainer.kt */
/* loaded from: classes5.dex */
public final class clj implements mtl {
    public final Map<dcy<? extends CommunityProfileContentItem>, wmq0<? extends CommunityProfileContentItem, ?>> b;

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    public clj(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, rnq0 rnq0Var, loq0 loq0Var) {
        ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
        comFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean a = bVar.a(comFeatures);
        ComFeatures comFeatures2 = ComFeatures.COM_PROFILE_DONUT_TAB;
        comFeatures2.getClass();
        boolean a2 = bVar.a(comFeatures2);
        Map<dcy<? extends CommunityProfileContentItem>, wmq0<? extends CommunityProfileContentItem, ?>> k = pn00.k(new Pair(fpf0.a(fq3.class), new tmq0(dvq0Var, r0e0Var, z, rnq0Var)), new Pair(fpf0.a(Clips.class), new ymq0(dvq0Var, r0e0Var, z, rnq0Var, loq0Var, a)), new Pair(fpf0.a(j15.class), new vmq0(dvq0Var, r0e0Var, z, rnq0Var, (oc40) loq0Var.g.getValue())), new Pair(fpf0.a(sst0.class), new boq0(dvq0Var, r0e0Var, z, rnq0Var, loq0Var, a, (wjs0) loq0Var.k.getValue())), new Pair(fpf0.a(hg3.class), new smq0(dvq0Var, r0e0Var, z)), new Pair(fpf0.a(b9x0.class), new coq0(dvq0Var, r0e0Var, z)), new Pair(fpf0.a(lg00.class), new mnq0(dvq0Var, r0e0Var, z, loq0Var)), new Pair(fpf0.a(iea0.class), new onq0(dvq0Var, r0e0Var, z, rnq0Var, ((PhotosComponent) loq0Var.q.getValue()).o5())), new Pair(fpf0.a(uu50.class), new nnq0(dvq0Var, r0e0Var, z, rnq0Var, (gu50) loq0Var.h.getValue(), (StoriesComponent) loq0Var.i.getValue())), new Pair(fpf0.a(mzt.class), new gnq0(dvq0Var, r0e0Var, z)));
        if (a2) {
            k = pn00.o(k, new Pair(fpf0.a(p5o.class), new fnq0(dvq0Var, r0e0Var, z)));
        }
        this.b = k;
    }

    @Override // xsna.mtl
    public final List<huq> w2() {
        return j5g.O0(this.b.values());
    }
}
