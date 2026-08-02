package xsna;

import android.net.Uri;

/* compiled from: DebugMockApiResponsesScreen.kt */
/* loaded from: classes17.dex */
public final class n6l implements gzs<s3q0> {
    public final /* synthetic */ int b;
    public final /* synthetic */ rh00<String[], Uri> c;
    public final /* synthetic */ wh50<Integer> d;

    public n6l(int i, rh00<String[], Uri> rh00Var, wh50<Integer> wh50Var) {
        this.b = i;
        this.c = rh00Var;
        this.d = wh50Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        fh9 fh9Var = r6l.a;
        this.d.setValue(Integer.valueOf(this.b));
        this.c.a(new String[]{"*/*"});
        return s3q0.a;
    }
}
