package xsna;

import one.video.controls.view.state.Mode;
import xsna.sox;

/* compiled from: SeekPreviewLayoutStateHelper.kt */
/* loaded from: classes8.dex */
public final class w3i0 {
    public static u3i0 a(u3i0 u3i0Var, Mode mode, g2b0 g2b0Var, fzi fziVar, sox.a aVar, Long l, int i) {
        sox.a aVar2 = (i & 16) != 0 ? null : aVar;
        Long l2 = (i & 32) == 0 ? l : null;
        boolean z = mode == Mode.SHOW_SEEK_PREVIEW && fziVar.j != null && h2b0.a(g2b0Var);
        owo0 owo0Var = fziVar.j;
        if (aVar2 == null) {
            aVar2 = u3i0Var.d;
        }
        return v3i0.a(u3i0Var, z, false, owo0Var, aVar2, l2 != null ? l2.longValue() : u3i0Var.e, g2b0Var != null ? g2b0Var.g : 0L, 2);
    }
}
