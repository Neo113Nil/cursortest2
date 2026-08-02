package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipsGridSources.kt */
@ozl
/* loaded from: classes14.dex */
public final class mee extends rsg0<nee> {
    public final UserId s;

    public mee(UserId userId, PaginationKey paginationKey, int i, boolean z, boolean z2) {
        super("execute.getSourcesForClips");
        this.s = userId;
        F(userId, "profile_id");
        C(i, "count");
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        if (next != null) {
            K("start_from", next.b);
        }
        C(0, "with_lives");
        C(z ? 1 : 0, "with_liked_clips");
        C(z2 ? 1 : 0, "with_scheduled");
        C(14, "func_v");
        if (o25.a().b()) {
            return;
        }
        this.d = true;
        this.c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0246  */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v21, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v31, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v29, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.util.ArrayList] */
    @Override // xsna.oer0, xsna.k7r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? r6;
        ?? r7;
        String str;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j;
        EmptyList emptyList;
        long j2;
        ArrayList arrayList5;
        LinkedHashMap linkedHashMap;
        String str2;
        Object obj;
        String str3;
        Object obj2;
        Object obj3;
        ?? r4;
        ?? r1;
        Map map;
        Map map2;
        Map map3;
        ClipsAuthor clipsAuthor;
        Map<String, Long> map4;
        long j3;
        int i;
        DeactivationWithMessage deactivationWithMessage;
        Long z;
        int i2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray optJSONArray = jSONObject2.optJSONArray("items_profiles");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("items_groups");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                arrayList.add((UserProfile) UserProfile.g0.a(optJSONArray.getJSONObject(i3)));
            }
        } else {
            arrayList = null;
        }
        if (optJSONArray2 != null) {
            arrayList2 = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            for (int i4 = 0; i4 < length2; i4++) {
                JSONObject jSONObject3 = optJSONArray2.getJSONObject(i4);
                Group.z0.getClass();
                Group group = new Group(jSONObject3);
                group.c = fkq0.e(group.c);
                arrayList2.add(group);
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            r6 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                r6.add(tsj.a((Group) it.next()));
            }
        } else {
            r6 = 0;
        }
        if (r6 == 0) {
            r6 = EmptyList.b;
        }
        Collection collection = (Collection) r6;
        if (arrayList != null) {
            r7 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r7.add(((UserProfile) it2.next()).l0());
            }
        } else {
            r7 = 0;
        }
        if (r7 == 0) {
            r7 = EmptyList.b;
        }
        ArrayList u0 = j5g.u0((Iterable) r7, collection);
        int e = on00.e(c5g.u(u0, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
        Iterator it3 = u0.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            linkedHashMap2.put(((Owner) next).b, next);
        }
        f7d b = g7d.b(jSONObject2, linkedHashMap2, 4);
        ArrayList arrayList6 = b.a;
        String str4 = b.b;
        long j4 = b.d;
        long j5 = b.e;
        f7d b2 = g7d.b(jSONObject2.optJSONObject("scheduled_clips"), null, 6);
        ArrayList arrayList7 = b2.a;
        String str5 = b2.b;
        JSONObject optJSONObject = jSONObject2.optJSONObject("owner_profile");
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("owner_groups");
        Serializer.c<ClipsAuthor> cVar = ClipsAuthor.CREATOR;
        boolean optBoolean = optJSONObject.optBoolean("is_closed", false);
        Serializer.c<Owner> cVar2 = Owner.CREATOR;
        ClipGridParams.Data.Profile profile = new ClipGridParams.Data.Profile(new ClipsAuthor(Owner.a.f(optJSONObject), ClipsAuthor.a.a(optJSONObject), optBoolean ? 1 : 0, cqm0.a(optJSONObject.optString("screen_name")), optJSONObject.optInt("friend_status"), -1, 0, optJSONObject.optString("about"), null, 256, null));
        if (optJSONArray3 != null) {
            str = str4;
            ?? arrayList8 = new ArrayList(optJSONArray3.length());
            int length3 = optJSONArray3.length();
            arrayList3 = arrayList7;
            int i5 = 0;
            while (i5 < length3) {
                int i6 = length3;
                JSONObject jSONObject4 = optJSONArray3.getJSONObject(i5);
                Group.z0.getClass();
                JSONArray jSONArray = optJSONArray3;
                Group group2 = new Group(jSONObject4);
                int i7 = i5;
                group2.c = fkq0.e(group2.c);
                Serializer.c<ClipsAuthor> cVar3 = ClipsAuthor.CREATOR;
                String optString = jSONObject4.optString("type");
                ArrayList arrayList9 = arrayList6;
                if (optString != null) {
                    int hashCode = optString.hashCode();
                    j3 = j4;
                    if (hashCode != 3433103) {
                        if (hashCode != 96891546) {
                            if (hashCode == 98629247) {
                                optString.equals("group");
                            }
                        } else if (optString.equals(NotificationCompat.CATEGORY_EVENT)) {
                            i2 = 1;
                            i = i2;
                        }
                    } else if (optString.equals("page")) {
                        i2 = 2;
                        i = i2;
                    }
                    Serializer.c<Owner> cVar4 = Owner.CREATOR;
                    Owner d = Owner.a.d(jSONObject4);
                    HashMap a = ClipsAuthor.a.a(jSONObject4);
                    int optInt = jSONObject4.optInt("is_closed");
                    String a2 = cqm0.a(jSONObject4.optString("screen_name"));
                    int optInt2 = jSONObject4.optInt("member_status");
                    int optInt3 = jSONObject4.optInt("admin_level");
                    String optString2 = jSONObject4.optString("description");
                    if (jSONObject4.has("deactivated")) {
                        deactivationWithMessage = null;
                    } else {
                        String optString3 = jSONObject4.optString("description");
                        String optString4 = jSONObject4.optString("deactivated");
                        String optString5 = jSONObject4.optString("deactivated_message", optString3);
                        String optString6 = jSONObject4.optString("deactivated_type");
                        DeactivationWithMessage.a aVar = new DeactivationWithMessage.a();
                        aVar.b(optString4);
                        aVar.b = optString5;
                        Deactivation.Type.Companion.getClass();
                        aVar.e = epx.f(optString6, "geo_blocked") ? Deactivation.Type.GEO_BLOCKED : epx.f(optString6, "banned") ? Deactivation.Type.BANNED : null;
                        deactivationWithMessage = aVar.a();
                    }
                    ClipsAuthor clipsAuthor2 = new ClipsAuthor(d, a, optInt, a2, optInt2, i, optInt3, optString2, deactivationWithMessage);
                    clipsAuthor2.n(Long.valueOf(jSONObject4.optLong("members_count")));
                    z = f370.z(jSONObject4, "clips_count");
                    if (z == null) {
                        clipsAuthor2.c.put("clips", Long.valueOf(z.longValue()));
                    }
                    arrayList8.add(new ClipGridParams.Data.Profile(clipsAuthor2));
                    i5 = i7 + 1;
                    length3 = i6;
                    optJSONArray3 = jSONArray;
                    arrayList6 = arrayList9;
                    j4 = j3;
                } else {
                    j3 = j4;
                }
                i = 0;
                Serializer.c<Owner> cVar42 = Owner.CREATOR;
                Owner d2 = Owner.a.d(jSONObject4);
                HashMap a3 = ClipsAuthor.a.a(jSONObject4);
                int optInt4 = jSONObject4.optInt("is_closed");
                String a22 = cqm0.a(jSONObject4.optString("screen_name"));
                int optInt22 = jSONObject4.optInt("member_status");
                int optInt32 = jSONObject4.optInt("admin_level");
                String optString22 = jSONObject4.optString("description");
                if (jSONObject4.has("deactivated")) {
                }
                ClipsAuthor clipsAuthor22 = new ClipsAuthor(d2, a3, optInt4, a22, optInt22, i, optInt32, optString22, deactivationWithMessage);
                clipsAuthor22.n(Long.valueOf(jSONObject4.optLong("members_count")));
                z = f370.z(jSONObject4, "clips_count");
                if (z == null) {
                }
                arrayList8.add(new ClipGridParams.Data.Profile(clipsAuthor22));
                i5 = i7 + 1;
                length3 = i6;
                optJSONArray3 = jSONArray;
                arrayList6 = arrayList9;
                j4 = j3;
            }
            arrayList4 = arrayList6;
            j = j4;
            emptyList = arrayList8;
        } else {
            str = str4;
            arrayList3 = arrayList7;
            arrayList4 = arrayList6;
            j = j4;
            emptyList = EmptyList.b;
        }
        ArrayList v0 = j5g.v0(profile, emptyList);
        int e2 = on00.e(c5g.u(v0, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e2);
        Iterator it4 = v0.iterator();
        while (true) {
            j2 = 0;
            if (!it4.hasNext()) {
                break;
            }
            ClipsAuthor clipsAuthor3 = ((ClipGridParams.Data.Profile) it4.next()).b;
            UserId userId = clipsAuthor3.b.b;
            Long l = clipsAuthor3.c.get("clips");
            if (l != null) {
                j2 = l.longValue();
            }
            linkedHashMap3.put(userId, Long.valueOf(j2));
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("ended_lives");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (optJSONObject2 != null) {
            j2 = optJSONObject2.optLong("count", 0L);
            JSONArray jSONArray2 = optJSONObject2.getJSONArray("items");
            ?? arrayList10 = new ArrayList(jSONArray2.length());
            int length4 = jSONArray2.length();
            int i8 = 0;
            while (i8 < length4) {
                arrayList10.add(new VideoFileOld(jSONArray2.getJSONObject(i8)));
                i8++;
                v0 = v0;
                linkedHashMap3 = linkedHashMap3;
            }
            arrayList5 = v0;
            linkedHashMap = linkedHashMap3;
            ref$ObjectRef.element = arrayList10;
            str2 = optJSONObject2.optString("next_from");
            if (str2 == null) {
                str2 = "";
            }
            s3q0 s3q0Var = s3q0.a;
        } else {
            arrayList5 = v0;
            linkedHashMap = linkedHashMap3;
            str2 = null;
        }
        Iterator it5 = arrayList5.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj = null;
                break;
            }
            obj = it5.next();
            if (epx.f(((ClipGridParams.Data.Profile) obj).b.b.b, this.s)) {
                break;
            }
        }
        ClipGridParams.Data.Profile profile2 = (ClipGridParams.Data.Profile) obj;
        if (profile2 != null && (clipsAuthor = profile2.b) != null && (map4 = clipsAuthor.c) != null) {
            map4.put("clips_views", Long.valueOf(j));
            map4.put("clips_likes", Long.valueOf(j5));
            map4.put("lives", Long.valueOf(j2));
            s3q0 s3q0Var2 = s3q0.a;
        }
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("liked_clips");
        if (optJSONObject3 != null) {
            JSONArray optJSONArray4 = optJSONObject3.optJSONArray("groups");
            if (optJSONArray4 != null) {
                ArrayList arrayList11 = new ArrayList(optJSONArray4.length());
                int length5 = optJSONArray4.length();
                int i9 = 0;
                while (i9 < length5) {
                    JSONObject jSONObject5 = optJSONArray4.getJSONObject(i9);
                    Group.z0.getClass();
                    String str6 = str2;
                    Group group3 = new Group(jSONObject5);
                    group3.c = fkq0.e(group3.c);
                    arrayList11.add(group3);
                    i9++;
                    str2 = str6;
                }
                str3 = str2;
                int e3 = on00.e(c5g.u(arrayList11, 10));
                if (e3 < 16) {
                    e3 = 16;
                }
                map = new LinkedHashMap(e3);
                Iterator it6 = arrayList11.iterator();
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    map.put(((Group) next2).c, next2);
                }
            } else {
                str3 = str2;
                map = null;
            }
            Map map5 = jgp.b;
            Map map6 = map == null ? map5 : map;
            JSONArray optJSONArray5 = optJSONObject3.optJSONArray("profiles");
            if (optJSONArray5 != null) {
                ArrayList arrayList12 = new ArrayList(optJSONArray5.length());
                int length6 = optJSONArray5.length();
                int i10 = 0;
                while (i10 < length6) {
                    arrayList12.add((UserProfile) UserProfile.g0.a(optJSONArray5.getJSONObject(i10)));
                    i10++;
                    map5 = map5;
                }
                map2 = map5;
                int e4 = on00.e(c5g.u(arrayList12, 10));
                if (e4 < 16) {
                    e4 = 16;
                }
                map3 = new LinkedHashMap(e4);
                Iterator it7 = arrayList12.iterator();
                while (it7.hasNext()) {
                    Object next3 = it7.next();
                    map3.put(((UserProfile) next3).c, next3);
                }
            } else {
                map2 = map5;
                map3 = null;
            }
            Map map7 = map3 == null ? map2 : map3;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(on00.e(map7.size()));
            for (Map.Entry entry : map7.entrySet()) {
                linkedHashMap4.put(entry.getKey(), ((UserProfile) entry.getValue()).l0());
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(on00.e(map6.size()));
            for (Map.Entry entry2 : map6.entrySet()) {
                linkedHashMap5.put(entry2.getKey(), tsj.a((Group) entry2.getValue()));
            }
            LinkedHashMap n = pn00.n(linkedHashMap4, linkedHashMap5);
            JSONArray jSONArray3 = optJSONObject3.getJSONArray("items");
            ArrayList arrayList13 = new ArrayList(jSONArray3.length());
            int length7 = jSONArray3.length();
            int i11 = 0;
            while (i11 < length7) {
                arrayList13.add(new ClipVideoFile(jSONArray3.getJSONObject(i11).getJSONObject("clip").getJSONArray("items").getJSONObject(0), map7, map6, null, 8, null));
                i11++;
                jSONArray3 = jSONArray3;
            }
            f7d a4 = g7d.a(optJSONObject3, n, arrayList13);
            Pair pair = new Pair(a4.a, a4.b);
            obj2 = pair.i();
            obj3 = pair.j();
            s3q0 s3q0Var3 = s3q0.a;
        } else {
            str3 = str2;
            obj2 = null;
            obj3 = null;
        }
        PaginationKey a5 = PaginationKey.a.a(str);
        List list = (List) ref$ObjectRef.element;
        PaginationKey a6 = PaginationKey.a.a(str3);
        List list2 = (List) obj2;
        String str7 = (String) obj3;
        PaginationKey a7 = PaginationKey.a.a(str5);
        if (arrayList2 != null) {
            r4 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                r4.add(tsj.a((Group) it8.next()));
            }
        } else {
            r4 = 0;
        }
        if (r4 == 0) {
            r4 = EmptyList.b;
        }
        Collection collection2 = (Collection) r4;
        if (arrayList != null) {
            r1 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                r1.add(((UserProfile) it9.next()).l0());
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        ArrayList u02 = j5g.u0((Iterable) r1, collection2);
        int e5 = on00.e(c5g.u(u02, 10));
        if (e5 < 16) {
            e5 = 16;
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(e5);
        Iterator it10 = u02.iterator();
        while (it10.hasNext()) {
            Object next4 = it10.next();
            linkedHashMap6.put(((Owner) next4).b, next4);
        }
        return new nee(arrayList4, a5, list, j2, a6, list2, str7, null, null, j, j5, arrayList5, linkedHashMap, arrayList3, a7, linkedHashMap6);
    }

    @Override // xsna.xz2
    public final int[] l() {
        return new int[]{100};
    }
}
