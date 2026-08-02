package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import com.vk.api.generated.apps.dto.AppsClearRecentsPlatformDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewsResponseDto;
import com.vk.api.generated.market.dto.MarketItemReviewsBottomButtonDto;
import com.vk.api.generated.market.dto.MarketItemSkuReviewDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.auth.enterpassword.EnterPasswordPresenter;
import com.vk.auth.main.AuthStatSender;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalLoopVh;
import com.vk.core.ui.modal.VkModal;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Good;
import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.b;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.profile.community.members.impl.ui.a;
import com.vk.profile.community.suggestions.impl.ui.suggestions.d;
import com.vk.profile.user.impl.ui.f;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGamesCatalogRootVh;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemLogoutButtonView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import xsna.atq0;
import xsna.bzx;
import xsna.c4u;
import xsna.ejd0;
import xsna.h8u;
import xsna.j0j;
import xsna.kjf0;
import xsna.l2f;
import xsna.n410;
import xsna.tlo0;
import xsna.vf3;
import xsna.xoq;
import xsna.y2u0;
import xsna.ybp;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ozh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ozh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x04b2, code lost:
    
        if (r7 == null) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        yop yopVar;
        NewsEntry.TrackData Cb;
        ?? r4;
        ReactionMeta d;
        BadgesSet u0;
        kjf0.a aVar;
        s3q0 s3q0Var;
        kjf0.a aVar2;
        String str;
        long j;
        ArrayList arrayList;
        ?? r5;
        boolean z;
        Context context;
        UserId userId;
        UserId userId2;
        List<UsersUserFullDto> f;
        List<GroupsGroupFullDto> d2;
        int i = this.b;
        int i2 = 10;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                vzh vzhVar = (vzh) obj;
                uzh uzhVar = ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.f) obj2).d;
                boolean z2 = vzhVar.c;
                boolean z3 = vzhVar.k;
                uzhVar.getClass();
                return z2 ? new uyh(tq.h(tlo0.Companion, R.string.reviews_empty_title_restricted_to_add), new tlo0.f(R.string.reviews_empty_subtitle_restricted_to_add), false, true) : z3 ? new uyh(tq.h(tlo0.Companion, R.string.reviews_empty_title), null, true, false) : new uyh(tq.h(tlo0.Companion, R.string.community_reviews_empty_list_cant_add_review_title), new tlo0.f(R.string.community_reviews_empty_list_cant_add_review_subtitle), false, true);
            case 1:
                o1i o1iVar = (o1i) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = o1iVar.c;
                extendedCommunityProfile.c2 = !extendedCommunityProfile.c2;
                o1iVar.d.t8(extendedCommunityProfile, false);
                return s3q0.a;
            case 2:
                com.vk.profile.community.suggestions.impl.ui.suggestions.b bVar = (com.vk.profile.community.suggestions.impl.ui.suggestions.b) obj2;
                f3i f3iVar = (f3i) obj;
                bVar.i.getClass();
                bVar.T(new d.c(f3iVar.a, f3iVar.b, null, bVar.h));
                return s3q0.a;
            case 3:
                l2f.a aVar3 = (l2f.a) obj2;
                aVar3.b((io.reactivex.rxjava3.disposables.c) obj);
                l2f.a.c(aVar3);
                aVar3.g.post(new yn2(aVar3, 3));
                return s3q0.a;
            case 4:
                ((i1j) obj2).e.invoke(j0j.d.b);
                return s3q0.a;
            case 5:
                CreatePeopleTransferFragment createPeopleTransferFragment = (CreatePeopleTransferFragment) obj2;
                MoneyCard moneyCard = (MoneyCard) obj;
                int i3 = CreatePeopleTransferFragment.B0;
                Object obj3 = createPeopleTransferFragment.m0;
                ((h9k) (obj3 != null ? obj3 : null)).u(moneyCard);
                dw20 dw20Var = createPeopleTransferFragment.z0;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 6:
                akl aklVar = (akl) obj2;
                vqt vqtVar = (vqt) obj;
                s170 s170Var = aklVar.n;
                int i4 = vqtVar.b;
                VKList<NewsComment> vKList = vqtVar.a;
                s170Var.e(Math.max(0, i4 - vqtVar.c));
                com.vk.lists.c cVar = aklVar.i;
                int i5 = vqtVar.c;
                int size = vKList.size();
                if (i5 > 0) {
                    size += i5;
                }
                cVar.q(size);
                if (cVar.i() >= vqtVar.b) {
                    cVar.r(false);
                }
                String j2 = cVar.j();
                if (j2 == null || j2.length() == 0 || vKList.isEmpty()) {
                    cVar.r(false);
                }
                return s3q0.a;
            case 7:
                gxl gxlVar = (gxl) obj2;
                dw20 dw20Var2 = gxlVar.e;
                (dw20Var2 == null ? null : dw20Var2).dismiss();
                gxlVar.b.invoke();
                return s3q0.a;
            case 8:
                zvm zvmVar = (zvm) obj2;
                zvmVar.l = ((u180) obj).b.a;
                zvmVar.X0();
                return s3q0.a;
            case 9:
                f4m.E((VkEcosystemLogoutButtonView) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj2).k.getValue(), ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 10:
                ((com.vk.photos.ui.editalbum.domain.c) obj2).T(new e.j.a((String) obj));
                return s3q0.a;
            case 11:
                ((ldl) obj2).invoke();
                return s3q0.a;
            case 12:
                ubp ubpVar = (ubp) obj2;
                ubpVar.a().d(ubpVar.c);
                ubpVar.j = true;
                ubpVar.d.invoke(new ybp.b(false, ubpVar.b));
                VkModal vkModal = ubpVar.h;
                if (vkModal != null) {
                    vkModal.a();
                }
                return s3q0.a;
            case 13:
                EnterPasswordPresenter enterPasswordPresenter = (EnterPasswordPresenter) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                par0.a.getClass();
                par0.d(th);
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    if (!enterPasswordPresenter.B && (yopVar = (yop) enterPasswordPresenter.a) != null) {
                        yopVar.s7(wbu0.a(enterPasswordPresenter.b, th, false).a);
                    }
                    enterPasswordPresenter.B = true;
                    s3q0 s3q0Var2 = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 14:
                gpq gpqVar = (gpq) obj2;
                List<ol60> list = ((kpq) gpqVar.b.getCurrentState()).h.b.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof z1c0) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList4.add(next);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList5.add(x9v0Var);
                    }
                }
                gpqVar.c(new xoq.a(new yo60.i.a(arrayList5)));
                return s3q0.a;
            case 15:
                atq0.f fVar = new atq0.f(null, null, (Throwable) obj, 11);
                fpq0 fpq0Var = ((vlq0) obj2).k;
                (fpq0Var != null ? fpq0Var : null).B(new f.h(fVar));
                return s3q0.a;
            case 16:
                ((x3s) obj2).c.a(djq0.b);
                return s3q0.a;
            case 17:
                int i6 = GalleryFragmentImpl.R0;
                Bundle bundle = new Bundle();
                bundle.putBoolean("result_story_camera", true);
                Intent intent = new Intent();
                intent.putExtra("result_attachments", bundle);
                ((GalleryFragmentImpl) obj2).Mf(-1, intent);
                return s3q0.a;
            case 18:
                tst tstVar = (tst) obj2;
                ust ustVar = (ust) obj;
                tstVar.getClass();
                Parcelable parcelable = ustVar.a;
                rtt rttVar = ustVar.g;
                c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
                int i7 = c6zVar != null ? c6zVar.i7() : 0;
                boolean z4 = parcelable instanceof Badgeable;
                Badgeable badgeable = z4 ? (Badgeable) parcelable : null;
                boolean z5 = ((badgeable != null ? badgeable.u0() : null) == null || badgeable.ca() == null) ? false : true;
                ListBuilder e = e43.e();
                if (rttVar.a.c > 0) {
                    e.add(new v130("all", null, null));
                }
                if (z5) {
                    Badgeable badgeable2 = z4 ? (Badgeable) parcelable : null;
                    e.add(new v130("donats", (badgeable2 == null || (u0 = badgeable2.u0()) == null) ? null : Integer.valueOf(u0.f), null));
                }
                if (!tstVar.c.g()) {
                    ItemReactions itemReactions = rttVar.e;
                    ArrayList<ItemReaction> arrayList6 = itemReactions != null ? itemReactions.b : null;
                    if (arrayList6 == null || arrayList6.isEmpty()) {
                        r4 = EmptyList.b;
                    } else {
                        r4 = new ArrayList();
                        ReactionSet reactionSet = rttVar.d;
                        int size2 = arrayList6.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            ItemReaction itemReaction = arrayList6.get(i8);
                            if (itemReaction.c != 0 && (d = c2f0.d(reactionSet, itemReaction.b)) != null) {
                                r4.add(new v130("reaction" + d.getId(), Integer.valueOf(itemReaction.c), d));
                            }
                        }
                    }
                    e.addAll((Collection) r4);
                }
                if (rttVar.c != null && i7 > 0) {
                    e.add(new v130("reposts", Integer.valueOf(i7), null));
                }
                ListBuilder g = e.g();
                long j3 = ustVar.b;
                UserId userId3 = ustVar.c;
                NewsEntry newsEntry = ustVar.a;
                String str2 = (newsEntry == null || (Cb = newsEntry.Cb()) == null) ? null : Cb.b;
                return new o130(j3, userId3, str2 == null ? "" : str2, ustVar.d, ustVar.e, ustVar.f, badgeable != null ? badgeable.ca() : null, g);
            case 19:
                GlobalSearchGamesCatalogRootVh globalSearchGamesCatalogRootVh = (GlobalSearchGamesCatalogRootVh) obj2;
                if (((n3a) obj) instanceof lwf0) {
                    yf3 yf3Var = globalSearchGamesCatalogRootVh.z;
                    AppsClearRecentsPlatformDto appsClearRecentsPlatformDto = AppsClearRecentsPlatformDto.HTML5;
                    yf3Var.getClass();
                    globalSearchGamesCatalogRootVh.y.b(rsg0.T(yfb.x(vf3.a.a(appsClearRecentsPlatformDto))).subscribe(new a2u(new f57(27), 0), new y00(new ak(25), 23)));
                }
                return s3q0.a;
            case 20:
                ((io.reactivex.rxjava3.core.b) obj2).onComplete();
                return s3q0.a;
            case 21:
                GoodFragment goodFragment = (GoodFragment) obj2;
                c4u.a aVar4 = (c4u.a) obj;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                c4u a = goodFragment.Lo().a();
                cxo Po = goodFragment.Po();
                a.getClass();
                b110 b110Var = aVar4.a;
                if (b110Var != null) {
                    boolean z6 = aVar4.c;
                    boolean z7 = Po.s;
                    int i9 = b110Var.a;
                    Po.K = new i010(i9, b110Var.c, z6, z7, i9 == 0);
                }
                MarketGetItemReviewsResponseDto marketGetItemReviewsResponseDto = aVar4.b;
                if (marketGetItemReviewsResponseDto != null) {
                    boolean z8 = aVar4.c;
                    marketGetItemReviewsResponseDto.f().getClass();
                    boolean d3 = marketGetItemReviewsResponseDto.f().d();
                    qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                    goodFragment.Qo().b(new ejd0.f.h(d3));
                    s3q0 s3q0Var3 = s3q0.a;
                    y4u y4uVar = Po.a;
                    i8u i8uVar = (i8u) y4uVar.g0.getValue();
                    h010 h010Var = Po.f;
                    boolean a2 = (h010Var == null || (userId2 = h010Var.c) == null) ? false : ((u4h) y4uVar.v.getValue()).a(userId2);
                    Good good = Po.r;
                    MarketItemType marketItemType = good != null ? good.f : null;
                    IntegrationInfo integrationInfo = good != null ? good.r : null;
                    long j4 = good != null ? good.b : -1L;
                    if (good == null || (userId = good.c) == null) {
                        str = "";
                        j = -1;
                    } else {
                        str = "";
                        j = userId.b;
                    }
                    i8uVar.getClass();
                    String title = marketGetItemReviewsResponseDto.f().getTitle();
                    if (title == null) {
                        title = str;
                    }
                    Float e2 = marketGetItemReviewsResponseDto.f().e();
                    Float e3 = marketGetItemReviewsResponseDto.f().e();
                    String a3 = e3 != null ? i8uVar.a.a(e3.floatValue()) : null;
                    int f2 = marketGetItemReviewsResponseDto.f().f();
                    boolean d4 = marketGetItemReviewsResponseDto.f().d();
                    List<MarketItemSkuReviewDto> i10 = marketGetItemReviewsResponseDto.i();
                    if (i10 != null) {
                        List<MarketItemSkuReviewDto> list2 = i10;
                        arrayList = new ArrayList(c5g.u(list2, 10));
                        for (MarketItemSkuReviewDto marketItemSkuReviewDto : list2) {
                            String u = marketItemSkuReviewDto.u().u();
                            String str3 = u == null ? str : u;
                            List<List<BaseImageDto>> p = marketItemSkuReviewDto.p();
                            if (p != null) {
                                List<List<BaseImageDto>> list3 = p;
                                r5 = new ArrayList(c5g.u(list3, i2));
                                Iterator it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    r5.add(y2u0.a.a((List) it4.next()));
                                }
                            } else {
                                r5 = 0;
                            }
                            if (r5 == 0) {
                                r5 = EmptyList.b;
                            }
                            String l = marketItemSkuReviewDto.l();
                            String i11 = marketItemSkuReviewDto.i();
                            String f3 = marketItemSkuReviewDto.f();
                            Context context2 = e43.a;
                            if (context2 != null) {
                                z = z8;
                                context = context2;
                            } else {
                                z = z8;
                                context = null;
                            }
                            SpannableStringBuilder c = nig0.c(context, l, i11, f3);
                            String l2 = marketItemSkuReviewDto.l();
                            String i12 = marketItemSkuReviewDto.i();
                            String f4 = marketItemSkuReviewDto.f();
                            Context context3 = e43.a;
                            String str4 = title;
                            odo0 odo0Var = new odo0(c, nig0.b(context3 != null ? context3 : null, l2, i12, f4), false, 4);
                            String f5 = marketItemSkuReviewDto.u().f();
                            String k = marketItemSkuReviewDto.u().k();
                            String obj5 = (f5 == null || k == null) ? null : drm0.p0(f5 + ' ' + k).toString();
                            String str5 = obj5 == null ? str : obj5;
                            int id = marketItemSkuReviewDto.getId();
                            long k2 = marketItemSkuReviewDto.k();
                            UserId j5 = marketItemSkuReviewDto.u().j();
                            Boolean e4 = marketItemSkuReviewDto.e();
                            boolean booleanValue = e4 != null ? e4.booleanValue() : false;
                            Boolean d5 = marketItemSkuReviewDto.d();
                            arrayList.add(new u7u(id, k2, j5, str3, booleanValue, d5 != null ? d5.booleanValue() : false, new vhg0(str5, marketItemSkuReviewDto.n(), null, false, null, false, false, 252), new ugg0(r5, new dce0(pvo0.i(false, marketItemSkuReviewDto.j(), false, false)), odo0Var, false), marketItemSkuReviewDto.o()));
                            title = str4;
                            z8 = z;
                            i2 = 10;
                        }
                    } else {
                        arrayList = null;
                    }
                    boolean z9 = z8;
                    String str6 = title;
                    List list4 = arrayList;
                    if (arrayList == null) {
                        list4 = EmptyList.b;
                    }
                    List list5 = list4;
                    boolean isEmpty = marketGetItemReviewsResponseDto.i().isEmpty();
                    String e5 = marketGetItemReviewsResponseDto.e();
                    boolean k3 = marketGetItemReviewsResponseDto.k();
                    boolean j6 = marketGetItemReviewsResponseDto.j();
                    String g2 = marketGetItemReviewsResponseDto.g();
                    MarketItemReviewsBottomButtonDto d6 = marketGetItemReviewsResponseDto.d();
                    Po.J = new h8u(j4, j, str6, z9, e2, a3, f2, d4, list5, isEmpty, false, a2, e5, marketItemType, integrationInfo, k3, j6, g2, d6 != null ? new h8u.a(d6.e(), d6.d()) : null);
                }
                kjf0.a a4 = a.a(Po);
                if (a4 != null) {
                    ArrayList arrayList7 = Po.n;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                aVar2 = it5.next();
                                if (((kjf0.a) aVar2).a == 33) {
                                }
                            } else {
                                aVar2 = 0;
                            }
                        }
                        aVar = aVar2;
                    } else {
                        aVar = null;
                    }
                    if (aVar == null) {
                        jid0 jid0Var = Po.G;
                        if (jid0Var != null) {
                            jid0Var.A0(a4);
                            s3q0Var = s3q0.a;
                            break;
                        } else {
                            s3q0Var = null;
                            break;
                        }
                    } else {
                        ArrayList arrayList8 = Po.n;
                        int indexOf = arrayList8 != null ? arrayList8.indexOf(aVar) : -1;
                        ArrayList arrayList9 = Po.n;
                        if (arrayList9 != null) {
                            arrayList9.remove(aVar);
                        }
                        ArrayList arrayList10 = Po.n;
                        if (arrayList10 != null) {
                            arrayList10.add(indexOf, a4);
                        }
                        ArrayList arrayList11 = Po.n;
                        if (arrayList11 != null) {
                            ArrayList c2 = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList11);
                            jid0 jid0Var2 = Po.G;
                            if (jid0Var2 != null) {
                                jid0Var2.c = c2;
                                jid0Var2.notifyItemRangeInserted(indexOf, 1);
                            }
                        }
                        s3q0Var = s3q0.a;
                        break;
                    }
                }
                c4u.c(Po);
                a.c.onNext(b.a.a);
                return s3q0.a;
            case 22:
                return ((HorizontalLoopVh) obj2).e.c(((Integer) obj).intValue());
            case 23:
                ((wzx) obj2).c.invoke(bzx.c.b);
                return s3q0.a;
            case 24:
                g0z g0zVar = (g0z) obj2;
                bn40.d("Failed to load artist's popular tracks");
                g0zVar.c(g0zVar.a, "net_error");
                return s3q0.a;
            case 25:
                ((k3z) obj2).e.g(AuthStatSender.Screen.PHONE_CODE);
                return s3q0.a;
            case 26:
                eea eeaVar = (eea) obj2;
                if (((Boolean) obj).booleanValue()) {
                }
                return s3q0.a;
            case 27:
                Throwable th2 = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.q(th2);
                ((io.reactivex.rxjava3.core.r) obj2).onError(th2);
                return s3q0.a;
            case 28:
                m410 m410Var = (m410) obj2;
                MarketGetItemReviewsResponseDto marketGetItemReviewsResponseDto2 = (MarketGetItemReviewsResponseDto) obj;
                int f6 = marketGetItemReviewsResponseDto2.f().f();
                boolean d7 = marketGetItemReviewsResponseDto2.f().d();
                String title2 = marketGetItemReviewsResponseDto2.f().getTitle();
                String g3 = marketGetItemReviewsResponseDto2.f().g();
                Float e6 = marketGetItemReviewsResponseDto2.f().e();
                List<MarketItemSkuReviewDto> i13 = marketGetItemReviewsResponseDto2.i();
                int e7 = on00.e(c5g.u(i13, 10));
                if (e7 < 16) {
                    e7 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e7);
                for (MarketItemSkuReviewDto marketItemSkuReviewDto2 : i13) {
                    Pair pair = new Pair(Integer.valueOf(marketItemSkuReviewDto2.getId()), m410Var.d.a(marketItemSkuReviewDto2));
                    linkedHashMap.put(pair.i(), pair.j());
                }
                String e8 = marketGetItemReviewsResponseDto2.e();
                List<MarketItemSkuReviewDto> i14 = marketGetItemReviewsResponseDto2.i();
                MapBuilder mapBuilder = new MapBuilder();
                for (MarketItemSkuReviewDto marketItemSkuReviewDto3 : i14) {
                    mapBuilder.put(marketItemSkuReviewDto3.u().j(), tci.u(marketItemSkuReviewDto3.u()));
                    MarketReviewCommentsDto g4 = marketItemSkuReviewDto3.g();
                    if (g4 != null && (d2 = g4.d()) != null) {
                        for (GroupsGroupFullDto groupsGroupFullDto : d2) {
                            mapBuilder.put(fkq0.e(groupsGroupFullDto.P0()), tci.t(groupsGroupFullDto));
                        }
                    }
                    MarketReviewCommentsDto g5 = marketItemSkuReviewDto3.g();
                    if (g5 != null && (f = g5.f()) != null) {
                        for (UsersUserFullDto usersUserFullDto : f) {
                            mapBuilder.put(usersUserFullDto.s1(), tci.v(usersUserFullDto));
                        }
                    }
                }
                MapBuilder h = mapBuilder.h();
                boolean k4 = marketGetItemReviewsResponseDto2.k();
                boolean j7 = marketGetItemReviewsResponseDto2.j();
                String g6 = marketGetItemReviewsResponseDto2.g();
                MarketItemReviewsBottomButtonDto d8 = marketGetItemReviewsResponseDto2.d();
                return new n410(f6, d7, title2, g3, e6, linkedHashMap, h, e8, k4, j7, g6, d8 != null ? new n410.a(d8.e(), d8.d()) : null);
            default:
                ((z37) obj2).b(new a.c((String) obj));
                return s3q0.a;
        }
    }
}
