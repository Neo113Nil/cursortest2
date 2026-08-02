package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class f421 extends rm60 {
    public final Integer c;
    public final Integer d;
    public final u93 e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f421(Integer num, Integer num2, u93 u93Var, String str, boolean z) {
        super(r0, str);
        Integer num3 = jl40.l(num, num2) ? num : null;
        this.c = num;
        this.d = num2;
        this.e = u93Var;
        this.f = z;
        if (num3 == null || new d6w(1, 9, 1).g(num3.intValue())) {
            return;
        }
        vg10.j("Invalid length for field ", str, Extension.COLON_SPACE, num3);
        throw null;
    }

    @Override // defpackage.rm60
    public final sm60 a(Object obj, CharSequence charSequence, int i, int i2) {
        Integer valueOf;
        int i3 = 0;
        Integer num = this.d;
        if (num != null && i2 - i > num.intValue()) {
            return new dn60(num.intValue(), 8, (byte) 0);
        }
        Integer num2 = this.c;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new dn60(num2.intValue(), 7, (byte) 0);
        }
        while (true) {
            if (i >= i2) {
                valueOf = Integer.valueOf(i3);
                break;
            }
            i3 = (i3 * 10) + (charSequence.charAt(i) - '0');
            if (i3 < 0) {
                valueOf = null;
                break;
            }
            i++;
        }
        if (valueOf == null) {
            return msb1.M;
        }
        boolean z = this.f;
        int intValue = valueOf.intValue();
        if (z) {
            intValue = -intValue;
        }
        Object a = this.e.a(obj, Integer.valueOf(intValue));
        if (a == null) {
            return null;
        }
        return new w40(a);
    }
}
