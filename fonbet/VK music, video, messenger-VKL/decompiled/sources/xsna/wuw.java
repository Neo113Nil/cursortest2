package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.tuw;

/* compiled from: InfiniteAnimationPolicy.kt */
/* loaded from: classes11.dex */
public final class wuw {
    public static final Object a(izs izsVar, ContinuationImpl continuationImpl) {
        tuw tuwVar = (tuw) continuationImpl.getContext().get(tuw.a.b);
        if (tuwVar == null) {
            return i830.a(continuationImpl.getContext()).k(izsVar, continuationImpl);
        }
        new vuw(izsVar, null);
        return tuwVar.r();
    }
}
