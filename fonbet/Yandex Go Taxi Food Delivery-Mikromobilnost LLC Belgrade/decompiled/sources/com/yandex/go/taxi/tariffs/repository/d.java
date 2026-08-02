package com.yandex.go.taxi.tariffs.repository;

import com.yandex.go.taxi.tariffs.data.NearestPositionApi;
import defpackage.al50;
import defpackage.cmt;
import defpackage.dl50;
import defpackage.i3y;
import defpackage.jst;
import defpackage.ny61;
import defpackage.on2;
import defpackage.zn1;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class d {
    public final h a;
    public final i3y b;

    public d(on2 on2Var, h hVar) {
        this.a = hVar;
        this.b = kotlin.a.a(new zn1(on2Var, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, ContinuationImpl continuationImpl) {
        LegacyTariffsRepository$address$1 legacyTariffsRepository$address$1;
        int i;
        try {
            if (continuationImpl instanceof LegacyTariffsRepository$address$1) {
                legacyTariffsRepository$address$1 = (LegacyTariffsRepository$address$1) continuationImpl;
                int i2 = legacyTariffsRepository$address$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    legacyTariffsRepository$address$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = legacyTariffsRepository$address$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = legacyTariffsRepository$address$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<al50> a = ((NearestPositionApi) this.b.getValue()).a(new dl50(zzsVar, this.a.Hg()));
                        legacyTariffsRepository$address$1.L$0 = null;
                        legacyTariffsRepository$address$1.L$1 = null;
                        legacyTariffsRepository$address$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, null, legacyTariffsRepository$address$1);
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
                    return (al50) obj;
                }
            }
            if (i != 0) {
            }
            return (al50) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            jst.e.getClass();
            return null;
        }
        legacyTariffsRepository$address$1 = new LegacyTariffsRepository$address$1(this, continuationImpl);
        Object obj2 = legacyTariffsRepository$address$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = legacyTariffsRepository$address$1.label;
    }
}
