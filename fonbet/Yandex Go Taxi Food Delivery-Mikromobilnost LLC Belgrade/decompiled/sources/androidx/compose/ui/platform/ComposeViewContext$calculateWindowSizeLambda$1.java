package androidx.compose.ui.platform;

import defpackage.gwk0;
import defpackage.k6w;
import defpackage.mwa1;
import defpackage.qb91;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnxi;", "invoke", "()Lnxi;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class ComposeViewContext$calculateWindowSizeLambda$1 extends Lambda implements sls {
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewContext$calculateWindowSizeLambda$1(i iVar) {
        super(0);
        this.this$0 = iVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        this.this$0.getClass();
        boolean a = k6w.a(0L, 0L);
        i iVar = this.this$0;
        if (a) {
            return mwa1.c(iVar.a);
        }
        iVar.getClass();
        return qb91.c(gwk0.c(this.this$0.a.getContext()));
    }
}
