package xsna;

import xsna.q29;

/* compiled from: CallJoinDebugOptionsImpl.kt */
/* loaded from: classes7.dex */
public final class b49 {
    public final t29 a;
    public final io.reactivex.rxjava3.subjects.d b;
    public boolean c;
    public boolean d;
    public boolean e;

    public b49(t29 t29Var, io.reactivex.rxjava3.subjects.d dVar) {
        this.a = t29Var;
        this.b = dVar;
        this.c = t29Var.b("enable_join_as_group", true);
        this.d = t29Var.b("enable_join_as_anonym", true);
        boolean b = t29Var.b("enable_join_with_changed_name", true);
        this.e = b;
        dVar.onNext(new q29.a(this.c, this.d, b));
    }
}
