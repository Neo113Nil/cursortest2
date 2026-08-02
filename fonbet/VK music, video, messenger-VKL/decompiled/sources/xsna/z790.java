package xsna;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public final class z790 {
    static {
        m100.d("PackageManagerHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        xsna.m100.c().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            m100.c().getClass();
        } catch (Exception unused) {
            m100.c().getClass();
        }
    }
}
