package com.yandex.go.transfer_requirement.card_state;

import com.yandex.go.taxi.order.models.api.preorder.Transfer;
import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$ValidationFailedReason;
import com.yandex.go.transfer_requirement.card_state.a;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import com.yandex.go.transfer_requirement.transferapi.TransferErrorDto;
import com.yandex.go.transfer_requirement.transferapi.TransferParam;
import com.yandex.go.transfer_requirement.transferapi.check.TransferCheckDto$AviaTransferCheck;
import com.yandex.go.transfer_requirement.transferapi.check.TransferCheckDto$TrainTransferCheck;
import com.yandex.go.transfer_requirement.transferapi.check.TransferCheckResponse;
import com.yandex.go.transfer_requirement.transferapi.check.d;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftDto$AviaTransferDraft;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftDto$ManualLookup;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftDto$TrainTransferDraft;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftResponse;
import com.yandex.go.transfer_requirement.transferapi.draft.e;
import defpackage.bo5;
import defpackage.crg;
import defpackage.ctb1;
import defpackage.e4m;
import defpackage.f4m;
import defpackage.g4m;
import defpackage.gci0;
import defpackage.i4m;
import defpackage.j4m;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.kcz0;
import defpackage.kj;
import defpackage.ny61;
import defpackage.qr01;
import defpackage.rsb1;
import defpackage.tls;
import defpackage.ulx0;
import defpackage.up01;
import defpackage.vo01;
import defpackage.vp01;
import defpackage.w511;
import defpackage.wf7;
import defpackage.wo01;
import defpackage.xby;
import defpackage.y6i0;
import defpackage.yo01;
import defpackage.zgz0;
import defpackage.zo01;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.am.f0;

/* loaded from: classes14.dex */
public final class a {
    public final crg a;
    public final jtq0 b;
    public final com.yandex.go.transfer_requirement.transferapi.a c;
    public final kcz0 d;
    public final zo01 e;
    public final f0 f;
    public final kcz0 g;
    public final bo5 h;
    public final ulx0 i;
    public final gci0 j;

    public a(crg crgVar, jtq0 jtq0Var, com.yandex.go.transfer_requirement.transferapi.a aVar, kcz0 kcz0Var, zo01 zo01Var, f0 f0Var, kcz0 kcz0Var2, bo5 bo5Var, ulx0 ulx0Var) {
        this.a = crgVar;
        this.b = jtq0Var;
        this.c = aVar;
        this.d = kcz0Var;
        this.e = zo01Var;
        this.f = f0Var;
        this.g = kcz0Var2;
        this.h = bo5Var;
        this.i = ulx0Var;
        this.j = zo01Var.b;
    }

    public static yo01 i(yo01 yo01Var) {
        Calendar calendar;
        String str = null;
        int i = 6;
        wo01 wo01Var = new wo01(yo01Var.c.a, str, str, i);
        Calendar calendar2 = yo01Var.a;
        if (calendar2 != null) {
            wf7 wf7Var = wf7.a;
            calendar = wf7.c(calendar2, calendar2.getTimeZone());
        } else {
            calendar = null;
        }
        return yo01.a(yo01Var, calendar, yo01Var.b, wo01Var, new wo01(yo01Var.d.a, str, str, i), 0, null, null, new e4m(false), 112);
    }

    public static yo01 l(yo01 yo01Var) {
        j4m i4mVar;
        j4m f4mVar;
        j4m j4mVar = yo01Var.h;
        if (j4mVar instanceof e4m) {
            f4mVar = new e4m(true);
        } else if (j4mVar instanceof g4m) {
            f4mVar = new g4m(true);
        } else {
            if (!(j4mVar instanceof f4m)) {
                if (!(j4mVar instanceof i4m)) {
                    w511.b();
                    return null;
                }
                i4m i4mVar2 = (i4m) j4mVar;
                i4mVar = new i4m(true, i4mVar2.b, i4mVar2.c);
                return yo01.a(yo01Var, null, null, null, null, 0, null, null, i4mVar, HProv.PP_VERSION_TIMESTAMP);
            }
            f4mVar = new f4m(true);
        }
        i4mVar = f4mVar;
        return yo01.a(yo01Var, null, null, null, null, 0, null, null, i4mVar, HProv.PP_VERSION_TIMESTAMP);
    }

