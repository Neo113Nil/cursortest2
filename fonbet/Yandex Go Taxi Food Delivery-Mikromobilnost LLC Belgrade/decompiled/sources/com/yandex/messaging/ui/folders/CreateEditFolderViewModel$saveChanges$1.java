package com.yandex.messaging.ui.folders;

import defpackage.b5f;
import defpackage.c721;
import defpackage.j5f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s4f;
import defpackage.t4f;
import defpackage.tse;
import defpackage.u4f;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4f;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.folders.CreateEditFolderViewModel$saveChanges$1", f = "CreateEditFolderViewModel.kt", l = {101, 102, 105}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class CreateEditFolderViewModel$saveChanges$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditFolderViewModel$saveChanges$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateEditFolderViewModel$saveChanges$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateEditFolderViewModel$saveChanges$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r2 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r2 == r1) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b5f b5fVar = (b5f) this.this$0.C.getValue();
            if (b5fVar != null) {
                e eVar = this.this$0;
                u4f u4fVar = eVar.w;
                if (u4fVar instanceof t4f) {
                    t4f t4fVar = (t4f) u4fVar;
                    this.label = 1;
                    Object a = eVar.y.a(new c721(t4fVar.c, t4fVar.b, b5fVar.a, b5fVar.b, b5fVar.c, b5fVar.d, b5fVar.e), this);
                    if (a != coroutineSingletons) {
                        a = zy11Var;
                    }
                } else {
                    if (!(u4fVar instanceof s4f)) {
                        w511.b();
                        return null;
                    }
                    this.label = 2;
                    Object a2 = eVar.x.a(new j5f(b5fVar.a, b5fVar.b, b5fVar.c, b5fVar.d, b5fVar.e), this);
                    if (a2 != coroutineSingletons) {
                        a2 = zy11Var;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        e eVar2 = this.this$0;
        this.label = 3;
        return eVar2.W(x4f.a, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
