package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.widget.TextView;
import androidx.concurrent.futures.DirectExecutor;
import androidx.core.graphics.BlendModeCompat;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.quark.configuration.Language;
import com.ybsdk.feature.push.impl.domain.PushNotificationsSubscriptionTask;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.Alerts;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.animation.NavigationDirection;
import skeletor.parser.util.StackMode;
import skeletor.render.token.Stack$Orientation;

/* loaded from: classes.dex */
public abstract class ooc {
    public static final byte[] a = {102, -41, 29, -127, Alerts.alert_certificate_expired, 69, 82, -81};
    public static final byte[] b = {4, -74, 115, -22, Alerts.alert_bad_certificate_hash_value, Alerts.alert_unsupported_certificate, 61, -16, PKIBody._CKUANN, -78, Alerts.alert_certificate_unobtainable, -24, 75, Alerts.alert_export_restriction};
    public static final byte[] c = {4, -74, 115, -22};
    public static final KSerializer[] d = new KSerializer[0];

    public static final void A(hz40 hz40Var, Object obj) {
        boolean z;
        long[] jArr = hz40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = hz40Var.b[i4];
                        Object obj3 = hz40Var.c[i4];
                        if (obj3 instanceof iz40) {
                            iz40 iz40Var = (iz40) obj3;
                            iz40Var.l(obj);
                            z = iz40Var.g();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            hz40Var.n(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final kvj0 B(kvj0 kvj0Var) {
        cvj0 c2 = kvj0Var.c();
        rvj0 rvj0Var = kvj0Var.z;
        c2.g = new a321(rvj0Var.contentLength(), rvj0Var.contentType());
        return c2.a();
    }

    public static final int C(TextView textView, int i) {
        if (textView.getLayout() == null) {
            return 0;
        }
        if (i > 0 && i <= textView.getLayout().getLineCount()) {
            return textView.getLayout().getLineTop(i) - textView.getLayout().getLineTop(0);
        }
        return textView.getLayout().getHeight();
    }

    public static bhg0 D(ahg0 ahg0Var, qc20 qc20Var) {
        Map f = b.f();
        as90 as90Var = ahg0Var.a;
        String str = as90Var.a;
        String concat = str.concat("/workdir");
        String concat2 = str.concat("/system");
        String str2 = as90Var.b;
        File file = new File(((as90) qc20Var.a).a.concat("/system"));
        file.mkdirs();
        bs90 bs90Var = new bs90(str, concat, str, concat2, str2, new File(file, "quark.cfg").getAbsolutePath());
        raj a2 = ahg0Var.b.a(ahg0Var.c);
        String str3 = ahg0Var.c;
        String str4 = ahg0Var.d;
        cs1 cs1Var = ahg0Var.e;
        ds1 ds1Var = new ds1(cs1Var.a, cs1Var.b, cs1Var.c, cs1Var.d, cs1Var.e, cs1Var.f, cs1Var.g);
        oez oezVar = ahg0Var.f;
        Language language = ahg0Var.g;
        dsu dsuVar = ahg0Var.h;
        boolean z = ahg0Var.j;
        ahg0Var.l.getClass();
        return new bhg0(bs90Var, qc20Var, a2, str3, str4, ds1Var, oezVar, language, f, dsuVar, z);
    }

    public static final kotlinx.serialization.json.b E(j5x j5xVar) {
        if (j5xVar instanceof m5x) {
            return F((m5x) j5xVar);
        }
        if (j5xVar instanceof v4x) {
            List list = ((v4x) j5xVar).a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(E((j5x) it.next()));
            }
            return new a(arrayList);
        }
        if (j5xVar instanceof o6x) {
            return qcx.c(((o6x) j5xVar).a);
        }
        if (j5xVar instanceof i5x) {
            return qcx.b(Long.valueOf(((i5x) j5xVar).a));
        }
        if (j5xVar instanceof h5x) {
            return qcx.b(Double.valueOf(((h5x) j5xVar).a));
        }
        if (j5xVar instanceof w4x) {
            return qcx.a(Boolean.valueOf(((w4x) j5xVar).a));
        }
        w511.b();
        return null;
    }

    public static final c F(m5x m5xVar) {
        Map map = m5xVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), E((j5x) entry.getValue()));
        }
        return new c(linkedHashMap);
    }

    public static final yr31 G(g0c g0cVar, rs31 rs31Var, String str, hs31 hs31Var, y8f y8fVar, fid fidVar) {
        ls31 j;
        if (hs31Var != null) {
            ks31 ks31Var = ls31.b;
            j = new ls31(rs31Var.getViewModelStore(), hs31Var, y8fVar);
        } else if (rs31Var instanceof q7u) {
            ks31 ks31Var2 = ls31.b;
            j = new ls31(rs31Var.getViewModelStore(), ((q7u) rs31Var).getDefaultViewModelProviderFactory(), y8fVar);
        } else {
            ks31 ks31Var3 = ls31.b;
            j = rms.j(rs31Var, null, 6);
        }
        return str != null ? j.a.B(g0cVar, str) : j.a(g0cVar);
    }

    public static final void a(hz40 hz40Var, Object obj, Object obj2) {
        int j = hz40Var.j(obj);
        boolean z = j < 0;
        Object obj3 = null;
        Object obj4 = z ? null : hz40Var.c[j];
        if (obj4 != null) {
            if (obj4 instanceof iz40) {
                ((iz40) obj4).a(obj2);
            } else if (obj4 != obj2) {
                iz40 iz40Var = new iz40(obj3);
                iz40Var.a(obj4);
                iz40Var.a(obj2);
                obj2 = iz40Var;
            }
            obj2 = obj4;
        }
        if (!z) {
            hz40Var.c[j] = obj2;
            return;
        }
        int i = ~j;
        hz40Var.b[i] = obj;
        hz40Var.c[i] = obj2;
    }

    public static final void b(prg prgVar, tls[] tlsVarArr, tls tlsVar) {
        if (!(prgVar instanceof f7)) {
            ny61.r("impossible");
            return;
        }
        f7 f7Var = (f7) prgVar;
        tls[] tlsVarArr2 = (tls[]) Arrays.copyOf(tlsVarArr, tlsVarArr.length);
        ym11.e(1, tlsVar);
        ArrayList arrayList = new ArrayList(tlsVarArr2.length);
        for (tls tlsVar2 : tlsVarArr2) {
            f7 o = f7Var.o();
            tlsVar2.invoke(o);
            arrayList.add(new uwd(o.j().a));
        }
        f7 o2 = f7Var.o();
        tlsVar.invoke(o2);
        f7Var.j().a(new oy1(new uwd(o2.j().a), arrayList));
    }

    public static f530 c(f530 f530Var) {
        uo5 uo5Var = x4c.w;
        Map map = jx31.a;
        return ymb1.m(f530Var).k(new djs0(sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L)), uo5Var));
    }

    public static f530 d(f530 f530Var, ck11 ck11Var, int i) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L));
        }
        return ymb1.m(f530Var).k(new djs0(qarVar, x4c.b));
    }

    public static final Object e(euy euyVar, ContinuationImpl continuationImpl) {
        try {
            if (euyVar.isDone()) {
                return ga.h(euyVar);
            }
            j18 j18Var = new j18(1, dvw.b(continuationImpl));
            j18Var.u();
            euyVar.c(new ojz0(euyVar, j18Var, 1), DirectExecutor.INSTANCE);
            j18Var.w(new dq0(7, euyVar));
            Object s = j18Var.s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s;
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }

    public static final void f(prg prgVar, char c2) {
        prgVar.b(String.valueOf(c2));
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ljo.a(th, th2);
            }
        }
    }

    public static final void h(keu keuVar, String str, String str2) {
        ArrayList arrayList = keuVar.a;
        arrayList.add(str);
        arrayList.add(evu0.k0(str2).toString());
    }

    public static final sj2 i(sj2 sj2Var) {
        sj2 c2 = sj2Var.c();
        int b2 = c2.b();
        for (int i = 0; i < b2; i++) {
            c2.e(sj2Var.a(i), i);
        }
        return c2;
    }

    public static r270 j(String str, String str2, String str3, String str4, boolean z) {
        q270 q270Var = new q270(PushNotificationsSubscriptionTask.class);
        q270Var.d.add("PushSubscriptionTask".concat(str));
        Pair[] pairArr = {new Pair("uuid", str), new Pair(MetaDataField.DEVICE_ID_FIELD, str2), new Pair(AuthSdkActivity.RESPONSE_TYPE_TOKEN, str3), new Pair("platform", str4), new Pair("operation", Boolean.valueOf(z))};
        mng mngVar = new mng();
        for (int i = 0; i < 5; i++) {
            Pair pair = pairArr[i];
            mngVar.b(pair.f(), (String) pair.c());
        }
        q270Var.c.e = mngVar.a();
        i8e i8eVar = new i8e();
        i8eVar.c = NetworkType.CONNECTED;
        i8eVar.b = new jz50(null);
        q270Var.c.j = i8eVar.a();
        return (r270) ((q270) q270Var.d(BackoffPolicy.EXPONENTIAL)).a();
    }

    public static BlendModeColorFilter k(int i, BlendModeCompat blendModeCompat) {
        BlendMode G = y5e.G(blendModeCompat);
        if (G != null) {
            return new BlendModeColorFilter(i, G);
        }
        return null;
    }

    public static String l(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ a[i % 8]);
        }
        return new String(bArr2, uza.a);
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static aos0 n(NavigationDirection navigationDirection) {
        int i = zns0.a[navigationDirection.ordinal()];
        if (i != 1 && i == 2) {
            return aos0.g;
        }
        return aos0.e;
    }

    public static final jse o(Executor executor) {
        jse jseVar;
        syj syjVar = executor instanceof syj ? (syj) executor : null;
        return (syjVar == null || (jseVar = syjVar.a) == null) ? new zko(executor) : jseVar;
    }

    public static final Expression p(f9l f9lVar) {
        return f9lVar instanceof DivVisibilityAction ? ((DivVisibilityAction) f9lVar).j : f9lVar instanceof nnk ? ((nnk) f9lVar).a : new kvo(0L);
    }

    public static final void q(String str) {
        if (str.length() <= 0) {
            ny61.g("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                rza.a(16);
                String num = Integer.toString(charAt, 16);
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                b64.A(i, num, " at ", " in header name: ", sb);
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void r(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                rza.a(16);
                String num = Integer.toString(charAt, 16);
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                b64.A(i, num, " at ", " in ", sb);
                sb.append(str2);
                sb.append(" value");
                sb.append(yf61.l(str2) ? "" : Extension.COLON_SPACE.concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final boolean s(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static yjs0 t(rms0 rms0Var) {
        if (rms0Var instanceof m86) {
            m86 m86Var = (m86) rms0Var;
            bjs0 bjs0Var = m86Var.b;
            if (bjs0Var != null) {
                return new gyi0(bjs0Var, m86Var.c, m86Var.d);
            }
            ny61.g("Required value was null.");
            return null;
        }
        if (rms0Var instanceof wac) {
            wac wacVar = (wac) rms0Var;
            bjs0 bjs0Var2 = wacVar.b;
            StackMode stackMode = wacVar.c;
            ArrayList arrayList = wacVar.d;
            if (arrayList != null) {
                return new kyi0(bjs0Var2, Stack$Orientation.VERTICAL, stackMode, u(arrayList), 0);
            }
            ny61.g("Required value was null.");
            return null;
        }
        if (rms0Var instanceof dhl0) {
            dhl0 dhl0Var = (dhl0) rms0Var;
            bjs0 bjs0Var3 = dhl0Var.b;
            StackMode stackMode2 = dhl0Var.c;
            ArrayList arrayList2 = dhl0Var.d;
            if (arrayList2 != null) {
                return new kyi0(bjs0Var3, Stack$Orientation.HORIZONTAL, stackMode2, u(arrayList2), 1);
            }
            ny61.g("Required value was null.");
            return null;
        }
        if (rms0Var instanceof ckt0) {
            bjs0 bjs0Var4 = ((ckt0) rms0Var).b;
            if (bjs0Var4 != null) {
                return new pyi0(bjs0Var4);
            }
            ny61.g("Required value was null.");
            return null;
        }
        if (rms0Var instanceof p0j0) {
            rms0 rms0Var2 = ((p0j0) rms0Var).c;
            if (rms0Var2 != null) {
                return t(rms0Var2);
            }
            ny61.g("Required value was null.");
            return null;
        }
        if (rms0Var instanceof bvy0) {
            bvy0 bvy0Var = (bvy0) rms0Var;
            String str = bvy0Var.b;
            if (str == null) {
                ny61.g("Required value was null.");
                return null;
            }
            bjs0 bjs0Var5 = bvy0Var.c;
            if (bjs0Var5 == null) {
                ny61.g("Required value was null.");
                return null;
            }
            Integer num = bvy0Var.d;
            rms0 rms0Var3 = bvy0Var.e;
            if (rms0Var3 != null) {
                return new ryi0(str, bjs0Var5, num, t(rms0Var3));
            }
            ny61.g("Required value was null.");
            return null;
        }
        if (!(rms0Var instanceof p590)) {
            if (rms0Var instanceof pyt0) {
                return lfb1.b((pyt0) rms0Var);
            }
            w511.b();
            return null;
        }
        p590 p590Var = (p590) rms0Var;
        bjs0 bjs0Var6 = p590Var.b;
        if (bjs0Var6 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        bjs0 bjs0Var7 = p590Var.c;
        bjs0 bjs0Var8 = p590Var.d;
        bjs0 bjs0Var9 = p590Var.e;
        rms0 rms0Var4 = p590Var.f;
        if (rms0Var4 != null) {
            return new oyi0(bjs0Var6, bjs0Var7, bjs0Var8, bjs0Var9, t(rms0Var4));
        }
        ny61.g("Required value was null.");
        return null;
    }

    public static ArrayList u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rms0 rms0Var = (rms0) it.next();
            if (rms0Var instanceof p0j0) {
                p0j0 p0j0Var = (p0j0) rms0Var;
                rms0 rms0Var2 = p0j0Var.c;
                if (rms0Var2 == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                Integer num = p0j0Var.b;
                if (num == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                int intValue = num.intValue();
                ListBuilder a2 = rcc.a();
                for (int i = 0; i < intValue; i++) {
                    a2.add(t(rms0Var2));
                }
                arrayList.addAll(a2.j());
            } else {
                arrayList.add(t(rms0Var));
            }
        }
        return arrayList;
    }

    public static final void v(prg prgVar, String str, tls tlsVar) {
        if (!(prgVar instanceof f7)) {
            ny61.r("impossible");
            return;
        }
        f7 f7Var = (f7) prgVar;
        ym11.e(1, tlsVar);
        oz2 j = f7Var.j();
        f7 o = f7Var.o();
        tlsVar.invoke(o);
        j.a(new kotlinx.datetime.internal.format.c(str, new uwd(o.j().a)));
    }

    public static final Object x(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final Object y(xdx xdxVar) {
        JsonReader$Token peek = xdxVar.peek();
        switch (e.a[peek.ordinal()]) {
            case 1:
                xdxVar.B0();
                return null;
            case 2:
                return Boolean.valueOf(xdxVar.nextBoolean());
            case 3:
            case 4:
                try {
                    try {
                        try {
                            return Integer.valueOf(xdxVar.nextInt());
                        } catch (Exception unused) {
                            return xdxVar.J0();
                        }
                    } catch (Exception unused2) {
                        return Long.valueOf(xdxVar.nextLong());
                    }
                } catch (Exception unused3) {
                    return Double.valueOf(xdxVar.nextDouble());
                }
            case 5:
                return xdxVar.nextString();
            case 6:
                xdxVar.u();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (xdxVar.hasNext()) {
                    linkedHashMap.put(xdxVar.nextName(), y(xdxVar));
                }
                xdxVar.y();
                return linkedHashMap;
            case 7:
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    z.add(y(xdxVar));
                }
                xdxVar.j();
                return z;
            default:
                yhl.d(peek, "unknown token ");
                return null;
        }
    }

    public static final boolean z(hz40 hz40Var, Object obj, Object obj2) {
        Object d2 = hz40Var.d(obj);
        if (d2 == null) {
            return false;
        }
        if (!(d2 instanceof iz40)) {
            if (!d2.equals(obj2)) {
                return false;
            }
            hz40Var.m(obj);
            return true;
        }
        iz40 iz40Var = (iz40) d2;
        boolean l = iz40Var.l(obj2);
        if (l && iz40Var.g()) {
            hz40Var.m(obj);
        }
        return l;
    }
}
