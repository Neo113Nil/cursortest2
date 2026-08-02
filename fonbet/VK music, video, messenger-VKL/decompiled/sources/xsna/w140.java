package xsna;

import android.os.Bundle;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.EnvironmentType;
import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$MultiaccountFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeMultiaccountsItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.a;
import com.vk.superapp.multiaccount.api.analytics.VkAnalyticsUserType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.gl.tf.Tensorflow;
import xsna.usi0;

/* compiled from: MultiAccountAnalyticsImpl.kt */
/* loaded from: classes11.dex */
public final class w140 implements com.vk.superapp.multiaccount.api.a {
    public final j240 b;
    public final ExecutorService c;
    public final mui0 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new kb0(5));

    /* compiled from: MultiAccountAnalyticsImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnvironmentType.values().length];
            try {
                iArr[EnvironmentType.DEVELOPMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnvironmentType.TESTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnvironmentType.PRODUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w140(j240 j240Var, ExecutorService executorService, mui0 mui0Var) {
        this.b = j240Var;
        this.c = executorService;
        this.d = mui0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    @Override // com.vk.superapp.multiaccount.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(usi0.a aVar) {
        MultiAccountEntryPoint multiAccountEntryPoint;
        Bundle bundle;
        SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.MULTIACC_DROP_ACCOUNT;
        UserId b = aVar.c().b();
        List singletonList = Collections.singletonList(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.PROFILE_TYPE, "", "", c8u0.a(aVar.c().a()).i()));
        Long valueOf = b != null ? Long.valueOf(b.b) : null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(singletonList);
        s3q0 s3q0Var = s3q0.a;
        b.C1760b.a(null, eventType, valueOf, arrayList, RegistrationStatParamsFactory.b);
        try {
            q55 q55Var = q55.a;
            bundle = q55.c().a.K;
        } catch (Throwable unused) {
        }
        if (bundle != null) {
            multiAccountEntryPoint = sv1.m(bundle);
            SchemeStatSak$EventScreen schemeStatSak$EventScreen = !(multiAccountEntryPoint instanceof MultiAccountEntryPoint.Logout) ? SchemeStatSak$EventScreen.MULTI_ACC_SWITCHER : SchemeStatSak$EventScreen.NOWHERE;
            SchemeStatSak$TypeMultiaccountsItem.EventType eventType2 = SchemeStatSak$TypeMultiaccountsItem.EventType.DROP_ACCOUNT;
            UserId b2 = aVar.c().b();
            UserId userId = UserId.d;
            int size = yxi0.a(this.d.e()).size();
            ArrayList e = this.d.e();
            usi0.a.b bVar = !(aVar instanceof usi0.a.b) ? (usi0.a.b) aVar : null;
            c(new a.d(eventType2, schemeStatSak$EventScreen, b2, userId, size, e, true, null, bVar != null ? bVar.e() : null, 128));
        }
        multiAccountEntryPoint = null;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = !(multiAccountEntryPoint instanceof MultiAccountEntryPoint.Logout) ? SchemeStatSak$EventScreen.MULTI_ACC_SWITCHER : SchemeStatSak$EventScreen.NOWHERE;
        SchemeStatSak$TypeMultiaccountsItem.EventType eventType22 = SchemeStatSak$TypeMultiaccountsItem.EventType.DROP_ACCOUNT;
        UserId b22 = aVar.c().b();
        UserId userId2 = UserId.d;
        int size2 = yxi0.a(this.d.e()).size();
        ArrayList e2 = this.d.e();
        if (!(aVar instanceof usi0.a.b)) {
        }
        c(new a.d(eventType22, schemeStatSak$EventScreen2, b22, userId2, size2, e2, true, null, bVar != null ? bVar.e() : null, 128));
    }

    @Override // com.vk.superapp.multiaccount.api.a
    public final void b(usi0.a aVar, UserId userId) {
        SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.MULTI_ACC_ADD_ACCOUNT;
        UserId b = aVar.c().b();
        List singletonList = Collections.singletonList(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.PROFILE_TYPE, "", "", c8u0.a(aVar.c().a()).i()));
        Long valueOf = b != null ? Long.valueOf(b.b) : null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(singletonList);
        s3q0 s3q0Var = s3q0.a;
        b.C1760b.a(null, eventType, valueOf, arrayList, RegistrationStatParamsFactory.b);
        SchemeStatSak$TypeMultiaccountsItem.EventType eventType2 = SchemeStatSak$TypeMultiaccountsItem.EventType.ADD_ACCOUNT;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
        UserId b2 = aVar.c().b();
        UserId userId2 = userId == null ? UserId.d : userId;
        int size = yxi0.a(this.d.e()).size();
        ArrayList e = this.d.e();
        boolean z = this.d.e().size() > 1;
        usi0.a.b bVar = aVar instanceof usi0.a.b ? (usi0.a.b) aVar : null;
        c(new a.d(eventType2, schemeStatSak$EventScreen, b2, userId2, size, e, z, null, bVar != null ? bVar.e() : null, 128));
    }

    @Override // com.vk.superapp.multiaccount.api.a
    public final void c(a.InterfaceC1887a interfaceC1887a) {
        this.c.submit(new vv4(5, this, interfaceC1887a));
    }

    @Override // com.vk.superapp.multiaccount.api.a
    public final void clear() {
        this.c.submit(new vk9(this, 7));
    }

    @Override // com.vk.superapp.multiaccount.api.a
    public final com.vk.superapp.multiaccount.api.c d() {
        return this.b;
    }

    @Override // com.vk.superapp.multiaccount.api.a
    public final void e(a.f fVar) {
        SchemeStatSak$EventScreen d = fVar.d();
        SchemeStatSak$TypeRegistrationItem.EventType a2 = fVar.a();
        UserId e = fVar.e();
        Long valueOf = e != null ? Long.valueOf(e.b) : null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(fVar.c());
        s3q0 s3q0Var = s3q0.a;
        String b = fVar.b();
        if (b == null) {
            b = RegistrationStatParamsFactory.b;
        }
        b.C1760b.a(d, a2, valueOf, arrayList, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01ce, code lost:
    
        if ((r4 != null ? r4.d() : null) != null) goto L62;
     */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(a.d dVar) {
        JSONObject put;
        Object obj;
        Object obj2;
        fhq0 c;
        AccountProfileType a2;
        VkAnalyticsUserType a3;
        String i;
        fhq0 c2;
        AccountProfileType a4;
        VkAnalyticsUserType a5;
        String i2;
        String d;
        if (dVar.b().isEmpty()) {
            put = new JSONObject().put("multiacc_is_active", 0);
        } else {
            ArrayList a6 = yxi0.a(dVar.b());
            ArrayList arrayList = new ArrayList(c5g.u(a6, 10));
            Iterator it = a6.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((usi0.a) it.next()).c().b().b));
            }
            List<usi0.a> b = dVar.b();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : b) {
                if (obj3 instanceof usi0.a.b) {
                    arrayList2.add(obj3);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Long valueOf = Long.valueOf(((usi0.a.b) next).e().b);
                Object obj4 = linkedHashMap.get(valueOf);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap.put(valueOf, obj4);
                }
                ((List) obj4).add(next);
            }
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                long longValue = ((Number) it3.next()).longValue();
                jSONArray.put(longValue);
                JSONArray jSONArray3 = new JSONArray();
                List list = (List) linkedHashMap.get(Long.valueOf(longValue));
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        jSONArray3.put(((usi0.a.b) it4.next()).c().b().b);
                    }
                }
                jSONArray2.put(jSONArray3);
            }
            JSONArray jSONArray4 = new JSONArray();
            List<usi0.a> b2 = dVar.b();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj5 : b2) {
                AccountProfileType a7 = ((usi0.a) obj5).c().a();
                a7.getClass();
                if (a7 == AccountProfileType.EDU) {
                    arrayList3.add(obj5);
                }
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                jSONArray4.put(((usi0.a) it5.next()).c().b().b);
            }
            put = new JSONObject().put("current_accounts", jSONArray).put("current_related_accounts", jSONArray2).put("current_sferum_accounts", jSONArray4);
        }
        String jSONObject = put.toString();
        Iterator<T> it6 = dVar.b().iterator();
        while (true) {
            if (it6.hasNext()) {
                obj = it6.next();
                if (epx.f(((usi0.a) obj).c().b(), dVar.d())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        usi0.a aVar = (usi0.a) obj;
        ArrayList arrayList4 = new ArrayList();
        MultiAccountEntryPoint g = dVar.g();
        if (g != null && (d = g.d()) != null) {
            arrayList4.add(new SchemeStatSak$MultiaccountFieldItem(SchemeStatSak$MultiaccountFieldItem.Name.TO_SWITCHER_FROM, d));
        }
        if (!((List) this.e.getValue()).contains(dVar.f())) {
            MultiAccountEntryPoint g2 = dVar.g();
        }
        Iterator<T> it7 = dVar.b().iterator();
        while (true) {
            if (it7.hasNext()) {
                obj2 = it7.next();
                if (epx.f(((usi0.a) obj2).c().b(), dVar.i())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        usi0.a aVar2 = (usi0.a) obj2;
        arrayList4.addAll(rl3.I(new SchemeStatSak$MultiaccountFieldItem[]{(aVar2 == null || (c2 = aVar2.c()) == null || (a4 = c2.a()) == null || (a5 = c8u0.a(a4)) == null || (i2 = a5.i()) == null) ? null : new SchemeStatSak$MultiaccountFieldItem(SchemeStatSak$MultiaccountFieldItem.Name.FROM_PROFILE_TYPE, i2), (aVar == null || (c = aVar.c()) == null || (a2 = c.a()) == null || (a3 = c8u0.a(a2)) == null || (i = a3.i()) == null) ? null : new SchemeStatSak$MultiaccountFieldItem(SchemeStatSak$MultiaccountFieldItem.Name.TO_PROFILE_TYPE, i)}));
        SchemeStatSak$EventScreen e = dVar.e();
        j240 j240Var = this.b;
        String str = bbq.a(j240Var).a;
        long j = bbq.a(j240Var).b / 1000;
        SchemeStatSak$TypeMultiaccountsItem.EventType f = dVar.f();
        long j2 = dVar.d().b;
        long j3 = dVar.i().b;
        int c3 = dVar.c();
        UserId h = dVar.h();
        new f240(e, new SchemeStatSak$TypeMultiaccountsItem(str, j, f, j2, j3, c3, jSONObject, h != null ? Long.valueOf(h.b) : null, null, null, arrayList4, Tensorflow.FRAME_HEIGHT, null)).q();
    }
}
