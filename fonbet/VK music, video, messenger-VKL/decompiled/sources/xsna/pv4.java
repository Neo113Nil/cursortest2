package xsna;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.WaveFormView;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.i330;
import xsna.qv4;
import xsna.zlv;

/* compiled from: AudioRecordVc.kt */
/* loaded from: classes2.dex */
public final class pv4 implements zlv {
    public boolean C;
    public final i330<qv4> D;
    public final Context a;
    public final zlv.a b;
    public final kkm c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public View i;
    public qu4 j;
    public WaveFormView k;
    public ViewGroup l;
    public TextView m;
    public View n;
    public View o;
    public AppCompatImageView p;
    public ViewGroup q;
    public TextView r;
    public ImageView s;
    public ImageView t;
    public View u;
    public View v;
    public AppCompatImageView w;
    public AppCompatImageView x;
    public final int h = iah0.a(18);
    public final int y = iah0.v() / 3;
    public final int z = iah0.a(48);
    public final PointF A = new PointF(-1.0f, -1.0f);
    public final PointF B = new PointF(-1.0f, -1.0f);

    public pv4(Context context, zlv.a aVar, kkm kkmVar, boolean z, int i, int i2, int i3) {
        this.a = context;
        this.b = aVar;
        this.c = kkmVar;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = i3;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        byte b = 0;
        arrayList.add(new i330.b(new bod(2), new zx0(this, 7), new kxa(b, 5)));
        i330.a aVar2 = new i330.a();
        aVar2.c(fv4.b, new tl0(this, 7), new gqg(b, 1));
        pn8.a(aVar2, gv4.b, new ns1(this, 4));
        i330.a.d(aVar2, new ak(2), new r6(this, 6));
        int i4 = 8;
        i330.a.d(aVar2, hv4.b, new s6(this, i4));
        hashMap.put(fpf0.a(qv4.b.class), aVar2.b());
        i330.a aVar3 = new i330.a();
        pn8.a(aVar3, iv4.b, new t6(this, i4));
        int i5 = 3;
        i330.a.d(aVar3, jv4.b, new wl0(this, i5));
        i330.a.d(aVar3, kv4.b, new op1(this, i5));
        i330.a.d(aVar3, lv4.b, new com.vk.movika.sdk.base.logic.interactor.d(this, 8));
        i330.a.d(aVar3, mv4.b, new ay0(this, 6));
        hashMap.put(fpf0.a(qv4.d.class), aVar3.b());
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        arrayList2.add(new i330.b(new bod(2), new fm0(this, 3), new qw6(nv4.b, 8)));
        hashMap.put(fpf0.a(qv4.a.class), new i330(arrayList2, hashMap2));
        this.D = new i330<>(arrayList, hashMap);
    }

    @Override // xsna.zlv
    public final View a() {
        View view = this.i;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // xsna.zlv
    public final void b(qv4 qv4Var) {
        this.D.b(qv4Var);
    }

    public final boolean c() {
        return Math.abs(this.A.y - this.B.y) > ((float) this.z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r2 != 3) goto L14;
     */
    @Override // xsna.zlv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(MotionEvent motionEvent) {
        qu4 qu4Var;
        if (!this.C || motionEvent.getAction() == 0) {
            this.C = false;
            qv4 qv4Var = this.D.c;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.A.set(motionEvent.getRawX(), motionEvent.getRawY());
                this.B.set(motionEvent.getRawX(), motionEvent.getRawY());
                return true;
            }
            if (action != 1) {
                if (action == 2) {
                    g(motionEvent);
                    return true;
                }
            }
            boolean z = qv4Var instanceof qv4.d;
            if (z) {
                g(motionEvent);
            }
            boolean e = e();
            zlv.a aVar = this.b;
            if (e) {
                aVar.onCancel();
                return true;
            }
            if (z && ((qv4.d) qv4Var).g) {
                qu4 qu4Var2 = this.j;
                qu4Var = qu4Var2 != null ? qu4Var2 : null;
                ViewPropertyAnimator duration = qu4Var.b.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(qu4Var.q);
                duration.start();
                xo2.b(duration, qu4Var.n);
                return true;
            }
            if (z && c()) {
                aVar.g();
                qu4 qu4Var3 = this.j;
                qu4Var = qu4Var3 != null ? qu4Var3 : null;
                float f = qu4.v;
                qu4Var.b(true);
                return true;
            }
            if (z && motionEvent.getAction() != 3) {
                aVar.b();
                return true;
            }
            qu4 qu4Var4 = this.j;
            qu4Var = qu4Var4 != null ? qu4Var4 : null;
            ViewPropertyAnimator duration2 = qu4Var.b.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(qu4Var.q);
            duration2.start();
            xo2.b(duration2, qu4Var.n);
            return true;
        }
        return false;
    }

