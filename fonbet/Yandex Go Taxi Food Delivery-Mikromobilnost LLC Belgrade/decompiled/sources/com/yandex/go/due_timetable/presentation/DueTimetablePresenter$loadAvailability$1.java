package com.yandex.go.due_timetable.presentation;

import defpackage.g1n;
import defpackage.gne0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qnm0;
import defpackage.szm;
import defpackage.tse;
import defpackage.uzm;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.due_timetable.presentation.DueTimetablePresenter$loadAvailability$1", f = "DueTimetablePresenter.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, 303}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DueTimetablePresenter$loadAvailability$1 extends SuspendLambda implements wls {
    final /* synthetic */ gne0 $preferredInitialSelection;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DueTimetablePresenter$loadAvailability$1(g gVar, gne0 gne0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$preferredInitialSelection = gne0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DueTimetablePresenter$loadAvailability$1(this.this$0, this.$preferredInitialSelection, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DueTimetablePresenter$loadAvailability$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g gVar;
        g gVar2;
        Object a;
        gne0 gne0Var;
        g gVar3;
        g gVar4;
        gne0 gne0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.Ng(uzm.a);
                gVar = this.this$0;
                gne0 gne0Var3 = this.$preferredInitialSelection;
                try {
                    com.yandex.go.due_timetable.domain.interactor.a aVar = gVar.D;
                    g1n g1nVar = gVar.y;
                    boolean z = gVar.B.a;
                    this.L$0 = gVar;
                    this.L$1 = gne0Var3;
                    this.L$2 = gVar;
                    this.label = 1;
                    a = aVar.a(g1nVar, z, this);
                    if (a != coroutineSingletons) {
                        gne0Var = gne0Var3;
                        gVar3 = gVar;
                    }
                    return coroutineSingletons;
                } catch (Throwable unused) {
                    gVar2 = gVar;
                    jst.e.getClass();
                    gVar2.Ng(szm.a);
                    return zy11.a;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar2 = (g) this.L$2;
                gne0Var2 = (gne0) this.L$1;
                gVar4 = (g) this.L$0;
                try {
                    kotlin.b.b(obj);
                    g.Kg(gVar4, (qnm0) obj, gne0Var2);
                } catch (Throwable unused2) {
                    jst.e.getClass();
                    gVar2.Ng(szm.a);
                    return zy11.a;
                }
                return zy11.a;
            }
            gVar3 = (g) this.L$2;
            gne0 gne0Var4 = (gne0) this.L$1;
            g gVar5 = (g) this.L$0;
            try {
                kotlin.b.b(obj);
                a = obj;
                gVar = gVar5;
                gne0Var = gne0Var4;
            } catch (Throwable unused3) {
                gVar2 = gVar3;
                jst.e.getClass();
                gVar2.Ng(szm.a);
                return zy11.a;
            }
            qnm0 qnm0Var = (qnm0) a;
            if (!gVar.B.a) {
                g.Kg(gVar, qnm0Var, gne0Var);
                return zy11.a;
            }
            com.yandex.go.due_timetable.domain.interactor.impl.a aVar2 = gVar.R;
            this.L$0 = gVar;
            this.L$1 = gne0Var;
            this.L$2 = gVar3;
            this.L$3 = null;
            this.label = 2;
            Object a2 = aVar2.a(qnm0Var, this);
            if (a2 != coroutineSingletons) {
                g gVar6 = gVar;
                obj = a2;
                gVar4 = gVar6;
                gVar2 = gVar3;
                gne0Var2 = gne0Var;
                g.Kg(gVar4, (qnm0) obj, gne0Var2);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
