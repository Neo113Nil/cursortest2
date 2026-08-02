package xsna;

import android.content.Context;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.notifications.dto.NotificationsActionDto;
import com.vk.api.generated.notifications.dto.NotificationsEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationAttachmentBubbleEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationAttachmentDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationButtonsButtonDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationButtonsDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationDotsMenuItemDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationImageDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsOwnerDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesTypeDto;
import com.vk.api.generated.polls.dto.PollsBackgroundDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.api.generated.wall.dto.WallWallpostDto;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.notifications.core.item.NotificationImage;
import com.vk.notifications.core.item.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.ha70;
import xsna.i870;
import xsna.kb70;
import xsna.kjt;
import xsna.tlo0;
import xsna.w770;

/* compiled from: NotificationItemMapper.kt */
/* loaded from: classes4.dex */
public final class la70 {
    public final x970 a;
    public final pax0 b;
    public final l770 c;
    public final Regex d = new Regex("'''(.*?)'''");

    /* compiled from: NotificationItemMapper.kt */
    public static final class a implements snv {
    }

    /* compiled from: NotificationItemMapper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationsOwnerDto.TypeDto.values().length];
            try {
                iArr[NotificationsOwnerDto.TypeDto.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationsOwnerDto.TypeDto.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public la70(x970 x970Var, pax0 pax0Var, l770 l770Var) {
        this.a = x970Var;
        this.b = pax0Var;
        this.c = l770Var;
    }

    public static Image a(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        return new Image(arrayList);
    }

    public static String c(UsersUserDto usersUserDto) {
        String p = usersUserDto.p();
        if (p != null || (p = usersUserDto.o()) != null) {
            return p;
        }
        String u = usersUserDto.u();
        return u == null ? "" : u;
    }

    public static String d(Image image) {
        ImageSize Cb = image.Cb(ImageScreenSize.VERY_SMALL.h(), true, true);
        if (Cb != null) {
            return Cb.d.d;
        }
        return null;
    }

    public static Image g(List list) {
        List<PhotosPhotoSizesDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (PhotosPhotoSizesDto photosPhotoSizesDto : list2) {
            arrayList.add(new ImageSize(photosPhotoSizesDto.getUrl(), photosPhotoSizesDto.getWidth(), photosPhotoSizesDto.getHeight(), Boolean.valueOf(photosPhotoSizesDto.e() == PhotosPhotoSizesTypeDto.BASE), (char) 0, false, 48, null));
        }
        return new Image(arrayList);
    }

    public static Image j(List list) {
        List<VideoVideoImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (VideoVideoImageDto videoVideoImageDto : list2) {
            arrayList.add(new ImageSize(videoVideoImageDto.getUrl(), videoVideoImageDto.getWidth(), videoVideoImageDto.getHeight(), videoVideoImageDto.e(), (char) 0, false, 48, null));
        }
        return new Image(arrayList);
    }

    public final String b(WallWallpostDto wallWallpostDto) {
        List<WallWallpostAttachmentDto> d = wallWallpostDto.d();
        if (d != null) {
            List<WallWallpostAttachmentDto> list = d;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.b.a((WallWallpostAttachmentDto) it.next(), null));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof AttachmentWithMedia) {
                    arrayList2.add(next);
                }
            }
            AttachmentWithMedia attachmentWithMedia = (AttachmentWithMedia) j5g.a0(arrayList2);
            if (attachmentWithMedia != null && (!(attachmentWithMedia instanceof DocumentAttachment) || ((DocumentAttachment) attachmentWithMedia).h != null)) {
                return d(attachmentWithMedia.Db());
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0507, code lost:
    
        if (r10 == null) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09d0  */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kb70.d e(NotificationsNotificationRedesignDto notificationsNotificationRedesignDto) {
        ha70 ha70Var;
        i870.a aVar;
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        w770 aVar2;
        String str4;
        ha70.v vVar;
        String str5;
        s8u0 s8u0Var;
        Object obj;
        Map map;
        w770 w770Var;
        s8u0 s8u0Var2;
        int i;
        String str6;
        ArrayList arrayList;
        String str7;
        NotificationsNotificationAttachmentDto e;
        String str8;
        com.vk.notifications.core.item.a aVar3;
        com.vk.notifications.core.item.a aVar4;
        NotificationImage.Shape shape;
        ?? r10;
        String str9;
        Iterator it;
        Map map2;
        Map<Pair<Integer, UserId>, WallWallpostDto> map3;
        String Kb;
        List<BaseImageDto> W;
        PollsBackgroundDto D;
        List<BaseImageDto> i2;
        List<VideoVideoImageDto> t1;
        List<VideoVideoImageDto> y0;
        List<VideoVideoImageDto> y02;
        List<VideoVideoImageDto> y03;
        List<PhotosPhotoSizesDto> R;
        NotificationImage notificationImage;
        ha70 ha70Var2;
        tlo0 h;
        int i3;
        ha70 ha70Var3;
        ha70 lVar;
        Map map4;
        Object obj2;
        Object obj3;
        Map map5;
        s8u0 s8u0Var3;
        int i4;
        String str10;
        de70 de70Var;
        snv iVar;
        ha70.s sVar;
        UserId d;
        snv aVar5;
        ha70 ha70Var4;
        NotificationsActionDto d2;
        String e2;
        la70 la70Var = this;
        l770 l770Var = la70Var.c;
        x970 x970Var = la70Var.a;
        Map<Pair<Integer, UserId>, WallWallpostDto> map6 = x970Var.c;
        Map<Pair<Integer, UserId>, VideoVideoDto> map7 = x970Var.e;
        ?? r6 = x970Var.a;
        Object obj4 = x970Var.b;
        ?? r8 = x970Var.g;
        NotificationsActionDto d3 = notificationsNotificationRedesignDto.d();
        if (d3 != null) {
            ha70Var = l770Var != null ? l770Var.a.a(d3, notificationsNotificationRedesignDto, x970Var, null) : null;
        } else {
            ha70Var = null;
        }
        NotificationsNotificationButtonsDto f = notificationsNotificationRedesignDto.f();
        if (f != null) {
            tlo0.a aVar6 = tlo0.Companion;
            String e3 = f.d().e();
            aVar6.getClass();
            tlo0.h hVar = new tlo0.h(e3);
            NotificationsNotificationButtonsButtonDto e4 = f.e();
            tlo0.h hVar2 = (e4 == null || (e2 = e4.e()) == null) ? null : new tlo0.h(e2);
            if (l770Var == null || (aVar5 = l770Var.a.a(f.d().d(), notificationsNotificationRedesignDto, x970Var, Boolean.TRUE)) == null) {
                aVar5 = new a();
            }
            snv snvVar = aVar5;
            NotificationsNotificationButtonsButtonDto e5 = f.e();
            if (e5 == null || (d2 = e5.d()) == null) {
                ha70Var4 = null;
            } else {
                ha70Var4 = l770Var != null ? l770Var.a.a(d2, notificationsNotificationRedesignDto, x970Var, Boolean.FALSE) : null;
            }
            aVar = new i870.a(hVar, hVar2, snvVar, ha70Var4, null);
        } else {
            aVar = null;
        }
        String id = notificationsNotificationRedesignDto.getId();
        int g = notificationsNotificationRedesignDto.g();
        if (epx.f(notificationsNotificationRedesignDto.k(), Boolean.TRUE)) {
            str3 = null;
            str = id;
            z = false;
            z2 = true;
        } else {
            str = id;
            z = false;
            long g2 = notificationsNotificationRedesignDto.g();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            SimpleTimeZone simpleTimeZone = pvo0.a;
            z2 = true;
            String[] stringArray = context.getResources().getStringArray(R.array.short_time);
            long currentTimeMillis = System.currentTimeMillis() - (g2 * 1000);
            long[] jArr = pvo0.c;
            int length = jArr.length - 1;
            while (true) {
                if (length < 0) {
                    str2 = "0" + stringArray[0];
                    break;
                }
                long j = jArr[length];
                if (currentTimeMillis > j) {
                    long j2 = currentTimeMillis / j;
                    if (length != jArr.length - 1 || j2 < 5) {
                        str2 = (currentTimeMillis / jArr[length]) + stringArray[length];
                    } else {
                        str2 = String.valueOf(j2 + 1970);
                    }
                } else {
                    length--;
                }
            }
            str3 = str2;
        }
        NotificationsNotificationImageDto l = notificationsNotificationRedesignDto.l();
        if (l instanceof NotificationsNotificationImageDto.NotificationsNotificationImageSingleOwnerDto) {
            NotificationsNotificationImageDto.NotificationsNotificationImageSingleOwnerDto notificationsNotificationImageSingleOwnerDto = (NotificationsNotificationImageDto.NotificationsNotificationImageSingleOwnerDto) l;
            String i5 = la70Var.i(notificationsNotificationImageSingleOwnerDto.d());
            if (l770Var != null) {
                NotificationsOwnerDto d4 = notificationsNotificationImageSingleOwnerDto.d();
                if (d4.e() == NotificationsOwnerDto.TypeDto.GROUP) {
                    d = d4.d();
                    if (!fkq0.b(d)) {
                        d = null;
                    }
                    if (d == null) {
                        d = fkq0.e(d4.d());
                    }
                } else {
                    d = d4.d();
                }
                sVar = new ha70.s(d);
            } else {
                sVar = null;
            }
            aVar2 = new w770.d(i5, sVar, la70Var.h(notificationsNotificationImageSingleOwnerDto.d()));
        } else if (l instanceof NotificationsNotificationImageDto.NotificationsNotificationImageDoubleOwnerDto) {
            NotificationsNotificationImageDto.NotificationsNotificationImageDoubleOwnerDto notificationsNotificationImageDoubleOwnerDto = (NotificationsNotificationImageDto.NotificationsNotificationImageDoubleOwnerDto) l;
            aVar2 = new w770.a(la70Var.i(notificationsNotificationImageDoubleOwnerDto.e()), la70Var.i(notificationsNotificationImageDoubleOwnerDto.d()), notificationsNotificationImageDoubleOwnerDto.e().e() == NotificationsOwnerDto.TypeDto.GROUP ? tq.h(tlo0.Companion, R.string.accessibility_double_group) : tq.h(tlo0.Companion, R.string.accessibility_double_user));
        } else if (l instanceof NotificationsNotificationImageDto.NotificationsNotificationImageMiniAppDto) {
            AppsAppDto appsAppDto = (AppsAppDto) r8.get(Integer.valueOf(((NotificationsNotificationImageDto.NotificationsNotificationImageMiniAppDto) l).getId()));
            if (appsAppDto != null) {
                str4 = appsAppDto.T();
                if (str4 == null && (str4 = appsAppDto.G()) == null && (str4 = appsAppDto.K()) == null && (str4 = appsAppDto.M()) == null) {
                    str4 = "";
                }
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            if (appsAppDto == null || l770Var == null) {
                vVar = null;
            } else {
                new re3();
                vVar = new ha70.v(re3.b(appsAppDto));
            }
            tlo0.a aVar7 = tlo0.Companion;
            if (appsAppDto == null || (str5 = appsAppDto.getTitle()) == null) {
                str5 = "";
            }
            aVar7.getClass();
            aVar2 = new w770.c(str4, vVar, tlo0.a.c(R.string.accessibility_app, str5));
        } else if (l instanceof NotificationsNotificationImageDto.NotificationsNotificationImageStaticDto) {
            aVar2 = new w770.d(((NotificationsNotificationImageDto.NotificationsNotificationImageStaticDto) l).getUrl(), null, tq.h(tlo0.Companion, R.string.accessibility_photo));
        } else {
            if (!(l instanceof NotificationsNotificationImageDto.NotificationsNotificationImageSingleOwnerStaticDto)) {
                throw new NoWhenBranchMatchedException();
            }
            NotificationsNotificationImageDto.NotificationsNotificationImageSingleOwnerStaticDto notificationsNotificationImageSingleOwnerStaticDto = (NotificationsNotificationImageDto.NotificationsNotificationImageSingleOwnerStaticDto) l;
            aVar2 = new w770.a(notificationsNotificationImageSingleOwnerStaticDto.getUrl(), la70Var.i(notificationsNotificationImageSingleOwnerStaticDto.d()), la70Var.h(notificationsNotificationImageSingleOwnerStaticDto.d()));
        }
        s8u0 f2 = la70Var.f(notificationsNotificationRedesignDto.j());
        String n = notificationsNotificationRedesignDto.n();
        if (drm0.N(n)) {
            n = null;
        }
        s8u0 f3 = n != null ? la70Var.f(n) : null;
        List<NotificationsNotificationDotsMenuItemDto> i6 = notificationsNotificationRedesignDto.i();
        if (i6 != null) {
            if (l770Var != null) {
                String id2 = notificationsNotificationRedesignDto.getId();
                s8u0Var = f2;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = i6.iterator();
                ?? r7 = obj4;
                Map map8 = r8;
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    NotificationsNotificationDotsMenuItemDto notificationsNotificationDotsMenuItemDto = (NotificationsNotificationDotsMenuItemDto) it2.next();
                    w770 w770Var2 = aVar2;
                    if (notificationsNotificationDotsMenuItemDto instanceof NotificationsNotificationDotsMenuItemDto.NotificationsNotificationDotsMenuItemOpenSettingDto) {
                        NotificationsNotificationDotsMenuItemDto.NotificationsNotificationDotsMenuItemOpenSettingDto notificationsNotificationDotsMenuItemOpenSettingDto = (NotificationsNotificationDotsMenuItemDto.NotificationsNotificationDotsMenuItemOpenSettingDto) notificationsNotificationDotsMenuItemDto;
                        UserId d5 = notificationsNotificationDotsMenuItemOpenSettingDto.d();
                        s8u0Var3 = f3;
                        i4 = g;
                        tlo0.f h2 = tq.h(tlo0.Companion, R.string.notification_list_dot_menu_setup_title);
                        if (d5 == null) {
                            iVar = new ha70.n(notificationsNotificationDotsMenuItemOpenSettingDto.e());
                            obj3 = r7;
                            map5 = map8;
                            str10 = str3;
                        } else {
                            GroupsGroupDto groupsGroupDto = (GroupsGroupDto) r7.get(d5);
                            String i7 = groupsGroupDto != null ? groupsGroupDto.i() : null;
                            if (i7 == null) {
                                i7 = "";
                            }
                            str10 = str3;
                            obj3 = r7;
                            map5 = map8;
                            iVar = new ha70.i(d5.b, i7);
                        }
                        de70Var = new de70(h2, R.drawable.vk_icon_settings_outline_28, z, iVar);
                    } else {
                        obj3 = r7;
                        map5 = map8;
                        s8u0Var3 = f3;
                        i4 = g;
                        str10 = str3;
                        if (notificationsNotificationDotsMenuItemDto instanceof NotificationsNotificationDotsMenuItemDto.NotificationsNotificationDotsMenuItemUnsubscribeDto) {
                            NotificationsNotificationDotsMenuItemDto.NotificationsNotificationDotsMenuItemUnsubscribeDto notificationsNotificationDotsMenuItemUnsubscribeDto = (NotificationsNotificationDotsMenuItemDto.NotificationsNotificationDotsMenuItemUnsubscribeDto) notificationsNotificationDotsMenuItemDto;
                            de70Var = new de70(tq.h(tlo0.Companion, R.string.notification_list_dot_menu_disable_title), R.drawable.vk_icon_notification_disable_outline_28, false, new ha70.c(id2, notificationsNotificationDotsMenuItemUnsubscribeDto.d(), new i870.a(new tlo0.f(R.string.notification_list_dot_menu_cancel_title), new tlo0.f(R.string.notification_list_dot_menu_setup_title), new ha70.d(id2, notificationsNotificationDotsMenuItemUnsubscribeDto.d()), new ha70.n(null), null)));
                        } else {
                            de70Var = notificationsNotificationDotsMenuItemDto instanceof NotificationsNotificationDotsMenuItemDto.NotificationsNotificationDotsMenuItemHideNotificationDto ? new de70(tq.h(tlo0.Companion, R.string.notification_list_dot_menu_delete_title), R.drawable.vk_icon_delete_outline_28, z2, new ha70.b(id2, ((NotificationsNotificationDotsMenuItemDto.NotificationsNotificationDotsMenuItemHideNotificationDto) notificationsNotificationDotsMenuItemDto).d())) : null;
                        }
                    }
                    if (de70Var != null) {
                        arrayList2.add(de70Var);
                    }
                    aVar2 = w770Var2;
                    it2 = it3;
                    str3 = str10;
                    f3 = s8u0Var3;
                    g = i4;
                    r7 = obj3;
                    map8 = map5;
                    z = false;
                    z2 = true;
                }
                s8u0Var2 = f3;
                arrayList = arrayList2;
                obj2 = r7;
                map4 = map8;
            } else {
                s8u0Var = f2;
                s8u0Var2 = f3;
                arrayList = null;
                obj2 = obj4;
                map4 = r8;
            }
            obj = obj2;
            map = map4;
            w770Var = aVar2;
            i = g;
            str6 = str3;
        } else {
            s8u0Var = f2;
            obj = obj4;
            map = r8;
            w770Var = aVar2;
            s8u0Var2 = f3;
            i = g;
            str6 = str3;
            arrayList = null;
        }
        NotificationsNotificationAttachmentDto e6 = notificationsNotificationRedesignDto.e();
        if (e6 != null && (e6 instanceof NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentEntityArrayDto)) {
            NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentEntityArrayDto notificationsNotificationAttachmentEntityArrayDto = (NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentEntityArrayDto) e6;
            if (notificationsNotificationAttachmentEntityArrayDto.d().size() <= 1 && !notificationsNotificationAttachmentEntityArrayDto.d().isEmpty()) {
                NotificationsEntityDto notificationsEntityDto = (NotificationsEntityDto) j5g.Y(notificationsNotificationAttachmentEntityArrayDto.d());
                if (notificationsEntityDto instanceof NotificationsEntityDto.NotificationsEntityPostDto) {
                    NotificationsEntityDto.NotificationsEntityPostDto notificationsEntityPostDto = (NotificationsEntityDto.NotificationsEntityPostDto) notificationsEntityDto;
                    WallWallpostDto wallWallpostDto = map6.get(new Pair(Integer.valueOf(notificationsEntityPostDto.e()), notificationsEntityPostDto.q()));
                    if (wallWallpostDto != null) {
                        String f4 = wallWallpostDto.f();
                        if (f4 == null) {
                            f4 = "";
                        }
                        str7 = cqm0.a(xwk.d().a().m((drm0.N(f4) && (la70Var.b(wallWallpostDto) == null)) ? notificationsEntityPostDto.d() : j5g.g0(drm0.c0(f4, new String[]{"\n"}, 0, 6), " ", null, null, 0, null, 62)).toString());
                        e = notificationsNotificationRedesignDto.e();
                        if (e == null) {
                            if (e instanceof NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentUserStackDto) {
                                NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentUserStackDto notificationsNotificationAttachmentUserStackDto = (NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentUserStackDto) e;
                                List<UserId> d6 = notificationsNotificationAttachmentUserStackDto.d();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it4 = d6.iterator();
                                while (it4.hasNext()) {
                                    UsersUserDto usersUserDto = (UsersUserDto) r6.get((UserId) it4.next());
                                    String c = usersUserDto != null ? c(usersUserDto) : null;
                                    if (c != null) {
                                        arrayList3.add(c);
                                    }
                                }
                                aVar4 = new a.b(j5g.H0(arrayList3, 3), notificationsNotificationAttachmentUserStackDto.e());
                                str8 = str7;
                            } else if (e instanceof NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentBubbleDto) {
                                ucp ucpVar = ucp.a;
                                NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentBubbleDto notificationsNotificationAttachmentBubbleDto = (NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentBubbleDto) e;
                                CharSequence i8 = ucp.i(notificationsNotificationAttachmentBubbleDto.f());
                                bpn0 bpn0Var = cqm0.a;
                                if (i8 == null || i8.length() == 0) {
                                    i8 = null;
                                }
                                String a2 = cqm0.a(notificationsNotificationAttachmentBubbleDto.d());
                                NotificationsNotificationAttachmentBubbleEntityDto e7 = notificationsNotificationAttachmentBubbleDto.e();
                                if (e7 != null) {
                                    if (l770Var != null) {
                                        if (e7 instanceof NotificationsNotificationAttachmentBubbleEntityDto.NotificationsEntityCommentDto) {
                                            NotificationsNotificationAttachmentBubbleEntityDto.NotificationsEntityCommentDto notificationsEntityCommentDto = (NotificationsNotificationAttachmentBubbleEntityDto.NotificationsEntityCommentDto) e7;
                                            lVar = aj70.a(notificationsEntityCommentDto.e(), notificationsEntityCommentDto.d(), x970Var);
                                        } else {
                                            if (!(e7 instanceof NotificationsNotificationAttachmentBubbleEntityDto.NotificationsEntityMessageDto)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            lVar = new ha70.l(((NotificationsNotificationAttachmentBubbleEntityDto.NotificationsEntityMessageDto) e7).getUrl(), null);
                                        }
                                        ha70Var3 = lVar;
                                    } else {
                                        ha70Var3 = null;
                                    }
                                }
                                ha70Var3 = ha70Var;
                                str8 = str7;
                                aVar4 = new a.C1441a(i8, a2, ha70Var3);
                            } else if (e instanceof NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentEntityArrayDto) {
                                NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentEntityArrayDto notificationsNotificationAttachmentEntityArrayDto2 = (NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentEntityArrayDto) e;
                                if (notificationsNotificationAttachmentEntityArrayDto2.d().isEmpty()) {
                                    str8 = str7;
                                    aVar4 = null;
                                } else {
                                    List<NotificationsEntityDto> d7 = notificationsNotificationAttachmentEntityArrayDto2.d();
                                    ArrayList arrayList4 = new ArrayList(c5g.u(d7, 10));
                                    Iterator it5 = d7.iterator();
                                    while (it5.hasNext()) {
                                        arrayList4.add(qjg.a((NotificationsEntityDto) it5.next()));
                                    }
                                    if (j5g.R(arrayList4).size() == 1) {
                                        NotificationsEntityDto notificationsEntityDto2 = (NotificationsEntityDto) j5g.Y(notificationsNotificationAttachmentEntityArrayDto2.d());
                                        shape = ((notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityUserDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityGroupDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityPostDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityPhotoDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityPollDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityAppDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityMarketItemDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityPodcastDto)) ? NotificationImage.Shape.SQUARE : ((notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityVideoDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityLiveDto)) ? NotificationImage.Shape.HORIZONTAL : ((notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityShortVideoDto) || (notificationsEntityDto2 instanceof NotificationsEntityDto.NotificationsEntityStoryDto)) ? NotificationImage.Shape.VERTICAL : NotificationImage.Shape.SQUARE;
                                    } else {
                                        shape = NotificationImage.Shape.SQUARE;
                                    }
                                    List<NotificationsEntityDto> d8 = notificationsNotificationAttachmentEntityArrayDto2.d();
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it6 = d8.iterator();
                                    while (it6.hasNext()) {
                                        NotificationsEntityDto notificationsEntityDto3 = (NotificationsEntityDto) it6.next();
                                        boolean z3 = notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityUserDto;
                                        if (z3) {
                                            UsersUserDto usersUserDto2 = (UsersUserDto) r6.get(((NotificationsEntityDto.NotificationsEntityUserDto) notificationsEntityDto3).getUserId());
                                            if (usersUserDto2 != null) {
                                                str9 = str7;
                                                map3 = map6;
                                                it = it6;
                                                Kb = c(usersUserDto2);
                                                r10 = obj;
                                                map2 = map;
                                            } else {
                                                str9 = str7;
                                                map3 = map6;
                                                it = it6;
                                                r10 = obj;
                                                map2 = map;
                                                Kb = null;
                                            }
                                        } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityGroupDto) {
                                            r10 = obj;
                                            GroupsGroupDto groupsGroupDto2 = (GroupsGroupDto) r10.get(((NotificationsEntityDto.NotificationsEntityGroupDto) notificationsEntityDto3).d());
                                            if (groupsGroupDto2 != null) {
                                                String n2 = groupsGroupDto2.n();
                                                if (n2 == null && (n2 = groupsGroupDto2.j()) == null) {
                                                    String o = groupsGroupDto2.o();
                                                    n2 = o == null ? "" : o;
                                                }
                                                str9 = str7;
                                                map3 = map6;
                                                it = it6;
                                                Kb = n2;
                                                map2 = map;
                                            } else {
                                                str9 = str7;
                                                map3 = map6;
                                                it = it6;
                                                map2 = map;
                                                Kb = null;
                                            }
                                        } else {
                                            r10 = obj;
                                            if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityPostDto) {
                                                NotificationsEntityDto.NotificationsEntityPostDto notificationsEntityPostDto2 = (NotificationsEntityDto.NotificationsEntityPostDto) notificationsEntityDto3;
                                                str9 = str7;
                                                it = it6;
                                                WallWallpostDto wallWallpostDto2 = map6.get(new Pair(Integer.valueOf(notificationsEntityPostDto2.e()), notificationsEntityPostDto2.q()));
                                                if (wallWallpostDto2 != null) {
                                                    Kb = la70Var.b(wallWallpostDto2);
                                                    map3 = map6;
                                                    map2 = map;
                                                }
                                                map3 = map6;
                                                map2 = map;
                                                Kb = null;
                                            } else {
                                                str9 = str7;
                                                it = it6;
                                                if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityPhotoDto) {
                                                    NotificationsEntityDto.NotificationsEntityPhotoDto notificationsEntityPhotoDto = (NotificationsEntityDto.NotificationsEntityPhotoDto) notificationsEntityDto3;
                                                    PhotosPhotoDto photosPhotoDto = x970Var.d.get(new Pair(Integer.valueOf(notificationsEntityPhotoDto.d()), notificationsEntityPhotoDto.q()));
                                                    if (photosPhotoDto != null && (R = photosPhotoDto.R()) != null) {
                                                        Kb = d(g(R));
                                                        map3 = map6;
                                                        map2 = map;
                                                    }
                                                    map3 = map6;
                                                    map2 = map;
                                                    Kb = null;
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityVideoDto) {
                                                    NotificationsEntityDto.NotificationsEntityVideoDto notificationsEntityVideoDto = (NotificationsEntityDto.NotificationsEntityVideoDto) notificationsEntityDto3;
                                                    VideoVideoDto videoVideoDto = map7.get(new Pair(Integer.valueOf(notificationsEntityVideoDto.d()), notificationsEntityVideoDto.q()));
                                                    if (videoVideoDto != null && (y03 = videoVideoDto.y0()) != null) {
                                                        Kb = d(j(y03));
                                                        map3 = map6;
                                                        map2 = map;
                                                    }
                                                    map3 = map6;
                                                    map2 = map;
                                                    Kb = null;
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityLiveDto) {
                                                    NotificationsEntityDto.NotificationsEntityLiveDto notificationsEntityLiveDto = (NotificationsEntityDto.NotificationsEntityLiveDto) notificationsEntityDto3;
                                                    VideoVideoDto videoVideoDto2 = map7.get(new Pair(Integer.valueOf(notificationsEntityLiveDto.d()), notificationsEntityLiveDto.q()));
                                                    if (videoVideoDto2 != null && (y02 = videoVideoDto2.y0()) != null) {
                                                        Kb = d(j(y02));
                                                        map3 = map6;
                                                        map2 = map;
                                                    }
                                                    map3 = map6;
                                                    map2 = map;
                                                    Kb = null;
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityShortVideoDto) {
                                                    NotificationsEntityDto.NotificationsEntityShortVideoDto notificationsEntityShortVideoDto = (NotificationsEntityDto.NotificationsEntityShortVideoDto) notificationsEntityDto3;
                                                    VideoVideoDto videoVideoDto3 = map7.get(new Pair(Integer.valueOf(notificationsEntityShortVideoDto.d()), notificationsEntityShortVideoDto.q()));
                                                    if (videoVideoDto3 != null && (y0 = videoVideoDto3.y0()) != null) {
                                                        Kb = d(j(y0));
                                                        map3 = map6;
                                                        map2 = map;
                                                    }
                                                    map3 = map6;
                                                    map2 = map;
                                                    Kb = null;
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityStoryDto) {
                                                    NotificationsEntityDto.NotificationsEntityStoryDto notificationsEntityStoryDto = (NotificationsEntityDto.NotificationsEntityStoryDto) notificationsEntityDto3;
                                                    StoriesStoryDto storiesStoryDto = (StoriesStoryDto) x970Var.f.get(new Pair(Integer.valueOf(notificationsEntityStoryDto.d()), notificationsEntityStoryDto.q()));
                                                    if (storiesStoryDto != null) {
                                                        PhotosPhotoDto x1 = storiesStoryDto.x1();
                                                        VideoVideoFullDto X1 = storiesStoryDto.X1();
                                                        if ((x1 != null ? x1.R() : null) != null) {
                                                            List<PhotosPhotoSizesDto> R2 = x1.R();
                                                            if (R2 != null) {
                                                                Kb = d(g(R2));
                                                                map3 = map6;
                                                                map2 = map;
                                                            }
                                                            Kb = null;
                                                            map3 = map6;
                                                            map2 = map;
                                                        } else {
                                                            if (X1 != null && (t1 = X1.t1()) != null) {
                                                                Kb = d(j(t1));
                                                                map3 = map6;
                                                                map2 = map;
                                                            }
                                                            Kb = null;
                                                            map3 = map6;
                                                            map2 = map;
                                                        }
                                                    }
                                                    map3 = map6;
                                                    map2 = map;
                                                    Kb = null;
                                                } else {
                                                    if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityAppDto) {
                                                        map2 = map;
                                                        AppsAppDto appsAppDto2 = (AppsAppDto) map2.get(Integer.valueOf(((NotificationsEntityDto.NotificationsEntityAppDto) notificationsEntityDto3).d()));
                                                        if (appsAppDto2 != null) {
                                                            String T = appsAppDto2.T();
                                                            if (T == null && (T = appsAppDto2.G()) == null && (T = appsAppDto2.K()) == null) {
                                                                String M = appsAppDto2.M();
                                                                T = M == null ? "" : M;
                                                            }
                                                            map3 = map6;
                                                            Kb = T;
                                                        }
                                                        map3 = map6;
                                                    } else {
                                                        map2 = map;
                                                        if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityPollDto) {
                                                            PollsPollDto pollsPollDto = (PollsPollDto) x970Var.h.get(Integer.valueOf(((NotificationsEntityDto.NotificationsEntityPollDto) notificationsEntityDto3).d()));
                                                            if (pollsPollDto != null && (D = pollsPollDto.D()) != null && (i2 = D.i()) != null) {
                                                                Kb = d(a(i2));
                                                                map3 = map6;
                                                            }
                                                            map3 = map6;
                                                        } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityMarketItemDto) {
                                                            NotificationsEntityDto.NotificationsEntityMarketItemDto notificationsEntityMarketItemDto = (NotificationsEntityDto.NotificationsEntityMarketItemDto) notificationsEntityDto3;
                                                            map3 = map6;
                                                            MarketMarketItemDto marketMarketItemDto = x970Var.i.get(new Pair(Integer.valueOf(notificationsEntityMarketItemDto.d()), notificationsEntityMarketItemDto.q()));
                                                            if (marketMarketItemDto != null && (W = marketMarketItemDto.W()) != null) {
                                                                Kb = d(a(W));
                                                            }
                                                        } else {
                                                            map3 = map6;
                                                            if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityPodcastDto) {
                                                                NotificationsEntityDto.NotificationsEntityPodcastDto notificationsEntityPodcastDto = (NotificationsEntityDto.NotificationsEntityPodcastDto) notificationsEntityDto3;
                                                                AudioAudioDto audioAudioDto = x970Var.j.get(new Pair(Integer.valueOf(notificationsEntityPodcastDto.d()), notificationsEntityPodcastDto.q()));
                                                                if (audioAudioDto != null) {
                                                                    Kb = oc4.d(audioAudioDto).Kb(ImageScreenSize.VERY_SMALL.h());
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Kb = null;
                                                }
                                            }
                                        }
                                        if (Kb != null) {
                                            if (l770Var == null || (ha70Var2 = l770Var.b.a(notificationsEntityDto3, x970Var)) == null) {
                                                ha70Var2 = ha70Var;
                                            }
                                            if (z3) {
                                                UsersUserDto usersUserDto3 = (UsersUserDto) r6.get(((NotificationsEntityDto.NotificationsEntityUserDto) notificationsEntityDto3).getUserId());
                                                if (usersUserDto3 != null) {
                                                    UserProfile a3 = i2r0.a(usersUserDto3);
                                                    tlo0.a aVar8 = tlo0.Companion;
                                                    String str11 = a3.e;
                                                    if (str11 == null) {
                                                        str11 = "";
                                                    }
                                                    aVar8.getClass();
                                                    h = tlo0.a.c(R.string.accessibility_user, str11);
                                                    i3 = 4;
                                                    notificationImage = new NotificationImage(Kb, ha70Var2, h, i3);
                                                }
                                                h = null;
                                                i3 = 4;
                                                notificationImage = new NotificationImage(Kb, ha70Var2, h, i3);
                                            } else {
                                                if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityGroupDto) {
                                                    GroupsGroupDto groupsGroupDto3 = (GroupsGroupDto) r10.get(((NotificationsEntityDto.NotificationsEntityGroupDto) notificationsEntityDto3).d());
                                                    if (groupsGroupDto3 != null) {
                                                        tlo0.a aVar9 = tlo0.Companion;
                                                        String i9 = groupsGroupDto3.i();
                                                        if (i9 == null) {
                                                            i9 = "";
                                                        }
                                                        aVar9.getClass();
                                                        h = tlo0.a.c(R.string.accessibility_group, i9);
                                                    }
                                                    h = null;
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityPostDto) {
                                                    h = tq.h(tlo0.Companion, R.string.accessibility_post);
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityPhotoDto) {
                                                    h = tq.h(tlo0.Companion, R.string.accessibility_photo);
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityVideoDto) {
                                                    h = tq.h(tlo0.Companion, R.string.accessibility_video);
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityLiveDto) {
                                                    h = tq.h(tlo0.Companion, R.string.accessibility_live);
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityShortVideoDto) {
                                                    h = tq.h(tlo0.Companion, R.string.accessibility_clip);
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityStoryDto) {
                                                    h = tq.h(tlo0.Companion, R.string.accessibility_story);
                                                } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityAppDto) {
                                                    AppsAppDto appsAppDto3 = (AppsAppDto) map2.get(Integer.valueOf(((NotificationsEntityDto.NotificationsEntityAppDto) notificationsEntityDto3).d()));
                                                    if (appsAppDto3 != null) {
                                                        tlo0.a aVar10 = tlo0.Companion;
                                                        Object[] objArr = {appsAppDto3.getTitle()};
                                                        aVar10.getClass();
                                                        h = tlo0.a.c(R.string.accessibility_app, objArr);
                                                        i3 = 4;
                                                        notificationImage = new NotificationImage(Kb, ha70Var2, h, i3);
                                                    } else {
                                                        h = null;
                                                        i3 = 4;
                                                        notificationImage = new NotificationImage(Kb, ha70Var2, h, i3);
                                                    }
                                                } else {
                                                    if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityPollDto) {
                                                        h = tq.h(tlo0.Companion, R.string.accessibility_poll);
                                                    } else if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityMarketItemDto) {
                                                        h = tq.h(tlo0.Companion, R.string.accessibility_market_item);
                                                    } else {
                                                        if (notificationsEntityDto3 instanceof NotificationsEntityDto.NotificationsEntityPodcastDto) {
                                                            h = tq.h(tlo0.Companion, R.string.accessibility_podcast);
                                                        }
                                                        h = null;
                                                    }
                                                    i3 = 4;
                                                    notificationImage = new NotificationImage(Kb, ha70Var2, h, i3);
                                                }
                                                i3 = 4;
                                                notificationImage = new NotificationImage(Kb, ha70Var2, h, i3);
                                            }
                                        } else {
                                            notificationImage = null;
                                        }
                                        if (notificationImage != null) {
                                            arrayList5.add(notificationImage);
                                        }
                                        la70Var = this;
                                        map = map2;
                                        obj = r10;
                                        it6 = it;
                                        str7 = str9;
                                        map6 = map3;
                                    }
                                    str8 = str7;
                                    aVar4 = new a.c(arrayList5, shape);
                                }
                            } else {
                                str8 = str7;
                                if (e instanceof NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentStaticImageDto) {
                                    aVar4 = new a.c(Collections.singletonList(new NotificationImage(((NotificationsNotificationAttachmentDto.NotificationsNotificationAttachmentStaticImageDto) e).getUrl(), ha70Var, tq.h(tlo0.Companion, R.string.accessibility_photo), 4)), NotificationImage.Shape.SQUARE);
                                } else {
                                    if (!(e instanceof NotificationsNotificationAttachmentDto.NotificationsNotificationActualFriendAttachmentDto)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar4 = null;
                                }
                            }
                            aVar3 = aVar4;
                        } else {
                            str8 = str7;
                            aVar3 = null;
                        }
                        return new kb70.d(str, i, ha70Var, str6, w770Var, s8u0Var, s8u0Var2, arrayList, str8, aVar3, aVar, 2048);
                    }
                }
            }
        }
        str7 = null;
        e = notificationsNotificationRedesignDto.e();
        if (e == null) {
        }
        return new kb70.d(str, i, ha70Var, str6, w770Var, s8u0Var, s8u0Var2, arrayList, str8, aVar3, aVar, 2048);
    }

    public final s8u0 f(String str) {
        int i = 0;
        s8u0 s8u0Var = new s8u0(0);
        kjt.a aVar = new kjt.a(Regex.d(this.d, str));
        while (aVar.hasNext()) {
            zk10 zk10Var = (zk10) aVar.next();
            s8u0Var.e(str.substring(i, zk10Var.c().b));
            int i2 = s8u0Var.i(new klv0(VkTypographyToken.SubheadMedium, VkColorToken.TextPrimary));
            try {
                s8u0Var.e(zk10Var.b().get(1));
                s3q0 s3q0Var = s3q0.a;
                s8u0Var.f(i2);
                i = zk10Var.c().c + 1;
            } catch (Throwable th) {
                s8u0Var.f(i2);
                throw th;
            }
        }
        if (i < str.length()) {
            s8u0Var.e(str.substring(i));
        }
        return s8u0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final tlo0.g h(NotificationsOwnerDto notificationsOwnerDto) {
        String str;
        String i;
        NotificationsOwnerDto.TypeDto e = notificationsOwnerDto.e();
        NotificationsOwnerDto.TypeDto typeDto = NotificationsOwnerDto.TypeDto.GROUP;
        str = "";
        x970 x970Var = this.a;
        if (e == typeDto) {
            tlo0.a aVar = tlo0.Companion;
            GroupsGroupDto groupsGroupDto = (GroupsGroupDto) x970Var.b.get(notificationsOwnerDto.d());
            if (groupsGroupDto != null && (i = groupsGroupDto.i()) != null) {
                str = i;
            }
            aVar.getClass();
            return tlo0.a.c(R.string.accessibility_group, str);
        }
        UsersUserDto usersUserDto = (UsersUserDto) x970Var.a.get(notificationsOwnerDto.d());
        UserProfile a2 = usersUserDto != null ? i2r0.a(usersUserDto) : null;
        String str2 = a2 != null ? a2.e : null;
        tlo0.a aVar2 = tlo0.Companion;
        str = str2 != null ? str2 : "";
        aVar2.getClass();
        return tlo0.a.c(R.string.accessibility_user, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final String i(NotificationsOwnerDto notificationsOwnerDto) {
        int i = b.$EnumSwitchMapping$0[notificationsOwnerDto.e().ordinal()];
        String str = null;
        x970 x970Var = this.a;
        if (i == 1) {
            UsersUserDto usersUserDto = (UsersUserDto) x970Var.a.get(notificationsOwnerDto.d());
            if (usersUserDto != null) {
                str = c(usersUserDto);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            GroupsGroupDto groupsGroupDto = (GroupsGroupDto) x970Var.b.get(notificationsOwnerDto.d());
            if (groupsGroupDto != null) {
                String n = groupsGroupDto.n();
                if (n == null && (n = groupsGroupDto.j()) == null) {
                    String o = groupsGroupDto.o();
                    str = o == null ? "" : o;
                } else {
                    str = n;
                }
            }
        }
        return str == null ? "" : str;
    }
}
