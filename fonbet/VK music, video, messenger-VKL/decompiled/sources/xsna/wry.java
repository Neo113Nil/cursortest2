package xsna;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: LazyGridSnapLayoutInfoProvider.kt */
/* loaded from: classes11.dex */
public final class wry {
    public static final int a(xqy xqyVar, Orientation orientation) {
        return (int) (orientation == Orientation.Vertical ? xqyVar.e() & 4294967295L : xqyVar.e() >> 32);
    }
}
