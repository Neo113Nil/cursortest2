package xsna;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.ImageSizeKey;
import java.util.List;
import java.util.WeakHashMap;
import xsna.aqx0;
import xsna.iut0;
import xsna.zqx0;

/* compiled from: WindowInsetsRulers.android.kt */
/* loaded from: classes11.dex */
public final class m4x extends aqx0.b implements Runnable, u080, View.OnAttachStateChangeListener {
    public boolean d;
    public int e;
    public bqx0 f;
    public final ph50 g;
    public final rg50 h;
    public final fh50<wh50<Rect>> i;
    public final SnapshotStateList<iif0> j;

    public m4x() {
        super(1);
        ph50 ph50Var = new ph50(9);
        zqx0.a.getClass();
        ph50Var.p(zqx0.a.b, new bsx0("caption bar"));
        ph50Var.p(zqx0.a.c, new bsx0("display cutout"));
        ph50Var.p(zqx0.a.d, new bsx0("ime"));
        ph50Var.p(zqx0.a.e, new bsx0("mandatory system gestures"));
        ph50Var.p(zqx0.a.f, new bsx0("navigation bars"));
        ph50Var.p(zqx0.a.g, new bsx0("status bars"));
        ph50Var.p(zqx0.a.h, new bsx0("system gestures"));
        ph50Var.p(zqx0.a.i, new bsx0("tappable element"));
        ph50Var.p(zqx0.a.j, new bsx0(com.ironsource.mediationsdk.d.h));
        this.g = ph50Var;
        this.h = androidx.compose.runtime.i.a(0);
        this.i = new fh50<>(4);
        this.j = new SnapshotStateList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.aqx0.b
    public final void a(aqx0 aqx0Var) {
        boolean z = false;
        this.d = false;
        int d = aqx0Var.a.d();
        this.e &= ~d;
        this.f = null;
        zqx0 zqx0Var = (zqx0) brx0.a.b(d);
        if (zqx0Var != null) {
            bsx0 bsx0Var = (bsx0) this.g.d(zqx0Var);
            ((vak0) bsx0Var.c).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ((vak0) bsx0Var.e).g(1.0f);
            ((xak0) bsx0Var.d).p(0L);
            ((vak0) bsx0Var.c).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ((zak0) bsx0Var.b).setValue(Boolean.FALSE);
            bsx0Var.j = -1L;
            bsx0Var.k = -1L;
            wak0 wak0Var = (wak0) this.h;
            wak0Var.C(wak0Var.getIntValue() + 1);
            synchronized (qak0.c) {
                qh50<muk0> qh50Var = qak0.j.h;
                if (qh50Var != null) {
                    if (qh50Var.d()) {
                        z = true;
                    }
                }
            }
            if (z) {
                qak0.a();
            }
        }
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        if (this.d) {
            this.f = bqx0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return bqx0Var;
            }
        } else if (this.e == 0) {
            f(bqx0Var);
        }
        return bqx0Var;
    }

