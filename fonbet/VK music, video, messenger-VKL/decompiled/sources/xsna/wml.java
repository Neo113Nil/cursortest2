package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ams0;
import xsna.iht0;
import xsna.jht0;
import xsna.u8f0;

/* compiled from: DefaultStrategy.kt */
/* loaded from: classes11.dex */
public final class wml implements ams0 {
    public boolean a;
    public boolean b;
    public long c;
    public float d;
    public float e;

    /* compiled from: DefaultStrategy.kt */
    /* loaded from: classes6.dex */
    public static final class a implements Comparator<iht0> {
        public final Map<iht0, jht0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<iht0, ? extends jht0> map) {
            this.b = map;
        }

        public static int a(iht0 iht0Var) {
            if (epx.f(iht0Var, iht0.e.a)) {
                return 4;
            }
            if (epx.f(iht0Var, iht0.d.a)) {
                return 3;
            }
            if (epx.f(iht0Var, iht0.b.a)) {
                return 2;
            }
            if (epx.f(iht0Var, iht0.a.a)) {
                return 1;
            }
            if (iht0Var instanceof iht0.c) {
                return 0;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // java.util.Comparator
        public final int compare(iht0 iht0Var, iht0 iht0Var2) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            iht0 iht0Var3 = iht0Var;
            iht0 iht0Var4 = iht0Var2;
            int g = epx.g(a(iht0Var3), a(iht0Var4));
            Integer valueOf = Integer.valueOf(g);
            if (g == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
            Map<iht0, jht0> map = this.b;
            jht0 jht0Var = map.get(iht0Var4);
            jht0.a aVar = jht0Var instanceof jht0.a ? (jht0.a) jht0Var : null;
            int i = Integer.MAX_VALUE;
            int intValue = (aVar == null || (num4 = aVar.d) == null) ? Integer.MAX_VALUE : num4.intValue();
            jht0 jht0Var2 = map.get(iht0Var3);
            jht0.a aVar2 = jht0Var2 instanceof jht0.a ? (jht0.a) jht0Var2 : null;
            int g2 = epx.g(intValue, (aVar2 == null || (num3 = aVar2.d) == null) ? Integer.MAX_VALUE : num3.intValue());
            Integer valueOf2 = Integer.valueOf(g2);
            if (g2 == 0) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                return valueOf2.intValue();
            }
            jht0 jht0Var3 = map.get(iht0Var4);
            jht0.a aVar3 = jht0Var3 instanceof jht0.a ? (jht0.a) jht0Var3 : null;
            int intValue2 = (aVar3 == null || (num2 = aVar3.e) == null) ? Integer.MAX_VALUE : num2.intValue();
            jht0 jht0Var4 = map.get(iht0Var3);
            jht0.a aVar4 = jht0Var4 instanceof jht0.a ? (jht0.a) jht0Var4 : null;
            if (aVar4 != null && (num = aVar4.e) != null) {
                i = num.intValue();
            }
            return epx.g(intValue2, i);
        }
    }

    public static boolean b(jht0 jht0Var) {
        float f;
        if (!jht0Var.isActive()) {
            return false;
        }
        jht0.a aVar = jht0Var instanceof jht0.a ? (jht0.a) jht0Var : null;
        if (aVar != null) {
            Float d = aVar.d();
            f = d != null ? d.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            f = 1.0f;
        }
        return f > 0.5f;
    }

    public static float c(Map map) {
        Float c;
        Float c2;
        Iterator it = map.values().iterator();
        Float f = null;
        if (it.hasNext()) {
            jht0 jht0Var = (jht0) it.next();
            jht0.a aVar = jht0Var instanceof jht0.a ? (jht0.a) jht0Var : null;
            float floatValue = (aVar == null || !aVar.isActive() || !aVar.e() || (c2 = aVar.c()) == null) ? 0.0f : c2.floatValue();
            while (it.hasNext()) {
                jht0 jht0Var2 = (jht0) it.next();
                jht0.a aVar2 = jht0Var2 instanceof jht0.a ? (jht0.a) jht0Var2 : null;
                floatValue = Math.max(floatValue, (aVar2 == null || !aVar2.isActive() || !aVar2.e() || (c = aVar2.c()) == null) ? 0.0f : c.floatValue());
            }
            f = Float.valueOf(floatValue);
        }
        return f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    @Override // xsna.ams0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ams0.a a(u8f0 u8f0Var, ArrayList arrayList, LinkedHashMap linkedHashMap, iht0 iht0Var) {
        ams0.a aVar;
        Object next;
        if (u8f0Var instanceof u8f0.b) {
            u8f0.b bVar = (u8f0.b) u8f0Var;
            float c = c(linkedHashMap);
            this.a = true;
            jht0 jht0Var = iht0Var != null ? (jht0) linkedHashMap.get(iht0Var) : null;
            if (!bVar.a() || (jht0Var != null && b(jht0Var))) {
                aVar = ams0.a.b.a;
            } else {
                if (this.b || c > 0.03d) {
                    aVar = new ams0.a.C2550a(new bms0(iht0Var, null, false, "Lagging + current focus is inactive"));
                }
                aVar = null;
            }
            if (aVar == null) {
                return aVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                jht0 jht0Var2 = (jht0) linkedHashMap.get((iht0) obj);
                if (jht0Var2 != null && b(jht0Var2)) {
                    arrayList2.add(obj);
                }
            }
            a aVar2 = new a(linkedHashMap);
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next = it.next();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (aVar2.compare(next, next2) < 0) {
                        next = next2;
                    }
                }
            } else {
                next = null;
            }
            iht0 iht0Var2 = (iht0) next;
            if (epx.f(iht0Var, iht0Var2)) {
                return ams0.a.b.a;
            }
            jht0 jht0Var3 = iht0Var != null ? (jht0) linkedHashMap.get(iht0Var) : null;
            jht0 jht0Var4 = iht0Var2 != null ? (jht0) linkedHashMap.get(iht0Var2) : null;
            return new ams0.a.C2550a(new bms0(iht0Var, iht0Var2, epx.f(jht0Var3 != null ? jht0Var3.a() : null, jht0Var4 != null ? jht0Var4.a() : null), iht0Var == null ? "No video played" : (jht0Var3 == null || !jht0Var3.isActive()) ? "Old video slot is inactive or removed" : iht0Var2 == null ? "All video slots are inactive" : "New top priority"));
        }
        if (!(u8f0Var instanceof u8f0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        u8f0.a aVar3 = (u8f0.a) u8f0Var;
        long a2 = aVar3.a() - this.c;
        this.c = aVar3.a();
        float c2 = c(linkedHashMap);
        float f = this.e;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && c2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.a) {
            aVar = ams0.a.b.a;
        } else {
            boolean z = a2 > 75;
            this.b = z;
            float f2 = this.d + a2;
            this.d = f2;
            float f3 = f + c2;
            this.e = f3;
            if (z || c2 > 0.03d) {
                this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                aVar = ams0.a.b.a;
            } else {
                if (iht0Var == null && this.a && f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 > 100.0f) {
                    this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.a = false;
                } else if (f2 > 750.0f || f3 > 0.75f) {
                    this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.a = false;
                } else {
                    aVar = ams0.a.b.a;
                }
                aVar = null;
            }
        }
        if (aVar == null) {
        }
    }
}
