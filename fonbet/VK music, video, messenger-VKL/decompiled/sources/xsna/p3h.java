package xsna;

import android.graphics.Paint;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.gift.Gift;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.stickers.views.gift.GiftView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dzh;
import xsna.e8v0;
import xsna.fss;
import xsna.hxo;
import xsna.hzp0;
import xsna.lwv;
import xsna.o0r0;
import xsna.o9t;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class p3h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p3h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((d4h) this.c).i.invoke(new CommunityProfileAction.e.g.a(e8v0.i.b));
                return s3q0.a;
            case 1:
                ogh oghVar = (ogh) this.c;
                Clips clips = (Clips) oghVar.t;
                if (clips != null && clips.o && clips.v.h()) {
                    oghVar.F.c(clips);
                }
                return s3q0.a;
            case 2:
                return new odh(((ush) this.c).d, CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_SERVICES);
            case 3:
                ryh ryhVar = (ryh) this.c;
                ryhVar.b.c(dzh.n.j.a);
                dw20 dw20Var = ryhVar.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 4:
                wh50<VkGroupsSearchParams> wh50Var = ((f1i) this.c).j1;
                boolean z = true ^ ((VkGroupsSearchParams) ((zak0) wh50Var).getValue()).e;
                zak0 zak0Var = (zak0) wh50Var;
                VkGroupsSearchParams copy = ((VkGroupsSearchParams) zak0Var.getValue()).copy();
                copy.e = z;
                zak0Var.setValue(copy);
                return s3q0.a;
            case 5:
                dw20 dw20Var2 = (dw20) ((Ref$ObjectRef) this.c).element;
                if (dw20Var2 != null) {
                    dw20Var2.tn();
                }
                return s3q0.a;
            case 6:
                qkr0 qkr0Var = ((zam) this.c).h;
                if (qkr0Var != null) {
                    xam xamVar = qkr0Var.a;
                    if (!hg1.d(xamVar.o)) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        xamVar.o = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(xamVar.j.F(xamVar, new lgm(Peer.a.b(xamVar.t.a.e), true, true, xyb.D)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new l50(new nfj(xamVar, 5), 18)), new gsa(xamVar, 3)).subscribe(new pf1(new vam(xamVar, 0), 14), new kl6(new jm0(xamVar, 27), 13));
                    }
                }
                return s3q0.a;
            case 7:
                return (hfm) ((jfm) this.c).b.c.getValue();
            case 8:
                return ((mtm) this.c).c.a(OpenChatListReporter.Span.LOAD_DIALOGS);
            case 9:
                return ((NewsFeedComponent) ((k7m) m7m.c(((iym) this.c).itemView)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 10:
                return (t4n) this.c;
            case 11:
                rg50 rg50Var = (rg50) this.c;
                rg50Var.C(rg50Var.getIntValue() + 1);
                return s3q0.a;
            case 12:
                txo txoVar = (txo) this.c;
                int i = txo.q1;
                hxo.f fVar = hxo.f.b;
                txoVar.getClass();
                xn50.a.c(txoVar, fVar);
                xn50.a.c(txoVar, hxo.e.b);
                return s3q0.a;
            case 13:
                ExploreFragment exploreFragment = (ExploreFragment) this.c;
                int i2 = ExploreFragment.h0;
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f(exploreFragment)).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 14:
                htq htqVar = (htq) this.c;
                htqVar.g.d().m(htqVar.b, com.vk.dto.common.a.b(htqVar.c.f), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((m3r) this.c).B);
            case 16:
                return ((q7r) this.c).n;
            case 17:
                qor qorVar = (qor) this.c;
                qorVar.requestLayout();
                qorVar.invalidate();
                return s3q0.a;
            case 18:
                cjs cjsVar = (cjs) this.c;
                cjsVar.n.a(new fss.b.a((RequestUserProfile) cjsVar.m));
                return s3q0.a;
            case 19:
                return ((evs) this.c).q;
            case 20:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = galleryFragmentImpl.R.E;
                if (galleryPickerSourceConfiguration.h || galleryPickerSourceConfiguration.i) {
                    gzs<s3q0> gzsVar = galleryFragmentImpl.K0;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                } else {
                    FragmentActivity activity = galleryFragmentImpl.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
                return s3q0.a;
            case 21:
                GamesCatalogFragment gamesCatalogFragment = (GamesCatalogFragment) this.c;
                int i3 = GamesCatalogFragment.i0;
                w9t fo = gamesCatalogFragment.fo();
                SchemeStat$TypeMiniAppItem.Type type = SchemeStat$TypeMiniAppItem.Type.GAMES_CLICK_DECLINE_OPEN_PWA;
                fo.getClass();
                w9t.e(type);
                xn50.a.c(gamesCatalogFragment, o9t.g.b);
                return s3q0.a;
            case 22:
                GiftView giftView = (GiftView) this.c;
                Gift gift = giftView.u;
                if (gift != null && gift.l != null) {
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null);
                    CommonVasStat$TypeIvasItemViews.ItemType itemType = CommonVasStat$TypeIvasItemViews.ItemType.GIFT;
                    List singletonList = Collections.singletonList(Integer.valueOf(gift.c));
                    CommonVasStat$TypeIvasItemViews.BlockType blockType = CommonVasStat$TypeIvasItemViews.BlockType.COLLECTION;
                    int i4 = giftView.w;
                    int i5 = giftView.x;
                    long j = giftView.v.b;
                    new hzp0.w(schemeStat$EventItem, new CommonVasStat$TypeIvasItemViews(itemType, singletonList, Integer.valueOf(i4), blockType, null, null, null, Integer.valueOf(i5), Long.valueOf(j), null, null, null, 3696, null)).a();
                }
                return s3q0.a;
            case 23:
                GoodFragment goodFragment = (GoodFragment) this.c;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                goodFragment.kn().onBackPressed();
                return s3q0.a;
            case 24:
                return ((y4u) this.c).d.df();
            case 25:
                fqv fqvVar = (fqv) this.c;
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(-16777216);
                paint.setStrokeWidth(1.0f / fqvVar.a);
                paint.setStyle(Paint.Style.STROKE);
                return paint;
            case 26:
                return new syv((lwv.c) this.c);
            case 27:
                return ((PhotosComponent) ((gxw) this.c).c().a(fpf0.a(PhotosComponent.class))).r4();
            case 28:
                ((q5x) this.c).l();
                return s3q0.a;
            default:
                return (TextView) ((oly) this.c).a.findViewById(R.id.nativeads_advertising_text);
        }
    }
}
