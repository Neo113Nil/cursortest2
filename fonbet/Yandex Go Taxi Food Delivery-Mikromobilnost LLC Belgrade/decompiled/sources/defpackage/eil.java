package defpackage;

import com.yandex.alicekit.core.json.schema.HtmlString;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class eil extends n15 {
    public final String A;
    public final int x;
    public final ArrayList y;
    public final HtmlString z;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r5.size() < 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r3.length() < 1) goto L39;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067 A[Catch: JSONException -> 0x006e, TRY_LEAVE, TryCatch #4 {JSONException -> 0x006e, blocks: (B:32:0x005f, B:34:0x0067), top: B:31:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eil(JSONObject jSONObject) {
        super(jSONObject, r0);
        Integer num;
        ArrayList arrayList;
        HtmlString htmlString;
        quz quzVar = quz.c;
        String str = null;
        try {
            num = b4x.c("menu_color", jSONObject);
        } catch (JSONException e) {
            quzVar.e(e);
            num = null;
        }
        if (num == null) {
            this.x = mob1.d("#66000000");
        } else {
            this.x = num.intValue();
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("menu_items");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            arrayList.add(new dil(optJSONObject));
                        }
                    } catch (JSONException e2) {
                        quzVar.e(e2);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
            }
        } catch (JSONException e3) {
            quzVar.e(e3);
            arrayList = null;
            this.y = arrayList;
            htmlString = b4x.l("text", jSONObject);
            if (htmlString != null) {
            }
            this.z = htmlString;
            str = b4x.m("text_style", jSONObject);
            if ("text_s".equals(str)) {
            }
        }
        this.y = arrayList;
        try {
            htmlString = b4x.l("text", jSONObject);
            if (htmlString != null) {
            }
        } catch (JSONException e4) {
            quzVar.e(e4);
        }
        this.z = htmlString;
        try {
            str = b4x.m("text_style", jSONObject);
        } catch (JSONException e5) {
            quzVar.e(e5);
        }
        if ("text_s".equals(str)) {
            this.A = "text_s";
            return;
        }
        if ("text_m".equals(str)) {
            this.A = "text_m";
            return;
        }
        if ("text_m_medium".equals(str)) {
            this.A = "text_m_medium";
            return;
        }
        if ("text_l".equals(str)) {
            this.A = "text_l";
            return;
        }
        if ("title_s".equals(str)) {
            this.A = "title_s";
            return;
        }
        if ("title_m".equals(str)) {
            this.A = "title_m";
            return;
        }
        if ("title_l".equals(str)) {
            this.A = "title_l";
            return;
        }
        if ("numbers_s".equals(str)) {
            this.A = "numbers_s";
            return;
        }
        if ("numbers_m".equals(str)) {
            this.A = "numbers_m";
            return;
        }
        if ("numbers_l".equals(str)) {
            this.A = "numbers_l";
            return;
        }
        if ("card_header".equals(str)) {
            this.A = "card_header";
            return;
        } else if ("button".equals(str)) {
            this.A = "button";
            return;
        } else {
            this.A = "card_header";
            return;
        }
        htmlString = null;
        this.z = htmlString;
        str = b4x.m("text_style", jSONObject);
        if ("text_s".equals(str)) {
        }
    }

    @Override // defpackage.n15
    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        String n15Var = super.toString();
        StringBuilder sb = tjz0Var.a;
        sb.append(n15Var);
        tjz0Var.a(Integer.valueOf(this.x), "menuColor");
        tjz0Var.a(this.y, "menuItems");
        tjz0Var.a(this.z, "text");
        tjz0Var.a(this.A, "textStyle");
        return sb.toString();
    }
}
