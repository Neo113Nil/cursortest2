package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.soloader.MinElf;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.dto.common.ImageSizeKey;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: CommonUtils.java */
/* loaded from: classes.dex */
public final class fng {
    public static final char[] a = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonUtils.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ARM64;
        public static final a ARMV6;
        public static final a ARMV7;
        public static final a ARMV7S;
        public static final a ARM_UNKNOWN;
        public static final a PPC;
        public static final a PPC64;
        public static final a UNKNOWN;
        public static final a X86_32;
        public static final a X86_64;
        private static final Map<String, a> matcher;

        static {
            a aVar = new a("X86_32", 0);
            X86_32 = aVar;
            a aVar2 = new a("X86_64", 1);
            X86_64 = aVar2;
            a aVar3 = new a("ARM_UNKNOWN", 2);
            ARM_UNKNOWN = aVar3;
            a aVar4 = new a("PPC", 3);
            PPC = aVar4;
            a aVar5 = new a("PPC64", 4);
            PPC64 = aVar5;
            a aVar6 = new a("ARMV6", 5);
            ARMV6 = aVar6;
            a aVar7 = new a("ARMV7", 6);
            ARMV7 = aVar7;
            a aVar8 = new a(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
            UNKNOWN = aVar8;
            a aVar9 = new a("ARMV7S", 8);
            ARMV7S = aVar9;
            a aVar10 = new a("ARM64", 9);
            ARM64 = aVar10;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put(MinElf.ISA.ARM, aVar7);
            hashMap.put("armeabi", aVar6);
            hashMap.put(MinElf.ISA.AARCH64, aVar10);
            hashMap.put(MinElf.ISA.X86, aVar);
        }

        public a() {
            throw null;
        }

        public static a h() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static synchronized long a(Context context) {
        long j;
        synchronized (fng.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        }
        return j;
    }

    public static void b(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", str, e);
            }
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int d() {
        boolean g = g();
        ?? r0 = g;
        if (h()) {
            r0 = (g ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static int e(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String f(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = a;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & AmfConstants.TYPE_XML_DOCUMENT_MARKER];
        }
        return new String(cArr);
    }

    public static boolean g() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean h() {
        boolean g = g();
        String str = Build.TAGS;
        if ((g || str == null || !str.contains("test-keys")) && !bd3.d("/system/app/Superuser.apk")) {
            return !g && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String i(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bytes);
            return f(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    public static String j(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = useDelimiter.hasNext() ? useDelimiter.next() : "";
            useDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
