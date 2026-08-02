package xsna;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.j5k;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes.dex */
public final class t5k {
    public static final Charset e = Charset.forName(C.UTF8_NAME);
    public static final int f = 15;
    public static final o5k g = new o5k();
    public static final p5k h = new p5k();
    public static final q5k i = new q5k();
    public final AtomicInteger a = new AtomicInteger(0);
    public final sar b;
    public final k1j0 c;
    public final n4k d;

    public t5k(sar sarVar, k1j0 k1j0Var, n4k n4kVar) {
        this.b = sarVar;
        this.c = k1j0Var;
        this.d = n4kVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    @NonNull
    public static String e(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        sar sarVar = this.b;
        arrayList.addAll(sar.f(sarVar.f.listFiles()));
        arrayList.addAll(sar.f(sarVar.g.listFiles()));
        p5k p5kVar = h;
        Collections.sort(arrayList, p5kVar);
        List f2 = sar.f(sarVar.e.listFiles());
        Collections.sort(f2, p5kVar);
        arrayList.addAll(f2);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(sar.f(this.b.d.list())).descendingSet();
    }

    public final void d(@NonNull j5k.e.d dVar, @NonNull String str, boolean z) {
        sar sarVar = this.b;
        int i2 = this.c.b().a.a;
        g.getClass();
        try {
            f(sarVar.c(str, zr.a(NotificationCompat.CATEGORY_EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? BundleUtil.UNDERLINE_TAG : "")), o5k.a.a(dVar));
        } catch (IOException unused) {
        }
        r5k r5kVar = new r5k(0);
        sarVar.getClass();
        File file = new File(sarVar.d, str);
        file.mkdirs();
        List<File> f2 = sar.f(file.listFiles(r5kVar));
        Collections.sort(f2, new s5k(0));
        int size = f2.size();
        for (File file2 : f2) {
            if (size <= i2) {
                return;
            }
            sar.e(file2);
            size--;
        }
    }
}
