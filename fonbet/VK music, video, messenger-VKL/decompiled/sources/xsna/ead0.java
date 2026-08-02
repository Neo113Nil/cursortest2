package xsna;

/* compiled from: PrimaryPhotoAlbumHolder.kt */
/* loaded from: classes4.dex */
public final class ead0 implements b780 {
    public final /* synthetic */ had0 b;

    public ead0(had0 had0Var) {
        this.b = had0Var;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        had0 had0Var = this.b;
        u1c0 J0 = had0Var.J0();
        Object obj = J0 != null ? J0.h : null;
        s6d0 s6d0Var = obj instanceof s6d0 ? (s6d0) obj : null;
        if (s6d0Var != null) {
            had0Var.X6(s6d0Var, false);
        } else {
            had0Var.Y6(false);
        }
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
        had0 had0Var = this.b;
        u1c0 J0 = had0Var.J0();
        Object obj = J0 != null ? J0.h : null;
        s6d0 s6d0Var = obj instanceof s6d0 ? (s6d0) obj : null;
        if (s6d0Var != null) {
            had0Var.X6(s6d0Var, false);
        } else {
            had0Var.Y6(false);
        }
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        had0 had0Var = this.b;
        u1c0 J0 = had0Var.J0();
        Object obj = J0 != null ? J0.h : null;
        s6d0 s6d0Var = obj instanceof s6d0 ? (s6d0) obj : null;
        if (s6d0Var != null) {
            had0Var.X6(s6d0Var, true);
        } else {
            had0Var.Y6(true);
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }
}
