package xsna;

import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeCameraParamsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengePinnedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeRulesItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeStyleDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeStyleHeaderStyleDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoChallengeTermsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ChallengeColor;
import com.vk.dto.shortvideo.ChallengeHeader;
import com.vk.dto.shortvideo.ChallengeRule;
import com.vk.dto.shortvideo.ChallengeStyle;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ChallengeResponseToClipsChallengeMapper.kt */
/* loaded from: classes3.dex */
public final class qra {
    public final j2r0 a = new j2r0();
    public final k2r0 b = new k2r0();
    public final dqu c = new dqu();
    public final equ d = new equ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0253  */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ClipsChallenge a(ShortVideoGetChallengeResponseDto shortVideoGetChallengeResponseDto) {
        Map map;
        Map map2;
        Map map3;
        UserProfile userProfile;
        List<GroupsGroupFullDto> n;
        Group group;
        ShortVideoChallengeCameraParamsDto g;
        ClipCameraParams clipCameraParams;
        List<BaseImageDto> j;
        ArrayList arrayList;
        List<ShortVideoChallengePinnedItemDto> k;
        ?? r13;
        List<ShortVideoChallengePinnedItemDto> k2;
        ?? r6;
        List<ShortVideoChallengeRulesItemDto> l;
        ?? r62;
        ShortVideoChallengeStyleDto n2;
        ArrayList arrayList2;
        ChallengeStyle challengeStyle;
        List<String> d;
        String e;
        Object obj;
        Object obj2;
        ShortVideoChallengeDto i = shortVideoGetChallengeResponseDto.i();
        if (i == null) {
            return null;
        }
        UserId e2 = i.e();
        List<UsersUserFullDto> C = shortVideoGetChallengeResponseDto.C();
        Map map4 = jgp.b;
        if (C != null) {
            this.a.getClass();
            map = j2r0.b(C);
        } else {
            map = map4;
        }
        List<GroupsGroupFullDto> n3 = shortVideoGetChallengeResponseDto.n();
        if (n3 != null) {
            List<GroupsGroupFullDto> list = n3;
            ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
            for (GroupsGroupFullDto groupsGroupFullDto : list) {
                this.c.getClass();
                arrayList3.add(dqu.a(groupsGroupFullDto));
            }
            int e3 = on00.e(c5g.u(arrayList3, 10));
            if (e3 < 16) {
                e3 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(((Group) next).c, next);
            }
            map2 = linkedHashMap;
        } else {
            map2 = map4;
        }
        List<UsersUserFullDto> C2 = shortVideoGetChallengeResponseDto.C();
        if (C2 != null) {
            List<UsersUserFullDto> list2 = C2;
            ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(this.b.a((UsersUserFullDto) it2.next()));
            }
            int e4 = on00.e(c5g.u(arrayList4, 10));
            if (e4 < 16) {
                e4 = 16;
            }
            map3 = new LinkedHashMap(e4);
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                map3.put(((Owner) next2).b, next2);
            }
        } else {
            map3 = map4;
        }
        List<GroupsGroupFullDto> n4 = shortVideoGetChallengeResponseDto.n();
        if (n4 != null) {
            List<GroupsGroupFullDto> list3 = n4;
            ArrayList arrayList5 = new ArrayList(c5g.u(list3, 10));
            for (GroupsGroupFullDto groupsGroupFullDto2 : list3) {
                this.d.getClass();
                arrayList5.add(equ.a(groupsGroupFullDto2));
            }
            ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                Owner owner = (Owner) it4.next();
                if (!fkq0.b(owner.b)) {
                    owner = Owner.e(owner, fkq0.e(owner.b), 4194302);
                }
                arrayList6.add(owner);
            }
            int e5 = on00.e(c5g.u(arrayList6, 10));
            map4 = new LinkedHashMap(e5 >= 16 ? e5 : 16);
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                Object next3 = it5.next();
                map4.put(((Owner) next3).b, next3);
            }
        }
        LinkedHashMap n5 = pn00.n(map3, map4);
        List<UsersUserFullDto> C3 = shortVideoGetChallengeResponseDto.C();
        if (C3 != null) {
            Iterator it6 = C3.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (epx.f(((UsersUserFullDto) obj2).s1(), e2)) {
                    break;
                }
            }
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj2;
            if (usersUserFullDto != null) {
                new j2r0();
                userProfile = j2r0.a(usersUserFullDto);
                n = shortVideoGetChallengeResponseDto.n();
                if (n != null) {
                    Iterator it7 = n.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it7.next();
                        if (fkq0.e(fkq0.a(((GroupsGroupFullDto) obj).P0())).equals(e2)) {
                            break;
                        }
                    }
                    GroupsGroupFullDto groupsGroupFullDto3 = (GroupsGroupFullDto) obj;
                    if (groupsGroupFullDto3 != null) {
                        new dqu();
                        group = dqu.a(groupsGroupFullDto3);
                        String description = i.getDescription();
                        String i2 = i.i();
                        g = i.g();
                        if (g == null) {
                            clipCameraParams = null;
                        } else {
                            String g2 = g.g();
                            Mask a = ii10.a(g.f(), map, map2);
                            AudioAudioDto d2 = g.d();
                            MusicTrack d3 = d2 != null ? oc4.d(d2) : null;
                            Integer e6 = g.e();
                            clipCameraParams = new ClipCameraParams(g2, a, d3, e6 != null ? e6.intValue() : 0);
                        }
                        j = i.j();
                        if (j != null) {
                            List<BaseImageDto> list4 = j;
                            arrayList = new ArrayList(c5g.u(list4, 10));
                            for (BaseImageDto baseImageDto : list4) {
                                arrayList.add(new NotificationImage.ImageInfo(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl()));
                            }
                        } else {
                            arrayList = null;
                        }
                        NotificationImage notificationImage = new NotificationImage(arrayList);
                        k = i.k();
                        if (k != null) {
                            r13 = new ArrayList();
                            Iterator it8 = k.iterator();
                            while (it8.hasNext()) {
                                VideoVideoFullDto e7 = ((ShortVideoChallengePinnedItemDto) it8.next()).e();
                                VideoFileOld d4 = e7 != null ? ums0.d(ums0.a, e7, n5, map, map2, 16) : null;
                                ClipVideoFile clipVideoFile = d4 instanceof ClipVideoFile ? (ClipVideoFile) d4 : null;
                                if (clipVideoFile != null) {
                                    r13.add(clipVideoFile);
                                }
                            }
                        } else {
                            r13 = EmptyList.b;
                        }
                        List list5 = r13;
                        k2 = i.k();
                        if (k2 != null) {
                            r6 = new ArrayList();
                            Iterator it9 = k2.iterator();
                            while (it9.hasNext()) {
                                String d5 = ((ShortVideoChallengePinnedItemDto) it9.next()).d();
                                if (d5 != null) {
                                    r6.add(d5);
                                }
                            }
                        } else {
                            r6 = EmptyList.b;
                        }
                        List list6 = r6;
                        ShortVideoChallengeTermsDto o = i.o();
                        String title = o != null ? o.getTitle() : null;
                        ShortVideoChallengeTermsDto o2 = i.o();
                        String url = o2 != null ? o2.getUrl() : null;
                        l = i.l();
                        if (l != null) {
                            List<ShortVideoChallengeRulesItemDto> list7 = l;
                            r62 = new ArrayList(c5g.u(list7, 10));
                            for (ShortVideoChallengeRulesItemDto shortVideoChallengeRulesItemDto : list7) {
                                new ne6();
                                Image a2 = ne6.a(shortVideoChallengeRulesItemDto.d());
                                String e8 = shortVideoChallengeRulesItemDto.e();
                                if (e8 == null) {
                                    e8 = "";
                                }
                                r62.add(new ChallengeRule(a2, e8));
                            }
                        } else {
                            r62 = EmptyList.b;
                        }
                        List list8 = r62;
                        n2 = i.n();
                        if (n2 == null) {
                            challengeStyle = null;
                        } else {
                            Boolean i3 = n2.i();
                            Boolean bool = Boolean.TRUE;
                            boolean f = epx.f(i3, bool);
                            boolean f2 = epx.f(n2.g(), bool);
                            boolean f3 = epx.f(n2.f(), bool);
                            boolean f4 = epx.f(n2.e(), bool);
                            ShortVideoChallengeStyleHeaderStyleDto d6 = n2.d();
                            Integer a3 = (d6 == null || (e = d6.e()) == null) ? null : ufj0.a(e);
                            ShortVideoChallengeStyleHeaderStyleDto d7 = n2.d();
                            if (d7 == null || (d = d7.d()) == null) {
                                arrayList2 = null;
                            } else {
                                arrayList2 = new ArrayList();
                                Iterator it10 = d.iterator();
                                while (it10.hasNext()) {
                                    Integer a4 = ufj0.a((String) it10.next());
                                    if (a4 != null) {
                                        arrayList2.add(a4);
                                    }
                                }
                            }
                            Integer valueOf = arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null;
                            challengeStyle = new ChallengeStyle(f, f2, f3, f4, new ChallengeHeader(a3, (valueOf == null || valueOf.intValue() == 0) ? null : valueOf.intValue() == 1 ? new ChallengeColor.Solid(((Number) arrayList2.get(0)).intValue()) : new ChallengeColor.Gradient(j5g.N0(arrayList2))));
                        }
                        ActionLinksActionDto d8 = i.d();
                        return new ClipsChallenge(description, i2, clipCameraParams, notificationImage, list5, list6, userProfile, group, title, url, list8, challengeStyle, d8 != null ? s20.a(d8) : null);
                    }
                }
                group = null;
                String description2 = i.getDescription();
                String i22 = i.i();
                g = i.g();
                if (g == null) {
                }
                j = i.j();
                if (j != null) {
                }
                NotificationImage notificationImage2 = new NotificationImage(arrayList);
                k = i.k();
                if (k != null) {
                }
                List list52 = r13;
                k2 = i.k();
                if (k2 != null) {
                }
                List list62 = r6;
                ShortVideoChallengeTermsDto o3 = i.o();
                if (o3 != null) {
                }
                ShortVideoChallengeTermsDto o22 = i.o();
                if (o22 != null) {
                }
                l = i.l();
                if (l != null) {
                }
                List list82 = r62;
                n2 = i.n();
                if (n2 == null) {
                }
                ActionLinksActionDto d82 = i.d();
                return new ClipsChallenge(description2, i22, clipCameraParams, notificationImage2, list52, list62, userProfile, group, title, url, list82, challengeStyle, d82 != null ? s20.a(d82) : null);
            }
        }
        userProfile = null;
        n = shortVideoGetChallengeResponseDto.n();
        if (n != null) {
        }
        group = null;
        String description22 = i.getDescription();
        String i222 = i.i();
        g = i.g();
        if (g == null) {
        }
        j = i.j();
        if (j != null) {
        }
        NotificationImage notificationImage22 = new NotificationImage(arrayList);
        k = i.k();
        if (k != null) {
        }
        List list522 = r13;
        k2 = i.k();
        if (k2 != null) {
        }
        List list622 = r6;
        ShortVideoChallengeTermsDto o32 = i.o();
        if (o32 != null) {
        }
        ShortVideoChallengeTermsDto o222 = i.o();
        if (o222 != null) {
        }
        l = i.l();
        if (l != null) {
        }
        List list822 = r62;
        n2 = i.n();
        if (n2 == null) {
        }
        ActionLinksActionDto d822 = i.d();
        return new ClipsChallenge(description22, i222, clipCameraParams, notificationImage22, list522, list622, userProfile, group, title, url, list822, challengeStyle, d822 != null ? s20.a(d822) : null);
    }
}
