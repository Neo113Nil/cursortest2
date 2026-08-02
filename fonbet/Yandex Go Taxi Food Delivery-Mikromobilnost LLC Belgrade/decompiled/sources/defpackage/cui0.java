package defpackage;

import kotlin.Result;

/* loaded from: classes10.dex */
public final class cui0 implements xtz {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ cui0(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // defpackage.xtz
    public final void onResult(Object obj) {
        int i = this.a;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                if (!j18Var.y()) {
                    j18Var.resumeWith(obj);
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!j18Var.y()) {
                    j18Var.resumeWith(new Result.Failure(th));
                    break;
                }
                break;
        }
    }
}
