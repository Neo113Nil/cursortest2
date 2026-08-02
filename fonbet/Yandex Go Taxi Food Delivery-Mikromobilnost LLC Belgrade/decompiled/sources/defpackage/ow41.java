package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class ow41 implements b5p {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final sez0 b;
    public final o2v0 d;
    public final boolean e;
    public d5p f;
    public int h;
    public final ef90 c = new ef90();
    public byte[] g = new byte[1024];

    public ow41(String str, sez0 sez0Var, o2v0 o2v0Var, boolean z) {
        this.a = str;
        this.b = sez0Var;
        this.d = o2v0Var;
        this.e = z;
    }

    @Override // defpackage.b5p
    public final void a(long j2, long j3) {
        throw new IllegalStateException();
    }

    public final g001 b(long j2) {
        g001 B = this.f.B(0, 3);
        f7s f7sVar = new f7s();
        f7sVar.m = eh20.q("text/vtt");
        f7sVar.d = this.a;
        f7sVar.r = j2;
        smw0.u(f7sVar, B);
        this.f.A();
        return B;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        if (this.e) {
            d5pVar = new kzo(d5pVar, this.d);
        }
        this.f = d5pVar;
        d5pVar.w(new qb4(-9223372036854775807L));
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        String l;
        this.f.getClass();
        int length = (int) c5pVar.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int read = c5pVar.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.h + read;
            this.h = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        ef90 ef90Var = new ef90(this.g);
        qw41.d(ef90Var);
        String l2 = ef90Var.l(StandardCharsets.UTF_8);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(l2)) {
                while (true) {
                    String l3 = ef90Var.l(StandardCharsets.UTF_8);
                    if (l3 == null) {
                        break;
                    }
                    if (qw41.a.matcher(l3).matches()) {
                        do {
                            l = ef90Var.l(StandardCharsets.UTF_8);
                            if (l != null) {
                            }
                        } while (!l.isEmpty());
                    } else {
                        Matcher matcher2 = nw41.a.matcher(l3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c = qw41.c(group);
                int i5 = tw21.a;
                long b = this.b.b(tw21.e0((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                g001 b2 = b(b - c);
                byte[] bArr3 = this.g;
                int i6 = this.h;
                ef90 ef90Var2 = this.c;
                ef90Var2.I(i6, bArr3);
                b2.a(ef90Var2, this.h, 0);
                b2.c(b, 1, this.h, 0, null);
                return -1;
            }
            if (l2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(l2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(l2));
                }
                Matcher matcher4 = j.matcher(l2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(l2));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j3 = qw41.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                int i7 = tw21.a;
                j2 = tw21.e0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            l2 = ef90Var.l(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        kbh kbhVar = (kbh) c5pVar;
        kbhVar.H(this.g, 0, 6, false);
        byte[] bArr = this.g;
        ef90 ef90Var = this.c;
        ef90Var.I(6, bArr);
        if (qw41.a(ef90Var)) {
            return true;
        }
        kbhVar.H(this.g, 6, 3, false);
        ef90Var.I(9, this.g);
        return qw41.a(ef90Var);
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
