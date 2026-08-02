package xsna;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import xsna.kyk0;
import xsna.mti0;
import xsna.wk5;

/* compiled from: CrashpadController.java */
/* loaded from: classes13.dex */
public final class h6k {
    public static final Charset d = Charset.forName(C.UTF8_NAME);
    public final Context a;
    public final mv50 b;
    public final sar c;

    public h6k(Context context, mv50 mv50Var, sar sarVar) {
        this.a = context;
        this.b = mv50Var;
        this.c = sarVar;
    }

    public static String a(InputStream inputStream) throws IOException {
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

    @Nullable
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

    public static void f(sar sarVar, String str, String str2, String str3) {
        File file = new File(sarVar.b(str), str3);
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), d));
            try {
                bufferedWriter2.write(str2);
                fng.b(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                fng.b(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                fng.b(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @NonNull
    public final mti0 b(String str) {
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
        sar sarVar = this.c;
        File b = sarVar.b(str);
        File file = new File(b, "pending");
        file.getAbsolutePath();
        File c = c(file, ".dmp");
        if (c != null) {
            c.exists();
        }
        mti0.a aVar = new mti0.a();
        if (b.exists() && file.exists()) {
            File c2 = c(file, ".dmp");
            wk5 wk5Var = null;
            String str2 = null;
            wk5Var = null;
            if (Build.VERSION.SDK_INT >= 31) {
                historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                long lastModified = sarVar.c(str, "start-time").lastModified();
                ArrayList arrayList = new ArrayList();
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo a = i7s.a(it.next());
                    reason2 = a.getReason();
                    if (reason2 == 5) {
                        timestamp2 = a.getTimestamp();
                        if (timestamp2 >= lastModified) {
                            arrayList.add(a);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ApplicationExitInfo a2 = i7s.a(arrayList.get(0));
                    wk5.a aVar2 = new wk5.a();
                    importance = a2.getImportance();
                    aVar2.c(importance);
                    processName = a2.getProcessName();
                    aVar2.e(processName);
                    reason = a2.getReason();
                    aVar2.g(reason);
                    timestamp = a2.getTimestamp();
                    aVar2.i(timestamp);
                    pid = a2.getPid();
                    aVar2.d(pid);
                    pss = a2.getPss();
                    aVar2.f(pss);
                    rss = a2.getRss();
                    aVar2.h(rss);
                    try {
                        traceInputStream = a2.getTraceInputStream();
                        str2 = a(traceInputStream);
                    } catch (IOException unused) {
                    }
                    aVar2.h = str2;
                    wk5Var = aVar2.a();
                }
            }
            aVar.a = new mti0.b(c2, wk5Var);
            aVar.b = c(b, ".device_info");
            aVar.c = new File(b, "session.json");
            aVar.d = new File(b, "app.json");
            aVar.e = new File(b, "device.json");
            aVar.f = new File(b, "os.json");
        }
        return new mti0(aVar);
    }

    public final void d(String str, kyk0.a aVar) {
        String a = aVar.a();
        String e = aVar.e();
        String f = aVar.f();
        String d2 = aVar.d();
        int b = aVar.b();
        String str2 = aVar.c().a().a;
        String str3 = aVar.c().a().b;
        HashMap a2 = hq.a("app_identifier", a, "version_code", e);
        a2.put("version_name", f);
        a2.put("install_uuid", d2);
        a2.put("delivery_mechanism", Integer.valueOf(b));
        if (str2 == null) {
            str2 = "";
        }
        a2.put("development_platform", str2);
        if (str3 == null) {
            str3 = "";
        }
        a2.put("development_platform_version", str3);
        f(this.c, str, new JSONObject(a2).toString(), "app.json");
    }

    public final void e(String str, kyk0.b bVar) {
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
        hashMap.put("state", Integer.valueOf(h));
        hashMap.put("build_manufacturer", e);
        hashMap.put("build_product", g);
        f(this.c, str, new JSONObject(hashMap).toString(), "device.json");
    }

    public final void g(String str, kyk0.c cVar) {
        String c = cVar.c();
        String b = cVar.b();
        boolean a = cVar.a();
        HashMap a2 = hq.a("version", c, "build_version", b);
        a2.put(CommonUrlParts.ROOT_STATUS, Boolean.valueOf(a));
        f(this.c, str, new JSONObject(a2).toString(), "os.json");
    }
}
