package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.dto.common.id.UserId;
import com.vk.media.MediaUtils;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsDraftsInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class qud implements mud {
    public final ClipsDraftPersistentStore a = ClipsDraftPersistentStore.b;

    @Override // xsna.mud
    public final Object a(ContinuationImpl continuationImpl) {
        return myc0.k(hqu0.b(), new oud(this, null), continuationImpl);
    }

    @Override // xsna.mud
    public final void b() {
        ClipsDraftPersistentStore.d(this.a);
    }

    @Override // xsna.mud
    public final void c() {
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        this.a.getClass();
        ClipsDraftPersistentStore.p(true);
    }

    @Override // xsna.mud
    public final Object d(File file, MediaUtils.f fVar, hgf hgfVar) {
        Object k = myc0.k(hqu0.b(), new pud(this, file, fVar, null), hgfVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // xsna.mud
    public final void e() {
        this.a.getClass();
        ClipsDraftPersistentStore.t();
    }

    @Override // xsna.mud
    public final void f(ClipsUploadDataInternal clipsUploadDataInternal, UserId userId) {
        wqb wqbVar = new wqb(2, clipsUploadDataInternal, userId);
        this.a.getClass();
        ClipsDraftVk k = ClipsDraftPersistentStore.k();
        if (k != null) {
            wqbVar.invoke(k);
        }
        e();
    }
}
