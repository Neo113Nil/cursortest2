package defpackage;

import android.graphics.Point;
import android.view.View;

/* loaded from: classes11.dex */
public final class fe6 extends wce0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe6(View view, View view2, int i) {
        super(view, view2);
        this.d = i;
    }

    @Override // defpackage.wce0
    public final int c() {
        switch (this.d) {
            case 0:
                return 8388659;
            default:
                return 8388691;
        }
    }

    @Override // defpackage.wce0
    public final float e() {
        switch (this.d) {
            case 0:
                return 0.0f;
            default:
                return 180.0f;
        }
    }

    @Override // defpackage.wce0
    public final Point f() {
        int i = this.d;
        int[] iArr = wce0.c;
        View view = this.a;
        switch (i) {
            case 0:
                view.getLocationInWindow(iArr);
                return new Point(b(iArr), view.getMeasuredHeight() + iArr[1]);
            default:
                view.getLocationInWindow(iArr);
                return new Point(b(iArr), iArr[1] - this.b.getMeasuredHeight());
        }
    }
}
