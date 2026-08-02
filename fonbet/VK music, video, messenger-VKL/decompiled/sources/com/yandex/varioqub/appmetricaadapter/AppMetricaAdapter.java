package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.c;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.f;
import com.yandex.varioqub.appmetricaadapter.impl.i;
import com.yandex.varioqub.appmetricaadapter.impl.j;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.j5g;

/* loaded from: classes8.dex */
public final class AppMetricaAdapter implements VarioqubConfigAdapter {
    public final Context a;
    public final d b;
    public String c;
    public Set d;
    public final String e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public AppMetricaAdapter(Context context) {
        Class<?> cls;
        d iVar;
        this.a = context;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("io.appmetrica.analytics.AppMetrica", false, j.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            iVar = new c();
        } else {
            try {
                cls2 = Class.forName("com.yandex.metrica.YandexMetrica", false, j.class.getClassLoader());
            } catch (Throwable unused2) {
            }
            iVar = cls2 != null ? new i() : new f();
        }
        this.b = iVar;
        this.c = "";
        this.d = EmptySet.b;
        this.e = "AppMetricaAdapter";
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public final String getAdapterName() {
        return this.e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void reportConfigChanged(ConfigData configData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        this.b.a(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestDeviceId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.b.c(this.a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestUserId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.b.b(this.a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setExperiments(String str) {
        this.c = str;
        Objects.toString(this.d);
        k kVar = new k();
        kVar.a = this.c;
        kVar.b = j5g.P0(this.d);
        this.b.a(MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setTriggeredTestIds(Set<Long> set) {
        Objects.toString(set);
        Set S0 = j5g.S0(set);
        this.d = S0;
        Objects.toString(S0);
        k kVar = new k();
        kVar.a = this.c;
        kVar.b = j5g.P0(this.d);
        this.b.a(MessageNano.toByteArray(kVar));
    }
}
