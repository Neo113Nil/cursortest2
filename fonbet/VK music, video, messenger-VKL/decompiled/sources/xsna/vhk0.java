package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
import java.io.File;

/* compiled from: SpanContextKey.java */
/* loaded from: classes11.dex */
public final class vhk0 {
    public static final rll a = new rll("opentelemetry-trace-span-key", 1);
    public static final rll b = new rll("root-span-key", 1);
    public static bpn0 c;
    public static bpn0 d;

    public static boolean a(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                } else {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    public static boolean b(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.isDirectory() ? a(file) : file.delete();
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && b(new File(str));
    }

    public static void d(File file) {
        if (b(file)) {
            return;
        }
        b(file);
    }

    public static final jxp e() {
        bpn0 bpn0Var = c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (jxp) bpn0Var.getValue();
    }

    public static final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem f() {
        bpn0 bpn0Var = d;
        if (bpn0Var != null) {
            return (MobileOfficialAppsCoreDeviceStat$DeviceInfoItem) bpn0Var.getValue();
        }
        return null;
    }

    public static boolean g(@NonNull File file) {
        return file.isFile() && file.length() >= 4;
    }

    public static Object h(wdp0 wdp0Var, String str, izs izsVar, int i) {
        Object i2;
        return (wdp0Var == null || (i2 = i(wdp0Var, str, (i & 2) == 0, new qej(4), new y35(izsVar, 2))) == null) ? izsVar.invoke(null) : i2;
    }

    public static final Object i(wdp0 wdp0Var, String str, boolean z, izs izsVar, izs izsVar2) {
        ohk0 ohk0Var;
        qhk0 i = ohk0.current().i();
        if (!i.i() && ((sm5) i).f) {
            return izsVar2.invoke(null);
        }
        phk0 a2 = wdp0Var.a(str);
        if (z && (ohk0Var = (ohk0) wmj.current().c(b)) != null) {
            a2 = a2.f(wmj.current().b(ohk0Var));
        }
        izsVar.invoke(a2);
        ohk0 e = a2.e();
        try {
            v9h0 makeCurrent = e.makeCurrent();
            try {
                Object invoke = e.i().i() ? izsVar2.invoke(e) : izsVar2.invoke(null);
                yfb.d(makeCurrent, null);
                return invoke;
            } finally {
            }
        } finally {
        }
    }
}
