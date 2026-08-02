package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h8l extends n15 {
    public final int A;
    public final int x;
    public final boolean y;
    public final String z;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
    
        if (r7.intValue() < 0) goto L58;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h8l(JSONObject jSONObject) {
        super(jSONObject, r0);
        Integer num;
        Boolean bool;
        String str;
        quz quzVar = quz.c;
        Integer num2 = null;
        try {
            num = b4x.c("delimiter_color", jSONObject);
        } catch (JSONException e) {
            quzVar.e(e);
            num = null;
        }
        if (num == null) {
            this.x = mob1.d("#14000000");
        } else {
            this.x = num.intValue();
        }
        try {
            bool = b4x.f("has_delimiter", jSONObject);
        } catch (JSONException e2) {
            quzVar.e(e2);
            bool = null;
        }
        if (bool == null) {
            this.y = false;
        } else {
            this.y = bool.booleanValue();
        }
        try {
            str = b4x.m("size", jSONObject);
        } catch (JSONException e3) {
            quzVar.e(e3);
            str = null;
        }
        if ("zero".equals(str)) {
            this.z = "zero";
        } else if ("xxs".equals(str)) {
            this.z = "xxs";
        } else if ("xs".equals(str)) {
            this.z = "xs";
        } else if ("s".equals(str)) {
            this.z = "s";
        } else if ("m".equals(str)) {
            this.z = "m";
        } else if ("l".equals(str)) {
            this.z = "l";
        } else if ("xl".equals(str)) {
            this.z = "xl";
        } else if ("xxl".equals(str)) {
            this.z = "xxl";
        } else if ("match_parent".equals(str)) {
            this.z = "match_parent";
        } else {
            this.z = "xs";
        }
        try {
            Integer e4 = b4x.e("weight", jSONObject);
            if (e4 != null) {
            }
            num2 = e4;
        } catch (JSONException e5) {
            quzVar.e(e5);
        }
        if (num2 == null) {
            this.A = 1;
        } else {
            this.A = num2.intValue();
        }
    }

    @Override // defpackage.n15
    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        String n15Var = super.toString();
        StringBuilder sb = tjz0Var.a;
        sb.append(n15Var);
        tjz0Var.a(Integer.valueOf(this.x), "delimiterColor");
        tjz0Var.a(Boolean.valueOf(this.y), "hasDelimiter");
        tjz0Var.a(this.z, "size");
        tjz0Var.a(Integer.valueOf(this.A), "weight");
        return sb.toString();
    }
}
