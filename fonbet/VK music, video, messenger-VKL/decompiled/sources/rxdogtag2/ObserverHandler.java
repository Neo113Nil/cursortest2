package rxdogtag2;

import xsna.axm0;

/* loaded from: classes11.dex */
public interface ObserverHandler {
    default io.reactivex.rxjava3.core.c handle(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.c cVar) {
        return cVar;
    }

    default io.reactivex.rxjava3.core.m handle(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.core.m mVar) {
        return mVar;
    }

    default io.reactivex.rxjava3.core.v handle(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.v vVar) {
        return vVar;
    }

    default io.reactivex.rxjava3.core.z handle(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.core.z zVar) {
        return zVar;
    }

    default axm0 handle(io.reactivex.rxjava3.core.g gVar, axm0 axm0Var) {
        return axm0Var;
    }
}
