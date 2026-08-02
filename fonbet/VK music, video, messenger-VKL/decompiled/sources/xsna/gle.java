package xsna;

import android.graphics.Rect;

/* compiled from: ClipsMediaStoreItemSmallHolder.kt */
/* loaded from: classes15.dex */
public final class gle extends gz10 {
    @Override // xsna.gz10, xsna.otx0
    public final Rect X1(Rect rect) {
        if (this.n.a.invoke().booleanValue()) {
            this.q.getGlobalVisibleRect(rect);
            return rect;
        }
        this.itemView.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // xsna.gz10
    public final void V5(boolean z) {
    }
}
