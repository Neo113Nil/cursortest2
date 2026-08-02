package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.photo.Photo;

/* compiled from: ImageViewerCallback.kt */
/* loaded from: classes2.dex */
public class wmw implements ImageViewer.a {
    public final izs<Integer, View> a;
    public final gzs<Rect> b;
    public final gzs<s3q0> c;
    public final gzs<s3q0> d;
    public final gzs<s3q0> e;
    public final ImageViewer.ControlsOptions f;

    /* JADX WARN: Multi-variable type inference failed */
    public wmw(izs<? super Integer, ? extends View> izsVar, gzs<Rect> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3, gzs<s3q0> gzsVar4, boolean z) {
        this.a = izsVar;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = gzsVar3;
        this.e = gzsVar4;
        this.f = new ImageViewer.ControlsOptions(z, z, null, 252);
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void a() {
        this.c.invoke();
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final View c(int i) {
        return this.a.invoke(Integer.valueOf(i));
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Rect d(int i) {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Integer f() {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Rect g() {
        return this.b.invoke();
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final boolean h() {
        return true;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final String i() {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Context j() {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final String m(int i, int i2) {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public void onDismiss() {
        this.e.invoke();
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void p() {
        this.d.invoke();
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final float[] q(int i) {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public ImageViewer.d r() {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final boolean s() {
        return true;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public ImageViewer.ControlsOptions u() {
        return this.f;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void o() {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void b(int i) {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void e(int i) {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public void n(int i) {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void t(Photo photo) {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
    }
}
