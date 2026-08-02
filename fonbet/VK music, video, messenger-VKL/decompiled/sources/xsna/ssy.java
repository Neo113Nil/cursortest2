package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dy6;
import xsna.q630;
import xsna.qsy;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* loaded from: classes11.dex */
public final class ssy extends q630.c implements noy, gy6, dy6 {
    public static final a s = new a();
    public tsy p;
    public qsy q;
    public Orientation r;

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    public static final class a implements dy6.a {
        @Override // xsna.dy6.a
        public final boolean a() {
            return false;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    public static final class c implements dy6.a {
        public final /* synthetic */ Ref$ObjectRef<qsy.a> b;
        public final /* synthetic */ int c;

        public c(Ref$ObjectRef<qsy.a> ref$ObjectRef, int i) {
            this.b = ref$ObjectRef;
            this.c = i;
        }

        @Override // xsna.dy6.a
        public final boolean a() {
            return ssy.this.i2(this.b.element, this.c);
        }
    }

    @Override // xsna.dy6
    public final <T> T H0(int i, izs<? super dy6.a, ? extends T> izsVar) {
        if (this.p.getItemCount() <= 0 || !this.p.c() || !this.o) {
            return izsVar.invoke(s);
        }
        int d = j2(i) ? this.p.d() : this.p.a();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        qsy qsyVar = this.q;
        qsyVar.getClass();
        T t = (T) new qsy.a(d, d);
        qsyVar.a.b(t);
        ref$ObjectRef.element = t;
        int b2 = this.p.b() * 2;
        int itemCount = this.p.getItemCount();
        if (b2 > itemCount) {
            b2 = itemCount;
        }
        T t2 = null;
        int i2 = 0;
        while (t2 == null && i2((qsy.a) ref$ObjectRef.element, i) && i2 < b2) {
            qsy.a aVar = (qsy.a) ref$ObjectRef.element;
            int i3 = aVar.a;
            int i4 = aVar.b;
            if (j2(i)) {
                i4++;
            } else {
                i3--;
            }
            qsy qsyVar2 = this.q;
            qsyVar2.getClass();
            T t3 = (T) new qsy.a(i3, i4);
            qsyVar2.a.b(t3);
            this.q.a.j((qsy.a) ref$ObjectRef.element);
            ref$ObjectRef.element = t3;
            i2++;
            itl.f(this).k();
            t2 = izsVar.invoke(new c(ref$ObjectRef, i));
        }
        this.q.a.j((qsy.a) ref$ObjectRef.element);
        itl.f(this).k();
        return t2;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N = zo10Var.N(j);
        return ep10Var.Q(N.b, N.c, jgp.b, new r3h(N, 20));
    }

    public final boolean i2(qsy.a aVar, int i) {
        if (i == 5 || i == 6) {
            if (this.r == Orientation.Horizontal) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.r == Orientation.Vertical) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (j2(i)) {
            if (aVar.b >= this.p.getItemCount() - 1) {
                return false;
            }
        } else if (aVar.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean j2(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int i2 = b.$EnumSwitchMapping$0[itl.f(this).A.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int i3 = b.$EnumSwitchMapping$0[itl.f(this).A.ordinal()];
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.gy6
    public final ssy b0() {
        return this;
    }
}
