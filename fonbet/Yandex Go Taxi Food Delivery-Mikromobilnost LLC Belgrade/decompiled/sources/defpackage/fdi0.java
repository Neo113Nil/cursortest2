package defpackage;

import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class fdi0 extends rvj0 {
    public final String a;
    public final long b;
    public final jci0 c;

    public fdi0(String str, long j, jci0 jci0Var) {
        this.a = str;
        this.b = j;
        this.c = jci0Var;
    }

    @Override // defpackage.rvj0
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.rvj0
    public final wg10 contentType() {
        String str = this.a;
        if (str != null) {
            Regex regex = wg10.e;
            try {
                return qje.o(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.rvj0
    public final qq6 source() {
        return this.c;
    }
}
