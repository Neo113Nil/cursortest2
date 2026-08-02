package xsna;

import com.vk.dto.actionlinks.ActionLink;
import org.json.JSONObject;

/* compiled from: ActionLinksSave.kt */
/* loaded from: classes14.dex */
public final class a30 extends rsg0<ActionLink> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return new ActionLink(jSONObject.getJSONObject("response").getJSONObject("action"));
    }
}
