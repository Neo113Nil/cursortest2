package xsna;

import android.content.Context;

/* compiled from: SubscriptionDelegate.kt */
/* loaded from: classes17.dex */
public final class aym0 extends fhs0<Boolean> {
    public final /* synthetic */ gzs<s3q0> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aym0(Context context, gzs<s3q0> gzsVar) {
        super(context);
        this.d = gzsVar;
    }

    @Override // xsna.fhs0, io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        h03.b(th);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        this.d.invoke();
    }
}
