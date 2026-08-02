package xsna;

/* compiled from: PhotosArchiveHandler.kt */
/* loaded from: classes7.dex */
public final class kea0 implements fhd0, lao0 {
    public final oga0 a;
    public final b25 b;

    public kea0(oga0 oga0Var, b25 b25Var) {
        this.a = oga0Var;
        this.b = b25Var;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        this.a.d(fgxVar.e, this.b.c(), false);
        blk.P(fgxVar).onSuccess();
    }
}
