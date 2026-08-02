package xsna;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: NestedScrollNode.kt */
/* loaded from: classes11.dex */
public final class m160 extends Lambda implements izs<Object, Boolean> {
    final /* synthetic */ Ref$ObjectRef<Object> $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m160(Ref$ObjectRef<Object> ref$ObjectRef) {
        super(1);
        this.$node = ref$ObjectRef;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, xsna.htl, xsna.npp0] */
    @Override // xsna.izs
    public final Boolean invoke(Object obj) {
        boolean z;
        ?? r2 = (npp0) obj;
        if (r2.z().o) {
            this.$node.element = r2;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
