package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class gdl implements d4x {
    public final String a;
    public final ArrayList b;
    public final String c;

    public gdl(JSONObject jSONObject) {
        String str;
        String str2;
        int i;
        try {
            str = b4x.m("bottom_padding", jSONObject);
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
            this.a = "xxs";
        }
        JSONArray a = b4x.a("cells", jSONObject);
        int length = a.length();
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        while (i2 < length) {
            try {
                JSONObject optJSONObject = a.optJSONObject(i2);
                if (optJSONObject != null) {
                    i = length;
                    try {
                        arrayList.add(new fdl(optJSONObject));
                    } catch (JSONException e2) {
                        e = e2;
                        if (ydz.a.a()) {
                            ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
                        }
                        i2++;
                        length = i;
                    }
                } else {
                    i = length;
                }
            } catch (JSONException e3) {
                e = e3;
                i = length;
            }
            i2++;
            length = i;
        }
        this.b = arrayList;
        if (arrayList.size() < 1) {
            z3k.c("cells does not meet condition cells.size() >= 1");
            throw null;
        }
        try {
            str2 = b4x.m("top_padding", jSONObject);
        } catch (JSONException e4) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e4);
            }
            str2 = null;
        }
        if ("zero".equals(str2)) {
            this.c = "zero";
            return;
        }
        if ("xxs".equals(str2)) {
            this.c = "xxs";
            return;
        }
        if ("xs".equals(str2)) {
            this.c = "xs";
            return;
        }
        if ("s".equals(str2)) {
            this.c = "s";
            return;
        }
        if ("m".equals(str2)) {
            this.c = "m";
            return;
        }
        if ("l".equals(str2)) {
            this.c = "l";
            return;
        }
        if ("xl".equals(str2)) {
            this.c = "xl";
            return;
        }
        if ("xxl".equals(str2)) {
            this.c = "xxl";
        } else if ("match_parent".equals(str2)) {
            this.c = "match_parent";
        } else {
            this.c = "zero";
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "bottomPadding");
        tjz0Var.a(this.b, "cells");
        tjz0Var.a(this.c, "topPadding");
        return tjz0Var.a.toString();
    }
}
