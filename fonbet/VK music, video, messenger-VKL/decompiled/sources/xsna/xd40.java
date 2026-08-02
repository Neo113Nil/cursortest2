package xsna;

import android.content.Context;
import android.view.Window;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsSubRecomThemeDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.im.ui.views.avatars.a;
import com.vk.log.L;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.music_picker.presentation.model.b;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.search.integration.followers.impl.presentation.SearchFollowersCatalogRootVh;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.f;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.j;
import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.a990;
import xsna.big;
import xsna.d6h0;
import xsna.ems;
import xsna.gss;
import xsna.h7u0;
import xsna.ikv0;
import xsna.jv60;
import xsna.r7h0;
import xsna.tj50;
import xsna.up90;
import xsna.whs;
import xsna.xe50;
import xsna.xn50;
import xsna.y0r0;
import xsna.yd40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xd40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xd40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        Object obj2;
        int i = this.b;
        int i2 = 9;
        int i3 = 12;
        int i4 = 5;
        int i5 = 2;
        int i6 = 6;
        int i7 = 7;
        int i8 = 3;
        int i9 = 10;
        boolean z = false;
        ScheduledCallViewItem.ScheduledCall.a aVar = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                yd40 yd40Var = (yd40) obj3;
                gzs<String> gzsVar = yd40Var.b;
                w950 w950Var = yd40Var.a;
                switch (yd40.a.$EnumSwitchMapping$0[((CatalogDataType) obj).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return new v36(w950Var);
                    case 6:
                        return new com.vk.catalog2.feature.music.holders.analytics.taps.a(w950Var);
                    case 7:
                        return new b80(w950Var);
                    case 8:
                        return new p670(w950Var, gzsVar);
                    case 9:
                        return new ys20(w950Var);
                    case 10:
                        return new h250(w950Var);
                    case 11:
                        return new o350(w950Var);
                    case 12:
                        return new xl4(w950Var);
                    case 13:
                        return new ipn0(w950Var);
                    case 14:
                        return new kwi(w950Var);
                    case 15:
                    case 16:
                        return new hzh0(w950Var, gzsVar);
                    case 17:
                        return new zd50(w950Var);
                    case 18:
                        return new lvh0(w950Var);
                    default:
                        return null;
                }
            case 1:
                MusicDownloadsHistoryCatalogRootVh musicDownloadsHistoryCatalogRootVh = (MusicDownloadsHistoryCatalogRootVh) obj3;
                Playlist k0 = MusicDownloadsHistoryCatalogRootVh.k0(((ri40) musicDownloadsHistoryCatalogRootVh.t.getValue()).z());
                if (k0 != null) {
                    musicDownloadsHistoryCatalogRootVh.r.a(musicDownloadsHistoryCatalogRootVh.b, k0, new com.vk.movika.tools.controls.seekbar.n(18));
                } else {
                    MusicDownloadsHistoryCatalogRootVh.a aVar2 = new MusicDownloadsHistoryCatalogRootVh.a(0, musicDownloadsHistoryCatalogRootVh, MusicDownloadsHistoryCatalogRootVh.class, "downloadAllHistory", "downloadAllHistory()V", 0);
                    h7u0.a aVar3 = new h7u0.a(musicDownloadsHistoryCatalogRootVh.p.a, R.style.VkAlertDialogNewTheme, null, 4);
                    aVar3.g0(R.string.music_offline_download_all_downloads_history_title);
                    aVar3.c0(R.string.download, new s7o(aVar2, r10 ? 1 : 0));
                    aVar3.W(R.string.cancel, new t7o());
                    aVar3.m();
                }
                return s3q0.a;
            case 2:
                qu40 qu40Var = (qu40) obj3;
                tj50.a aVar4 = (tj50.a) obj;
                wcj wcjVar = new wcj(qu40Var, 26);
                ao8 ao8Var = ao8.d;
                h0u0 a = aVar4.a(wcjVar, ao8Var);
                h0u0 a2 = aVar4.a(new ba40(qu40Var, i8), ao8Var);
                com.vk.newsfeed.posting.music_picker.presentation.model.a aVar5 = qu40Var.d;
                return new b.a(aVar4.a(new pba(aVar5, 6), ao8Var), aVar4.a(new h2w(qu40Var, i2), ao8Var), aVar4.a(new oi40(qu40Var, i5), ao8Var), aVar4.a(new l8k(24), ao8Var), aVar4.a(new kpr(i3), ao8Var), aVar4.a(new z7w(i7), ao8Var), aVar4.a(new v4v(20), ao8Var), aVar4.a(new yo20(aVar5, 3), ao8Var), a, a2, aVar4.a(new tuq(17), ao8Var), aVar4.a(new per(15), ao8Var), aVar4.a(new r820(qu40Var, i6), ao8Var), aVar4.a(new d220(i7), ao8Var));
            case 3:
                ve50 ve50Var = (ve50) obj3;
                xe50 xe50Var = (xe50) obj;
                int i10 = ve50.j1;
                if (xe50Var instanceof xe50.a) {
                    ve50Var.hide();
                } else {
                    if (!(xe50Var instanceof xe50.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ikv0.a aVar6 = new ikv0.a(ve50Var.requireContext());
                    aVar6.u = new ikv0.d(ve50Var.requireContext().getString(R.string.failed_apply_mix_settings), (String) null, (ikv0.d.a) (0 == true ? 1 : 0), i6);
                    aVar6.n();
                    ve50Var.hide();
                }
                return s3q0.a;
            case 4:
                ikv0.a aVar7 = (ikv0.a) obj;
                aVar7.o = Integer.valueOf(ikv0.e + i560.e);
                return aVar7.p((Window) obj3);
            case 5:
                uj60 uj60Var = (uj60) obj3;
                uj60Var.e(jv60.a.b.C3148a.a);
                uj60Var.e(new jv60.a.e(whs.d.a));
                return s3q0.a;
            case 6:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj3;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                gom0.a(gom0Var, new b4r(22), new z76(newsfeedSearchFragment, i8));
                gom0.a(gom0Var, new ept(16), new a86(newsfeedSearchFragment, i3));
                gom0.a(gom0Var, new c4r(21), new z77(newsfeedSearchFragment, 11));
                gom0.a(gom0Var, new z7w(i9), new u61(newsfeedSearchFragment, i2));
                gom0.a(gom0Var, nx60.b, new cv4(newsfeedSearchFragment, i7));
                gom0.a(gom0Var, mx60.b, new w61(newsfeedSearchFragment, i9));
                return s3q0.a;
            case 7:
                CallsGetHistoryResponseDto callsGetHistoryResponseDto = (CallsGetHistoryResponseDto) obj;
                qp90 qp90Var = ((tp90) obj3).b;
                ArrayList a3 = qp90.a(callsGetHistoryResponseDto);
                LinkedHashMap n = xx1.n(callsGetHistoryResponseDto.j());
                Long i11 = callsGetHistoryResponseDto.i();
                return new up90.b(a3, n, i11 != null ? i11.longValue() : 0L, callsGetHistoryResponseDto.f());
            case 8:
                int intValue = ((Integer) obj).intValue();
                int i12 = PodcastFragment.m0;
                gjb0 gjb0Var = (gjb0) ((PodcastFragment) obj3).S;
                if (gjb0Var != null) {
                    gjb0Var.v3(intValue);
                }
                return s3q0.a;
            case 9:
                ((PostingFragment) obj3).I0 = (izs) obj;
                return s3q0.a;
            case 10:
                rhc0 rhc0Var = (rhc0) obj3;
                if (((Boolean) obj).booleanValue()) {
                    xn50.a.c(rhc0Var.c, new PostingAction.Permissions.PermissionGranted(PermissionType.Location));
                }
                return s3q0.a;
            case 11:
                cqc0 cqc0Var = (cqc0) obj3;
                L.i((Throwable) obj);
                cqc0Var.S0(new gj80(cqc0Var, i4));
                return s3q0.a;
            case 12:
                j03.j((Context) obj3, (Throwable) obj);
                return s3q0.a;
            case 13:
                ofe0 ofe0Var = (ofe0) obj3;
                pfe0 pfe0Var = (pfe0) obj;
                ofe0Var.e(pfe0Var.getView());
                ofe0Var.n.remove(pfe0Var);
                return s3q0.a;
            case 14:
                e6f0 e6f0Var = (e6f0) obj3;
                e6f0Var.o = false;
                e6f0Var.p = null;
                e6f0Var.t = false;
                e6f0Var.b();
                return s3q0.a;
            case 15:
                ((g3h0) obj3).p.invoke();
                return s3q0.a;
            case 16:
                r7h0.a aVar8 = (r7h0.a) obj;
                a990<String> a990Var = aVar8.e;
                h7h0 h7h0Var = ((o7h0) obj3).d;
                d6h0 d6h0Var = h7h0Var.a.a;
                w6h0 w6h0Var = aVar8.d;
                if (w6h0Var.a.isEmpty()) {
                    list = e43.l(h7h0Var.a(aVar8), new ScheduledCallViewItem.b());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(h7h0Var.a(aVar8));
                    rxk rxkVar = new rxk(new g7h0(1, h7h0Var, h7h0.class, "createDividerForScheduled", "createDividerForScheduled(Lcom/vk/voip/ui/call_list/common/ui/util/dateintervals/DateIntervalsInfo;)Lcom/vk/voip/ui/call_list/common/ui/items/CallListViewItem;", 0), h7h0Var.b);
                    d6h0Var.h = Calendar.getInstance();
                    Calendar calendar = Calendar.getInstance();
                    d6h0Var.i = calendar;
                    calendar.add(5, 1);
                    for (x5h0 x5h0Var : w6h0Var.a) {
                        long j = x5h0Var.g;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(j);
                        Iterator it = rxkVar.c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((lxk) obj2).b(calendar2)) {
                                }
                            } else {
                                obj2 = aVar;
                            }
                        }
                        lxk lxkVar = (lxk) obj2;
                        arrayList.addAll(lxkVar != null ? lxkVar.a(calendar2) : EmptyList.b);
                        s49 s49Var = x5h0Var.j;
                        ScheduledCallViewItem.ScheduledCall.a aVar9 = s49Var == null ? aVar : new ScheduledCallViewItem.ScheduledCall.a(s49Var.c, new a.b.C1178a(s49Var.a, s49Var.b));
                        String b = d6h0Var.b(new d6h0.a(x5h0Var.e, x5h0Var.f, x5h0Var.g, x5h0Var.h), true);
                        boolean z2 = x5h0Var.w;
                        Calendar calendar3 = Calendar.getInstance();
                        Calendar calendar4 = Calendar.getInstance();
                        calendar4.setTimeInMillis(x5h0Var.g);
                        arrayList.add(new ScheduledCallViewItem.ScheduledCall(aVar9, b, z2, c09.c(calendar3, calendar4), x5h0Var));
                        aVar = null;
                        rxkVar = rxkVar;
                    }
                    a990.a aVar10 = a990Var.c;
                    aVar10.getClass();
                    if (aVar10 instanceof a990.a.c) {
                        arrayList.add(big.d.b);
                    }
                    list = arrayList;
                }
                return new m59(list, a990Var.d instanceof a990.b.C2531b);
            case 17:
                SearchFollowersCatalogRootVh searchFollowersCatalogRootVh = (SearchFollowersCatalogRootVh) obj3;
                ems emsVar = (ems) obj;
                kym0 b2 = zts.b(emsVar);
                ArrayList arrayList2 = searchFollowersCatalogRootVh.y;
                kss kssVar = searchFollowersCatalogRootVh.u;
                arrayList2.add(b2);
                xwk.e().T().m().b(b2);
                if (emsVar instanceof ems.a) {
                    UIBlockProfile uIBlockProfile = ((ems.a) emsVar).a;
                    searchFollowersCatalogRootVh.z.b.onNext(uIBlockProfile);
                    kssVar.c(new gss.b(uIBlockProfile.A.c));
                } else if (emsVar instanceof ems.c) {
                    throw null;
                }
                return s3q0.a;
            case 18:
                int i13 = SelectAlbumBottomSheet.p1;
                ((SelectAlbumBottomSheet) obj3).getFeature().C((com.vk.photos.root.selectalbum.domain.a) obj);
                return s3q0.a;
            case 19:
                return com.vk.clips.sdk.shared.item.static_ads.c.p((com.vk.clips.sdk.shared.item.static_ads.c) obj3, (yt0) obj);
            case 20:
                L.i((Throwable) obj);
                ((s3l0) obj3).b.Ij();
                return s3q0.a;
            case 21:
                dw20 dw20Var = ((lal0) obj3).b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 22:
                s4m0 s4m0Var = ((n4m0) obj3).n;
                if (s4m0Var != null) {
                    s4m0Var.k();
                }
                return s3q0.a;
            case 23:
                ((Ref$FloatRef) obj3).element = ((Float) obj).floatValue();
                return s3q0.a;
            case 24:
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
                List<GroupsGroupFullDto> e = groupsGetObjectExtendedResponseDto.e();
                dqu dquVar = ((bam0) obj3).c;
                ArrayList arrayList3 = new ArrayList(c5g.u(e, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : e) {
                    dquVar.getClass();
                    arrayList3.add(dqu.a(groupsGroupFullDto));
                }
                return new Pair(arrayList3, Boolean.valueOf(groupsGetObjectExtendedResponseDto.e().size() < groupsGetObjectExtendedResponseDto.getCount()));
            case 25:
                com.vk.stories.design.view.stats.tabs.stickers.mvi.b bVar = (com.vk.stories.design.view.stats.tabs.stickers.mvi.b) obj3;
                y0r0 y0r0Var = (y0r0) obj;
                UserId a4 = y0r0Var.a();
                if (y0r0Var instanceof y0r0.a) {
                    z = true;
                } else if (!(y0r0Var instanceof y0r0.b)) {
                    return s3q0.a;
                }
                bVar.T(new f.b.h(a4, z, null));
                bVar.j.b(j.b.a);
                return s3q0.a;
            case 26:
                ((zak0) ((e6p0) obj3).d).setValue((tho0) obj);
                return s3q0.a;
            case 27:
                return ((niq0) obj3).f.o(true);
            case 28:
                return new Pair((bwq0) obj, Boolean.valueOf(!((WallWithCounters) obj3).isEmpty()));
            default:
                RecomSettingsSubRecomThemeDto recomSettingsSubRecomThemeDto = (RecomSettingsSubRecomThemeDto) obj;
                String s = k9q0.s(recomSettingsSubRecomThemeDto);
                return new faf0(s, recomSettingsSubRecomThemeDto.f(), ((ryq0) obj3).h.contains(s), recomSettingsSubRecomThemeDto.d());
        }
    }
}
