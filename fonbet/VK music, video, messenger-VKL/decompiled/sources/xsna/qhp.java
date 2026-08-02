package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qhp implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qhp(com.vk.core.compose.component.cell.content.b1 b1Var, int i) {
        this.d = b1Var;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((rhp) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.b1) this.d).b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qhp(rhp rhpVar, int i) {
        this.d = rhpVar;
        this.c = i;
    }
}
