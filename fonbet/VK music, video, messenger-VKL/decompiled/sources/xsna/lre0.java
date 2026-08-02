package xsna;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes.dex */
public final class lre0 implements j9r {
    public static final Charset c = Charset.forName(C.UTF8_NAME);
    public final File a;
    public jre0 b;

    /* compiled from: QueueFileLogStore.java */
    /* loaded from: classes13.dex */
    public static class a {
        public final byte[] a;
        public final int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public lre0(File file) {
        this.a = file;
    }

    @Override // xsna.j9r
    public final void a() {
        c();
        this.a.delete();
    }

    @Override // xsna.j9r
    public final void b(long j, String str) {
        f();
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.b.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.m() && this.b.s() > 65536) {
                this.b.p();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    @Override // xsna.j9r
    public final void c() {
        fng.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    @Override // xsna.j9r
    public final String d() {
        byte[] e = e();
        if (e != null) {
            return new String(e, c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    @Override // xsna.j9r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] e() {
        a aVar;
        if (this.a.exists()) {
            f();
            jre0 jre0Var = this.b;
            if (jre0Var != null) {
                int[] iArr = {0};
                byte[] bArr = new byte[jre0Var.s()];
                try {
                    this.b.h(new kre0(bArr, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                aVar = new a(bArr, iArr[0]);
                if (aVar != null) {
                    return null;
                }
                int i = aVar.b;
                byte[] bArr2 = new byte[i];
                System.arraycopy(aVar.a, 0, bArr2, 0, i);
                return bArr2;
            }
        }
        aVar = null;
        if (aVar != null) {
        }
    }

    public final void f() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new jre0(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }
}
