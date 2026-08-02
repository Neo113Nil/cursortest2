package com.yandex.passport.internal.report.diary;

import android.os.Bundle;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.util.p;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.tje;

/* loaded from: classes8.dex */
public final class k {
    public final com.yandex.passport.internal.flags.j a;
    public final com.yandex.passport.common.a b;
    public final c c;
    public final b d;
    public final ike e;

    public k(com.yandex.passport.internal.flags.j jVar, com.yandex.passport.common.a aVar, c cVar, b bVar, com.yandex.passport.common.coroutine.a aVar2) {
        this.a = jVar;
        this.b = aVar;
        this.c = cVar;
        this.d = bVar;
        this.e = bvf0.a(((com.yandex.passport.common.coroutine.b) aVar2).e.plus(p.o("DiaryRecorder")));
    }

    public final void a(j jVar, Bundle bundle, String str) {
        if (((Boolean) this.a.b(q.H)).booleanValue()) {
            tje.N(this.e, null, null, new DiaryRecorder$recordIntentData$1$1(str, this, jVar, bundle, null), 3);
        }
    }

    public final void b(x2 x2Var) {
        if (((Boolean) this.a.b(q.H)).booleanValue()) {
            tje.N(this.e, null, null, new DiaryRecorder$recordMethod$1$1(this, x2Var, null), 3);
        }
    }
}
