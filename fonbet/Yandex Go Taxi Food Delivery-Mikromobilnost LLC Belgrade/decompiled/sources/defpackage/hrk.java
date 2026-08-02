package defpackage;

import com.yandex.alicekit.core.json.schema.HtmlString;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hrk extends n15 {
    public final ctk x;
    public final HtmlString y;
    public final String z;

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|2|3|(10:5|6|7|8|(2:10|11)|15|16|17|18|(2:20|21)(2:23|(2:25|26)(2:27|(2:29|30)(2:31|(2:33|34)(2:35|(2:37|38)(2:39|(2:41|42)(2:43|(2:45|46)(2:47|(2:49|50)(2:51|(2:53|54)(2:55|(2:57|58)(2:59|(2:61|62)(2:63|(2:65|66)(2:67|68)))))))))))))|75|6|7|8|(0)|15|16|17|18|(0)(0)|(1:(6:13|15|16|17|18|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r2.length() < 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0039, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x003a, code lost:
    
        r0.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x002b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x002c, code lost:
    
        r0.e(r2);
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[Catch: JSONException -> 0x002b, TRY_LEAVE, TryCatch #2 {JSONException -> 0x002b, blocks: (B:8:0x001b, B:10:0x0023), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hrk(JSONObject jSONObject) {
        super(jSONObject, r0);
        ctk ctkVar;
        HtmlString htmlString;
        JSONObject optJSONObject;
        quz quzVar = quz.c;
        String str = null;
        try {
            optJSONObject = jSONObject.optJSONObject("image");
        } catch (JSONException e) {
            quzVar.e(e);
        }
        if (optJSONObject != null) {
            ctkVar = new ctk(optJSONObject);
            this.x = ctkVar;
            htmlString = b4x.l("text", jSONObject);
            if (htmlString != null) {
            }
            this.y = htmlString;
            str = b4x.m("text_style", jSONObject);
            if ("text_s".equals(str)) {
                this.z = "text_s";
                return;
            }
            if ("text_m".equals(str)) {
                this.z = "text_m";
                return;
            }
            if ("text_m_medium".equals(str)) {
                this.z = "text_m_medium";
                return;
            }
            if ("text_l".equals(str)) {
                this.z = "text_l";
                return;
            }
            if ("title_s".equals(str)) {
                this.z = "title_s";
                return;
            }
            if ("title_m".equals(str)) {
                this.z = "title_m";
                return;
            }
            if ("title_l".equals(str)) {
                this.z = "title_l";
                return;
            }
            if ("numbers_s".equals(str)) {
                this.z = "numbers_s";
                return;
            }
            if ("numbers_m".equals(str)) {
                this.z = "numbers_m";
                return;
            }
            if ("numbers_l".equals(str)) {
                this.z = "numbers_l";
                return;
            }
            if ("card_header".equals(str)) {
                this.z = "card_header";
                return;
            } else if ("button".equals(str)) {
                this.z = "button";
                return;
            } else {
                this.z = "button";
                return;
            }
        }
        ctkVar = null;
        this.x = ctkVar;
        htmlString = b4x.l("text", jSONObject);
        if (htmlString != null) {
        }
        this.y = htmlString;
        str = b4x.m("text_style", jSONObject);
        if ("text_s".equals(str)) {
        }
        htmlString = null;
        this.y = htmlString;
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
        tjz0Var.a(this.x, "image");
        tjz0Var.a(this.y, "text");
        tjz0Var.a(this.z, "textStyle");
        return sb.toString();
    }
}
