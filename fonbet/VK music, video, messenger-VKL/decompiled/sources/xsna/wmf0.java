package xsna;

import com.vk.reefton.literx.observable.LambdaObserver;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import xsna.snf0;

/* compiled from: ReefAppInterceptor.kt */
/* loaded from: classes5.dex */
public final class wmf0 implements snf0 {
    public final com.vk.reefton.d a;
    public final b8h0 b;
    public LambdaObserver c;

    /* compiled from: ReefAppInterceptor.kt */
    public static final class a implements snf0.a {
        @Override // xsna.snf0.a
        public final snf0 a(qof0 qof0Var) {
            return new wmf0(qof0Var.f(), qof0Var.e());
        }
    }

    public wmf0(com.vk.reefton.d dVar, b8h0 b8h0Var) {
        this.a = dVar;
        this.b = b8h0Var;
    }

    @Override // xsna.snf0
    public final void a(PublishSubject publishSubject, PublishSubject publishSubject2) {
        LambdaObserver lambdaObserver = this.c;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        b8h0 b8h0Var = this.b;
        this.c = new ObservableSubscribeOn(new ObservableObserveOn(publishSubject, b8h0Var), b8h0Var).b(new aj50(this, 15));
    }

    @Override // xsna.snf0
    public final void release() {
        LambdaObserver lambdaObserver = this.c;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
    }
}
