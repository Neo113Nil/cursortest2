package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import xsna.d7d0;

/* compiled from: VKImageDrawable.kt */
/* loaded from: classes2.dex */
public final class ccr0 extends j9s {
    public static final /* synthetic */ int q = 0;
    public final bpn0 f;
    public final njt g;
    public final flo<njt> h;
    public ktc0 i;
    public x9g0 j;
    public d7d0.a k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final b p;

    /* compiled from: VKImageDrawable.kt */
    public static final class a {
        public static ccr0 a(Context context) {
            ccr0 ccr0Var = new ccr0(context);
            RoundingParams a = RoundingParams.a();
            a.i = true;
            ccr0Var.g.u(a);
            return ccr0Var;
        }
    }

    /* compiled from: VKImageDrawable.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ccr0.this.s();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ccr0.this.t();
        }
    }

    public ccr0(Context context) {
        super(null);
        this.f = new bpn0(new s7c0(10));
        njt a2 = new ojt(context.getResources()).a();
        this.g = a2;
        this.h = new flo<>(a2);
        p(a2.d);
        this.p = new b();
    }

    public final void a(float f, int i) {
        njt njtVar = this.g;
        RoundingParams roundingParams = njtVar.c;
        if (roundingParams == null) {
            roundingParams = new RoundingParams();
            njtVar.u(roundingParams);
        }
        roundingParams.c(f, i);
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n;
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.m;
    }

    public final void q(View view) {
        view.addOnAttachStateChangeListener(this.p);
        if (view.isAttachedToWindow()) {
            s();
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    public final void r(String str) {
        flo<njt> floVar = this.h;
        if (str == null || str.length() == 0) {
            floVar.h(null);
            return;
        }
        ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
        if (mcr0.u(h.a)) {
            h.g = ImageRequest.CacheChoice.SMALL;
        }
        h.d = this.j;
        h.e = eng0.c;
        h.k = this.i;
        lpa0 lpa0Var = (lpa0) this.f.getValue();
        lpa0Var.d();
        lpa0Var.c = h.a();
        lpa0Var.j = false;
        lpa0Var.l = floVar.e;
        lpa0Var.b = null;
        lpa0Var.h = new dcr0(this);
        floVar.h(lpa0Var.b());
        this.o = 0;
    }

    public final void s() {
        this.h.f();
    }

    public final void t() {
        this.h.g();
    }

    public final void u(Drawable drawable) {
        this.g.p(drawable, 1);
    }
}
