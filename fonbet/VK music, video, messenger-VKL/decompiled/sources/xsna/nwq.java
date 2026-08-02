package xsna;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FeedAppCarouselAppViewTracker.kt */
/* loaded from: classes4.dex */
public final class nwq {
    public final RecyclerView a;
    public final int b;
    public final f5x c;
    public final cqv d;
    public final nq1 e;
    public final Rect f = new Rect();
    public final float g;

    public nwq(RecyclerView recyclerView, int i, f5x f5xVar, cqv cqvVar, nq1 nq1Var) {
        this.a = recyclerView;
        this.b = i;
        this.c = f5xVar;
        this.d = cqvVar;
        this.e = nq1Var;
        this.g = i35.k(i / 100.0f, 2);
    }
}
