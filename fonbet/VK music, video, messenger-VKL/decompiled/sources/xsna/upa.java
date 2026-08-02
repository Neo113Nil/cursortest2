package xsna;

import java.util.concurrent.Callable;
import xsna.qjc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class upa implements Callable {
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ qjc.a c;

    public /* synthetic */ upa(vpa vpaVar, CharSequence charSequence, qjc.a aVar) {
        this.b = charSequence;
        this.c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        vpa.a(this.b, this.c);
        return s3q0.a;
    }
}
