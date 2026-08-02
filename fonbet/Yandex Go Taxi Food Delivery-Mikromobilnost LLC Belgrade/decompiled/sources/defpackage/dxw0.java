package defpackage;

/* loaded from: classes6.dex */
public final class dxw0 implements x880 {
    public boolean a;
    public final /* synthetic */ tj b;

    public dxw0(tj tjVar) {
        this.b = tjVar;
    }

    @Override // defpackage.x880
    public final void n() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b.invoke(Boolean.TRUE);
    }

    @Override // defpackage.x880
    public final void o() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b.invoke(Boolean.FALSE);
    }
}
