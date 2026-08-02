package xsna;

import android.os.SystemClock;
import java.util.UUID;
import xsna.vok0;

/* compiled from: StallsReporterImpl.kt */
/* loaded from: classes5.dex */
public final class wok0 implements vok0 {
    public final String a;

    /* compiled from: StallsReporterImpl.kt */
    public static final class a implements vok0.a {
        public final long a;
        public final UUID b;
        public final long c;
        public final String d;

        public a(long j, UUID uuid, long j2, String str) {
            this.a = j;
            this.b = uuid;
            this.c = j2;
            this.d = str;
        }

        @Override // xsna.vok0.a
        public final void a(String str, String str2) {
            long uptimeMillis = SystemClock.uptimeMillis();
            s3w0 s3w0Var = new s3w0(this.d, true);
            Long valueOf = Long.valueOf(uptimeMillis - this.c);
            Long[] lArr = s3w0Var.j;
            lArr[0] = valueOf;
            lArr[1] = Long.valueOf(zno.e(this.a));
            String[] strArr = s3w0Var.i;
            strArr[1] = "CANCEL";
            strArr[2] = str;
            strArr[3] = this.b.toString();
            strArr[4] = str2;
            s3w0Var.q();
        }

        @Override // xsna.vok0.a
        public final void b(String str, String str2) {
            long uptimeMillis = SystemClock.uptimeMillis();
            s3w0 s3w0Var = new s3w0(this.d, true);
            Long valueOf = Long.valueOf(uptimeMillis - this.c);
            Long[] lArr = s3w0Var.j;
            lArr[0] = valueOf;
            lArr[1] = Long.valueOf(zno.e(this.a));
            String[] strArr = s3w0Var.i;
            strArr[1] = "STALL";
            strArr[2] = str;
            strArr[3] = this.b.toString();
            strArr[4] = str2;
            s3w0Var.q();
        }

        @Override // xsna.vok0.a
        public final long c() {
            return this.a;
        }
    }

    public wok0(String str) {
        this.a = str;
    }

    @Override // xsna.vok0
    public final void a(long j, UUID uuid, f0z f0zVar) {
        f0zVar.invoke(new a(j, uuid, SystemClock.uptimeMillis(), this.a));
    }
}
