package xsna;

import com.vk.core.compose.component.group.header.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xrc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xrc(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((yrc) this.d).a((pyf) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                String str = (String) this.d;
                gzs gzsVar = (gzs) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                yqe.b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var);
                break;
            default:
                com.vk.core.compose.component.group.header.e eVar = (com.vk.core.compose.component.group.header.e) this.d;
                f.b bVar = (f.b) this.e;
                com.vk.core.compose.component.group.header.b bVar2 = (com.vk.core.compose.component.group.header.b) this.f;
                ((Integer) obj2).getClass();
                eVar.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, bVar2, bVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xrc(com.vk.core.compose.component.group.header.e eVar, f.b bVar, com.vk.core.compose.component.group.header.b bVar2, int i) {
        this.b = 2;
        this.d = eVar;
        this.e = bVar;
        this.f = bVar2;
        this.c = i;
    }
}
