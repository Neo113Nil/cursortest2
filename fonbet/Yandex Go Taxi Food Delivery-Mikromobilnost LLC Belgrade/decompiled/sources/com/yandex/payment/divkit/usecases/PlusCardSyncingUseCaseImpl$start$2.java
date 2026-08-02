package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.hyj0;
import defpackage.kyj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv90;
import defpackage.qyj0;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.t1d0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wj00;
import defpackage.wls;
import defpackage.xvz;
import defpackage.y22;
import defpackage.y891;
import defpackage.yv90;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lt1d0;", "<anonymous>", "(Ltse;)Lt1d0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.PlusCardSyncingUseCaseImpl$start$2", f = "PlusCardSyncingUseCase.kt", l = {36}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class PlusCardSyncingUseCaseImpl$start$2 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusCardSyncingUseCaseImpl$start$2(r rVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusCardSyncingUseCaseImpl$start$2 plusCardSyncingUseCaseImpl$start$2 = new PlusCardSyncingUseCaseImpl$start$2(this.this$0, continuation);
        plusCardSyncingUseCaseImpl$start$2.L$0 = obj;
        return plusCardSyncingUseCaseImpl$start$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusCardSyncingUseCaseImpl$start$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0090  */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, kotlin.collections.EmptyList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0081 -> B:5:0x0082). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Ref$IntRef ref$IntRef;
        int i2;
        r rVar;
        int i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        Object obj2 = null;
        int i5 = 0;
        int i6 = 1;
        if (i4 == 0) {
            kotlin.b.b(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = EmptyList.a;
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = -1;
            ref$BooleanRef = ref$BooleanRef2;
            i = 0;
            ref$ObjectRef = ref$ObjectRef2;
            ref$IntRef = ref$IntRef2;
            i2 = 10;
            rVar = this.this$0;
            i3 = 0;
            if (i < i2) {
            }
        } else {
            if (i4 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$3;
            int i7 = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            rVar = (r) this.L$4;
            ref$IntRef = (Ref$IntRef) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            ref$BooleanRef = (Ref$BooleanRef) this.L$1;
            kotlin.b.b(obj);
            int i8 = i7;
            qyj0 g = ((yv90) rVar.a).g();
            Object obj3 = obj2;
            if (!(g instanceof hyj0)) {
                if (!(g instanceof kyj0)) {
                    w511.b();
                    return obj3;
                }
                ?? r4 = ((kyj0) g).a;
                ref$ObjectRef.element = r4;
                Iterator it = ((List) r4).iterator();
                int i9 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i9 = -1;
                        break;
                    }
                    if (((PaymentMethod) it.next()) instanceof PaymentMethod.YBMethod) {
                        break;
                    }
                    i9++;
                }
                ref$IntRef.element = i9;
                if (i9 != -1) {
                    ref$BooleanRef.element = true;
                    rwo rwoVar = rVar.b;
                    int i10 = i + 1;
                    qv90.a.getClass();
                    String i11 = oyr.i(i10, "Открытие Карты Пэй завершилось успешно, количество попыток: ");
                    sv90 sv90Var = qv90.a;
                    wj00 wj00Var = new wj00(0);
                    wj00Var.j(i10, "attempts");
                    wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, i11);
                    ((y22) rwoVar).a(y891.c("plus_card_open_success", wj00Var));
                    if (!ref$BooleanRef.element) {
                        return new t1d0((List) ref$ObjectRef.element, ref$IntRef.element);
                    }
                    rwo rwoVar2 = this.this$0.b;
                    qv90.a.getClass();
                    sv90 sv90Var2 = qv90.a;
                    ((y22) rwoVar2).a(xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Открытие Карты Пэй завершилось с ошибкой", "plus_card_open_error_shown"));
                    com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                    com.yandex.payment.sdk.core.utils.a.c();
                    return obj3;
                }
            }
            i = i8 + 1;
            i6 = 1;
            obj2 = obj3;
            i5 = 0;
            if (i < i2) {
                this.L$0 = obj2;
                this.L$1 = ref$BooleanRef;
                this.L$2 = ref$ObjectRef;
                this.L$3 = ref$IntRef;
                this.L$4 = rVar;
                this.L$5 = obj2;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i;
                this.I$3 = i;
                this.I$4 = i5;
                this.label = i6;
                if (kotlinx.coroutines.a.i(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i8 = i;
                qyj0 g2 = ((yv90) rVar.a).g();
                Object obj32 = obj2;
                if (!(g2 instanceof hyj0)) {
                }
                i = i8 + 1;
                i6 = 1;
                obj2 = obj32;
                i5 = 0;
                if (i < i2) {
                    obj32 = obj2;
                    if (!ref$BooleanRef.element) {
                    }
                }
            }
        }
    }
}
