package xsna;

import java.util.function.Predicate;
import one.video.calls.sdk_private.aB;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class bby0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ bby0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                aB aBVar = ((gey0) obj).c;
                return (aBVar.equals(aB.a) || aBVar.equals(aB.d)) ? false : true;
            default:
                return !((xmy0) obj).b.t();
        }
    }
}
