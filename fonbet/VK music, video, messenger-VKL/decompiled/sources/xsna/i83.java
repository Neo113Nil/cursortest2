package xsna;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.appredirects.activity.BaseLinkRedirectActivity;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.resolver.AppRedirectResult;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;

/* compiled from: AppRedirectResolver.kt */
/* loaded from: classes15.dex */
public final class i83 {
    public static final LinkedHashMap a(Context context, Intent intent, long j) {
        App app2;
        e83 e83Var;
        long j2 = j * 1000000;
        long nanoTime = System.nanoTime();
        switch (k83.$EnumSwitchMapping$0[BuildInfo.a.ordinal()]) {
            case 1:
                app2 = App.VK_APP;
                break;
            case 2:
                app2 = App.VK_ME;
                break;
            case 3:
                app2 = App.VK_CALLS;
                break;
            case 4:
                app2 = App.VK_VIDEO;
                break;
            case 5:
                app2 = App.VK_TV;
                break;
            case 6:
                app2 = App.VK_DATING;
                break;
            case 7:
                app2 = App.VK_MUSIC;
                break;
            default:
                app2 = App.VK_APP;
                break;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(app2, new l83().b(context, intent, app2));
        App[] values = App.values();
        ArrayList arrayList = new ArrayList();
        for (App app3 : values) {
            if (app3 != app2) {
                arrayList.add(app3);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            App app4 = (App) it.next();
            asu0.a.getClass();
            arrayList2.add(new Pair(app4, asu0.n().submit(new h83(0, intent, context, app4))));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            App app5 = (App) pair.d();
            Future future = (Future) pair.g();
            long nanoTime2 = j2 - (System.nanoTime() - nanoTime);
            if (nanoTime2 < 0) {
                nanoTime2 = 0;
            }
            try {
                e83Var = (e83) future.get(nanoTime2, TimeUnit.NANOSECONDS);
            } catch (SecurityException unused) {
                L.l("AppRedirectResolver", "Security exception while querying " + app5.i());
                e83Var = new e83(false, false, false);
            } catch (TimeoutException unused2) {
                L.l("AppRedirectResolver", "Timed out waiting for " + app5.i());
                e83Var = new e83(false, false, false);
            }
            linkedHashMap.put(app5, e83Var);
        }
        return linkedHashMap;
    }

    public static final App b(LinkedHashMap linkedHashMap) {
        App app2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((e83) entry.getValue()).c) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((App) ((Map.Entry) it.next()).getKey());
        }
        if (!arrayList.isEmpty()) {
            return (App) j5g.Y(arrayList);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((e83) entry2.getValue()).b) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap3.size());
        Iterator it2 = linkedHashMap3.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add((App) ((Map.Entry) it2.next()).getKey());
        }
        if (!arrayList2.isEmpty()) {
            return (App) j5g.Y(arrayList2);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            if (((App) entry3.getKey()) == App.VK_APP) {
                linkedHashMap4.put(entry3.getKey(), entry3.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap4.size());
        Iterator it3 = linkedHashMap4.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList3.add((e83) ((Map.Entry) it3.next()).getValue());
        }
        if (((e83) j5g.Y(arrayList3)).a) {
            return App.VK_APP;
        }
        switch (k83.$EnumSwitchMapping$0[BuildInfo.a.ordinal()]) {
            case 1:
                app2 = App.VK_APP;
                break;
            case 2:
                app2 = App.VK_ME;
                break;
            case 3:
                app2 = App.VK_CALLS;
                break;
            case 4:
                app2 = App.VK_VIDEO;
                break;
            case 5:
                app2 = App.VK_TV;
                break;
            case 6:
                app2 = App.VK_DATING;
                break;
            case 7:
                app2 = App.VK_MUSIC;
                break;
            default:
                app2 = App.VK_APP;
                break;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
            if (((App) entry4.getKey()) == app2) {
                linkedHashMap5.put(entry4.getKey(), entry4.getValue());
            }
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap5.size());
        Iterator it4 = linkedHashMap5.entrySet().iterator();
        while (it4.hasNext()) {
            arrayList4.add((e83) ((Map.Entry) it4.next()).getValue());
        }
        if (((e83) j5g.Y(arrayList4)).a) {
            return app2;
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry entry5 : linkedHashMap.entrySet()) {
            if (((e83) entry5.getValue()).a) {
                linkedHashMap6.put(entry5.getKey(), entry5.getValue());
            }
        }
        ArrayList arrayList5 = new ArrayList(linkedHashMap6.size());
        Iterator it5 = linkedHashMap6.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList5.add((App) ((Map.Entry) it5.next()).getKey());
        }
        App app3 = (App) j5g.a0(arrayList5);
        if (app3 != null) {
            return app3;
        }
        return null;
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.l2 c(final Intent intent, final BaseLinkRedirectActivity baseLinkRedirectActivity) {
        return new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.g83
            @Override // java.util.concurrent.Callable
            public final Object call() {
                App app2;
                App app3;
                App app4;
                Intent intent2 = intent;
                boolean hasExtra = intent2.hasExtra("com.vk.EXTRA_REDIRECTED");
                BaseLinkRedirectActivity baseLinkRedirectActivity2 = baseLinkRedirectActivity;
                if (hasExtra) {
                    return epx.f(intent2.getStringExtra("com.vk.EXTRA_REDIRECT_SOURCE_PACKAGE"), baseLinkRedirectActivity2.getApplicationContext().getPackageName()) ? AppRedirectResult.REDIRECTED : AppRedirectResult.PROCEED;
                }
                if (intent2.hasExtra("player_widget")) {
                    return AppRedirectResult.PROCEED;
                }
                App b = i83.b(i83.a(baseLinkRedirectActivity2, intent2, 5000L));
                if (b == null) {
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a aVar = new Event.a();
                    aVar.g("AppRedirectResolver");
                    aVar.c("AppRedirectResult", "BROWSER");
                    switch (k83.$EnumSwitchMapping$0[BuildInfo.a.ordinal()]) {
                        case 1:
                            app4 = App.VK_APP;
                            break;
                        case 2:
                            app4 = App.VK_ME;
                            break;
                        case 3:
                            app4 = App.VK_CALLS;
                            break;
                        case 4:
                            app4 = App.VK_VIDEO;
                            break;
                        case 5:
                            app4 = App.VK_TV;
                            break;
                        case 6:
                            app4 = App.VK_DATING;
                            break;
                        case 7:
                            app4 = App.VK_MUSIC;
                            break;
                        default:
                            app4 = App.VK_APP;
                            break;
                    }
                    aVar.c("APP", app4.name());
                    aVar.c("URL", String.valueOf(intent2.getData()));
                    bVar.k(aVar.e());
                    return AppRedirectResult.BROWSER;
                }
                BuildInfo.Client client = BuildInfo.a;
                int[] iArr = k83.$EnumSwitchMapping$0;
                switch (iArr[client.ordinal()]) {
                    case 1:
                        app2 = App.VK_APP;
                        break;
                    case 2:
                        app2 = App.VK_ME;
                        break;
                    case 3:
                        app2 = App.VK_CALLS;
                        break;
                    case 4:
                        app2 = App.VK_VIDEO;
                        break;
                    case 5:
                        app2 = App.VK_TV;
                        break;
                    case 6:
                        app2 = App.VK_DATING;
                        break;
                    case 7:
                        app2 = App.VK_MUSIC;
                        break;
                    default:
                        app2 = App.VK_APP;
                        break;
                }
                if (b == app2) {
                    L.p("AppRedirectResolver", "Proceed");
                    return AppRedirectResult.PROCEED;
                }
                L.p("AppRedirectResolver", "Redirect to " + b.name());
                com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                el3 el3Var2 = Event.b;
                Event.a aVar2 = new Event.a();
                aVar2.g("AppRedirectResolver");
                aVar2.c("AppRedirectResult", "REDIRECTED");
                switch (iArr[BuildInfo.a.ordinal()]) {
                    case 1:
                        app3 = App.VK_APP;
                        break;
                    case 2:
                        app3 = App.VK_ME;
                        break;
                    case 3:
                        app3 = App.VK_CALLS;
                        break;
                    case 4:
                        app3 = App.VK_VIDEO;
                        break;
                    case 5:
                        app3 = App.VK_TV;
                        break;
                    case 6:
                        app3 = App.VK_DATING;
                        break;
                    case 7:
                        app3 = App.VK_MUSIC;
                        break;
                    default:
                        app3 = App.VK_APP;
                        break;
                }
                aVar2.c("APP", app3.name());
                aVar2.c("TO", b.name());
                aVar2.c("URL", String.valueOf(intent2.getData()));
                bVar2.k(aVar2.e());
                Intent intent3 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent3.setComponent(b.j());
                intent3.setData(intent2.getData());
                intent3.putExtra("com.vk.EXTRA_REDIRECTED", true);
                intent3.putExtra("com.vk.EXTRA_REDIRECT_SOURCE_PACKAGE", baseLinkRedirectActivity2.getApplicationContext().getPackageName());
                intent3.setFlags(268435456);
                baseLinkRedirectActivity2.startActivity(intent3);
                return AppRedirectResult.REDIRECTED;
            }
        }).r0(asu0.a.c());
    }
}
