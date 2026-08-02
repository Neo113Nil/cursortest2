package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Map;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class zk00<T> implements sgo<T> {
    public final Map<T, Float> a;

    public zk00(Map<T, Float> map) {
        this.a = map;
    }

    @Override // xsna.sgo
    public final T a(float f) {
        T next;
        Iterator<T> it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // xsna.sgo
    public final T b(float f, boolean z) {
        T next;
        Iterator<T> it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? floatValue - f : f - floatValue;
                if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? floatValue2 - f : f - floatValue2;
                    if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // xsna.sgo
    public final float c(T t) {
        Float f = this.a.get(t);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    @Override // xsna.sgo
    public final float d() {
        Float p0 = j5g.p0(this.a.values());
        if (p0 != null) {
            return p0.floatValue();
        }
        return Float.NaN;
    }

    @Override // xsna.sgo
    public final float e() {
        Float m0 = j5g.m0(this.a.values());
        if (m0 != null) {
            return m0.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk00)) {
            return false;
        }
        return epx.f(this.a, ((zk00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("MapDraggableAnchors("), this.a, ')');
    }
}
