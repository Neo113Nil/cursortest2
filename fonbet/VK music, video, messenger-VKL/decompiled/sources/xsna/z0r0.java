package xsna;

import android.text.TextUtils;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UsersGet.java */
/* loaded from: classes15.dex */
public final class z0r0 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public z0r0(UserId userId, int i, String str) {
        super("video.getAlbumById");
        D(userId.b, "owner_id");
        C(i, "album_id");
        K("focus_on_video", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                JSONArray jSONArray = jSONObject.getJSONArray("response");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(new UserProfile(jSONArray.getJSONObject(i)));
                }
                return arrayList;
            default:
                return new VideoAlbum(jSONObject.getJSONObject("response"));
        }
    }

    public z0r0(List list, String[] strArr, String str) {
        super("users.get");
        M("user_ids", list);
        K("fields", TextUtils.join(StringUtils.COMMA, strArr));
        K("name_case", str);
        ahn.D(this);
    }

    public z0r0(List list, String[] strArr) {
        this(list, strArr, "nom");
    }
}
