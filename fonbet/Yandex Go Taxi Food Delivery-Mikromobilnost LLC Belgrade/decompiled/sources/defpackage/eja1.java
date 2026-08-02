package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.UserManager;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.room.util.a;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import com.google.android.material.internal.e;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.zone.dto.objects.VerticalType;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.pay.api.exception.PlusPayApiException;
import com.yandex.plus.pay.api.exception.PlusPayNetworkException;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.exception.PlusPaySslException;
import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.sequences.b;
import kotlinx.datetime.internal.format.c;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes.dex */
public abstract class eja1 {
    public static UserManager a;
    public static volatile boolean b;
    public static final zrk c = new zrk(27);
    public static final Object d = new Object();
    public static boolean e;
    public static int f;
    public static vit g;

    public static void A(ViewGroup viewGroup, float f2) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f2);
        }
    }

    public static void B(View view, MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            materialShapeDrawable.setParentAbsoluteElevation(e.g(view));
        }
    }

    public static void C(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            B(viewGroup, (MaterialShapeDrawable) background);
        }
    }

    public static final boolean D(ComponentName componentName, Context context, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(componentName);
            if (z) {
                if (componentEnabledSetting != 1) {
                    context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    return true;
                }
            } else if (componentEnabledSetting != 2) {
                context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static final int E(float f2, float[] fArr, int i) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static b0r a(oq90 oq90Var, r1r r1rVar, String str, qci0 qci0Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            qci0Var = null;
        }
        return new b0r(oq90Var, r1rVar, str, qci0Var);
    }

    public static bdt0 b(qq6 qq6Var, r1r r1rVar) {
        return new bdt0(qq6Var, r1rVar, null);
    }

    public static final long c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            jxv.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32);
        int i3 = asy0.c;
        return j;
    }

    public static final yw01 d(String str, List list) {
        List list2 = list;
        return new yw01(b.l(b.p(b.g(new h73(1, list2), new e3r0(str, false, 1 == true ? 1 : 0)), b.g(new h73(1 == true ? 1 : 0, list2), new e3r0(str, 1 == true ? 1 : 0, 1 == true ? 1 : 0))), new u431(10)), new u431(11));
    }

    public static final void e(ListBuilder listBuilder, s7s s7sVar) {
        if (s7sVar instanceof xd5) {
            listBuilder.add(((xd5) s7sVar).a);
            return;
        }
        if (s7sVar instanceof uwd) {
            Iterator it = ((uwd) s7sVar).a.iterator();
            while (it.hasNext()) {
                e(listBuilder, (je60) it.next());
            }
            return;
        }
        if (s7sVar instanceof u6e) {
            return;
        }
        if (s7sVar instanceof kotlinx.datetime.internal.format.e) {
            e(listBuilder, ((kotlinx.datetime.internal.format.e) s7sVar).a);
            return;
        }
        if (!(s7sVar instanceof oy1)) {
            if (s7sVar instanceof c) {
                e(listBuilder, ((c) s7sVar).b);
                return;
            } else {
                w511.b();
                return;
            }
        }
        oy1 oy1Var = (oy1) s7sVar;
        e(listBuilder, oy1Var.a);
        Iterator it2 = oy1Var.b.iterator();
        while (it2.hasNext()) {
            e(listBuilder, (s7s) it2.next());
        }
    }

    public static void f(mkw0 mkw0Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                mkw0Var.p(i);
            } else if (obj instanceof byte[]) {
                mkw0Var.m(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                mkw0Var.z(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                mkw0Var.z(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                mkw0Var.b(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                mkw0Var.b(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                mkw0Var.b(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                mkw0Var.b(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                mkw0Var.m0(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                mkw0Var.b(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static final Object g(Class cls) {
        if (!cls.isAnnotationPresent(f0d.class)) {
            w511.g(cls, " is not a builder for a Yatagan component");
            return null;
        }
        String name = cls.getName();
        int L = evu0.L("$", name, 6);
        if (L != -1) {
            name = name.substring(0, L);
        }
        if (name.equals(cls.getName())) {
            w511.f(qv10.l(cls, "No enclosing component class found for "));
            return null;
        }
        Class<?> loadClass = cls.getClassLoader().loadClass(name);
        i0d i0dVar = (i0d) loadClass.getAnnotation(i0d.class);
        if (i0dVar == null || !i0dVar.isRoot()) {
            w511.g(loadClass, " is not a root Yatagan component");
            return null;
        }
        String name2 = loadClass.getName();
        int K = evu0.K(name2, '.', 0, 6);
        Pair pair = K == -1 ? new Pair("", name2) : new Pair(name2.substring(0, K), name2.substring(K + 1));
        return cls.cast(loadClass.getClassLoader().loadClass(g8e.p((String) pair.getFirst(), ".Yatagan$", (String) pair.getSecond())).getDeclaredMethod("builder", null).invoke(null, null));
    }

    public static final boolean h(Uri uri, fpl fplVar) {
        String authority;
        return (uri == null || (authority = uri.getAuthority()) == null || !"download".equals(authority) || uri.getQueryParameter("url") == null || !(fplVar instanceof Div2View)) ? false : true;
    }

    public static final void i(androidx.work.impl.b bVar, String str) {
        d b2;
        WorkDatabase workDatabase = bVar.c;
        ia51 X0 = workDatabase.X0();
        ywi S0 = workDatabase.S0();
        ArrayList i = scc.i(str);
        while (!i.isEmpty()) {
            String str2 = (String) ycc.z(i);
            WorkInfo$State c2 = X0.c(str2);
            if (c2 != WorkInfo$State.SUCCEEDED && c2 != WorkInfo$State.FAILED) {
                ((Number) a.b(X0.a, false, true, new lv21(str2, 6))).intValue();
            }
            i.addAll(S0.a(str2));
        }
        r6f0 r6f0Var = bVar.f;
        synchronized (r6f0Var.k) {
            hgz.g().getClass();
            r6f0Var.i.add(str);
            b2 = r6f0Var.b(str);
        }
        r6f0.d(b2, 1);
        Iterator it = bVar.e.iterator();
        while (it.hasNext()) {
            ((kom0) it.next()).c(str);
        }
    }

    public static final long j(int i, long j) {
        int i2 = asy0.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : c(i4, i);
    }

    public static final int k(ull0 ull0Var, String str) {
        int columnCount = ull0Var.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(ull0Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String l = unr0.l('`', "`", str);
        int columnCount2 = ull0Var.getColumnCount();
        while (true) {
            if (i >= columnCount2) {
                i = -1;
                break;
            }
            if (l.equals(ull0Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static final Activity l(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return l(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static zre m(int i) {
        if (i != 0 && i == 1) {
            return new lnf();
        }
        return new dyk0();
    }

    public static void n() {
        if (up11.c.e() != 0) {
            return;
        }
        try {
            int[] iArr = up11.a;
            for (int i = 0; i < 4; i++) {
                int i2 = iArr[i];
                int[] iArr2 = up11.b;
                for (int i3 = 0; i3 < 6; i3++) {
                    int i4 = iArr2[i3];
                    up11.c.d((i2 << 4) + i4, up11.d.b(i4, i2));
                }
            }
        } catch (Exception e2) {
            xby.d.k(e2, "Failed to load fonts");
        }
    }

    public static final ArrayList o(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Promotion) obj).getK().contains(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final lea0 p(oea0 oea0Var, m6a0 m6a0Var) {
        Object obj;
        Iterator it = oea0Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            lea0 lea0Var = (lea0) next;
            if (jl40.l(lea0Var.getId(), m6a0Var != null ? m6a0Var.b : null)) {
                if (lea0Var.c() == (m6a0Var != null ? m6a0Var.a : null)) {
                    obj = next;
                    break;
                }
            }
        }
        return (lea0) obj;
    }

    public static final r5x q(List list) {
        o5x p5xVar;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof String) {
                p5xVar = new q5x((String) obj);
            } else if (obj instanceof Integer) {
                p5xVar = new p5x(((Number) obj).intValue());
            } else {
                if (!(obj instanceof Long)) {
                    vg10.g(qoi0.a(r5x.class).c(), "Unsupported fragment of type ");
                    return null;
                }
                p5xVar = new p5x((int) ((Number) obj).longValue());
            }
            arrayList.add(p5xVar);
        }
        return new r5x(arrayList);
    }

    public static final int r(ull0 ull0Var, String str) {
        int k = k(ull0Var, str);
        if (k >= 0) {
            return k;
        }
        int columnCount = ull0Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(ull0Var.getColumnName(i));
        }
        xfo.e(93, str, "' does not exist. Available columns: [", kotlin.collections.a.X(arrayList, null, null, null, null, 63), "Column '");
        return 0;
    }

    public static final p s(pey peyVar) {
        return r.a(peyVar.getLifecycle());
    }

    public static final mwj0 t(NetworkResponse networkResponse, wls wlsVar) {
        Throwable plusPayApiException;
        if (networkResponse instanceof mz50) {
            mz50 mz50Var = (mz50) networkResponse;
            return new mwj0(mz50Var.a(), mz50Var.getRequestId());
        }
        if (!(networkResponse instanceof kz50)) {
            w511.b();
            return null;
        }
        kz50 kz50Var = (kz50) networkResponse;
        kzj0 kzj0Var = kz50Var.a;
        if (kzj0Var instanceof ezj0) {
            plusPayApiException = new PlusPayApiException((ezj0) kzj0Var);
        } else if (kzj0Var instanceof izj0) {
            plusPayApiException = new PlusPayUnauthorizedException((izj0) kzj0Var);
        } else if (kzj0Var instanceof gzj0) {
            plusPayApiException = new PlusPayParseException((gzj0) kzj0Var);
        } else if (kzj0Var instanceof hzj0) {
            plusPayApiException = new PlusPaySslException((hzj0) kzj0Var);
        } else if (kzj0Var instanceof fzj0) {
            plusPayApiException = new PlusPayNetworkException(kzj0Var);
        } else {
            if (!(kzj0Var instanceof jzj0)) {
                w511.b();
                return null;
            }
            plusPayApiException = new PlusPayUnexpectedException(((jzj0) kzj0Var).a());
        }
        wlsVar.invoke(kz50Var.b, plusPayApiException);
        throw plusPayApiException;
    }

    public static final Size v(Activity activity) {
        DisplayMetrics displayMetrics;
        Rect bounds;
        Rect bounds2;
        WindowManager windowManager = (WindowManager) activity.getSystemService(WindowManager.class);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = activity.isInMultiWindowMode() ? windowManager.getCurrentWindowMetrics() : windowManager.getMaximumWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            int width = bounds.width();
            bounds2 = currentWindowMetrics.getBounds();
            return new Size(width, bounds2.height());
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            displayMetrics = activity.getResources().getDisplayMetrics();
        }
        return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Typeface w(int i, int i2) {
        n();
        pnt0 pnt0Var = up11.c;
        Typeface typeface = (Typeface) pnt0Var.b((i2 << 4) + i);
        if (typeface != null) {
            return typeface;
        }
        if (pnt0Var.e() == 0) {
            xby.d.j(new IllegalStateException("Fonts not initialized"));
            return Typeface.DEFAULT;
        }
        xby.d.k(new IllegalStateException("Missing typeface"), "No typeface '" + i + "' found");
        return (Typeface) pnt0Var.f(0);
    }

    public static final boolean x(List list) {
        List<za31> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (za31 za31Var : list2) {
            if (za31Var.a.c == VerticalType.MIXED && jl40.l(za31Var.d, "transport")) {
                return true;
            }
        }
        return false;
    }

    public static final f530 y(f530 f530Var, tls tlsVar) {
        return f530Var.k(new my60(tlsVar));
    }

    public static jdo z(String str) {
        return jl40.G(str, rzo.c0(str));
    }
}
