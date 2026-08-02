package xsna;

import java.util.Comparator;
import xsna.j5k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class sui0 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((j5k.c) obj).a().compareTo(((j5k.c) obj2).a());
            default:
                return (int) (((e9z0) obj2).f - ((e9z0) obj).f);
        }
    }
}
