package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.i;
import com.arkivanov.mvikotlin.core.utils.internal.AtomicKt$atomic$1;
import com.yandex.div.state.db.StateEntry;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.time.DurationUnit;
import kotlinx.datetime.internal.format.parser.ParseException;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.SSLLogger;
import ru.domesticroots.certificatetransparency.internal.verifier.b;
import ru.domesticroots.webview.c;

/* loaded from: classes9.dex */
public abstract class kp50 {
    public static final y0u a = new y0u(5);
    public static final Object b = new Object();
    public static boolean c;

    public static final void A(AtomicKt$atomic$1 atomicKt$atomic$1, Object obj) {
        if (atomicKt$atomic$1.compareAndSet(null, obj)) {
            return;
        }
        yhl.d(atomicKt$atomic$1, "Value is already initialized: ");
    }

    public static final boolean B(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = x4e.b(f8, f26, (f6 * f28) - (f7 * f27), f30);
            fArr2[1] = oyr.a(f4, f26, (f3 * f27) + ((-f2) * f28), f30);
            fArr2[2] = x4e.b(f16, f20, (f14 * f22) - (f15 * f21), f30);
            fArr2[3] = oyr.a(f12, f20, (f11 * f21) + ((-f10) * f22), f30);
            float f31 = -f5;
            fArr2[4] = oyr.a(f8, f24, (f7 * f25) + (f31 * f28), f30);
            fArr2[5] = x4e.b(f4, f24, (f28 * f) - (f3 * f25), f30);
            float f32 = -f13;
            fArr2[6] = oyr.a(f16, f18, (f15 * f19) + (f32 * f22), f30);
            fArr2[7] = x4e.b(f12, f18, (f9 * f22) - (f11 * f19), f30);
            fArr2[8] = x4e.b(f8, f23, (f5 * f27) - (f6 * f25), f30);
            fArr2[9] = oyr.a(f4, f23, (f25 * f2) + ((-f) * f27), f30);
            fArr2[10] = x4e.b(f16, f17, (f13 * f21) - (f14 * f19), f30);
            fArr2[11] = oyr.a(f12, f17, (f19 * f10) + ((-f9) * f21), f30);
            fArr2[12] = oyr.a(f7, f23, (f6 * f24) + (f31 * f26), f30);
            fArr2[13] = x4e.b(f3, f23, (f * f26) - (f2 * f24), f30);
            fArr2[14] = oyr.a(f15, f17, (f14 * f18) + (f32 * f20), f30);
            fArr2[15] = x4e.b(f11, f17, (f9 * f20) - (f10 * f18), f30);
        }
        return !(f29 == 0.0f);
    }

    public static boolean C(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean D(View view) {
        if (view instanceof ax01) {
            if (((ax01) view).isTransient()) {
                return true;
            }
            if (view.getParent() instanceof ViewGroup) {
                Object parent = view.getParent();
                if ((parent instanceof ax01) && D((View) parent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean E(String str, String str2) {
        return str.startsWith(str2.concat(Extension.O_BRAKE)) && str.endsWith(Extension.C_BRAKE);
    }

    public static final f530 F(f530 f530Var, zls zlsVar) {
        return f530Var.k(new e0y(zlsVar));
    }

    public static fpe G(wf90 wf90Var, CharSequence charSequence, fpe fpeVar) {
        String sb;
        ArrayList arrayList = new ArrayList();
        ArrayList i = scc.i(new jf90(fpeVar, wf90Var, 0));
        while (true) {
            jf90 jf90Var = (jf90) ycc.A(i);
            if (jf90Var == null) {
                int i2 = 1;
                if (arrayList.size() > 1) {
                    xcc.q(arrayList, new lf90());
                }
                if (arrayList.size() == 1) {
                    sb = "Position " + ((ff90) arrayList.get(0)).a + Extension.COLON_SPACE + ((String) ((ff90) arrayList.get(0)).b.invoke());
                } else {
                    StringBuilder sb2 = new StringBuilder(arrayList.size() * 33);
                    a.W(arrayList, sb2, Extension.FIX_SPACE, new bd90(i2), 56);
                    sb = sb2.toString();
                }
                throw new ParseException(sb);
            }
            fpe fpeVar2 = (fpe) ((fpe) jf90Var.a).copy();
            int i3 = jf90Var.c;
            wf90 wf90Var2 = jf90Var.b;
            List list = wf90Var2.a;
            List list2 = wf90Var2.b;
            int size = list.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    Object a2 = ((uf90) wf90Var2.a.get(i4)).a(fpeVar2, charSequence, i3);
                    if (a2 instanceof Integer) {
                        i3 = ((Number) a2).intValue();
                        i4++;
                    } else {
                        if (!(a2 instanceof ff90)) {
                            ny61.r(b64.i("Unexpected parse result: ", a2));
                            return null;
                        }
                        arrayList.add((ff90) a2);
                    }
                } else if (!list2.isEmpty()) {
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i5 = size2 - 1;
                            i.add(new jf90(fpeVar2, (wf90) list2.get(size2), i3));
                            if (i5 < 0) {
                                break;
                            }
                            size2 = i5;
                        }
                    }
                } else {
                    if (i3 == charSequence.length()) {
                        return fpeVar2;
                    }
                    arrayList.add(new ff90(i3, mf90.a));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b8, code lost:
    
        if (r5 == r26.length()) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c0, code lost:
    
        if (r26.charAt(r5) != 'S') goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
    
        r2 = (r14 * com.squareup.wire.internal.MathMethodsKt.NANOS_PER_SECOND) + r15;
        r14 = r9;
        r4 = kotlin.time.DurationUnit.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d6, code lost:
    
        switch(defpackage.t3n.a[r4.ordinal()]) {
            case 1: goto L128;
            case 2: goto L127;
            case 3: goto L126;
            case 4: goto L125;
            case 5: goto L124;
            case 6: goto L123;
            case 7: goto L122;
            default: goto L121;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d9, code lost:
    
        defpackage.yhl.d(r4, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0210, code lost:
    
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e1, code lost:
    
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020a, code lost:
    
        r2 = defpackage.m810.c(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e7, code lost:
    
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ed, code lost:
    
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f3, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f9, code lost:
    
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ff, code lost:
    
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0205, code lost:
    
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0104, code lost:
    
        defpackage.ny61.g("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0107, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00f2, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r5 >= r26.length()) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        r3 = r26.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if ('0' > r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r3 >= ':') goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r5 == r26.length()) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        if (r2 == '+') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        if (r2 == '-') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if (r5 == (r23 + r2)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        r20 = 4611686018427387903L;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[LOOP:5: B:75:0x015a->B:76:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195 A[LOOP:7: B:87:0x0193->B:88:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long H(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int min;
        int i7;
        char charAt;
        int i8;
        int i9;
        if (str.length() == 0) {
            ny61.g("The string is empty");
            return 0L;
        }
        char charAt2 = str.charAt(0);
        int i10 = 1;
        char c2 = LicenseUtility.SEPARATOR;
        char c3 = '+';
        if (charAt2 != '+') {
            i2 = charAt2 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            ny61.g("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            ny61.g("");
            return 0L;
        }
        int i11 = i2 + 1;
        if (i11 == str.length()) {
            ny61.g("");
            return 0L;
        }
        int i12 = 0;
        DurationUnit durationUnit = null;
        long j2 = 0;
        long j3 = 0;
        while (i11 < str.length()) {
            char charAt3 = str.charAt(i11);
            if (charAt3 != 'T') {
                amz amzVar = amz.c;
                int i13 = i10;
                char charAt4 = str.charAt(i11);
                if (charAt4 == c3) {
                    i3 = i11 + 1;
                } else {
                    if (charAt4 == c2) {
                        i3 = i11 + 1;
                        i4 = -1;
                        while (i3 < str.length() && str.charAt(i3) == '0') {
                            i3++;
                        }
                        j = 0;
                        while (true) {
                            if (i3 >= str.length()) {
                                char charAt5 = str.charAt(i3);
                                i5 = i11;
                                if ('0' <= charAt5 && charAt5 < ':') {
                                    i8 = charAt5 - '0';
                                    i9 = i;
                                    long j4 = amzVar.a;
                                    if (j <= j4 && (j != j4 || i8 <= amzVar.b)) {
                                        j = (j << 3) + (j << i13) + i8;
                                        i3++;
                                        i11 = i5;
                                        amzVar = amzVar;
                                        i = i9;
                                    }
                                }
                            } else {
                                i5 = i11;
                            }
                        }
                        int i14 = i;
                        if (i3 != str.length()) {
                            if (i3 == i5 + ((charAt3 == '+' || charAt3 == '-') ? i13 : 0)) {
                            }
                            long j5 = j;
                            if (str.charAt(i3) == '.') {
                                int i15 = i3 + 1;
                                int min2 = Math.min(i3 + 7, str.length());
                                int i16 = 0;
                                for (int i17 = i15; i17 < min2; i17++) {
                                    char charAt6 = str.charAt(i17);
                                    if ('0' <= charAt6 && charAt6 < ':') {
                                        i16 = (charAt6 - '0') + (i16 << 3) + (i16 << 1);
                                    }
                                    for (i6 = 0; i6 < 6 - (i17 - i15); i6++) {
                                        i16 = (i16 << 1) + (i16 << 3);
                                    }
                                    min = Math.min(i17 + 9, str.length());
                                    i3 = i17;
                                    int i18 = 0;
                                    while (i3 < min) {
                                        char charAt7 = str.charAt(i3);
                                        int i19 = min;
                                        if ('0' <= charAt7 && charAt7 < ':') {
                                            i18 = (charAt7 - '0') + (i18 << 3) + (i18 << 1);
                                            i3++;
                                            min = i19;
                                        }
                                        for (i7 = 0; i7 < 9 - (i3 - i17); i7++) {
                                            i18 = (i18 << 1) + (i18 << 3);
                                        }
                                        while (i3 < str.length() && '0' <= (charAt = str.charAt(i3)) && charAt < ':') {
                                            i3++;
                                        }
                                        ny61.g("");
                                        return 0L;
                                    }
                                    while (i7 < 9 - (i3 - i17)) {
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    ny61.g("");
                                    return 0L;
                                }
                                while (i6 < 6 - (i17 - i15)) {
                                }
                                min = Math.min(i17 + 9, str.length());
                                i3 = i17;
                                int i182 = 0;
                                while (i3 < min) {
                                }
                                while (i7 < 9 - (i3 - i17)) {
                                }
                                while (i3 < str.length()) {
                                }
                                ny61.g("");
                                return 0L;
                            }
                            char charAt8 = str.charAt(i3);
                            DurationUnit durationUnit2 = charAt8 != 'D' ? charAt8 != 'H' ? charAt8 != 'M' ? charAt8 != 'S' ? null : DurationUnit.SECONDS : DurationUnit.MINUTES : DurationUnit.HOURS : DurationUnit.DAYS;
                            if (durationUnit2 == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (durationUnit != null && durationUnit.compareTo(durationUnit2) <= 0) {
                                ny61.g("Unexpected order of duration components");
                                return 0L;
                            }
                            if (durationUnit2 == DurationUnit.DAYS) {
                                if (i12 != 0) {
                                    ny61.g("");
                                    return 0L;
                                }
                                j2 = a4n.b(j5, durationUnit2) * i4;
                            } else {
                                if (i12 == 0) {
                                    ny61.g("");
                                    return 0L;
                                }
                                long d = d(j2, a4n.b(j5, durationUnit2) * i4);
                                if (d == 9223372036854759646L) {
                                    ny61.g("");
                                    return 0L;
                                }
                                j2 = d;
                            }
                            i11 = i3 + 1;
                            durationUnit = durationUnit2;
                            i10 = i13;
                            i = i14;
                            c2 = LicenseUtility.SEPARATOR;
                            c3 = '+';
                        }
                        ny61.g("");
                        return 0L;
                    }
                    i3 = i11;
                }
                i4 = i13;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 >= str.length()) {
                    }
                    j = (j << 3) + (j << i13) + i8;
                    i3++;
                    i11 = i5;
                    amzVar = amzVar;
                    i = i9;
                }
                int i142 = i;
                if (i3 != str.length()) {
                }
                ny61.g("");
                return 0L;
            }
            if (i12 != 0 || (i11 = i11 + 1) == str.length()) {
                ny61.g("");
                return 0L;
            }
            i12 = i10;
        }
        int i20 = i;
        long k = e3n.k(V(j2, DurationUnit.MILLISECONDS), V(j3, DurationUnit.NANOSECONDS));
        return (i20 == 0 || e3n.d(k, e3n.x)) ? k : e3n.q(k);
    }

    public static final Object I(Handler handler, m1x0 m1x0Var) {
        Object obj;
        if (jl40.l(handler.getLooper(), Looper.myLooper())) {
            return m1x0Var.run();
        }
        synchronized (handler) {
            l1x0 l1x0Var = new l1x0(handler, m1x0Var);
            handler.post(l1x0Var);
            while (!l1x0Var.b) {
                try {
                    handler.wait();
                } catch (InterruptedException unused) {
                }
            }
            obj = l1x0Var.x;
        }
        return obj;
    }

    public static final Class J(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return J(((ParameterizedType) type).getRawType());
        }
        if (type instanceof WildcardType) {
            return J((Type) j73.C(((WildcardType) type).getUpperBounds()));
        }
        if (type instanceof GenericArrayType) {
            return J(((GenericArrayType) type).getGenericComponentType());
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        w511.p(sb, " has type ", qoi0.a(type.getClass()));
        return null;
    }

    public static final KSerializer K(kf5 kf5Var, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer n = y5e.n(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (n != null) {
            return n;
        }
        g0c a2 = qoi0.a(cls);
        KSerializer kSerializer = (KSerializer) s2f0.a.get(a2);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer b2 = kf5Var.b(a2, list);
        if (b2 != null) {
            return b2;
        }
        if (cls.isInterface()) {
            return new v5e0(qoi0.a(cls));
        }
        return null;
    }

    public static final Object L(List list) {
        Object removeFirst;
        if (!jx81.g()) {
            return list.remove(0);
        }
        removeFirst = list.removeFirst();
        return removeFirst;
    }

    public static final Object M(List list) {
        Object removeLast;
        if (!jx81.g()) {
            return list.remove(scc.f(list));
        }
        removeLast = list.removeLast();
        return removeLast;
    }

    public static final Object N(AtomicKt$atomic$1 atomicKt$atomic$1) {
        Object obj = atomicKt$atomic$1.get();
        if (obj != null) {
            return obj;
        }
        ny61.g("Value was not initialized");
        return null;
    }

    public static int O(Context context, int i, int i2) {
        TypedValue b2 = z610.b(context.getTheme(), i);
        return (b2 == null || b2.type != 16) ? i2 : b2.data;
    }

    public static TimeInterpolator P(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            ny61.g("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!E(valueOf, "cubic-bezier") && !E(valueOf, StateEntry.COLUMN_PATH)) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!E(valueOf, "cubic-bezier")) {
            if (E(valueOf, StateEntry.COLUMN_PATH)) {
                return new PathInterpolator(n891.i(oyr.g(1, 5, valueOf)));
            }
            ny61.g("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
        if (split.length == 4) {
            return new PathInterpolator(u(0, split), u(1, split), u(2, split), u(3, split));
        }
        ny61.e(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    public static owt0 Q(Context context, int i, int i2) {
        TypedValue a2 = z610.a(i, context);
        TypedArray obtainStyledAttributes = a2 == null ? context.obtainStyledAttributes(null, z2i0.MaterialSpring, 0, i2) : context.obtainStyledAttributes(a2.resourceId, z2i0.MaterialSpring);
        owt0 owt0Var = new owt0();
        try {
            float f = obtainStyledAttributes.getFloat(z2i0.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(z2i0.MaterialSpring_damping, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            owt0Var.b(f);
            owt0Var.a(f2);
            return owt0Var;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v20 kotlinx.serialization.KSerializer, still in use, count: 2, list:
          (r7v20 kotlinx.serialization.KSerializer) from 0x0027: IF  (r7v20 kotlinx.serialization.KSerializer) == (null kotlinx.serialization.KSerializer)  -> B:21:0x00ca A[HIDDEN]
          (r7v20 kotlinx.serialization.KSerializer) from 0x002b: PHI (r7v21 kotlinx.serialization.KSerializer) = (r7v20 kotlinx.serialization.KSerializer) binds: [B:20:0x0027] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final kotlinx.serialization.KSerializer R(defpackage.kf5 r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp50.R(kf5, java.lang.reflect.Type, boolean):kotlinx.serialization.KSerializer");
    }

    public static final wzl S(kg90 kg90Var, f0m f0mVar, boolean z, boolean z2) {
        if (kg90Var instanceof jg90) {
            h2m h2mVar = (h2m) ((jg90) kg90Var).a;
            return new xzl(h2mVar.a, h2mVar.b, f0mVar, z, z2);
        }
        if (kg90Var instanceof ig90) {
            return new uzl(((ig90) kg90Var).a());
        }
        w511.b();
        return null;
    }

    public static final long T(double d, DurationUnit durationUnit) {
        double a2 = y3n.a(d, durationUnit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(a2)) {
            ny61.g("Duration value cannot be NaN.");
            return 0L;
        }
        long c2 = m810.c(a2);
        return (-4611686018426999999L > c2 || c2 >= 4611686018427000000L) ? n(m810.c(y3n.a(d, durationUnit, DurationUnit.MILLISECONDS))) : o(c2);
    }

    public static final long U(int i, DurationUnit durationUnit) {
        if (durationUnit.compareTo(DurationUnit.SECONDS) > 0) {
            return V(i, durationUnit);
        }
        return o(DurationUnit.NANOSECONDS.getTimeUnit().convert(i, durationUnit.getTimeUnit()));
    }

    public static final long V(long j, DurationUnit durationUnit) {
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long convert = durationUnit.getTimeUnit().convert(4611686018426999999L, durationUnit2.getTimeUnit());
        if ((-convert) <= j && j <= convert) {
            return o(durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit()));
        }
        DurationUnit durationUnit3 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit3) < 0) {
            return m(y6i0.f(durationUnit3.getTimeUnit().convert(j, durationUnit.getTimeUnit()), -4611686018427387903L, 4611686018427387903L));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m(a4n.b(Math.abs(j), durationUnit) * signum);
    }

    public static final wzl W(wzl wzlVar, boolean z) {
        if (!(wzlVar instanceof xzl)) {
            return wzlVar;
        }
        m631 m631Var = new m631(g8e.z("headRequest", String.valueOf(z)));
        xzl xzlVar = (xzl) wzlVar;
        cnr0 cnr0Var = xzlVar.a.c;
        cnr0 cnr0Var2 = cnr0.b;
        return xzl.a(xzlVar, ywl.a(xzlVar.a, null, null, cnr0Var.a(vez0.f(Collections.singletonList(m631Var))), null, 59));
    }

    public static String X(Context context) {
        try {
            return context.getResources().getResourcePackageName(hxh0.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final void a(pnt0 pnt0Var) {
        int i = pnt0Var.w;
        int[] iArr = pnt0Var.b;
        Object[] objArr = pnt0Var.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != b) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        pnt0Var.a = false;
        pnt0Var.w = i2;
    }

    public static final wzl b(Map map, sls slsVar) {
        Double d;
        leu leuVar = new leu(map);
        ab7 ab7Var = yw50.a;
        ab7 H = jl40.H(leuVar);
        Long valueOf = (H == null || (d = H.b) == null) ? null : Long.valueOf((long) (d.doubleValue() * 1000.0d));
        Long valueOf2 = valueOf != null ? Long.valueOf(System.currentTimeMillis() + valueOf.longValue()) : null;
        String a2 = new leu(map).a("Document-Stale-If-Error");
        boolean l = jl40.l(a2 != null ? evu0.k0(a2).toString() : null, "true");
        String a3 = new leu(map).a("X-Screen-Is-Broken");
        return S((kg90) slsVar.invoke(), new f0m(valueOf2), l, jl40.l(a3 != null ? evu0.k0(a3).toString() : null, "true"));
    }

    public static final Object c(InputStream inputStream, uu00 uu00Var, uyg uygVar, v5j0 v5j0Var, sls slsVar) {
        Map velocityContext;
        String uuid = UUID.randomUUID().toString();
        o2m o2mVar = new o2m(inputStream);
        if (uygVar != null) {
            uygVar.startDecodingDocument(uu00Var.a, uuid);
        }
        Object invoke = slsVar.invoke();
        if (uygVar != null) {
            wu00 a2 = v5j0Var.a();
            if (invoke instanceof jg90) {
                Object obj = ((jg90) invoke).a;
                b8u b8uVar = obj instanceof b8u ? (b8u) obj : null;
                velocityContext = uygVar.getVelocityContext(b8uVar != null ? b8uVar.a() : null);
            } else {
                b8u b8uVar2 = invoke instanceof b8u ? (b8u) invoke : null;
                velocityContext = uygVar.getVelocityContext(b8uVar2 != null ? b8uVar2.a() : null);
            }
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("reqId", a2.e);
            mapBuilder.putAll(a2.k);
            mapBuilder.putAll(velocityContext);
            mapBuilder.put("isPreload", String.valueOf(v5j0Var.l));
            MapBuilder j = mapBuilder.j();
            String str = uu00Var.a;
            long j2 = o2mVar.a;
            List list = (List) uu00Var.c.get("pageToken");
            uygVar.endDecodingDocument(str, new syg(j2, list != null ? (String) a.R(list) : null, j), uuid);
        }
        return invoke;
    }

    public static final long d(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : y6i0.f(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static float e(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float a2 = oyr.a(f, f6, (((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3), 0.5f);
        return a2 < 0.0f ? -a2 : a2;
    }

    public static i f(xij xijVar, boolean z) {
        int[] iArr;
        int[] iArr2;
        int i;
        cjj cjjVar;
        int i2;
        bjj bjjVar;
        int i3;
        cjj cjjVar2;
        cjj cjjVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int e = xijVar.e();
        int d = xijVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bjj bjjVar2 = new bjj();
        int i12 = 0;
        bjjVar2.a = 0;
        bjjVar2.b = e;
        bjjVar2.c = 0;
        bjjVar2.d = d;
        arrayList2.add(bjjVar2);
        int i13 = e + d;
        int i14 = 1;
        int i15 = (((i13 + 1) / 2) * 2) + 1;
        int[] iArr3 = new int[i15];
        int i16 = i15 / 2;
        int[] iArr4 = new int[i15];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            bjj bjjVar3 = (bjj) arrayList2.remove(arrayList2.size() - i14);
            if (bjjVar3.b() >= i14 && bjjVar3.a() >= i14) {
                int a2 = ((bjjVar3.a() + bjjVar3.b()) + i14) / 2;
                int i17 = i14 + i16;
                iArr3[i17] = bjjVar3.a;
                iArr4[i17] = bjjVar3.b;
                int i18 = i12;
                while (i18 < a2) {
                    int i19 = Math.abs(bjjVar3.b() - bjjVar3.a()) % 2 == i14 ? i14 : i12;
                    int b2 = bjjVar3.b() - bjjVar3.a();
                    int i20 = -i18;
                    int i21 = i20;
                    while (true) {
                        if (i21 > i18) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i3 = i12;
                            i = i16;
                            cjjVar2 = null;
                            break;
                        }
                        if (i21 == i20 || (i21 != i18 && iArr3[i21 + 1 + i16] > iArr3[(i21 - 1) + i16])) {
                            i8 = iArr3[i21 + 1 + i16];
                            i9 = i8;
                        } else {
                            i8 = iArr3[(i21 - 1) + i16];
                            i9 = i8 + 1;
                        }
                        iArr = iArr4;
                        int i22 = ((i9 - bjjVar3.a) + bjjVar3.c) - i21;
                        if (i18 == 0 || i9 != i8) {
                            i10 = i22;
                        } else {
                            i10 = i22;
                            i22--;
                        }
                        int i23 = i10;
                        iArr2 = iArr3;
                        int i24 = i9;
                        int i25 = i23;
                        i = i16;
                        while (i24 < bjjVar3.b && i25 < bjjVar3.d && xijVar.b(i24, i25)) {
                            i24++;
                            i25++;
                        }
                        iArr2[i21 + i] = i24;
                        if (i19 != 0) {
                            int i26 = b2 - i21;
                            i11 = i21;
                            if (i26 >= i20 + 1 && i26 <= i18 - 1 && iArr[i26 + i] <= i24) {
                                cjjVar2 = new cjj();
                                cjjVar2.a = i8;
                                cjjVar2.b = i22;
                                cjjVar2.c = i24;
                                cjjVar2.d = i25;
                                i3 = 0;
                                cjjVar2.e = false;
                                break;
                            }
                        } else {
                            i11 = i21;
                        }
                        i21 = i11 + 2;
                        i12 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i16 = i;
                    }
                    if (cjjVar2 != null) {
                        cjjVar = cjjVar2;
                        break;
                    }
                    int i27 = (bjjVar3.b() - bjjVar3.a()) % 2 == 0 ? 1 : i3;
                    int b3 = bjjVar3.b() - bjjVar3.a();
                    int i28 = i20;
                    while (true) {
                        if (i28 > i18) {
                            cjjVar3 = null;
                            break;
                        }
                        if (i28 == i20 || (i28 != i18 && iArr[i28 + 1 + i] < iArr[(i28 - 1) + i])) {
                            i4 = iArr[i28 + 1 + i];
                            i5 = i4;
                        } else {
                            i4 = iArr[(i28 - 1) + i];
                            i5 = i4 - 1;
                        }
                        int i29 = bjjVar3.d - ((bjjVar3.b - i5) - i28);
                        int i30 = (i18 == 0 || i5 != i4) ? i29 : i29 + 1;
                        while (i5 > bjjVar3.a && i29 > bjjVar3.c) {
                            i6 = i27;
                            if (!xijVar.b(i5 - 1, i29 - 1)) {
                                break;
                            }
                            i5--;
                            i29--;
                            i27 = i6;
                        }
                        i6 = i27;
                        iArr[i28 + i] = i5;
                        if (i6 != 0 && (i7 = b3 - i28) >= i20 && i7 <= i18 && iArr2[i7 + i] >= i5) {
                            cjjVar3 = new cjj();
                            cjjVar3.a = i5;
                            cjjVar3.b = i29;
                            cjjVar3.c = i4;
                            cjjVar3.d = i30;
                            cjjVar3.e = true;
                            break;
                        }
                        i28 += 2;
                        i27 = i6;
                    }
                    if (cjjVar3 != null) {
                        cjjVar = cjjVar3;
                        break;
                    }
                    i18++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i16 = i;
                    i14 = 1;
                    i12 = 0;
                }
            }
            iArr = iArr4;
            iArr2 = iArr3;
            i = i16;
            cjjVar = null;
            if (cjjVar != null) {
                if (cjjVar.a() > 0) {
                    int i31 = cjjVar.d;
                    int i32 = cjjVar.b;
                    int i33 = i31 - i32;
                    int i34 = cjjVar.c;
                    int i35 = cjjVar.a;
                    int i36 = i34 - i35;
                    arrayList.add(i33 != i36 ? cjjVar.e ? new yij(i35, i32, cjjVar.a()) : i33 > i36 ? new yij(i35, i32 + 1, cjjVar.a()) : new yij(i35 + 1, i32, cjjVar.a()) : new yij(i35, i32, i36));
                }
                if (arrayList3.isEmpty()) {
                    bjjVar = new bjj();
                    i2 = 1;
                } else {
                    i2 = 1;
                    bjjVar = (bjj) arrayList3.remove(arrayList3.size() - 1);
                }
                bjjVar.a = bjjVar3.a;
                bjjVar.c = bjjVar3.c;
                bjjVar.b = cjjVar.a;
                bjjVar.d = cjjVar.b;
                arrayList2.add(bjjVar);
                bjjVar3.b = bjjVar3.b;
                bjjVar3.d = bjjVar3.d;
                bjjVar3.a = cjjVar.c;
                bjjVar3.c = cjjVar.d;
                arrayList2.add(bjjVar3);
            } else {
                i2 = 1;
                arrayList3.add(bjjVar3);
            }
            iArr4 = iArr;
            i14 = i2;
            iArr3 = iArr2;
            i16 = i;
            i12 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, a);
        return new i(xijVar, arrayList, iArr3, iArr5, z);
    }

    public static final ike g(tse tseVar, fse fseVar) {
        return bvf0.a(tseVar.getCoroutineContext().plus(new qhw0((l8x) tseVar.getCoroutineContext().get(seu.C))).plus(fseVar));
    }

    public static final String h(String str) {
        if (str == null) {
            str = "";
        }
        return "Bearer ".concat(str);
    }

    public static final ez40 i() {
        return new ez40(true, (int) (1 == true ? 1 : 0));
    }

    public static X509TrustManager j(KeyStore keyStore, tgz tgzVar) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return (X509TrustManager) trustManager;
                    } catch (IllegalArgumentException e) {
                        tgzVar.r("Error creating trust manager (" + trustManager.getClass().getName() + "): " + e);
                    }
                }
            }
            tgzVar.r("Could not find suitable trust manager");
            return null;
        } catch (RuntimeException e2) {
            tgzVar.s(e2, "TrustManagerFactory.getTrustManagers() unexpectedly threw");
            throw new KeyStoreException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509TrustManager k(Context context, q79 q79Var, y97 y97Var, tgz tgzVar) {
        X509TrustManager x509TrustManager;
        KeyStore keyStore;
        Certificate generateCertificate;
        InputStream openRawResource = ((rl60) q79Var).a.getResources().openRawResource(nwh0.nuc_cert);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = openRawResource.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                byte[][] bArr2 = {byteArray};
                try {
                    keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    keyStore.load(null);
                    try {
                        generateCertificate = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(bArr2[0]));
                    } catch (CertificateException unused) {
                        tgzVar.getClass();
                    }
                } catch (IOException | GeneralSecurityException unused2) {
                    tgzVar.getClass();
                }
                if (!(generateCertificate instanceof X509Certificate)) {
                    throw new CertificateException(qv10.m(generateCertificate.getClass(), "Generated certificate is ", ", but expected X509Certificate"));
                }
                try {
                    keyStore.setCertificateEntry("custom_cert_0", (X509Certificate) generateCertificate);
                } catch (KeyStoreException unused3) {
                    tgzVar.getClass();
                }
                try {
                    x509TrustManager = j(keyStore, tgzVar);
                } catch (KeyStoreException | NoSuchAlgorithmException unused4) {
                    tgzVar.getClass();
                    x509TrustManager = null;
                    if (x509TrustManager != null) {
                    }
                }
                if (x509TrustManager != null) {
                    return null;
                }
                o370 o370Var = new o370(y97Var);
                OkHttpClient.a aVar = new OkHttpClient.a();
                aVar.a(new x810());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aVar.b(30L, timeUnit);
                aVar.g(30L, timeUnit);
                aVar.i(30L);
                aVar.l = null;
                ru.domesticroots.certificatetransparency.loglist.a aVar2 = new ru.domesticroots.certificatetransparency.loglist.a(o370Var, new OkHttpClient(aVar));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                return c.a(new b(x509TrustManager, a.N0(linkedHashSet), a.N0(linkedHashSet2), aVar2, new ru.domesticroots.certificatetransparency.cache.a(context, new tez()), new yo40(tgzVar)), tgzVar);
            } finally {
            }
        } catch (IOException e) {
            ny61.n("Failed to get certificate from resources", e);
            return null;
        }
    }

    public static byte[] l(byte[] bArr) {
        if (bArr.length != 16) {
            ny61.g("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b2 = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & HProv.PP_CONTAINER_DEFAULT)) ^ bArr2[15]);
        return bArr2;
    }

    public static final long m(long j) {
        long j2 = (j << 1) + 1;
        e3n.b.getClass();
        int i = s3n.a;
        return j2;
    }

    public static final long n(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? m(y6i0.f(j, -4611686018427387903L, 4611686018427387903L)) : o(j * 1000000);
    }

    public static final long o(long j) {
        o430 o430Var = e3n.b;
        long j2 = j << 1;
        int i = s3n.a;
        return j2;
    }

    public static v3k p(ag90 ag90Var, JSONObject jSONObject) {
        return ((f7k) ft6.b.t1.getValue()).a(ag90Var, jSONObject);
    }

    public static final int q(float f) {
        return m810.b(f * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int r(int i) {
        return m810.b(i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float s(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float t(int i) {
        return i * Resources.getSystem().getDisplayMetrics().density;
    }

    public static float u(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        yci0.g(parseFloat, "Motion easing control point value must be between 0 and 1; instead got: ");
        return 0.0f;
    }

    public static final int v(int i) {
        return m810.b(i / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float w(float f) {
        return f / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float x(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public static SSLSocketFactory y() {
        TrustManager[] trustManagerArr = {new yf11(1)};
        try {
            SSLContext sSLContext = SSLContext.getInstance(SSLLogger.SHORT_LOGGER_NAME);
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            ny61.j(e);
            return null;
        }
    }

    public static int z(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        ny61.g(oyr.i(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }
}
