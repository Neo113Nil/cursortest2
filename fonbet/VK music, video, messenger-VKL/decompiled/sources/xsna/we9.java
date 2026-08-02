package xsna;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.gs9;
import xsna.snw;
import xsna.ub9;
import xsna.wiz;
import xsna.zon0;

/* compiled from: Camera2CameraImpl.java */
/* loaded from: classes11.dex */
public final class we9 implements CameraInternal {
    public final androidx.camera.core.impl.t b;
    public final bj9 c;
    public final tli0 d;
    public volatile e e = e.INITIALIZED;
    public final wiz<CameraInternal.State> f;
    public final re9 g;
    public final f h;

    @NonNull
    public final ze9 i;

    @Nullable
    public CameraDevice j;
    public int k;
    public gs9 l;
    public androidx.camera.core.impl.r m;
    public final AtomicInteger n;
    public ugz<Void> o;
    public ub9.a<Void> p;
    public final LinkedHashMap q;
    public final c r;
    public final androidx.camera.core.impl.e s;
    public final HashSet t;
    public hj20 u;

    @NonNull
    public final hs9 v;

    @NonNull
    public final zon0.a w;
    public final HashSet x;

    /* compiled from: Camera2CameraImpl.java */
    public class a implements o0t<Void> {
        public a() {
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            boolean z = th instanceof CameraAccessException;
            we9 we9Var = we9.this;
            if (z) {
                th.getMessage();
                we9Var.toString();
                return;
            }
            if (th instanceof CancellationException) {
                we9Var.toString();
                return;
            }
            androidx.camera.core.impl.r rVar = null;
            if (!(th instanceof DeferrableSurface.SurfaceClosedException)) {
                if (!(th instanceof TimeoutException)) {
                    throw new RuntimeException(th);
                }
                s100.a("Camera2CameraImpl", "Unable to configure camera " + we9Var.i.a + ", timeout!", null);
                return;
            }
            DeferrableSurface d = ((DeferrableSurface.SurfaceClosedException) th).d();
            Iterator<androidx.camera.core.impl.r> it = we9Var.b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.camera.core.impl.r next = it.next();
                if (Collections.unmodifiableList(next.a).contains(d)) {
                    rVar = next;
                    break;
                }
            }
            if (rVar != null) {
                mtu t = xo9.t();
                List<r.c> list = rVar.e;
                if (list.isEmpty()) {
                    return;
                }
                r.c cVar = list.get(0);
                new Throwable();
                we9Var.toString();
                t.execute(new bi5(cVar, rVar));
            }
        }

