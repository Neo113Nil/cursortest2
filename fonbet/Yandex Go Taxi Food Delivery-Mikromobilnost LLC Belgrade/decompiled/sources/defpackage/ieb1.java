package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
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
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes.dex */
public final class ieb1 extends mha1 {
    public static final String[] C = {"firebase_", "google_", "ga_"};
    public static final String[] D = {"_err"};
    public Boolean A;
    public Integer B;
    public SecureRandom w;
    public final AtomicLong x;
    public int y;
    public MeasurementManagerFutures$Api33Ext5JavaImpl z;

    public ieb1(g gVar) {
        super(gVar);
        this.B = null;
        this.x = new AtomicLong(0L);
    }

    public static boolean Dh(String str) {
        cvw.i(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String Lg(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    public static boolean Nh(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void Wg(eeb1 eeb1Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        yh(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        eeb1Var.a(str, "_err", bundle);
    }

    public static MessageDigest Xg() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long Yg(byte[] bArr) {
        cvw.l(bArr);
        int length = bArr.length;
        int i = 0;
        cvw.o(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean Zg(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean bh(String str) {
        String str2 = (String) nw91.r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean dh(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean eh(String str, String[] strArr) {
        cvw.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] jh(Parcelable parcelable) {
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

    public static ArrayList uh(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(CommonUrlParts.APP_ID, zzahVar.zza);
            bundle.putString("origin", zzahVar.zzb);
            bundle.putLong("creation_timestamp", zzahVar.zzd);
            bundle.putString("name", zzahVar.zzc.zzb);
            Object zza = zzahVar.zzc.zza();
            cvw.l(zza);
            lxa1.g(bundle, zza);
            bundle.putBoolean(ClidProvider.APP_ACTIVE, zzahVar.zze);
            String str = zzahVar.zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbg zzbgVar = zzahVar.zzg;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.zza);
                zzbe zzbeVar = zzbgVar.zzb;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.zzf());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.zzh);
            zzbg zzbgVar2 = zzahVar.zzi;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.zza);
                zzbe zzbeVar2 = zzbgVar2.zzb;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.zzf());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.zzc.zzc);
            bundle.putLong("time_to_live", zzahVar.zzj);
            zzbg zzbgVar3 = zzahVar.zzk;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.zza);
                zzbe zzbeVar3 = zzbgVar3.zzb;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.zzf());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean vh(Context context) {
        ActivityInfo receiverInfo;
        cvw.l(context);
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

    public static void wh(qwa1 qwa1Var, Bundle bundle, boolean z) {
        if (bundle != null && qwa1Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = qwa1Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = qwa1Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", qwa1Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && qwa1Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean yh(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public final int Ah(String str) {
        g gVar = (g) this.b;
        if ("_ldl".equals(str)) {
            gVar.getClass();
            return 2048;
        }
        if (ClidProvider._ID.equals(str)) {
            gVar.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            gVar.getClass();
            return 100;
        }
        gVar.getClass();
        return 36;
    }

    public final long Bh() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.x;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.x;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((g) this.b).D.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.y + 1;
            this.y = i;
            j = nextLong + i;
        }
        return j;
    }

    public final SecureRandom Ch() {
        Gg();
        if (this.w == null) {
            this.w = new SecureRandom();
        }
        return this.w;
    }

    public final Bundle Eh(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("gbraid");
                    str6 = uri.getQueryParameter("utm_id");
                    str7 = uri.getQueryParameter("dclid");
                    str8 = uri.getQueryParameter("srsltid");
                    str9 = uri.getQueryParameter("sfmc_id");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    str9 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (TextUtils.isEmpty(str)) {
                    str10 = "sfmc_id";
                } else {
                    str10 = "sfmc_id";
                    bundle.putString("campaign", str);
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
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gbraid", str5);
                }
                String queryParameter = uri.getQueryParameter("gad_source");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("gad_source", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("term", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("content", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("aclid", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("cp1", queryParameter5);
                }
                String queryParameter6 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("anid", queryParameter6);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("campaign_id", str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("dclid", str7);
                }
                String queryParameter7 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("source_platform", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("creative_format", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("marketing_tactic", queryParameter9);
                }
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("srsltid", str8);
                }
                if (!TextUtils.isEmpty(str9)) {
                    bundle.putString(str10, str9);
                }
                for (String str11 : uri.getQueryParameterNames()) {
                    if (str11.startsWith("gad_")) {
                        String queryParameter10 = uri.getQueryParameter(str11);
                        if (!TextUtils.isEmpty(queryParameter10)) {
                            bundle.putString(str11, queryParameter10);
                        }
                    }
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                y1a1 y1a1Var = ((g) this.b).y;
                g.g(y1a1Var);
                y1a1Var.C.b(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final boolean Fh(String str, String str2) {
        g gVar = (g) this.b;
        if (str2 == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.B.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.B.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            y1a1 y1a1Var3 = gVar.y;
            g.g(y1a1Var3);
            y1a1Var3.B.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                y1a1 y1a1Var4 = gVar.y;
                g.g(y1a1Var4);
                y1a1Var4.B.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean Gh(String str, String str2) {
        g gVar = (g) this.b;
        if (str2 == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.B.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.B.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                y1a1 y1a1Var3 = gVar.y;
                g.g(y1a1Var3);
                y1a1Var3.B.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                y1a1 y1a1Var4 = gVar.y;
                g.g(y1a1Var4);
                y1a1Var4.B.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    @Override // defpackage.mha1
    public final boolean Hg() {
        return true;
    }

    public final boolean Hh(String str, String[] strArr, String[] strArr2, String str2) {
        g gVar = (g) this.b;
        if (str2 == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.B.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(C[i])) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.B.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !eh(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && eh(str2, strArr2)) {
            return true;
        }
        y1a1 y1a1Var3 = gVar.y;
        g.g(y1a1Var3);
        y1a1Var3.B.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean Ih(int i, String str, String str2) {
        g gVar = (g) this.b;
        if (str2 == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.B.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        y1a1 y1a1Var2 = gVar.y;
        g.g(y1a1Var2);
        y1a1Var2.B.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int Jh(String str) {
        if (!Gh(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str)) {
            return 2;
        }
        if (!Hh(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, cma1.c, cma1.d, str)) {
            return 13;
        }
        ((g) this.b).getClass();
        return !Ih(40, DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str) ? 2 : 0;
    }

    public final boolean Kg(String str) {
        g gVar = (g) this.b;
        if (TextUtils.isEmpty(str)) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.B.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        cvw.l(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        y1a1 y1a1Var2 = gVar.y;
        g.g(y1a1Var2);
        y1a1Var2.B.b(y1a1.Og(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final int Kh(String str) {
        if (!Gh("user property", str)) {
            return 6;
        }
        if (!Hh("user property", bb1.d, null, str)) {
            return 15;
        }
        ((g) this.b).getClass();
        return !Ih(24, "user property", str) ? 6 : 0;
    }

    public final int Lh(String str) {
        if (!Fh("event param", str)) {
            return 3;
        }
        if (!Hh("event param", null, null, str)) {
            return 14;
        }
        ((g) this.b).getClass();
        return !Ih(40, "event param", str) ? 3 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Mg(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        g gVar = (g) this.b;
        Gg();
        int i3 = 0;
        if (Nh(obj)) {
            if (!z2) {
                return 21;
            }
            if (!eh(str2, fga1.c)) {
                return 20;
            }
            j5b1 j = gVar.j();
            j.Gg();
            j.Hg();
            if (j.Ng()) {
                ieb1 ieb1Var = ((g) j.b).B;
                g.e(ieb1Var);
                if (ieb1Var.lh() < 200900) {
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
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.E.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
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
                i2 = 500;
                if (!dh(str) || dh(str2)) {
                    gVar.w.getClass();
                    i2 = Math.max(500, 256);
                } else {
                    gVar.w.getClass();
                }
                if (!Oh("param", str2, i2, obj)) {
                    if (!z2) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        Ph(str, str2, (Bundle) obj, list, z);
                        return i;
                    }
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i3 < length) {
                            Parcelable parcelable = parcelableArr2[i3];
                            if (!(parcelable instanceof Bundle)) {
                                y1a1 y1a1Var2 = gVar.y;
                                g.g(y1a1Var2);
                                y1a1Var2.E.c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                                return 4;
                            }
                            Ph(str, str2, (Bundle) parcelable, list, z);
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
                                y1a1 y1a1Var3 = gVar.y;
                                g.g(y1a1Var3);
                                y1a1Var3.E.c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                                return 4;
                            }
                            Ph(str, str2, (Bundle) obj2, list, z);
                            i3++;
                        }
                    }
                }
                return i;
            }
        }
        i = 0;
        i2 = 500;
        if (dh(str)) {
        }
        gVar.w.getClass();
        i2 = Math.max(500, 256);
        if (!Oh("param", str2, i2, obj)) {
        }
        return i;
    }

    public final int Mh(String str) {
        if (!Gh("event param", str)) {
            return 3;
        }
        if (!Hh("event param", null, null, str)) {
            return 14;
        }
        ((g) this.b).getClass();
        return !Ih(40, "event param", str) ? 3 : 0;
    }

    public final Object Ng(Object obj, String str) {
        g gVar = (g) this.b;
        int i = 500;
        if ("_ev".equals(str)) {
            gVar.w.getClass();
            return zh(Math.max(500, 256), obj, true, true);
        }
        if (dh(str)) {
            gVar.w.getClass();
            i = Math.max(500, 256);
        } else {
            gVar.w.getClass();
        }
        return zh(i, obj, false, true);
    }

    public final Bundle Og(String str, Bundle bundle, List list, boolean z) {
        int Lh;
        String str2;
        List list2 = list;
        boolean eh = eh(str, cma1.f);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        g gVar = (g) this.b;
        j691 j691Var = gVar.w;
        i0a1 i0a1Var = gVar.C;
        ieb1 ieb1Var = ((g) j691Var.b).B;
        g.e(ieb1Var);
        int i = ieb1Var.kh(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                Lh = !z ? Lh(str4) : 0;
                if (Lh == 0) {
                    Lh = Mh(str4);
                }
            } else {
                Lh = 0;
            }
            if (Lh != 0) {
                Sg(bundle2, Lh, str4, Lh == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int Mg = Mg(str, str4, bundle.get(str4), bundle2, list2, z, eh);
                if (Mg == 17) {
                    Sg(bundle2, 17, str4, Boolean.FALSE);
                } else if (Mg != 0 && !"_ev".equals(str4)) {
                    Sg(bundle2, Mg, Mg == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (Dh(str4)) {
                    i2++;
                    if (i2 > i) {
                        if (gVar.w.Qg(str3, nw91.e1) && z2) {
                            str2 = str3;
                        } else {
                            String q = b64.q(new StringBuilder(String.valueOf(i).length() + 37), "Event can't contain more than ", i, " params");
                            y1a1 y1a1Var = gVar.y;
                            g.g(y1a1Var);
                            str2 = str3;
                            y1a1Var.B.c(q, i0a1Var.a(str), i0a1Var.e(bundle));
                        }
                        yh(5, bundle2);
                        bundle2.remove(str4);
                        z2 = true;
                        list2 = list;
                        str3 = str2;
                    } else {
                        list2 = list;
                    }
                }
            }
            str2 = str3;
            list2 = list;
            str3 = str2;
        }
        return bundle2;
    }

    public final boolean Oh(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) <= i) {
            return true;
        }
        y1a1 y1a1Var = ((g) this.b).y;
        g.g(y1a1Var);
        y1a1Var.E.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
        return false;
    }

    public final void Pg(pqn pqnVar, int i) {
        Bundle bundle = (Bundle) pqnVar.e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Dh(str) && (i2 = i2 + 1) > i) {
                g gVar = (g) this.b;
                j691 j691Var = gVar.w;
                i0a1 i0a1Var = gVar.C;
                if (!j691Var.Qg(null, nw91.e1) || !z) {
                    String q = b64.q(new StringBuilder(String.valueOf(i).length() + 37), "Event can't contain more than ", i, " params");
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.B.c(q, i0a1Var.a((String) pqnVar.c), i0a1Var.e(bundle));
                    yh(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void Ph(String str, String str2, Bundle bundle, List list, boolean z) {
        int Lh;
        String str3;
        int Mg;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        g gVar = (g) this.b;
        j691 j691Var = gVar.w;
        y1a1 y1a1Var = gVar.y;
        i0a1 i0a1Var = gVar.C;
        ieb1 ieb1Var = ((g) j691Var.b).B;
        g.e(ieb1Var);
        int i = true != ieb1Var.kh(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                Lh = !z ? Lh(str4) : 0;
                if (Lh == 0) {
                    Lh = Mh(str4);
                }
            } else {
                Lh = 0;
            }
            if (Lh != 0) {
                Sg(bundle, Lh, str4, Lh == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (Nh(bundle.get(str4))) {
                    g.g(y1a1Var);
                    y1a1Var.E.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    Mg = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    Mg = Mg(str, str4, bundle.get(str4), bundle, list2, z, false);
                }
                if (Mg != 0 && !"_ev".equals(str4)) {
                    Sg(bundle, Mg, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (Dh(str4) && !eh(str4, fga1.d)) {
                    int i3 = i2 + 1;
                    if (!kh(231100000)) {
                        g.g(y1a1Var);
                        y1a1Var.B.c("Item array not supported on client's version of Google Play Services (Android Only)", i0a1Var.a(str), i0a1Var.e(bundle));
                        yh(23, bundle);
                        bundle.remove(str4);
                    } else if (i3 > i) {
                        if (!gVar.w.Qg(str3, nw91.e1) || !z2) {
                            g.g(y1a1Var);
                            y1a1Var.B.c(b64.q(new StringBuilder(String.valueOf(i).length() + 55), "Item can't contain more than ", i, " item-scoped custom params"), i0a1Var.a(str), i0a1Var.e(bundle));
                        }
                        yh(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i2 = i3;
                        z2 = true;
                    }
                    list2 = list;
                    i2 = i3;
                }
            }
            list2 = list;
        }
    }

    public final void Qg(Parcelable[] parcelableArr, int i) {
        cvw.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (Dh(str) && !eh(str, fga1.d) && (i2 = i2 + 1) > i) {
                    g gVar = (g) this.b;
                    j691 j691Var = gVar.w;
                    i0a1 i0a1Var = gVar.C;
                    if (!j691Var.Qg(null, nw91.e1) || !z) {
                        y1a1 y1a1Var = gVar.y;
                        g.g(y1a1Var);
                        y1a1Var.B.c(b64.q(new StringBuilder(String.valueOf(i).length() + 60), "Param can't contain more than ", i, " item-scoped custom parameters"), i0a1Var.b(str), i0a1Var.e(bundle));
                    }
                    yh(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void Rg(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                ieb1 ieb1Var = ((g) this.b).B;
                g.e(ieb1Var);
                ieb1Var.Vg(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void Sg(Bundle bundle, int i, String str, Object obj) {
        if (yh(i, bundle)) {
            ((g) this.b).getClass();
            bundle.putString("_ev", Lg(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int Tg(Object obj, String str) {
        return "_ldl".equals(str) ? Oh("user property referrer", str, Ah(str), obj) : Oh("user property", str, Ah(str), obj) ? 0 : 7;
    }

    public final Object Ug(Object obj, String str) {
        return "_ldl".equals(str) ? zh(Ah(str), obj, true, false) : zh(Ah(str), obj, false, false);
    }

    public final void Vg(Bundle bundle, String str, Object obj) {
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
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            g gVar = (g) this.b;
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.E.c("Not putting event parameter. Invalid value type. name, type", gVar.C.b(str), simpleName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long ah() {
        int extensionVersion;
        int i;
        long j;
        int extensionVersion2;
        Object e;
        Integer num;
        Gg();
        g gVar = (g) this.b;
        fz91 l = gVar.l();
        y1a1 y1a1Var = gVar.y;
        if (!bh(l.Mg())) {
            return 0L;
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        Integer num2 = null;
        if (i2 < 30) {
            j = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j = 8;
            } else {
                if (i2 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 > 3) {
                        i = SdkExtensions.getExtensionVersion(1000000);
                        j = i >= ((Integer) nw91.l0.a(null)).intValue() ? 16L : 0L;
                    }
                }
                i = 0;
                if (i >= ((Integer) nw91.l0.a(null)).intValue()) {
                }
            }
        }
        if (!ch("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.A == null) {
                if (this.z == null) {
                    this.z = ma10.a(gVar.a);
                }
                MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl = this.z;
                if (measurementManagerFutures$Api33Ext5JavaImpl != null) {
                    try {
                        num = (Integer) measurementManagerFutures$Api33Ext5JavaImpl.c().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    z = true;
                                }
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                                e = e2;
                                num2 = num;
                                g.g(y1a1Var);
                                y1a1Var.C.b(e, "Measurement manager api exception");
                                this.A = Boolean.FALSE;
                                num = num2;
                                g.g(y1a1Var);
                                y1a1Var.H.b(num, "Measurement manager api status result");
                                z = this.A.booleanValue();
                                if (!z) {
                                }
                                if (j != 0) {
                                }
                            }
                        }
                        this.A = Boolean.valueOf(z);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e3) {
                        e = e3;
                    }
                    g.g(y1a1Var);
                    y1a1Var.H.b(num, "Measurement manager api status result");
                }
                if (!z) {
                    j = 64;
                }
            }
            z = this.A.booleanValue();
            if (!z) {
            }
        }
        if (j != 0) {
            return 1L;
        }
        return j;
    }

    public final boolean ch(String str) {
        Gg();
        g gVar = (g) this.b;
        if (nb51.a(gVar.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        y1a1Var.G.b(str, "Permission not granted");
        return false;
    }

    public final boolean fh(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((g) this.b).w.Kg("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle gh(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object Ng = Ng(bundle.get(str), str);
                if (Ng == null) {
                    g gVar = (g) this.b;
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.E.b(gVar.C.b(str), "Param value can't be null");
                } else {
                    Vg(bundle2, str, Ng);
                }
            }
        }
        return bundle2;
    }

    public final zzbg hh(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (Jh(str) != 0) {
            g gVar = (g) this.b;
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.b(gVar.C.c(str), "Invalid conditional property event name");
            w511.q();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle Og = Og(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            Og = gh(Og);
        }
        cvw.l(Og);
        return new zzbg(str, new zzbe(Og), str2, j);
    }

    public final boolean ih(Context context, String str) {
        Signature[] signatureArr;
        g gVar = (g) this.b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo c = nb51.a(context).c(64, str);
            if (c == null || (signatureArr = c.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean kh(int i) {
        Boolean bool = ((g) this.b).j().y;
        if (lh() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int lh() {
        if (this.B == null) {
            g gVar = (g) this.b;
            b bVar = b.b;
            Context context = gVar.a;
            bVar.getClass();
            this.B = Integer.valueOf(b.a(context) / 1000);
        }
        return this.B.intValue();
    }

    public final void mh(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void nh(zzcu zzcuVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error returning string value to wrapper");
        }
    }

    public final void oh(zzcu zzcuVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error returning long value to wrapper");
        }
    }

    public final void ph(zzcu zzcuVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error returning int value to wrapper");
        }
    }

    public final void qh(zzcu zzcuVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void rh(zzcu zzcuVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void sh(zzcu zzcuVar, Bundle bundle) {
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void th(zzcu zzcuVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String xh() {
        byte[] bArr = new byte[16];
        Ch().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object zh(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
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
            return Lg(i, obj.toString(), z);
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
                Bundle gh = gh((Bundle) parcelable);
                if (!gh.isEmpty()) {
                    arrayList.add(gh);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }
}
