package xsna;

import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes3.dex */
public final class zel0 implements gzs<s3q0> {
    public final /* synthetic */ com.vk.music.informer.mvi.f b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ com.vk.music.informer.mvi.f e;

    public zel0(com.vk.music.informer.mvi.f fVar, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, com.vk.music.informer.mvi.f fVar2) {
        this.b = fVar;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = fVar2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        com.vk.music.informer.mvi.f fVar = this.b;
        int measuredWidth = fVar.getMeasuredWidth();
        int measuredHeight = fVar.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            f4m.q(iah0.a(48), this.e);
        }
        return s3q0.a;
    }
}
