package xsna;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.vk.dto.common.ImageSizeKey;
import com.vk.log.L;
import com.vk.toggle.features.SmbFeatures;
import com.vkontakte.android.R;
import java.io.Closeable;
import java.util.Locale;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: AccountInfoContentProviderConstants.kt */
/* loaded from: classes.dex */
public final class ro {
    public static final String[] a = {"user_id", "app_state", "authorized_user_ids", "notifications_enabled", "in_app_notifications"};
    public static final char[] b = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] c = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ro d = new ro();

    public static final String a(Object[] objArr, int i, int i2, yf yfVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append(X3.j.d);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == yfVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    @NonNull
    public static String b(@NonNull byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            int i2 = (bArr[i] & 240) >>> 4;
            char[] cArr = b;
            sb.append(cArr[i2]);
            sb.append(cArr[bArr[i] & AmfConstants.TYPE_XML_DOCUMENT_MARKER]);
        }
        return sb.toString();
    }

    public static final ColorStateList c(int i, Integer num) {
        int i2;
        double alpha = (Color.alpha(i) / 255.0d) * n8g.f(i);
        if (num != null) {
            i2 = num.intValue();
        } else {
            TypedValue typedValue = krv0.a;
            i2 = (krv0.j() || alpha >= 0.25d) ? -16777216 : -1;
        }
        TypedValue typedValue2 = krv0.a;
        return ColorStateList.valueOf(l8g.f(krv0.j() ? n8g.f(i) > 0.5d ? 0.24f : 0.12f : 0.1f, i2));
    }

    public static void d(int i) {
        if (2 > i || i >= 37) {
            StringBuilder b2 = ji.b(i, "radix ", " was not in valid range ");
            b2.append(new k9x(2, 36, 1));
            throw new IllegalArgumentException(b2.toString());
        }
    }

    public static final void e(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                mnh0.d(th, th2);
            }
        }
    }

    public static int f(char c2) {
        int digit = Character.digit((int) c2, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    public static boolean g(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final xyt0 h(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            xyt0 xyt0Var = tag instanceof xyt0 ? (xyt0) tag : null;
            if (xyt0Var != null) {
                return xyt0Var;
            }
            Object m = fvr.m(view);
            view = m instanceof View ? (View) m : null;
        }
        return null;
    }

    public static boolean j(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final void n(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void o(View view, xyt0 xyt0Var) {
        view.setTag(R.id.view_tree_view_model_store_owner, xyt0Var);
    }

    public static String p(char c2, Locale locale) {
        String upperCase = String.valueOf(c2).toUpperCase(locale);
        if (upperCase.length() > 1) {
            if (c2 != 329) {
                return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(Locale.ROOT);
            }
        } else if (upperCase.equals(String.valueOf(c2).toUpperCase(Locale.ROOT))) {
            return String.valueOf(Character.toTitleCase(c2));
        }
        return upperCase;
    }

    public boolean i() {
        SmbFeatures smbFeatures = SmbFeatures.NAVGO_UPDATE_SCREEN_INFO;
        smbFeatures.getClass();
        return com.vk.toggle.b.A.a(smbFeatures);
    }

    public void k(String str) {
        L.p(str, "SCL");
    }

    public void l(String str) {
        L.e("IN_APP_UPDATES", str);
    }

    public void m(String str, Throwable th) {
        L.j(th, "IN_APP_UPDATES", str);
    }
}
