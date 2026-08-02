package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$PresentationType;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$TransportCardStatus;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAnalytics;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PresentationTypeDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardStatus;

/* loaded from: classes6.dex */
public abstract class hta1 {
    public static String a(int i) {
        return i < 1000 ? String.valueOf(i) : i > 9000 ? "9k+" : String.format(Locale.getDefault(), "%dk+", Integer.valueOf(i / 1000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [h001] */
    public static final List b(List list) {
        u1l u1lVar;
        int i;
        long j;
        i001 i001Var;
        u1l u1lVar2 = new u1l(2, list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < u1lVar2.size()) {
            Date timestamp = ((j001) u1lVar2.get(i2)).getTimestamp();
            long time = timestamp.getTime();
            int i3 = i2 + 1;
            int i4 = i3;
            while (i4 < u1lVar2.size() && jl40.l(((j001) u1lVar2.get(i4)).getTimestamp(), timestamp)) {
                i4++;
            }
            if (i3 == i4) {
                arrayList.add(u1lVar2.get(i2));
            } else {
                long j2 = 1000 + time;
                if (i4 < u1lVar2.size() && ((j001) u1lVar2.get(i4)).getTimestamp().getTime() < j2) {
                    j2 = ((j001) u1lVar2.get(i4)).getTimestamp().getTime();
                }
                long j3 = j2 - time;
                long j4 = 1;
                if (j3 < 1) {
                    j3 = 1;
                }
                int i5 = i4 - i2;
                int i6 = i2;
                long j5 = j3 / (i5 >= 1 ? i5 : 1);
                if (j5 < 1) {
                    j5 = 1;
                }
                int i7 = 0;
                while (i7 < i5) {
                    long j6 = j4;
                    int i8 = i7;
                    Date date = new Date(Math.min((i7 * j5) + time, j2 - j6));
                    j001 j001Var = (j001) u1lVar2.get(i6 + i8);
                    zzs coordinates = j001Var.getCoordinates();
                    if (j001Var instanceof h001) {
                        h001 h001Var = (h001) j001Var;
                        i = i5;
                        u1lVar = u1lVar2;
                        i001Var = new h001(coordinates, h001Var.b, date, h001Var.d, h001Var.e);
                        j = time;
                    } else {
                        u1lVar = u1lVar2;
                        i = i5;
                        if (!(j001Var instanceof i001)) {
                            w511.b();
                            return null;
                        }
                        j = time;
                        i001Var = new i001(coordinates, ((i001) j001Var).b, date);
                    }
                    arrayList.add(i001Var);
                    i7 = i8 + 1;
                    i5 = i;
                    j4 = j6;
                    time = j;
                    u1lVar2 = u1lVar;
                }
            }
            i2 = i4;
            u1lVar2 = u1lVar2;
        }
        return a.q0(arrayList);
    }

    public static final gx01 c(HubItemAnalytics hubItemAnalytics, Integer num) {
        return new gx01(hubItemAnalytics.a, hubItemAnalytics.b, hubItemAnalytics.c, hubItemAnalytics.f, hubItemAnalytics.d, hubItemAnalytics.g, num, hubItemAnalytics.e, hubItemAnalytics.h);
    }

    public static final hx01 d(HubItemAnalyticsV2 hubItemAnalyticsV2, Integer num) {
        TransitRoutesHubAnalytics$PresentationType transitRoutesHubAnalytics$PresentationType;
        String str = hubItemAnalyticsV2.a;
        int i = hubItemAnalyticsV2.b;
        Double d = hubItemAnalyticsV2.c;
        String str2 = hubItemAnalyticsV2.e;
        Integer num2 = hubItemAnalyticsV2.f;
        String str3 = hubItemAnalyticsV2.d;
        String str4 = hubItemAnalyticsV2.g;
        Integer num3 = hubItemAnalyticsV2.h;
        PresentationTypeDto presentationTypeDto = hubItemAnalyticsV2.k;
        int i2 = presentationTypeDto == null ? -1 : g52.a[presentationTypeDto.ordinal()];
        if (i2 == -1 || i2 == 1) {
            transitRoutesHubAnalytics$PresentationType = TransitRoutesHubAnalytics$PresentationType.List;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            transitRoutesHubAnalytics$PresentationType = TransitRoutesHubAnalytics$PresentationType.Table;
        }
        return new hx01(str, i, transitRoutesHubAnalytics$PresentationType, d, num2, str3, str4, num, str2, num3, hubItemAnalyticsV2.i, hubItemAnalyticsV2.j, hubItemAnalyticsV2.l, hubItemAnalyticsV2.m);
    }

    public static final TransitRoutesHubAnalytics$TransportCardStatus e(TransportCardStatus transportCardStatus) {
        int i = g52.b[transportCardStatus.ordinal()];
        if (i == 1) {
            return TransitRoutesHubAnalytics$TransportCardStatus.Active;
        }
        if (i == 2) {
            return TransitRoutesHubAnalytics$TransportCardStatus.Blocked;
        }
        if (i == 3) {
            return TransitRoutesHubAnalytics$TransportCardStatus.Advertisement;
        }
        w511.b();
        return null;
    }

    public static final ArrayList f(List list) {
        List<qa11> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (qa11 qa11Var : list2) {
            arrayList.add(gw00.e(new Pair(qa11Var.a, Boolean.valueOf(qa11Var.d))));
        }
        return arrayList;
    }

    public static boolean g(s4r0 s4r0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof od91) {
            collection = ((od91) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= s4r0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= s4r0Var.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = s4r0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
