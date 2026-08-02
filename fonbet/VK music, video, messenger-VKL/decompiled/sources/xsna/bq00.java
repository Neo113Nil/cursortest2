package xsna;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.os.Build;
import com.vk.api.generated.friends.dto.FriendsFriendsListDto;
import com.vk.api.generated.friends.dto.FriendsGetListsResponseDto;
import com.vk.api.generated.market.dto.MarketGetStorefrontResponseDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsAdminBannerDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsDto;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh;
import com.vk.censoredsettings.presentation.obscenetext.ObsceneTextFilterFragment;
import com.vk.censoredsettings.presentation.obscenetext.f;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.notifications.settings.NotificationSettingsCategory;
import com.vk.dto.notifications.settings.NotificationsSettingsConfig;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.im.ui.views.msg.MsgPartAudioView;
import com.vk.log.L;
import com.vk.music.fragment.impl.model.MusicPlaylistsModelDataContainer;
import com.vk.pushes.NotificationUtils;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bd20;
import xsna.dr20;
import xsna.dz40;
import xsna.gm50;
import xsna.l6c0;
import xsna.sv00;
import xsna.t5c0;
import xsna.tj50;
import xsna.tla0;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bq00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bq00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0145, code lost:
    
        if (r0 != 9) goto L94;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        dk70[] dk70VarArr;
        NotificationSettingsCategory[] notificationSettingsCategoryArr;
        NotificationsSettingsConfig notificationsSettingsConfig;
        AudioAttributes audioAttributes;
        int c;
        int i4;
        PhotoAttachment Mb;
        VideoAttachment Nb;
        Object obj2;
        UserProfile userProfile;
        MarketIntegrationSettingsAdminBannerDto d;
        int i5 = this.b;
        int i6 = 7;
        Photo photo = null;
        r8 = null;
        tsd0 tsd0Var = null;
        r8 = null;
        VideoFile videoFile = null;
        photo = null;
        Object obj3 = this.c;
        switch (i5) {
            case 0:
                ((cq00) obj3).b.a(br00.b);
                return s3q0.a;
            case 1:
                List<? extends hfz> list = (List) obj;
                wr00 wr00Var = ((MarketAllReviewsFragment) obj3).V;
                (wr00Var == null ? null : wr00Var).setItems(list);
                return s3q0.a;
            case 2:
                iv00 iv00Var = (iv00) obj3;
                int i7 = iv00.p1;
                yzt0<List<vv00>> yzt0Var = ((sv00.b) obj).a;
                ui uiVar = new ui(iv00Var, 5);
                iv00Var.getClass();
                gm50.a.a(iv00Var, yzt0Var, uiVar);
                return s3q0.a;
            case 3:
                int i8 = MarketEditAlbumCoverFragment.d0;
                j03.j(((MarketEditAlbumCoverFragment) obj3).mo2getContext(), (Throwable) obj);
                return s3q0.a;
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                izs<? super Integer, s3q0> izsVar = ((MarketProductTileView) obj3).I;
                if (izsVar != null) {
                    izsVar.invoke(num);
                }
                return s3q0.a;
            case 5:
                ia20 ia20Var = (ia20) obj3;
                ProfilesInfo profilesInfo = (ProfilesInfo) obj;
                ReentrantReadWriteLock reentrantReadWriteLock = ia20Var.f;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i9 = 0; i9 < readHoldCount; i9++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    io.reactivex.rxjava3.subjects.d<ProfilesInfo> dVar = ia20Var.d;
                    ProfilesInfo P0 = dVar.P0();
                    P0.getClass();
                    ProfilesInfo profilesInfo2 = new ProfilesInfo(P0);
                    profilesInfo2.Hb(profilesInfo);
                    dVar.onNext(profilesInfo2);
                    i = 0;
                    try {
                        ia20Var.h.compareAndSet(true, false);
                        s3q0 s3q0Var = s3q0.a;
                        for (int i10 = 0; i10 < readHoldCount; i10++) {
                            readLock.lock();
                        }
                        writeLock.unlock();
                        return s3q0.a;
                    } catch (Throwable th) {
                        th = th;
                        for (int i11 = i; i11 < readHoldCount; i11++) {
                            readLock.lock();
                        }
                        writeLock.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            case 6:
                ((cd20) obj3).O(bd20.d.b);
                return s3q0.a;
            case 7:
                VkMiniInfoCell.f fVar = (VkMiniInfoCell.f) obj3;
                rzq0 rzq0Var = (rzq0) obj;
                rzq0Var.b(fVar.a, dr20.a.b);
                Integer num2 = fVar.b;
                if (num2 != null) {
                    rzq0Var.a(new dr20.b(num2.intValue()));
                }
                return s3q0.a;
            case 8:
                ((com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj3).e(b.i.a);
                return s3q0.a;
            case 9:
                int i12 = MsgPartAudioView.z;
                ((MsgPartAudioView) obj3).getClass();
                return s3q0.a;
            case 10:
                ((MusicPageInfoBlockVh) obj3).m = null;
                return s3q0.a;
            case 11:
                rt40 rt40Var = (rt40) obj3;
                tzp0.c.a aVar = rt40.s1;
                fs40 fs40Var = new fs40((List) obj);
                rt40Var.getClass();
                xn50.a.c(rt40Var, fs40Var);
                return s3q0.a;
            case 12:
                tj50.a aVar2 = (tj50.a) obj;
                jue0 jue0Var = ((my40) obj3).i;
                jue0Var.getClass();
                iue0 iue0Var = iue0.b;
                ao8 ao8Var = ao8.d;
                return new dz40.r(new dz40.q(aVar2.a(iue0Var, ao8Var), aVar2.a(new k220(18), ao8Var), aVar2.a(new zos(23), ao8Var), aVar2.a(new z410(16), ao8Var)), aVar2.a(new eue0(1, jue0Var, jue0.class, "composeCovers", "composeCovers(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$Covers;", 0), ao8Var), aVar2.a(new fo20(13), ao8Var), aVar2.a(new fue0(1, jue0Var, jue0.class, "composeCurrentData", "composeCurrentData(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/domain/TrackData$Radio;", 0), ao8Var), aVar2.a(new oey(22), ao8Var), aVar2.a(gue0.b, ao8Var), aVar2.a(new hue0(1, jue0Var, jue0.class, "composePlaybackQueue", "composePlaybackQueue(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$PlaybackQueueData$Radio;", 0), ao8Var));
            case 13:
                ((g250) obj3).d = (MusicPlaylistsModelDataContainer) obj;
                return s3q0.a;
            case 14:
                MusicTrack musicTrack = (MusicTrack) obj;
                fsv<MusicTrack> fsvVar = ((m550) obj3).g;
                if (fsvVar != null) {
                    fsvVar.Ig(R.id.audio_image, musicTrack);
                }
                return s3q0.a;
            case 15:
                int intValue = ((Integer) obj).intValue();
                Integer num3 = ((nx50) obj3).E;
                return Boolean.valueOf(num3 != null && intValue == num3.intValue());
            case 16:
                u870 u870Var = (u870) obj3;
                kj70 kj70Var = (kj70) obj;
                dk70[] dk70VarArr2 = kj70Var.a;
                int i13 = com.vk.pushes.a.b;
                x870 x870Var = x870.a;
                if (gz80.a(26)) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    ca70 ca70Var = ca70.a;
                    NotificationManager f = ca70.f(context);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup("messages", context.getString(R.string.messages));
                    arrayList2.add(notificationChannelGroup);
                    NotificationUtils.Type type = NotificationUtils.Type.PrivateMessages;
                    NotificationChannel notificationChannel = new NotificationChannel("private_messages_ver2", context.getString(R.string.sett_notifications_messages_private), NotificationUtils.f(context, type) ? com.vk.pushes.a.c(context, "PrivateMessages") : 0);
                    com.vk.pushes.a.a(notificationChannel, context, type);
                    notificationChannel.setGroup(notificationChannelGroup.getId());
                    u870Var.getClass();
                    notificationChannel.setShowBadge(true);
                    arrayList.add(notificationChannel);
                    NotificationUtils.Type type2 = NotificationUtils.Type.ChatMessages;
                    NotificationChannel notificationChannel2 = new NotificationChannel("group_chats_ver2", context.getString(R.string.sett_notifications_messages_chats), NotificationUtils.f(context, type2) ? com.vk.pushes.a.c(context, "ChatMessages") : 0);
                    com.vk.pushes.a.a(notificationChannel2, context, type2);
                    notificationChannel2.setGroup(notificationChannelGroup.getId());
                    notificationChannel2.setShowBadge(true);
                    arrayList.add(notificationChannel2);
                    if (u870Var.a()) {
                        String id = notificationChannelGroup.getId();
                        NotificationUtils.Type type3 = NotificationUtils.Type.VkAppChannels;
                        NotificationChannel notificationChannel3 = new NotificationChannel(RTCStatsConstants.KEY_CHANNELS, context.getString(R.string.sett_notifications_community_channels), NotificationUtils.f(context, type3) ? com.vk.pushes.a.c(context, "VkAppChannels") : 0);
                        com.vk.pushes.a.a(notificationChannel3, context, type3);
                        notificationChannel3.setGroup(id);
                        notificationChannel3.setShowBadge(true);
                        arrayList.add(notificationChannel3);
                    }
                    NotificationChannelGroup notificationChannelGroup2 = new NotificationChannelGroup("sync_msg_group", context.getString(R.string.push_sync_group));
                    arrayList2.add(notificationChannelGroup2);
                    NotificationChannel notificationChannel4 = new NotificationChannel("sync_msg_send_channel", context.getString(R.string.push_sync_msg_send_channel), 2);
                    notificationChannel4.setGroup(notificationChannelGroup2.getId());
                    arrayList.add(notificationChannel4);
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((NotificationChannelGroup) it.next()).getId());
                    }
                    int length = dk70VarArr2.length;
                    int i14 = 0;
                    while (i14 < length) {
                        dk70 dk70Var = dk70VarArr2[i14];
                        if (!j5g.P(arrayList3, dk70Var.a)) {
                            String str = dk70Var.a;
                            arrayList2.add(new NotificationChannelGroup(str, dk70Var.b));
                            NotificationSettingsCategory[] notificationSettingsCategoryArr2 = dk70Var.c;
                            if (notificationSettingsCategoryArr2 != null) {
                                int length2 = notificationSettingsCategoryArr2.length;
                                int i15 = 0;
                                while (i15 < length2) {
                                    NotificationSettingsCategory notificationSettingsCategory = notificationSettingsCategoryArr2[i15];
                                    if (notificationSettingsCategory.zb()) {
                                        String str2 = notificationSettingsCategory.b;
                                        i2 = length;
                                        String str3 = notificationSettingsCategory.c;
                                        i3 = i14;
                                        ArrayList<NotificationsSettingsConfig> arrayList4 = notificationSettingsCategory.i;
                                        if (arrayList4 != null) {
                                            dk70VarArr = dk70VarArr2;
                                            int size = arrayList4.size();
                                            notificationSettingsCategoryArr = notificationSettingsCategoryArr2;
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 < size) {
                                                    int i17 = size;
                                                    if (arrayList4.get(i16).e) {
                                                        notificationsSettingsConfig = arrayList4.get(i16);
                                                    } else {
                                                        i16++;
                                                        size = i17;
                                                    }
                                                } else if (arrayList4.size() > 0) {
                                                    notificationsSettingsConfig = arrayList4.get(0);
                                                }
                                            }
                                        } else {
                                            dk70VarArr = dk70VarArr2;
                                            notificationSettingsCategoryArr = notificationSettingsCategoryArr2;
                                        }
                                        notificationsSettingsConfig = null;
                                        if (notificationsSettingsConfig == null || !epx.f(notificationsSettingsConfig.f, Boolean.TRUE)) {
                                            audioAttributes = null;
                                            c = com.vk.pushes.a.c(context, null);
                                        } else {
                                            audioAttributes = null;
                                            c = 0;
                                        }
                                        NotificationChannel notificationChannel5 = new NotificationChannel(str2, str3, c);
                                        notificationChannel5.setDescription(notificationSettingsCategory.d);
                                        notificationChannel5.setGroup(str);
                                        boolean z = NotificationUtils.a;
                                        NotificationUtils.Type type4 = NotificationUtils.Type.Default;
                                        notificationChannel5.setSound(NotificationUtils.e(context, type4), audioAttributes);
                                        notificationChannel5.enableVibration(Preference.g(context).getBoolean("notifyVibrate" + NotificationUtils.d(context, type4), true));
                                        if (Preference.g(context).getBoolean("notifyLED" + NotificationUtils.d(context, type4), true)) {
                                            notificationChannel5.enableLights(true);
                                            notificationChannel5.setLightColor(Preference.g(context).getInt("notifyLedColor" + NotificationUtils.d(context, type4), -1));
                                        } else {
                                            notificationChannel5.enableLights(false);
                                        }
                                        arrayList.add(notificationChannel5);
                                    } else {
                                        i2 = length;
                                        i3 = i14;
                                        dk70VarArr = dk70VarArr2;
                                        notificationSettingsCategoryArr = notificationSettingsCategoryArr2;
                                    }
                                    i15++;
                                    length = i2;
                                    i14 = i3;
                                    dk70VarArr2 = dk70VarArr;
                                    notificationSettingsCategoryArr2 = notificationSettingsCategoryArr;
                                }
                            }
                        }
                        i14++;
                        length = length;
                        dk70VarArr2 = dk70VarArr2;
                    }
                    f.createNotificationChannelGroups(arrayList2);
                    f.createNotificationChannels(arrayList);
                    rsg0.y0(new ko(0), null, null, 3).subscribe(new zk30(new g6(22, kj70Var, arrayList3), 8), new pdw(new per(18), 11));
                }
                return s3q0.a;
            case 17:
                Boolean bool = (Boolean) obj;
                L.p("OKVoipAudioManager", zhy0.a("doWithHeadsetCheck: isHeadsetPlugged=", bool.booleanValue()));
                ((wx30) obj3).invoke(bool);
                return s3q0.a;
            case 18:
                ObsceneTextFilterFragment obsceneTextFilterFragment = (ObsceneTextFilterFragment) obj3;
                int i18 = ObsceneTextFilterFragment.R;
                gm50.a.a(obsceneTextFilterFragment, ((f.a) obj).a, new o440(obsceneTextFilterFragment, i6));
                return s3q0.a;
            case 19:
                gzs gzsVar = (gzs) obj;
                syf0 syf0Var = ((sy70) obj3).J;
                if (syf0Var != null) {
                    syf0Var.post(new o93(gzsVar, 20));
                }
                return s3q0.a;
            case 20:
                ((PackStylesListHolder) obj3).l.e();
                return s3q0.a;
            case 21:
                return Boolean.valueOf(((ckv) obj) == ((ckv) obj3));
            case 22:
                com.vk.photogallery.c cVar = (com.vk.photogallery.c) obj3;
                Rect rect = (Rect) obj;
                f4m.q(rect.bottom, cVar.o);
                bwt0.c0(rect.bottom, cVar.m);
                iah0.a(100);
                return s3q0.a;
            case 23:
                tla0 tla0Var = (tla0) obj3;
                tla0.a aVar3 = (tla0.a) obj;
                if (aVar3.b) {
                    i4 = R.drawable.vk_icon_pin_dot_16;
                } else {
                    if (!aVar3.a) {
                        return s3q0.a;
                    }
                    i4 = R.drawable.vk_icon_pin_16;
                }
                tla0Var.a.setImageResource(i4);
                return s3q0.a;
            case 24:
                l6c0 l6c0Var = (l6c0) obj3;
                l6c0.a aVar4 = (l6c0.a) obj;
                NewsEntry newsEntry = aVar4.a;
                String str4 = aVar4.b;
                l6c0Var.e(new i5c0(newsEntry, str4, aVar4.c));
                l6c0Var.c(new y4c0(str4, newsEntry));
                int zb = newsEntry.zb();
                if (zb != 1) {
                    if (zb != 2) {
                        if (zb != 7) {
                            break;
                        }
                    } else {
                        Videos videos = newsEntry instanceof Videos ? (Videos) newsEntry : null;
                        if (videos != null && (Nb = videos.Nb()) != null) {
                            videoFile = Nb.k;
                        }
                        if (videoFile != null) {
                            l6c0Var.a(new t5c0.d.c(fkq0.d(videoFile.getUid()) ? videoFile.getUid() : videoFile.I0()));
                        }
                    }
                    return s3q0.a;
                }
                Photos photos = newsEntry instanceof Photos ? (Photos) newsEntry : null;
                if (photos != null && (Mb = photos.Mb()) != null) {
                    photo = Mb.l;
                }
                if (photo != null && zb != 7) {
                    l6c0Var.a(new t5c0.d.c(fkq0.d(photo.f) ? photo.f : photo.e));
                }
                return s3q0.a;
            case 25:
                ikc0 ikc0Var = (ikc0) obj3;
                VideoFile videoFile2 = ((fyr0) obj).a;
                z84 z84Var = ikc0Var.B;
                if (z84Var == null) {
                    z84Var = null;
                }
                Iterator<T> it2 = z84Var.u().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        Attachment attachment = (Attachment) obj2;
                        if (!(attachment instanceof VideoAttachment) || !epx.f(((VideoAttachment) attachment).k.a1(), videoFile2.a1())) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                VideoAttachment videoAttachment = obj2 instanceof VideoAttachment ? (VideoAttachment) obj2 : null;
                if (videoAttachment != null && !epx.f(videoAttachment.k.m1(), videoFile2.m1())) {
                    ActionLink m1 = videoFile2.m1();
                    if (epx.f(m1 != null ? m1.c : null, "product")) {
                        ikc0Var.s.e();
                    }
                }
                return s3q0.a;
            case 26:
                List list2 = (List) obj3;
                List<FriendsFriendsListDto> d2 = ((FriendsGetListsResponseDto) obj).d();
                ArrayList arrayList5 = new ArrayList();
                for (FriendsFriendsListDto friendsFriendsListDto : d2) {
                    UserId userId = new UserId(friendsFriendsListDto.getId() + 2000000000);
                    if (list2.contains(userId)) {
                        userProfile = new UserProfile();
                        userProfile.c = userId;
                        userProfile.e = friendsFriendsListDto.d();
                    } else {
                        userProfile = null;
                    }
                    if (userProfile != null) {
                        arrayList5.add(userProfile);
                    }
                }
                return arrayList5;
            case 27:
                hap hapVar = (hap) obj3;
                MarketIntegrationSettingsDto n = ((MarketGetStorefrontResponseDto) obj).n();
                if (n != null && (d = n.d()) != null) {
                    tsd0Var = ((ssd0) ((bpn0) hapVar.d).getValue()).a(d);
                }
                return new it80(tsd0Var);
            case 28:
                ((s9f0) obj3).d = (List) obj;
                return s3q0.a;
            default:
                rah0 rah0Var = (rah0) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                L.e("ScreenCaptureManagerImpl", zhy0.a("Screen capture state changed, started=", booleanValue));
                if (!booleanValue && Build.VERSION.SDK_INT >= 34) {
                    rah0Var.e(null);
                }
                return s3q0.a;
        }
    }
}
