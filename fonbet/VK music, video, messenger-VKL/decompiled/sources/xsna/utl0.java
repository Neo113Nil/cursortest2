package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;

/* compiled from: StoriesMyTargetAdPrefetcher.kt */
/* loaded from: classes11.dex */
public interface utl0 {
    public static final b a = b.a;

    /* compiled from: StoriesMyTargetAdPrefetcher.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final Integer a;
        public final zu50 b;

        public a(Integer num, zu50 zu50Var) {
            this.a = num;
            this.b = zu50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            return "AdClickEvent(viewId=" + this.a + ", nativeAd=" + this.b + ')';
        }
    }

    /* compiled from: StoriesMyTargetAdPrefetcher.kt */
    /* loaded from: classes6.dex */
    public static abstract class c {

        /* compiled from: StoriesMyTargetAdPrefetcher.kt */
        public static abstract class a extends c {
            public final zu50 a;

            /* compiled from: StoriesMyTargetAdPrefetcher.kt */
            /* renamed from: xsna.utl0$c$a$a, reason: collision with other inner class name */
            public static final class C3829a extends a {
                public final zu50 b;
                public final IllegalStateException c;

                public C3829a(zu50 zu50Var, IllegalStateException illegalStateException) {
                    super(zu50Var);
                    this.b = zu50Var;
                    this.c = illegalStateException;
                }

                @Override // xsna.utl0.c.a
                public final zu50 a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3829a)) {
                        return false;
                    }
                    C3829a c3829a = (C3829a) obj;
                    return this.b.equals(c3829a.b) && this.c.equals(c3829a.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    return "Error(nativeAd=" + this.b + ", e=" + this.c + ')';
                }
            }

            /* compiled from: StoriesMyTargetAdPrefetcher.kt */
            public static final class b extends a {
                public final zu50 b;

                public b(zu50 zu50Var) {
                    super(zu50Var);
                    this.b = zu50Var;
                }

                @Override // xsna.utl0.c.a
                public final zu50 a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Finish(nativeAd=" + this.b + ')';
                }
            }

            /* compiled from: StoriesMyTargetAdPrefetcher.kt */
            /* renamed from: xsna.utl0$c$a$c, reason: collision with other inner class name */
            public static final class C3830c extends a {
                public final zu50 b;

                public C3830c(zu50 zu50Var) {
                    super(zu50Var);
                    this.b = zu50Var;
                }

                @Override // xsna.utl0.c.a
                public final zu50 a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3830c) && epx.f(this.b, ((C3830c) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Start(nativeAd=" + this.b + ')';
                }
            }

            public a(zu50 zu50Var) {
                this.a = zu50Var;
            }

            public zu50 a() {
                return this.a;
            }
        }

        /* compiled from: StoriesMyTargetAdPrefetcher.kt */
        public static final class b extends c {
            public final zu50 a;

            public b(zu50 zu50Var) {
                this.a = zu50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Shown(nativeAd=" + this.a + ')';
            }
        }

        /* compiled from: StoriesMyTargetAdPrefetcher.kt */
        /* renamed from: xsna.utl0$c$c, reason: collision with other inner class name */
        public static abstract class AbstractC3831c extends c {
            public final zu50 a;

            /* compiled from: StoriesMyTargetAdPrefetcher.kt */
            /* renamed from: xsna.utl0$c$c$a */
            public static final class a extends AbstractC3831c {
                public final zu50 b;

                public a(zu50 zu50Var) {
                    super(zu50Var);
                    this.b = zu50Var;
                }

                @Override // xsna.utl0.c.AbstractC3831c
                public final zu50 a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Down(nativeAd=" + this.b + ')';
                }
            }

            /* compiled from: StoriesMyTargetAdPrefetcher.kt */
            /* renamed from: xsna.utl0$c$c$b */
            public static final class b extends AbstractC3831c {
                public final zu50 b;

                public b(zu50 zu50Var) {
                    super(zu50Var);
                    this.b = zu50Var;
                }

                @Override // xsna.utl0.c.AbstractC3831c
                public final zu50 a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Up(nativeAd=" + this.b + ')';
                }
            }

            public AbstractC3831c(zu50 zu50Var) {
                this.a = zu50Var;
            }

            public zu50 a() {
                return this.a;
            }
        }
    }

    void a();

    ysg0<c.b> b();

    io.reactivex.rxjava3.core.a c(StoryEntry storyEntry, MyTargetAdStoriesContainer myTargetAdStoriesContainer);

    ysg0<a> d();

    ysg0<c.AbstractC3831c> e();

    void f(StoryEntry storyEntry, MyTargetAdStoriesContainer myTargetAdStoriesContainer);

    ttl0 g(StoryEntry storyEntry);

    ysg0<c.a> h();

    /* compiled from: StoriesMyTargetAdPrefetcher.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public static final /* synthetic */ b a = new b();
        private static final utl0 STUB = new a();

        public final utl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesMyTargetAdPrefetcher.kt */
        public static final class a implements utl0 {
            public final ysg0<a> b = new ysg0<>();
            public final ysg0<c.a> c = new ysg0<>();
            public final ysg0<c.AbstractC3831c> d = new ysg0<>();
            public final ysg0<c.b> e = new ysg0<>();

            @Override // xsna.utl0
            public final ysg0<c.b> b() {
                return this.e;
            }

            @Override // xsna.utl0
            public final io.reactivex.rxjava3.core.a c(StoryEntry storyEntry, MyTargetAdStoriesContainer myTargetAdStoriesContainer) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.utl0
            public final ysg0<a> d() {
                return this.b;
            }

            @Override // xsna.utl0
            public final ysg0<c.AbstractC3831c> e() {
                return this.d;
            }

            @Override // xsna.utl0
            public final ttl0 g(StoryEntry storyEntry) {
                return null;
            }

            @Override // xsna.utl0
            public final ysg0<c.a> h() {
                return this.c;
            }

            @Override // xsna.utl0
            public final void a() {
            }

            @Override // xsna.utl0
            public final void f(StoryEntry storyEntry, MyTargetAdStoriesContainer myTargetAdStoriesContainer) {
            }
        }
    }
}
