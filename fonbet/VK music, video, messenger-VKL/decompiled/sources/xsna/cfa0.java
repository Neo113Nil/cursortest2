package xsna;

import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: PhotosGetInfo.java */
/* loaded from: classes15.dex */
public final class cfa0 extends rsg0<a> {

    /* compiled from: PhotosGetInfo.java */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;

        @Nullable
        public ImageSize i;
        public boolean j;
    }

    public cfa0(UserId userId, int i, String str) {
        super("photos.getById");
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(i);
        sb.append((str == null || str.length() <= 0) ? "" : BundleUtil.UNDERLINE_TAG.concat(str));
        K("photos", sb.toString());
        C(1, "extended");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray("response").getJSONObject(0);
            a aVar = new a();
            aVar.a = jSONObject2.getJSONObject("likes").getInt("count");
            aVar.b = jSONObject2.getJSONObject("comments").getInt("count");
            aVar.c = jSONObject2.getJSONObject("reposts").getInt("count");
            aVar.d = jSONObject2.getJSONObject("tags").getInt("count");
            boolean z = true;
            aVar.e = jSONObject2.getJSONObject("likes").getInt("user_likes") == 1;
            aVar.f = jSONObject2.optInt("can_comment", 1) == 1;
            aVar.g = jSONObject2.optInt("can_repost", 1) == 1;
            aVar.h = jSONObject2.optBoolean("has_tags", false);
            if (jSONObject2.optInt("can_be_owner_photo") != 1) {
                z = false;
            }
            aVar.j = z;
            if (!jSONObject2.has("orig_photo")) {
                return aVar;
            }
            aVar.i = Photo.Jb(jSONObject2.getJSONObject("orig_photo"));
            return aVar;
        } catch (Exception e) {
            L.E(e, new Object[0]);
            return null;
        }
    }
}
