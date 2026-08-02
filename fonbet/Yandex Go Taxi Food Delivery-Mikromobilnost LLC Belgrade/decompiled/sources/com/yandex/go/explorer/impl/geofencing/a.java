package com.yandex.go.explorer.impl.geofencing;

import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.location.Location;
import com.google.android.gms.internal.identity.b;
import com.google.android.gms.internal.identity.zzek;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import com.uber.h3core.util.LatLng;
import com.yandex.go.explorer.impl.data.repositories.c;
import com.yandex.go.explorer.impl.experiments.ExplorerExperiment;
import com.yandex.go.explorer.impl.experiments.g;
import com.yandex.mapkit.geometry.Point;
import defpackage.avu0;
import defpackage.duo;
import defpackage.i3y;
import defpackage.ito;
import defpackage.jst;
import defpackage.lwt;
import defpackage.ny61;
import defpackage.scc;
import defpackage.t1b0;
import defpackage.tcc;
import defpackage.uzs;
import defpackage.vto;
import defpackage.wx60;
import defpackage.xto;
import defpackage.ysx0;
import defpackage.yto;
import defpackage.yuo;
import defpackage.zgl;
import defpackage.zsx0;
import defpackage.zto;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final c a;
    public final com.yandex.go.explorer.impl.data.repositories.a b;
    public final vto c;
    public final g d;
    public final yuo e;
    public final zto f;
    public final AtomicReference g;

    public a(c cVar, com.yandex.go.explorer.impl.data.repositories.a aVar, vto vtoVar, g gVar, duo duoVar, yuo yuoVar, zto ztoVar) {
        String string;
        Double i;
        Double i2;
        this.a = cVar;
        this.b = aVar;
        this.c = vtoVar;
        this.d = gVar;
        this.e = yuoVar;
        this.f = ztoVar;
        SharedPreferences sharedPreferences = ztoVar.a;
        long j = sharedPreferences.getLong("last_time", 0L);
        yto ytoVar = null;
        if (j > 0 && (string = sharedPreferences.getString("last_lat", null)) != null && (i = avu0.i(string)) != null) {
            double doubleValue = i.doubleValue();
            String string2 = sharedPreferences.getString("last_lng", null);
            if (string2 != null && (i2 = avu0.i(string2)) != null) {
                ytoVar = new yto(doubleValue, i2.doubleValue(), j);
            }
        }
        this.g = new AtomicReference(ytoVar);
    }

    public final List a(yto ytoVar, Location location, boolean z, int i) {
        i3y i3yVar = xto.a;
        zzs.Companion.getClass();
        zzs b = uzs.b(location);
        ito itoVar = new ito(xto.c().e(b.a, b.b), System.currentTimeMillis() / 1000, false, z);
        if (ytoVar == null || ru.yandex.taxi.map.utils.a.i(ytoVar.a, ytoVar.b, location.getLatitude(), location.getLongitude()) > i) {
            return Collections.singletonList(itoVar);
        }
        double d = ytoVar.a;
        double d2 = ytoVar.b;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        List list = EmptyList.a;
        try {
            long e = xto.c().e(d, d2);
            long e2 = xto.c().e(latitude, longitude);
            if (e == e2) {
                list = Collections.singletonList(Long.valueOf(e));
            } else {
                ArrayList d3 = xto.c().d(e, e2);
                if (d3.size() <= 64) {
                    list = d3;
                }
            }
        } catch (Throwable unused) {
        }
        if (list.size() <= 1) {
            return Collections.singletonList(itoVar);
        }
        long j = ytoVar.c;
        long j2 = itoVar.b - j;
        long j3 = j2 < 0 ? 0L : j2;
        int size = list.size() - 1;
        List subList = list.subList(1, size);
        ArrayList arrayList = new ArrayList(tcc.n(subList, 10));
        int i2 = 0;
        for (Object obj : subList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            i2 = i3;
            arrayList.add(new ito(((Number) obj).longValue(), j + ((long) (j3 * (i3 / size))), false, z));
        }
        return kotlin.collections.a.o0(arrayList, itoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ea, code lost:
    
        if (r4 == r3) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ef A[Catch: Exception -> 0x0260, CancellationException -> 0x030c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0260, blocks: (B:55:0x01e7, B:58:0x01ef, B:106:0x01d2), top: B:105:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x024c -> B:53:0x024e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Location location, ContinuationImpl continuationImpl) {
        ExplorerGeofenceTransitionHandler$processNewLocation$1 explorerGeofenceTransitionHandler$processNewLocation$1;
        int i;
        Location location2;
        Object c;
        Location location3;
        ExplorerExperiment.GeofenceParams geofenceParams;
        float speed;
        int i2;
        boolean booleanValue;
        zy11 zy11Var;
        List list;
        Iterator it;
        vto vtoVar;
        zy11 zy11Var2;
        ExplorerExperiment.GeofenceParams geofenceParams2;
        Location location4;
        boolean hasNext;
        ExplorerExperiment.GeofenceParams geofenceParams3;
        Location location5;
        boolean z;
        int i3;
        float f;
        int i4;
        ExplorerGeofenceTransitionHandler$processNewLocation$1 explorerGeofenceTransitionHandler$processNewLocation$12;
        Location location6;
        com.yandex.go.explorer.impl.data.repositories.a aVar;
        Object failure;
        Throwable a;
        try {
            if (continuationImpl instanceof ExplorerGeofenceTransitionHandler$processNewLocation$1) {
                explorerGeofenceTransitionHandler$processNewLocation$1 = (ExplorerGeofenceTransitionHandler$processNewLocation$1) continuationImpl;
                int i5 = explorerGeofenceTransitionHandler$processNewLocation$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    explorerGeofenceTransitionHandler$processNewLocation$1.label = i5 - Integer.MIN_VALUE;
                    Object obj = explorerGeofenceTransitionHandler$processNewLocation$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = explorerGeofenceTransitionHandler$processNewLocation$1.label;
                    final vto vtoVar2 = this.c;
                    zy11 zy11Var3 = zy11.a;
                    int i6 = 1;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        location2 = location;
                        explorerGeofenceTransitionHandler$processNewLocation$1.L$0 = location2;
                        explorerGeofenceTransitionHandler$processNewLocation$1.label = 1;
                        c = c(explorerGeofenceTransitionHandler$processNewLocation$1);
                    } else if (i == 1) {
                        Location location7 = (Location) explorerGeofenceTransitionHandler$processNewLocation$1.L$0;
                        kotlin.b.b(obj);
                        c = obj;
                        location2 = location7;
                    } else if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                geofenceParams2 = (ExplorerExperiment.GeofenceParams) explorerGeofenceTransitionHandler$processNewLocation$1.L$1;
                                location4 = (Location) explorerGeofenceTransitionHandler$processNewLocation$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    vtoVar = vtoVar2;
                                    zy11Var2 = zy11Var3;
                                    failure = zy11Var2;
                                } catch (Exception e) {
                                    e = e;
                                    vtoVar = vtoVar2;
                                }
                                a = Result.a(failure);
                                if (a != null) {
                                    jst.e.k(a, "ExplorerGeofenceTransitionHandler processNewLocation: persistence failed");
                                }
                                final double latitude = location4.getLatitude();
                                final double longitude = location4.getLongitude();
                                final int i7 = geofenceParams2.a;
                                if (!vtoVar.a()) {
                                    return zy11Var2;
                                }
                                final vto vtoVar3 = vtoVar;
                                lwt lwtVar = vtoVar3.b;
                                PendingIntent pendingIntent = (PendingIntent) vtoVar3.c.getValue();
                                lwtVar.getClass();
                                ysx0 a2 = zsx0.a();
                                a2.a = new com.google.android.gms.internal.identity.a(1, pendingIntent);
                                a2.d = 2425;
                                lwtVar.d(1, a2.a()).b(new wx60() { // from class: uto
                                    @Override // defpackage.wx60
                                    public final void onComplete(Task task) {
                                        vto vtoVar4 = vto.this;
                                        if (vtoVar4.a()) {
                                            n2t n2tVar = new n2t();
                                            n2tVar.a = "explorer_geofence";
                                            float f2 = i7;
                                            double d = latitude;
                                            int i8 = 1;
                                            boolean z2 = d >= -90.0d && d <= 90.0d;
                                            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18);
                                            sb.append("Invalid latitude: ");
                                            sb.append(d);
                                            cvw.d(sb.toString(), z2);
                                            double d2 = longitude;
                                            boolean z3 = d2 >= -180.0d && d2 <= 180.0d;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 19);
                                            sb2.append("Invalid longitude: ");
                                            sb2.append(d2);
                                            cvw.d(sb2.toString(), z3);
                                            boolean z4 = f2 > 0.0f;
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(f2).length() + 16);
                                            sb3.append("Invalid radius: ");
                                            sb3.append(f2);
                                            cvw.d(sb3.toString(), z4);
                                            n2tVar.d = d;
                                            n2tVar.e = d2;
                                            n2tVar.f = f2;
                                            n2tVar.c = -1L;
                                            n2tVar.b = 2;
                                            if (n2tVar.a == null) {
                                                ny61.g("Request ID not set.");
                                                return;
                                            }
                                            zzek zzekVar = new zzek(n2tVar.a, n2tVar.b, (short) 1, n2tVar.d, n2tVar.e, n2tVar.f, n2tVar.c, 0, -1);
                                            GeofencingRequest.a aVar2 = new GeofencingRequest.a();
                                            aVar2.b = 2;
                                            ArrayList arrayList = aVar2.a;
                                            arrayList.add(zzekVar);
                                            cvw.d("No geofence has been added to this request.", !arrayList.isEmpty());
                                            GeofencingRequest geofencingRequest = new GeofencingRequest(new ArrayList(arrayList), aVar2.b, null);
                                            lwt lwtVar2 = vtoVar4.b;
                                            PendingIntent pendingIntent2 = (PendingIntent) vtoVar4.c.getValue();
                                            lwtVar2.getClass();
                                            ysx0 a3 = zsx0.a();
                                            a3.a = new b(geofencingRequest, pendingIntent2, i8);
                                            a3.d = 2424;
                                            lwtVar2.d(1, a3.a()).d(new zgl(24));
                                        }
                                    }
                                });
                                return zy11Var2;
                            }
                            z = explorerGeofenceTransitionHandler$processNewLocation$1.Z$0;
                            i3 = explorerGeofenceTransitionHandler$processNewLocation$1.I$0;
                            f = explorerGeofenceTransitionHandler$processNewLocation$1.F$0;
                            list = (List) explorerGeofenceTransitionHandler$processNewLocation$1.L$3;
                            geofenceParams3 = (ExplorerExperiment.GeofenceParams) explorerGeofenceTransitionHandler$processNewLocation$1.L$1;
                            location5 = (Location) explorerGeofenceTransitionHandler$processNewLocation$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                vtoVar = vtoVar2;
                                zy11Var2 = zy11Var3;
                                try {
                                    aVar = this.b;
                                    explorerGeofenceTransitionHandler$processNewLocation$1.L$0 = location5;
                                    explorerGeofenceTransitionHandler$processNewLocation$1.L$1 = geofenceParams3;
                                    explorerGeofenceTransitionHandler$processNewLocation$1.L$2 = null;
                                    explorerGeofenceTransitionHandler$processNewLocation$1.L$3 = null;
                                    explorerGeofenceTransitionHandler$processNewLocation$1.F$0 = f;
                                    explorerGeofenceTransitionHandler$processNewLocation$1.I$0 = i3;
                                    explorerGeofenceTransitionHandler$processNewLocation$1.Z$0 = z;
                                    explorerGeofenceTransitionHandler$processNewLocation$1.label = 5;
                                } catch (Exception e2) {
                                    e = e2;
                                    geofenceParams2 = geofenceParams3;
                                    location4 = location5;
                                    failure = new Result.Failure(e);
                                    a = Result.a(failure);
                                    if (a != null) {
                                    }
                                    final double latitude2 = location4.getLatitude();
                                    final double longitude2 = location4.getLongitude();
                                    final int i72 = geofenceParams2.a;
                                    if (!vtoVar.a()) {
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                vtoVar = vtoVar2;
                                zy11Var2 = zy11Var3;
                                geofenceParams2 = geofenceParams3;
                                location4 = location5;
                                failure = new Result.Failure(e);
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                final double latitude22 = location4.getLatitude();
                                final double longitude22 = location4.getLongitude();
                                final int i722 = geofenceParams2.a;
                                if (!vtoVar.a()) {
                                }
                            }
                            if (aVar.a(list, explorerGeofenceTransitionHandler$processNewLocation$1) != obj2) {
                                geofenceParams2 = geofenceParams3;
                                location4 = location5;
                                failure = zy11Var2;
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                final double latitude222 = location4.getLatitude();
                                final double longitude222 = location4.getLongitude();
                                final int i7222 = geofenceParams2.a;
                                if (!vtoVar.a()) {
                                }
                            }
                            return obj2;
                        }
                        boolean z2 = explorerGeofenceTransitionHandler$processNewLocation$1.Z$0;
                        int i8 = explorerGeofenceTransitionHandler$processNewLocation$1.I$0;
                        float f2 = explorerGeofenceTransitionHandler$processNewLocation$1.F$0;
                        Iterator it2 = (Iterator) explorerGeofenceTransitionHandler$processNewLocation$1.L$5;
                        List list2 = (List) explorerGeofenceTransitionHandler$processNewLocation$1.L$3;
                        ExplorerExperiment.GeofenceParams geofenceParams4 = (ExplorerExperiment.GeofenceParams) explorerGeofenceTransitionHandler$processNewLocation$1.L$1;
                        Location location8 = (Location) explorerGeofenceTransitionHandler$processNewLocation$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            booleanValue = z2;
                            location3 = location8;
                            vtoVar = vtoVar2;
                            geofenceParams = geofenceParams4;
                            i2 = i8;
                            zy11Var2 = zy11Var3;
                            it = it2;
                            list = list2;
                            speed = f2;
                            zy11Var = zy11Var2;
                            vtoVar2 = vtoVar;
                            hasNext = it.hasNext();
                            c cVar = this.a;
                            if (hasNext) {
                                try {
                                    try {
                                        try {
                                            ito itoVar = (ito) it.next();
                                            i3y i3yVar = xto.a;
                                            LatLng b = xto.c().b(itoVar.a);
                                            Point point = new Point(b.a, b.b);
                                            double latitude3 = point.getLatitude();
                                            double longitude3 = point.getLongitude();
                                            long j = itoVar.b;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$0 = location3;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$1 = geofenceParams;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$2 = null;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$3 = list;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$4 = null;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$5 = it;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$6 = null;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$7 = null;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.L$8 = null;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.F$0 = speed;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.I$0 = i4;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.Z$0 = booleanValue;
                                            explorerGeofenceTransitionHandler$processNewLocation$1.label = 3;
                                            location3 = location6;
                                            if (cVar.b(location6, latitude3, longitude3, j, explorerGeofenceTransitionHandler$processNewLocation$12) != obj2) {
                                                explorerGeofenceTransitionHandler$processNewLocation$1 = explorerGeofenceTransitionHandler$processNewLocation$12;
                                                i2 = i4;
                                                zy11Var = zy11Var2;
                                                vtoVar2 = vtoVar;
                                                hasNext = it.hasNext();
                                                c cVar2 = this.a;
                                                if (hasNext) {
                                                    vtoVar = vtoVar2;
                                                    zy11Var2 = zy11Var;
                                                    ExplorerGeofenceTransitionHandler$processNewLocation$1 explorerGeofenceTransitionHandler$processNewLocation$13 = explorerGeofenceTransitionHandler$processNewLocation$1;
                                                    int i9 = i2;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$0 = location3;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$1 = geofenceParams;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$2 = null;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$3 = list;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$4 = null;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$5 = null;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$6 = null;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$7 = null;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.L$8 = null;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.F$0 = speed;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.I$0 = i9;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.Z$0 = booleanValue;
                                                    explorerGeofenceTransitionHandler$processNewLocation$13.label = 4;
                                                    if (cVar2.a(location3, explorerGeofenceTransitionHandler$processNewLocation$13) != obj2) {
                                                        geofenceParams3 = geofenceParams;
                                                        location5 = location3;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1 = explorerGeofenceTransitionHandler$processNewLocation$13;
                                                        z = booleanValue;
                                                        i3 = i9;
                                                        f = speed;
                                                        aVar = this.b;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1.L$0 = location5;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1.L$1 = geofenceParams3;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1.L$2 = null;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1.L$3 = null;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1.F$0 = f;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1.I$0 = i3;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1.Z$0 = z;
                                                        explorerGeofenceTransitionHandler$processNewLocation$1.label = 5;
                                                        if (aVar.a(list, explorerGeofenceTransitionHandler$processNewLocation$1) != obj2) {
                                                        }
                                                    }
                                                }
                                            }
                                            return obj2;
                                        } catch (Exception e4) {
                                            e = e4;
                                            vtoVar = vtoVar2;
                                        }
                                        zy11Var2 = zy11Var;
                                    } catch (Exception e5) {
                                        e = e5;
                                    }
                                    vtoVar = vtoVar2;
                                    i4 = i2;
                                } catch (Exception e6) {
                                    e = e6;
                                    location3 = location6;
                                    geofenceParams2 = geofenceParams;
                                    location4 = location3;
                                    failure = new Result.Failure(e);
                                    a = Result.a(failure);
                                    if (a != null) {
                                    }
                                    final double latitude2222 = location4.getLatitude();
                                    final double longitude2222 = location4.getLongitude();
                                    final int i72222 = geofenceParams2.a;
                                    if (!vtoVar.a()) {
                                    }
                                }
                                explorerGeofenceTransitionHandler$processNewLocation$12 = explorerGeofenceTransitionHandler$processNewLocation$1;
                                location6 = location3;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            vtoVar = vtoVar2;
                            geofenceParams2 = geofenceParams4;
                            location4 = location8;
                        }
                        zy11Var2 = zy11Var3;
                        failure = new Result.Failure(e);
                        a = Result.a(failure);
                        if (a != null) {
                        }
                        final double latitude22222 = location4.getLatitude();
                        final double longitude22222 = location4.getLongitude();
                        final int i722222 = geofenceParams2.a;
                        if (!vtoVar.a()) {
                        }
                    } else {
                        location3 = (Location) explorerGeofenceTransitionHandler$processNewLocation$1.L$0;
                        kotlin.b.b(obj);
                        geofenceParams = ((ExplorerExperiment) obj).f;
                        speed = !location3.hasSpeed() ? location3.getSpeed() : 0.0f;
                        i2 = 3.6f * speed <= ((float) geofenceParams.d) ? 1 : 0;
                        if (i2 == 0) {
                            final double latitude4 = location3.getLatitude();
                            final double longitude4 = location3.getLongitude();
                            final int i10 = geofenceParams.a;
                            if (vtoVar2.a()) {
                                lwt lwtVar2 = vtoVar2.b;
                                PendingIntent pendingIntent2 = (PendingIntent) vtoVar2.c.getValue();
                                lwtVar2.getClass();
                                ysx0 a3 = zsx0.a();
                                a3.a = new com.google.android.gms.internal.identity.a(i6, pendingIntent2);
                                a3.d = 2425;
                                lwtVar2.d(1, a3.a()).b(new wx60() { // from class: uto
                                    @Override // defpackage.wx60
                                    public final void onComplete(Task task) {
                                        vto vtoVar4 = vto.this;
                                        if (vtoVar4.a()) {
                                            n2t n2tVar = new n2t();
                                            n2tVar.a = "explorer_geofence";
                                            float f22 = i10;
                                            double d = latitude4;
                                            int i82 = 1;
                                            boolean z22 = d >= -90.0d && d <= 90.0d;
                                            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18);
                                            sb.append("Invalid latitude: ");
                                            sb.append(d);
                                            cvw.d(sb.toString(), z22);
                                            double d2 = longitude4;
                                            boolean z3 = d2 >= -180.0d && d2 <= 180.0d;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 19);
                                            sb2.append("Invalid longitude: ");
                                            sb2.append(d2);
                                            cvw.d(sb2.toString(), z3);
                                            boolean z4 = f22 > 0.0f;
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(f22).length() + 16);
                                            sb3.append("Invalid radius: ");
                                            sb3.append(f22);
                                            cvw.d(sb3.toString(), z4);
                                            n2tVar.d = d;
                                            n2tVar.e = d2;
                                            n2tVar.f = f22;
                                            n2tVar.c = -1L;
                                            n2tVar.b = 2;
                                            if (n2tVar.a == null) {
                                                ny61.g("Request ID not set.");
                                                return;
                                            }
                                            zzek zzekVar = new zzek(n2tVar.a, n2tVar.b, (short) 1, n2tVar.d, n2tVar.e, n2tVar.f, n2tVar.c, 0, -1);
                                            GeofencingRequest.a aVar2 = new GeofencingRequest.a();
                                            aVar2.b = 2;
                                            ArrayList arrayList = aVar2.a;
                                            arrayList.add(zzekVar);
                                            cvw.d("No geofence has been added to this request.", !arrayList.isEmpty());
                                            GeofencingRequest geofencingRequest = new GeofencingRequest(new ArrayList(arrayList), aVar2.b, null);
                                            lwt lwtVar22 = vtoVar4.b;
                                            PendingIntent pendingIntent22 = (PendingIntent) vtoVar4.c.getValue();
                                            lwtVar22.getClass();
                                            ysx0 a32 = zsx0.a();
                                            a32.a = new b(geofencingRequest, pendingIntent22, i82);
                                            a32.d = 2424;
                                            lwtVar22.d(1, a32.a()).d(new zgl(24));
                                        }
                                    }
                                });
                                return zy11Var3;
                            }
                            return zy11Var3;
                        }
                        booleanValue = ((Boolean) this.e.a.getValue()).booleanValue();
                        yto ytoVar = (yto) this.g.getAndSet(new yto(location3.getLatitude(), location3.getLongitude(), location3.getTime() / 1000));
                        SharedPreferences.Editor edit = this.f.a.edit();
                        zy11Var = zy11Var3;
                        edit.putString("last_lat", String.valueOf(location3.getLatitude())).putString("last_lng", String.valueOf(location3.getLongitude())).putLong("last_time", location3.getTime() / 1000);
                        edit.apply();
                        try {
                            List a4 = a(ytoVar, location3, booleanValue, geofenceParams.e);
                            list = a4;
                            it = kotlin.collections.a.K(a4).iterator();
                            hasNext = it.hasNext();
                            c cVar22 = this.a;
                            if (hasNext) {
                            }
                        } catch (Exception e8) {
                            e = e8;
                            vtoVar = vtoVar2;
                            zy11Var2 = zy11Var;
                            geofenceParams2 = geofenceParams;
                            location4 = location3;
                            failure = new Result.Failure(e);
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            final double latitude222222 = location4.getLatitude();
                            final double longitude222222 = location4.getLongitude();
                            final int i7222222 = geofenceParams2.a;
                            if (!vtoVar.a()) {
                            }
                        }
                    }
                    if (!((Boolean) c).booleanValue()) {
                        explorerGeofenceTransitionHandler$processNewLocation$1.L$0 = location2;
                        explorerGeofenceTransitionHandler$processNewLocation$1.label = 2;
                        Object b2 = ((t1b0) this.d.b.getValue()).b(explorerGeofenceTransitionHandler$processNewLocation$1);
                        if (b2 != obj2) {
                            location3 = location2;
                            obj = b2;
                            geofenceParams = ((ExplorerExperiment) obj).f;
                            if (!location3.hasSpeed()) {
                            }
                            if (3.6f * speed <= ((float) geofenceParams.d)) {
                            }
                            if (i2 == 0) {
                            }
                        }
                        return obj2;
                    }
                    return zy11Var3;
                }
            }
            if (i != 0) {
            }
            if (!((Boolean) c).booleanValue()) {
            }
            return zy11Var3;
        } catch (CancellationException e9) {
            throw e9;
        }
        explorerGeofenceTransitionHandler$processNewLocation$1 = new ExplorerGeofenceTransitionHandler$processNewLocation$1(this, continuationImpl);
        Object obj3 = explorerGeofenceTransitionHandler$processNewLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerGeofenceTransitionHandler$processNewLocation$1.label;
        final vto vtoVar22 = this.c;
        zy11 zy11Var32 = zy11.a;
        int i62 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ExplorerGeofenceTransitionHandler$stopTrackingIfInactive$1 explorerGeofenceTransitionHandler$stopTrackingIfInactive$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ExplorerGeofenceTransitionHandler$stopTrackingIfInactive$1) {
            explorerGeofenceTransitionHandler$stopTrackingIfInactive$1 = (ExplorerGeofenceTransitionHandler$stopTrackingIfInactive$1) continuationImpl;
            int i2 = explorerGeofenceTransitionHandler$stopTrackingIfInactive$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerGeofenceTransitionHandler$stopTrackingIfInactive$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerGeofenceTransitionHandler$stopTrackingIfInactive$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerGeofenceTransitionHandler$stopTrackingIfInactive$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    explorerGeofenceTransitionHandler$stopTrackingIfInactive$1.label = 1;
                    obj = this.d.b(explorerGeofenceTransitionHandler$stopTrackingIfInactive$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                vto vtoVar = this.c;
                z = !booleanValue && vtoVar.a();
                if (!z) {
                    lwt lwtVar = vtoVar.b;
                    PendingIntent pendingIntent = (PendingIntent) vtoVar.c.getValue();
                    lwtVar.getClass();
                    ysx0 a = zsx0.a();
                    a.a = new com.google.android.gms.internal.identity.a(i3, pendingIntent);
                    a.d = 2425;
                    lwtVar.d(1, a.a()).d(new zgl(23));
                }
                return Boolean.valueOf(!z);
            }
        }
        explorerGeofenceTransitionHandler$stopTrackingIfInactive$1 = new ExplorerGeofenceTransitionHandler$stopTrackingIfInactive$1(this, continuationImpl);
        Object obj2 = explorerGeofenceTransitionHandler$stopTrackingIfInactive$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerGeofenceTransitionHandler$stopTrackingIfInactive$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        vto vtoVar2 = this.c;
        if (booleanValue2) {
        }
        if (!z) {
        }
        return Boolean.valueOf(!z);
    }
}
