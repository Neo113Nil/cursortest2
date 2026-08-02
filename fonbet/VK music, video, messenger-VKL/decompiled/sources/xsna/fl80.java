package xsna;

import com.ironsource.V0;
import com.ironsource.W2;
import one.video.exo.datasource.hls.parser.OneVideoHlsPlaylistParser;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class fl80 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fl80(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fkz fkzVar;
        switch (this.b) {
            case 0:
                xk80 xk80Var = (xk80) ((OneVideoHlsPlaylistParser) this.d).d.c;
                sht0 j = xk80Var.j();
                if ((j instanceof mnz) && (fkzVar = ((mnz) j).d) != null) {
                    fkzVar.d = this.c;
                }
                xk80Var.l.k(xk80Var, xk80Var.w0(j));
                break;
            default:
                W2.a.d((V0) this.d, this.c);
                break;
        }
    }
}
