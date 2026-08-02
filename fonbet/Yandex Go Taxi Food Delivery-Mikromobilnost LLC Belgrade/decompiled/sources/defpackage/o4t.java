package defpackage;

import com.yandex.messaging.domain.folders.GetChatIdsByFolderIdUseCase$handleMainFolder$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.storage.folders.d;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class o4t extends vds0 {
    public final d b;
    public final w5t c;

    public o4t(kse kseVar, w5t w5tVar, d dVar) {
        super(kseVar.e);
        this.b = dVar;
        this.c = w5tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        k4t k4tVar = (k4t) obj;
        String str = k4tVar.a;
        if (str == null || str.length() == 0) {
            return e.X(this.c.a(zy11.a), new GetChatIdsByFolderIdUseCase$handleMainFolder$$inlined$flatMapLatest$1(null, this));
        }
        long longValue = k4tVar.b.longValue();
        return new ixr(this.b.a(longValue, str), longValue, 2);
    }
}
