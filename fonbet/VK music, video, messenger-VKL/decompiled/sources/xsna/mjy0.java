package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class mjy0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ mjy0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((ihy0) obj) instanceof one.video.calls.sdk_private.w;
            default:
                return ((xmy0) obj).b.u();
        }
    }
}
