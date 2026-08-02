package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class sk01 extends dd01 {
    public static final String[] j = {"firebase_", "google_", "ga_"};
    public static final String[] k = {"_err"};
    public SecureRandom f;
    public final AtomicLong g;
    public int h;
    public Integer i;

    public sk01(mb01 mb01Var) {
        super(mb01Var);
        this.i = null;
        this.g = new AtomicLong(0L);
    }

    public static boolean R(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean T(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(BundleUtil.UNDERLINE_TAG);
    }

    public static boolean U(String str) {
        exc0.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean V(Context context) {
        ActivityInfo receiverInfo;
        exc0.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean W(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            exc0.i(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static byte[] X(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean Y(int i, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean b0(String str, String[] strArr) {
        exc0.i(strArr);
        for (Object obj : strArr) {
            if (str == obj) {
                return true;
            }
            if (str != null && str.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public static long i0(byte[] bArr) {
        exc0.i(bArr);
        int length = bArr.length;
        int i = 0;
        exc0.l(length > 0);
        long j2 = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j2 += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j2;
    }

    public static String q(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public static MessageDigest r() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList t(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.b);
            bundle.putString("origin", zzacVar.c);
            bundle.putLong("creation_timestamp", zzacVar.e);
            bundle.putString("name", zzacVar.d.c);
            Object zza = zzacVar.d.zza();
            exc0.i(zza);
            k15.D(bundle, zza);
            bundle.putBoolean(SignalingProtocol.KEY_ACTIVE, zzacVar.f);
            String str = zzacVar.g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.h;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.b);
                zzau zzauVar = zzawVar.c;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.i());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.i);
            zzaw zzawVar2 = zzacVar.j;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.b);
                zzau zzauVar2 = zzawVar2.c;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.i());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.d.d);
            bundle.putLong("time_to_live", zzacVar.k);
            zzaw zzawVar3 = zzacVar.l;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.b);
                zzau zzauVar3 = zzawVar3.c;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void w(dg01 dg01Var, Bundle bundle, boolean z) {
        if (bundle != null && dg01Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = dg01Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = dg01Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", dg01Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && dg01Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void z(rk01 rk01Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        Y(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        rk01Var.c(bundle, str);
    }

    public final void A(String str, Bundle bundle, Object obj) {
        mb01 mb01Var = (mb01) this.b;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.n.c("Not putting event parameter. Invalid value type. name, type", mb01Var.n.e(str), simpleName);
        }
    }

    public final void B(zzcf zzcfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void C(zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final void D(zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void E(zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void F(zzcf zzcfVar, int i) {
        try {
            zzcfVar.zze(ar.b(i, "r"));
        } catch (RemoteException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error returning int value to wrapper");
        }
    }

    public final void G(zzcf zzcfVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error returning long value to wrapper");
        }
    }

    public final void H(String str, zzcf zzcfVar) {
        try {
            zzcfVar.zze(q9k.a("r", str));
        } catch (RemoteException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error returning string value to wrapper");
        }
    }

    public final void I(String str, String str2, Bundle bundle, List list, boolean z) {
        int f0;
        int M;
        List list2 = list;
        mb01 mb01Var = (mb01) this.b;
        if (bundle == null) {
            return;
        }
        mb01Var.getClass();
        f901 f901Var = mb01Var.n;
        k901 k901Var = mb01Var.j;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i = 0;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list2 == null || !list2.contains(str3)) {
                f0 = !z ? f0(str3) : 0;
                if (f0 == 0) {
                    f0 = e0(str3);
                }
            } else {
                f0 = 0;
            }
            if (f0 != 0) {
                v(bundle, f0, str3, f0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (R(bundle.get(str3))) {
                    mb01.k(k901Var);
                    k901Var.n.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    M = 22;
                } else {
                    M = M(str, str3, bundle.get(str3), bundle, list2, z, false);
                }
                if (M != 0 && !"_ev".equals(str3)) {
                    v(bundle, M, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (U(str3) && !b0(str3, atv0.i) && (i = i + 1) > 0) {
                    mb01.k(k901Var);
                    k901Var.k.c("Item cannot contain custom parameters", f901Var.d(str), f901Var.b(bundle));
                    Y(23, bundle);
                    bundle.remove(str3);
                }
            }
            list2 = list;
        }
    }

    public final boolean J(String str, String str2) {
        mb01 mb01Var = (mb01) this.b;
        if (!TextUtils.isEmpty(str)) {
            exc0.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(mb01Var.c)) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.k.b(k901.r(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                return false;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                exc0.i(str2);
                if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    return true;
                }
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.k.b(k901.r(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            if (TextUtils.isEmpty(mb01Var.c)) {
                k901 k901Var3 = mb01Var.j;
                mb01.k(k901Var3);
                k901Var3.k.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean K(int i, String str, String str2) {
        mb01 mb01Var = (mb01) this.b;
        if (str2 == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.k.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        k901 k901Var2 = mb01Var.j;
        mb01.k(k901Var2);
        k901Var2.k.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final boolean L(String[] strArr, String[] strArr2, String str, String str2) {
        mb01 mb01Var = (mb01) this.b;
        if (str2 == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.k.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(j[i])) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.k.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !b0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && b0(str2, strArr2)) {
            return true;
        }
        k901 k901Var3 = mb01Var.j;
        mb01.k(k901Var3);
        k901Var3.k.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        mb01 mb01Var = (mb01) this.b;
        k();
        int i3 = 0;
        if (R(obj)) {
            if (!z2) {
                return 21;
            }
            if (!b0(str2, atv0.h)) {
                return 20;
            }
            yh01 s = mb01Var.s();
            s.k();
            s.l();
            if (s.s()) {
                sk01 sk01Var = ((mb01) s.b).m;
                mb01.i(sk01Var);
                if (sk01Var.h0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.n.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                if (!T(str) || T(str2)) {
                    mb01Var.getClass();
                    i2 = 256;
                } else {
                    mb01Var.getClass();
                    i2 = 100;
                }
                if (!N("param", str2, obj, i2)) {
                    if (!z2) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        I(str, str2, (Bundle) obj, list, z);
                        return i;
                    }
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i3 < length) {
                            Parcelable parcelable = parcelableArr2[i3];
                            if (!(parcelable instanceof Bundle)) {
                                k901 k901Var2 = mb01Var.j;
                                mb01.k(k901Var2);
                                k901Var2.n.c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                                return 4;
                            }
                            I(str, str2, (Bundle) parcelable, list, z);
                            i3++;
                        }
                    } else {
                        if (!(obj instanceof ArrayList)) {
                            return 4;
                        }
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            if (!(obj2 instanceof Bundle)) {
                                k901 k901Var3 = mb01Var.j;
                                mb01.k(k901Var3);
                                k901Var3.n.c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                                return 4;
                            }
                            I(str, str2, (Bundle) obj2, list, z);
                            i3++;
                        }
                    }
                }
                return i;
            }
        }
        i = 0;
        if (T(str)) {
        }
        mb01Var.getClass();
        i2 = 256;
        if (!N("param", str2, obj, i2)) {
        }
        return i;
    }

    public final boolean N(String str, String str2, Object obj, int i) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.n.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    public final boolean O(String str, String str2) {
        mb01 mb01Var = (mb01) this.b;
        if (str2 == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.k.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.k.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                k901 k901Var3 = mb01Var.j;
                mb01.k(k901Var3);
                k901Var3.k.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                k901 k901Var4 = mb01Var.j;
                mb01.k(k901Var4);
                k901Var4.k.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean P(String str, String str2) {
        mb01 mb01Var = (mb01) this.b;
        if (str2 == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.k.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.k.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            k901 k901Var3 = mb01Var.j;
            mb01.k(k901Var3);
            k901Var3.k.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                k901 k901Var4 = mb01Var.j;
                mb01.k(k901Var4);
                k901Var4.k.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean Q(String str) {
        k();
        mb01 mb01Var = (mb01) this.b;
        if (xzx0.a(mb01Var.b).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        k901Var.p.b(str, "Permission not granted");
        return false;
    }

    @VisibleForTesting
    public final boolean S(Context context, String str) {
        Signature[] signatureArr;
        mb01 mb01Var = (mb01) this.b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = xzx0.a(context).b(str, 64);
            if (b == null || (signatureArr = b.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final int Z(String str) {
        mb01 mb01Var = (mb01) this.b;
        if ("_ldl".equals(str)) {
            mb01Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            mb01Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            mb01Var.getClass();
            return 100;
        }
        mb01Var.getClass();
        return 36;
    }

    public final Object a0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return obj;
        }
        if (obj instanceof Double) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return q(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle l0 = l0((Bundle) parcelable);
                if (!l0.isEmpty()) {
                    arrayList.add(l0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int c0(Object obj, String str) {
        return "_ldl".equals(str) ? N("user property referrer", str, obj, Z(str)) : N("user property", str, obj, Z(str)) ? 0 : 7;
    }

    public final int d0(String str) {
        if (!O(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!L(yiz.e, yiz.f, NotificationCompat.CATEGORY_EVENT, str)) {
            return 13;
        }
        ((mb01) this.b).getClass();
        return !K(40, NotificationCompat.CATEGORY_EVENT, str) ? 2 : 0;
    }

    public final int e0(String str) {
        if (!O("event param", str)) {
            return 3;
        }
        if (!L(null, null, "event param", str)) {
            return 14;
        }
        ((mb01) this.b).getClass();
        return !K(40, "event param", str) ? 3 : 0;
    }

    public final int f0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!L(null, null, "event param", str)) {
            return 14;
        }
        ((mb01) this.b).getClass();
        return !K(40, "event param", str) ? 3 : 0;
    }

    public final int g0(String str) {
        if (!O("user property", str)) {
            return 6;
        }
        if (!L(fd01.a, null, "user property", str)) {
            return 15;
        }
        ((mb01) this.b).getClass();
        return !K(24, "user property", str) ? 6 : 0;
    }

    public final int h0() {
        if (this.i == null) {
            com.google.android.gms.common.a aVar = com.google.android.gms.common.a.b;
            Context context = ((mb01) this.b).b;
            aVar.getClass();
            this.i = Integer.valueOf(com.google.android.gms.common.a.a(context) / 1000);
        }
        return this.i.intValue();
    }

    public final long j0() {
        long andIncrement;
        long j2;
        if (this.g.get() != 0) {
            synchronized (this.g) {
                this.g.compareAndSet(-1L, 1L);
                andIncrement = this.g.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.g) {
            long nanoTime = System.nanoTime();
            ((mb01) this.b).o.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.h + 1;
            this.h = i;
            j2 = nextLong + i;
        }
        return j2;
    }

    public final Bundle k0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString(MBInterstitialActivity.INTENT_CAMAPIGN, str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("campaign_id", str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                k901 k901Var = ((mb01) this.b).j;
                mb01.k(k901Var);
                k901Var.l.b(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    @Override // xsna.dd01
    public final boolean l() {
        return true;
    }

    public final Bundle l0(Bundle bundle) {
        mb01 mb01Var = (mb01) this.b;
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object o = o(bundle.get(str), str);
                if (o == null) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.n.b(mb01Var.n.e(str), "Param value can't be null");
                } else {
                    A(str, bundle2, o);
                }
            }
        }
        return bundle2;
    }

    public final Bundle m0(String str, Bundle bundle, List list, boolean z) {
        int f0;
        List list2 = list;
        mb01 mb01Var = (mb01) this.b;
        boolean b0 = b0(str, yiz.h);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        kwz0 kwz0Var = mb01Var.h;
        f901 f901Var = mb01Var.n;
        int n = kwz0Var.n();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                f0 = !z ? f0(str2) : 0;
                if (f0 == 0) {
                    f0 = e0(str2);
                }
            } else {
                f0 = 0;
            }
            if (f0 != 0) {
                v(bundle2, f0, str2, f0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int M = M(str, str2, bundle.get(str2), bundle2, list2, z, b0);
                if (M == 17) {
                    v(bundle2, 17, str2, Boolean.FALSE);
                } else if (M != 0 && !"_ev".equals(str2)) {
                    v(bundle2, M, M == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (U(str2) && (i = i + 1) > n) {
                    StringBuilder b = ji.b(n, "Event can't contain more than ", " params");
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.k.c(b.toString(), f901Var.d(str), f901Var.b(bundle));
                    Y(5, bundle2);
                    bundle2.remove(str2);
                    list2 = list;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final zzaw n0(String str, Bundle bundle, String str2, long j2, boolean z) {
        mb01 mb01Var = (mb01) this.b;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (d0(str) != 0) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.b(mb01Var.n.f(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle m0 = m0(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            m0 = l0(m0);
        }
        exc0.i(m0);
        return new zzaw(str, new zzau(m0), str2, j2);
    }

    public final Object o(Object obj, String str) {
        mb01 mb01Var = (mb01) this.b;
        int i = 256;
        if ("_ev".equals(str)) {
            mb01Var.getClass();
            return a0(256, obj, true, true);
        }
        if (T(str)) {
            mb01Var.getClass();
        } else {
            mb01Var.getClass();
            i = 100;
        }
        return a0(i, obj, false, true);
    }

    public final Object p(Object obj, String str) {
        return "_ldl".equals(str) ? a0(Z(str), obj, true, false) : a0(Z(str), obj, false, false);
    }

    public final SecureRandom s() {
        k();
        if (this.f == null) {
            this.f = new SecureRandom();
        }
        return this.f;
    }

    public final void u(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(Long.valueOf(j3), "Params already contained engagement");
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void v(Bundle bundle, int i, String str, Object obj) {
        if (Y(i, bundle)) {
            ((mb01) this.b).getClass();
            bundle.putString("_ev", q(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void x(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                sk01 sk01Var = ((mb01) this.b).m;
                mb01.i(sk01Var);
                sk01Var.A(str, bundle, bundle2.get(str));
            }
        }
    }

    public final void y(l901 l901Var, int i) {
        mb01 mb01Var = (mb01) this.b;
        Bundle bundle = l901Var.d;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (U(str) && (i2 = i2 + 1) > i) {
                StringBuilder b = ji.b(i, "Event can't contain more than ", " params");
                k901 k901Var = mb01Var.j;
                f901 f901Var = mb01Var.n;
                mb01.k(k901Var);
                k901Var.k.c(b.toString(), f901Var.d(l901Var.a), f901Var.b(bundle));
                Y(5, bundle);
                bundle.remove(str);
            }
        }
    }
}
