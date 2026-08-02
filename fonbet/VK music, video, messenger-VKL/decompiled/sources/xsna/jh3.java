package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingHintDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsItemDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingStatusDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedNotificationDto;
import com.vk.attachpicker.stat.models.VkStickerMeta;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.app.AppContent;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.core.preference.Preference;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.pushes.NotificationUtils;
import com.vk.qrcode.d;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import xsna.cf70;
import xsna.if70;
import xsna.ig3;
import xsna.m7a0;
import xsna.rtb0;
import xsna.tlo0;
import xsna.vzi0;
import xsna.zi3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jh3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jh3(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 10;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tlo0.f h;
        zi3.g gVar;
        tlo0.a aVar;
        int i;
        tlo0 h2;
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto;
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto;
        NotificationsNotificationSettingHintDto d;
        NotificationsNotificationSettingHintDto d2;
        NotificationsUnifiedNotificationDto e;
        int i2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                rh3 rh3Var = (rh3) obj4;
                PhotoAlbumWrapper photoAlbumWrapper = (PhotoAlbumWrapper) obj3;
                Set set = (Set) obj2;
                Integer num = (Integer) obj;
                if (num == null || num.intValue() != 0) {
                    rh3Var.l.j(photoAlbumWrapper.getId(), set);
                    rh3Var.i.a(new m7a0.e(photoAlbumWrapper.getId(), set));
                    int intValue = num.intValue();
                    Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_positive);
                    Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28);
                    int i3 = 0;
                    if (photoAlbumWrapper instanceof PhotoAlbumWrapper.CommonPhotoAlbum) {
                        String str = photoAlbumWrapper.d;
                        if (set.size() != intValue) {
                            h2 = tq.h(tlo0.Companion, R.string.unarchive_partial);
                        } else if (set.size() > 1) {
                            tlo0.Companion.getClass();
                            h2 = tlo0.a.c(R.string.photos_extracted_from_archive, str);
                        } else {
                            tlo0.Companion.getClass();
                            h2 = tlo0.a.c(R.string.photo_extracted_from_archive, str);
                        }
                        gVar = new zi3.g(new j7k0(h2, valueOf2, valueOf, tq.h(tlo0.Companion, R.string.photo_archive_go_to_album), new mh3(i3, rh3Var, photoAlbumWrapper), null, 32));
                    } else {
                        if (set.size() == intValue) {
                            if (set.size() > 1) {
                                aVar = tlo0.Companion;
                                i = R.string.photos_extracted_from_archive_to_tab;
                            } else {
                                aVar = tlo0.Companion;
                                i = R.string.photo_extracted_from_archive_to_tab;
                            }
                            h = tq.h(aVar, i);
                        } else {
                            h = tq.h(tlo0.Companion, R.string.unarchive_partial);
                        }
                        gVar = new zi3.g(new j7k0(h, valueOf2, valueOf, tq.h(tlo0.Companion, R.string.photo_archive_go_to_album), new defpackage.g(rh3Var, 5), null, 32));
                    }
                    rh3Var.o.b(gVar);
                    rh3Var.C(new ig3.f());
                    rh3Var.C(new ig3.i(true));
                    break;
                } else {
                    break;
                }
            case 1:
                s sVar = new s(4, (yvj) obj3, (h6p0) obj2);
                qcy<Object>[] qcyVarArr = qgi0.a;
                ((tgi0) obj).a(wfi0.c, new ck((String) obj4, sVar));
                break;
            case 2:
                break;
            case 3:
                lq40 lq40Var = ((kco) obj3).a;
                Playlist playlist = (Playlist) obj2;
                int intValue2 = ((Integer) obj).intValue();
                ((gzs) obj4).invoke();
                if (intValue2 == 57) {
                    lq40Var.Y(playlist);
                } else if (intValue2 == 58) {
                    lq40Var.V(playlist);
                }
                break;
            case 4:
                CatalogBlock catalogBlock = (CatalogBlock) obj4;
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) obj3;
                bi20 bi20Var = (bi20) obj2;
                Object zb = catalogBlock.m.zb((String) obj);
                AppContent appContent = zb instanceof AppContent ? (AppContent) zb : null;
                if (appContent != null) {
                    Object Ab = catalogExtendedData.Ab(catalogBlock.c, String.valueOf(appContent.c));
                    ApiApplication apiApplication = Ab instanceof ApiApplication ? (ApiApplication) Ab : null;
                    if (apiApplication != null) {
                        break;
                    }
                }
                break;
            case 5:
                ((ia40) obj4).a.N0(new lqk0(new StartPlayEntitySource(StartPlayEntitySource.PlayEntitySource.ARTIST, (String) obj3, false, 4, null), (MusicTrack) null, (List) obj, (MusicPlaybackLaunchContext) obj2, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 882));
                break;
            case 6:
                final vh40 vh40Var = (vh40) obj4;
                final UserId userId = (UserId) obj3;
                final UserId userId2 = (UserId) obj2;
                final List list = (List) obj;
                break;
            case 7:
                w860 w860Var = (w860) obj4;
                w860Var.c.invoke();
                w860Var.d.invoke((String) obj3, (Bitmap) obj, (VkStickerMeta) obj2);
                break;
            case 8:
                qe70 qe70Var = (qe70) obj4;
                f4z f4zVar = qe70Var.o;
                jf70 jf70Var = (jf70) obj3;
                NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto = (NotificationsNotificationSettingOptionsItemDto) obj2;
                NotificationsEditRedesignSettingResponseDto notificationsEditRedesignSettingResponseDto = (NotificationsEditRedesignSettingResponseDto) obj;
                NotificationsNotificationSettingRedesignDto d3 = notificationsEditRedesignSettingResponseDto.d();
                if (d3 != null) {
                    NotificationsNotificationSettingRedesignDto d4 = notificationsEditRedesignSettingResponseDto.d();
                    if (d4 == null || (d = d4.d()) == null) {
                        notificationsNotificationSettingHintDto = null;
                    } else {
                        NotificationsNotificationSettingRedesignDto d5 = notificationsEditRedesignSettingResponseDto.d();
                        notificationsNotificationSettingHintDto = NotificationsNotificationSettingHintDto.a(d, (d5 == null || (d2 = d5.d()) == null || (e = d2.e()) == null) ? null : ci70.a(e));
                    }
                    notificationsNotificationSettingRedesignDto = NotificationsNotificationSettingRedesignDto.a(d3, null, notificationsNotificationSettingHintDto, null, 239);
                } else {
                    notificationsNotificationSettingRedesignDto = null;
                }
                if (notificationsNotificationSettingRedesignDto != null) {
                    f4zVar.b(vzi0.c.a);
                    qe70Var.T(new cf70.n(notificationsNotificationSettingRedesignDto));
                    NotificationsNotificationSettingStatusDto g = notificationsNotificationSettingRedesignDto.g();
                    NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto notificationsNotificationSettingStatusEnumDto = g instanceof NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto ? (NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto) g : null;
                    if (notificationsNotificationSettingStatusEnumDto != null && notificationsNotificationSettingStatusEnumDto.d() != null) {
                        qe70Var.n.b(new if70.c(notificationsNotificationSettingRedesignDto));
                    }
                    String str2 = jf70Var.d;
                    String id = notificationsNotificationSettingOptionsItemDto.getId();
                    if (id == null) {
                        id = "";
                    }
                    Preference.H("notifications_prefs", str2, id);
                    NotificationUtils.Type b = NotificationUtils.Type.b(jf70Var.d);
                    if (b == null) {
                        break;
                    } else {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        NotificationUtils.k(context, b, true);
                        boolean f = true ^ epx.f(notificationsNotificationSettingOptionsItemDto.getId(), "no_text");
                        Context context2 = e43.a;
                        NotificationUtils.l(context2 != null ? context2 : null, b, f);
                    }
                } else {
                    dm10.e().d();
                    f4zVar.b(vzi0.a.a);
                }
                break;
            case 9:
                izs izsVar = (izs) obj3;
                gzs gzsVar = (gzs) obj2;
                rtb0.a aVar2 = (rtb0.a) obj;
                ((com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.f) obj4).getClass();
                if (aVar2.b) {
                    izsVar.invoke(aVar2.a);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    gzsVar.invoke();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                break;
            default:
                Activity activity = (Activity) obj4;
                com.vk.qrcode.c cVar = (com.vk.qrcode.c) obj3;
                d.b bVar = (d.b) obj2;
                ApiApplication apiApplication2 = (ApiApplication) obj;
                if (apiApplication2 != null) {
                    com.vk.qrcode.d.b.g(activity, cVar, apiApplication2, bVar);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jh3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
