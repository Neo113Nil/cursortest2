package defpackage;

import android.os.Build;
import android.os.Looper;
import android.view.Window;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.layers.api.model.Action;
import flex.network.cache.parsing.CacheMode;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiPredicate;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.common_models.net.map_object.Trigger;
import ru.yandex.taxi.network.api.models.GoApiException;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.network.api.models.GoApiOtherException;
import ru.yandex.taxi.network.api.models.GoCheckException;
import ru.yandex.taxi.network.api.models.GoParsingException;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes.dex */
public abstract class jl40 {
    public static final y0u b = new y0u(4);
    public static final a1o c = new a1o("oauth");
    public static final a1o d = new a1o("session");
    public static final eyy0 e = new eyy0(0, new long[0], new Object[0]);
    public static boolean f;
    public final /* synthetic */ int a = 20;

    public static final boolean A(String str) {
        return str == null || evu0.J(str);
    }

    public static final boolean B(PositionInitAction positionInitAction) {
        switch (positionInitAction == null ? -1 : r6r.a[positionInitAction.ordinal()]) {
            case -1:
                return true;
            case 0:
            default:
                w511.b();
                return false;
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
        }
    }

    public static final boolean C(xf51 xf51Var, xf51 xf51Var2) {
        return xf51Var.b.equals(xf51Var2.b) && l(xf51Var.c, xf51Var2.c) && l(xf51Var.d, xf51Var2.d) && l(xf51Var.f, xf51Var2.f) && xf51Var.a == xf51Var2.a;
    }

    public static pzt0 D(tse tseVar, String str, wls wlsVar) {
        return tje.M(tseVar, new pse(str), CoroutineStart.DEFAULT, wlsVar);
    }

    public static int E(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        ny61.v(oyr.h(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean F(List list, List list2, BiPredicate biPredicate) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        d6w e2 = scc.e(list);
        if ((e2 instanceof Collection) && ((Collection) e2).isEmpty()) {
            return true;
        }
        c6w it = e2.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (!biPredicate.test(list.get(nextInt), list2.get(nextInt))) {
                return false;
            }
        }
        return true;
    }

    public static jdo G(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            kbs.n("Expression expected", null);
            return null;
        }
        kf90 kf90Var = new kf90(arrayList, str);
        jdo u = u(kf90Var);
        if (!kf90Var.c()) {
            return u;
        }
        kbs.n("Expression expected", null);
        return null;
    }

