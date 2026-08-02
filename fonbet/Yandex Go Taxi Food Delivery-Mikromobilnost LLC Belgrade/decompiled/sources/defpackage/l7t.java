package defpackage;

import com.yandex.messaging.domain.folders.GetFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1;
import java.util.Set;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class l7t extends vds0 {
    public final h2t b;
    public final k020 c;
    public final w5t d;
    public final zjt e;
    public final o7t f;
    public final el21 g;
    public final yjt h;

    public l7t(h2t h2tVar, k020 k020Var, w5t w5tVar, zjt zjtVar, o7t o7tVar, el21 el21Var, kse kseVar) {
        super(kseVar.e);
        this.b = h2tVar;
        this.c = k020Var;
        this.d = w5tVar;
        this.e = zjtVar;
        this.f = o7tVar;
        this.g = el21Var;
        this.h = new yjt();
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        k7t k7tVar;
        j7t j7tVar = (j7t) obj;
        String str = j7tVar.a;
        Set set = j7tVar.b;
        if (evu0.J(str)) {
            k7tVar = new k7t(this.d.a(zy11.a), this, 1);
        } else {
            hgu hguVar = new hgu(str, (k020) this.b.a);
            zjt zjtVar = this.e;
            zjtVar.getClass();
            k7tVar = new k7t(zjtVar.a(new ujt(hguVar, this.h)), this, 0);
        }
        return e.X(k7tVar, new GetFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1(null, str, set, this));
    }
}
