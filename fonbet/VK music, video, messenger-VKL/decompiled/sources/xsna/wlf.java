package xsna;

import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1;

/* compiled from: ClipsUploadingInteractorImplOld.kt */
/* loaded from: classes17.dex */
public final class wlf implements ulf {
    public final ylf a;

    public wlf(ylf ylfVar) {
        this.a = ylfVar;
    }

    @Override // xsna.ulf
    public final void a(ClipUploadData clipUploadData) {
        this.a.a(clipUploadData);
    }

    @Override // xsna.ulf
    public final void c(ClipUploadData clipUploadData) {
        this.a.c(clipUploadData);
    }

    @Override // xsna.ulf
    public final void d(int i, String str) {
        this.a.d(i, str);
    }

    @Override // xsna.ulf
    public final izg0 e(int i) {
        return new izg0(new ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1(cdn.a(this.a.b()), null, i));
    }
}
