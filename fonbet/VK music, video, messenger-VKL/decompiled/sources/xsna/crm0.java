package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class crm0 implements uki0<String> {
    public final /* synthetic */ CharSequence a;

    public crm0(String str) {
        this.a = str;
    }

    @Override // xsna.uki0
    public final Iterator<String> iterator() {
        return new o8z(this.a);
    }
}
