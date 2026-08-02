package xsna;

import com.vk.reefton.literx.observable.ObservableBuffer;
import com.vk.reefton.literx.observable.ObservableFilter;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.literx.sbjects.ReplaySubject;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import ru.ok.android.commons.http.Http;

/* compiled from: ReefBufferedDataSender.kt */
/* loaded from: classes5.dex */
public final class anf0 implements gnf0 {
    public final som0 a;
    public final hnf0 b;
    public final fnf0 c;
    public final aof0 d;
    public final bof0 e;
    public final b8h0 f;
    public boolean g;
    public final PublishSubject<vof0> h = new PublishSubject<>();
    public final PublishSubject<Pair<byte[], Integer>> i = new PublishSubject<>();
    public final AtomicInteger j = new AtomicInteger(0);

    public anf0(som0 som0Var, hnf0 hnf0Var, fnf0 fnf0Var, aof0 aof0Var, bof0 bof0Var, b8h0 b8h0Var) {
        this.a = som0Var;
        this.b = hnf0Var;
        this.c = fnf0Var;
        this.d = aof0Var;
        this.e = bof0Var;
        this.f = b8h0Var;
    }

    @Override // xsna.gnf0
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.c.getClass();
        ReplaySubject replaySubject = (ReplaySubject) this.a.b;
        replaySubject.getClass();
        b8h0 b8h0Var = this.f;
        new ObservableObserveOn(new ObservableSubscribeOn(replaySubject, b8h0Var), b8h0Var).c(new ut30(this, 13), new h630(this, 24));
        PublishSubject<vof0> publishSubject = this.h;
        publishSubject.getClass();
        ObservableObserveOn observableObserveOn = new ObservableObserveOn(new ObservableSubscribeOn(publishSubject, b8h0Var), b8h0Var);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        new ObservableFilter(new ObservableBuffer(observableObserveOn, 5000L, this.f, 5), new d4r(23)).b(new pod0(this, 2));
        PublishSubject<Pair<byte[], Integer>> publishSubject2 = this.i;
        publishSubject2.getClass();
        new ObservableFilter(new ObservableBuffer(new ObservableObserveOn(new ObservableSubscribeOn(publishSubject2, b8h0Var), b8h0Var), 5000L, this.f, 5), new tuq(28)).b(new m360(this, 14));
    }

    public final boolean b(String str) {
        String url = this.c.getUrl();
        if (url == null) {
            url = "https://reef.vk-cdn.net/stat/v1/ev";
        }
        byte[] a = this.e.a(url, str, Http.ContentType.APPLICATION_X_WWW_FORM_URLENCODED);
        this.d.d("Reef Response:\n".concat(a != null ? new String(a, emb.b) : "null"), true);
        return (a == null || a.length == 0) ? false : true;
    }
}
