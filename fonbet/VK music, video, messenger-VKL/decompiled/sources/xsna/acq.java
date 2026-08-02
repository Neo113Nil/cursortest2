package xsna;

import com.android.billingclient.api.BillingClient;
import com.google.gson.Gson;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseAPlusMarkDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonDto;
import com.vk.api.generated.base.dto.BaseOwnerCoverDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAllDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.stories.dto.StoriesUserFullProfileDto;
import com.vk.api.generated.users.dto.UsersDonutDto;
import com.vk.api.generated.users.dto.UsersEmojiStatusDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersMilitaryDto;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.api.generated.users.dto.UsersSchoolDto;
import com.vk.api.generated.users.dto.UsersUniversityDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileCareerDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileDto;
import com.vk.api.generated.users.dto.UsersUserRelationDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.InvisibleLastSeenStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: ExtendedProfilesRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class acq implements qrt<ExtendedUserProfile, UsersUserFullProfileDto> {
    public final /* synthetic */ com.vk.repository.data.api.a b;
    public final /* synthetic */ bcq c;
    public final /* synthetic */ UserId d;

    public acq(com.vk.repository.data.api.a aVar, bcq bcqVar, UserId userId) {
        this.b = aVar;
        this.c = bcqVar;
        this.d = userId;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0445 A[LOOP:15: B:214:0x043f->B:216:0x0445, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0471 A[LOOP:16: B:219:0x046b->B:221:0x0471, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0c8e  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0ce2  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0d07 A[LOOP:25: B:647:0x0d01->B:649:0x0d07, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0c78  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025f  */
    @Override // xsna.qrt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExtendedUserProfile b(UsersUserFullProfileDto usersUserFullProfileDto) {
        boolean z;
        BaseAPlusMarkDto d;
        BaseOwnerCoverDto w0;
        JSONObject n;
        List<BaseOwnerButtonDto> o;
        BaseCountryDto v0;
        List<UsersSchoolDto> g3;
        List<UsersUniversityDto> I3;
        List<UsersMilitaryDto> i2;
        List<UsersUserFullProfileCareerDto> Z;
        BaseCityDto a0;
        List<UsersSchoolDto> g32;
        List<UsersUniversityDto> I32;
        List<UsersUserFullProfileCareerDto> Z2;
        String J2;
        UsersOnlineInfoDto B2;
        String str;
        OnlineInfo onlineInfo;
        StatusImageStatusDto D1;
        ImageStatus a;
        String str2;
        BaseBoolIntDto k;
        String j;
        int i;
        String P0;
        String S0;
        String U0;
        String N0;
        String U1;
        String V1;
        String W1;
        String R1;
        String l2;
        String y1;
        String t3;
        String G3;
        String X1;
        String F0;
        Long l;
        String E1;
        List<UsersSchoolDto> g33;
        List<UsersUniversityDto> I33;
        List<UsersMilitaryDto> i22;
        String L1;
        String m2;
        String o2;
        String F3;
        String n2;
        String s1;
        BaseOwnerCoverDto w02;
        UsersDonutDto y0;
        Integer G;
        StoriesUserFullProfileDto z3;
        List<GroupsGroupFullDto> y2;
        PhotosPhotoAllDto L2;
        List<PhotosPhotoDto> d2;
        Iterator<T> it;
        String str3;
        String str4;
        String str5;
        long j2;
        List list;
        long j3;
        String str6;
        ArrayList arrayList;
        String d3;
        UsersUserFullProfileDto usersUserFullProfileDto2 = usersUserFullProfileDto;
        c9j c9jVar = new c9j(this.b.i);
        bcq bcqVar = this.c;
        d1r0 d1r0Var = new d1r0(c9jVar, bcqVar.g, bcqVar.f);
        UserId userId = this.d;
        ExtendedUserProfile extendedUserProfile = new ExtendedUserProfile();
        extendedUserProfile.a = new UserProfile();
        extendedUserProfile.r1 = new ArrayList<>();
        extendedUserProfile.k = usersUserFullProfileDto2.g();
        extendedUserProfile.l1 = new VKList();
        String h3 = usersUserFullProfileDto2.h3();
        if (h3 == null) {
            h3 = b4q.b(userId, "id");
        }
        extendedUserProfile.A0 = h3;
        if (usersUserFullProfileDto2.h3() != null) {
            if (!epx.f(extendedUserProfile.A0, "id" + userId)) {
                z = true;
                extendedUserProfile.B0 = z;
                BaseBoolIntDto X3 = usersUserFullProfileDto2.X3();
                extendedUserProfile.l = X3 == null && X3.i() == 1;
                BaseBoolIntDto l4 = usersUserFullProfileDto2.l4();
                extendedUserProfile.j1 = l4 == null && l4.i() == 1;
                BaseBoolIntDto M = usersUserFullProfileDto2.M();
                extendedUserProfile.k0 = M == null && M.i() == 1;
                BaseBoolIntDto b4 = usersUserFullProfileDto2.b4();
                extendedUserProfile.m0 = b4 == null && b4.i() == 1;
                BaseBoolIntDto x1 = usersUserFullProfileDto2.x1();
                extendedUserProfile.n0 = x1 == null && x1.i() == 1;
                extendedUserProfile.A1 = epx.f(usersUserFullProfileDto2.R3(), Boolean.TRUE);
                Boolean p = usersUserFullProfileDto2.p();
                extendedUserProfile.D1 = p == null ? p.booleanValue() : true;
                Boolean R = usersUserFullProfileDto2.R();
                extendedUserProfile.G1 = R == null ? R.booleanValue() : true;
                extendedUserProfile.a.q = extendedUserProfile.A0;
                d = usersUserFullProfileDto2.d();
                if (d != null && (d3 = d.d()) != null) {
                    ExtendedUserProfile.a aVar = new ExtendedUserProfile.a();
                    aVar.a = d3;
                    extendedUserProfile.S1 = aVar;
                }
                w0 = usersUserFullProfileDto2.w0();
                if (w0 != null) {
                    List<BaseImageDto> e = w0.e();
                    if (e != null) {
                        List<BaseImageDto> list2 = e;
                        arrayList = new ArrayList(c5g.u(list2, 10));
                        for (BaseImageDto baseImageDto : list2) {
                            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        extendedUserProfile.z = w0.d().i() != 0;
                        Photo photo = new Photo(new Image(arrayList));
                        extendedUserProfile.A = photo;
                        photo.e = userId;
                        Integer f = w0.f();
                        if (f != null) {
                            extendedUserProfile.A.c = f.intValue();
                        }
                    }
                }
                Object l0 = usersUserFullProfileDto2.l0();
                n = l0 == null ? d1r0.n(l0) : null;
                if (n != null) {
                    Iterator<String> keys = n.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        extendedUserProfile.Z0.put(next, Integer.valueOf(n.getInt(next)));
                    }
                    if (userId.b > 0) {
                        HashMap<String, Integer> hashMap = extendedUserProfile.Z0;
                        hashMap.put("_subscriptions", hashMap.get(BillingClient.FeatureType.SUBSCRIPTIONS));
                        extendedUserProfile.Z0.put(BillingClient.FeatureType.SUBSCRIPTIONS, Integer.valueOf(n.optInt(BillingClient.FeatureType.SUBSCRIPTIONS) + n.optInt("pages")));
                    }
                }
                if (usersUserFullProfileDto2.w3() == null) {
                    AudioAudioDto y3 = usersUserFullProfileDto2.y3();
                    if (y3 != null) {
                        MusicTrack musicTrack = new MusicTrack(d1r0.n(y3));
                        extendedUserProfile.f1 = musicTrack;
                        extendedUserProfile.k = d1r0Var.a.a(musicTrack);
                    } else {
                        String g = usersUserFullProfileDto2.g();
                        if (g == null) {
                            g = "";
                        }
                        extendedUserProfile.k = g;
                    }
                } else {
                    String g2 = usersUserFullProfileDto2.g();
                    if (g2 == null) {
                        g2 = "";
                    }
                    extendedUserProfile.k = g2;
                }
                o = usersUserFullProfileDto2.o();
                if (o != null) {
                    extendedUserProfile.x1 = new ExtendedUserProfile.f[o.size()];
                    int i3 = 0;
                    for (Object obj : o) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        extendedUserProfile.x1[i3] = ExtendedUserProfile.f.a(d1r0.n((BaseOwnerButtonDto) obj));
                        i3 = i4;
                    }
                }
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                HashSet hashSet = new HashSet();
                v0 = usersUserFullProfileDto2.v0();
                if (v0 != null) {
                    hashSet.add(Integer.valueOf(v0.getId()));
                }
                g3 = usersUserFullProfileDto2.g3();
                if (g3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it2 = g3.iterator();
                    while (it2.hasNext()) {
                        Integer f2 = ((UsersSchoolDto) it2.next()).f();
                        if (f2 != null) {
                            arrayList2.add(f2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(Integer.valueOf(((Number) it3.next()).intValue()));
                    }
                }
                I3 = usersUserFullProfileDto2.I3();
                if (I3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it4 = I3.iterator();
                    while (it4.hasNext()) {
                        Integer f3 = ((UsersUniversityDto) it4.next()).f();
                        if (f3 != null) {
                            arrayList3.add(f3);
                        }
                    }
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        hashSet.add(Integer.valueOf(((Number) it5.next()).intValue()));
                    }
                }
                i2 = usersUserFullProfileDto2.i2();
                if (i2 != null) {
                    List<UsersMilitaryDto> list3 = i2;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(Integer.valueOf(((UsersMilitaryDto) it6.next()).d()));
                    }
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        hashSet.add(Integer.valueOf(((Number) it7.next()).intValue()));
                    }
                }
                Z = usersUserFullProfileDto2.Z();
                if (Z != null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<T> it8 = Z.iterator();
                    while (it8.hasNext()) {
                        Integer f4 = ((UsersUserFullProfileCareerDto) it8.next()).f();
                        if (f4 != null) {
                            arrayList5.add(f4);
                        }
                    }
                    hashSet.addAll(arrayList5);
                }
                HashSet hashSet2 = new HashSet();
                a0 = usersUserFullProfileDto2.a0();
                if (a0 != null) {
                    hashSet2.add(Integer.valueOf(a0.getId()));
                }
                g32 = usersUserFullProfileDto2.g3();
                if (g32 != null) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<T> it9 = g32.iterator();
                    while (it9.hasNext()) {
                        Integer d4 = ((UsersSchoolDto) it9.next()).d();
                        if (d4 != null) {
                            arrayList6.add(d4);
                        }
                    }
                    Iterator it10 = arrayList6.iterator();
                    while (it10.hasNext()) {
                        hashSet2.add(Integer.valueOf(((Number) it10.next()).intValue()));
                    }
                }
                I32 = usersUserFullProfileDto2.I3();
                if (I32 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<T> it11 = I32.iterator();
                    while (it11.hasNext()) {
                        Integer e2 = ((UsersUniversityDto) it11.next()).e();
                        if (e2 != null) {
                            arrayList7.add(e2);
                        }
                    }
                    Iterator it12 = arrayList7.iterator();
                    while (it12.hasNext()) {
                        hashSet2.add(Integer.valueOf(((Number) it12.next()).intValue()));
                    }
                }
                Z2 = usersUserFullProfileDto2.Z();
                if (Z2 != null) {
                    ArrayList arrayList8 = new ArrayList();
                    Iterator<T> it13 = Z2.iterator();
                    while (it13.hasNext()) {
                        Integer d5 = ((UsersUserFullProfileCareerDto) it13.next()).d();
                        if (d5 != null) {
                            arrayList8.add(d5);
                        }
                    }
                    hashSet2.addAll(arrayList8);
                }
                for (vyj vyjVar : ((bcq) ((rf1) d1r0Var.b).c).a.J0(hashSet)) {
                    hashMap2.put(Integer.valueOf(vyjVar.a), vyjVar.b);
                }
                for (nec necVar : ((bcq) ((sj4) d1r0Var.c).c).a.l0(hashSet2)) {
                    hashMap3.put(Integer.valueOf(necVar.a), necVar.b);
                }
                Pair pair = new Pair(hashMap3, hashMap2);
                Map map = (Map) pair.d();
                Map map2 = (Map) pair.g();
                J2 = usersUserFullProfileDto2.J2();
                String a2 = js5.a(480, J2);
                extendedUserProfile.j = a2;
                extendedUserProfile.a.c = usersUserFullProfileDto2.B1();
                extendedUserProfile.a.d = usersUserFullProfileDto2.K0();
                extendedUserProfile.a.f = usersUserFullProfileDto2.N1();
                extendedUserProfile.a.e = extendedUserProfile.a.d + ' ' + extendedUserProfile.a.f;
                UserProfile userProfile = extendedUserProfile.a;
                FriendsFriendStatusStatusDto b1 = usersUserFullProfileDto2.b1();
                userProfile.j = b1 == null && b1.i() == 3;
                UserProfile userProfile2 = extendedUserProfile.a;
                Boolean W3 = usersUserFullProfileDto2.W3();
                Boolean bool = Boolean.TRUE;
                userProfile2.A = epx.f(W3, bool);
                extendedUserProfile.a.Y = epx.f(usersUserFullProfileDto2.c4(), bool);
                extendedUserProfile.a.Z = epx.f(usersUserFullProfileDto2.B(), bool);
                extendedUserProfile.a.X = epx.f(usersUserFullProfileDto2.s4(), bool);
                extendedUserProfile.a.a0 = epx.f(usersUserFullProfileDto2.a4(), bool);
                extendedUserProfile.a.b0 = usersUserFullProfileDto2.a4() == null;
                UserProfile userProfile3 = extendedUserProfile.a;
                SocialButtonType.a aVar2 = SocialButtonType.Companion;
                UsersUserFullProfileDto.SocialButtonTypeDto u3 = usersUserFullProfileDto2.u3();
                String i5 = u3 == null ? u3.i() : null;
                aVar2.getClass();
                userProfile3.e0 = SocialButtonType.a.a(i5);
                UserProfile userProfile4 = extendedUserProfile.a;
                FriendsFriendStatusStatusDto b12 = usersUserFullProfileDto2.b1();
                userProfile4.v = b12 == null ? b12.i() : extendedUserProfile.a1;
                UserProfile userProfile5 = extendedUserProfile.a;
                Serializer.c<Image> cVar = Image.CREATOR;
                userProfile5.O = Image.b.a(J2);
                UserProfile userProfile6 = extendedUserProfile.a;
                UserSex.a aVar3 = UserSex.Companion;
                BaseSexDto o3 = usersUserFullProfileDto2.o3();
                Integer valueOf = o3 == null ? Integer.valueOf(o3.i()) : null;
                aVar3.getClass();
                userProfile6.i = UserSex.a.a(valueOf);
                UserProfile userProfile7 = extendedUserProfile.a;
                B2 = usersUserFullProfileDto2.B2();
                if (B2 == null) {
                    boolean g4 = B2.g();
                    Integer e3 = B2.e();
                    if (e3 != null) {
                        str = a2;
                        j3 = e3.intValue();
                    } else {
                        str = a2;
                        j3 = 0;
                    }
                    long j4 = j3 * 1000;
                    boolean f5 = epx.f(B2.j(), bool);
                    Integer d6 = B2.d();
                    int intValue = d6 != null ? d6.intValue() : 0;
                    Platform platform = epx.f(B2.i(), bool) ? Platform.MOBILE : Platform.WEB;
                    InvisibleLastSeenStatus.a aVar4 = InvisibleLastSeenStatus.Companion;
                    UsersOnlineInfoDto.StatusDto f6 = B2.f();
                    if (f6 == null || (str6 = f6.i()) == null) {
                        str6 = "";
                    }
                    aVar4.getClass();
                    onlineInfo = g4 ? new VisibleStatus(j4, f5, intValue, platform) : new InvisibleStatus(InvisibleLastSeenStatus.a.b(str6));
                } else {
                    str = a2;
                    onlineInfo = VisibleStatus.f;
                }
                userProfile7.n = onlineInfo;
                UserProfile userProfile8 = extendedUserProfile.a;
                D1 = usersUserFullProfileDto2.D1();
                if (D1 == null) {
                    a = com.vk.dto.user.a.c(d1r0.n(D1));
                } else {
                    UsersEmojiStatusDto D0 = usersUserFullProfileDto2.D0();
                    a = D0 != null ? com.vk.dto.user.a.a(d1r0.n(D0)) : null;
                }
                userProfile8.R = a;
                str2 = extendedUserProfile.a.g;
                if ((str2 != null || str2.length() == 0) && J2 != null && J2.length() != 0) {
                    extendedUserProfile.a.g = J2;
                }
                extendedUserProfile.a.h = js5.a(iah0.f().density <= 1.0f ? 100 : 50, J2);
                VerifyInfo verifyInfo = extendedUserProfile.a.B;
                BaseBoolIntDto M3 = usersUserFullProfileDto2.M3();
                boolean z2 = M3 == null && M3.i() == 1;
                BaseBoolIntDto E3 = usersUserFullProfileDto2.E3();
                verifyInfo.Ab(new VerifyInfo(z2, E3 == null && E3.i() == 1, false, false, false, false, 60, null));
                BaseBoolIntDto W = usersUserFullProfileDto2.W();
                extendedUserProfile.e0 = W == null && W.i() == 1;
                BaseBoolIntDto D = usersUserFullProfileDto2.D();
                extendedUserProfile.g0 = D == null && D.i() == 1;
                BaseBoolIntDto F = usersUserFullProfileDto2.F();
                extendedUserProfile.f0 = F == null && F.i() == 1;
                Boolean C = usersUserFullProfileDto2.C();
                extendedUserProfile.y = C == null ? C.booleanValue() : true;
                UsersUserFullProfileDto.WallDefaultDto O3 = usersUserFullProfileDto2.O3();
                extendedUserProfile.j0 = "all".equals(O3 == null ? O3.i() : null);
                BaseBoolIntDto l3 = usersUserFullProfileDto2.l();
                extendedUserProfile.i0 = l3 == null && l3.i() == 1;
                extendedUserProfile.m = epx.f(usersUserFullProfileDto2.i4(), bool);
                extendedUserProfile.p0 = epx.f(usersUserFullProfileDto2.u(), bool);
                UsersUserRelationDto R2 = usersUserFullProfileDto2.R2();
                extendedUserProfile.u = R2 == null ? R2.i() : 0;
                FriendsFriendStatusStatusDto b13 = usersUserFullProfileDto2.b1();
                extendedUserProfile.a1 = b13 == null ? b13.i() : 0;
                extendedUserProfile.Q1 = epx.f(usersUserFullProfileDto2.a4(), bool);
                Boolean T = usersUserFullProfileDto2.T();
                extendedUserProfile.H1 = T == null ? T.booleanValue() : false;
                Boolean p4 = usersUserFullProfileDto2.p4();
                extendedUserProfile.I1 = p4 == null ? p4.booleanValue() : false;
                k = usersUserFullProfileDto2.k();
                if (k != null && k.i() == 1) {
                    extendedUserProfile.k1 = new ExtendedUserProfile.e();
                }
                j = usersUserFullProfileDto2.j();
                if (j == null) {
                    extendedUserProfile.a.p = j;
                    List a3 = n6j.a(0, "\\.", j);
                    if (!a3.isEmpty()) {
                        ListIterator listIterator = a3.listIterator(a3.size());
                        while (listIterator.hasPrevious()) {
                            if (((String) listIterator.previous()).length() != 0) {
                                list = j5g.H0(a3, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list = EmptyList.b;
                    i = 0;
                    extendedUserProfile.s = Integer.parseInt((String) list.get(0));
                    extendedUserProfile.t = Integer.parseInt((String) list.get(1));
                    if (list.size() > 2) {
                        extendedUserProfile.r = Integer.parseInt((String) list.get(2));
                    }
                } else {
                    i = 0;
                }
                P0 = usersUserFullProfileDto2.P0();
                if (P0 == null) {
                    P0 = extendedUserProfile.a.d;
                }
                extendedUserProfile.d = P0;
                S0 = usersUserFullProfileDto2.S0();
                if (S0 == null) {
                    S0 = extendedUserProfile.a.d;
                }
                extendedUserProfile.b = S0;
                U0 = usersUserFullProfileDto2.U0();
                if (U0 == null) {
                    U0 = extendedUserProfile.a.d;
                }
                extendedUserProfile.c = U0;
                N0 = usersUserFullProfileDto2.N0();
                if (N0 == null) {
                    N0 = extendedUserProfile.a.d;
                }
                extendedUserProfile.h = N0;
                U1 = usersUserFullProfileDto2.U1();
                if (U1 == null) {
                    U1 = extendedUserProfile.a.f;
                }
                extendedUserProfile.g = U1;
                V1 = usersUserFullProfileDto2.V1();
                if (V1 == null) {
                    V1 = extendedUserProfile.a.f;
                }
                extendedUserProfile.e = V1;
                W1 = usersUserFullProfileDto2.W1();
                if (W1 == null) {
                    W1 = extendedUserProfile.a.f;
                }
                extendedUserProfile.f = W1;
                R1 = usersUserFullProfileDto2.R1();
                if (R1 == null) {
                    R1 = extendedUserProfile.a.f;
                }
                extendedUserProfile.i = R1;
                extendedUserProfile.a.s.putString("first_name_dat", extendedUserProfile.d);
                extendedUserProfile.a.s.putString("first_name_gen", extendedUserProfile.b);
                extendedUserProfile.a.s.putString("first_name_ins", extendedUserProfile.c);
                extendedUserProfile.a.s.putString("first_name_acc", extendedUserProfile.h);
                extendedUserProfile.a.s.putString("last_name_dat", extendedUserProfile.g);
                extendedUserProfile.a.s.putString("last_name_gen", extendedUserProfile.e);
                extendedUserProfile.a.s.putString("last_name_ins", extendedUserProfile.f);
                extendedUserProfile.a.s.putString("last_name_acc", extendedUserProfile.i);
                if (usersUserFullProfileDto2.a0() != null && usersUserFullProfileDto2.v0() != null) {
                    BaseCityDto a02 = usersUserFullProfileDto2.a0();
                    extendedUserProfile.s0 = a02 == null ? a02.getTitle() : null;
                }
                l2 = usersUserFullProfileDto2.l2();
                if (l2 != null && l2.length() != 0) {
                    extendedUserProfile.u0 = usersUserFullProfileDto2.l2();
                }
                y1 = usersUserFullProfileDto2.y1();
                if (y1 != null && y1.length() != 0) {
                    extendedUserProfile.v0 = usersUserFullProfileDto2.y1();
                }
                t3 = usersUserFullProfileDto2.t3();
                if (t3 != null && t3.length() != 0) {
                    extendedUserProfile.w0 = usersUserFullProfileDto2.t3();
                }
                G3 = usersUserFullProfileDto2.G3();
                if (G3 != null && G3.length() != 0) {
                    extendedUserProfile.x0 = usersUserFullProfileDto2.G3();
                }
                X1 = usersUserFullProfileDto2.X1();
                if (X1 != null) {
                    X1.length();
                }
                F0 = usersUserFullProfileDto2.F0();
                if (F0 == null) {
                    byte[] bArr = x2r0.a;
                    try {
                        j2 = Long.parseLong(F0);
                    } catch (NumberFormatException unused) {
                        j2 = -1;
                    }
                    l = Long.valueOf(j2);
                } else {
                    l = null;
                }
                if (l != null && l.longValue() != -1) {
                    extendedUserProfile.z0 = l.longValue();
                    extendedUserProfile.y0 = usersUserFullProfileDto2.H0();
                }
                E1 = usersUserFullProfileDto2.E1();
                if (E1 != null && E1.length() != 0) {
                    extendedUserProfile.C0 = usersUserFullProfileDto2.E1();
                }
                extendedUserProfile.D0 = new ArrayList<>();
                g33 = usersUserFullProfileDto2.g3();
                if (g33 != null) {
                    for (UsersSchoolDto usersSchoolDto : g33) {
                        ExtendedUserProfile.k kVar = new ExtendedUserProfile.k();
                        String str7 = (String) map.get(usersSchoolDto.d());
                        if (str7 == null) {
                            str7 = "";
                        }
                        kVar.c = str7;
                        String g5 = usersSchoolDto.g();
                        if (g5 == null) {
                            g5 = "???";
                        }
                        kVar.a = g5;
                        Integer k2 = usersSchoolDto.k();
                        kVar.f = k2 != null ? k2.intValue() : i;
                        Integer n3 = usersSchoolDto.n();
                        kVar.e = n3 != null ? n3.intValue() : i;
                        Integer l5 = usersSchoolDto.l();
                        kVar.g = l5 != null ? l5.intValue() : i;
                        String e4 = usersSchoolDto.e();
                        if (e4 == null) {
                            e4 = "";
                        }
                        kVar.b = e4;
                        String i6 = usersSchoolDto.i();
                        if (i6 == null) {
                            i6 = "";
                        }
                        kVar.d = i6;
                        if (usersSchoolDto.j() == null) {
                            vx2.d.getContext().getString(R.string.profile_school);
                        }
                        extendedUserProfile.D0.add(kVar);
                    }
                }
                extendedUserProfile.E0 = new ArrayList<>();
                I33 = usersUserFullProfileDto2.I3();
                if (I33 != null) {
                    for (UsersUniversityDto usersUniversityDto : I33) {
                        ExtendedUserProfile.l lVar = new ExtendedUserProfile.l();
                        String j5 = usersUniversityDto.j();
                        if (j5 != null) {
                            int i7 = i;
                            int length = j5.length() - 1;
                            int i8 = i7;
                            while (i8 <= length) {
                                boolean z4 = epx.g(j5.charAt(i7 == 0 ? i8 : length), 32) <= 0;
                                if (i7 != 0) {
                                    if (!z4) {
                                        break;
                                    }
                                    length--;
                                } else if (z4) {
                                    i8++;
                                } else {
                                    i7 = 1;
                                }
                            }
                            str3 = j5.subSequence(i8, length + 1).toString();
                        } else {
                            str3 = null;
                        }
                        lVar.a = str3;
                        String g6 = usersUniversityDto.g();
                        if (g6 != null && g6.length() != 0) {
                            String g7 = usersUniversityDto.g();
                            if (g7 != null) {
                                int length2 = g7.length() - 1;
                                int i9 = 0;
                                boolean z5 = false;
                                while (i9 <= length2) {
                                    boolean z6 = epx.g(g7.charAt(!z5 ? i9 : length2), 32) <= 0;
                                    if (z5) {
                                        if (!z6) {
                                            break;
                                        }
                                        length2--;
                                    } else if (z6) {
                                        i9++;
                                    } else {
                                        z5 = true;
                                    }
                                }
                                str5 = g7.subSequence(i9, length2 + 1).toString();
                            } else {
                                str5 = null;
                            }
                            lVar.b = str5;
                        }
                        String d7 = usersUniversityDto.d();
                        if (d7 != null && d7.length() != 0) {
                            String d8 = usersUniversityDto.d();
                            if (d8 != null) {
                                int length3 = d8.length() - 1;
                                int i10 = 0;
                                boolean z7 = false;
                                while (i10 <= length3) {
                                    boolean z8 = epx.g(d8.charAt(!z7 ? i10 : length3), 32) <= 0;
                                    if (z7) {
                                        if (!z8) {
                                            break;
                                        }
                                        length3--;
                                    } else if (z8) {
                                        i10++;
                                    } else {
                                        z7 = true;
                                    }
                                }
                                str4 = d8.subSequence(i10, length3 + 1).toString();
                            } else {
                                str4 = null;
                            }
                            lVar.c = str4;
                        }
                        Integer i11 = usersUniversityDto.i();
                        lVar.d = i11 != null ? i11.intValue() : 0;
                        extendedUserProfile.E0.add(lVar);
                        i = 0;
                    }
                }
                extendedUserProfile.F0 = new ArrayList<>();
                i22 = usersUserFullProfileDto2.i2();
                if (i22 != null) {
                    for (UsersMilitaryDto usersMilitaryDto : i22) {
                        ExtendedUserProfile.i iVar = new ExtendedUserProfile.i();
                        iVar.a = (String) map2.get(Integer.valueOf(usersMilitaryDto.d()));
                        iVar.b = usersMilitaryDto.f();
                        Integer e5 = usersMilitaryDto.e();
                        iVar.d = e5 != null ? e5.intValue() : 0;
                        Integer g8 = usersMilitaryDto.g();
                        iVar.c = g8 != null ? g8.intValue() : 0;
                        extendedUserProfile.F0.add(iVar);
                    }
                }
                L1 = usersUserFullProfileDto2.L1();
                if (L1 != null && L1.length() != 0) {
                    extendedUserProfile.H0 = usersUserFullProfileDto2.L1();
                }
                m2 = usersUserFullProfileDto2.m2();
                if (m2 != null && m2.length() != 0) {
                    extendedUserProfile.J0 = usersUserFullProfileDto2.m2();
                }
                o2 = usersUserFullProfileDto2.o2();
                if (o2 != null && o2.length() != 0) {
                    extendedUserProfile.I0 = usersUserFullProfileDto2.o2();
                }
                F3 = usersUserFullProfileDto2.F3();
                if (F3 != null && F3.length() != 0) {
                    extendedUserProfile.K0 = usersUserFullProfileDto2.F3();
                }
                n2 = usersUserFullProfileDto2.n();
                if (n2 != null && n2.length() != 0) {
                    extendedUserProfile.L0 = usersUserFullProfileDto2.n();
                }
                s1 = usersUserFullProfileDto2.s1();
                if (s1 != null && s1.length() != 0) {
                    extendedUserProfile.M0 = usersUserFullProfileDto2.s1();
                }
                d1r0.b(usersUserFullProfileDto2, extendedUserProfile);
                d1r0.j(usersUserFullProfileDto2, extendedUserProfile);
                d1r0.i(usersUserFullProfileDto2, extendedUserProfile, str);
                d1r0.g(usersUserFullProfileDto2, extendedUserProfile);
                d1r0.h(usersUserFullProfileDto2, extendedUserProfile);
                w02 = usersUserFullProfileDto2.w0();
                if (w02 != null) {
                    extendedUserProfile.z = w02.d().i() != 0;
                }
                y0 = usersUserFullProfileDto2.y0();
                if (y0 != null) {
                    extendedUserProfile.T1 = new wvd0(y0.g(), y0.f(), y0.e(), y0.d());
                }
                d1r0.e(extendedUserProfile, usersUserFullProfileDto2, map);
                d1r0.a(usersUserFullProfileDto2, extendedUserProfile);
                d1r0.c(usersUserFullProfileDto2, extendedUserProfile);
                d1r0.k(usersUserFullProfileDto2, userId, extendedUserProfile);
                d1r0.f(usersUserFullProfileDto2, extendedUserProfile);
                d1r0.d(usersUserFullProfileDto2, extendedUserProfile);
                d1r0.m(usersUserFullProfileDto2, userId, extendedUserProfile);
                d1r0.l(usersUserFullProfileDto2, extendedUserProfile);
                extendedUserProfile.t1 = e43.a("friends", "followers", "city", "work", "education");
                Boolean K = usersUserFullProfileDto2.K();
                extendedUserProfile.b1 = K == null ? K.booleanValue() : false;
                Boolean Q3 = usersUserFullProfileDto2.Q3();
                extendedUserProfile.o0 = Q3 == null ? Q3.booleanValue() : false;
                extendedUserProfile.g1 = usersUserFullProfileDto2.w3();
                extendedUserProfile.n = usersUserFullProfileDto2.I2();
                extendedUserProfile.o = usersUserFullProfileDto2.i3();
                Integer p3 = usersUserFullProfileDto2.p3();
                extendedUserProfile.C1 = p3 == null ? p3.intValue() : 0;
                extendedUserProfile.B1 = epx.f(usersUserFullProfileDto2.f4(), Boolean.TRUE);
                G = usersUserFullProfileDto2.G();
                if (G != null) {
                    G.intValue();
                }
                z3 = usersUserFullProfileDto2.z3();
                if (z3 != null || (r2 = new GetStoriesResponse(d1r0.n(z3)).c) == null) {
                    ArrayList<StoriesContainer> arrayList9 = new ArrayList<>();
                }
                extendedUserProfile.v1 = arrayList9;
                extendedUserProfile.K = new ArrayList<>();
                y2 = usersUserFullProfileDto2.y2();
                if (y2 != null) {
                    for (GroupsGroupFullDto groupsGroupFullDto : y2) {
                        ArrayList<Group> arrayList10 = extendedUserProfile.K;
                        if (arrayList10 != null) {
                            arrayList10.add(new Group(d1r0.n(groupsGroupFullDto)));
                        }
                    }
                }
                Object Q2 = usersUserFullProfileDto2.Q2();
                extendedUserProfile.R1 = ExtendedUserProfile.j.a(Q2 == null ? d1r0.n(Q2) : null);
                L2 = usersUserFullProfileDto2.L2();
                if (L2 != null && (d2 = L2.d()) != null) {
                    it = d2.iterator();
                    while (it.hasNext()) {
                        extendedUserProfile.l1.add(new Photo(d1r0.n((PhotosPhotoDto) it.next())));
                    }
                }
                return extendedUserProfile;
            }
        }
        z = false;
        extendedUserProfile.B0 = z;
        BaseBoolIntDto X32 = usersUserFullProfileDto2.X3();
        extendedUserProfile.l = X32 == null && X32.i() == 1;
        BaseBoolIntDto l42 = usersUserFullProfileDto2.l4();
        extendedUserProfile.j1 = l42 == null && l42.i() == 1;
        BaseBoolIntDto M2 = usersUserFullProfileDto2.M();
        extendedUserProfile.k0 = M2 == null && M2.i() == 1;
        BaseBoolIntDto b42 = usersUserFullProfileDto2.b4();
        extendedUserProfile.m0 = b42 == null && b42.i() == 1;
        BaseBoolIntDto x12 = usersUserFullProfileDto2.x1();
        extendedUserProfile.n0 = x12 == null && x12.i() == 1;
        extendedUserProfile.A1 = epx.f(usersUserFullProfileDto2.R3(), Boolean.TRUE);
        Boolean p2 = usersUserFullProfileDto2.p();
        extendedUserProfile.D1 = p2 == null ? p2.booleanValue() : true;
        Boolean R3 = usersUserFullProfileDto2.R();
        extendedUserProfile.G1 = R3 == null ? R3.booleanValue() : true;
        extendedUserProfile.a.q = extendedUserProfile.A0;
        d = usersUserFullProfileDto2.d();
        if (d != null) {
            ExtendedUserProfile.a aVar5 = new ExtendedUserProfile.a();
            aVar5.a = d3;
            extendedUserProfile.S1 = aVar5;
        }
        w0 = usersUserFullProfileDto2.w0();
        if (w0 != null) {
        }
        Object l02 = usersUserFullProfileDto2.l0();
        if (l02 == null) {
        }
        if (n != null) {
        }
        if (usersUserFullProfileDto2.w3() == null) {
        }
        o = usersUserFullProfileDto2.o();
        if (o != null) {
        }
        HashMap hashMap22 = new HashMap();
        HashMap hashMap32 = new HashMap();
        HashSet hashSet3 = new HashSet();
        v0 = usersUserFullProfileDto2.v0();
        if (v0 != null) {
        }
        g3 = usersUserFullProfileDto2.g3();
        if (g3 != null) {
        }
        I3 = usersUserFullProfileDto2.I3();
        if (I3 != null) {
        }
        i2 = usersUserFullProfileDto2.i2();
        if (i2 != null) {
        }
        Z = usersUserFullProfileDto2.Z();
        if (Z != null) {
        }
        HashSet hashSet22 = new HashSet();
        a0 = usersUserFullProfileDto2.a0();
        if (a0 != null) {
        }
        g32 = usersUserFullProfileDto2.g3();
        if (g32 != null) {
        }
        I32 = usersUserFullProfileDto2.I3();
        if (I32 != null) {
        }
        Z2 = usersUserFullProfileDto2.Z();
        if (Z2 != null) {
        }
        while (r10.hasNext()) {
        }
        while (r2.hasNext()) {
        }
        Pair pair2 = new Pair(hashMap32, hashMap22);
        Map map3 = (Map) pair2.d();
        Map map22 = (Map) pair2.g();
        J2 = usersUserFullProfileDto2.J2();
        String a22 = js5.a(480, J2);
        extendedUserProfile.j = a22;
        extendedUserProfile.a.c = usersUserFullProfileDto2.B1();
        extendedUserProfile.a.d = usersUserFullProfileDto2.K0();
        extendedUserProfile.a.f = usersUserFullProfileDto2.N1();
        extendedUserProfile.a.e = extendedUserProfile.a.d + ' ' + extendedUserProfile.a.f;
        UserProfile userProfile9 = extendedUserProfile.a;
        FriendsFriendStatusStatusDto b14 = usersUserFullProfileDto2.b1();
        userProfile9.j = b14 == null && b14.i() == 3;
        UserProfile userProfile22 = extendedUserProfile.a;
        Boolean W32 = usersUserFullProfileDto2.W3();
        Boolean bool2 = Boolean.TRUE;
        userProfile22.A = epx.f(W32, bool2);
        extendedUserProfile.a.Y = epx.f(usersUserFullProfileDto2.c4(), bool2);
        extendedUserProfile.a.Z = epx.f(usersUserFullProfileDto2.B(), bool2);
        extendedUserProfile.a.X = epx.f(usersUserFullProfileDto2.s4(), bool2);
        extendedUserProfile.a.a0 = epx.f(usersUserFullProfileDto2.a4(), bool2);
        extendedUserProfile.a.b0 = usersUserFullProfileDto2.a4() == null;
        UserProfile userProfile32 = extendedUserProfile.a;
        SocialButtonType.a aVar22 = SocialButtonType.Companion;
        UsersUserFullProfileDto.SocialButtonTypeDto u32 = usersUserFullProfileDto2.u3();
        if (u32 == null) {
        }
        aVar22.getClass();
        userProfile32.e0 = SocialButtonType.a.a(i5);
        UserProfile userProfile42 = extendedUserProfile.a;
        FriendsFriendStatusStatusDto b122 = usersUserFullProfileDto2.b1();
        userProfile42.v = b122 == null ? b122.i() : extendedUserProfile.a1;
        UserProfile userProfile52 = extendedUserProfile.a;
        Serializer.c<Image> cVar2 = Image.CREATOR;
        userProfile52.O = Image.b.a(J2);
        UserProfile userProfile62 = extendedUserProfile.a;
        UserSex.a aVar32 = UserSex.Companion;
        BaseSexDto o32 = usersUserFullProfileDto2.o3();
        if (o32 == null) {
        }
        aVar32.getClass();
        userProfile62.i = UserSex.a.a(valueOf);
        UserProfile userProfile72 = extendedUserProfile.a;
        B2 = usersUserFullProfileDto2.B2();
        if (B2 == null) {
        }
        userProfile72.n = onlineInfo;
        UserProfile userProfile82 = extendedUserProfile.a;
        D1 = usersUserFullProfileDto2.D1();
        if (D1 == null) {
        }
        userProfile82.R = a;
        str2 = extendedUserProfile.a.g;
        if (str2 != null) {
        }
        extendedUserProfile.a.g = J2;
        extendedUserProfile.a.h = js5.a(iah0.f().density <= 1.0f ? 100 : 50, J2);
        VerifyInfo verifyInfo2 = extendedUserProfile.a.B;
        BaseBoolIntDto M32 = usersUserFullProfileDto2.M3();
        if (M32 == null) {
        }
        BaseBoolIntDto E32 = usersUserFullProfileDto2.E3();
        verifyInfo2.Ab(new VerifyInfo(z2, E32 == null && E32.i() == 1, false, false, false, false, 60, null));
        BaseBoolIntDto W2 = usersUserFullProfileDto2.W();
        extendedUserProfile.e0 = W2 == null && W2.i() == 1;
        BaseBoolIntDto D2 = usersUserFullProfileDto2.D();
        extendedUserProfile.g0 = D2 == null && D2.i() == 1;
        BaseBoolIntDto F2 = usersUserFullProfileDto2.F();
        extendedUserProfile.f0 = F2 == null && F2.i() == 1;
        Boolean C2 = usersUserFullProfileDto2.C();
        extendedUserProfile.y = C2 == null ? C2.booleanValue() : true;
        UsersUserFullProfileDto.WallDefaultDto O32 = usersUserFullProfileDto2.O3();
        extendedUserProfile.j0 = "all".equals(O32 == null ? O32.i() : null);
        BaseBoolIntDto l32 = usersUserFullProfileDto2.l();
        extendedUserProfile.i0 = l32 == null && l32.i() == 1;
        extendedUserProfile.m = epx.f(usersUserFullProfileDto2.i4(), bool2);
        extendedUserProfile.p0 = epx.f(usersUserFullProfileDto2.u(), bool2);
        UsersUserRelationDto R22 = usersUserFullProfileDto2.R2();
        extendedUserProfile.u = R22 == null ? R22.i() : 0;
        FriendsFriendStatusStatusDto b132 = usersUserFullProfileDto2.b1();
        extendedUserProfile.a1 = b132 == null ? b132.i() : 0;
        extendedUserProfile.Q1 = epx.f(usersUserFullProfileDto2.a4(), bool2);
        Boolean T2 = usersUserFullProfileDto2.T();
        extendedUserProfile.H1 = T2 == null ? T2.booleanValue() : false;
        Boolean p42 = usersUserFullProfileDto2.p4();
        extendedUserProfile.I1 = p42 == null ? p42.booleanValue() : false;
        k = usersUserFullProfileDto2.k();
        if (k != null) {
            extendedUserProfile.k1 = new ExtendedUserProfile.e();
        }
        j = usersUserFullProfileDto2.j();
        if (j == null) {
        }
        P0 = usersUserFullProfileDto2.P0();
        if (P0 == null) {
        }
        extendedUserProfile.d = P0;
        S0 = usersUserFullProfileDto2.S0();
        if (S0 == null) {
        }
        extendedUserProfile.b = S0;
        U0 = usersUserFullProfileDto2.U0();
        if (U0 == null) {
        }
        extendedUserProfile.c = U0;
        N0 = usersUserFullProfileDto2.N0();
        if (N0 == null) {
        }
        extendedUserProfile.h = N0;
        U1 = usersUserFullProfileDto2.U1();
        if (U1 == null) {
        }
        extendedUserProfile.g = U1;
        V1 = usersUserFullProfileDto2.V1();
        if (V1 == null) {
        }
        extendedUserProfile.e = V1;
        W1 = usersUserFullProfileDto2.W1();
        if (W1 == null) {
        }
        extendedUserProfile.f = W1;
        R1 = usersUserFullProfileDto2.R1();
        if (R1 == null) {
        }
        extendedUserProfile.i = R1;
        extendedUserProfile.a.s.putString("first_name_dat", extendedUserProfile.d);
        extendedUserProfile.a.s.putString("first_name_gen", extendedUserProfile.b);
        extendedUserProfile.a.s.putString("first_name_ins", extendedUserProfile.c);
        extendedUserProfile.a.s.putString("first_name_acc", extendedUserProfile.h);
        extendedUserProfile.a.s.putString("last_name_dat", extendedUserProfile.g);
        extendedUserProfile.a.s.putString("last_name_gen", extendedUserProfile.e);
        extendedUserProfile.a.s.putString("last_name_ins", extendedUserProfile.f);
        extendedUserProfile.a.s.putString("last_name_acc", extendedUserProfile.i);
        if (usersUserFullProfileDto2.a0() != null) {
            BaseCityDto a022 = usersUserFullProfileDto2.a0();
            extendedUserProfile.s0 = a022 == null ? a022.getTitle() : null;
        }
        l2 = usersUserFullProfileDto2.l2();
        if (l2 != null) {
            extendedUserProfile.u0 = usersUserFullProfileDto2.l2();
        }
        y1 = usersUserFullProfileDto2.y1();
        if (y1 != null) {
            extendedUserProfile.v0 = usersUserFullProfileDto2.y1();
        }
        t3 = usersUserFullProfileDto2.t3();
        if (t3 != null) {
            extendedUserProfile.w0 = usersUserFullProfileDto2.t3();
        }
        G3 = usersUserFullProfileDto2.G3();
        if (G3 != null) {
            extendedUserProfile.x0 = usersUserFullProfileDto2.G3();
        }
        X1 = usersUserFullProfileDto2.X1();
        if (X1 != null) {
        }
        F0 = usersUserFullProfileDto2.F0();
        if (F0 == null) {
        }
        if (l != null) {
            extendedUserProfile.z0 = l.longValue();
            extendedUserProfile.y0 = usersUserFullProfileDto2.H0();
        }
        E1 = usersUserFullProfileDto2.E1();
        if (E1 != null) {
            extendedUserProfile.C0 = usersUserFullProfileDto2.E1();
        }
        extendedUserProfile.D0 = new ArrayList<>();
        g33 = usersUserFullProfileDto2.g3();
        if (g33 != null) {
        }
        extendedUserProfile.E0 = new ArrayList<>();
        I33 = usersUserFullProfileDto2.I3();
        if (I33 != null) {
        }
        extendedUserProfile.F0 = new ArrayList<>();
        i22 = usersUserFullProfileDto2.i2();
        if (i22 != null) {
        }
        L1 = usersUserFullProfileDto2.L1();
        if (L1 != null) {
            extendedUserProfile.H0 = usersUserFullProfileDto2.L1();
        }
        m2 = usersUserFullProfileDto2.m2();
        if (m2 != null) {
            extendedUserProfile.J0 = usersUserFullProfileDto2.m2();
        }
        o2 = usersUserFullProfileDto2.o2();
        if (o2 != null) {
            extendedUserProfile.I0 = usersUserFullProfileDto2.o2();
        }
        F3 = usersUserFullProfileDto2.F3();
        if (F3 != null) {
            extendedUserProfile.K0 = usersUserFullProfileDto2.F3();
        }
        n2 = usersUserFullProfileDto2.n();
        if (n2 != null) {
            extendedUserProfile.L0 = usersUserFullProfileDto2.n();
        }
        s1 = usersUserFullProfileDto2.s1();
        if (s1 != null) {
            extendedUserProfile.M0 = usersUserFullProfileDto2.s1();
        }
        d1r0.b(usersUserFullProfileDto2, extendedUserProfile);
        d1r0.j(usersUserFullProfileDto2, extendedUserProfile);
        d1r0.i(usersUserFullProfileDto2, extendedUserProfile, str);
        d1r0.g(usersUserFullProfileDto2, extendedUserProfile);
        d1r0.h(usersUserFullProfileDto2, extendedUserProfile);
        w02 = usersUserFullProfileDto2.w0();
        if (w02 != null) {
        }
        y0 = usersUserFullProfileDto2.y0();
        if (y0 != null) {
        }
        d1r0.e(extendedUserProfile, usersUserFullProfileDto2, map3);
        d1r0.a(usersUserFullProfileDto2, extendedUserProfile);
        d1r0.c(usersUserFullProfileDto2, extendedUserProfile);
        d1r0.k(usersUserFullProfileDto2, userId, extendedUserProfile);
        d1r0.f(usersUserFullProfileDto2, extendedUserProfile);
        d1r0.d(usersUserFullProfileDto2, extendedUserProfile);
        d1r0.m(usersUserFullProfileDto2, userId, extendedUserProfile);
        d1r0.l(usersUserFullProfileDto2, extendedUserProfile);
        extendedUserProfile.t1 = e43.a("friends", "followers", "city", "work", "education");
        Boolean K2 = usersUserFullProfileDto2.K();
        extendedUserProfile.b1 = K2 == null ? K2.booleanValue() : false;
        Boolean Q32 = usersUserFullProfileDto2.Q3();
        extendedUserProfile.o0 = Q32 == null ? Q32.booleanValue() : false;
        extendedUserProfile.g1 = usersUserFullProfileDto2.w3();
        extendedUserProfile.n = usersUserFullProfileDto2.I2();
        extendedUserProfile.o = usersUserFullProfileDto2.i3();
        Integer p32 = usersUserFullProfileDto2.p3();
        extendedUserProfile.C1 = p32 == null ? p32.intValue() : 0;
        extendedUserProfile.B1 = epx.f(usersUserFullProfileDto2.f4(), Boolean.TRUE);
        G = usersUserFullProfileDto2.G();
        if (G != null) {
        }
        z3 = usersUserFullProfileDto2.z3();
        if (z3 != null) {
        }
        ArrayList<StoriesContainer> arrayList92 = new ArrayList<>();
        extendedUserProfile.v1 = arrayList92;
        extendedUserProfile.K = new ArrayList<>();
        y2 = usersUserFullProfileDto2.y2();
        if (y2 != null) {
        }
        Object Q22 = usersUserFullProfileDto2.Q2();
        extendedUserProfile.R1 = ExtendedUserProfile.j.a(Q22 == null ? d1r0.n(Q22) : null);
        L2 = usersUserFullProfileDto2.L2();
        if (L2 != null) {
            it = d2.iterator();
            while (it.hasNext()) {
            }
        }
        return extendedUserProfile;
    }

    @Override // xsna.qrt
    public final rsg0<UsersUserFullProfileDto> d() {
        String str;
        boolean z;
        u1r0 u1r0Var = this.c.i;
        UserId c = !fkq0.c(this.d) ? vx2.d.c() : this.d;
        Gson gson = d1r0.d;
        List l = e43.l(UsersFieldsDto.VIDEO_LIVE, UsersFieldsDto.SCREEN_NAME, UsersFieldsDto.CONTACTS, UsersFieldsDto.COUNTERS, UsersFieldsDto.RELATIVES, UsersFieldsDto.SEX, UsersFieldsDto.BDATE, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.CAN_POST, UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.CAN_CALL, UsersFieldsDto.ACTIVITY, UsersFieldsDto.ONLINE, UsersFieldsDto.ONLINE_INFO, UsersFieldsDto.UNIVERSITIES, UsersFieldsDto.SCHOOLS, UsersFieldsDto.CAN_SEE_ALL_POSTS, UsersFieldsDto.LAST_SEEN, UsersFieldsDto.RELATION, UsersFieldsDto.CONNECTIONS, UsersFieldsDto.INTERESTS, UsersFieldsDto.MOVIES, UsersFieldsDto.TV, UsersFieldsDto.BOOKS, UsersFieldsDto.GAMES, UsersFieldsDto.ABOUT, UsersFieldsDto.CITY, UsersFieldsDto.COUNTRY, UsersFieldsDto.QUOTES, UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.LAST_NAME_DAT, UsersFieldsDto.FIRST_NAME_GEN, UsersFieldsDto.LAST_NAME_GEN, UsersFieldsDto.FIRST_NAME_INS, UsersFieldsDto.LAST_NAME_INS, UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.LAST_NAME_ACC, UsersFieldsDto.ACTIVITIES, UsersFieldsDto.VERIFIED, UsersFieldsDto.IS_VERIFIED, UsersFieldsDto.WALL_DEFAULT, UsersFieldsDto.PERSONAL, UsersFieldsDto.HOME_TOWN, UsersFieldsDto.BLACKLISTED_BY_ME, UsersFieldsDto.SITE, UsersFieldsDto.MUSIC, UsersFieldsDto.IS_FAVORITE, UsersFieldsDto.CAN_SEND_FRIEND_REQUEST, UsersFieldsDto.IS_SUBSCRIBED, UsersFieldsDto.CAREER, UsersFieldsDto.BLACKLISTED, UsersFieldsDto.IS_HIDDEN_FROM_FEED, UsersFieldsDto.HAS_PHOTO, UsersFieldsDto.TRENDING, UsersFieldsDto.BUTTONS, UsersFieldsDto.OWNER_STATE, UsersFieldsDto.CAN_INVITE_TO_CHATS, UsersFieldsDto.EMOJI_STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.CAN_SEE_WISHES, UsersFieldsDto.IS_DEAD, UsersFieldsDto.GIFTS_TOOLTIP, UsersFieldsDto.MILITARY, UsersFieldsDto.CAN_SUBSCRIBE_STORIES, UsersFieldsDto.IS_SUBSCRIBED_STORIES, UsersFieldsDto.OCCUPATION, UsersFieldsDto.THIRD_PARTY_BUTTONS, UsersFieldsDto.CAN_ASK_ANONYMOUS, UsersFieldsDto.IS_BEST_FRIEND, UsersFieldsDto.STATUS, UsersFieldsDto.PHOTO_AVG_COLOR, UsersFieldsDto.COVER, UsersFieldsDto.SERVICE_DESCRIPTION, UsersFieldsDto.IS_NFT, UsersFieldsDto.CAN_BAN, UsersFieldsDto.FRIEND_STATUS, UsersFieldsDto.IS_FOLLOWERS_MODE_ON, UsersFieldsDto.SOCIAL_BUTTON_TYPE, UsersFieldsDto.A_PLUS_MARK, UsersFieldsDto.DONUT, this.b.g ? UsersFieldsDto.PROFILE_BUTTONS_TABLET : UsersFieldsDto.PROFILE_BUTTONS);
        String str2 = this.b.k;
        ArrayList arrayList = null;
        List singletonList = str2 != null ? Collections.singletonList(str2) : null;
        boolean a = o25.a().a(this.d);
        com.vk.repository.data.api.a aVar = this.b;
        String str3 = aVar.m;
        boolean z2 = aVar.c;
        u1r0Var.getClass();
        tfx tfxVar = new tfx("users.getFullProfile", new koi0(7), new thl0(5));
        if (c != null) {
            tfx.n(tfxVar, "user_id", c, 1L, 0L, 8);
        }
        if (l != null) {
            List list = l;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        }
        if (arrayList != null) {
            tfxVar.i("user_fields", arrayList);
        }
        if (singletonList != null) {
            tfxVar.i("access_keys", singletonList);
        }
        tfxVar.j("current_user", a);
        if (str3 != null) {
            z = z2;
            tfx.o(tfxVar, "source", str3, 0, 0, 12);
            str = str3;
        } else {
            str = str3;
            z = z2;
        }
        tfx.l(tfxVar, "need_friends_block", z ? 1 : 0, 0, 0, 12);
        tfxVar.j("need_recommendations_block", false);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return yfb.x(tfxVar);
    }
}
