package xsna;

import com.vk.audience.api.di.AudienceResearchComponent;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: NewsfeedListViewAudienceResearchScreenTracker.kt */
/* loaded from: classes4.dex */
public final class hs60 {
    public final Set<String> a;
    public final bin0<String> b;
    public final Object c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public io.reactivex.rxjava3.disposables.c e;

    public hs60(Set<String> set, bin0<String> bin0Var, Lazy<? extends AudienceResearchComponent> lazy) {
        this.a = set;
        this.b = bin0Var;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new c950(lazy, 5));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        if (this.a.contains(this.b.get()) && this.d.compareAndSet(false, true)) {
            this.e = itg0.l(xa4.m((ua4) this.c.getValue(), 1000L, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, xa4.c, new aq0(10)).q(asu0.a.c()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        if (this.d.compareAndSet(true, false)) {
            io.reactivex.rxjava3.core.a a = ((ua4) this.c.getValue()).a();
            a.getClass();
            itg0.j(new io.reactivex.rxjava3.internal.operators.completable.v(a, io.reactivex.rxjava3.internal.functions.a.g).q(asu0.a.c()), null, 3);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = null;
    }
}
