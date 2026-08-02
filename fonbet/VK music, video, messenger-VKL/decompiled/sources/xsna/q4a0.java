package xsna;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.imagepipeline.request.ImageRequest;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.bst0;
import xsna.fnw;
import xsna.fzt;
import xsna.sns0;

/* compiled from: PhotoAdapter.kt */
/* loaded from: classes3.dex */
public final class q4a0 extends PagerAdapter {
    public final View b;
    public final View c;
    public final LayoutInflater d;
    public final PhotoViewer.b e;
    public final PhotoViewer f;
    public final xy80 g;
    public final boolean h;
    public PhotoViewer.q i;
    public final ArrayList j;
    public boolean o;
    public Integer p;
    public final SparseArray<ggs> k = new SparseArray<>();
    public final SparseArray<ClippingImageView> l = new SparseArray<>();
    public final SparseBooleanArray m = new SparseBooleanArray();
    public final SparseBooleanArray n = new SparseBooleanArray();
    public final SparseArray<ViewTreeObserver.OnPreDrawListener> q = new SparseArray<>();

    /* compiled from: PhotoAdapter.kt */
    public final class a implements ViewTreeObserver.OnPreDrawListener {
        public final RectF b = new RectF();

        public a() {
        }

        public static boolean a(float f, float f2) {
            return ((double) Math.abs(f - f2)) < 0.001d;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            q4a0 q4a0Var = q4a0.this;
            PhotoViewer.q qVar = q4a0Var.i;
            RectF a = qVar != null ? qVar.a() : null;
            RectF rectF = this.b;
            if (a != null && a(a.left, rectF.left) && a(a.right, rectF.right) && a(a.top, rectF.top) && a(a.bottom, rectF.bottom)) {
                return true;
            }
            q4a0Var.b.invalidate();
            q4a0Var.c.invalidate();
            if (a == null) {
                return true;
            }
            rectF.set(a);
            return true;
        }
    }

    /* compiled from: PhotoAdapter.kt */
    public final class b implements fzt.a {
        public b() {
        }

        public final void a() {
            q4a0.this.f.n(null);
        }
    }

    /* compiled from: PhotoAdapter.kt */
    public final class c implements fnw.a {
        public c() {
        }

        @Override // xsna.fnw.a
        public final void a(PointF pointF) {
            q4a0.this.f.n(pointF);
        }

        @Override // xsna.fnw.a
        public final void b(int i) {
            q4a0.this.f.c.b(i);
        }

        @Override // xsna.fnw.a
        public final void d(int i) {
            q4a0 q4a0Var = q4a0.this;
            q4a0Var.m.put(i, true);
            q4a0Var.c(i);
        }

        @Override // xsna.fnw.a
        public final boolean e(int i) {
            PhotoViewer photoViewer = q4a0.this.f;
            return photoViewer.l != null && photoViewer.r == i;
        }

        @Override // xsna.fnw.a
        public final void f(PointF pointF) {
            q4a0.this.f.n(pointF);
        }

        @Override // xsna.fnw.a
        public final void i(int i) {
            q4a0.this.f.c.i(i);
        }
    }

    /* compiled from: PhotoAdapter.kt */
    public final class d {
        public d() {
        }
    }

    /* compiled from: PhotoAdapter.kt */
    public final class e implements bst0.a {
        public e() {
        }

        public final boolean a() {
            return q4a0.this.f.D.getVisibility() == 0;
        }
    }

    /* compiled from: PhotoAdapter.kt */
    public final class f implements sns0.a {
        public f() {
        }

        @Override // xsna.sns0.a
        public final void a(int i) {
            q4a0.this.m.put(i, true);
        }
    }

    public q4a0(ArrayList arrayList, View view, View view2, LayoutInflater layoutInflater, PhotoViewer.b bVar, PhotoViewer photoViewer, xy80 xy80Var, boolean z) {
        this.b = view;
        this.c = view2;
        this.d = layoutInflater;
        this.e = bVar;
        this.f = photoViewer;
        this.g = xy80Var;
        this.h = z;
        this.j = new ArrayList(arrayList);
    }

