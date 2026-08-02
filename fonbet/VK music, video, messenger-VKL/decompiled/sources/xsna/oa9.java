package xsna;

import xsna.q29;

/* compiled from: CallUiDebugOptionsImpl.kt */
/* loaded from: classes7.dex */
public final class oa9 {
    public final t29 a;
    public final io.reactivex.rxjava3.subjects.d b;
    public boolean c;

    public oa9(t29 t29Var, io.reactivex.rxjava3.subjects.d dVar) {
        this.a = t29Var;
        this.b = dVar;
        boolean b = t29Var.b("enable_open_call_with_stereo_ui", false);
        this.c = b;
        dVar.onNext(new q29.c(b));
    }
}
