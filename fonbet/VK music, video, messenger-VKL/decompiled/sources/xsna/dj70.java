package xsna;

import com.vk.superapp.api.dto.widgets.InvalidWidgetInfo;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NotificationsDeleteGroupSource.kt */
/* loaded from: classes15.dex */
public final class dj70 extends xsg0 {
    public dj70(List list) {
        super("superApp.logIncorrectWidget");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InvalidWidgetInfo invalidWidgetInfo = (InvalidWidgetInfo) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", invalidWidgetInfo.b);
            jSONObject.put("error", invalidWidgetInfo.c);
            jSONObject.put("source", invalidWidgetInfo.d.name());
            jSONArray.put(jSONObject);
        }
        K("widgets", jSONArray.toString());
    }
}
