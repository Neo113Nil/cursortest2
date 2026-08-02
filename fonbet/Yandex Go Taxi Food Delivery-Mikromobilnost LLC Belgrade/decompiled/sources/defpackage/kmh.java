package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.z;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class kmh extends tmh implements Comparable {
    public final omh A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final int I;
    public final boolean J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final int x;
    public final boolean y;
    public final String z;

    /* JADX WARN: Multi-variable type inference failed */
    public kmh(int i, xzz0 xzz0Var, int i2, omh omhVar, int i3, boolean z, jmh jmhVar, int i4) {
        super(i, xzz0Var, i2);
        int i5;
        int i6;
        int i7;
        this.A = omhVar;
        boolean z2 = omhVar.z;
        ImmutableList immutableList = omhVar.n;
        ImmutableList immutableList2 = omhVar.k;
        int i8 = z2 ? 24 : 16;
        int i9 = 0;
        this.F = false;
        this.z = vmh.normalizeUndeterminedLanguageToNull(this.w.d);
        this.B = iyi0.e(i3, false);
        int i10 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i10 >= immutableList2.size()) {
                i6 = 0;
                i10 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = vmh.getFormatLanguageScore(this.w, (String) immutableList2.get(i10), false);
                if (i6 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.D = i10;
        this.C = i6;
        this.E = vmh.access$4200(this.w.f, 0);
        a aVar = this.w;
        int i11 = aVar.f;
        this.G = i11 == 0 || (i11 & 1) != 0;
        this.J = (aVar.e & 1) != 0;
        this.Q = vmh.access$4500(aVar);
        a aVar2 = this.w;
        int i12 = aVar2.D;
        this.K = i12;
        this.L = aVar2.E;
        int i13 = aVar2.j;
        this.M = i13;
        this.y = (i13 == -1 || i13 <= omhVar.m) && (i12 == -1 || i12 <= omhVar.l) && jmhVar.apply(aVar2);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = tw21.a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i14 = 0; i14 < split.length; i14++) {
            split[i14] = tw21.X(split[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= split.length) {
                i7 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                i7 = vmh.getFormatLanguageScore(this.w, split[i15], false);
                if (i7 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.H = i15;
        this.I = i7;
        int i16 = 0;
        while (true) {
            if (i16 >= immutableList.size()) {
                break;
            }
            String str = this.w.n;
            if (str != null && str.equals(immutableList.get(i16))) {
                i5 = i16;
                break;
            }
            i16++;
        }
        this.N = i5;
        this.O = (i3 & 384) == 128;
        this.P = (i3 & 64) == 64;
        boolean z3 = this.y;
        omh omhVar2 = this.A;
        boolean z4 = omhVar2.B;
        p001 p001Var = omhVar2.o;
        if (iyi0.e(i3, z4) && (z3 || omhVar2.y)) {
            p001Var.getClass();
            i9 = (!iyi0.e(i3, false) || !z3 || this.w.j == -1 || omhVar2.s || (!omhVar2.C && z) || (i8 & i3) == 0) ? 1 : 2;
        }
        this.x = i9;
    }

    @Override // defpackage.tmh
    public final int a() {
        return this.x;
    }

    @Override // defpackage.tmh
    public final boolean b(tmh tmhVar) {
        int i;
        String str;
        kmh kmhVar = (kmh) tmhVar;
        a aVar = kmhVar.w;
        this.A.getClass();
        a aVar2 = this.w;
        int i2 = aVar2.D;
        if (i2 == -1 || i2 != aVar.D) {
            return false;
        }
        return (this.F || ((str = aVar2.n) != null && TextUtils.equals(str, aVar.n))) && (i = aVar2.E) != -1 && i == aVar.E && this.O == kmhVar.O && this.P == kmhVar.P;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(kmh kmhVar) {
        z zVar;
        z g;
        boolean z = this.B;
        boolean z2 = this.y;
        if (z2 && z) {
            g = vmh.FORMAT_VALUE_ORDERING;
        } else {
            zVar = vmh.FORMAT_VALUE_ORDERING;
            g = zVar.g();
        }
        boolean z3 = kmhVar.B;
        int i = kmhVar.M;
        jvc b = jvc.a.c(z, z3).b(Integer.valueOf(this.D), Integer.valueOf(kmhVar.D), z.c().g()).a(this.C, kmhVar.C).a(this.E, kmhVar.E).c(this.J, kmhVar.J).c(this.G, kmhVar.G).b(Integer.valueOf(this.H), Integer.valueOf(kmhVar.H), z.c().g()).a(this.I, kmhVar.I).c(z2, kmhVar.y).b(Integer.valueOf(this.N), Integer.valueOf(kmhVar.N), z.c().g());
        this.A.getClass();
        jvc b2 = b.c(this.O, kmhVar.O).c(this.P, kmhVar.P).c(this.Q, kmhVar.Q).b(Integer.valueOf(this.K), Integer.valueOf(kmhVar.K), g).b(Integer.valueOf(this.L), Integer.valueOf(kmhVar.L), g);
        if (Objects.equals(this.z, kmhVar.z)) {
            b2 = b2.b(Integer.valueOf(this.M), Integer.valueOf(i), g);
        }
        return b2.e();
    }
}
