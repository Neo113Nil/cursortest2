package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Map;

/* loaded from: classes10.dex */
public final class uh2 {
    public static Intent a(Context context, th2 th2Var) {
        String str = th2Var.b;
        String str2 = th2Var.a;
        String str3 = th2Var.i;
        Map map = th2Var.c;
        Integer num = th2Var.d;
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
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
                } else if (value instanceof uq0) {
                    try {
                        intent.putExtra(str4, ((uq0) value).getValue());
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return intent;
    }
}
