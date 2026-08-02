package com.yandex.messaging.ui.folders.selectDialog;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obq0;
import defpackage.sbq0;
import defpackage.swi0;
import defpackage.tse;
import defpackage.twr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.folders.selectDialog.SelectFolderViewModel$onFolderClick$1", f = "SelectFolderViewModel.kt", l = {83, 85, MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SelectFolderViewModel$onFolderClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $folderId;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFolderViewModel$onFolderClick$1(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$folderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectFolderViewModel$onFolderClick$1(this.this$0, this.$folderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectFolderViewModel$onFolderClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r10 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (com.yandex.messaging.ui.folders.selectDialog.e.Y(r1, r2, r9) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = ((sbq0) this.this$0.B.a.getValue()).a;
            String str = this.$folderId;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((twr) next).a, str)) {
                    obj2 = next;
                    break;
                }
            }
            twr twrVar = (twr) obj2;
            if (twrVar != null) {
                boolean z = twrVar.e;
                e eVar = this.this$0;
                if (z) {
                    this.label = 1;
                    Object a = eVar.z.a(new swi0(twrVar.c, twrVar.a, eVar.w.b), this);
                    if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        a = zy11Var;
                    }
                } else {
                    this.label = 2;
                }
            }
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar2 = this.this$0;
        this.label = 3;
        return eVar2.W(obq0.a, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
