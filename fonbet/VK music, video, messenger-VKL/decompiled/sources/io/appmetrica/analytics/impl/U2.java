package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.j5g;

/* loaded from: classes8.dex */
public abstract class U2 implements Pa {
    public static final HashSet n = new HashSet(Arrays.asList(1, 13));
    public static final S2 o = new S2();
    protected final Context a;
    protected final Ph b;

    @NonNull
    protected final PublicLogger c;

    @NonNull
    protected final C4740bo d;

    @NonNull
    protected final Og e;

    @NonNull
    protected final H6 f;
    public final C4768d0 g;
    protected final Gi h;
    public Ab i;
    public final Mf j;
    public final Y9 k;
    public final Ue l;
    public final C5101pn m;

    public U2(Context context, Gi gi, Ph ph, Y9 y9, D6 d6, C4740bo c4740bo, Og og, H6 h6, C4768d0 c4768d0, Ue ue) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.h = gi;
        this.b = ph;
        this.k = y9;
        this.d = c4740bo;
        this.e = og;
        this.f = h6;
        this.g = c4768d0;
        this.l = ue;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(ph.b().getApiKey());
        this.c = orCreatePublicLogger;
        if (AbstractC4951k3.a(ph.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.j = d6;
        this.m = new C5101pn(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.c.info("Put error environment pair <%s, %s>", str, str2);
        Ph ph = this.b;
        synchronized (ph) {
            P8 p8 = ph.c;
            p8.b.b(p8.a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (vo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.c.info("Clear app environment", new Object[0]);
        Gi gi = this.h;
        Ph ph = this.b;
        gi.getClass();
        C4722b6 n2 = Y3.n();
        Lf lf = new Lf(ph.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
        P8 p8 = ph.c;
        synchronized (ph) {
            str = ph.f;
        }
        gi.a(new Fh(n2, false, 1, null, new Ph(lf, counterConfiguration, p8, str)));
    }

    public final void d(String str) {
        if (this.b.f()) {
            return;
        }
        this.h.d.c();
        Ab ab = this.i;
        ab.a.removeCallbacks(ab.c, ab.b.b.b.getApiKey());
        this.b.e = true;
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3("", str, 3, 0, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    public final void e(String str) {
        this.h.d.b();
        Ab ab = this.i;
        Ab.a(ab.a, ab.b, ab.c);
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3("", str, 6400, 0, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        this.b.e = false;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        Af af;
        Gi gi = this.h;
        Ph ph = this.b;
        gi.getClass();
        Ef ef = ph.d;
        synchronized (ph) {
            str = ph.f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(ph.b.getApiKey());
        Set set = I9.a;
        JSONObject jSONObject = new JSONObject();
        if (ef != null && (af = ef.a) != null) {
            try {
                jSONObject.put("preloadInfo", af.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        y3.c(str);
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.c.info("Pause session", new Object[0]);
        d(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.c.info("Put app environment: <%s, %s>", str, str2);
        Gi gi = this.h;
        Ph ph = this.b;
        gi.getClass();
        C4722b6 b = Y3.b(str, str2);
        Lf lf = new Lf(ph.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
        P8 p8 = ph.c;
        synchronized (ph) {
            str3 = ph.f;
        }
        gi.a(new Fh(b, false, 1, null, new Ph(lf, counterConfiguration, p8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C4793e0 c4793e0 = new C4793e0(new C4819f0(this, map));
        C5292xa c5292xa = new C5292xa();
        D6 d6 = C5030n4.l().a;
        Thread a = c4793e0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c4793e0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        Gn gn = (Gn) c5292xa.apply(a, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Ln());
        try {
            map2 = c4793e0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a && thread != null) {
                arrayList.add((Gn) c5292xa.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(gn, arrayList, d6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Gi gi = this.h;
        Ph ph = this.b;
        gi.getClass();
        for (Ni ni : eCommerceEvent.toProto()) {
            Y3 y3 = new Y3(LoggerStorage.getOrCreatePublicLogger(ph.b.getApiKey()));
            EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
            y3.d = 41000;
            y3.b = y3.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ni.a)));
            y3.g = ni.b.getBytesTruncated();
            Lf lf = new Lf(ph.a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
            P8 p8 = ph.c;
            synchronized (ph) {
                str = ph.f;
            }
            gi.a(new Fh(y3, false, 1, null, new Ph(lf, counterConfiguration, p8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        Ng ng = new Ng(str, a(th));
        Gi gi = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(ng));
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(byteArray, str, 5892, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        this.c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3("", str, 1, 0, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        Xi xi = T2.a;
        xi.getClass();
        Ao a = xi.a(revenue);
        if (!a.a) {
            this.c.warning("Passed revenue is not valid. Reason: " + a.b, new Object[0]);
            return;
        }
        Gi gi = this.h;
        Yi yi = new Yi(revenue, this.c);
        Ph ph = this.b;
        gi.getClass();
        Y3 a2 = Y3.a(LoggerStorage.getOrCreatePublicLogger(ph.b.getApiKey()), yi);
        Lf lf = new Lf(ph.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
        P8 p8 = ph.c;
        synchronized (ph) {
            str = ph.f;
        }
        gi.a(new Fh(a2, false, 1, null, new Ph(lf, counterConfiguration, p8, str)));
        this.c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        C4714ao a = Cdo.a(th, new V(null, null, this.j.a()), null, (String) this.k.b.a(), (Boolean) this.k.c.a());
        Gi gi = this.h;
        gi.a(gi.a(a, this.b));
        this.c.info("Unhandled exception received: " + a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C5050no c5050no = new C5050no(C5050no.c);
        Iterator<UserProfileUpdate<? extends InterfaceC5076oo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC5076oo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.c);
            userProfileUpdatePatcher.a(c5050no);
        }
        C5179so c5179so = new C5179so();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c5050no.a.size(); i++) {
            SparseArray sparseArray = c5050no.a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C5102po) it2.next());
            }
        }
        c5179so.a = (C5102po[]) arrayList.toArray(new C5102po[arrayList.size()]);
        Ao a = o.a(c5179so);
        if (!a.a) {
            this.c.warning("UserInfo wasn't sent because " + a.b, new Object[0]);
            return;
        }
        Gi gi = this.h;
        Ph ph = this.b;
        gi.getClass();
        C4722b6 a2 = Y3.a(c5179so);
        Lf lf = new Lf(ph.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
        P8 p8 = ph.c;
        synchronized (ph) {
            str = ph.f;
        }
        gi.a(new Fh(a2, false, 1, null, new Ph(lf, counterConfiguration, p8, str)));
        this.c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.c.info("Send event buffer", new Object[0]);
        Gi gi = this.h;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        Y3 y3 = new Y3("", "", 256, 0, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.b.setDataSendingEnabled(z);
        this.c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        y3.p = Collections.singletonMap(str, bArr);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        String str2;
        Gi gi = this.h;
        Ph ph = this.b;
        gi.getClass();
        Y3 y3 = new Y3(LoggerStorage.getOrCreatePublicLogger(ph.b.getApiKey()));
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        y3.d = 40962;
        y3.c(str);
        y3.b = y3.e(str);
        Lf lf = new Lf(ph.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
        P8 p8 = ph.c;
        synchronized (ph) {
            str2 = ph.f;
        }
        gi.a(new Fh(y3, false, 1, null, new Ph(lf, counterConfiguration, p8, str2)));
        this.c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        String str;
        Gi gi = this.h;
        E e = new E(adRevenue, z, this.m, this.c);
        Ph ph = this.b;
        gi.getClass();
        Y3 a = Y3.a(LoggerStorage.getOrCreatePublicLogger(ph.b.getApiKey()), e);
        Lf lf = new Lf(ph.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(ph.b);
        P8 p8 = ph.c;
        synchronized (ph) {
            str = ph.f;
        }
        gi.a(new Fh(a, false, 1, null, new Ph(lf, counterConfiguration, p8, str)));
        this.c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC5166sb.b(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void b(@NonNull String str, @Nullable String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(str2, str, 1, 0, publicLogger);
        y3.l = EnumC5316y9.JS;
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (vo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(str2, str, 1, 0, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
    }

    public final C4714ao a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof Z1) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return Cdo.a(th2, new V(null, null, this.j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.k.b.a(), (Boolean) this.k.c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        G6 g6 = new G6(new Ng(str2, a(th)), str);
        Gi gi = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(g6));
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(byteArray, str2, 5896, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        this.c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        C4714ao a = this.l.a(pluginErrorDetails);
        Gi gi = this.h;
        Qn qn = a.a;
        String str = qn != null ? (String) WrapUtils.getOrDefault(qn.a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.d.fromModel(a));
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(byteArray, str, 5891, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        this.c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void b(@NonNull String str) {
        Gi gi = this.h;
        C4722b6 a = C4722b6.a(str);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(a, ph), ph, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final boolean b() {
        return this.b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        Gi gi = this.h;
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        gi.a(new Y3("", str, 1, 0, publicLogger), this.b, 1, map);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4779db, io.appmetrica.analytics.impl.InterfaceC4856gb
    public final void a(@NonNull C4714ao c4714ao) {
        Gi gi = this.h;
        Fh a = gi.a(c4714ao, this.b);
        Ph ph = a.e;
        Zl zl = gi.e;
        if (zl != null) {
            ph.b.setUuid(((Yl) zl).g());
        } else {
            ph.getClass();
        }
        gi.c.b(a);
        this.c.info("Unhandled exception received: " + c4714ao, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        C4714ao c4714ao;
        Ue ue = this.l;
        if (pluginErrorDetails != null) {
            c4714ao = ue.a(pluginErrorDetails);
        } else {
            ue.getClass();
            c4714ao = null;
        }
        Ng ng = new Ng(str, c4714ao);
        Gi gi = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(ng));
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(byteArray, str, 5896, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        this.c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4779db, io.appmetrica.analytics.impl.InterfaceC4845g0
    public final void a(@NonNull V v) {
        C4742c0 c4742c0 = new C4742c0(v, (String) this.k.b.a(), (Boolean) this.k.c.a());
        Gi gi = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.g.fromModel(c4742c0));
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(byteArray, "", 5968, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        String str = null;
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        Gn gn = v.a;
        if (gn != null) {
            str = "Thread[name=" + gn.a + ",tid={" + gn.c + ", priority=" + gn.b + ", group=" + gn.d + "}] at " + j5g.g0(gn.f, "\n", null, null, 0, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        EnumC5316y9 enumC5316y9;
        if (n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i = Q8.a[moduleEvent.getCategory().ordinal()];
        if (i == 1) {
            enumC5316y9 = EnumC5316y9.NATIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC5316y9 = EnumC5316y9.SYSTEM;
        }
        y3.l = enumC5316y9;
        y3.c = AbstractC5166sb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            y3.p = moduleEvent.getExtras();
        }
        this.h.a(y3, this.b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        C4714ao c4714ao;
        Ue ue = this.l;
        if (pluginErrorDetails != null) {
            c4714ao = ue.a(pluginErrorDetails);
        } else {
            ue.getClass();
            c4714ao = null;
        }
        G6 g6 = new G6(new Ng(str2, c4714ao), str);
        Gi gi = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(g6));
        PublicLogger publicLogger = this.c;
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3(byteArray, str2, 5896, publicLogger);
        Ph ph = this.b;
        gi.getClass();
        gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        this.c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
