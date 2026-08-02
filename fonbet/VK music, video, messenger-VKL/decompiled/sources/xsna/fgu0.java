package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fgu0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fgu0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        WebApiApplication v;
        switch (this.b) {
            case 0:
                ggu0 ggu0Var = (ggu0) this.c;
                gzs gzsVar = (gzs) this.d;
                if (ggu0Var.v() && (v = ggu0Var.e.v()) != null && v.f()) {
                    ggu0Var.l().a();
                }
                gzsVar.invoke();
                break;
            case 1:
                break;
            case 2:
                gvw0 gvw0Var = (gvw0) this.c;
                gzs gzsVar2 = (gzs) this.d;
                gvw0Var.d = false;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                break;
            default:
                ((ujx0) this.c).d((String) this.d);
                break;
        }
        return s3q0.a;
    }
}
