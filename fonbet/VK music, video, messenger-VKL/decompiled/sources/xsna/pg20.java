package xsna;

/* compiled from: MessagesRequestsLoader.kt */
/* loaded from: classes18.dex */
public final class pg20 {
    public final a1w a;
    public final io.reactivex.rxjava3.core.w b = io.reactivex.rxjava3.schedulers.a.b();

    public pg20(a1w a1wVar) {
        this.a = a1wVar;
    }

    public final io.reactivex.rxjava3.core.q<ng20> a() {
        a1w a1wVar = this.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a = a1wVar.l.a();
        io.reactivex.rxjava3.core.w wVar = this.b;
        return new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.i0(a.a0(wVar).r0(wVar), new y34(new kdw(4), 23)), new com.vk.movika.sdk.base.flow.binding.c(new pb00(this, 3), 22)).o0(a1wVar.C(this, new eb20()).l(new ed(new s6x(7), 24)));
    }
}
