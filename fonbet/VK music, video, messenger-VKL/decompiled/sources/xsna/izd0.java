package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;

/* compiled from: ProfilePhotoViewerCallback.kt */
/* loaded from: classes5.dex */
public final class izd0 implements ImageViewer.a {
    public int a;
    public String b;
    public int c;
    public final i0u0 d;
    public final int e;
    public final ArrayList f;
    public final wzs<Integer, String, io.reactivex.rxjava3.core.q<VKList<Photo>>> g;
    public ImageViewer.c<Photo> h;
    public boolean i;
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();

    public izd0(int i, String str, int i2, oyr oyrVar, int i3, ArrayList arrayList, wzs wzsVar) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = oyrVar;
        this.e = i3;
        this.f = arrayList;
        this.g = wzsVar;
    }

    @Override // com.vk.bridges.ImageViewer.a
    public final View c(int i) {
        RecyclerView.e0 findViewHolderForAdapterPosition;
        i0u0 i0u0Var = this.d;
        View view = i0u0Var != null ? i0u0Var.get() : null;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
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
        io.reactivex.rxjava3.core.q<VKList<Photo>> invoke = this.g.invoke(Integer.valueOf(i), this.b);
        fl30 fl30Var = new fl30(new ebx(this, 23), 17);
        invoke.getClass();
        io.reactivex.rxjava3.internal.operators.observable.b0 G = new io.reactivex.rxjava3.internal.operators.observable.c0(invoke, fl30Var, io.reactivex.rxjava3.internal.functions.a.c).G(new ot1(this, 5));
        gl30 gl30Var = new gl30(new xc50(this, 12), 16);
        int i2 = kwg0.a;
        this.j.b(G.subscribe(gl30Var, new iwg0()));
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
