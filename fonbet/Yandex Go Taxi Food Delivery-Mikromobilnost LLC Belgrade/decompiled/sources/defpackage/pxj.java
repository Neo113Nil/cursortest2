package defpackage;

import java.io.File;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class pxj {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public mxj f;
    public final /* synthetic */ eyj g;

    public pxj(eyj eyjVar, String str) {
        this.g = eyjVar;
        this.a = str;
        int i = eyjVar.z;
        File file = eyjVar.a;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.c[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public static /* synthetic */ void c(pxj pxjVar, long j) {
    }

    public static void h(pxj pxjVar, String[] strArr) {
        if (strArr.length != pxjVar.g.z) {
            w511.r(Arrays.toString(strArr), "unexpected journal line: ");
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            try {
                pxjVar.b[i] = Long.parseLong(strArr[i]);
            } catch (NumberFormatException unused) {
                w511.r(Arrays.toString(strArr), "unexpected journal line: ");
                return;
            }
        }
    }

    public final File i(int i) {
        return this.c[i];
    }

    public final File j(int i) {
        return this.d[i];
    }

    public final String k() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(HexString.CHAR_SPACE);
            sb.append(j);
        }
        return sb.toString();
    }
}
