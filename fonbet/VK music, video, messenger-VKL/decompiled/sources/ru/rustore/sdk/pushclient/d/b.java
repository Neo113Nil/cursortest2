package ru.rustore.sdk.pushclient.d;

import com.vk.push.common.AppInfo;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.core.domain.repository.PackagesRepository;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.m.h;
import xsna.b6l;
import xsna.epx;
import xsna.spj;

/* loaded from: classes9.dex */
public final class b extends BaseAnalyticsEvent {
    public final RemoteMessage b;

    @b6l(c = "ru.rustore.sdk.pushclient.internal.analytics.events.pushmessage.PushReceiveAnalyticsEvent", f = "PushReceiveAnalyticsEvent.kt", l = {19}, m = "getParams")
    public static final class a extends ContinuationImpl {
        public b a;
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
            return b.this.getParams(this);
        }
    }

    public b(RemoteMessage remoteMessage) {
        super("vkcm_sdk_client_receive_push");
        this.b = remoteMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
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
        b bVar;
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
                    ru.rustore.sdk.pushclient.k.b bVar2 = (ru.rustore.sdk.pushclient.k.b) h.e.getValue();
                    aVar.a = this;
                    aVar.b = mapBuilder;
                    aVar.c = mapBuilder;
                    aVar.d = mapBuilder;
                    aVar.g = 1;
                    AppInfo appInfo = bVar2.j;
                    Object e = appInfo == null ? bVar2.e(aVar) : appInfo;
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = mapBuilder;
                    map2 = map;
                    map3 = map2;
                    obj = e;
                    bVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = aVar.d;
                    map2 = aVar.c;
                    map3 = aVar.b;
                    bVar = aVar.a;
                    kotlin.a.a(obj);
                }
                ExtensionsKt.setMasterPackageName(map, ((AppInfo) obj).getPackageName());
                ExtensionsKt.setClientPackageName(map2, ((PackagesRepository) h.i.getValue()).getPackageName());
                ExtensionsKt.setReceivedBy(map2, bVar.b.getReceivedBy());
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
        ExtensionsKt.setClientPackageName(map2, ((PackagesRepository) h.i.getValue()).getPackageName());
        ExtensionsKt.setReceivedBy(map2, bVar.b.getReceivedBy());
        return ((MapBuilder) map3).h();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PushReceiveAnalyticsEvent(message=" + this.b + ')';
    }
}
