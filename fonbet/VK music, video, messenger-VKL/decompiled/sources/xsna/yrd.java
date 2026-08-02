package xsna;

import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftComponentBase.kt */
@b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$getDraftById$2", f = "ClipsDraftComponentBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class yrd extends SuspendLambda implements wzs<lud, spj<? super otd>, Object> {
    final /* synthetic */ String $draftId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrd(String str, spj<? super yrd> spjVar) {
        super(2, spjVar);
        this.$draftId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        yrd yrdVar = new yrd(this.$draftId, spjVar);
        yrdVar.L$0 = obj;
        return yrdVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lud ludVar, spj<? super otd> spjVar) {
        return ((yrd) create(ludVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClipsDraft a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        lud ludVar = (lud) this.L$0;
        String n = ludVar.a.n(this.$draftId);
        if (n == null || (a = ludVar.a(n)) == null) {
            return null;
        }
        return vua0.D(a);
    }
}
