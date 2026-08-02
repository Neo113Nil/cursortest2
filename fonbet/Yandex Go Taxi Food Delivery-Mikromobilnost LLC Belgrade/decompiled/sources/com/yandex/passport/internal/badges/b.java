package com.yandex.passport.internal.badges;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.internal.report.reporters.l;
import java.io.File;

/* loaded from: classes8.dex */
public final class b {
    public final com.yandex.passport.common.coroutine.a a;
    public final com.yandex.passport.common.c b;
    public final l c;
    public final SharedPreferences d;
    public final File e;

    public b(Context context, com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.c cVar, l lVar) {
        this.a = aVar;
        this.b = cVar;
        this.c = lVar;
        this.d = context.getSharedPreferences("badges", 0);
        this.e = new File(context.getFilesDir(), "badges");
    }
}
