package com.yandex.passport.internal.analytics;

import java.util.Arrays;
import kotlin.Pair;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class u {
    public final t a;

    public u(t tVar) {
        this.a = tVar;
    }

    public final void a(m mVar, Pair... pairArr) {
        this.a.a(mVar, kotlin.collections.b.l((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    public final void b(String str) {
        a(q.h, new Pair(ACSPConstants.STATUS, str));
    }
}
