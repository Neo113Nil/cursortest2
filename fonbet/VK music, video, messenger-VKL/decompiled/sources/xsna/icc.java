package xsna;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.dash.e;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.kcc;

/* compiled from: ChunkSampleStream.java */
/* loaded from: classes12.dex */
public final class icc<T extends kcc> implements m0h0, androidx.media3.exoplayer.source.q, Loader.a<ccc>, Loader.e {
    public final int b;
    public final int[] c;
    public final androidx.media3.common.a[] d;
    public final boolean[] e;
    public final T f;
    public final androidx.media3.exoplayer.dash.c g;
    public final j.a h;
    public final androidx.media3.exoplayer.upstream.b i;
    public final Loader j;
    public final ecc k;
    public final ArrayList<rg6> l;
    public final List<rg6> m;
    public final androidx.media3.exoplayer.source.p n;
    public final androidx.media3.exoplayer.source.p[] o;
    public final tg6 p;

    @Nullable
    public ccc q;
    public androidx.media3.common.a r;

    @Nullable
    public b<T> s;
    public long t;
    public long u;
    public int v;

    @Nullable
    public rg6 w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: ChunkSampleStream.java */
    public interface b<T extends kcc> {
    }

    public icc(int i, @Nullable int[] iArr, @Nullable androidx.media3.common.a[] aVarArr, androidx.media3.exoplayer.dash.b bVar, androidx.media3.exoplayer.dash.c cVar, xu1 xu1Var, long j, androidx.media3.exoplayer.drm.b bVar2, a.C0054a c0054a, androidx.media3.exoplayer.upstream.b bVar3, j.a aVar, boolean z, @Nullable gtf0 gtf0Var) {
        this.b = i;
        this.c = iArr;
        this.d = aVarArr;
        this.f = bVar;
        this.g = cVar;
        this.h = aVar;
        this.i = bVar3;
        this.x = z;
        this.j = gtf0Var != null ? new Loader(gtf0Var) : new Loader("ChunkSampleStream");
        this.k = new ecc();
        ArrayList<rg6> arrayList = new ArrayList<>();
        this.l = arrayList;
        this.m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.o = new androidx.media3.exoplayer.source.p[length];
        this.e = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        androidx.media3.exoplayer.source.p[] pVarArr = new androidx.media3.exoplayer.source.p[i2];
        bVar2.getClass();
        androidx.media3.exoplayer.source.p pVar = new androidx.media3.exoplayer.source.p(xu1Var, bVar2, c0054a);
        this.n = pVar;
        int i3 = 0;
        iArr2[0] = i;
        pVarArr[0] = pVar;
        while (i3 < length) {
            androidx.media3.exoplayer.source.p pVar2 = new androidx.media3.exoplayer.source.p(xu1Var, null, null);
            this.o[i3] = pVar2;
            int i4 = i3 + 1;
            pVarArr[i4] = pVar2;
            iArr2[i4] = this.c[i3];
            i3 = i4;
        }
        this.p = new tg6(iArr2, pVarArr);
        this.t = j;
        this.u = j;
    }

    @Override // xsna.m0h0
    public final int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if (n()) {
            return -3;
        }
        rg6 rg6Var = this.w;
        androidx.media3.exoplayer.source.p pVar = this.n;
        if (rg6Var != null && rg6Var.d(0) <= pVar.t()) {
            return -3;
        }
        o();
        return pVar.C(w8sVar, decoderInputBuffer, i, this.z);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void d(ccc cccVar, long j, long j2) {
        ccc cccVar2 = cccVar;
        this.q = null;
        this.f.e(cccVar2);
        long j3 = cccVar2.a;
        evk evkVar = cccVar2.b;
        vyk0 vyk0Var = cccVar2.i;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        this.i.getClass();
        this.h.f(bpzVar, cccVar2.c, this.b, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h);
        this.g.d(this);
    }

