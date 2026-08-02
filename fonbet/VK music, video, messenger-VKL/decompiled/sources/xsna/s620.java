package xsna;

import java.util.Arrays;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s620 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s620(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((r45) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((izs) this.b).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((wql0) this.b).invoke(obj)).booleanValue();
            case 3:
                lby0 lby0Var = (lby0) this.b;
                lby0Var.getClass();
                return Arrays.equals(((gey0) obj).b, lby0Var.b);
            default:
                one.video.calls.sdk_private.ax axVar = (one.video.calls.sdk_private.ax) this.b;
                axVar.getClass();
                return ((jly0) obj).a.isAfter(axVar.e);
        }
    }
}
