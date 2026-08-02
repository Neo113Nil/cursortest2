package defpackage;

import com.yandex.go.account.user_verification.domain.i;
import com.yandex.go.coroutines.b;
import com.yandex.go.profile.domain.flex.ProfileStateRepository$onChangedEmit$$inlined$withPreviousEmit$1;
import com.yandex.go.profile.domain.flex.ProfileStateRepository$special$$inlined$safeCollectIn$1;
import com.yandex.go.profile.domain.flex.ProfileStateRepository$special$$inlined$start$1;
import com.yandex.go.profile.domain.flex.ProfileStateRepository$withCacheCleanupOnUidChanged$$inlined$withPreviousEmit$1;
import com.yandex.go.profile.domain.flex.h;
import com.yandex.go.profile.domain.flex.j;
import com.yandex.go.profile.domain.flex.l;
import com.yandex.go.profile.domain.flex.n;
import com.yandex.go.profile.domain.flex.p;
import com.yandex.go.profile.domain.flex.r;
import java.util.Arrays;
import kotlin.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.am.g;

/* loaded from: classes8.dex */
public final class mgf0 {
    public final jp50 a;
    public final i3y b;
    public final n0 c;

    public mgf0(tse tseVar, jp50 jp50Var, x1f0 x1f0Var, i iVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, tt2 tt2Var) {
        this.a = jp50Var;
        i3y a = a.a(new mj(h3yVar, 9));
        this.b = a.a(new mj(h3yVar2, 10));
        i3y a2 = a.a(new mj(h3yVar3, 11));
        i3y a3 = a.a(new mj(h3yVar4, 12));
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.c = b;
        int i = 21;
        j jVar = new j(e.K((tpr[]) Arrays.copyOf(new tpr[]{new r(new mth(new j0(null, e.K((tpr[]) Arrays.copyOf(new tpr[]{new l(new mth(e.s(((g) a.getValue()).a(), new yk(i)), 4)), a(b.d(((g) a.getValue()).h(), new ProfileStateRepository$special$$inlined$start$1(null, this)), new qda0(19))}, 2)), new ProfileStateRepository$withCacheCleanupOnUidChanged$$inlined$withPreviousEmit$1(3, null)), 6), this), a(new n(new com.yandex.go.flex.common.api.b(((ajr) a2.getValue()).b)), new qda0(i)), a(e.p(((rgf0) a3.getValue()).a, 200L), new qda0(18)), a(x1f0Var.b, new qda0(20)), new p(iVar.a())}, 5)));
        tt2Var.getClass();
        tje.N(bvf0.M(tseVar, uyj.a), null, null, new ProfileStateRepository$special$$inlined$safeCollectIn$1(jVar, b, null), 3);
    }

    public static h a(tpr tprVar, tls tlsVar) {
        return new h(new mth(new j0(null, tprVar, new ProfileStateRepository$onChangedEmit$$inlined$withPreviousEmit$1(3, null)), 6), tlsVar);
    }
}
