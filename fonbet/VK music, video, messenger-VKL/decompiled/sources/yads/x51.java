package yads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public abstract class x51 extends m51 implements Set {
    public transient s51 c;

    public static x51 b(int i, Object... objArr) {
        if (i == 0) {
            return zn2.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new b13(obj);
        }
        int a = a(i);
        Object[] objArr2 = new Object[a];
        int i2 = a - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(nh2.a("at index ", i5));
            }
            int hashCode = obj2.hashCode();
            int a2 = q01.a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                a2++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new b13(obj4);
        }
        if (a(i4) < a / 2) {
            return b(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zn2(objArr, i3, objArr2, i2, i4);
    }

    @Override // yads.m51
    public s51 a() {
        s51 s51Var = this.c;
        if (s51Var != null) {
            return s51Var;
        }
        s51 f = f();
        this.c = f;
        return f;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x51) && (this instanceof zn2)) {
            x51 x51Var = (x51) obj;
            x51Var.getClass();
            if ((x51Var instanceof zn2) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return pz2.a(this, obj);
    }

    public s51 f() {
        Object[] array = toArray(m51.b);
        p51 p51Var = s51.c;
        return s51.b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return pz2.a(this);
    }

    @Override // yads.m51
    public Object writeReplace() {
        return new w51(toArray(m51.b));
    }

    public static int a(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static x51 a(Set set) {
        if ((set instanceof x51) && !(set instanceof SortedSet)) {
            x51 x51Var = (x51) set;
            if (!x51Var.e()) {
                return x51Var;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }
}
