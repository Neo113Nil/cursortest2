package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes7.dex */
public final class zaw0 implements gzs<s3q0> {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ GridLayoutManager e;
    public final /* synthetic */ yaw0 f;

    public zaw0(RecyclerView recyclerView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, GridLayoutManager gridLayoutManager, yaw0 yaw0Var) {
        this.b = recyclerView;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = gridLayoutManager;
        this.f = yaw0Var;
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
            RecyclerView recyclerView2 = this.f.g;
            int i2 = measuredWidth - (yaw0.l * 2);
            int i3 = yaw0.m;
            this.e.setSpanCount((i2 + i3) / (yaw0.k + i3));
            if (!recyclerView2.isComputingLayout()) {
                recyclerView2.invalidateItemDecorations();
            }
        }
        return s3q0.a;
    }
}
