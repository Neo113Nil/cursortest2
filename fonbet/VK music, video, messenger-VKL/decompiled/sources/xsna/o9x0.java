package xsna;

import android.util.SparseArray;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.parsers.BadgesParsers;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostAuthor;
import com.vk.newsfeed.api.data.NewsComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WallGetComment.kt */
/* loaded from: classes4.dex */
public final class o9x0 extends rsg0<NewsComment> {
    public o9x0(UserId userId, int i) {
        super("wall.getComment");
        F(userId, "owner_id");
        C(i, "comment_id");
        C(1, "extended");
        List l = e43.l(UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.EMOJI_STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.HAS_UNSEEN_STORIES, UsersFieldsDto.IS_VERIFIED, UsersFieldsDto.PHOTO_BASE);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((UsersFieldsDto) it.next()).i());
        }
        List singletonList = Collections.singletonList(GroupsFieldsDto.DEACTIVATED);
        ArrayList arrayList2 = new ArrayList(c5g.u(singletonList, 10));
        Iterator it2 = singletonList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((GroupsFieldsDto) it2.next()).k());
        }
        G("fields", j5g.u0(arrayList2, arrayList));
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Owner owner;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        float b = vx2.d.b();
        boolean z = z230.a;
        JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                Serializer.c<Owner> cVar = Owner.CREATOR;
                Owner f = Owner.a.f(jSONObject3);
                f.e = we7.q(jSONObject3, b, z);
                linkedHashMap.put(f.b, f);
                String optString = jSONObject3.optString("first_name_dat");
                if (optString != null) {
                    linkedHashMap2.put(f.b, optString);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject4 = optJSONArray2.getJSONObject(i2);
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                Owner d = Owner.a.d(jSONObject4);
                d.e = we7.q(jSONObject4, b, z);
                linkedHashMap.put(d.b, d);
                String optString2 = jSONObject4.optString("first_name_dat");
                if (optString2 != null) {
                    linkedHashMap2.put(d.b, optString2);
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
        }
        tci.q(jSONObject2);
        SparseArray<BadgeItem> b2 = BadgesParsers.b(jSONObject2);
        PostAuthor postAuthor = null;
        if (jSONObject2.has("post_author_id") && (owner = (Owner) linkedHashMap.get(new UserId(jSONObject2.optLong("post_author_id")))) != null) {
            Serializer.c<PostAuthor> cVar3 = PostAuthor.CREATOR;
            postAuthor = PostAuthor.a.a(owner);
        }
        jSONObject2.optBoolean("can_like_as_author", false);
        return new NewsComment(jSONObject2.getJSONArray("items").getJSONObject(0), new bcg(postAuthor, linkedHashMap, linkedHashMap2, b2, 0));
    }
}
