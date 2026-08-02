package xsna;

import android.text.SegmentFinder;

/* compiled from: SegmentFinder.android.kt */
/* loaded from: classes11.dex */
public final class yw2 extends SegmentFinder {
    public final /* synthetic */ jge0 a;

    public yw2(jge0 jge0Var) {
        this.a = jge0Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.d(i);
    }
}
