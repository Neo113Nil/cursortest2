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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.yadisk.AskDiskSpaceDialog$fileName$2", f = "AskDiskSpaceDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AskDiskSpaceDialog$fileName$2 extends SuspendLambda implements wls {
    final /* synthetic */ uw80 $this_fileName;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskDiskSpaceDialog$fileName$2(uw80 uw80Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$this_fileName = uw80Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskDiskSpaceDialog$fileName$2(this.$this_fileName, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AskDiskSpaceDialog$fileName$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Uri parse = Uri.parse(((tw80) this.$this_fileName).a);
        try {
            return rk91.c(this.this$0.a, parse);
        } catch (Exception unused) {
            String lastPathSegment = parse.getLastPathSegment();
            return lastPathSegment == null ? "" : lastPathSegment;
        }
    }
}
