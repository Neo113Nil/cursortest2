package defpackage;

import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.internal.translator.j;
import java.util.LinkedHashSet;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class cz01 extends hy10 {
    public final /* synthetic */ j18 A;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz01(j jVar, j18 j18Var, String str, ry10 ry10Var, String str2, long j, x22 x22Var) {
        super(str, ry10Var, null, str2, j, x22Var);
        this.z = jVar;
        this.A = j18Var;
    }

    @Override // defpackage.hy10, defpackage.ylu
    public final void f(HistoryResponse historyResponse) {
        super.f(historyResponse);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        j jVar = this.z;
        jVar.e.d(new bz01(historyResponse, jVar, linkedHashSet));
        j18 j18Var = this.A;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(a.N0(linkedHashSet));
        }
    }
}
