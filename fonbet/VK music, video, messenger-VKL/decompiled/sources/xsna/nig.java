package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vk.bridges.CompanionApp;
import com.vk.companion.core.CompanionAppImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.hfr;
import xsna.k6i;
import xsna.r6i;

/* compiled from: CommonCompanionAppBridge.kt */
/* loaded from: classes.dex */
public final class nig implements i6i {
    public final scy<i6i, CompanionApp> a;
    public final LinkedHashMap b;
    public final CompanionApp c;
    public final CompanionApp d;
    public final CompanionApp e;
    public final CompanionApp f;
    public final CompanionApp g;
    public final CompanionApp h;
    public final CompanionApp i;
    public final CompanionApp j;
    public final o6i k;

    /* JADX WARN: Multi-variable type inference failed */
    public nig(Context context, scy<i6i, ? extends CompanionApp> scyVar) {
        this.a = scyVar;
        List l = e43.l(new CompanionAppImpl("com.vkontakte.android"), new CompanionAppImpl("com.vk.im"), new CompanionAppImpl("com.vk.calls"), new CompanionAppImpl("com.vk.clips"), new CompanionAppImpl("com.vk.vkvideo"), new CompanionAppImpl("com.uma.musicvk"), new CompanionAppImpl("com.vk.love"), new CompanionAppImpl("ru.ok.dating"));
        int e = on00.e(c5g.u(l, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : l) {
            linkedHashMap.put(((CompanionApp) obj).getPackageName(), obj);
        }
        this.b = linkedHashMap;
        this.c = (CompanionApp) pn00.h("com.vkontakte.android", linkedHashMap);
        this.d = (CompanionApp) pn00.h("com.vk.im", linkedHashMap);
        this.e = (CompanionApp) pn00.h("com.vk.calls", linkedHashMap);
        this.f = (CompanionApp) pn00.h("com.vk.clips", linkedHashMap);
        this.g = (CompanionApp) pn00.h("com.vk.vkvideo", linkedHashMap);
        this.h = (CompanionApp) pn00.h("com.uma.musicvk", linkedHashMap);
        this.i = (CompanionApp) pn00.h("com.vk.love", linkedHashMap);
        this.j = (CompanionApp) pn00.h("ru.ok.dating", linkedHashMap);
        Context applicationContext = context.getApplicationContext();
        CompanionApp e2 = e();
        Collection values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : values) {
            if (!((CompanionAppImpl) obj2).a.equals(e().getPackageName())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CompanionApp) it.next()).getPackageName());
        }
        this.k = new o6i(applicationContext, arrayList2, e2);
        q12 q12Var = new q12(this, 3);
        String str = k6i.a;
        final r6i r6iVar = new r6i(q12Var);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.vk.companion.core.CompanionAppHelper$createReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                String action;
                Map map;
                if (intent == null || (action = intent.getAction()) == null) {
                    return;
                }
                CompanionApp.State.Companion.getClass();
                map = CompanionApp.State.byAction;
                CompanionApp.State state = (CompanionApp.State) map.get(action);
                if (state == null || state == CompanionApp.State.UNDEFINED) {
                    state = null;
                }
                if (state != null) {
                    String str2 = k6i.a;
                    String stringExtra = intent.getStringExtra("com.vk.im.SENDER_PACKAGE");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    r6i.this.invoke(state, stringExtra);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        for (CompanionApp.State state : CompanionApp.State.values()) {
            intentFilter.addAction(state.i());
        }
        anj.d(context, broadcastReceiver, intentFilter, null, 4);
    }

    @Override // xsna.i6i
    public final o6i G() {
        return this.k;
    }

    @Override // xsna.i6i
    public final CompanionApp V() {
        return this.h;
    }

    @Override // xsna.i6i
    public final CompanionApp a() {
        return this.e;
    }

    @Override // xsna.i6i
    public final CompanionApp b() {
        return this.f;
    }

    @Override // xsna.i6i
    public final void c() {
        hfr.a aVar = new hfr.a(rli0.j(new i5g(this.b.values()), new n58(this, 1)));
        while (aVar.hasNext()) {
            ((CompanionApp) aVar.next()).d();
        }
    }

    @Override // xsna.i6i
    public final CompanionApp d() {
        return this.j;
    }

    @Override // xsna.i6i
    public final CompanionApp e() {
        return this.a.get(this);
    }

    @Override // xsna.i6i
    public final Map<String, CompanionAppImpl> f() {
        return this.b;
    }

    @Override // xsna.i6i
    public final CompanionApp g() {
        return this.d;
    }

    @Override // xsna.i6i
    public final CompanionApp h() {
        return this.i;
    }

    @Override // xsna.i6i
    public final CompanionApp i() {
        return this.c;
    }

    @Override // xsna.i6i
    public final CompanionApp k() {
        return this.g;
    }
}
