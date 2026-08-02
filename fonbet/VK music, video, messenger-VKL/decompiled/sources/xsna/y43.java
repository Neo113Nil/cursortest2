package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y43 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y43(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((x43) this.b).invoke(obj)).booleanValue();
            default:
                one.video.calls.sdk_private.w wVar = (one.video.calls.sdk_private.w) this.b;
                wVar.getClass();
                return ((rhy0) obj).a == (wVar.c & 3);
        }
    }
}
