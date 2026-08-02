package xsna;

import android.view.View;
import com.my.target.nativeads.views.NativeAdContainer;
import xsna.j11;
import xsna.kel0;

/* compiled from: StickyBannerAd.kt */
/* loaded from: classes6.dex */
public interface ydl0 {

    /* compiled from: StickyBannerAd.kt */
    public interface a {
        void a();

        void b(j11.b bVar);

        void c(ydl0 ydl0Var, b.AbstractC4094b.a aVar);

        void onClick();

        void onClose();
    }

    /* compiled from: StickyBannerAd.kt */
    public static abstract class b {

        /* compiled from: StickyBannerAd.kt */
        public static abstract class a<T extends kel0> extends b {
        }

        /* compiled from: StickyBannerAd.kt */
        /* renamed from: xsna.ydl0$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC4094b<T extends kel0> extends b {

            /* compiled from: StickyBannerAd.kt */
            /* renamed from: xsna.ydl0$b$b$a */
            public static final class a extends AbstractC4094b<kel0.a> {
                public final kel0.a a;

                public a(kel0.a aVar) {
                    this.a = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Ad(banner=" + this.a + ')';
                }
            }

            /* compiled from: StickyBannerAd.kt */
            /* renamed from: xsna.ydl0$b$b$b, reason: collision with other inner class name */
            public static final class C4095b extends AbstractC4094b<Object> {
            }

            public AbstractC4094b() {
                throw null;
            }
        }
    }

    void a();

    View b(jel0 jel0Var);

    void c();

    boolean d();

    void e(a aVar);

    b.AbstractC4094b.a f();

    NativeAdContainer g(View view);

    void load();
}
