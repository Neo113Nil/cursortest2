package xsna;

import com.vk.core.compose.component.group.header.GroupHeader$Right;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e8k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e8k(GroupHeader$Right.b.a aVar, com.vk.core.compose.component.group.header.b bVar, int i) {
        this.b = 1;
        this.d = aVar;
        this.e = bVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                k8k.d((izs) this.d, (x9k) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((GroupHeader$Right.b.a) this.d).a((com.vk.core.compose.component.group.header.b) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                yl70 yl70Var = (yl70) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                yl70Var.z(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            default:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.c | 1);
                ((wlp0) this.d).a(this.e, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ e8k(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ e8k(izs izsVar, x9k x9kVar, int i) {
        this.b = 0;
        this.d = izsVar;
        this.e = x9kVar;
        this.c = i;
    }
}
