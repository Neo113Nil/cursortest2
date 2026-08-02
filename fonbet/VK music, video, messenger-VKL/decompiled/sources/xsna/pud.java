package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.media.MediaUtils;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftsInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsDraftsInteractorImpl$setCurrentDraft$2", f = "ClipsDraftsInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class pud extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ File $videoFile;
    final /* synthetic */ MediaUtils.f $videoInfo;
    int label;
    final /* synthetic */ qud this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pud(qud qudVar, File file, MediaUtils.f fVar, spj<? super pud> spjVar) {
        super(2, spjVar);
        this.this$0 = qudVar;
        this.$videoFile = file;
        this.$videoInfo = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pud(this.this$0, this.$videoFile, this.$videoInfo, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pud) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ClipsDraftPersistentStore clipsDraftPersistentStore = this.this$0.a;
        ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
        clipsDraftPersistentStore.getClass();
        Future o = ClipsDraftPersistentStore.o(null);
        if (o != null) {
            o.get();
        }
        File file = this.$videoFile;
        int i = this.$videoInfo.f;
        ClipsDraftPersistentStore.b bVar = new ClipsDraftPersistentStore.b(file, i, 0, i, TranscodingState.GALLERY_NOT_TRANSCODED, 1.0f, null);
        ClipsDraftPersistentStore clipsDraftPersistentStore3 = this.this$0.a;
        List singletonList = Collections.singletonList(bVar);
        clipsDraftPersistentStore3.getClass();
        ClipsDraftVk z = ClipsDraftPersistentStore.z(singletonList);
        ClipsDraftPersistentStore.d(this.this$0.a);
        this.this$0.a.getClass();
        ClipsDraftPersistentStore.w(z);
        this.this$0.a.getClass();
        ClipsDraftPersistentStore.t();
        return s3q0.a;
    }
}
