package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.nio.ByteBuffer;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aB;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bC$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;

/* compiled from: InitialPacket.java */
/* loaded from: classes8.dex */
public final class cly0 extends gly0 {
    public byte[] h;

    @Override // xsna.tly0
    public final bC$a d(bF bFVar, com.vk.movika.sdk.base.data.converter.c cVar) {
        bE bEVar = (bE) bFVar;
        byte[] bArr = this.h;
        if (bArr != null && bArr.length > 0) {
            return bC$a.b;
        }
        if (!this.a.equals(bEVar.a.a)) {
            kgy0 kgy0Var = this.a;
            if (!kgy0Var.equals(bEVar.a.a) && kgy0Var.equals(null) && bEVar.d == bF.g.a) {
                bEVar.d = bF.g.b;
                bEVar.a.a = kgy0Var;
                sby0 sby0Var = bEVar.e;
                sby0Var.d(sby0Var.i);
            }
        }
        jey0 jey0Var = bEVar.G;
        byte[] bArr2 = this.g;
        hby0 hby0Var = jey0Var.e;
        hby0Var.a.put(0, new gey0(0, bArr2, aB.b));
        hby0Var.b = bArr2;
        bEVar.k(this, cVar);
        bEVar.P = true;
        return bC$a.a;
    }

    @Override // xsna.tly0
    public final aF n() {
        return aF.a;
    }

    @Override // xsna.tly0
    public final aG o() {
        return aG.a;
    }

    @Override // xsna.gly0
    public final String toString() {
        String str = this.f ? "P" : "";
        char charAt = aF.a.name().charAt(0);
        long j = this.b;
        String valueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        Object valueOf2 = i >= 0 ? Integer.valueOf(i) : ".";
        int size = this.c.size();
        byte[] bArr = this.h;
        String b = bArr != null ? kq01.b(bArr) : "[]";
        String str2 = (String) this.c.stream().map(new uqk(2)).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(str);
        sb.append(charAt);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(valueOf);
        sb.append("|L|");
        sb.append(valueOf2);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(size);
        return h5s.d(sb, "  Token=", b, " ", str2);
    }

    @Override // xsna.gly0
    public final byte w() {
        if (this.a.b()) {
            return (byte) 1;
        }
        return (byte) 0;
    }

    @Override // xsna.gly0
    public final void x(ByteBuffer byteBuffer) {
        byte[] bArr = this.h;
        if (bArr == null) {
            byteBuffer.put((byte) 0);
        } else {
            alk.d(bArr.length, byteBuffer);
            byteBuffer.put(this.h);
        }
    }

    @Override // xsna.gly0
    public final int y() {
        byte[] bArr = this.h;
        if (bArr == null) {
            return 1;
        }
        return bArr.length + 1;
    }

    @Override // xsna.gly0
    public final void z(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bz {
        try {
            long l = alk.l(byteBuffer);
            if (l > 0) {
                if (l > byteBuffer.remaining()) {
                    throw new one.video.calls.sdk_private.bz();
                }
                byte[] bArr = new byte[(int) l];
                this.h = bArr;
                byteBuffer.get(bArr);
            }
        } catch (one.video.calls.sdk_private.bq unused) {
            throw new one.video.calls.sdk_private.bz();
        }
    }
}
