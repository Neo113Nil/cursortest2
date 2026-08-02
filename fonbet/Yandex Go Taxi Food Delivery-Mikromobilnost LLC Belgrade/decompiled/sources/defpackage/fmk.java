package defpackage;

import com.yandex.div.internal.widget.EllipsizedTextView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class fmk implements d4x {
    public final Integer A;
    public final String a;
    public final String b;
    public final int c;
    public final String w;
    public final double x;
    public final Integer y;
    public final Integer z;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r2.length() < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r2.intValue() < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (r2.intValue() < 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        if (r7.intValue() < 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1 A[Catch: JSONException -> 0x00d8, TRY_LEAVE, TryCatch #4 {JSONException -> 0x00d8, blocks: (B:39:0x00c9, B:41:0x00d1), top: B:38:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[Catch: JSONException -> 0x00ee, TRY_LEAVE, TryCatch #6 {JSONException -> 0x00ee, blocks: (B:47:0x00df, B:49:0x00e7), top: B:46:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fmk(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        Double d;
        Integer num;
        Integer num2;
        Integer e;
        quz quzVar = quz.c;
        Integer num3 = null;
        try {
            str = b4x.m("alignment", jSONObject);
        } catch (JSONException e2) {
            quzVar.e(e2);
            str = null;
        }
        if ("left".equals(str)) {
            this.a = "left";
        } else if ("center".equals(str)) {
            this.a = "center";
        } else if ("right".equals(str)) {
            this.a = "right";
        } else {
            this.a = "left";
        }
        try {
            str2 = b4x.m("ellipsis", jSONObject);
            if (str2 != null) {
            }
        } catch (JSONException e3) {
            quzVar.e(e3);
        }
        if (str2 != null) {
            this.b = EllipsizedTextView.DEFAULT_ELLIPSIS;
        } else {
            this.b = str2;
        }
        int intValue = b4x.h("font_size", jSONObject).intValue();
        this.c = intValue;
        if (intValue >= 0) {
            z3k.c("fontSize does not meet condition fontSize >= 0");
            throw null;
        }
        try {
            str3 = b4x.m("font_style", jSONObject);
        } catch (JSONException e4) {
            quzVar.e(e4);
            str3 = null;
        }
        if ("light".equals(str3)) {
            this.w = "light";
        } else if ("medium".equals(str3)) {
            this.w = "medium";
        } else if ("regular".equals(str3)) {
            this.w = "regular";
        } else if ("bold".equals(str3)) {
            this.w = "bold";
        } else {
            this.w = "regular";
        }
        try {
            d = b4x.d("letter_spacing", jSONObject);
        } catch (JSONException e5) {
            quzVar.e(e5);
            d = null;
        }
        if (d == null) {
            this.x = 0.0d;
        } else {
            this.x = d.doubleValue();
        }
        try {
            num = b4x.e("line_height", jSONObject);
            if (num != null) {
            }
        } catch (JSONException e6) {
            quzVar.e(e6);
        }
        this.y = num;
        try {
            num2 = b4x.e("max_letters", jSONObject);
            if (num2 != null) {
            }
        } catch (JSONException e7) {
            quzVar.e(e7);
        }
        this.z = num2;
        try {
            e = b4x.e("max_lines", jSONObject);
            if (e != null) {
            }
            num3 = e;
        } catch (JSONException e8) {
            quzVar.e(e8);
        }
        this.A = num3;
        num = null;
        this.y = num;
        num2 = b4x.e("max_letters", jSONObject);
        if (num2 != null) {
        }
        this.z = num2;
        e = b4x.e("max_lines", jSONObject);
        if (e != null) {
        }
        num3 = e;
        this.A = num3;
        str2 = null;
        if (str2 != null) {
        }
        int intValue2 = b4x.h("font_size", jSONObject).intValue();
        this.c = intValue2;
        if (intValue2 >= 0) {
        }
        num2 = null;
        this.z = num2;
        e = b4x.e("max_lines", jSONObject);
        if (e != null) {
        }
        num3 = e;
        this.A = num3;
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "alignment");
        tjz0Var.a(this.b, "ellipsis");
        tjz0Var.a(Integer.valueOf(this.c), "fontSize");
        tjz0Var.a(this.w, "fontStyle");
        tjz0Var.a(Double.valueOf(this.x), "letterSpacing");
        tjz0Var.a(this.y, "lineHeight");
        tjz0Var.a(this.z, "maxLetters");
        tjz0Var.a(this.A, "maxLines");
        return tjz0Var.a.toString();
    }
}
