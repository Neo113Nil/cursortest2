package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes.dex */
public final class hph implements vpr {
    public final /* synthetic */ Ref$LongRef a;
    public final /* synthetic */ long b;
    public final /* synthetic */ vpr c;

    public hph(Ref$LongRef ref$LongRef, long j, vpr vprVar) {
        this.a = ref$LongRef;
        this.b = j;
        this.c = vprVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        long currentTimeMillis = System.currentTimeMillis();
        Ref$LongRef ref$LongRef = this.a;
        if (currentTimeMillis - ref$LongRef.element <= this.b) {
            return zy11.a;
        }
        ref$LongRef.element = currentTimeMillis;
        return this.c.emit(obj, continuation);
    }
}
