package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class fli0 implements uki0<Object> {
    public final /* synthetic */ Object a;

    public fli0(Object obj) {
        this.a = obj;
    }

    @Override // xsna.uki0
    public final Iterator<Object> iterator() {
        return new gli0(this.a);
    }
}
