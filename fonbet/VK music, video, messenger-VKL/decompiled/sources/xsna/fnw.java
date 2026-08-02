package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.core.apps.BuildInfo;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.f5h0;
import xsna.q4a0;

/* compiled from: ImageViewerPage.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class fnw extends ggs {
    public final PhotoViewer.f d;
    public final q4a0.c e;
    public final ClippingImageView f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public d7n k;
    public final FragmentActivity l;
    public final fir0 m;
    public final View n;
    public final View o;
    public final View p;

    /* compiled from: ImageViewerPage.kt */
    public interface a {
        void a(PointF pointF);

        void b(int i);

        void d(int i);

        boolean e(int i);

        void f(PointF pointF);

        void i(int i);
    }

    public fnw(Context context, int i, PhotoViewer.f fVar, q4a0.c cVar, ClippingImageView clippingImageView, boolean z, boolean z2, boolean z3) {
        super(context, i, fVar);
        this.d = fVar;
        this.e = cVar;
        this.f = clippingImageView;
        this.g = z;
        this.h = z2;
        this.i = z3;
        bpn0 bpn0Var = enj.a;
        this.l = (FragmentActivity) e3m.h(context);
        PointF pointF = new PointF();
        final fir0 fir0Var = new fir0(getContext());
        fir0Var.setId(R.id.zoomable_image);
        fir0Var.setActualScaleType(f5h0.i.a);
        fir0Var.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.dnw
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (i5 == i9 && i4 == i8) {
                    return;
                }
                fir0.this.m.i(1.0f);
            }
        });
        fir0Var.setImageListener(new hnw(pointF, this));
        int i2 = 0;
        fir0Var.setZoomable(false);
        fir0Var.getHierarchy().q(0);
        fir0Var.getHierarchy().p(new waa0(), 3);
        this.m = fir0Var;
        obh obhVar = new obh(this, 14);
        q4a0 q4a0Var = q4a0.this;
        View G = q4a0Var.e.G(this, obhVar);
        this.n = G;
        Object d = fVar.d();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            fir0Var.setTag(R.id.zoomable_image, d);
        }
        addView(fir0Var, -1, -1);
        int i3 = 4;
        if (G != null) {
            addView(G, -1, -1);
            G.setOnClickListener(new rg0(this, i3));
        }
        if (q4a0Var.e.t(i)) {
            View B = q4a0Var.e.B(this, i);
            this.p = B;
            if (B != null) {
                addView(B, -1, -1);
                B.setOnClickListener(new cnw(this, i2));
            }
            setLoading(fir0Var);
            return;
        }
        if (!q4a0Var.e.u(i)) {
            setLoading(fir0Var);
            return;
        }
        View E = q4a0Var.e.E(this, i, new btm(this, 15));
        this.o = E;
        if (E != null) {
            addView(E, -1, -1);
            E.setOnClickListener(new kn9(this, i3));
        }
        this.j = 3;
        fir0Var.setVisibility(8);
        if (G != null) {
            G.setVisibility(8);
        }
        clippingImageView.setVisibility(4);
    }

    public static s3q0 e(fnw fnwVar) {
        fnwVar.setLoading(fnwVar.m);
        return s3q0.a;
    }

    public static s3q0 f(fnw fnwVar) {
        View view = fnwVar.o;
        if (view != null) {
            twt0.c(view, 250L, null, 6);
        }
        fnwVar.setLoading(fnwVar.m);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    private final void setLoading(fir0 fir0Var) {
        this.j = 0;
        dlo controller = fir0Var.getController();
        lpa0 lpa0Var = rhs.a().get();
        lpa0Var.l = controller;
        PhotoViewer.f fVar = this.d;
        boolean z = this.g;
        if (z) {
            List<String> f = fVar.f();
            ArrayList arrayList = new ArrayList(c5g.u(f, 10));
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse((String) it.next()));
                h.j = Priority.MEDIUM;
                arrayList.add(h.a());
            }
            lpa0Var.k((ImageRequest[]) arrayList.toArray(new ImageRequest[0]));
        }
        if (!z) {
            ImageRequestBuilder h2 = ImageRequestBuilder.h(Uri.parse(fVar.e()));
            h2.j = Priority.MEDIUM;
            lpa0Var.c = h2.a();
        }
        lpa0Var.i = true;
        lpa0Var.h = new gnw(this);
        fir0Var.setController(lpa0Var.b());
        fir0Var.setVisibility(0);
        View view = this.n;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // xsna.ggs
    public final void a() {
        removeCallbacks(this.k);
    }

    @Override // xsna.ggs
    public final void b() {
        g(this.i);
    }

    @Override // xsna.ggs
    public final void c() {
        if (this.j == 2 && enj.n(getContext())) {
            setLoading(this.m);
        }
        g(!this.h);
    }

    public final void g(boolean z) {
        FragmentActivity fragmentActivity = this.l;
        if (fragmentActivity.getIntent().getBooleanExtra("app_content_hidden", false)) {
            return;
        }
        if (z) {
            fragmentActivity.getWindow().addFlags(8192);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentActivity.getWindow().clearFlags(8192);
        }
    }

    public final a getCallback() {
        return this.e;
    }

    public final RectF getDisplayRect() {
        return this.m.getDisplayRect();
    }

    public final PhotoViewer.f getImage() {
        return this.d;
    }

    public final View getPreviewView() {
        return this.f;
    }

    public final boolean getResetContentSensitivity() {
        return this.i;
    }

    public final float getScale() {
        return this.m.getScale();
    }

    public final Matrix getTransformMatrix() {
        return this.m.getTransformMatrix();
    }

    @Override // xsna.ggs
    public List<View> getViewsForTranslate() {
        return Collections.singletonList(this);
    }

    public final void setScale(float f) {
        this.m.setScale(f);
    }

    public final void setZoomable(boolean z) {
        this.m.setZoomable(z);
    }

    private static /* synthetic */ void getState$annotations() {
    }
}
