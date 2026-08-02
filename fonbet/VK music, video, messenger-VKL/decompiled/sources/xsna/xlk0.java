package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xlk0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ xlk0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return Float.compare(((luu) obj).n().d().k(), ((luu) obj2).n().d().k());
            case 1:
                return ((Integer) obj).compareTo((Integer) obj2);
            default:
                return yads.to.a((yads.nx0) obj, (yads.nx0) obj2);
        }
    }
}
