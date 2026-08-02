package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.ui.node.s;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.work.BackoffPolicy;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Environment;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Theme;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.ui.core.theme.PlusTheme;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.CryptoPro.reprov.array.DerValue;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.common_models.SupportedEatsServices;
import ru.yandex.taxi.eats_commons.EatsService;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class gwk0 {
    public static final jb7 b;
    public static jb7 c;
    public static final dac a = new dac(17);
    public static final jb20 d = new jb20("NO_THREAD_ELEMENTS", 1);
    public static final etq0 e = new etq0(7);
    public static final etq0 f = new etq0(8);
    public static final etq0 g = new etq0(9);

    static {
        Object obj = null;
        b = new jb7(21, obj, obj, obj);
    }

    public static final wf90 A(boolean z, u93 u93Var, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            ny61.r("Check failed.");
            return null;
        }
        ListBuilder a2 = rcc.a();
        if (z) {
            a2.add(new hhc0("-"));
        }
        a2.add(new gn60(Collections.singletonList(new f421(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), u93Var, str, z))));
        return new wf90(a2.j(), EmptyList.a);
    }

    public static final int B(vx40 vx40Var) {
        int a2;
        int i = vx40Var.b;
        int a3 = vx40Var.a(0);
        while (vx40Var.b != 0 && vx40Var.a(0) == a3) {
            vx40Var.f(0, vx40Var.b());
            vx40Var.e(vx40Var.b - 1);
            int i2 = vx40Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int a4 = vx40Var.a(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int a5 = vx40Var.a(i6);
                if (i5 >= i2 || (a2 = vx40Var.a(i5)) <= a5) {
                    if (a5 > a4) {
                        vx40Var.f(i4, a5);
                        vx40Var.f(i6, a4);
                        i4 = i6;
                    }
                } else if (a2 > a4) {
                    vx40Var.f(i4, a2);
                    vx40Var.f(i5, a4);
                    i4 = i5;
                }
            }
        }
        return a3;
    }

    public static final boolean C(oa31 oa31Var, String str) {
        boolean z;
        if (oa31Var.c()) {
            List list = oa31Var.f;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (jl40.l(((VerticalTariffDto) it.next()).a, str)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        return z || (!oa31Var.c() && jl40.l(oa31Var.b, str));
    }

    public static final JSONArray D(a aVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            jSONArray.put(F((b) it.next()));
        }
        return jSONArray;
    }

    public static final JSONObject E(c cVar) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, b> entry : cVar.entrySet()) {
            jSONObject.put(entry.getKey(), F(entry.getValue()));
        }
        return jSONObject;
    }

    public static final Object F(b bVar) {
        if (bVar instanceof JsonNull) {
            return null;
        }
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.b()) {
                return dVar.a();
            }
            Object f2 = qcx.f(dVar);
            return (f2 == null && (f2 = qcx.o(dVar)) == null && (f2 = qcx.i(dVar)) == null) ? qcx.k(dVar) : f2;
        }
        if (bVar instanceof c) {
            return E((c) bVar);
        }
        if (bVar instanceof a) {
            return D((a) bVar);
        }
        w511.b();
        return null;
    }

    public static final zii0 G(gz40 gz40Var) {
        return new zii0(gz40Var.a, gz40Var.b, gz40Var.c, gz40Var.d);
    }

    public static final Object H(fse fseVar, Object obj) {
        if (obj == null) {
            obj = fseVar.fold(0, e);
        }
        return obj == 0 ? d : obj instanceof Integer ? fseVar.fold(new jyy0(((Number) obj).intValue(), fseVar), g) : ((txy0) obj).H0();
    }

    public static final float I(bcl bclVar, rvo rvoVar, DisplayMetrics displayMetrics) {
        Expression expression;
        Expression expression2;
        DivSizeUnit divSizeUnit = (bclVar == null || (expression2 = bclVar.c) == null) ? null : (DivSizeUnit) expression2.a(rvoVar);
        int i = divSizeUnit == null ? -1 : qgk.a[divSizeUnit.ordinal()];
        if (i == 1) {
            return com.yandex.div.core.view2.divs.a.q((Number) bclVar.d.a(rvoVar), displayMetrics);
        }
        if (i == 2) {
            return com.yandex.div.core.view2.divs.a.E((Number) bclVar.d.a(rvoVar), displayMetrics);
        }
        if (i == 3) {
            return (float) ((Number) bclVar.d.a(rvoVar)).doubleValue();
        }
        if (bclVar == null || (expression = bclVar.d) == null) {
            return 0.0f;
        }
        return (float) ((Number) expression.a(rvoVar)).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b J(sbx sbxVar, Object obj, KSerializer kSerializer) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new lex(sbxVar, new ate0(26, ref$ObjectRef), 0).j(obj, kSerializer);
        T t = ref$ObjectRef.element;
        if (t == 0) {
            return null;
        }
        return (b) t;
    }

    public static int K(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long L(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static final fyc a(Object obj) {
        fyc fycVar = new fyc(null);
        fycVar.T(obj);
        return fycVar;
    }

    public static fyc b() {
        return new fyc(null);
    }

    public static final jwi c(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        dzr a2 = ezr.a(f2);
        if (a2 == null) {
            a2 = new oiy(f2);
        }
        return new jwi(f3, f2, a2);
    }

    public static final View d(e530 e530Var) {
        AndroidViewHolder androidViewHolder = qje.P(e530Var.getNode()).H;
        View view = androidViewHolder != null ? androidViewHolder.getView() : null;
        if (view != null) {
            return view;
        }
        ny61.r("Could not fetch interop view");
        return null;
    }

    public static final void e(vx40 vx40Var, int i) {
        if (vx40Var.b == 0 || !(vx40Var.a(0) == i || vx40Var.a(vx40Var.b - 1) == i)) {
            int i2 = vx40Var.b;
            vx40Var.c(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int a2 = vx40Var.a(i3);
                if (i <= a2) {
                    break;
                }
                vx40Var.f(i2, a2);
                i2 = i3;
            }
            vx40Var.f(i2, i);
        }
    }

    public static final PlusAuthAdapter$Environment f(Environment environment) {
        int i = vv00.b[environment.ordinal()];
        if (i == 1) {
            return PlusAuthAdapter$Environment.TESTING;
        }
        if (i == 2) {
            return PlusAuthAdapter$Environment.PRODUCTION;
        }
        w511.b();
        return null;
    }

    public static final PlusAuthAdapter$Theme g(PlusTheme plusTheme) {
        int i = vv00.a[plusTheme.ordinal()];
        if (i == 1) {
            return PlusAuthAdapter$Theme.DARK;
        }
        if (i == 2) {
            return PlusAuthAdapter$Theme.LIGHT;
        }
        if (i == 3) {
            return PlusAuthAdapter$Theme.FOLLOW_SYSTEM;
        }
        w511.b();
        return null;
    }

    public static final fef h(ief iefVar) {
        String str = iefVar.a;
        String str2 = iefVar.d;
        String str3 = iefVar.c;
        String str4 = iefVar.b;
        return (str == null && str4 == null && str3 == null && str2 == null) ? fef.e : new fef(str, str4, str3, str2);
    }

    public static final zii0 i(rzx rzxVar) {
        rzx q = rzxVar.q();
        return q != null ? q.j(rzxVar, true) : new zii0(0.0f, 0.0f, (int) (rzxVar.e() >> 32), (int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static final zii0 j(rzx rzxVar, boolean z) {
        rzx o = o(rzxVar);
        float e2 = (int) (o.e() >> 32);
        float e3 = (int) (o.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        zii0 j = o.j(rzxVar, z);
        float f2 = j.a;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > e2) {
                f2 = e2;
            }
        }
        float f3 = j.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > e3) {
                f3 = e3;
            }
        }
        float f4 = j.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= e2) {
                e2 = f4;
            }
            f4 = e2;
        }
        float f5 = j.d;
        if (z) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= e3) {
                e3 = f6;
            }
            f5 = e3;
        }
        if (f2 == f4 || f3 == f5) {
            return zii0.e;
        }
        long m = o.m((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long m2 = o.m((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long m3 = o.m((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long m4 = o.m((Float.floatToRawIntBits(f5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (m >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (m4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (m3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (m & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (m2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (m4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (m3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return new zii0(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static long k(boolean z, int i, BackoffPolicy backoffPolicy, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        if (j6 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long scalb = backoffPolicy == BackoffPolicy.LINEAR ? j * i : (long) Math.scalb(j, i - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        }
        if (!z2) {
            return j2 == -1 ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : j2 + j3;
        }
        long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
        return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
    }

    public static final boolean l(oa31 oa31Var, String str) {
        return (jl40.l(str, "") && !oa31Var.c()) || jl40.l(oa31Var.a, str);
    }

    public static final void m(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    oo31.o(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    ljo.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else {
                    w511.q();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static String n(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str.length());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            if (y(str.charAt(i2))) {
                while (i2 < str.length() && y(str.charAt(i2))) {
                    arrayList.add(Character.valueOf(str.charAt(i2)));
                    if (Character.isHighSurrogate(str.charAt(i2)) && (i = i2 + 1) < str.length() && Character.isLowSurrogate(str.charAt(i))) {
                        arrayList.add(Character.valueOf(str.charAt(i)));
                        i2 = i;
                    }
                    i2++;
                }
                for (byte b2 : new String(kotlin.collections.a.E0(arrayList)).getBytes(uza.a)) {
                    char q = q((b2 >> 4) & 15);
                    char q2 = q(b2 & PKIBody._CCP);
                    sb.append('%');
                    sb.append(q);
                    sb.append(q2);
                }
                arrayList.clear();
            } else {
                char charAt = str.charAt(i2);
                if (charAt == ' ') {
                    charAt = '+';
                }
                sb.append(charAt);
                i2++;
            }
        }
        return sb.toString();
    }

    public static final rzx o(rzx rzxVar) {
        rzx rzxVar2;
        rzx q = rzxVar.q();
        while (true) {
            rzx rzxVar3 = q;
            rzxVar2 = rzxVar;
            rzxVar = rzxVar3;
            if (rzxVar == null) {
                break;
            }
            q = rzxVar.q();
        }
        s sVar = rzxVar2 instanceof s ? (s) rzxVar2 : null;
        if (sVar == null) {
            return rzxVar2;
        }
        s sVar2 = sVar.K;
        while (true) {
            s sVar3 = sVar2;
            s sVar4 = sVar;
            sVar = sVar3;
            if (sVar == null) {
                return sVar4;
            }
            sVar2 = sVar.K;
        }
    }

    public static Uuid p() {
        byte[] bArr = new byte[16];
        t6q0.a.nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & PKIBody._CCP);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | DerValue.TAG_APPLICATION);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | DerValue.TAG_CONTEXT);
        long b4 = cy21.b(0, bArr);
        long b5 = cy21.b(8, bArr);
        return (b4 == 0 && b5 == 0) ? Uuid.a : new Uuid(b4, b5);
    }

    public static char q(int i) {
        char c2 = (char) (i < 10 ? i + 48 : ((char) (i + 97)) - '\n');
        return Character.isLetter(c2) ? (char) (c2 - ' ') : c2;
    }

    public static final h1p r(String str) {
        if (jl40.l(str, SupportedEatsServices.EATS.getKey())) {
            return EatsService.EATS;
        }
        if (jl40.l(str, SupportedEatsServices.GROCERY.getKey())) {
            return EatsService.GROCERY;
        }
        if (jl40.l(str, SupportedEatsServices.PHARMACY.getKey())) {
            return EatsService.PHARMACY;
        }
        if (jl40.l(str, SupportedEatsServices.SHOP.getKey())) {
            return EatsService.SHOP;
        }
        if (jl40.l(str, SupportedEatsServices.MARKET.getKey())) {
            return EatsService.MARKET;
        }
        if (jl40.l(str, SupportedEatsServices.MARKET_VIEWER.getKey())) {
            return EatsService.MARKET_VIEWER;
        }
        if (str != null) {
            return new f7n(str);
        }
        return null;
    }

    public static final String s(h1p h1pVar) {
        if (h1pVar == EatsService.EATS) {
            return SupportedEatsServices.EATS.getKey();
        }
        if (h1pVar == EatsService.GROCERY) {
            return SupportedEatsServices.GROCERY.getKey();
        }
        if (h1pVar == EatsService.PHARMACY) {
            return SupportedEatsServices.PHARMACY.getKey();
        }
        if (h1pVar == EatsService.SHOP) {
            return SupportedEatsServices.SHOP.getKey();
        }
        if (h1pVar == EatsService.CORP_FOOD) {
            return SupportedEatsServices.CORP_FOOD.getKey();
        }
        if (h1pVar == EatsService.MARKET) {
            return SupportedEatsServices.MARKET.getKey();
        }
        if (h1pVar == EatsService.MARKET_VIEWER) {
            return SupportedEatsServices.MARKET_VIEWER.getKey();
        }
        if (h1pVar instanceof f7n) {
            return ((f7n) h1pVar).a;
        }
        w511.b();
        return null;
    }

    public static final hxq0 t(String str) {
        ServiceType serviceType;
        if (evu0.J(str)) {
            return m501.c;
        }
        ServiceType[] values = ServiceType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                serviceType = null;
                break;
            }
            serviceType = values[i];
            if (jl40.l(serviceType.getAlias(), str)) {
                break;
            }
            i++;
        }
        return serviceType != null ? serviceType : new d9n(str);
    }

    public static boolean u(d5j0 d5j0Var, kvj0 kvj0Var) {
        int i = kvj0Var.w;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i != 307) {
                if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case IDialogId.DIALOG_PIN_WND_IDD_PASSWORD /* 301 */:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            String a2 = kvj0Var.y.a("Expires");
            if (a2 == null) {
                a2 = null;
            }
            if (a2 == null && kvj0Var.a().c == -1 && !kvj0Var.a().f && !kvj0Var.a().e) {
                return false;
            }
        }
        return (kvj0Var.a().b || d5j0Var.a().b) ? false : true;
    }

    public static final boolean v(String str) {
        return !jl40.l(str, "");
    }

    public static final String w(int i, Context context) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            try {
                Charset defaultCharset = Charset.defaultCharset();
                v0w H = vng.H(openRawResource);
                yp6 yp6Var = new yp6();
                yp6Var.N1(H);
                String T = yp6Var.T(yp6Var.b, defaultCharset);
                openRawResource.close();
                return T;
            } finally {
            }
        } catch (Exception e2) {
            xby.d.j(e2);
            return "";
        }
    }

    public static final void x(fse fseVar, Object obj) {
        if (obj == d) {
            return;
        }
        if (!(obj instanceof jyy0)) {
            ((txy0) fseVar.fold(null, f)).n(obj);
            return;
        }
        jyy0 jyy0Var = (jyy0) obj;
        txy0[] txy0VarArr = jyy0Var.c;
        int length = txy0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            txy0VarArr[length].n(jyy0Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static boolean y(char c2) {
        if ('a' <= c2 && c2 < '{') {
            return false;
        }
        if ('A' > c2 || c2 >= '[') {
            return (('0' <= c2 && c2 < ':') || c2 == ' ' || c2 == '_' || c2 == '.') ? false : true;
        }
        return false;
    }

    public static final wf90 z(Integer num, Integer num2, Integer num3, u93 u93Var, String str, boolean z) {
        int i;
        EmptyList emptyList;
        int intValue = num.intValue() + (z ? 1 : 0);
        if (num2 != null) {
            i = num2.intValue();
            if (z) {
                i++;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        int intValue2 = num3 != null ? num3.intValue() : 0;
        int min = Math.min(i, intValue2);
        if (intValue >= min) {
            return A(z, u93Var, str, intValue, i);
        }
        wf90 A = A(z, u93Var, str, intValue, intValue);
        while (true) {
            emptyList = EmptyList.a;
            if (intValue >= min) {
                break;
            }
            intValue++;
            A = new wf90(emptyList, scc.g(A(z, u93Var, str, intValue, intValue), dai0.e(scc.g(new wf90(Collections.singletonList(new hhc0(" ")), emptyList), A))));
        }
        return intValue2 > i ? dai0.e(scc.g(new wf90(Collections.singletonList(new hhc0(cvu0.u(intValue2 - i, " "))), emptyList), A)) : intValue2 == i ? A : new wf90(emptyList, scc.g(A(z, u93Var, str, intValue2 + 1, i), A));
    }
}
