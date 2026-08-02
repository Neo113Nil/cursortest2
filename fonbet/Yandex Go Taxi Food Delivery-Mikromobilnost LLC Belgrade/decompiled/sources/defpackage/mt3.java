package defpackage;

import com.yandex.go.overdraft.domain.b;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class mt3 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ mt3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return b.d(this.b, (lt3) obj, continuation);
            default:
                return b.i(this.b, (pl21) obj, continuation);
        }
    }
}
