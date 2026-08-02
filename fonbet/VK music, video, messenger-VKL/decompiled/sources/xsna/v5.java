package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.ArraySet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.channelrestrictions.WarningReason;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemTooltipEvent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.groups.WarningNotification;
import com.vk.libvideo.bottomsheet.about.delegate.d;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.log.L;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.webapp.fragments.AccountFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.b4;
import xsna.b8b;
import xsna.dai;
import xsna.e5r;
import xsna.ihd;
import xsna.tj50;
import xsna.x6d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0442, code lost:
    
        if (r15 == null) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        UtilityTokens utilityTokens;
        Object obj2;
        Object parcelable;
        gzs x5Var;
        dai.c a;
        ?? r7;
        h8b h8bVar;
        int i = this.b;
        int i2 = 10;
        Object dVar = null;
        boolean z = true;
        z = true;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((d.a) obj3).l.d(b4.d.a);
                return s3q0.a;
            case 1:
                AccountFragment accountFragment = (AccountFragment) obj3;
                w25 w25Var = (w25) obj;
                int i3 = AccountFragment.a0;
                Bundle arguments = accountFragment.getArguments();
                String string = arguments != null ? arguments.getString(CommonConstant.KEY_ACCESS_TOKEN) : null;
                if (string == null) {
                    return w25Var;
                }
                UserId userId = UserId.d;
                Bundle arguments2 = accountFragment.getArguments();
                if (arguments2 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = arguments2.getParcelable("utilityTokens", UtilityTokens.class);
                        obj2 = (Parcelable) parcelable;
                    } else {
                        Object parcelable2 = arguments2.getParcelable("utilityTokens");
                        obj2 = (UtilityTokens) (parcelable2 instanceof UtilityTokens ? parcelable2 : null);
                    }
                    utilityTokens = (UtilityTokens) obj2;
                    break;
                }
                UtilityTokens.CREATOR.getClass();
                utilityTokens = UtilityTokens.c;
                return new w25(0, 0L, utilityTokens, userId, string, null);
            case 2:
                ((b.d) obj).b((((StoryEntry) obj3).Sb() ? MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType.PHOTO : MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType.VIDEO).toString().toLowerCase(), "story_type");
                return s3q0.a;
            case 3:
                com.vk.superapp.browser.internal.ui.menu.action.c cVar = (com.vk.superapp.browser.internal.ui.menu.action.c) obj3;
                g16 g16Var = (g16) obj;
                cVar.s = true;
                if (g16Var instanceof l1a0) {
                    cVar.q = (l1a0) g16Var;
                    cVar.f();
                }
                return s3q0.a;
            case 4:
                ((w01) obj3).b.a(AdsItemViewEvent.a.b);
                return s3q0.a;
            case 5:
                vo1 vo1Var = (vo1) obj3;
                tgi0 tgi0Var = (tgi0) obj;
                VideoCellViewState videoCellViewState = vo1Var.d;
                Boolean valueOf = Boolean.valueOf(videoCellViewState.e != null);
                sgi0<Boolean> sgi0Var = bgi0.d;
                qcy<Object> qcyVar = bgi0.a[2];
                sgi0Var.getClass();
                tgi0Var.a(sgi0Var, valueOf);
                qgi0.r(tgi0Var, "album_library_card_test_tag");
                VideoCellViewState.c a2 = videoCellViewState.a();
                if (a2 == null || (a = a2.a()) == null || (x5Var = a.c) == null) {
                    x5Var = new x5(z ? 1 : 0);
                }
                bgi0.c(tgi0Var, x5Var);
                bgi0.d(tgi0Var, vo1Var.c);
                PreviewViewState.b bVar = videoCellViewState.a.i;
                PreviewViewState.r rVar = bVar instanceof PreviewViewState.r ? (PreviewViewState.r) bVar : null;
                bgi0.b(tgi0Var, rVar != null ? Integer.valueOf(rVar.a) : null);
                return s3q0.a;
            case 6:
                ((st2) obj3).c(true);
                return s3q0.a;
            case 7:
                AppChannelFragment appChannelFragment = (AppChannelFragment) obj3;
                WarningNotification warningNotification = (WarningNotification) obj;
                int i4 = AppChannelFragment.l1;
                WarningReason.a aVar = WarningReason.Companion;
                int h = warningNotification.h();
                aVar.getClass();
                WarningReason a3 = WarningReason.a.a(h);
                if (!appChannelFragment.b1 && a3 != WarningReason.NONE) {
                    appChannelFragment.b1 = true;
                    ((zlj) appChannelFragment.g1.getValue()).a(appChannelFragment.kn(), WarningReason.a.a(warningNotification.h()), true, new a23(appChannelFragment, 0), new rs0(z ? 1 : 0, appChannelFragment, warningNotification), new te0(14), null);
                }
                return s3q0.a;
            case 8:
                ld3 ld3Var = (ld3) obj3;
                xgl0 xgl0Var = (xgl0) obj;
                frn0 system = xgl0Var.system();
                system.i(system.j() + 1);
                if (ld3Var.e) {
                    List<Long> e0 = xgl0Var.a().e0(false);
                    ArrayList arrayList = new ArrayList(c5g.u(e0, 10));
                    Iterator it = e0.iterator();
                    while (it.hasNext()) {
                        ld3Var.c.I0().u(new kd3(((Number) it.next()).longValue(), r3 ? 1 : 0));
                        arrayList.add(s3q0.a);
                    }
                }
                return s3q0.a;
            case 9:
                int i5 = AttachVideoFragment.F0;
                ((AttachVideoFragment) obj3).wo(j0r0.c);
                return s3q0.a;
            case 10:
                ((vu4) obj3).Z0((Throwable) obj);
                return s3q0.a;
            case 11:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj3;
                int i6 = BasePhotoListFragment.m0;
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    basePhotoListFragment.po().notifyItemChanged(((Number) ((Pair) it2.next()).i()).intValue());
                }
                return s3q0.a;
            case 12:
                cvk.u(R.string.added_to_documents, false);
                bwt0.p0(((m68) obj3).s, false);
                return s3q0.a;
            case 13:
                tx8 tx8Var = (tx8) obj3;
                defpackage.c cVar2 = tx8Var.l;
                sx8 sx8Var = tx8Var.q;
                cVar2.invoke(sx8Var != null ? sx8Var : null);
                return s3q0.a;
            case 14:
                s7b s7bVar = (s7b) obj3;
                DonutGroupSettingsDto donutGroupSettingsDto = (DonutGroupSettingsDto) obj;
                String g = donutGroupSettingsDto.g();
                if (epx.f(g, "bankcard")) {
                    String e = donutGroupSettingsDto.e();
                    if (e == null) {
                        e = "";
                    }
                    dVar = new b8b.a(e);
                } else if (epx.f(g, "vk_pay")) {
                    cn o = s7bVar.h.o();
                    UserId userId2 = o.a;
                    List<UsersUserFullDto> i7 = donutGroupSettingsDto.i();
                    if (i7 != null) {
                        r7 = new ArrayList();
                        for (UsersUserFullDto usersUserFullDto : i7) {
                            if (epx.f(usersUserFullDto.s1(), userId2)) {
                                h8bVar = null;
                                z = false;
                            } else {
                                h8bVar = new h8b(usersUserFullDto.s1(), rq.a(usersUserFullDto, new StringBuilder(), ' '));
                            }
                            if (h8bVar != null) {
                                r7.add(h8bVar);
                            }
                        }
                    } else {
                        r7 = EmptyList.b;
                    }
                    dVar = new b8b.d(r7, donutGroupSettingsDto.j() != null ? new UserId(r15.intValue()) : UserId.d, z, new h8b(userId2, o.b));
                }
                if (dVar == null) {
                    dVar = b8b.c.b;
                }
                s7bVar.T(dVar);
                return s3q0.a;
            case 15:
                ((ubb) obj3).l.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 16:
                xgl0 xgl0Var2 = (xgl0) obj;
                int j = xgl0Var2.system().j();
                ChannelsCounters.Type type = ChannelsCounters.Type.UNREAD;
                oeb oebVar = ((qeb) obj3).c;
                xgl0Var2.a().i(e43.l(new com.vk.im.engine.models.channels.a(type, oebVar.a, j), new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.UNREAD_UNMUTED, oebVar.b, j), new com.vk.im.engine.models.channels.a(ChannelsCounters.Type.ARCHIVED, oebVar.c, j)));
                return s3q0.a;
            case 17:
                rkb rkbVar = (rkb) obj3;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof OnChannelsCacheInvalidateEvent) {
                    if (((OnChannelsCacheInvalidateEvent) sxpVar).c == OnChannelsCacheInvalidateEvent.Reason.SUGGESTS_UPDATED) {
                        rkbVar.c();
                    }
                } else if (sxpVar instanceof r280) {
                    List<Channel> list = rkbVar.h.P0().a;
                    ArraySet k = ((r280) sxpVar).b.k();
                    List<Channel> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (k.contains(Long.valueOf(((Channel) it3.next()).b))) {
                                    rkbVar.c();
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            case 18:
                ((ftb) obj3).e.l();
                return s3q0.a;
            case 19:
                ((ClassifiedsCatalogSimpleRootVh) obj3).M = new ArrayList();
                return s3q0.a;
            case 20:
                o1d o1dVar = (o1d) obj3;
                ClipItemTooltipEvent clipItemTooltipEvent = (ClipItemTooltipEvent) obj;
                if (o1dVar.s0 == null) {
                    o1dVar.u0.add(clipItemTooltipEvent);
                } else {
                    o1dVar.N(clipItemTooltipEvent);
                }
                return s3q0.a;
            case 21:
                x6d.a aVar2 = ((x6d) obj3).e;
                aVar2.a.a(k5d.b);
                aVar2.c.g9(null, null, null);
                return s3q0.a;
            case 22:
                ((ihd.a) obj3).m.invoke();
                return s3q0.a;
            case 23:
                cvk.w(j03.g((Context) obj3, (Throwable) obj, R.string.error), false);
                return s3q0.a;
            case 24:
                v9 v9Var = (v9) obj3;
                List list3 = (List) obj;
                if (!list3.isEmpty()) {
                    v9Var.invoke(list3);
                }
                return s3q0.a;
            case 25:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i8 = ClipsFavoriteFoldersListFragment.U;
                ((SwipeRefreshLayout) obj3).setRefreshing(booleanValue);
                return s3q0.a;
            case 26:
                tj50.a aVar3 = (tj50.a) obj;
                g5r g5rVar = ((s8e) obj3).d;
                g5rVar.getClass();
                h0u0 a4 = aVar3.a(new ayo(g5rVar, 3), new f5r());
                d40 d40Var = new d40(26);
                ao8 ao8Var = ao8.d;
                return new e5r.a(a4, aVar3.a(d40Var, ao8Var), aVar3.a(new ur0(25), ao8Var), aVar3.a(new rlh(g5rVar, i2), ao8Var));
            case 27:
                ((com.vk.clips.playlists.ui.picker.b) obj3).T(c.b.a.b);
                return s3q0.a;
            case 28:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    L.G("ClipsSdkDraftsInteractorVkImpl", "Failed to add draft " + clipsDraftVk.b.b);
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(((cbg) obj).a.getId() == ((mdg) obj3).b6());
        }
    }
}
