package xsna;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.datasource.c;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardWithBottomBtnVh;
import com.vk.catalog2.feature.music.holders.MusicLinksLineVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderNewVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarNewVh;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedMiniReactionsStack;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.im.chat.clips.decoration.impl.di.ImChatClipsDecorationComponentImpl;
import com.vk.im.ui.views.msg.MsgPartTextWithEndIconView;
import com.vk.log.L;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.player.MusicPlaybackQueueComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.io.IOException;
import xsna.e3m;
import xsna.gp00;
import xsna.ikv0;
import xsna.uoq;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1o implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction orientation;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                n1o n1oVar = (n1o) obj;
                zzn zznVar = (zzn) n1oVar.C;
                if (zznVar != null) {
                    j1o.a(n1oVar, n1oVar.itemView.getContext(), zznVar.l, (p4r) n1oVar.G.getValue(), DonutPostClickSource.Background);
                }
                return s3q0.a;
            case 1:
                return ((mqp) obj).m;
            case 2:
                a6q a6qVar = (a6q) obj;
                return new c.a(a6qVar.a, new v9v(a6qVar.e, a6qVar.f));
            case 3:
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                ((boq) ((FaveFeedFragment) obj).W.getValue()).a(new uoq.c(xn60.d.a.b));
                return s3q0.a;
            case 4:
                return FeedMiniReactionsStack.b((FeedMiniReactionsStack) obj);
            case 5:
                int i2 = GamesCatalogDetailFragment.d0;
                return ((BridgeComponent) m7m.d((GamesCatalogDetailFragment) obj).a(fpf0.a(BridgeComponent.class))).H2();
            case 6:
                return ((com.vk.geo.impl.presentation.b) obj).q;
            case 7:
                return ((y4u) obj).b.U6();
            case 8:
                return new kvd0(((f8u) obj).r);
            case 9:
                return ((uhu) obj).n.c();
            case 10:
                com.vk.catalog2.common.ui.holders.group.a.c(((GroupCardWithBottomBtnVh) obj).l, true);
                return s3q0.a;
            case 11:
                orientation = CommonAdViewerExposedFunctionsKt.setOrientation((AdObject) obj);
                return orientation;
            case 12:
                iiv iivVar = (iiv) obj;
                try {
                    return new giv(new File(com.vk.core.files.a.j(), "http_cache"), r2.g * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, iivVar.a);
                } catch (IOException e) {
                    L.j(e, "HttpCacheInterceptor");
                    return null;
                }
            case 13:
                ImChatClipsDecorationComponentImpl imChatClipsDecorationComponentImpl = (ImChatClipsDecorationComponentImpl) obj;
                return new nob(imChatClipsDecorationComponentImpl.b.e0(), imChatClipsDecorationComponentImpl.c.getExperiments(), imChatClipsDecorationComponentImpl.d.g(), imChatClipsDecorationComponentImpl.e.b0());
            case 14:
                return "Command " + ((xl6) obj) + " run on wrong thread, replace with [env.submitCommand(this, command).await()]";
            case 15:
                return ((com.vk.newsfeed.posting.market_picker.presentation.base.view.d) obj).k.getDisplayRect();
            case 16:
                return (ViewGroup) ((whz) obj).getView().findViewById(R.id.interactive_container);
            case 17:
                gp00 gp00Var = (gp00) obj;
                return new gp00.a((GestureDetector) gp00Var.f.getValue(), new s1m(gp00Var, 23));
            case 18:
                bs00 bs00Var = (bs00) obj;
                g210 g210Var = (g210) bs00Var.n;
                if (g210Var != null) {
                    ((h780) bs00Var.m).b(g210Var.b, g210Var.c);
                }
                return s3q0.a;
            case 19:
                return ((MsgPartTextWithEndIconView) e3m.b(((hk30) obj).a).inflate(R.layout.vkim_msg_part_user_name, (ViewGroup) null)).getPaint();
            case 20:
                ym30 ym30Var = ((vm30) obj).t0;
                if (ym30Var != null) {
                    ym30Var.L();
                }
                return s3q0.a;
            case 21:
                View view = ((kz30) obj).u;
                return (ViewGroup) (view != null ? view : null).findViewById(R.id.write_popup_container);
            case 22:
                return new coo(((x040) obj).a);
            case 23:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) obj;
                if (musicArtistCatalogRootVh.p) {
                    return musicArtistCatalogRootVh.m.b.c ? (MusicPageToolbarNewVh) musicArtistCatalogRootVh.t.getValue() : (MusicPagePhoneHeaderNewVh) musicArtistCatalogRootVh.y.getValue();
                }
                return null;
            case 24:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj;
                bpn0 bpn0Var = o25.a;
                return new jyh0(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c(), (yp70) musicCatalogRootVh.y.getValue());
            case 25:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(com.vk.toggle.d.a(((te40) obj).c.c()));
            case 26:
                View view2 = ((MusicLinksLineVh) obj).f;
                Context context = (view2 != null ? view2 : null).getContext();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context);
            case 27:
                qcy<Object>[] qcyVarArr2 = MusicPlaybackQueueComponentImpl.f;
                return new yxa0(((MusicKidsModeComponent) obj).n());
            case 28:
                MviMembersListFragment mviMembersListFragment = (MviMembersListFragment) obj;
                MviMembersListFragment.a aVar2 = MviMembersListFragment.T;
                ikv0.a aVar3 = new ikv0.a(mviMembersListFragment.requireContext());
                aVar3.t = ikv0.c.b.a;
                aVar3.u = new ikv0.d(mviMembersListFragment.getString(R.string.default_network_error), (String) null, (ikv0.d.a) null, 6);
                aVar3.n();
                return s3q0.a;
            default:
                return ((NewsFeedComponent) ((k7m) m7m.c(((lr50) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).ib();
        }
    }
}