    public final ArrayList b(int i) {
        List<View> list;
        ggs ggsVar = this.k.get(i);
        if (ggsVar == null || (list = ggsVar.getViewsForTranslate()) == null) {
            list = EmptyList.b;
        }
        Integer num = this.p;
        ClippingImageView clippingImageView = this.l.get(num != null ? num.intValue() : 0);
        return j5g.u0(list, clippingImageView != null ? Collections.singletonList(clippingImageView) : EmptyList.b);
    }

    public final void c(int i) {
        ClippingImageView clippingImageView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        if (!this.o || !this.m.get(i) || (clippingImageView = this.l.get(i)) == null || (animate = clippingImageView.animate()) == null || (duration = animate.setDuration(50L)) == null) {
            return;
        }
        duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ggs ggsVar;
        ViewTreeObserver viewTreeObserver;
        viewGroup.removeView((View) obj);
        SparseArray<ViewTreeObserver.OnPreDrawListener> sparseArray = this.q;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = sparseArray.get(i);
        SparseArray<ggs> sparseArray2 = this.k;
        if (onPreDrawListener != null && (ggsVar = sparseArray2.get(i)) != null && (viewTreeObserver = ggsVar.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
        sparseArray.remove(i);
        ggs ggsVar2 = sparseArray2.get(i);
        if (ggsVar2 != null) {
            ggsVar2.a();
        }
        sparseArray2.remove(i);
        this.l.remove(i);
        this.e.y(i, viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.j.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        View l = awt0.l((ViewGroup) obj, new kpr(15));
        ggs ggsVar = l instanceof ggs ? (ggs) l : null;
        if (ggsVar == null) {
            return super.getItemPosition(obj);
        }
        int position = ggsVar.getPosition();
        Iterator it = this.j.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(ggsVar.getMedia(), (PhotoViewer.g) it.next())) {
                break;
            }
            i++;
        }
        if (i == position) {
            return position;
        }
        int position2 = i - ggsVar.getPosition();
        if (position2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray<ggs> sparseArray = this.k;
        for (int size = sparseArray.size() - 1; -1 < size; size--) {
            int keyAt = sparseArray.keyAt(size);
            int i2 = keyAt + position2;
            ggs valueAt = sparseArray.valueAt(size);
            valueAt.setPosition(i2);
            sparseArray.put(i2, valueAt);
            sparseArray.remove(keyAt);
        }
        SparseArray<ClippingImageView> sparseArray2 = this.l;
        for (int size2 = sparseArray2.size() - 1; -1 < size2; size2--) {
            int keyAt2 = sparseArray2.keyAt(size2);
            sparseArray2.put(keyAt2 + position2, sparseArray2.valueAt(size2));
            sparseArray2.remove(keyAt2);
        }
        SparseBooleanArray sparseBooleanArray = this.m;
        for (int size3 = sparseBooleanArray.size() - 1; -1 < size3; size3--) {
            int keyAt3 = sparseBooleanArray.keyAt(size3);
            boolean valueAt2 = sparseBooleanArray.valueAt(size3);
            sparseBooleanArray.put(keyAt3 + position2, valueAt2);
            int indexOfKey = sparseBooleanArray.indexOfKey(keyAt3);
            if (indexOfKey >= 0 && valueAt2 == sparseBooleanArray.valueAt(indexOfKey)) {
                sparseBooleanArray.delete(keyAt3);
            }
        }
        SparseBooleanArray sparseBooleanArray2 = this.n;
        for (int size4 = sparseBooleanArray2.size() - 1; -1 < size4; size4--) {
            int keyAt4 = sparseBooleanArray2.keyAt(size4);
            boolean valueAt3 = sparseBooleanArray2.valueAt(size4);
            sparseBooleanArray2.put(keyAt4 + position2, valueAt3);
            int indexOfKey2 = sparseBooleanArray2.indexOfKey(keyAt4);
            if (indexOfKey2 >= 0 && valueAt3 == sparseBooleanArray2.valueAt(indexOfKey2)) {
                sparseBooleanArray2.delete(keyAt4);
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b9  */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ClippingImageView clippingImageView;
        ggs fnwVar;
        boolean z;
        ImageRequest K;
        PhotoViewer.g gVar = (PhotoViewer.g) this.j.get(i);
        ViewGroup viewGroup2 = (ViewGroup) this.d.inflate(R.layout.viewer_container, viewGroup, false);
        ClippingImageView clippingImageView2 = (ClippingImageView) viewGroup2.findViewById(R.id.pv_preview_image);
        boolean z2 = gVar instanceof PhotoViewer.h;
        PhotoViewer.b bVar = this.e;
        if (z2) {
            PhotoViewer.h hVar = (PhotoViewer.h) gVar;
            fnwVar = new k120(viewGroup2.getContext(), i, Long.valueOf(hVar.y()), hVar, new d(), this.g);
        } else if (gVar instanceof PhotoViewer.m) {
            fnwVar = new bst0(viewGroup2.getContext(), i, (PhotoViewer.m) gVar, new e());
        } else {
            if (!(gVar instanceof PhotoViewer.e)) {
                if (gVar instanceof PhotoViewer.n) {
                    clippingImageView = clippingImageView2;
                    fnwVar = new sns0(viewGroup2.getContext(), i, (PhotoViewer.n) gVar, new f(), clippingImageView, new as4(i, this));
                } else {
                    clippingImageView = clippingImageView2;
                    if (!(gVar instanceof PhotoViewer.f)) {
                        throw new IllegalStateException("unknown FrameViewerPage type");
                    }
                    fnwVar = new fnw(viewGroup2.getContext(), i, (PhotoViewer.f) gVar, new c(), clippingImageView, bVar.O(), bVar.l(), this.h);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                z = fnwVar instanceof sns0;
                if (z) {
                    layoutParams.gravity = 17;
                    s3q0 s3q0Var = s3q0.a;
                }
                viewGroup2.addView(fnwVar, layoutParams);
                if (z) {
                    viewGroup2.setOnClickListener(new c98(this, 8));
                }
                String I = bVar.I(gVar);
                clippingImageView.getHierarchy().q(0);
                lpa0 lpa0Var = rhs.a().get();
                ListBuilder e2 = e43.e();
                e2.add(bVar.x(viewGroup.getContext(), I, gVar));
                K = bVar.K(gVar);
                if (K != null) {
                    e2.add(K);
                }
                s3q0 s3q0Var2 = s3q0.a;
                lpa0Var.k(e2.g().toArray(new ImageRequest[0]));
                yiz.b(lpa0Var, viewGroup.getContext(), null);
                lpa0Var.h = new p4a0(this, i, clippingImageView);
                clippingImageView.setController(lpa0Var.b());
                this.l.put(i, clippingImageView);
                a aVar = new a();
                this.q.put(i, aVar);
                viewGroup2.getViewTreeObserver().addOnPreDrawListener(aVar);
                viewGroup.addView(viewGroup2);
                this.k.put(i, fnwVar);
                return viewGroup2;
            }
            fnwVar = new fzt(viewGroup2.getContext(), i, (PhotoViewer.e) gVar, new b());
        }
        clippingImageView = clippingImageView2;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        z = fnwVar instanceof sns0;
        if (z) {
        }
        viewGroup2.addView(fnwVar, layoutParams2);
        if (z) {
        }
        String I2 = bVar.I(gVar);
        clippingImageView.getHierarchy().q(0);
        lpa0 lpa0Var2 = rhs.a().get();
        ListBuilder e22 = e43.e();
        e22.add(bVar.x(viewGroup.getContext(), I2, gVar));
        K = bVar.K(gVar);
        if (K != null) {
        }
        s3q0 s3q0Var22 = s3q0.a;
        lpa0Var2.k(e22.g().toArray(new ImageRequest[0]));
        yiz.b(lpa0Var2, viewGroup.getContext(), null);
        lpa0Var2.h = new p4a0(this, i, clippingImageView);
        clippingImageView.setController(lpa0Var2.b());
        this.l.put(i, clippingImageView);
        a aVar2 = new a();
        this.q.put(i, aVar2);
        viewGroup2.getViewTreeObserver().addOnPreDrawListener(aVar2);
        viewGroup.addView(viewGroup2);
        this.k.put(i, fnwVar);
        return viewGroup2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        ggs ggsVar;
        super.setPrimaryItem(viewGroup, i, obj);
        Integer num = this.p;
        if ((num == null || num.intValue() != i) && (ggsVar = this.k.get(i)) != null) {
            ggsVar.c();
        }
        this.p = Integer.valueOf(i);
    }
}
