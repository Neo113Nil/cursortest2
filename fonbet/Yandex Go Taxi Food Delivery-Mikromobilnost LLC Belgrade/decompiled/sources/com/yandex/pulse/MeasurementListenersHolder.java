package com.yandex.pulse;

import android.os.Looper;
import defpackage.ja10;
import defpackage.jl40;
import defpackage.na10;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\f\u0010\u0003R$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\u0006`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/yandex/pulse/MeasurementListenersHolder;", "Lna10;", "<init>", "()V", "Lzy11;", "checkMainThread", "Lja10;", "listener", "", "addListener", "(Lja10;)Z", "removeListener", "removeAllListeners", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "measurementListeners", "Ljava/util/ArrayList;", "", "getListeners", "()Ljava/util/List;", "listeners", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MeasurementListenersHolder implements na10 {
    private final ArrayList<ja10> measurementListeners = new ArrayList<>();

    private final void checkMainThread() {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        ny61.r("must be called on the main thread");
    }

    public boolean addListener(ja10 listener) {
        checkMainThread();
        return this.measurementListeners.add(listener);
    }

    public final List<ja10> getListeners() {
        checkMainThread();
        return this.measurementListeners;
    }

    public void removeAllListeners() {
        checkMainThread();
        this.measurementListeners.clear();
    }

    public boolean removeListener(ja10 listener) {
        checkMainThread();
        return this.measurementListeners.remove(listener);
    }
}
