package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class lkx {
    public static final lkx f;
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;

    static {
        int i = 0;
        f = new lkx(i, i, i, HProv.PP_VERSION_TIMESTAMP);
    }

    public /* synthetic */ lkx(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : Boolean.FALSE, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3, (i4 & 32) != 0 ? null : Boolean.TRUE);
    }

    public static lkx a(int i) {
        lkx lkxVar = f;
        return new lkx(lkxVar.a, lkxVar.b, lkxVar.c, i, null);
    }

    public final eiv b(boolean z) {
        int i = this.a;
        ckx ckxVar = new ckx(i);
        if (i == -1) {
            ckxVar = null;
        }
        int i2 = ckxVar != null ? ckxVar.a : 0;
        Boolean bool = this.b;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        mkx mkxVar = new mkx(i3);
        if (i3 == 0) {
            mkxVar = null;
        }
        int i4 = mkxVar != null ? mkxVar.a : 1;
        int i5 = this.d;
        div divVar = i5 != -1 ? new div(i5) : null;
        return new eiv(z, i2, booleanValue, i4, divVar != null ? divVar.a : 1, k5z.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkx)) {
            return false;
        }
        lkx lkxVar = (lkx) obj;
        return this.a == lkxVar.a && jl40.l(this.b, lkxVar.b) && this.c == lkxVar.c && this.d == lkxVar.d && jl40.l(this.e, lkxVar.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int b = oyr.b(this.d, oyr.b(this.c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        return (b + (bool2 != null ? bool2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append((Object) ckx.a(this.a));
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        sb.append((Object) mkx.a(this.c));
        sb.append(", imeAction=");
        sb.append((Object) div.a(this.d));
        sb.append(", platformImeOptions=nullshowKeyboardOnFocus=");
        return nzs.d(sb, this.e, ", hintLocales=null)");
    }

    public lkx(int i, Boolean bool, int i2, int i3, Boolean bool2) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
        this.e = bool2;
    }
}
