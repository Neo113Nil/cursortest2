package xsna;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import xsna.fs9;
import xsna.if9;
import xsna.snw;
import xsna.ub9;
import xsna.we9;
import xsna.ycp0;

/* compiled from: Camera2CameraControlImpl.java */
/* loaded from: classes11.dex */
public final class re9 implements CameraControlInternal {
    public final b b;
    public final tli0 c;
    public final Object d = new Object();
    public final tg9 e;
    public final we9.d f;
    public final r.b g;
    public volatile Rational h;
    public final zvr i;
    public final p6y0 j;
    public final ycp0 k;
    public final saq l;
    public final me9 m;
    public final z41 n;
    public int o;
    public volatile int p;
    public final kci q;
    public final a r;

    /* compiled from: Camera2CameraControlImpl.java */
    public static final class a extends gg9 {
        public final HashSet a = new HashSet();
        public final ArrayMap b = new ArrayMap();

        @Override // xsna.gg9
        public final void a() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                gg9 gg9Var = (gg9) it.next();
                try {
                    ((Executor) this.b.get(gg9Var)).execute(new cs2(gg9Var, 4));
                } catch (RejectedExecutionException e) {
                    s100.a("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // xsna.gg9
        public final void b(@NonNull he9 he9Var) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                gg9 gg9Var = (gg9) it.next();
                try {
                    ((Executor) this.b.get(gg9Var)).execute(new wv4(3, gg9Var, he9Var));
                } catch (RejectedExecutionException e) {
                    s100.a("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // xsna.gg9
        public final void c(@NonNull CameraCaptureFailure cameraCaptureFailure) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                gg9 gg9Var = (gg9) it.next();
                try {
                    ((Executor) this.b.get(gg9Var)).execute(new qe9(0, gg9Var, cameraCaptureFailure));
                } catch (RejectedExecutionException e) {
                    s100.a("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }
    }

    /* compiled from: Camera2CameraControlImpl.java */
    public static final class b extends CameraCaptureSession.CaptureCallback {
        public final HashSet a = new HashSet();
        public final tli0 b;

        public b(@NonNull tli0 tli0Var) {
            this.b = tli0Var;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            this.b.execute(new zv4(1, this, totalCaptureResult));
        }
    }

    /* compiled from: Camera2CameraControlImpl.java */
    public interface c {
        boolean a(@NonNull TotalCaptureResult totalCaptureResult);
    }

    public re9(@NonNull tg9 tg9Var, @NonNull mtu mtuVar, @NonNull tli0 tli0Var, @NonNull we9.d dVar, @NonNull sse0 sse0Var) {
        r.b bVar = new r.b();
        this.g = bVar;
        this.h = null;
        this.o = 0;
        this.p = 2;
        this.q = new kci();
        a aVar = new a();
        this.r = aVar;
        this.e = tg9Var;
        this.f = dVar;
        this.c = tli0Var;
        b bVar2 = new b(tli0Var);
        this.b = bVar2;
        bVar.b.c = 1;
        bVar.b.b(new cs9(bVar2));
        bVar.b.b(aVar);
        this.l = new saq(this, tli0Var);
        this.i = new zvr(this, mtuVar, tli0Var);
        this.j = new p6y0(this, tg9Var, tli0Var);
        ycp0 ycp0Var = new ycp0();
        ycp0.a aVar2 = new ycp0.a();
        Boolean bool = (Boolean) tg9Var.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null) {
            bool.booleanValue();
        }
        new ug50(0);
        this.b.a.add(aVar2);
        this.k = ycp0Var;
        this.n = new z41(sse0Var);
        this.m = new me9(this, tli0Var);
        tli0Var.execute(new wk(this, 4));
        tli0Var.execute(new kv3(this, 2));
    }

    public static boolean k(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public final ugz<androidx.camera.core.impl.c> a() {
        return !j() ? new snw.a(new CameraControl$OperationCanceledException("Camera is not active.")) : r0t.e(ub9.a(new n7(this, 7)));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void b(@NonNull ArrayList arrayList) {
        if (j()) {
            this.c.execute(new nl6(1, this, arrayList));
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void c(final boolean z, final boolean z2) {
        if (j()) {
            this.c.execute(new Runnable() { // from class: xsna.pe9
                @Override // java.lang.Runnable
                public final void run() {
                    re9.this.i.a(z, z2);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public final ugz<androidx.camera.core.impl.c> d() {
        return !j() ? new snw.a(new CameraControl$OperationCanceledException("Camera is not active.")) : r0t.e(ub9.a(new p7(this, 8)));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void e(int i) {
        if (j()) {
            this.p = i;
            this.c.execute(new kv3(this, 2));
        }
    }

    public final void f(@NonNull Config config) {
        me9 me9Var = this.m;
        fs9.a aVar = new fs9.a();
        config.b(new rr2(aVar, config));
        androidx.camera.core.impl.o y = androidx.camera.core.impl.o.y(aVar.a);
        synchronized (me9Var.e) {
            try {
                for (Config.a<?> aVar2 : y.e()) {
                    me9Var.f.a.C(aVar2, y.f(aVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        r0t.e(ub9.a(new com.vk.movika.sdk.base.ui.p0(me9Var, 6))).addListener(new oe9(), xo9.g());
    }

    public final void g() {
        me9 me9Var = this.m;
        synchronized (me9Var.e) {
            me9Var.f = new if9.a();
        }
        r0t.e(ub9.a(new e7(me9Var, 6))).addListener(new oe9(), xo9.g());
    }

    public final void h() {
        synchronized (this.d) {
            try {
                int i = this.o;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.o = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int i(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (k(i, iArr)) {
            return i;
        }
        if (k(4, iArr)) {
            return 4;
        }
        return k(1, iArr) ? 1 : 0;
    }

    public final boolean j() {
        int i;
        synchronized (this.d) {
            i = this.o;
        }
        return i > 0;
    }

    public final void l(final boolean z) {
        vm5 e;
        zvr zvrVar = this.i;
        if (z != zvrVar.d) {
            zvrVar.d = z;
            if (!zvrVar.d) {
                zvrVar.b();
            }
        }
        p6y0 p6y0Var = this.j;
        if (p6y0Var.f != z) {
            p6y0Var.f = z;
            if (!z) {
                synchronized (p6y0Var.c) {
                    p6y0Var.c.e(1.0f);
                    e = spw.e(p6y0Var.c);
                }
                p6y0Var.a(e);
                p6y0Var.e.d();
                p6y0Var.a.n();
            }
        }
        ycp0 ycp0Var = this.k;
        if (ycp0Var.a != z) {
            ycp0Var.a = z;
        }
        saq saqVar = this.l;
        if (z != saqVar.b) {
            saqVar.b = z;
            if (!z) {
                synchronized (saqVar.a.a) {
                }
            }
        }
        final me9 me9Var = this.m;
        me9Var.d.execute(new Runnable() { // from class: xsna.ie9
            @Override // java.lang.Runnable
            public final void run() {
                me9 me9Var2 = me9.this;
                boolean z2 = z;
                if (me9Var2.a == z2) {
                    return;
                }
                me9Var2.a = z2;
                if (z2) {
                    if (me9Var2.b) {
                        re9 re9Var = me9Var2.c;
                        re9Var.c.execute(new kv3(re9Var, 2));
                        me9Var2.b = false;
                        return;
                    }
                    return;
                }
                synchronized (me9Var2.e) {
                    me9Var2.f = new if9.a();
                }
                ub9.a<Void> aVar = me9Var2.g;
                if (aVar != null) {
                    aVar.d(new CameraControl$OperationCanceledException("The camera control has became inactive."));
                    me9Var2.g = null;
                }
            }
        });
    }

    public final void m(List<androidx.camera.core.impl.f> list) {
        we9 we9Var = we9.this;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.f fVar : list) {
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.n.z();
            ArrayList arrayList2 = new ArrayList();
            ai50.b();
            hashSet.addAll(fVar.a);
            androidx.camera.core.impl.n A = androidx.camera.core.impl.n.A(fVar.b);
            int i = fVar.c;
            arrayList2.addAll(fVar.d);
            boolean z = fVar.e;
            d0o0 d0o0Var = fVar.f;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : d0o0Var.a.keySet()) {
                arrayMap.put(str, d0o0Var.a(str));
            }
            ai50 ai50Var = new ai50(arrayMap);
            if (Collections.unmodifiableList(fVar.a).isEmpty() && fVar.e) {
                if (hashSet.isEmpty()) {
                    androidx.camera.core.impl.t tVar = we9Var.b;
                    tVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : tVar.a.entrySet()) {
                        t.a aVar = (t.a) entry.getValue();
                        if (aVar.c && aVar.b) {
                            arrayList3.add(((t.a) entry.getValue()).a);
                        }
                    }
                    Iterator it = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it.hasNext()) {
                        List unmodifiableList = Collections.unmodifiableList(((androidx.camera.core.impl.r) it.next()).f.a);
                        if (!unmodifiableList.isEmpty()) {
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                hashSet.add((DeferrableSurface) it2.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            androidx.camera.core.impl.o y = androidx.camera.core.impl.o.y(A);
            d0o0 d0o0Var2 = d0o0.b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str2 : ai50Var.a.keySet()) {
                arrayMap2.put(str2, ai50Var.a(str2));
            }
            arrayList.add(new androidx.camera.core.impl.f(arrayList4, y, i, arrayList2, z, new d0o0(arrayMap2)));
        }
        we9Var.toString();
        we9Var.l.d(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        int i;
        int[] iArr;
        saq saqVar;
        r.b bVar = this.g;
        if9.a aVar = new if9.a();
        int i2 = 1;
        aVar.a(CaptureRequest.CONTROL_MODE, 1);
        zvr zvrVar = this.i;
        aVar.a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(zvrVar.a.i(zvrVar.e ? 1 : 4)));
        MeteringRectangle[] meteringRectangleArr = zvrVar.k;
        if (meteringRectangleArr.length != 0) {
            aVar.a(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = zvrVar.l;
        if (meteringRectangleArr2.length != 0) {
            aVar.a(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = zvrVar.m;
        if (meteringRectangleArr3.length != 0) {
            aVar.a(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
        Range<Integer> range = this.n.a;
        if (range != null) {
            aVar.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
        this.j.e.f(aVar);
        int i3 = this.p;
        if (i3 != 0) {
            if (i3 == 1) {
                i = 3;
            }
            i = 1;
        } else {
            this.q.getClass();
            if (((i4k) n6m.a.a(i4k.class)) == null) {
                i = 2;
            }
            i = 1;
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        int[] iArr2 = (int[]) this.e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr2 != null) {
            if (!k(i, iArr2)) {
                if (k(1, iArr2)) {
                    i = 1;
                }
            }
            aVar.a(key, Integer.valueOf(i));
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!k(1, iArr) && !k(1, iArr))) {
                i2 = 0;
            }
            aVar.a(key2, Integer.valueOf(i2));
            saqVar = this.l;
            saqVar.getClass();
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            synchronized (saqVar.a.a) {
            }
            aVar.a(key3, 0);
            if9 a2 = this.m.a();
            for (Config.a<?> aVar2 : a2.e()) {
                aVar.a.B(aVar2, Config.OptionPriority.ALWAYS_OVERRIDE, a2.f(aVar2));
            }
            if9 if9Var = new if9(androidx.camera.core.impl.o.y(aVar.a));
            f.a aVar3 = bVar.b;
            aVar3.getClass();
            aVar3.b = androidx.camera.core.impl.n.A(if9Var);
            Object g = this.m.a().s.g(if9.y, null);
            if (g != null && (g instanceof Integer)) {
                this.g.b.f.a.put("Camera2CameraControl", (Integer) g);
            }
            we9.d dVar = this.f;
            androidx.camera.core.impl.r b2 = this.g.b();
            we9 we9Var = we9.this;
            we9Var.m = b2;
            we9Var.y();
            return;
        }
        i = 0;
        aVar.a(key, Integer.valueOf(i));
        CaptureRequest.Key key22 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
        }
        i2 = 0;
        aVar.a(key22, Integer.valueOf(i2));
        saqVar = this.l;
        saqVar.getClass();
        CaptureRequest.Key key32 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        synchronized (saqVar.a.a) {
        }
    }
}
