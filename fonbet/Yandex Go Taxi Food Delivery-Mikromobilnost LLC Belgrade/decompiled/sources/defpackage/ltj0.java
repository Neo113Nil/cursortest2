package defpackage;

import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class ltj0 extends ntj0 {
    public final Throwable b;

    public ltj0(Throwable th) {
        this.b = th;
    }

    @Override // defpackage.ntj0
    public final ntj0 b(Consumer consumer) {
        consumer.accept(this.b);
        return this;
    }
}
