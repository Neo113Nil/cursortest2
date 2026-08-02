package defpackage;

import java.util.function.Consumer;

/* loaded from: classes6.dex */
public final class fc implements pco {
    public final /* synthetic */ Consumer a;
    public final /* synthetic */ dd b;
    public final /* synthetic */ Runnable c;

    public fc(Consumer consumer, dd ddVar, Runnable runnable) {
        this.a = consumer;
        this.b = ddVar;
        this.c = runnable;
    }

    @Override // defpackage.pco
    public final void n() {
        this.a.accept(this.b);
    }

    @Override // defpackage.pco
    public final void o() {
        this.c.run();
    }
}
