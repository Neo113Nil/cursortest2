package xsna;

import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.DataOrigin;
import android.os.ext.SdkExtensions;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;
import xsna.jlp;
import xsna.vi10;

/* compiled from: ResponseConverters.kt */
/* loaded from: classes12.dex */
public final class qbg0 {
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    public static final androidx.health.connect.client.aggregate.c a(Set<? extends AggregateMetric<? extends Object>> set, izs<? super AggregationType<Object>, ? extends Object> izsVar, izs<? super AggregationType<Object>, ? extends Set<DataOrigin>> izsVar2) {
        String packageName;
        double inCalories;
        double inGrams;
        double inMeters;
        double inGrams2;
        double inMillimetersOfMercury;
        double inWatts;
        int extensionVersion;
        double inCelsius;
        double inMetersPerSecond;
        double inLiters;
        MapBuilder mapBuilder = new MapBuilder();
        Set<? extends AggregateMetric<? extends Object>> set2 = set;
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            AggregateMetric aggregateMetric = (AggregateMetric) it.next();
            Object invoke = izsVar.invoke(l7g0.a(aggregateMetric));
            if (invoke != null) {
                mapBuilder.put(aggregateMetric, invoke);
            }
        }
        MapBuilder h = mapBuilder.h();
        MapBuilder mapBuilder2 = new MapBuilder();
        Object it2 = ((kotlin.collections.builders.a) h.entrySet()).iterator();
        while (((MapBuilder.d) it2).hasNext()) {
            Map.Entry entry = (Map.Entry) ((MapBuilder.b) it2).next();
            AggregateMetric aggregateMetric2 = (AggregateMetric) entry.getKey();
            Object value = entry.getValue();
            if (ib1.b.containsKey(aggregateMetric2) || ib1.e.containsKey(aggregateMetric2)) {
                mapBuilder2.put(aggregateMetric2.a(), (Long) value);
            }
        }
        MapBuilder h2 = mapBuilder2.h();
        MapBuilder mapBuilder3 = new MapBuilder();
        Object it3 = ((kotlin.collections.builders.a) h.entrySet()).iterator();
        while (((MapBuilder.d) it3).hasNext()) {
            Map.Entry entry2 = (Map.Entry) ((MapBuilder.b) it3).next();
            AggregateMetric aggregateMetric3 = (AggregateMetric) entry2.getKey();
            Object value2 = entry2.getValue();
            if (ib1.a.containsKey(aggregateMetric3)) {
                mapBuilder3.put(aggregateMetric3.a(), (Double) value2);
            } else if (ib1.c.containsKey(aggregateMetric3)) {
                String a = aggregateMetric3.a();
                jlp.a aVar = jlp.d;
                inCalories = fb1.f(value2).getInCalories();
                aVar.getClass();
                mapBuilder3.put(a, Double.valueOf(new jlp(inCalories, jlp.b.CALORIES).c()));
            } else if (ib1.f.containsKey(aggregateMetric3)) {
                String a2 = aggregateMetric3.a();
                inGrams = s92.e(value2).getInGrams();
                mapBuilder3.put(a2, Double.valueOf(inGrams));
            } else if (ib1.d.containsKey(aggregateMetric3)) {
                String a3 = aggregateMetric3.a();
                inMeters = n92.d(value2).getInMeters();
                mapBuilder3.put(a3, Double.valueOf(inMeters));
            } else if (ib1.g.containsKey(aggregateMetric3)) {
                String a4 = aggregateMetric3.a();
                vi10.a aVar2 = vi10.d;
                inGrams2 = s92.e(value2).getInGrams();
                aVar2.getClass();
                vi10 a5 = vi10.a.a(inGrams2);
                vi10.b bVar = vi10.b.KILOGRAMS;
                mapBuilder3.put(a4, Double.valueOf(a5.c == bVar ? a5.b : a5.a() / bVar.h()));
            } else if (ib1.i.containsKey(aggregateMetric3)) {
                String a6 = aggregateMetric3.a();
                inMillimetersOfMercury = o92.c(value2).getInMillimetersOfMercury();
                mapBuilder3.put(a6, Double.valueOf(inMillimetersOfMercury));
            } else if (ib1.h.containsKey(aggregateMetric3)) {
                String a7 = aggregateMetric3.a();
                inWatts = gb1.e(value2).getInWatts();
                mapBuilder3.put(a7, Double.valueOf(inWatts));
            } else if (ib1.j.containsKey(aggregateMetric3)) {
                extensionVersion = SdkExtensions.getExtensionVersion(34);
                if (extensionVersion < 13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String a8 = aggregateMetric3.a();
                inCelsius = nbg0.a(value2).getInCelsius();
                mapBuilder3.put(a8, Double.valueOf(inCelsius));
            } else if (ib1.k.containsKey(aggregateMetric3)) {
                String a9 = aggregateMetric3.a();
                inMetersPerSecond = q92.c(value2).getInMetersPerSecond();
                mapBuilder3.put(a9, Double.valueOf(inMetersPerSecond));
            } else if (ib1.l.containsKey(aggregateMetric3)) {
                String a10 = aggregateMetric3.a();
                inLiters = r92.b(value2).getInLiters();
                mapBuilder3.put(a10, Double.valueOf(inLiters));
            }
        }
        MapBuilder h3 = mapBuilder3.h();
        HashSet hashSet = new HashSet();
        Iterator<T> it4 = set2.iterator();
        while (it4.hasNext()) {
            Set<DataOrigin> invoke2 = izsVar2.invoke(l7g0.a((AggregateMetric) it4.next()));
            ArrayList arrayList = new ArrayList(c5g.u(invoke2, 10));
            Iterator<T> it5 = invoke2.iterator();
            while (it5.hasNext()) {
                packageName = eb1.d(it5.next()).getPackageName();
                arrayList.add(new luk(packageName));
            }
            g5g.y(arrayList, hashSet);
        }
        return new androidx.health.connect.client.aggregate.c(h2, h3, hashSet);
    }
}
