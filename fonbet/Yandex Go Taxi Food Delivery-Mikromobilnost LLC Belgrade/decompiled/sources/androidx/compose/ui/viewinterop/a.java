package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.node.LayoutNode;
import defpackage.aa10;
import defpackage.n8e;
import defpackage.tls;
import defpackage.uh6;
import defpackage.yuw;
import defpackage.z910;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements z910 {
    public final /* synthetic */ AndroidViewHolder a;
    public final /* synthetic */ LayoutNode b;

    public a(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        this.a = androidViewHolder;
        this.b = layoutNode;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        int obtainMeasureSpec;
        int obtainMeasureSpec2;
        aa10 w;
        aa10 w2;
        final AndroidViewHolder androidViewHolder = this.a;
        if (androidViewHolder.getChildCount() == 0) {
            w2 = kVar.w(n8e.k(j), n8e.j(j), kotlin.collections.b.f(), AndroidViewHolder$layoutNode$1$5$measure$1.w);
            return w2;
        }
        if (n8e.k(j) != 0) {
            androidViewHolder.getChildAt(0).setMinimumWidth(n8e.k(j));
        }
        if (n8e.j(j) != 0) {
            androidViewHolder.getChildAt(0).setMinimumHeight(n8e.j(j));
        }
        obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(n8e.k(j), n8e.i(j), androidViewHolder.getLayoutParams().width);
        obtainMeasureSpec2 = androidViewHolder.obtainMeasureSpec(n8e.j(j), n8e.h(j), androidViewHolder.getLayoutParams().height);
        androidViewHolder.measure(obtainMeasureSpec, obtainMeasureSpec2);
        int measuredWidth = androidViewHolder.getMeasuredWidth();
        int measuredHeight = androidViewHolder.getMeasuredHeight();
        final LayoutNode layoutNode = this.b;
        w = kVar.w(measuredWidth, measuredHeight, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                uh6.d(AndroidViewHolder.this, layoutNode);
                return zy11.a;
            }
        });
        return w;
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        int obtainMeasureSpec;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder = this.a;
        obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i, androidViewHolder.getLayoutParams().height);
        androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
        return androidViewHolder.getMeasuredWidth();
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        int obtainMeasureSpec;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder = this.a;
        obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i, androidViewHolder.getLayoutParams().height);
        androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
        return androidViewHolder.getMeasuredWidth();
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        int obtainMeasureSpec;
        AndroidViewHolder androidViewHolder = this.a;
        obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i, androidViewHolder.getLayoutParams().width);
        androidViewHolder.measure(obtainMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
        return androidViewHolder.getMeasuredHeight();
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        int obtainMeasureSpec;
        AndroidViewHolder androidViewHolder = this.a;
        obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i, androidViewHolder.getLayoutParams().width);
        androidViewHolder.measure(obtainMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
        return androidViewHolder.getMeasuredHeight();
    }
}
