package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c9o implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                long j = ((n7o) obj).c;
                long j2 = ((n7o) obj2).c;
                String str = y2r0.a;
                return Long.compare(j, j2);
            default:
                return yads.hf0.a((yads.hf0) obj, (yads.hf0) obj2);
        }
    }
}
