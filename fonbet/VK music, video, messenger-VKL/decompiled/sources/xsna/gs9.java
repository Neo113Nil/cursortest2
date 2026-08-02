package xsna;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import xsna.snw;
import xsna.ub9;
import xsna.von0;

/* compiled from: CaptureSession.java */
/* loaded from: classes11.dex */
public final class gs9 {

    @Nullable
    public zon0 e;

    @Nullable
    public xon0 f;

    @Nullable
    public volatile androidx.camera.core.impl.r g;
    public d l;
    public ub9.d m;
    public ub9.a<Void> n;
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final a c = new a();

    @NonNull
    public volatile androidx.camera.core.impl.o h = androidx.camera.core.impl.o.u;

    @NonNull
    public ki9 i = ki9.b();
    public final HashMap j = new HashMap();
    public List<DeferrableSurface> k = Collections.EMPTY_LIST;
    public final vfl0 o = new vfl0();
    public final e d = new e();

    /* compiled from: CaptureSession.java */
    public class b implements o0t<Void> {
        public b() {
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            gs9.this.e.a.stop();
            synchronized (gs9.this.a) {
                try {
                    int i = c.a[gs9.this.l.ordinal()];
                    if ((i == 4 || i == 6 || i == 7) && !(th instanceof CancellationException)) {
                        Objects.toString(gs9.this.l);
                        gs9.this.b();
                    }
                } finally {
                }
            }
        }

