package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.ViewGroup;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingHintDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingPushSettingDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetRecomThemesResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetStickerPacksRecommendationBlockResponseDto;
import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.dz40;
import xsna.f5h0;
import xsna.kb70;
import xsna.me70;
import xsna.p1v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wo40 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wo40(int i) {
        this.b = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
    
        if (r1.equals("notify") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0242, code lost:
    
        if (r1.equals("offline") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (r1.equals("app_widget") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        if (r1.equals(com.ironsource.C4504q2.x) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0636, code lost:
    
        if (r3.equals("track_mix") == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r1.equals("group_messages") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:
    
        if (r1.equals("phone") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        if (r1.equals("pages") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        if (r1.equals("notes") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b2, code lost:
    
        if (r1.equals("messages") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cf, code lost:
    
        if (r1.equals("phone_number") == false) goto L129;
     */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        dz40.h.a aVar;
        dz40.h.a aVar2;
        PlaybackLaunchMeta playbackLaunchMeta;
        int i;
        List<Group> list;
        List<UserProfile> list2;
        int i2;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "vk_top_bar_cancel_edit_btn");
                return s3q0.a;
            case 1:
                MusicOfflineSyncServiceHelper.h("audio.getUserConfig", (Throwable) obj);
                return s3q0.a;
            case 2:
                qgi0.r((tgi0) obj, "MusicPickerToolbarBackButton");
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = MusicPlaceholderVh.o;
                qgi0.r((tgi0) obj, "MusicUiHolderPlaceholderTitle");
                return s3q0.a;
            case 4:
                sy40 sy40Var = (sy40) obj;
                PlayerTrack playerTrack = sy40Var.d;
                PlaySourceMeta playSourceMeta = (playerTrack == null || (playbackLaunchMeta = playerTrack.c) == null) ? null : playbackLaunchMeta.e;
                String str = sy40Var.x;
                if (playSourceMeta instanceof PlaySourceMeta.PlaylistPlaySourceMeta) {
                    PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta = (PlaySourceMeta.PlaylistPlaySourceMeta) playSourceMeta;
                    if (epx.f(playlistPlaySourceMeta, (PlaySourceMeta.PlaylistPlaySourceMeta) PlaySourceMeta.PlaylistPlaySourceMeta.h.getValue())) {
                        aVar = new dz40.h.a(R.string.music_player_header_default_source, null, false);
                    } else {
                        boolean z = playlistPlaySourceMeta.c;
                        String str2 = playlistPlaySourceMeta.b;
                        aVar2 = z ? new dz40.h.a(R.string.music_player_header_album_source, str2, true) : new dz40.h.a(R.string.music_player_header_playlist_source, str2, true);
                        aVar = aVar2;
                    }
                } else {
                    boolean z2 = playSourceMeta instanceof PlaySourceMeta.SimilarTrackPlaySourceMeta;
                    int i3 = R.string.music_player_header_track_mix_source;
                    if (z2) {
                        aVar2 = new dz40.h.a(R.string.music_player_header_track_mix_source, ((PlaySourceMeta.SimilarTrackPlaySourceMeta) playSourceMeta).b, true);
                    } else if (playSourceMeta instanceof PlaySourceMeta.VKMixPlaySourceMeta) {
                        PlaySourceMeta.VKMixPlaySourceMeta vKMixPlaySourceMeta = (PlaySourceMeta.VKMixPlaySourceMeta) playSourceMeta;
                        Integer num = vKMixPlaySourceMeta.c;
                        String str3 = vKMixPlaySourceMeta.e;
                        if (num == null) {
                            switch (str3.hashCode()) {
                                case -469406254:
                                    if (str3.equals("my_music")) {
                                        i3 = R.string.music_player_header_mix_my_music_source;
                                        break;
                                    }
                                    i3 = R.string.music_player_header_vkmix_source;
                                    break;
                                case 249791628:
                                    if (str3.equals("album_mix")) {
                                        i3 = R.string.music_player_header_mix_album_source;
                                        break;
                                    }
                                    i3 = R.string.music_player_header_vkmix_source;
                                    break;
                                case 580525679:
                                    if (str3.equals("playlist_mix")) {
                                        i3 = R.string.music_player_header_mix_playlist_source;
                                        break;
                                    }
                                    i3 = R.string.music_player_header_vkmix_source;
                                    break;
                                case 630241636:
                                    if (str3.equals("artist_mix")) {
                                        i3 = R.string.music_player_header_mix_artist_source;
                                        break;
                                    }
                                    i3 = R.string.music_player_header_vkmix_source;
                                    break;
                                case 730147176:
                                    break;
                                default:
                                    i3 = R.string.music_player_header_vkmix_source;
                                    break;
                            }
                        } else {
                            i3 = num.intValue();
                        }
                        aVar2 = new dz40.h.a(i3, epx.f(str3, "my_music") ? null : cqm0.a(vKMixPlaySourceMeta.b), vKMixPlaySourceMeta.d);
                    } else if (playSourceMeta instanceof PlaySourceMeta.CatalogPlaySourceMeta) {
                        aVar2 = new dz40.h.a(R.string.music_player_header_open_source, ((PlaySourceMeta.CatalogPlaySourceMeta) playSourceMeta).b, true);
                    } else {
                        aVar = new dz40.h.a(R.string.music_player_header_default_source, null, false);
                    }
                    aVar = aVar2;
                }
                return str != null ? new dz40.h.b(aVar.a, aVar.b, aVar.c, str) : aVar;
            case 5:
                return Boolean.valueOf((yk60.i.get() || (((p1v) obj) instanceof p1v.b)) ? false : true);
            case 6:
                jf70 jf70Var = (jf70) obj;
                ListBuilder e = e43.e();
                NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = jf70Var.e;
                List<UserProfile> list3 = jf70Var.i;
                List<Group> list4 = jf70Var.j;
                boolean z3 = jf70Var.h;
                kb70.d dVar = jf70Var.g;
                if (notificationsNotificationSettingRedesignDto != null) {
                    int i4 = y1z.a;
                    LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                    if (dVar != null) {
                        e.add(new me70.i(R.string.notification_hint_section_title));
                        e.add(new me70.f(dVar));
                    }
                    NotificationsNotificationSettingHintDto d = notificationsNotificationSettingRedesignDto.d();
                    if ((d != null ? d.d() : null) != null) {
                        e.add(new me70.a("NotificationHint_divider", notificationsNotificationSettingRedesignDto.d().d()));
                    }
                    boolean z4 = z3 || !(((list = list4) == null || list.isEmpty()) && ((list2 = list3) == null || list2.isEmpty()));
                    if (notificationsNotificationSettingRedesignDto.j() != null) {
                        e.add(new me70.i(R.string.notification_what_to_show_section_title));
                        e.add(new me70.l(notificationsNotificationSettingRedesignDto.j()));
                        if (notificationsNotificationSettingRedesignDto.i() != null || notificationsNotificationSettingRedesignDto.f() != null || z4) {
                            e.add(new me70.a("WhatToShowRadioGroup_divider", null));
                        }
                    }
                    if (notificationsNotificationSettingRedesignDto.i() != null) {
                        e.add(new me70.i(R.string.notification_what_to_send_section_title));
                        e.add(new me70.k(notificationsNotificationSettingRedesignDto.i()));
                        if (notificationsNotificationSettingRedesignDto.f() != null || z4) {
                            e.add(new me70.a("WhatToSendRadioGroup_Divider", null));
                        }
                    }
                    if (notificationsNotificationSettingRedesignDto.f() != null) {
                        e.add(new me70.i(R.string.notification_push_setting_section_title));
                        boolean z5 = notificationsNotificationSettingRedesignDto.f() == NotificationsNotificationSettingPushSettingDto.NO_SOUND || notificationsNotificationSettingRedesignDto.f() == NotificationsNotificationSettingPushSettingDto.ON;
                        NotificationsNotificationSettingPushSettingDto f = notificationsNotificationSettingRedesignDto.f();
                        NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto = NotificationsNotificationSettingPushSettingDto.UNAVAILABLE;
                        e.add(new me70.g(z5, f != notificationsNotificationSettingPushSettingDto));
                        e.add(new me70.h(notificationsNotificationSettingRedesignDto.f() == NotificationsNotificationSettingPushSettingDto.ON, (notificationsNotificationSettingRedesignDto.f() == NotificationsNotificationSettingPushSettingDto.OFF || notificationsNotificationSettingRedesignDto.f() == notificationsNotificationSettingPushSettingDto) ? false : true));
                        if (z4) {
                            e.add(new me70.a("PushSettings_Divider", null));
                        }
                    }
                    if (z3) {
                        e.add(me70.j.a);
                    }
                    if (notificationsNotificationSettingRedesignDto.f() == NotificationsNotificationSettingPushSettingDto.ON || notificationsNotificationSettingRedesignDto.f() == NotificationsNotificationSettingPushSettingDto.NO_SOUND) {
                        ListBuilder e2 = e43.e();
                        List<Group> list5 = list4;
                        if (list5 != null && !list5.isEmpty()) {
                            e2.add(new me70.i(R.string.managed_communities));
                            List<Group> list6 = list4;
                            ArrayList arrayList = new ArrayList(c5g.u(list6, 10));
                            for (Group group : list6) {
                                arrayList.add(new me70.c(group.c, group.d, group.z, group.g, group.I));
                            }
                            e2.addAll(arrayList);
                        }
                        e.addAll(e2.g());
                    }
                    String id = notificationsNotificationSettingRedesignDto.getId();
                    ListBuilder e3 = e43.e();
                    List<UserProfile> list7 = list3;
                    if (list7 != null && !list7.isEmpty()) {
                        if (epx.f(id, "new_stories")) {
                            i = R.string.not_subsription_to_stories;
                        } else if (epx.f(id, "new_posts")) {
                            i = R.string.sett_post_source_list;
                        }
                        e3.add(new me70.i(i));
                        ArrayList arrayList2 = new ArrayList();
                        for (UserProfile userProfile : list3) {
                            Object eVar = epx.f(id, "new_stories") ? new me70.e(userProfile.c, userProfile.e, userProfile.O, userProfile.Y) : epx.f(id, "new_posts") ? new me70.d(userProfile.c, userProfile.e, userProfile.O, userProfile.Y) : null;
                            if (eVar != null) {
                                arrayList2.add(eVar);
                            }
                        }
                        e3.addAll(arrayList2);
                    }
                    e.addAll(e3.g());
                }
                return e.g();
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    i2 = R.raw.play_to_pause_48;
                } else {
                    if (!booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.raw.pause_to_play_48;
                }
                return Integer.valueOf(i2);
            case 8:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 9:
                ojt ojtVar = (ojt) obj;
                ojtVar.l = f5h0.o.a;
                ojtVar.m = new PointF(0.5f, 0.5f);
                return s3q0.a;
            case 10:
                return ((Owner) obj).e;
            case 11:
                return ((edd0) obj).b;
            case 12:
                return s3q0.a;
            case 13:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 14:
                return new kph0(R.layout.search_params_loading_item, (ViewGroup) obj);
            case 15:
                xwk.e().T().m().b(zts.b((ems) obj));
                return s3q0.a;
            case 16:
                L.i((Throwable) obj);
                return s3q0.a;
            case 17:
                return Integer.valueOf(((k9l0) obj).f);
            case 18:
                return i5s.a(new StringBuilder(), ((zk10) obj).b().get(1), "\"<HIDE>\"");
            case 19:
                VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell((Context) obj, null, 6);
                vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, "Simple Mini Info Cell"), false, false, false, true, null, 46));
                return vkMiniInfoCell;
            case 20:
                cvk.w("Error", false);
                return s3q0.a;
            case 21:
                List<Integer> d2 = ((RecomSettingsGetRecomThemesResponseDto) obj).d();
                return d2 == null ? EmptyList.b : d2;
            case 22:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 23:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).l;
            case 24:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                yq9 a = ggjVar.a0().a();
                p4t0 p4t0Var = new p4t0();
                p4t0Var.setBounds(0, 0, an10.b(Float.intBitsToFloat((int) (ggjVar.d() >> 32))), an10.b(Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L))));
                Canvas canvas = e52.a;
                p4t0Var.draw(((d52) a).a);
                return s3q0.a;
            case 25:
                List<VkAuthAppScope> list8 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list8, 10));
                for (VkAuthAppScope vkAuthAppScope : list8) {
                    String str4 = vkAuthAppScope.c;
                    String str5 = vkAuthAppScope.d;
                    Integer valueOf = Integer.valueOf(R.drawable.vk_icon_advertising_outline_28);
                    Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_article_outline_28);
                    Integer valueOf3 = Integer.valueOf(R.drawable.vk_icon_phone_outline_28);
                    Integer valueOf4 = Integer.valueOf(R.drawable.vk_icon_messages_outline_28);
                    Integer valueOf5 = Integer.valueOf(R.drawable.vk_icon_notifications_28);
                    Integer valueOf6 = Integer.valueOf(R.drawable.vk_icon_compass_outline_28);
                    String str6 = vkAuthAppScope.b;
                    switch (str6.hashCode()) {
                        case -1884266413:
                            if (str6.equals("stories")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_camera_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case -1548612125:
                            break;
                        case -1422043996:
                            if (str6.equals("adsweb")) {
                                break;
                            }
                            valueOf = null;
                            break;
                        case -1237460524:
                            if (str6.equals("groups")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_users_3_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case -1081434779:
                            if (str6.equals("manage")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_settings_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case -1081306052:
                            if (str6.equals("market")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_market_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case -1039689911:
                            break;
                        case -989034367:
                            if (str6.equals("photos")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_picture_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_name_tag_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case -612351174:
                            break;
                        case -600094315:
                            if (str6.equals("friends")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_users_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case -462094004:
                            break;
                        case -80148248:
                            if (str6.equals("general")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_info_circle_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 96432:
                            if (str6.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                                break;
                            }
                            valueOf = null;
                            break;
                        case 3088955:
                            if (str6.equals("docs")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_document_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 3641802:
                            if (str6.equals("wall")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_edit_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 93166550:
                            if (str6.equals("audio")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_music_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 96619420:
                            if (str6.equals("email")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_mail_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 102845591:
                            if (str6.equals("leads")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_target_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 105008833:
                            break;
                        case 106426308:
                            break;
                        case 106642798:
                            break;
                        case 109757599:
                            if (str6.equals("stats")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_statistics_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 112202875:
                            if (str6.equals("video")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_video_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 324579881:
                            if (str6.equals("wallmenu")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_newsfeed_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 1125980940:
                            break;
                        case 1272354024:
                            break;
                        case 1388275234:
                            break;
                        case 1484547493:
                            if (str6.equals("general_info")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_user_circle_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        case 1833042904:
                            if (str6.equals("geo_data")) {
                                valueOf = Integer.valueOf(R.drawable.vk_icon_place_outline_28);
                                break;
                            }
                            valueOf = null;
                            break;
                        default:
                            valueOf = null;
                            break;
                    }
                    arrayList3.add(new cnu0(str4, str5, valueOf));
                }
                return arrayList3;
            case 26:
                return s3q0.a;
            case 27:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 28:
                Serializer.c<RecommendationsBlockModel> cVar = RecommendationsBlockModel.CREATOR;
                return RecommendationsBlockModel.a.a((VmojiGetStickerPacksRecommendationBlockResponseDto) obj);
            default:
                return Boolean.valueOf(((a6r) obj) instanceof bhw0);
        }
    }

    public /* synthetic */ wo40(Object obj, int i) {
        this.b = i;
    }
}
