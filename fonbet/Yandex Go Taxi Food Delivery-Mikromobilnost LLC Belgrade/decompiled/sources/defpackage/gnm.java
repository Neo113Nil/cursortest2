package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class gnm implements u9e0 {
    public final x551 A;
    public final q52 B;
    public final q52 C;
    public final q52 D;
    public final y551 E;
    public final y551 F;
    public final long a;
    public final fwi b;
    public final int c;
    public final va2 w;
    public final p52 x;
    public final p52 y;
    public final x551 z;

    public gnm(long j, fwi fwiVar, va2 va2Var) {
        float f = zl10.a;
        int f0 = fwiVar.f0(48.0f);
        this.a = j;
        this.b = fwiVar;
        this.c = f0;
        this.w = va2Var;
        int f02 = fwiVar.f0(Float.intBitsToFloat((int) (j >> 32)));
        so5 so5Var = x4c.G;
        this.x = new p52(so5Var, so5Var, f02);
        so5 so5Var2 = x4c.I;
        this.y = new p52(so5Var2, so5Var2, f02);
        this.z = new x551(gi.c);
        this.A = new x551(gi.d);
        int f03 = fwiVar.f0(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        to5 to5Var = x4c.D;
        to5 to5Var2 = x4c.F;
        this.B = new q52(to5Var, to5Var2, f03);
        this.C = new q52(to5Var2, to5Var, f03);
        this.D = new q52(x4c.E, to5Var, f03);
        this.E = new y551(to5Var, f0);
        this.F = new y551(to5Var2, f0);
    }

    @Override // defpackage.u9e0
    public final long a(f6w f6wVar, long j, LayoutDirection layoutDirection, long j2) {
        f6w f6wVar2;
        long j3;
        char c;
        int i;
        int i2;
        long a = f6wVar.a();
        char c2 = HexString.CHAR_SPACE;
        int i3 = (int) (j >> 32);
        int i4 = 0;
        List g = scc.g(this.x, this.y, ((int) (a >> 32)) < i3 / 2 ? this.z : this.A);
        int size = g.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                f6wVar2 = f6wVar;
                j3 = j;
                c = c2;
                i = 0;
                break;
            }
            um10 um10Var = (um10) g.get(i5);
            int i6 = (int) (j2 >> c2);
            int i7 = size;
            c = c2;
            j3 = j;
            int i8 = i5;
            f6wVar2 = f6wVar;
            i = um10Var.a(f6wVar2, j3, i6, layoutDirection);
            if (i8 == scc.f(g) || (i >= 0 && i6 + i <= i3)) {
                break;
            }
            i5 = i8 + 1;
            size = i7;
            c2 = c;
        }
        int a2 = (int) (f6wVar2.a() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i9 = (int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        List g2 = scc.g(this.B, this.C, this.D, a2 < i9 / 2 ? this.E : this.F);
        int size2 = g2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            vm10 vm10Var = (vm10) g2.get(i10);
            int i11 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int a3 = vm10Var.a(f6wVar2, j3, i11);
            if (i10 == scc.f(g2) || (a3 >= (i2 = this.c) && i11 + a3 <= i9 - i2)) {
                i4 = a3;
                break;
            }
        }
        long j4 = (i << c) | (i4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        this.w.invoke(f6wVar2, s8o.a(j4, j2));
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnm)) {
            return false;
        }
        gnm gnmVar = (gnm) obj;
        return this.a == gnmVar.a && jl40.l(this.b, gnmVar.b) && this.c == gnmVar.c && jl40.l(this.w, gnmVar.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + oyr.b(0, oyr.b(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) a8m.a(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", horizontalMargin=0, onPositionCalculated=" + this.w + ')';
    }
}
