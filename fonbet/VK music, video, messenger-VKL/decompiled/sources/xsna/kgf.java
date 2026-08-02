package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.MoveFileException;
import com.vk.core.files.a;

/* compiled from: ClipsUploadInitCompactExecutor.kt */
/* loaded from: classes17.dex */
public final class kgf implements a.b.InterfaceC0765a {
    @Override // com.vk.core.files.a.b.InterfaceC0765a
    public final void onError(Throwable th) {
        String str;
        if (th == null || (str = th.getMessage()) == null) {
            str = "Could not copy file";
        }
        throw new MoveFileException(str);
    }

    @Override // com.vk.core.files.a.b.InterfaceC0765a
    public final void onComplete() {
    }

    @Override // com.vk.core.files.a.b.InterfaceC0765a
    public final void onStart() {
    }
}
