package xsna;

import kotlin.Result;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class n8c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n8c(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((wow) this.c).get(((Number) obj).intValue());
                return null;
            case 1:
                return "cell_item";
            default:
                ((lq9) this.c).resumeWith(new Result.Failure((Throwable) obj));
                return s3q0.a;
        }
    }
}
