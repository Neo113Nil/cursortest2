package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;
import xsna.t7n;

/* compiled from: DiscoverSimilarFeedMviStoriesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class r8n implements nn50<ur60, on50, ds60, qr60, yo60> {
    public final /* synthetic */ s8n b;

    public r8n(s8n s8nVar) {
        this.b = s8nVar;
    }

    @Override // xsna.nn50
    public final void a(ds60 ds60Var) {
        this.b.a(a9n.b(ds60Var));
    }

    @Override // xsna.nn50
    public final void c(yo60 yo60Var) {
        this.b.c(new t7n.a(yo60Var));
    }

    @Override // xsna.nn50
    public final ur60 e(qr60 qr60Var) {
        qr60 qr60Var2 = qr60Var;
        if (!(qr60Var2 instanceof qr60.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((l8n) this.b.b.e(new i8n((qr60.a) qr60Var2, null, null))).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.nn50
    public final ur60 getCurrentState() {
        return ((l8n) this.b.getCurrentState()).e;
    }
}
