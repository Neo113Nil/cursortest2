package defpackage;

/* loaded from: classes9.dex */
public final class hhc0 implements uf90 {
    public final String a;

    public hhc0(String str) {
        this.a = str;
        if (str.length() <= 0) {
            ny61.g("Empty string is not allowed");
            throw null;
        }
        if (d6z.K(str.charAt(0))) {
            w511.f(oyr.p("String '", str, "' starts with a digit"));
            throw null;
        }
        if (d6z.K(str.charAt(str.length() - 1))) {
            w511.f(oyr.p("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    @Override // defpackage.uf90
    public final Object a(fpe fpeVar, final CharSequence charSequence, final int i) {
        String str = this.a;
        if (str.length() + i > charSequence.length()) {
            return new ff90(i, new t9a0(11, this));
        }
        int length = str.length();
        for (final int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return new ff90(i, new sls() { // from class: ghc0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Expected ");
                        sb.append(hhc0.this.a);
                        sb.append(" but got ");
                        int i3 = i;
                        sb.append(charSequence.subSequence(i3, i2 + i3 + 1).toString());
                        return sb.toString();
                    }
                });
            }
        }
        return Integer.valueOf(str.length() + i);
    }

    public final String toString() {
        return b64.p(new StringBuilder("'"), this.a, '\'');
    }
}
