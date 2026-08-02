package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class hcs0 implements ih3, e8b1 {
    public long a;
    public final int b;
    public final int c;
    public final Object w;
    public final Serializable x;
    public Object y;

    public hcs0(m34 m34Var) {
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.b = m34Var.a();
        this.c = m34Var.b;
    }

    public void a() {
        d6z.y("AudioStream has been released.", !((AtomicBoolean) this.x).get());
    }

    @Override // defpackage.ih3
    public p34 read(ByteBuffer byteBuffer) {
        a();
        d6z.y("AudioStream has not been started.", ((AtomicBoolean) this.w).get());
        long remaining = byteBuffer.remaining();
        int i = this.b;
        long d = m1b1.d(i, remaining);
        long j = i;
        d6z.m("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * d);
        if (i2 <= 0) {
            return new p34(0, this.a);
        }
        long a = this.a + m1b1.a(this.c, d);
        long nanoTime = a - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(nanoTime / 1000000);
            } catch (InterruptedException unused) {
                sgb1.g(5, "SilentAudioStream");
            }
        }
        d6z.y(null, i2 <= byteBuffer.remaining());
        byte[] bArr = (byte[]) this.y;
        if (bArr == null || bArr.length < i2) {
            this.y = new byte[i2];
        }
        int position = byteBuffer.position();
        byteBuffer.put((byte[]) this.y, 0, i2).limit(position + i2).position(position);
        p34 p34Var = new p34(i2, this.a);
        this.a = a;
        return p34Var;
    }

    @Override // defpackage.e8b1
    public o3 zza() {
        j3a1 j3a1Var = (j3a1) this.w;
        long j = this.a;
        zzks zzksVar = (zzks) this.x;
        xzv xzvVar = (xzv) this.y;
        dua1 dua1Var = new dua1();
        koa1 koa1Var = new koa1();
        koa1Var.a = Long.valueOf(j & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        koa1Var.b = zzksVar;
        koa1Var.c = Boolean.valueOf(j3a1.j.get());
        Boolean bool = Boolean.TRUE;
        koa1Var.d = bool;
        koa1Var.e = bool;
        dua1Var.a = new uoa1(koa1Var);
        dua1Var.c = aga1.a(j3a1Var.d);
        dua1Var.d = Integer.valueOf(this.b & Integer.MAX_VALUE);
        dua1Var.e = Integer.valueOf(this.c & Integer.MAX_VALUE);
        j3a1.k.getClass();
        int i = xzvVar.g;
        int j2 = dab1.j(xzvVar);
        kna1 kna1Var = new kna1();
        kna1Var.a = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21 : zzkf.NV16 : zzkf.YV12 : zzkf.YUV_420_888 : zzkf.BITMAP;
        kna1Var.b = Integer.valueOf(j2 & Integer.MAX_VALUE);
        dua1Var.b = new yna1(kna1Var);
        nua1 nua1Var = new nua1(dua1Var);
        rqa1 rqa1Var = new rqa1();
        rqa1Var.c = j3a1Var.h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
        rqa1Var.d = nua1Var;
        return new o3(rqa1Var, 0);
    }

    public /* synthetic */ hcs0(j3a1 j3a1Var, long j, zzks zzksVar, int i, int i2, xzv xzvVar) {
        this.w = j3a1Var;
        this.a = j;
        this.x = zzksVar;
        this.b = i;
        this.c = i2;
        this.y = xzvVar;
    }
}
