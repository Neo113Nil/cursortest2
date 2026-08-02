package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: TsDurationReader.java */
/* loaded from: classes12.dex */
public final class rsp0 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final txo0 a = new txo0(0);
    public long f = C.TIME_UNSET;
    public long g = C.TIME_UNSET;
    public long h = C.TIME_UNSET;
    public final xi90 b = new xi90();

    public final void a(qgq qgqVar) {
        byte[] bArr = y2r0.b;
        xi90 xi90Var = this.b;
        xi90Var.getClass();
        xi90Var.N(bArr, bArr.length);
        this.c = true;
        qgqVar.resetPeekPosition();
    }
}
