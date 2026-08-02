package rxdogtag2;

import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import rxdogtag2.RxDogTag;

/* loaded from: classes11.dex */
final class DogTagSingleObserver<T> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.observers.c {
    private final RxDogTag.Configuration config;
    private final io.reactivex.rxjava3.core.z<T> delegate;
    private final Throwable t = new Throwable();

    public DogTagSingleObserver(RxDogTag.Configuration configuration, io.reactivex.rxjava3.core.z<T> zVar) {
        this.config = configuration;
        this.delegate = zVar;
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
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(io.reactivex.rxjava3.disposables.c cVar) {
        this.delegate.onSubscribe(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$3(Object obj) {
        this.delegate.onSuccess(obj);
    }

    @Override // io.reactivex.rxjava3.observers.c
    public boolean hasCustomOnError() {
        io.reactivex.rxjava3.core.z<T> zVar = this.delegate;
        return (zVar instanceof io.reactivex.rxjava3.observers.c) && ((io.reactivex.rxjava3.observers.c) zVar).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.z
    public void onError(final Throwable th) {
        io.reactivex.rxjava3.core.z<T> zVar = this.delegate;
        if (!(zVar instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
            return;
        }
        if (zVar instanceof RxDogTagTaggedExceptionReceiver) {
            zVar.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.v
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSingleObserver.this.lambda$onError$4((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.w
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSingleObserver.this.lambda$onError$5(th);
                }
            });
        } else {
            zVar.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public void onSubscribe(final io.reactivex.rxjava3.disposables.c cVar) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.x
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSingleObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.y
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSingleObserver.this.lambda$onSubscribe$1(cVar);
                }
            });
        } else {
            this.delegate.onSubscribe(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public void onSuccess(final T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.t
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagSingleObserver.this.lambda$onSuccess$2((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.u
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagSingleObserver.this.lambda$onSuccess$3(t);
                }
            });
        } else {
            this.delegate.onSuccess(t);
        }
    }
}
