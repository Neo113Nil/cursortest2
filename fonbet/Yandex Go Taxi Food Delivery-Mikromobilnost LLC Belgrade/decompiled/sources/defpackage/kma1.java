package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.File;
import java.io.IOException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.requirements.models.domain.RequirementLinkModel$RequirementLinkAction;

/* loaded from: classes4.dex */
public abstract class kma1 {
    public static final void a(cj0 cj0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-409593683);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            qy20.a(null, null, null, false, wwg.S(987888335, true, new bj0(i4, cj0Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(cj0Var, i, i3);
        }
    }

    public static cp81 b(Context context) {
        Activity a;
        WindowInsets rootWindowInsets;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        int displayCutout;
        Insets insetsIgnoringVisibility2;
        if (!xga1.b(30)) {
            if (!xga1.b(28) || (a = tb71.a()) == null || (rootWindowInsets = a.getWindow().getDecorView().getRootWindowInsets()) == null) {
                return cp81.g;
            }
            am81 am81Var = sj71.a;
            float f = context.getResources().getDisplayMetrics().density;
            DisplayCutout displayCutout2 = rootWindowInsets.getDisplayCutout();
            return new cp81(sj71.c(f, rootWindowInsets.getSystemWindowInsetLeft()), sj71.c(f, rootWindowInsets.getSystemWindowInsetTop()), sj71.c(f, rootWindowInsets.getSystemWindowInsetRight()), sj71.c(f, rootWindowInsets.getSystemWindowInsetBottom()), sj71.c(f, displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0), sj71.c(f, displayCutout2 != null ? displayCutout2.getSafeInsetBottom() : 0));
        }
        currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        systemBars = WindowInsets.Type.systemBars();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
        displayCutout = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(displayCutout);
        am81 am81Var2 = sj71.a;
        float f2 = context.getResources().getDisplayMetrics().density;
        return new cp81(sj71.c(f2, insetsIgnoringVisibility.left), sj71.c(f2, insetsIgnoringVisibility.top), sj71.c(f2, insetsIgnoringVisibility.right), sj71.c(f2, insetsIgnoringVisibility.bottom), sj71.c(f2, insetsIgnoringVisibility2.top), sj71.c(f2, insetsIgnoringVisibility2.bottom));
    }

    public static IOException c(File file, IOException iOException) {
        return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? e(file, iOException) : e(file, iOException) : file.canWrite() ? e(file, iOException) : e(file, iOException) : file.canRead() ? file.canWrite() ? e(file, iOException) : e(file, iOException) : file.canWrite() ? e(file, iOException) : e(file, iOException) : e(file, iOException);
    }

    public static IOException d(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException e(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            return parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? d(file, iOException) : d(file, iOException) : parentFile.canWrite() ? d(file, iOException) : d(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? d(file, iOException) : d(file, iOException) : parentFile.canWrite() ? d(file, iOException) : d(file, iOException);
        }
        return d(file, iOException);
    }

    public static final vij0 f(gfj0 gfj0Var) {
        RequirementLinkModel$RequirementLinkAction requirementLinkModel$RequirementLinkAction;
        if (gfj0Var == null) {
            vij0 vij0Var = vij0.f;
            return vij0.f;
        }
        String str = gfj0Var.b;
        if (str == null) {
            str = "";
        }
        String str2 = gfj0Var.c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = gfj0Var.d;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = gfj0Var.e;
        String str5 = str4 != null ? str4 : "";
        String str6 = gfj0Var.f;
        if (str6 != null) {
            int hashCode = str6.hashCode();
            if (hashCode != -1943870611) {
                if (hashCode != -1298848381) {
                    if (hashCode == 3529469 && str6.equals("show")) {
                        requirementLinkModel$RequirementLinkAction = RequirementLinkModel$RequirementLinkAction.SHOW;
                    }
                } else if (str6.equals("enable")) {
                    requirementLinkModel$RequirementLinkAction = RequirementLinkModel$RequirementLinkAction.ENABLE;
                }
            } else if (str6.equals("show_and_enable")) {
                requirementLinkModel$RequirementLinkAction = RequirementLinkModel$RequirementLinkAction.SHOW_AND_ENABLE;
            }
            return new vij0(str, str2, str3, str5, requirementLinkModel$RequirementLinkAction);
        }
        requirementLinkModel$RequirementLinkAction = RequirementLinkModel$RequirementLinkAction.SHOW;
        return new vij0(str, str2, str3, str5, requirementLinkModel$RequirementLinkAction);
    }
}
