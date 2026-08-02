package xsna;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsItemDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingStatusDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.api.generated.video.dto.VideoGetVideoMusicDiscoverResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.template.MemoriesIsNewMemoriesAvailableData;
import com.vk.log.L;
import com.vk.settings.impl.presentation.model.section.Sections;
import com.vk.socialgraph.SocialGraphOpenParams;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.socialgraph.SocialStatSender;
import com.vk.socialgraph.init.PickAvatarFragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.traceprofiler.TraceProfilerServiceImpl;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.dg70;
import xsna.nak;
import xsna.og70;
import xsna.tlo0;
import xsna.v9i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e750 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ e750(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0403, code lost:
    
        if ((r3 != null ? r3.d() : null) != com.vk.api.generated.notifications.dto.NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto.ValueDto.OFF) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x044d, code lost:
    
        if (r2 != null) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0420  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r5;
        ?? r11;
        List<NotificationsNotificationSettingRedesignDto> e;
        tlo0 tlo0Var;
        tlo0 tlo0Var2;
        tlo0.a aVar;
        boolean z;
        NotificationsNotificationSettingOptionsDto j;
        List<NotificationsNotificationSettingOptionsItemDto> d;
        String e2;
        String str;
        Object obj2;
        int i = 2;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                oh70 oh70Var = (oh70) obj;
                String str2 = oh70Var.f;
                if (str2 == null) {
                    gg70 gg70Var = oh70Var.d;
                    if (gg70Var != null) {
                        boolean z3 = gg70Var.a;
                        ListBuilder e3 = e43.e();
                        Integer num = gg70Var.g;
                        if (!z3) {
                            e3.add(dg70.o.a);
                            e3.add(new dg70.a("SystemNotificationsEnableBanner_divider"));
                        }
                        if (num != null) {
                            if (num.intValue() == 0) {
                                e3.add(dg70.d.a);
                            } else {
                                e3.add(new dg70.b(num.intValue()));
                            }
                            e3.add(new dg70.a("DNDBanner_divider"));
                        }
                        List<NotificationsNotificationSettingsSectionRedesignDto> d2 = gg70Var.b.d();
                        if (d2 != null) {
                            List<NotificationsNotificationSettingsSectionRedesignDto> list = d2;
                            r5 = new ArrayList(c5g.u(list, 10));
                            for (NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto : list) {
                                r5.add(new dg70.l(notificationsNotificationSettingsSectionRedesignDto.getId(), notificationsNotificationSettingsSectionRedesignDto.d(), notificationsNotificationSettingsSectionRedesignDto.getTitle(), notificationsNotificationSettingsSectionRedesignDto.f()));
                            }
                        } else {
                            r5 = EmptyList.b;
                        }
                        e3.addAll(r5);
                        e3.add(new dg70.c("Sections_divider"));
                        if (gg70Var.c && z3) {
                            e3.add(new dg70.m(R.string.multiacc_section_title));
                            e3.add(new dg70.j(gg70Var.d));
                            e3.add(new dg70.c("multiacc_divider"));
                        }
                        e3.add(new dg70.m(R.string.system_settings_section_title));
                        e3.add(new dg70.g(gg70Var.e));
                        e3.add(new dg70.f(gg70Var.f));
                        ListBuilder g = e3.g();
                        if (g != null) {
                            return g;
                        }
                    }
                    return EmptyList.b;
                }
                ListBuilder e4 = e43.e();
                NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto2 = oh70Var.h;
                int i2 = str2.equals(Sections.Communities.getId()) ? R.string.communities_toggle_notifications_title : str2.equals(Sections.Messenger.getId()) ? R.string.messages_toggle_notifications_title : str2.equals(Sections.Friends.getId()) ? R.string.friends_toggle_notifications_title : str2.equals(Sections.Stories.getId()) ? R.string.stories_toggle_notifications_title : str2.equals(Sections.MiniApps.getId()) ? R.string.services_toggle_notifications_title : str2.equals(Sections.Feedback.getId()) ? R.string.feedback_toggle_notifications_title : 0;
                if (i2 != 0) {
                    e4.add(new dg70.k(i2, notificationsNotificationSettingsSectionRedesignDto2 != null ? notificationsNotificationSettingsSectionRedesignDto2.f() : false));
                    e4.add(new dg70.c("Section_divider"));
                }
                if (notificationsNotificationSettingsSectionRedesignDto2 == null || (e = notificationsNotificationSettingsSectionRedesignDto2.e()) == null) {
                    r11 = EmptyList.b;
                } else {
                    List<NotificationsNotificationSettingRedesignDto> list2 = e;
                    r11 = new ArrayList(c5g.u(list2, 10));
                    for (NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto : list2) {
                        String id = notificationsNotificationSettingRedesignDto.getId();
                        String id2 = notificationsNotificationSettingsSectionRedesignDto2.getId();
                        String e5 = notificationsNotificationSettingRedesignDto.e();
                        String title = notificationsNotificationSettingRedesignDto.getTitle();
                        boolean f = notificationsNotificationSettingsSectionRedesignDto2.f();
                        int i3 = R.string.section_disabled_subtitle;
                        if (f || (notificationsNotificationSettingRedesignDto.g() instanceof NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusStringDto)) {
                            NotificationsNotificationSettingStatusDto g2 = notificationsNotificationSettingRedesignDto.g();
                            if (g2 instanceof NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto) {
                                int i4 = og70.a.$EnumSwitchMapping$0[((NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto) g2).d().ordinal()];
                                if (i4 == 1) {
                                    aVar = tlo0.Companion;
                                    i3 = R.string.notification_setting_status_all;
                                } else if (i4 == i) {
                                    aVar = tlo0.Companion;
                                } else if (i4 == 3) {
                                    aVar = tlo0.Companion;
                                    i3 = R.string.notification_setting_status_bell;
                                } else {
                                    if (i4 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar = tlo0.Companion;
                                    i3 = R.string.notification_setting_status_push;
                                }
                                tlo0Var = tq.h(aVar, i3);
                            } else {
                                if (!(g2 instanceof NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusStringDto)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tlo0Var = oq.d(tlo0.Companion, ((NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusStringDto) g2).d());
                            }
                            tlo0Var2 = tlo0Var;
                        } else {
                            tlo0Var2 = tq.h(tlo0.Companion, R.string.section_disabled_subtitle);
                        }
                        tlo0 tlo0Var3 = tlo0Var2;
                        if (notificationsNotificationSettingRedesignDto.g() instanceof NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto) {
                            if (notificationsNotificationSettingsSectionRedesignDto2.f()) {
                                NotificationsNotificationSettingStatusDto g3 = notificationsNotificationSettingRedesignDto.g();
                                NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto notificationsNotificationSettingStatusEnumDto = g3 instanceof NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto ? (NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto) g3 : null;
                                break;
                            }
                            z = false;
                            j = notificationsNotificationSettingRedesignDto.j();
                            if (j == null || (j = notificationsNotificationSettingRedesignDto.i()) != null) {
                                d = j.d();
                                if (d != null) {
                                    Iterator it = d.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (epx.f(((NotificationsNotificationSettingOptionsItemDto) obj2).getId(), j.e())) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto = (NotificationsNotificationSettingOptionsItemDto) obj2;
                                    if (notificationsNotificationSettingOptionsItemDto != null) {
                                        e2 = notificationsNotificationSettingOptionsItemDto.d();
                                        break;
                                    }
                                }
                                e2 = j.e();
                                str = e2;
                            } else {
                                str = null;
                            }
                            r11.add(new dg70.n(id, id2, title, e5, tlo0Var3, z, str));
                            i = 2;
                        }
                        z = true;
                        j = notificationsNotificationSettingRedesignDto.j();
                        if (j == null) {
                        }
                        d = j.d();
                        if (d != null) {
                        }
                        e2 = j.e();
                        str = e2;
                        r11.add(new dg70.n(id, id2, title, e5, tlo0Var3, z, str));
                        i = 2;
                    }
                }
                e4.addAll(r11);
                if (str2.equals(Sections.Other.getId())) {
                    e4.add(new dg70.e(oh70Var.i));
                }
                if (oh70Var.j == null) {
                    return e4.g();
                }
                e4.add(new dg70.h());
                new ArrayList(c5g.u(null, 10));
                throw null;
            case 3:
                Context context = (Context) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                return (superappUiRouterBridge != null ? superappUiRouterBridge : null).u(context, true);
            case 4:
                int i5 = PickAvatarFragment.P;
                com.vk.socialgraph.a aVar2 = dd80.t;
                if (aVar2 != null) {
                    aVar2.d(SocialGraphStrategy.Screen.AVATAR, new SocialGraphOpenParams(SocialGraphOpenParams.OpenAction.SKIP_BUTTON), false);
                }
                if (dd80.u != null) {
                    com.vk.auth.main.j.m(SocialStatSender.Screen.AVATAR, SocialStatSender.Status.DEFAULT, FreeSpaceBox.TYPE, null);
                }
                return s3q0.a;
            case 5:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `popup_stickers_chat_settings`.`peerId` AS `peerId`, `popup_stickers_chat_settings`.`animation_autoplay` AS `animation_autoplay`, `popup_stickers_chat_settings`.`countOfInterruptClicks` AS `countOfInterruptClicks` FROM popup_stickers_chat_settings");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        arrayList.add(new hyb0((int) V0.getLong(2), V0.getLong(0), ((int) V0.getLong(1)) != 0));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 6:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    Context context2 = e43.a;
                    j03.i(context2 != null ? context2 : null, (VKApiExecutionException) th);
                }
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((View) obj) instanceof CheckBox);
            case 8:
                qgi0.r((tgi0) obj, "product_card_community_subscribe_button");
                return s3q0.a;
            case 9:
                qgi0.r((tgi0) obj, "filter_dialog_close_button");
                return s3q0.a;
            case 10:
                return Integer.valueOf(((Boolean) obj).booleanValue() ? R.string.music_talkback_player_remove_radio_from_favorite : R.string.music_talkback_player_add_radio_to_favorite);
            case 11:
                return ((v9i0.d) obj).e;
            case 12:
                StringBuilder sb = new StringBuilder("packsCountInvalid; check cache: ");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (((StickerStockItem) obj3).k) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((StickerStockItem) it2.next()).b));
                }
                sb.append(arrayList3);
                L.e("[VkStickersStorage]", sb.toString());
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((nov) obj) instanceof oit0);
            case 14:
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
                List<GroupsGroupFullDto> e6 = groupsGetObjectExtendedResponseDto.e();
                ArrayList arrayList4 = new ArrayList(c5g.u(e6, 10));
                Iterator it3 = e6.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(dqu.a((GroupsGroupFullDto) it3.next()));
                }
                return new VkPaginationList(arrayList4, groupsGetObjectExtendedResponseDto.getCount(), false, 0, 12, null);
            case 15:
                return s3q0.a;
            case 16:
                MemoriesIsNewMemoriesAvailableData memoriesIsNewMemoriesAvailableData = (MemoriesIsNewMemoriesAvailableData) obj;
                if (!memoriesIsNewMemoriesAvailableData.k && !memoriesIsNewMemoriesAvailableData.j && !memoriesIsNewMemoriesAvailableData.h && !memoriesIsNewMemoriesAvailableData.i) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 17:
                return Boolean.valueOf(((nak) obj) instanceof nak.a);
            case 18:
                qgo0 qgo0Var = (qgo0) obj;
                String str3 = qgo0Var.g.c;
                long j2 = qgo0Var.f;
                int i6 = qko0.c;
                int f2 = kci.f((int) (j2 & 4294967295L), str3);
                if (f2 != -1) {
                    return new ivl(0, f2 - ((int) (qgo0Var.f & 4294967295L)));
                }
                return null;
            case 19:
                qgi0.r((tgi0) obj, "COMMON_GRID_TOOLBAR_MORE_BUTTON_TEST_TAG");
                return s3q0.a;
            case 20:
                return s3q0.a;
            case 21:
                File file = (File) obj;
                int i7 = TraceProfilerServiceImpl.d;
                com.vk.traceprofiler.a.a.a();
                v6v0 v6v0Var = com.vk.traceprofiler.a.f;
                if (v6v0Var != null) {
                    v6v0Var.invoke(file);
                }
                return s3q0.a;
            case 22:
                return ((fgp0) obj).e;
            case 23:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 24:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, true, null, false, false, false, false, -1, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 25:
                L.i((Throwable) obj);
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                return new sq2(((Integer) obj).intValue());
            case 28:
                VideoGetVideoMusicDiscoverResponseDto videoGetVideoMusicDiscoverResponseDto = (VideoGetVideoMusicDiscoverResponseDto) obj;
                ddt0.a.getClass();
                return new VideoDiscoveryRecommendationsRepository.a(new c3t(com.vk.dto.video.a.a(ums0.e(ums0.a, videoGetVideoMusicDiscoverResponseDto.g(), videoGetVideoMusicDiscoverResponseDto.f(), videoGetVideoMusicDiscoverResponseDto.d(), false, 52)), videoGetVideoMusicDiscoverResponseDto.getCount()), videoGetVideoMusicDiscoverResponseDto.e(), 6);
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ e750(Object obj, int i) {
        this.b = i;
    }
}
