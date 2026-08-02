package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import xsna.ur;

/* loaded from: classes8.dex */
public final class A4 implements ArgumentsMerger {

    @Nullable
    public final String a;

    @Nullable
    public final Boolean b;

    @Nullable
    public final Location c;

    @Nullable
    public final Boolean d;

    @Nullable
    public final Integer e;

    @Nullable
    public final Integer f;

    @Nullable
    public final Integer g;

    @Nullable
    public final Boolean h;

    @Nullable
    public final Boolean i;

    @Nullable
    public final Map<String, String> j;

    @Nullable
    public final Integer k;

    @Nullable
    public final Boolean l;

    @Nullable
    public final Boolean m;

    @Nullable
    public final Boolean n;

    @NonNull
    public final Set<String> o;

    public A4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.a = str;
        this.b = bool;
        this.c = location;
        this.d = bool2;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = bool3;
        this.i = bool4;
        this.j = map;
        this.k = num4;
        this.l = bool5;
        this.m = bool6;
        this.n = bool7;
        this.o = set;
    }

    public final boolean a(@NonNull A4 a4) {
        return equals(a4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final A4 mergeFrom(@NonNull A4 a4) {
        return new A4((String) WrapUtils.getOrDefaultNullable(this.a, a4.a), (Boolean) WrapUtils.getOrDefaultNullable(this.b, a4.b), (Location) WrapUtils.getOrDefaultNullable(this.c, a4.c), (Boolean) WrapUtils.getOrDefaultNullable(this.d, a4.d), (Integer) WrapUtils.getOrDefaultNullable(this.e, a4.e), (Integer) WrapUtils.getOrDefaultNullable(this.f, a4.f), (Integer) WrapUtils.getOrDefaultNullable(this.g, a4.g), (Boolean) WrapUtils.getOrDefaultNullable(this.h, a4.h), (Boolean) WrapUtils.getOrDefaultNullable(this.i, a4.i), (Map) WrapUtils.getOrDefaultNullable(this.j, a4.j), (Integer) WrapUtils.getOrDefaultNullable(this.k, a4.k), (Boolean) WrapUtils.getOrDefaultNullable(this.l, a4.l), (Boolean) WrapUtils.getOrDefaultNullable(this.m, a4.m), (Boolean) WrapUtils.getOrDefaultNullable(this.n, a4.n), CollectionUtils.merge(this.o, a4.o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((A4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && A4.class == obj.getClass()) {
            A4 a4 = (A4) obj;
            if (Objects.equals(this.a, a4.a) && Objects.equals(this.b, a4.b) && Objects.equals(this.c, a4.c) && Objects.equals(this.d, a4.d) && Objects.equals(this.e, a4.e) && Objects.equals(this.f, a4.f) && Objects.equals(this.g, a4.g) && Objects.equals(this.h, a4.h) && Objects.equals(this.i, a4.i) && Objects.equals(this.j, a4.j) && Objects.equals(this.k, a4.k) && Objects.equals(this.l, a4.l) && Objects.equals(this.m, a4.m) && Objects.equals(this.n, a4.n) && Objects.equals(this.o, a4.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReporterArguments{apiKey='");
        sb.append(this.a);
        sb.append("', locationTracking=");
        sb.append(this.b);
        sb.append(", manualLocation=");
        sb.append(this.c);
        sb.append(", firstActivationAsUpdate=");
        sb.append(this.d);
        sb.append(", sessionTimeout=");
        sb.append(this.e);
        sb.append(", maxReportsCount=");
        sb.append(this.f);
        sb.append(", dispatchPeriod=");
        sb.append(this.g);
        sb.append(", logEnabled=");
        sb.append(this.h);
        sb.append(", dataSendingEnabled=");
        sb.append(this.i);
        sb.append(", clidsFromClient=");
        sb.append(this.j);
        sb.append(", maxReportsInDbCount=");
        sb.append(this.k);
        sb.append(", nativeCrashesEnabled=");
        sb.append(this.l);
        sb.append(", revenueAutoTrackingEnabled=");
        sb.append(this.m);
        sb.append(", advIdentifiersTrackingEnabled=");
        sb.append(this.n);
        sb.append(", autoCollectedDataSubscribers=");
        return ur.c(sb, this.o, '}');
    }

    public A4(@NonNull CounterConfiguration counterConfiguration, @Nullable Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public A4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
