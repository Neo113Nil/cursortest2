package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.s1r0;
import xsna.wyd0;

/* compiled from: FriendsGetRequests.kt */
/* loaded from: classes14.dex */
public final class wos extends awi<yos> {
    public final int s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final xos x;

    /* compiled from: FriendsGetRequests.kt */
    public static final class a {
        public final wyd0.a a;
        public final String b;
        public final UserId c;

        public a(wyd0.a aVar, String str, UserId userId) {
            this.a = aVar;
            this.b = str;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            UserId userId = this.c;
            return hashCode2 + (userId != null ? Long.hashCode(userId.b) : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendRequestExtraData(mutualFriendsData=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", from=");
            return gp.b(sb, this.c, ')');
        }
    }

    public wos(int i, int i2, boolean z, boolean z2, String str, xos xosVar) {
        this.s = i;
        this.t = i2;
        this.u = z;
        this.v = z2;
        this.w = str;
        this.x = xosVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        List list;
        List list2;
        boolean z;
        ots otsVar = new ots();
        boolean z2 = this.v;
        Boolean bool = z2 ? Boolean.TRUE : null;
        boolean z3 = this.u;
        JSONArray jSONArray = ((JSONObject) yfb.z(nts.c(otsVar, Integer.valueOf(this.s), Integer.valueOf(this.t), bool, null, z3 ? Boolean.TRUE : null, this.w, null, 2249), new wh6(26)).f(l7r0Var)).getJSONArray("items");
        HashMap hashMap = new HashMap();
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                hashMap.put(new UserId(jSONObject.optLong("user_id")), new a(wyd0.c(jSONObject.optJSONObject("mutual")), jSONObject.optString("message"), new UserId(jSONObject.optLong("from"))));
                i++;
                z2 = z2;
            }
        }
        boolean z4 = z2;
        HashMap hashMap2 = new HashMap();
        if (z3) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((a) ((Map.Entry) it.next()).getValue()).c);
            }
            list = null;
            for (UsersUserFullDto usersUserFullDto : (Iterable) yfb.x(s1r0.a.a((54 & 8) != 0 ? null : "dat", arrayList, null)).f(l7r0Var)) {
                hashMap2.put(usersUserFullDto.s1(), usersUserFullDto.D0() + ' ' + usersUserFullDto.x1());
            }
        } else {
            list = null;
        }
        List O0 = j5g.O0(hashMap.keySet());
        List l = e43.l(UsersFieldsDto.ONLINE_INFO, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.CITY, UsersFieldsDto.COUNTRY, UsersFieldsDto.EDUCATION, UsersFieldsDto.UNIVERSITIES);
        if ((58 & 4) != 0) {
            l = list;
        }
        Iterable<UsersUserFullDto> iterable = (Iterable) yfb.x(s1r0.a.a((58 & 8) != 0 ? list : "dat", O0, l)).f(l7r0Var);
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
        for (UsersUserFullDto usersUserFullDto2 : iterable) {
            new j2r0();
            RequestUserProfile requestUserProfile = new RequestUserProfile(j2r0.a(usersUserFullDto2));
            a aVar = (a) hashMap.get(usersUserFullDto2.s1());
            if (aVar == null) {
                z = z4;
            } else {
                UserId userId = aVar.c;
                if (z3 && hashMap2.containsKey(userId)) {
                    requestUserProfile.h0 = this.x.c((String) hashMap2.get(userId));
                } else {
                    requestUserProfile.h0 = aVar.b;
                }
                z = z4;
                requestUserProfile.l0 = z;
                requestUserProfile.m0 = z3;
                requestUserProfile.r = requestUserProfile.o;
            }
            arrayList2.add(requestUserProfile);
            z4 = z;
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RequestUserProfile requestUserProfile2 = (RequestUserProfile) it2.next();
            a aVar2 = (a) hashMap.get(requestUserProfile2.c);
            int i2 = aVar2 != null ? aVar2.a.a : 0;
            if (aVar2 == null || (list2 = aVar2.a.b) == null) {
                list2 = EmptyList.b;
            }
            arrayList3.add(new zxq0(requestUserProfile2, i2, list2));
        }
        VKList<zxq0> vKList = new VKList<>(arrayList3);
        int size = arrayList2.size();
        yos yosVar = new yos();
        yosVar.a = vKList;
        yosVar.b = size;
        return yosVar;
    }
}
