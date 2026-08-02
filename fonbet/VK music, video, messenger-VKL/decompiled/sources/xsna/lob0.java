package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lob0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lob0(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((mob0) this.d).h((wpb0) this.e, this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                i6v0 i6v0Var = (i6v0) this.d;
                ao50 ao50Var = (ao50) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2123308898, intValue, -1, "com.vk.mvi.compose.vk.VkMviComposeView.Content.<anonymous> (VkMviComposeView.kt:21)");
                    }
                    i6v0Var.a(ao50Var, this.c, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                vmx0 vmx0Var = (vmx0) this.d;
                List list = (List) this.e;
                ((Integer) obj2).getClass();
                vmx0Var.D(ne7.I(513), (androidx.compose.runtime.a) obj, list, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lob0(i6v0 i6v0Var, ao50 ao50Var, izs izsVar) {
        this.b = 1;
        this.d = i6v0Var;
        this.e = ao50Var;
        this.c = izsVar;
    }
}
