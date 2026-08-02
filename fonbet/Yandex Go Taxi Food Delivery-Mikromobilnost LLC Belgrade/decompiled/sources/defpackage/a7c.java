package defpackage;

/* loaded from: classes11.dex */
public final class a7c extends tkn {
    public final /* synthetic */ b7c a;

    public a7c(b7c b7cVar) {
        this.a = b7cVar;
    }

    @Override // defpackage.tkn
    public final void b(float f, float f2, float f3, bir0 bir0Var) {
        b7c b7cVar = this.a;
        float f4 = b7cVar.c;
        float f5 = f3 * f4;
        int i = b7cVar.b / 2;
        float degrees = (float) Math.toDegrees(Math.acos(i / r9));
        float f6 = i;
        bir0Var.a(f2 - f4, (-f5) - f6, f2 + f4, f5 - f6, degrees + 90.0f, degrees * (-2.0f));
    }
}
