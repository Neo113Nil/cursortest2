package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aB;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bJ;

/* compiled from: NewConnectionIdFrame.java */
/* loaded from: classes8.dex */
public final class tgy0 extends ihy0 {
    public static final Random f = new Random();
    public int b;
    public int c;
    public byte[] d;
    public byte[] e;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.c) + alk.e(this.b) + 1 + 1 + this.d.length + 16;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 24);
        alk.d(this.b, byteBuffer);
        alk.d(this.c, byteBuffer);
        byteBuffer.put((byte) this.d.length);
        byteBuffer.put(this.d);
        byteBuffer.put(this.e);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        final jey0 u = bFVar.u();
        hby0 hby0Var = u.e;
        if (hby0Var == null) {
            u.c.accept(Integer.valueOf(ap$a.PROTOCOL_VIOLATION.n), "new connection id frame not allowed when using zero-length connection ID");
            return;
        }
        int i = this.c;
        int i2 = this.b;
        if (i > i2) {
            u.c.accept(Integer.valueOf(ap$a.FRAME_ENCODING_ERROR.n), "exceeding active connection id limit");
            return;
        }
        if (!hby0Var.a.containsKey(Integer.valueOf(i2))) {
            hby0 hby0Var2 = u.e;
            int i3 = this.b;
            byte[] bArr = this.d;
            byte[] bArr2 = this.e;
            if (i3 >= hby0Var2.e) {
                hby0Var2.a.put(Integer.valueOf(i3), new gey0(i3, bArr, aB.a, bArr2));
            } else {
                hby0Var2.a.put(Integer.valueOf(i3), new gey0(i3, bArr, aB.d, bArr2));
                int i4 = this.b;
                one.video.calls.sdk_private.x xVar = u.b;
                lhy0 lhy0Var = new lhy0();
                lhy0Var.b = i4;
                xVar.f(lhy0Var, aF.d, new hey0(u, 0));
            }
        } else if (!Arrays.equals(((gey0) u.e.a.get(Integer.valueOf(this.b))).b, this.d)) {
            u.c.accept(Integer.valueOf(ap$a.PROTOCOL_VIOLATION.n), "different cids or same sequence number");
            return;
        }
        final int i5 = this.c;
        if (i5 > 0) {
            final hby0 hby0Var3 = u.e;
            hby0Var3.e = i5;
            int asInt = hby0Var3.a.entrySet().stream().filter(new ti40(hby0Var3, 3)).mapToInt(new zay0()).findFirst().getAsInt();
            List list = (List) hby0Var3.a.entrySet().stream().filter(new Predicate() { // from class: xsna.cby0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Integer) ((Map.Entry) obj).getKey()).intValue() < i5;
                }
            }).filter(new ylu(1)).map(new dby0(0)).collect(Collectors.toList());
            list.forEach(new Consumer() { // from class: xsna.eby0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    hby0 hby0Var4 = hby0.this;
                    hby0Var4.getClass();
                    hby0Var4.a(((Integer) obj).intValue());
                }
            });
            if (((gey0) hby0Var3.a.get(Integer.valueOf(asInt))).c.equals(aB.d)) {
                gey0 gey0Var = (gey0) hby0Var3.a.values().stream().filter(new fby0()).findFirst().orElseThrow(new gby0());
                gey0Var.c = aB.b;
                hby0Var3.b = gey0Var.b;
            }
            list.forEach(new Consumer() { // from class: xsna.iey0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    jey0 jey0Var = jey0.this;
                    one.video.calls.sdk_private.x xVar2 = jey0Var.b;
                    int intValue = ((Integer) obj).intValue();
                    lhy0 lhy0Var2 = new lhy0();
                    lhy0Var2.b = intValue;
                    xVar2.f(lhy0Var2, aF.d, new hey0(jey0Var, 0));
                }
            });
        }
        if (u.e.b().size() > 2) {
            u.c.accept(Integer.valueOf(ap$a.CONNECTION_ID_LIMIT_ERROR.n), "exceeding active connection id limit");
        }
    }

    public final void i(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bq, bJ {
        byteBuffer.get();
        this.b = ihy0.d(byteBuffer);
        this.c = ihy0.d(byteBuffer);
        int i = byteBuffer.get();
        if (i <= 0 || i > 20) {
            throw new bJ(ap$a.FRAME_ENCODING_ERROR, "invalid connection id length");
        }
        byte[] bArr = new byte[i];
        this.d = bArr;
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[16];
        this.e = bArr2;
        byteBuffer.get(bArr2);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        return h5s.d(odj.a(i, i2, "NewConnectionIdFrame[", ",<", HiAnalyticsConstant.REPORT_VAL_SEPARATOR), kq01.b(this.d), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, kq01.b(this.e), X3.j.e);
    }
}
