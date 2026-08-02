package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;

/* compiled from: CommunityProfilePhotoViewerCallback.kt */
/* loaded from: classes5.dex */
public final class dsh implements ImageViewer.a {
    public int a;
    public String b;
    public int c;
    public final jpf d;
    public final int e;
    public final ArrayList f;
    public final yde g;
    public ImageViewer.c<Photo> h;
    public boolean i;
    public final io.reactivex.rxjava3.disposables.b j;

    public dsh(int i, String str, int i2, jpf jpfVar, int i3, yde ydeVar) {
        ArrayList arrayList = new ArrayList();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = jpfVar;
        this.e = i3;
        this.f = arrayList;
        this.g = ydeVar;
        this.j = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final View c(int i) {
        RecyclerView.e0 findViewHolderForAdapterPosition;
        Object invoke = this.d.invoke();
        RecyclerView recyclerView = invoke instanceof RecyclerView ? (RecyclerView) invoke : null;
        if (recyclerView == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i + this.e)) == null) {
            return null;
        }
        return findViewHolderForAdapterPosition.itemView;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Rect d(int i) {
        return null;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final Integer f() {
        return Integer.valueOf(this.c);
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
    public final void o() {
        int i = this.a;
        if (i >= this.c || this.i) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.observable.b0 G = new io.reactivex.rxjava3.internal.operators.observable.c0((io.reactivex.rxjava3.core.q) this.g.invoke(Integer.valueOf(i), this.b), new ga(new wzf(this, 3), 21), io.reactivex.rxjava3.internal.functions.a.c).G(new jf1(this, 2));
        lf1 lf1Var = new lf1(new kf1(this, 25), 16);
        int i2 = kwg0.a;
        this.j.b(G.subscribe(lf1Var, new iwg0()));
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final void onDismiss() {
        this.j.e();
        this.h = null;
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
