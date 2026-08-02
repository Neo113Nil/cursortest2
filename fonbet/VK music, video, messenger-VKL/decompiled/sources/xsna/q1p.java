package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import xsna.e3m;

/* compiled from: EditTextExt.kt */
/* loaded from: classes17.dex */
public final class q1p {
    public static final void a(EditText editText, int i) {
        if (Build.VERSION.SDK_INT > 28) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i, i});
            Integer num = 2;
            gradientDrawable.setSize((int) TypedValue.applyDimension(2, num.floatValue(), editText.getContext().getResources().getDisplayMetrics()), (int) editText.getTextSize());
            editText.setTextCursorDrawable(gradientDrawable);
            return;
        }
        String obj = editText.getText().toString();
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(editText);
            Context context = editText.getContext();
            e3m.a aVar = e3m.a;
            Drawable a = m33.a(i2, context);
            a.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            Drawable[] drawableArr = {a, a};
            Field declaredField3 = obj2.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj2, drawableArr);
        } catch (Exception unused) {
        }
        editText.setText(obj);
        editText.setSelection(selectionStart, selectionEnd);
    }
}
