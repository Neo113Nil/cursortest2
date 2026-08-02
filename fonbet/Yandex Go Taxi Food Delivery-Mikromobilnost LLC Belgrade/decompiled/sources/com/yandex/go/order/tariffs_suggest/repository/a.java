package com.yandex.go.order.tariffs_suggest.repository;

import com.yandex.go.order.tariffs_suggest.api.ChangeTariffsApi;
import com.yandex.go.order.tariffs_suggest.mapper.ChangeStatusUiState$Status;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.ffx;
import defpackage.fmt;
import defpackage.gci0;
import defpackage.h8v0;
import defpackage.hp8;
import defpackage.ip8;
import defpackage.jqr;
import defpackage.lg9;
import defpackage.mg9;
import defpackage.mth;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.omu0;
import defpackage.pwy0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.v4r0;
import defpackage.vng;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final n20 a;
    public final com.yandex.go.order.tariffs_suggest.mapper.a b;
    public final ChangeTariffsApi c;
    public final pwy0 d;
    public final r0 e;
    public final r0 f;
    public final r0 g;
    public final gci0 h;
    public final r0 i;
    public final gci0 j;
    public final r0 k;
    public final n0 l;
    public final String m;
    public volatile String n;

    public a(n20 n20Var, com.yandex.go.order.tariffs_suggest.mapper.a aVar, ChangeTariffsApi changeTariffsApi, pwy0 pwy0Var) {
        this.a = n20Var;
        this.b = aVar;
        this.c = changeTariffsApi;
        this.d = pwy0Var;
        r0 c = bvf0.c(EmptySet.a);
        this.e = c;
        this.f = c;
        r0 c2 = bvf0.c(null);
        this.g = c2;
        this.h = e.d(c2);
        r0 c3 = bvf0.c(ip8.d);
        this.i = c3;
        this.j = e.d(c3);
        this.k = bvf0.c(Boolean.FALSE);
        this.l = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.m = UUID.randomUUID().toString();
    }

    public final tpr a() {
        return e.t(new mth(e.m(new jqr(d(), new SuggestTariffsRepository$buttonUiStateFlow$1(this, null), 3), this.f, new n(this.l, new SuggestTariffsRepository$buttonUiStateFlow$2(2, null)), this.d.a(), new SuggestTariffsRepository$buttonUiStateFlow$3(this, null)), 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x004c, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f A[LOOP:1: B:54:0x0099->B:56:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SuggestTariffsRepository$changeTariffs$1 suggestTariffsRepository$changeTariffs$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        o2y0 o2y0Var;
        String str;
        Iterator it;
        Object b;
        String str2;
        int i2;
        ChangeStatusUiState$Status changeStatusUiState$Status;
        if (continuationImpl instanceof SuggestTariffsRepository$changeTariffs$1) {
            suggestTariffsRepository$changeTariffs$1 = (SuggestTariffsRepository$changeTariffs$1) continuationImpl;
            int i3 = suggestTariffsRepository$changeTariffs$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                suggestTariffsRepository$changeTariffs$1.label = i3 - Integer.MIN_VALUE;
                Object obj = suggestTariffsRepository$changeTariffs$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestTariffsRepository$changeTariffs$1.label;
                if (i != 0) {
                    b.b(obj);
                    n20 n20Var = this.a;
                    suggestTariffsRepository$changeTariffs$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).t(suggestTariffsRepository$changeTariffs$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str3 = (String) suggestTariffsRepository$changeTariffs$1.L$0;
                        b.b(obj);
                        str2 = str3;
                        fmt fmtVar = (fmt) obj;
                        r0 r0Var = this.g;
                        i2 = h8v0.a[((ChangeTariffsApi.ChangeTariffDto) fmtVar.a).a.ordinal()];
                        if (i2 != 1) {
                            changeStatusUiState$Status = ChangeStatusUiState$Status.PENDING;
                        } else if (i2 == 2) {
                            changeStatusUiState$Status = ChangeStatusUiState$Status.FAILED;
                        } else if (i2 == 3) {
                            changeStatusUiState$Status = ChangeStatusUiState$Status.UNAVAILABLE;
                        } else {
                            if (i2 != 4) {
                                w511.b();
                                return null;
                            }
                            changeStatusUiState$Status = ChangeStatusUiState$Status.SUCCESS;
                        }
                        ChangeStatusUiState$Status changeStatusUiState$Status2 = changeStatusUiState$Status;
                        ChangeTariffsApi.ChangeTariffDto changeTariffDto = (ChangeTariffsApi.ChangeTariffDto) fmtVar.a;
                        String str4 = changeTariffDto.b;
                        String str5 = changeTariffDto.c;
                        ChangeTariffsApi.ChangeTariffDto.Message message = changeTariffDto.d;
                        mg9 mg9Var = new mg9(changeStatusUiState$Status2, str4, str5, new lg9(message == null ? message.a : null, message == null ? message.b : null), str2);
                        r0Var.getClass();
                        r0Var.m(null, mg9Var);
                        return zy11.a;
                    }
                    b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null || (str = o2y0Var.b().a) == null) {
                    str = "";
                }
                List list = ((ip8) this.j.a.getValue()).c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((hp8) obj2).g) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((hp8) it.next()).a);
                }
                cmt<ChangeTariffsApi.ChangeTariffDto> a = this.c.a(this.m, new ChangeTariffsApi.ChangeTariffRequest(str, kotlin.collections.a.J0(v4r0.h((Set) this.f.getValue(), arrayList2)), this.n));
                suggestTariffsRepository$changeTariffs$1.L$0 = str;
                suggestTariffsRepository$changeTariffs$1.L$1 = null;
                suggestTariffsRepository$changeTariffs$1.label = 2;
                b = ru.yandex.taxi.network.api.a.b(a, null, suggestTariffsRepository$changeTariffs$1);
                if (b != coroutineSingletons) {
                    str2 = str;
                    obj = b;
                    fmt fmtVar2 = (fmt) obj;
                    r0 r0Var2 = this.g;
                    i2 = h8v0.a[((ChangeTariffsApi.ChangeTariffDto) fmtVar2.a).a.ordinal()];
                    if (i2 != 1) {
                    }
                    ChangeStatusUiState$Status changeStatusUiState$Status22 = changeStatusUiState$Status;
                    ChangeTariffsApi.ChangeTariffDto changeTariffDto2 = (ChangeTariffsApi.ChangeTariffDto) fmtVar2.a;
                    String str42 = changeTariffDto2.b;
                    String str52 = changeTariffDto2.c;
                    ChangeTariffsApi.ChangeTariffDto.Message message2 = changeTariffDto2.d;
                    mg9 mg9Var2 = new mg9(changeStatusUiState$Status22, str42, str52, new lg9(message2 == null ? message2.a : null, message2 == null ? message2.b : null), str2);
                    r0Var2.getClass();
                    r0Var2.m(null, mg9Var2);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        suggestTariffsRepository$changeTariffs$1 = new SuggestTariffsRepository$changeTariffs$1(this, continuationImpl);
        Object obj3 = suggestTariffsRepository$changeTariffs$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestTariffsRepository$changeTariffs$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj3;
        if (o2y0Var != null) {
        }
        str = "";
        List list2 = ((ip8) this.j.a.getValue()).c;
        ArrayList arrayList3 = new ArrayList();
        while (r2.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        cmt<ChangeTariffsApi.ChangeTariffDto> a2 = this.c.a(this.m, new ChangeTariffsApi.ChangeTariffRequest(str, kotlin.collections.a.J0(v4r0.h((Set) this.f.getValue(), arrayList22)), this.n));
        suggestTariffsRepository$changeTariffs$1.L$0 = str;
        suggestTariffsRepository$changeTariffs$1.L$1 = null;
        suggestTariffsRepository$changeTariffs$1.label = 2;
        b = ru.yandex.taxi.network.api.a.b(a2, null, suggestTariffsRepository$changeTariffs$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SuggestTariffsRepository$initSuggestId$1 suggestTariffsRepository$initSuggestId$1;
        int i;
        String str;
        o2y0 o2y0Var;
        TaxiOrder b;
        OrderStatusInfo V;
        TariffsSuggestDto tariffsSuggestDto;
        if (continuationImpl instanceof SuggestTariffsRepository$initSuggestId$1) {
            suggestTariffsRepository$initSuggestId$1 = (SuggestTariffsRepository$initSuggestId$1) continuationImpl;
            int i2 = suggestTariffsRepository$initSuggestId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestTariffsRepository$initSuggestId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestTariffsRepository$initSuggestId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestTariffsRepository$initSuggestId$1.label;
                str = null;
                if (i != 0) {
                    b.b(obj);
                    n20 n20Var = this.a;
                    suggestTariffsRepository$initSuggestId$1.L$0 = this;
                    suggestTariffsRepository$initSuggestId$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).t(suggestTariffsRepository$initSuggestId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) suggestTariffsRepository$initSuggestId$1.L$0;
                    b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null && (b = o2y0Var.b()) != null && (V = b.V()) != null && (tariffsSuggestDto = V.v0) != null) {
                    str = tariffsSuggestDto.e;
                }
                this.n = str;
                return zy11.a;
            }
        }
        suggestTariffsRepository$initSuggestId$1 = new SuggestTariffsRepository$initSuggestId$1(this, continuationImpl);
        Object obj2 = suggestTariffsRepository$initSuggestId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestTariffsRepository$initSuggestId$1.label;
        str = null;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
            str = tariffsSuggestDto.e;
        }
        this.n = str;
        return zy11.a;
    }

    public final jqr d() {
        return new jqr(vng.l(e.X(((com.yandex.go.taxi.order.provider.a) this.a).v(), new SuggestTariffsRepository$orderFlow$$inlined$flatMapLatest$1(3, null)), new omu0(11), vng.c), new SuggestTariffsRepository$orderFlow$3(this, null), 3);
    }

    public final Object e(Continuation continuation) {
        return e.k(e.t(new mth(e.m(d(), this.f, new n(this.l, new SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$2(2, null)), this.d.a(), new SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$3(this, null)), 6)), new SuggestTariffsRepository$startCardTariffsSuggestUiStateFlowSubscription$4(this, null), continuation);
    }

    public final void f() {
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.k;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.l.g(zy11.a);
    }
}
