package xsna;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupSmallHorizontalListItemVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.tabs.SkeletonTabLayout;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.dto.im.MsgType;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.instantjobs.InstantJob;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.money.MoneyTransferPagerFragment.b;
import com.vk.money.createtransfer.AbsCreateTransferFragment;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.ah30;
import xsna.dmz;
import xsna.iuv;
import xsna.jw00;
import xsna.qs80;
import xsna.tj50;
import xsna.v400;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ugm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ugm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        v5e v5eVar;
        CreatePeopleTransferFragment.a aVar;
        AbsCreateTransferFragment.a aVar2;
        MoneyTransferLinkFragment.a aVar3;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof wgm) && epx.f(((wgm) instantJob).c, ((vgm) obj2).b));
            case 1:
                DialogsListAdapter.a aVar4 = ((DialogsListAdapter) obj2).j;
                q5e0 q5e0Var = new q5e0(R.layout.vh_promo_link, (ViewGroup) obj);
                q5e0Var.l = aVar4;
                int i2 = 18;
                jjc.g(q5e0Var.itemView, new w910(q5e0Var, i2));
                bwt0.k0(q5e0Var.itemView, new rxz(q5e0Var, i2));
                return q5e0Var;
            case 2:
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.vk.im.ui.components.dialogs_list.e eVar = cVar.h;
                if (eVar.D != booleanValue) {
                    eVar.D = booleanValue;
                    cVar.B(cVar);
                }
                return s3q0.a;
            case 3:
                opp oppVar = (opp) obj2;
                kpp kppVar = opp.T;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((Long) obj).longValue());
                SimpleDate simpleDate = new SimpleDate(calendar, true);
                oppVar.An();
                oppVar.Cn(simpleDate.toString());
                return s3q0.a;
            case 4:
                ((zeq) obj2).n.setImageDrawable((Drawable) obj);
                return s3q0.a;
            case 5:
                k4r k4rVar = (k4r) obj2;
                FeedItem.d dVar = (FeedItem.d) obj;
                FeedItem.f fVar = dVar instanceof FeedItem.f ? (FeedItem.f) dVar : null;
                if (fVar == null || (v5eVar = k4rVar.c) == null) {
                    return dVar;
                }
                t80 t80Var = v5eVar.a.get(((FeedItem.f) dVar).e.a1());
                return t80Var == null ? dVar : FeedItem.f.a(fVar, null, null, t80Var.d(), 1535);
            case 6:
                f6s f6sVar = (f6s) obj2;
                RectF rectF = (RectF) obj;
                q6s j7 = f6sVar.j7();
                if (j7 != null) {
                    f6sVar.M.a(f6sVar.G, new x1e0(rectF, 16), j7.d0, j7.t);
                }
                return s3q0.a;
            case 7:
                vnt vntVar = (vnt) obj2;
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar3 = vntVar.m1;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                vntVar.m1 = cVar2;
                return s3q0.a;
            case 8:
                GroupSmallHorizontalListItemVh groupSmallHorizontalListItemVh = (GroupSmallHorizontalListItemVh) obj2;
                if (((qs80) obj) instanceof qs80.c) {
                    groupSmallHorizontalListItemVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_PLAYER_LIVE);
                } else {
                    groupSmallHorizontalListItemVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
                }
                return s3q0.a;
            case 9:
                int i3 = GroupedNotificationsFragment.f0;
                h3p0.b((GroupedNotificationsFragment) obj2);
                return s3q0.a;
            case 10:
                ((c8v) obj2).d1().e(true);
                return s3q0.a;
            case 11:
                ((ktv) obj2).h.b(iuv.b.a);
                return s3q0.a;
            case 12:
                z4w z4wVar = (z4w) obj2;
                z4wVar.dismiss();
                z4wVar.a();
                return s3q0.a;
            case 13:
                return new dmz.a(tj50.a.b((tj50.a) obj, vlz.b, new oc0((wlz) obj2)));
            case 14:
                frn0 system = ((xgl0) obj).system();
                v400.b bVar = (v400.b) ((v400) obj2);
                system.t(bVar.a);
                system.u(bVar.b);
                return s3q0.a;
            case 15:
                return com.vk.clips.sdk.shared.item.market_ads.b.s((com.vk.clips.sdk.shared.item.market_ads.b) obj2, (yt0) obj);
            case 16:
                return Boolean.valueOf(((lw00) obj2).e(jw00.c.c));
            case 17:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj2;
                NestedScrollView nestedScrollView = marketItemReviewsFragment.h0;
                if (nestedScrollView == null) {
                    nestedScrollView = null;
                }
                bwt0.p0(nestedScrollView, true);
                VkPlaceholder vkPlaceholder = marketItemReviewsFragment.i0;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                bwt0.p0(vkPlaceholder, true);
                LinearLayout linearLayout = marketItemReviewsFragment.d0;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                bwt0.p0(linearLayout, false);
                VkSpinner vkSpinner = marketItemReviewsFragment.b0;
                if (vkSpinner == null) {
                    vkSpinner = null;
                }
                bwt0.p0(vkSpinner, false);
                SwipeRefreshLayout swipeRefreshLayout = marketItemReviewsFragment.g0;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                bwt0.p0(swipeRefreshLayout, false);
                SwipeRefreshLayout swipeRefreshLayout2 = marketItemReviewsFragment.g0;
                if (swipeRefreshLayout2 == null) {
                    swipeRefreshLayout2 = null;
                }
                swipeRefreshLayout2.setRefreshing(false);
                View view = marketItemReviewsFragment.j0;
                bwt0.p0(view != null ? view : null, false);
                return s3q0.a;
            case 18:
                ((w920) obj2).g.debug(new cj4(27));
                return s3q0.a;
            case 19:
                ((nq20) obj2).l.D();
                return s3q0.a;
            case 20:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                int i4 = ref$IntRef.element;
                if (measuredHeight < i4) {
                    measuredHeight = i4;
                }
                ref$IntRef.element = measuredHeight;
                return s3q0.a;
            case 21:
                MoneyTransferPagerFragment moneyTransferPagerFragment = (MoneyTransferPagerFragment) obj2;
                MoneyReceiverInfo moneyReceiverInfo = (MoneyReceiverInfo) obj;
                ArrayList arrayList = moneyTransferPagerFragment.s0;
                ArrayList arrayList2 = new ArrayList();
                if (!moneyReceiverInfo.e || moneyTransferPagerFragment.p0) {
                    aVar = null;
                } else {
                    aVar = new CreatePeopleTransferFragment.a();
                    aVar.C(false);
                    moneyTransferPagerFragment.vo(aVar);
                    arrayList.add(moneyTransferPagerFragment.getString(R.string.money_transfer_send));
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
                boolean z = moneyReceiverInfo.f;
                if (fkq0.b(moneyTransferPagerFragment.l0) || !z) {
                    aVar2 = null;
                } else {
                    aVar2 = moneyTransferPagerFragment.p0 ? new CreateChatTransferFragment.a(CreateChatTransferFragment.class, null, null) : new CreatePeopleTransferFragment.a();
                    aVar2.C(true);
                    moneyTransferPagerFragment.vo(aVar2);
                    if (!moneyTransferPagerFragment.q0) {
                        aVar2.y("");
                        aVar2.z("");
                    }
                    arrayList.add(moneyTransferPagerFragment.getString(R.string.money_transfer_request));
                }
                if (aVar2 != null) {
                    arrayList2.add(aVar2);
                }
                if (moneyTransferPagerFragment.p0) {
                    aVar3 = null;
                } else {
                    aVar3 = new MoneyTransferLinkFragment.a(true);
                    arrayList.add(moneyTransferPagerFragment.getString(R.string.money_transfer_link));
                }
                if (aVar3 != null) {
                    arrayList2.add(aVar3);
                }
                ViewPager2 viewPager2 = moneyTransferPagerFragment.u0;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                MoneyTransferPagerFragment.b bVar2 = moneyTransferPagerFragment.new b(viewPager2, arrayList2);
                moneyTransferPagerFragment.v0 = bVar2;
                ViewPager2 viewPager22 = moneyTransferPagerFragment.u0;
                if (viewPager22 == null) {
                    viewPager22 = null;
                }
                viewPager22.setAdapter(bVar2);
                SkeletonTabLayout skeletonTabLayout = moneyTransferPagerFragment.t0;
                if (skeletonTabLayout == null) {
                    skeletonTabLayout = null;
                }
                ViewPager2 viewPager23 = moneyTransferPagerFragment.u0;
                if (viewPager23 == null) {
                    viewPager23 = null;
                }
                new com.google.android.material.tabs.c(skeletonTabLayout, viewPager23, new e8(moneyTransferPagerFragment, 22)).a();
                boolean z2 = moneyReceiverInfo.e;
                moneyTransferPagerFragment.wo(bVar2.s.size());
                if (moneyTransferPagerFragment.q0 && z2) {
                    View view2 = moneyTransferPagerFragment.getView();
                    ViewPager2 viewPager24 = view2 != null ? (ViewPager2) view2.findViewById(R.id.money_transfer_pager) : null;
                    if (viewPager24 != null) {
                        viewPager24.post(new rc4(viewPager24, 11));
                    }
                }
                SkeletonTabLayout skeletonTabLayout2 = moneyTransferPagerFragment.t0;
                (skeletonTabLayout2 != null ? skeletonTabLayout2 : null).setShimmerVisible(false);
                moneyTransferPagerFragment.wo(arrayList2.size());
                return s3q0.a;
            case 22:
                final ah30 ah30Var = (ah30) obj2;
                ah30.a aVar5 = (ah30.a) obj;
                final long j = aVar5.a;
                final long j2 = aVar5.b;
                final int i5 = aVar5.c;
                return new io.reactivex.rxjava3.internal.operators.maybe.p(new Callable() { // from class: xsna.zg30
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ah30 ah30Var2 = ah30.this;
                        return ah30Var2.f.b(ah30Var2.b, j, j2, i5, o25.b(ah30Var2.c));
                    }
                });
            case 23:
                e140 e140Var = (e140) obj2;
                e140Var.a();
                izs<? super MsgType, s3q0> izsVar = e140Var.s;
                izs<? super MsgType, s3q0> izsVar2 = izsVar != null ? izsVar : null;
                long[] jArr = e140Var.r;
                cew.b.getClass();
                izsVar2.invoke(new MsgType.WithTtl(jArr[cew.h().getInt("pref_message_expiration_option_index", 0)]));
                return s3q0.a;
            case 24:
                u440 u440Var = (u440) obj2;
                u440Var.A7();
                u440Var.j.h(u440Var.G7());
                return s3q0.a;
            case 25:
                s840 s840Var = (s840) obj2;
                s840Var.o.Ig(s840Var.n, null);
                return s3q0.a;
            case 26:
                vg40 vg40Var = (vg40) obj2;
                n8b0 n8b0Var = (n8b0) obj;
                Playlist playlist = vg40Var.q;
                if (playlist != null) {
                    int i6 = playlist.b;
                    Playlist playlist2 = n8b0Var.a;
                    if (i6 == playlist2.b) {
                        if (vg40.a6(playlist.H) && vg40.a6(playlist2.H)) {
                            ValueAnimator valueAnimator = vg40Var.s;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            vg40Var.b6(playlist2);
                            vg40Var.q = playlist2;
                        } else {
                            vg40Var.V5(playlist2);
                        }
                    }
                }
                return s3q0.a;
            case 27:
                ((MusicOfflineCatalogRootVh) obj2).z.d();
                return s3q0.a;
            case 28:
                NewsEntry newsEntry = (NewsEntry) obj2;
                newsEntry.e = false;
                return newsEntry;
            default:
                String str = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0(" \n        SELECT COUNT(*)\n        FROM audio_track\n        WHERE audio_track.json_raw like '%\"moosic_audio\"%'\n        AND audio_track.uid = ?\n    ");
                try {
                    V0.D3(1, str);
                    int i7 = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i7);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }
}
