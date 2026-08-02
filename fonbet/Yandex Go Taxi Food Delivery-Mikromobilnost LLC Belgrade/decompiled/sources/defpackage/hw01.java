package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hw01 implements e35 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hw01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e35
    public final void d() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((iw01) obj).k = true;
                break;
            case 1:
                ((iw01) obj).k = true;
                break;
            case 2:
                ((iw01) obj).k = true;
                break;
            default:
                l35 l35Var = (l35) obj;
                boolean z = l35Var.r.m() == 1.0f;
                if (z != l35Var.x) {
                    l35Var.x = z;
                    l35Var.o.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
