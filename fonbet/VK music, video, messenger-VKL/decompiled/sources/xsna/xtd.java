package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.drafts.api.ClearDraftMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftSyncCoordinatorImpl.kt */
@b6l(c = "com.vk.camera.clips.drafts.sync.impl.ClipsDraftSyncCoordinatorImpl$removeDraftById$1", f = "ClipsDraftSyncCoordinatorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class xtd extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $clean;
    final /* synthetic */ boolean $cleanPreview;
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ ytd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtd(ytd ytdVar, boolean z, boolean z2, String str, spj<? super xtd> spjVar) {
        super(2, spjVar);
        this.this$0 = ytdVar;
        this.$clean = z;
        this.$cleanPreview = z2;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xtd(this.this$0, this.$clean, this.$cleanPreview, this.$id, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xtd) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.this$0.f()) {
            boolean z = this.$clean;
            this.this$0.c.s1(this.$id, (z && this.$cleanPreview) ? ClearDraftMode.CLEAN_ALL : z ? ClearDraftMode.CLEAN_VIDEO : ClearDraftMode.NONE);
            ClipsDraftPersistentStore clipsDraftPersistentStore = this.this$0.b;
            String str = this.$id;
            clipsDraftPersistentStore.getClass();
            synchronized (ClipsDraftPersistentStore.d) {
                try {
                    ClipsDraftVk clipsDraftVk = ClipsDraftPersistentStore.f;
                    if (epx.f(clipsDraftVk != null ? clipsDraftVk.b.b : null, str)) {
                        ClipsDraftPersistentStore.f = null;
                    }
                    ClipsDraftPersistentStore.Drafts drafts = ClipsDraftPersistentStore.e;
                    if (drafts != null) {
                        drafts.e(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            ClipsDraftPersistentStore clipsDraftPersistentStore2 = this.this$0.b;
            String str2 = this.$id;
            boolean z2 = this.$clean;
            boolean z3 = this.$cleanPreview;
            clipsDraftPersistentStore2.getClass();
            ClipsDraftPersistentStore.q(str2, z2, z3);
        }
        return s3q0.a;
    }
}
