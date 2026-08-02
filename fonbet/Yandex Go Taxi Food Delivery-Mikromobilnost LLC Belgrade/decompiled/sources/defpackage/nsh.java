package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class nsh implements qrq0 {
    public final CharSequence a;
    public final int b;
    public final wls c;

    public nsh(CharSequence charSequence, int i, wls wlsVar) {
        this.a = charSequence;
        this.b = i;
        this.c = wlsVar;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        return new msh(this);
    }
}
