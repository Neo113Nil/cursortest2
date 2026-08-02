package yads;

import android.widget.ProgressBar;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class ig1 implements uk2 {
    public static final /* synthetic */ qcy[] d;
    public final hg1 a;
    public final ff b;
    public final mn2 c;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ig1.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0);
        fpf0.a.getClass();
        d = new qcy[]{mutablePropertyReference1Impl};
    }

    public /* synthetic */ ig1() {
        this(new hg1(), new ff());
    }

    @Override // yads.uk2
    public final void a(long j, long j2) {
        mn2 mn2Var = this.c;
        qcy qcyVar = d[0];
        ProgressBar progressBar = (ProgressBar) mn2Var.a.get();
        if (progressBar != null) {
            this.b.getClass();
            ff.a(progressBar, j, j2);
        }
    }

    public ig1(hg1 hg1Var, ff ffVar) {
        this.a = hg1Var;
        this.b = ffVar;
        this.c = nn2.a(null);
    }

    @Override // yads.uk2
    public final void a() {
        mn2 mn2Var = this.c;
        qcy qcyVar = d[0];
        ProgressBar progressBar = (ProgressBar) mn2Var.a.get();
        if (progressBar != null) {
            long max = progressBar.getMax();
            this.b.getClass();
            ff.a(progressBar, max, max);
        }
    }
}
