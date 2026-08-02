package yads;

import android.os.ConditionVariable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.regex.Pattern;
import xsna.fo8;
import xsna.z9r;

/* loaded from: classes10.dex */
public final class zz2 implements nr {
    public static final HashSet j = new HashSet();
    public final File a;
    public final ur b;
    public final ls c;
    public final wr d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public kr i;

    public zz2(File file, ef1 ef1Var, ls lsVar, wr wrVar) {
        if (!c(file)) {
            throw new IllegalStateException(z9r.a(file, "Another SimpleCache instance uses the folder: "));
        }
        this.a = file;
        this.b = ef1Var;
        this.c = lsVar;
        this.d = wrVar;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new yz2(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final void a(c03 c03Var) {
        this.c.a(c03Var.b).c.add(c03Var);
        ArrayList arrayList = (ArrayList) this.e.get(c03Var.b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ef1 ef1Var = (ef1) ((ur) arrayList.get(size));
                ef1Var.b.add(c03Var);
                ef1Var.c += c03Var.d;
                ef1Var.a(this, 0L);
            }
        }
        ef1 ef1Var2 = (ef1) this.b;
        ef1Var2.b.add(c03Var);
        ef1Var2.c += c03Var.d;
        ef1Var2.a(this, 0L);
    }

    public final synchronized long b(String str, long j2, long j3) {
        hs hsVar;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        hsVar = (hs) this.c.a.get(str);
        return hsVar != null ? hsVar.a(j2, j3) : -j3;
    }

    public final synchronized void c(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            b((zr) it.next());
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.c.a.values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((hs) it.next()).c.iterator();
            while (it2.hasNext()) {
                zr zrVar = (zr) it2.next();
                if (zrVar.f.length() != zrVar.d) {
                    arrayList.add(zrVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            b((zr) arrayList.get(i));
        }
    }

    public final synchronized jc0 b(String str) {
        jc0 jc0Var;
        try {
            hs hsVar = (hs) this.c.a.get(str);
            if (hsVar != null) {
                jc0Var = hsVar.e;
            } else {
                jc0Var = jc0.c;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jc0Var;
    }

    public final void b() {
        long j2;
        if (!this.a.exists()) {
            try {
                a(this.a);
            } catch (kr e) {
                this.i = e;
                return;
            }
        }
        File[] listFiles = this.a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.a;
            ji1.b("SimpleCache", str);
            this.i = new kr(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file = listFiles[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    ji1.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i++;
        }
        this.h = j2;
        if (j2 == -1) {
            try {
                this.h = b(this.a);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.a;
                ji1.b("SimpleCache", ji1.a(str2, e2));
                this.i = new kr(str2, e2);
                return;
            }
        }
        try {
            this.c.a(this.h);
            wr wrVar = this.d;
            if (wrVar != null) {
                wrVar.a(this.h);
                HashMap a = this.d.a();
                a(this.a, true, listFiles, a);
                this.d.a(a.keySet());
            } else {
                a(this.a, true, listFiles, null);
            }
            ls lsVar = this.c;
            nb3 it = x51.a(lsVar.a.keySet()).iterator();
            while (it.hasNext()) {
                lsVar.b((String) it.next());
            }
            try {
                this.c.a();
            } catch (Throwable th) {
                ji1.b("SimpleCache", ji1.a("Storing index file failed", th));
            }
        } catch (Throwable th2) {
            String str3 = "Failed to initialize cache indices: " + this.a;
            ji1.b("SimpleCache", ji1.a(str3, th2));
            this.i = new kr(str3, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, IOException -> 0x0066, blocks: (B:4:0x0005, B:6:0x0014, B:7:0x0043, B:9:0x0048, B:15:0x004e, B:43:0x0062, B:19:0x006f, B:21:0x0081, B:23:0x0088, B:26:0x00e1, B:28:0x00e5, B:30:0x0106, B:32:0x010d, B:34:0x0133, B:36:0x0155, B:37:0x015a, B:38:0x00c4, B:40:0x015b, B:41:0x0160, B:45:0x0066, B:46:0x0161, B:47:0x0169, B:49:0x0171, B:51:0x0181, B:70:0x019e, B:74:0x002b, B:76:0x0033, B:78:0x003f), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0155 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, IOException -> 0x0066, blocks: (B:4:0x0005, B:6:0x0014, B:7:0x0043, B:9:0x0048, B:15:0x004e, B:43:0x0062, B:19:0x006f, B:21:0x0081, B:23:0x0088, B:26:0x00e1, B:28:0x00e5, B:30:0x0106, B:32:0x010d, B:34:0x0133, B:36:0x0155, B:37:0x015a, B:38:0x00c4, B:40:0x015b, B:41:0x0160, B:45:0x0066, B:46:0x0161, B:47:0x0169, B:49:0x0171, B:51:0x0181, B:70:0x019e, B:74:0x002b, B:76:0x0033, B:78:0x003f), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized c03 c(String str, long j2, long j3) {
        long j4;
        c03 b;
        int i;
        File file;
        try {
            a();
            hs hsVar = (hs) this.c.a.get(str);
            if (hsVar != null) {
                j4 = j2;
                while (true) {
                    b = hsVar.b(j4, j3);
                    if (!b.e || b.f.length() == b.d) {
                        break;
                    }
                    c();
                }
            } else {
                j4 = j2;
                b = new c03(str, j4, j3, C.TIME_UNSET, null);
            }
        } catch (IOException unused) {
            ji1.d("SimpleCache", "Failed to update index with new touch timestamp.");
        } finally {
        }
        if (b.e) {
            if (this.g) {
                File file2 = b.f;
                file2.getClass();
                String name = file2.getName();
                long j5 = b.d;
                long currentTimeMillis = System.currentTimeMillis();
                wr wrVar = this.d;
                if (wrVar != null) {
                    wrVar.a(name, j5, currentTimeMillis);
                } else {
                    i = 1;
                }
                hs hsVar2 = (hs) this.c.a.get(str);
                if (hsVar2.c.remove(b)) {
                    File file3 = b.f;
                    file3.getClass();
                    if (i != 0) {
                        File parentFile = file3.getParentFile();
                        parentFile.getClass();
                        long j6 = b.c;
                        int i2 = hsVar2.a;
                        Pattern pattern = c03.h;
                        File file4 = new File(parentFile, i2 + "." + j6 + "." + currentTimeMillis + ".v3.exo");
                        if (file3.renameTo(file4)) {
                            file = file4;
                            if (!b.e) {
                                c03 c03Var = new c03(b.b, b.c, b.d, currentTimeMillis, file);
                                hsVar2.c.add(c03Var);
                                ArrayList arrayList = (ArrayList) this.e.get(b.b);
                                if (arrayList != null) {
                                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                                        ef1 ef1Var = (ef1) ((ur) arrayList.get(size));
                                        ef1Var.b.remove(b);
                                        ef1Var.c -= b.d;
                                        ef1Var.b.add(c03Var);
                                        ef1Var.c += c03Var.d;
                                        ef1Var.a(this, 0L);
                                    }
                                }
                                ef1 ef1Var2 = (ef1) this.b;
                                ef1Var2.b.remove(b);
                                ef1Var2.c -= b.d;
                                ef1Var2.b.add(c03Var);
                                ef1Var2.c += c03Var.d;
                                ef1Var2.a(this, 0L);
                                b = c03Var;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            ji1.d("CachedContent", "Failed to rename " + file3 + " to " + file4);
                        }
                    }
                    file = file3;
                    if (!b.e) {
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }
        hs a = this.c.a(str);
        long j7 = b.d;
        while (i < a.d.size()) {
            gs gsVar = (gs) a.d.get(i);
            long j8 = gsVar.a;
            if (j8 <= j4) {
                long j9 = gsVar.b;
                i = (j9 != -1 && j8 + j9 <= j4) ? i + 1 : 0;
                return null;
            }
            if (j7 != -1 && j4 + j7 <= j8) {
            }
            return null;
        }
        a.d.add(new gs(j4, j7));
        return b;
    }

    public final synchronized void a(String str, rz rzVar) {
        kr krVar;
        a();
        ls lsVar = this.c;
        hs a = lsVar.a(str);
        jc0 jc0Var = a.e;
        jc0 a2 = jc0Var.a(rzVar);
        a.e = a2;
        if (!a2.equals(jc0Var)) {
            lsVar.e.a(a);
        }
        try {
            this.c.a();
        } finally {
        }
    }

    public zz2(File file, ef1 ef1Var, kn0 kn0Var) {
        this(file, ef1Var, new ls(kn0Var, file), new wr(kn0Var));
    }

    public final synchronized void a() {
        kr krVar = this.i;
        if (krVar != null) {
            throw krVar;
        }
    }

    public static void a(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        ji1.b("SimpleCache", str);
        throw new kr(str);
    }

    public final synchronized long a(String str, long j2, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j2 + j3;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        long j7 = j2;
        j4 = 0;
        while (j7 < j6) {
            long b = b(str, j7, j6 - j7);
            if (b > 0) {
                j4 += b;
            } else {
                b = -b;
            }
            j7 += b;
        }
        return j4;
    }

    public final synchronized TreeSet a(String str) {
        TreeSet treeSet;
        try {
            hs hsVar = (hs) this.c.a.get(str);
            if (hsVar != null && !hsVar.c.isEmpty()) {
                treeSet = new TreeSet((Collection) hsVar.c);
            }
            treeSet = new TreeSet();
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    public final void a(File file, boolean z, File[] fileArr, HashMap hashMap) {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), hashMap);
            } else if (!z || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                vr vrVar = hashMap != null ? (vr) hashMap.remove(name) : null;
                if (vrVar != null) {
                    j2 = vrVar.a;
                    j3 = vrVar.b;
                } else {
                    j2 = -1;
                    j3 = C.TIME_UNSET;
                }
                c03 a = c03.a(file2, j2, j3, this.c);
                if (a != null) {
                    a(a);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void b(zr zrVar) {
        hs hsVar = (hs) this.c.a.get(zrVar.b);
        if (hsVar == null || !hsVar.c.remove(zrVar)) {
            return;
        }
        File file = zrVar.f;
        if (file != null) {
            file.delete();
        }
        if (this.d != null) {
            String name = zrVar.f.getName();
            try {
                wr wrVar = this.d;
                wrVar.b.getClass();
                try {
                    wrVar.a.getWritableDatabase().delete(wrVar.b, "name = ?", new String[]{name});
                } catch (Throwable th) {
                    throw new v30(th);
                }
            } catch (IOException unused) {
                ql1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.c.b(hsVar.b);
        ArrayList arrayList = (ArrayList) this.e.get(zrVar.b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ef1 ef1Var = (ef1) ((ur) arrayList.get(size));
                ef1Var.b.remove(zrVar);
                ef1Var.c -= zrVar.d;
            }
        }
        ef1 ef1Var2 = (ef1) this.b;
        ef1Var2.b.remove(zrVar);
        ef1Var2.c -= zrVar.d;
    }

    public final synchronized void a(zr zrVar) {
        ls lsVar = this.c;
        hs hsVar = (hs) lsVar.a.get(zrVar.b);
        hsVar.getClass();
        long j2 = zrVar.c;
        for (int i = 0; i < hsVar.d.size(); i++) {
            if (((gs) hsVar.d.get(i)).a == j2) {
                hsVar.d.remove(i);
                this.c.b(hsVar.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public static long b(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, fo8.a(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException(z9r.a(file2, "Failed to create UID file: "));
    }

    public static synchronized boolean c(File file) {
        boolean add;
        synchronized (zz2.class) {
            add = j.add(file.getAbsoluteFile());
        }
        return add;
    }
}
