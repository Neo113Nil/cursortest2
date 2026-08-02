package xsna;

import kotlin.Pair;
import xsna.ko40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jo40 implements gzs {
    public final /* synthetic */ ko40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ko40.a d;

    public /* synthetic */ jo40(ko40 ko40Var, int i, ko40.a aVar) {
        this.b = ko40Var;
        this.c = i;
        this.d = aVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Pair pair = (Pair) j5g.b0(this.c, this.b.p);
        if (pair == null) {
            return s3q0.a;
        }
        yg5 yg5Var = (yg5) pair.d();
        this.d.d = true;
        yg5Var.G0(false);
        yg5Var.seek(60000L);
        yg5Var.play();
        return s3q0.a;
    }
}
