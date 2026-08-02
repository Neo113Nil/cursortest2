package ru.rustore.sdk.pushclient.d;

import com.vk.push.common.AppInfo;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.m.h;
import xsna.aaz0;
import xsna.b6l;
import xsna.epx;
import xsna.s101;
import xsna.spj;

/* loaded from: classes9.dex */
public final class c extends BaseAnalyticsEvent {
    public final RemoteMessage b;

    @b6l(c = "ru.rustore.sdk.pushclient.internal.analytics.events.pushmessage.PushShowAnalyticsEvent", f = "PushShowAnalyticsEvent.kt", l = {20}, m = "getParams")
    public static final class a extends ContinuationImpl {
        public c a;
        public Map b;
        public Map c;
        public Map d;
        public /* synthetic */ Object e;
        public int g;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return c.this.getParams(this);
        }
    }

    public c(RemoteMessage remoteMessage) {
        super("vkcm_sdk_client_show_push");
        this.b = remoteMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        a aVar;
        int i;
        Map map;
        Map map2;
        Map map3;
        c cVar;
        aaz0 aaz0Var;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                Object obj = aVar.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.g;
                if (i != 0) {
                    kotlin.a.a(obj);
                    MapBuilder mapBuilder = new MapBuilder();
                    ExtensionsKt.setPushToken(mapBuilder, this.b.getToken());
                    ExtensionsKt.setPushId(mapBuilder, this.b.getToken(), this.b.getMessageId());
                    ru.rustore.sdk.pushclient.k.b bVar = (ru.rustore.sdk.pushclient.k.b) h.e.getValue();
                    aVar.a = this;
                    aVar.b = mapBuilder;
                    aVar.c = mapBuilder;
                    aVar.d = mapBuilder;
                    aVar.g = 1;
                    AppInfo appInfo = bVar.j;
                    Object e = appInfo == null ? bVar.e(aVar) : appInfo;
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = mapBuilder;
                    map2 = map;
                    map3 = map2;
                    obj = e;
                    cVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = aVar.d;
                    map2 = aVar.c;
                    map3 = aVar.b;
                    cVar = aVar.a;
                    kotlin.a.a(obj);
                }
                ExtensionsKt.setMasterPackageName(map, ((AppInfo) obj).getPackageName());
                aaz0Var = s101.f;
                if (aaz0Var != null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                ExtensionsKt.setClientPackageName(map2, aaz0Var.a.getApplicationContext().getPackageName());
                ExtensionsKt.setReceivedBy(map2, cVar.b.getReceivedBy());
                return ((MapBuilder) map3).h();
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.g;
        if (i != 0) {
        }
        ExtensionsKt.setMasterPackageName(map, ((AppInfo) obj2).getPackageName());
        aaz0Var = s101.f;
        if (aaz0Var != null) {
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PushShowAnalyticsEvent(message=" + this.b + ')';
    }
}
