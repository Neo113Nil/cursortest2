package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;
import xsna.kj50;
import xsna.km50;
import xsna.wk50;
import xsna.xl50;

/* compiled from: MviActionDelegate.kt */
/* loaded from: classes3.dex */
public final class mj50<S extends km50, A extends kj50, P extends xl50> {
    public final oj50<S, A, P> a;
    public final wk50.a b;

    public mj50(oj50 oj50Var, wk50.a aVar) {
        this.a = oj50Var;
        this.b = aVar;
    }

    public final void a(S s, A a) {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType[] threadTypeArr = {ThreadType.STATE};
        aVar.getClass();
        ThreadType.a.a(threadTypeArr);
        this.a.a(this.b, s, a);
    }
}
