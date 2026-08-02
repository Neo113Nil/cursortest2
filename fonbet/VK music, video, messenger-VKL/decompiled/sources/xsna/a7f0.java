package xsna;

import xsna.wk50;

/* compiled from: ReactiveExtension.kt */
/* loaded from: classes3.dex */
public interface a7f0 {

    /* compiled from: ReactiveExtension.kt */
    public static final class a {
        public static io.reactivex.rxjava3.disposables.c a(a7f0 a7f0Var, io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.w wVar, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar) {
            return a7f0Var.l(aVar.q(a7f0Var.y()).o(wVar).subscribe(new g66(gzsVar, 7), new f5y(new cya0(izsVar, 2), 19)));
        }

        public static <T> io.reactivex.rxjava3.disposables.c b(a7f0 a7f0Var, io.reactivex.rxjava3.core.q<T> qVar, io.reactivex.rxjava3.core.w wVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, gzs<s3q0> gzsVar) {
            return a7f0Var.l(qVar.r0(a7f0Var.y()).a0(wVar).subscribe(new w250(izsVar, 14), new a8v(new z6f0(izsVar2, 0), 15), new y96(gzsVar, 2)));
        }

        public static <T> io.reactivex.rxjava3.disposables.c c(a7f0 a7f0Var, io.reactivex.rxjava3.core.x<T> xVar, io.reactivex.rxjava3.core.w wVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
            return a7f0Var.l(xVar.q(a7f0Var.y()).m(wVar).subscribe(new wx00(izsVar, 14), new uk40(new re10(izsVar2, 2), 12)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.rxjava3.disposables.c d(a7f0 a7f0Var, io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.w wVar, izs izsVar, gzs gzsVar, int i) {
            if ((i & 1) != 0) {
                wVar = a7f0Var.z();
            }
            if ((i & 2) != 0) {
                izsVar = null;
            }
            if ((i & 4) != 0) {
                gzsVar = new lz2(27);
            }
            return a7f0Var.s(aVar, wVar, izsVar, gzsVar);
        }

        public static /* synthetic */ io.reactivex.rxjava3.disposables.c e(a7f0 a7f0Var, io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.w wVar, izs izsVar, izs izsVar2, il1 il1Var, int i) {
            if ((i & 1) != 0) {
                wVar = a7f0Var.z();
            }
            io.reactivex.rxjava3.core.w wVar2 = wVar;
            if ((i & 2) != 0) {
                izsVar = new k990(13);
            }
            izs izsVar3 = izsVar;
            if ((i & 4) != 0) {
                izsVar2 = null;
            }
            izs izsVar4 = izsVar2;
            gzs<s3q0> gzsVar = il1Var;
            if ((i & 8) != 0) {
                gzsVar = new fd90(5);
            }
            return a7f0Var.I(qVar, wVar2, izsVar3, izsVar4, gzsVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.rxjava3.disposables.c f(a7f0 a7f0Var, io.reactivex.rxjava3.core.x xVar, izs izsVar, izs izsVar2, int i) {
            io.reactivex.rxjava3.core.w z = a7f0Var.z();
            if ((i & 2) != 0) {
                izsVar = new ulz(21);
            }
            if ((i & 4) != 0) {
                izsVar2 = null;
            }
            return a7f0Var.w(xVar, z, izsVar, izsVar2);
        }

        public static void g(wk50.a aVar, io.reactivex.rxjava3.core.k kVar, yad yadVar, izs izsVar, gc gcVar, int i) {
            io.reactivex.rxjava3.core.w f = yiz.f(com.vk.mvi.core.internal.executors.a.a);
            Object obj = yadVar;
            if ((i & 2) != 0) {
                obj = new nc90(8);
            }
            Object obj2 = gcVar;
            if ((i & 8) != 0) {
                obj2 = new bu0(29);
            }
            aVar.l(kVar.n(aVar.y()).k(f).subscribe(new l8w(obj, 19), new b8v(new ci6(izsVar, 4), 23), new a2b(obj2, 4)));
        }
    }

    <T> io.reactivex.rxjava3.disposables.c I(io.reactivex.rxjava3.core.q<T> qVar, io.reactivex.rxjava3.core.w wVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, gzs<s3q0> gzsVar);

    io.reactivex.rxjava3.disposables.c l(io.reactivex.rxjava3.disposables.c cVar);

    io.reactivex.rxjava3.disposables.c s(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.w wVar, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar);

    <T> io.reactivex.rxjava3.disposables.c w(io.reactivex.rxjava3.core.x<T> xVar, io.reactivex.rxjava3.core.w wVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2);

    io.reactivex.rxjava3.core.w y();

    io.reactivex.rxjava3.core.w z();
}
