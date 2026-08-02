package xsna;

import android.os.Build;
import android.os.Handler;
import com.vk.clips.sdk.viewer.engine.feed.internal.recycler.ScrollEvent;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.px8;

/* compiled from: ClipsEngineScrollHelper.kt */
/* loaded from: classes17.dex */
public final class i1e {
    public final lgk0<sht0> a;
    public final wlp b;
    public final l6e c;
    public final mfh0 d;
    public final Handler e;
    public b f;
    public h12 g;
    public final p31 h = new p31(this, 6);
    public boolean i;
    public boolean j;
    public final d k;
    public final a l;

    /* compiled from: ClipsEngineScrollHelper.kt */
    public final class a {

        /* compiled from: ClipsEngineScrollHelper.kt */
        /* renamed from: xsna.i1e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3031a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ScrollEvent.values().length];
                try {
                    iArr[ScrollEvent.DRAGGING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScrollEvent.IDLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ScrollEvent.SETTLING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
        }

        public final void a(ScrollEvent scrollEvent, int i) {
            int i2 = C3031a.$EnumSwitchMapping$0[scrollEvent.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (Math.abs(i) > 10) {
                i1e.this.j = i > 0;
            }
        }
    }

    /* compiled from: ClipsEngineScrollHelper.kt */
    public static final class b {
        public final e9d a;
        public final int b;

        public b(e9d e9dVar, int i) {
            this.a = e9dVar;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HolderWithPosition(clipPlayerHolder=");
            sb.append(this.a);
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsEngineScrollHelper.kt */
    public static final class c {
        public final b a;
        public final ArrayList b;

        public c(b bVar, ArrayList arrayList) {
            this.a = bVar;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            b bVar = this.a;
            return this.b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HoldersToPrepareAndRelease(holderToPrepare=");
            sb.append(this.a);
            sb.append(", cleanupHolders=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
        }
    }

    /* compiled from: ClipsEngineScrollHelper.kt */
    public final class d {

        /* compiled from: ClipsEngineScrollHelper.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ScrollEvent.values().length];
                try {
                    iArr[ScrollEvent.IDLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScrollEvent.SETTLING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ScrollEvent.DRAGGING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public d() {
        }

        public final void a(ScrollEvent scrollEvent) {
            i1e i1eVar = i1e.this;
            Handler handler = i1eVar.e;
            if (scrollEvent != ScrollEvent.IDLE) {
                h12 h12Var = i1eVar.g;
                if (h12Var != null) {
                    handler.removeCallbacks(h12Var);
                }
                i1eVar.g = null;
                handler.removeCallbacks(i1eVar.h);
            }
            int i = a.$EnumSwitchMapping$0[scrollEvent.ordinal()];
            if (i == 1) {
                i1eVar.f(false);
                i1eVar.e();
            } else if (i == 2) {
                i1eVar.f(true);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public i1e(mgk0 mgk0Var, wlp wlpVar, l6e l6eVar, mfh0 mfh0Var, Handler handler) {
        this.a = mgk0Var;
        this.b = wlpVar;
        this.c = l6eVar;
        this.d = mfh0Var;
        this.e = handler;
        mfh0Var.getClass();
        this.i = false;
        this.j = true;
        this.k = new d();
        this.l = new a();
    }

    public final b a() {
        int intValue = ((Number) this.c.invoke()).intValue();
        e9d a2 = this.b.a(intValue);
        if (a2 == null) {
            return null;
        }
        return new b(a2, intValue);
    }

    public final sht0 b(int i) {
        px8<sht0> a2 = this.a.a(i);
        px8.c cVar = a2 instanceof px8.c ? (px8.c) a2 : null;
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    public final void c() {
        g64 D4;
        if (this.i) {
            return;
        }
        this.i = true;
        p31 p31Var = this.h;
        Handler handler = this.e;
        handler.removeCallbacks(p31Var);
        b bVar = this.f;
        if (bVar != null && (D4 = bVar.a.D4()) != null) {
            D4.pause();
        }
        this.f = null;
        h12 h12Var = this.g;
        if (h12Var != null) {
            handler.removeCallbacks(h12Var);
        }
        this.g = null;
    }

    public final void d() {
        if (this.i) {
            this.i = false;
            f(false);
            e();
        }
    }

    public final void e() {
        b bVar;
        if (this.i) {
            return;
        }
        int intValue = ((Number) this.c.invoke()).intValue();
        ArrayList arrayList = new ArrayList();
        boolean z = intValue == 0 || this.j;
        wlp wlpVar = this.b;
        q8e q8eVar = wlpVar.a;
        int childCount = q8eVar.getChildCount();
        ArrayList arrayList2 = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            arrayList2.add(Integer.valueOf(wlpVar.b.getPosition(q8eVar.getChildAt(i))));
        }
        if (z) {
            int size = arrayList2.size();
            bVar = null;
            for (int i2 = 0; i2 < size; i2++) {
                int intValue2 = ((Number) arrayList2.get(i2)).intValue();
                e9d a2 = wlpVar.a(intValue2);
                if (a2 != null) {
                    b bVar2 = new b(a2, intValue2);
                    boolean z2 = (z && intValue2 > intValue) || (!z && intValue2 < intValue);
                    if (!bVar2.equals(this.f)) {
                        if (z2 && bVar == null) {
                            bVar = bVar2;
                        } else {
                            arrayList.add(bVar2);
                        }
                    }
                }
            }
        } else {
            bVar = null;
            for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                int intValue3 = ((Number) arrayList2.get(size2)).intValue();
                e9d a3 = wlpVar.a(intValue3);
                if (a3 != null) {
                    b bVar3 = new b(a3, intValue3);
                    boolean z3 = (z && intValue3 > intValue) || (!z && intValue3 < intValue);
                    if (!bVar3.equals(this.f)) {
                        if (z3 && bVar == null) {
                            bVar = bVar3;
                        } else {
                            arrayList.add(bVar3);
                        }
                    }
                }
            }
        }
        h12 h12Var = new h12(2, new c(this.d.a ? bVar : null, arrayList), this);
        h12 h12Var2 = this.g;
        Handler handler = this.e;
        if (h12Var2 != null) {
            handler.removeCallbacks(h12Var2);
        }
        handler.post(h12Var);
        this.g = h12Var;
    }

    public final void f(boolean z) {
        boolean hasCallbacks;
        g64 D4;
        g64 D42;
        if (this.i) {
            return;
        }
        b a2 = a();
        if (!epx.f(a2, this.f)) {
            b bVar = this.f;
            if (bVar != null && (D42 = bVar.a.D4()) != null) {
                D42.pause();
            }
            this.f = a2;
        }
        sht0 b2 = b(a2 != null ? a2.b : -1);
        boolean z2 = false;
        if (a2 != null && (D4 = a2.a.D4()) != null && D4.h()) {
            z2 = true;
        }
        if (a2 == null) {
            return;
        }
        e9d e9dVar = a2.a;
        if (!z || z2) {
            if (!z2 && a2.b == 0) {
                e9dVar.D4().g(b2);
                return;
            }
            if (z2) {
                if (z2) {
                    e9dVar.D4().g(b2);
                    return;
                }
                return;
            }
            int i = Build.VERSION.SDK_INT;
            p31 p31Var = this.h;
            Handler handler = this.e;
            if (i < 29) {
                handler.removeCallbacks(p31Var);
                handler.post(p31Var);
            } else {
                hasCallbacks = handler.hasCallbacks(p31Var);
                if (hasCallbacks) {
                    return;
                }
                handler.post(p31Var);
            }
        }
    }
}
