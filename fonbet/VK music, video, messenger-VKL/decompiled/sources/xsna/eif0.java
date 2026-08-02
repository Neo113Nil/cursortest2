package xsna;

import android.os.Trace;
import kotlin.jvm.internal.Lambda;

/* compiled from: RectManager.kt */
/* loaded from: classes11.dex */
public final class eif0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ fif0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eif0(fif0 fif0Var) {
        super(0);
        this.this$0 = fif0Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        fif0 fif0Var = this.this$0;
        fif0Var.h = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            fif0Var.a();
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
            return s3q0.a;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
