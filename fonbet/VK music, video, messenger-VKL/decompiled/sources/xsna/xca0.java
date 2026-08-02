package xsna;

import com.vk.content.design.view.photo.tags.PhotoTagsPreviewView;

/* compiled from: PhotoTagsPreviewView.kt */
/* loaded from: classes17.dex */
public final class xca0 implements b780 {
    public final /* synthetic */ PhotoTagsPreviewView b;

    public xca0(PhotoTagsPreviewView photoTagsPreviewView) {
        this.b = photoTagsPreviewView;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        PhotoTagsPreviewView photoTagsPreviewView = this.b;
        int i = photoTagsPreviewView.i - 1;
        photoTagsPreviewView.i = i;
        if (i <= 0) {
            gzs<s3q0> gzsVar = photoTagsPreviewView.j;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            photoTagsPreviewView.i = 0;
        }
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        PhotoTagsPreviewView photoTagsPreviewView = this.b;
        int i3 = photoTagsPreviewView.i - 1;
        photoTagsPreviewView.i = i3;
        if (i3 <= 0) {
            gzs<s3q0> gzsVar = photoTagsPreviewView.j;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            photoTagsPreviewView.i = 0;
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
