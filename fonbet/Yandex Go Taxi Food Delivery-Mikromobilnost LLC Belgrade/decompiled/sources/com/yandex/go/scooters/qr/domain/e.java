package com.yandex.go.scooters.qr.domain;

import android.net.Uri;
import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import defpackage.ero0;
import defpackage.fro0;
import defpackage.gro0;
import defpackage.ny61;
import defpackage.r7p0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes13.dex */
public final class e {
    public final q a;
    public final com.yandex.go.scooters.qr.unavailable_scooter.data.a b;

    public e(q qVar, com.yandex.go.scooters.qr.unavailable_scooter.data.a aVar) {
        this.a = qVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, ContinuationImpl continuationImpl) {
        ScootersQrUrlInteractor$findAnyNumber$1 scootersQrUrlInteractor$findAnyNumber$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersQrUrlInteractor$findAnyNumber$1) {
            scootersQrUrlInteractor$findAnyNumber$1 = (ScootersQrUrlInteractor$findAnyNumber$1) continuationImpl;
            int i2 = scootersQrUrlInteractor$findAnyNumber$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrUrlInteractor$findAnyNumber$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersQrUrlInteractor$findAnyNumber$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrUrlInteractor$findAnyNumber$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersQrUrlInteractor$findAnyNumber$1.L$0 = uri;
                    scootersQrUrlInteractor$findAnyNumber$1.label = 1;
                    obj = b(uri, scootersQrUrlInteractor$findAnyNumber$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        r7p0 r7p0Var = (r7p0) obj;
                        return r7p0Var != null ? new ero0(r7p0Var) : gro0.a;
                    }
                    uri = (Uri) scootersQrUrlInteractor$findAnyNumber$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return fro0.a;
                }
                scootersQrUrlInteractor$findAnyNumber$1.L$0 = null;
                scootersQrUrlInteractor$findAnyNumber$1.label = 2;
                obj = this.a.c(uri, scootersQrUrlInteractor$findAnyNumber$1);
            }
        }
        scootersQrUrlInteractor$findAnyNumber$1 = new ScootersQrUrlInteractor$findAnyNumber$1(this, continuationImpl);
        obj = scootersQrUrlInteractor$findAnyNumber$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrUrlInteractor$findAnyNumber$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri uri, ContinuationImpl continuationImpl) {
        ScootersQrUrlInteractor$isAlienScooter$1 scootersQrUrlInteractor$isAlienScooter$1;
        int i;
        if (continuationImpl instanceof ScootersQrUrlInteractor$isAlienScooter$1) {
            scootersQrUrlInteractor$isAlienScooter$1 = (ScootersQrUrlInteractor$isAlienScooter$1) continuationImpl;
            int i2 = scootersQrUrlInteractor$isAlienScooter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrUrlInteractor$isAlienScooter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersQrUrlInteractor$isAlienScooter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrUrlInteractor$isAlienScooter$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersQrUrlInteractor$isAlienScooter$1.L$0 = uri;
                    scootersQrUrlInteractor$isAlienScooter$1.label = 1;
                    obj = this.b.a.b(scootersQrUrlInteractor$isAlienScooter$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) scootersQrUrlInteractor$isAlienScooter$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(kotlin.collections.a.G(((ScootersQrUnavailableScooterExperiment) obj).d, uri.getHost()));
            }
        }
        scootersQrUrlInteractor$isAlienScooter$1 = new ScootersQrUrlInteractor$isAlienScooter$1(this, continuationImpl);
        Object obj2 = scootersQrUrlInteractor$isAlienScooter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrUrlInteractor$isAlienScooter$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(kotlin.collections.a.G(((ScootersQrUnavailableScooterExperiment) obj2).d, uri.getHost()));
    }
}
