package xsna;

import android.content.Context;
import android.os.RemoteException;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.FrameLayoutWithInterceptTouchEvent;
import com.vk.dto.geo.GeoLocation;
import com.vkontakte.android.R;

/* compiled from: MapVh.kt */
/* loaded from: classes2.dex */
public final class im00 extends vfz<ql00> implements a680, rl00 {
    public final wj00 l;
    public final int m;
    public final int n;
    public final int o;
    public ql00 p;
    public final om00 q;
    public ndr0 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final hv1 v;
    public cm00 w;
    public final GestureDetector x;

    /* compiled from: MapVh.kt */
    public static final class a implements ger0 {
        public a() {
        }

        @Override // xsna.ger0
        public final void a(ndr0 ndr0Var) {
            s9u s9uVar = ndr0Var.a;
            im00 im00Var = im00.this;
            im00Var.r = ndr0Var;
            wj00 wj00Var = im00Var.l;
            ndr0Var.m(wj00Var != null ? wj00Var.g() : false);
            im00Var.itemView.getContext().getApplicationContext();
            try {
                s9uVar.a.N(new yb01(new z250(new fm00(im00Var), 11)));
                ndr0Var.n(new gm00(ndr0Var, im00Var));
                s9uVar.h(new awi0(new hm00(im00Var), 5));
                cm00 cm00Var = im00Var.w;
                if (cm00Var != null) {
                    cm00Var.invoke(ndr0Var);
                } else {
                    ql00 ql00Var = im00Var.p;
                    if (ql00Var == null) {
                        ql00Var = null;
                    }
                    GeoLocation geoLocation = ql00Var.b;
                    if (geoLocation != null) {
                        im00Var.h6(geoLocation.g, geoLocation.h, false);
                    }
                }
                d3m.c(im00Var.q, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                im00Var.t = true;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* compiled from: MapVh.kt */
    public static final class b extends not {
        public b() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            wj00 wj00Var = im00.this.l;
            if (wj00Var == null) {
                return true;
            }
            wj00Var.N();
            return true;
        }
    }

    public im00(View view, wj00 wj00Var) {
        super(view);
        this.l = wj00Var;
        this.m = e3m.a(R.dimen.vkim_picker_map_min_height, view.getContext());
        this.n = iah0.a(24);
        this.o = iah0.a(160);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.vkim_map_view_container);
        vj00 vj00Var = ofx.a;
        vj00Var = vj00Var == null ? null : vj00Var;
        Context context = this.itemView.getContext();
        xl00 xl00Var = new xl00(1787, false, false, false, false);
        vj00Var.getClass();
        pm00 pm00Var = new pm00(context, null, 0);
        pm00Var.setOptions(xl00Var);
        pm00Var.setMapView(new pdr0(pm00Var.getContext(), xl00Var));
        pm00Var.addView((View) pm00Var.getMapView());
        pm00Var.getMapView().d(null);
        this.q = pm00Var;
        this.x = new GestureDetector(view.getContext(), new b());
        bwt0.b0(16, pm00Var);
        frameLayout.addView(pm00Var);
        ((FrameLayoutWithInterceptTouchEvent) this.itemView).setInterceptTouchEventListener(new View.OnTouchListener() { // from class: xsna.dm00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                im00 im00Var = im00.this;
                GestureDetector gestureDetector = im00Var.x;
                wj00 wj00Var2 = im00Var.l;
                gestureDetector.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (wj00Var2 == null) {
                        return false;
                    }
                    wj00Var2.c();
                    return false;
                }
                if ((action != 1 && action != 3) || wj00Var2 == null) {
                    return false;
                }
                wj00Var2.b();
                return false;
            }
        });
        this.v = new hv1(this, 9);
    }

    @Override // xsna.a680
    public final void I3(float f) {
        float max = Math.max(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i = ify.a;
        int d = ify.d(2, Integer.valueOf(iah0.f().heightPixels / 2));
        int i2 = iah0.f().heightPixels;
        int i3 = this.m;
        int i4 = ((i2 - i3) - d) - this.o;
        int i5 = 0;
        int max2 = i3 + ((int) (max * Math.max(r1, 0)));
        if (Math.max(i4, 0) < this.n || BuildInfo.k()) {
            return;
        }
        if (this.itemView.getMeasuredWidth() == 0) {
            bwt0.V(this.itemView, new em00(max2, i5, this));
        } else {
            bwt0.c0(max2, this.itemView);
        }
    }

    @Override // xsna.vfz
    public final void V5() {
        if (this.t) {
            return;
        }
        wvv wvvVar = wvv.a;
        hv1 hv1Var = this.v;
        wvv.a(hv1Var);
        wvv.b(wvvVar, hv1Var, 150L, 500L, 8);
    }

    @Override // xsna.vfz
    public final void W5(ql00 ql00Var) {
        im00 im00Var;
        ql00 ql00Var2 = ql00Var;
        this.p = ql00Var2;
        if (!this.t) {
            wvv wvvVar = wvv.a;
            hv1 hv1Var = this.v;
            wvv.a(hv1Var);
            wvv.b(wvvVar, hv1Var, 150L, 500L, 8);
            return;
        }
        GeoLocation geoLocation = ql00Var2.b;
        if (geoLocation == null) {
            return;
        }
        if (this.u) {
            im00Var = this;
        } else {
            im00Var = this;
            im00Var.h6(geoLocation.g, geoLocation.h, true);
        }
        wj00 wj00Var = im00Var.l;
        if (wj00Var == null || !wj00Var.e()) {
            im00Var.h6(geoLocation.g, geoLocation.h, false);
        }
    }

    @Override // xsna.vfz
    public final void a6() {
        if (!this.t) {
            wvv wvvVar = wvv.a;
            wvv.a(this.v);
            return;
        }
        om00 om00Var = this.q;
        om00Var.i();
        if (this.r != null) {
            this.itemView.getContext();
        }
        this.r = null;
        this.s = false;
        this.t = false;
        this.u = false;
        om00Var.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void h6(double d, double d2, boolean z) {
        this.u = true;
        cm00 cm00Var = new cm00(d, d2, this, z);
        ndr0 ndr0Var = this.r;
        if (ndr0Var != null) {
            cm00Var.invoke(ndr0Var);
        } else {
            this.w = cm00Var;
        }
    }

    @Override // xsna.rl00
    public final void onStart() {
        this.q.b();
    }

    @Override // xsna.rl00
    public final void onStop() {
        this.q.g();
    }
}
