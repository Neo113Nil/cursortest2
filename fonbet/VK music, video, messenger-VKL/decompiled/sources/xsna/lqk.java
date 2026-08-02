package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class lqk implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lqk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                ((one.video.calls.sdk_private.a) this.b).getClass();
                return !(((pt50) obj) instanceof t3y0);
            case 1:
                return ((Boolean) ((wpg) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((q130) this.b).invoke(obj)).booleanValue();
        }
    }
}
