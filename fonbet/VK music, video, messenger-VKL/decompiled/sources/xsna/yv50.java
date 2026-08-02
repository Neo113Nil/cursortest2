package xsna;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Location;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.MutableCameraBounds;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.aiz;
import xsna.s9u;

/* compiled from: NativeMapViewBinding.kt */
/* loaded from: classes2.dex */
public final class yv50 extends mm00<zv50, aw50> implements s9u.h, s9u.g {
    public static final /* synthetic */ qcy<Object>[] K = {new PropertyReference1Impl(yv50.class, "mapView", "getMapView()Lcom/google/android/gms/maps/MapView;", 0), fp.c(0, yv50.class, "emptyStateView", "getEmptyStateView()Landroid/view/View;", fpf0.a)};
    public final Map<StringId, List<pub0>> D;
    public final aiz.a E;
    public s9u F;
    public final aiz.a G;
    public final bpn0 H;
    public int I;
    public final hv2 J;

    public yv50(com.vk.geo.impl.presentation.b bVar, f5z f5zVar, rpv rpvVar, s6r s6rVar) {
        super(bVar, f5zVar, rpvVar, s6rVar);
        this.D = sni.d(0, 3);
        this.E = b(R.id.geo_map_view);
        this.G = new aiz.a(new c950(this, 3));
        this.H = new bpn0(new i21(21));
        this.J = new hv2(this, 9);
    }

    public final View A() {
        return (View) this.G.getValue(this, K[1]);
    }

    public final km00 B() {
        return (km00) this.E.getValue(this, K[0]);
    }

    public final void C(eo9 eo9Var, boolean z, long j) {
        s9u s9uVar = this.F;
        if (s9uVar == null) {
            return;
        }
        if (z) {
            int i = m300.b;
            s9uVar.c(eo9Var, 300, j != -1 ? new xv50(this, j) : null);
        } else {
            s9uVar.g(eo9Var);
            t();
            o(j);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.graphics.Bitmap] */
    public final void D(final aw50 aw50Var, boolean z, k7x k7xVar) {
        eo00 eo00Var = aw50Var.a;
        try {
            if (eo00Var.a.zzG() == z) {
                return;
            }
            zc7 zc7Var = (zc7) this.H.getValue();
            Map<StringId, Pair<ValueAnimator, cpv>> map = zc7Var.c;
            if (!zc7Var.b) {
                aw50Var.e(z);
                if (k7xVar != null) {
                    k7xVar.invoke();
                    return;
                }
                return;
            }
            final cpv cpvVar = aw50Var.b;
            if (cpvVar != null) {
                Bitmap bitmap = cpvVar.d;
                if (bitmap.isRecycled()) {
                    return;
                }
                cpvVar.l.incrementAndGet();
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                vc7.a(bitmap);
                ref$ObjectRef.element = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                Pair<ValueAnimator, cpv> pair = map.get(new StringId(aw50Var.a()));
                ValueAnimator d = pair != null ? pair.d() : null;
                if (d != null) {
                    d.cancel();
                }
                ValueAnimator ofFloat = z ? ValueAnimator.ofFloat(0.01f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.01f);
                map.put(new StringId(aw50Var.a()), new Pair<>(ofFloat, cpvVar));
                long j = cpvVar.e;
                eo00Var.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
                ofFloat.setDuration(zc7Var.a);
                ofFloat.setInterpolator(z ? zc7Var.d : zc7Var.e);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.xc7
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v6, types: [T, android.graphics.Bitmap] */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aw50 aw50Var2 = aw50.this;
                        if (aw50Var2.c) {
                            return;
                        }
                        Bitmap bitmap2 = cpvVar.d;
                        if (bitmap2.isRecycled()) {
                            return;
                        }
                        aw50Var2.e(true);
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        Bitmap bitmap3 = (Bitmap) ref$ObjectRef2.element;
                        int b = an10.b(bitmap2.getWidth() * floatValue);
                        int b2 = an10.b(floatValue * bitmap2.getHeight());
                        if (b <= 0 || b2 <= 0) {
                            return;
                        }
                        ?? createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, b, b2, true);
                        ref$ObjectRef2.element = createScaledBitmap;
                        try {
                            aw50Var2.a.c(znk0.k(createScaledBitmap));
                        } catch (Throwable th) {
                            L.E(th, new Object[0]);
                        }
                        if (bitmap3 == ref$ObjectRef2.element || bitmap3 == bitmap2) {
                            return;
                        }
                        ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
                    }
                });
                ofFloat.addListener(new yc7(zc7Var, cpvVar, aw50Var, z, ref$ObjectRef, k7xVar, cpvVar, aw50Var, z, ref$ObjectRef));
                ofFloat.start();
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void E(boolean z) {
        MapStyleOptions mapStyleOptions = new MapStyleOptions(this.b.getContext().getString(z ? R.string.google_map_style_light : R.string.google_map_style_night));
        s9u s9uVar = this.F;
        if (s9uVar != null) {
            try {
                s9uVar.a.k0(mapStyleOptions);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void F(long j) {
        aw50 aw50Var = (aw50) this.v;
        if (aw50Var != null) {
            aw50Var.a.d(new LatLng(Coordinate.e(j), Coordinate.f(j)));
        }
    }

    @Override // xsna.s9u.g
    public final void a() {
        View view = this.b;
        if (view != null) {
            view.removeCallbacks(this.J);
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"native map is loaded"});
        }
        if (this.b == null || A().getVisibility() != 0) {
            return;
        }
        A().animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).withEndAction(new z27(this, 7)).start();
    }

