package xsna;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.dash.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import xsna.dcc;
import xsna.rgp0;

/* compiled from: BundledChunkExtractor.java */
/* loaded from: classes12.dex */
public final class co8 implements rgq, dcc {
    public static final pzb0 l = new pzb0();
    public final pgq b;
    public final int c;
    public final androidx.media3.common.a d;
    public final SparseArray<a> e = new SparseArray<>();
    public final pm0 f = c.e7;
    public boolean g;

    @Nullable
    public dcc.a h;
    public long i;
    public n3i0 j;
    public androidx.media3.common.a[] k;

    /* compiled from: BundledChunkExtractor.java */
    public static final class a implements rgp0 {
        public final int a;

        @Nullable
        public final androidx.media3.common.a b;
        public final k0n c = new k0n();
        public final c d;
        public androidx.media3.common.a e;
        public rgp0 f;
        public long g;

        public a(int i, int i2, androidx.media3.common.a aVar, pm0 pm0Var) {
            this.a = i2;
            this.b = aVar;
            this.d = pm0Var;
        }

        @Override // xsna.rgp0
        public final void a(long j, int i, int i2, int i3, @Nullable rgp0.a aVar) {
            long j2 = this.g;
            if (j2 != C.TIME_UNSET && j >= j2) {
                this.f = this.c;
            }
            rgp0 rgp0Var = this.f;
            String str = y2r0.a;
            rgp0Var.a(j, i, i2, i3, aVar);
        }

        @Override // xsna.rgp0
        public final void b(xi90 xi90Var, int i, int i2) {
            rgp0 rgp0Var = this.f;
            String str = y2r0.a;
            rgp0Var.d(i, xi90Var);
        }

        @Override // xsna.rgp0
        public final void c(androidx.media3.common.a aVar) {
            ((pm0) this.d).getClass();
            androidx.media3.common.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar = aVar.e(aVar2);
            }
            this.e = aVar;
            rgp0 rgp0Var = this.f;
            String str = y2r0.a;
            rgp0Var.c(aVar);
        }

        @Override // xsna.rgp0
        public final int f(suk sukVar, int i, boolean z) throws IOException {
            rgp0 rgp0Var = this.f;
            String str = y2r0.a;
            return rgp0Var.g(sukVar, i, z);
        }
    }

    /* compiled from: BundledChunkExtractor.java */
    public static final class b {
        public anl a = new anl();
        public boolean b;

        @Nullable
        public final co8 a(int i, androidx.media3.common.a aVar, boolean z, ArrayList arrayList, @Nullable e.c cVar) {
            pgq mesVar;
            String str = aVar.m;
            if (!io20.o(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM) || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mesVar = new xn10(this.a, this.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    mesVar = new v0y(1);
                } else if (Objects.equals(str, "image/png")) {
                    mesVar = new zfb0();
                } else {
                    int i2 = z ? 4 : 0;
                    if (!this.b) {
                        i2 |= 32;
                    }
                    mesVar = new mes(this.a, i2, null, arrayList, cVar);
                }
            } else {
                if (!this.b) {
                    return null;
                }
                mesVar = new q0n0(this.a.c(aVar), aVar);
            }
            return new co8(mesVar, i, aVar);
        }
    }

    /* compiled from: BundledChunkExtractor.java */
    public interface c {
        public static final pm0 e7 = new pm0(6);
    }

    public co8(pgq pgqVar, int i, androidx.media3.common.a aVar) {
        this.b = pgqVar;
        this.c = i;
        this.d = aVar;
    }

    @Override // xsna.dcc
    @Nullable
    public final fcc a() {
        n3i0 n3i0Var = this.j;
        if (n3i0Var instanceof fcc) {
            return (fcc) n3i0Var;
        }
        if (n3i0Var instanceof gcc) {
            return ((gcc) n3i0Var).a();
        }
        return null;
    }

    @Override // xsna.dcc
    public final boolean b(tel telVar) throws IOException {
        int b2 = this.b.b(telVar, l);
        fxc0.z(b2 != 1);
        return b2 == 0;
    }

    @Override // xsna.dcc
    public final void c(@Nullable dcc.a aVar, long j, long j2) {
        this.h = aVar;
        this.i = j2;
        boolean z = this.g;
        pgq pgqVar = this.b;
        if (!z) {
            pgqVar.e(this);
            if (j != C.TIME_UNSET) {
                pgqVar.seek(0L, j);
            }
            this.g = true;
            return;
        }
        if (j == C.TIME_UNSET) {
            j = 0;
        }
        pgqVar.seek(0L, j);
        int i = 0;
        while (true) {
            SparseArray<a> sparseArray = this.e;
            if (i >= sparseArray.size()) {
                return;
            }
            a valueAt = sparseArray.valueAt(i);
            if (aVar == null) {
                valueAt.f = valueAt.c;
            } else {
                valueAt.g = j2;
                rgp0 a2 = ((tg6) aVar).a(valueAt.a);
                valueAt.f = a2;
                androidx.media3.common.a aVar2 = valueAt.e;
                if (aVar2 != null) {
                    a2.c(aVar2);
                }
            }
            i++;
        }
    }

    @Override // xsna.dcc
    @Nullable
    public final androidx.media3.common.a[] d() {
        return this.k;
    }

    @Override // xsna.rgq
    public final void endTracks() {
        SparseArray<a> sparseArray = this.e;
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            androidx.media3.common.a aVar = sparseArray.valueAt(i).e;
            aVar.getClass();
            aVarArr[i] = aVar;
        }
        this.k = aVarArr;
    }

    @Override // xsna.rgq
    public final void f(n3i0 n3i0Var) {
        this.j = n3i0Var;
    }

    @Override // xsna.dcc
    public final void release() {
        this.b.release();
    }

    @Override // xsna.rgq
    public final rgp0 track(int i, int i2) {
        SparseArray<a> sparseArray = this.e;
        a aVar = sparseArray.get(i);
        if (aVar == null) {
            fxc0.z(this.k == null);
            aVar = new a(i, i2, i2 == this.c ? this.d : null, this.f);
            dcc.a aVar2 = this.h;
            long j = this.i;
            if (aVar2 == null) {
                aVar.f = aVar.c;
            } else {
                aVar.g = j;
                rgp0 a2 = ((tg6) aVar2).a(i2);
                aVar.f = a2;
                androidx.media3.common.a aVar3 = aVar.e;
                if (aVar3 != null) {
                    a2.c(aVar3);
                }
            }
            sparseArray.put(i, aVar);
        }
        return aVar;
    }
}
