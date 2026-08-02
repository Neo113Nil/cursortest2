package xsna;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: ColorExtensions.kt */
/* loaded from: classes11.dex */
public final class b6g {
    public static final a a = new a();

    /* compiled from: ColorExtensions.kt */
    public static final class a extends ThreadLocal<TypedValue> {
        @Override // java.lang.ThreadLocal
        public final TypedValue initialValue() {
            return new TypedValue();
        }
    }

    public static final int a(int i, Context context) {
        TypedValue typedValue = a.get();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }
}
