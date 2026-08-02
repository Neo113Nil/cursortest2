package xsna;

import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadingInteractorImpl$observeVideoIdReady$$inlined$transform$1;

/* compiled from: ClipsUploadingInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class vlf implements ulf {
    public final eef a;
    public final a3f b;

    public vlf(eef eefVar, a3f a3fVar) {
        this.a = eefVar;
        this.b = a3fVar;
    }

    @Override // xsna.ulf
    public final void a(ClipUploadData clipUploadData) {
        this.a.g(Integer.valueOf(clipUploadData.d), this.b.a(clipUploadData));
    }

    @Override // xsna.ulf
    public final void c(ClipUploadData clipUploadData) {
        clipUploadData.d = this.a.h(clipUploadData.c).b;
    }

    @Override // xsna.ulf
    public final void d(int i, String str) {
        this.a.d(i);
    }

    @Override // xsna.ulf
    public final izg0 e(int i) {
        return new izg0(new ClipsUploadingInteractorImpl$observeVideoIdReady$$inlined$transform$1(cdn.a(this.a.b()), null, i));
    }
}
