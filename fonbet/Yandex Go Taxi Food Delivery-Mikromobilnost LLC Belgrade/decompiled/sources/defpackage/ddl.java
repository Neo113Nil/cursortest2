package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ddl implements d4x {
    public final String a;
    public final String b;
    public final int c;

    public ddl(JSONObject jSONObject) {
        String str;
        String str2;
        Integer num = null;
        try {
            str = b4x.m("left_padding", jSONObject);
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
            str = null;
        }
        if ("zero".equals(str)) {
            this.a = "zero";
        } else if ("xxs".equals(str)) {
            this.a = "xxs";
        } else if ("xs".equals(str)) {
            this.a = "xs";
        } else if ("s".equals(str)) {
            this.a = "s";
        } else if ("m".equals(str)) {
            this.a = "m";
        } else if ("l".equals(str)) {
            this.a = "l";
        } else if ("xl".equals(str)) {
            this.a = "xl";
        } else if ("xxl".equals(str)) {
            this.a = "xxl";
        } else if ("match_parent".equals(str)) {
            this.a = "match_parent";
        } else {
            this.a = "xs";
        }
        try {
            str2 = b4x.m("right_padding", jSONObject);
        } catch (JSONException e2) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e2);
            }
            str2 = null;
        }
        if ("zero".equals(str2)) {
            this.b = "zero";
        } else if ("xxs".equals(str2)) {
            this.b = "xxs";
        } else if ("xs".equals(str2)) {
            this.b = "xs";
        } else if ("s".equals(str2)) {
            this.b = "s";
        } else if ("m".equals(str2)) {
            this.b = "m";
        } else if ("l".equals(str2)) {
            this.b = "l";
        } else if ("xl".equals(str2)) {
            this.b = "xl";
        } else if ("xxl".equals(str2)) {
            this.b = "xxl";
        } else if ("match_parent".equals(str2)) {
            this.b = "match_parent";
        } else {
            this.b = "xs";
        }
        try {
            num = b4x.e("weight", jSONObject);
        } catch (JSONException e3) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e3);
            }
        }
        if (num == null) {
            this.c = 0;
        } else {
            this.c = num.intValue();
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "leftPadding");
        tjz0Var.a(this.b, "rightPadding");
        tjz0Var.a(Integer.valueOf(this.c), "weight");
        return tjz0Var.a.toString();
    }
}
