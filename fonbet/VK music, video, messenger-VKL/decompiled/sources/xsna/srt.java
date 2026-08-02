package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.stories.model.GetStoriesResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: GetGeoNews.kt */
/* loaded from: classes4.dex */
public final class srt extends awi<blt> {
    public final int s;
    public final String t;
    public final int u = 15;

    /* compiled from: GetGeoNews.kt */
    public static final class a {
        public final ArrayList a;
        public final String b;

        public a(String str, ArrayList arrayList) {
            this.a = arrayList;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ParsePostsResult(entries=");
            sb.append(this.a);
            sb.append(", nextFrom=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public srt(int i, String str) {
        this.s = i;
        this.t = str;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto = BaseUserGroupFieldsDto.ID;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto2 = BaseUserGroupFieldsDto.NAME;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto3 = BaseUserGroupFieldsDto.FIRST_NAME;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto4 = BaseUserGroupFieldsDto.FIRST_NAME_DAT;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto5 = BaseUserGroupFieldsDto.LAST_NAME;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto6 = BaseUserGroupFieldsDto.LAST_NAME_DAT;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto7 = BaseUserGroupFieldsDto.SEX;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto8 = BaseUserGroupFieldsDto.SCREEN_NAME;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto9 = BaseUserGroupFieldsDto.VIDEO_FILES;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto10 = BaseUserGroupFieldsDto.VERIFIED;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto11 = BaseUserGroupFieldsDto.TRENDING;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto12 = BaseUserGroupFieldsDto.IS_MEMBER;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto13 = BaseUserGroupFieldsDto.FRIEND_STATUS;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto14 = BaseUserGroupFieldsDto.CAN_UPLOAD_STORY;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto15 = BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto16 = BaseUserGroupFieldsDto.FIRST_NAME_GEN;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto17 = BaseUserGroupFieldsDto.LAST_NAME_GEN;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto18 = BaseUserGroupFieldsDto.IS_VERIFIED;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto19 = BaseUserGroupFieldsDto.PHOTO_BASE;
        List l = e43.l(baseUserGroupFieldsDto, baseUserGroupFieldsDto2, baseUserGroupFieldsDto3, baseUserGroupFieldsDto4, baseUserGroupFieldsDto5, baseUserGroupFieldsDto6, baseUserGroupFieldsDto7, baseUserGroupFieldsDto8, baseUserGroupFieldsDto9, baseUserGroupFieldsDto10, baseUserGroupFieldsDto11, baseUserGroupFieldsDto12, baseUserGroupFieldsDto13, baseUserGroupFieldsDto14, baseUserGroupFieldsDto15, baseUserGroupFieldsDto16, baseUserGroupFieldsDto17, baseUserGroupFieldsDto18, baseUserGroupFieldsDto19);
        tfx tfxVar = new tfx("places.getPosts", new com.vk.movika.sdk.android.defaultplayer.view.a(25), new er(28));
        int i = this.s;
        tfx.l(tfxVar, "place_id", i, 0, 0, 8);
        String str2 = this.t;
        if (str2 != null) {
            str = str2;
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        } else {
            str = str2;
        }
        tfxVar.f(this.u, 1, 50, "count");
        tfxVar.j("extended", true);
        if (l != null) {
            List list = l;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        a aVar = (a) bz2.c(yfb.z(tfxVar, new trt(1, this, srt.class, "parsePosts", "parsePosts(Lorg/json/JSONObject;)Lcom/vk/newsfeed/impl/requests/GetGeoNews$ParsePostsResult;", 0)), null);
        if (!epx.f(str, "0")) {
            return new blt(aVar.a, aVar.b, null, null);
        }
        List singletonList = Collections.singletonList(Integer.valueOf(i));
        tfx tfxVar2 = new tfx("places.getById", new e630(4), new dr(26));
        tfxVar2.i("places", singletonList);
        dz2 x = yfb.x(tfxVar2);
        List l2 = e43.l(baseUserGroupFieldsDto, baseUserGroupFieldsDto2, baseUserGroupFieldsDto3, baseUserGroupFieldsDto4, baseUserGroupFieldsDto5, baseUserGroupFieldsDto6, baseUserGroupFieldsDto7, baseUserGroupFieldsDto8, baseUserGroupFieldsDto9, baseUserGroupFieldsDto10, baseUserGroupFieldsDto11, baseUserGroupFieldsDto12, baseUserGroupFieldsDto13, baseUserGroupFieldsDto14, baseUserGroupFieldsDto15, baseUserGroupFieldsDto16, baseUserGroupFieldsDto17, baseUserGroupFieldsDto18, baseUserGroupFieldsDto19);
        tfx tfxVar3 = new tfx("stories.search", new iub0(4), new uga0(4));
        tfx.l(tfxVar3, "place_id", i, 0, 0, 8);
        tfxVar3.f(100, 1, 1000, "count");
        tfxVar3.j("extended", true);
        if (l2 != null) {
            List list2 = l2;
            arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((BaseUserGroupFieldsDto) it2.next()).i());
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            tfxVar3.i("fields", arrayList2);
        }
        Pair pair = (Pair) new com.vk.api.request.rx.batch.e(x, yfb.z(tfxVar3, new sm(27)), new zg7(this, 8)).f(l7r0Var);
        return new blt(aVar.a, aVar.b, (GeoLocation) pair.d(), (GetStoriesResponse) pair.g());
    }
}
