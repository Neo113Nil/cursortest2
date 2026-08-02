package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.actions.Action;
import com.vk.im.engine.models.ConversationCard;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ConversationCardParser.kt */
/* loaded from: classes2.dex */
public final class irj {
    public static ArrayList a(JSONArray jSONArray) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString(TtmlNode.TAG_LAYOUT);
            String string = jSONObject.getString("text");
            String string2 = jSONObject.getString("type");
            String optString2 = jSONObject.optString(TtmlNode.TAG_STYLE);
            int optInt = jSONObject.optInt("miniapp_id");
            Action.b bVar = Action.b;
            Action a = Action.a.a(jSONObject.optJSONObject("action"));
            Iterator<E> it = ConversationCard.ConversationButton.LayoutType.h().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (epx.f(((ConversationCard.ConversationButton.LayoutType) obj2).i(), optString)) {
                    break;
                }
            }
            ConversationCard.ConversationButton.LayoutType layoutType = (ConversationCard.ConversationButton.LayoutType) obj2;
            if (layoutType == null) {
                layoutType = ConversationCard.ConversationButton.LayoutType.PRIMARY;
            }
            Iterator<E> it2 = ConversationCard.ConversationButton.TypeDto.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (epx.f(((ConversationCard.ConversationButton.TypeDto) obj3).i(), string2)) {
                    break;
                }
            }
            ConversationCard.ConversationButton.TypeDto typeDto = (ConversationCard.ConversationButton.TypeDto) obj3;
            if (typeDto == null) {
                typeDto = ConversationCard.ConversationButton.TypeDto.UNKNOWN;
            }
            Iterator<E> it3 = ConversationCard.ConversationButton.StyleType.h().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (epx.f(((ConversationCard.ConversationButton.StyleType) next).i(), optString2)) {
                    obj = next;
                    break;
                }
            }
            ConversationCard.ConversationButton.StyleType styleType = (ConversationCard.ConversationButton.StyleType) obj;
            if (styleType == null) {
                styleType = ConversationCard.ConversationButton.StyleType.REGULAR;
            }
            arrayList.add(new ConversationCard.ConversationButton(layoutType, string, typeDto, styleType, Integer.valueOf(optInt), a));
        }
        return arrayList;
    }
}
