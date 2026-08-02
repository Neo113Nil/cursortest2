package xsna;

import android.graphics.Bitmap;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import xsna.zjw;

/* compiled from: SeekPreviewImageView.kt */
/* loaded from: classes8.dex */
public final class s3i0 implements zjw.a {
    public final /* synthetic */ SeekPreviewImageView a;
    public final /* synthetic */ Object b;

    public s3i0(SeekPreviewImageView seekPreviewImageView, Object obj) {
        this.a = seekPreviewImageView;
        this.b = obj;
    }

    @Override // xsna.zjw.a
    public final void a(Bitmap bitmap) {
        SeekPreviewImageView seekPreviewImageView = this.a;
        if (seekPreviewImageView.n != this.b) {
            return;
        }
        seekPreviewImageView.m = null;
        seekPreviewImageView.n = null;
        seekPreviewImageView.U();
        seekPreviewImageView.setImageBitmap(bitmap);
    }

    @Override // xsna.zjw.a
    public final void onError() {
        SeekPreviewImageView seekPreviewImageView = this.a;
        if (seekPreviewImageView.n != this.b) {
            return;
        }
        seekPreviewImageView.m = null;
        seekPreviewImageView.n = null;
        seekPreviewImageView.U();
        seekPreviewImageView.setImageBitmap(null);
    }
}
