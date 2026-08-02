package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class pbz0 {
    public static final /* synthetic */ kgx[] e;
    public final RecyclerView a;
    public final sbb b;
    public final ike c;
    public final rp3 d = new rp3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("debounceJob", 0, "getDebounceJob()Lkotlinx/coroutines/Job;", pbz0.class);
        qoi0.a.getClass();
        e = new kgx[]{mutablePropertyReference1Impl};
    }

    public pbz0(RecyclerView recyclerView, sbb sbbVar, vse vseVar) {
        this.a = recyclerView;
        this.b = sbbVar;
        this.c = vseVar.c(false);
    }

    public final void a(pzt0 pzt0Var) {
        kgx kgxVar = e[0];
        this.d.a(pzt0Var);
    }
}
