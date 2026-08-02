package xsna;

import java.util.Iterator;
import xsna.wyx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class uyx implements gzs {
    public final /* synthetic */ boolean b;

    @Override // xsna.gzs
    public final Object invoke() {
        Iterator<wyx.a> it = wyx.d.iterator();
        while (it.hasNext()) {
            it.next().a(this.b);
        }
        return s3q0.a;
    }
}
