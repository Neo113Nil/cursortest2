package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: SingleSampleMediaChunk.java */
@Deprecated
/* loaded from: classes12.dex */
public final class vvj0 extends rg6 {
    public final int o;
    public final androidx.media3.common.a p;
    public long q;
    public boolean r;

    public vvj0(androidx.media3.datasource.a aVar, evk evkVar, androidx.media3.common.a aVar2, int i, @Nullable Object obj, long j, long j2, long j3, int i2, androidx.media3.common.a aVar3) {
        super(aVar, evkVar, aVar2, i, obj, j, j2, C.TIME_UNSET, C.TIME_UNSET, j3);
        this.o = i2;
        this.p = aVar3;
    }

    @Override // xsna.aq10
    public final boolean c() {
        return this.r;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void load() throws IOException {
        vyk0 vyk0Var = this.i;
        tg6 tg6Var = this.m;
        tg6Var.getClass();
        for (androidx.media3.exoplayer.source.p pVar : tg6Var.b) {
            if (pVar.F != 0) {
                pVar.F = 0L;
                pVar.z = true;
            }
        }
        rgp0 a = tg6Var.a(this.o);
        a.c(this.p);
        try {
            long open = vyk0Var.open(this.b.d(this.q));
            if (open != -1) {
                open += this.q;
            }
            tel telVar = new tel(this.i, this.q, open);
            for (int i = 0; i != -1; i = a.g(telVar, Integer.MAX_VALUE, true)) {
                this.q += i;
            }
            a.a(this.g, 1, (int) this.q, 0, null);
            cvk.k(vyk0Var);
            this.r = true;
        } catch (Throwable th) {
            cvk.k(vyk0Var);
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void cancelLoad() {
    }
}
