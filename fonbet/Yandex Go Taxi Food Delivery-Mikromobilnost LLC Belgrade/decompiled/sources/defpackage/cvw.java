package defpackage;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.s;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.b;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.g;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.apollographql.apollo3.exception.JsonDataException;
import com.arkivanov.mvikotlin.extensions.coroutines.StoreExtKt$special$$inlined$toFlow$2;
import com.yandex.go.design.view.GoLinearLayout;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;

/* loaded from: classes9.dex */
public abstract class cvw {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];
    public static final uh d = new uh(Boolean.TRUE);
    public static final zii0 e = new zii0(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r5 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void A(tls tlsVar, wx40 wx40Var, bnq0 bnq0Var, bnq0 bnq0Var2, c cVar, c cVar2) {
        s sVar;
        boolean z;
        zii0 C;
        tls tlsVar2 = tlsVar;
        wx40 wx40Var2 = wx40Var;
        c cVar3 = cVar;
        int i = cVar3.f;
        Region region = bnq0Var.a;
        bnq0 bnq0Var3 = bnq0Var2;
        Region region2 = bnq0Var3.a;
        LayoutNode layoutNode = cVar2.c;
        cnq0 cnq0Var = cVar2.d;
        LayoutNode layoutNode2 = cVar2.c;
        int i2 = cVar2.f;
        boolean z2 = (layoutNode.G() && layoutNode2.F()) ? false : true;
        if (region2.isEmpty() && i2 != i) {
            return;
        }
        if (z2 && !cVar2.o()) {
            return;
        }
        f6w P = s8o.P(cVar2.n());
        bnq0Var.a(P);
        if (i2 == i) {
            i2 = -1;
        }
        if (!region.op(region2, Region.Op.INTERSECT)) {
            if (cVar2.o()) {
                z(wx40Var2, cVar3, cVar2);
                return;
            } else {
                if (i2 == -1) {
                    Rect bounds = region.getBounds();
                    wx40Var2.i(i2, new jnq0(cVar2, new f6w(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        Rect bounds2 = region.getBounds();
        wx40Var2.i(i2, new jnq0(cVar2, new f6w(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        List j = c.j(cVar2, 4);
        if (cnq0Var.c) {
            c l = cVar2.l();
            while (true) {
                sVar = null;
                if (l == null) {
                    l = null;
                    break;
                }
                hz40 hz40Var = l.d.a;
                if (hz40Var.b(d.w) || hz40Var.b(d.v)) {
                    break;
                } else {
                    l = l.l();
                }
            }
            if (l != null) {
                s d2 = cVar2.d();
                if (d2 != null) {
                    if (!d2.d()) {
                        d2 = null;
                    }
                }
                d2 = null;
                s d3 = l.d();
                if (d3 != null) {
                    if (!d3.d()) {
                        d3 = null;
                    }
                    if (d3 != null) {
                        sVar = d3;
                    }
                }
                if (d2 != null && sVar != null) {
                    zii0 j2 = sVar.j(d2, false);
                    z = !j2.equals(j2.f(wwg.b(0L, rzo.a0(sVar.c))));
                    if (z) {
                        bnq0 bnq0Var4 = new bnq0();
                        gnq0 f = cVar2.f();
                        if (f == null) {
                            f fVar = (f) layoutNode2.a0.d;
                            C = gwk0.o(fVar).j(fVar, false);
                        } else {
                            C = ffx.C(f.getNode(), b.a(cnq0Var, a.b) != null, false);
                        }
                        bnq0Var4.a(s8o.P(C));
                        int size = j.size() - 1;
                        while (-1 < size) {
                            if (!((Boolean) tlsVar2.invoke(j.get(size))).booleanValue()) {
                                y(tlsVar2, wx40Var2, new bnq0(), bnq0Var4, cVar3, (c) j.get(size));
                            }
                            size--;
                            wx40Var2 = wx40Var;
                            cVar3 = cVar;
                        }
                        if (Q(cVar2)) {
                            return;
                        }
                        region2.op(P.a, P.b, P.c, P.d, Region.Op.DIFFERENCE);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        int size2 = j.size() - 1;
        while (-1 < size2) {
            if (!((Boolean) tlsVar2.invoke(j.get(size2))).booleanValue()) {
                A(tlsVar2, wx40Var, bnq0Var, bnq0Var3, cVar, (c) j.get(size2));
            }
            size2--;
            tlsVar2 = tlsVar;
            bnq0Var3 = bnq0Var2;
        }
        if (Q(cVar2)) {
        }
    }

    public static final kotlinx.coroutines.flow.b F(wkh wkhVar) {
        return e.g(new StoreExtKt$special$$inlined$toFlow$2(wkhVar, null));
    }

    public static final s7q0 H(Object obj) {
        if (obj != rzo.a) {
            return (s7q0) obj;
        }
        ny61.r("Does not contain segment");
        return null;
    }

    public static final String J(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }

    public static final String K(pr20 pr20Var) {
        String str;
        lq20 lq20Var = pr20Var.a;
        return (!pr20Var.b || (str = lq20Var.g) == null || evu0.J(str)) ? lq20Var.d : lq20Var.g;
    }

    public static final int L(j63 j63Var, Object obj, int i) {
        int i2 = j63Var.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int c2 = c(j63Var.a, i2, i);
            if (c2 < 0 || jl40.l(obj, j63Var.b[c2])) {
                return c2;
            }
            int i3 = c2 + 1;
            while (i3 < i2 && j63Var.a[i3] == i) {
                if (jl40.l(obj, j63Var.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = c2 - 1; i4 >= 0 && j63Var.a[i4] == i; i4--) {
                if (jl40.l(obj, j63Var.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            ny61.y();
            return 0;
        }
    }

    public static final long M(long j) {
        if (j < 0) {
            o430 o430Var = e3n.b;
            return e3n.w;
        }
        o430 o430Var2 = e3n.b;
        return e3n.c;
    }

    public static tku N(int i, int i2, int i3) {
        tku tkuVar = new tku(Math.max(i, 1), Math.min(i2, 2147483646), i3, true);
        if (i3 > 1002) {
            Log.e("Histogram", String.format(Locale.US, "Number of buckets was limited to %d instead of requested %d.", Arrays.copyOf(new Object[]{1002, Integer.valueOf(tkuVar.d)}, 2)));
            tkuVar.a = false;
            tkuVar.d = 1002;
        }
        if (tkuVar.b > tkuVar.c) {
            Log.e("Histogram", "Minimum value is greater than maximum value, they were swaped.");
            tkuVar.a = false;
            int i4 = tkuVar.b;
            tkuVar.b = tkuVar.c;
            tkuVar.c = i4;
        }
        int i5 = tkuVar.d;
        if (i5 < 3) {
            Log.e("Histogram", String.format(Locale.US, "Minimum number of buckets was increased to 3 instead of requested %d.", Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1)));
            tkuVar.a = false;
            tkuVar.d = 3;
        }
        int i6 = (tkuVar.c - tkuVar.b) + 2;
        if (tkuVar.d > i6) {
            Log.e("Histogram", String.format(Locale.US, "Number buckets was limited to %d according to minimum and maximum value.", Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1)));
            tkuVar.a = false;
            tkuVar.d = i6;
        }
        return tkuVar;
    }

    public static final boolean O(Object obj) {
        return obj == rzo.a;
    }

    public static final boolean P(c cVar) {
        s d2 = cVar.d();
        hz40 hz40Var = cVar.d.a;
        return (d2 != null ? d2.j1() : false) || hz40Var.b(d.q) || hz40Var.b(d.p);
    }

    public static final boolean Q(c cVar) {
        if (!P(cVar)) {
            cnq0 cnq0Var = cVar.d;
            if (cnq0Var.c) {
                return true;
            }
            hz40 hz40Var = cnq0Var.a;
            Object[] objArr = hz40Var.b;
            Object[] objArr2 = hz40Var.c;
            long[] jArr = hz40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((g) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [fc70] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static final vo2 S(fc70 fc70Var, xdx xdxVar, com.apollographql.apollo3.api.c cVar) {
        ?? r10;
        Map map;
        za70 za70Var;
        List list;
        za70 za70Var2;
        ek00 ek00Var = new ek00();
        ek00Var.u();
        vkf vkfVar = new vkf();
        Map map2 = cVar.c;
        vkfVar.a.putAll(map2);
        j70 j70Var = cVar.a;
        i70 a2 = j70Var.a();
        a2.c = Boolean.TRUE;
        vkfVar.b = a2.a();
        fc70Var.a(ek00Var, vkfVar.a());
        ek00Var.y();
        gko gkoVar = new gko((Map) ek00Var.c());
        vkf vkfVar2 = new vkf();
        vkfVar2.a.putAll(map2);
        i70 a3 = j70Var.a();
        a3.a = gkoVar;
        vkfVar2.b = a3.a();
        com.apollographql.apollo3.api.c a4 = vkfVar2.a();
        vo2 vo2Var = null;
        try {
            xdxVar.u();
            map = null;
            za70Var = null;
            list = null;
            while (xdxVar.hasNext()) {
                String nextName = xdxVar.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode != -1809421292) {
                    if (hashCode != -1294635157) {
                        if (hashCode == 3076010 && nextName.equals(Constants.KEY_DATA)) {
                            ep60 adapter = fc70Var.adapter();
                            foe foeVar = l80.a;
                            if (xdxVar.peek() == JsonReader$Token.NULL) {
                                xdxVar.skipValue();
                                za70Var2 = null;
                            } else {
                                za70Var2 = adapter.b(xdxVar, a4);
                            }
                            za70Var = za70Var2;
                        }
                        xdxVar.skipValue();
                    } else if (nextName.equals("errors")) {
                        list = qna1.h(xdxVar);
                    } else {
                        xdxVar.skipValue();
                    }
                } else if (nextName.equals("extensions")) {
                    Object y = ooc.y(xdxVar);
                    map = y instanceof Map ? (Map) y : null;
                } else {
                    xdxVar.skipValue();
                }
            }
            xdxVar.y();
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                xdxVar.close();
                r10 = th2;
            } catch (Throwable th3) {
                ljo.a(th2, th3);
                r10 = th2;
            }
        }
        if (xdxVar.peek() != JsonReader$Token.END_DOCUMENT) {
            throw new JsonDataException("Expected END_DOCUMENT but was " + xdxVar.peek());
        }
        UUID randomUUID = UUID.randomUUID();
        ovn ovnVar = ovn.a;
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        vo2 vo2Var2 = new vo2(randomUUID, fc70Var, za70Var, list, map, ovnVar, false);
        try {
            xdxVar.close();
        } catch (Throwable th4) {
            vo2Var = th4;
        }
        r10 = vo2Var;
        vo2Var = vo2Var2;
        if (r10 == 0) {
            return vo2Var;
        }
        throw r10;
    }

    public static fse U(fse fseVar, fse fseVar2) {
        return fseVar2 == EmptyCoroutineContext.a ? fseVar : (fse) fseVar2.fold(fseVar, new sdd(29));
    }

    public static final Object V(Object[] objArr, sls slsVar, fid fidVar, int i) {
        return X(Arrays.copyOf(objArr, objArr.length), vng.d, slsVar, fidVar, ((i << 6) & 7168) | 384, 0);
    }

    public static final Object W(Object[] objArr, m2m0 m2m0Var, sls slsVar, fid fidVar, int i) {
        return X(Arrays.copyOf(objArr, objArr.length), m2m0Var, slsVar, fidVar, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object X(Object[] objArr, m2m0 m2m0Var, sls slsVar, fid fidVar, int i, int i2) {
        Object[] objArr2;
        m2m0 m2m0Var2;
        final Object obj;
        Object e2;
        bts btsVar = (bts) fidVar;
        long j = btsVar.T;
        rza.a(36);
        final String l = Long.toString(j, 36);
        final l1m0 l1m0Var = (l1m0) btsVar.m(n1m0.a);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Object a2 = (l1m0Var == null || (e2 = l1m0Var.e(l)) == null) ? null : m2m0Var.a(e2);
            if (a2 == null) {
                a2 = slsVar.invoke();
            }
            objArr2 = objArr;
            m2m0Var2 = m2m0Var;
            g1m0 g1m0Var = new g1m0(m2m0Var2, l1m0Var, l, a2, objArr2);
            btsVar.o0(g1m0Var);
            Q = g1m0Var;
        } else {
            objArr2 = objArr;
            m2m0Var2 = m2m0Var;
        }
        final g1m0 g1m0Var2 = (g1m0) Q;
        Object obj2 = Arrays.equals(objArr2, g1m0Var2.x) ? g1m0Var2.w : null;
        if (obj2 == null) {
            obj2 = slsVar.invoke();
        }
        boolean e3 = btsVar.e(g1m0Var2) | ((((i & 112) ^ 48) > 32 && btsVar.e(m2m0Var2)) || (i & 48) == 32) | btsVar.e(l1m0Var) | btsVar.k(l) | btsVar.e(obj2) | btsVar.e(objArr2);
        Object Q2 = btsVar.Q();
        if (e3 || Q2 == o430Var) {
            final Object[] objArr3 = objArr2;
            obj = obj2;
            final m2m0 m2m0Var3 = m2m0Var2;
            sls slsVar2 = new sls() { // from class: eui0
                @Override // defpackage.sls
                public final Object invoke() {
                    boolean z;
                    g1m0 g1m0Var3 = g1m0.this;
                    l1m0 l1m0Var2 = g1m0Var3.b;
                    l1m0 l1m0Var3 = l1m0Var;
                    boolean z2 = true;
                    if (l1m0Var2 != l1m0Var3) {
                        g1m0Var3.b = l1m0Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = g1m0Var3.c;
                    String str2 = l;
                    if (jl40.l(str, str2)) {
                        z2 = z;
                    } else {
                        g1m0Var3.c = str2;
                    }
                    g1m0Var3.a = m2m0Var3;
                    g1m0Var3.w = obj;
                    g1m0Var3.x = objArr3;
                    k1m0 k1m0Var = g1m0Var3.y;
                    if (k1m0Var != null && z2) {
                        ((jb7) k1m0Var).x();
                        g1m0Var3.y = null;
                        g1m0Var3.a();
                    }
                    return zy11.a;
                }
            };
            btsVar.o0(slsVar2);
            Q2 = slsVar2;
        } else {
            obj = obj2;
        }
        zpn.i((sls) Q2, btsVar);
        return obj;
    }

    public static final kr Y(kr krVar, tls tlsVar) {
        if (((Boolean) tlsVar.invoke(krVar)).booleanValue()) {
            return null;
        }
        if (!(krVar instanceof gqy)) {
            return krVar;
        }
        List list = ((gqy) krVar).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kr Y = Y((kr) it.next(), tlsVar);
            if (Y != null) {
                arrayList.add(Y);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (kr) arrayList.get(0) : new gqy(arrayList);
    }

    public static final long Z(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return kp50.V(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return e3n.q(M(j3));
        }
        long convert = durationUnit.getTimeUnit().convert(1L, durationUnit2.getTimeUnit());
        long j4 = (j / convert) - (j2 / convert);
        long j5 = (j % convert) - (j2 % convert);
        o430 o430Var = e3n.b;
        return e3n.k(kp50.V(j4, durationUnit2), kp50.V(j5, durationUnit));
    }

    public static final void a(int i) {
        if (i > 0) {
            return;
        }
        ny61.g("px must be > 0.");
    }

    public static final void a0(final int i, View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.yandex.taxi.design.utils.ViewsExtensionsKt$setRoundedOutline$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), i);
            }
        });
        view.setClipToOutline(true);
    }

    public static final int b(long j, int i, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final void b0(View view, Drawable drawable, Integer num, Integer num2) {
        e0(view, drawable, num != null ? Integer.valueOf(ru.yandex.taxi.design.utils.c.d(num.intValue(), view)) : null, num2 != null ? Integer.valueOf(ru.yandex.taxi.design.utils.c.d(num2.intValue(), view)) : null, 8);
    }

    public static final int c(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void c0(View view, Drawable drawable) {
        e0(view, drawable, null, null, 8);
    }

    public static void d(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.g(str);
    }

    public static final void d0(View view, Drawable drawable, Integer num, Integer num2, Integer num3) {
        Rect rect = new Rect();
        drawable.getPadding(rect);
        view.setBackground(drawable);
        if (num2 != null) {
            view.setPadding(num2.intValue() + rect.left, num2.intValue() + rect.top, num2.intValue() + rect.right, num2.intValue() + rect.bottom);
        }
        int intValue = num != null ? num.intValue() : 0;
        int intValue2 = num3 != null ? num3.intValue() : 0;
        xw31.E(view, Integer.valueOf((-rect.left) + intValue), Integer.valueOf((-rect.top) + intValue2), Integer.valueOf((-rect.right) + intValue), Integer.valueOf((-rect.bottom) + intValue2));
    }

    public static void e(boolean z) {
        if (z) {
            return;
        }
        w511.q();
    }

    public static /* synthetic */ void e0(View view, Drawable drawable, Integer num, Integer num2, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        d0(view, drawable, num, num2, null);
    }

    public static void f(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void f0(GoLinearLayout goLinearLayout, Drawable drawable, int i) {
        Rect rect = new Rect();
        drawable.getPadding(rect);
        goLinearLayout.setBackground(drawable);
        goLinearLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + i);
        xw31.E(goLinearLayout, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
    }

    public static void g(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            g8e.D(sb, "Must be called on ", name2, " thread, but got ", name);
            w511.o(sb, Extension.DOT_CHAR);
        }
    }

    public static final void g0(int i, int i2, View view) {
        view.setBackgroundColor(i);
        view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(i2));
        view.setClipToOutline(true);
    }

    public static void h(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        ny61.r(str);
    }

    public static String h0(JSONArray jSONArray) {
        return vng.j(jSONArray, 1).toString();
    }

    public static void i(String str) {
        if (TextUtils.isEmpty(str)) {
            ny61.g("Given String is empty or null");
        }
    }

    public static String i0(JSONObject jSONObject) {
        return vng.k(jSONObject, 1).toString();
    }

    public static void j(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ny61.g(str2);
        }
    }

    public static String j0(long j) {
        return v(j, 12884901888L) ? "Rgb" : v(j, 12884901889L) ? "Xyz" : v(j, 12884901890L) ? "Lab" : v(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static void k(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        ny61.r(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable k0(Drawable drawable) {
        return drawable instanceof kb51 ? ((kb51) drawable).getWrappedDrawable() : drawable;
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        ny61.t("null reference");
    }

    public static int l0(int i, int i2) {
        if (i2 < 0) {
            ny61.g("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(str);
    }

    public static void n(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.r(str);
    }

    public static void o(boolean z) {
        if (z) {
            return;
        }
        ny61.k();
    }

    public static ih61 p(Context context) {
        o370 o370Var;
        synchronized (jx81.class) {
            try {
                if (jx81.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    jx81.a = new o370(context, 25);
                }
                o370Var = jx81.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (ih61) ((fi61) o370Var.a).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0077, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ByteString q(String str) {
        int i;
        char charAt;
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                char charAt2 = str.charAt(i3);
                if ('A' <= charAt2 && charAt2 < '[') {
                    i = charAt2 - 'A';
                } else if ('a' <= charAt2 && charAt2 < '{') {
                    i = charAt2 - 'G';
                } else if ('0' <= charAt2 && charAt2 < ':') {
                    i = charAt2 + 4;
                } else if (charAt2 == '+' || charAt2 == '-') {
                    i = 62;
                } else if (charAt2 == '/' || charAt2 == '_') {
                    i = 63;
                } else {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        break;
                    }
                    i3++;
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    bArr2[i6] = (byte) (i5 >> 16);
                    int i7 = i6 + 2;
                    bArr2[i6 + 1] = (byte) (i5 >> 8);
                    i6 += 3;
                    bArr2[i7] = (byte) i5;
                }
                i3++;
            } else {
                int i8 = i4 % 4;
                if (i8 != 1) {
                    if (i8 == 2) {
                        bArr2[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i8 == 3) {
                        int i9 = i5 << 6;
                        int i10 = i6 + 1;
                        bArr2[i6] = (byte) (i9 >> 16);
                        i6 += 2;
                        bArr2[i10] = (byte) (i9 >> 8);
                    }
                    if (i6 != i2) {
                        bArr2 = Arrays.copyOf(bArr2, i6);
                    }
                }
            }
        }
        if (bArr2 != null) {
            return new ByteString(bArr2);
        }
        return null;
    }

    public static ByteString r(String str) {
        if (str.length() % 2 != 0) {
            w511.f("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (sb2.e(str.charAt(i2 + 1)) + (sb2.e(str.charAt(i2)) << 4));
        }
        return new ByteString(bArr);
    }

    public static ByteString u(String str) {
        ByteString byteString = new ByteString(str.getBytes(uza.a));
        byteString.b = str;
        return byteString;
    }

    public static final boolean v(long j, long j2) {
        return j == j2;
    }

    public static final String w(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final wx40 x(knq0 knq0Var, tls tlsVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            c a2 = knq0Var.a();
            LayoutNode layoutNode = a2.c;
            if (layoutNode.G() && layoutNode.F()) {
                zii0 g = a2.g();
                wx40 wx40Var = new wx40(48);
                bnq0 bnq0Var = new bnq0();
                bnq0Var.a(s8o.P(g));
                A(tlsVar, wx40Var, new bnq0(), bnq0Var, a2, a2);
                return wx40Var;
            }
            return y5w.a;
        } finally {
            Trace.endSection();
        }
    }

    public static final void y(tls tlsVar, wx40 wx40Var, bnq0 bnq0Var, bnq0 bnq0Var2, c cVar, c cVar2) {
        bnq0 bnq0Var3 = bnq0Var;
        Region region = bnq0Var3.a;
        bnq0 bnq0Var4 = bnq0Var2;
        Region region2 = bnq0Var4.a;
        LayoutNode layoutNode = cVar2.c;
        LayoutNode layoutNode2 = cVar2.c;
        if (!layoutNode.G() || !layoutNode2.F() || region2.isEmpty()) {
            if (cVar2.o()) {
                z(wx40Var, cVar, cVar2);
                return;
            }
            return;
        }
        zii0 n = cVar2.n();
        if (n.g()) {
            gnq0 f = cVar2.f();
            if (f == null) {
                f fVar = (f) layoutNode2.a0.d;
                n = gwk0.o(fVar).j(fVar, false);
            } else {
                n = ffx.C(f.getNode(), b.a(cVar2.d, a.b) != null, false);
            }
        }
        f6w P = s8o.P(n);
        bnq0Var3.a(P);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = cVar2.f;
            if (i == cVar.f) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            wx40Var.i(i, new jnq0(cVar2, new f6w(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List j = c.j(cVar2, 4);
            int size = j.size() - 1;
            while (-1 < size) {
                if (!((Boolean) tlsVar.invoke(j.get(size))).booleanValue()) {
                    y(tlsVar, wx40Var, bnq0Var3, bnq0Var4, cVar, (c) j.get(size));
                }
                size--;
                bnq0Var3 = bnq0Var;
                bnq0Var4 = bnq0Var2;
            }
            if (Q(cVar2)) {
                region2.op(P.a, P.b, P.c, P.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void z(wx40 wx40Var, c cVar, c cVar2) {
        LayoutNode layoutNode;
        c l = cVar2.l();
        zii0 g = (l == null || (layoutNode = l.c) == null || !layoutNode.G()) ? e : l.g();
        int i = cVar2.f;
        if (i == cVar.f) {
            i = -1;
        }
        wx40Var.i(i, new jnq0(cVar2, s8o.P(g)));
    }

    public abstract rlp B();

    public abstract Object C();

    public abstract rlp D();

    public abstract rlp E();

    public Object G() {
        Object read;
        if (E() != null) {
            read = E().read();
        } else {
            rlp I = I();
            if (I == null || (read = I.read()) == null) {
                rlp D = D();
                read = D != null ? D.read() : null;
                if (read == null) {
                    rlp B = B();
                    read = B != null ? B.read() : null;
                }
            }
        }
        return read == null ? C() : read;
    }

    public abstract rlp I();

    public boolean R(int i, int i2, byte[] bArr) {
        return T(i, i2, bArr) == 0;
    }

    public abstract int T(int i, int i2, byte[] bArr);

    public Object getValue() {
        return G();
    }

    public abstract String s(int i, int i2, byte[] bArr);

    public abstract int t(int i, int i2, String str, byte[] bArr);
}
