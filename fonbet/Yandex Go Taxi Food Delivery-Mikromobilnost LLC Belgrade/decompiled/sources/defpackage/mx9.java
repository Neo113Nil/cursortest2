package defpackage;

import com.yandex.go.chargers.discovery.shortcuts.ChargersDiscoveryShortcutGridViewFactory$productsParamFlow$$inlined$flatMapLatest$1;
import com.yandex.go.chargers.discovery.shortcuts.b;
import com.yandex.go.chargers.discovery.shortcuts.c;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class mx9 implements faf0, jms {
    public final /* synthetic */ c a;

    public mx9(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.faf0
    public final tpr a() {
        c cVar = this.a;
        return e.X(new b(e.d(cVar.h.d)), new ChargersDiscoveryShortcutGridViewFactory$productsParamFlow$$inlined$flatMapLatest$1(null, cVar));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof faf0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, c.class, "productsParamFlow", "productsParamFlow()Lkotlinx/coroutines/flow/Flow;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
