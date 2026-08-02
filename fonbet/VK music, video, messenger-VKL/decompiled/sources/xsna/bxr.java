package xsna;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: FocusGroupNode.android.kt */
/* loaded from: classes11.dex */
public final class bxr extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Ref$ObjectRef<foa0> $container;
    final /* synthetic */ axr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxr(Ref$ObjectRef<foa0> ref$ObjectRef, axr axrVar) {
        super(0);
        this.$container = ref$ObjectRef;
        this.this$0 = axrVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.$container.element = ovi.a(this.this$0, goa0.a);
        return s3q0.a;
    }
}
