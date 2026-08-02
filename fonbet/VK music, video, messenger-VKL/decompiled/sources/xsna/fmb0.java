package xsna;

import android.view.MotionEvent;
import kotlin.jvm.internal.Lambda;

/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes11.dex */
public final class fmb0 extends Lambda implements izs<MotionEvent, s3q0> {
    final /* synthetic */ emb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmb0(emb0 emb0Var) {
        super(1);
        this.this$0 = emb0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        izs<? super MotionEvent, Boolean> izsVar = this.this$0.a;
        if (izsVar == null) {
            izsVar = null;
        }
        izsVar.invoke(motionEvent2);
        return s3q0.a;
    }
}
