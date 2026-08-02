package xsna;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.superapp.common.js.bridge.api.di.JsCommonDelegateComponent;
import com.vk.utils.vectordrawable.EnhancedAnimatedVectorDrawable;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.b0i;
import xsna.lru;
import xsna.pn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class z0h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        vv60 c4g0Var;
        Set<String> set;
        Set<String> set2;
        Set<String> set3;
        Set<String> set4;
        Set<Regex> set5;
        int i = this.b;
        boolean z = true;
        z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                c1h c1hVar = (c1h) obj;
                ljo0 ljo0Var = (ljo0) ((zak0) c1hVar.j).getValue();
                return Float.valueOf((ljo0Var != null ? ljo0Var.b.f : 0) > 1 ? c1hVar.q(0.4f, 0.8f, true) : 1.0f);
            case 1:
                vvh vvhVar = (vvh) obj;
                ?? r1 = vvhVar.i;
                WallGetMode wallGetMode = vvhVar.e;
                return wallGetMode == WallGetMode.MAIN ? new hrh(vvhVar, vvhVar.b, vvhVar.f, (ExtendedProfilesRepository) r1.getValue()) : new mvh(vvhVar, vvhVar.b, vvhVar.f, (ExtendedProfilesRepository) r1.getValue(), wallGetMode);
            case 2:
                ((fyh) obj).i.c(b0i.d.a);
                return s3q0.a;
            case 3:
                nzm nzmVar = new nzm();
                ((y8i) obj).getNavigationEventDispatcher().b(nzmVar);
                return nzmVar;
            case 4:
                nrl nrlVar = (nrl) obj;
                LifecycleHandler lifecycleHandler = nrlVar.e;
                if (lifecycleHandler == null) {
                    return null;
                }
                vtk0.d().d(lifecycleHandler, nrlVar.b);
                return s3q0.a;
            case 5:
                com.vk.im.ui.components.viewcontrollers.dialog_header.info.b bVar = (com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj;
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(bVar.f, R.drawable.vk_icon_animated_avd_call_in_progress);
                enhancedAnimatedVectorDrawable.registerAnimationCallback(cqk.b);
                kkm kkmVar = bVar.a;
                com.vk.utils.vectordrawable.a.b(enhancedAnimatedVectorDrawable, "path_1", kkmVar.f(R.attr.vk_ui_icon_accent_themed));
                com.vk.utils.vectordrawable.a.b(enhancedAnimatedVectorDrawable, "path_2", kkmVar.f(R.attr.vk_ui_accent_green));
                return enhancedAnimatedVectorDrawable;
            case 6:
                return new q1n((y2n) ((a3n) obj).p.getValue());
            case 7:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) obj;
                ?? r12 = discoverSimilarFeedFragment.N;
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) discoverSimilarFeedFragment.eo().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0(new pl60(((Boolean) discoverSimilarFeedFragment.Q.getValue()).booleanValue())));
                discoverSimilarFeedFragment.R = qn60Var;
                pn60 pn60Var = new pn60(new pn60.a((s1c0) discoverSimilarFeedFragment.T.getValue(), discoverSimilarFeedFragment.go().get(), discoverSimilarFeedFragment.go().get()), discoverSimilarFeedFragment.eo().b);
                discoverSimilarFeedFragment.S = pn60Var;
                rn60.a(qn60Var);
                ca90 ca90Var = ((Boolean) discoverSimilarFeedFragment.P.getValue()).booleanValue() ? new ca90(5, 5) : new ca90(5, 10);
                DiscoverSimilarFeedFragment.f fVar = new DiscoverSimilarFeedFragment.f(discoverSimilarFeedFragment.go());
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) fVar);
                lu0 lu0Var = new lu0();
                s1v s1vVar = new s1v();
                int i2 = wv60.$EnumSwitchMapping$0[((w6n) r12.getValue()).j.ordinal()];
                if (i2 == 1) {
                    c4g0Var = new c4g0();
                } else if (i2 == 2) {
                    c4g0Var = new d02();
                } else if (i2 == 3) {
                    c4g0Var = new sp(16);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c4g0Var = new xx1(11);
                }
                return new q8n(new e9n(qn60Var, pn60Var, eh60Var, lu0Var, s1vVar, discoverSimilarFeedFragment.eo().a, new AtomicReference(new wn60((byte) 0)), new uv60(c4g0Var, new rte0(), new kh60()), (w6n) r12.getValue(), cVar, new hap(new a9n(), new k8n(), new u7n()), fs60.a(qn60Var, pn60Var, cVar, discoverSimilarFeedFragment.eo().a)), ca90Var);
            case 8:
                int i3 = DisplayMusicPlaylistFragment.b0;
                return (BridgeComponent) m7m.d((DisplayMusicPlaylistFragment) obj).a(fpf0.a(BridgeComponent.class));
            case 9:
                return new urh0(((hqh0) ((jip) obj).e.c).i);
            case 10:
                return ((SakAnalyticsComponent) ((qop) obj).k0().a(fpf0.a(SakAnalyticsComponent.class))).Oe();
            case 11:
                return new nqp((mqp) obj);
            case 12:
                ((com.vk.newsfeed.common.recycler.holders.a) obj).s7();
                return s3q0.a;
            case 13:
                vvs vvsVar = (vvs) obj;
                int i4 = vvs.C;
                Bundle arguments = vvsVar.getArguments();
                return Boolean.valueOf(vvsVar.Gn(arguments != null ? bo8.d(arguments, "APP_ORIENTATION_KEY") : null));
            case 14:
                ((t3t) obj).e.invoke();
                return s3q0.a;
            case 15:
                ((com.vk.permission.c) obj).un(false, false);
                return s3q0.a;
            case 16:
                return ((GlobalSearchAllCatalogRootVh) obj).k0().ck();
            case 17:
                return ((y4u) obj).n.p().a();
            case 18:
                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = ((aiu) obj).f;
                (bottomSheetBehavior != null ? bottomSheetBehavior : null).X(3);
                return s3q0.a;
            case 19:
                VkRichCell vkRichCell = ((GroupCellVh) obj).n;
                (vkRichCell != null ? vkRichCell : null).performClick();
                return s3q0.a;
            case 20:
                lru.a aVar = (lru.a) obj;
                lru lruVar = (lru) aVar.m;
                GroupsSuggestions groupsSuggestions = lruVar.g;
                String str = lruVar.i;
                b.d dVar = new b.d("hide_group_suggestions");
                dVar.b(groupsSuggestions.n, "track_code");
                dVar.b(str, "ref");
                dVar.f();
                ((lru) aVar.m).k.invoke();
                return s3q0.a;
            case 21:
                m5v m5vVar = (m5v) obj;
                m5vVar.q.b(NarrativePublishEventType.DELETE_NARRATIVE, m5vVar.p, m5vVar.q6());
                m5vVar.n.c7(m5vVar.q6().b);
                return s3q0.a;
            case 22:
                VkImage vkImage = new VkImage(((mbx) obj).a.getCtx(), null, 6, 0);
                vkImage.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return vkImage;
            case 23:
                ((StoryProgressView) ((qex) obj).s.getValue()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 24:
                xwv0 xwv0Var = ((n1y) obj).b;
                if (xwv0Var != null) {
                    return xwv0Var.E();
                }
                return null;
            case 25:
                x6y x6yVar = (x6y) obj;
                com.vk.superapp.common.js.bridge.api.di.b s9 = ((JsCommonDelegateComponent) x6y.H().a(fpf0.a(JsCommonDelegateComponent.class))).s9();
                fvv0 M = x6yVar.M();
                fvv0 M2 = x6yVar.M();
                return s9.a(new e3y(M, x6yVar, M2 != null ? M2.d() : null, new jb(19), new p5y(x6yVar, z ? 1 : 0), new z6y(x6yVar)));
            case 26:
                return new u1n0(((x7y) obj).e);
            case 27:
                f9z f9zVar = (f9z) obj;
                Set<Regex> set6 = f9zVar.a;
                if ((set6 != null && !set6.isEmpty()) || (((set = f9zVar.b) != null && !set.isEmpty()) || (((set2 = f9zVar.c) != null && !set2.isEmpty()) || (((set3 = f9zVar.d) != null && !set3.isEmpty()) || (((set4 = f9zVar.e) != null && !set4.isEmpty()) || ((set5 = f9zVar.f) != null && !set5.isEmpty())))))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                ((j210) obj).h6();
                return s3q0.a;
            default:
                f910 f910Var = (f910) obj;
                return new i810(f910Var.A, (q530) f910Var.u.getValue(), f910Var.e);
        }
    }
}
