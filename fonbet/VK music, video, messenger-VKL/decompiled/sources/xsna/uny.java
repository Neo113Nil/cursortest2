package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.motion.light.engine.exception.MotionLayoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import xsna.aa30;

/* compiled from: LayoutDelegate.kt */
/* loaded from: classes7.dex */
public final class uny {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;
    public a d;
    public aa30 e;
    public final vpy f = new vpy(new h1j(this, 20));

    /* compiled from: LayoutDelegate.kt */
    public interface a {

        /* compiled from: LayoutDelegate.kt */
        /* renamed from: xsna.uny$a$a, reason: collision with other inner class name */
        public static final class C3814a implements a {
            public final nmp0 a;
            public final Pair<Float, pny<?>> b;
            public final Pair<Float, pny<?>> c;
            public final float d;

            /* JADX WARN: Multi-variable type inference failed */
            public C3814a(nmp0 nmp0Var, Pair<Float, ? extends pny<?>> pair, Pair<Float, ? extends pny<?>> pair2, float f) {
                this.a = nmp0Var;
                this.b = pair;
                this.c = pair2;
                this.d = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3814a)) {
                    return false;
                }
                C3814a c3814a = (C3814a) obj;
                return epx.f(this.a, c3814a.a) && epx.f(this.b, c3814a.b) && epx.f(this.c, c3814a.c) && Float.compare(this.d, c3814a.d) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Animation(transitionId=");
                sb.append(this.a);
                sb.append(", progressWithFirstFrame=");
                sb.append(this.b);
                sb.append(", progressWithSecondFrame=");
                sb.append(this.c);
                sb.append(", progress=");
                return xq.c(')', this.d, sb);
            }
        }

        /* compiled from: LayoutDelegate.kt */
        public static final class b implements a {
            public final ob30<?> a;

            public b(ob30<?> ob30Var) {
                this.a = ob30Var;
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
                return "Final(layoutBuilder=" + this.a + ')';
            }
        }
    }

    public uny(nb30 nb30Var, HashMap hashMap, HashMap hashMap2, ArrayList arrayList) {
        this.a = hashMap;
        this.b = hashMap2;
        this.c = arrayList;
        this.d = new a.b((ob30) hashMap.get(nb30Var));
        this.e = new aa30.a(nb30Var);
    }

    public final a.C3814a a(aa30.b bVar) {
        ei eiVar = bVar.a;
        float f = bVar.b;
        vmp0 vmp0Var = (vmp0) this.b.get(eiVar.a);
        if (vmp0Var == null) {
            throw new MotionLayoutException("Transition with " + eiVar.a + " is not found");
        }
        TreeMap treeMap = vmp0Var.c;
        ob30 b = b(eiVar.b);
        ob30 b2 = b(eiVar.c);
        nmp0 nmp0Var = vmp0Var.a.a;
        Object obj = null;
        Object obj2 = null;
        for (Object obj3 : treeMap.entrySet()) {
            if (((Number) ((Map.Entry) obj3).getKey()).floatValue() / 100.0f < f) {
                obj2 = obj3;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        Pair pair = entry != null ? new Pair(Float.valueOf(((Number) entry.getKey()).floatValue() / 100.0f), entry.getValue()) : new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), b);
        Iterator it = treeMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) ((Map.Entry) next).getKey()).floatValue() / 100.0f >= f) {
                obj = next;
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        Pair pair2 = entry2 != null ? new Pair(Float.valueOf(((Number) entry2.getKey()).floatValue() / 100.0f), entry2.getValue()) : new Pair(Float.valueOf(1.0f), b2);
        a.C3814a c3814a = new a.C3814a(nmp0Var, pair, pair2, f);
        ((pny) pair.j()).c();
        ((pny) pair2.j()).c();
        return c3814a;
    }

    public final ob30 b(nb30 nb30Var) {
        ob30 ob30Var = (ob30) this.a.get(nb30Var);
        if (ob30Var != null) {
            return ob30Var;
        }
        throw new MotionLayoutException("State with id " + nb30Var + " does not provide layout builder");
    }
}
