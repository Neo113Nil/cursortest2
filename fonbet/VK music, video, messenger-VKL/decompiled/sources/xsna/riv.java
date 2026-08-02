package xsna;

import com.vk.log.L;
import java.io.EOFException;
import java.io.File;
import java.io.FileFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.ToIntFunction;
import kotlin.collections.EmptyList;
import xsna.cor;
import xsna.riv;

/* compiled from: HttpCacheStatistics.kt */
/* loaded from: classes2.dex */
public final class riv {
    public final File a;
    public final long b;
    public final zcx c;
    public volatile File e;
    public final ConcurrentHashMap<String, b> d = new ConcurrentHashMap<>();
    public final Object f = new Object();

    /* compiled from: HttpCacheStatistics.kt */
    public static final class a extends ObjectOutputStream {
        @Override // java.io.ObjectOutputStream
        public final void writeStreamHeader() {
            reset();
        }
    }

    /* compiled from: HttpCacheStatistics.kt */
    public static final class b {
        public final String a;
        public int b;
        public int c;
        public int d;
        public int e;

        /* compiled from: HttpCacheStatistics.kt */
        public static final class a {
            public static ArrayList a(ObjectInputStream objectInputStream) {
                objectInputStream.readInt();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                while (!z) {
                    try {
                        String readUTF = objectInputStream.readUTF();
                        int readInt = objectInputStream.readInt();
                        int readInt2 = objectInputStream.readInt();
                        int readInt3 = objectInputStream.readInt();
                        int readInt4 = objectInputStream.readInt();
                        b bVar = new b(readUTF);
                        bVar.b = readInt;
                        bVar.c = readInt2;
                        bVar.d = readInt3;
                        bVar.e = readInt4;
                        arrayList.add(bVar);
                    } catch (EOFException unused) {
                        z = true;
                    } catch (StreamCorruptedException e) {
                        L.j(e, "HttpCacheStatistics");
                        com.vk.metrics.eventtracking.b.a.a(e);
                        return arrayList;
                    }
                }
                return arrayList;
            }
        }

        public b(String str) {
            this.a = str;
        }
    }

    public riv(File file, long j, zcx zcxVar) {
        this.a = file;
        this.b = j;
        this.c = zcxVar;
    }

    public final File a() {
        File file;
        synchronized (this.f) {
            this.a.mkdirs();
            int i = 0;
            file = new File(this.a, String.valueOf(0));
            while (file.exists()) {
                i++;
                file = new File(this.a, String.valueOf(i));
            }
        }
        return file;
    }

    public final void b(String str, String str2) {
        int i = 0;
        if (str2 != null) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException e) {
                L.j(e, "HttpCacheStatistics");
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
        final kiv kivVar = new kiv(i);
        this.d.compute(str, new BiFunction() { // from class: xsna.miv
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (riv.b) kiv.this.invoke(obj, obj2);
            }
        });
    }

    public final void c() {
        Collection A;
        File file = this.a;
        synchronized (this.f) {
            try {
                File[] listFiles = file.listFiles(new FileFilter() { // from class: xsna.liv
                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        return file2.isFile() && !file2.equals(riv.this.e);
                    }
                });
                A = listFiles == null ? EmptyList.b : rli0.A(new ulp0(rl3.D(listFiles), new j5n(10)));
            } catch (Throwable th) {
                throw th;
            }
        }
        cor.a aVar = new cor.a(rli0.p(new i5g(A), new r9k(this, 18)));
        while (aVar.hasNext()) {
            b bVar = (b) aVar.next();
            try {
                this.c.invoke(bVar.a, Integer.valueOf(bVar.b), Integer.valueOf(bVar.c), Integer.valueOf(bVar.d), Integer.valueOf(bVar.e));
            } catch (Exception e) {
                L.j(e, "HttpCacheStatistics");
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
    }

    public final void d() {
        synchronized (this.f) {
            try {
                try {
                    File[] listFiles = this.a.listFiles(new FileFilter() { // from class: xsna.piv
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isFile() && !file.equals(riv.this.e);
                        }
                    });
                    if (listFiles != null) {
                        int i = 0;
                        long j = 0;
                        for (File file : listFiles) {
                            j += file.length();
                        }
                        if (j > this.b) {
                            final d37 d37Var = new d37(20);
                            jw5.A(listFiles, Comparator.comparingInt(new ToIntFunction() { // from class: xsna.qiv
                                @Override // java.util.function.ToIntFunction
                                public final int applyAsInt(Object obj) {
                                    return ((Number) d37.this.invoke(obj)).intValue();
                                }
                            }));
                            while (this.b < j && i < listFiles.length) {
                                int i2 = i + 1;
                                try {
                                    File file2 = listFiles[i];
                                    long length = file2.length();
                                    if (file2.delete()) {
                                        j -= length;
                                    }
                                    i = i2;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    throw new NoSuchElementException(e.getMessage());
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception e2) {
                L.j(e2, "HttpCacheStatistics");
                com.vk.metrics.eventtracking.b.a.a(e2);
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
