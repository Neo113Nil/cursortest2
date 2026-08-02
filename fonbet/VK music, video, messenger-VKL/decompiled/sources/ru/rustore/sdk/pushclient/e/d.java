package ru.rustore.sdk.pushclient.e;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.core.push.RegisterForPushesResult;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Lambda;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.nay0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes9.dex */
public final class d extends BaseAnalyticsEvent {
    public final String b;
    public final long c;
    public final Object d;
    public final String e;

    public static final class a extends Lambda implements wzs<Map<String, String>, nay0, s3q0> {
        public static final a i = new a();

        /* renamed from: ru.rustore.sdk.pushclient.e.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2401a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[RegisterForPushesResult.values().length];
                try {
                    iArr[RegisterForPushesResult.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RegisterForPushesResult.ALREADY_REGISTERED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public a() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(Map<String, String> map, nay0 nay0Var) {
            String str;
            Map<String, String> map2 = map;
            nay0 nay0Var2 = nay0Var;
            map2.put("master_package_name", nay0Var2.b.getPackageName());
            int i2 = C2401a.a[nay0Var2.a.ordinal()];
            if (i2 == 1) {
                str = "registered";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "already_registered";
            }
            map2.put("reason", str);
            return s3q0.a;
        }
    }

    public static final class b extends Lambda implements wzs<Map<String, String>, Throwable, s3q0> {
        public b() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(Map<String, String> map, Throwable th) {
            map.put("master_package_name", d.this.e);
            return s3q0.a;
        }
    }

    public d(long j, Object obj, String str, String str2) {
        super("vkcm_sdk_client_subscribe_for_pushes");
        this.b = str;
        this.c = j;
        this.d = obj;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setPushToken(mapBuilder, this.b);
        ExtensionsKt.setIntervalMs(mapBuilder, this.c);
        ExtensionsKt.setResult(mapBuilder, this.d, a.i, new b());
        return mapBuilder.h();
    }

    public final int hashCode() {
        return this.e.hashCode() + ((Result.b(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterForPushesAnalyticsEvent(pushToken=");
        sb.append(this.b);
        sb.append(", intervalMs=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append((Object) Result.c(this.d));
        sb.append(", masterPackageName=");
        return ho8.a(sb, this.e, ')');
    }
}
