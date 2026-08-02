package org.chromium.base.supplier;

import java.util.Iterator;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.ObserverList;
import org.chromium.base.ThreadUtils;
import org.chromium.base.supplier.ObservableSupplier;
import xsna.vke;

/* loaded from: classes8.dex */
public class ObservableSupplierImpl<E> implements ObservableSupplier<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private E mObject;
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();
    protected final ObserverList<Callback<E>> mObservers = new ObserverList<>();

    public ObservableSupplierImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$0(Object obj, Callback callback) {
        if (this.mObject == obj && this.mObservers.hasObserver(callback)) {
            callback.lambda$bind$0(obj);
        }
    }

    private static boolean shouldNotifyOnAdd(@ObservableSupplier.NotifyBehavior int i) {
        return (i & 1) != 0;
    }

    private static boolean shouldPostOnAdd(int i) {
        return (i & 2) != 0;
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public E addObserver(Callback<E> callback, @ObservableSupplier.NotifyBehavior int i) {
        E e;
        this.mObservers.addObserver(callback);
        if (shouldNotifyOnAdd(i) && (e = this.mObject) != null) {
            if (shouldPostOnAdd(i)) {
                ThreadUtils.assertOnUiThread();
                ThreadUtils.postOnUiThread(new vke(this, e, callback, 2));
            } else {
                callback.lambda$bind$0(e);
            }
        }
        return this.mObject;
    }

    @Override // java.util.function.Supplier
    public E get() {
        this.mThreadChecker.assertOnValidOrInstrumentationThread();
        return this.mObject;
    }

    public boolean hasObservers() {
        return !this.mObservers.isEmpty();
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public void removeObserver(Callback<E> callback) {
        this.mObservers.removeObserver(callback);
    }

    public void set(E e) {
        this.mThreadChecker.assertOnValidThread();
        if (Objects.equals(e, this.mObject)) {
            return;
        }
        this.mObject = e;
        Iterator<Callback<E>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            it.next().lambda$bind$0(e);
        }
    }

    public ObservableSupplierImpl(E e) {
        this.mObject = e;
    }
}
