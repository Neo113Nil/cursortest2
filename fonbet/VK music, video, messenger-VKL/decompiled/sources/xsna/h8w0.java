package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes7.dex */
public final class h8w0 implements gzs<s3q0> {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ GridLayoutManager e;
    public final /* synthetic */ e8w0 f;

    public h8w0(RecyclerView recyclerView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, GridLayoutManager gridLayoutManager, e8w0 e8w0Var) {
        this.b = recyclerView;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = gridLayoutManager;
        this.f = e8w0Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        RecyclerView recyclerView = this.b;
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            RecyclerView recyclerView2 = this.f.m;
            int i2 = measuredWidth - (e8w0.w * 2);
            int i3 = e8w0.x;
            this.e.setSpanCount((i2 + i3) / (e8w0.v + i3));
            if (!recyclerView2.isComputingLayout()) {
                recyclerView2.invalidateItemDecorations();
            }
        }
        return s3q0.a;
    }
}
