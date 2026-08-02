package com.yandex.go.places.impl.data.repositories.map.layer;

import android.os.SystemClock;
import com.yandex.go.places.impl.data.entities.network.organizations.layer.PlacesOrganizationsLayerRequestParams;
import com.yandex.go.places.impl.data.entities.network.organizations.layer.PlacesOrganizationsLayerResponse;
import com.yandex.go.places.impl.data.entities.network.organizations.layer.PlacesOrganizationsLayerStateRequestParam;
import com.yandex.go.places.map.data.repositories.i;
import defpackage.bl80;
import defpackage.cmt;
import defpackage.kk80;
import defpackage.kn00;
import defpackage.lg80;
import defpackage.m810;
import defpackage.mk80;
import defpackage.nfc0;
import defpackage.ny61;
import defpackage.qfc0;
import defpackage.uc4;
import defpackage.zzs;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final bl80 a;
    public final com.yandex.go.places.map.data.mappers.a b;
    public final i c;
    public final qfc0 d;
    public final nfc0 e;

    public a(bl80 bl80Var, com.yandex.go.places.map.data.mappers.a aVar, i iVar, qfc0 qfc0Var, nfc0 nfc0Var) {
        this.a = bl80Var;
        this.b = aVar;
        this.c = iVar;
        this.d = qfc0Var;
        this.e = nfc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0148 A[Catch: all -> 0x017b, CancellationException -> 0x0182, TryCatch #2 {CancellationException -> 0x0182, all -> 0x017b, blocks: (B:13:0x0054, B:14:0x0170, B:21:0x0081, B:23:0x013b, B:25:0x0148, B:26:0x014e, B:32:0x00a9, B:33:0x0107, B:38:0x00b0, B:40:0x00b4, B:41:0x00c4, B:43:0x00ca, B:45:0x00d8), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, String str, uc4 uc4Var, Float f, boolean z, lg80 lg80Var, String str2, ContinuationImpl continuationImpl) {
        PlacesOrganizationsLayerRepository$loadLayer$1 placesOrganizationsLayerRepository$loadLayer$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z2;
        Object o;
        PlacesOrganizationsLayerResponse placesOrganizationsLayerResponse;
        boolean z3;
        List list;
        i iVar;
        List list2;
        try {
            if (continuationImpl instanceof PlacesOrganizationsLayerRepository$loadLayer$1) {
                placesOrganizationsLayerRepository$loadLayer$1 = (PlacesOrganizationsLayerRepository$loadLayer$1) continuationImpl;
                int i2 = placesOrganizationsLayerRepository$loadLayer$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    placesOrganizationsLayerRepository$loadLayer$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = placesOrganizationsLayerRepository$loadLayer$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = placesOrganizationsLayerRepository$loadLayer$1.label;
                    qfc0 qfc0Var = this.d;
                    if (i != 0) {
                        b.b(obj);
                        cmt<PlacesOrganizationsLayerResponse> a = this.a.a().a(new PlacesOrganizationsLayerRequestParams(str, new PlacesOrganizationsLayerStateRequestParam(zzsVar, uc4Var, f != null ? new Integer(m810.b(f.floatValue())) : null, Boolean.valueOf(z), lg80Var != null ? lg80Var.b() : null, str2)));
                        placesOrganizationsLayerRepository$loadLayer$1.L$0 = null;
                        placesOrganizationsLayerRepository$loadLayer$1.L$1 = null;
                        placesOrganizationsLayerRepository$loadLayer$1.L$2 = null;
                        placesOrganizationsLayerRepository$loadLayer$1.L$3 = null;
                        placesOrganizationsLayerRepository$loadLayer$1.L$4 = null;
                        placesOrganizationsLayerRepository$loadLayer$1.L$5 = null;
                        placesOrganizationsLayerRepository$loadLayer$1.L$6 = null;
                        z2 = z;
                        placesOrganizationsLayerRepository$loadLayer$1.Z$0 = z2;
                        placesOrganizationsLayerRepository$loadLayer$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(a, placesOrganizationsLayerRepository$loadLayer$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                list2 = (List) placesOrganizationsLayerRepository$loadLayer$1.L$8;
                                placesOrganizationsLayerResponse = (PlacesOrganizationsLayerResponse) placesOrganizationsLayerRepository$loadLayer$1.L$6;
                                b.b(obj);
                                this.e.b(list2);
                                return new kk80(placesOrganizationsLayerResponse);
                            }
                            boolean z4 = placesOrganizationsLayerRepository$loadLayer$1.Z$0;
                            PlacesOrganizationsLayerResponse placesOrganizationsLayerResponse2 = (PlacesOrganizationsLayerResponse) placesOrganizationsLayerRepository$loadLayer$1.L$6;
                            b.b(obj);
                            z3 = z4;
                            placesOrganizationsLayerResponse = placesOrganizationsLayerResponse2;
                            list = (List) obj;
                            qfc0Var.getClass();
                            kn00 kn00Var = (kn00) kotlin.collections.a.R(list);
                            qfc0Var.d = kn00Var == null ? kn00Var.getId() : null;
                            iVar = this.c;
                            placesOrganizationsLayerRepository$loadLayer$1.L$0 = null;
                            placesOrganizationsLayerRepository$loadLayer$1.L$1 = null;
                            placesOrganizationsLayerRepository$loadLayer$1.L$2 = null;
                            placesOrganizationsLayerRepository$loadLayer$1.L$3 = null;
                            placesOrganizationsLayerRepository$loadLayer$1.L$4 = null;
                            placesOrganizationsLayerRepository$loadLayer$1.L$5 = null;
                            placesOrganizationsLayerRepository$loadLayer$1.L$6 = placesOrganizationsLayerResponse;
                            placesOrganizationsLayerRepository$loadLayer$1.L$7 = null;
                            placesOrganizationsLayerRepository$loadLayer$1.L$8 = list;
                            placesOrganizationsLayerRepository$loadLayer$1.Z$0 = z3;
                            placesOrganizationsLayerRepository$loadLayer$1.label = 3;
                            if (iVar.G(list, placesOrganizationsLayerRepository$loadLayer$1) != coroutineSingletons) {
                                list2 = list;
                                this.e.b(list2);
                                return new kk80(placesOrganizationsLayerResponse);
                            }
                            return coroutineSingletons;
                        }
                        z2 = placesOrganizationsLayerRepository$loadLayer$1.Z$0;
                        b.b(obj);
                    }
                    PlacesOrganizationsLayerResponse placesOrganizationsLayerResponse3 = (PlacesOrganizationsLayerResponse) obj;
                    qfc0Var.getClass();
                    qfc0Var.c = Long.valueOf(SystemClock.elapsedRealtime());
                    com.yandex.go.places.map.data.mappers.a aVar = this.b;
                    List list3 = placesOrganizationsLayerResponse3.b;
                    placesOrganizationsLayerRepository$loadLayer$1.L$0 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$1 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$2 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$3 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$4 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$5 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$6 = placesOrganizationsLayerResponse3;
                    placesOrganizationsLayerRepository$loadLayer$1.L$7 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.Z$0 = z2;
                    placesOrganizationsLayerRepository$loadLayer$1.label = 2;
                    o = aVar.o(list3, placesOrganizationsLayerRepository$loadLayer$1);
                    if (o != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    boolean z5 = z2;
                    placesOrganizationsLayerResponse = placesOrganizationsLayerResponse3;
                    obj = o;
                    z3 = z5;
                    list = (List) obj;
                    qfc0Var.getClass();
                    kn00 kn00Var2 = (kn00) kotlin.collections.a.R(list);
                    qfc0Var.d = kn00Var2 == null ? kn00Var2.getId() : null;
                    iVar = this.c;
                    placesOrganizationsLayerRepository$loadLayer$1.L$0 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$1 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$2 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$3 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$4 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$5 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$6 = placesOrganizationsLayerResponse;
                    placesOrganizationsLayerRepository$loadLayer$1.L$7 = null;
                    placesOrganizationsLayerRepository$loadLayer$1.L$8 = list;
                    placesOrganizationsLayerRepository$loadLayer$1.Z$0 = z3;
                    placesOrganizationsLayerRepository$loadLayer$1.label = 3;
                    if (iVar.G(list, placesOrganizationsLayerRepository$loadLayer$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            PlacesOrganizationsLayerResponse placesOrganizationsLayerResponse32 = (PlacesOrganizationsLayerResponse) obj;
            qfc0Var.getClass();
            qfc0Var.c = Long.valueOf(SystemClock.elapsedRealtime());
            com.yandex.go.places.map.data.mappers.a aVar2 = this.b;
            List list32 = placesOrganizationsLayerResponse32.b;
            placesOrganizationsLayerRepository$loadLayer$1.L$0 = null;
            placesOrganizationsLayerRepository$loadLayer$1.L$1 = null;
            placesOrganizationsLayerRepository$loadLayer$1.L$2 = null;
            placesOrganizationsLayerRepository$loadLayer$1.L$3 = null;
            placesOrganizationsLayerRepository$loadLayer$1.L$4 = null;
            placesOrganizationsLayerRepository$loadLayer$1.L$5 = null;
            placesOrganizationsLayerRepository$loadLayer$1.L$6 = placesOrganizationsLayerResponse32;
            placesOrganizationsLayerRepository$loadLayer$1.L$7 = null;
            placesOrganizationsLayerRepository$loadLayer$1.Z$0 = z2;
            placesOrganizationsLayerRepository$loadLayer$1.label = 2;
            o = aVar2.o(list32, placesOrganizationsLayerRepository$loadLayer$1);
            if (o != coroutineSingletons) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new mk80(th);
        }
        placesOrganizationsLayerRepository$loadLayer$1 = new PlacesOrganizationsLayerRepository$loadLayer$1(this, continuationImpl);
        Object obj2 = placesOrganizationsLayerRepository$loadLayer$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesOrganizationsLayerRepository$loadLayer$1.label;
        qfc0 qfc0Var2 = this.d;
    }
}
