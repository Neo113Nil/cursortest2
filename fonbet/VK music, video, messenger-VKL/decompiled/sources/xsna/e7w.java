package xsna;

import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: ImItemListRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class e7w {
    public final zrz a;
    public volatile n5w b;
    public final io.reactivex.rxjava3.internal.operators.observable.a0 c;

    public e7w(zrz zrzVar) {
        this.a = zrzVar;
        io.reactivex.rxjava3.core.q state = zrzVar.getState();
        jv jvVar = new jv(new dwg(this, 21), 25);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.c = new io.reactivex.rxjava3.internal.operators.observable.a0(state.E(jvVar, lVar, kVar, kVar), new kv(this, 1));
    }

    public final void a(int i) {
        this.a.a(i);
    }
}
