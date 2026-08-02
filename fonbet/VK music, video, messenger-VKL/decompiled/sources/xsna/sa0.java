package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.friends.impl.followers.presentation.fragments.AllFollowersListFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.search.integration.followers.api.FollowersSearchQueryViewType;
import com.vk.search.integration.followers.api.di.SearchFollowersIntegrationComponent;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import kotlin.Lazy;
import xsna.c1d;
import xsna.f0e.b;
import xsna.f0e.c;
import xsna.w9r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sa0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sa0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((NewsFeedComponent) ((ta0) obj).E.getValue()).w();
            case 1:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj;
                int i2 = cVar.o;
                lw0 lw0Var = cVar.g;
                lw0Var.getClass();
                return new w01(cVar, i2, sdl.a, cVar.B, lw0Var.e());
            case 2:
                int i3 = com.vk.channelrestrictions.a.g1;
                ((com.vk.channelrestrictions.a) obj).dismiss();
                return s3q0.a;
            case 3:
                return ((BridgeComponent) ((k7m) m7m.f((zg1) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 4:
                int i4 = xp1.l1;
                return ((PhotosComponent) m7m.d((xp1) obj).a(fpf0.a(PhotosComponent.class))).i3();
            case 5:
                AllFollowersListFragment allFollowersListFragment = (AllFollowersListFragment) obj;
                int i5 = AllFollowersListFragment.c0;
                ((SearchFollowersIntegrationComponent) ((k7m) m7m.f(allFollowersListFragment)).mo408a(fpf0.a(SearchFollowersIntegrationComponent.class))).getClass();
                return new jth0(null, FollowersSearchQueryViewType.IN_TOOLBAR, allFollowersListFragment, allFollowersListFragment.b0);
            case 6:
                return ((g73) obj).d.q();
            case 7:
                qx4 qx4Var = (qx4) obj;
                return new dq4(qx4Var.d, qx4Var.c, new rx4(qx4Var, 0));
            case 8:
                int i6 = AvatarAnimatedStack.q;
                ((AvatarAnimatedStack) obj).getClass();
                float b = cn70.b(20) / 2.0f;
                return new w9r0.a(-(b / 2.0f), b, b);
            case 9:
                l06 l06Var = (l06) obj;
                if (!l06Var.c()) {
                    l06Var.d.invoke();
                }
                return s3q0.a;
            case 10:
                return new jv1(((p36) obj).n);
            case 11:
                ((ib6) obj).A.sendAccessibilityEvent(32768);
                return s3q0.a;
            case 12:
                return new uj6((wj6) obj);
            case 13:
                int i7 = BonusCatalogFragment.f0;
                ((BonusCatalogFragment) obj).ho();
                return s3q0.a;
            case 14:
                return ((ClipsBlacklistsComponent) ((Lazy) obj).getValue()).f4();
            case 15:
                ((com.vk.cameraui.impl.a) obj).a0();
                return s3q0.a;
            case 16:
                CameraUIView cameraUIView = (CameraUIView) obj;
                QrScannerUi qrScannerUi = cameraUIView.Q0;
                gm9 gm9Var = cameraUIView.B;
                if (qrScannerUi != null) {
                    qrScannerUi.f(gm9Var);
                }
                gm9Var.V();
                gm9Var.b();
                gm9Var.a();
                gm9Var.d();
                cameraUIView.requestFocus();
                return s3q0.a;
            case 17:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": updateExpiredIfNeeded: started update profiles");
            case 18:
                com.vk.movika.tools.controls.seekbar.v vVar = ((qkc) obj).f;
                if (vVar != null) {
                    vVar.invoke(StoryViewAction.CLOSE_APP, null);
                }
                return s3q0.a;
            case 19:
                int i8 = inc.l1;
                Bundle requireArguments = ((inc) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("launch_type", ClipCoauthorsDecisionLaunchType.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("launch_type");
                    parcelable = (ClipCoauthorsDecisionLaunchType) (parcelable3 instanceof ClipCoauthorsDecisionLaunchType ? parcelable3 : null);
                }
                ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType = (ClipCoauthorsDecisionLaunchType) parcelable;
                if (clipCoauthorsDecisionLaunchType != null) {
                    return clipCoauthorsDecisionLaunchType;
                }
                throw new IllegalArgumentException("Launch type must be provided");
            case 20:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i9 = ClipFeedListFragment.a2;
                if (clipFeedListFragment.Fo()) {
                    return clipFeedListFragment.qo().If();
                }
                return null;
            case 21:
                return new com.vk.clips.viewer.impl.feed.item.clip.activities.a(0.6666667f, 0.6666667f, new c1d.c(2, (c1d) obj, c1d.class, "handleTouchEvent", "handleTouchEvent(Landroid/view/View;Lcom/vk/clips/viewer/impl/feed/item/clip/activities/ClipsActivitiesTouchHandler$TouchEvent;)V", 0));
            case 22:
                return new b3d(((w6d) ((b2d) obj).a.getValue()).t);
            case 23:
                return ((ClipSearchRootVh) obj).F;
            case 24:
                return (ClipsTemplatesEditorComponent) ((k7m) m7m.f((atd) obj)).a(fpf0.a(ClipsTemplatesEditorComponent.class));
            case 25:
                f0e f0eVar = (f0e) obj;
                rj01 rj01Var = f0eVar.d.b;
                h0e h0eVar = f0eVar.f;
                return new tlu0((h0eVar != null ? h0eVar : null).a(), f0eVar.new b(), f0eVar.new c());
            case 26:
                int i10 = ClipsEntryPointsFragment.i0;
                ((ClipsEntryPointsFragment) obj).finish();
                return s3q0.a;
            case 27:
                Object obj2 = ClipsOwnerSwipeFragment.k0;
                return (ProfileFragmentProviderComponent) m7m.d((ClipsOwnerSwipeFragment) obj).a(fpf0.a(ProfileFragmentProviderComponent.class));
            case 28:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((ClipsPrefetchHelper) obj)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            default:
                int i11 = ClipsWrapperFragment.Q0;
                return (ClipsEntryPointsComponent) m7m.d((ClipsWrapperFragment) obj).mo408a(fpf0.a(ClipsEntryPointsComponent.class));
        }
    }
}
