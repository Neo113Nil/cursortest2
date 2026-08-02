package com.yandex.messaging.ui.yadisk;

import android.net.Uri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rk91;
import defpackage.tse;
import defpackage.tw80;
import defpackage.uw80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)J"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.yadisk.AskDiskSpaceDialog$fileSize$2", f = "AskDiskSpaceDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AskDiskSpaceDialog$fileSize$2 extends SuspendLambda implements wls {
    final /* synthetic */ uw80 $this_fileSize;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskDiskSpaceDialog$fileSize$2(uw80 uw80Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$this_fileSize = uw80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskDiskSpaceDialog$fileSize$2(this.$this_fileSize, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AskDiskSpaceDialog$fileSize$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            j = rk91.b(this.this$0.a, Uri.parse(((tw80) this.$this_fileSize).a));
        } catch (Exception unused) {
            j = 0;
        }
        return new Long(j);
    }
}
