package androidx.compose.foundation.gestures;

import defpackage.k631;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1 extends AdaptedFunctionReference implements wls {
    public final Object b(long j) {
        x xVar = (x) this.receiver;
        tje.N(xVar.Q.c(), null, null, new ScrollableNode$onWheelScrollStopped$1(xVar, j, null), 3);
        return zy11.a;
    }

    @Override // defpackage.wls
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        b(((k631) obj).a);
        return zy11.a;
    }
}
