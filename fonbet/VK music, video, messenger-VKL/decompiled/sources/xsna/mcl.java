package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.ui.RotationLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.io00;
import xsna.s9u;
import xsna.uwf;
import xsna.vwf;
import xsna.wwf;

/* compiled from: DefaultClusterRenderer.java */
/* loaded from: classes13.dex */
public class mcl<T extends uwf> {
    public static final int[] q = {10, 20, 50, 100, 200, 500, 1000};
    public static final DecelerateInterpolator r = new DecelerateInterpolator();
    public final s9u a;
    public final gqv b;
    public final vwf<T> c;
    public final ShapeDrawable f;
    public Set<? extends kwf<T>> k;
    public float m;
    public vwf.b<T> o;
    public vwf.c<T> p;
    public final ExecutorService e = asu0.C();
    public Set<k> g = tj0.c();
    public final SparseArray<tb7> h = new SparseArray<>();
    public final i<T> i = new i<>();
    public final int j = 4;
    public final i<kwf<T>> l = new i<>();
    public final mcl<T>.m n = new m();
    public final boolean d = true;

    /* compiled from: DefaultClusterRenderer.java */
    public class a implements s9u.h {
        public a() {
        }

        @Override // xsna.s9u.h
        public final boolean e(eo00 eo00Var) {
            mcl mclVar = mcl.this;
            vwf.c<T> cVar = mclVar.p;
            if (cVar == null) {
                return false;
            }
            ((wwf.b) ((gs00) cVar).c).b(((jbr0) ((uwf) mclVar.i.b.get(eo00Var))).a);
            return true;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public class b implements s9u.e {
        public b() {
        }

        @Override // xsna.s9u.e
        public final void f(eo00 eo00Var) {
            mcl.this.getClass();
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public class c implements s9u.f {
        public c() {
        }

        @Override // xsna.s9u.f
        public final void a(eo00 eo00Var) {
            mcl.this.getClass();
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public class d implements s9u.h {
        public d() {
        }

        @Override // xsna.s9u.h
        public final boolean e(eo00 eo00Var) {
            mcl mclVar = mcl.this;
            vwf.b<T> bVar = mclVar.o;
            if (bVar != null) {
                return ((wwf.a) ((uq80) bVar).c).a(new xwf((kwf) mclVar.l.b.get(eo00Var)));
            }
            return false;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public class e implements s9u.e {
        public e() {
        }

        @Override // xsna.s9u.e
        public final void f(eo00 eo00Var) {
            mcl.this.getClass();
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public class f implements s9u.f {
        public f() {
        }

        @Override // xsna.s9u.f
        public final void a(eo00 eo00Var) {
            mcl.this.getClass();
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @TargetApi(12)
    public class g extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public final k b;
        public final eo00 c;
        public final LatLng d;
        public final LatLng e;
        public boolean f;
        public io00 g;

        public g(k kVar, LatLng latLng, LatLng latLng2) {
            this.b = kVar;
            this.c = kVar.a;
            this.d = latLng;
            this.e = latLng2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f) {
                mcl mclVar = mcl.this;
                i<T> iVar = mclVar.i;
                eo00 eo00Var = this.c;
                iVar.a(eo00Var);
                mclVar.l.a(eo00Var);
                this.g.b(eo00Var);
            }
            this.b.b = this.e;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.e;
            double d = latLng.b;
            LatLng latLng2 = this.d;
            double d2 = latLng2.b;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.c - latLng2.c;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.c.d(new LatLng(d4, (d5 * d3) + latLng2.c));
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public class h {
        public final kwf<T> a;
        public final Set<k> b;
        public final LatLng c;

        public h(kwf<T> kwfVar, Set<k> set, LatLng latLng) {
            this.a = kwfVar;
            this.b = set;
            this.c = latLng;
        }

        public static void a(h hVar, j jVar) {
            k kVar;
            k kVar2;
            mcl mclVar = mcl.this;
            ReentrantLock reentrantLock = jVar.b;
            Set<k> set = hVar.b;
            LatLng latLng = hVar.c;
            mcl mclVar2 = mcl.this;
            kwf<T> kwfVar = hVar.a;
            boolean n = mclVar2.n(kwfVar);
            i<kwf<T>> iVar = mclVar2.l;
            vwf<T> vwfVar = mclVar2.c;
            i<T> iVar2 = mclVar2.i;
            if (n) {
                eo00 eo00Var = (eo00) iVar.a.get(kwfVar);
                if (eo00Var == null) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    LatLng position = latLng == null ? kwfVar.getPosition() : latLng;
                    if (position == null) {
                        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
                    }
                    markerOptions.b = position;
                    mclVar2.k(kwfVar, markerOptions);
                    eo00 b = vwfVar.d.b(markerOptions);
                    iVar.a.put(kwfVar, b);
                    iVar.b.put(b, kwfVar);
                    kVar = new k(b);
                    if (latLng != null) {
                        LatLng position2 = kwfVar.getPosition();
                        reentrantLock.lock();
                        jVar.h.add(new g(kVar, latLng, position2));
                        reentrantLock.unlock();
                    }
                } else {
                    k kVar3 = new k(eo00Var);
                    mclVar2.m(kwfVar, eo00Var);
                    kVar = kVar3;
                }
                set.add(kVar);
                return;
            }
            for (T t : kwfVar.getItems()) {
                eo00 eo00Var2 = (eo00) iVar2.a.get(t);
                if (eo00Var2 == null) {
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    if (latLng != null) {
                        markerOptions2.b = latLng;
                    } else {
                        markerOptions2.b = t.getPosition();
                    }
                    mclVar2.j(t, markerOptions2);
                    eo00 b2 = vwfVar.c.b(markerOptions2);
                    kVar2 = new k(b2);
                    iVar2.a.put(t, b2);
                    iVar2.b.put(b2, t);
                    if (latLng != null) {
                        LatLng position3 = t.getPosition();
                        reentrantLock.lock();
                        jVar.h.add(new g(kVar2, latLng, position3));
                        reentrantLock.unlock();
                    }
                } else {
                    kVar2 = new k(eo00Var2);
                    mclVar2.l(t, eo00Var2);
                }
                set.add(kVar2);
            }
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public static class i<T> {
        public final HashMap a = new HashMap();
        public final HashMap b = new HashMap();

        public final void a(eo00 eo00Var) {
            HashMap hashMap = this.b;
            Object obj = hashMap.get(eo00Var);
            hashMap.remove(eo00Var);
            this.a.remove(obj);
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    public class j extends Handler implements MessageQueue.IdleHandler {
        public final ReentrantLock b;
        public final Condition c;
        public final LinkedList d;
        public final LinkedList e;
        public final LinkedList f;
        public final LinkedList g;
        public final LinkedList h;
        public boolean i;

        public j() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.b = reentrantLock;
            this.c = reentrantLock.newCondition();
            this.d = new LinkedList();
            this.e = new LinkedList();
            this.f = new LinkedList();
            this.g = new LinkedList();
            this.h = new LinkedList();
        }

        public final void a(boolean z, mcl<T>.h hVar) {
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            sendEmptyMessage(0);
            if (z) {
                this.e.add(hVar);
            } else {
                this.d.add(hVar);
            }
            reentrantLock.unlock();
        }

        public final boolean b() {
            boolean z;
            ReentrantLock reentrantLock = this.b;
            try {
                reentrantLock.lock();
                if (this.d.isEmpty() && this.e.isEmpty() && this.g.isEmpty() && this.f.isEmpty()) {
                    if (this.h.isEmpty()) {
                        z = false;
                        return z;
                    }
                }
                z = true;
                return z;
            } finally {
                reentrantLock.unlock();
            }
        }

        @TargetApi(11)
        public final void c() {
            LinkedList linkedList = this.g;
            boolean isEmpty = linkedList.isEmpty();
            mcl mclVar = mcl.this;
            if (!isEmpty) {
                eo00 eo00Var = (eo00) linkedList.poll();
                mclVar.i.a(eo00Var);
                mclVar.l.a(eo00Var);
                mclVar.c.b.b(eo00Var);
                return;
            }
            LinkedList linkedList2 = this.h;
            if (!linkedList2.isEmpty()) {
                g gVar = (g) linkedList2.poll();
                gVar.getClass();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(mcl.r);
                ofFloat.addUpdateListener(gVar);
                ofFloat.addListener(gVar);
                ofFloat.start();
                return;
            }
            LinkedList linkedList3 = this.e;
            if (!linkedList3.isEmpty()) {
                h.a((h) linkedList3.poll(), this);
                return;
            }
            LinkedList linkedList4 = this.d;
            if (!linkedList4.isEmpty()) {
                h.a((h) linkedList4.poll(), this);
                return;
            }
            LinkedList linkedList5 = this.f;
            if (linkedList5.isEmpty()) {
                return;
            }
            eo00 eo00Var2 = (eo00) linkedList5.poll();
            mclVar.i.a(eo00Var2);
            mclVar.l.a(eo00Var2);
            mclVar.c.b.b(eo00Var2);
        }

        public final void d(boolean z, eo00 eo00Var) {
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            sendEmptyMessage(0);
            if (z) {
                this.g.add(eo00Var);
            } else {
                this.f.add(eo00Var);
            }
            reentrantLock.unlock();
        }

        public final void e() {
            while (b()) {
                sendEmptyMessage(0);
                ReentrantLock reentrantLock = this.b;
                reentrantLock.lock();
                try {
                    try {
                        if (b()) {
                            this.c.await();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (!this.i) {
                Looper.myQueue().addIdleHandler(this);
                this.i = true;
            }
            removeMessages(0);
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            for (int i = 0; i < 10; i++) {
                try {
                    c();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            if (b()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.i = false;
                Looper.myQueue().removeIdleHandler(this);
                this.c.signalAll();
            }
            reentrantLock.unlock();
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public static class k {
        public final eo00 a;
        public LatLng b;

        public k(eo00 eo00Var) {
            this.a = eo00Var;
            this.b = eo00Var.a();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof k)) {
                return false;
            }
            return this.a.equals(((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public class l implements Runnable {
        public final Set<? extends kwf<T>> b;
        public m.a c;
        public cbb d;
        public lkk0 e;
        public float f;

        public l(Set set) {
            this.b = set;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public final void run() {
            boolean z;
            float f;
            double d;
            boolean z2;
            LatLngBounds latLngBounds;
            ArrayList arrayList;
            mcl mclVar = mcl.this;
            Set<? extends kwf<T>> set = mclVar.k;
            Set<? extends kwf<T>> set2 = this.b;
            if (set2.equals(set)) {
                this.c.run();
                return;
            }
            j jVar = new j();
            float f2 = this.f;
            float f3 = mclVar.m;
            boolean z3 = f2 > f3;
            float f4 = f2 - f3;
            Set<k> set3 = mclVar.g;
            try {
                cbb cbbVar = this.d;
                cbbVar.getClass();
                try {
                    latLngBounds = ((ynv) cbbVar.c).Y().f;
                    z2 = z3;
                    f = f4;
                    z = true;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                LatLng latLng = new LatLng(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                double d2 = latLng.b;
                double min = Math.min(Double.POSITIVE_INFINITY, d2);
                double max = Math.max(Double.NEGATIVE_INFINITY, d2);
                boolean isNaN = Double.isNaN(Double.NaN);
                double d3 = latLng.c;
                if (isNaN) {
                    f = f4;
                    d = d3;
                } else if (Double.NaN <= d3 || d3 <= Double.NaN) {
                    d3 = Double.NaN;
                    z = true;
                    f = f4;
                    d = Double.NaN;
                    z2 = z3;
                    exc0.k("no included points", !Double.isNaN(d3));
                    latLngBounds = new LatLngBounds(new LatLng(min, d3), new LatLng(max, d));
                } else if (((Double.NaN - d3) + 360.0d) % 360.0d < ((d3 - Double.NaN) + 360.0d) % 360.0d) {
                    f = f4;
                    d = Double.NaN;
                } else {
                    f = f4;
                    d = d3;
                    d3 = Double.NaN;
                }
                z = true;
                z2 = z3;
                exc0.k("no included points", !Double.isNaN(d3));
                latLngBounds = new LatLngBounds(new LatLng(min, d3), new LatLng(max, d));
            }
            ArrayList arrayList2 = null;
            if (mclVar.k == null || !mclVar.d) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (kwf<T> kwfVar : mclVar.k) {
                    if (mclVar.n(kwfVar) && latLngBounds.b(kwfVar.getPosition())) {
                        arrayList.add(this.e.b(kwfVar.getPosition()));
                    }
                }
            }
            Set<k> c = tj0.c();
            for (kwf<T> kwfVar2 : set2) {
                boolean b = latLngBounds.b(kwfVar2.getPosition());
                if (z2 && b && mclVar.d) {
                    ilb0 g = mcl.g(mclVar, arrayList, this.e.b(kwfVar2.getPosition()));
                    if (g != null) {
                        jVar.a(z, new h(kwfVar2, c, this.e.a(g)));
                    } else {
                        jVar.a(z, new h(kwfVar2, c, null));
                    }
                } else {
                    jVar.a(b, new h(kwfVar2, c, null));
                }
                z = true;
            }
            jVar.e();
            set3.removeAll(c);
            if (mclVar.d) {
                arrayList2 = new ArrayList();
                for (kwf<T> kwfVar3 : set2) {
                    if (mclVar.n(kwfVar3) && latLngBounds.b(kwfVar3.getPosition())) {
                        arrayList2.add(this.e.b(kwfVar3.getPosition()));
                    }
                }
            }
            for (k kVar : set3) {
                LatLng latLng2 = kVar.b;
                eo00 eo00Var = kVar.a;
                boolean b2 = latLngBounds.b(latLng2);
                if (z2 || f <= -3.0f || !b2 || !mclVar.d) {
                    jVar.d(b2, eo00Var);
                } else {
                    ilb0 g2 = mcl.g(mclVar, arrayList2, this.e.b(kVar.b));
                    if (g2 != null) {
                        LatLng a = this.e.a(g2);
                        LatLng latLng3 = kVar.b;
                        ReentrantLock reentrantLock = jVar.b;
                        reentrantLock.lock();
                        mcl mclVar2 = mcl.this;
                        g gVar = new g(kVar, latLng3, a);
                        gVar.g = mclVar2.c.b;
                        gVar.f = true;
                        jVar.h.add(gVar);
                        reentrantLock.unlock();
                    } else {
                        jVar.d(true, eo00Var);
                    }
                }
            }
            jVar.e();
            mclVar.g = c;
            mclVar.k = set2;
            mclVar.m = f2;
            this.c.run();
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    public class m extends Handler {
        public boolean a = false;
        public mcl<T>.l b = null;

        /* compiled from: DefaultClusterRenderer.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.this.sendEmptyMessage(1);
            }
        }

        public m() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            mcl<T>.l lVar;
            if (message.what == 1) {
                this.a = false;
                if (this.b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.a || this.b == null) {
                return;
            }
            cbb e = mcl.this.a.e();
            synchronized (this) {
                lVar = this.b;
                this.b = null;
                this.a = true;
            }
            lVar.c = new a();
            lVar.d = e;
            lVar.f = mcl.this.a.d().c;
            lVar.e = new lkk0(Math.pow(2.0d, Math.min(r7, mcl.this.m)) * 256.0d);
            mcl.this.e.execute(lVar);
        }
    }

    public mcl(Context context, s9u s9uVar, vwf<T> vwfVar) {
        this.a = s9uVar;
        float f2 = context.getResources().getDisplayMetrics().density;
        gqv gqvVar = new gqv();
        jl8 jl8Var = new jl8(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        gqvVar.a = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        gqvVar.b = rotationLayout;
        gqvVar.c = (TextView) rotationLayout.findViewById(R.id.amu_text);
        jl8Var.c = -1;
        gqvVar.a(jl8Var);
        TextView textView = gqvVar.c;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.amu_Bubble_TextAppearance_Dark);
        }
        this.b = gqvVar;
        dnk0 dnk0Var = new dnk0(context);
        dnk0Var.b = 0;
        dnk0Var.c = 0;
        dnk0Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        dnk0Var.setId(R.id.amu_text);
        int i2 = (int) (12.0f * f2);
        dnk0Var.setPadding(i2, i2, i2, i2);
        RotationLayout rotationLayout2 = gqvVar.b;
        rotationLayout2.removeAllViews();
        rotationLayout2.addView(dnk0Var);
        View findViewById = rotationLayout2.findViewById(R.id.amu_text);
        TextView textView2 = findViewById instanceof TextView ? (TextView) findViewById : null;
        gqvVar.c = textView2;
        if (textView2 != null) {
            textView2.setTextAppearance(context, R.style.amu_ClusterIcon_TextAppearance);
        }
        this.f = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f});
        int i3 = (int) (f2 * 3.0f);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        gqvVar.a(layerDrawable);
        this.c = vwfVar;
    }

    public static ilb0 g(mcl mclVar, ArrayList arrayList, dlb0 dlb0Var) {
        mclVar.getClass();
        ilb0 ilb0Var = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int g2 = mclVar.c.e.g();
            double d2 = g2 * g2;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ilb0 ilb0Var2 = (ilb0) it.next();
                double d3 = ilb0Var2.a - dlb0Var.a;
                double d4 = ilb0Var2.b - dlb0Var.b;
                double d5 = (d4 * d4) + (d3 * d3);
                if (d5 < d2) {
                    ilb0Var = ilb0Var2;
                    d2 = d5;
                }
            }
        }
        return ilb0Var;
    }

    @NonNull
    public final tb7 h(@NonNull kwf<T> kwfVar) {
        int size = kwfVar.getSize();
        int[] iArr = q;
        if (size > iArr[0]) {
            int i2 = 0;
            while (true) {
                if (i2 >= 6) {
                    size = iArr[6];
                    break;
                }
                int i3 = i2 + 1;
                if (size < iArr[i3]) {
                    size = iArr[i2];
                    break;
                }
                i2 = i3;
            }
        }
        SparseArray<tb7> sparseArray = this.h;
        tb7 tb7Var = sparseArray.get(size);
        if (tb7Var != null) {
            return tb7Var;
        }
        Paint paint = this.f.getPaint();
        float min = 300.0f - Math.min(size, 300.0f);
        paint.setColor(Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f}));
        String valueOf = size < iArr[0] ? String.valueOf(size) : l6g.a(size, "+");
        gqv gqvVar = this.b;
        TextView textView = gqvVar.c;
        if (textView != null) {
            textView.setText(valueOf);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = gqvVar.a;
        viewGroup.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        viewGroup.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        viewGroup.draw(new Canvas(createBitmap));
        tb7 k2 = znk0.k(createBitmap);
        sparseArray.put(size, k2);
        return k2;
    }

    public final void i() {
        vwf<T> vwfVar = this.c;
        io00.a aVar = vwfVar.c;
        aVar.e = new a();
        aVar.c = new b();
        aVar.d = new c();
        io00.a aVar2 = vwfVar.d;
        aVar2.e = new d();
        aVar2.c = new e();
        aVar2.d = new f();
    }

    public void j(@NonNull T t, @NonNull MarkerOptions markerOptions) {
        if (t.getTitle() != null && t.d() != null) {
            markerOptions.c = t.getTitle();
            markerOptions.d = t.d();
        } else if (t.getTitle() != null) {
            markerOptions.c = t.getTitle();
        } else if (t.d() != null) {
            markerOptions.c = t.d();
        }
    }

    public void k(@NonNull kwf<T> kwfVar, @NonNull MarkerOptions markerOptions) {
        markerOptions.e = h(kwfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(@NonNull T t, @NonNull eo00 eo00Var) {
        com.google.android.gms.internal.maps.zzx zzxVar = eo00Var.a;
        boolean z = true;
        boolean z2 = false;
        if (t.getTitle() == null || t.d() == null) {
            if (t.d() != null) {
                try {
                    if (!t.d().equals(zzxVar.zzl())) {
                        try {
                            zzxVar.zzy(t.d());
                            z2 = true;
                            if (eo00Var.a().equals(t.getPosition())) {
                                z = z2;
                            } else {
                                eo00Var.d(t.getPosition());
                            }
                            if (z) {
                                try {
                                    if (zzxVar.zzF()) {
                                        try {
                                            zzxVar.zzB();
                                            return;
                                        } catch (RemoteException e2) {
                                            throw new RuntimeRemoteException(e2);
                                        }
                                    }
                                    return;
                                } catch (RemoteException e3) {
                                    throw new RuntimeRemoteException(e3);
                                }
                            }
                            return;
                        } catch (RemoteException e4) {
                            throw new RuntimeRemoteException(e4);
                        }
                    }
                } catch (RemoteException e5) {
                    throw new RuntimeRemoteException(e5);
                }
            }
            if (t.getTitle() != null) {
                try {
                    if (!t.getTitle().equals(zzxVar.zzl())) {
                        try {
                            zzxVar.zzy(t.getTitle());
                            z2 = true;
                        } catch (RemoteException e6) {
                            throw new RuntimeRemoteException(e6);
                        }
                    }
                } catch (RemoteException e7) {
                    throw new RuntimeRemoteException(e7);
                }
            }
            if (eo00Var.a().equals(t.getPosition())) {
            }
            if (z) {
            }
        } else {
            try {
                if (!t.getTitle().equals(zzxVar.zzl())) {
                    try {
                        zzxVar.zzy(t.getTitle());
                        z2 = true;
                    } catch (RemoteException e8) {
                        throw new RuntimeRemoteException(e8);
                    }
                }
                try {
                    if (!t.d().equals(zzxVar.zzk())) {
                        try {
                            zzxVar.zzw(t.d());
                            z2 = true;
                        } catch (RemoteException e9) {
                            throw new RuntimeRemoteException(e9);
                        }
                    }
                    if (eo00Var.a().equals(t.getPosition())) {
                    }
                    if (z) {
                    }
                } catch (RemoteException e10) {
                    throw new RuntimeRemoteException(e10);
                }
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        }
    }

    public void m(@NonNull kwf<T> kwfVar, @NonNull eo00 eo00Var) {
        eo00Var.c(h(kwfVar));
    }

    public boolean n(@NonNull kwf<T> kwfVar) {
        return kwfVar.getSize() >= this.j;
    }
}
