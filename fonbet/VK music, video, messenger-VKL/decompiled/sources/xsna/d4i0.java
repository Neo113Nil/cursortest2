package xsna;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.view.state.Mode;
import one.video.controls20.SimpleControlsView;
import one.video.player.OneVideoPlayer;
import xsna.bu;
import xsna.sox;

/* compiled from: SeekbarActionProcessor.kt */
/* loaded from: classes8.dex */
public final class d4i0 {
    public static List a(aqj0 aqj0Var, fzi fziVar, g2b0 g2b0Var, bu.e eVar) {
        Mode mode = aqj0Var.a;
        qso0 qso0Var = aqj0Var.n;
        if (eVar.equals(bu.e.c.a)) {
            return e43.l(sp.k(qso0Var, true, false, 2), sp.k(qso0Var, false, true, 1));
        }
        if (eVar instanceof bu.e.b) {
            long j = ((bu.e.b) eVar).a;
            u3i0 a = w3i0.a(aqj0Var.D, aqj0Var.a, g2b0Var, fziVar, null, Long.valueOf(j), 16);
            ozb0 ozb0Var = aqj0Var.k;
            boolean z = mode == Mode.SHOW && g2b0Var != null && !g2b0Var.h && h2b0.a(g2b0Var);
            EnumSet<OneVideoPlayer.State> enumSet = h2b0.a;
            long j2 = 1000;
            return e43.l(a, fsk.p(ozb0Var, z, false, (int) ((g2b0Var != null ? g2b0Var.g : 0L) / j2), (int) (j / j2), 2));
        }
        if (!(eVar instanceof bu.e.a)) {
            if (!eVar.equals(bu.e.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z2 = mode == Mode.SHOW && g2b0Var != null && !g2b0Var.h && h2b0.a(g2b0Var);
            if (z2 != qso0Var.a || qso0Var.b) {
                qso0Var = new qso0(z2, false);
            }
            return Collections.singletonList(qso0Var);
        }
        bu.e.a aVar = (bu.e.a) eVar;
        sox soxVar = aVar.a;
        int i = aVar.b;
        sox.a aVar2 = (sox.a) j5g.b0(i, soxVar.a);
        ilk ilkVar = aqj0Var.C;
        int size = soxVar.a.size();
        SimpleControlsView.e eVar2 = fziVar.l;
        boolean z3 = mode == Mode.SHOW && eVar2.a && aVar2 != null && h2b0.a(g2b0Var);
        boolean z4 = eVar2.b;
        SimpleControlsView.e.a aVar3 = eVar2.c;
        return e43.l(jlk.a(ilkVar, z3, false, aVar2, i, size, z4, aVar3.a, aVar3.b, aVar3.c, 2), w3i0.a(aqj0Var.D, aqj0Var.a, g2b0Var, fziVar, aVar2, null, 32));
    }
}