        @Override // xsna.o0t
        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
        }
    }

    /* compiled from: CaptureSession.java */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CaptureSession.java */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d CLOSED;
        public static final d GET_SURFACE;
        public static final d INITIALIZED;
        public static final d OPENED;
        public static final d OPENING;
        public static final d RELEASED;
        public static final d RELEASING;
        public static final d UNINITIALIZED;

        static {
            d dVar = new d("UNINITIALIZED", 0);
            UNINITIALIZED = dVar;
            d dVar2 = new d("INITIALIZED", 1);
            INITIALIZED = dVar2;
            d dVar3 = new d("GET_SURFACE", 2);
            GET_SURFACE = dVar3;
            d dVar4 = new d("OPENING", 3);
            OPENING = dVar4;
            d dVar5 = new d("OPENED", 4);
            OPENED = dVar5;
            d dVar6 = new d("CLOSED", 5);
            CLOSED = dVar6;
            d dVar7 = new d("RELEASING", 6);
            RELEASING = dVar7;
            d dVar8 = new d("RELEASED", 7);
            RELEASED = dVar8;
            $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* compiled from: CaptureSession.java */
    public final class e extends von0.a {
        public e() {
        }

        @Override // xsna.von0.a
        public final void i(@NonNull von0 von0Var) {
            synchronized (gs9.this.a) {
                try {
                    gs9 gs9Var = gs9.this;
                    if (gs9Var.l == d.UNINITIALIZED) {
                        throw new IllegalStateException("onClosed() should not be possible in state: " + gs9.this.l);
                    }
                    gs9Var.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.von0.a
        public final void j(@NonNull von0 von0Var) {
            synchronized (gs9.this.a) {
                try {
                    switch (c.a[gs9.this.l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 8:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + gs9.this.l);
                        case 4:
                        case 6:
                        case 7:
                            gs9.this.b();
                            break;
                    }
                    s100.a("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + gs9.this.l, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.von0.a
        public final void k(@NonNull xon0 xon0Var) {
            synchronized (gs9.this.a) {
                try {
                    switch (c.a[gs9.this.l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 8:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + gs9.this.l);
                        case 4:
                            gs9 gs9Var = gs9.this;
                            gs9Var.l = d.OPENED;
                            gs9Var.f = xon0Var;
                            if (gs9Var.g != null) {
                                ki9 ki9Var = gs9.this.i;
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
                                    gs9 gs9Var2 = gs9.this;
                                    gs9Var2.c(gs9Var2.i(arrayList2));
                                }
                            }
                            gs9.this.e();
                            gs9 gs9Var3 = gs9.this;
                            ArrayList arrayList3 = gs9Var3.b;
                            if (!arrayList3.isEmpty()) {
                                try {
                                    gs9Var3.c(arrayList3);
                                } finally {
                                    arrayList3.clear();
                                }
                            }
                            Objects.toString(gs9.this.l);
                            break;
                        case 6:
                            gs9.this.f = xon0Var;
                            Objects.toString(gs9.this.l);
                            break;
                        case 7:
                            xon0Var.close();
                            Objects.toString(gs9.this.l);
                            break;
                        default:
                            Objects.toString(gs9.this.l);
                            break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
                throw th;
            }
        }

        @Override // xsna.von0.a
        public final void l(@NonNull xon0 xon0Var) {
            synchronized (gs9.this.a) {
                try {
                    if (c.a[gs9.this.l.ordinal()] == 1) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + gs9.this.l);
                    }
                    Objects.toString(gs9.this.l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public gs9() {
        this.l = d.UNINITIALIZED;
        this.l = d.INITIALIZED;
    }

    public static af9 a(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback af9Var;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gg9 gg9Var = (gg9) it.next();
            if (gg9Var == null) {
                af9Var = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                ds9.a(gg9Var, arrayList2);
                af9Var = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new af9(arrayList2);
            }
            arrayList.add(af9Var);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new af9(arrayList);
    }

    @NonNull
    public static androidx.camera.core.impl.n f(ArrayList arrayList) {
        Object obj;
        androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.o oVar = ((androidx.camera.core.impl.f) it.next()).b;
            for (Config.a<?> aVar : oVar.e()) {
                Object obj2 = null;
                try {
                    obj = oVar.f(aVar);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                if (z.s.containsKey(aVar)) {
                    try {
                        obj2 = z.f(aVar);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (!Objects.equals(obj2, obj)) {
                        aVar.b();
                        Objects.toString(obj);
                        Objects.toString(obj2);
                    }
                } else {
                    z.C(aVar, obj);
                }
            }
        }
        return z;
    }

    public final void b() {
        d dVar = this.l;
        d dVar2 = d.RELEASED;
        if (dVar == dVar2) {
            return;
        }
        this.l = dVar2;
        this.f = null;
        Iterator<DeferrableSurface> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.k.clear();
        ub9.a<Void> aVar = this.n;
        if (aVar != null) {
            aVar.b(null);
            this.n = null;
        }
    }

    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            zf9 zf9Var = new zf9();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                androidx.camera.core.impl.f fVar = (androidx.camera.core.impl.f) it.next();
                if (!Collections.unmodifiableList(fVar.a).isEmpty()) {
                    Iterator it2 = Collections.unmodifiableList(fVar.a).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            DeferrableSurface deferrableSurface = (DeferrableSurface) it2.next();
                            if (!this.j.containsKey(deferrableSurface)) {
                                Objects.toString(deferrableSurface);
                                break;
                            }
                        } else {
                            if (fVar.c == 2) {
                                z = true;
                            }
                            f.a aVar = new f.a(fVar);
                            if (this.g != null) {
                                aVar.c(this.g.f.b);
                            }
                            aVar.c(this.h);
                            aVar.c(fVar.b);
                            CaptureRequest b2 = df9.b(aVar.d(), this.f.o(), this.j);
                            if (b2 == null) {
                                return;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<gg9> it3 = fVar.d.iterator();
                            while (it3.hasNext()) {
                                ds9.a(it3.next(), arrayList3);
                            }
                            HashMap hashMap = zf9Var.a;
                            List list = (List) hashMap.get(b2);
                            if (list != null) {
                                ArrayList arrayList4 = new ArrayList(list.size() + arrayList3.size());
                                arrayList4.addAll(arrayList3);
                                arrayList4.addAll(list);
                                hashMap.put(b2, arrayList4);
                            } else {
                                hashMap.put(b2, arrayList3);
                            }
                            arrayList2.add(b2);
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            if (this.o.a && z) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    int intValue = ((Integer) ((CaptureRequest) it4.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                    if (intValue == 2 || intValue == 3) {
                        this.f.p();
                        zf9Var.b = new qa(this, 5);
                        break;
                    }
                }
            }
            xon0 xon0Var = this.f;
            obr.e(xon0Var.f, "Need to call openCaptureSession before using this API.");
            xon0Var.f.a.a.captureBurstRequests(arrayList2, xon0Var.c, zf9Var);
        } catch (CameraAccessException e2) {
            s100.a("CaptureSession", "Unable to access camera: " + e2.getMessage(), null);
            Thread.dumpStack();
        }
    }

    public final void d(List<androidx.camera.core.impl.f> list) {
        synchronized (this.a) {
            try {
                switch (c.a[this.l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.l);
                    case 2:
                    case 3:
                    case 4:
                        this.b.addAll(list);
                        break;
                    case 5:
                        this.b.addAll(list);
                        ArrayList arrayList = this.b;
                        if (!arrayList.isEmpty()) {
                            try {
                                c(arrayList);
                                arrayList.clear();
                            } catch (Throwable th) {
                                arrayList.clear();
                                throw th;
                            }
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final void e() {
        if (this.g == null) {
            return;
        }
        androidx.camera.core.impl.f fVar = this.g.f;
        if (Collections.unmodifiableList(fVar.a).isEmpty()) {
            try {
                this.f.p();
                return;
            } catch (CameraAccessException e2) {
                s100.a("CaptureSession", "Unable to access camera: " + e2.getMessage(), null);
                Thread.dumpStack();
                return;
            }
        }
        try {
            f.a aVar = new f.a(fVar);
            ki9 ki9Var = this.i;
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
            this.h = f(arrayList2);
            aVar.c(this.h);
            CaptureRequest b2 = df9.b(aVar.d(), this.f.o(), this.j);
            if (b2 == null) {
                return;
            }
            this.f.c(b2, a(fVar.d, this.c));
        } catch (CameraAccessException e3) {
            s100.a("CaptureSession", "Unable to access camera: " + e3.getMessage(), null);
            Thread.dumpStack();
        }
    }

    @NonNull
    public final ugz<Void> g(@NonNull androidx.camera.core.impl.r rVar, @NonNull CameraDevice cameraDevice, @NonNull zon0 zon0Var) {
        synchronized (this.a) {
            try {
                if (c.a[this.l.ordinal()] != 2) {
                    s100.a("CaptureSession", "Open not allowed in state: " + this.l, null);
                    return new snw.a(new IllegalStateException("open() should not allow the state: " + this.l));
                }
                this.l = d.GET_SURFACE;
                ArrayList arrayList = new ArrayList(Collections.unmodifiableList(rVar.a));
                this.k = arrayList;
                this.e = zon0Var;
                p0t a2 = p0t.a(zon0Var.a.a(arrayList));
                ox5 ox5Var = new ox5(this, rVar, cameraDevice);
                Executor executor = this.e.a.c;
                a2.getClass();
                ora g = r0t.g(a2, ox5Var, executor);
                r0t.a(g, new b(), this.e.a.c);
                return r0t.e(g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(androidx.camera.core.impl.r rVar) {
        synchronized (this.a) {
            try {
                switch (c.a[this.l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.l);
                    case 2:
                    case 3:
                    case 4:
                        this.g = rVar;
                        break;
                    case 5:
                        this.g = rVar;
                        if (!this.j.keySet().containsAll(Collections.unmodifiableList(rVar.a))) {
                            s100.a("CaptureSession", "Does not have the proper configured lists", null);
                            return;
                        } else {
                            e();
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.f fVar = (androidx.camera.core.impl.f) it.next();
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.n.z();
            ArrayList arrayList3 = new ArrayList();
            ai50.b();
            hashSet.addAll(fVar.a);
            androidx.camera.core.impl.n A = androidx.camera.core.impl.n.A(fVar.b);
            arrayList3.addAll(fVar.d);
            boolean z = fVar.e;
            d0o0 d0o0Var = fVar.f;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : d0o0Var.a.keySet()) {
                arrayMap.put(str, d0o0Var.a(str));
            }
            ai50 ai50Var = new ai50(arrayMap);
            Iterator it2 = Collections.unmodifiableList(this.g.f.a).iterator();
            while (it2.hasNext()) {
                hashSet.add((DeferrableSurface) it2.next());
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            androidx.camera.core.impl.o y = androidx.camera.core.impl.o.y(A);
            d0o0 d0o0Var2 = d0o0.b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str2 : ai50Var.a.keySet()) {
                arrayMap2.put(str2, ai50Var.a(str2));
            }
            arrayList2.add(new androidx.camera.core.impl.f(arrayList4, y, 1, arrayList3, z, new d0o0(arrayMap2)));
        }
        return arrayList2;
    }

    /* compiled from: CaptureSession.java */
    public class a extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        }
    }
}
