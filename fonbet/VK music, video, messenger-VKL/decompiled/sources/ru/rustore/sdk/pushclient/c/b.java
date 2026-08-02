package ru.rustore.sdk.pushclient.c;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.pushclient.k.b;
import xsna.epx;
import xsna.j5g;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.x9y0;

/* loaded from: classes9.dex */
public final class b extends BaseAnalyticsEvent {
    public final Object b;

    public static final class a extends Lambda implements wzs<Map<String, String>, x9y0, s3q0> {
        public static final a i = new a();

        public a() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(Map<String, String> map, x9y0 x9y0Var) {
            Map<String, String> map2 = map;
            x9y0 x9y0Var2 = x9y0Var;
            map2.put("master_package_name", x9y0Var2.a);
            ExtensionsKt.set(map2, "is_from_arbiter", x9y0Var2.b);
            return s3q0.a;
        }
    }

    /* renamed from: ru.rustore.sdk.pushclient.c.b$b, reason: collision with other inner class name */
    public static final class C2399b extends Lambda implements wzs<Map<String, String>, Throwable, s3q0> {
        public static final C2399b i = new C2399b();

        public C2399b() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(Map<String, String> map, Throwable th) {
            String str;
            Map<String, String> map2 = map;
            Throwable th2 = th;
            if (th2 instanceof b.a) {
                b.a aVar = (b.a) th2;
                if (aVar instanceof b.a.C2403a) {
                    str = "master_not_saved";
                } else if (aVar instanceof b.a.C2404b) {
                    map2.put("installed_hosts", j5g.g0(((b.a.C2404b) th2).a, StringUtils.COMMA, null, null, 0, null, 62));
                    str = "no_hosts_from_api_received";
                } else if (aVar instanceof b.a.c) {
                    b.a.c cVar = (b.a.c) th2;
                    map2.put("master", cVar.a);
                    map2.put("installed_hosts", j5g.g0(cVar.b, StringUtils.COMMA, null, null, 0, null, 62));
                    str = "no_master_in_hosts_list";
                } else if (aVar instanceof b.a.d) {
                    str = "no_master_installed";
                } else {
                    if (!(aVar instanceof b.a.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b.a.e eVar = (b.a.e) th2;
                    map2.put("arbiter", eVar.a);
                    Throwable th3 = eVar.b;
                    if (th3 != null) {
                        ExtensionsKt.setErrorMessage(map2, "arbiter_response", th3);
                    }
                    str = "no_response_from_arbiter";
                }
                map2.put("reason", str);
            }
            return s3q0.a;
        }
    }

    public b(Object obj) {
        super("vkcm_sdk_client_requested_master_host");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setResult(mapBuilder, this.b, a.i, C2399b.i);
        return mapBuilder.h();
    }

    public final int hashCode() {
        return Result.b(this.b);
    }

    public final String toString() {
        return "MasterHostRequestResultEvent(result=" + ((Object) Result.c(this.b)) + ')';
    }
}