    public static TransferCardAnalytics$ValidationFailedReason m(TransferErrorDto.TransferDraftErrorCode transferDraftErrorCode) {
        switch (vo01.b[transferDraftErrorCode.ordinal()]) {
            case 1:
                return TransferCardAnalytics$ValidationFailedReason.TransferNotFound;
            case 2:
                return TransferCardAnalytics$ValidationFailedReason.TripNotFound;
            case 3:
                return TransferCardAnalytics$ValidationFailedReason.BadRequest;
            case 4:
                return TransferCardAnalytics$ValidationFailedReason.ExplicitGreeting;
            case 5:
                return TransferCardAnalytics$ValidationFailedReason.NotRetryableError;
            case 6:
                return TransferCardAnalytics$ValidationFailedReason.Unknown;
            default:
                w511.b();
                return null;
        }
    }

    public final Object a(yo01 yo01Var, Continuation continuation) {
        this.c.e();
        Calendar a = ctb1.a(yo01Var);
        zy11 zy11Var = zy11.a;
        zo01 zo01Var = this.e;
        if (a == null) {
            zo01Var.b(i(yo01Var));
            return zy11Var;
        }
        boolean c = c();
        wo01 wo01Var = yo01Var.c;
        final int i = 0;
        if (c) {
            final String str = wo01Var.a;
            String str2 = yo01Var.d.a;
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                zo01Var.b(i(yo01Var));
                return zy11Var;
            }
            zo01Var.b(l(yo01Var));
            Object c2 = this.c.c(TransferParam.TransferType.TRAIN, str, rsb1.c(a), new SimpleDateFormat("HH:mm:ss", Locale.US).format(a.getTime()), str2, yo01Var.e, yo01Var.f, new tls(this) { // from class: uo01
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i2 = i;
                    zy11 zy11Var2 = zy11.a;
                    String str3 = str;
                    a aVar = this.b;
                    TransferCheckResponse transferCheckResponse = (TransferCheckResponse) obj;
                    switch (i2) {
                        case 0:
                            aVar.d(transferCheckResponse, str3);
                            break;
                        default:
                            aVar.d(transferCheckResponse, str3);
                            break;
                    }
                    return zy11Var2;
                }
            }, continuation);
            return c2 == CoroutineSingletons.COROUTINE_SUSPENDED ? c2 : zy11Var;
        }
        final String str3 = wo01Var.a;
        if (str3 == null || str3.length() == 0) {
            zo01Var.b(i(yo01Var));
            return zy11Var;
        }
        zo01Var.b(l(yo01Var));
        TransferParam.TransferType transferType = TransferParam.TransferType.AVIA;
        String c3 = rsb1.c(a);
        int i2 = yo01Var.e;
        final int i3 = 1;
        return this.c.c(transferType, str3, c3, null, null, i2 < 0 ? 0 : i2, yo01Var.f, new tls(this) { // from class: uo01
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i3;
                zy11 zy11Var2 = zy11.a;
                String str32 = str3;
                a aVar = this.b;
                TransferCheckResponse transferCheckResponse = (TransferCheckResponse) obj;
                switch (i22) {
                    case 0:
                        aVar.d(transferCheckResponse, str32);
                        break;
                    default:
                        aVar.d(transferCheckResponse, str32);
                        break;
                }
                return zy11Var2;
            }
        }, continuation);
    }

    public final boolean b(qr01 qr01Var, String str) {
        boolean isEmpty = qr01Var.getB().isEmpty();
        int i = 6;
        String str2 = null;
        zo01 zo01Var = this.e;
        kcz0 kcz0Var = this.d;
        if (isEmpty && qr01Var.a() == null) {
            kcz0Var.v(c(), m(TransferErrorDto.TransferDraftErrorCode.UNKNOWN), str);
            r0 r0Var = zo01Var.a;
            r0Var.m(null, yo01.a((yo01) r0Var.getValue(), null, null, new wo01(str, str2, str2, i), null, 0, null, null, new f4m(false), HProv.PP_PASSWD_TERM));
            return true;
        }
        if (qr01Var.getB().isEmpty()) {
            return false;
        }
        TransferErrorDto transferErrorDto = (TransferErrorDto) kotlin.collections.a.P(qr01Var.getB());
        boolean c = c();
        TransferErrorDto.TransferDraftErrorCode transferDraftErrorCode = transferErrorDto.a;
        String str3 = transferErrorDto.b;
        kcz0Var.v(c, m(transferDraftErrorCode), str);
        TransferErrorDto.TransferDraftErrorCode transferDraftErrorCode2 = transferErrorDto.a;
        switch (vo01.b[transferDraftErrorCode2.ordinal()]) {
            case 1:
            case 2:
                r0 r0Var2 = zo01Var.a;
                r0Var2.m(null, yo01.a((yo01) r0Var2.getValue(), null, null, new wo01(str, str2, str3, 2), null, 0, null, null, new e4m(false), HProv.PP_PASSWD_TERM));
                return true;
            case 3:
            case 4:
                g(transferErrorDto, str, DoneButtonAction.REQUEST);
                return true;
            case 5:
                g(transferErrorDto, str, DoneButtonAction.RETURN);
                return true;
            case 6:
                kcz0Var.v(c(), m(transferDraftErrorCode2), str);
                r0 r0Var3 = zo01Var.a;
                r0Var3.m(null, yo01.a((yo01) r0Var3.getValue(), null, null, new wo01(str, str2, str2, i), null, 0, null, null, new i4m(false, str3, DoneButtonAction.REQUEST), HProv.PP_PASSWD_TERM));
                return true;
            default:
                w511.b();
                return false;
        }
    }

    public final boolean c() {
        return this.i.d().f == TransferRequirementExperiment.TransferKind.TRAIN;
    }

    public final void d(TransferCheckResponse transferCheckResponse, String str) {
        if (b(transferCheckResponse, str)) {
            return;
        }
        d dVar = transferCheckResponse.a;
        if (dVar instanceof TransferCheckDto$AviaTransferCheck) {
            h(((TransferCheckDto$AviaTransferCheck) dVar).a, str);
        } else if (dVar instanceof TransferCheckDto$TrainTransferCheck) {
            h(((TransferCheckDto$TrainTransferCheck) dVar).a, str);
        }
    }

    public final void e(yo01 yo01Var, String str, String str2, String str3, String str4, TransferDraftDto$ManualLookup transferDraftDto$ManualLookup, Integer num, zgz0 zgz0Var) {
        Object value;
        Calendar b = this.a.b(str2);
        Calendar b2 = this.a.b(str3);
        if (str.length() == 0 || b == null || b2 == null) {
            xby.t(jst.e, "TransferRequirement", null, "Bad draft response", 6);
            r0 r0Var = this.e.a;
            yo01 i = i((yo01) r0Var.getValue());
            r0Var.getClass();
            r0Var.m(null, i);
            return;
        }
        vp01 vp01Var = (vp01) this.h.a.get();
        r0 r0Var2 = vp01Var.f;
        Boolean bool = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.m(null, bool);
        vp01Var.b.getClass();
        Transfer transfer = new Transfer(b, str, transferDraftDto$ManualLookup != null ? new Transfer.ManualLookup(transferDraftDto$ManualLookup.a) : null, num);
        r0 r0Var3 = vp01Var.c;
        while (true) {
            Object value2 = r0Var3.getValue();
            String str5 = str4;
            if (r0Var3.k(value2, up01.a((up01) value2, transfer, b2, str5, null, 20))) {
                break;
            } else {
                str4 = str5;
            }
        }
        vp01Var.a.a.T = transfer;
        bo5 bo5Var = this.h;
        yo01 i2 = i(yo01Var);
        r0 r0Var4 = ((vp01) bo5Var.a.get()).c;
        do {
            value = r0Var4.getValue();
        } while (!r0Var4.k(value, up01.a((up01) value, null, null, null, i2, 15)));
        zgz0Var.invoke();
    }

    public final void f(yo01 yo01Var, TransferDraftResponse transferDraftResponse, String str, zgz0 zgz0Var) {
        if (b(transferDraftResponse, str)) {
            return;
        }
        e eVar = transferDraftResponse.a;
        if (eVar instanceof TransferDraftDto$AviaTransferDraft) {
            TransferDraftDto$AviaTransferDraft transferDraftDto$AviaTransferDraft = (TransferDraftDto$AviaTransferDraft) eVar;
            e(yo01Var, transferDraftDto$AviaTransferDraft.a, transferDraftDto$AviaTransferDraft.b, transferDraftDto$AviaTransferDraft.e, transferDraftDto$AviaTransferDraft.d, transferDraftDto$AviaTransferDraft.f, transferDraftDto$AviaTransferDraft.g, zgz0Var);
        } else if (eVar instanceof TransferDraftDto$TrainTransferDraft) {
            TransferDraftDto$TrainTransferDraft transferDraftDto$TrainTransferDraft = (TransferDraftDto$TrainTransferDraft) eVar;
            e(yo01Var, transferDraftDto$TrainTransferDraft.a, transferDraftDto$TrainTransferDraft.b, transferDraftDto$TrainTransferDraft.e, transferDraftDto$TrainTransferDraft.d, transferDraftDto$TrainTransferDraft.f, transferDraftDto$TrainTransferDraft.g, zgz0Var);
        }
    }

    public final void g(TransferErrorDto transferErrorDto, String str, DoneButtonAction doneButtonAction) {
        r0 r0Var = this.e.a;
        String str2 = null;
        yo01 a = yo01.a((yo01) r0Var.getValue(), null, null, new wo01(str, str2, str2, 6), null, 0, null, null, new i4m(false, transferErrorDto.b, doneButtonAction), HProv.PP_PASSWD_TERM);
        r0Var.getClass();
        r0Var.m(null, a);
    }

    public final void h(String str, String str2) {
        r0 r0Var = this.e.a;
        yo01 a = yo01.a((yo01) r0Var.getValue(), null, null, new wo01(str2, str, null, 4), null, 0, null, null, new g4m(false), HProv.PP_PASSWD_TERM);
        r0Var.getClass();
        r0Var.m(null, a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        TransferRequirementCardInteractor$setupInitialState$1 transferRequirementCardInteractor$setupInitialState$1;
        Object obj;
        int i;
        if (continuationImpl instanceof TransferRequirementCardInteractor$setupInitialState$1) {
            transferRequirementCardInteractor$setupInitialState$1 = (TransferRequirementCardInteractor$setupInitialState$1) continuationImpl;
            int i2 = transferRequirementCardInteractor$setupInitialState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementCardInteractor$setupInitialState$1.label = i2 - Integer.MIN_VALUE;
                obj = transferRequirementCardInteractor$setupInitialState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementCardInteractor$setupInitialState$1.label;
                if (i != 0) {
                    b.b(obj);
                    transferRequirementCardInteractor$setupInitialState$1.label = 1;
                    obj = n(transferRequirementCardInteractor$setupInitialState$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
                transferRequirementCardInteractor$setupInitialState$1.label = 2;
                Object k = k(transferRequirementCardInteractor$setupInitialState$1);
                return k == obj2 ? obj2 : k;
            }
        }
        transferRequirementCardInteractor$setupInitialState$1 = new TransferRequirementCardInteractor$setupInitialState$1(this, continuationImpl);
        obj = transferRequirementCardInteractor$setupInitialState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementCardInteractor$setupInitialState$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        TransferRequirementCardInteractor$setupNewState$1 transferRequirementCardInteractor$setupNewState$1;
        int i;
        Calendar calendar;
        TransferRequirementExperiment.Card card;
        int i2;
        TransferRequirementExperiment.Card.ServiceSectionDto serviceSectionDto;
        TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto luggageInfoDto;
        int i3;
        if (continuationImpl instanceof TransferRequirementCardInteractor$setupNewState$1) {
            transferRequirementCardInteractor$setupNewState$1 = (TransferRequirementCardInteractor$setupNewState$1) continuationImpl;
            int i4 = transferRequirementCardInteractor$setupNewState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                transferRequirementCardInteractor$setupNewState$1.label = i4 - Integer.MIN_VALUE;
                Object obj = transferRequirementCardInteractor$setupNewState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementCardInteractor$setupNewState$1.label;
                int i5 = 1;
                if (i != 0) {
                    b.b(obj);
                    Calendar b = this.b.b(null);
                    transferRequirementCardInteractor$setupNewState$1.L$0 = b;
                    transferRequirementCardInteractor$setupNewState$1.label = 1;
                    f0 f0Var = this.f;
                    f0Var.getClass();
                    Object a = f0.a(f0Var, transferRequirementCardInteractor$setupNewState$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    calendar = b;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    calendar = (Calendar) transferRequirementCardInteractor$setupNewState$1.L$0;
                    b.b(obj);
                }
                kj kjVar = (kj) obj;
                String str = kjVar == null ? kjVar.b : null;
                card = this.i.d().i;
                if (card != null && (serviceSectionDto = card.c) != null && (luggageInfoDto = serviceSectionDto.d) != null) {
                    i3 = vo01.a[luggageInfoDto.a.ordinal()];
                    if (i3 == 1) {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        Integer num = luggageInfoDto.f;
                        i5 = y6i0.d(0, 0, y6i0.d(num != null ? num.intValue() : 3, 1, 3));
                    } else if (!jl40.l(luggageInfoDto.e, Boolean.TRUE)) {
                        i2 = 0;
                        r0 r0Var = this.e.a;
                        yo01 a2 = yo01.a((yo01) r0Var.getValue(), rsb1.d(calendar, 0, 0), null, null, null, i2, str, null, null, 204);
                        r0Var.getClass();
                        r0Var.m(null, a2);
                        return zy11.a;
                    }
                }
                i2 = i5;
                r0 r0Var2 = this.e.a;
                yo01 a22 = yo01.a((yo01) r0Var2.getValue(), rsb1.d(calendar, 0, 0), null, null, null, i2, str, null, null, 204);
                r0Var2.getClass();
                r0Var2.m(null, a22);
                return zy11.a;
            }
        }
        transferRequirementCardInteractor$setupNewState$1 = new TransferRequirementCardInteractor$setupNewState$1(this, continuationImpl);
        Object obj2 = transferRequirementCardInteractor$setupNewState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementCardInteractor$setupNewState$1.label;
        int i52 = 1;
        if (i != 0) {
        }
        kj kjVar2 = (kj) obj2;
        if (kjVar2 == null) {
        }
        card = this.i.d().i;
        if (card != null) {
            i3 = vo01.a[luggageInfoDto.a.ordinal()];
            if (i3 == 1) {
            }
        }
        i2 = i52;
        r0 r0Var22 = this.e.a;
        yo01 a222 = yo01.a((yo01) r0Var22.getValue(), rsb1.d(calendar, 0, 0), null, null, null, i2, str, null, null, 204);
        r0Var22.getClass();
        r0Var22.m(null, a222);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ContinuationImpl continuationImpl) {
        TransferRequirementCardInteractor$tryLoadSavedState$1 transferRequirementCardInteractor$tryLoadSavedState$1;
        int i;
        if (continuationImpl instanceof TransferRequirementCardInteractor$tryLoadSavedState$1) {
            transferRequirementCardInteractor$tryLoadSavedState$1 = (TransferRequirementCardInteractor$tryLoadSavedState$1) continuationImpl;
            int i2 = transferRequirementCardInteractor$tryLoadSavedState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementCardInteractor$tryLoadSavedState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequirementCardInteractor$tryLoadSavedState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementCardInteractor$tryLoadSavedState$1.label;
                if (i != 0) {
                    b.b(obj);
                    yo01 yo01Var = ((up01) ((vp01) this.h.a.get()).c.getValue()).d;
                    if (yo01Var == null) {
                        return Boolean.FALSE;
                    }
                    this.e.b(yo01Var);
                    transferRequirementCardInteractor$tryLoadSavedState$1.L$0 = null;
                    transferRequirementCardInteractor$tryLoadSavedState$1.label = 1;
                    if (a(yo01Var, transferRequirementCardInteractor$tryLoadSavedState$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.TRUE;
            }
        }
        transferRequirementCardInteractor$tryLoadSavedState$1 = new TransferRequirementCardInteractor$tryLoadSavedState$1(this, continuationImpl);
        Object obj3 = transferRequirementCardInteractor$tryLoadSavedState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementCardInteractor$tryLoadSavedState$1.label;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
