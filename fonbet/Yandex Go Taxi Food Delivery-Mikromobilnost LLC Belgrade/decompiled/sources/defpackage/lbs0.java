package defpackage;

/* loaded from: classes9.dex */
public final class lbs0 implements uf90 {
    public final jid a;
    public final String b;

    public lbs0(jid jidVar, String str) {
        this.a = jidVar;
        this.b = str;
    }

    @Override // defpackage.uf90
    public final Object a(fpe fpeVar, CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return Integer.valueOf(i);
        }
        final char charAt = charSequence.charAt(i);
        jid jidVar = this.a;
        if (charAt == '-') {
            jidVar.invoke(fpeVar, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (charAt != '+') {
            return new ff90(i, new sls() { // from class: kbs0
                @Override // defpackage.sls
                public final Object invoke() {
                    return "Expected " + lbs0.this.b + " but got " + charAt;
                }
            });
        }
        jidVar.invoke(fpeVar, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }

    public final String toString() {
        return this.b;
    }
}
