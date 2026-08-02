package xsna;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* compiled from: Tracks.java */
/* loaded from: classes12.dex */
public final class dip0 {
    public static final dip0 b;
    public final ImmutableList<a> a;

    /* compiled from: Tracks.java */
    public static final class a {
        public final int a;
        public final pfp0 b;
        public final boolean c;
        public final int[] d;
        public final boolean[] e;

        static {
            y2r0.L(0);
            y2r0.L(1);
            y2r0.L(3);
            y2r0.L(4);
        }

        public a(pfp0 pfp0Var, boolean z, int[] iArr, boolean[] zArr) {
            int i = pfp0Var.a;
            this.a = i;
            boolean z2 = false;
            fxc0.p(i == iArr.length && i == zArr.length);
            this.b = pfp0Var;
            if (z && i > 1) {
                z2 = true;
            }
            this.c = z2;
            this.d = (int[]) iArr.clone();
            this.e = (boolean[]) zArr.clone();
        }

        public final boolean a() {
            for (boolean z : this.e) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(int i) {
            return this.d[i] == 4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.c == aVar.c && this.b.equals(aVar.b) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.e) + dq.d(((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31, 31, this.d);
        }
    }

    static {
        ImmutableList.b bVar = ImmutableList.c;
        b = new dip0(com.google.common.collect.g.f);
        y2r0.L(0);
    }

    public dip0(com.google.common.collect.g gVar) {
        this.a = ImmutableList.m(gVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.a;
            if (i2 >= immutableList.size()) {
                return false;
            }
            a aVar = immutableList.get(i2);
            if (aVar.a() && aVar.b.c == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dip0.class != obj.getClass()) {
            return false;
        }
        ImmutableList<a> immutableList = ((dip0) obj).a;
        ImmutableList<a> immutableList2 = this.a;
        immutableList2.getClass();
        return qhz.a(immutableList2, immutableList);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
