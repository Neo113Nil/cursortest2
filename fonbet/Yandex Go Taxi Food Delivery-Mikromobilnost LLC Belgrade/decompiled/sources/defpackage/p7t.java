package defpackage;

import com.yandex.messaging.internal.backendconfig.a;
import java.util.Set;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class p7t extends vds0 {
    public final a b;
    public final u4r c;

    public p7t(a aVar, u4r u4rVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = u4rVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new l7(10, e.d(this.b.b), (Set) obj, this);
    }
}
