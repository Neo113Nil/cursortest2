package xsna;

import com.vk.core.compose.component.group.header.GroupHeader$Right;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gs5 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gs5(GroupHeader$Right.a.b bVar, com.vk.core.compose.component.group.header.b bVar2, int i) {
        this.d = bVar;
        this.e = bVar2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                ((is5) this.d).f((ds5) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((GroupHeader$Right.a.b) this.d).a((com.vk.core.compose.component.group.header.b) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                a4b0 a4b0Var = (a4b0) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                a4b0Var.g(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ gs5(is5 is5Var, ds5 ds5Var, int i, int i2) {
        this.d = is5Var;
        this.e = ds5Var;
        this.c = i;
    }

    public /* synthetic */ gs5(a4b0 a4b0Var, jai jaiVar, int i) {
        this.d = a4b0Var;
        this.e = jaiVar;
        this.c = i;
    }
}
