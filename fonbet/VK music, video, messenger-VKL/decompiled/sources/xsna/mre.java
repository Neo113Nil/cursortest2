package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.album.editor.cover.presentation.b;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.im.engine.internal.storage.structure.DbMigrationException;
import com.vk.im.engine.internal.storage.structure.TooOldDbException;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.tool.view.CommunityProfileTabsContainerLayout;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsEcommStat$TypeBannerClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeGamesCatalogClick;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ajh;
import xsna.as30;
import xsna.b2l;
import xsna.d3h;
import xsna.djc;
import xsna.iet;
import xsna.ikv0;
import xsna.mzj;
import xsna.nbu;
import xsna.o0r0;
import xsna.szr;
import xsna.vms;
import xsna.vte;
import xsna.wih;
import xsna.yct;
import xsna.zqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mre implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mre(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v137, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v146, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Boolean, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v23 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gzp0 gzp0Var;
        StoriesContainer storiesContainer;
        String str;
        int i = this.b;
        int i2 = 12;
        int i3 = 19;
        int i4 = 15;
        int i5 = 2;
        ?? r9 = 0;
        r9 = null;
        UserId userId = null;
        r9 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((nre) obj2).C(zqe.b.b);
                return s3q0.a;
            case 1:
                ((ste) obj2).T(vte.e.b);
                return s3q0.a;
            case 2:
                int i6 = ClipsTemplateEditorFragment.h0;
                ((ClipsTemplateEditorFragment) obj2).eo().l();
                return s3q0.a;
            case 3:
                ((e5) obj2).invoke(k15.z((SdkClipVideoFile) obj));
                return s3q0.a;
            case 4:
                return new ksj0(((l2g) obj2).c(), ((Integer) obj).intValue());
            case 5:
                CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment = (CommunitiesManageNotificationsFragment) obj2;
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
                Boolean d = groupsGetObjectExtendedResponseDto.d();
                communitiesManageNotificationsFragment.X = d != null ? d.booleanValue() : true;
                List<GroupsGroupFullDto> e = groupsGetObjectExtendedResponseDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    arrayList.add(dqu.a((GroupsGroupFullDto) it.next()));
                }
                return new VKList(groupsGetObjectExtendedResponseDto.getCount(), arrayList);
            case 6:
                d4h d4hVar = (d4h) obj2;
                CatchUpBanner catchUpBanner = (CatchUpBanner) obj;
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                ExtendedCommunityProfile extendedCommunityProfile = d4hVar.d;
                extendedCommunityProfile.I2 = null;
                d3h.a aVar = d3hVar.c;
                aVar.e(extendedCommunityProfile);
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), new MobileOfficialAppsEcommStat$TypeBannerClick(MobileOfficialAppsEcommStat$TypeBannerClick.Type.HIDE_BANNER, catchUpBanner.j), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                aVar.m(rsg0.y0(yfb.x(d3hVar.q.q(fkq0.a(bwd0.i(extendedCommunityProfile)), catchUpBanner.b)), null, null, 3).subscribe(new qf(new rl2(i2), 2), new b60(new a60(i3), i4)));
                return s3q0.a;
            case 7:
                reh rehVar = (reh) obj2;
                g7s0 g7s0Var = rehVar.n;
                VideoFile videoFile = rehVar.B;
                Activity h = e3m.h(rehVar.itemView.getContext());
                if (videoFile != null && h != null) {
                    if (!videoFile.v() || videoFile.X2()) {
                        g7s0Var.Y().k(h, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                    } else {
                        ydt0.p(g7s0Var.Y(), h, videoFile, !(rehVar.t6().j != null ? r0 : null).p0(), true, null, null, null, videoFile.r(), null, 752);
                    }
                    r9 = s3q0.a;
                }
                if (r9 == 0) {
                    L.i(new IllegalArgumentException("Failed to open video. Can not resolve activity from context " + rehVar.itemView.getContext()));
                }
                VideoFile videoFile2 = rehVar.B;
                if (videoFile2 != null) {
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(videoFile2.I0().b), null, null, null, 58, null), new com.vk.stat.scheme.e0(), 2);
                    UiTracker uiTracker2 = UiTracker.a;
                    if (UiTracker.c() == MobileOfficialAppsCoreNavStat$EventScreen.GROUP) {
                        gzp0Var = new gzp0(MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_PAGE, b2);
                    } else {
                        UiTracker uiTracker3 = UiTracker.a;
                        gzp0Var = new gzp0(UiTracker.c(), b2);
                    }
                    uzp0 uzp0Var2 = UiTracker.h;
                    uzp0Var2.getClass();
                    new bjc(gzp0Var.a, gzp0Var.b, uzp0Var2.a).q();
                }
                return s3q0.a;
            case 8:
                wih.a aVar2 = (wih.a) obj2;
                CommunityProfileTabsContainerLayout communityProfileTabsContainerLayout = aVar2.w;
                ajh ajhVar = (ajh) obj;
                if (ajhVar instanceof ajh.c) {
                    ajh.c cVar = (ajh.c) ajhVar;
                    communityProfileTabsContainerLayout.setTopInsets(cVar.a.top);
                    int i7 = aVar2.v;
                    int i8 = cVar.a.top;
                    if (i7 != i8) {
                        aVar2.v = i8;
                        aVar2.B.setTranslationY(-communityProfileTabsContainerLayout.getTop());
                    }
                } else if (ajhVar instanceof ajh.b) {
                    int i9 = ((ajh.b) ajhVar).a;
                    if (i9 != 0) {
                        dhq.f(aVar2.C, Boolean.valueOf(i9 < 0), null, 4);
                    }
                } else if (!epx.f(ajhVar, ajh.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 9:
                ((com.vk.profile.community.impl.ui.profile.a) obj2).Y(d.m.a);
                return s3q0.a;
            case 10:
                ((hrh) obj2).t();
                return s3q0.a;
            case 11:
                com.vk.im.ui.components.contacts.a aVar3 = (com.vk.im.ui.components.contacts.a) obj2;
                if (((Boolean) obj).booleanValue()) {
                    aVar3.c1().d();
                }
                return s3q0.a;
            case 12:
                ((czj) obj2).T(new mzj.b(null, ((Throwable) obj).getMessage(), 1));
                return s3q0.a;
            case 13:
                b2l.a aVar4 = (b2l.a) obj2;
                int i10 = aVar4.c;
                int i11 = aVar4.b;
                if (i11 < 1035) {
                    throw new TooOldDbException(efz.a(i11, i10, "Too old migration. Migration unsupported from version=", ", minimal supported version=1035, actual version="), new IllegalStateException());
                }
                int i12 = i11 + 1;
                int i13 = i11 + 1;
                if (i13 <= i10) {
                    int i14 = i13;
                    while (true) {
                        try {
                            izs<b2l.a, s3q0> izsVar = c2l.b.get(Integer.valueOf(i14));
                            if (izsVar != null) {
                                try {
                                    izsVar.invoke(new b2l.a(aVar4.a, aVar4.b, aVar4.c, aVar4.d, i14));
                                    i12 = i14;
                                } catch (Throwable th) {
                                    th = th;
                                    i12 = i14;
                                    StringBuilder sb = new StringBuilder("Migration failed for db:");
                                    nyh0.a(i12, aVar4.d, " to version=", ", actual version=", sb);
                                    sb.append(i11);
                                    throw new DbMigrationException(sb.toString(), th);
                                }
                            }
                            if (i14 != i10) {
                                i14++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return s3q0.a;
            case 14:
                ((hpm) obj2).Z((com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 15:
                StoriesContainer storiesContainer2 = (StoriesContainer) obj2;
                hfz hfzVar = (hfz) obj;
                rrl0 rrl0Var = hfzVar instanceof rrl0 ? (rrl0) hfzVar : null;
                if (rrl0Var != null && (storiesContainer = rrl0Var.b) != null) {
                    userId = storiesContainer.Ab();
                }
                return Boolean.valueOf(epx.f(userId, storiesContainer2.Ab()));
            case 16:
                wzo wzoVar = (wzo) obj2;
                Post post = (Post) wzoVar.q6();
                if (post != null) {
                    wzoVar.E.c(-1, wzoVar.itemView.getContext(), post, PostingCreationEntryPoint.FeedEditDraft);
                }
                return s3q0.a;
            case 17:
                l06 l06Var = (l06) obj2;
                l06Var.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                l06Var.m.invoke();
                return s3q0.a;
            case 18:
                bcq bcqVar = (bcq) obj2;
                ptk ptkVar = (ptk) obj;
                return ((Boolean) bcqVar.m.getValue()).booleanValue() ? bcqVar.d1((ExtendedCommunityProfile) ptkVar.a) : io.reactivex.rxjava3.core.q.T(ptkVar);
            case 19:
                return v0r.p((v0r) obj2, (Context) obj, "Иван", "Очень длинный текст😀😄😁 комментария, который не помещается в одну строку и должен перенестись на следующую строку для проверки многострочного режима", true, 32);
            case 20:
                vzr vzrVar = (vzr) obj;
                Set<Long> set = vzrVar.j;
                Set<Long> set2 = vzrVar.i;
                Map<Long, wt90> map = vzrVar.a;
                Map<Long, wt90> map2 = vzrVar.c;
                long j = ((szr.d) obj2).b.b;
                wt90 wt90Var = map2.get(Long.valueOf(j));
                if (wt90Var == null && (wt90Var = map.get(Long.valueOf(j))) == null) {
                    return vzrVar;
                }
                long j2 = wt90Var.b;
                LinkedHashMap y = pzr.y(map, j);
                LinkedHashMap y2 = pzr.y(map2, j);
                ArrayList w = pzr.w(j, vzrVar.b);
                ArrayList w2 = pzr.w(j, vzrVar.d);
                Set R0 = j5g.R0(set2);
                Set R02 = j5g.R0(set);
                if (wt90Var.h) {
                    if (set2.contains(Long.valueOf(j2))) {
                        R0.remove(Long.valueOf(j2));
                    } else {
                        R02.add(Long.valueOf(j2));
                    }
                } else if (set.contains(Long.valueOf(j2))) {
                    R02.remove(Long.valueOf(j2));
                } else {
                    R0.add(Long.valueOf(j2));
                }
                return vzr.a(vzrVar, y, w, y2, w2, null, false, R0, R02, null, null, 6640);
            case 21:
                xms xmsVar = (xms) obj2;
                vms vmsVar = (vms) obj;
                int i15 = FriendsCleanupFragment.W;
                xmsVar.getClass();
                if (vmsVar instanceof vms.a) {
                    xmsVar.T(new kns(((vms.a) vmsVar).a));
                } else {
                    if (!(vmsVar instanceof vms.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xmsVar.T(new lns(((vms.b) vmsVar).a));
                }
                return s3q0.a;
            case 22:
                GamesCatalogFragment gamesCatalogFragment = (GamesCatalogFragment) obj2;
                iet ietVar = (iet) obj;
                int i16 = GamesCatalogFragment.i0;
                if (ietVar instanceof iet.f) {
                    zct zctVar = ((iet.f) ietVar).a;
                    Context mo2getContext = gamesCatalogFragment.mo2getContext();
                    if (mo2getContext != null) {
                        new yct.a(mo2getContext, zctVar, new n0(i4, gamesCatalogFragment, zctVar), new p3h(gamesCatalogFragment, 21)).I0(null);
                    }
                } else if (ietVar instanceof iet.d) {
                    n9t n9tVar = ((iet.d) ietVar).a;
                    gamesCatalogFragment.fo().getClass();
                    SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeGamesCatalogClick(SchemeStat$TypeGamesCatalogClick.Type.ACHIEVEMENTS_WELCOME_MODAL, r9, i5, r9), 2);
                    UiTracker uiTracker4 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    uzp0 uzp0Var3 = UiTracker.h;
                    uzp0Var3.getClass();
                    new bjc(c2, b3, uzp0Var3.a).q();
                    if (gamesCatalogFragment.mo2getContext() != null) {
                        new m9t(n9tVar, new u4e(gamesCatalogFragment, 22), new k5h(gamesCatalogFragment, i3)).Td(gamesCatalogFragment.getChildFragmentManager(), "achievements_modal");
                    }
                } else if (ietVar instanceof iet.i) {
                    ((iet.i) ietVar).getClass();
                    gamesCatalogFragment.go(null);
                } else if (ietVar instanceof iet.e) {
                    String str2 = ((iet.e) ietVar).a;
                    Context mo2getContext2 = gamesCatalogFragment.mo2getContext();
                    if (mo2getContext2 != null) {
                        rex0 rex0Var = e370.j;
                        (rex0Var != null ? rex0Var : null).c(mo2getContext2, str2);
                    }
                } else if (ietVar.equals(iet.a.a)) {
                    if (((hlu0) gamesCatalogFragment.U.getValue()).a()) {
                        ((jlu0) gamesCatalogFragment.V.getValue()).e(gamesCatalogFragment, MultiAccountEntryPoint.LongTap.d);
                    }
                } else if (ietVar.equals(iet.g.a)) {
                    cn o = ((b25) gamesCatalogFragment.S.getValue()).o();
                    ((o0r0) gamesCatalogFragment.T.getValue()).m(gamesCatalogFragment.requireContext(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65311));
                } else if (ietVar.equals(iet.c.a)) {
                    FragmentActivity activity = gamesCatalogFragment.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                } else if (ietVar.equals(iet.h.a)) {
                    ((oft) gamesCatalogFragment.W.getValue()).a().l(gamesCatalogFragment);
                } else if (ietVar instanceof iet.k) {
                    gamesCatalogFragment.R = ((iet.k) ietVar).a;
                } else if (ietVar instanceof iet.j) {
                    gamesCatalogFragment.ho(((iet.j) ietVar).a);
                } else if (ietVar instanceof iet.l) {
                    Context mo2getContext3 = gamesCatalogFragment.mo2getContext();
                    if (mo2getContext3 != null) {
                        ikv0.a aVar5 = new ikv0.a(mo2getContext3);
                        aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
                        aVar5.u = new ikv0.d(mo2getContext3.getString(R.string.vk_games_error_snackbar), (String) null, (ikv0.d.a) null, 6);
                        aVar5.n();
                    }
                } else {
                    if (!(ietVar instanceof iet.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zbt zbtVar = ((iet.b) ietVar).a;
                    gamesCatalogFragment.fo().getClass();
                    SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeGamesCatalogClick(SchemeStat$TypeGamesCatalogClick.Type.ACHIEVEMENTS_GIFT_BUTTON_CLICK, r9, i5, r9), 2);
                    UiTracker uiTracker5 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                    uzp0 uzp0Var4 = UiTracker.h;
                    uzp0Var4.getClass();
                    new bjc(c3, b4, uzp0Var4.a).q();
                    izt iztVar = zbtVar.b;
                    if (GamesCatalogFragment.b.$EnumSwitchMapping$0[iztVar.a.ordinal()] == 1 && (str = iztVar.b) != null) {
                        gamesCatalogFragment.ho(new djc.e(str, null));
                    }
                }
                return s3q0.a;
            case 23:
                ((jcu) obj2).d.invoke(nbu.f.b);
                return s3q0.a;
            case 24:
                eqv eqvVar = (eqv) obj2;
                Bitmap bitmap = (Bitmap) ((Optional) obj).orElse(null);
                if (bitmap != null) {
                    return kd7.h(eqvVar.c, bitmap, hip0.c);
                }
                return null;
            case 25:
                as30.a aVar6 = ((com.vk.im.video.a) obj2).q;
                (aVar6 != null ? aVar6 : null).b();
                return s3q0.a;
            case 26:
                ((ie3) obj2).invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 27:
                return new Pair((DialogsHistory) obj2, (ProfilesInfo) obj);
            case 28:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) obj2;
                com.vk.ecomm.market.album.editor.cover.presentation.b bVar = (com.vk.ecomm.market.album.editor.cover.presentation.b) obj;
                int i17 = MarketEditAlbumCoverFragment.c0;
                if (bVar instanceof b.a) {
                    marketEditAlbumCoverFragment.finish();
                } else {
                    if (!(bVar instanceof b.C0941b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intent intent = new Intent();
                    intent.putExtra("album", ((b.C0941b) bVar).a);
                    marketEditAlbumCoverFragment.Mf(-1, intent);
                }
                return s3q0.a;
            default:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                WriteBar writeBar = marketItemCommentsFragment.T;
                if (writeBar != null) {
                    bwt0.p0(writeBar, booleanValue);
                }
                View view = marketItemCommentsFragment.U;
                if (view != null) {
                    bwt0.p0(view, booleanValue);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ mre(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
