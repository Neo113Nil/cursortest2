package ru.rustore.sdk.pushclient.e;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.kay0;
import xsna.s3q0;
import xsna.spj;
import xsna.vu5;
import xsna.wzs;

/* loaded from: classes9.dex */
public final class a extends BaseAnalyticsEvent {
    public final Object b;
    public final long c;

    /* renamed from: ru.rustore.sdk.pushclient.e.a$a, reason: collision with other inner class name */
    public static final class C2400a extends Lambda implements wzs<Map<String, String>, kay0, s3q0> {
        public static final C2400a i = new C2400a();

        public C2400a() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(Map<String, String> map, kay0 kay0Var) {
            ExtensionsKt.setPushToken(map, kay0Var.a);
            return s3q0.a;
        }
    }

    public a(Object obj, long j) {
        super("vkcm_sdk_client_exchange_intermediate_token");
        this.b = obj;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.b, aVar.b) && this.c == aVar.c;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setResult$default(mapBuilder, this.b, C2400a.i, null, 4, null);
        ExtensionsKt.setIntervalMs(mapBuilder, this.c);
        return mapBuilder.h();
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Result.b(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExchangePushTokenAnalyticsEvent(result=");
        sb.append((Object) Result.c(this.b));
        sb.append(", intervalMs=");
        return vu5.a(')', this.c, sb);
    }
}
