package com.yandex.go.charity.repository;

import defpackage.cne0;
import defpackage.lza;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.charity.repository.CharityRepository$updateMenuItemInfoByRequest$2$1", f = "CharityRepository.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CharityRepository$updateMenuItemInfoByRequest$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ lza $menuItemInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharityRepository$updateMenuItemInfoByRequest$2$1(a aVar, lza lzaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$menuItemInfo = lzaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CharityRepository$updateMenuItemInfoByRequest$2$1(this.this$0, this.$menuItemInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CharityRepository$updateMenuItemInfoByRequest$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            lza lzaVar = this.$menuItemInfo;
            aVar.getClass();
            boolean z = lzaVar.a;
            cne0 cne0Var = aVar.h;
            if (z) {
                cne0Var.r("title", lzaVar.c);
                cne0Var.r("url", lzaVar.e);
                cne0Var.r("subtitle", lzaVar.d);
                cne0Var.r("image_tag", lzaVar.b);
            } else {
                cne0Var.a();
            }
            n0 n0Var = this.this$0.i;
            lza lzaVar2 = this.$menuItemInfo;
            this.label = 1;
            if (n0Var.emit(lzaVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
