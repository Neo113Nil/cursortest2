package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.a;
import defpackage.c3f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class d3f {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final c6v b;
    public final yx1 c;
    public final kjz d;
    public final a e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        b64.B(5, hashMap, "armeabi", 6, "armeabi-v7a");
        b64.B(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.3";
    }

    public d3f(Context context, c6v c6vVar, yx1 yx1Var, kjz kjzVar, a aVar) {
        this.a = context;
        this.b = c6vVar;
        this.c = yx1Var;
        this.d = kjzVar;
        this.e = aVar;
    }

    public static c3f.e.d.a.b.c c(hwo0 hwo0Var, int i) {
        String str = (String) hwo0Var.c;
        String str2 = (String) hwo0Var.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hwo0Var.w;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        hwo0 hwo0Var2 = (hwo0) hwo0Var.x;
        if (i >= 8) {
            hwo0 hwo0Var3 = hwo0Var2;
            while (hwo0Var3 != null) {
                hwo0Var3 = (hwo0) hwo0Var3.x;
                i2++;
            }
        }
        a54 a54Var = new a54();
        a54Var.f(str);
        a54Var.e(str2);
        a54Var.c(d(stackTraceElementArr, 4));
        a54Var.d(i2);
        if (hwo0Var2 != null && i2 == 0) {
            a54Var.b(c(hwo0Var2, i + 1));
        }
        return a54Var.a();
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            g54 g54Var = new g54();
            g54Var.c(i);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + Extension.DOT_CHAR + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            g54Var.e(max);
            g54Var.f(str);
            g54Var.b(fileName);
            g54Var.d(j);
            arrayList.add(g54Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        y44 y44Var = new y44();
        y44Var.b(0L);
        y44Var.d(0L);
        yx1 yx1Var = this.c;
        y44Var.c((String) yx1Var.e);
        y44Var.e((String) yx1Var.b);
        return Collections.singletonList(y44Var.a());
    }

    public final c3f.e.d.c b(int i) {
        Context context = this.a;
        wvb1 f2 = wvb1.f(context);
        Float g2 = f2.g();
        Double valueOf = g2 != null ? Double.valueOf(g2.doubleValue()) : null;
        int h = f2.h();
        boolean z = false;
        if (!CommonUtils.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        long a = CommonUtils.a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = a - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        k54 k54Var = new k54();
        k54Var.b(valueOf);
        k54Var.c(h);
        k54Var.f(z);
        k54Var.e(i);
        k54Var.g(j);
        k54Var.d((r2.getBlockCount() * blockSize) - (blockSize * r2.getAvailableBlocks()));
        return k54Var.a();
    }
}
