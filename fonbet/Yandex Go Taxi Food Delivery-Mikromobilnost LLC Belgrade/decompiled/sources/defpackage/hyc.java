package defpackage;

import java.util.concurrent.CompletableFuture;

/* loaded from: classes15.dex */
public final class hyc extends CompletableFuture {
    public final yv60 a;

    public hyc(yv60 yv60Var) {
        this.a = yv60Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
