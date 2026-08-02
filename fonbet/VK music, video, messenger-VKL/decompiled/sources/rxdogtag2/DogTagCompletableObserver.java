package rxdogtag2;

import java.util.Objects;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import rxdogtag2.RxDogTag;
import xsna.jvn;

/* loaded from: classes11.dex */
final class DogTagCompletableObserver implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.observers.c {
    private final RxDogTag.Configuration config;
    private final io.reactivex.rxjava3.core.c delegate;
    private final Throwable t = new Throwable();

    public DogTagCompletableObserver(RxDogTag.Configuration configuration, io.reactivex.rxjava3.core.c cVar) {
        this.config = configuration;
        this.delegate = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$4(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, BatchApiRequest.FIELD_NAME_ON_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$3(Throwable th) {
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

    @Override // io.reactivex.rxjava3.observers.c
    public boolean hasCustomOnError() {
        io.reactivex.rxjava3.core.c cVar = this.delegate;
        return (cVar instanceof io.reactivex.rxjava3.observers.c) && ((io.reactivex.rxjava3.observers.c) cVar).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.c
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        RxDogTag.NonCheckingConsumer nonCheckingConsumer = new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.e
            @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
            public final void accept(Object obj) {
                DogTagCompletableObserver.this.lambda$onComplete$4((Throwable) obj);
            }
        };
        io.reactivex.rxjava3.core.c cVar = this.delegate;
        Objects.requireNonNull(cVar);
        RxDogTag.guardedDelegateCall(nonCheckingConsumer, new jvn(cVar, 0));
    }

    @Override // io.reactivex.rxjava3.core.c
    public void onError(final Throwable th) {
        io.reactivex.rxjava3.core.c cVar = this.delegate;
        if (!(cVar instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.t, th, null);
            return;
        }
        if (cVar instanceof RxDogTagTaggedExceptionReceiver) {
            cVar.onError(RxDogTag.createException(this.config, this.t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.c
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagCompletableObserver.this.lambda$onError$2((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.d
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagCompletableObserver.this.lambda$onError$3(th);
                }
            });
        } else {
            cVar.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.c
    public void onSubscribe(final io.reactivex.rxjava3.disposables.c cVar) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new RxDogTag.NonCheckingConsumer() { // from class: rxdogtag2.a
                @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
                public final void accept(Object obj) {
                    DogTagCompletableObserver.this.lambda$onSubscribe$0((Throwable) obj);
                }
            }, new Runnable() { // from class: rxdogtag2.b
                @Override // java.lang.Runnable
                public final void run() {
                    DogTagCompletableObserver.this.lambda$onSubscribe$1(cVar);
                }
            });
        } else {
            this.delegate.onSubscribe(cVar);
        }
    }
}
