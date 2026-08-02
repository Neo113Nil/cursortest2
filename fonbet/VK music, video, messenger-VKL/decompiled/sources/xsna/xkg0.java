package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* compiled from: RingFileWritable.kt */
/* loaded from: classes3.dex */
public final class xkg0 extends hbr {
    public final jcc f;
    public final ArrayList<c8r> g;
    public int h;
    public boolean i;
    public File j;

    public xkg0(m9r m9rVar, jcc jccVar) {
        super(m9rVar);
        this.f = jccVar;
        this.g = new ArrayList<>();
    }

    @Override // xsna.hbr
    public final boolean a() {
        return this.i;
    }

    @Override // xsna.hbr
    public final void b() {
        if (!this.i && this.g.isEmpty()) {
            this.i = true;
            ExecutorService executorService = this.e;
            if (executorService == null) {
                executorService = null;
            }
            executorService.execute(new nx3(this, 14));
        }
    }

    @Override // xsna.hbr
    public final void e(String str, boolean z) {
        if (z) {
            g(str);
            return;
        }
        ExecutorService executorService = this.e;
        if (executorService == null) {
            executorService = null;
        }
        executorService.execute(new xq8(6, this, str));
    }

    public final void f() {
        FileOutputStream fileOutputStream;
        ArrayList<c8r> arrayList = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.get(this.h).c.length() > r1.a) {
            int i = this.h + 1;
            this.h = i;
            int i2 = i % this.f.a;
            this.h = i2;
            c8r c8rVar = arrayList.get(i2);
            m9r m9rVar = c8rVar.b;
            File file = c8rVar.c;
            if (file.length() > 0) {
                m9rVar.getClass();
                m9r.f(file);
                FileOutputStream fileOutputStream2 = c8rVar.d;
                if (fileOutputStream2 != null) {
                    m9r.b(fileOutputStream2);
                }
                try {
                    fileOutputStream = new FileOutputStream(file, false);
                } catch (Throwable unused) {
                    fileOutputStream = null;
                }
                c8rVar.d = fileOutputStream;
            }
        }
    }

    public final void g(String str) {
        synchronized (this.b) {
            f();
            try {
                i();
                Iterator<c8r> it = this.g.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                m9r m9rVar = this.a;
                FileOutputStream fileOutputStream = this.g.get(this.h).d;
                m9rVar.getClass();
                if (fileOutputStream != null) {
                    fileOutputStream.write(str.getBytes(Charset.forName(C.UTF8_NAME)));
                }
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                }
            } catch (Throwable unused) {
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void h() {
        ArrayList<c8r> arrayList = this.g;
        if (arrayList.isEmpty()) {
            jcc jccVar = this.f;
            int i = jccVar.a;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                jar jarVar = this.d;
                jar jarVar2 = jarVar != null ? jarVar : null;
                if (jarVar == null) {
                    jarVar = null;
                }
                String str = "chunk." + jarVar.a + JwtParser.SEPARATOR_CHAR + i3 + ".log";
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jarVar2.b);
                String str2 = File.separator;
                sb2.append(str2);
                sb2.append(jarVar2.a);
                sb.append(sb2.toString());
                sb.append(str2);
                sb.append(str);
                String sb3 = sb.toString();
                int i4 = jccVar.b;
                c8r c8rVar = new c8r(sb3, i4, this.a);
                arrayList.add(c8rVar);
                File file = c8rVar.c;
                if (file.length() != 0 && file.length() <= i4) {
                    i2 = i3;
                }
            }
            this.h = i2;
        }
    }

    public final void i() {
        ArrayList<c8r> arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<c8r> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().c);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        File file = new File(i5s.a(new StringBuilder(), this.c, "-CHUNK_HEADER.log"));
        this.j = file;
        this.a.getClass();
        if (m9r.c(file)) {
            jar jarVar = this.d;
            if (jarVar == null) {
                jarVar = null;
            }
            m9r.a(jarVar.c.b(), file);
            arrayList3.add(file);
        }
    }

    @Override // xsna.hbr
    public final void c() {
    }
}
