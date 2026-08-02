package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes7.dex */
public final class pv71 {
    public static Intent a(Context context, ms71 ms71Var) {
        String str = ms71Var.b;
        String str2 = ms71Var.a;
        String str3 = ms71Var.i;
        Map map = ms71Var.c;
        Integer num = ms71Var.d;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str3 != null) {
            intent.setClassName(str2, str3);
        } else {
            intent.setData(Uri.parse(str));
            intent.setPackage(str2);
        }
        if (num == null || !(context instanceof Activity)) {
            intent.addFlags((num != null ? num.intValue() : 0) | 1342177280);
        } else {
            intent.addFlags(num.intValue());
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(str4, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(str4, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(str4, (String) value);
                } else if (value instanceof jt71) {
                    try {
                        intent.putExtra(str4, ((jt71) value).getValue());
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return intent;
    }
}
