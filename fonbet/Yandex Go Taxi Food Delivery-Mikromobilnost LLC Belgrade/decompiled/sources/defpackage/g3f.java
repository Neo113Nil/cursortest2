package defpackage;

import com.google.firebase.crashlytics.internal.settings.a;
import defpackage.c3f;
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
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes.dex */
public final class g3f {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final e3f g = new e3f();
    public static final o2f h = new o2f(1);
    public static final n2f i = new n2f(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final q1r b;
    public final a c;
    public final p2f d;

    public g3f(q1r q1rVar, a aVar, p2f p2fVar) {
        this.b = q1rVar;
        this.c = aVar;
        this.d = p2fVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
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

    public static void f(File file, String str) {
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
        q1r q1rVar = this.b;
        arrayList.addAll(q1r.f(q1rVar.f.listFiles()));
        arrayList.addAll(q1r.f(q1rVar.g.listFiles()));
        o2f o2fVar = h;
        Collections.sort(arrayList, o2fVar);
        List f2 = q1r.f(q1rVar.e.listFiles());
        Collections.sort(f2, o2fVar);
        arrayList.addAll(f2);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(q1r.f(this.b.d.list())).descendingSet();
    }

    public final void d(c3f.e.d dVar, String str, boolean z) {
        q1r q1rVar = this.b;
        int i2 = this.c.b().a.a;
        g.getClass();
        try {
            f(q1rVar.c(str, oyr.p(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), e3f.a.k(dVar));
        } catch (IOException unused) {
        }
        f3f f3fVar = new f3f(0);
        q1rVar.getClass();
        File file = new File(q1rVar.d, str);
        file.mkdirs();
        List<File> f2 = q1r.f(file.listFiles(f3fVar));
        Collections.sort(f2, new y60(7));
        int size = f2.size();
        for (File file2 : f2) {
            if (size <= i2) {
                return;
            }
            q1r.e(file2);
            size--;
        }
    }
}
