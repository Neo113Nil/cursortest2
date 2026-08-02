package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.ded0;
import xsna.s1r0;

/* compiled from: GetFriendsInfoRequest.kt */
/* loaded from: classes17.dex */
public final class mrt extends awi<ded0> {
    public final UserId s;
    public final ArrayList v;
    public final boolean t = true;
    public final boolean u = true;
    public final boolean w = true;

    public mrt(UserId userId, ArrayList arrayList) {
        this.s = userId;
        this.v = arrayList;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        JSONObject jSONObject = new JSONObject();
        boolean z = this.t;
        UserId userId = this.s;
        if (z) {
            jSONObject.put("listsFriends", (JSONObject) yfb.z(nts.f(new ots(), userId, 6), new rd1(23)).f(l7r0Var));
        }
        if (this.u) {
            List l = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.IS_NFT);
            ArrayList arrayList = (58 & 1) != 0 ? null : this.v;
            if ((58 & 4) != 0) {
                l = null;
            }
            jSONObject.put("forbiddenFriends", (JSONArray) yfb.z(s1r0.a.b(arrayList, null, l, null, null), new f1s(1)).f(l7r0Var));
        }
        if (this.w) {
            List singletonList = Collections.singletonList(userId);
            if ((62 & 1) != 0) {
                singletonList = null;
            }
            jSONObject.put("isProfileClosed", ((UsersUserFullDto) j5g.Y((List) yfb.x(s1r0.a.b(singletonList, null, null, null, null)).f(l7r0Var))).T2());
        }
        try {
            return ded0.a.a(jSONObject);
        } catch (Exception unused) {
            return new ded0(0);
        }
    }
}