    public static ab7 H(leu leuVar) {
        List<String> W;
        String a = leuVar.a("document-cache-control");
        Set set = null;
        if (a == null) {
            return null;
        }
        String a2 = leuVar.a("document-cache-label");
        List Y = evu0.Y(a.toLowerCase(Locale.ROOT), new char[]{HexString.CHAR_COMMA}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            List Y2 = evu0.Y((String) it.next(), new char[]{'='}, 0, 6);
            Pair pair = Y2.size() != 2 ? null : new Pair(evu0.k0((String) Y2.get(0)).toString(), evu0.k0((String) Y2.get(1)).toString());
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map s = b.s(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : Y) {
            if (!evu0.z((String) obj, '=')) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(evu0.k0((String) it2.next()).toString());
        }
        boolean contains = arrayList3.contains("allow-cache");
        String str = (String) s.get("stale-time");
        Double i = str != null ? avu0.i(str) : null;
        String str2 = (String) s.get("fresh-time");
        Double i2 = str2 != null ? avu0.i(str2) : null;
        String str3 = (String) s.get("cache-mode");
        if (str3 != null) {
            W = evu0.W(str3, new String[]{"|"}, (r2 & 4) != 0 ? 0 : 2);
            ArrayList arrayList4 = new ArrayList();
            for (String str4 : W) {
                CacheMode cacheMode = l(str4, "disk") ? CacheMode.DISK : l(str4, "in-memory") ? CacheMode.IN_MEMORY : null;
                if (cacheMode != null) {
                    arrayList4.add(cacheMode);
                }
            }
            set = a.N0(arrayList4);
        }
        if (set == null) {
            set = EmptySet.a;
        }
        return new ab7(contains, i2, i, set, a2);
    }

    public static rle0 I(String str, dxf0 dxf0Var, weu weuVar, ike ikeVar, int i) {
        if ((i & 2) != 0) {
            dxf0Var = null;
        }
        tls tlsVar = weuVar;
        if ((i & 4) != 0) {
            tlsVar = new qda0(16);
        }
        if ((i & 8) != 0) {
            sjh sjhVar = uyj.a;
            ikeVar = bvf0.a(mdh.b.plus(a()));
        }
        return new rle0(str, dxf0Var, tlsVar, ikeVar);
    }

    public static void J(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static int K(yi9 yi9Var) {
        int i = yi9Var.d;
        if (i != 2) {
            if (i != 8) {
                if (i != 10) {
                    if (i == 4) {
                        char a = yi9Var.a(0);
                        if (a == 'e') {
                            if (yi9Var.a(1) == 'l' && yi9Var.a(2) == 's' && yi9Var.a(3) == 'e') {
                                return 2;
                            }
                        } else if (a == 't' && yi9Var.a(1) == 'r' && yi9Var.a(2) == 'u' && yi9Var.a(3) == 'e') {
                            return 9;
                        }
                    } else if (i == 5) {
                        char a2 = yi9Var.a(0);
                        if (a2 == 'w') {
                            if (yi9Var.a(1) == 'h' && yi9Var.a(2) == 'i' && yi9Var.a(3) == 'l' && yi9Var.a(4) == 'e') {
                                return 3;
                            }
                        } else if (a2 == 'b') {
                            if (yi9Var.a(1) == 'r' && yi9Var.a(2) == 'e' && yi9Var.a(3) == 'a' && yi9Var.a(4) == 'k') {
                                return 5;
                            }
                        } else if (a2 == 't') {
                            if (yi9Var.a(1) == 'h' && yi9Var.a(2) == 'r' && yi9Var.a(3) == 'o' && yi9Var.a(4) == 'w') {
                                return 6;
                            }
                        } else if (a2 == 'f' && yi9Var.a(1) == 'a' && yi9Var.a(2) == 'l' && yi9Var.a(3) == 's' && yi9Var.a(4) == 'e') {
                            return 10;
                        }
                    } else if (i == 6) {
                        char a3 = yi9Var.a(0);
                        if (a3 == 'a') {
                            if (yi9Var.a(1) == 's' && yi9Var.a(2) == 's' && yi9Var.a(3) == 'e' && yi9Var.a(4) == 'r' && yi9Var.a(5) == 't') {
                                return 7;
                            }
                        } else if (a3 == 'r' && yi9Var.a(1) == 'e' && yi9Var.a(2) == 't' && yi9Var.a(3) == 'u' && yi9Var.a(4) == 'r' && yi9Var.a(5) == 'n') {
                            return 8;
                        }
                    }
                } else if (yi9Var.a(0) == 'b' && yi9Var.a(1) == 'r' && yi9Var.a(2) == 'e' && yi9Var.a(3) == 'a' && yi9Var.a(4) == 'k' && yi9Var.a(5) == 'p' && yi9Var.a(6) == 'o' && yi9Var.a(7) == 'i' && yi9Var.a(8) == 'n' && yi9Var.a(9) == 't') {
                    return 11;
                }
            } else if (yi9Var.a(0) == 'c' && yi9Var.a(1) == 'o' && yi9Var.a(2) == 'n' && yi9Var.a(3) == 't' && yi9Var.a(4) == 'i' && yi9Var.a(5) == 'n' && yi9Var.a(6) == 'u' && yi9Var.a(7) == 'e') {
                return 4;
            }
        } else if (yi9Var.a(0) == 'i' && yi9Var.a(1) == 'f') {
            return 1;
        }
        return 0;
    }

    public static void L(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            qr6.g(window, z);
        } else if (i >= 30) {
            qh.b(window, z);
        } else {
            xm91.d(window, z);
        }
    }

    public static String M(Object obj, String str) {
        return str + obj;
    }

    public static jdo N(kf90 kf90Var) {
        jdo w = w(kf90Var);
        while (kf90Var.c() && (kf90Var.a() instanceof jmz0)) {
            w = new com.yandex.div.evaluable.a((kmz0) kf90Var.d(), w, w(kf90Var), kf90Var.b);
        }
        return w;
    }

    public static final Object O(wls wlsVar, Continuation continuation) {
        phw0 phw0Var = new phw0(continuation.get_context(), continuation);
        Object H = sb2.H(phw0Var, true, phw0Var, wlsVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return H;
    }

    public static void P() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static jdo Q(kf90 kf90Var) {
        jdo N = N(kf90Var);
        if (!kf90Var.c() || !(kf90Var.a() instanceof pmz0)) {
            return N;
        }
        return new fdo((pmz0) kf90Var.d(), N, N(kf90Var), kf90Var.b);
    }

    public static jdo R(kf90 kf90Var) {
        boolean c2 = kf90Var.c();
        String str = kf90Var.b;
        if (c2 && (kf90Var.a() instanceof tmz0)) {
            return new gdo((umz0) kf90Var.d(), R(kf90Var), str);
        }
        jdo o = o(kf90Var, null);
        while (kf90Var.c() && (kf90Var.a() instanceof lmz0)) {
            kf90Var.b();
            o = o(kf90Var, o);
        }
        if (!kf90Var.c() || !(kf90Var.a() instanceof gmz0)) {
            return o;
        }
        kf90Var.b();
        return new com.yandex.div.evaluable.a(gmz0.a, o, R(kf90Var), str);
    }

    public static int S(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static qhw0 a() {
        return new qhw0(null);
    }

    public static final long b(float f2, float f3) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f2) << 32);
        int i = jw01.c;
        return floatToRawIntBits;
    }