    @Override // xsna.mm00
    public final aw50 c(zv50 zv50Var, boolean z) {
        s9u s9uVar = this.F;
        aw50 aw50Var = null;
        if (s9uVar == null) {
            return null;
        }
        if (z) {
            zv50Var.b.i = false;
        }
        aw50 a = zv50Var.a(s9uVar);
        if (a != null) {
            if (z) {
                try {
                    a.a.a.zzz(false);
                    D(a, true, null);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            aw50Var = a;
        }
        if (aw50Var != null) {
            this.w.add(aw50Var);
        }
        return aw50Var;
    }

    @Override // xsna.mm00
    public final void d(byf0 byf0Var) {
        aw50 aw50Var = (aw50) byf0Var;
        try {
            aw50Var.a.a.zzz(false);
            D(aw50Var, true, null);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.s9u.h
    public final boolean e(eo00 eo00Var) {
        cil cilVar;
        LatLng a = eo00Var.a();
        float[] fArr = new float[1];
        float pow = 10 * ((float) Math.pow(2.0f, 20.0f - (z() != null ? r4.b : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        ArrayList arrayList = new ArrayList();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            aw50 aw50Var = (aw50) next;
            float f = pow;
            Location.distanceBetween(a.b, a.c, aw50Var.a.a().b, aw50Var.a.a().c, fArr);
            if (fArr[0] < f) {
                arrayList.add(next);
            }
            pow = f;
        }
        if (arrayList.size() > 1) {
            ZoomLevel z = z();
            eo9 C = xa4.C(new CameraPosition(a, (z != null ? z.b : 16.0f) + 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            s9u s9uVar = this.F;
            if (s9uVar != null) {
                s9uVar.b(C);
                return true;
            }
        } else {
            try {
                Object g = bq70.g(eo00Var.a.zzh());
                String str = g instanceof String ? (String) g : null;
                if (str != null && (cilVar = this.l) != null) {
                    cilVar.b(str);
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        return true;
    }

    @Override // xsna.mm00
    public final zv50 g(do00 do00Var) {
        String str = do00Var.b;
        StringId stringId = new StringId(str);
        Map<StringId, AddOn> map = this.s;
        Object obj = map.get(stringId);
        Object obj2 = obj;
        if (obj == null) {
            zv50 zv50Var = new zv50(str);
            zv50Var.b.b = new LatLng(do00Var.c, do00Var.d);
            map.put(stringId, zv50Var);
            obj2 = zv50Var;
        }
        return (zv50) obj2;
    }

    @Override // xsna.mm00
    public final void h(do00 do00Var, int i) {
        super.h(do00Var, i);
        zv50 zv50Var = (zv50) this.s.get(new StringId(do00Var.b));
        if (zv50Var != null) {
            zv50Var.b.i = true;
        }
    }

    @Override // xsna.mm00
    public final void i(do00 do00Var, int i) {
        super.i(do00Var, i);
        aw50 l = l(do00Var.b);
        if (l != null) {
            try {
                l.a.a.zzz(true);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // xsna.mm00
    public final MutableCameraBounds j() {
        s9u s9uVar = this.F;
        Coordinate coordinate = null;
        if (s9uVar == null) {
            return null;
        }
        try {
            LatLngBounds latLngBounds = ((ynv) s9uVar.e().c).Y().f;
            float f = s9uVar.d().c;
            xf9 xf9Var = xf9.e;
            LatLng latLng = latLngBounds.b;
            float f2 = (float) latLng.c;
            LatLng latLng2 = latLngBounds.c;
            float f3 = (float) latLng2.b;
            float f4 = (float) latLng2.c;
            float f5 = (float) latLng.b;
            s9u s9uVar2 = this.F;
            if (s9uVar2 != null) {
                LatLng latLng3 = s9uVar2.d().b;
                double d = latLng3.b;
                double d2 = latLng3.c;
                Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
                coordinate = new Coordinate(gqr.a((float) d, (float) d2));
            }
            long j = coordinate != null ? coordinate.j() : Coordinate.b;
            s9u s9uVar3 = this.F;
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (s9uVar3 != null) {
                float dimension = B().getResources().getDimension(R.dimen.geo_sheet_peek_height);
                float f7 = this.m;
                float height = B().getHeight() * 0.5f;
                if (f7 > height) {
                    f7 = height;
                }
                try {
                    try {
                        f6 = (float) ((ynv) s9uVar3.e().c).H(new bq70(new Point(0, an10.b(B().getHeight() - Math.max(dimension, f7))))).b;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                } catch (Throwable th) {
                    L.i(th);
                }
            }
            return xf9Var.i(f2, f5, f4, f3, j, f, f6, this.m);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @Override // xsna.mm00
    public final void n() {
        super.n();
        s9u s9uVar = this.F;
        if (s9uVar != null) {
            s9uVar.i(null);
        }
        this.F = null;
        Map<StringId, Pair<ValueAnimator, cpv>> map = ((zc7) this.H.getValue()).c;
        for (Pair<ValueAnimator, cpv> pair : map.values()) {
            ValueAnimator d = pair.d();
            pair.g().c();
            d.removeAllListeners();
            d.cancel();
        }
        map.clear();
    }

    @Override // xsna.mm00
    public final void q(aw50 aw50Var, boolean z, gzs gzsVar) {
        aw50 aw50Var2 = aw50Var;
        this.w.remove(aw50Var2);
        if (z) {
            D(aw50Var2, false, new k7x(aw50Var2, this, gzsVar, 1));
            return;
        }
        aw50Var2.c = true;
        try {
            aw50Var2.a.a.zzn();
            ((zc7) this.H.getValue()).b(aw50Var2.a());
            gzsVar.invoke();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.mm00
    public final void s() {
        aw50 aw50Var = (aw50) this.v;
        if (aw50Var != null) {
            aw50Var.c = true;
            try {
                aw50Var.a.a.zzn();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // xsna.mm00
    public final void u(aw50 aw50Var, cpv cpvVar) {
        aw50Var.b(cpvVar);
    }

    public final aw50 x(zv50 zv50Var) {
        aw50 a;
        s9u s9uVar = this.F;
        if (s9uVar == null || (a = zv50Var.a(s9uVar)) == null) {
            return null;
        }
        a.c(VisibleStyle.k(16777232));
        return a;
    }

    public final zv50 y(long j) {
        mm00.A.getClass();
        zv50 zv50Var = new zv50(mm00.C);
        zv50Var.b.b = new LatLng(Coordinate.e(j), Coordinate.f(j));
        rpv rpvVar = this.f;
        cpv cpvVar = rpvVar.k;
        if (cpvVar == null) {
            cpv cpvVar2 = new cpv("user_location", false, 16777232, fqv.a(rpvVar.f, krv0.l(R.attr.vk_ui_icon_accent), cn70.b(16), 4), 0L, false, false, (CharSequence) null, 496);
            rpvVar.k = cpvVar2;
            cpvVar = cpvVar2;
        }
        zv50Var.b(cpvVar);
        return zv50Var;
    }

    public final ZoomLevel z() {
        CameraPosition d;
        s9u s9uVar = this.F;
        if (s9uVar == null || (d = s9uVar.d()) == null) {
            return null;
        }
        return new ZoomLevel(d.c);
    }
}
