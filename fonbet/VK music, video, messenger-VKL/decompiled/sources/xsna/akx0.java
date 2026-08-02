package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.a1n0;
import xsna.n3i0;

/* compiled from: WebvttExtractor.java */
/* loaded from: classes12.dex */
public final class akx0 implements pgq {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");

    @Nullable
    public final String a;
    public final txo0 b;
    public final a1n0.a d;
    public final boolean e;
    public rgq f;
    public int h;
    public final xi90 c = new xi90();
    public byte[] g = new byte[1024];

    public akx0(@Nullable String str, txo0 txo0Var, a1n0.a aVar, boolean z) {
        this.a = str;
        this.b = txo0Var;
        this.d = aVar;
        this.e = z;
    }

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        String q;
        this.f.getClass();
        int length = (int) qgqVar.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int read = qgqVar.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.h + read;
            this.h = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        xi90 xi90Var = new xi90(this.g);
        ckx0.d(xi90Var);
        String q2 = xi90Var.q(StandardCharsets.UTF_8);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(q2)) {
                while (true) {
                    String q3 = xi90Var.q(StandardCharsets.UTF_8);
                    if (q3 == null) {
                        break;
                    }
                    if (ckx0.a.matcher(q3).matches()) {
                        do {
                            q = xi90Var.q(StandardCharsets.UTF_8);
                            if (q != null) {
                            }
                        } while (!q.isEmpty());
                    } else {
                        Matcher matcher2 = zjx0.a.matcher(q3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    f(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c = ckx0.c(group);
                String str = y2r0.a;
                long b = this.b.b(y2r0.d0((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                rgp0 f = f(b - c);
                byte[] bArr3 = this.g;
                int i5 = this.h;
                xi90 xi90Var2 = this.c;
                xi90Var2.N(bArr3, i5);
                f.d(this.h, xi90Var2);
                f.a(b, 1, this.h, 0, null);
                return -1;
            }
            if (q2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(q2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(q2));
                }
                Matcher matcher4 = j.matcher(q2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(q2));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j3 = ckx0.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String str2 = y2r0.a;
                j2 = y2r0.d0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            q2 = xi90Var.q(StandardCharsets.UTF_8);
        }
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        tel telVar = (tel) qgqVar;
        telVar.peekFully(this.g, 0, 6, false);
        byte[] bArr = this.g;
        xi90 xi90Var = this.c;
        xi90Var.N(bArr, 6);
        if (ckx0.a(xi90Var)) {
            return true;
        }
        telVar.peekFully(this.g, 6, 3, false);
        xi90Var.N(this.g, 9);
        return ckx0.a(xi90Var);
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        if (this.e) {
            rgqVar = new e1n0(rgqVar, this.d);
        }
        this.f = rgqVar;
        rgqVar.f(new n3i0.b(C.TIME_UNSET));
    }

    public final rgp0 f(long j2) {
        rgp0 track = this.f.track(0, 3);
        a.C0043a c0043a = new a.C0043a();
        c0043a.m = io20.q(MimeTypes.TEXT_VTT);
        c0043a.d = this.a;
        c0043a.r = j2;
        zjh0.d(c0043a, track);
        this.f.endTracks();
        return track;
    }

    @Override // xsna.pgq
    public final void seek(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
