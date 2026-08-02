package xsna;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.TextView;
import com.huawei.hms.android.SystemUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: TextViewInvalidator.java */
/* loaded from: classes18.dex */
public final class kno0 {
    public static Field a;
    public static Method b;

    public static void a(TextView textView) {
        Object obj;
        if (textView == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT > 29) {
                obj = null;
            } else {
                if (a == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    a = declaredField;
                    declaredField.setAccessible(true);
                }
                obj = a.get(textView);
            }
            if (obj == null) {
                ColorStateList linkTextColors = textView.getLinkTextColors();
                textView.setLinkTextColor(0);
                textView.setLinkTextColor(linkTextColors);
            } else {
                if (b == null) {
                    Method declaredMethod = obj.getClass().getDeclaredMethod("invalidateTextDisplayList", null);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                b.invoke(obj, null);
                textView.invalidate();
            }
        } catch (Exception unused) {
            if (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.MANUFACTURER)) {
                return;
            }
            boolean isEnabled = textView.isEnabled();
            textView.setEnabled(!isEnabled);
            textView.setEnabled(isEnabled);
        }
    }
}
