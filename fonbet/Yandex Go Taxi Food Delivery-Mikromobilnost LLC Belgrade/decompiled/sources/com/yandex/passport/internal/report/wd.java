package com.yandex.passport.internal.report;

import android.content.Context;
import defpackage.gw00;
import defpackage.ljo;
import io.appmetrica.analytics.RtmErrorEvent;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class wd {
    public final Throwable a;
    public final String b;
    public final Map c;

    public wd(Throwable th, String str) {
        Map f = kotlin.collections.b.f();
        this.a = th;
        this.b = str;
        this.c = f;
    }

    public final RtmErrorEvent a(Context context, Map map) {
        RtmErrorEvent.Builder withSource = RtmErrorEvent.newBuilder(this.b).withVersion("7.55.1").withAdditional(new JSONObject(kotlin.collections.b.n(this.c, map)).toString()).withSource(context.getPackageName());
        Throwable th = this.a;
        return withSource.withStacktrace(th != null ? ljo.b(th) : null).build();
    }

    public final Pair b() {
        Throwable th = this.a;
        return new Pair(this.b, kotlin.collections.b.n(this.c, gw00.e(new Pair("throwable", th != null ? ljo.b(th) : "null"))));
    }
}
