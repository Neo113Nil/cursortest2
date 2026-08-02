package xsna;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j6j implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j6j(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object failure;
        Object failure2;
        Object obj2;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                k6j k6jVar = (k6j) obj3;
                Iterator it = ((List) obj4).iterator();
                while (it.hasNext()) {
                    ((f6j) it.next()).a(k6jVar.e);
                }
                break;
            default:
                SessionManagementComponent sessionManagementComponent = (SessionManagementComponent) obj4;
                axw axwVar = (axw) obj3;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                mui0 J2 = sessionManagementComponent.J2();
                sxi0 B2 = sessionManagementComponent.B2();
                mp c = ((AccountManagerComponent) axwVar.c().a(fpf0.a(AccountManagerComponent.class))).c();
                r55 r55Var = r55.a;
                k2q d = r55.d();
                mxi0 ie = ((StatInteractorComponent) axwVar.c().a(fpf0.a(StatInteractorComponent.class))).ie();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                UserId userId = UserId.d;
                Iterator it2 = J2.e().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (epx.f(((usi0.a) obj).c().b(), userId)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                usi0.a aVar = (usi0.a) obj;
                if (aVar != null) {
                    B2.h(aVar);
                }
                ArrayList e = J2.e();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : e) {
                    if (hashSet.add(((usi0.a) obj5).c().b())) {
                        arrayList.add(obj5);
                    }
                }
                if (arrayList.size() != J2.e().size()) {
                    for (Map.Entry entry : pou.a(new com.vk.ecomm.catalog.impl.geo.a(J2.e())).entrySet()) {
                        UserId userId2 = (UserId) entry.getKey();
                        int intValue = ((Number) entry.getValue()).intValue();
                        if (intValue > 1) {
                            Iterator it3 = J2.e().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj2 = it3.next();
                                    if (epx.f(((usi0.a) obj2).c().b(), userId2)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            usi0.a aVar2 = (usi0.a) obj2;
                            if (aVar2 != null) {
                                B2.h(aVar2);
                            }
                            concurrentHashMap.putIfAbsent(b4q.b(userId2, "several_"), String.valueOf(intValue));
                        }
                    }
                }
                try {
                    boolean removeAccountExplicitly = AccountManager.get(context).removeAccountExplicitly(new Account(String.valueOf(userId.b), context.getString(R.string.vk_account_manager_id)));
                    if (removeAccountExplicitly) {
                        concurrentHashMap.putIfAbsent("am_found", "true");
                    }
                    failure = Boolean.valueOf(removeAccountExplicitly);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    ie.b("InvalidAccountsCleaner_am_error", on00.f(new Pair("stacktrace", mnh0.A(a))));
                }
                try {
                    String a2 = ((l2q) d).a(userId);
                    if (drm0.N(a2)) {
                        a2 = null;
                    }
                    if (a2 != null) {
                    }
                    ((l2q) d).i(userId);
                    failure2 = s3q0.a;
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                Throwable a3 = Result.a(failure2);
                if (a3 != null) {
                    ie.b("InvalidAccountsCleaner_et_error", on00.f(new Pair("stacktrace", mnh0.A(a3))));
                }
                int size = J2.e().size();
                r55 r55Var2 = r55.a;
                int i2 = r55.f().b.b;
                if (size > i2) {
                    concurrentHashMap.putIfAbsent("exceed_sessions_found", String.valueOf(size));
                    try {
                        for (usi0.a aVar3 : j5g.I0(size - i2, J2.e())) {
                            B2.h(aVar3);
                            c.c(aVar3.c().b());
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused) {
                    }
                }
                ArrayList c2 = an00.c(J2.e());
                vx2.a.getClass();
                vx2.b().j(c2);
                if (!concurrentHashMap.isEmpty()) {
                    ie.b("InvalidAccountsCleaner", pn00.t(concurrentHashMap));
                }
                break;
        }
    }
}
