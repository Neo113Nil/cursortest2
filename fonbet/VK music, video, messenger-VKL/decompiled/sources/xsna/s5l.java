package xsna;

import java.io.File;
import java.util.List;

/* compiled from: DebugFileManagerScreen.kt */
/* loaded from: classes17.dex */
public final class s5l implements gzs<s3q0> {
    public final /* synthetic */ s8r b;
    public final /* synthetic */ j20 c;
    public final /* synthetic */ wh50<List<String>> d;
    public final /* synthetic */ wh50<String> e;

    public s5l(s8r s8rVar, j20 j20Var, wh50 wh50Var, wh50 wh50Var2) {
        this.b = s8rVar;
        this.c = j20Var;
        this.d = wh50Var;
        this.e = wh50Var2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        s8r s8rVar = this.b;
        boolean z = s8rVar.b;
        File file = s8rVar.d;
        if (z) {
            wh50<List<String>> wh50Var = this.d;
            List<String> value = wh50Var.getValue();
            wh50<String> wh50Var2 = this.e;
            wh50Var.setValue(j5g.v0(wh50Var2.getValue(), value));
            wh50Var2.setValue(file.getAbsolutePath());
        } else {
            this.c.invoke(file);
        }
        return s3q0.a;
    }
}
