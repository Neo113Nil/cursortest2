package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.media3.exoplayer.scheduler.PlatformScheduler;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.music.offline.impl.mediastore.download.service.OfflineMusicDownloadBoundService;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.ghc0.d;
import xsna.k840;
import xsna.mih0;
import xsna.pn60;
import xsna.t2g0;
import xsna.z0d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sy50 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sy50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ty50 ty50Var = (ty50) obj;
                return new az50(ty50Var.a, ty50Var.f);
            case 1:
                Integer num = ((mih0.k) obj).d;
                if (num != null) {
                    return new BaseBadgeHolder.a.C0709a(num.intValue(), R.attr.vk_ui_icon_contrast);
                }
                return null;
            case 2:
                return ((ClipsConfigViewersComponent) ((mo60) obj).c().a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 3:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) newsfeedSearchFragment.fo().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0());
                newsfeedSearchFragment.go().e = qn60Var;
                ?? r1 = newsfeedSearchFragment.fo().b;
                s1c0 s1c0Var = (s1c0) newsfeedSearchFragment.W.getValue();
                String str = (String) ((AtomicReference) newsfeedSearchFragment.m0.getValue()).get();
                ?? r8 = newsfeedSearchFragment.P;
                pn60 pn60Var = new pn60(new pn60.a(s1c0Var, str, (String) ((AtomicReference) r8.getValue()).get()), r1);
                newsfeedSearchFragment.go().f = pn60Var;
                rn60.a(qn60Var);
                NewsfeedSearchFragment.h hVar = new NewsfeedSearchFragment.h((AtomicReference) r8.getValue());
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) hVar);
                mo60 mo60Var = newsfeedSearchFragment.fo().a;
                AtomicBoolean atomicBoolean = newsfeedSearchFragment.X;
                s1v s1vVar = new s1v();
                AtomicReference atomicReference = new AtomicReference(new wn60((byte) 0));
                xw60 eo = newsfeedSearchFragment.eo();
                rvu rvuVar = new rvu(new my60(), new wx60(), new tx60());
                ca90 ca90Var = new ca90(30, 30);
                ca90 ca90Var2 = new ca90(30, 30);
                es60 a = fs60.a(qn60Var, pn60Var, cVar, newsfeedSearchFragment.fo().a);
                new xa4(22);
                return new cy60(new qy60(atomicBoolean, qn60Var, pn60Var, eh60Var, s1vVar, mo60Var, atomicReference, eo, cVar, rvuVar, ca90Var, ca90Var2, a, new c2f0()));
            case 4:
                PlatformScheduler platformScheduler = OfflineMusicDownloadBoundService.w;
                return new i9o((OfflineMusicDownloadBoundService) obj);
            case 5:
                wl80 wl80Var = (wl80) obj;
                wl80Var.getClass();
                return "constructor - this= " + wl80Var;
            case 6:
                ((sav0) obj).a();
                return s3q0.a;
            case 7:
                int i2 = m8a0.v1;
                return ((m8a0) obj).bo().z8();
            case 8:
                cbb0 cbb0Var = (cbb0) obj;
                int i3 = cbb0.q1;
                String string = cbb0Var.requireArguments().getString("UNIQUE_KEY");
                if (string == null) {
                    string = j7b0.class.getCanonicalName();
                }
                return k840.c.b(cbb0.co(cbb0Var.requireArguments()), string);
            case 9:
                return Boolean.valueOf(((PodcastCatalogRootVh) obj).m.b.b.c(false));
            case 10:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 11:
                return ((NewsFeedComponent) ((y1c0) obj).f.getValue()).l0();
            case 12:
                PostFragment postFragment = (PostFragment) obj;
                int i4 = PostFragment.S0;
                f0c0 zo = postFragment.zo();
                l7m d = m7m.d(postFragment);
                FragmentEntry Kn = postFragment.Kn();
                return new y8c0(postFragment, zo, d, postFragment, Kn != null ? Kn.d : null, postFragment.D, postFragment, new mga0(postFragment, 4));
            case 13:
                Bundle bundle = ((rbc0) obj).a;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("owner", WallOwner.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = bundle.getParcelable("owner");
                    parcelable = (WallOwner) (parcelable3 instanceof WallOwner ? parcelable3 : null);
                }
                return (WallOwner) parcelable;
            case 14:
                return ((ghc0) obj).new d();
            case 15:
                enc0 enc0Var = (enc0) obj;
                ahc0 ahc0Var = enc0Var.V;
                return Float.valueOf(ahc0Var != null ? ahc0Var.v : enc0Var.S);
            case 16:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) obj;
                qcy<Object>[] qcyVarArr2 = PostponedPostsFragment.q0;
                return postponedPostsFragment;
            case 17:
                Iterator<z0d0.b> it = ((z0d0) obj).g.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                return s3q0.a;
            case 18:
                return ((LinksBridgeComponent) ((k7m) m7m.f((pid0) obj)).a(fpf0.a(LinksBridgeComponent.class))).p().e();
            case 19:
                ((ujd0) obj).dismiss();
                return s3q0.a;
            case 20:
                ((god0) obj).a.i();
                return s3q0.a;
            case 21:
                int i5 = ProfileFriendsFragment.k0;
                ((ProfileFriendsFragment) obj).qo();
                return s3q0.a;
            case 22:
                return (InfoBridgeComponent) ((e7m) obj).a(fpf0.a(InfoBridgeComponent.class));
            case 23:
                return Float.valueOf(f17.e((h17) obj));
            case 24:
                return (TextView) ((prf0) obj).a.findViewById(R.id.nativeads_domain);
            case 25:
                eig0<t2g0> eig0Var = ((RepliesView) obj).e;
                if (eig0Var != null) {
                    eig0Var.a(t2g0.e.a);
                }
                return s3q0.a;
            case 26:
                ((RestrictionOverlayRenderDelegate) obj).b.invoke(RestrictionOverlayRenderDelegate.RestrictionOverlayAction.ButtonClick);
                return s3q0.a;
            case 27:
                gzs gzsVar2 = (gzs) ((zak0) ((rgg0) obj).b).getValue();
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            case 28:
                int i6 = SearchCommunitiesOnMapFragment.e0;
                Bundle arguments = ((SearchCommunitiesOnMapFragment) obj).getArguments();
                if (arguments == null) {
                    arguments = Bundle.EMPTY;
                }
                return new SearchCommunitiesOnMapFragment.a(arguments);
            default:
                return ((afi0) obj).o;
        }
    }

    public /* synthetic */ sy50(z0d0 z0d0Var, dbn dbnVar, long j, long j2) {
        this.b = 17;
        this.c = z0d0Var;
    }
}
