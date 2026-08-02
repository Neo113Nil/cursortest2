package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;

/* compiled from: PhotoViewerCallback.kt */
/* loaded from: classes4.dex */
public final class dea0 implements ImageViewer.a {
    public int a;
    public int b;
    public String c;
    public final izs<Integer, View> d;
    public final gzs<Rect> e;
    public final wzs<String, Integer, io.reactivex.rxjava3.core.q<VKList<Photo>>> f;
    public final gzs<s3q0> g;
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public boolean i;
    public ImageViewer.c<Photo> j;

    public dea0(int i, int i2, String str, izs izsVar, gzs gzsVar, wzs wzsVar, wf40 wf40Var) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = izsVar;
        this.e = gzsVar;
        this.f = wzsVar;
        this.g = wf40Var;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final View c(int i) {
        return this.d.invoke(Integer.valueOf(i));
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Rect d(int i) {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Integer f() {
        return Integer.valueOf(this.a);
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Rect g() {
        return this.e.invoke();
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
    public final void o() {
        int i = this.b;
        if (i >= this.a || this.i) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.observable.b0 G = new io.reactivex.rxjava3.internal.operators.observable.c0(this.f.invoke(this.c, Integer.valueOf(i)).a0(asu0.a.d()), new jw80(new qw30(this, 14), 1), io.reactivex.rxjava3.internal.functions.a.c).G(new nt1(this, 5));
        hms hmsVar = new hms(new qi00(this, 20), 22);
        int i2 = kwg0.a;
        this.h.b(G.subscribe(hmsVar, new iwg0()));
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void onDismiss() {
        this.h.e();
        gzs<s3q0> gzsVar = this.g;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.j = null;
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
        return true;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void a() {
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
