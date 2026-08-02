package androidx.compose.foundation.gestures;

import defpackage.gxg;
import defpackage.iip0;
import defpackage.knj;
import defpackage.snr;
import defpackage.tje;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class g implements snr {
    public gxg a;
    public final knj b;

    public g(gxg gxgVar) {
        knj knjVar = u.c;
        this.a = gxgVar;
        this.b = knjVar;
    }

    @Override // defpackage.snr
    public final Object a(iip0 iip0Var, float f, Continuation continuation) {
        return tje.k0(this.b, new DefaultFlingBehavior$performFling$2(f, this, iip0Var, null), continuation);
    }
}
