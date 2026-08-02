package com.yandex.go.transfer_requirement.mvp;

import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$DismissType;
import com.yandex.go.transfer_requirement.card_state.DoneButtonAction;
import com.yandex.go.transfer_requirement.card_state.a;
import com.yandex.go.transfer_requirement.transferapi.TransferParam;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftResponse;
import defpackage.ctb1;
import defpackage.ep01;
import defpackage.g4m;
import defpackage.h4m;
import defpackage.j4m;
import defpackage.mvg;
import defpackage.np01;
import defpackage.ny61;
import defpackage.op01;
import defpackage.rsb1;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wo01;
import defpackage.yo01;
import defpackage.zgz0;
import defpackage.zo01;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.mvp.TransferRequirementModalViewPresenter$onDoneButtonClicked$1", f = "TransferRequirementModalViewPresenter.kt", l = {175}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferRequirementModalViewPresenter$onDoneButtonClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ DoneButtonAction $action;
    int label;
    final /* synthetic */ op01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewPresenter$onDoneButtonClicked$1(DoneButtonAction doneButtonAction, op01 op01Var, Continuation continuation) {
        super(2, continuation);
        this.$action = doneButtonAction;
        this.this$0 = op01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewPresenter$onDoneButtonClicked$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewPresenter$onDoneButtonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (r0 == r11) goto L50;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = np01.a[this.$action.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                op01 op01Var = this.this$0;
                op01Var.x.u(op01Var.A.c(), TransferCardAnalytics$DismissType.CloseAfterNotRecoverableError);
                this.this$0.E = true;
                ((ep01) this.this$0.Dg()).close();
                return zy11Var;
            }
            op01 op01Var2 = this.this$0;
            final com.yandex.go.transfer_requirement.card_state.a aVar = op01Var2.A;
            final zgz0 zgz0Var = new zgz0(26, op01Var2);
            this.label = 1;
            zo01 zo01Var = aVar.e;
            final yo01 a = zo01Var.a();
            j4m j4mVar = a.h;
            if (j4mVar instanceof h4m) {
                obj2 = aVar.a(a, this);
            } else {
                if (j4mVar instanceof g4m) {
                    aVar.c.e();
                    Calendar a2 = ctb1.a(a);
                    if (a2 == null) {
                        zo01Var.b(com.yandex.go.transfer_requirement.card_state.a.i(a));
                    } else {
                        boolean c = aVar.c();
                        wo01 wo01Var = a.c;
                        if (c) {
                            final String str = wo01Var.a;
                            String str2 = a.d.a;
                            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                                zo01Var.b(com.yandex.go.transfer_requirement.card_state.a.i(a));
                            } else {
                                zo01Var.b(com.yandex.go.transfer_requirement.card_state.a.l(a));
                                final int i3 = 0;
                                obj2 = aVar.c.d(TransferParam.TransferType.TRAIN, str, rsb1.c(a2), new SimpleDateFormat("HH:mm:ss", Locale.US).format(a2.getTime()), str2, a.e, a.f, new tls() { // from class: to01
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        int i4 = i3;
                                        zy11 zy11Var2 = zy11.a;
                                        zgz0 zgz0Var2 = zgz0Var;
                                        String str3 = str;
                                        yo01 yo01Var = a;
                                        a aVar2 = aVar;
                                        TransferDraftResponse transferDraftResponse = (TransferDraftResponse) obj3;
                                        switch (i4) {
                                            case 0:
                                                aVar2.f(yo01Var, transferDraftResponse, str3, zgz0Var2);
                                                break;
                                            default:
                                                aVar2.f(yo01Var, transferDraftResponse, str3, zgz0Var2);
                                                break;
                                        }
                                        return zy11Var2;
                                    }
                                }, this);
                            }
                        } else {
                            final String str3 = wo01Var.a;
                            if (str3 == null || str3.length() == 0) {
                                zo01Var.b(com.yandex.go.transfer_requirement.card_state.a.i(a));
                            } else {
                                zo01Var.b(com.yandex.go.transfer_requirement.card_state.a.l(a));
                                com.yandex.go.transfer_requirement.transferapi.a aVar2 = aVar.c;
                                TransferParam.TransferType transferType = TransferParam.TransferType.AVIA;
                                String c2 = rsb1.c(a2);
                                int i4 = a.e;
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                                final int i5 = 1;
                                obj2 = aVar2.d(transferType, str3, c2, null, null, i4, a.f, new tls() { // from class: to01
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        int i42 = i5;
                                        zy11 zy11Var2 = zy11.a;
                                        zgz0 zgz0Var2 = zgz0Var;
                                        String str32 = str3;
                                        yo01 yo01Var = a;
                                        a aVar22 = aVar;
                                        TransferDraftResponse transferDraftResponse = (TransferDraftResponse) obj3;
                                        switch (i42) {
                                            case 0:
                                                aVar22.f(yo01Var, transferDraftResponse, str32, zgz0Var2);
                                                break;
                                            default:
                                                aVar22.f(yo01Var, transferDraftResponse, str32, zgz0Var2);
                                                break;
                                        }
                                        return zy11Var2;
                                    }
                                }, this);
                            }
                        }
                    }
                }
                obj2 = zy11Var;
            }
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = obj;
        }
        return zy11Var;
    }
}
