package xsna;

import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: ViewsHistoryDataSource.kt */
/* loaded from: classes2.dex */
public final class g4u0 implements yuk<e4u0, Integer> {
    public final int b;
    public final long c;
    public final xc20 d;

    public g4u0(int i, long j, xc20 xc20Var) {
        this.b = i;
        this.c = j;
        this.d = xc20Var;
    }

    @Override // xsna.yuk
    public final io.reactivex.rxjava3.core.x b(int i, String str, Object obj) {
        int intValue = ((Number) obj).intValue();
        return new io.reactivex.rxjava3.internal.operators.single.d0(wvg0.a(EmptyCoroutineContext.b, new f4u0(this, intValue, null)).l(new tj60(new kso(intValue, 1), 21)), new az60(11), null);
    }
}
