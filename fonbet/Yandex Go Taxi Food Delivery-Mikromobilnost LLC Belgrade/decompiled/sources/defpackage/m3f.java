package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.f7u0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class m3f {
    public static final Charset d = Charset.forName("UTF-8");
    public final Context a;
    public final x250 b;
    public final q1r c;

    public m3f(Context context, x250 x250Var, q1r q1rVar) {
        this.a = context;
        this.b = x250Var;
        this.c = q1rVar;
    }

    public static String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(byteArray);
                        gZIPOutputStream.finish();
                        String encodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream2.toByteArray());
                        gZIPOutputStream.close();
                        byteArrayOutputStream2.close();
                        return encodeToString;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static File c(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static void f(q1r q1rVar, String str, String str2, String str3) {
        File file = new File(q1rVar.b(str), str3);
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), d));
            try {
                bufferedWriter2.write(str2);
                CommonUtils.b(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                CommonUtils.b(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                CommonUtils.b(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final mzq0 b(String str) {
        List historicalProcessExitReasons;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        int reason2;
        long timestamp2;
        q1r q1rVar = this.c;
        File b = q1rVar.b(str);
        File file = new File(b, "pending");
        file.getAbsolutePath();
        Log.isLoggable("FirebaseCrashlytics", 2);
        File c = c(file, ".dmp");
        if (c != null) {
            c.exists();
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        mzq0 mzq0Var = new mzq0();
        if (b.exists() && file.exists()) {
            File c2 = c(file, ".dmp");
            c44 c44Var = null;
            String str2 = null;
            c44Var = null;
            if (Build.VERSION.SDK_INT >= 31) {
                historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                long lastModified = q1rVar.c(str, "start-time").lastModified();
                ArrayList arrayList = new ArrayList();
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo g = mh.g(it.next());
                    reason2 = g.getReason();
                    if (reason2 == 5) {
                        timestamp2 = g.getTimestamp();
                        if (timestamp2 >= lastModified) {
                            arrayList.add(g);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ApplicationExitInfo g2 = mh.g(arrayList.get(0));
                    b44 b44Var = new b44();
                    importance = g2.getImportance();
                    b44Var.c(importance);
                    processName = g2.getProcessName();
                    b44Var.e(processName);
                    reason = g2.getReason();
                    b44Var.g(reason);
                    timestamp = g2.getTimestamp();
                    b44Var.i(timestamp);
                    pid = g2.getPid();
                    b44Var.d(pid);
                    pss = g2.getPss();
                    b44Var.f(pss);
                    rss = g2.getRss();
                    b44Var.h(rss);
                    try {
                        traceInputStream = g2.getTraceInputStream();
                        str2 = a(traceInputStream);
                    } catch (IOException unused) {
                    }
                    b44Var.j(str2);
                    c44Var = b44Var.a();
                }
            }
            mzq0Var.a = new nzq0(c2, c44Var);
            mzq0Var.b = c(b, ".device_info");
            mzq0Var.c = new File(b, "session.json");
            mzq0Var.d = new File(b, "app.json");
            mzq0Var.e = new File(b, "device.json");
            mzq0Var.f = new File(b, "os.json");
        }
        mzq0 mzq0Var2 = new mzq0();
        mzq0Var2.a = mzq0Var.a;
        mzq0Var2.b = mzq0Var.b;
        mzq0Var2.c = mzq0Var.c;
        mzq0Var2.d = mzq0Var.d;
        mzq0Var2.e = mzq0Var.e;
        mzq0Var2.f = mzq0Var.f;
        return mzq0Var2;
    }

    public final void d(String str, f7u0.a aVar) {
        String a = aVar.a();
        String e = aVar.e();
        String f = aVar.f();
        String d2 = aVar.d();
        int b = aVar.b();
        String str2 = aVar.c().s().a;
        String str3 = aVar.c().s().b;
        HashMap u = g8e.u("app_identifier", a, "version_code", e);
        u.put("version_name", f);
        u.put("install_uuid", d2);
        u.put("delivery_mechanism", Integer.valueOf(b));
        if (str2 == null) {
            str2 = "";
        }
        u.put("development_platform", str2);
        if (str3 == null) {
            str3 = "";
        }
        u.put("development_platform_version", str3);
        f(this.c, str, new JSONObject(u).toString(), "app.json");
    }

    public final void e(String str, f7u0.b bVar) {
        int a = bVar.a();
        String f = bVar.f();
        int b = bVar.b();
        long i = bVar.i();
        long c = bVar.c();
        boolean d2 = bVar.d();
        int h = bVar.h();
        String e = bVar.e();
        String g = bVar.g();
        HashMap hashMap = new HashMap();
        hashMap.put("arch", Integer.valueOf(a));
        hashMap.put("build_model", f);
        hashMap.put("available_processors", Integer.valueOf(b));
        hashMap.put("total_ram", Long.valueOf(i));
        hashMap.put("disk_space", Long.valueOf(c));
        hashMap.put("is_emulator", Boolean.valueOf(d2));
        hashMap.put(ClidProvider.STATE, Integer.valueOf(h));
        hashMap.put("build_manufacturer", e);
        hashMap.put("build_product", g);
        f(this.c, str, new JSONObject(hashMap).toString(), "device.json");
    }

    public final void g(String str, f7u0.c cVar) {
        String c = cVar.c();
        String b = cVar.b();
        boolean a = cVar.a();
        HashMap u = g8e.u("version", c, "build_version", b);
        u.put(CommonUrlParts.ROOT_STATUS, Boolean.valueOf(a));
        f(this.c, str, new JSONObject(u).toString(), "os.json");
    }
}
