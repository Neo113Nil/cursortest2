package xsna;

import com.vk.push.common.Logger;
import kotlin.jvm.internal.Lambda;

/* compiled from: NotifierConnectionComponent.kt */
/* loaded from: classes5.dex */
public final class nk70 extends Lambda implements izs<tk70, s3q0> {
    final /* synthetic */ ok70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk70(ok70 ok70Var) {
        super(1);
        this.this$0 = ok70Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tk70 tk70Var) {
        Logger.DefaultImpls.info$default(this.this$0.e, "Close connection on empty tokens", null, 2, null);
        tk70Var.d("There are no tokens to connect");
        return s3q0.a;
    }
}