    public static final boolean c(String str, Map map) {
        if (map == null) {
            return false;
        }
        Set keySet = map.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            if (cvu0.t((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    public static final o7j0 d(int i, int i2) {
        MapBuilder mapBuilder = new MapBuilder();
        if (i > 0) {
            mapBuilder.put("X-YaTaxi-Retry-Number", String.valueOf(i));
        }
        if (i2 > 0) {
            mapBuilder.put("X-YaTaxi-Retry-Last-Http-Status-Code", String.valueOf(i2));
        }
        return new o7j0(mapBuilder.j());
    }

    public static final boolean e(AtomicReference atomicReference, Object obj) {
        if (l(atomicReference.get(), obj)) {
            return false;
        }
        atomicReference.set(obj);
        return true;
    }

    public static jdo f(kf90 kf90Var) {
        jdo t = t(kf90Var);
        while (kf90Var.c() && (kf90Var.a() instanceof dmz0)) {
            kf90Var.b();
            t = new com.yandex.div.evaluable.a(dmz0.a, t, t(kf90Var), kf90Var.b);
        }
        return t;
    }

    public static boolean g(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean h(Double d2, double d3) {
        return d2 != null && d2.doubleValue() == d3;
    }

    public static boolean i(Double d2, Double d3) {
        return d2 == null ? d3 == null : d3 != null && d2.doubleValue() == d3.doubleValue();
    }

    public static boolean j(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static boolean k(Float f2, Float f3) {
        return f2 == null ? f3 == null : f3 != null && f2.floatValue() == f3.floatValue();
    }

    public static boolean l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void m() {
        if (!f || l(Looper.getMainLooper(), Looper.myLooper())) {
            return;
        }
        ny61.f("code must working only in main thread");
    }

    public static final void n(Object obj, String str) {
        if (f && obj == null) {
            ny61.f(str);
        }
    }

    public static jdo o(kf90 kf90Var, jdo jdoVar) {
        boolean z = kf90Var.c >= kf90Var.a.size();
        String str = kf90Var.b;
        if (z) {
            kbs.n("Expression expected", null);
            return null;
        }
        anz0 d2 = kf90Var.d();
        if (jdoVar != null && !(d2 instanceof klz0)) {
            kbs.n("Method expected after .", null);
            return null;
        }
        if (d2 instanceof olz0) {
            return new hdo((olz0) d2, str);
        }
        if (d2 instanceof plz0) {
            return new ido(((plz0) d2).a, str);
        }
        if (d2 instanceof klz0) {
            klz0 klz0Var = (klz0) d2;
            if (!(kf90Var.d() instanceof hlz0)) {
                kbs.n("'(' expected after function call", null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (jdoVar != null) {
                arrayList.add(jdoVar);
            }
            while (!(kf90Var.a() instanceof ilz0)) {
                arrayList.add(u(kf90Var));
                if (kf90Var.a() instanceof jlz0) {
                    kf90Var.b();
                }
            }
            if (kf90Var.d() instanceof ilz0) {
                return jdoVar == null ? new ado(klz0Var, arrayList, str) : new cdo(klz0Var, arrayList, str);
            }
            kbs.n("expected ')' after a function call", null);
            return null;
        }
        if (d2 instanceof hlz0) {
            jdo u = u(kf90Var);
            if (kf90Var.d() instanceof ilz0) {
                return u;
            }
            kbs.n("')' expected after expression", null);
            return null;
        }
        if (!(d2 instanceof xmz0)) {
            kbs.n("Expression expected", null);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        while (kf90Var.c() && !(kf90Var.a() instanceof vmz0)) {
            if ((kf90Var.a() instanceof ymz0) || (kf90Var.a() instanceof wmz0)) {
                kf90Var.b();
            } else {
                arrayList2.add(u(kf90Var));
            }
        }
        if (kf90Var.d() instanceof vmz0) {
            return new ddo(arrayList2, str);
        }
        kbs.n("expected ''' at end of a string template", null);
        return null;
    }

    public static final void p(kic kicVar, Div2View div2View) {
        if (l(kicVar, kic.c)) {
            div2View.logError(new IllegalStateException("Colors for linear gradient are not provided. Please check if 'colors' or 'color_map' properties are defined"));
        }
    }

    public static int q(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int r(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static jdo s(kf90 kf90Var) {
        jdo Q = Q(kf90Var);
        while (kf90Var.c() && (kf90Var.a() instanceof vlz0)) {
            Q = new com.yandex.div.evaluable.a((kmz0) kf90Var.d(), Q, Q(kf90Var), kf90Var.b);
        }
        return Q;
    }

    public static jdo t(kf90 kf90Var) {
        jdo s = s(kf90Var);
        while (kf90Var.c() && (kf90Var.a() instanceof ylz0)) {
            s = new com.yandex.div.evaluable.a((kmz0) kf90Var.d(), s, s(kf90Var), kf90Var.b);
        }
        return s;
    }

    public static jdo u(kf90 kf90Var) {
        String str = kf90Var.b;
        jdo f2 = f(kf90Var);
        while (kf90Var.c() && (kf90Var.a() instanceof emz0)) {
            kf90Var.b();
            f2 = new com.yandex.div.evaluable.a(emz0.a, f2, f(kf90Var), str);
        }
        if (!kf90Var.c() || !(kf90Var.a() instanceof nmz0)) {
            return f2;
        }
        kf90Var.b();
        jdo u = u(kf90Var);
        if (kf90Var.c >= kf90Var.a.size() || !(kf90Var.a() instanceof mmz0)) {
            kbs.n("':' expected in ternary-if-else expression", null);
            return null;
        }
        kf90Var.b();
        return new edo(f2, u, u(kf90Var), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r6 < r8) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a1k0 v(int i, GoApiException goApiException, int i2) {
        a1k0 a1k0Var;
        boolean z = goApiException instanceof GoApiHttpException;
        y0k0 y0k0Var = y0k0.a;
        if (z) {
            GoApiHttpException goApiHttpException = (GoApiHttpException) goApiException;
            int code = goApiHttpException.getCode();
            if (code == 429 || code / 100 == 5) {
                a1k0Var = toa1.b(goApiHttpException.getHeaders());
                if (a1k0Var != null) {
                    return (i < 0 || i >= i2) ? y0k0Var : new w0k0(((long) Math.pow(2.0d, i)) * 500);
                }
                return a1k0Var;
            }
            a1k0Var = y0k0Var;
            if (a1k0Var != null) {
            }
        } else {
            if (!(goApiException instanceof GoCheckException) && !(goApiException instanceof GoParsingException)) {
                if (!(goApiException instanceof GoApiOtherException)) {
                    w511.b();
                    return null;
                }
                if (((GoApiOtherException) goApiException).getOriginal() instanceof InterruptedIOException) {
                    a1k0Var = new w0k0(0L);
                    if (i >= 0) {
                    }
                } else {
                    a1k0Var = null;
                }
                if (a1k0Var != null) {
                }
            }
            a1k0Var = y0k0Var;
            if (a1k0Var != null) {
            }
        }
    }

    public static jdo w(kf90 kf90Var) {
        jdo R = R(kf90Var);
        while (kf90Var.c() && (kf90Var.a() instanceof cmz0)) {
            R = new com.yandex.div.evaluable.a((kmz0) kf90Var.d(), R, R(kf90Var), kf90Var.b);
        }
        return R;
    }

    public static final void x(String str) {
        if (f) {
            ny61.f(str);
        }
    }

    public static final List y(nm00 nm00Var) {
        Action action = nm00Var != null ? nm00Var.d : null;
        int i = action == null ? -1 : om00.a[action.ordinal()];
        if (i == 1 || i == 2) {
            List list = nm00Var.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                uud0 uud0Var = (uud0) obj;
                if (uud0Var.getB() == Trigger.TAP || uud0Var.getB() == Trigger.SELECT) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (i != 3) {
            return i != 4 ? EmptyList.a : nm00Var.c;
        }
        List list2 = nm00Var.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            uud0 uud0Var2 = (uud0) obj2;
            if (uud0Var2.getB() == Trigger.DRAG || uud0Var2.getB() == Trigger.SELECT) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final r630 z(fse fseVar) {
        r630 r630Var = (r630) fseVar.get(xw91.B);
        if (r630Var != null) {
            return r630Var;
        }
        ny61.r("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public int hashCode() {
        switch (this.a) {
            case 20:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 20:
                return qoi0.a(getClass()).d();
            default:
                return super.toString();
        }
    }
}
