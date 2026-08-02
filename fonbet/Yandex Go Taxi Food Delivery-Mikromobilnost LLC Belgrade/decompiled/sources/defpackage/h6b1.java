package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.io.File;

/* loaded from: classes11.dex */
public abstract class h6b1 {
    public static mgv a;

    public static final void a(sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(849033297);
        int i2 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            byk0 c = cyk0.c(40.0f);
            f530 b = q791.b(bzk0.c(an91.k(bzk0.c(c530.a, AppColor$Palette.Background, c), 12.0f), AppColor$Palette.ControlMinor, c), null, null, false, null, new awk0(0), slsVar, 12);
            zcd.a.getClass();
            btsVar = btsVar2;
            ydb1.a(b, zcd.b, zcd.c, null, zcd.d, null, null, false, btsVar, 25008, 232);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new us4(slsVar, i, 10);
        }
    }

    public static boolean b(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = b(file2) && z;
        }
        return z;
    }

    public static void c(Context context, au50 au50Var) {
        if (b(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            au50Var.c(14, null);
        } else {
            au50Var.c(15, null);
        }
    }
}
