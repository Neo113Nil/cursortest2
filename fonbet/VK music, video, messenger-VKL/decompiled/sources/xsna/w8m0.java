package xsna;

import java.util.Comparator;
import xsna.i11;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w8m0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ w8m0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return 0;
            case 1:
                return epx.g(((i11.d) obj).b(), ((i11.d) obj2).b());
            default:
                return yads.if0.b((Integer) obj, (Integer) obj2);
        }
    }
}
