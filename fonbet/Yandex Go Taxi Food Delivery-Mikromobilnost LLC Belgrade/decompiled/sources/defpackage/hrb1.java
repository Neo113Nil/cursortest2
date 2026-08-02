package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.provider.FontsContractCompat$Columns;
import com.google.android.material.navigation.NavigationBarView;
import org.json.JSONObject;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public abstract class hrb1 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(RobotoTextView robotoTextView, JSONObject jSONObject, pdc pdcVar, ContextThemeWrapper contextThemeWrapper) {
        kdc kdcVar;
        Double c;
        int optInt;
        int G;
        Typeface typeface;
        Double c2 = c("font_size", jSONObject);
        if (c2 != null) {
            robotoTextView.setTextSize(2, (float) c2.doubleValue());
        }
        String J = cvw.J(FontsContractCompat$Columns.WEIGHT, jSONObject);
        Integer num = null;
        if (J != null) {
            switch (J.hashCode()) {
                case -1078030475:
                    if (J.equals("medium")) {
                        typeface = Typeface.create("sans-serif-medium", 0);
                        break;
                    }
                    typeface = null;
                    break;
                case 3029637:
                    if (J.equals("bold")) {
                        typeface = Typeface.create(Typeface.DEFAULT, 1);
                        break;
                    }
                    typeface = null;
                    break;
                case 1086463900:
                    if (J.equals("regular")) {
                        typeface = Typeface.create(Typeface.DEFAULT, 0);
                        break;
                    }
                    typeface = null;
                    break;
                case 1223860979:
                    if (J.equals("semibold")) {
                        typeface = Typeface.create("sans-serif-medium", 1);
                        break;
                    }
                    typeface = null;
                    break;
                default:
                    typeface = null;
                    break;
            }
            if (typeface != null) {
                robotoTextView.setTypeface(typeface);
            }
        }
        String J2 = cvw.J("text_color", jSONObject);
        if (J2 != null) {
            if (J2.length() <= 0) {
                J2 = null;
            }
            if (J2 != null) {
                if (!evu0.z(J2, ';') && (G = evu0.G(J2, ':', 0, 6)) >= 0) {
                    String obj = evu0.k0(J2.substring(0, G)).toString();
                    if (cvu0.t(obj, "l", true) || cvu0.t(obj, "d", true)) {
                        J2 = evu0.k0(J2.substring(G + 1)).toString();
                    }
                }
                kdcVar = ((ufu) pdcVar).i(J2);
                if (kdcVar != null) {
                    robotoTextView.setTextColor(s8o.m(kdcVar, contextThemeWrapper));
                }
                if (jSONObject.has("max_lines") && !jSONObject.isNull("max_lines")) {
                    optInt = jSONObject.optInt("max_lines", Integer.MIN_VALUE);
                    Integer valueOf = Integer.valueOf(optInt);
                    if (optInt != Integer.MIN_VALUE) {
                        num = valueOf;
                    }
                }
                if (num != null) {
                    robotoTextView.setMaxLines(num.intValue());
                }
                String J3 = cvw.J("text_alignment", jSONObject);
                robotoTextView.setGravity(!jl40.l(J3, "center") ? 17 : jl40.l(J3, "right") ? 8388629 : NavigationBarView.ITEM_GRAVITY_START_CENTER);
                c = c("line_height", jSONObject);
                if (c == null) {
                    float doubleValue = (float) (c.doubleValue() - (c2 != null ? c2.doubleValue() : 12.0d));
                    if (doubleValue < 0.0f) {
                        doubleValue = 0.0f;
                    }
                    robotoTextView.setLineSpacing(doubleValue, 1.0f);
                    return;
                }
                return;
            }
        }
        kdcVar = null;
        if (kdcVar != null) {
        }
        if (jSONObject.has("max_lines")) {
            optInt = jSONObject.optInt("max_lines", Integer.MIN_VALUE);
            Integer valueOf2 = Integer.valueOf(optInt);
            if (optInt != Integer.MIN_VALUE) {
            }
        }
        if (num != null) {
        }
        String J32 = cvw.J("text_alignment", jSONObject);
        robotoTextView.setGravity(!jl40.l(J32, "center") ? 17 : jl40.l(J32, "right") ? 8388629 : NavigationBarView.ITEM_GRAVITY_START_CENTER);
        c = c("line_height", jSONObject);
        if (c == null) {
        }
    }

    public static final Activity b(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Double c(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        double optDouble = jSONObject.optDouble(str, Double.NaN);
        Double valueOf = Double.valueOf(optDouble);
        if (Double.isNaN(optDouble)) {
            return null;
        }
        return valueOf;
    }

    public static void d(View view, CharSequence charSequence) {
        fuz0.a(view, charSequence);
    }
}
