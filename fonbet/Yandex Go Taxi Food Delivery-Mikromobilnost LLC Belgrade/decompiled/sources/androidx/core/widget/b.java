package androidx.core.widget;

import android.content.res.ColorStateList;
import android.view.ActionMode;
import android.widget.TextView;
import defpackage.d6z;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void b(TextView textView, int i) {
        d6z.r(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback c(ActionMode.Callback callback) {
        return callback instanceof TextViewCompat$OreoCallback ? ((TextViewCompat$OreoCallback) callback).getWrappedCallback() : callback;
    }
}
