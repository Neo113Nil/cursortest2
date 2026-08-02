package xsna;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* loaded from: classes.dex */
public final class sar {
    public final String a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;
    public final File g;

    public sar(Context context) {
        String str;
        String c = qgd0.a.b(context).c();
        this.a = c;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (c.isEmpty()) {
            str = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(c.length() > 40 ? fng.i(c) : c.replaceAll("[^a-zA-Z0-9.]", BundleUtil.UNDERLINE_TAG));
            str = sb.toString();
        }
        File file = new File(filesDir, str);
        d(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        d(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        d(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        d(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        d(file5);
        this.g = file5;
    }

    public static synchronized void d(File file) {
        synchronized (sar.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    file.toString();
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean e(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                e(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> f(@Nullable T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    public final void a(String str) {
        File file = new File(this.b, str);
        if (file.exists() && e(file)) {
            file.getPath();
        }
    }

    public final File b(String str) {
        File file = new File(this.d, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public final File c(String str, String str2) {
        File file = new File(this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
