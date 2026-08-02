package xsna;

import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes8.dex */
public final class xxm0 extends caj0<Integer> implements ttk0<Integer> {
    public xxm0(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        e(Integer.valueOf(i));
    }

    @Override // xsna.ttk0
    public final Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) lyd.c(this.i, (this.j + ((int) ((o() + this.l) - this.j))) - 1)).intValue());
        }
        return valueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            e(Integer.valueOf(((Number) lyd.c(this.i, (this.j + ((int) ((o() + this.l) - this.j))) - 1)).intValue() + i));
        }
    }
}
