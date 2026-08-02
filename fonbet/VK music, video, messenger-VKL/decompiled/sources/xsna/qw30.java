package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.section.domain.CatalogReorderData;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.rating.RatingBar$Size;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.tabs.d;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.reactions.ReactionSet;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.good.router.model.MarketBusinessOnboardingParams;
import com.vk.ecomm.market.good.good2.presentation.businessonboarding.ProductCardBusinessOnboardingState;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.notifications.core.item.a;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipImportContactsAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.d4f0;
import xsna.evd0;
import xsna.gm50;
import xsna.hf70;
import xsna.i8a0;
import xsna.ikv0;
import xsna.jda0;
import xsna.ptd0;
import xsna.q8a0;
import xsna.qn60;
import xsna.qr60;
import xsna.r070;
import xsna.sl90;
import xsna.tj50;
import xsna.tlo0;
import xsna.xh60;
import xsna.yda;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qw30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qw30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType eventType;
        boolean z;
        String str;
        String string;
        Collection<ReactionSet> values;
        ArrayList arrayList;
        int i = 3;
        int i2 = 6;
        int i3 = 2;
        int i4 = 10;
        r6 = null;
        ReactionSet reactionSet = null;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                rw30 rw30Var = (rw30) this.c;
                Pair pair = (Pair) obj;
                hy30 hy30Var = (hy30) pair.d();
                int intValue = ((Number) pair.g()).intValue();
                iy30 b1 = rw30Var.b1();
                ikv0 ikv0Var = b1.p;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                b1.p = null;
                int i5 = 12;
                if (intValue <= 0) {
                    if (!drm0.N(hy30Var.d)) {
                        List<PeersSearchBlock> list = hy30Var.j.a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (PeersSearchBlock peersSearchBlock : list) {
                                if (!(peersSearchBlock instanceof PeersSearchBlock.d) && !(peersSearchBlock instanceof PeersSearchBlock.e)) {
                                }
                            }
                        }
                    }
                    Context context = rw30Var.b1().c;
                    tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_search_sync_snack_not_found_text);
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_info_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_secondary), (Size) null, 12);
                    aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar.n();
                    rw30Var.e1(hy30Var);
                    return s3q0.a;
                }
                int i6 = ImSearchAnalytics.a.$EnumSwitchMapping$0[ImSearchAnalytics.SyncContactsResult.SUCCESS.ordinal()];
                if (i6 == 1) {
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.ACCEPT_IMPORT_CONTACTS;
                } else if (i6 == 2) {
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.DECLINE_IMPORT_CONTACTS;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.IMPORT_CONTACTS_SUCCESS;
                }
                new iid0(MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHATS, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsCallsStat$TypeVoipImportContactsAction(eventType, MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.Source.CALLS_SERVICES), 3)).q();
                iy30 b12 = rw30Var.b1();
                fdw.a(b12.c, tq.h(tlo0.Companion, R.string.vkim_search_sync_snack_text), new tlo0.f(R.string.vkim_search_sync_snack_button), new com.vk.movika.sdk.base.ui.m(i5, rw30Var.j, b12));
                rw30Var.e1(hy30Var);
                return s3q0.a;
            case 1:
                ((fsv) this.c).Ig(R.id.music_add_playlist_btn, null);
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((Playlist) obj).b == ((Playlist) this.c).b);
            case 3:
                b950 b950Var = (b950) this.c;
                Subscription subscription = (Subscription) obj;
                mzp0 mzp0Var = b950Var.d;
                MusicSubscriptionControlFragment musicSubscriptionControlFragment = b950Var.b;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                b950Var.e = null;
                StringBuilder sb = new StringBuilder("isPurchased=");
                boolean z3 = subscription.s;
                String str2 = subscription.o;
                String str3 = subscription.l;
                String str4 = subscription.i;
                boolean z4 = subscription.D;
                sb.append(z3);
                sb.append(", canShowAlternativePaymentMethod=");
                sb.append(z4);
                bn40.f(sb.toString());
                Object[] objArr = BuildInfo.u() && BuildInfo.n() && !MusicFeatures.AUDIO_RUSTORE_SUBSCRIPTION.h();
                if (subscription.s) {
                    FragmentActivity activity = musicSubscriptionControlFragment.getActivity();
                    if (activity != null) {
                        boolean z5 = subscription.u;
                        int i7 = NotificationCompat.CATEGORY_PROMO.equals(subscription.k) ? R.string.music_subscription_screen_status_valid_till_template : R.string.music_subscription_screen_status_next_bill_template;
                        if (z5) {
                            string = activity.getString(R.string.music_subscription_screen_error_payement_retry_state);
                            z = z5;
                        } else {
                            long j = subscription.h;
                            FragmentActivity activity2 = musicSubscriptionControlFragment.getActivity();
                            Resources resources = activity2 != null ? activity2.getResources() : null;
                            if (j <= 0 || resources == null) {
                                z = z5;
                                str = "";
                            } else {
                                Calendar calendar = Calendar.getInstance();
                                int i8 = Calendar.getInstance().get(1);
                                z = z5;
                                calendar.setTimeInMillis(j * 1000);
                                int i9 = calendar.get(5);
                                int i10 = calendar.get(2);
                                int i11 = calendar.get(1);
                                str = i8 != i11 ? String.format("%d %s %d", Arrays.copyOf(new Object[]{Integer.valueOf(i9), resources.getStringArray(R.array.vk_months_full)[Math.min(11, i10)], Integer.valueOf(i11)}, 3)) : String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i9), resources.getStringArray(R.array.vk_months_full)[Math.min(11, i10)]}, 2));
                            }
                            string = activity.getString(i7, str);
                        }
                        d950 d950Var = musicSubscriptionControlFragment.V;
                        if (d950Var == null) {
                            d950Var = null;
                        }
                        d950Var.k.x0(new Pair(str4, str3));
                        d950Var.m.x0(subscription.p);
                        d950Var.l.x0(new Pair(string, Boolean.valueOf(z)));
                        d950Var.o.x0(subscription.n);
                        d950Var.r.x0(str2);
                        d950Var.n.x0(null);
                        d950Var.p.x0(null);
                        d950Var.C0(false);
                    }
                    mzp0 mzp0Var2 = musicSubscriptionControlFragment.J;
                    if (mzp0Var2 != null) {
                        mzp0Var2.d(musicSubscriptionControlFragment.getView());
                    }
                } else if (z4 || objArr == true) {
                    d950 d950Var2 = musicSubscriptionControlFragment.V;
                    if (d950Var2 == null) {
                        d950Var2 = null;
                    }
                    d950Var2.k.x0(new Pair(str4, str3));
                    d950Var2.n.x0(null);
                    d950Var2.m.x0(null);
                    d950Var2.l.x0(null);
                    d950Var2.p.x0(null);
                    d950Var2.o.x0(null);
                    d950Var2.r.x0(str2);
                    d950Var2.C0(false);
                    maz.c(xwk.d().e(), musicSubscriptionControlFragment.requireContext(), vm40.c("settings", null), LaunchContext.A, null, null, 24);
                    mzp0 mzp0Var3 = musicSubscriptionControlFragment.J;
                    if (mzp0Var3 != null) {
                        mzp0Var3.d(musicSubscriptionControlFragment.getView());
                    }
                } else {
                    oge0 oge0Var = b950Var.c;
                    Context context2 = e43.a;
                    oge0Var.c(context2 != null ? context2 : null).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new gl30(new g84(20, b950Var, subscription), 4), new afs(new u3u(b950Var, 14), i4));
                }
                return s3q0.a;
            case 4:
                return ((zi50) this.c).a((List) obj);
            case 5:
                e860 e860Var = (e860) this.c;
                int i12 = e860.z1;
                e860Var.y1 = VkBridgeAnalytics.PersonalDiscountExitReason.POSITIVE_BUTTON;
                e860Var.p1 = true;
                vdx0 vdx0Var = e370.e;
                rfn0 t = (vdx0Var != null ? vdx0Var : null).t();
                mgn0 mgn0Var = dgn0.a;
                if (BuildInfo.j() && !BuildInfo.e()) {
                    r7 = true;
                }
                e860Var.o1.b(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(t.a(r7), new gl30(new xc50(e860Var, i3), i2)), new o0s(e860Var, i)).subscribe(new cp50(new tcn(e860Var, 28), i3)));
                return s3q0.a;
            case 6:
                NewsfeedFilteredSourcesFragment newsfeedFilteredSourcesFragment = (NewsfeedFilteredSourcesFragment) this.c;
                int i13 = NewsfeedFilteredSourcesFragment.a0;
                int i14 = com.vk.core.view.components.tabs.d.G;
                nxv0 a = d.a.a(newsfeedFilteredSourcesFragment.requireContext());
                a.setText(((TabLayout.g) obj).c);
                return a;
            case 7:
                dv60 dv60Var = (dv60) this.c;
                lu60 lu60Var = (lu60) obj;
                if (epx.f(lu60Var.c(), Boolean.TRUE)) {
                    List<NewsEntry> a2 = lu60Var.a();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : a2) {
                        Post R = di60.R((NewsEntry) obj2);
                        if ((R != null ? R.C : null) == null || !((Boolean) dv60Var.q.getValue()).booleanValue()) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        c0c0 l = kn4.l((NewsEntry) it.next());
                        if (l != null) {
                            arrayList3.add(l);
                        }
                    }
                    Map<String, ReactionSet> map = lu60Var instanceof ew60 ? ((ew60) lu60Var).e : lu60Var instanceof bl60 ? ((bl60) lu60Var).f : null;
                    if (map != null && (values = map.values()) != null) {
                        reactionSet = (ReactionSet) j5g.Z(values);
                    }
                    dv60Var.a(new r070.i.a(arrayList3, reactionSet));
                }
                return s3q0.a;
            case 8:
                qv60 qv60Var = (qv60) this.c;
                Map map2 = (Map) obj;
                qn60 qn60Var = qv60Var.f;
                LinkedHashSet c = qn60Var.c();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : c) {
                    if (obj3 instanceof NewsEntry) {
                        arrayList4.add(obj3);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        NewsEntry newsEntry = (NewsEntry) it2.next();
                        if (map2.containsKey(new Pair(Long.valueOf(k9q0.o(newsEntry).b), Integer.valueOf(di60.n(newsEntry))))) {
                            arrayList = new ArrayList();
                            if (!map2.isEmpty() && ((Boolean) qv60Var.i.getValue()).booleanValue()) {
                                arrayList.add(new sl0(qv60Var.g, map2));
                            }
                            if (z2 || arrayList.isEmpty()) {
                                return io.reactivex.rxjava3.core.x.k(new kv60(new qr60.a.C3569a(map2)));
                            }
                            qv60Var.c(xh60.a.a);
                            qn60.b[] bVarArr = (qn60.b[]) arrayList.toArray(new qn60.b[0]);
                            return new io.reactivex.rxjava3.internal.operators.single.b(new h3i(qn60Var, (qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length))).l(new op0(new bjk(map2, 24), 25));
                        }
                    }
                }
                z2 = false;
                arrayList = new ArrayList();
                if (!map2.isEmpty()) {
                    arrayList.add(new sl0(qv60Var.g, map2));
                }
                if (z2) {
                }
                return io.reactivex.rxjava3.core.x.k(new kv60(new qr60.a.C3569a(map2)));
            case 9:
                gf70 gf70Var = (gf70) this.c;
                tj50.a aVar2 = (tj50.a) obj;
                df70 df70Var = df70.b;
                ao8 ao8Var = ao8.d;
                return new hf70.a(aVar2.a(df70Var, ao8Var), aVar2.a(ef70.b, ao8Var), aVar2.a(new wo40(gf70Var, i2), ao8Var), aVar2.a(ff70.b, ao8Var));
            case 10:
                ((rzq0) obj).b(((a.b) this.c).a, ei70.b);
                return s3q0.a;
            case 11:
                wl90 wl90Var = (wl90) this.c;
                vgg vggVar = (vgg) obj;
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                bVar.getClass();
                com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.CONFIRM_AUTH_FAILED, null, null, null, 30);
                sl90.a y0 = wl90Var.y0();
                ul90 ul90Var = (ul90) wl90Var.a;
                if (ul90Var != null) {
                    ul90Var.Yl(y0);
                }
                vggVar.c();
                return s3q0.a;
            case 12:
                ((z8a0) this.c).e.invoke(new i8a0.f((q8a0.a) obj));
                return s3q0.a;
            case 13:
                return new jda0.a(((tj50.a) obj).a(new zca0(1, (ada0) this.c, ada0.class, "buildListState", "buildListState(Lcom/vk/photos/root/photoflow/tags/domain/PhotoTagsState;)Lcom/vk/photos/root/photoflow/tags/domain/PhotoTagsViewState$ListState;", 0), ao8.d));
            case 14:
                ((dea0) this.c).i = true;
                return s3q0.a;
            case 15:
                return ((BaseOkResponseDto) obj) == BaseOkResponseDto.OK ? (List) this.c : EmptyList.b;
            case 16:
                rvu rvuVar = (rvu) this.c;
                rvuVar.a((com.vk.music.player.playback.e) obj);
                return new io.reactivex.rxjava3.internal.operators.single.r(((sxa0) rvuVar.d).h(), new bk1(new wg1((sxa0) rvuVar.d, 15), 27));
            case 17:
                ojb0 ojb0Var = (ojb0) this.c;
                ThumbsImageView thumbsImageView = (ThumbsImageView) obj;
                bwt0.p0(thumbsImageView, true);
                ArrayList arrayList5 = ojb0Var.a;
                ArrayList arrayList6 = new ArrayList(c5g.u(new wow(arrayList5), 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add((Thumb) ((qow) it3.next()).a);
                }
                thumbsImageView.setThumbs(arrayList6);
                return s3q0.a;
            case 18:
                ((uzb0) this.c).d.b((Throwable) obj);
                return s3q0.a;
            case 19:
                VkInputSelect vkInputSelect = ((enc0) this.c).n;
                vkInputSelect.setLinkTextColor(-16777216);
                vkInputSelect.setLinkTextColor(dhr0.t.c(R.attr.vk_ui_text_accent));
                return s3q0.a;
            case 20:
                WallWithCounters wallWithCounters = (WallWithCounters) this.c;
                qn60.c cVar = (qn60.c) obj;
                return new gtc0(cVar.a, cVar.b, wallWithCounters, wallWithCounters.i());
            case 21:
                kjd0 kjd0Var = (kjd0) this.c;
                UserId userId = kjd0Var.a;
                long j2 = kjd0Var.b;
                String str5 = kjd0Var.c;
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = kjd0Var.d;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = kjd0Var.e;
                String str6 = kjd0Var.g;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = kjd0Var.f;
                MarketBusinessOnboardingParams marketBusinessOnboardingParams = kjd0Var.h;
                return new nmd0(userId, j2, str5, goodFragmentAnalyticsParams, commonMarketStat$TypeRefSource, str6, mobileOfficialAppsCoreNavStat$EventScreen, null, null, null, null, null, true, false, false, false, false, marketBusinessOnboardingParams != null ? new ProductCardBusinessOnboardingState(marketBusinessOnboardingParams.b, marketBusinessOnboardingParams.c, marketBusinessOnboardingParams.d, marketBusinessOnboardingParams.e, true) : null);
            case 22:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) this.c;
                ptd0.a aVar3 = (ptd0.a) obj;
                ComposeView composeView = productsSelectionBottomSheet.m1;
                if (composeView == null) {
                    composeView = null;
                }
                composeView.setVisibility(8);
                VkSpinner vkSpinner = productsSelectionBottomSheet.n1;
                if (vkSpinner == null) {
                    vkSpinner = null;
                }
                vkSpinner.setVisibility(8);
                RecyclerView recyclerView = productsSelectionBottomSheet.i1;
                (recyclerView != null ? recyclerView : null).setVisibility(0);
                gm50.a.a(productsSelectionBottomSheet, aVar3.a, new af50(productsSelectionBottomSheet, 18));
                gm50.a.a(productsSelectionBottomSheet, aVar3.b, new r8a0(productsSelectionBottomSheet, 9));
                return s3q0.a;
            case 23:
                evd0.d dVar = (evd0.d) this.c;
                Narrative narrative = (Narrative) dVar.m;
                if (narrative != null) {
                    dVar.o.invoke(narrative, new WeakReference<>(dVar.itemView));
                    r7 = true;
                }
                return Boolean.valueOf(r7);
            case 24:
                exd0 exd0Var = (exd0) this.c;
                exd0Var.x7();
                com.vk.lists.c cVar2 = exd0Var.c.b0;
                (cVar2 != null ? cVar2 : null).q(0);
                return s3q0.a;
            case 25:
                ProfilePhotoTag profilePhotoTag = (ProfilePhotoTag) this.c;
                int i15 = ProfileMainPhotosFragment.F0;
                return Boolean.valueOf(((ProfilePhotoTag) obj).b.c == profilePhotoTag.b.c);
            case 26:
                ((wh50) this.c).setValue((RatingBar$Size) obj);
                return s3q0.a;
            case 27:
                ((e2f0) this.c).getClass();
                List<zam0> list2 = (List) obj;
                ArrayList arrayList7 = new ArrayList(c5g.u(list2, 10));
                for (zam0 zam0Var : list2) {
                    arrayList7.add(new y0f0(zam0Var.a, zam0Var.b, zam0Var.c, zam0Var.d, zam0Var.e));
                }
                return arrayList7;
            case 28:
                j4f0 j4f0Var = (j4f0) this.c;
                List<ol60> list3 = ((ReactionsFeedMviState) j4f0Var.b.getCurrentState()).c.b.a;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : list3) {
                    if (obj4 instanceof z1c0) {
                        arrayList8.add(obj4);
                    }
                }
                ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
                Iterator it4 = arrayList8.iterator();
                while (it4.hasNext()) {
                    arrayList9.add(((z1c0) it4.next()).h.h);
                }
                ArrayList arrayList10 = new ArrayList();
                Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (next instanceof vt80) {
                        arrayList10.add(next);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                Iterator it6 = arrayList10.iterator();
                while (it6.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it6.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList11.add(x9v0Var);
                    }
                }
                j4f0Var.c(new d4f0.a(new yo60.i.a(arrayList11)));
                return s3q0.a;
            default:
                yda.d dVar2 = (yda.d) this.c;
                CatalogSectionState catalogSectionState = (CatalogSectionState) obj;
                List<CatalogBlockData> list4 = catalogSectionState.k;
                if (list4 == null) {
                    list4 = catalogSectionState.d;
                }
                yda.d.a aVar4 = (yda.d.a) dVar2;
                int i16 = aVar4.b;
                BlockId blockId = aVar4.e;
                BlockId blockId2 = aVar4.c;
                int i17 = aVar4.d;
                if (!epx.f(list4.get(i16).g().w(), blockId2) || !epx.f(list4.get(i17).g().w(), blockId)) {
                    return catalogSectionState;
                }
                ArrayList arrayList12 = new ArrayList(catalogSectionState.l);
                CatalogReorderData catalogReorderData = (CatalogReorderData) j5g.k0(arrayList12);
                if (catalogReorderData != null) {
                    int i18 = catalogReorderData.c;
                    String str7 = catalogReorderData.b;
                    if (str7.equals(rzf0.b(blockId2))) {
                        if (i18 == i17) {
                            arrayList12.remove(arrayList12.size() - 1);
                        } else {
                            arrayList12.remove(arrayList12.size() - 1);
                            arrayList12.add(new CatalogReorderData(str7, i18, rzf0.b(blockId), i17));
                        }
                        ArrayList arrayList13 = new ArrayList(list4);
                        arrayList13.add(i17, arrayList13.remove(i16));
                        s3q0 s3q0Var = s3q0.a;
                        return CatalogSectionState.a(catalogSectionState, null, false, false, null, null, false, arrayList13, arrayList12, null, null, 6655);
                    }
                }
                arrayList12.add(new CatalogReorderData(rzf0.b(blockId2), i16, rzf0.b(blockId), i17));
                ArrayList arrayList132 = new ArrayList(list4);
                arrayList132.add(i17, arrayList132.remove(i16));
                s3q0 s3q0Var2 = s3q0.a;
                return CatalogSectionState.a(catalogSectionState, null, false, false, null, null, false, arrayList132, arrayList12, null, null, 6655);
        }
    }

    public /* synthetic */ qw30(b950 b950Var, int i) {
        this.b = 3;
        this.c = b950Var;
    }

    public /* synthetic */ qw30(dv60 dv60Var, kn4 kn4Var) {
        this.b = 7;
        this.c = dv60Var;
    }
}
