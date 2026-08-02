package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
/* loaded from: classes11.dex */
public final class ytp0 {
    public static int a(int i, int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static boolean b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !i(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!i(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal<TypedValue> threadLocal = i8g.a;
        try {
            return i8g.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static h8i d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        h8i h8iVar;
        if (i(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new h8i(null, null, typedValue.data);
            }
            try {
                h8iVar = h8i.a(typedArray.getResourceId(i, 0), theme, typedArray.getResources());
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                h8iVar = null;
            }
            if (h8iVar != null) {
                return h8iVar;
            }
        }
        return new h8i(null, null, 0);
    }

    public static float e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !i(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !i(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int g(TypedArray typedArray, XmlResourceParser xmlResourceParser) {
        if (i(xmlResourceParser, "interpolator")) {
            return typedArray.getResourceId(0, 0);
        }
        return 0;
    }

    public static String h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (i(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray j(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