        @Override // xsna.o0t
        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    public final class c extends CameraManager.AvailabilityCallback {
        public final String a;
        public boolean b = true;

        public c(String str) {
            this.a = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(@NonNull String str) {
            if (this.a.equals(str)) {
                this.b = true;
                if (we9.this.e == e.PENDING_OPEN) {
                    we9.this.x(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(@NonNull String str) {
            if (this.a.equals(str)) {
                this.b = false;
            }
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    public final class d {
        public d() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Camera2CameraImpl.java */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e CLOSING;
        public static final e INITIALIZED;
        public static final e OPENED;
        public static final e OPENING;
        public static final e PENDING_OPEN;
        public static final e RELEASED;
        public static final e RELEASING;
        public static final e REOPENING;

        static {
            e eVar = new e("INITIALIZED", 0);
            INITIALIZED = eVar;
            e eVar2 = new e("PENDING_OPEN", 1);
            PENDING_OPEN = eVar2;
            e eVar3 = new e("OPENING", 2);
            OPENING = eVar3;
            e eVar4 = new e("OPENED", 3);
            OPENED = eVar4;
            e eVar5 = new e("CLOSING", 4);
            CLOSING = eVar5;
            e eVar6 = new e("REOPENING", 5);
            REOPENING = eVar6;
            e eVar7 = new e("RELEASING", 6);
            RELEASING = eVar7;
            e eVar8 = new e("RELEASED", 7);
            RELEASED = eVar8;
            $VALUES = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    public final class f extends CameraDevice.StateCallback {
        public final tli0 a;
        public final mtu b;
        public b c;
        public ScheduledFuture<?> d;

        @NonNull
        public final a e;

        /* compiled from: Camera2CameraImpl.java */
        public class a {
            public long a;
        }

        /* compiled from: Camera2CameraImpl.java */
        public class b implements Runnable {
            public final Executor b;
            public boolean c = false;

            public b(@NonNull tli0 tli0Var) {
                this.b = tli0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.execute(new o4(this, 3));
            }
        }

        public f(@NonNull tli0 tli0Var, @NonNull mtu mtuVar) {
            a aVar = new a();
            aVar.a = -1L;
            this.e = aVar;
            this.a = tli0Var;
            this.b = mtuVar;
        }

        public final boolean a() {
            if (this.d == null) {
                return false;
            }
            Objects.toString(this.c);
            we9.this.toString();
            this.c.c = true;
            this.c = null;
            this.d.cancel(false);
            this.d = null;
            return true;
        }

        public final void b() {
            obr.f(null, this.c == null);
            obr.f(null, this.d == null);
            a aVar = this.e;
            aVar.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = aVar.a;
            we9 we9Var = we9.this;
            if (j == -1) {
                aVar.a = uptimeMillis;
            } else if (uptimeMillis - j >= 10000) {
                aVar.a = -1L;
                s100.a("Camera2CameraImpl", "Camera reopening attempted for 10000ms without success.", null);
                we9Var.v(e.PENDING_OPEN, false);
                return;
            }
            b bVar = new b(this.a);
            this.c = bVar;
            Objects.toString(bVar);
            we9Var.toString();
            this.d = this.b.schedule(this.c, 700L, TimeUnit.MILLISECONDS);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull CameraDevice cameraDevice) {
            we9.this.toString();
            obr.f("Unexpected onClose callback on camera device: " + cameraDevice, we9.this.j == null);
            int i = b.a[we9.this.e.ordinal()];
            if (i != 3) {
                if (i == 6) {
                    we9 we9Var = we9.this;
                    int i2 = we9Var.k;
                    if (i2 == 0) {
                        we9Var.x(false);
                        return;
                    }
                    "Camera closed due to error: ".concat(we9.o(i2));
                    we9Var.toString();
                    b();
                    return;
                }
                if (i != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + we9.this.e);
                }
            }
            obr.f(null, we9.this.p());
            we9.this.n();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            we9.this.toString();
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            we9 we9Var = we9.this;
            we9Var.j = cameraDevice;
            we9Var.k = i;
            int i2 = b.a[we9Var.e.ordinal()];
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    cameraDevice.getId();
                    we9.this.e.name();
                    obr.f("Attempt to handle open error from non open state: " + we9.this.e, we9.this.e == e.OPENING || we9.this.e == e.OPENED || we9.this.e == e.REOPENING);
                    if (i == 1 || i == 2 || i == 4) {
                        cameraDevice.getId();
                        we9 we9Var2 = we9.this;
                        obr.f("Can only reopen camera device after error if the camera device is actually in an error state.", we9Var2.k != 0);
                        we9Var2.v(e.REOPENING, true);
                        we9Var2.l(false);
                        return;
                    }
                    s100.a("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + we9.o(i) + " closing camera.", null);
                    we9.this.v(e.CLOSING, true);
                    we9.this.l(false);
                    return;
                }
                if (i2 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + we9.this.e);
                }
            }
            String id = cameraDevice.getId();
            String o = we9.o(i);
            String name = we9.this.e.name();
            StringBuilder a2 = xe9.a("CameraDevice.onError(): ", id, " failed with ", o, " while in ");
            a2.append(name);
            a2.append(" state. Will finish closing camera.");
            s100.a("Camera2CameraImpl", a2.toString(), null);
            we9.this.l(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            we9.this.toString();
            we9 we9Var = we9.this;
            we9Var.j = cameraDevice;
            re9 re9Var = we9Var.g;
            try {
                re9Var.getClass();
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(1);
                zvr zvrVar = re9Var.i;
                zvrVar.getClass();
                zvrVar.n = (MeteringRectangle[]) createCaptureRequest.get(CaptureRequest.CONTROL_AF_REGIONS);
                zvrVar.o = (MeteringRectangle[]) createCaptureRequest.get(CaptureRequest.CONTROL_AE_REGIONS);
                zvrVar.p = (MeteringRectangle[]) createCaptureRequest.get(CaptureRequest.CONTROL_AWB_REGIONS);
            } catch (CameraAccessException e) {
                s100.a("Camera2CameraImpl", "fail to create capture request.", e);
            }
            we9 we9Var2 = we9.this;
            we9Var2.k = 0;
            int i = b.a[we9Var2.e.ordinal()];
            if (i != 3) {
                if (i == 5 || i == 6) {
                    we9.this.v(e.OPENED, true);
                    we9.this.r();
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + we9.this.e);
                }
            }
            obr.f(null, we9.this.p());
            we9.this.j.close();
            we9.this.j = null;
        }
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [T, androidx.camera.core.impl.CameraInternal$State] */
    public we9(@NonNull bj9 bj9Var, @NonNull String str, @NonNull ze9 ze9Var, @NonNull androidx.camera.core.impl.e eVar, @NonNull Executor executor, @NonNull Handler handler) throws CameraUnavailableException {
        wiz<CameraInternal.State> wizVar = new wiz<>();
        this.f = wizVar;
        this.k = 0;
        this.m = androidx.camera.core.impl.r.a();
        this.n = new AtomicInteger(0);
        this.q = new LinkedHashMap();
        this.t = new HashSet();
        this.x = new HashSet();
        this.c = bj9Var;
        this.s = eVar;
        mtu mtuVar = new mtu(handler);
        tli0 tli0Var = new tli0(executor);
        this.d = tli0Var;
        this.h = new f(tli0Var, mtuVar);
        this.b = new androidx.camera.core.impl.t(str);
        ?? r13 = CameraInternal.State.CLOSED;
        ug50<wiz.b<CameraInternal.State>> ug50Var = wizVar.a;
        wiz.b<CameraInternal.State> bVar = new wiz.b<>();
        bVar.a = r13;
        ug50Var.i(bVar);
        hs9 hs9Var = new hs9(tli0Var);
        this.v = hs9Var;
        this.l = new gs9();
        try {
            re9 re9Var = new re9(bj9Var.a(str), mtuVar, tli0Var, new d(), ze9Var.g);
            this.g = re9Var;
            this.i = ze9Var;
            ze9Var.j(re9Var);
            this.w = new zon0.a(tli0Var, mtuVar, handler, hs9Var, ze9Var.h());
            c cVar = new c(str);
            this.r = cVar;
            synchronized (eVar.b) {
                obr.f("Camera is already registered: " + this, !eVar.d.containsKey(this));
                eVar.d.put(this, new e.a(tli0Var, cVar));
            }
            bj9Var.a.a.registerAvailabilityCallback(tli0Var, cVar);
        } catch (CameraAccessExceptionCompat e2) {
            throw we7.f(e2);
        }
    }

    public static String o(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    @Override // xsna.vfq0.d
    public final void a(@NonNull vfq0 vfq0Var) {
        this.d.execute(new gq4(1, this, vfq0Var));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final ze9 c() {
        return this.i;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final wiz d() {
        return this.f;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void e(@NonNull ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            vfq0 vfq0Var = (vfq0) it.next();
            String str = vfq0Var.e() + vfq0Var.hashCode();
            HashSet hashSet = this.x;
            if (hashSet.contains(str)) {
                vfq0Var.q();
                hashSet.remove(vfq0Var.e() + vfq0Var.hashCode());
            }
        }
        this.d.execute(new ue9(0, this, arrayList));
    }

    @Override // xsna.vfq0.d
    public final void f(@NonNull vfq0 vfq0Var) {
        this.d.execute(new eo1(1, this, vfq0Var));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void g(@NonNull ArrayList arrayList) {
        re9 re9Var = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (re9Var.d) {
            re9Var.o++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        HashSet hashSet = this.x;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            vfq0 vfq0Var = (vfq0) it.next();
            if (!hashSet.contains(vfq0Var.e() + vfq0Var.hashCode())) {
                hashSet.add(vfq0Var.e() + vfq0Var.hashCode());
                vfq0Var.m();
            }
        }
        try {
            this.d.execute(new te9(0, this, arrayList));
        } catch (RejectedExecutionException unused) {
            toString();
            re9Var.h();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final re9 h() {
        return this.g;
    }

    @Override // xsna.vfq0.d
    public final void i(@NonNull vfq0 vfq0Var) {
        this.d.execute(new ew4(1, this, vfq0Var));
    }

    @Override // xsna.vfq0.d
    public final void j(@NonNull vfq0 vfq0Var) {
        this.d.execute(new h(2, this, vfq0Var));
    }

    public final void k() {
        androidx.camera.core.impl.t tVar = this.b;
        r.e a2 = tVar.a();
        HashMap hashMap = tVar.a;
        androidx.camera.core.impl.r b2 = a2.b();
        androidx.camera.core.impl.f fVar = b2.f;
        int size = Collections.unmodifiableList(fVar.a).size();
        ArrayList arrayList = b2.a;
        int size2 = Collections.unmodifiableList(arrayList).size();
        if (Collections.unmodifiableList(arrayList).isEmpty()) {
            return;
        }
        if (!Collections.unmodifiableList(fVar.a).isEmpty()) {
            if (size2 == 1 && size == 1) {
                t();
                return;
            } else {
                if (size >= 2) {
                    t();
                    return;
                }
                return;
            }
        }
        if (this.u == null) {
            this.u = new hj20(this.i.b);
        }
        if (this.u != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.u.getClass();
            sb.append(this.u.hashCode());
            String sb2 = sb.toString();
            androidx.camera.core.impl.r rVar = this.u.b;
            t.a aVar = (t.a) hashMap.get(sb2);
            if (aVar == null) {
                aVar = new t.a(rVar);
                hashMap.put(sb2, aVar);
            }
            aVar.b = true;
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.u.getClass();
            sb3.append(this.u.hashCode());
            String sb4 = sb3.toString();
            androidx.camera.core.impl.r rVar2 = this.u.b;
            t.a aVar2 = (t.a) hashMap.get(sb4);
            if (aVar2 == null) {
                aVar2 = new t.a(rVar2);
                hashMap.put(sb4, aVar2);
            }
            aVar2.c = true;
        }
    }

    public final void l(boolean z) {
        int i = 1;
        obr.f("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.e + " (error: " + o(this.k) + ")", this.e == e.CLOSING || this.e == e.RELEASING || (this.e == e.REOPENING && this.k != 0));
        if (Build.VERSION.SDK_INT < 29 && this.i.h() == 2 && this.k == 0) {
            gs9 gs9Var = new gs9();
            this.t.add(gs9Var);
            u();
            SurfaceTexture surfaceTexture = new SurfaceTexture(0);
            surfaceTexture.setDefaultBufferSize(640, 480);
            Surface surface = new Surface(surfaceTexture);
            hc3 hc3Var = new hc3(4, surface, surfaceTexture);
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            androidx.camera.core.impl.n z2 = androidx.camera.core.impl.n.z();
            ArrayList arrayList = new ArrayList();
            ai50 b2 = ai50.b();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            hashSet.add(new unw(surface));
            toString();
            ArrayList arrayList6 = new ArrayList(hashSet);
            ArrayList arrayList7 = new ArrayList(hashSet2);
            androidx.camera.core.impl.o y = androidx.camera.core.impl.o.y(z2);
            d0o0 d0o0Var = d0o0.b;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : b2.a.keySet()) {
                arrayMap.put(str, b2.a(str));
            }
            androidx.camera.core.impl.r rVar = new androidx.camera.core.impl.r(arrayList6, arrayList2, arrayList3, arrayList5, arrayList4, new androidx.camera.core.impl.f(arrayList7, y, 1, arrayList, false, new d0o0(arrayMap)));
            CameraDevice cameraDevice = this.j;
            cameraDevice.getClass();
            gs9Var.g(rVar, cameraDevice, this.w.a()).addListener(new bw4(this, gs9Var, hc3Var, i), this.d);
        } else {
            u();
        }
        ArrayList arrayList8 = this.l.b;
        if (arrayList8.isEmpty()) {
            return;
        }
        Iterator it = arrayList8.iterator();
        while (it.hasNext()) {
            Iterator<gg9> it2 = ((androidx.camera.core.impl.f) it.next()).d.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
        arrayList8.clear();
    }

    public final CameraDevice.StateCallback m() {
        ArrayList arrayList = new ArrayList(this.b.a().b().b);
        arrayList.add(this.h);
        arrayList.add(this.v.g);
        return arrayList.isEmpty() ? new sh9() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new rh9(arrayList);
    }

    public final void n() {
        obr.f(null, this.e == e.RELEASING || this.e == e.CLOSING);
        obr.f(null, this.q.isEmpty());
        this.j = null;
        if (this.e == e.CLOSING) {
            v(e.INITIALIZED, true);
            return;
        }
        this.c.a.a.unregisterAvailabilityCallback(this.r);
        v(e.RELEASED, true);
        ub9.a<Void> aVar = this.p;
        if (aVar != null) {
            aVar.b(null);
            this.p = null;
        }
    }

    public final boolean p() {
        return this.q.isEmpty() && this.t.isEmpty();
    }

    @SuppressLint({"MissingPermission"})
    public final void q(boolean z) {
        f fVar = this.h;
        if (!z) {
            fVar.e.a = -1L;
        }
        fVar.a();
        toString();
        v(e.OPENING, true);
        try {
            bj9 bj9Var = this.c;
            bj9Var.a.b(this.i.a, this.d, m());
        } catch (CameraAccessExceptionCompat e2) {
            e2.getMessage();
            toString();
            if (e2.d() != 10001) {
                return;
            }
            v(e.INITIALIZED, true);
        } catch (SecurityException e3) {
            e3.getMessage();
            toString();
            v(e.REOPENING, true);
            fVar.b();
        }
    }

    public final void r() {
        obr.f(null, this.e == e.OPENED);
        r.e a2 = this.b.a();
        if (!a2.h || !a2.g) {
            toString();
            return;
        }
        gs9 gs9Var = this.l;
        androidx.camera.core.impl.r b2 = a2.b();
        CameraDevice cameraDevice = this.j;
        cameraDevice.getClass();
        r0t.a(gs9Var.g(b2, cameraDevice, this.w.a()), new a(), this.d);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final ugz<Void> release() {
        return ub9.a(new mm6(this, 5));
    }

    public final ugz s(@NonNull gs9 gs9Var) {
        ugz ugzVar;
        synchronized (gs9Var.a) {
            int i = gs9.c.a[gs9Var.l.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + gs9Var.l);
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (gs9Var.g != null) {
                                ki9 ki9Var = gs9Var.i;
                                ki9Var.getClass();
                                List unmodifiableList = Collections.unmodifiableList(new ArrayList(ki9Var.a));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = unmodifiableList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((ji9) it.next());
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((ji9) it2.next()).getClass();
                                }
                                if (!arrayList2.isEmpty()) {
                                    try {
                                        gs9Var.d(gs9Var.i(arrayList2));
                                    } catch (IllegalStateException e2) {
                                        s100.a("CaptureSession", "Unable to issue the request before close the capture session", e2);
                                    }
                                }
                            }
                        }
                    }
                    obr.e(gs9Var.e, "The Opener shouldn't null in state:" + gs9Var.l);
                    gs9Var.e.a.stop();
                    gs9Var.l = gs9.d.CLOSED;
                    gs9Var.g = null;
                } else {
                    obr.e(gs9Var.e, "The Opener shouldn't null in state:" + gs9Var.l);
                    gs9Var.e.a.stop();
                }
            }
            gs9Var.l = gs9.d.RELEASED;
        }
        synchronized (gs9Var.a) {
            try {
                switch (gs9.c.a[gs9Var.l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("release() should not be possible in state: " + gs9Var.l);
                    case 3:
                        obr.e(gs9Var.e, "The Opener shouldn't null in state:" + gs9Var.l);
                        gs9Var.e.a.stop();
                    case 2:
                        gs9Var.l = gs9.d.RELEASED;
                        ugzVar = snw.c.c;
                        break;
                    case 5:
                    case 6:
                        xon0 xon0Var = gs9Var.f;
                        if (xon0Var != null) {
                            xon0Var.close();
                        }
                    case 4:
                        gs9Var.l = gs9.d.RELEASING;
                        obr.e(gs9Var.e, "The Opener shouldn't null in state:" + gs9Var.l);
                        if (gs9Var.e.a.stop()) {
                            gs9Var.b();
                            ugzVar = snw.c.c;
                            break;
                        }
                    case 7:
                        if (gs9Var.m == null) {
                            gs9Var.m = ub9.a(new j7(gs9Var, 9));
                        }
                        ugzVar = gs9Var.m;
                        break;
                    default:
                        ugzVar = snw.c.c;
                        break;
                }
            } finally {
            }
        }
        this.e.name();
        toString();
        this.q.put(gs9Var, ugzVar);
        r0t.a(ugzVar, new ve9(this, gs9Var), xo9.g());
        return ugzVar;
    }

    public final void t() {
        if (this.u != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.u.getClass();
            sb.append(this.u.hashCode());
            String sb2 = sb.toString();
            androidx.camera.core.impl.t tVar = this.b;
            HashMap hashMap = tVar.a;
            if (hashMap.containsKey(sb2)) {
                t.a aVar = (t.a) hashMap.get(sb2);
                aVar.b = false;
                if (!aVar.c) {
                    hashMap.remove(sb2);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.u.getClass();
            sb3.append(this.u.hashCode());
            tVar.c(sb3.toString());
            hj20 hj20Var = this.u;
            hj20Var.getClass();
            unw unwVar = hj20Var.a;
            if (unwVar != null) {
                unwVar.a();
            }
            hj20Var.a = null;
            this.u = null;
        }
    }

    @NonNull
    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.i.a);
    }

    public final void u() {
        androidx.camera.core.impl.r rVar;
        List<androidx.camera.core.impl.f> unmodifiableList;
        obr.f(null, this.l != null);
        toString();
        gs9 gs9Var = this.l;
        synchronized (gs9Var.a) {
            rVar = gs9Var.g;
        }
        synchronized (gs9Var.a) {
            unmodifiableList = Collections.unmodifiableList(gs9Var.b);
        }
        gs9 gs9Var2 = new gs9();
        this.l = gs9Var2;
        gs9Var2.h(rVar);
        this.l.d(unmodifiableList);
        s(gs9Var);
    }

    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, androidx.camera.core.impl.CameraInternal$State] */
    public final void v(@NonNull e eVar, boolean z) {
        ?? r10;
        CameraInternal.State state;
        Objects.toString(this.e);
        Objects.toString(eVar);
        toString();
        this.e = eVar;
        switch (b.a[eVar.ordinal()]) {
            case 1:
                r10 = CameraInternal.State.CLOSED;
                break;
            case 2:
                r10 = CameraInternal.State.PENDING_OPEN;
                break;
            case 3:
                r10 = CameraInternal.State.CLOSING;
                break;
            case 4:
                r10 = CameraInternal.State.OPEN;
                break;
            case 5:
            case 6:
                r10 = CameraInternal.State.OPENING;
                break;
            case 7:
                r10 = CameraInternal.State.RELEASING;
                break;
            case 8:
                r10 = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + eVar);
        }
        androidx.camera.core.impl.e eVar2 = this.s;
        synchronized (eVar2.b) {
            try {
                int i = eVar2.e;
                HashMap hashMap = null;
                if (r10 == CameraInternal.State.RELEASED) {
                    e.a aVar = (e.a) eVar2.d.remove(this);
                    if (aVar != null) {
                        eVar2.a();
                        state = aVar.a;
                    } else {
                        state = null;
                    }
                } else {
                    e.a aVar2 = (e.a) eVar2.d.get(this);
                    obr.e(aVar2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    CameraInternal.State state2 = aVar2.a;
                    aVar2.a = r10;
                    CameraInternal.State state3 = CameraInternal.State.OPENING;
                    if (r10 == state3) {
                        obr.f("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", (r10 != 0 && r10.h()) || state2 == state3);
                    }
                    if (state2 != r10) {
                        eVar2.a();
                    }
                    state = state2;
                }
                if (state != r10) {
                    if (i < 1 && eVar2.e > 0) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : eVar2.d.entrySet()) {
                            if (((e.a) entry.getValue()).a == CameraInternal.State.PENDING_OPEN) {
                                hashMap.put((lf9) entry.getKey(), (e.a) entry.getValue());
                            }
                        }
                    } else if (r10 == CameraInternal.State.PENDING_OPEN && eVar2.e > 0) {
                        hashMap = new HashMap();
                        hashMap.put(this, (e.a) eVar2.d.get(this));
                    }
                    if (hashMap != null && !z) {
                        hashMap.remove(this);
                    }
                    if (hashMap != null) {
                        for (e.a aVar3 : hashMap.values()) {
                            aVar3.getClass();
                            try {
                                aVar3.b.execute(new g0(aVar3.c, 6));
                            } catch (RejectedExecutionException e2) {
                                s100.a("CameraStateRegistry", "Unable to notify camera.", e2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
        ug50<wiz.b<CameraInternal.State>> ug50Var = this.f.a;
        wiz.b<CameraInternal.State> bVar = new wiz.b<>();
        bVar.a = r10;
        ug50Var.i(bVar);
    }

    public final void w(@NonNull Collection<vfq0> collection) {
        boolean isEmpty = this.b.b().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator<vfq0> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            vfq0 next = it.next();
            androidx.camera.core.impl.t tVar = this.b;
            String str = next.e() + next.hashCode();
            HashMap hashMap = tVar.a;
            if (!(hashMap.containsKey(str) ? ((t.a) hashMap.get(str)).b : false)) {
                try {
                    androidx.camera.core.impl.t tVar2 = this.b;
                    String str2 = next.e() + next.hashCode();
                    androidx.camera.core.impl.r rVar = next.k;
                    HashMap hashMap2 = tVar2.a;
                    t.a aVar = (t.a) hashMap2.get(str2);
                    if (aVar == null) {
                        aVar = new t.a(rVar);
                        hashMap2.put(str2, aVar);
                    }
                    aVar.b = true;
                    arrayList.add(next);
                } catch (NullPointerException unused) {
                    toString();
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        TextUtils.join(", ", arrayList);
        toString();
        if (isEmpty) {
            this.g.l(true);
            re9 re9Var = this.g;
            synchronized (re9Var.d) {
                re9Var.o++;
            }
        }
        k();
        y();
        u();
        e eVar = this.e;
        e eVar2 = e.OPENED;
        if (eVar == eVar2) {
            r();
        } else {
            int i = b.a[this.e.ordinal()];
            if (i == 1 || i == 2) {
                toString();
                if (this.s.b(this)) {
                    q(false);
                } else {
                    toString();
                    v(e.PENDING_OPEN, true);
                }
            } else if (i != 3) {
                Objects.toString(this.e);
                toString();
            } else {
                v(e.REOPENING, true);
                if (!p() && this.k == 0) {
                    obr.f("Camera Device should be open if session close is not complete", this.j != null);
                    v(eVar2, true);
                    r();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            vfq0 vfq0Var = (vfq0) it2.next();
            if (vfq0Var instanceof n3d0) {
                Size size = vfq0Var.g;
                if (size != null) {
                    this.g.h = new Rational(size.getWidth(), size.getHeight());
                    return;
                }
                return;
            }
        }
    }

    public final void x(boolean z) {
        toString();
        if (this.r.b && this.s.b(this)) {
            q(z);
        } else {
            toString();
            v(e.PENDING_OPEN, true);
        }
    }

    public final void y() {
        androidx.camera.core.impl.t tVar = this.b;
        tVar.getClass();
        r.e eVar = new r.e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : tVar.a.entrySet()) {
            t.a aVar = (t.a) entry.getValue();
            if (aVar.c && aVar.b) {
                String str = (String) entry.getKey();
                eVar.a(aVar.a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        if (!eVar.h || !eVar.g) {
            this.l.h(this.m);
            return;
        }
        eVar.a(this.m);
        this.l.h(eVar.b());
    }
}
