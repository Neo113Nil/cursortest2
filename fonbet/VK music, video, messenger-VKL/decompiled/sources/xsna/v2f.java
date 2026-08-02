package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.drafts.sync.api.di.ClipsDraftSyncComponent;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.log.L;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsSdkDraftsInteractorVkImpl.kt */
/* loaded from: classes14.dex */
public final class v2f implements u2f {
    public final gzs<ClipsDraftSyncComponent> a;
    public final hpj b = zvj.a(hqu0.b().plus(whn0.a()));

    /* compiled from: ClipsSdkDraftsInteractorVkImpl.kt */
    @b6l(c = "com.vk.camera.clips.drafts.sync.impl.interactor.ClipsSdkDraftsInteractorVkImpl$addDraft$1", f = "ClipsSdkDraftsInteractorVkImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ ClipsDraftVk $draftVk;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClipsDraftVk clipsDraftVk, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$draftVk = clipsDraftVk;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return v2f.this.new a(this.$draftVk, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            try {
                std w1 = v2f.this.a.invoke().w1();
                ClipsDraftVk clipsDraftVk = this.$draftVk;
                w1.a(clipsDraftVk, new v5(clipsDraftVk, 28));
            } catch (Exception e) {
                L.f("ClipsSdkDraftsInteractorVkImpl", "Error adding draft " + this.$draftVk.b.b, e);
            }
            return s3q0.a;
        }
    }

    public v2f(xy0 xy0Var) {
        this.a = xy0Var;
    }

    @Override // xsna.u2f
    public final void a(String str) {
        this.a.invoke().w1().c(str);
    }

    @Override // xsna.u2f
    public final void b(ClipsDraft clipsDraft) {
        ClipsDraftVk.b bVar = ClipsDraftVk.d;
        myc0.h(this.b, null, null, new a(ClipsDraftVk.a.a(clipsDraft), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.u2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        w2f w2fVar;
        int i;
        ClipsDraftVk clipsDraftVk;
        if (continuationImpl instanceof w2f) {
            w2fVar = (w2f) continuationImpl;
            int i2 = w2fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w2fVar.label = i2 - Integer.MIN_VALUE;
                Object obj = w2fVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = w2fVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    std w1 = this.a.invoke().w1();
                    w2fVar.L$0 = null;
                    w2fVar.label = 1;
                    obj = w1.d(str, w2fVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                clipsDraftVk = (ClipsDraftVk) obj;
                if (clipsDraftVk != null) {
                    return null;
                }
                ClipsDraftVk.b bVar = ClipsDraftVk.d;
                return new ClipsDraft(clipsDraftVk.b, clipsDraftVk.c.e5());
            }
        }
        w2fVar = new w2f(this, continuationImpl);
        Object obj2 = w2fVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = w2fVar.label;
        if (i != 0) {
        }
        clipsDraftVk = (ClipsDraftVk) obj2;
        if (clipsDraftVk != null) {
        }
    }
}
