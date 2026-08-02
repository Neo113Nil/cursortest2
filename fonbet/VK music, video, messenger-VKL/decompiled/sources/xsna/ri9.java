package xsna;

import com.vk.log.L;
import com.vk.media.render.RenderTexture;
import xsna.ci9;
import xsna.pes;
import xsna.rl9;
import xsna.xk9;

/* compiled from: CameraFrameReader.java */
/* loaded from: classes3.dex */
public final class ri9 implements rl9.c, xk9.a {
    public final Object b = new Object();
    public final pes.b c;
    public final RenderTexture d;
    public xk9.c e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public ri9(RenderTexture renderTexture) {
        pes.b bVar = new pes.b();
        this.c = bVar;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.d = renderTexture;
        bVar.a.g = false;
    }

    @Override // xsna.rl9.c
    public final void n(int i, int i2, int i3, byte[] bArr) {
        boolean z;
        if (bArr == null || !this.h) {
            return;
        }
        synchronized (this.b) {
            try {
                this.c.a.h(i, i2);
                RenderTexture.b bVar = this.d.c;
                long timestamp = bVar != null ? bVar.getTimestamp() : 0L;
                if (timestamp == 0) {
                    timestamp = System.nanoTime();
                }
                pes pesVar = this.c.a;
                boolean z2 = true;
                pesVar.h = true;
                pesVar.e = timestamp;
                if (i3 == 270) {
                    pesVar.g(tni.n(bArr, i, i2, this.i));
                    pes pesVar2 = this.c.a;
                    pesVar2.a = i2;
                    pesVar2.b = i;
                    z = true;
                } else if (i3 == 90) {
                    boolean z3 = this.i;
                    int i4 = i * i2;
                    int i5 = (i4 * 3) / 2;
                    byte[] bArr2 = new byte[i5];
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < i) {
                        boolean z4 = z2;
                        for (int i8 = i2 - 1; -1 < i8; i8--) {
                            bArr2[i7] = bArr[(i8 * i) + i6];
                            i7++;
                        }
                        i6++;
                        z2 = z4;
                    }
                    z = z2;
                    int i9 = i5 - 1;
                    for (int i10 = i - 1; i10 > 0; i10 -= 2) {
                        int i11 = i2 / 2;
                        for (int i12 = 0; i12 < i11; i12++) {
                            int i13 = (i12 * i) + i4;
                            bArr2[i9] = bArr[i13 + i10];
                            bArr2[i9 - 1] = bArr[(i10 - 1) + i13];
                            i9 -= 2;
                        }
                    }
                    if (z3) {
                        bArr2 = tni.h(i2, i, bArr2);
                    }
                    pesVar.g(bArr2);
                    pes pesVar3 = this.c.a;
                    pesVar3.a = i2;
                    pesVar3.b = i;
                } else {
                    z = true;
                    if (i3 == 180) {
                        boolean z5 = this.i;
                        int i14 = i * i2;
                        int i15 = (i14 * 3) / 2;
                        byte[] bArr3 = new byte[i15];
                        int i16 = 0;
                        for (int i17 = i14 - 1; i17 >= 0; i17--) {
                            bArr3[i16] = bArr[i17];
                            i16++;
                        }
                        for (int i18 = i15 - 1; i18 >= i14; i18 -= 2) {
                            int i19 = i16 + 1;
                            bArr3[i16] = bArr[i18 - 1];
                            i16 += 2;
                            bArr3[i19] = bArr[i18];
                        }
                        if (z5) {
                            bArr3 = tni.h(i, i2, bArr3);
                        }
                        pesVar.g(bArr3);
                        pes pesVar4 = this.c.a;
                        pesVar4.a = i;
                        pesVar4.b = i2;
                    } else {
                        pesVar.a = i;
                        pesVar.b = i2;
                    }
                }
                this.c.a.getClass();
                if (!this.g && this.f) {
                    this.g = z;
                    L.e("processing: first processed frame format=" + i + "x" + i2 + " -> " + i + "x" + i2 + " ts=" + timestamp);
                }
                xk9.c cVar = this.e;
                if (cVar != null) {
                    pes.b bVar2 = this.c;
                    ci9.a aVar = (ci9.a) cVar;
                    synchronized (aVar.a) {
                        aVar.d = true;
                        pes.b bVar3 = aVar.b;
                        pes pesVar5 = bVar3.a;
                        bVar3.a = bVar2.a;
                        bVar2.a = pesVar5;
                    }
                }
            } finally {
            }
        }
    }
}