    public final boolean e() {
        return Math.abs(this.A.x - this.B.x) >= ((float) this.y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r0 = xsna.d3m.c(r14.f, (r15 & 1) != 0 ? 300 : r14.q, (r15 & 2) != 0 ? 0 : 0, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z) {
        ViewPropertyAnimator e;
        ViewPropertyAnimator c;
        ViewPropertyAnimator e2;
        ViewPropertyAnimator c2;
        ViewPropertyAnimator alpha;
        View view = this.i;
        if (view == null) {
            view = null;
        }
        awt0.p(view);
        if (z) {
            qu4 qu4Var = this.j;
            if (qu4Var == null) {
                qu4Var = null;
            }
            io.reactivex.rxjava3.disposables.b bVar = qu4Var.n;
            if (!qu4Var.t) {
                e2 = d3m.e(qu4Var.f, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                if (e2 != null) {
                    xo2.b(e2, bVar);
                }
                c2 = d3m.c(qu4Var.g, (r15 & 1) != 0 ? 300L : qu4Var.q, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (c2 != null && (alpha = c2.alpha(0.8f)) != null) {
                    xo2.b(alpha, bVar);
                }
            }
            qu4 qu4Var2 = this.j;
            (qu4Var2 != null ? qu4Var2 : null).a(1);
            return;
        }
        qu4 qu4Var3 = this.j;
        if (qu4Var3 == null) {
            qu4Var3 = null;
        }
        boolean z2 = ((qv4.a) this.D.c).b;
        io.reactivex.rxjava3.disposables.b bVar2 = qu4Var3.n;
        if (!qu4Var3.t) {
            if (z2 && c != null) {
                xo2.b(c, bVar2);
            }
            e = d3m.e(qu4Var3.g, (r15 & 1) != 0 ? 300L : qu4Var3.q, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            if (e != null) {
                xo2.b(e, bVar2);
            }
        }
        qu4 qu4Var4 = this.j;
        (qu4Var4 != null ? qu4Var4 : null).a(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(MotionEvent motionEvent) {
        boolean z;
        ViewGroup viewGroup;
        float abs;
        float f;
        View view;
        ViewGroup viewGroup2;
        View view2;
        ViewGroup viewGroup3;
        boolean c;
        boolean e;
        float rawX = motionEvent.getRawX();
        PointF pointF = this.A;
        float f2 = rawX - pointF.x;
        float rawY = motionEvent.getRawY() - pointF.y;
        boolean c2 = c();
        boolean e2 = e();
        pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
        ViewGroup viewGroup4 = this.l;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        float abs2 = Math.abs(viewGroup4.getTranslationX());
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (abs2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f2) > Math.abs(rawY)) {
            ViewGroup viewGroup5 = this.l;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            if (Math.abs(viewGroup5.getTranslationY()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                z = true;
                viewGroup = this.l;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                float translationY = viewGroup.getTranslationY();
                if (!z) {
                    ViewGroup viewGroup6 = this.l;
                    ViewGroup viewGroup7 = viewGroup6 == null ? null : viewGroup6;
                    if (viewGroup6 == null) {
                        viewGroup6 = null;
                    }
                    viewGroup7.setTranslationX(Math.min(viewGroup6.getTranslationX() + f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                } else if (z) {
                    f3 = translationY;
                } else {
                    ViewGroup viewGroup8 = this.l;
                    if (viewGroup8 == null) {
                        viewGroup8 = null;
                    }
                    viewGroup8.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f3 = Math.min(translationY + rawY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                abs = Math.abs(f3);
                int i = this.z;
                f = i;
                if (abs >= f) {
                    float f4 = f3 / f;
                    ViewGroup viewGroup9 = this.l;
                    if (viewGroup9 == null) {
                        viewGroup9 = null;
                    }
                    viewGroup9.setTranslationY(f3);
                    View view3 = this.v;
                    if (view3 == null) {
                        view3 = null;
                    }
                    bwt0.c0((int) ((this.h * f4) + iah0.a(108)), view3);
                } else {
                    int i2 = i / 3;
                    float f5 = f3 + f;
                    ViewGroup viewGroup10 = this.l;
                    if (viewGroup10 == null) {
                        viewGroup10 = null;
                    }
                    float f6 = i2;
                    viewGroup10.setTranslationY((-i) - ((1 - (f6 / (f6 - f5))) * f6));
                }
                view = this.v;
                if (view == null) {
                    view = null;
                }
                viewGroup2 = this.l;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                view.setTranslationX(viewGroup2.getTranslationX());
                view2 = this.v;
                if (view2 == null) {
                    view2 = null;
                }
                viewGroup3 = this.l;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                view2.setTranslationY(viewGroup3.getTranslationY());
                c = c();
                zlv.a aVar = this.b;
                if (c2 != c) {
                    aVar.d(c());
                    View view4 = this.i;
                    awt0.p(view4 != null ? view4 : null);
                }
                e = e();
                if (e2 == e) {
                    aVar.h(e);
                    f(e);
                    return;
                }
                return;
            }
        }
        z = false;
        viewGroup = this.l;
        if (viewGroup == null) {
        }
        float translationY2 = viewGroup.getTranslationY();
        if (!z) {
        }
        abs = Math.abs(f3);
        int i3 = this.z;
        f = i3;
        if (abs >= f) {
        }
        view = this.v;
        if (view == null) {
        }
        viewGroup2 = this.l;
        if (viewGroup2 == null) {
        }
        view.setTranslationX(viewGroup2.getTranslationX());
        view2 = this.v;
        if (view2 == null) {
        }
        viewGroup3 = this.l;
        if (viewGroup3 == null) {
        }
        view2.setTranslationY(viewGroup3.getTranslationY());
        c = c();
        zlv.a aVar2 = this.b;
        if (c2 != c) {
        }
        e = e();
        if (e2 == e) {
        }
    }
}
