package xsna;

import xsna.eyx;

/* compiled from: RxSingle.kt */
/* loaded from: classes8.dex */
public final class wvg0 {
    public static final io.reactivex.rxjava3.internal.operators.single.b a(kotlin.coroutines.d dVar, wzs wzsVar) {
        if (dVar.get(eyx.a.b) == null) {
            return new io.reactivex.rxjava3.internal.operators.single.b(new ex0(dVar, wzsVar));
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + dVar).toString());
    }
}
