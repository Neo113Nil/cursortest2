package xsna;

import com.google.gson.Gson;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.owner.dto.OwnerStateDto;
import com.vk.api.generated.owner.dto.OwnerStatePhotosDto;
import com.vk.api.generated.users.dto.UsersGetContentTabsResponseDto;
import com.vk.api.generated.users.dto.UsersGiftsTooltipDto;
import com.vk.api.generated.users.dto.UsersOccupationDto;
import com.vk.api.generated.users.dto.UsersPersonalDto;
import com.vk.api.generated.users.dto.UsersProfileButtonDto;
import com.vk.api.generated.users.dto.UsersRelativeDto;
import com.vk.api.generated.users.dto.UsersScrollableContentTabDto;
import com.vk.api.generated.users.dto.UsersTabSettingsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileCareerDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileFollowersBlockDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileFriendsBlockDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileMutualFriendDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileRequestsBlockDto;
import com.vk.api.generated.users.dto.UsersUserMinDto;
import com.vk.api.generated.video.dto.VideoLiveInfoDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.TrackableOwner;
import com.vk.dto.newsfeed.entries.FriendsBlock;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.profile.FollowersBlock;
import com.vk.dto.profile.MutualFriendsBlock;
import com.vk.dto.profile.Occupation;
import com.vk.dto.profile.RequestsBlock;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.internal.api.GsonHolder;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.api.ProfileContentTab;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.rrt;
import xsna.ytd0;

/* compiled from: UsersGetFullProfileParser.kt */
/* loaded from: classes15.dex */
public final class d1r0 {
    public static final Gson d = GsonHolder.a();
    public final c9j a;
    public final rrt.b b;
    public final rrt.a c;

    public d1r0(c9j c9jVar, rf1 rf1Var, sj4 sj4Var) {
        this.a = c9jVar;
        this.b = rf1Var;
        this.c = sj4Var;
    }

