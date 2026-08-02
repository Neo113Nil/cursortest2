package xsna;

import android.net.Uri;
import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.c;
import com.vk.log.L;
import java.io.File;
import java.io.IOException;
import xsna.lam;

/* compiled from: ThemeFileUtils.kt */
/* loaded from: classes2.dex */
public final class hpo0 {
    public static final bpn0 a = new bpn0(new kr6(27));

    public static String a(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        sb.append('_');
        return efz.b(j, "_80", sb);
    }

    public static Uri b(Uri uri, File file) {
        if (uri.equals(Uri.EMPTY)) {
            uri = null;
        }
        if (uri != null) {
            try {
                com.vk.core.files.a.b(sv1.E(uri), file);
                return Uri.fromFile(file);
            } catch (IOException e) {
                L.E(e, new Object[0]);
                h(file);
            }
        }
        return null;
    }

    public static File c(String str) {
        File file = new File((File) a.getValue(), str);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file;
    }

    public static Uri d(lam lamVar, String str) {
        lam.a.C3243a c3243a;
        String str2;
        lam.a.C3243a c3243a2;
        String str3;
        if (!epx.f(lamVar.a, c.h.c.a)) {
            File c = c(a(lamVar.b, lamVar.a, str));
            if (f(c)) {
                return Uri.fromFile(c);
            }
            return null;
        }
        if (str.equals("dark")) {
            lam.a aVar = lamVar.d;
            if (aVar == null || (c3243a2 = aVar.b) == null || (str3 = c3243a2.a) == null) {
                return null;
            }
            return Uri.parse(str3);
        }
        lam.a aVar2 = lamVar.c;
        if (aVar2 == null || (c3243a = aVar2.b) == null || (str2 = c3243a.a) == null) {
            return null;
        }
        return Uri.parse(str2);
    }

    public static boolean e(lam lamVar) {
        return (d(lamVar, "light") == null || d(lamVar, "dark") == null) ? false : true;
    }

    public static boolean f(File file) {
        return file.exists() && file.length() > 0;
    }

    public static boolean g(Uri uri) {
        return (uri == null || uri.equals(Uri.EMPTY)) ? false : true;
    }

    public static void h(File file) {
        File[] listFiles;
        File parentFile;
        try {
            if (file.exists()) {
                file.delete();
                File parentFile2 = file.getParentFile();
                if (parentFile2 == null || (listFiles = parentFile2.listFiles()) == null || listFiles.length != 0 || (parentFile = file.getParentFile()) == null) {
                    return;
                }
                parentFile.delete();
            }
        } catch (IOException e) {
            L.E(e, new Object[0]);
        }
    }

    public static void i(String str) {
        h(c(str));
    }

    public static DialogBackground j(lam lamVar) {
        if (lamVar == null) {
            return DialogBackground.e;
        }
        String str = lamVar.a;
        Uri d = d(lamVar, "light");
        if (d == null) {
            d = Uri.EMPTY;
        }
        Uri d2 = d(lamVar, "dark");
        if (d2 == null) {
            d2 = Uri.EMPTY;
        }
        return new DialogBackground(str, d, d2);
    }
}
