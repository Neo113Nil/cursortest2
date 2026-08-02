package xsna;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class qwb0 extends Lambda implements izs<gzs<? extends s3q0>, s3q0> {
    final /* synthetic */ owb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwb0(owb0 owb0Var) {
        super(1);
        this.this$0 = owb0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(gzs<? extends s3q0> gzsVar) {
        gzs<? extends s3q0> gzsVar2 = gzsVar;
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            gzsVar2.invoke();
        } else {
            Handler handler2 = this.this$0.getHandler();
            if (handler2 != null) {
                handler2.post(new q44(gzsVar2, 9));
            }
        }
        return s3q0.a;
    }
}
