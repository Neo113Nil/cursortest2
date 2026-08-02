package io.appmetrica.analytics.impl;

import android.content.Context;
import com.ironsource.X3;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Ik {
    public final C5007m7 a;
    public C4955k7 b;
    public C4796e3 c;
    public C4822f3 d;
    public Eb e;
    public Fb f;
    public Cn g;
    public Dn h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();

    public Ik(File file) {
        this.a = new C5007m7(file);
    }

    public final IBinaryDataHelper a(Context context) {
        C4796e3 c4796e3 = this.c;
        if (c4796e3 != null) {
            return c4796e3;
        }
        C4796e3 c4796e32 = new C4796e3(new Al(f(context)), "binary_data");
        this.c = c4796e32;
        return c4796e32;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        C4822f3 c4822f3;
        c4822f3 = this.d;
        if (c4822f3 == null) {
            c4822f3 = new C4822f3(a(context));
            this.d = c4822f3;
        }
        return c4822f3;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized Ta d(Context context) {
        Fb fb;
        try {
            fb = this.f;
            if (fb == null) {
                Eb eb = this.e;
                if (eb == null) {
                    eb = new Eb(new Al(f(context)));
                    this.e = eb;
                }
                fb = new Fb(eb);
                this.f = fb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return fb;
    }

    public final synchronized Ta e(Context context) {
        Eb eb;
        eb = this.e;
        if (eb == null) {
            eb = new Eb(new Al(f(context)));
            this.e = eb;
        }
        return eb;
    }

    public final synchronized C4955k7 f(Context context) {
        C4955k7 c4955k7;
        try {
            c4955k7 = this.b;
            if (c4955k7 == null) {
                C5007m7 c5007m7 = this.a;
                String a = new C4981l7(c5007m7.a, c5007m7.b, true).a(context, new C5098pk());
                Y6 y6 = I5.c;
                y6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", F5.a);
                hashMap.put("binary_data", D5.a);
                hashMap.put("temp_cache", Fn.a);
                Iterator<ModuleServicesDatabase> it = C5342za.I.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C5152rn c5152rn = y6.c;
                C4904i7 c4904i7 = y6.a;
                C4852g7 c4852g7 = c4904i7.e;
                C4878h7 c4878h7 = c4904i7.f;
                Ba ba = new Ba(false);
                ba.a(Integer.valueOf(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE), new C5124qk());
                Iterator<ModuleServicesDatabase> it2 = C5342za.I.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            ba.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C5230un c5230un = new C5230un("service database", hashMap);
                c5152rn.getClass();
                c4955k7 = new C4955k7(context, a, new C5178sn(c4852g7, c4878h7, ba, c5230un), PublicLogger.getAnonymousInstance());
                this.b = c4955k7;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4955k7;
    }

    public final synchronized C4955k7 c(Context context, C4747c5 c4747c5) {
        Object obj;
        try {
            String str = new T4(c4747c5).a;
            LinkedHashMap linkedHashMap = this.i;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                C5007m7 c5007m7 = this.a;
                String a = new C4981l7(c5007m7.a, c5007m7.b, false).a(context, new T4(c4747c5));
                Y6 y6 = I5.c;
                y6.getClass();
                String str2 = c4747c5.b;
                if (str2 == null) {
                    str2 = X3.i.Z;
                }
                String concat = "component-".concat(str2);
                C5152rn c5152rn = y6.c;
                C4904i7 c4904i7 = y6.a;
                C4697a7 c4697a7 = c4904i7.a;
                C4723b7 c4723b7 = c4904i7.b;
                Ba ba = new Ba(false);
                ba.a(112, new W4());
                C5230un c5230un = new C5230un(concat, y6.b.a);
                c5152rn.getClass();
                obj = new C4955k7(context, a, new C5178sn(c4697a7, c4723b7, ba, c5230un), PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C4955k7) obj;
    }

    public final synchronized IBinaryDataHelper a(Context context, C4747c5 c4747c5) {
        Object obj;
        try {
            String str = new T4(c4747c5).a;
            LinkedHashMap linkedHashMap = this.k;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new C4796e3(new Al(c(context, c4747c5)), "binary_data");
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (IBinaryDataHelper) obj;
    }

    public final synchronized Ta b(Context context, C4747c5 c4747c5) {
        Object obj;
        try {
            String str = new T4(c4747c5).a;
            LinkedHashMap linkedHashMap = this.j;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new Eb(new Al(c(context, c4747c5)));
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Ta) obj;
    }
}
