package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.yandex.go.proxyprovision.GoEndpointDescriptionResult;
import com.yandex.go.proxyprovision.GoEndpointDescriptionResultHeader;
import com.yandex.go.proxyprovision.GoEndpointDescriptionResultQuery;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes11.dex */
public abstract class g8a1 {
    public static final int[] a = new int[2];

    public static void a() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            nba1.c("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i = glGetError;
        }
        if (i != 0) {
            nba1.c("GlUtil", "glError: " + GLU.gluErrorString(i));
        }
    }

    public static boolean b(Context context) {
        String eglQueryString;
        int i = rf71.a;
        if (i < 24) {
            return false;
        }
        if (i < 26) {
            byte[] decode = Base64.decode("c2Ftc3VuZw==", 0);
            Charset charset = uza.a;
            if (new String(decode, charset).equals(rf71.c) || new String(Base64.decode("WFQxNjUw", 0), charset).equals(rf71.d)) {
                return false;
            }
        }
        return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
    }

    public static final GoEndpointDescriptionResult c(iq20 iq20Var) {
        String str = iq20Var.a.a.d;
        Map map = iq20Var.c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new GoEndpointDescriptionResultHeader((String) entry.getKey(), (String) entry.getValue()));
        }
        List<Pair> list = iq20Var.b.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        for (Pair pair : list) {
            arrayList2.add(new GoEndpointDescriptionResultQuery((String) pair.getFirst(), (String) pair.getSecond()));
        }
        return new GoEndpointDescriptionResult(str, arrayList, arrayList2);
    }

    public static boolean d() {
        String eglQueryString;
        return rf71.a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static View e(int i, View view) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        vg10.s("View with id [", view.getResources().getResourceName(i), "] doesn't exist");
        return null;
    }

    public static boolean f(float f, float f2, View view) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        if (f >= iArr[0] && f <= view.getWidth() + r2) {
            if (f2 >= iArr[1] && f2 <= view.getHeight() + r0) {
                return true;
            }
        }
        return false;
    }

    public static View g(ViewGroup viewGroup, int i) {
        return oo31.f(viewGroup, i, viewGroup, false);
    }

    public static void h(int i, int i2, View view) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(i);
        int paddingLeft = (i2 & 2) != 0 ? dimensionPixelSize : view.getPaddingLeft();
        int paddingTop = (i2 & 8) != 0 ? dimensionPixelSize : view.getPaddingTop();
        int paddingRight = (i2 & 4) != 0 ? dimensionPixelSize : view.getPaddingRight();
        if ((i2 & 1) == 0) {
            dimensionPixelSize = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, dimensionPixelSize);
    }

    public static void i(AlertDialog alertDialog, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        TextView textView = (TextView) alertDialog.findViewById(R.id.message);
        z83.d(textView, "AlertDialog message textview not found");
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }
}
