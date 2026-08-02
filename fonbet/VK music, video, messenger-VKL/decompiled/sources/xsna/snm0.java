package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.photo.Photo;
import xsna.rnm0;

/* compiled from: StoryViewerRouterImpl.kt */
/* loaded from: classes6.dex */
public final class snm0 implements ImageViewer.a {
    public final /* synthetic */ rnm0 a;
    public final /* synthetic */ gzs<s3q0> b;
    public final /* synthetic */ gzs<s3q0> c;

    public snm0(rnm0 rnm0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.a = rnm0Var;
        this.b = gzsVar;
        this.c = gzsVar2;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void a() {
        rnm0 rnm0Var = this.a;
        rnm0.a aVar = rnm0Var.e;
        rnm0Var.e = aVar != null ? rnm0.a.a(aVar, null, 27) : null;
        this.b.invoke();
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final View c(int i) {
        return null;
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
        return null;
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
    public final void onDismiss() {
        this.a.e = null;
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final float[] q(int i) {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final ImageViewer.d r() {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final boolean s() {
        return false;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void o() {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void p() {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void b(int i) {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void e(int i) {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void n(int i) {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void t(Photo photo) {
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
    }
}
