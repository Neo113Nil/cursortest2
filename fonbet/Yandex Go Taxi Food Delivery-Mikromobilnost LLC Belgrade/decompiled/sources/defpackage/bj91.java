package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Rational;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.camera.core.j;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivTooltip$Position;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class bj91 {
    public static final int[] a = {71, 73};
    public static final int[] b = {HProv.PP_ENUM_LOG, 80};
    public static final int[] c = {255, 216};
    public static final int[] d = {66, 77};
    public static final int[] e = {77, 77};
    public static final int[] f = {73, 73};
    public static final int[] g = {80, 55};
    public static final int[] h = {56, 66};
    public static final int[] i = {80, 49};
    public static final int[] j = {80, 52};
    public static final int[] k = {80, 50};
    public static final int[] l = {80, 53};
    public static final int[] m = {80, 51};
    public static final int[] n = {80, 54};
    public static final int[] o = {151, 74};
    public static final int[] p = {66, 50};
    public static final int[] q = {105, 99};
    public static final int[] r = {177, 104};
    public static final int[] s = {35, 63};

    public static final Rect c(Div2View div2View) {
        Rect rect = new Rect();
        div2View.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public static final boolean e(gil gilVar) {
        return gilVar.i instanceof pil;
    }

    public static final boolean f(gil gilVar, rvo rvoVar) {
        return ((Boolean) gilVar.e.a(rvoVar)).booleanValue();
    }

    public static final Point g(View view, View view2, gil gilVar, rvo rvoVar) {
        int i2;
        int height;
        jnk jnkVar;
        jnk jnkVar2;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int i3 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        Expression expression = gilVar.k;
        x4l x4lVar = gilVar.j;
        DivTooltip$Position divTooltip$Position = (DivTooltip$Position) expression.a(rvoVar);
        int i4 = point.x;
        int[] iArr2 = lil.a;
        switch (iArr2[divTooltip$Position.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i2 = -view.getWidth();
                break;
            case 4:
            case 5:
            case 6:
                i2 = view2.getWidth();
                break;
            case 7:
            case 8:
            case 9:
                i2 = (view2.getWidth() - view.getWidth()) / 2;
                break;
            default:
                w511.b();
                return null;
        }
        point.x = i4 + i2;
        int i5 = point.y;
        switch (iArr2[divTooltip$Position.ordinal()]) {
            case 1:
            case 5:
            case 9:
                height = (view2.getHeight() - view.getHeight()) / 2;
                break;
            case 2:
            case 4:
            case 7:
                height = -view.getHeight();
                break;
            case 3:
            case 6:
            case 8:
                height = view2.getHeight();
                break;
            default:
                w511.b();
                return null;
        }
        point.y = i5 + height;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        point.x += (x4lVar == null || (jnkVar2 = x4lVar.a) == null) ? 0 : a.G(jnkVar2, displayMetrics, rvoVar);
        int i6 = point.y;
        if (x4lVar != null && (jnkVar = x4lVar.b) != null) {
            i3 = a.G(jnkVar, displayMetrics, rvoVar);
        }
        point.y = i6 + i3;
        return point;
    }

    public static HashMap h(Rect rect, boolean z, Rational rational, int i2, int i3, int i4, Map map) {
        boolean z2 = false;
        d6z.m("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((lru0) entry.getValue()).f().getWidth(), ((lru0) entry.getValue()).f().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put((j) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational b2 = androidx.camera.core.internal.utils.a.b(i2, rational);
        if (i3 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, b2.getNumerator(), b2.getDenominator());
            if (i3 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i3 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i3 != 2) {
                    ny61.r(oyr.i(i3, "Unexpected scale type: "));
                    return null;
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i4 == 1);
            boolean z4 = i2 == 0 && !z3;
            boolean z5 = i2 == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i2 == 0 && z3;
                boolean z7 = i2 == 270 && !z3;
                if (z6 || z7) {
                    float centerX = rectF2.centerX();
                    float f2 = centerX + centerX;
                    rectF2 = new RectF(f2 - rectF6.right, rectF6.top, f2 - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i2 == 90 && !z3;
                    boolean z9 = i2 == 180 && z3;
                    if (z8 || z9) {
                        float centerY = rectF2.centerY();
                        float f3 = centerY + centerY;
                        rectF2 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                    } else {
                        boolean z10 = i2 == 180 && !z3;
                        if (i2 == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i2);
                        }
                        float centerY2 = rectF2.centerY();
                        float f4 = centerY2 + centerY2;
                        RectF rectF7 = new RectF(rectF6.left, f4 - rectF6.bottom, rectF6.right, f4 - rectF6.top);
                        float centerX2 = rectF2.centerX();
                        float f5 = centerX2 + centerX2;
                        rectF2 = new RectF(f5 - rectF7.right, rectF7.top, f5 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            hashMap2.put((j) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    public static boolean i(int[] iArr, int[] iArr2) {
        if (iArr.length == 2 || iArr2.length == 2) {
            return iArr[0] == iArr2[0] && iArr[1] == iArr2[1];
        }
        ny61.g("Invalid Byte Pair.");
        return false;
    }

    public static final View j(View view, String str) {
        if (jl40.l(view.getTag(), str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        h8 h8Var = new h8(3, (ViewGroup) view);
        while (h8Var.hasNext()) {
            View j2 = j((View) h8Var.next(), str);
            if (j2 != null) {
                return j2;
            }
        }
        return null;
    }

    public static final Pair k(View view, String str) {
        Object tag = view.getTag(ngh0.div_tooltips_tag);
        List<gil> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (gil gilVar : list) {
                if (jl40.l(gilVar.h, str)) {
                    return new Pair(gilVar, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            h8 h8Var = new h8(3, (ViewGroup) view);
            while (h8Var.hasNext()) {
                Pair k2 = k((View) h8Var.next(), str);
                if (k2 != null) {
                    return k2;
                }
            }
        }
        return null;
    }

    public static String l(String str, boolean z) {
        if (z) {
            if (str.length() <= 11) {
                StringBuilder sb = new StringBuilder(str);
                if (o(1, Extension.O_BRAKE_SPACE, sb) && o(6, Extension.C_BRAKE_SPACE, sb) && o(11, "-", sb)) {
                    o(14, "-", sb);
                }
                return sb.toString();
            }
        } else if (str.length() <= 12) {
            if (str.length() == 12) {
                StringBuilder sb2 = new StringBuilder(str);
                if (o(3, Extension.O_BRAKE_SPACE, sb2) && o(7, Extension.C_BRAKE_SPACE, sb2) && o(12, "-", sb2)) {
                    o(15, "-", sb2);
                }
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(str);
            if (cvu0.x(str, "0", false) && str.length() == 10) {
                if (o(0, Extension.O_BRAKE, sb3) && o(4, Extension.C_BRAKE_SPACE, sb3)) {
                    o(9, "-", sb3);
                }
                return sb3.toString();
            }
            if (o(3, Extension.O_BRAKE_SPACE, sb3) && o(7, Extension.C_BRAKE_SPACE, sb3) && o(11, "-", sb3)) {
                o(14, "-", sb3);
            }
            return sb3.toString();
        }
        return str;
    }

    public static final String m(String str) {
        String str2 = "";
        if (str != null && !evu0.J(str)) {
            String k2 = b64.k("\\D*", str, "");
            boolean z = cvu0.x(str, "8", false) || cvu0.x(str, "+7", false) || cvu0.x(str, "7", false);
            str2 = b64.k("\\s", cvu0.x(str, "+", false) ? "+".concat(l(k2, z)) : l(k2, z), " ");
        }
        if (!evu0.J(str2)) {
            char charAt = str2.charAt(0);
            if (charAt == '7') {
                return "+".concat(str2);
            }
            if (charAt == '8') {
                return new Regex("8").k(str2, "+7");
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x025a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean n(m3k m3kVar) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        List list11;
        List list12;
        List list13;
        List list14;
        List list15;
        List list16;
        List list17;
        List list18;
        List list19;
        List list20;
        List list21;
        List t = m3kVar.d().t();
        if (t == null || t.isEmpty()) {
            if (m3kVar instanceof i2k) {
                DivContainer divContainer = ((i2k) m3kVar).c;
                if (divContainer.b == null && (((list19 = divContainer.d) == null || list19.isEmpty()) && (((list20 = divContainer.r) == null || list20.isEmpty()) && ((list21 = divContainer.G) == null || list21.isEmpty())))) {
                    List list22 = divContainer.B;
                    if (list22 != null) {
                        List list23 = list22;
                        if (!(list23 instanceof Collection) || !list23.isEmpty()) {
                            Iterator it = list23.iterator();
                            while (it.hasNext()) {
                                if (n((m3k) it.next())) {
                                }
                            }
                        }
                    }
                    return false;
                }
            } else {
                if (m3kVar instanceof j2k) {
                    List list24 = ((j2k) m3kVar).c.q;
                    if (list24 != null) {
                        List list25 = list24;
                        if (!(list25 instanceof Collection) || !list25.isEmpty()) {
                            Iterator it2 = list25.iterator();
                            while (it2.hasNext()) {
                                if (n((m3k) it2.next())) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (!(m3kVar instanceof k2k)) {
                    if (m3kVar instanceof l2k) {
                        xrk xrkVar = ((l2k) m3kVar).c;
                        if (xrkVar.b == null && (((list16 = xrkVar.d) == null || list16.isEmpty()) && (((list17 = xrkVar.q) == null || list17.isEmpty()) && ((list18 = xrkVar.A) == null || list18.isEmpty())))) {
                            return false;
                        }
                    } else if (m3kVar instanceof m2k) {
                        hsk hskVar = ((m2k) m3kVar).c;
                        if (hskVar.b == null && (((list13 = hskVar.d) == null || list13.isEmpty()) && (((list14 = hskVar.q) == null || list14.isEmpty()) && ((list15 = hskVar.A) == null || list15.isEmpty())))) {
                            List list26 = hskVar.y;
                            if (list26 != null) {
                                List list27 = list26;
                                if (!(list27 instanceof Collection) || !list27.isEmpty()) {
                                    Iterator it3 = list27.iterator();
                                    while (it3.hasNext()) {
                                        if (n((m3k) it3.next())) {
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                    } else {
                        if (!(m3kVar instanceof n2k)) {
                            if (!(m3kVar instanceof o2k)) {
                                if (!(m3kVar instanceof p2k) && !(m3kVar instanceof q2k) && !(m3kVar instanceof r2k)) {
                                    if (m3kVar instanceof s2k) {
                                        DivSeparator divSeparator = ((s2k) m3kVar).c;
                                        if (divSeparator.b != null || (((list7 = divSeparator.d) != null && !list7.isEmpty()) || (((list8 = divSeparator.o) != null && !list8.isEmpty()) || ((list9 = divSeparator.x) != null && !list9.isEmpty())))) {
                                        }
                                    } else if (!(m3kVar instanceof t2k)) {
                                        if (m3kVar instanceof u2k) {
                                            dbl dblVar = ((u2k) m3kVar).c;
                                            if (dblVar.b == null && (((list4 = dblVar.d) == null || list4.isEmpty()) && (((list5 = dblVar.q) == null || list5.isEmpty()) && ((list6 = dblVar.z) == null || list6.isEmpty())))) {
                                                List list28 = dblVar.I;
                                                if (!(list28 instanceof Collection) || !list28.isEmpty()) {
                                                    Iterator it4 = list28.iterator();
                                                    while (it4.hasNext()) {
                                                        m3k m3kVar2 = ((cbl) it4.next()).c;
                                                        if (m3kVar2 == null || !n(m3kVar2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (!(m3kVar instanceof v2k) && !(m3kVar instanceof w2k)) {
                                            if (m3kVar instanceof x2k) {
                                                ffl fflVar = ((x2k) m3kVar).c;
                                                if (fflVar.b != null || (((list = fflVar.d) != null && !list.isEmpty()) || (((list2 = fflVar.o) != null && !list2.isEmpty()) || ((list3 = fflVar.J) != null && !list3.isEmpty())))) {
                                                }
                                            } else if (!(m3kVar instanceof y2k)) {
                                                w511.b();
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        psk pskVar = ((n2k) m3kVar).c;
                        if (pskVar.b != null || (((list10 = pskVar.d) != null && !list10.isEmpty()) || (((list11 = pskVar.r) != null && !list11.isEmpty()) || ((list12 = pskVar.D) != null && !list12.isEmpty())))) {
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean o(int i2, String str, StringBuilder sb) {
        if (sb.length() <= i2) {
            return false;
        }
        sb.insert(i2, str);
        return true;
    }

    public static final void p(View view, yh yhVar) {
        if (view != null && yhVar.a(view.getContext())) {
            view.sendAccessibilityEventUnchecked(Build.VERSION.SDK_INT >= 30 ? ai.C() : AccessibilityEvent.obtain(32));
        }
    }
}
