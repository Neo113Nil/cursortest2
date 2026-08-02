package rxdogtag2;

import java.util.Objects;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import rxdogtag2.RxDogTag;
import xsna.axm0;
import xsna.jxm0;
import xsna.wk;

/* loaded from: classes9.dex */
final class DogTagSubscriber<T> implements io.reactivex.rxjava3.core.j<T>, io.reactivex.rxjava3.observers.c {
    private final RxDogTag.Configuration config;
    private final axm0<T> delegate;
    private final Throwable t = new Throwable();

    public DogTagSubscriber(RxDogTag.Configuration configuration, axm0<T> axm0Var) {
        this.config = configuration;
        this.delegate = axm0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$6(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, BatchApiRequest.FIELD_NAME_ON_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onNext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$3(Object obj) {
        this.delegate.onNext(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(jxm0 jxm0Var) {
        this.delegate.onSubscribe(jxm0Var);
    }

    @Override // io.reactivex.rxjava3.observers.c
    public boolean hasCustomOnError() {
        axm0<T> axm0Var = this.delegate;
        return (axm0Var instanceof io.reactivex.rxjava3.observers.c) && ((io.reactivex.rxjava3.observers.c) axm0Var).hasCustomOnError();
    }

    @Override // xsna.axm0
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        RxDogTag.NonCheckingConsumer nonCheckingConsumer = new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.z
            @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
            public final void accept(Object obj) {
                DogTagSubscriber.this.lambda$onComplete$6((Throwable) obj);
            }
        };
        axm0<T> axm0Var = this.delegate;
        Objects.requireNonNull(axm0Var);
        RxDogTag.guardedDelegateCall(nonCheckingConsumer, new wk(axm0Var, 10));
    }

    @Override // xsna.axm0
    public void onError(final Throwable th) {
        axm0<T> axm0Var = this.delegate;
        if (!(axm0Var instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
            return;
        }
        if (axm0Var instanceof RxDogTagTaggedExceptionReceiver) {
            axm0Var.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.e0
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSubscriber.this.lambda$onError$4((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.f0
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSubscriber.this.lambda$onError$5(th);
                }
            });
        } else {
            axm0Var.onError(th);
        }
    }

    @Override // xsna.axm0
    public void onNext(final T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.a0
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSubscriber.this.lambda$onNext$2((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.b0
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSubscriber.this.lambda$onNext$3(t);
                }
            });
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // xsna.axm0
    public void onSubscribe(final jxm0 jxm0Var) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.c0
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSubscriber.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.d0
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSubscriber.this.lambda$onSubscribe$1(jxm0Var);
                }
            });
        } else {
            this.delegate.onSubscribe(jxm0Var);
        }
    }
}
