package com.yandex.passport.internal.filter;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.models.ParameterRule;
import com.yandex.passport.data.models.VersionRule$Sign;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.Filter;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpg;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class i {
    public final l a;
    public final com.yandex.passport.common.common.a b;
    public final String c;
    public final s d;

    public i(l lVar, com.yandex.passport.common.common.a aVar, String str, s sVar) {
        this.a = lVar;
        this.b = aVar;
        this.c = str;
        this.d = sVar;
    }

    public final boolean a(com.yandex.passport.data.models.u uVar, String str) {
        try {
            VersionRule$Sign versionRule$Sign = uVar.a;
            String str2 = uVar.b;
            int i = h.a[versionRule$Sign.ordinal()];
            s sVar = this.d;
            if (i == 1) {
                sVar.getClass();
                if (s.a(str, str2) < 0) {
                    return false;
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar.getClass();
                if (s.a(str, str2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ModernAccount modernAccount, Filter filter, ContinuationImpl continuationImpl) {
        AccountFilterRepository$filterAccount$1 accountFilterRepository$filterAccount$1;
        int i;
        if (continuationImpl instanceof AccountFilterRepository$filterAccount$1) {
            accountFilterRepository$filterAccount$1 = (AccountFilterRepository$filterAccount$1) continuationImpl;
            int i2 = accountFilterRepository$filterAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountFilterRepository$filterAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountFilterRepository$filterAccount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountFilterRepository$filterAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Environment environment = modernAccount.getUid().getEnvironment();
                    if (environment != com.yandex.passport.internal.util.p.u(filter.getPrimaryEnvironment())) {
                        PassportEnvironmentImpl secondaryTeamEnvironment = filter.getSecondaryTeamEnvironment();
                        if (environment != (secondaryTeamEnvironment != null ? com.yandex.passport.internal.util.p.u(secondaryTeamEnvironment) : null)) {
                            return b.a;
                        }
                    }
                    if (!com.yandex.passport.internal.ui.c.t(modernAccount.getUid().getEnvironment())) {
                        EnumSet<PassportAccountType> supportedAccountTypes = filter.getSupportedAccountTypes();
                        if (supportedAccountTypes == null || !supportedAccountTypes.isEmpty()) {
                            Iterator<T> it = supportedAccountTypes.iterator();
                            while (it.hasNext()) {
                                if (modernAccount.getAccountType() == ((PassportAccountType) it.next())) {
                                }
                            }
                        }
                        return a.a;
                    }
                    if (kotlin.collections.a.U(modernAccount.getPartitions(), com.yandex.passport.internal.ui.c.G(filter.getPartitions())).isEmpty()) {
                        return d.a;
                    }
                    Map filterParameters = modernAccount.getFilterParameters();
                    Map internalFilterRules$passport_release = filter.getInternalFilterRules$passport_release();
                    accountFilterRepository$filterAccount$1.label = 1;
                    obj = e(filterParameters, internalFilterRules$passport_release, accountFilterRepository$filterAccount$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Boolean) obj).booleanValue() ? c.a : f.a;
            }
        }
        accountFilterRepository$filterAccount$1 = new AccountFilterRepository$filterAccount$1(this, continuationImpl);
        Object obj3 = accountFilterRepository$filterAccount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountFilterRepository$filterAccount$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj3).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:10:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, Filter filter, ContinuationImpl continuationImpl) {
        AccountFilterRepository$filterAccounts$1 accountFilterRepository$filterAccounts$1;
        int i;
        Iterator it;
        Filter filter2;
        Collection collection;
        if (continuationImpl instanceof AccountFilterRepository$filterAccounts$1) {
            accountFilterRepository$filterAccounts$1 = (AccountFilterRepository$filterAccounts$1) continuationImpl;
            int i2 = accountFilterRepository$filterAccounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountFilterRepository$filterAccounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountFilterRepository$filterAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountFilterRepository$filterAccounts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    filter2 = filter;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = accountFilterRepository$filterAccounts$1.L$4;
                    it = (Iterator) accountFilterRepository$filterAccounts$1.L$3;
                    collection = (Collection) accountFilterRepository$filterAccounts$1.L$2;
                    Filter filter3 = (Filter) accountFilterRepository$filterAccounts$1.L$1;
                    i iVar = (i) accountFilterRepository$filterAccounts$1.L$0;
                    kotlin.b.b(obj);
                    if (jl40.l(obj, f.a)) {
                        collection.add(obj2);
                    }
                    filter2 = filter3;
                    this = iVar;
                    if (it.hasNext()) {
                        Object next = it.next();
                        accountFilterRepository$filterAccounts$1.L$0 = this;
                        accountFilterRepository$filterAccounts$1.L$1 = filter2;
                        accountFilterRepository$filterAccounts$1.L$2 = collection;
                        accountFilterRepository$filterAccounts$1.L$3 = it;
                        accountFilterRepository$filterAccounts$1.L$4 = next;
                        accountFilterRepository$filterAccounts$1.label = 1;
                        Object b = this.b((ModernAccount) next, filter2, accountFilterRepository$filterAccounts$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        iVar = this;
                        obj2 = next;
                        filter3 = filter2;
                        obj = b;
                        if (jl40.l(obj, f.a)) {
                        }
                        filter2 = filter3;
                        this = iVar;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        accountFilterRepository$filterAccounts$1 = new AccountFilterRepository$filterAccounts$1(this, continuationImpl);
        Object obj3 = accountFilterRepository$filterAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountFilterRepository$filterAccounts$1.label;
        if (i != 0) {
        }
    }

    public final List d(ArrayList arrayList, Filter filter) {
        return (List) tje.Y(EmptyCoroutineContext.a, new AccountFilterRepository$filterAccountsSynchronous$1(this, arrayList, filter, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(2:10|11)(2:51|52))(3:53|54|(1:56))|12|13|(1:15)|(1:17)|18|(3:21|(3:34|35|(2:(3:41|28|29)|32)(3:44|45|46))(4:23|(2:31|32)|28|29)|19)|47|48|49))|62|6|7|(0)(0)|12|13|(0)|(0)|18|(1:19)|47|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0036, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006d, code lost:
    
        r0 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0075, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0077, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.LogLevel.ERROR, null, "Can't read FilterRules from filterRulesStorage.", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x007e, code lost:
    
        r11 = kotlin.collections.b.f();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Map map, Map map2, ContinuationImpl continuationImpl) {
        AccountFilterRepository$filterWithFilterParams$1 accountFilterRepository$filterWithFilterParams$1;
        int i;
        Map f;
        if (continuationImpl instanceof AccountFilterRepository$filterWithFilterParams$1) {
            accountFilterRepository$filterWithFilterParams$1 = (AccountFilterRepository$filterWithFilterParams$1) continuationImpl;
            int i2 = accountFilterRepository$filterWithFilterParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountFilterRepository$filterWithFilterParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountFilterRepository$filterWithFilterParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountFilterRepository$filterWithFilterParams$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = this.a;
                    accountFilterRepository$filterWithFilterParams$1.L$0 = this;
                    accountFilterRepository$filterWithFilterParams$1.L$1 = map;
                    accountFilterRepository$filterWithFilterParams$1.L$2 = map2;
                    accountFilterRepository$filterWithFilterParams$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(new com.yandex.passport.common.mvi.c(((tpg) lVar.c.getValue(lVar.a, l.e[0])).getData(), lVar, i3), accountFilterRepository$filterWithFilterParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map2 = (Map) accountFilterRepository$filterWithFilterParams$1.L$2;
                    map = (Map) accountFilterRepository$filterWithFilterParams$1.L$1;
                    this = (i) accountFilterRepository$filterWithFilterParams$1.L$0;
                    kotlin.b.b(obj);
                }
                f = (Map) obj;
                if (f.isEmpty()) {
                    f = null;
                }
                if (f != null) {
                    map2 = f;
                }
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    ParameterRule parameterRule = (ParameterRule) entry.getValue();
                    Set set = (Set) map.get(str);
                    this.getClass();
                    int i4 = h.b[parameterRule.getSign().ordinal()];
                    if (i4 == 1) {
                        if (set != null && !kotlin.collections.a.U(parameterRule.getParameters(), set).isEmpty()) {
                        }
                        return Boolean.FALSE;
                    }
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    if (set != null && !kotlin.collections.a.U(parameterRule.getParameters(), set).isEmpty()) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }
        accountFilterRepository$filterWithFilterParams$1 = new AccountFilterRepository$filterWithFilterParams$1(this, continuationImpl);
        Object obj2 = accountFilterRepository$filterWithFilterParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountFilterRepository$filterWithFilterParams$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        f = (Map) obj2;
        if (f.isEmpty()) {
        }
        if (f != null) {
        }
        while (r10.hasNext()) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(3:14|15|16)(2:11|12))(7:17|18|(2:19|(3:21|(2:26|(2:31|(2:35|36)(2:54|38))(3:55|56|57))(3:59|60|61)|37)(2:63|64))|39|40|(4:42|(1:44)(1:49)|(1:46)|48)(3:50|(1:52)|(0)(1:48))|47)))|69|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0034, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
    
        r15 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e4, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e6, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.LogLevel.ERROR, null, "Can't apply AccountFilterConfig: " + r14, r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(com.yandex.passport.data.models.a aVar, ContinuationImpl continuationImpl) {
        AccountFilterRepository$onFilterConfigUpdate$1 accountFilterRepository$onFilterConfigUpdate$1;
        int i;
        Object obj;
        com.yandex.passport.common.common.a aVar2 = this.b;
        if (continuationImpl instanceof AccountFilterRepository$onFilterConfigUpdate$1) {
            accountFilterRepository$onFilterConfigUpdate$1 = (AccountFilterRepository$onFilterConfigUpdate$1) continuationImpl;
            int i2 = accountFilterRepository$onFilterConfigUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountFilterRepository$onFilterConfigUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = accountFilterRepository$onFilterConfigUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountFilterRepository$onFilterConfigUpdate$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                ArrayList arrayList = aVar.a;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    com.yandex.passport.data.models.b bVar = ((com.yandex.passport.data.models.f) obj).a;
                    String b = ((com.yandex.passport.internal.common.e) aVar2).b();
                    String a = ((com.yandex.passport.internal.common.e) aVar2).a();
                    String str = this.c;
                    com.yandex.passport.data.models.u uVar = bVar.a;
                    if (uVar == null || a(uVar, str)) {
                        List list = bVar.c;
                        if (list == null || list.contains(a)) {
                            com.yandex.passport.data.models.u uVar2 = bVar.b;
                            if (uVar2 == null || a(uVar2, b)) {
                                break;
                            }
                        }
                    }
                }
                com.yandex.passport.data.models.f fVar = (com.yandex.passport.data.models.f) obj;
                l lVar = this.a;
                if (fVar != null) {
                    LinkedHashMap linkedHashMap = fVar.b;
                    accountFilterRepository$onFilterConfigUpdate$1.L$0 = aVar;
                    accountFilterRepository$onFilterConfigUpdate$1.label = 1;
                    Object a2 = androidx.datastore.preferences.core.b.a((tpg) lVar.c.getValue(lVar.a, l.e[0]), new FilterRulesStorage$setFilterRules$2(linkedHashMap, lVar, null), accountFilterRepository$onFilterConfigUpdate$1);
                    if (a2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        a2 = zy11Var;
                    }
                    if (a2 == coroutineSingletons) {
                    }
                    return zy11Var;
                }
                accountFilterRepository$onFilterConfigUpdate$1.L$0 = aVar;
                accountFilterRepository$onFilterConfigUpdate$1.label = 2;
                Object a3 = androidx.datastore.preferences.core.b.a((tpg) lVar.c.getValue(lVar.a, l.e[0]), new FilterRulesStorage$clearFilterRules$2(), accountFilterRepository$onFilterConfigUpdate$1);
                if (a3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    a3 = zy11Var;
                }
                if (a3 != coroutineSingletons) {
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        accountFilterRepository$onFilterConfigUpdate$1 = new AccountFilterRepository$onFilterConfigUpdate$1(this, continuationImpl);
        Object obj22 = accountFilterRepository$onFilterConfigUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountFilterRepository$onFilterConfigUpdate$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
