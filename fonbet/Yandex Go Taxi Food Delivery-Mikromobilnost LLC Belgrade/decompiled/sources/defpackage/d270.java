package defpackage;

import java.util.function.LongUnaryOperator;

/* loaded from: classes9.dex */
public final /* synthetic */ class d270 implements LongUnaryOperator {
    public final /* synthetic */ long a;

    public /* synthetic */ d270(long j) {
        this.a = j;
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        return j > 0 ? j : this.a;
    }
}
