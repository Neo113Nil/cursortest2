package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.vk.ads.core.NewsFeedWatcher;
import com.vk.clips.sdk.target.impl.di.MyTargetComponentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.podcast.api.di.PodcastComponent;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeGamesCatalogClick;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c8p;
import xsna.o9t;
import xsna.xn50;
import xsna.xv30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class nuj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nuj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.disposables.c cVar;
        int i = this.b;
        int i2 = 10;
        Boolean bool = null;
        Object[] objArr = 0;
        r6 = null;
        Object[] objArr2 = null;
        int i3 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((puj) obj).x.r();
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(((DescriptionState) obj).c.length() <= 5000);
            case 2:
                qkr0 qkr0Var = ((zam) obj).h;
                if (qkr0Var != null && (cVar = qkr0Var.a.q) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 3:
                ifm ifmVar = (ifm) obj;
                return new hfm(ifmVar.b, ifmVar.a);
            case 4:
                return ((StoryViewerComponent) ((k7m) m7m.f((y9n) obj)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 5:
                int i4 = txo.q1;
                return ((MultiAccountComponent) ((k7m) m7m.f((txo) obj)).a(fpf0.a(MultiAccountComponent.class))).a();
            case 6:
                c8p.b bVar = c8p.n1;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 7:
                ((tjq) obj).a = null;
                return s3q0.a;
            case 8:
                return qq2.b(((cdr) obj).itemView, woo.p, 1.0f, 0.75f, 200.0f);
            case 9:
                evs evsVar = (evs) obj;
                if (evsVar.e && evsVar.d) {
                    objArr2 = 1;
                }
                c4u0 c4u0Var = evsVar.E;
                return objArr2 != null ? new jvs(c4u0Var) : new r3k0(c4u0Var);
            case 10:
                GamesCatalogFragment gamesCatalogFragment = (GamesCatalogFragment) obj;
                int i5 = GamesCatalogFragment.i0;
                gamesCatalogFragment.fo().getClass();
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeGamesCatalogClick(SchemeStat$TypeGamesCatalogClick.Type.WHAT_INSIDE_MODAL_CLOSE, bool, 2, objArr == true ? 1 : 0), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                xn50.a.c(gamesCatalogFragment, o9t.h.b);
                return s3q0.a;
            case 11:
                return ((MarketComponent) ((k7m) m7m.f((GlobalSearchAllCatalogRootVh) obj)).a(fpf0.a(MarketComponent.class))).Ob();
            case 12:
                return ((y4u) obj).a.I0();
            case 13:
                return new oyv((iid0) obj);
            case 14:
                return (NewsfeedRouterComponent) ((gxw) obj).c().a(fpf0.a(NewsfeedRouterComponent.class));
            case 15:
                return (FrescoImageView) ((wex) obj).itemView.findViewById(R.id.video_preview);
            case 16:
                return new y1n0(((p3y) obj).e);
            case 17:
                return ((oly) obj).a.findViewById(R.id.nativeads_advertising_dot);
            case 18:
                FragmentManager invoke = ((hzy) obj).b.invoke();
                if (invoke != null && !invoke.T()) {
                    com.vk.voip.ui.sessionrooms.b.a().n();
                }
                return s3q0.a;
            case 19:
                return new qd0((kmz) obj, i2);
            case 20:
                ((vm30) obj).getClass();
                return s3q0.a;
            case 21:
                xv30 xv30Var = (xv30) obj;
                Intent k = xv30Var.k(null, "msg_request_view");
                xv30.a aVar = xv30Var.x;
                k.putExtra("owner_id", aVar.m);
                k.putExtra("peer_id", aVar.n);
                return xv30Var.l(k);
            case 22:
                return ((MarketComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) obj)).a(fpf0.a(MarketComponent.class))).l7();
            case 23:
                ((rw40) obj).y.w0(true, new PlaybackActionMeta(8, 0L, 2, null));
                return s3q0.a;
            case 24:
                int i6 = MusicPlayerPersistentBottomSheet.u0;
                return ((PodcastComponent) ((k7m) m7m.c((MusicPlayerPersistentBottomSheet) obj)).a(fpf0.a(PodcastComponent.class))).cf();
            case 25:
                ((MusicSearchCatalogRootVh) obj).p.a(false, true);
                return s3q0.a;
            case 26:
                yj50 yj50Var = (yj50) obj;
                V v = yj50Var.h;
                io.reactivex.rxjava3.disposables.b bVar2 = yj50Var.j;
                if (v == 0) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                di6 feature = yj50Var.getFeature();
                io.reactivex.rxjava3.subjects.d<VS> dVar = feature.c;
                dVar.getClass();
                bVar2.b(ktr.c(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a)).subscribe(new n240(new uw4(v, 13), 3), new iu1(new vw4(yj50Var, 10), 27)));
                bVar2.b(ktr.c(feature.e).subscribe(new m3y(new qr0(v, 8), 5), new qs2(new n99(yj50Var, 6), 28)));
                int i7 = 9;
                bVar2.b(ktr.c(feature.f).subscribe(new f2u(new o99(1, (hm50) yj50Var.i.getValue(), hm50.class, "onNavigationEvent", "onNavigationEvent(Lcom/vk/im/mvicomponent/MviNavigationEvent;)V", 0, 7), 6), new wnt(new bw6(yj50Var, 8), i7)));
                bVar2.b(ktr.c(v.E()).subscribe(new xj50(new ak50(1, feature, di6.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0), r6 ? 1 : 0), new x150(new lw3(yj50Var, 7), i3)));
                di6 feature2 = yj50Var.getFeature();
                io.reactivex.rxjava3.subjects.f<VE> fVar = feature2.e;
                io.reactivex.rxjava3.core.w wVar = yj50Var.k;
                bVar2.b(fVar.a0(wVar).subscribe(new amt(new lxz(yj50Var, i7), 16)));
                bVar2.b(v.E().a0(wVar).subscribe(new lav(new owv(yj50Var, 13), 11)));
                io.reactivex.rxjava3.core.q<kj50> v2 = yj50Var.c.v();
                h8 h8Var = new h8(new b810(yj50Var, 8), 28);
                v2.getClass();
                bVar2.b(ktr.c(new io.reactivex.rxjava3.internal.operators.observable.i0(v2, h8Var).f(yj50Var.d)).subscribe(new vk40(new zj50(1, feature2, di6.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0), 2)));
                return s3q0.a;
            case 27:
                MyTargetComponentImpl myTargetComponentImpl = (MyTargetComponentImpl) obj;
                nwy nwyVar = myTargetComponentImpl.b;
                qcy<Object>[] qcyVarArr = MyTargetComponentImpl.f;
                qcy<Object> qcyVar = qcyVarArr[1];
                bjx bjxVar = (bjx) nwyVar.c();
                nwy nwyVar2 = myTargetComponentImpl.c;
                qcy<Object> qcyVar2 = qcyVarArr[2];
                return new ns50(bjxVar, (yix) nwyVar2.c());
            case 28:
                return m7m.f((yx50) obj);
            default:
                NewsFeedWatcher newsFeedWatcher = (NewsFeedWatcher) obj;
                return new com.vk.ads.core.a(f4m.b(newsFeedWatcher.a), newsFeedWatcher.d);
        }
    }
}
