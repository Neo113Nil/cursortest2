package defpackage;

/* loaded from: classes7.dex */
public final class es81 implements ul81 {
    @Override // defpackage.ul81
    public final ss81 a(si81 si81Var) {
        int i = rf71.a;
        if (i < 23 || i < 31) {
            return new w571().a(si81Var);
        }
        int e = g681.e(si81Var.c.E);
        nba1.d("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(rf71.x(e)));
        return new hn71(e).a(si81Var);
    }
}
