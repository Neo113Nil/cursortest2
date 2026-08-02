package xsna;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.bpm0;

/* compiled from: OpusReader.java */
/* loaded from: classes12.dex */
public final class eu80 extends bpm0 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(xi90 xi90Var, byte[] bArr) {
        if (xi90Var.a() < bArr.length) {
            return false;
        }
        int i = xi90Var.b;
        byte[] bArr2 = new byte[bArr.length];
        xi90Var.n(bArr2, 0, bArr.length);
        xi90Var.P(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // xsna.bpm0
    public final long b(xi90 xi90Var) {
        byte[] bArr = xi90Var.a;
        return (this.i * hr80.w(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // xsna.bpm0
    public final boolean c(xi90 xi90Var, long j, bpm0.a aVar) throws ParserException {
        if (e(xi90Var, o)) {
            byte[] copyOf = Arrays.copyOf(xi90Var.a, xi90Var.c);
            int i = copyOf[9] & 255;
            ArrayList o2 = hr80.o(copyOf);
            if (aVar.a == null) {
                a.C0043a c0043a = new a.C0043a();
                c0043a.l = io20.q("audio/ogg");
                c0043a.m = io20.q(MimeTypes.AUDIO_OPUS);
                c0043a.E = i;
                c0043a.F = 48000;
                c0043a.p = o2;
                aVar.a = new androidx.media3.common.a(c0043a);
                return true;
            }
        } else {
            if (!e(xi90Var, p)) {
                aVar.a.getClass();
                return false;
            }
            aVar.a.getClass();
            if (!this.n) {
                this.n = true;
                xi90Var.Q(8);
                fi20 a = j7x0.a(ImmutableList.n(j7x0.b(xi90Var, false, false).a));
                if (a != null) {
                    a.C0043a a2 = aVar.a.a();
                    a2.k = a.b(aVar.a.l);
                    aVar.a = new androidx.media3.common.a(a2);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // xsna.bpm0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
