package xsna;

/* compiled from: LayoutModifierNode.kt */
/* loaded from: classes11.dex */
public interface noy extends htl {
    dp10 c(ep10 ep10Var, zo10 zo10Var, long j);

    default int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return c(new fpx(fVar, fVar.getLayoutDirection()), new c570(zoxVar, e570.Max, f570.Height), s6j.b(0, i, 0, 0, 13)).getHeight();
    }

    default int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return c(new fpx(fVar, fVar.getLayoutDirection()), new c570(zoxVar, e570.Min, f570.Width), s6j.b(0, 0, 0, i, 7)).getWidth();
    }

    default int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return c(new fpx(fVar, fVar.getLayoutDirection()), new c570(zoxVar, e570.Min, f570.Height), s6j.b(0, i, 0, 0, 13)).getHeight();
    }

    default int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return c(new fpx(fVar, fVar.getLayoutDirection()), new c570(zoxVar, e570.Max, f570.Width), s6j.b(0, 0, 0, i, 7)).getWidth();
    }
}
