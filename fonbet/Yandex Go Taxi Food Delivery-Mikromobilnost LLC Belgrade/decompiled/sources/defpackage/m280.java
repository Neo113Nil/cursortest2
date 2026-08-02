package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class m280 {
    public final l280 a;
    public final fxo b;
    public final fxo c;
    public final Float d;
    public final List e;
    public final CharSequence f;
    public final String g;
    public final String h;

    public m280(l280 l280Var, fxo fxoVar, fxo fxoVar2, Float f, List list, CharSequence charSequence, String str, String str2) {
        this.a = l280Var;
        this.b = fxoVar;
        this.c = fxoVar2;
        this.d = f;
        this.e = list;
        this.f = charSequence;
        this.g = str;
        this.h = str2;
    }

    public static m280 a(m280 m280Var, List list, CharSequence charSequence, int i) {
        l280 l280Var = m280Var.a;
        fxo fxoVar = m280Var.b;
        fxo fxoVar2 = m280Var.c;
        Float f = m280Var.d;
        if ((i & 16) != 0) {
            list = m280Var.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            charSequence = m280Var.f;
        }
        String str = m280Var.g;
        String str2 = m280Var.h;
        m280Var.getClass();
        return new m280(l280Var, fxoVar, fxoVar2, f, list2, charSequence, str, str2);
    }

    public final CharSequence b() {
        return this.f;
    }

    public final List c() {
        return this.e;
    }

    public final String d() {
        return this.g;
    }

    public final l280 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m280)) {
            return false;
        }
        m280 m280Var = (m280) obj;
        return jl40.l(this.a, m280Var.a) && jl40.l(this.b, m280Var.b) && jl40.l(this.c, m280Var.c) && jl40.l(this.d, m280Var.d) && jl40.l(this.e, m280Var.e) && jl40.l(this.f, m280Var.f) && jl40.l(this.g, m280Var.g) && jl40.l(this.h, m280Var.h);
    }

    public final fxo f() {
        return this.c;
    }

    public final fxo g() {
        return this.b;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        l280 l280Var = this.a;
        int hashCode = (l280Var == null ? 0 : l280Var.hashCode()) * 31;
        fxo fxoVar = this.b;
        int hashCode2 = (hashCode + (fxoVar == null ? 0 : fxoVar.hashCode())) * 31;
        fxo fxoVar2 = this.c;
        int hashCode3 = (hashCode2 + (fxoVar2 == null ? 0 : fxoVar2.hashCode())) * 31;
        Float f = this.d;
        int c = unr0.c((hashCode3 + (f == null ? 0 : f.hashCode())) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        int hashCode4 = (c + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.g;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Float i() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendedOrderNotificationParams(carNumber=");
        sb.append(this.a);
        sb.append(", carUnderPlatesTag=");
        sb.append(this.b);
        sb.append(", carOnProgressBarTag=");
        sb.append(this.c);
        sb.append(", progress=");
        sb.append(this.d);
        sb.append(", actionsInLayout=");
        sb.append(this.e);
        sb.append(", accentActionTitle=");
        sb.append((Object) this.f);
        sb.append(", carColor=");
        return g8e.r(sb, this.g, ", chipsShortText=", this.h, Extension.C_BRAKE);
    }

    public /* synthetic */ m280(l280 l280Var, fxo fxoVar, fxo fxoVar2, Float f, String str, String str2) {
        this(l280Var, fxoVar, fxoVar2, f, EmptyList.a, null, str, str2);
    }
}
