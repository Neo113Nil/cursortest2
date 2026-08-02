package com.yandex.messaging.ui.folders;

import defpackage.b5f;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s4f;
import defpackage.t4f;
import defpackage.u4f;
import defpackage.w511;
import defpackage.z4f;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lb5f;", "current", "", "Lq5f;", "listItems", "Lz4f;", "<anonymous>", "(Lb5f;Ljava/util/List;)Lz4f;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.folders.CreateEditFolderViewModel$uiState$1", f = "CreateEditFolderViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CreateEditFolderViewModel$uiState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditFolderViewModel$uiState$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CreateEditFolderViewModel$uiState$1 createEditFolderViewModel$uiState$1 = new CreateEditFolderViewModel$uiState$1(this.this$0, (Continuation) obj3);
        createEditFolderViewModel$uiState$1.L$0 = (b5f) obj;
        createEditFolderViewModel$uiState$1.L$1 = (List) obj2;
        return createEditFolderViewModel$uiState$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.Y(r9) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (defpackage.evu0.J(r9.a) == false) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b5f b5fVar = (b5f) this.L$0;
        List list = (List) this.L$1;
        String str = b5fVar != null ? b5fVar.a : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        e eVar = this.this$0;
        u4f u4fVar = eVar.w;
        boolean z = false;
        if (u4fVar instanceof s4f) {
            if (b5fVar != null) {
                if (!evu0.J(b5fVar.a)) {
                }
            }
            return new z4f(this.this$0.w instanceof t4f, str2, list, z, true ^ this.this$0.Y(b5fVar));
        }
        if (u4fVar instanceof t4f) {
            if (b5fVar != null) {
            }
            return new z4f(this.this$0.w instanceof t4f, str2, list, z, true ^ this.this$0.Y(b5fVar));
        }
        w511.b();
        return null;
    }
}
