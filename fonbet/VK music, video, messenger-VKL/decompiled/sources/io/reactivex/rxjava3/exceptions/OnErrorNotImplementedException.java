package io.reactivex.rxjava3.exceptions;

import xsna.ms9;

/* loaded from: classes11.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(Throwable th) {
        super(ms9.b("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", th), th == null ? new NullPointerException() : th);
    }
}
