package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.polls.dto.PollsEditBackgroundIdDto;
import com.vk.api.generated.polls.dto.PollsEditStyleDto;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PollsEditExec.kt */
/* loaded from: classes15.dex */
public final class bub0 extends awi<PollAttachment> {
    public final dz2 s;
    public final hz2 t;

    public bub0(UserId userId, int i, String str, List<String> list, List<Long> list2, Map<String, String> map, boolean z, boolean z2, boolean z3, Integer num, Integer num2, StickerCommonStyle stickerCommonStyle, Integer num3, Long l, String str2) {
        String str3;
        PollsEditStyleDto pollsEditStyleDto;
        PollsEditBackgroundIdDto pollsEditBackgroundIdDto;
        UserId userId2;
        String num4;
        Object obj;
        String i2;
        Object obj2;
        List<String> list3 = list;
        List<String> list4 = (list3 == null || list3.isEmpty()) ? null : list;
        String jSONArray = list4 != null ? new JSONArray((Collection) list4).toString() : null;
        if (num3 != null) {
            int intValue = num3.intValue();
            StringBuilder sb = new StringBuilder("{\"accent\":\"#");
            byte[] bArr = x2r0.a;
            sb.append(Integer.toHexString(intValue));
            sb.append("\"}");
            str3 = sb.toString();
        } else {
            str3 = null;
        }
        if (stickerCommonStyle == null || (i2 = stickerCommonStyle.i()) == null) {
            pollsEditStyleDto = null;
        } else {
            Iterator<E> it = PollsEditStyleDto.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (epx.f(((PollsEditStyleDto) obj2).j(), i2)) {
                        break;
                    }
                }
            }
            pollsEditStyleDto = (PollsEditStyleDto) obj2;
        }
        Map<String, String> map2 = (map == null || map.isEmpty()) ? null : map;
        String jSONObject = map2 != null ? new JSONObject(map2).toString() : null;
        List<Long> list5 = list2;
        String jSONArray2 = ((list5 == null || list5.isEmpty()) ? null : list2) != null ? new JSONArray((Collection) list5).toString() : null;
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        if (num == null || (num4 = num.toString()) == null) {
            pollsEditBackgroundIdDto = null;
        } else {
            Iterator<E> it2 = PollsEditBackgroundIdDto.i().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (epx.f(((PollsEditBackgroundIdDto) obj).j(), num4)) {
                        break;
                    }
                }
            }
            pollsEditBackgroundIdDto = (PollsEditBackgroundIdDto) obj;
        }
        tfx tfxVar = new tfx("polls.edit", new jr(26), new bz60(4));
        tfx.l(tfxVar, "poll_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            userId2 = userId;
        } else {
            userId2 = userId;
        }
        if (str != null) {
            tfx.o(tfxVar, "question", str, 0, 0, 12);
        }
        if (jSONArray != null) {
            tfx.o(tfxVar, "add_answers", jSONArray, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "colors", str3, 0, 0, 12);
        }
        if (pollsEditStyleDto != null) {
            tfx.o(tfxVar, TtmlNode.TAG_STYLE, pollsEditStyleDto.j(), 0, 0, 12);
        }
        if (jSONObject != null) {
            tfx.o(tfxVar, "edit_answers", jSONObject, 0, 0, 12);
        }
        if (jSONArray2 != null) {
            tfx.o(tfxVar, "delete_answers", jSONArray2, 0, 0, 12);
        }
        if (valueOf != null) {
            tfx.l(tfxVar, "end_date", valueOf.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "photo_id", num2.intValue(), 0, 0, 8);
        }
        if (pollsEditBackgroundIdDto != null) {
            tfx.o(tfxVar, "background_id", pollsEditBackgroundIdDto.j(), 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        C(z ? 1 : 0, "is_anonymous");
        C(z2 ? 1 : 0, "is_multiple");
        C(z3 ? 1 : 0, "is_board");
        if (num != null && num2 != null) {
            L.l("vk", "Incorrect arguments, can only pass background_id or photo_id");
        }
        C(3, "friends_count");
        K("friends_fields", "photo_base");
        K("friends_name_case", "nom");
        this.s = yfb.x(tfxVar);
        xy2 a = jub0.a(new kub0(), i, userId2, null, 100);
        C(z ? 1 : 0, "is_anonymous");
        C(z2 ? 1 : 0, "is_multiple");
        C(z3 ? 1 : 0, "is_board");
        if (num != null && num2 != null) {
            L.l("vk", "Incorrect arguments, can only pass background_id or photo_id");
        }
        K("friends_fields", "photo_base");
        K("friends_name_case", "nom");
        this.t = yfb.z(a, new x620(15));
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        this.s.f(l7r0Var);
        return (PollAttachment) this.t.f(l7r0Var);
    }
}
