package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.NoWhenBranchMatchedException;
import xsna.q3o;

/* compiled from: DonutTeaserReducer.kt */
/* loaded from: classes4.dex */
public final class r3o extends dm50<y3o, q3o, u3o> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dm50
    public final u3o c(u3o u3oVar, q3o q3oVar) {
        qko0 qko0Var;
        u3o u3oVar2 = u3oVar;
        q3o q3oVar2 = q3oVar;
        int i = u3oVar2.g;
        if (q3oVar2.equals(q3o.a.b)) {
            return u3oVar2;
        }
        if (!(q3oVar2 instanceof q3o.f)) {
            if (q3oVar2.equals(q3o.b.b)) {
                return u3o.a(u3oVar2, false, false, null, null, null, i + 1, 211);
            }
            if (q3oVar2 instanceof q3o.d) {
                return u3o.a(u3oVar2, false, false, ((q3o.d) q3oVar2).b, null, null, 0, 248);
            }
            if (q3oVar2.equals(q3o.e.b)) {
                return u3o.a(u3oVar2, false, true, null, null, null, 0, 253);
            }
            if (!(q3oVar2 instanceof q3o.c)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = ((q3o.c) q3oVar2).b;
            return u3o.a(u3oVar2, z, z ? u3oVar2.c : false, null, null, null, 0, 252);
        }
        q3o.f fVar = (q3o.f) q3oVar2;
        String str = fVar.b;
        if ((str != null && str.length() > 112) == true) {
            str = u3oVar2.e;
            long j = fVar.c;
            int i2 = qko0.c;
            int i3 = ((int) (j >> 32)) - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = ((int) (j & 4294967295L)) - 1;
            qko0Var = new qko0(jgz.c(i3, i4 >= 0 ? i4 : 0));
            i++;
        } else {
            qko0Var = null;
        }
        return u3o.a(u3oVar2, false, false, null, str, qko0Var, i, PsExtractor.AUDIO_STREAM);
    }

    @Override // xsna.dm50
    public final y3o d() {
        return new y3o(e(new p4f(this, 23)));
    }

    @Override // xsna.dm50
    public final void h(u3o u3oVar, y3o y3oVar) {
        f(y3oVar.a, u3oVar);
    }
}
