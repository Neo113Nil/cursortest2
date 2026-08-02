package com.yandex.go.scooters.offers.v2.data;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.scooters.domain.model.ScootersEmptyParkingException;
import defpackage.byx;
import defpackage.c430;
import defpackage.d8c;
import defpackage.ffx;
import defpackage.j8c;
import defpackage.jst;
import defpackage.l4o0;
import defpackage.ny61;
import defpackage.qf5;
import defpackage.r7p0;
import defpackage.tbn0;
import defpackage.tcc;
import defpackage.un0;
import defpackage.xby;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.layers.source.d;

/* loaded from: classes13.dex */
public final class b {
    public final d a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public r7p0 c;

    public b(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(l4o0 l4o0Var, ContinuationImpl continuationImpl) {
        ScootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1 scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1;
        int i;
        j8c j8cVar;
        if (continuationImpl instanceof ScootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1) {
            scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1 = (ScootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1) continuationImpl;
            int i2 = scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.serialization.json.b bVar = l4o0Var.f;
                    byx byxVar = new byx(Screen.DISCOVERY, new c430(Mode.SCOOTERS, bVar, (un0) null), byx.d);
                    scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.L$0 = null;
                    scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.L$1 = null;
                    scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.label = 1;
                    obj = this.a.c(byxVar, scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1);
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
                j8cVar = (j8c) obj;
                if (!j8cVar.c.isEmpty()) {
                    ScootersEmptyParkingException scootersEmptyParkingException = new ScootersEmptyParkingException();
                    xby.l(jst.e, "Scooters.Offer: empty parking", null, scootersEmptyParkingException, "Scooters Offer loading is failed because of an empty parking", 2);
                    throw scootersEmptyParkingException;
                }
                FormattedText formattedText = j8cVar.a;
                List<d8c> list = j8cVar.c;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (d8c d8cVar : list) {
                    r7p0 r7p0Var = new r7p0(d8cVar.e, d8cVar.f);
                    String str = d8cVar.b;
                    qf5 qf5Var = d8cVar.i;
                    arrayList.add(new tbn0(r7p0Var, qf5Var.a, qf5Var.c, str, qf5Var.b));
                }
                return new Pair(formattedText, arrayList);
            }
        }
        scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1 = new ScootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1(this, continuationImpl);
        Object obj2 = scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersVehiclesOnParkingRepository$loadVehiclesFromCluster$1.label;
        if (i != 0) {
        }
        j8cVar = (j8c) obj2;
        if (!j8cVar.c.isEmpty()) {
        }
    }
}
