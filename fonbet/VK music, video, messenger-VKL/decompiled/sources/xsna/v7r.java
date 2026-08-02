package xsna;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.collections.EmptyList;

/* compiled from: FileArchive.kt */
/* loaded from: classes.dex */
public final class v7r {
    public final jar a;
    public final m9r b;
    public final File c;

    public v7r(jar jarVar, m9r m9rVar, com.vk.log.c cVar) {
        this.a = jarVar;
        this.b = m9rVar;
        StringBuilder sb = new StringBuilder();
        sb.append(jarVar.b);
        this.c = new File(i5s.a(sb, File.separator, "VK.logup.zip"));
    }

    public static ArrayList b(List list) {
        List list2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null || (list2 = rl3.u0(listFiles)) == null) {
                        list2 = EmptyList.b;
                    }
                    arrayList.addAll(b(list2));
                } else {
                    file.setExecutable(false);
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str)) {
            m9r.e(new File(str));
        }
        jar jarVar = this.a;
        ArrayList b = b(e43.a(new File(jarVar.b)));
        File file = this.c;
        m9r.f(file);
        String str2 = jarVar.b;
        if (b.isEmpty()) {
            m9r.e(file);
            return false;
        }
        ZipOutputStream zipOutputStream = null;
        try {
            byte[] bArr = new byte[1024];
            Iterator it = b.iterator();
            fileOutputStream = null;
            while (it.hasNext()) {
                try {
                    try {
                        File file2 = (File) it.next();
                        if (file2.exists() && file2.isFile() && file2.length() >= 4) {
                            if (fileOutputStream == null) {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                try {
                                    zipOutputStream = new ZipOutputStream(fileOutputStream2);
                                    fileOutputStream = fileOutputStream2;
                                } catch (Exception unused) {
                                    fileOutputStream = fileOutputStream2;
                                    m9r.e(file);
                                    m9r.b(zipOutputStream);
                                    m9r.b(fileOutputStream);
                                    return false;
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    m9r.b(zipOutputStream);
                                    m9r.b(fileOutputStream);
                                    throw th;
                                }
                            }
                            if (zipOutputStream != null) {
                                FileInputStream fileInputStream = new FileInputStream(file2.getAbsolutePath());
                                zipOutputStream.putNextEntry(new ZipEntry(file2.getAbsolutePath().substring(str2.length())));
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    zipOutputStream.write(bArr, 0, read);
                                }
                                zipOutputStream.closeEntry();
                                fileInputStream.close();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        if (file.length() != 0) {
            m9r.b(zipOutputStream);
            m9r.b(fileOutputStream);
            return true;
        }
        m9r.e(file);
        m9r.b(zipOutputStream);
        m9r.b(fileOutputStream);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Iterable iterable;
        File[] listFiles = new File(this.a.b).listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                if (!epx.f(file, this.c)) {
                    arrayList.add(file);
                }
            }
            iterable = j5g.O0(arrayList);
        }
        iterable = EmptyList.b;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m9r.e((File) it.next());
        }
    }
}
