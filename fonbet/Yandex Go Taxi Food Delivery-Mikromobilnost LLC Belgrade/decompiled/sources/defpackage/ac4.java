package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lac4;", "Lj530;", "Lzb4;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ac4 extends j530 {
    public zb4 a;
    public fyc b;

    @Override // defpackage.j530
    public final e530 a() {
        return new zb4(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.j530
    public final /* bridge */ /* synthetic */ void f(e530 e530Var) {
    }

    public final int hashCode() {
        return MSException.ERROR_MORE_DATA;
    }

    public final Object m(ContinuationImpl continuationImpl) {
        fyc fycVar = this.b;
        if (fycVar == null) {
            fycVar = gwk0.b();
            this.b = fycVar;
            zb4 zb4Var = this.a;
            if (zb4Var != null && zb4Var.isAttached()) {
                zb4Var.E0();
            }
        }
        Object s = fycVar.s(continuationImpl);
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }
}
