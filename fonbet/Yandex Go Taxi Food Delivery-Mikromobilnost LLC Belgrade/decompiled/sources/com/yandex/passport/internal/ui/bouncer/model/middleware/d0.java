package com.yandex.passport.internal.ui.bouncer.model.middleware;

import android.text.TextUtils;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.bitflag.EnumFlagHolder;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.r2;
import com.yandex.passport.internal.ui.bouncer.model.s2;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d0 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.usecase.ui.c0 a;
    public final com.yandex.passport.internal.usecase.ui.z b;
    public final com.yandex.passport.internal.badges.c c;
    public final com.yandex.passport.internal.badges.f d;
    public final com.yandex.passport.internal.usecase.o0 e;
    public final com.yandex.passport.internal.flags.j f;

    public d0(com.yandex.passport.internal.usecase.ui.c0 c0Var, com.yandex.passport.internal.usecase.ui.z zVar, com.yandex.passport.internal.badges.c cVar, com.yandex.passport.internal.badges.f fVar, com.yandex.passport.internal.usecase.o0 o0Var, com.yandex.passport.internal.flags.j jVar) {
        this.a = c0Var;
        this.b = zVar;
        this.c = cVar;
        this.d = fVar;
        this.e = o0Var;
        this.f = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x027e, code lost:
    
        if (r1 == r3) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x034f A[LOOP:0: B:15:0x0349->B:17:0x034f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f2  */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x027e -> B:33:0x0282). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x029e -> B:36:0x0295). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d0 d0Var, com.yandex.passport.internal.ui.bouncer.model.r rVar, ContinuationImpl continuationImpl) {
        LoadAccountsMiddleware$loadLoginParameters$1 loadAccountsMiddleware$loadLoginParameters$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        EnumFlagHolder enumFlagHolder;
        LoginProperties loginProperties;
        Filter filter;
        com.yandex.passport.internal.usecase.ui.a0 a0Var;
        Object a;
        d0 d0Var2;
        ModernAccount modernAccount;
        ArrayList arrayList;
        Map linkedHashMap;
        Iterator it;
        ModernAccount modernAccount2;
        LoadAccountsMiddleware$loadLoginParameters$1 loadAccountsMiddleware$loadLoginParameters$12;
        d0 d0Var3;
        List list;
        LoginProperties loginProperties2;
        com.yandex.passport.internal.usecase.ui.a0 a0Var2;
        ModernAccount modernAccount3;
        List list2;
        ArrayList arrayList2;
        d0 d0Var4;
        LoginProperties loginProperties3;
        Iterator it2;
        ModernAccount modernAccount4;
        ArrayList arrayList3;
        Map map;
        ModernAccount modernAccount5;
        LoginProperties loginProperties4;
        ArrayList arrayList4;
        Map map2;
        LoginProperties loginProperties5;
        ModernAccount modernAccount6;
        PassportUidImpl uid;
        AccountRow a2;
        String str;
        d0 d0Var5 = d0Var;
        d0Var5.getClass();
        if (continuationImpl instanceof LoadAccountsMiddleware$loadLoginParameters$1) {
            loadAccountsMiddleware$loadLoginParameters$1 = (LoadAccountsMiddleware$loadLoginParameters$1) continuationImpl;
            int i2 = loadAccountsMiddleware$loadLoginParameters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loadAccountsMiddleware$loadLoginParameters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loadAccountsMiddleware$loadLoginParameters$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loadAccountsMiddleware$loadLoginParameters$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LoginProperties loginProperties6 = rVar.a;
                    Filter filter2 = loginProperties6.getFilter();
                    boolean isSocialAuthorizationEnabled = loginProperties6.getVisualProperties().isSocialAuthorizationEnabled();
                    Filter.a aVar = new Filter.a();
                    aVar.d(filter2);
                    PassportAccountType passportAccountType = PassportAccountType.PHONISH;
                    PassportAccountType[] values = PassportAccountType.values();
                    ArrayList arrayList5 = new ArrayList();
                    int length = values.length;
                    int i3 = 0;
                    while (true) {
                        enumFlagHolder = aVar.x;
                        if (i3 >= length) {
                            break;
                        }
                        PassportAccountType passportAccountType2 = values[i3];
                        if (enumFlagHolder.getWrapped().m245getOMiyNp0(passportAccountType2.getValue())) {
                            arrayList5.add(passportAccountType2);
                        }
                        i3++;
                    }
                    EnumSet noneOf = EnumSet.noneOf(PassportAccountType.class);
                    noneOf.addAll(arrayList5);
                    if (noneOf.size() != 1 || kotlin.collections.a.O(noneOf) != passportAccountType) {
                        enumFlagHolder.set(PassportAccountType.SOCIAL, isSocialAuthorizationEnabled);
                        aVar.c(PassportAccountType.LITE);
                    }
                    Filter a3 = aVar.a();
                    com.yandex.passport.internal.usecase.ui.c0 c0Var = d0Var5.a;
                    com.yandex.passport.internal.usecase.ui.b0 b0Var = new com.yandex.passport.internal.usecase.ui.b0(a3);
                    loadAccountsMiddleware$loadLoginParameters$1.L$0 = d0Var5;
                    loadAccountsMiddleware$loadLoginParameters$1.L$1 = loginProperties6;
                    loadAccountsMiddleware$loadLoginParameters$1.L$2 = a3;
                    loadAccountsMiddleware$loadLoginParameters$1.label = 1;
                    Object a4 = c0Var.a(b0Var, loadAccountsMiddleware$loadLoginParameters$1);
                    if (a4 != coroutineSingletons) {
                        loginProperties = loginProperties6;
                        obj = a4;
                        filter = a3;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    Filter filter3 = (Filter) loadAccountsMiddleware$loadLoginParameters$1.L$2;
                    LoginProperties loginProperties7 = (LoginProperties) loadAccountsMiddleware$loadLoginParameters$1.L$1;
                    d0 d0Var6 = (d0) loadAccountsMiddleware$loadLoginParameters$1.L$0;
                    kotlin.b.b(obj);
                    filter = filter3;
                    d0Var5 = d0Var6;
                    loginProperties = loginProperties7;
                } else {
                    if (i == 2) {
                        modernAccount = (ModernAccount) loadAccountsMiddleware$loadLoginParameters$1.L$4;
                        a0Var = (com.yandex.passport.internal.usecase.ui.a0) loadAccountsMiddleware$loadLoginParameters$1.L$3;
                        filter = (Filter) loadAccountsMiddleware$loadLoginParameters$1.L$2;
                        loginProperties = (LoginProperties) loadAccountsMiddleware$loadLoginParameters$1.L$1;
                        d0Var2 = (d0) loadAccountsMiddleware$loadLoginParameters$1.L$0;
                        kotlin.b.b(obj);
                        arrayList = new ArrayList();
                        linkedHashMap = new LinkedHashMap();
                        it = a0Var.b.a.iterator();
                        d0 d0Var7 = d0Var2;
                        modernAccount2 = modernAccount;
                        loadAccountsMiddleware$loadLoginParameters$12 = loadAccountsMiddleware$loadLoginParameters$1;
                        d0Var3 = d0Var7;
                        LoginProperties loginProperties8 = loginProperties;
                        list = (List) obj;
                        loginProperties2 = loginProperties8;
                        if (!it.hasNext()) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            modernAccount6 = (ModernAccount) loadAccountsMiddleware$loadLoginParameters$1.L$6;
                            map2 = (Map) loadAccountsMiddleware$loadLoginParameters$1.L$5;
                            ?? r4 = (List) loadAccountsMiddleware$loadLoginParameters$1.L$4;
                            list = (List) loadAccountsMiddleware$loadLoginParameters$1.L$3;
                            modernAccount2 = (ModernAccount) loadAccountsMiddleware$loadLoginParameters$1.L$2;
                            loginProperties5 = (LoginProperties) loadAccountsMiddleware$loadLoginParameters$1.L$1;
                            d0Var3 = (d0) loadAccountsMiddleware$loadLoginParameters$1.L$0;
                            kotlin.b.b(obj);
                            arrayList4 = r4;
                            for (com.yandex.passport.internal.entities.k kVar : (Iterable) obj) {
                                Uid uid2 = kVar.a;
                                Set set = kVar.h;
                                arrayList4.add(new s2(uid2, kVar.b, kVar.d, kVar.e, kVar.f, kVar.g, kVar.c, set.contains("has_plus"), com.yandex.passport.internal.a0.u(list, set)));
                                modernAccount6 = modernAccount6;
                            }
                            modernAccount5 = modernAccount6;
                            map = map2;
                            arrayList3 = arrayList4;
                            loginProperties4 = loginProperties5;
                            ModernAccount modernAccount7 = modernAccount2;
                            d0Var3.getClass();
                            return new com.yandex.passport.internal.ui.bouncer.model.g1(loginProperties4, arrayList3, map, modernAccount7, modernAccount5, (loginProperties4.getSelectedUid() == null && modernAccount7 != null) || !TextUtils.isEmpty(loginProperties4.getLoginHint()));
                        }
                        modernAccount4 = (ModernAccount) loadAccountsMiddleware$loadLoginParameters$1.L$9;
                        it2 = (Iterator) loadAccountsMiddleware$loadLoginParameters$1.L$8;
                        linkedHashMap = (Map) loadAccountsMiddleware$loadLoginParameters$1.L$7;
                        ?? r12 = (List) loadAccountsMiddleware$loadLoginParameters$1.L$6;
                        list2 = (List) loadAccountsMiddleware$loadLoginParameters$1.L$5;
                        modernAccount3 = (ModernAccount) loadAccountsMiddleware$loadLoginParameters$1.L$4;
                        a0Var2 = (com.yandex.passport.internal.usecase.ui.a0) loadAccountsMiddleware$loadLoginParameters$1.L$3;
                        filter = (Filter) loadAccountsMiddleware$loadLoginParameters$1.L$2;
                        loginProperties3 = (LoginProperties) loadAccountsMiddleware$loadLoginParameters$1.L$1;
                        d0Var4 = (d0) loadAccountsMiddleware$loadLoginParameters$1.L$0;
                        kotlin.b.b(obj);
                        ArrayList arrayList6 = r12;
                        Object value = ((Result) obj).getValue();
                        ArrayList arrayList7 = arrayList6;
                        if (!(value instanceof Result.Failure)) {
                            linkedHashMap.put(modernAccount4.getAccountName(), (List) value);
                            arrayList7 = arrayList6;
                        }
                        loadAccountsMiddleware$loadLoginParameters$12 = loadAccountsMiddleware$loadLoginParameters$1;
                        loginProperties2 = loginProperties3;
                        d0Var3 = d0Var4;
                        arrayList = arrayList7;
                        list = list2;
                        modernAccount2 = modernAccount3;
                        it = it2;
                        a0Var = a0Var2;
                        if (!it.hasNext()) {
                            ModernAccount modernAccount8 = (ModernAccount) it.next();
                            com.yandex.passport.internal.b bVar = a0Var.a;
                            loadAccountsMiddleware$loadLoginParameters$12.L$0 = d0Var3;
                            loadAccountsMiddleware$loadLoginParameters$12.L$1 = loginProperties2;
                            loadAccountsMiddleware$loadLoginParameters$12.L$2 = filter;
                            loadAccountsMiddleware$loadLoginParameters$12.L$3 = a0Var;
                            loadAccountsMiddleware$loadLoginParameters$12.L$4 = modernAccount2;
                            loadAccountsMiddleware$loadLoginParameters$12.L$5 = list;
                            loadAccountsMiddleware$loadLoginParameters$12.L$6 = arrayList;
                            loadAccountsMiddleware$loadLoginParameters$12.L$7 = linkedHashMap;
                            loadAccountsMiddleware$loadLoginParameters$12.L$8 = it;
                            loadAccountsMiddleware$loadLoginParameters$12.L$9 = modernAccount8;
                            loadAccountsMiddleware$loadLoginParameters$12.label = 3;
                            d0Var3.getClass();
                            Object a5 = (list.isEmpty() || (a2 = bVar.a(modernAccount8.getAccount())) == null || (str = a2.userInfoBody) == null) ? EmptyList.a : d0Var3.d.a(new com.yandex.passport.internal.badges.e(str, list), loadAccountsMiddleware$loadLoginParameters$12);
                            if (a5 != coroutineSingletons) {
                                a0Var2 = a0Var;
                                modernAccount3 = modernAccount2;
                                it2 = it;
                                d0Var4 = d0Var3;
                                arrayList2 = arrayList;
                                loadAccountsMiddleware$loadLoginParameters$1 = loadAccountsMiddleware$loadLoginParameters$12;
                                modernAccount4 = modernAccount8;
                                list2 = list;
                                loginProperties3 = loginProperties2;
                                obj = a5;
                                arrayList2.add(new r2(modernAccount4, (List) obj));
                                if (modernAccount4.isChild()) {
                                    com.yandex.passport.internal.usecase.ui.z zVar = d0Var4.b;
                                    com.yandex.passport.internal.usecase.ui.y yVar = new com.yandex.passport.internal.usecase.ui.y(modernAccount4.getAccountName(), modernAccount4.getUid().getEnvironment(), filter);
                                    loadAccountsMiddleware$loadLoginParameters$1.L$0 = d0Var4;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$1 = loginProperties3;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$2 = filter;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$3 = a0Var2;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$4 = modernAccount3;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$5 = list2;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$6 = arrayList2;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$7 = linkedHashMap;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$8 = it2;
                                    loadAccountsMiddleware$loadLoginParameters$1.L$9 = modernAccount4;
                                    loadAccountsMiddleware$loadLoginParameters$1.label = 4;
                                    obj = zVar.a(yVar, loadAccountsMiddleware$loadLoginParameters$1);
                                    arrayList6 = arrayList2;
                                } else {
                                    arrayList7 = arrayList2;
                                    loadAccountsMiddleware$loadLoginParameters$12 = loadAccountsMiddleware$loadLoginParameters$1;
                                    loginProperties2 = loginProperties3;
                                    d0Var3 = d0Var4;
                                    arrayList = arrayList7;
                                    list = list2;
                                    modernAccount2 = modernAccount3;
                                    it = it2;
                                    a0Var = a0Var2;
                                    if (!it.hasNext()) {
                                        BindPhoneProperties bindPhoneProperties = loginProperties2.getBindPhoneProperties();
                                        ModernAccount e = (bindPhoneProperties == null || (uid = bindPhoneProperties.getUid()) == null) ? null : a0Var.a.e(com.yandex.passport.internal.util.p.B(uid));
                                        if (!((Boolean) d0Var3.f.b(com.yandex.passport.internal.flags.q.r0)).booleanValue()) {
                                            arrayList3 = arrayList;
                                            map = linkedHashMap;
                                            modernAccount5 = e;
                                            loginProperties4 = loginProperties2;
                                            ModernAccount modernAccount72 = modernAccount2;
                                            d0Var3.getClass();
                                            return new com.yandex.passport.internal.ui.bouncer.model.g1(loginProperties4, arrayList3, map, modernAccount72, modernAccount5, (loginProperties4.getSelectedUid() == null && modernAccount72 != null) || !TextUtils.isEmpty(loginProperties4.getLoginHint()));
                                        }
                                        com.yandex.passport.internal.usecase.o0 o0Var = d0Var3.e;
                                        com.yandex.passport.internal.account.d dVar = a0Var.b;
                                        ArrayList arrayList8 = new ArrayList();
                                        Iterator it3 = dVar.a.iterator();
                                        while (it3.hasNext()) {
                                            Uid masterUid = ((ModernAccount) it3.next()).getMasterUid();
                                            if (masterUid != null) {
                                                arrayList8.add(masterUid);
                                            }
                                        }
                                        com.yandex.passport.internal.account.d dVar2 = a0Var.b;
                                        ArrayList arrayList9 = new ArrayList(tcc.n(dVar2, 10));
                                        Iterator it4 = dVar2.a.iterator();
                                        while (it4.hasNext()) {
                                            arrayList9.add(((ModernAccount) it4.next()).getUid());
                                        }
                                        androidx.core.app.d1 d1Var = new androidx.core.app.d1(filter, arrayList8, arrayList9, a0Var.a);
                                        loadAccountsMiddleware$loadLoginParameters$12.L$0 = d0Var3;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$1 = loginProperties2;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$2 = modernAccount2;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$3 = list;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$4 = arrayList;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$5 = linkedHashMap;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$6 = e;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$7 = null;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$8 = null;
                                        loadAccountsMiddleware$loadLoginParameters$12.L$9 = null;
                                        loadAccountsMiddleware$loadLoginParameters$12.label = 5;
                                        ArrayList a6 = o0Var.a(d1Var);
                                        if (a6 != coroutineSingletons) {
                                            arrayList4 = arrayList;
                                            map2 = linkedHashMap;
                                            loginProperties5 = loginProperties2;
                                            obj = a6;
                                            modernAccount6 = e;
                                            while (r1.hasNext()) {
                                            }
                                            modernAccount5 = modernAccount6;
                                            map = map2;
                                            arrayList3 = arrayList4;
                                            loginProperties4 = loginProperties5;
                                            ModernAccount modernAccount722 = modernAccount2;
                                            d0Var3.getClass();
                                            return new com.yandex.passport.internal.ui.bouncer.model.g1(loginProperties4, arrayList3, map, modernAccount722, modernAccount5, (loginProperties4.getSelectedUid() == null && modernAccount722 != null) || !TextUtils.isEmpty(loginProperties4.getLoginHint()));
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    modernAccount4 = (ModernAccount) loadAccountsMiddleware$loadLoginParameters$1.L$9;
                    it2 = (Iterator) loadAccountsMiddleware$loadLoginParameters$1.L$8;
                    Map map3 = (Map) loadAccountsMiddleware$loadLoginParameters$1.L$7;
                    ?? r6 = (List) loadAccountsMiddleware$loadLoginParameters$1.L$6;
                    List list3 = (List) loadAccountsMiddleware$loadLoginParameters$1.L$5;
                    ModernAccount modernAccount9 = (ModernAccount) loadAccountsMiddleware$loadLoginParameters$1.L$4;
                    com.yandex.passport.internal.usecase.ui.a0 a0Var3 = (com.yandex.passport.internal.usecase.ui.a0) loadAccountsMiddleware$loadLoginParameters$1.L$3;
                    Filter filter4 = (Filter) loadAccountsMiddleware$loadLoginParameters$1.L$2;
                    LoginProperties loginProperties9 = (LoginProperties) loadAccountsMiddleware$loadLoginParameters$1.L$1;
                    d0 d0Var8 = (d0) loadAccountsMiddleware$loadLoginParameters$1.L$0;
                    kotlin.b.b(obj);
                    linkedHashMap = map3;
                    filter = filter4;
                    list2 = list3;
                    d0Var4 = d0Var8;
                    a0Var2 = a0Var3;
                    arrayList2 = r6;
                    loginProperties3 = loginProperties9;
                    modernAccount3 = modernAccount9;
                    arrayList2.add(new r2(modernAccount4, (List) obj));
                    if (modernAccount4.isChild()) {
                    }
                }
                a0Var = (com.yandex.passport.internal.usecase.ui.a0) obj;
                com.yandex.passport.internal.b bVar2 = a0Var.a;
                d0Var5.getClass();
                ModernAccount e2 = loginProperties.getSelectedUid() == null ? bVar2.e(com.yandex.passport.internal.util.p.B(loginProperties.getSelectedUid())) : loginProperties.getLoginHint() != null ? com.yandex.passport.common.permission.b.b(bVar2.a, null, loginProperties.getLoginHint(), bVar2.b) : null;
                com.yandex.passport.internal.badges.c cVar = d0Var5.c;
                loadAccountsMiddleware$loadLoginParameters$1.L$0 = d0Var5;
                loadAccountsMiddleware$loadLoginParameters$1.L$1 = loginProperties;
                loadAccountsMiddleware$loadLoginParameters$1.L$2 = filter;
                loadAccountsMiddleware$loadLoginParameters$1.L$3 = a0Var;
                loadAccountsMiddleware$loadLoginParameters$1.L$4 = e2;
                loadAccountsMiddleware$loadLoginParameters$1.label = 2;
                a = cVar.a(zy11.a, loadAccountsMiddleware$loadLoginParameters$1);
                if (a != coroutineSingletons) {
                    d0Var2 = d0Var5;
                    modernAccount = e2;
                    obj = a;
                    arrayList = new ArrayList();
                    linkedHashMap = new LinkedHashMap();
                    it = a0Var.b.a.iterator();
                    d0 d0Var72 = d0Var2;
                    modernAccount2 = modernAccount;
                    loadAccountsMiddleware$loadLoginParameters$12 = loadAccountsMiddleware$loadLoginParameters$1;
                    d0Var3 = d0Var72;
                    LoginProperties loginProperties82 = loginProperties;
                    list = (List) obj;
                    loginProperties2 = loginProperties82;
                    if (!it.hasNext()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        loadAccountsMiddleware$loadLoginParameters$1 = new LoadAccountsMiddleware$loadLoginParameters$1(d0Var5, continuationImpl);
        Object obj2 = loadAccountsMiddleware$loadLoginParameters$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loadAccountsMiddleware$loadLoginParameters$1.label;
        if (i != 0) {
        }
        a0Var = (com.yandex.passport.internal.usecase.ui.a0) obj2;
        com.yandex.passport.internal.b bVar22 = a0Var.a;
        d0Var5.getClass();
        if (loginProperties.getSelectedUid() == null) {
        }
        com.yandex.passport.internal.badges.c cVar2 = d0Var5.c;
        loadAccountsMiddleware$loadLoginParameters$1.L$0 = d0Var5;
        loadAccountsMiddleware$loadLoginParameters$1.L$1 = loginProperties;
        loadAccountsMiddleware$loadLoginParameters$1.L$2 = filter;
        loadAccountsMiddleware$loadLoginParameters$1.L$3 = a0Var;
        loadAccountsMiddleware$loadLoginParameters$1.L$4 = e2;
        loadAccountsMiddleware$loadLoginParameters$1.label = 2;
        a = cVar2.a(zy11.a, loadAccountsMiddleware$loadLoginParameters$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 9), this, 6);
    }
}
