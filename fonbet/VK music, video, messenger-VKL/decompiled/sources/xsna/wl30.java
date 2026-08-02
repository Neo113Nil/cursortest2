package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wl30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wl30(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                tk30 tk30Var = ((com.vk.im.ui.components.msg_list.c) this.d).o.d;
                tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, this.c, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870913, 1073741823));
                break;
            default:
                pim0 pim0Var = (pim0) this.d;
                pim0Var.D = this.c;
                pim0Var.a.invalidate();
                break;
        }
        return s3q0.a;
    }
}
