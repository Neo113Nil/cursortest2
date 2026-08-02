package xsna;

import android.os.SystemClock;
import com.vk.dto.common.DownloadingState;
import com.vk.mvi.core.internal.executors.ThreadType;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: AggregatedDownloadingStateUpdater.kt */
/* loaded from: classes3.dex */
public final class w71 {
    public final long a;
    public final wzs<String, DownloadingState, s3q0> b;
    public final izs<Map<String, ? extends DownloadingState>, s3q0> c;
    public final io.reactivex.rxjava3.disposables.g d = new io.reactivex.rxjava3.disposables.g(EmptyDisposable.INSTANCE);
    public final LinkedHashMap e = new LinkedHashMap();
    public long f;

    /* JADX WARN: Multi-variable type inference failed */
    public w71(long j, wzs<? super String, ? super DownloadingState, s3q0> wzsVar, izs<? super Map<String, ? extends DownloadingState>, s3q0> izsVar) {
        this.a = j;
        this.b = wzsVar;
        this.c = izsVar;
    }

    public final void a(String str, DownloadingState downloadingState) {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType[] threadTypeArr = {ThreadType.MAIN};
        aVar.getClass();
        ThreadType.a.a(threadTypeArr);
        boolean z = downloadingState instanceof DownloadingState.Downloading;
        wzs<String, DownloadingState, s3q0> wzsVar = this.b;
        LinkedHashMap linkedHashMap = this.e;
        if (!z) {
            linkedHashMap.remove(str);
            wzsVar.invoke(str, downloadingState);
            this.f = SystemClock.uptimeMillis();
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f;
        long j = this.a;
        if (uptimeMillis > j) {
            wzsVar.invoke(str, downloadingState);
            this.f = SystemClock.uptimeMillis();
            return;
        }
        linkedHashMap.put(str, downloadingState);
        io.reactivex.rxjava3.disposables.g gVar = this.d;
        io.reactivex.rxjava3.disposables.c a = gVar.a();
        if (a == null || !a.h()) {
            return;
        }
        gVar.b(io.reactivex.rxjava3.core.a.s(j, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new v71(this, 0)));
    }

    public final void b(LinkedHashMap linkedHashMap) {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType[] threadTypeArr = {ThreadType.MAIN};
        aVar.getClass();
        ThreadType.a.a(threadTypeArr);
        p4g.o(linkedHashMap.keySet(), this.e);
        this.c.invoke(linkedHashMap);
        this.f = SystemClock.uptimeMillis();
    }
}
