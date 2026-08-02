package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class q1r {
    public final String a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;
    public final File g;

    public q1r(Context context) {
        String str;
        String c = t5f0.a.b(context).c();
        this.a = c;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (c.isEmpty()) {
            str = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(c.length() > 40 ? CommonUtils.i(c) : c.replaceAll("[^a-zA-Z0-9.]", "_"));
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
        synchronized (q1r.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    file.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
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

    public static List f(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public final void a(String str) {
        File file = new File(this.b, str);
        if (file.exists() && e(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
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
