package xsna;

import java.util.Comparator;
import xsna.b2k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sty implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return epx.g(((rty) obj).getIndex(), ((rty) obj2).getIndex());
            default:
                return Float.compare(((b2k0.a) obj).c, ((b2k0.a) obj2).c);
        }
    }
}
