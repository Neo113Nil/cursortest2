package xsna;

import androidx.media3.datasource.a;
import androidx.media3.exoplayer.dash.b;
import androidx.media3.exoplayer.dash.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import one.video.player.DashMediaChunkType;
import xsna.co8;
import xsna.gdl;

/* compiled from: ReportingDashChunkSource.kt */
/* loaded from: classes8.dex */
public class q6g0 extends gdl {

    /* compiled from: ReportingDashChunkSource.kt */
    public static final class a implements b.a {
        public final a.InterfaceC0045a a;
        public final qo10 b;

        public a(a.InterfaceC0045a interfaceC0045a, qo10 qo10Var) {
            this.a = interfaceC0045a;
            this.b = qo10Var;
        }

        @Override // androidx.media3.exoplayer.dash.b.a
        public final androidx.media3.exoplayer.dash.b e(grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, long j, boolean z, ArrayList arrayList, e.c cVar, mjp0 mjp0Var, x1b0 x1b0Var) {
            androidx.media3.datasource.a createDataSource = this.a.createDataSource();
            if (mjp0Var != null) {
                createDataSource.addTransferListener(mjp0Var);
            }
            return new q6g0(grzVar, rskVar, wp6Var, i, iArr, d7qVar, i2, createDataSource, j, this.b, z, arrayList, cVar, x1b0Var);
        }
    }

    public q6g0(grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, androidx.media3.datasource.a aVar, long j, qo10 qo10Var, boolean z, ArrayList arrayList, e.c cVar, x1b0 x1b0Var) {
        super(new co8.b(), grzVar, rskVar, wp6Var, i, iArr, d7qVar, i2, aVar, j, qo10Var, z, arrayList, cVar, x1b0Var);
    }

    @Override // xsna.kcc
    public final void e(ccc cccVar) {
        String str;
        if (cccVar instanceof izw) {
            int b = this.j.b(((izw) cccVar).d);
            gdl.a[] aVarArr = this.i;
            gdl.a aVar = aVarArr[b];
            if (aVar.d == null) {
                dcc dccVar = aVar.a;
                dccVar.getClass();
                fcc a2 = dccVar.a();
                if (a2 != null) {
                    e7g0 e7g0Var = aVar.b;
                    aVarArr[b] = new gdl.a(aVar.e, e7g0Var, aVar.c, aVar.a, aVar.f, new htk(a2, e7g0Var.d));
                }
            }
        }
        e.c cVar = this.h;
        if (cVar != null) {
            long j = cVar.d;
            if (j == C.TIME_UNSET || cccVar.h > j) {
                cVar.d = cccVar.h;
            }
            androidx.media3.exoplayer.dash.e.this.h = true;
        }
        if (!(cccVar instanceof aq10) || (str = cccVar.d.n) == null) {
            return;
        }
        if (brm0.B(str, "video/", false)) {
            DashMediaChunkType dashMediaChunkType = DashMediaChunkType.VIDEO;
        } else if (brm0.B(str, "audio/", false)) {
            DashMediaChunkType dashMediaChunkType2 = DashMediaChunkType.VIDEO;
        } else if (brm0.B(str, "text/", false)) {
            DashMediaChunkType dashMediaChunkType3 = DashMediaChunkType.VIDEO;
        }
    }
}
