package xsna;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.random.Random;

/* compiled from: ClipsLikesMovementAnimation.kt */
/* loaded from: classes17.dex */
public final class kje {
    public final y6c a;
    public a b;
    public Pair<Float, Float> c;
    public Pair<Float, Float> d;
    public Pair<Float, Float> e;
    public final Object f;

    /* compiled from: ClipsLikesMovementAnimation.kt */
    public static final class a {
        public final q500 a;
        public final Pair<Float, Float> b;

        public a(q500 q500Var, Pair<Float, Float> pair) {
            this.a = q500Var;
            this.b = pair;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "MovementConfig(durationMsRange=" + this.a + ", travelDistanceBounds=" + this.b + ')';
        }
    }

    public kje(y6c y6cVar) {
        this.a = y6cVar;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.c = new Pair<>(valueOf, valueOf);
        this.d = new Pair<>(valueOf, valueOf);
        this.e = new Pair<>(valueOf, valueOf);
        this.f = msy.a(LazyThreadSafetyMode.NONE, new ah(this, 27));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(a aVar) {
        Pair pair = new Pair(Long.valueOf(aVar.a.b), Long.valueOf(aVar.a.c));
        long longValue = ((Number) pair.d()).longValue();
        long longValue2 = ((Number) pair.g()).longValue();
        ValueAnimator valueAnimator = (ValueAnimator) this.f.getValue();
        Random.b.getClass();
        gg ggVar = Random.c;
        valueAnimator.setDuration(ggVar.o(longValue, longValue2));
        float g = (float) (ggVar.g() * 6.283185307179586d);
        Pair<Float, Float> pair2 = aVar.b;
        float floatValue = pair2.d().floatValue();
        float floatValue2 = pair2.g().floatValue();
        float f = floatValue * floatValue;
        float sqrt = (float) Math.sqrt((((floatValue2 * floatValue2) - f) * ggVar.i()) + f);
        double d = g;
        float cos = ((float) Math.cos(d)) * sqrt;
        float sin = sqrt * ((float) Math.sin(d));
        this.d = this.c;
        this.e = new Pair<>(Float.valueOf(cos), Float.valueOf(sin));
    }
}
