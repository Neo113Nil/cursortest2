package xsna;

import xsna.q29;

/* compiled from: CallTestDebugOptionsImpl.kt */
/* loaded from: classes7.dex */
public final class ia9 {
    public final t29 a;
    public final io.reactivex.rxjava3.subjects.d b;
    public boolean c;

    public ia9(t29 t29Var, io.reactivex.rxjava3.subjects.d dVar) {
        this.a = t29Var;
        this.b = dVar;
        dVar.onNext(new q29.b(this.c));
    }
}
