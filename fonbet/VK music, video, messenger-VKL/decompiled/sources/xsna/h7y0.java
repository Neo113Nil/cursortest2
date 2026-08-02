package xsna;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: Zstd.kt */
/* loaded from: classes3.dex */
public final class h7y0 {
    public volatile m7y0 a;

    /* compiled from: Zstd.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountDictDescriptor(link=");
            sb.append(this.a);
            sb.append(", version=");
            sb.append(this.b);
            sb.append(", hash=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: Zstd.kt */
    public static final class b {
        public final boolean a;
        public final ExecutorService b;
        public final ExecutorService c;
        public final ScheduledExecutorService d;
        public final File e;
        public final String f;
        public final p7y0 g;

        public b(boolean z, ExecutorService executorService, ExecutorService executorService2, ScheduledExecutorService scheduledExecutorService, File file, String str, p7y0 p7y0Var) {
            this.a = z;
            this.b = executorService;
            this.c = executorService2;
            this.d = scheduledExecutorService;
            this.e = file;
            this.f = str;
            this.g = p7y0Var;
        }
    }

    public h7y0(b bVar) {
        this.a = new c();
        if (bVar.a) {
            r7y0 r7y0Var = new r7y0(bVar.b, bVar.d, bVar.g);
            File file = bVar.e;
            ExecutorService executorService = bVar.c;
            s7y0 s7y0Var = new s7y0(file, bVar.f, r7y0Var, executorService);
            this.a = new o7y0(s7y0Var);
            executorService.execute(new qc9(s7y0Var, 14));
        }
    }

    public final m7y0 a() {
        return this.a;
    }

    /* compiled from: Zstd.kt */
    public static final class c implements m7y0 {
        @Override // xsna.m7y0
        public final eoi0 a() {
            return null;
        }

        @Override // xsna.m7y0
        public final boolean c() {
            return false;
        }

        @Override // xsna.m7y0
        public final void b(String str, String str2) throws IOException {
        }

        @Override // xsna.m7y0
        public final InputStream d(InputStream inputStream, String str, eoi0 eoi0Var, wzs<? super Throwable, ? super String, s3q0> wzsVar) {
            return inputStream;
        }
    }
}