    @Override // xsna.aqx0.b
    public final void c(aqx0 aqx0Var) {
        this.d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.aqx0.b
    public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aqx0 aqx0Var = list.get(i);
            zqx0 zqx0Var = (zqx0) brx0.a.b(aqx0Var.a.d());
            if (zqx0Var != null) {
                bsx0 bsx0Var = (bsx0) this.g.d(zqx0Var);
                if (((Boolean) ((zak0) bsx0Var.b).getValue()).booleanValue()) {
                    ((vak0) bsx0Var.c).g(aqx0Var.a.c());
                    aqx0.e eVar = aqx0Var.a;
                    ((vak0) bsx0Var.e).g(eVar.a());
                    ((xak0) bsx0Var.d).p(eVar.b());
                }
            }
        }
        f(bqx0Var);
        return bqx0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.aqx0.b
    public final aqx0.a e(aqx0 aqx0Var, aqx0.a aVar) {
        bqx0 bqx0Var = this.f;
        boolean z = false;
        this.d = false;
        this.f = null;
        if (aqx0Var.a.b() > 0 && bqx0Var != null) {
            int d = aqx0Var.a.d();
            this.e |= d;
            zqx0 zqx0Var = (zqx0) brx0.a.b(d);
            if (zqx0Var != null) {
                bsx0 bsx0Var = (bsx0) this.g.d(zqx0Var);
                h4x i = bqx0Var.a.i(d);
                long j = (i.a << 48) | (i.b << 32) | (i.c << 16) | i.d;
                long j2 = bsx0Var.h;
                if (!w65.e(j, j2)) {
                    bsx0Var.j = j2;
                    bsx0Var.k = j;
                    ((zak0) bsx0Var.b).setValue(Boolean.TRUE);
                    ((vak0) bsx0Var.c).g(aqx0Var.a.c());
                    aqx0.e eVar = aqx0Var.a;
                    ((vak0) bsx0Var.e).g(eVar.a());
                    ((xak0) bsx0Var.d).p(eVar.b());
                    wak0 wak0Var = (wak0) this.h;
                    wak0Var.C(wak0Var.getIntValue() + 1);
                    synchronized (qak0.c) {
                        qh50<muk0> qh50Var = qak0.j.h;
                        if (qh50Var != null) {
                            if (qh50Var.d()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        qak0.a();
                        return aVar;
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(bqx0 bqx0Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        pg50 pg50Var = brx0.a;
        int[] iArr3 = pg50Var.b;
        Object[] objArr3 = pg50Var.c;
        long[] jArr3 = pg50Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = ImageSizeKey.SIZE_KEY_UNDEFINED;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            zqx0 zqx0Var = (zqx0) objArr3[i6];
                            h4x i8 = bqx0Var.a.i(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (i8.a << 48) | (i8.b << 32) | (i8.c << 16) | i8.d;
                            bsx0 bsx0Var = (bsx0) this.g.d(zqx0Var);
                            j2 = j3;
                            if (!w65.e(j4, bsx0Var.h)) {
                                bsx0Var.h = j4;
                                z2 = true;
                                if (!w65.e(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                h4x j5 = bqx0Var.a.j(i7);
                                objArr2 = objArr3;
                                long j6 = (j5.b << 32) | (j5.a << 48) | (j5.c << 16) | j5.d;
                                if (!w65.e(bsx0Var.i, j6)) {
                                    bsx0Var.i = j6;
                                    z2 = true;
                                    if (!w65.e(j6, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            ((zak0) bsx0Var.a).setValue(Boolean.valueOf(bqx0Var.a.u(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = ImageSizeKey.SIZE_KEY_UNDEFINED;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = ImageSizeKey.SIZE_KEY_UNDEFINED;
            z2 = false;
            z3 = false;
        }
        nen h = bqx0Var.a.h();
        if (h == null) {
            j = 0;
        } else {
            h4x e = h.e();
            j = (e.a << c3) | (e.b << c2) | (e.c << c) | e.d;
        }
        ph50 ph50Var = this.g;
        zqx0.a.getClass();
        bsx0 bsx0Var2 = (bsx0) ph50Var.d(zqx0.a.j);
        ((zak0) bsx0Var2.a).setValue(Boolean.valueOf(!w65.e(j, 0L)));
        if (!w65.e(bsx0Var2.h, j)) {
            bsx0Var2.h = j;
            bsx0Var2.i = j;
            z2 = z;
            if (!w65.e(j, 0L)) {
                z3 = z2;
            }
        }
        if (h == null) {
            fh50<wh50<Rect>> fh50Var = this.i;
            if (fh50Var.b > 0) {
                fh50Var.m();
                this.j.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = h.a.getBoundingRects();
            int size = boundingRects.size();
            fh50<wh50<Rect>> fh50Var2 = this.i;
            if (size < fh50Var2.b) {
                fh50Var2.p(boundingRects.size(), this.i.b);
                this.j.a(boundingRects.size(), this.j.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.i.b;
                int i9 = 0;
                while (i9 < size2) {
                    fh50<wh50<Rect>> fh50Var3 = this.i;
                    fh50Var3.j(androidx.compose.runtime.k.b(boundingRects.get(fh50Var3.b)));
                    this.j.add(new jif0("display cutout rect " + this.i.b));
                    i9++;
                    z2 = z;
                }
            }
            List<Rect> list = boundingRects;
            int size3 = list.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = boundingRects.get(i10);
                wh50<Rect> d = this.i.d(i10);
                if (!epx.f(d.getValue(), rect)) {
                    d.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || ((wak0) this.h).getIntValue() != 0) && z2) {
            wak0 wak0Var = (wak0) this.h;
            wak0Var.C(wak0Var.getIntValue() + 1);
            synchronized (qak0.c) {
                qh50<muk0> qh50Var = qak0.j.h;
                if (qh50Var != null) {
                    boolean z5 = z;
                    z4 = qh50Var.d() == z5 ? z5 : false;
                }
            }
            if (z4) {
                qak0.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, this);
        aqx0.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, null);
        aqx0.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.e = 0;
            this.d = false;
            bqx0 bqx0Var = this.f;
            if (bqx0Var != null) {
                f(bqx0Var);
                this.f = null;
            }
        }
    }
}
