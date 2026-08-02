package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.dcc;

/* compiled from: InitializationChunk.java */
/* loaded from: classes12.dex */
public final class izw extends ccc {
    public final dcc j;
    public dcc.a k;
    public long l;
    public volatile boolean m;

    public izw(androidx.media3.datasource.a aVar, evk evkVar, androidx.media3.common.a aVar2, int i, @Nullable Object obj, dcc dccVar) {
        super(aVar, evkVar, 2, aVar2, i, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.j = dccVar;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void cancelLoad() {
        this.m = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void load() throws IOException {
        if (this.l == 0) {
            this.j.c(this.k, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            evk d = this.b.d(this.l);
            vyk0 vyk0Var = this.i;
            tel telVar = new tel(vyk0Var, d.g, vyk0Var.open(d));
            while (!this.m && this.j.b(telVar)) {
                try {
                } finally {
                    this.l = telVar.d - this.b.g;
                    this.j.a();
                }
            }
        } finally {
            cvk.k(this.i);
        }
    }
}
