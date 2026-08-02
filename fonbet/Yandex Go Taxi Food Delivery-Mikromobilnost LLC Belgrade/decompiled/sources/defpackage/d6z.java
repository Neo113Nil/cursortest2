package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yandex.div.internal.parser.CyclicDependencyException;
import com.yandex.go.address.models.Address;
import com.yandex.go.flex.common.api.FeedSdkTheme;
import com.yandex.mapkit.location.LocationManagerUtils;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.common_models.net.map_object.AdjustmentScreenType;
import ru.yandex.taxi.common_models.net.map_object.o0;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.requirements.models.net.experiment.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public abstract class d6z {
    public static final byte[] a = new byte[0];
    public static final kbs b = new kbs(22);
    public static final Object c = new Object();
    public static String d;
    public static rms e;

    public static void A(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.r(str);
    }

    public static final Intent B(Context context, Class cls, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.replaceExtras(bundle);
        return intent;
    }

    public static final String C(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() <= 0) {
            return str;
        }
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    public static final Object D(d6e0 d6e0Var, String str, ContinuationImpl continuationImpl) {
        Object d2 = d6e0Var.d(str, new ceu0(13), continuationImpl);
        return d2 == CoroutineSingletons.COROUTINE_SUSPENDED ? d2 : zy11.a;
    }

    public static String E(float f) {
        return String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    public static jjx F(String str) {
        Map unmodifiableMap;
        AtomicReference atomicReference = nri0.a;
        synchronized (nri0.class) {
            unmodifiableMap = Collections.unmodifiableMap(nri0.d);
        }
        jjx jjxVar = (jjx) unmodifiableMap.get(str);
        if (jjxVar != null) {
            return jjxVar;
        }
        throw new GeneralSecurityException(g8e.o("cannot find key template: ", str));
    }

    public static final v4u0 G(SnapshotStateList snapshotStateList) {
        return (v4u0) q2t0.t((v4u0) snapshotStateList.getFirstStateRecord(), snapshotStateList);
    }

    public static final int H(SnapshotStateList snapshotStateList) {
        return ((v4u0) q2t0.h((v4u0) snapshotStateList.getFirstStateRecord())).e;
    }

    public static final void I(fse fseVar, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            mse mseVar = (mse) fseVar.get(lse.a);
            if (mseVar != null) {
                mseVar.handleException(fseVar, th);
            } else {
                zrb1.e(fseVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ljo.a(runtimeException, th);
                th = runtimeException;
            }
            zrb1.e(fseVar, th);
        }
    }

    public static final int J(int i, String str) {
        int i2;
        int i3;
        int i4;
        Long m;
        String obj;
        String k = (str == null || (obj = evu0.k0(str).toString()) == null) ? null : b64.k("[^A-Fa-f0-9]", obj, "");
        long longValue = (k == null || (m = bvu0.m(16, k)) == null) ? 0L : m.longValue();
        Integer valueOf = k != null ? Integer.valueOf(k.length()) : null;
        int i5 = 255;
        if (valueOf != null && valueOf.intValue() == 3) {
            long j = i;
            i2 = (int) y6i0.f((((longValue >> 8) & 15) * 17) + j, 0L, 255L);
            i3 = (int) y6i0.f((((longValue >> 4) & 15) * 17) + j, 0L, 255L);
            i4 = (int) y6i0.f(((longValue & 15) * 17) + j, 0L, 255L);
        } else if (valueOf != null && valueOf.intValue() == 6) {
            int d2 = y6i0.d(((int) ((longValue >> 16) & 255)) + i, 0, 255);
            int d3 = y6i0.d(((int) ((longValue >> 8) & 255)) + i, 0, 255);
            i4 = y6i0.d(((int) (longValue & 255)) + i, 0, 255);
            i2 = d2;
            i3 = d3;
        } else if (valueOf != null && valueOf.intValue() == 8) {
            int d4 = y6i0.d(((int) ((longValue >> 16) & 255)) + i, 0, 255);
            i5 = (int) ((longValue >> 24) & 255);
            i3 = y6i0.d(((int) ((longValue >> 8) & 255)) + i, 0, 255);
            i4 = y6i0.d(((int) (longValue & 255)) + i, 0, 255);
            i2 = d4;
        } else {
            i2 = 1;
            i3 = 1;
            i4 = 0;
        }
        return Color.argb(i5, i2, i3, i4);
    }

    public static final boolean K(char c2) {
        return '0' <= c2 && c2 < ':';
    }

    public static final boolean L(Address address) {
        List conditionalActions;
        if (address == null || (conditionalActions = address.getConditionalActions()) == null) {
            return false;
        }
        List list = conditionalActions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<z> b2 = ((hyd) it.next()).getB();
            if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                for (z zVar : b2) {
                    if ((zVar instanceof o0) && ((o0) zVar).getA().a() == AdjustmentScreenType.POINT_ADJUSTMENT) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final Location M() {
        com.yandex.mapkit.location.Location lastKnownLocation;
        if (el00.a && (lastKnownLocation = LocationManagerUtils.getLastKnownLocation()) != null) {
            return N(lastKnownLocation);
        }
        return null;
    }

    public static Location N(com.yandex.mapkit.location.Location location) {
        Location location2 = new Location("mapkit");
        location2.setLongitude(location.getPosition().getLongitude());
        location2.setLatitude(location.getPosition().getLatitude());
        Double accuracy = location.getAccuracy();
        if (accuracy != null) {
            location2.setAccuracy((float) accuracy.doubleValue());
        }
        Double altitude = location.getAltitude();
        if (altitude != null) {
            location2.setAltitude(altitude.doubleValue());
        }
        Double heading = location.getHeading();
        if (heading != null) {
            location2.setBearing((float) heading.doubleValue());
        }
        Double speed = location.getSpeed();
        if (speed != null) {
            location2.setSpeed((float) speed.doubleValue());
        }
        location2.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(location.getAbsoluteTimestamp() - (System.currentTimeMillis() - SystemClock.elapsedRealtime())));
        location2.setTime(location.getAbsoluteTimestamp());
        return location2;
    }

    public static final FeedSdkTheme O(ThemeType themeType, String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (jl40.l(lowerCase, "ultima") && themeType.c()) {
            return FeedSdkTheme.ULTIMA_DARK;
        }
        if (jl40.l(lowerCase, "ultima") && themeType.f()) {
            return FeedSdkTheme.ULTIMA_LIGHT;
        }
        FeedSdkTheme feedSdkTheme = FeedSdkTheme.LIGHT;
        if (jl40.l(lowerCase, feedSdkTheme.getId()) && themeType.f()) {
            return FeedSdkTheme.ULTIMA_LIGHT;
        }
        FeedSdkTheme feedSdkTheme2 = FeedSdkTheme.DARK;
        if (jl40.l(lowerCase, feedSdkTheme2.getId()) && themeType.c()) {
            return FeedSdkTheme.ULTIMA_DARK;
        }
        int i = arq.a[themeType.ordinal()];
        if (i == 1) {
            return feedSdkTheme2;
        }
        if (i == 2) {
            return feedSdkTheme;
        }
        w511.b();
        return null;
    }

    public static final boolean P(SnapshotStateList snapshotStateList, tls tlsVar) {
        int i;
        n2b0 n2b0Var;
        Object invoke;
        i2t0 j;
        boolean e2;
        do {
            synchronized (c) {
                v4u0 v4u0Var = (v4u0) q2t0.h((v4u0) snapshotStateList.getFirstStateRecord());
                i = v4u0Var.d;
                n2b0Var = v4u0Var.c;
            }
            c3b0 builder = n2b0Var.builder();
            invoke = tlsVar.invoke(builder);
            n2b0 a2 = builder.a();
            if (jl40.l(a2, n2b0Var)) {
                break;
            }
            v4u0 v4u0Var2 = (v4u0) snapshotStateList.getFirstStateRecord();
            synchronized (q2t0.c) {
                j = q2t0.j();
                e2 = e((v4u0) q2t0.w(v4u0Var2, snapshotStateList, j), i, a2, true);
            }
            q2t0.n(j, snapshotStateList);
        } while (!e2);
        return ((Boolean) invoke).booleanValue();
    }

    public static final void Q(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", "com.google.android.webview", null));
            context.startActivity(intent);
        } catch (Exception unused) {
            try {
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("market://details?id=com.google.android.webview"));
                    context.startActivity(intent2);
                } catch (Exception e2) {
                    Toast.makeText(context, e2.getMessage(), 1).show();
                    context.startActivity(new Intent("android.settings.SETTINGS"));
                }
            } catch (ActivityNotFoundException unused2) {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.webview"));
                context.startActivity(intent3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static za7 R(meu meuVar) {
        int i;
        int i2;
        int i3;
        String str;
        meu meuVar2 = meuVar;
        int size = meuVar2.size();
        int i4 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = -1;
        int i6 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = -1;
        int i8 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i4 < size) {
            String b2 = meuVar2.b(i4);
            String f = meuVar2.f(i4);
            if (b2.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = f;
                    i = 0;
                    while (i < f.length()) {
                        int length = f.length();
                        int i9 = i;
                        while (true) {
                            if (i9 >= length) {
                                i2 = size;
                                i9 = f.length();
                                break;
                            }
                            i2 = size;
                            if (evu0.z("=,;", f.charAt(i9))) {
                                break;
                            }
                            i9++;
                            size = i2;
                        }
                        String obj = evu0.k0(f.substring(i, i9)).toString();
                        if (i9 == f.length() || f.charAt(i9) == ',' || f.charAt(i9) == ';') {
                            i3 = i9 + 1;
                            str = null;
                        } else {
                            int i10 = i9 + 1;
                            byte[] bArr = yf61.a;
                            int length2 = f.length();
                            while (true) {
                                if (i10 < length2) {
                                    char charAt = f.charAt(i10);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    i10 = f.length();
                                    break;
                                }
                            }
                            if (i10 >= f.length() || f.charAt(i10) != '\"') {
                                int length3 = f.length();
                                int i11 = i10;
                                while (true) {
                                    if (i11 >= length3) {
                                        i11 = f.length();
                                        break;
                                    }
                                    int i12 = length3;
                                    if (evu0.z(",;", f.charAt(i11))) {
                                        break;
                                    }
                                    i11++;
                                    length3 = i12;
                                }
                                int i13 = i11;
                                str = evu0.k0(f.substring(i10, i11)).toString();
                                i3 = i13;
                            } else {
                                int i14 = i10 + 1;
                                int G = evu0.G(f, OpenList.CHAR_QUOTE, i14, 4);
                                str = f.substring(i14, G);
                                i3 = G + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i = i3;
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i = i3;
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i5 = yf61.p(-1, str);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i6 = yf61.p(-1, str);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i = i3;
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i = i3;
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i = i3;
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i7 = yf61.p(Integer.MAX_VALUE, str);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i8 = yf61.p(-1, str);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i = i3;
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i = i3;
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i = i3;
                                z9 = true;
                            }
                            i = i3;
                        }
                        size = i2;
                    }
                    i4++;
                    meuVar2 = meuVar;
                    size = size;
                }
            } else if (!b2.equalsIgnoreCase("Pragma")) {
                i4++;
                meuVar2 = meuVar;
                size = size;
            }
            z = false;
            i = 0;
            while (i < f.length()) {
            }
            i4++;
            meuVar2 = meuVar;
            size = size;
        }
        return new za7(z2, z3, i5, i6, z4, z5, z6, i7, i8, z7, z8, z9, !z ? null : str2);
    }

    public static final boolean S(c cVar, cwi0 cwi0Var) {
        if (!Z(cVar, cwi0Var.a) || !Z(cVar, cwi0Var.b)) {
            return false;
        }
        String str = cwi0Var.c;
        return str != null ? Z(cVar, str) : true;
    }

    public static void T(String str, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap2) {
        ArrayList arrayList;
        if (linkedHashSet.contains(str)) {
            List J0 = a.J0(linkedHashSet);
            StringBuilder sb = new StringBuilder();
            int size = J0.size();
            for (int indexOf = J0.indexOf(str); indexOf < size; indexOf++) {
                sb.append((String) J0.get(indexOf));
                sb.append(" -> ");
            }
            sb.append(str);
            throw new CyclicDependencyException(sb.toString());
        }
        if (linkedHashSet2.contains(str)) {
            return;
        }
        List list = (List) linkedHashMap.get(str);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (linkedHashMap.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            linkedHashSet.add(str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                T((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
            }
            linkedHashSet.remove(str);
        }
        linkedHashSet2.add(str);
        RandomAccess randomAccess = arrayList;
        if (arrayList == null) {
            randomAccess = EmptyList.a;
        }
        linkedHashMap2.put(str, a.N0((Iterable) randomAccess));
    }

    public static void U(mfy0 mfy0Var, JSONObject jSONObject, boolean z, ArrayList arrayList) {
        String str;
        if (z) {
            Object opt = jSONObject.opt("type");
            if (opt == JSONObject.NULL) {
                opt = null;
            }
            if (opt == null) {
                throw fg90.h("type", jSONObject);
            }
            try {
                if (((String) opt).length() <= 0) {
                    throw fg90.f(jSONObject, "type", opt);
                }
                str = (String) opt;
            } catch (ClassCastException unused) {
                throw fg90.m(jSONObject, "type", opt);
            }
        } else {
            str = (String) wwg.N(mfy0Var, jSONObject, "type", b);
        }
        if (str != null) {
            arrayList.add(str);
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (obj instanceof JSONObject) {
                U(mfy0Var, (JSONObject) obj, false, arrayList);
            }
        }
        Iterator<String> keys2 = jSONObject.keys();
        while (keys2.hasNext()) {
            Object obj2 = jSONObject.get(keys2.next());
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj3 = jSONArray.get(i);
                    if (obj3 instanceof JSONObject) {
                        U(mfy0Var, (JSONObject) obj3, false, arrayList);
                    }
                }
            }
        }
    }

    public static final String V(int i, String str) {
        int G;
        if (str.length() >= i + 12) {
            int i2 = 0;
            if (evu0.z("+-", str.charAt(0)) && (G = evu0.G(str, LicenseUtility.SEPARATOR, 1, 4)) >= 12) {
                while (true) {
                    int i3 = i2 + 1;
                    if (str.charAt(i3) != '0') {
                        break;
                    }
                    i2 = i3;
                }
                if (G - i2 < 12) {
                    return evu0.R(1, G - 10, str).toString();
                }
            }
        }
        return str;
    }

    public static final PaintDrawable W(int i, int i2) {
        PaintDrawable paintDrawable = new PaintDrawable(i);
        paintDrawable.setCornerRadius(i2);
        int i3 = i2 * 2;
        paintDrawable.setIntrinsicWidth(i3);
        paintDrawable.setIntrinsicHeight(i3);
        return paintDrawable;
    }

    public static LinkedHashMap X(mfy0 mfy0Var, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                ArrayList arrayList = new ArrayList();
                U(mfy0Var, (JSONObject) obj, true, arrayList);
                linkedHashMap.put(next, arrayList);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            T((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
        }
        return linkedHashMap2;
    }

    public static final String Y(c6z c6zVar, String str) {
        String str2 = (String) c6zVar.getC().get(str);
        return str2 == null ? "" : str2;
    }

    public static final boolean Z(c6z c6zVar, String str) {
        CharSequence charSequence;
        return (str.length() <= 0 || (charSequence = (CharSequence) c6zVar.getC().get(str)) == null || charSequence.length() == 0) ? false : true;
    }

    public static final o2f0 a(String str, h2f0 h2f0Var) {
        if (evu0.J(str)) {
            ny61.g("Blank serial names are prohibited");
            return null;
        }
        Object it = ((xf00) s2f0.a.values()).iterator();
        while (((uf00) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((sf00) it).next();
            if (str.equals(kSerializer.getDescriptor().h())) {
                StringBuilder x = unr0.x("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                x.append(qoi0.a(kSerializer.getClass()).d());
                x.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                ny61.g(vuu0.c(x.toString()));
                return null;
            }
        }
        return new o2f0(str, h2f0Var);
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final Object d(Object obj) {
        return !(obj instanceof Result) ? obj : ((Result) obj).getValue();
    }

    public static final boolean e(v4u0 v4u0Var, int i, n2b0 n2b0Var, boolean z) {
        boolean z2;
        synchronized (c) {
            try {
                int i2 = v4u0Var.d;
                if (i2 == i) {
                    v4u0Var.c = n2b0Var;
                    z2 = true;
                    if (z) {
                        v4u0Var.e++;
                    }
                    v4u0Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final asq0 f(String str, SerialDescriptor[] serialDescriptorArr, tls tlsVar) {
        if (evu0.J(str)) {
            ny61.g("Blank serial names are prohibited");
            return null;
        }
        h0c h0cVar = new h0c(str);
        tlsVar.invoke(h0cVar);
        return new asq0(str, ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    public static asq0 g(String str, SerialDescriptor[] serialDescriptorArr) {
        if (evu0.J(str)) {
            ny61.g("Blank serial names are prohibited");
            return null;
        }
        h0c h0cVar = new h0c(str);
        return new asq0(str, ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    public static final asq0 h(String str, jl40 jl40Var, SerialDescriptor[] serialDescriptorArr, tls tlsVar) {
        if (evu0.J(str)) {
            ny61.g("Blank serial names are prohibited");
            return null;
        }
        if (jl40Var.equals(ovu0.g)) {
            ny61.g("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        h0c h0cVar = new h0c(str);
        tlsVar.invoke(h0cVar);
        return new asq0(str, jl40Var, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    public static asq0 i(String str, jl40 jl40Var, SerialDescriptor[] serialDescriptorArr) {
        if (evu0.J(str)) {
            ny61.g("Blank serial names are prohibited");
            return null;
        }
        if (jl40Var.equals(ovu0.g)) {
            ny61.g("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        h0c h0cVar = new h0c(str);
        return new asq0(str, jl40Var, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    public static final String j(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.g(str);
    }

    public static void l(boolean z) {
        if (z) {
            return;
        }
        w511.q();
    }

    public static void m(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.g(str);
    }

    public static void n(boolean z) {
        if (z) {
            return;
        }
        w511.q();
    }

    public static void o(float f, String str) {
        if (Float.isNaN(f)) {
            ny61.g(str.concat(" must not be NaN"));
        } else if (Float.isInfinite(f)) {
            ny61.g(str.concat(" must not be infinite"));
        }
    }

    public static void p(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + Extension.FIX_SPACE + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + Extension.FIX_SPACE + i3 + "] (too high)");
    }

    public static void q(long j, String str) {
        if (j < 0) {
            Locale locale = Locale.US;
            ny61.g(str.concat(" is out of range of [0, 9223372036854775807] (too low)"));
        } else {
            if (j <= ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                return;
            }
            Locale locale2 = Locale.US;
            ny61.g(str.concat(" is out of range of [0, 9223372036854775807] (too high)"));
        }
    }

    public static void r(int i) {
        if (i >= 0) {
            return;
        }
        w511.q();
    }

    public static void s(int i, int i2) {
        if (i < 0 || i >= i2) {
            ny61.s();
        }
    }

    public static void t(ye10 ye10Var) {
        ye10Var.getClass();
    }

    public static void u(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(str);
    }

    public static void v(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(str);
    }

    public static void w(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.r(str);
    }

    public static void x(boolean z) {
        if (z) {
            return;
        }
        ny61.k();
    }

    public static void y(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.r(str);
    }

    public static void z(Object obj) {
        if (obj != null) {
            return;
        }
        ny61.k();
    }

    public abstract void c(q5j0 q5j0Var, Object obj);
}
