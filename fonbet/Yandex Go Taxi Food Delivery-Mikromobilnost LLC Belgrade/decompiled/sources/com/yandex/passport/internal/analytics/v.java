package com.yandex.passport.internal.analytics;

import com.yandex.passport.internal.entities.TrackId;
import java.util.Arrays;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class v {
    public final t a;

    public v(t tVar) {
        this.a = tVar;
    }

    public static String b(TrackId trackId) {
        String l = com.yandex.passport.internal.ui.sloth.e.l(trackId.getValue());
        return l == null ? "null" : l;
    }

    public final void a(TrackId trackId) {
        c(h.i, new Pair("track_id", b(trackId)));
    }

    public final void c(m mVar, Pair... pairArr) {
        this.a.a(mVar, kotlin.collections.b.l((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }
}
