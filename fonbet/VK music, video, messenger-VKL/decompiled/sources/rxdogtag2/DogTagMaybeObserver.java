package rxdogtag2;

import java.util.Objects;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import rxdogtag2.RxDogTag;
import xsna.r44;

/* loaded from: classes9.dex */
final class DogTagMaybeObserver<T> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.observers.c {
    private final RxDogTag.Configuration config;
    private final io.reactivex.rxjava3.core.m<T> delegate;
    private final Throwable t = new Throwable();

    public DogTagMaybeObserver(RxDogTag.Configuration configuration, io.reactivex.rxjava3.core.m<T> mVar) {
        this.config = configuration;
        this.delegate = mVar;
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
        io.reactivex.rxjava3.core.m<T> mVar = this.delegate;
        return (mVar instanceof io.reactivex.rxjava3.observers.c) && ((io.reactivex.rxjava3.observers.c) mVar).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        RxDogTag.NonCheckingConsumer nonCheckingConsumer = new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.h
            @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
            public final void accept(Object obj) {
                DogTagMaybeObserver.this.lambda$onComplete$6((Throwable) obj);
            }
        };
        io.reactivex.rxjava3.core.m<T> mVar = this.delegate;
        Objects.requireNonNull(mVar);
        RxDogTag.guardedDelegateCall(nonCheckingConsumer, new r44(mVar, 11));
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
    public void onError(final Throwable th) {
        io.reactivex.rxjava3.core.m<T> mVar = this.delegate;
        if (!(mVar instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
            return;
        }
        if (mVar instanceof RxDogTagTaggedExceptionReceiver) {
            mVar.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.i
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagMaybeObserver.this.lambda$onError$4((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.j
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagMaybeObserver.this.lambda$onError$5(th);
                }
            });
        } else {
            mVar.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
    public void onSubscribe(final io.reactivex.rxjava3.disposables.c cVar) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.k
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagMaybeObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.l
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagMaybeObserver.this.lambda$onSubscribe$1(cVar);
                }
            });
        } else {
            this.delegate.onSubscribe(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
    public void onSuccess(final T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.f
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagMaybeObserver.this.lambda$onSuccess$2((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.g
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagMaybeObserver.this.lambda$onSuccess$3(t);
                }
            });
        } else {
            this.delegate.onSuccess(t);
        }
    }
}
