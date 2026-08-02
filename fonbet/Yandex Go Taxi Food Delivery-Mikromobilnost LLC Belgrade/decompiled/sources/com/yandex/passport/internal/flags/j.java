package com.yandex.passport.internal.flags;

import android.content.SharedPreferences;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.scc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class j {
    public final d a;
    public final com.yandex.passport.internal.flags.experiments.g b;
    public final com.yandex.passport.internal.flags.experiments.k c;
    public final com.yandex.passport.internal.flags.experiments.b d;
    public final List e;

    public j(d dVar, com.yandex.passport.internal.flags.experiments.g gVar, com.yandex.passport.internal.flags.experiments.k kVar, com.yandex.passport.internal.flags.experiments.b bVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = kVar;
        this.d = bVar;
        this.e = scc.g(new i(new FlagRepository$resolvers$1(1, kVar, com.yandex.passport.internal.flags.experiments.k.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0)), new i(new FlagRepository$resolvers$2(1, gVar, com.yandex.passport.internal.flags.experiments.g.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0)));
    }

    public final void a() {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Start of collecting experiment flags for the current Passport session", 8);
        }
        Set<String> keySet = this.b.a.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            if (!jl40.l(str, "__last__updated__time") && !jl40.l(str, "__last__enqueue__time")) {
                arrayList.add(obj);
            }
        }
        ArrayList m0 = kotlin.collections.a.m0(kotlin.collections.a.J0(this.c.a.getAll().keySet()), arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = m0.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String string = this.c.a.getString(str2, null);
            if (string != null) {
                linkedHashMap.put(str2, string);
            } else {
                String string2 = this.b.a.getString(str2, null);
                if (string2 != null) {
                    linkedHashMap.put(str2, string2);
                }
            }
        }
        com.yandex.passport.internal.flags.experiments.b bVar = this.d;
        Map t = kotlin.collections.b.t(linkedHashMap);
        bVar.getClass();
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Rewriting the actual experiments of this Passport session", 8);
        }
        SharedPreferences.Editor edit = bVar.a.edit();
        edit.clear();
        for (Map.Entry entry : t.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        edit.apply();
        bVar.b = true;
    }

    public final Object b(g gVar) {
        if (this.d.b) {
            String str = (String) new FlagRepository$get$1(1, this.d, com.yandex.passport.internal.flags.experiments.b.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0).invoke(gVar.a);
            Object a = str != null ? gVar.a(str) : null;
            if (a != null) {
                return a;
            }
        } else {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                String str2 = (String) ((i) it.next()).a.invoke(gVar.a);
                Object a2 = str2 != null ? gVar.a(str2) : null;
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return gVar.b;
    }

    public final h c(g gVar) {
        FlagRepository$getAllFlagValues$1 flagRepository$getAllFlagValues$1 = new FlagRepository$getAllFlagValues$1(this.d);
        String str = gVar.a;
        String str2 = (String) flagRepository$getAllFlagValues$1.invoke(str);
        Object a = str2 != null ? gVar.a(str2) : null;
        String str3 = (String) new FlagRepository$getAllFlagValues$2(this.c).invoke(str);
        Object a2 = str3 != null ? gVar.a(str3) : null;
        String str4 = (String) new FlagRepository$getAllFlagValues$3(this.b).invoke(str);
        return new h(a, a2, str4 != null ? gVar.a(str4) : null, gVar.b);
    }
}
