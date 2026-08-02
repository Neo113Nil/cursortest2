package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.dto.common.id.UserId;
import com.vk.media.MediaUtils;
import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsDraftsInteractor.kt */
/* loaded from: classes17.dex */
public interface mud {
    Object a(ContinuationImpl continuationImpl);

    void b();

    void c();

    Object d(File file, MediaUtils.f fVar, hgf hgfVar);

    void e();

    void f(ClipsUploadDataInternal clipsUploadDataInternal, UserId userId);
}
