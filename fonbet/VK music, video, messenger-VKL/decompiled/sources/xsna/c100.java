package xsna;

import com.ironsource.X3;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: LogcatFileWritable.kt */
/* loaded from: classes3.dex */
public final class c100 extends hbr {
    public final e100 f;
    public final Object g;
    public final StringBuilder h;
    public final StringBuilder i;
    public final vq3 j;
    public File k;
    public File l;
    public boolean m;

    public c100(m9r m9rVar, e100 e100Var) {
        super(m9rVar);
        this.f = e100Var;
        this.g = new Object();
        int i = e100Var.c;
        this.h = new StringBuilder(i);
        this.i = new StringBuilder(i);
        this.j = new vq3(this, 6);
    }

    public static File g(String str, String str2) {
        return new File(new File(str + '-' + str2 + ".log").toURI());
    }

    @Override // xsna.hbr
    public final boolean a() {
        return false;
    }

    @Override // xsna.hbr
    public final void b() {
        this.k = g(this.c, X3.i.Z);
        this.l = g(this.c, "system");
        if (this.m) {
            return;
        }
        this.m = true;
        ExecutorService executorService = this.e;
        if (executorService == null) {
            executorService = null;
        }
        executorService.execute(new ep0(this, 6));
    }

    @Override // xsna.hbr
    public final void c() {
        if (this.m) {
            synchronized (this.g) {
                if (this.m) {
                    this.m = false;
                    this.g.notify();
                }
                try {
                    ExecutorService executorService = this.e;
                    if (executorService == null) {
                        executorService = null;
                    }
                    if (!executorService.isTerminated()) {
                        ExecutorService executorService2 = this.e;
                        (executorService2 != null ? executorService2 : null).awaitTermination(500L, TimeUnit.MILLISECONDS);
                    }
                } catch (Exception unused) {
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final boolean f(File file, StringBuilder sb, String str) {
        long length = file.length();
        e100 e100Var = this.f;
        boolean z = length < ((long) e100Var.d);
        if (z) {
            StringBuilder sb2 = sb == null ? new StringBuilder() : sb;
            sb2.append("\n");
            h(sb2, new String[]{"logcat", "-t", String.valueOf(e100Var.b), "-b", str, "-v", "time", "brief"});
            this.a.getClass();
            m9r.a(sb, file);
        }
        return z;
    }

    public final void h(StringBuilder sb, String[] strArr) {
        BufferedReader bufferedReader;
        m9r m9rVar = this.a;
        if (strArr.length == 0) {
            return;
        }
        Process process = null;
        try {
            Process start = new ProcessBuilder(new String[0]).command((String[]) Arrays.copyOf(strArr, strArr.length)).redirectErrorStream(true).start();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()), this.f.c);
                try {
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        sb.append(readLine);
                        sb.append("\n");
                    }
                    start.destroy();
                } catch (Exception unused) {
                    process = start;
                    if (process != null) {
                        process.destroy();
                    }
                    m9rVar.getClass();
                    m9r.b(bufferedReader);
                } catch (Throwable th) {
                    th = th;
                    process = start;
                    if (process != null) {
                        process.destroy();
                    }
                    m9rVar.getClass();
                    m9r.b(bufferedReader);
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Exception unused3) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        m9rVar.getClass();
        m9r.b(bufferedReader);
    }

    @Override // xsna.hbr
    public final void e(String str, boolean z) {
    }
}
