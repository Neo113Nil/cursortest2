package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes11.dex */
public abstract class hob1 {
    public static final long a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) btsVar.m(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = wuj0.a;
        return rzo.d(resources.getColor(i, theme));
    }

    public static final twt0 b(ya30 ya30Var, MotionSchemeKeyTokens motionSchemeKeyTokens) {
        switch (za30.a[motionSchemeKeyTokens.ordinal()]) {
            case 1:
                ya30Var.getClass();
                return ya30.b;
            case 2:
                ya30Var.getClass();
                return ya30.c;
            case 3:
                ya30Var.getClass();
                return ya30.d;
            case 4:
                ya30Var.getClass();
                return ya30.e;
            case 5:
                ya30Var.getClass();
                return ya30.f;
            case 6:
                ya30Var.getClass();
                return ya30.g;
            default:
                w511.b();
                return null;
        }
    }

    public static int c(AttributeSet attributeSet, String str, String str2) {
        String attributeValue = attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !cvu0.x(attributeValue, "?", false)) {
            return 0;
        }
        return Integer.valueOf(cvu0.v(attributeValue, "?", "", false)).intValue();
    }

    public static final void d(AttributeSet attributeSet, TypedArray typedArray, String str, int i, int i2, d9e d9eVar, d9e d9eVar2) {
        int resourceId;
        int c;
        int c2;
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
        boolean z = attributeValue != null && cvu0.x(attributeValue, "?", false);
        if (z && (c2 = c(attributeSet, "http://schemas.android.com/apk/res-auto", str)) != 0) {
            d9eVar.a(Integer.valueOf(c2));
            return;
        }
        if (evu0.y(str, "android:", false) && (c = c(attributeSet, "http://schemas.android.com/apk/res/android", cvu0.v(str, "android:", "", false))) != 0) {
            d9eVar.a(Integer.valueOf(c));
        } else if (z || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            d9eVar.a(Integer.valueOf(i2));
        } else {
            d9eVar2.a(Integer.valueOf(resourceId));
        }
    }

    public static final twt0 e(MotionSchemeKeyTokens motionSchemeKeyTokens, fid fidVar) {
        return b((ya30) ((bts) fidVar).m(f810.a), motionSchemeKeyTokens);
    }
}
