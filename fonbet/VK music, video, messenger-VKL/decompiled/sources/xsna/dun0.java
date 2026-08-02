package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarState;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: TabbarInteractorImpl.kt */
/* loaded from: classes11.dex */
public final class dun0 implements wtn0 {
    public static final int k = iah0.a(24);
    public static final float l = iah0.b(0.5f);
    public static final float m = iah0.b(2.0f);
    public static final float n = iah0.b(1.8f);
    public final eun0 a;
    public final gxh b;
    public final k820 c;
    public final h7v d;
    public io.reactivex.rxjava3.disposables.c g;
    public final io.reactivex.rxjava3.disposables.c h;
    public final io.reactivex.rxjava3.disposables.c i;
    public boolean e = true;
    public final io.reactivex.rxjava3.subjects.f<s3q0> f = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f<UserId> j = new io.reactivex.rxjava3.subjects.f<>();

    public dun0(eun0 eun0Var, gxh gxhVar, mui0 mui0Var, gun0 gun0Var, k820 k820Var, h7v h7vVar) {
        this.a = eun0Var;
        this.b = gxhVar;
        this.c = k820Var;
        this.d = h7vVar;
        mui0Var.f(new ayi0() { // from class: xsna.ytn0
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                dun0.this.a.i();
            }
        });
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.subjects.f<awd0> fVar = o1e0.a.a;
        jpy jpyVar = new jpy(new a43(3));
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, jpyVar).U(new lpy(new p27(1), 2));
        final rcv rcvVar = new rcv(this, 1);
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = new io.reactivex.rxjava3.internal.operators.observable.o0(U, new io.reactivex.rxjava3.functions.l() { // from class: xsna.xtn0
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (io.reactivex.rxjava3.core.b0) rcv.this.invoke(obj);
            }
        }).U(new fh10(new m3w(this), 1));
        asu0 asu0Var = asu0.a;
        this.i = U2.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new mx50(new jal(this, 4), 2));
        io.reactivex.rxjava3.disposables.c cVar2 = this.h;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.z0 j = j();
        final ztn0 ztn0Var = new ztn0(this);
        io.reactivex.rxjava3.internal.operators.observable.j1 U3 = j.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.aun0
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (List) ztn0.this.invoke(obj);
            }
        });
        final j67 j67Var = new j67(this, 3);
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(U3, new io.reactivex.rxjava3.functions.m() { // from class: xsna.bun0
            @Override // io.reactivex.rxjava3.functions.m
            public final boolean test(Object obj) {
                return ((Boolean) j67.this.invoke(obj)).booleanValue();
            }
        });
        final ki6 ki6Var = new ki6(this, 2);
        this.h = new io.reactivex.rxjava3.internal.operators.observable.l0(i0Var, new io.reactivex.rxjava3.functions.l() { // from class: xsna.cun0
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (io.reactivex.rxjava3.core.e) ki6.this.invoke(obj);
            }
        }).g(new ktg0(this, 1)).q(asu0Var.c()).o(asu0Var.d()).subscribe();
    }

    @Override // xsna.wtn0
    public final TabbarState b() {
        return this.a.b();
    }

    @Override // xsna.wtn0
    public final TabbarState c() {
        return this.a.c();
    }

    @Override // xsna.wtn0
    public final void d(TabbarState tabbarState, boolean z) {
        UserId userId;
        Object obj;
        UserId e;
        Iterator<T> it = tabbarState.d().iterator();
        while (true) {
            userId = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TabbarItem) obj).e() != null) {
                    break;
                }
            }
        }
        TabbarItem tabbarItem = (TabbarItem) obj;
        eun0 eun0Var = this.a;
        if (tabbarItem != null && (e = tabbarItem.e()) != null) {
            eun0Var.f(e);
            userId = e;
        }
        eun0Var.e(tabbarState);
        if (userId == null) {
            eun0Var.d();
            if (z) {
                this.f.onNext(s3q0.a);
                return;
            }
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.core.q<Group> N0 = this.b.N0(fkq0.a(userId));
        asu0 asu0Var = asu0.a;
        this.g = N0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new j7l0(new zlu(z, this, 2), 3));
    }

    @Override // xsna.wtn0
    public final Bundle e(String str) {
        UserId h = this.a.h();
        if (h == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(str, h);
        bundle.putString("referrer", "TAB_BAR".toLowerCase(Locale.ROOT));
        return bundle;
    }

    @Override // xsna.wtn0
    public final BitmapDrawable f(int i, int i2, int i3) {
        int i4 = k;
        Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i);
        return m(createBitmap, i2, i3, false);
    }

    @Override // xsna.wtn0
    public final void g(UserId userId) {
        eun0 eun0Var = this.a;
        if (epx.f(eun0Var.h(), userId)) {
            return;
        }
        eun0Var.f(userId);
        this.j.onNext(userId);
    }

    @Override // xsna.wtn0
    public final void h(String str) {
        h7v h7vVar = this.d;
        if (h7vVar.a(str)) {
            h7vVar.b(str);
        }
    }

    @Override // xsna.wtn0
    public final io.reactivex.rxjava3.subjects.f i() {
        return this.j;
    }

    @Override // xsna.wtn0
    public final io.reactivex.rxjava3.internal.operators.observable.z0 j() {
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = this.f;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }

    @Override // xsna.wtn0
    public final UserId k() {
        return this.a.h();
    }

    @Override // xsna.wtn0
    public final void l() {
        this.a.d();
    }

    @Override // xsna.wtn0
    public final BitmapDrawable m(Bitmap bitmap, int i, int i2, boolean z) {
        int i3 = k;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i3, true);
        float min = ((int) Math.min(createScaledBitmap.getHeight(), createScaledBitmap.getWidth())) / 2;
        int width = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createScaledBitmap, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        new Canvas(createBitmap).drawRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, createBitmap.getWidth(), createBitmap.getHeight()), min, min, paint);
        int height2 = createBitmap.getHeight();
        float f = l;
        int b = (an10.b(f) * 2) + height2;
        float f2 = m;
        int b2 = (an10.b(f2) * 2) + b;
        float f3 = n;
        Bitmap createBitmap2 = Bitmap.createBitmap((an10.b(f3) * 2) + b2, (an10.b(f3) * 2) + (an10.b(f2) * 2) + (an10.b(f) * 2) + createBitmap.getWidth(), config);
        createBitmap2.eraseColor(0);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(i);
        paint2.setStrokeWidth(f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(i2);
        paint3.setStrokeWidth(f2);
        paint3.setStyle(style);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawColor(0);
        canvas.drawBitmap(createBitmap, (createBitmap2.getWidth() - createBitmap.getWidth()) / 2.0f, (createBitmap2.getHeight() - createBitmap.getHeight()) / 2.0f, (Paint) null);
        canvas.drawCircle(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f, min, paint2);
        if (z) {
            float f4 = 2 * f;
            canvas.drawOval(f4, f4, createBitmap2.getWidth() - f4, createBitmap2.getHeight() - f4, paint3);
        }
        createScaledBitmap.recycle();
        createBitmap.recycle();
        Context context = e43.a;
        return new BitmapDrawable((context != null ? context : null).getResources(), createBitmap2);
    }
}
