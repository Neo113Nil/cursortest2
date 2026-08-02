package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.network.GetUserInfoRequest$MasterMember;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.yd;
import defpackage.auu0;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.qcx;
import defpackage.tcc;
import defpackage.ycc;
import defpackage.zcx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class t {
    public final com.yandex.passport.internal.report.reporters.a a;

    public t(com.yandex.passport.internal.report.reporters.a aVar) {
        this.a = aVar;
    }

    public static Set b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            kotlinx.serialization.json.d dVar = value instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) value : null;
            if (dVar != null ? jl40.l(qcx.f(dVar), Boolean.TRUE) : false) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return kotlin.collections.a.N0(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap a(com.yandex.passport.internal.b bVar) {
        Uid masterUid;
        char c;
        int i;
        com.yandex.passport.internal.entities.k kVar;
        List<ModernAccount> x0 = kotlin.collections.a.x0(bVar.f(), new s());
        ArrayList arrayList = new ArrayList();
        for (ModernAccount modernAccount : x0) {
            String body = modernAccount.getUserInfo().getBody();
            ?? r4 = EmptyList.a;
            if (body != null && (masterUid = modernAccount.getMasterUid()) != null) {
                Environment environment = masterUid.getEnvironment();
                zcx zcxVar = com.yandex.passport.data.network.core.m.a;
                zcxVar.getClass();
                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) ((kotlinx.serialization.json.c) zcxVar.b(kotlinx.serialization.json.c.Companion.serializer(), body)).get("master_members");
                if (bVar2 != null) {
                    kotlinx.serialization.json.a l = qcx.l(bVar2);
                    r4 = new ArrayList();
                    for (kotlinx.serialization.json.b bVar3 : l.a) {
                        try {
                            zcx zcxVar2 = com.yandex.passport.data.network.core.m.a;
                            zcxVar2.getClass();
                            GetUserInfoRequest$MasterMember getUserInfoRequest$MasterMember = (GetUserInfoRequest$MasterMember) zcxVar2.a(GetUserInfoRequest$MasterMember.Companion.serializer(), bVar3);
                            Map map = (Map) zcxVar2.a(new k8u(auu0.a, kotlinx.serialization.json.b.Companion.serializer(), 1), bVar3);
                            try {
                                Uid b = a0.b(environment, getUserInfoRequest$MasterMember.getUid());
                                int primaryAliasType = getUserInfoRequest$MasterMember.getPrimaryAliasType();
                                PassportAccountType.Companion.getClass();
                                try {
                                    try {
                                        c = 0;
                                        i = 1;
                                        try {
                                            kVar = new com.yandex.passport.internal.entities.k(b, masterUid, com.yandex.passport.internal.ui.c.A(com.yandex.passport.api.l.a(primaryAliasType, false)), getUserInfoRequest$MasterMember.getDisplayLogin(), getUserInfoRequest$MasterMember.getPublicName(), getUserInfoRequest$MasterMember.getPhoneNumber(), getUserInfoRequest$MasterMember.getAvatarUrl(), b(map));
                                        } catch (Exception e) {
                                            e = e;
                                            com.yandex.passport.internal.report.reporters.a aVar = this.a;
                                            aVar.getClass();
                                            com.yandex.passport.internal.report.k kVar2 = com.yandex.passport.internal.report.k.w;
                                            yd ydVar = new yd(e);
                                            pd[] pdVarArr = new pd[i];
                                            pdVarArr[c] = ydVar;
                                            aVar.f(kVar2, pdVarArr);
                                            kVar = null;
                                            if (kVar == null) {
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        c = 0;
                                        i = 1;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    c = 0;
                                    i = 1;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                c = 0;
                                i = 1;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            c = 0;
                            i = 1;
                        }
                        if (kVar == null) {
                            r4.add(kVar);
                        }
                    }
                }
            }
            ycc.r((Iterable) r4, arrayList);
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((com.yandex.passport.internal.entities.k) next).d(), next);
        }
        return linkedHashMap;
    }

    public final ArrayList c(Uid uid, com.yandex.passport.internal.b bVar) {
        Collection values = a(bVar).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((com.yandex.passport.internal.entities.k) obj).c().equals(uid)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
