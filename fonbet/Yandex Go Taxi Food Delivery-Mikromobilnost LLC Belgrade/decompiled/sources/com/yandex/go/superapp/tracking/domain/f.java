package com.yandex.go.superapp.tracking.domain;

import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment;
import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.bdc;
import defpackage.c501;
import defpackage.d501;
import defpackage.e501;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.pdc;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f implements d501 {
    public final pdc a;
    public final y b;

    public f(pdc pdcVar, y yVar) {
        this.a = pdcVar;
        this.b = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [kdc] */
    public final e501 a(c501 c501Var, bdc bdcVar, boolean z) {
        String e;
        String g;
        String a;
        TrackingCardStyledColorsInteractorImpl$convertBackgroundColors$2 trackingCardStyledColorsInteractorImpl$convertBackgroundColors$2 = new TrackingCardStyledColorsInteractorImpl$convertBackgroundColors$2(this.a);
        String str = null;
        if (z) {
            if (c501Var != null) {
                e = c501Var.f();
            }
            e = null;
        } else {
            if (c501Var != null) {
                e = c501Var.e();
            }
            e = null;
        }
        kdc kdcVar = (kdc) trackingCardStyledColorsInteractorImpl$convertBackgroundColors$2.invoke(e);
        if (kdcVar == null) {
            kdcVar = bdcVar;
        }
        if (z) {
            if (c501Var != null) {
                g = c501Var.h();
            }
            g = null;
        } else {
            if (c501Var != null) {
                g = c501Var.g();
            }
            g = null;
        }
        kdc kdcVar2 = (kdc) trackingCardStyledColorsInteractorImpl$convertBackgroundColors$2.invoke(g);
        if (kdcVar2 == null) {
            kdcVar2 = bdcVar;
        }
        if (z) {
            if (c501Var != null) {
                a = c501Var.b();
            }
            a = null;
        } else {
            if (c501Var != null) {
                a = c501Var.a();
            }
            a = null;
        }
        kdc kdcVar3 = (kdc) trackingCardStyledColorsInteractorImpl$convertBackgroundColors$2.invoke(a);
        if (kdcVar3 == null) {
            kdcVar3 = bdcVar;
        }
        if (z) {
            if (c501Var != null) {
                str = c501Var.d();
            }
        } else if (c501Var != null) {
            str = c501Var.c();
        }
        ?? r6 = (kdc) trackingCardStyledColorsInteractorImpl$convertBackgroundColors$2.invoke(str);
        if (r6 != 0) {
            bdcVar = r6;
        }
        return new e501(kdcVar, kdcVar2, kdcVar3, bdcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        TrackingCardStyledColorsInteractorImpl$getStyledColors$1 trackingCardStyledColorsInteractorImpl$getStyledColors$1;
        int i;
        if (continuationImpl instanceof TrackingCardStyledColorsInteractorImpl$getStyledColors$1) {
            trackingCardStyledColorsInteractorImpl$getStyledColors$1 = (TrackingCardStyledColorsInteractorImpl$getStyledColors$1) continuationImpl;
            int i2 = trackingCardStyledColorsInteractorImpl$getStyledColors$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCardStyledColorsInteractorImpl$getStyledColors$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingCardStyledColorsInteractorImpl$getStyledColors$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCardStyledColorsInteractorImpl$getStyledColors$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trackingCardStyledColorsInteractorImpl$getStyledColors$1.L$0 = str;
                    trackingCardStyledColorsInteractorImpl$getStyledColors$1.label = 1;
                    obj = this.b.P(str, trackingCardStyledColorsInteractorImpl$getStyledColors$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) trackingCardStyledColorsInteractorImpl$getStyledColors$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.TrackingCardColors trackingCardColors = (SuperappTrackingCardExperiment.TrackingCardColors) obj;
                return trackingCardColors != null ? new c501(str) : new c501(trackingCardColors.getA(), trackingCardColors.getB(), trackingCardColors.getC(), trackingCardColors.getD());
            }
        }
        trackingCardStyledColorsInteractorImpl$getStyledColors$1 = new TrackingCardStyledColorsInteractorImpl$getStyledColors$1(this, continuationImpl);
        Object obj2 = trackingCardStyledColorsInteractorImpl$getStyledColors$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCardStyledColorsInteractorImpl$getStyledColors$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.TrackingCardColors trackingCardColors2 = (SuperappTrackingCardExperiment.TrackingCardColors) obj2;
        if (trackingCardColors2 != null) {
        }
    }
}
