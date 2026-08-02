package xsna;

import androidx.compose.foundation.gestures.Orientation;
import xsna.cuy;

/* compiled from: LazyGridPrefetchStrategy.kt */
/* loaded from: classes11.dex */
public final class khl {
    public boolean c;
    public float e;
    public int a = -1;
    public final ci50<cuy.b> b = new ci50<>(new cuy.b[16]);
    public int d = -1;

    public static int a(kry kryVar, boolean z) {
        return z ? ((xqy) j5g.i0(kryVar.f())).getIndex() + 1 : ((xqy) j5g.Y(kryVar.f())).getIndex() - 1;
    }

    public static int b(kry kryVar, boolean z) {
        if (z) {
            xqy xqyVar = (xqy) j5g.i0(kryVar.f());
            return (kryVar.getOrientation() == Orientation.Vertical ? xqyVar.m() : xqyVar.i()) + 1;
        }
        xqy xqyVar2 = (xqy) j5g.Y(kryVar.f());
        return (kryVar.getOrientation() == Orientation.Vertical ? xqyVar2.m() : xqyVar2.i()) - 1;
    }
}
