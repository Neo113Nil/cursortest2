package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PhotoViewerLayout;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.ej0;

/* compiled from: ViewController.kt */
/* loaded from: classes4.dex */
public final class uut0 {
    public final j9a0 a;
    public final rei0 b;
    public final int c;
    public PhotoGalleryView.a d;
    public final f5t e;
    public final int f;
    public boolean g;
    public io.reactivex.rxjava3.disposables.c h;
    public final Handler i;
    public final k5t j;
    public final io.reactivex.rxjava3.disposables.c k;

    public uut0(j9a0 j9a0Var, rei0 rei0Var, int i, int i2, f5t f5tVar) {
        this.a = j9a0Var;
        this.b = rei0Var;
        this.c = i;
        PhotoGalleryView.a.a.getClass();
        this.d = PhotoGalleryView.a.C1472a.b;
        this.e = f5tVar;
        this.f = 100;
        this.h = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        this.i = new Handler(Looper.getMainLooper());
        this.j = new k5t(0);
        j9a0Var.l = this;
        if (!hg1.d(this.k) && (f5tVar instanceof LocalGalleryProvider)) {
            this.k = ((LocalGalleryProvider) f5tVar).observeLocalGalleryContentChangePaginated(100).a0(asu0.a.d()).subscribe(new jsb0(new f6m0(this, 17), 18));
        }
    }

    public final void a(wc1 wc1Var, int i) {
        if (this.g) {
            return;
        }
        this.h.dispose();
        io.reactivex.rxjava3.core.q<wc1> loadDefaultAlbum = this.e.loadDefaultAlbum();
        aas0 aas0Var = new aas0(new b8e(this, i, 3), 2);
        loadDefaultAlbum.getClass();
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.h = new io.reactivex.rxjava3.internal.operators.observable.c0(loadDefaultAlbum, aas0Var, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).E(new k5j0(new pm90(11, this, wc1Var), 18), io.reactivex.rxjava3.internal.functions.a.d, kVar, kVar).v(new k6c0(new yl9(this, i), 12), true, io.reactivex.rxjava3.core.g.b).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xj50(new mdm0(this, 20), 24), new x150(new qjg0(this, 20), 20), new cdd(this, 4));
    }

    public final void b(q4t q4tVar, int i) {
        ej0 ej0Var = this.a.d;
        PhotoGalleryView.b g = this.d.g();
        if (!(g instanceof PhotoGalleryView.b.a)) {
            if (!(g instanceof PhotoGalleryView.b.c) && !(g instanceof PhotoGalleryView.b.C1474b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        wc1 b = this.j.b();
        rei0 rei0Var = this.b;
        if (rei0Var.c(q4tVar)) {
            g5g.D(rei0Var.a, true, new b8e0(q4tVar, 5));
            ArrayList<mdi0> arrayList = rei0Var.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator<mdi0> it = arrayList.iterator();
            while (it.hasNext()) {
                mdi0 next = it.next();
                if (next.b.equals(b)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((mdi0) it2.next()).c));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ej0Var.notifyItemChanged(((Number) it3.next()).intValue(), Boolean.TRUE);
            }
        } else {
            rei0Var.a.add(new mdi0(q4tVar, b, i));
        }
        ej0Var.notifyItemChanged(i, Boolean.TRUE);
        ((PhotoGalleryView.b.a) g).b.invoke(rei0Var.a());
    }

    /* compiled from: ViewController.kt */
    public final class a implements PhotoViewer.b {
        public a() {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View B(fnw fnwVar, int i) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View D(PhotoViewerLayout photoViewerLayout) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View E(ViewGroup viewGroup, int i, gzs<s3q0> gzsVar) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final int F(int i) {
            return 0;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void H(PhotoViewer photoViewer) {
            uut0.this.d.c(photoViewer);
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean J() {
            return true;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final ImageRequest K(PhotoViewer.g gVar) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final float[] L() {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean N() {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean O() {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final Rect a() {
            return uut0.this.d.a();
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final View c(int i) {
            j9a0 j9a0Var = uut0.this.a;
            ej0 ej0Var = j9a0Var.d;
            RecyclerView recyclerView = j9a0Var.h;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            ej0Var.getClass();
            ej0.b bVar = findViewHolderForAdapterPosition instanceof ej0.b ? (ej0.b) findViewHolderForAdapterPosition : null;
            if (bVar != null) {
                return bVar.l;
            }
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final Integer f() {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final Rect g() {
            j9a0 j9a0Var = uut0.this.a;
            j9a0Var.getClass();
            RectF rectF = PhotoViewer.U;
            RecyclerView recyclerView = j9a0Var.h;
            if (recyclerView == null) {
                recyclerView = null;
            }
            if (recyclerView != null) {
                return znk0.y(recyclerView);
            }
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean h() {
            return true;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final WindowManager.LayoutParams k() {
            WindowManager.LayoutParams f = uut0.this.d.f();
            if (f != null) {
                return f;
            }
            RectF rectF = PhotoViewer.U;
            return PhotoViewer.c.a();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean l() {
            return true;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final String m(int i, int i2) {
            uut0.this.d.getClass();
            return super.m(i, i2);
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void n(int i, PhotoViewer.q qVar) {
            uut0.this.d.b(i);
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void onDismiss() {
            uut0.this.d.h();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final String p(int i, int i2) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final float[] r(int i) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View s(ViewGroup viewGroup) {
            return uut0.this.d.e(viewGroup);
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean t(int i) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean u(int i) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean v() {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean w(PhotoViewer.g gVar, int i, MenuItem menuItem, View view) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final ImageRequest x(Context context, String str, PhotoViewer.g gVar) {
            ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
            int i = uut0.this.c / 2;
            h.d = i <= 0 ? null : new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i, 12);
            return h.a();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final int z() {
            return 0;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void A() {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void C(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void P(boolean z) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void b(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void i(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void j(PhotoViewer photoViewer) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void M(ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void y(int i, ViewGroup viewGroup) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void o(PhotoViewer.g gVar, int i, Menu menu) {
        }
    }
}
