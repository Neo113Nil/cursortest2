package xsna;

import xsna.q630;

/* compiled from: LayoutModifier.kt */
/* loaded from: classes11.dex */
public interface loy extends q630.b {
    dp10 c(ep10 ep10Var, zo10 zo10Var, long j);

    default int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return c(new fpx(fVar, fVar.getLayoutDirection()), new pp10(zoxVar, rp10.Max, sp10.Height), s6j.b(0, i, 0, 0, 13)).getHeight();
    }

    default int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return c(new fpx(fVar, fVar.getLayoutDirection()), new pp10(zoxVar, rp10.Min, sp10.Width), s6j.b(0, 0, 0, i, 7)).getWidth();
    }

    default int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return c(new fpx(fVar, fVar.getLayoutDirection()), new pp10(zoxVar, rp10.Min, sp10.Height), s6j.b(0, i, 0, 0, 13)).getHeight();
    }

    default int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return c(new fpx(fVar, fVar.getLayoutDirection()), new pp10(zoxVar, rp10.Max, sp10.Width), s6j.b(0, 0, 0, i, 7)).getWidth();
    }
}
