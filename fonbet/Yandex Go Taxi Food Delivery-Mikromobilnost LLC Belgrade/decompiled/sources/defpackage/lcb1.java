package defpackage;

import android.app.Activity;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import java.util.WeakHashMap;
import org.json.JSONObject;
import ru.yandex.taxi.common_models.ui.TextStyle;

/* loaded from: classes11.dex */
public abstract class lcb1 {
    public static my6 a(String str, zy6 zy6Var) {
        if (str == null) {
            str = "";
        }
        return new my6(str, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, zy6Var, null, null, false, false, 16292);
    }

    public static ttr0 b(JSONObject jSONObject) {
        jkk jkkVar;
        if (jSONObject == null) {
            return new ttr0(0);
        }
        u2l u2lVar = new u2l(eg90.a);
        tls tlsVar = b.g;
        kbs kbsVar = new kbs(19);
        sms smsVar = wm11.d;
        Expression a = pdx.a(jSONObject, "angle", tlsVar, kbsVar, smsVar);
        if (a == null) {
            a = utr0.a;
        }
        Expression expression = a;
        Expression a2 = pdx.a(jSONObject, "duration", tlsVar, new d7g0(26), smsVar);
        if (a2 == null) {
            a2 = utr0.b;
        }
        Expression expression2 = a2;
        pvo b = pdx.b(jSONObject, "colors", b.b, new yci0(), new kbs(19), u2lVar, wm11.f);
        if (b == null) {
            b = utr0.d;
        }
        pvo pvoVar = b;
        pvo b2 = pdx.b(jSONObject, "locations", tlsVar, new yci0(), new kbs(19), u2lVar, smsVar);
        if (b2 == null) {
            b2 = utr0.c;
        }
        pvo pvoVar2 = b2;
        JSONObject optJSONObject = jSONObject.optJSONObject("corner_radius");
        if (optJSONObject != null) {
            ((kkk) ft6.b.B2.getValue()).getClass();
            jkkVar = kkk.c(u2lVar, optJSONObject);
        } else {
            jkkVar = null;
        }
        return new ttr0(expression, expression2, pvoVar, pvoVar2, jkkVar);
    }

    public static final bkx c(Activity activity) {
        int statusBars;
        Insets insetsIgnoringVisibility;
        int navigationBars;
        Insets insetsIgnoringVisibility2;
        View decorView = activity.getWindow().getDecorView();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        decorView.getDrawingRect(rect2);
        int height = decorView.getHeight() - rect.height();
        int i = rect2.bottom - rect.bottom;
        int i2 = rect.top - rect2.top;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            if (rootWindowInsets != null) {
                statusBars = WindowInsets.Type.statusBars();
                insetsIgnoringVisibility = rootWindowInsets.getInsetsIgnoringVisibility(statusBars);
                navigationBars = WindowInsets.Type.navigationBars();
                insetsIgnoringVisibility2 = rootWindowInsets.getInsetsIgnoringVisibility(navigationBars);
                i2 = insetsIgnoringVisibility.top;
                i = insetsIgnoringVisibility2.bottom;
            }
        } else {
            WindowInsets rootWindowInsets2 = decorView.getRootWindowInsets();
            if (rootWindowInsets2 != null) {
                i = rootWindowInsets2.getStableInsetBottom();
                i2 = rootWindowInsets2.getStableInsetTop();
            }
        }
        int i3 = (height - i2) - i;
        return i3 > 0 ? new akx(i3) : zjx.a;
    }

    public static final void d(View view) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        n751 a = op31.a(view);
        if (a == null || !a.a.q(8)) {
            return;
        }
        i5z0.a.a("Calling hideKeyboard", new Object[0]);
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final boolean e(FragmentActivity fragmentActivity) {
        return !c(fragmentActivity).equals(zjx.a);
    }

    public static final void f(View view) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        n751 a = op31.a(view);
        if (a == null || !a.a.q(8)) {
            i5z0.a.a("Calling showKeyboard", new Object[0]);
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 0);
            }
        }
    }
}
