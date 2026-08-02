package xsna;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.r9v;

/* compiled from: HlsSampleStream.java */
/* loaded from: classes12.dex */
public final class q9v implements m0h0 {
    public final int b;
    public final r9v c;
    public int d = -1;

    public q9v(r9v r9vVar, int i) {
        this.c = r9vVar;
        this.b = i;
    }

    public final void a() {
        fxc0.p(this.d == -1);
        r9v r9vVar = this.c;
        r9vVar.l();
        r9vVar.L.getClass();
        int[] iArr = r9vVar.L;
        int i = this.b;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (r9vVar.K.contains(r9vVar.J.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = r9vVar.O;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.d = i2;
    }

    @Override // xsna.m0h0
    public final int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
        androidx.media3.common.a aVar;
        if (this.d == -3) {
            decoderInputBuffer.a(4);
            return -4;
        }
        if (c()) {
            int i2 = this.d;
            r9v r9vVar = this.c;
            ArrayList<h9v> arrayList = r9vVar.o;
            if (!r9vVar.t()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = arrayList.get(i4).k;
                        int length = r9vVar.w.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (r9vVar.O[i6] && r9vVar.w[i6].B() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    y2r0.a0(arrayList, 0, i4);
                    h9v h9vVar = arrayList.get(0);
                    androidx.media3.common.a aVar2 = h9vVar.d;
                    if (!aVar2.equals(r9vVar.H)) {
                        r9vVar.l.b(r9vVar.c, aVar2, h9vVar.e, h9vVar.f, h9vVar.g);
                    }
                    r9vVar.H = aVar2;
                }
                if (arrayList.isEmpty() || arrayList.get(0).g()) {
                    int C = r9vVar.w[i2].C(w8sVar, decoderInputBuffer, i, r9vVar.U);
                    if (C == -5) {
                        androidx.media3.common.a aVar3 = w8sVar.b;
                        aVar3.getClass();
                        if (i2 == r9vVar.C) {
                            int s = ipx.s(r9vVar.w[i2].B());
                            while (i3 < arrayList.size() && arrayList.get(i3).k != s) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                aVar = arrayList.get(i3).d;
                            } else {
                                aVar = r9vVar.G;
                                aVar.getClass();
                            }
                            aVar3 = aVar3.e(aVar);
                        }
                        w8sVar.b = aVar3;
                    }
                    return C;
                }
            }
        }
        return -3;
    }

    public final boolean c() {
        int i = this.d;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // xsna.m0h0
    public final boolean isReady() {
        if (this.d == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i = this.d;
        r9v r9vVar = this.c;
        return !r9vVar.t() && r9vVar.w[i].x(r9vVar.U);
    }

    @Override // xsna.m0h0
    public final void maybeThrowError() throws IOException {
        int i = this.d;
        r9v r9vVar = this.c;
        if (i == -2) {
            r9vVar.l();
            throw new SampleQueueMappingException(zr.a("Unable to bind a sample queue to TrackGroup with MIME type ", r9vVar.J.a(this.b).d[0].n, "."));
        }
        if (i == -1) {
            r9vVar.v();
        } else if (i != -3) {
            r9vVar.v();
            r9vVar.w[i].z();
        }
    }

    @Override // xsna.m0h0
    public final int skipData(long j) {
        h9v next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i = this.d;
        r9v r9vVar = this.c;
        if (r9vVar.t()) {
            return 0;
        }
        r9v.b bVar = r9vVar.w[i];
        int v = bVar.v(j, r9vVar.U);
        ArrayList<h9v> arrayList = r9vVar.o;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = xy9.b(1, arrayList);
            }
            obj = null;
        } else {
            Iterator<h9v> it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        h9v h9vVar = (h9v) obj;
        if (h9vVar != null && !h9vVar.g()) {
            v = Math.min(v, h9vVar.f(i) - bVar.t());
        }
        bVar.G(v);
        return v;
    }
}
