package xsna;

import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class wp01 implements j601 {
    public final epf b;
    public final j601 c;
    public final j601 d;
    public final qvz0 e;

    public wp01(epf epfVar, j601 j601Var, j601 j601Var2, qvz0 qvz0Var) {
        this.b = epfVar;
        this.c = j601Var;
        this.d = j601Var2;
        this.e = qvz0Var;
    }

    @Override // xsna.j601
    public final Object zza() {
        return new vjq(((yuz0) this.b.b).a, (File) this.c.zza(), (dp01) this.d.zza(), u401.a(this.e));
    }
}
