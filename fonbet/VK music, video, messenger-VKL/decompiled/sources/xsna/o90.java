package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.activity.BaseActivity;

/* compiled from: ActivityExt.kt */
/* loaded from: classes17.dex */
public final class o90 {
    public static final boolean a(Activity activity) {
        return (activity.getWindow().getAttributes().flags & 8192) != 0;
    }

    public static final void b(StringBuilder sb, View view, int i) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(brm0.x(i, "-"));
        try {
            str = view.getId() == -1 ? "NO_ID" : view.getContext().getResources().getResourceName(view.getId());
        } catch (Throwable unused) {
            str = "FAILED_TO_GET_ID";
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(view.getClass().getName());
        sb2.append('\n');
        sb.append(sb2.toString());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                b(sb, viewGroup.getChildAt(i2), i + 2);
            }
        }
    }

    public static final String c(BaseActivity baseActivity) {
        if (baseActivity.getWindow() == null) {
            return "no_window";
        }
        View decorView = baseActivity.getWindow().getDecorView();
        StringBuilder sb = new StringBuilder();
        b(sb, decorView, 0);
        return sb.toString();
    }
}
