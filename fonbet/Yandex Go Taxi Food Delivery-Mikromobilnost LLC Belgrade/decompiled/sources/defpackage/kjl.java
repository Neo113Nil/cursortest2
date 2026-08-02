package defpackage;

import com.yandex.alicekit.core.json.schema.HtmlString;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kjl implements d4x {
    public final int a;
    public final HtmlString b;
    public final HtmlString c;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r6.length() < 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kjl(JSONObject jSONObject) {
        Integer num;
        HtmlString htmlString = null;
        try {
            num = b4x.c("color", jSONObject);
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
            num = null;
        }
        if (num == null) {
            this.a = mob1.d("#ffedf0f2");
        } else {
            this.a = num.intValue();
        }
        HtmlString i = b4x.i("score", jSONObject);
        this.b = i;
        if (i.length() < 1) {
            z3k.c("score does not meet condition score.length() >= 1");
            throw null;
        }
        try {
            HtmlString l = b4x.l("text", jSONObject);
            if (l != null) {
            }
            htmlString = l;
        } catch (JSONException e2) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e2);
            }
        }
        this.c = htmlString;
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(Integer.valueOf(this.a), "color");
        tjz0Var.a(this.b, "score");
        tjz0Var.a(this.c, "text");
        return tjz0Var.a.toString();
    }
}
