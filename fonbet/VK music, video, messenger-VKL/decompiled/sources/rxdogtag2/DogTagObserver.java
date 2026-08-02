package rxdogtag2;

import java.util.Objects;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import rxdogtag2.RxDogTag;
import xsna.wcn;

/* loaded from: classes11.dex */
final class DogTagObserver<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.observers.c {
    private final RxDogTag.Configuration config;
    private final io.reactivex.rxjava3.core.v<T> delegate;
    private final Throwable t = new Throwable();

    public DogTagObserver(RxDogTag.Configuration configuration, io.reactivex.rxjava3.core.v<T> vVar) {
        this.config = configuration;
        this.delegate = vVar;
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
    public /* synthetic */ void lambda$onSubscribe$1(io.reactivex.rxjava3.disposables.c cVar) {
        this.delegate.onSubscribe(cVar);
    }

    @Override // io.reactivex.rxjava3.observers.c
    public boolean hasCustomOnError() {
        io.reactivex.rxjava3.core.v<T> vVar = this.delegate;
        return (vVar instanceof io.reactivex.rxjava3.observers.c) && ((io.reactivex.rxjava3.observers.c) vVar).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.v
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        RxDogTag.NonCheckingConsumer nonCheckingConsumer = new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.s
            @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
            public final void accept(Object obj) {
                DogTagObserver.this.lambda$onComplete$6((Throwable) obj);
            }
        };
        io.reactivex.rxjava3.core.v<T> vVar = this.delegate;
        Objects.requireNonNull(vVar);
        RxDogTag.guardedDelegateCall(nonCheckingConsumer, new wcn(vVar, 1));
    }

    @Override // io.reactivex.rxjava3.core.v
    public void onError(final Throwable th) {
        io.reactivex.rxjava3.core.v<T> vVar = this.delegate;
        if (!(vVar instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
            return;
        }
        if (vVar instanceof RxDogTagTaggedExceptionReceiver) {
            vVar.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.o
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onError$4((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.p
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagObserver.this.lambda$onError$5(th);
                }
            });
        } else {
            vVar.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public void onNext(final T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.q
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onNext$2((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.r
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagObserver.this.lambda$onNext$3(t);
                }
            });
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public void onSubscribe(final io.reactivex.rxjava3.disposables.c cVar) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.m
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.n
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagObserver.this.lambda$onSubscribe$1(cVar);
                }
            });
        } else {
            this.delegate.onSubscribe(cVar);
        }
    }
}
