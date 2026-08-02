package xsna;

import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: MoneyDeclineTransfer.java */
/* loaded from: classes15.dex */
public final class i730 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i730(String str, int i) {
        super(str);
        this.s = i;
    }

    @Override // xsna.oer0, xsna.k7r0
    public Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Integer.valueOf(jSONObject.optInt("response"));
            case 1:
            default:
                return jSONObject;
            case 2:
                return vj90.g(jSONObject);
            case 3:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                try {
                    ArrayList arrayList = new ArrayList();
                    bis.k(arrayList, jSONObject2);
                    return arrayList;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return EmptyList.b;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i730() {
        super("account.getCounters");
        this.s = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i730(String str) {
        super("wall.getById");
        this.s = 3;
        K("posts", str);
        C(1, "extended");
        K("fields", "photo_base,sex,video_files,trending,verified,is_favorite,emoji_status,image_status,can_write_private_message,can_message,has_unseen_stories,is_government_organization,is_verified,first_name_gen,last_name_gen,url,trust_mark");
        C(1, "photo_sizes");
    }
}
