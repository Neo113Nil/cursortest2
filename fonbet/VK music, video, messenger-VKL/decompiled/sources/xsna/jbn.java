package xsna;

import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import okhttp3.internal.concurrent.TaskRunner;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes8.dex */
public final class jbn implements Closeable, Flushable {
    public static final Regex t = new Regex("[a-z0-9_-]{1,120}");
    public static final String u = "CLEAN";
    public static final String v = "DIRTY";
    public static final String w = SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE;
    public static final String x = "READ";
    public final File b;
    public final long c;
    public final File d;
    public final File e;
    public final File f;
    public long g;
    public d8f0 h;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public final x6o0 r;
    public final LinkedHashMap<String, b> i = new LinkedHashMap<>(0, 0.75f, true);
    public final lbn s = new lbn(this, i5s.a(new StringBuilder(), x2r0.h, " Cache"));

    /* compiled from: DiskLruCache.kt */
    public final class a {
        public final b a;
        public final boolean[] b;
        public boolean c;

        /* compiled from: DiskLruCache.kt */
        /* renamed from: xsna.jbn$a$a, reason: collision with other inner class name */
        public static final class C3113a extends Lambda implements izs<IOException, s3q0> {
            final /* synthetic */ jbn this$0;
            final /* synthetic */ a this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3113a(jbn jbnVar, a aVar) {
                super(1);
                this.this$0 = jbnVar;
                this.this$1 = aVar;
            }

            @Override // xsna.izs
            public final s3q0 invoke(IOException iOException) {
                jbn jbnVar = this.this$0;
                a aVar = this.this$1;
                synchronized (jbnVar) {
                    aVar.c();
                }
                return s3q0.a;
            }
        }

        public a(b bVar) {
            boolean[] zArr;
            this.a = bVar;
            if (bVar.e) {
                zArr = null;
            } else {
                jbn.this.getClass();
                zArr = new boolean[2];
            }
            this.b = zArr;
        }

