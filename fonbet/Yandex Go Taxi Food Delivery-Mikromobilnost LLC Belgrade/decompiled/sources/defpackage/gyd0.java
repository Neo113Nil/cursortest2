package defpackage;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.internal.authorized.j;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class gyd0 implements x790 {
    public final PollInfoRequest a;
    public final int b;
    public final j c;
    public final ike d;

    public gyd0(vse vseVar, PollInfoRequest pollInfoRequest, int i, j jVar) {
        this.a = pollInfoRequest;
        this.b = i;
        this.c = jVar;
        this.d = vseVar.b();
    }

    @Override // defpackage.x790
    public final void a(qgg qggVar) {
        new eyd0(this.d, this, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, qggVar);
    }

    @Override // defpackage.x790
    public final void b() {
        a.g(this.d.a, null);
    }

    @Override // defpackage.x790
    public final Long c(Object obj) {
        return Long.valueOf(((PollInfoResponse.Vote) obj).getTimestamp());
    }

    @Override // defpackage.x790
    public final void d(Object obj, int i, aq80 aq80Var) {
        ((Number) obj).longValue();
        aq80Var.F(new w790(EmptyList.a, false, false));
    }

    @Override // defpackage.x790
    public final void e(Object obj, int i, yj70 yj70Var) {
        new eyd0(this.d, this, ((Number) obj).longValue() - 1, yj70Var);
    }
}
