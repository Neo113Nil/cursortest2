package xsna;

import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.vw3;

/* compiled from: AssertionTrackerRegistry.kt */
/* loaded from: classes8.dex */
public final class ww3 {
    public static final ww3 a = new ww3();
    public static final c b;
    public static final vw3 c;
    public static final LinkedHashMap d;
    public static sdi e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssertionTrackerRegistry.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a COLLISION;
        private final String value = "c";

        static {
            a aVar = new a();
            COLLISION = aVar;
            a[] aVarArr = {aVar};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    /* compiled from: AssertionTrackerRegistry.kt */
    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.a.equals(bVar.a);
        }

        public final int hashCode() {
            return this.a.hashCode() - 1096806818;
        }

        public final String toString() {
            return zr.a("Key(system=ov_sdk, subSystem=", this.a, ")");
        }
    }

    /* compiled from: AssertionTrackerRegistry.kt */
    public static final class c {
    }

    static {
        c cVar = new c();
        b = cVar;
        vw3 vw3Var = new vw3("assertion_tracker_collisions", new vw3.a(6), true);
        vw3Var.d = cVar;
        c = vw3Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(new b("assertion_tracker_collisions"), vw3Var);
        d = linkedHashMap;
    }

    public static vw3 a(String str) {
        Pair pair;
        ww3 ww3Var = a;
        vw3.a aVar = new vw3.a(7);
        b bVar = new b(str);
        synchronized (ww3Var) {
            try {
                LinkedHashMap linkedHashMap = d;
                boolean containsKey = linkedHashMap.containsKey(bVar);
                Boolean valueOf = Boolean.valueOf(containsKey);
                vw3 vw3Var = new vw3(str, aVar, !containsKey);
                if (!containsKey) {
                    vw3Var.d = b;
                    linkedHashMap.put(bVar, vw3Var);
                }
                pair = new Pair(valueOf, vw3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean booleanValue = ((Boolean) pair.d()).booleanValue();
        vw3 vw3Var2 = (vw3) pair.g();
        c.b(!booleanValue, a.COLLISION, new ng1(str, 2));
        return vw3Var2;
    }

    public static void b(sdi sdiVar) {
        e = sdiVar;
    }
}
