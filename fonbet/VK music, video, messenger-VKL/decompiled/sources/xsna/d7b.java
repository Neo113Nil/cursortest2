package xsna;

import com.vk.dto.common.data.VKList;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d7b implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d7b(j15 j15Var, vmq0 vmq0Var, boolean z) {
        this.d = vmq0Var;
        this.e = j15Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                e7b e7bVar = (e7b) this.d;
                w2w w2wVar = (w2w) this.e;
                if (this.c) {
                    w2wVar.I0().a().Y(e7bVar.c.b, e7bVar.d);
                }
                e7bVar.Q(w2wVar);
                break;
            default:
                Pair pair = (Pair) obj;
                ((vmq0) this.d).D((j15) this.e, (VKList) pair.d(), (VKList) pair.g(), this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ d7b(boolean z, e7b e7bVar, w2w w2wVar) {
        this.c = z;
        this.d = e7bVar;
        this.e = w2wVar;
    }
}
