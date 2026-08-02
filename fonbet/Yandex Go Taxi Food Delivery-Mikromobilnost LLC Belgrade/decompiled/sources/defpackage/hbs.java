package defpackage;

/* loaded from: classes4.dex */
public final class hbs extends rm60 {
    public final u93 c;

    public hbs(ntf0 ntf0Var, String str) {
        super(null, str);
        this.c = ntf0Var;
    }

    @Override // defpackage.rm60
    public final sm60 a(Object obj, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = 0;
        if (i3 < 1) {
            return new dn60(1, 7, (byte) 0);
        }
        if (i3 > 9) {
            return new dn60(9, 8, (byte) 0);
        }
        while (i < i2) {
            i4 = (i4 * 10) + (charSequence.charAt(i) - '0');
            i++;
        }
        Object a = this.c.a(obj, new qxg(i4, i3));
        if (a == null) {
            return null;
        }
        return new w40(a);
    }
}
