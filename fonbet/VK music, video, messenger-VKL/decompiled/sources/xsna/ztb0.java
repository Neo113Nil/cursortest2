package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PollsCreate.java */
/* loaded from: classes7.dex */
public final class ztb0 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ ztb0(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                try {
                    return new PollAttachment(jSONObject.getJSONObject("response"));
                } catch (Exception e) {
                    L.C("vk", e);
                    return null;
                }
            default:
                JSONArray jSONArray = jSONObject.getJSONArray("response");
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    arrayList.add(new nec(jSONObject2.optInt("id"), jSONObject2.optString("title")));
                }
                return arrayList;
        }
    }

    public ztb0(String str, List list, UserId userId, boolean z, boolean z2, boolean z3, Integer num, Integer num2, Long l, Integer num3, StickerCommonStyle stickerCommonStyle, String str2) {
        super("polls.create");
        K("question", str);
        C(z ? 1 : 0, "is_anonymous");
        C(z2 ? 1 : 0, "is_multiple");
        C(z3 ? 1 : 0, "disable_unvote");
        if (l != null) {
            D(l.longValue(), "end_date");
        }
        if (userId.b != 0) {
            F(userId, "owner_id");
        }
        K("add_answers", new JSONArray((Collection) list).toString());
        K("ref", str2);
        if (num != null && num2 != null) {
            L.l("vk", "Incorrect arguments, can only pass background_id or photo_id");
        }
        if (num != null && num.intValue() != 0) {
            C(num.intValue(), "background_id");
        }
        if (num2 != null && num2.intValue() != 0) {
            C(num2.intValue(), "photo_id");
        }
        if (num3 != null) {
            StringBuilder sb = new StringBuilder("{\"accent\":\"#");
            int intValue = num3.intValue();
            byte[] bArr = x2r0.a;
            sb.append(Integer.toHexString(intValue));
            sb.append("\"}");
            K("colors", sb.toString());
        }
        if (stickerCommonStyle != null) {
            K(TtmlNode.TAG_STYLE, stickerCommonStyle.i());
        }
    }
}
