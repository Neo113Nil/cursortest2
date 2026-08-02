package xsna;

import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: PhotoEditorLargePickerPreviewView.kt */
/* loaded from: classes5.dex */
public final class q6a0 implements u6a0 {
    public final /* synthetic */ com.vk.preview.presentation.view.c b;

    public q6a0(com.vk.preview.presentation.view.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.t4d0
    public final void a(MediaStoreEntry mediaStoreEntry) {
        u6a0 u6a0Var = this.b.c;
        if (u6a0Var != null) {
            u6a0Var.a(mediaStoreEntry);
        }
    }

    @Override // xsna.u6a0
    public final void f(MediaStoreEntry mediaStoreEntry) {
        u6a0 u6a0Var = this.b.c;
        if (u6a0Var != null) {
            u6a0Var.f(mediaStoreEntry);
        }
    }
}