    public final rg6 f(int i) {
        ArrayList<rg6> arrayList = this.l;
        rg6 rg6Var = arrayList.get(i);
        y2r0.a0(arrayList, i, arrayList.size());
        this.v = Math.max(this.v, arrayList.size());
        int i2 = 0;
        this.n.n(rg6Var.d(0));
        while (true) {
            androidx.media3.exoplayer.source.p[] pVarArr = this.o;
            if (i2 >= pVarArr.length) {
                return rg6Var;
            }
            androidx.media3.exoplayer.source.p pVar = pVarArr[i2];
            i2++;
            pVar.n(rg6Var.d(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    @Override // androidx.media3.exoplayer.upstream.Loader.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Loader.b g(ccc cccVar, long j, long j2, IOException iOException, int i) {
        Loader.b bVar;
        boolean a2;
        ccc cccVar2 = cccVar;
        long j3 = cccVar2.i.b;
        boolean z = cccVar2 instanceof rg6;
        ArrayList<rg6> arrayList = this.l;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && m(size)) ? false : true;
        evk evkVar = cccVar2.b;
        vyk0 vyk0Var = cccVar2.i;
        boolean z3 = z2;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, j3);
        y2r0.j0(cccVar2.g);
        y2r0.j0(cccVar2.h);
        b.c cVar = new b.c(iOException, i);
        T t = this.f;
        androidx.media3.exoplayer.upstream.b bVar2 = this.i;
        if (t.b(cccVar2, z3, cVar, bVar2)) {
            if (z3) {
                if (z) {
                    fxc0.z(f(size) == cccVar2);
                    if (arrayList.isEmpty()) {
                        this.t = this.u;
                    }
                }
                bVar = Loader.e;
                if (bVar == null) {
                    long b2 = bVar2.b(cVar);
                    bVar = b2 != C.TIME_UNSET ? new Loader.b(0, b2) : Loader.f;
                }
                a2 = bVar.a();
                this.h.g(bpzVar, cccVar2.c, this.b, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h, iOException, !a2);
                if (!a2) {
                    this.q = null;
                    bVar2.getClass();
                    this.g.d(this);
                }
                return bVar;
            }
            ahn.F("Ignoring attempt to cancel non-cancelable load.");
        }
        bVar = null;
        if (bVar == null) {
        }
        a2 = bVar.a();
        this.h.g(bpzVar, cccVar2.c, this.b, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h, iOException, !a2);
        if (!a2) {
        }
        return bVar;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        if (this.z) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.t;
        }
        long j = this.u;
        rg6 l = l();
        if (!l.c()) {
            ArrayList<rg6> arrayList = this.l;
            l = arrayList.size() > 1 ? (rg6) xy9.b(2, arrayList) : null;
        }
        if (l != null) {
            j = Math.max(j, l.h);
        }
        return Math.max(j, this.n.q());
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        if (n()) {
            return this.t;
        }
        if (this.z) {
            return Long.MIN_VALUE;
        }
        return l().h;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void i(ccc cccVar, long j, long j2, int i) {
        bpz bpzVar;
        ccc cccVar2 = cccVar;
        if (i == 0) {
            long j3 = cccVar2.a;
            bpzVar = new bpz(j, cccVar2.b);
        } else {
            long j4 = cccVar2.a;
            evk evkVar = cccVar2.b;
            vyk0 vyk0Var = cccVar2.i;
            bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        }
        this.h.j(bpzVar, cccVar2.c, this.b, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h, i);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.j.c();
    }

    @Override // xsna.m0h0
    public final boolean isReady() {
        return !n() && this.n.x(this.z);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void j(ccc cccVar, long j, long j2, boolean z) {
        ccc cccVar2 = cccVar;
        this.q = null;
        this.w = null;
        long j3 = cccVar2.a;
        evk evkVar = cccVar2.b;
        vyk0 vyk0Var = cccVar2.i;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        this.i.getClass();
        this.h.d(bpzVar, cccVar2.c, this.b, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h);
        if (z) {
            return;
        }
        if (n()) {
            this.n.D(false);
            for (androidx.media3.exoplayer.source.p pVar : this.o) {
                pVar.D(false);
            }
        } else if (cccVar2 instanceof rg6) {
            ArrayList<rg6> arrayList = this.l;
            f(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.t = this.u;
            }
        }
        this.g.d(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        long j;
        List<rg6> list;
        if (!this.z) {
            Loader loader = this.j;
            if (!loader.c() && !loader.b()) {
                boolean n = n();
                if (n) {
                    list = Collections.EMPTY_LIST;
                    j = this.t;
                } else {
                    j = l().h;
                    list = this.m;
                }
                this.f.g(fVar, j, list, this.k);
                ecc eccVar = this.k;
                boolean z = eccVar.b;
                ccc cccVar = eccVar.a;
                eccVar.a = null;
                eccVar.b = false;
                if (z) {
                    this.t = C.TIME_UNSET;
                    this.z = true;
                    return true;
                }
                if (cccVar != null) {
                    this.q = cccVar;
                    boolean z2 = cccVar instanceof rg6;
                    tg6 tg6Var = this.p;
                    if (z2) {
                        rg6 rg6Var = (rg6) cccVar;
                        if (n) {
                            long j2 = rg6Var.g;
                            long j3 = this.t;
                            if (j2 < j3) {
                                this.n.t = j3;
                                for (androidx.media3.exoplayer.source.p pVar : this.o) {
                                    pVar.t = this.t;
                                }
                                if (this.x) {
                                    androidx.media3.common.a aVar = rg6Var.d;
                                    this.y = !io20.a(aVar.n, aVar.k);
                                }
                            }
                            this.x = false;
                            this.t = C.TIME_UNSET;
                        }
                        rg6Var.m = tg6Var;
                        androidx.media3.exoplayer.source.p[] pVarArr = tg6Var.b;
                        int[] iArr = new int[pVarArr.length];
                        for (int i = 0; i < pVarArr.length; i++) {
                            androidx.media3.exoplayer.source.p pVar2 = pVarArr[i];
                            iArr[i] = pVar2.q + pVar2.p;
                        }
                        rg6Var.n = iArr;
                        this.l.add(rg6Var);
                    } else if (cccVar instanceof izw) {
                        ((izw) cccVar).k = tg6Var;
                    }
                    loader.e(cccVar, this, this.i.c(cccVar.c));
                    return true;
                }
            }
        }
        return false;
    }

    public final rg6 l() {
        return (rg6) xy9.b(1, this.l);
    }

    public final boolean m(int i) {
        int t;
        rg6 rg6Var = this.l.get(i);
        if (this.n.t() > rg6Var.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            androidx.media3.exoplayer.source.p[] pVarArr = this.o;
            if (i2 >= pVarArr.length) {
                return false;
            }
            t = pVarArr[i2].t();
            i2++;
        } while (t <= rg6Var.d(i2));
        return true;
    }

    @Override // xsna.m0h0
    public final void maybeThrowError() throws IOException {
        Loader loader = this.j;
        loader.maybeThrowError();
        this.n.z();
        if (loader.c()) {
            return;
        }
        this.f.maybeThrowError();
    }

    public final boolean n() {
        return this.t != C.TIME_UNSET;
    }

    public final void o() {
        int p = p(this.n.t(), this.v - 1);
        while (true) {
            int i = this.v;
            if (i > p) {
                return;
            }
            this.v = i + 1;
            rg6 rg6Var = this.l.get(i);
            androidx.media3.common.a aVar = rg6Var.d;
            if (!aVar.equals(this.r)) {
                this.h.b(this.b, aVar, rg6Var.e, rg6Var.f, rg6Var.g);
            }
            this.r = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void onLoaderReleased() {
        androidx.media3.exoplayer.source.p pVar = this.n;
        pVar.D(true);
        DrmSession drmSession = pVar.h;
        if (drmSession != null) {
            drmSession.b(pVar.e);
            pVar.h = null;
            pVar.g = null;
        }
        for (androidx.media3.exoplayer.source.p pVar2 : this.o) {
            pVar2.D(true);
            DrmSession drmSession2 = pVar2.h;
            if (drmSession2 != null) {
                drmSession2.b(pVar2.e);
                pVar2.h = null;
                pVar2.g = null;
            }
        }
        this.f.release();
        b<T> bVar = this.s;
        if (bVar != null) {
            androidx.media3.exoplayer.dash.c cVar = (androidx.media3.exoplayer.dash.c) bVar;
            synchronized (cVar) {
                e.c remove = cVar.o.remove(this);
                if (remove != null) {
                    androidx.media3.exoplayer.source.p pVar3 = remove.a;
                    pVar3.D(true);
                    DrmSession drmSession3 = pVar3.h;
                    if (drmSession3 != null) {
                        drmSession3.b(pVar3.e);
                        pVar3.h = null;
                        pVar3.g = null;
                    }
                }
            }
        }
    }

    public final int p(int i, int i2) {
        ArrayList<rg6> arrayList;
        do {
            i2++;
            arrayList = this.l;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (arrayList.get(i2).d(0) <= i);
        return i2 - 1;
    }

    public final void q(@Nullable androidx.media3.exoplayer.dash.c cVar) {
        this.s = cVar;
        androidx.media3.exoplayer.source.p pVar = this.n;
        pVar.k();
        DrmSession drmSession = pVar.h;
        if (drmSession != null) {
            drmSession.b(pVar.e);
            pVar.h = null;
            pVar.g = null;
        }
        for (androidx.media3.exoplayer.source.p pVar2 : this.o) {
            pVar2.k();
            DrmSession drmSession2 = pVar2.h;
            if (drmSession2 != null) {
                drmSession2.b(pVar2.e);
                pVar2.h = null;
                pVar2.g = null;
            }
        }
        this.j.d(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        Loader loader = this.j;
        if (loader.b() || n()) {
            return;
        }
        boolean c = loader.c();
        List<rg6> list = this.m;
        T t = this.f;
        ArrayList<rg6> arrayList = this.l;
        if (c) {
            ccc cccVar = this.q;
            cccVar.getClass();
            boolean z = cccVar instanceof rg6;
            if (!(z && m(arrayList.size() - 1)) && t.c(j, cccVar, list)) {
                loader.a();
                if (z) {
                    this.w = (rg6) cccVar;
                    return;
                }
                return;
            }
            return;
        }
        int preferredQueueSize = t.getPreferredQueueSize(j, list);
        if (preferredQueueSize < arrayList.size()) {
            fxc0.z(!loader.c());
            int size = arrayList.size();
            while (true) {
                if (preferredQueueSize >= size) {
                    preferredQueueSize = -1;
                    break;
                } else if (!m(preferredQueueSize)) {
                    break;
                } else {
                    preferredQueueSize++;
                }
            }
            if (preferredQueueSize == -1) {
                return;
            }
            long j2 = l().h;
            rg6 f = f(preferredQueueSize);
            if (arrayList.isEmpty()) {
                this.t = this.u;
            }
            this.z = false;
            this.h.k(this.b, f.g, j2);
        }
    }

    @Override // xsna.m0h0
    public final int skipData(long j) {
        if (n()) {
            return 0;
        }
        boolean z = this.z;
        androidx.media3.exoplayer.source.p pVar = this.n;
        int v = pVar.v(j, z);
        rg6 rg6Var = this.w;
        if (rg6Var != null) {
            v = Math.min(v, rg6Var.d(0) - pVar.t());
        }
        pVar.G(v);
        o();
        return v;
    }

    /* compiled from: ChunkSampleStream.java */
    public final class a implements m0h0 {
        public final icc<T> b;
        public final androidx.media3.exoplayer.source.p c;
        public final int d;
        public boolean e;

        public a(icc<T> iccVar, androidx.media3.exoplayer.source.p pVar, int i) {
            this.b = iccVar;
            this.c = pVar;
            this.d = i;
        }

        public final void a() {
            if (this.e) {
                return;
            }
            icc iccVar = icc.this;
            j.a aVar = iccVar.h;
            int[] iArr = iccVar.c;
            int i = this.d;
            aVar.b(iArr[i], iccVar.d[i], 0, null, iccVar.u);
            this.e = true;
        }

        @Override // xsna.m0h0
        public final int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
            icc iccVar = icc.this;
            if (iccVar.n()) {
                return -3;
            }
            rg6 rg6Var = iccVar.w;
            androidx.media3.exoplayer.source.p pVar = this.c;
            if (rg6Var != null && rg6Var.d(this.d + 1) <= pVar.t()) {
                return -3;
            }
            a();
            return pVar.C(w8sVar, decoderInputBuffer, i, iccVar.z);
        }

        @Override // xsna.m0h0
        public final boolean isReady() {
            icc iccVar = icc.this;
            return !iccVar.n() && this.c.x(iccVar.z);
        }

        @Override // xsna.m0h0
        public final int skipData(long j) {
            icc iccVar = icc.this;
            if (iccVar.n()) {
                return 0;
            }
            boolean z = iccVar.z;
            androidx.media3.exoplayer.source.p pVar = this.c;
            int v = pVar.v(j, z);
            rg6 rg6Var = iccVar.w;
            if (rg6Var != null) {
                v = Math.min(v, rg6Var.d(this.d + 1) - pVar.t());
            }
            pVar.G(v);
            if (v > 0) {
                a();
            }
            return v;
        }

        @Override // xsna.m0h0
        public final void maybeThrowError() {
        }
    }
}
