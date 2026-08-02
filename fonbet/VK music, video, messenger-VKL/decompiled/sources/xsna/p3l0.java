package xsna;

import com.vk.dto.stickers.StickerItem;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class p3l0 implements gzs<s3q0> {
    public final /* synthetic */ q3l0 b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ q3l0 e;
    public final /* synthetic */ tn20 f;

    public p3l0(q3l0 q3l0Var, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, q3l0 q3l0Var2, tn20 tn20Var) {
        this.b = q3l0Var;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = q3l0Var2;
        this.f = tn20Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        q3l0 q3l0Var = this.b;
        int measuredWidth = q3l0Var.getMeasuredWidth();
        int measuredHeight = q3l0Var.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            q3l0 q3l0Var2 = this.e;
            n1l0 n1l0Var = q3l0Var2.e.e;
            if (n1l0Var != null && (n1l0Var instanceof StickerItem)) {
                q3l0Var2.i.c(((StickerItem) n1l0Var).b);
            }
            this.f.invoke(Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
        }
        return s3q0.a;
    }
}
