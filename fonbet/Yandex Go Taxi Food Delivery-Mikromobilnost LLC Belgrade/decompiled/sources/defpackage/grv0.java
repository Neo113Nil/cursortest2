package defpackage;

import android.view.ViewStub;

/* loaded from: classes12.dex */
public final class grv0 implements frv0 {
    public final lrv0 a;
    public final fva0 b;

    public grv0(lrv0 lrv0Var, fva0 fva0Var) {
        this.a = lrv0Var;
        this.b = fva0Var;
    }

    @Override // defpackage.frv0
    public final erv0 a(ViewStub viewStub) {
        return new irv0(this.a, this.b, viewStub);
    }
}
