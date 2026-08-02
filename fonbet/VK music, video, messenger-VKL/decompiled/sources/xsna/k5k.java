package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import com.facebook.soloader.MinElf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.j5k;
import xsna.ml5;
import xsna.ol5;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes.dex */
public final class k5k {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final isv b;
    public final g43 c;
    public final yl20 d;
    public final k1j0 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        a7g.a(5, hashMap, "armeabi", 6, MinElf.ISA.ARM);
        a7g.a(9, hashMap, MinElf.ISA.AARCH64, 0, MinElf.ISA.X86);
        hashMap.put(MinElf.ISA.X86_64, 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/19.4.4";
    }

    public k5k(Context context, isv isvVar, g43 g43Var, yl20 yl20Var, k1j0 k1j0Var) {
        this.a = context;
        this.b = isvVar;
        this.c = g43Var;
        this.d = yl20Var;
        this.e = k1j0Var;
    }

    public static jl5 c(hrp0 hrp0Var, int i) {
        String str = hrp0Var.b;
        String str2 = hrp0Var.a;
        StackTraceElement[] stackTraceElementArr = hrp0Var.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        hrp0 hrp0Var2 = hrp0Var.d;
        if (i >= 8) {
            hrp0 hrp0Var3 = hrp0Var2;
            while (hrp0Var3 != null) {
                hrp0Var3 = hrp0Var3.d;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        byte b = (byte) (0 | 1);
        jl5 jl5Var = null;
        if (hrp0Var2 != null && i3 == 0) {
            jl5Var = c(hrp0Var2, i + 1);
        }
        if (b == 1) {
            return new jl5(str, str2, d, jl5Var, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(t9c.b("Missing required properties:", sb));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ml5.a aVar = new ml5.a();
            aVar.e = i;
            aVar.f = (byte) (aVar.f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            aVar.a = max;
            byte b = (byte) (aVar.f | 1);
            aVar.f = b;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            aVar.b = str;
            aVar.c = fileName;
            aVar.d = j;
            aVar.f = (byte) (b | 2);
            arrayList.add(aVar.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static kl5 e() {
        byte b = (byte) 1;
        if (b == 1) {
            return new kl5("0", "0", 0L);
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(t9c.b("Missing required properties:", sb));
    }

    public final List<j5k.e.d.a.b.AbstractC3098a> a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        g43 g43Var = this.c;
        String str = g43Var.e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = g43Var.b;
        if (b == 3) {
            return Collections.singletonList(new il5(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(t9c.b("Missing required properties:", sb));
    }

    public final ol5 b(int i) {
        Context context = this.a;
        rv6 a = rv6.a(context);
        Float b = a.b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.c();
        boolean z = false;
        if (!fng.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        long a2 = fng.a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = a2 - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        ol5.a aVar = new ol5.a();
        aVar.a = valueOf;
        aVar.b = c;
        byte b2 = (byte) (aVar.g | 1);
        aVar.c = z;
        aVar.d = i;
        aVar.e = j;
        aVar.f = (r4.getBlockCount() * blockSize) - (blockSize * r4.getAvailableBlocks());
        aVar.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | AmfConstants.TYPE_TYPED_OBJECT_MARKER);
        return aVar.a();
    }
}
