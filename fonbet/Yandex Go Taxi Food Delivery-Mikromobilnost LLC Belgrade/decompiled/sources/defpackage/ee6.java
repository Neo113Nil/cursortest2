package defpackage;

import android.graphics.Point;
import android.view.View;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;

/* loaded from: classes11.dex */
public final class ee6 extends wce0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee6(View view, View view2, int i) {
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
    public final Point g(TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity) {
        int i = this.d;
        View view = this.a;
        switch (i) {
            case 0:
                Point j = b.j(view);
                return new Point(a(j, tooltipCommon$PreferredGravity), view.getMeasuredHeight() + j.y);
            default:
                Point j2 = b.j(view);
                return new Point(a(j2, tooltipCommon$PreferredGravity), j2.y - this.b.getMeasuredHeight());
        }
    }
}
