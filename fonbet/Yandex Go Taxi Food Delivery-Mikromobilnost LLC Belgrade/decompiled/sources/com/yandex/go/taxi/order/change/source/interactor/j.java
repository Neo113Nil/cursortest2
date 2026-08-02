package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.api.change.source.interactor.SourcePointChangeReason;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.d6z;
import defpackage.jqr;
import defpackage.jv8;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.rv0;
import defpackage.sb9;
import defpackage.sjh;
import defpackage.tb9;
import defpackage.tg9;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class j implements tg9 {
    public final tt2 a;
    public final ru.yandex.taxi.persuggest.domain.g b;
    public final p2y0 c;
    public final com.yandex.go.taxi.order.change.common.data.d d;
    public final c e;
    public final com.yandex.go.taxi.order.change.source.data.e f;
    public final sb9 g;
    public final e h;
    public final rv0 i;

    public j(tt2 tt2Var, ru.yandex.taxi.persuggest.domain.g gVar, p2y0 p2y0Var, com.yandex.go.taxi.order.change.common.data.d dVar, c cVar, com.yandex.go.taxi.order.change.source.data.e eVar, sb9 sb9Var, e eVar2, rv0 rv0Var) {
        this.a = tt2Var;
        this.b = gVar;
        this.c = p2y0Var;
        this.d = dVar;
        this.e = cVar;
        this.f = eVar;
        this.g = sb9Var;
        this.h = eVar2;
        this.i = rv0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if (r5 == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0161 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, zzs zzsVar, SourcePointChangeReason sourcePointChangeReason, ContinuationImpl continuationImpl) {
        ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1 changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1;
        int i;
        String str3;
        zzs zzsVar2;
        SourcePointChangeReason sourcePointChangeReason2;
        Object p;
        o2y0 o2y0Var;
        String str4;
        zzs zzsVar3;
        o2y0 o2y0Var2;
        SourcePointChangeReason sourcePointChangeReason3;
        ChangeSourcePointExperiment changeSourcePointExperiment;
        o2y0 o2y0Var3;
        ChangeSourcePointExperiment changeSourcePointExperiment2;
        mdh mdhVar;
        ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1 changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1;
        ChangeOrderState$Failure changeOrderState$Failure;
        String str5 = str2;
        try {
            if (continuationImpl instanceof ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1) {
                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1 = (ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1) continuationImpl;
                int i2 = changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1.label = i2 - Integer.MIN_VALUE;
                    ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1 changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12 = changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1;
                    Object obj = changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        str3 = str;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$0 = str3;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$1 = str5;
                        zzsVar2 = zzsVar;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$2 = zzsVar2;
                        sourcePointChangeReason2 = sourcePointChangeReason;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$3 = sourcePointChangeReason2;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.label = 1;
                        p = ((e0) this.c).p(str5, changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12);
                    } else if (i == 1) {
                        SourcePointChangeReason sourcePointChangeReason4 = (SourcePointChangeReason) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$3;
                        zzsVar2 = (zzs) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$2;
                        String str6 = (String) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$1;
                        String str7 = (String) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$0;
                        kotlin.b.b(obj);
                        sourcePointChangeReason2 = sourcePointChangeReason4;
                        str5 = str6;
                        p = obj;
                        str3 = str7;
                    } else {
                        if (i == 2) {
                            o2y0 o2y0Var4 = (o2y0) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$4;
                            SourcePointChangeReason sourcePointChangeReason5 = (SourcePointChangeReason) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$3;
                            zzsVar3 = (zzs) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$2;
                            String str8 = (String) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$1;
                            String str9 = (String) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$0;
                            kotlin.b.b(obj);
                            o2y0Var2 = o2y0Var4;
                            str5 = str8;
                            sourcePointChangeReason3 = sourcePointChangeReason5;
                            str4 = str9;
                            changeSourcePointExperiment = (ChangeSourcePointExperiment) obj;
                            try {
                                this.a.getClass();
                                sjh sjhVar = uyj.a;
                                mdhVar = mdh.b;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1 = new ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1(this, zzsVar3, str4, str5, sourcePointChangeReason3, o2y0Var2, null);
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$0 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$1 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$2 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$3 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$4 = o2y0Var2;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$5 = changeSourcePointExperiment;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.label = 3;
                            } catch (Throwable unused) {
                                o2y0Var3 = o2y0Var2;
                                changeSourcePointExperiment2 = changeSourcePointExperiment;
                                changeOrderState$Failure = new ChangeOrderState$Failure(null, ChangeOrderState$Source.SOURCE_POINT, new OrderChangesDto.Notification((String) null, d6z.Y(changeSourcePointExperiment2, changeSourcePointExperiment2.e.a), (String) null, (ChangeOrderNotificationActionResponse) null, 13));
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$0 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$1 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$2 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$3 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$4 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$5 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$6 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$7 = null;
                                changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.label = 4;
                                if (this.h.b(o2y0Var3, changeOrderState$Failure, changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12) != coroutineSingletons) {
                                }
                            }
                            return tje.k0(mdhVar, changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1, changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12) != coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                        }
                        changeSourcePointExperiment2 = (ChangeSourcePointExperiment) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$5;
                        o2y0Var3 = (o2y0) changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$4;
                        try {
                            kotlin.b.b(obj);
                            return zy11Var;
                        } catch (Throwable unused2) {
                            changeOrderState$Failure = new ChangeOrderState$Failure(null, ChangeOrderState$Source.SOURCE_POINT, new OrderChangesDto.Notification((String) null, d6z.Y(changeSourcePointExperiment2, changeSourcePointExperiment2.e.a), (String) null, (ChangeOrderNotificationActionResponse) null, 13));
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$0 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$1 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$2 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$3 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$4 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$5 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$6 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$7 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.label = 4;
                            if (this.h.b(o2y0Var3, changeOrderState$Failure, changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12) != coroutineSingletons) {
                            }
                        }
                    }
                    o2y0Var = (o2y0) p;
                    if (o2y0Var != null) {
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$0 = str3;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$1 = str5;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$2 = zzsVar2;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$3 = sourcePointChangeReason2;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$4 = o2y0Var;
                        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.label = 2;
                        Object b = this.f.a.b(changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12);
                        if (b != coroutineSingletons) {
                            zzs zzsVar4 = zzsVar2;
                            str4 = str3;
                            obj = b;
                            zzsVar3 = zzsVar4;
                            SourcePointChangeReason sourcePointChangeReason6 = sourcePointChangeReason2;
                            o2y0Var2 = o2y0Var;
                            sourcePointChangeReason3 = sourcePointChangeReason6;
                            changeSourcePointExperiment = (ChangeSourcePointExperiment) obj;
                            this.a.getClass();
                            sjh sjhVar2 = uyj.a;
                            mdhVar = mdh.b;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1 = new ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1(this, zzsVar3, str4, str5, sourcePointChangeReason3, o2y0Var2, null);
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$0 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$1 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$2 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$3 = null;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$4 = o2y0Var2;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.L$5 = changeSourcePointExperiment;
                            changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12.label = 3;
                            if (tje.k0(mdhVar, changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1, changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$12) != coroutineSingletons) {
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
            o2y0Var = (o2y0) p;
            if (o2y0Var != null) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1 = new ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1(this, continuationImpl);
        ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1 changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$122 = changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$1;
        Object obj2 = changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$122.label;
        zy11 zy11Var2 = zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        ChangeTaxiOrderSourcePointInteractorImpl$startPolling$1 changeTaxiOrderSourcePointInteractorImpl$startPolling$1;
        int i;
        if (continuationImpl instanceof ChangeTaxiOrderSourcePointInteractorImpl$startPolling$1) {
            changeTaxiOrderSourcePointInteractorImpl$startPolling$1 = (ChangeTaxiOrderSourcePointInteractorImpl$startPolling$1) continuationImpl;
            int i2 = changeTaxiOrderSourcePointInteractorImpl$startPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeTaxiOrderSourcePointInteractorImpl$startPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeTaxiOrderSourcePointInteractorImpl$startPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeTaxiOrderSourcePointInteractorImpl$startPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d.h(new tb9(o2y0Var.b().a, str, ChangeOrderState$Source.SOURCE_POINT));
                    kotlinx.coroutines.flow.k kVar = new kotlinx.coroutines.flow.k(new jqr(new i(vng.l(new g(com.yandex.go.coroutines.b.d(o2y0Var.a(), new ChangeTaxiOrderSourcePointInteractorImpl$startPolling$2(this, null))), new jv8(18), vng.c), str), new ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6(this, o2y0Var, null), 3), new ChangeTaxiOrderSourcePointInteractorImpl$startPolling$7(this, null));
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$1.L$0 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$1.L$1 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(kVar, changeTaxiOrderSourcePointInteractorImpl$startPolling$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        changeTaxiOrderSourcePointInteractorImpl$startPolling$1 = new ChangeTaxiOrderSourcePointInteractorImpl$startPolling$1(this, continuationImpl);
        Object obj2 = changeTaxiOrderSourcePointInteractorImpl$startPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeTaxiOrderSourcePointInteractorImpl$startPolling$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