    public static void a(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        List<List<UsersProfileButtonDto>> M2 = usersUserFullProfileDto.M2();
        List<List<UsersProfileButtonDto>> N2 = usersUserFullProfileDto.N2();
        if (M2 == null) {
            M2 = N2;
        }
        if (M2 != null) {
            extendedUserProfile.M1 = new ArrayList();
            Iterator<T> it = M2.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ytd0.a.a(new JSONObject(new Gson().toJson((UsersProfileButtonDto) it2.next()))));
                }
                ArrayList arrayList2 = extendedUserProfile.M1;
                if (arrayList2 != null) {
                    arrayList2.add(new xtd0(arrayList));
                }
            }
        }
        List<UsersProfileButtonDto> D3 = usersUserFullProfileDto.D3();
        if (D3 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = D3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(ytd0.a.a(new JSONObject(new Gson().toJson((UsersProfileButtonDto) it3.next()))));
            }
            extendedUserProfile.N1 = new xtd0(arrayList3);
        }
    }

    public static void b(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        String e = usersUserFullProfileDto.e();
        if (e != null && e.length() != 0) {
            extendedUserProfile.O0 = usersUserFullProfileDto.e();
        }
        String O2 = usersUserFullProfileDto.O2();
        if (O2 != null && O2.length() != 0) {
            extendedUserProfile.N0 = usersUserFullProfileDto.O2();
        }
        String f = usersUserFullProfileDto.f();
        if (f != null && f.length() != 0) {
            extendedUserProfile.G0 = usersUserFullProfileDto.f();
        }
        String z1 = usersUserFullProfileDto.z1();
        if (z1 != null && z1.length() != 0) {
            extendedUserProfile.q0 = usersUserFullProfileDto.z1();
        }
        String r3 = usersUserFullProfileDto.r3();
        if (r3 == null || r3.length() == 0) {
            return;
        }
        extendedUserProfile.V = usersUserFullProfileDto.r3();
    }

    public static void c(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        ComFeatures comFeatures = ComFeatures.COM_EASY_PROMOTE;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            String i = usersUserFullProfileDto.i();
            Pair<String, String> pair = null;
            if (i != null) {
                List c0 = drm0.c0(i, new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : c0) {
                    if (!drm0.N((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != 2) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    pair = new Pair<>(drm0.p0((String) arrayList.get(0)).toString(), drm0.p0((String) arrayList.get(1)).toString());
                }
            }
            extendedUserProfile.U1 = pair;
        }
    }

    public static void d(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        ArrayList arrayList;
        List<UsersUserFullDto> d2;
        UsersUserFullProfileRequestsBlockDto f3 = usersUserFullProfileDto.f3();
        if (f3 != null) {
            JSONObject n = n(f3);
            Serializer.c<RequestsBlock> cVar = RequestsBlock.CREATOR;
            extendedUserProfile.Q = RequestsBlock.a.a(n);
        }
        UsersUserFullProfileFriendsBlockDto n1 = usersUserFullProfileDto.n1();
        if (n1 != null && (d2 = n1.d()) != null) {
            List<UsersUserFullDto> list = d2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            for (UsersUserFullDto usersUserFullDto : list) {
                Serializer.c<TrackableOwner> cVar2 = TrackableOwner.CREATOR;
                arrayList2.add(TrackableOwner.a.a(n(usersUserFullDto)));
            }
            ArrayList q = p4g.q(arrayList2);
            int size = d2.size();
            Integer e = n1.e();
            extendedUserProfile.O = new FriendsBlock(q, size, e != null ? e.intValue() : 0);
        }
        UsersUserFullProfileFollowersBlockDto V0 = usersUserFullProfileDto.V0();
        if (V0 != null) {
            List<UsersUserFullDto> e2 = V0.e();
            if (e2 != null) {
                List<UsersUserFullDto> list2 = e2;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                for (UsersUserFullDto usersUserFullDto2 : list2) {
                    Serializer.c<TrackableOwner> cVar3 = TrackableOwner.CREATOR;
                    arrayList3.add(TrackableOwner.a.a(n(usersUserFullDto2)));
                }
                arrayList = p4g.q(arrayList3);
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Integer d3 = V0.d();
                int intValue = d3 != null ? d3.intValue() : 0;
                Integer d4 = V0.d();
                extendedUserProfile.P = new FollowersBlock(arrayList, intValue, 0, d4 != null ? d4.intValue() : 0);
            }
        }
    }

    public static void e(ExtendedUserProfile extendedUserProfile, UsersUserFullProfileDto usersUserFullProfileDto, Map map) {
        List<UsersUserFullProfileCareerDto> Z = usersUserFullProfileDto.Z();
        if (Z == null) {
            return;
        }
        extendedUserProfile.J = new ArrayList<>();
        for (UsersUserFullProfileCareerDto usersUserFullProfileCareerDto : Z) {
            ExtendedUserProfile.g gVar = new ExtendedUserProfile.g();
            GroupsGroupFullDto i = usersUserFullProfileCareerDto.i();
            if (i != null) {
                gVar.a = new Group(n(i));
            } else {
                gVar.c = usersUserFullProfileCareerDto.e();
            }
            Integer g = usersUserFullProfileCareerDto.g();
            gVar.e = g != null ? g.intValue() : 0;
            Integer k = usersUserFullProfileCareerDto.k();
            gVar.f = k != null ? k.intValue() : 0;
            gVar.d = usersUserFullProfileCareerDto.j();
            Integer d2 = usersUserFullProfileCareerDto.d();
            if (d2 != null) {
                String str = (String) map.get(Integer.valueOf(d2.intValue()));
                if (str == null) {
                    str = "";
                }
                gVar.b = str;
            }
            extendedUserProfile.J.add(gVar);
        }
    }

    public static void f(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        LinkedHashMap linkedHashMap;
        List<UsersUserFullDto> d2;
        extendedUserProfile.I = new ArrayList<>();
        List<UsersUserFullDto> d1 = usersUserFullProfileDto.d1();
        if (d1 != null) {
            Iterator<T> it = d1.iterator();
            while (it.hasNext()) {
                extendedUserProfile.I.add(new UserProfile(n((UsersUserFullDto) it.next())));
            }
        }
        ArrayList arrayList = new ArrayList();
        UsersUserFullProfileMutualFriendDto q2 = usersUserFullProfileDto.q2();
        if (q2 != null && (d2 = q2.d()) != null) {
            for (UsersUserFullDto usersUserFullDto : d2) {
                Serializer.c<TrackableOwner> cVar = TrackableOwner.CREATOR;
                arrayList.add(TrackableOwner.a.a(n(usersUserFullDto)));
            }
        }
        int i = 0;
        extendedUserProfile.N = new MutualFriendsBlock(arrayList, 0, 0);
        List<UsersUserFullDto> W2 = usersUserFullProfileDto.W2();
        if (W2 != null) {
            List<UsersRelativeDto> V2 = usersUserFullProfileDto.V2();
            if (V2 != null) {
                List<UsersRelativeDto> list = V2;
                int e = on00.e(c5g.u(list, 10));
                if (e < 16) {
                    e = 16;
                }
                linkedHashMap = new LinkedHashMap(e);
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    UserProfile userProfile = new UserProfile(n((UsersRelativeDto) it2.next()));
                    Pair pair = new Pair(userProfile.c, userProfile);
                    linkedHashMap.put(pair.i(), pair.j());
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : W2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    jSONArray.put(i, n(obj));
                    i = i2;
                }
                wyd0.d(jSONArray, extendedUserProfile, linkedHashMap);
            }
        }
        UsersUserMinDto T2 = usersUserFullProfileDto.T2();
        if (T2 != null) {
            extendedUserProfile.v = (int) T2.e().b;
            StringBuilder sb = new StringBuilder();
            String f = T2.f();
            if (f == null) {
                f = "";
            }
            sb.append(f);
            sb.append(' ');
            String d3 = T2.d();
            sb.append(d3 != null ? d3 : "");
            extendedUserProfile.w = sb.toString();
        }
    }

    public static void g(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        UsersGiftsTooltipDto t1 = usersUserFullProfileDto.t1();
        if (t1 != null) {
            ExtendedUserProfile.h hVar = new ExtendedUserProfile.h();
            hVar.a = t1.getType();
            hVar.b = t1.getTitle();
            hVar.c = t1.e();
            hVar.d = t1.d();
            extendedUserProfile.c1 = hVar;
        }
    }

    public static void h(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        long j;
        long j2;
        UsersOccupationDto r2 = usersUserFullProfileDto.r2();
        if (r2 != null) {
            UsersOccupationDto.TypeDto g = r2.g();
            String i = g != null ? g.i() : null;
            Integer e = r2.e();
            if (e != null) {
                j = e.intValue();
                j2 = 0;
            } else {
                j = 0;
                j2 = 0;
            }
            String f = r2.f();
            Integer d2 = r2.d();
            if (d2 != null) {
                j2 = d2.intValue();
            }
            extendedUserProfile.L = new Occupation(i, j, f, Long.valueOf(j2));
        }
    }

    public static void i(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile, String str) {
        String e;
        OwnerStateDto E2 = usersUserFullProfileDto.E2();
        if (E2 != null) {
            OwnerStateDto.StateDto e2 = E2.e();
            Integer valueOf = e2 != null ? Integer.valueOf(e2.i()) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                String description = E2.getDescription();
                if (description == null) {
                    description = "";
                }
                OwnerStatePhotosDto d2 = E2.d();
                if (d2 == null || (e = d2.g()) == null) {
                    OwnerStatePhotosDto d3 = E2.d();
                    e = d3 != null ? d3.e() : null;
                    if (e == null) {
                        OwnerStatePhotosDto d4 = E2.d();
                        e = d4 != null ? d4.d() : null;
                        if (e == null) {
                            OwnerStatePhotosDto d5 = E2.d();
                            String f = d5 != null ? d5.f() : null;
                            if (f != null) {
                                str = f;
                            }
                            extendedUserProfile.q = new DeactivationWithMessage.a(new u590(intValue, description, str)).a();
                        }
                    }
                }
                str = e;
                extendedUserProfile.q = new DeactivationWithMessage.a(new u590(intValue, description, str)).a();
            }
        }
    }

    public static void j(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        UsersPersonalDto G2 = usersUserFullProfileDto.G2();
        if (G2 != null) {
            List<String> f = G2.f();
            extendedUserProfile.P0 = f != null ? j5g.g0(f, ", ", null, null, 0, new rxc0(1), 30) : null;
            Integer j = G2.j();
            extendedUserProfile.S0 = j != null ? j.intValue() : 0;
            extendedUserProfile.Q0 = G2.k();
            Integer g = G2.g();
            extendedUserProfile.T0 = g != null ? g.intValue() : 0;
            Integer i = G2.i();
            extendedUserProfile.U0 = i != null ? i.intValue() : 0;
            extendedUserProfile.R0 = G2.e();
            Integer l = G2.l();
            extendedUserProfile.V0 = l != null ? l.intValue() : 0;
            Integer d2 = G2.d();
            extendedUserProfile.W0 = d2 != null ? d2.intValue() : 0;
        }
    }

    public static void k(UsersUserFullProfileDto usersUserFullProfileDto, UserId userId, ExtendedUserProfile extendedUserProfile) {
        ArrayList arrayList;
        ProfilesRecommendations.InfoCard infoCard;
        Object o1 = usersUserFullProfileDto.o1();
        if (o1 == null) {
            return;
        }
        JSONObject n = n(o1);
        String optString = n.optString("title");
        String optString2 = n.optString("nextFrom");
        JSONArray optJSONArray = n.optJSONArray("profiles");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList2.add(kci.d("inline_user_rec", optJSONArray.getJSONObject(i)));
            }
            arrayList = p4g.q(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList3 = arrayList;
        JSONObject optJSONObject = n.optJSONObject("info_card");
        if (optJSONObject != null) {
            Serializer.c<ProfilesRecommendations.InfoCard> cVar = ProfilesRecommendations.InfoCard.CREATOR;
            infoCard = ProfilesRecommendations.InfoCard.a.a(optJSONObject);
        } else {
            infoCard = null;
        }
        ProfilesRecommendations.InfoCard infoCard2 = infoCard;
        extendedUserProfile.M = new ProfilesRecommendations("inline_user_rec", optString, optString2, arrayList3, (int) userId.b, infoCard2, null, n.optString("reason"), new NewsEntry.TrackData(n.optString("track_code"), 0, 0L, false, false, null, null, 0, 254, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(UsersUserFullProfileDto usersUserFullProfileDto, ExtendedUserProfile extendedUserProfile) {
        UsersGetContentTabsResponseDto usersGetContentTabsResponseDto;
        ?? r2;
        ProfileContentTab profileContentTab;
        ExtendedUserProfile.m mVar;
        String i;
        Object B3 = usersUserFullProfileDto.B3();
        if (B3 != null) {
            Gson gson = d;
            try {
                usersGetContentTabsResponseDto = (UsersGetContentTabsResponseDto) gson.fromJson(gson.toJson(B3), UsersGetContentTabsResponseDto.class);
            } catch (Exception unused) {
            }
            if (usersGetContentTabsResponseDto == null) {
                List<UsersTabSettingsDto> d2 = usersGetContentTabsResponseDto.d();
                if (d2 != null) {
                    r2 = new ArrayList();
                    for (UsersTabSettingsDto usersTabSettingsDto : d2) {
                        UsersScrollableContentTabDto i2 = usersTabSettingsDto.i();
                        if (i2 == null || (i = i2.i()) == null) {
                            mVar = null;
                        } else {
                            Boolean Q = usersTabSettingsDto.Q();
                            boolean booleanValue = Q != null ? Q.booleanValue() : false;
                            Boolean e = usersTabSettingsDto.e();
                            boolean booleanValue2 = e != null ? e.booleanValue() : false;
                            Boolean k = usersTabSettingsDto.k();
                            mVar = new ExtendedUserProfile.m(i, booleanValue, booleanValue2, k != null ? k.booleanValue() : false, usersTabSettingsDto.g(), usersTabSettingsDto.d(), usersTabSettingsDto.f(), usersTabSettingsDto.j());
                        }
                        if (mVar != null) {
                            r2.add(mVar);
                        }
                    }
                } else {
                    r2 = EmptyList.b;
                }
                extendedUserProfile.P1 = r2;
                Iterable<ExtendedUserProfile.m> iterable = (Iterable) r2;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                for (ExtendedUserProfile.m mVar2 : iterable) {
                    ProfileContentTab.a aVar = ProfileContentTab.Companion;
                    String str = mVar2.a;
                    aVar.getClass();
                    ProfileContentTab[] values = ProfileContentTab.values();
                    int length = values.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            profileContentTab = null;
                            break;
                        }
                        profileContentTab = values[i3];
                        if (epx.f(profileContentTab.h(), str)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    arrayList.add(profileContentTab);
                }
                extendedUserProfile.O1 = arrayList;
                return;
            }
            return;
        }
        usersGetContentTabsResponseDto = null;
        if (usersGetContentTabsResponseDto == null) {
        }
    }

    public static void m(UsersUserFullProfileDto usersUserFullProfileDto, UserId userId, ExtendedUserProfile extendedUserProfile) {
        int i;
        VideoLiveInfoDto N3 = usersUserFullProfileDto.N3();
        if (N3 != null) {
            if (userId.b < 0) {
                extendedUserProfile.h1 = N3.d().i() != 0;
            } else {
                extendedUserProfile.h1 = N3.d().i() != 0 && ((i = extendedUserProfile.a1) == 3 || i == 1);
            }
            BaseBoolIntDto e = N3.e();
            extendedUserProfile.i1 = (e != null ? e.i() : 0) == 0;
        }
    }

    public static JSONObject n(Object obj) {
        return new JSONObject(d.toJson(obj));
    }
}
