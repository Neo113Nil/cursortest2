package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;

/* compiled from: InactiveTaskInteractor.kt */
/* loaded from: classes4.dex */
public final class lsw {
    public final ArrayList a = new ArrayList();
    public final bpn0 b = new bpn0(new pd4(15));

    /* compiled from: InactiveTaskInteractor.kt */
    public static final class a {
        public final boolean a;
        public final long b;
        public final int c;
        public final izs<Long, Long> d;
        public final long e;
        public final Set<b> f;
        public final Set<b> g;
        public final Set<b> h;
        public final Set<b> i;

        public a() {
            this(0L, null, 0L, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + fw3.b(fw3.b(fw3.b(bh10.a(dq.c(shy.a(this.c, bh10.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, false), 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InactiveTaskConfig(isExecuteOnMainThread=");
            sb.append(this.a);
            sb.append(", isStartByTrigger=false, initDelay=");
            sb.append(this.b);
            sb.append(", repeatCount=");
            sb.append(this.c);
            sb.append(", repeatDelayProvider=");
            sb.append(this.d);
            sb.append(", maxDelay=");
            sb.append(this.e);
            sb.append(", startTriggerActions=");
            sb.append(this.f);
            sb.append(", stopTriggerActions=");
            sb.append(this.g);
            sb.append(", resumeTriggerActions=");
            sb.append(this.h);
            sb.append(", resetTimerTriggerActions=");
            return ur.c(sb, this.i, ')');
        }

        public a(long j, i4e i4eVar, long j2, Set set, Set set2, Set set3, int i) {
            boolean z = (i & 1) == 0;
            j = (i & 4) != 0 ? 0L : j;
            int i2 = (i & 8) == 0 ? -1 : 0;
            izs tcVar = (i & 16) != 0 ? new tc(27) : i4eVar;
            j2 = (i & 32) != 0 ? Long.MAX_VALUE : j2;
            set = (i & 64) != 0 ? EmptySet.b : set;
            set2 = (i & 128) != 0 ? EmptySet.b : set2;
            EmptySet emptySet = EmptySet.b;
            set3 = (i & 512) != 0 ? emptySet : set3;
            this.a = z;
            this.b = j;
            this.c = i2;
            this.d = tcVar;
            this.e = j2;
            this.f = set;
            this.g = set2;
            this.h = emptySet;
            this.i = set3;
        }
    }

    /* compiled from: InactiveTaskInteractor.kt */
    public static abstract class b {

        /* compiled from: InactiveTaskInteractor.kt */
        public static abstract class a extends b {

            /* compiled from: InactiveTaskInteractor.kt */
            /* renamed from: xsna.lsw$b$a$a, reason: collision with other inner class name */
            public static final class C3286a extends a {
                public static final C3286a a = new C3286a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3286a);
                }

                public final int hashCode() {
                    return -1110112261;
                }

                public final String toString() {
                    return "Pause";
                }
            }

            /* compiled from: InactiveTaskInteractor.kt */
            /* renamed from: xsna.lsw$b$a$b, reason: collision with other inner class name */
            public static final class C3287b extends a {
                public static final C3287b a = new C3287b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3287b);
                }

                public final int hashCode() {
                    return 7153352;
                }

                public final String toString() {
                    return "Resume";
                }
            }
        }

        /* compiled from: InactiveTaskInteractor.kt */
        /* renamed from: xsna.lsw$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC3288b extends b {

            /* compiled from: InactiveTaskInteractor.kt */
            /* renamed from: xsna.lsw$b$b$a */
            public static final class a extends AbstractC3288b {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1671117382;
                }

                public final String toString() {
                    return "Pause";
                }
            }

            /* compiled from: InactiveTaskInteractor.kt */
            /* renamed from: xsna.lsw$b$b$b, reason: collision with other inner class name */
            public static final class C3289b extends AbstractC3288b {
                public static final C3289b a = new C3289b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3289b);
                }

                public final int hashCode() {
                    return -204136215;
                }

                public final String toString() {
                    return "Resume";
                }
            }
        }

        /* compiled from: InactiveTaskInteractor.kt */
        public static final class c extends b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 839214588;
            }

            public final String toString() {
                return "NavigationStackCleared";
            }
        }

        /* compiled from: InactiveTaskInteractor.kt */
        public static abstract class d extends b {

            /* compiled from: InactiveTaskInteractor.kt */
            public static final class a extends d {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 478572251;
                }

                public final String toString() {
                    return "HasOverlays";
                }
            }

            /* compiled from: InactiveTaskInteractor.kt */
            /* renamed from: xsna.lsw$b$d$b, reason: collision with other inner class name */
            public static final class C3290b extends d {
                public static final C3290b a = new C3290b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3290b);
                }

                public final int hashCode() {
                    return 2010088262;
                }

                public final String toString() {
                    return "NoOverlays";
                }
            }
        }

        /* compiled from: InactiveTaskInteractor.kt */
        public static abstract class e extends b {

            /* compiled from: InactiveTaskInteractor.kt */
            public static final class a extends e {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1340165642;
                }

                public final String toString() {
                    return "Close";
                }
            }

            /* compiled from: InactiveTaskInteractor.kt */
            /* renamed from: xsna.lsw$b$e$b, reason: collision with other inner class name */
            public static final class C3291b extends e {
                public static final C3291b a = new C3291b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3291b);
                }

                public final int hashCode() {
                    return 597781496;
                }

                public final String toString() {
                    return "Open";
                }
            }
        }
    }

    public static void b(ksw kswVar, long j) {
        io.reactivex.rxjava3.core.w i;
        if (kswVar.c.a) {
            asu0.a.getClass();
            i = asu0.m();
        } else {
            asu0.a.getClass();
            i = asu0.i();
        }
        io.reactivex.rxjava3.internal.operators.completable.g f = io.reactivex.rxjava3.internal.operators.completable.i.b.f(j, TimeUnit.MILLISECONDS);
        asu0.a.getClass();
        kswVar.h = f.q(asu0.i()).o(i).subscribe(new xsb(kswVar, 2));
    }

    public final void a(b bVar) {
        if (((Boolean) this.b.getValue()).booleanValue()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ksw kswVar = (ksw) it.next();
            a aVar = kswVar.c;
            a aVar2 = kswVar.c;
            if (aVar.f.contains(bVar)) {
                kswVar.dispose();
                long j = aVar2.b;
                kswVar.g = j;
                b(kswVar, j);
            }
            if (aVar.g.contains(bVar)) {
                kswVar.dispose();
            }
            if (aVar.h.contains(bVar)) {
                b(kswVar, Math.max(kswVar.g - (System.currentTimeMillis() - kswVar.i), 0L));
            }
            if (aVar.i.contains(bVar)) {
                kswVar.g = aVar2.b;
            }
            kswVar.b.invoke(bVar);
        }
    }
}
