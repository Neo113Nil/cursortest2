package yads;

import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class li2 {
    public static LinkedHashMap a(ji2 ji2Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(O6.G1, ji2Var.a);
        ri2 ri2Var = ji2Var.b;
        if (ri2Var != null) {
            linkedHashMap.put("winner_name", ri2Var.a);
            linkedHashMap.put("winner_ad_unit", ri2Var.b);
        }
        linkedHashMap.put("status", ji2Var.d.a.name().toLowerCase(Locale.ROOT));
        Integer num = ji2Var.d.c;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num.intValue()));
        }
        String str = ji2Var.d.b;
        if (str != null) {
            linkedHashMap.put("error_message", str);
        }
        return linkedHashMap;
    }
}
