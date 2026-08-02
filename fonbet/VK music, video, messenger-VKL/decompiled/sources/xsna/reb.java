package xsna;

import com.vk.im.engine.models.channels.ChannelsCounters;

/* compiled from: ChannelsCountersObserver.kt */
/* loaded from: classes16.dex */
public interface reb {
    public static final a a = a.a;

    io.reactivex.rxjava3.core.q<ChannelsCounters> H();

    void c();

    void d();

    void destroy();

    /* compiled from: ChannelsCountersObserver.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C3606a b = new C3606a();

        /* compiled from: ChannelsCountersObserver.kt */
        /* renamed from: xsna.reb$a$a, reason: collision with other inner class name */
        public static final class C3606a implements reb {
            public final io.reactivex.rxjava3.internal.operators.observable.g1 b;

            public C3606a() {
                ChannelsCounters.f.getClass();
                this.b = io.reactivex.rxjava3.core.q.T(ChannelsCounters.a.a());
            }

            @Override // xsna.reb
            public final io.reactivex.rxjava3.core.q<ChannelsCounters> H() {
                return this.b;
            }

            @Override // xsna.reb
            public final void c() {
            }

            @Override // xsna.reb
            public final void d() {
            }

            @Override // xsna.reb
            public final void destroy() {
            }
        }
    }
}
