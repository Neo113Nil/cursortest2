package yads;

import kotlin.jvm.internal.Lambda;
import xsna.i7s;
import xsna.izs;

/* loaded from: classes10.dex */
public final class bi extends Lambda implements izs {
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(long j) {
        super(1);
        this.b = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        long timestamp;
        timestamp = i7s.a(obj).getTimestamp();
        return Boolean.valueOf(timestamp > this.b);
    }
}
