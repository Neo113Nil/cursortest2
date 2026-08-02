package xsna;

import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import com.vk.dto.common.id.UserId;
import java.io.File;

/* compiled from: ClipsEditorProcessingDelegate.kt */
/* loaded from: classes16.dex */
public interface gzd {
    void a(com.vk.clips.editor.state.model.a aVar, ClipsEditorUploadParams clipsEditorUploadParams);

    void b(com.vk.clips.editor.state.model.a aVar, UserId userId, File file, azd azdVar);

    void dispose();
}
