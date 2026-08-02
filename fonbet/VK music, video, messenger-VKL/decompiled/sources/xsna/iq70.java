package xsna;

import com.vk.reefton.literx.observable.LambdaObserver;

/* compiled from: Observable.kt */
/* loaded from: classes5.dex */
public abstract class iq70<T> {
    public final LambdaObserver b(izs izsVar) {
        LambdaObserver lambdaObserver = new LambdaObserver(izsVar, z1v.b);
        d(lambdaObserver);
        return lambdaObserver;
    }

    public final LambdaObserver c(izs izsVar, izs izsVar2) {
        LambdaObserver lambdaObserver = new LambdaObserver(izsVar, izsVar2);
        d(lambdaObserver);
        return lambdaObserver;
    }

    public abstract void d(er70<T> er70Var);
}
