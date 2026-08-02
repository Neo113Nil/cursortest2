package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftsInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsDraftsInteractorImpl$getCurrentDraft$2", f = "ClipsDraftsInteractorImpl.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class oud extends SuspendLambda implements wzs<yvj, spj<? super ClipsDraftVk>, Object> {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ qud this$0;

    /* compiled from: ClipsDraftsInteractorImpl.kt */
    public static final class a implements izs<ClipsDraftPersistentStore, s3q0> {
        public final /* synthetic */ lq9 b;

        public a(lq9 lq9Var) {
            this.b = lq9Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(ClipsDraftPersistentStore clipsDraftPersistentStore) {
            clipsDraftPersistentStore.getClass();
            ClipsDraftVk j = ClipsDraftPersistentStore.j();
            lq9 lq9Var = this.b;
            if (j != null) {
                lq9Var.resumeWith(j);
            } else {
                lq9Var.z(null);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oud(qud qudVar, spj<? super oud> spjVar) {
        super(2, spjVar);
        this.this$0 = qudVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new oud(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ClipsDraftVk> spjVar) {
        return ((oud) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        qud qudVar = this.this$0;
        this.L$0 = qudVar;
        this.I$0 = 0;
        this.label = 1;
        lq9 lq9Var = new lq9(1, s7s0.c(this));
        lq9Var.o();
        ClipsDraftPersistentStore clipsDraftPersistentStore = qudVar.a;
        a aVar = new a(lq9Var);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(aVar);
        Object n = lq9Var.n();
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
