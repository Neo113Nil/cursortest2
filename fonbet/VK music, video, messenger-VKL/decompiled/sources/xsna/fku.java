package xsna;

import com.vk.core.compose.component.group.header.f;
import xsna.tnv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fku implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fku(f.c cVar, com.vk.core.compose.component.group.header.b bVar, f.b bVar2, int i) {
        this.d = cVar;
        this.e = bVar;
        this.f = bVar2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                f.c cVar = (f.c) this.d;
                com.vk.core.compose.component.group.header.b bVar = (com.vk.core.compose.component.group.header.b) this.e;
                f.b bVar2 = (f.b) this.f;
                ((Integer) obj2).getClass();
                cVar.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, bVar, bVar2);
                break;
            default:
                ((Integer) obj2).intValue();
                ((tnv0.a) this.d).a((String) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fku(tnv0.a aVar, String str, yzs yzsVar, int i) {
        this.d = aVar;
        this.e = str;
        this.f = yzsVar;
        this.c = i;
    }
}
