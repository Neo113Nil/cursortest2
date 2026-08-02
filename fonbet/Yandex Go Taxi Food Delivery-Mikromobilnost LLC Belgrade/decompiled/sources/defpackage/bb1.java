package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.i;
import androidx.compose.ui.unit.LayoutDirection;
import com.airbnb.lottie.parser.moshi.c;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.div.state.db.StateEntry;
import com.yandex.go.zone.model.PaymentOptions;
import com.yandex.go.zone.model.Zone;
import com.ybsdk.widgets.common.MoneyInputEditView;
import jason.statham.interpreter.error.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;

/* loaded from: classes.dex */
public abstract class bb1 {
    public static qst a;
    public static final char[] b = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final StackTraceElement[] c = new StackTraceElement[0];
    public static final String[] d = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] e = {"_ln", "_fot", "_fvt", "_ldl", ClidProvider._ID, "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static Object A(Object obj, Object obj2) {
        if (obj instanceof Long) {
            if (obj2 instanceof Long) {
                return Long.valueOf(((Number) obj2).longValue() * ((Number) obj).longValue());
            }
            if (obj2 instanceof Double) {
                return Double.valueOf(((Number) obj2).doubleValue() * ((Number) obj).doubleValue());
            }
        }
        if (obj instanceof Double) {
            if (obj2 instanceof Long) {
                return Double.valueOf(((Number) obj2).doubleValue() * ((Number) obj).doubleValue());
            }
            if (obj2 instanceof Double) {
                return Double.valueOf(((Number) obj2).doubleValue() * ((Number) obj).doubleValue());
            }
        }
        if ((obj instanceof String) && (obj2 instanceof Long)) {
            Number number = (Number) obj2;
            if (number.longValue() < 0) {
                throw oyr.y(obj2, "String multiplier should be non-negative number but actual is ");
            }
            return cvu0.u((int) number.longValue(), (CharSequence) obj);
        }
        throw a.a("Multiplication is not defined for " + obj + " and " + obj2);
    }

    public static ae2 B(c cVar, nsz nszVar) {
        return new ae2(ukx.a(cVar, nszVar, 1.0f, ngd0.c, false), 0);
    }

    public static be2 C(com.airbnb.lottie.parser.moshi.a aVar, nsz nszVar, boolean z) {
        return new be2(2, ukx.a(aVar, nszVar, z ? zw21.c() : 1.0f, kl40.z, false));
    }

    public static ae2 D(com.airbnb.lottie.parser.moshi.a aVar, nsz nszVar) {
        return new ae2(ukx.a(aVar, nszVar, 1.0f, x4c.O, false), 1);
    }

    public static ae2 E(c cVar, nsz nszVar) {
        return new ae2(ukx.a(cVar, nszVar, zw21.c(), seu.F, true), 2);
    }

    public static String F(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        int length = encoded.length;
        j.b(encoded.length, 0L, length);
        sb.append(new ByteString(f73.m(0, length, encoded)).f(JCP.DIGEST_SHA_256).a());
        return sb.toString();
    }

    public static final void G(MapBuilder mapBuilder, String str, Object obj) {
        if (obj != null) {
            mapBuilder.put(str, obj);
        }
    }

    public static final void H(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final ety0 I(ety0 ety0Var, LayoutDirection layoutDirection) {
        bmt0 bmt0Var = ety0Var.a;
        moy0 moy0Var = cmt0.d;
        moy0 moy0Var2 = bmt0Var.a;
        fet0 fet0Var = new fet0(6);
        if (moy0Var2.equals(loy0.a)) {
            moy0Var2 = (moy0) fet0Var.invoke();
        }
        moy0 moy0Var3 = moy0Var2;
        long j = bmt0Var.b;
        tty0[] tty0VarArr = sty0.b;
        if ((j & 1095216660480L) == 0) {
            j = cmt0.a;
        }
        long j2 = j;
        lzr lzrVar = bmt0Var.c;
        if (lzrVar == null) {
            lzrVar = lzr.D;
        }
        lzr lzrVar2 = lzrVar;
        hzr hzrVar = bmt0Var.d;
        hzr hzrVar2 = new hzr(hzrVar != null ? hzrVar.a : 0);
        izr izrVar = bmt0Var.e;
        izr izrVar2 = new izr(izrVar != null ? izrVar.a : 65535);
        eyr eyrVar = bmt0Var.f;
        if (eyrVar == null) {
            eyrVar = eyr.a;
        }
        eyr eyrVar2 = eyrVar;
        String str = bmt0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = bmt0Var.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = cmt0.b;
        }
        long j4 = j3;
        td5 td5Var = bmt0Var.i;
        float f = td5Var != null ? td5Var.a : 0.0f;
        td5 td5Var2 = new td5(Float.isNaN(f) ? 0.0f : f);
        soy0 soy0Var = bmt0Var.j;
        if (soy0Var == null) {
            soy0Var = soy0.c;
        }
        soy0 soy0Var2 = soy0Var;
        k5z k5zVar = bmt0Var.k;
        if (k5zVar == null) {
            k5z k5zVar2 = k5z.c;
            k5zVar = qvc0.a().a();
        }
        k5z k5zVar3 = k5zVar;
        long j5 = bmt0Var.l;
        if (j5 == 16) {
            j5 = cmt0.c;
        }
        long j6 = j5;
        rly0 rly0Var = bmt0Var.m;
        if (rly0Var == null) {
            rly0Var = rly0.b;
        }
        rly0 rly0Var2 = rly0Var;
        bgr0 bgr0Var = bmt0Var.n;
        if (bgr0Var == null) {
            bgr0 bgr0Var2 = bgr0.d;
            bgr0Var = abb1.b();
        }
        bgr0 bgr0Var3 = bgr0Var;
        dwc0 dwc0Var = bmt0Var.o;
        ram ramVar = bmt0Var.p;
        if (ramVar == null) {
            ramVar = i3r.a;
        }
        bmt0 bmt0Var2 = new bmt0(moy0Var3, j2, lzrVar2, hzrVar2, izrVar2, eyrVar2, str2, j4, td5Var2, soy0Var2, k5zVar3, j6, rly0Var2, bgr0Var3, dwc0Var, ramVar);
        gc90 gc90Var = ety0Var.b;
        int i = hc90.b;
        int i2 = gc90Var.a;
        int i3 = 5;
        if (i2 == 0) {
            i2 = 5;
        }
        int i4 = gc90Var.b;
        if (i4 == 3) {
            int i5 = fty0.a[layoutDirection.ordinal()];
            if (i5 == 1) {
                i3 = 4;
            } else if (i5 != 2) {
                w511.b();
                return null;
            }
            i4 = i3;
        } else if (i4 == 0) {
            int i6 = fty0.a[layoutDirection.ordinal()];
            if (i6 == 1) {
                i4 = 1;
            } else {
                if (i6 != 2) {
                    w511.b();
                    return null;
                }
                i4 = 2;
            }
        }
        long j7 = gc90Var.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = hc90.a;
        }
        apy0 apy0Var = gc90Var.d;
        if (apy0Var == null) {
            apy0 apy0Var2 = apy0.c;
            apy0Var = umb1.c();
        }
        tvc0 tvc0Var = gc90Var.e;
        ehy ehyVar = gc90Var.f;
        int i7 = gc90Var.g;
        if (i7 == 0) {
            i7 = kgy.b;
        }
        int i8 = gc90Var.h;
        if (i8 == 0) {
            i8 = 1;
        }
        try0 try0Var = gc90Var.i;
        if (try0Var == null) {
            try0Var = try0.c;
        }
        return new ety0(bmt0Var2, new gc90(i2, i4, j7, apy0Var, tvc0Var, ehyVar, i7, i8, try0Var), ety0Var.c);
    }

    public static final j5x J(d6x d6xVar, r5x r5xVar) {
        j5x j5xVar = d6xVar.a.a;
        Iterator it = r5xVar.a.iterator();
        while (it.hasNext()) {
            o5x o5xVar = (o5x) it.next();
            if (j5xVar instanceof m5x) {
                if (!(o5xVar instanceof q5x)) {
                    vg10.j("Expected ", qoi0.a(q5x.class).c(), " but actual value is ", o5xVar);
                    return null;
                }
                j5xVar = (j5x) ((m5x) j5xVar).a.get(((q5x) o5xVar).a);
            } else if (!(j5xVar instanceof v4x)) {
                if ((j5xVar instanceof w4x ? true : j5xVar instanceof h5x ? true : j5xVar instanceof i5x ? true : j5xVar instanceof o6x) || j5xVar == null) {
                    return null;
                }
            } else {
                if (!(o5xVar instanceof p5x)) {
                    vg10.j("Expected ", qoi0.a(p5x.class).c(), " but actual value is ", o5xVar);
                    return null;
                }
                int i = ((p5x) o5xVar).a;
                List list = ((v4x) j5xVar).a;
                j5xVar = i < list.size() ? (j5x) list.get(i) : null;
            }
        }
        return j5xVar;
    }

    public static final s6x K(d6x d6xVar, r5x r5xVar) {
        Map map = d6xVar.b.a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            q6x q6xVar = (q6x) entry.getValue();
            Iterator it = r5xVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o5x o5xVar = (o5x) it.next();
                if (q6xVar instanceof r6x) {
                    if (!(o5xVar instanceof q5x)) {
                        vg10.r(o5xVar, "Expected JasonPath.Fragment.Key, but actual value is ");
                        return null;
                    }
                    q6xVar = (q6x) ((r6x) q6xVar).a.get(((q5x) o5xVar).a);
                } else if (!(q6xVar instanceof p6x)) {
                    q6xVar = null;
                }
            }
            Pair pair = q6xVar != null ? new Pair(entry.getKey(), q6xVar) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new s6x(b.s(arrayList));
    }

    public static final void L(View view, View.OnClickListener onClickListener) {
        view.setOnClickListener(onClickListener != null ? qub1.c(onClickListener) : null);
        if (onClickListener == null) {
            view.setClickable(false);
        }
    }

    public static final void M(View view) {
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
    }

    public static final boolean N(Zone zone, e4a0 e4a0Var) {
        PaymentOptions paymentOptions = zone.g;
        if (e4a0Var != e4a0.R3 && e4a0Var != e4a0.S3) {
            PaymentMethod$Type a2 = e4a0Var.a();
            switch (a2 == null ? -1 : qka0.a[a2.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    w511.b();
                    return false;
                case 1:
                    return paymentOptions.k;
                case 2:
                    return paymentOptions.b;
                case 3:
                    return paymentOptions.c;
                case 4:
                    return paymentOptions.d;
                case 5:
                    return paymentOptions.e;
                case 6:
                    return paymentOptions.f;
                case 7:
                    return paymentOptions.g;
                case 8:
                    return paymentOptions.h;
                case 9:
                    return paymentOptions.i;
                case 10:
                    return paymentOptions.j;
                case 11:
                    return paymentOptions.l;
                case 12:
                    return paymentOptions.m;
                case 13:
                    return paymentOptions.q;
                case 14:
                    return paymentOptions.r;
                case 15:
                    return paymentOptions.n;
                case 16:
                    return paymentOptions.o;
                case 17:
                    return paymentOptions.p;
                case 18:
                    return paymentOptions.t;
                case 19:
                    return paymentOptions.u;
                case 20:
                    return paymentOptions.v;
                case 21:
                    return paymentOptions.w;
                case 22:
                    return paymentOptions.x;
                case 23:
                    return paymentOptions.s;
            }
        }
        return false;
    }

    public static byte[] O(ong ongVar) {
        String str;
        HashMap hashMap = ongVar.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    P(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e2) {
            str = eqg.a;
            hgz.g().f(str, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void P(DataOutputStream dataOutputStream, String str, Object obj) {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                vg10.g(qoi0.a(obj.getClass()).d(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            g0c a2 = qoi0.a(objArr.getClass());
            if (a2.equals(qoi0.a(Boolean[].class))) {
                i = 8;
            } else if (a2.equals(qoi0.a(Byte[].class))) {
                i = 9;
            } else if (a2.equals(qoi0.a(Integer[].class))) {
                i = 10;
            } else if (a2.equals(qoi0.a(Long[].class))) {
                i = 11;
            } else if (a2.equals(qoi0.a(Float[].class))) {
                i = 12;
            } else if (a2.equals(qoi0.a(Double[].class))) {
                i = 13;
            } else {
                if (!a2.equals(qoi0.a(String[].class))) {
                    vg10.g(qoi0.a(objArr.getClass()).c(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static boolean Q(Context context, int i, String str) {
        tbz a2 = nb51.a(context);
        a2.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a2.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static final void R(int i, int i2, int i3, int i4, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void S(int i, int i2, int i3, View view) {
        if ((i3 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i4 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        R(i, i4, marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0, i2, view);
    }

    public static Object T(View view, AttributeSet attributeSet, int[] iArr, tls tlsVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, iArr, 0, 0);
        try {
            return tlsVar.invoke(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void U(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m0(i, parcel, 0);
            }
        } else {
            int n0 = n0(parcel, i);
            parcel.writeBundle(bundle);
            o0(parcel, n0);
        }
    }

    public static void V(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m0(i, parcel, 0);
            }
        } else {
            int n0 = n0(parcel, i);
            parcel.writeByteArray(bArr);
            o0(parcel, n0);
        }
    }

    public static void W(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int n0 = n0(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        o0(parcel, n0);
    }

    public static void X(Parcel parcel, int i, Double d2) {
        if (d2 == null) {
            return;
        }
        m0(i, parcel, 8);
        parcel.writeDouble(d2.doubleValue());
    }

    public static void Y(Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                m0(i, parcel, 0);
            }
        } else {
            int n0 = n0(parcel, i);
            parcel.writeFloatArray(fArr);
            o0(parcel, n0);
        }
    }

    public static void Z(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        m0(i, parcel, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static final String a(Object[] objArr, int i, int i2, v8 v8Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(Extension.FIX_SPACE);
            }
            Object obj = objArr[i + i3];
            if (obj == v8Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void a0(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int n0 = n0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        o0(parcel, n0);
    }

    public static final bjs0 b(String str) {
        char x0 = gvu0.x0(str);
        String substring = str.substring(0, evu0.C(str));
        return x0 == '%' ? new cua0(Float.parseFloat(substring)) : x0 == 'p' ? new kwd0(Float.parseFloat(substring)) : x0 == 'x' ? new f3c0(Float.parseFloat(substring)) : new kwd0(Float.parseFloat(str));
    }

    public static void b0(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m0(i, parcel, 0);
            }
        } else {
            int n0 = n0(parcel, i);
            parcel.writeIntArray(iArr);
            o0(parcel, n0);
        }
    }

    public static final MapBuilder c(gm20 gm20Var) {
        MapBuilder mapBuilder = new MapBuilder();
        ConcurrentHashMap concurrentHashMap = gm20Var.c;
        G(mapBuilder, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, concurrentHashMap.get("request_host"));
        G(mapBuilder, StateEntry.COLUMN_PATH, concurrentHashMap.get("request_path"));
        G(mapBuilder, "kind", concurrentHashMap.get("request_kind"));
        G(mapBuilder, "errorDomain", concurrentHashMap.get("error_domain"));
        G(mapBuilder, "errorDescription", concurrentHashMap.get("error_description"));
        G(mapBuilder, "localQueueDuration", concurrentHashMap.get("local_queue_time"));
        G(mapBuilder, "localId", concurrentHashMap.get("local_id"));
        G(mapBuilder, "httpCode", concurrentHashMap.get("response_code"));
        G(mapBuilder, "retryNumber", concurrentHashMap.get("retry_number"));
        G(mapBuilder, "totalDuration", concurrentHashMap.get("total_duration"));
        G(mapBuilder, "traceId", concurrentHashMap.get("trace_id"));
        return mapBuilder.j();
    }

    public static void c0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int n0 = n0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        o0(parcel, n0);
    }

    public static final MapBuilder d(gm20 gm20Var) {
        MapBuilder mapBuilder = new MapBuilder();
        ConcurrentHashMap concurrentHashMap = gm20Var.c;
        G(mapBuilder, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, concurrentHashMap.get("request_host"));
        G(mapBuilder, StateEntry.COLUMN_PATH, concurrentHashMap.get("request_path"));
        G(mapBuilder, "kind", concurrentHashMap.get("request_kind"));
        G(mapBuilder, "requestDuration", concurrentHashMap.get("request_duration"));
        G(mapBuilder, "requestSize", concurrentHashMap.get("request_size"));
        G(mapBuilder, "localQueueDuration", concurrentHashMap.get("local_queue_time"));
        G(mapBuilder, "localId", concurrentHashMap.get("local_id"));
        G(mapBuilder, "httpCode", concurrentHashMap.get("response_code"));
        G(mapBuilder, "retryNumber", concurrentHashMap.get("retry_number"));
        G(mapBuilder, "responseSize", concurrentHashMap.get("response_size"));
        G(mapBuilder, "parsingDuration", concurrentHashMap.get("parsing_duration"));
        G(mapBuilder, "totalDuration", concurrentHashMap.get("total_duration"));
        G(mapBuilder, "traceId", concurrentHashMap.get("trace_id"));
        return mapBuilder.j();
    }

    public static void d0(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        m0(i, parcel, 4);
        parcel.writeInt(num.intValue());
    }

    public static final Bitmap.Config e(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config != null) {
            if (sb2.x(config)) {
                config = null;
            }
            if (config != null) {
                return config;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static void e0(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        m0(i, parcel, 8);
        parcel.writeLong(l.longValue());
    }

    public static yrv f(int i, float f, float f2, float f3, float f4, Float f5, Integer num) {
        return new yrv(i, new wrv(f * f4, f2 * f4, f3 * f4), f5 != null ? f5.floatValue() : 0.0f, num != null ? num.intValue() : 0);
    }

    public static void f0(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m0(i, parcel, 0);
            }
        } else {
            int n0 = n0(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            o0(parcel, n0);
        }
    }

    public static final f530 g(f530 f530Var, tls tlsVar) {
        return f530Var.k(new kam(tlsVar));
    }

    public static void g0(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m0(i, parcel, 0);
            }
        } else {
            int n0 = n0(parcel, i);
            parcel.writeString(str);
            o0(parcel, n0);
        }
    }

    public static final f530 h(f530 f530Var, tls tlsVar) {
        return f530Var.k(new sam(tlsVar));
    }

    public static void h0(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m0(i, parcel, 0);
            }
        } else {
            int n0 = n0(parcel, i);
            parcel.writeStringArray(strArr);
            o0(parcel, n0);
        }
    }

    public static final f530 i(f530 f530Var, tls tlsVar) {
        return f530Var.k(new tam(tlsVar));
    }

    public static void i0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int n0 = n0(parcel, i);
        parcel.writeStringList(list);
        o0(parcel, n0);
    }

    public static final int j(int i, View view) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object p = qke.p(view);
            view = p instanceof View ? (View) p : null;
        }
        return i3;
    }

    public static void j0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int n0 = n0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        o0(parcel, n0);
    }

    public static final View k(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(j(m8h0.view_tree_lifecycle_owner, view), j(ich0.view_tree_saved_state_registry_owner, view));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (p(view) == null) {
                i++;
                Object p = qke.p(view);
                View view4 = view2;
                view2 = view;
                view = p instanceof View ? (View) p : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static void k0(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                m0(i, parcel, 0);
                return;
            }
            return;
        }
        int n0 = n0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        o0(parcel, n0);
    }

    public static ong l(byte[] bArr) {
        String str;
        String str2;
        if (bArr.length > 10240) {
            ny61.r("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return ong.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    while (i < readInt) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short readShort = dataInputStream.readShort();
                    if (readShort == -21521) {
                        short readShort2 = dataInputStream.readShort();
                        if (readShort2 != 1) {
                            xfo.g(oyr.i(readShort2, "Unsupported version number: "));
                        }
                    } else {
                        xfo.g(oyr.i(readShort, "Magic number doesn't match: "));
                    }
                    int readInt2 = dataInputStream.readInt();
                    while (i < readInt2) {
                        linkedHashMap.put(dataInputStream.readUTF(), m(dataInputStream.readByte(), dataInputStream));
                        i++;
                    }
                    dataInputStream.close();
                } finally {
                }
            }
        } catch (IOException e2) {
            str2 = eqg.a;
            hgz.g().f(str2, "Error in Data#fromByteArray: ", e2);
        } catch (ClassNotFoundException e3) {
            str = eqg.a;
            hgz.g().f(str, "Error in Data#fromByteArray: ", e3);
        }
        return new ong(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l0(ContinuationImpl continuationImpl) {
        Object obj;
        fse fseVar = continuationImpl.get_context();
        kotlinx.coroutines.a.k(fseVar);
        Continuation b2 = dvw.b(continuationImpl);
        pyj pyjVar = b2 instanceof pyj ? (pyj) b2 : null;
        zy11 zy11Var = zy11.a;
        if (pyjVar != null) {
            jse jseVar = pyjVar.w;
            if (bvf0.R(jseVar, fseVar)) {
                pyjVar.y = zy11Var;
                pyjVar.c = 1;
                jseVar.B(fseVar, pyjVar);
            } else {
                sb61 sb61Var = new sb61();
                fse plus = fseVar.plus(sb61Var);
                pyjVar.y = zy11Var;
                pyjVar.c = 1;
                jseVar.B(plus, pyjVar);
                if (sb61Var.a) {
                    fgo a2 = byy0.a();
                    x43 x43Var = a2.w;
                    if (!(x43Var != null ? x43Var.isEmpty() : true)) {
                        if (a2.b >= 4294967296L) {
                            pyjVar.y = zy11Var;
                            pyjVar.c = 1;
                            a2.T(pyjVar);
                            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                            return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : zy11Var;
                        }
                        a2.U(true);
                        try {
                            pyjVar.run();
                            do {
                            } while (a2.Z());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                }
            }
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
        }
        obj = zy11Var;
        if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable m(byte b2, DataInputStream dataInputStream) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i < readInt) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i < readInt2) {
                r02[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r02;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i < readInt3) {
                r03[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r03;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i < readInt4) {
                r04[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r04;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i < readInt5) {
                r05[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r05;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i < readInt6) {
                r06[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r06;
        }
        if (b2 != 14) {
            ny61.r(oyr.i(b2, "Unsupported type "));
            return null;
        }
        int readInt7 = dataInputStream.readInt();
        ?? r1 = new String[readInt7];
        while (i < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (jl40.l(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i] = readUTF;
            i++;
        }
        return r1;
    }

    public static void m0(int i, Parcel parcel, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static final int n(int i, View view) {
        return view.getContext().getColor(i);
    }

    public static int n0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final int o(int i, View view) {
        return vng.p(i, view.getContext());
    }

    public static void o0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static final i p(View view) {
        Object tag = view.getTag(ohh0.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (i) weakReference.get();
        }
        return null;
    }

    public static final int q(int i, View view) {
        return vng.s(i, view.getContext());
    }

    public static final String t(int i, View view) {
        return view.getContext().getString(i);
    }

    public static final View v(ViewGroup viewGroup, int i, boolean z) {
        View f = oo31.f(viewGroup, i, viewGroup, z);
        if (viewGroup.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            f.setLayoutDirection(1);
        }
        return f;
    }

    public static void w(Context context) {
        boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (sb2.v(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            new t5v(context, z, new atx0()).run();
        }
        z = true;
        new t5v(context, z, new atx0()).run();
    }

    public static boolean x(int i, Context context) {
        if (!Q(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.google.android.gms.common.c.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    public static final boolean y(View view) {
        return view.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v16 gc90, still in use, count: 3, list:
          (r9v16 gc90) from 0x01d7: MOVE (r42v1 gc90) = (r9v16 gc90)
          (r9v16 gc90) from 0x01c9: MOVE (r42v2 gc90) = (r9v16 gc90)
          (r9v16 gc90) from 0x01b5: MOVE (r42v4 gc90) = (r9v16 gc90)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final defpackage.ety0 z(defpackage.ety0 r42, defpackage.ety0 r43, float r44) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb1.z(ety0, ety0, float):ety0");
    }

    public abstract NotificatorReporter$MessageType r();

    public float s() {
        if (this instanceof wrv) {
            return (float) Math.ceil(((wrv) this).g);
        }
        if (this instanceof vrv) {
            return (float) Math.ceil(((vrv) this).q0() * 2.0f);
        }
        w511.b();
        return 0.0f;
    }

    public float u() {
        if (this instanceof wrv) {
            return (float) Math.ceil(((wrv) this).f);
        }
        if (this instanceof vrv) {
            return (float) Math.ceil(((vrv) this).q0() * 2.0f);
        }
        w511.b();
        return 0.0f;
    }
}