        public final void a() throws IOException {
            jbn jbnVar = jbn.this;
            synchronized (jbnVar) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (epx.f(this.a.g, this)) {
                        jbnVar.n(this, false);
                    }
                    this.c = true;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() throws IOException {
            jbn jbnVar = jbn.this;
            synchronized (jbnVar) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (epx.f(this.a.g, this)) {
                        jbnVar.n(this, true);
                    }
                    this.c = true;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            b bVar = this.a;
            if (epx.f(bVar.g, this)) {
                jbn jbnVar = jbn.this;
                if (jbnVar.l) {
                    jbnVar.n(this, false);
                } else {
                    bVar.f = true;
                }
            }
        }

        public final qwj0 d(int i) {
            p190 c;
            jbn jbnVar = jbn.this;
            synchronized (jbnVar) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!epx.f(this.a.g, this)) {
                        return new zd7();
                    }
                    b bVar = this.a;
                    if (!bVar.e) {
                        this.b[i] = true;
                    }
                    File file = (File) bVar.d.get(i);
                    try {
                        try {
                            c = mq9.c(file);
                        } catch (FileNotFoundException unused) {
                            file.getParentFile().mkdirs();
                            c = mq9.c(file);
                        }
                        return new fmq(c, new C3113a(jbnVar, this));
                    } catch (FileNotFoundException unused2) {
                        return new zd7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class b {
        public final String a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public a g;
        public int h;
        public long i;

        public b(String str) {
            this.a = str;
            jbn.this.getClass();
            this.b = new long[2];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.c.add(new File(jbn.this.b, sb.toString()));
                sb.append(".tmp");
                this.d.add(new File(jbn.this.b, sb.toString()));
                sb.setLength(length);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [xsna.kbn] */
        public final c a() {
            byte[] bArr = x2r0.a;
            if (!this.e) {
                return null;
            }
            jbn jbnVar = jbn.this;
            if (!jbnVar.l && (this.g != null || this.f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                try {
                    File file = (File) this.c.get(i);
                    Logger logger = ez70.a;
                    i3x i3xVar = new i3x(new FileInputStream(file), mxo0.d);
                    if (!jbnVar.l) {
                        this.h++;
                        i3xVar = new kbn(i3xVar, jbnVar, this);
                    }
                    arrayList.add(i3xVar);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        x2r0.c((agk0) it.next());
                    }
                    try {
                        jbnVar.x(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return jbn.this.new c(this.a, this.i, arrayList);
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class c implements Closeable {
        public final String b;
        public final long c;
        public final ArrayList d;

        public c(String str, long j, ArrayList arrayList) {
            this.b = str;
            this.c = j;
            this.d = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                x2r0.c((agk0) it.next());
            }
        }
    }

    public jbn(File file, long j, TaskRunner taskRunner) {
        this.b = file;
        this.c = j;
        this.r = taskRunner.e();
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.d = new File(file, "journal");
        this.e = new File(file, "journal.tmp");
        this.f = new File(file, "journal.bkp");
    }

    public static void z(String str) {
        if (!t.f(str)) {
            throw new IllegalArgumentException(air.b('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.m && !this.n) {
                for (b bVar : (b[]) this.i.values().toArray(new b[0])) {
                    a aVar = bVar.g;
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                y();
                this.h.close();
                this.h = null;
                this.n = true;
                return;
            }
            this.n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        if (this.m) {
            m();
            y();
            this.h.flush();
        }
    }

    public final synchronized void m() {
        if (this.n) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void n(a aVar, boolean z) throws IOException {
        b bVar = aVar.a;
        if (!epx.f(bVar.g, aVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !bVar.e) {
            for (int i = 0; i < 2; i++) {
                if (!aVar.b[i]) {
                    aVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!((File) bVar.d.get(i)).exists()) {
                    aVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            File file = (File) bVar.d.get(i2);
            if (z && !bVar.f) {
                we7 we7Var = we7.b;
                if (file.exists()) {
                    File file2 = (File) bVar.c.get(i2);
                    we7Var.s(file, file2);
                    long j = bVar.b[i2];
                    long length = file2.length();
                    bVar.b[i2] = length;
                    this.g = (this.g - j) + length;
                }
            } else if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }
        bVar.g = null;
        if (bVar.f) {
            x(bVar);
            return;
        }
        this.j++;
        d8f0 d8f0Var = this.h;
        if (!bVar.e && !z) {
            this.i.remove(bVar.a);
            d8f0Var.y1(w);
            d8f0Var.writeByte(32);
            d8f0Var.y1(bVar.a);
            d8f0Var.writeByte(10);
            d8f0Var.flush();
            if (this.g <= this.c || r()) {
                this.r.c(this.s, 0L);
            }
        }
        bVar.e = true;
        d8f0Var.y1(u);
        d8f0Var.writeByte(32);
        d8f0Var.y1(bVar.a);
        for (long j2 : bVar.b) {
            d8f0Var.writeByte(32);
            d8f0Var.v0(j2);
        }
        d8f0Var.writeByte(10);
        if (z) {
            long j3 = this.q;
            this.q = 1 + j3;
            bVar.i = j3;
        }
        d8f0Var.flush();
        if (this.g <= this.c) {
        }
        this.r.c(this.s, 0L);
    }

    public final synchronized a o(long j, String str) throws IOException {
        q();
        m();
        z(str);
        b bVar = this.i.get(str);
        if (j != -1 && (bVar == null || bVar.i != j)) {
            return null;
        }
        if ((bVar != null ? bVar.g : null) != null) {
            return null;
        }
        if (bVar != null && bVar.h != 0) {
            return null;
        }
        if (!this.o && !this.p) {
            d8f0 d8f0Var = this.h;
            d8f0Var.y1(v);
            d8f0Var.writeByte(32);
            d8f0Var.y1(str);
            d8f0Var.writeByte(10);
            d8f0Var.flush();
            if (this.k) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(str);
                this.i.put(str, bVar);
            }
            a aVar = new a(bVar);
            bVar.g = aVar;
            return aVar;
        }
        this.r.c(this.s, 0L);
        return null;
    }

    public final synchronized c p(String str) throws IOException {
        q();
        m();
        z(str);
        b bVar = this.i.get(str);
        if (bVar == null) {
            return null;
        }
        c a2 = bVar.a();
        if (a2 == null) {
            return null;
        }
        this.j++;
        d8f0 d8f0Var = this.h;
        d8f0Var.y1(x);
        d8f0Var.writeByte(32);
        d8f0Var.y1(str);
        d8f0Var.writeByte(10);
        if (r()) {
            this.r.c(this.s, 0L);
        }
        return a2;
    }

    public final synchronized void q() throws IOException {
        p190 c2;
        boolean z;
        try {
            byte[] bArr = x2r0.a;
            if (this.m) {
                return;
            }
            we7 we7Var = we7.b;
            if (this.f.exists()) {
                if (this.d.exists()) {
                    we7Var.g(this.f);
                } else {
                    we7Var.s(this.f, this.d);
                }
            }
            File file = this.f;
            we7Var.getClass();
            try {
                c2 = mq9.c(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                c2 = mq9.c(file);
            }
            try {
                try {
                    we7Var.g(file);
                    c2.close();
                    z = true;
                } finally {
                }
            } catch (IOException unused2) {
                s3q0 s3q0Var = s3q0.a;
                c2.close();
                we7Var.g(file);
                z = false;
            }
            this.l = z;
            if (this.d.exists()) {
                try {
                    t();
                    s();
                    this.m = true;
                    return;
                } catch (IOException e) {
                    fta0 fta0Var = fta0.a;
                    fta0 fta0Var2 = fta0.a;
                    String str = "DiskLruCache " + this.b + " is corrupt: " + e.getMessage() + ", removing";
                    fta0Var2.getClass();
                    fta0.i(5, str, e);
                    try {
                        close();
                        we7.b.h(this.b);
                        this.n = false;
                    } catch (Throwable th) {
                        this.n = false;
                        throw th;
                    }
                }
            }
            w();
            this.m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean r() {
        int i = this.j;
        return i >= 2000 && i >= this.i.size();
    }

    public final void s() throws IOException {
        we7 we7Var = we7.b;
        we7Var.g(this.e);
        Iterator<b> it = this.i.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.g == null) {
                while (i < 2) {
                    this.g += next.b[i];
                    i++;
                }
            } else {
                next.g = null;
                while (i < 2) {
                    we7Var.g((File) next.c.get(i));
                    we7Var.g((File) next.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void t() throws IOException {
        p190 b2;
        Logger logger = ez70.a;
        File file = this.d;
        e8f0 e8f0Var = new e8f0(new i3x(new FileInputStream(file), mxo0.d));
        try {
            String s1 = e8f0Var.s1(Long.MAX_VALUE);
            String s12 = e8f0Var.s1(Long.MAX_VALUE);
            String s13 = e8f0Var.s1(Long.MAX_VALUE);
            String s14 = e8f0Var.s1(Long.MAX_VALUE);
            String s15 = e8f0Var.s1(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(s1) || !"1".equals(s12) || !epx.f(String.valueOf(201105), s13) || !epx.f(String.valueOf(2), s14) || s15.length() > 0) {
                throw new IOException("unexpected journal header: [" + s1 + ", " + s12 + ", " + s14 + ", " + s15 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    v(e8f0Var.s1(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.j = i - this.i.size();
                    if (e8f0Var.W1()) {
                        try {
                            Logger logger2 = ez70.a;
                            b2 = mq9.b(new FileOutputStream(file, true));
                        } catch (FileNotFoundException unused2) {
                            file.getParentFile().mkdirs();
                            Logger logger3 = ez70.a;
                            b2 = mq9.b(new FileOutputStream(file, true));
                        }
                        this.h = new d8f0(new fmq(b2, new mbn(this)));
                    } else {
                        w();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    e8f0Var.close();
                    return;
                }
            }
        } finally {
        }
    }

    public final void v(String str) throws IOException {
        String substring;
        int L = drm0.L(str, ' ', 0, 6);
        if (L == -1) {
            throw new IOException(go9.b("unexpected journal line: ", str));
        }
        int i = L + 1;
        int L2 = drm0.L(str, ' ', i, 4);
        LinkedHashMap<String, b> linkedHashMap = this.i;
        if (L2 == -1) {
            substring = str.substring(i);
            String str2 = w;
            if (L == str2.length() && brm0.B(str, str2, false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, L2);
        }
        b bVar = linkedHashMap.get(substring);
        if (bVar == null) {
            bVar = new b(substring);
            linkedHashMap.put(substring, bVar);
        }
        if (L2 != -1) {
            String str3 = u;
            if (L == str3.length() && brm0.B(str, str3, false)) {
                List b0 = drm0.b0(str.substring(L2 + 1), new char[]{' '}, 0, 6);
                bVar.e = true;
                bVar.g = null;
                int size = b0.size();
                jbn.this.getClass();
                if (size != 2) {
                    throw new IOException(go9.c("unexpected journal line: ", b0));
                }
                try {
                    int size2 = b0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        bVar.b[i2] = Long.parseLong((String) b0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException(go9.c("unexpected journal line: ", b0));
                }
            }
        }
        if (L2 == -1) {
            String str4 = v;
            if (L == str4.length() && brm0.B(str, str4, false)) {
                bVar.g = new a(bVar);
                return;
            }
        }
        if (L2 == -1) {
            String str5 = x;
            if (L == str5.length() && brm0.B(str, str5, false)) {
                return;
            }
        }
        throw new IOException(go9.b("unexpected journal line: ", str));
    }

    public final synchronized void w() throws IOException {
        p190 c2;
        p190 b2;
        try {
            d8f0 d8f0Var = this.h;
            if (d8f0Var != null) {
                d8f0Var.close();
            }
            File file = this.e;
            try {
                c2 = mq9.c(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                c2 = mq9.c(file);
            }
            d8f0 d8f0Var2 = new d8f0(c2);
            try {
                d8f0Var2.y1("libcore.io.DiskLruCache");
                d8f0Var2.writeByte(10);
                d8f0Var2.y1("1");
                d8f0Var2.writeByte(10);
                d8f0Var2.v0(201105);
                d8f0Var2.writeByte(10);
                d8f0Var2.v0(2);
                d8f0Var2.writeByte(10);
                d8f0Var2.writeByte(10);
                Iterator<b> it = this.i.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b next = it.next();
                    if (next.g != null) {
                        d8f0Var2.y1(v);
                        d8f0Var2.writeByte(32);
                        d8f0Var2.y1(next.a);
                        d8f0Var2.writeByte(10);
                    } else {
                        d8f0Var2.y1(u);
                        d8f0Var2.writeByte(32);
                        d8f0Var2.y1(next.a);
                        for (long j : next.b) {
                            d8f0Var2.writeByte(32);
                            d8f0Var2.v0(j);
                        }
                        d8f0Var2.writeByte(10);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                d8f0Var2.close();
                we7 we7Var = we7.b;
                if (this.d.exists()) {
                    we7Var.s(this.d, this.f);
                }
                we7Var.s(this.e, this.d);
                we7Var.g(this.f);
                File file2 = this.d;
                try {
                    Logger logger = ez70.a;
                    b2 = mq9.b(new FileOutputStream(file2, true));
                } catch (FileNotFoundException unused2) {
                    file2.getParentFile().mkdirs();
                    Logger logger2 = ez70.a;
                    b2 = mq9.b(new FileOutputStream(file2, true));
                }
                this.h = new d8f0(new fmq(b2, new mbn(this)));
                this.k = false;
                this.p = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void x(b bVar) throws IOException {
        d8f0 d8f0Var;
        String str = bVar.a;
        if (!this.l) {
            if (bVar.h > 0 && (d8f0Var = this.h) != null) {
                d8f0Var.y1(v);
                d8f0Var.writeByte(32);
                d8f0Var.y1(str);
                d8f0Var.writeByte(10);
                d8f0Var.flush();
            }
            if (bVar.h > 0 || bVar.g != null) {
                bVar.f = true;
                return;
            }
        }
        a aVar = bVar.g;
        if (aVar != null) {
            aVar.c();
        }
        for (int i = 0; i < 2; i++) {
            File file = (File) bVar.c.get(i);
            if (!file.delete() && file.exists()) {
                throw new IOException(z9r.a(file, "failed to delete "));
            }
            long j = this.g;
            long[] jArr = bVar.b;
            this.g = j - jArr[i];
            jArr[i] = 0;
        }
        this.j++;
        d8f0 d8f0Var2 = this.h;
        if (d8f0Var2 != null) {
            d8f0Var2.y1(w);
            d8f0Var2.writeByte(32);
            d8f0Var2.y1(str);
            d8f0Var2.writeByte(10);
        }
        this.i.remove(str);
        if (r()) {
            this.r.c(this.s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        x(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() throws IOException {
        while (this.g > this.c) {
            Iterator<b> it = this.i.values().iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (!next.f) {
                    break;
                }
            }
            return;
        }
        this.o = false;
    }
}
