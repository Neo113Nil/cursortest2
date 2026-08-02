package xsna;

import android.graphics.Paint;
import androidx.room.RoomDatabase;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.di.CatalogComponent;
import com.vk.catalog2.feature.music.holders.podcast.LinkMyShelfVh;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.snippet.ui.presentation.MusicSnippetsFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.uxpolls.data.db.UxPollsDatabase;
import com.vkontakte.android.R;
import kotlin.Lazy;
import xsna.g650;
import xsna.mih0;
import xsna.wex;
import xsna.xn50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3n implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v3n(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                w3n w3nVar = (w3n) obj;
                i3n i3nVar = (i3n) w3nVar.e.getValue();
                yo60.j.a aVar = yo60.j.a.a;
                pn0 pn0Var = w3nVar.c;
                i3nVar.getClass();
                fq60 fq60Var = (fq60) ((Lazy) pn0Var.a).getValue();
                gq60 gq60Var = (gq60) pn0Var.b;
                fq60Var.getClass();
                fq60.c(aVar, gq60Var);
                return s3q0.a;
            case 1:
                return new eh60(((m6r0) obj).p());
            case 2:
                int i2 = txo.q1;
                return ((SessionManagementComponent) m7m.d((txo) obj).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 3:
                int i3 = EntriesListFragment.m0;
                return ((StoryViewerComponent) m7m.d((EntriesListFragment) obj).a(fpf0.a(StoryViewerComponent.class))).Nd();
            case 4:
                ffq ffqVar = (ffq) obj;
                return new kfq(ffq.e, (l7s) ffqVar.c.getValue(), ffqVar.a, ffqVar.b);
            case 5:
                dw20 dw20Var = ((tjq) obj).a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 6:
                RoomDatabase.a a = bhv0.a(((jgs) obj).a, "uxpolls_database", UxPollsDatabase.class);
                a.c();
                return (UxPollsDatabase) a.b();
            case 7:
                evs evsVar = (evs) obj;
                boolean z = true;
                c4u0 c4u0Var = evsVar.E;
                p3h p3hVar = new p3h(evsVar, 19);
                qm qmVar = new qm(evsVar, 25);
                r6p0 r6p0Var = evsVar.K;
                v3d0 v3d0Var = (v3d0) evsVar.V.getValue();
                if (!evsVar.f || !evsVar.d) {
                    z = false;
                }
                return new f3i0(evsVar, c4u0Var, p3hVar, qmVar, r6p0Var, v3d0Var, z, evsVar.B());
            case 8:
                return ((y4u) obj).d.ke();
            case 9:
                Paint c = x9.c(true);
                c.setColor(((fqv) obj).b.q);
                return c;
            case 10:
                return new qyv((iid0) obj);
            case 11:
                int i4 = InfoModalBottomSheet.g1;
                ((InfoModalBottomSheet) obj).dismiss();
                return s3q0.a;
            case 12:
                return ((t0x) obj).findViewById(R.id.notification_loader);
            case 13:
                return new wex.a(((wex) obj).A0);
            case 14:
                return ((oly) obj).a.findViewById(R.id.nativeads_rating_icon);
            case 15:
                return new rdz(new rei((LinkMyShelfVh) obj));
            case 16:
                return com.vk.clips.sdk.shared.item.market_ads.b.p((com.vk.clips.sdk.shared.item.market_ads.b) obj);
            case 17:
                int i5 = MarketItemCommentsFragment.j0;
                return ((BridgeComponent) m7m.d((MarketItemCommentsFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 18:
                ((kz30) obj).D();
                return s3q0.a;
            case 19:
                mih0.i iVar = (mih0.i) obj;
                Integer num = iVar.k;
                if (num != null) {
                    return new BaseBadgeHolder.a.C0709a(num.intValue(), R.attr.vk_ui_icon_contrast);
                }
                String str = iVar.q;
                if (str != null) {
                    return new BaseBadgeHolder.a.b(str);
                }
                return null;
            case 20:
                return ((MarketComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) obj)).a(fpf0.a(MarketComponent.class))).U1();
            case 21:
                ((rw40) obj).y.s0(new PlaybackActionMeta(7, 0L, 2, null));
                return s3q0.a;
            case 22:
                MusicSnippetsFragment musicSnippetsFragment = (MusicSnippetsFragment) obj;
                int i6 = MusicSnippetsFragment.Y;
                musicSnippetsFragment.getClass();
                xn50.a.c(musicSnippetsFragment, g650.c.b.b);
                return s3q0.a;
            case 23:
                ga50 ga50Var = (ga50) obj;
                MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = ga50Var.b;
                fy2 fy2Var = ga50Var.h;
                u2b0 u2b0Var = ga50Var.f;
                return musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Limited ? new v9w(u2b0Var, fy2Var) : new ajl(musicBottomSheetLaunchPoint, u2b0Var, fy2Var);
            case 24:
                return ((ClipsViewerComponent) ((k7m) m7m.f((he50) obj)).a(fpf0.a(ClipsViewerComponent.class))).pe();
            case 25:
                return ((CatalogComponent) j6i.b((h7m) ((yx50) obj).C.getValue(), CatalogComponent.class)).Ce();
            case 26:
                return new yax0(((AttachmentMappersComponent) ((NewsfeedMappersComponentImpl) obj).b.getValue()).fd());
            case 27:
                return (qz60) ((dv60) obj).b.getCurrentState();
            case 28:
                androidx.lifecycle.f fVar = (FragmentImpl) obj;
                ((pds) fVar).o1();
                if (fVar instanceof dw60) {
                    ((dw60) fVar).Nb(false);
                }
                return s3q0.a;
            default:
                return ((StoryViewerComponent) ((j070) obj).k.getValue()).z3();
        }
    }
}
