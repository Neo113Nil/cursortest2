package xsna;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: PointerIcon.kt */
/* loaded from: classes11.dex */
public final class igv extends Lambda implements izs<jgv, Boolean> {
    final /* synthetic */ Ref$ObjectRef<jgv> $hoverIconModifierNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igv(Ref$ObjectRef<jgv> ref$ObjectRef) {
        super(1);
        this.$hoverIconModifierNode = ref$ObjectRef;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, xsna.jgv] */
    @Override // xsna.izs
    public final Boolean invoke(jgv jgvVar) {
        jgv jgvVar2 = jgvVar;
        Ref$ObjectRef<jgv> ref$ObjectRef = this.$hoverIconModifierNode;
        jgv jgvVar3 = ref$ObjectRef.element;
        if (jgvVar3 == null && jgvVar2.r) {
            ref$ObjectRef.element = jgvVar2;
        } else if (jgvVar3 != null) {
            jgvVar2.getClass();
        }
        return Boolean.TRUE;
    }
}
