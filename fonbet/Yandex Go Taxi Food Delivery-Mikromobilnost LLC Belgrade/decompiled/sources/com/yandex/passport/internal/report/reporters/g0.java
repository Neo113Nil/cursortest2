package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.v7;
import com.yandex.passport.internal.report.yd;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class g0 extends l3 implements f0 {
    public final void j(Uid uid, Uid uid2, ArrayList arrayList) {
        f(v7.w, new com.yandex.passport.internal.report.i("all_apps", 25, false), new yd(uid), new ld(uid2), new md(arrayList));
    }

    public final void k(Uid uid, Uid uid2, ArrayList arrayList) {
        f(v7.w, new com.yandex.passport.internal.report.i("this_app", 25, false), new yd(uid), new ld(uid2), new md(arrayList));
    }
}
