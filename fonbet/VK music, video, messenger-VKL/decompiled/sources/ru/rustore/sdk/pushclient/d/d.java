package ru.rustore.sdk.pushclient.d;

import com.vk.push.common.AppInfo;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.m.h;
import xsna.aaz0;
import xsna.b6l;
import xsna.c5g;
import xsna.s101;
import xsna.spj;

/* loaded from: classes9.dex */
public final class d extends BaseAnalyticsEvent {
    public final String b;
    public final List<RemoteMessage> c;

    @b6l(c = "ru.rustore.sdk.pushclient.internal.analytics.events.pushmessage.PushSkipAnalyticsEvent", f = "PushSkipAnalyticsEvent.kt", l = {21}, m = "getParams")
    public static final class a extends ContinuationImpl {
        public Map a;
        public Map b;
        public Map c;
        public /* synthetic */ Object d;
        public int f;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return d.this.getParams(this);
        }
    }

    public d(String str, List list) {
        super("vkcm_sdk_client_skip_push");
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
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
        aaz0 aaz0Var;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
                Object obj = aVar.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    MapBuilder mapBuilder = new MapBuilder();
                    ExtensionsKt.setPushToken(mapBuilder, this.b);
                    String str = this.b;
                    List<RemoteMessage> list = this.c;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RemoteMessage) it.next()).getMessageId());
                    }
                    ExtensionsKt.setPushIds(mapBuilder, str, arrayList);
                    mapBuilder.put("reason", "token_diff");
                    ru.rustore.sdk.pushclient.k.b bVar = (ru.rustore.sdk.pushclient.k.b) h.e.getValue();
                    aVar.a = mapBuilder;
                    aVar.b = mapBuilder;
                    aVar.c = mapBuilder;
                    aVar.f = 1;
                    AppInfo appInfo = bVar.j;
                    Object e = appInfo == null ? bVar.e(aVar) : appInfo;
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = mapBuilder;
                    map2 = map;
                    obj = e;
                    map3 = map2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = aVar.c;
                    map2 = aVar.b;
                    map3 = aVar.a;
                    kotlin.a.a(obj);
                }
                ExtensionsKt.setMasterPackageName(map, ((AppInfo) obj).getPackageName());
                aaz0Var = s101.f;
                if (aaz0Var != null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                ExtensionsKt.setClientPackageName(map2, aaz0Var.a.getApplicationContext().getPackageName());
                return ((MapBuilder) map3).h();
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.f;
        if (i != 0) {
        }
        ExtensionsKt.setMasterPackageName(map, ((AppInfo) obj2).getPackageName());
        aaz0Var = s101.f;
        if (aaz0Var != null) {
        }
    }
}
