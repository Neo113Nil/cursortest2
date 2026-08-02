package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: MediaMetadata.java */
/* loaded from: classes12.dex */
public final class vr10 {
    public static final vr10 B;
    public final ImmutableList<String> A;

    @Nullable
    public final CharSequence a;

    @Nullable
    public final CharSequence b;

    @Nullable
    public final CharSequence c;

    @Nullable
    public final CharSequence d;

    @Nullable
    public final CharSequence e;

    @Nullable
    public final byte[] f;

    @Nullable
    public final Integer g;

    @Nullable
    public final Integer h;

    @Nullable
    public final Integer i;

    @Nullable
    @Deprecated
    public final Integer j;

    @Nullable
    public final Boolean k;

    @Nullable
    @Deprecated
    public final Integer l;

    @Nullable
    public final Integer m;

    @Nullable
    public final Integer n;

    @Nullable
    public final Integer o;

    @Nullable
    public final Integer p;

    @Nullable
    public final Integer q;

    @Nullable
    public final Integer r;

    @Nullable
    public final CharSequence s;

    @Nullable
    public final CharSequence t;

    @Nullable
    public final CharSequence u;

    @Nullable
    public final Integer v;

    @Nullable
    public final Integer w;

    @Nullable
    public final CharSequence x;

    @Nullable
    public final CharSequence y;

    @Nullable
    public final Integer z;

    /* compiled from: MediaMetadata.java */
    public static final class a {

        @Nullable
        public CharSequence a;

        @Nullable
        public CharSequence b;

        @Nullable
        public CharSequence c;

        @Nullable
        public CharSequence d;

        @Nullable
        public CharSequence e;

        @Nullable
        public byte[] f;

        @Nullable
        public Integer g;

        @Nullable
        public Integer h;

        @Nullable
        public Integer i;

        @Nullable
        public Integer j;

        @Nullable
        public Boolean k;

        @Nullable
        public Integer l;

        @Nullable
        public Integer m;

        @Nullable
        public Integer n;

        @Nullable
        public Integer o;

        @Nullable
        public Integer p;

        @Nullable
        public Integer q;

        @Nullable
        public CharSequence r;

        @Nullable
        public CharSequence s;

        @Nullable
        public CharSequence t;

        @Nullable
        public Integer u;

        @Nullable
        public Integer v;

        @Nullable
        public CharSequence w;

        @Nullable
        public CharSequence x;

        @Nullable
        public Integer y;
        public ImmutableList<String> z;

        public final void a(int i, byte[] bArr) {
            if (this.f == null || i == 3 || !Objects.equals(this.g, 3)) {
                this.f = (byte[]) bArr.clone();
                this.g = Integer.valueOf(i);
            }
        }
    }

    static {
        a aVar = new a();
        ImmutableList.b bVar = ImmutableList.c;
        aVar.z = com.google.common.collect.g.f;
        B = new vr10(aVar);
        cq.h(0, 1, 2, 3, 4);
        cq.h(5, 6, 8, 9, 10);
        cq.h(11, 12, 13, 14, 15);
        cq.h(16, 17, 18, 19, 20);
        cq.h(21, 22, 23, 24, 25);
        cq.h(26, 27, 28, 29, 30);
        cq.h(31, 32, 33, 34, 1000);
    }

    public vr10(a aVar) {
        Boolean bool = aVar.k;
        Integer num = aVar.j;
        Integer num2 = aVar.y;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = num;
        this.k = bool;
        Integer num3 = aVar.l;
        this.l = num3;
        this.m = num3;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.t = aVar.s;
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
        this.y = aVar.x;
        this.z = num2;
        this.A = aVar.z;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.m;
        aVar.m = this.n;
        aVar.n = this.o;
        aVar.o = this.p;
        aVar.p = this.q;
        aVar.q = this.r;
        aVar.r = this.s;
        aVar.s = this.t;
        aVar.t = this.u;
        aVar.u = this.v;
        aVar.v = this.w;
        aVar.w = this.x;
        aVar.x = this.y;
        aVar.y = this.z;
        aVar.z = this.A;
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vr10.class != obj.getClass()) {
            return false;
        }
        vr10 vr10Var = (vr10) obj;
        return TextUtils.equals(this.a, vr10Var.a) && TextUtils.equals(this.b, vr10Var.b) && TextUtils.equals(this.c, vr10Var.c) && TextUtils.equals(this.d, vr10Var.d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, vr10Var.e) && Arrays.equals(this.f, vr10Var.f) && Objects.equals(this.g, vr10Var.g) && Objects.equals(this.h, vr10Var.h) && Objects.equals(this.i, vr10Var.i) && Objects.equals(this.j, vr10Var.j) && Objects.equals(this.k, vr10Var.k) && Objects.equals(this.m, vr10Var.m) && Objects.equals(this.n, vr10Var.n) && Objects.equals(this.o, vr10Var.o) && Objects.equals(this.p, vr10Var.p) && Objects.equals(this.q, vr10Var.q) && Objects.equals(this.r, vr10Var.r) && TextUtils.equals(this.s, vr10Var.s) && TextUtils.equals(this.t, vr10Var.t) && TextUtils.equals(this.u, vr10Var.u) && Objects.equals(this.v, vr10Var.v) && Objects.equals(this.w, vr10Var.w) && TextUtils.equals(this.x, vr10Var.x) && TextUtils.equals(null, null) && TextUtils.equals(this.y, vr10Var.y) && Objects.equals(this.z, vr10Var.z) && Objects.equals(this.A, vr10Var.A);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, true, this.A);
    }
}
