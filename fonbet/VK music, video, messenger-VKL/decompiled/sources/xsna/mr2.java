package xsna;

import androidx.compose.animation.graphics.vector.Ordering;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public final class mr2 extends ar2 {
    public final ArrayList a;
    public final Ordering b;
    public final int c;

    /* compiled from: Animator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ordering.values().length];
            try {
                iArr[Ordering.Together.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ordering.Sequentially.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mr2(ArrayList arrayList, Ordering ordering) {
        Object obj;
        this.a = arrayList;
        this.b = ordering;
        int i = a.$EnumSwitchMapping$0[ordering.ordinal()];
        int i2 = 0;
        int i3 = 1;
        if (i == 1) {
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                int c = ((ar2) obj2).c();
                int h = e43.h(arrayList);
                if (1 <= h) {
                    while (true) {
                        Object obj3 = arrayList.get(i3);
                        int c2 = ((ar2) obj3).c();
                        if (c < c2) {
                            obj2 = obj3;
                            c = c2;
                        }
                        if (i3 == h) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                obj = obj2;
            }
            ar2 ar2Var = (ar2) obj;
            if (ar2Var != null) {
                i2 = ar2Var.c();
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i2 < size) {
                i4 += ((ar2) arrayList.get(i2)).c();
                i2++;
            }
            i2 = i4;
        }
        this.c = i2;
    }

    @Override // xsna.ar2
    public final void b(ph50<String, m7e0<?>> ph50Var, int i, int i2) {
        int i3 = a.$EnumSwitchMapping$0[this.b.ordinal()];
        int i4 = 0;
        ArrayList arrayList = this.a;
        if (i3 == 1) {
            int size = arrayList.size();
            while (i4 < size) {
                ((ar2) arrayList.get(i4)).b(ph50Var, i, i2);
                i4++;
            }
            return;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int size2 = arrayList.size();
        while (i4 < size2) {
            ar2 ar2Var = (ar2) arrayList.get(i4);
            ar2Var.b(ph50Var, i, i2);
            i2 += ar2Var.c();
            i4++;
        }
    }

    @Override // xsna.ar2
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr2)) {
            return false;
        }
        mr2 mr2Var = (mr2) obj;
        return epx.f(this.a, mr2Var.a) && this.b == mr2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatorSet(animators=" + this.a + ", ordering=" + this.b + ')';
    }
}
