package com.yandex.go.navigator.driving.speaker;

import defpackage.dz31;
import defpackage.mdh;
import defpackage.my31;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zy11;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final wnt b;
    public final my31 c;
    public final com.yandex.go.navigator.settings.network.repository.a d;
    public final dz31 e;
    public volatile Map f;

    public a(tt2 tt2Var, wnt wntVar, my31 my31Var, com.yandex.go.navigator.settings.network.repository.a aVar, dz31 dz31Var) {
        this.a = tt2Var;
        this.b = wntVar;
        this.c = my31Var;
        this.d = aVar;
        this.e = dz31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        DurationDownloadManager$parseDuration$1 durationDownloadManager$parseDuration$1;
        int i;
        aVar.getClass();
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof DurationDownloadManager$parseDuration$1) {
            durationDownloadManager$parseDuration$1 = (DurationDownloadManager$parseDuration$1) continuationImpl;
            int i2 = durationDownloadManager$parseDuration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                durationDownloadManager$parseDuration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = durationDownloadManager$parseDuration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = durationDownloadManager$parseDuration$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (aVar.f == null) {
                    aVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    DurationDownloadManager$parseDuration$2 durationDownloadManager$parseDuration$2 = new DurationDownloadManager$parseDuration$2(aVar, null);
                    durationDownloadManager$parseDuration$1.label = 1;
                    if (tje.k0(sjhVar, durationDownloadManager$parseDuration$2, durationDownloadManager$parseDuration$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        durationDownloadManager$parseDuration$1 = new DurationDownloadManager$parseDuration$1(aVar, continuationImpl);
        Object obj2 = durationDownloadManager$parseDuration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = durationDownloadManager$parseDuration$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        DurationDownloadManager$downloadDuration$1 durationDownloadManager$downloadDuration$1;
        int i;
        if (continuationImpl instanceof DurationDownloadManager$downloadDuration$1) {
            durationDownloadManager$downloadDuration$1 = (DurationDownloadManager$downloadDuration$1) continuationImpl;
            int i2 = durationDownloadManager$downloadDuration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                durationDownloadManager$downloadDuration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = durationDownloadManager$downloadDuration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = durationDownloadManager$downloadDuration$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    DurationDownloadManager$downloadDuration$2 durationDownloadManager$downloadDuration$2 = new DurationDownloadManager$downloadDuration$2(this, str, null);
                    durationDownloadManager$downloadDuration$1.L$0 = null;
                    durationDownloadManager$downloadDuration$1.label = 1;
                    obj = tje.k0(mdhVar, durationDownloadManager$downloadDuration$2, durationDownloadManager$downloadDuration$1);
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
                return ((Result) obj).getValue();
            }
        }
        durationDownloadManager$downloadDuration$1 = new DurationDownloadManager$downloadDuration$1(this, continuationImpl);
        Object obj2 = durationDownloadManager$downloadDuration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = durationDownloadManager$downloadDuration$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
