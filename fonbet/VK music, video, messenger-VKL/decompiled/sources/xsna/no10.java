package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: MaxMessengerPollingInteractor.kt */
/* loaded from: classes15.dex */
public final class no10 {
    public final io.reactivex.rxjava3.internal.operators.observable.q2 a(String str, String str2, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.observable.q2(new io.reactivex.rxjava3.internal.operators.observable.o0(io.reactivex.rxjava3.core.q.P(z ? 0L : 3000L, 3000L, TimeUnit.MILLISECONDS), new oyr(new a0e(this, str2, str), 5)), new dnz(new nyq(12), 1));
    }
}
