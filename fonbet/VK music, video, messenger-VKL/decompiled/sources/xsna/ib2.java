package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
/* loaded from: classes11.dex */
public final class ib2 extends Lambda implements izs<yvj, l2x> {
    final /* synthetic */ jua0 $request;
    final /* synthetic */ kb2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib2(jua0 jua0Var, kb2 kb2Var) {
        super(1);
        this.$request = jua0Var;
        this.this$0 = kb2Var;
    }

    @Override // xsna.izs
    public final l2x invoke(yvj yvjVar) {
        return new l2x(this.$request, new hb2(this.this$0));
    }
}
