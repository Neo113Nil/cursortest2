package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public final class g6x implements hv90 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g6x(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hv90
    public final Object a(ywl ywlVar, c5j0 c5j0Var, Continuation continuation) {
        u1m a;
        switch (this.a) {
            case 0:
                return b();
            default:
                String str = null;
                f2m f2mVar = c5j0Var instanceof f2m ? (f2m) c5j0Var : null;
                if (f2mVar != null && (a = f2mVar.a()) != null) {
                    str = a.a;
                }
                return !jl40.l(str, "bdui/v1/superapp/search") ? b.f() : gw00.e(new Pair("restore_state_on_return", qcx.a(Boolean.valueOf(((f8v0) this.b).i))));
        }
    }

    @Override // defpackage.hv90
    public final Map b() {
        switch (this.a) {
            case 0:
                return gw00.e(new Pair(ClidProvider.STATE, ooc.E(gtq0.m(((k6x) this.b).b, "send-to-backend").a)));
            default:
                return b.f();
        }
    }
}
