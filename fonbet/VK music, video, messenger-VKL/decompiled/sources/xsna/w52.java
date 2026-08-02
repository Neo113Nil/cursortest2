package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class w52 extends Lambda implements izs<yvj, kb2> {
    final /* synthetic */ p52 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w52(p52 p52Var) {
        super(1);
        this.this$0 = p52Var;
    }

    @Override // xsna.izs
    public final kb2 invoke(yvj yvjVar) {
        p52 p52Var = this.this$0;
        return new kb2(p52Var, p52Var.getTextInputService(), yvjVar);
    }
}
