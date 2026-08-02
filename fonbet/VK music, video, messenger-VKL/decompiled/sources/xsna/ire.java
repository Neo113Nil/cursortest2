package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.holders.video.KidsEmptyFilterPlaceholderVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.profile.community.details.impl.contacts.f;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.fab.ProfileFabState;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.dmz;
import xsna.gm50;
import xsna.nls;
import xsna.odn;
import xsna.saf;
import xsna.ure;
import xsna.wih;
import xsna.wk50;
import xsna.xlt;
import xsna.y6u;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ire implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ire(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((nre) obj3).n.b(ure.b.a);
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                s4f s4fVar = (s4f) obj3;
                s4fVar.f = 0;
                s4fVar.i.r(true);
                return s3q0.a;
            case 2:
                saf.e = saf.a.d.a;
                ((saf) obj3).c = (io.reactivex.rxjava3.disposables.c) obj;
                return s3q0.a;
            case 3:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                ((CommentThreadFragment) obj3).finish();
                return s3q0.a;
            case 4:
                ((com.vk.profile.community.details.impl.contacts.c) obj3).g.b(f.a.a);
                return s3q0.a;
            case 5:
                d4h d4hVar = (d4h) obj3;
                lru lruVar = (lru) obj;
                ((l3i) d4hVar.g.Y0.getValue()).a(d4hVar.a, lruVar.h, lruVar.g.j, "group_carousel_more");
                return s3q0.a;
            case 6:
                ((wk50.a) obj3).b(new e.g((Throwable) obj));
                return s3q0.a;
            case 7:
                wih.a aVar = (wih.a) obj3;
                ProfileFabState profileFabState = (ProfileFabState) obj;
                Iterator<T> it = aVar.n.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((CommunityProfileContentItem) next).h == profileFabState.a) {
                            obj2 = next;
                        }
                    }
                }
                CommunityProfileContentItem communityProfileContentItem = (CommunityProfileContentItem) obj2;
                if (communityProfileContentItem != null) {
                    aVar.q.e(communityProfileContentItem);
                }
                return s3q0.a;
            case 8:
                ((com.vk.profile.community.impl.ui.profile.a) obj3).C((CommunityProfileAction) obj);
                return s3q0.a;
            case 9:
                ((osh) obj3).f.invoke(new d.n.a(false));
                return s3q0.a;
            case 10:
                ((zak0) ((ContextMenuScreenContent) obj3).j).setValue((ContextMenuScreenContent.MenuItemsVariant) obj);
                return s3q0.a;
            case 11:
                return Boolean.valueOf(((List) obj3).contains((Target) obj));
            case 12:
                ((jmm) obj3).m.w();
                return s3q0.a;
            case 13:
                NewsEntry newsEntry = (NewsEntry) obj3;
                x960 x960Var = (x960) obj;
                if (newsEntry instanceof DiscoverMediaBlock) {
                    newsEntry.e = false;
                }
                NewsEntry newsEntry2 = (NewsEntry) j5g.a0(x960Var.a().c);
                if (newsEntry2 != null) {
                    return newsEntry2;
                }
                throw new DiscoverNewsEntriesRepository.EmptyResponseException();
            case 14:
                ndn ndnVar = (ndn) obj3;
                AudioBook audioBook = (AudioBook) obj;
                mzp0 mzp0Var = ndnVar.l;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                ndnVar.T(new odn.a(audioBook, ndnVar.U()));
                return s3q0.a;
            case 15:
                View view = (View) obj;
                ((wio) obj3).t.setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, view.getWidth(), view.getHeight())));
                return s3q0.a;
            case 16:
                ((com.vk.folders.impl.model.a) obj3).i.set(false);
                return s3q0.a;
            case 17:
                ((gls) obj3).j.b(new nls.a((Throwable) obj));
                return s3q0.a;
            case 18:
                bmt bmtVar = (bmt) obj3;
                List<ol60> list = ((gmt) bmtVar.b.getCurrentState()).d.b.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof z1c0) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((z1c0) it2.next()).h.h);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (next2 instanceof vt80) {
                        arrayList4.add(next2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it4.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList5.add(x9v0Var);
                    }
                }
                bmtVar.c(new xlt.a(new yo60.i.a(arrayList5)));
                return s3q0.a;
            case 19:
                ((k6u) obj3).T(new y6u.d.a((Throwable) obj));
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, ((pju) obj3).t ? "storefront_unsubscribe_button" : "storefront_subscribe_button");
                return s3q0.a;
            case 21:
                ((pbx) obj3).b = null;
                return s3q0.a;
            case 22:
                ((x6y) obj3).z(JsApiMethodType.DOWNLOAD_FILE, (Throwable) obj);
                return s3q0.a;
            case 23:
                KidsEmptyFilterPlaceholderVh kidsEmptyFilterPlaceholderVh = (KidsEmptyFilterPlaceholderVh) obj3;
                String str = kidsEmptyFilterPlaceholderVh.c;
                if (str != null) {
                    kidsEmptyFilterPlaceholderVh.b.b(new ktf0(str), false);
                    iid0 iid0Var = new iid0();
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset(MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterReset.EventSubtype.BUTTON), 3);
                    iid0Var.f = c;
                    iid0Var.g = b;
                    iid0Var.q();
                }
                return s3q0.a;
            case 24:
                cmz cmzVar = (cmz) obj3;
                bwt0.p0(cmzVar.d, false);
                bwt0.p0(cmzVar.e, true);
                gm50.a.a(cmzVar, ((dmz.a) obj).a, new kdn(cmzVar, 14));
                bwt0.p0(cmzVar.f, false);
                bwt0.p0(cmzVar.g, false);
                return s3q0.a;
            case 25:
                com.vk.ecomm.reviews.impl.allreviews.presentation.b bVar = (com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj3;
                Throwable th = (Throwable) obj;
                mzp0 mzp0Var2 = bVar.g;
                if (mzp0Var2 != null) {
                    mzp0Var2.f();
                }
                bVar.T(new c.a(th));
                return s3q0.a;
            case 26:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VkButton vkButton = ((MarketItemReviewsFragment) obj3).p0;
                bwt0.p0(vkButton != null ? vkButton : null, booleanValue);
                return s3q0.a;
            case 27:
                Photo photo = (Photo) obj3;
                PhotoAttachment photoAttachment = (PhotoAttachment) obj;
                return Boolean.valueOf(epx.f(photoAttachment.g, photo.e) && photoAttachment.f == photo.c);
            case 28:
                ((w920) obj3).g.debug(new hvz((m8v) obj, 6));
                return s3q0.a;
            default:
                rx30 rx30Var = (rx30) obj3;
                int i2 = yur0.n;
                return new yur0(rx30Var.i.inflate(R.layout.vkim_search_recent_title_vh, (ViewGroup) obj, false), rx30Var.h);
        }
    }
}
