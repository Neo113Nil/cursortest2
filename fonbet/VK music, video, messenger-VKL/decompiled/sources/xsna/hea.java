package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hea implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hea(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                n3a n3aVar = (n3a) this.c;
                kea keaVar = (kea) this.d;
                String str = ((v1i0) n3aVar).b;
                if (str != null) {
                    keaVar.i.b.e.b(new oon0(str, null, false, false, 14), false);
                    break;
                }
                break;
            default:
                UserId userId = (UserId) this.c;
                jsa jsaVar = (jsa) this.d;
                if (userId != null) {
                    x90 x90Var = new x90(5);
                    jsaVar.getClass();
                    jsa.c(x90Var);
                    break;
                } else {
                    vt1 vt1Var = new vt1(5);
                    jsaVar.getClass();
                    jsa.c(vt1Var);
                    break;
                }
        }
    }
}
