package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.SurfaceUtil;
import defpackage.a73;
import defpackage.aa3;
import defpackage.ap7;
import defpackage.b1x0;
import defpackage.b64;
import defpackage.cfu0;
import defpackage.d1x0;
import defpackage.d6z;
import defpackage.dn7;
import defpackage.e1x0;
import defpackage.e48;
import defpackage.euy;
import defpackage.ey80;
import defpackage.f1x0;
import defpackage.f48;
import defpackage.ffx;
import defpackage.fyv;
import defpackage.geb1;
import defpackage.gl7;
import defpackage.gy80;
import defpackage.gym;
import defpackage.gyq0;
import defpackage.gyv;
import defpackage.hh5;
import defpackage.hiv;
import defpackage.hyv;
import defpackage.jqs;
import defpackage.jx81;
import defpackage.jyq0;
import defpackage.jzz0;
import defpackage.ni91;
import defpackage.o89;
import defpackage.oyq0;
import defpackage.pm5;
import defpackage.q8n;
import defpackage.r38;
import defpackage.r8n;
import defpackage.rdb1;
import defpackage.rt7;
import defpackage.s38;
import defpackage.sgb1;
import defpackage.syz0;
import defpackage.u8n;
import defpackage.ug70;
import defpackage.uo7;
import defpackage.wn7;
import defpackage.zy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public final class s implements f48 {
    public final r c;
    public e1x0 d;
    public b1x0 e;
    public jyq0 f;
    public CaptureSession$State i;
    public CaptureSession$State j;
    public gl7 k;
    public androidx.concurrent.futures.b l;
    public HashMap m;
    public final cfu0 n;
    public final syz0 o;
    public final androidx.camera.camera2.internal.compat.workaround.b p;
    public final gym q;
    public final zy2 r;
    public final boolean s;
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final HashMap g = new HashMap();
    public List h = Collections.EMPTY_LIST;

    public s(gym gymVar, a73 a73Var, boolean z) {
        CaptureSession$State captureSession$State = CaptureSession$State.UNINITIALIZED;
        this.i = captureSession$State;
        this.j = captureSession$State;
        this.m = new HashMap();
        this.n = new cfu0();
        this.o = new syz0();
        r(CaptureSession$State.INITIALIZED);
        this.q = gymVar;
        this.c = new r(this);
        this.p = new androidx.camera.camera2.internal.compat.workaround.b(a73Var.a(CaptureNoResponseQuirk.class));
        this.r = new zy2(a73Var, 4);
        this.s = z;
    }

    public static CameraCaptureSession.CaptureCallback k(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback camera2CaptureCallbacks$ComboSessionCaptureCallback;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uo7 uo7Var = (uo7) it.next();
            if (uo7Var == null) {
                camera2CaptureCallbacks$ComboSessionCaptureCallback = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                m.c(uo7Var, arrayList2);
                camera2CaptureCallbacks$ComboSessionCaptureCallback = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new Camera2CaptureCallbacks$ComboSessionCaptureCallback(arrayList2);
            }
            arrayList.add(camera2CaptureCallbacks$ComboSessionCaptureCallback);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new Camera2CaptureCallbacks$ComboSessionCaptureCallback(arrayList);
    }

    public static HashMap l(HashMap hashMap, HashMap hashMap2) {
        List createInstancesForMultiResolutionOutput;
        HashMap hashMap3 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (gyq0 gyq0Var : (List) hashMap.get(num)) {
                SurfaceUtil.a a = SurfaceUtil.a((Surface) hashMap2.get(gyq0Var.f()));
                if (i == 0) {
                    i = a.a;
                }
                rt7.n();
                int i2 = a.b;
                int i3 = a.c;
                String d = gyq0Var.d();
                Objects.requireNonNull(d);
                arrayList.add(rt7.d(i2, i3, d));
            }
            if (i == 0 || arrayList.isEmpty()) {
                StringBuilder t = b64.t(i, "Skips to create instances for multi-resolution output. imageFormat: ", ", streamInfos size: ");
                t.append(arrayList.size());
                sgb1.d("CaptureSession", t.toString());
            } else {
                createInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i);
                if (createInstancesForMultiResolutionOutput != null) {
                    for (gyq0 gyq0Var2 : (List) hashMap.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) createInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface((Surface) hashMap2.get(gyq0Var2.f()));
                        hashMap3.put(gyq0Var2, new ey80(outputConfiguration));
                    }
                }
            }
        }
        return hashMap3;
    }

    public static HashMap o(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gyq0 gyq0Var = (gyq0) it.next();
            if (gyq0Var.g() > 0 && gyq0Var.e().isEmpty()) {
                List list = (List) hashMap.get(Integer.valueOf(gyq0Var.g()));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(gyq0Var.g()), list);
                }
                list.add(gyq0Var);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    @Override // defpackage.f48
    public final void a(HashMap hashMap) {
        synchronized (this.a) {
            this.m = hashMap;
        }
    }

    @Override // defpackage.f48
    public final euy b(final jyq0 jyq0Var, final CameraDevice cameraDevice, e1x0 e1x0Var) {
        synchronized (this.a) {
            try {
                if (this.j.ordinal() != 2) {
                    sgb1.d("CaptureSession", "Open not allowed in state: " + this.j);
                    return new hiv(1, new IllegalStateException("open() should not allow the state: " + this.j));
                }
                r(CaptureSession$State.GET_SURFACE);
                ArrayList arrayList = new ArrayList(jyq0Var.b());
                this.h = arrayList;
                this.d = e1x0Var;
                o89 n = ni91.n(jqs.a(e1x0Var.l(arrayList)), new aa3() { // from class: androidx.camera.camera2.internal.q
                    @Override // defpackage.aa3
                    public final euy apply(Object obj) {
                        InputConfiguration inputConfiguration;
                        s sVar = s.this;
                        jyq0 jyq0Var2 = jyq0Var;
                        CameraDevice cameraDevice2 = cameraDevice;
                        List list = (List) obj;
                        synchronized (sVar.a) {
                            try {
                                int ordinal = sVar.j.ordinal();
                                if (ordinal == 0 || ordinal == 7 || ordinal == 2) {
                                    return new hiv(1, new IllegalStateException("openCaptureSession() should not be possible in state: " + sVar.j));
                                }
                                if (ordinal != 3) {
                                    return new hiv(1, new CancellationException("openCaptureSession() not execute in state: " + sVar.j));
                                }
                                sVar.g.clear();
                                for (int i = 0; i < list.size(); i++) {
                                    sVar.g.put((DeferrableSurface) sVar.h.get(i), (Surface) list.get(i));
                                }
                                sVar.r(CaptureSession$State.OPENING);
                                sgb1.g(3, "CaptureSession");
                                f1x0 f1x0Var = new f1x0(Arrays.asList(sVar.c, new r(jyq0Var2.d)));
                                s38 s38Var = jyq0Var2.g;
                                ug70 ug70Var = s38Var.b;
                                r38 r38Var = new r38(s38Var);
                                HashMap hashMap = new HashMap();
                                int i2 = 35;
                                if (sVar.s && Build.VERSION.SDK_INT >= 35) {
                                    hashMap = s.l(s.o(jyq0Var2.a), sVar.g);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                ey80 ey80Var = null;
                                String str = (String) ug70Var.g(wn7.z, null);
                                Iterator it = jyq0Var2.a.iterator();
                                while (it.hasNext()) {
                                    gyq0 gyq0Var = (gyq0) it.next();
                                    ey80 ey80Var2 = (!sVar.s || Build.VERSION.SDK_INT < i2) ? ey80Var : (ey80) hashMap.get(gyq0Var);
                                    if (ey80Var2 == null) {
                                        ey80Var2 = sVar.n(gyq0Var, sVar.g, str);
                                        if (sVar.m.containsKey(gyq0Var.f())) {
                                            ey80Var2.a.d(((Long) sVar.m.get(gyq0Var.f())).longValue());
                                        }
                                    }
                                    arrayList2.add(ey80Var2);
                                    i2 = 35;
                                    ey80Var = null;
                                }
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    ey80 ey80Var3 = (ey80) it2.next();
                                    if (!arrayList3.contains(((OutputConfiguration) ey80Var3.a.a()).getSurface())) {
                                        arrayList3.add(((OutputConfiguration) ey80Var3.a.a()).getSurface());
                                        arrayList4.add(ey80Var3);
                                    }
                                }
                                final e1x0 e1x0Var2 = sVar.d;
                                int i3 = jyq0Var2.h;
                                e1x0Var2.e = f1x0Var;
                                oyq0 oyq0Var = new oyq0(i3, arrayList4, e1x0Var2.c, new CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$2
                                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                    public void onActive(CameraCaptureSession cameraCaptureSession) {
                                        d1x0.this.i(cameraCaptureSession);
                                        d1x0 d1x0Var = d1x0.this;
                                        d1x0Var.a(d1x0Var);
                                    }

                                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                                        d1x0.this.i(cameraCaptureSession);
                                        d1x0 d1x0Var = d1x0.this;
                                        d1x0Var.b(d1x0Var);
                                    }

                                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                    public void onClosed(CameraCaptureSession cameraCaptureSession) {
                                        d1x0.this.i(cameraCaptureSession);
                                        d1x0 d1x0Var = d1x0.this;
                                        d1x0Var.c(d1x0Var);
                                    }

                                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                                        androidx.concurrent.futures.b bVar;
                                        try {
                                            d1x0.this.i(cameraCaptureSession);
                                            d1x0 d1x0Var = d1x0.this;
                                            d1x0Var.d(d1x0Var);
                                            synchronized (d1x0.this.a) {
                                                d6z.v(d1x0.this.h, "OpenCaptureSession completer should not null");
                                                d1x0 d1x0Var2 = d1x0.this;
                                                bVar = d1x0Var2.h;
                                                d1x0Var2.h = null;
                                            }
                                            bVar.d(new IllegalStateException("onConfigureFailed"));
                                        } catch (Throwable th) {
                                            synchronized (d1x0.this.a) {
                                                d6z.v(d1x0.this.h, "OpenCaptureSession completer should not null");
                                                d1x0 d1x0Var3 = d1x0.this;
                                                androidx.concurrent.futures.b bVar2 = d1x0Var3.h;
                                                d1x0Var3.h = null;
                                                bVar2.d(new IllegalStateException("onConfigureFailed"));
                                                throw th;
                                            }
                                        }
                                    }

                                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                                        androidx.concurrent.futures.b bVar;
                                        try {
                                            d1x0.this.i(cameraCaptureSession);
                                            d1x0 d1x0Var = d1x0.this;
                                            d1x0Var.e(d1x0Var);
                                            synchronized (d1x0.this.a) {
                                                d6z.v(d1x0.this.h, "OpenCaptureSession completer should not null");
                                                d1x0 d1x0Var2 = d1x0.this;
                                                bVar = d1x0Var2.h;
                                                d1x0Var2.h = null;
                                            }
                                            bVar.b(null);
                                        } catch (Throwable th) {
                                            synchronized (d1x0.this.a) {
                                                d6z.v(d1x0.this.h, "OpenCaptureSession completer should not null");
                                                d1x0 d1x0Var3 = d1x0.this;
                                                androidx.concurrent.futures.b bVar2 = d1x0Var3.h;
                                                d1x0Var3.h = null;
                                                bVar2.b(null);
                                                throw th;
                                            }
                                        }
                                    }

                                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                    public void onReady(CameraCaptureSession cameraCaptureSession) {
                                        d1x0.this.i(cameraCaptureSession);
                                        d1x0 d1x0Var = d1x0.this;
                                        d1x0Var.f(d1x0Var);
                                    }

                                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                                        d1x0.this.i(cameraCaptureSession);
                                        d1x0 d1x0Var = d1x0.this;
                                        d1x0Var.h(d1x0Var, surface);
                                    }
                                });
                                if (jyq0Var2.g.c == 5 && (inputConfiguration = jyq0Var2.i) != null) {
                                    oyq0Var.a.a.setInputConfiguration((Build.VERSION.SDK_INT >= 31 ? new hyv(new gyv(inputConfiguration)) : new hyv(new fyv(inputConfiguration))).a.a);
                                }
                                try {
                                    CaptureRequest f = rdb1.f(r38Var.e(), cameraDevice2, sVar.r);
                                    if (f != null) {
                                        oyq0Var.a.a.setSessionParameters(f);
                                    }
                                    return sVar.d.p(cameraDevice2, oyq0Var, sVar.h);
                                } catch (CameraAccessException e) {
                                    return new hiv(1, e);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, this.d.c);
                ni91.a(n, new pm5(19, this), this.d.c);
                return ni91.g(n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f48
    public final jyq0 c() {
        jyq0 jyq0Var;
        synchronized (this.a) {
            jyq0Var = this.f;
        }
        return jyq0Var;
    }

    @Override // defpackage.f48
    public final void close() {
        synchronized (this.a) {
            try {
                int ordinal = this.j.ordinal();
                if (ordinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.j);
                }
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        d6z.v(this.d, "The Opener shouldn't null in state:" + this.j);
                        this.d.r();
                    } else if (ordinal == 6 || ordinal == 7) {
                        d6z.v(this.d, "The Opener shouldn't null in state:" + this.j);
                        this.d.r();
                        r(CaptureSession$State.CLOSED);
                        this.p.c();
                        this.f = null;
                    }
                }
                r(CaptureSession$State.RELEASED);
            } finally {
            }
        }
    }

    @Override // defpackage.f48
    public final void d(List list) {
        synchronized (this.a) {
            try {
                switch (this.j.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.j);
                    case 1:
                    case 4:
                    case 5:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case 2:
                    case 3:
                    case 6:
                        this.b.addAll(list);
                        break;
                    case 7:
                        this.b.addAll(list);
                        this.p.b().c(new dn7(11, this), geb1.b());
                        break;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.f48
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            try {
                CaptureSession$State captureSession$State = this.j;
                z = captureSession$State == CaptureSession$State.OPENED || captureSession$State == CaptureSession$State.OPENING;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.f48
    public final void f() {
        ArrayList<s38> arrayList;
        synchronized (this.a) {
            try {
                if (this.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.b);
                    this.b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (s38 s38Var : arrayList) {
                Iterator it = s38Var.e.iterator();
                while (it.hasNext()) {
                    ((uo7) it.next()).a(s38Var.b());
                }
            }
        }
    }

    @Override // defpackage.f48
    public final void g(jyq0 jyq0Var) {
        synchronized (this.a) {
            try {
                switch (this.j.ordinal()) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.j);
                    case 1:
                    case 4:
                    case 5:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case 2:
                    case 3:
                    case 6:
                        this.f = jyq0Var;
                        break;
                    case 7:
                        this.f = jyq0Var;
                        if (jyq0Var != null) {
                            if (!this.g.keySet().containsAll(jyq0Var.b())) {
                                sgb1.d("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                sgb1.g(3, "CaptureSession");
                                q(this.f);
                                break;
                            }
                        } else {
                            return;
                        }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.f48
    public final List h() {
        List unmodifiableList;
        synchronized (this.a) {
            unmodifiableList = Collections.unmodifiableList(this.b);
        }
        return unmodifiableList;
    }

    public final void i() {
        synchronized (this.a) {
            if (this.j != CaptureSession$State.OPENED) {
                sgb1.d("CaptureSession", "Unable to abort captures. Incorrect state:" + this.j);
            } else {
                try {
                    d1x0 d1x0Var = (d1x0) this.e;
                    d6z.v(d1x0Var.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((hh5) d1x0Var.f.b).b).abortCaptures();
                } catch (CameraAccessException e) {
                    sgb1.e("CaptureSession", "Unable to abort captures.", e);
                }
            }
        }
    }

    public final int j(ArrayList arrayList, CameraBurstCaptureCallback cameraBurstCaptureCallback) {
        CameraBurstCaptureCallback cameraBurstCaptureCallback2 = new CameraBurstCaptureCallback();
        Iterator it = arrayList.iterator();
        int i = -1;
        while (it.hasNext()) {
            CaptureRequest captureRequest = (CaptureRequest) it.next();
            b1x0 b1x0Var = this.e;
            Objects.requireNonNull(b1x0Var);
            pm5 pm5Var = ((d1x0) b1x0Var).f;
            pm5Var.getClass();
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((hh5) pm5Var.b).b;
            List<CaptureRequest> createHighSpeedRequestList = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequest) : Collections.EMPTY_LIST;
            Iterator<CaptureRequest> it2 = createHighSpeedRequestList.iterator();
            while (it2.hasNext()) {
                cameraBurstCaptureCallback2.addCamera2Callbacks(it2.next(), Collections.singletonList(new RequestForwardingCaptureCallback(captureRequest, cameraBurstCaptureCallback)));
            }
            e1x0 e1x0Var = (e1x0) this.e;
            CameraCaptureSession.CaptureCallback a = e1x0Var.t.a(cameraBurstCaptureCallback2);
            d6z.v(e1x0Var.f, "Need to call openCaptureSession before using this API.");
            i = ((CameraCaptureSession) ((hh5) e1x0Var.f.b).b).captureBurstRequests(createHighSpeedRequestList, e1x0Var.c, a);
        }
        return i;
    }

    public final void m() {
        CaptureSession$State captureSession$State = this.j;
        CaptureSession$State captureSession$State2 = CaptureSession$State.RELEASED;
        if (captureSession$State == captureSession$State2) {
            sgb1.g(3, "CaptureSession");
            return;
        }
        r(captureSession$State2);
        this.e = null;
        androidx.concurrent.futures.b bVar = this.l;
        if (bVar != null) {
            bVar.b(null);
            this.l = null;
        }
    }

    public final ey80 n(gyq0 gyq0Var, HashMap hashMap, String str) {
        long j;
        Surface surface = (Surface) hashMap.get(gyq0Var.f());
        d6z.v(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        ey80 ey80Var = new ey80(gyq0Var.g(), surface);
        gy80 gy80Var = ey80Var.a;
        if (str != null) {
            ((OutputConfiguration) gy80Var.a()).setPhysicalCameraId(str);
        } else {
            ((OutputConfiguration) gy80Var.a()).setPhysicalCameraId(gyq0Var.d());
        }
        if (gyq0Var.c() == 0) {
            gy80Var.c(1);
        } else if (gyq0Var.c() == 1) {
            gy80Var.c(2);
        }
        if (!gyq0Var.e().isEmpty()) {
            ((OutputConfiguration) gy80Var.a()).enableSurfaceSharing();
            Iterator it = gyq0Var.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) hashMap.get((DeferrableSurface) it.next());
                d6z.v(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                ((OutputConfiguration) gy80Var.a()).addSurface(surface2);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            gym gymVar = this.q;
            gymVar.getClass();
            d6z.y("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", i >= 33);
            DynamicRangeProfiles c = ((u8n) gymVar.a).c();
            if (c != null) {
                q8n b = gyq0Var.b();
                Long a = r8n.a(b, c);
                if (a != null) {
                    j = a.longValue();
                    gy80Var.b(j);
                    return ey80Var;
                }
                sgb1.d("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b);
            }
        }
        j = 1;
        gy80Var.b(j);
        return ey80Var;
    }

    public final int p(ArrayList arrayList) {
        CameraBurstCaptureCallback cameraBurstCaptureCallback;
        ArrayList arrayList2;
        boolean z;
        ap7 ap7Var;
        synchronized (this.a) {
            try {
                if (this.j != CaptureSession$State.OPENED) {
                    sgb1.g(3, "CaptureSession");
                    return -1;
                }
                if (arrayList.isEmpty()) {
                    return -1;
                }
                try {
                    cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                    arrayList2 = new ArrayList();
                    sgb1.g(3, "CaptureSession");
                    Iterator it = arrayList.iterator();
                    z = false;
                    while (it.hasNext()) {
                        s38 s38Var = (s38) it.next();
                        if (Collections.unmodifiableList(s38Var.a).isEmpty()) {
                            sgb1.g(3, "CaptureSession");
                        } else {
                            Iterator it2 = Collections.unmodifiableList(s38Var.a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    DeferrableSurface deferrableSurface = (DeferrableSurface) it2.next();
                                    if (!this.g.containsKey(deferrableSurface)) {
                                        Objects.toString(deferrableSurface);
                                        sgb1.g(3, "CaptureSession");
                                        break;
                                    }
                                } else {
                                    if (s38Var.c == 2) {
                                        z = true;
                                    }
                                    r38 r38Var = new r38(s38Var);
                                    if (s38Var.c == 5 && (ap7Var = s38Var.h) != null) {
                                        r38Var.h = ap7Var;
                                    }
                                    jyq0 jyq0Var = this.f;
                                    if (jyq0Var != null) {
                                        r38Var.c(jyq0Var.g.b);
                                    }
                                    r38Var.c(s38Var.b);
                                    s38 e = r38Var.e();
                                    d1x0 d1x0Var = (d1x0) this.e;
                                    d1x0Var.f.getClass();
                                    CaptureRequest e2 = rdb1.e(e, ((CameraCaptureSession) ((hh5) d1x0Var.f.b).b).getDevice(), this.g, false, this.r);
                                    if (e2 == null) {
                                        sgb1.g(3, "CaptureSession");
                                        return -1;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = s38Var.e.iterator();
                                    while (it3.hasNext()) {
                                        m.c((uo7) it3.next(), arrayList3);
                                    }
                                    cameraBurstCaptureCallback.addCamera2Callbacks(e2, arrayList3);
                                    arrayList2.add(e2);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e3) {
                    sgb1.d("CaptureSession", "Unable to access camera: " + e3.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    sgb1.g(3, "CaptureSession");
                    return -1;
                }
                if (this.n.a(arrayList2, z)) {
                    d1x0 d1x0Var2 = (d1x0) this.e;
                    d6z.v(d1x0Var2.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((hh5) d1x0Var2.f.b).b).stopRepeating();
                    cameraBurstCaptureCallback.setCaptureSequenceCallback(new f(this));
                }
                if (this.o.b(arrayList2, z)) {
                    cameraBurstCaptureCallback.addCamera2Callbacks((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession$2
                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                            synchronized (s.this.a) {
                                try {
                                    jyq0 jyq0Var2 = s.this.f;
                                    if (jyq0Var2 == null) {
                                        return;
                                    }
                                    s38 s38Var2 = jyq0Var2.g;
                                    sgb1.g(3, "CaptureSession");
                                    s sVar = s.this;
                                    sVar.o.getClass();
                                    sVar.d(Collections.singletonList(syz0.a(s38Var2)));
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }));
                }
                jyq0 jyq0Var2 = this.f;
                if (jyq0Var2 != null && jyq0Var2.h == 1) {
                    return j(arrayList2, cameraBurstCaptureCallback);
                }
                e1x0 e1x0Var = (e1x0) this.e;
                CameraCaptureSession.CaptureCallback a = e1x0Var.t.a(cameraBurstCaptureCallback);
                d6z.v(e1x0Var.f, "Need to call openCaptureSession before using this API.");
                return ((CameraCaptureSession) ((hh5) e1x0Var.f.b).b).captureBurstRequests(arrayList2, e1x0Var.c, a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int q(jyq0 jyq0Var) {
        synchronized (this.a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (jyq0Var == null) {
                sgb1.g(3, "CaptureSession");
                return -1;
            }
            if (this.j != CaptureSession$State.OPENED) {
                sgb1.g(3, "CaptureSession");
                return -1;
            }
            s38 s38Var = jyq0Var.g;
            if (Collections.unmodifiableList(s38Var.a).isEmpty()) {
                sgb1.g(3, "CaptureSession");
                try {
                    d1x0 d1x0Var = (d1x0) this.e;
                    d6z.v(d1x0Var.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((hh5) d1x0Var.f.b).b).stopRepeating();
                } catch (CameraAccessException e) {
                    sgb1.d("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                sgb1.g(3, "CaptureSession");
                d1x0 d1x0Var2 = (d1x0) this.e;
                d1x0Var2.f.getClass();
                CaptureRequest e2 = rdb1.e(s38Var, ((CameraCaptureSession) ((hh5) d1x0Var2.f.b).b).getDevice(), this.g, true, this.r);
                if (e2 == null) {
                    sgb1.g(3, "CaptureSession");
                    return -1;
                }
                CameraCaptureSession.CaptureCallback a = this.p.a(k(s38Var.e, new CameraCaptureSession.CaptureCallback[0]));
                int i = jyq0Var.h;
                b1x0 b1x0Var = this.e;
                if (i != 1) {
                    return ((e1x0) b1x0Var).q(e2, a);
                }
                pm5 pm5Var = ((d1x0) b1x0Var).f;
                pm5Var.getClass();
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((hh5) pm5Var.b).b;
                return ((d1x0) this.e).k(cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(e2) : Collections.EMPTY_LIST, a);
            } catch (CameraAccessException e3) {
                sgb1.d("CaptureSession", "Unable to access camera: " + e3.getMessage());
                Thread.dumpStack();
            }
            throw th;
        }
    }

    public final void r(CaptureSession$State captureSession$State) {
        if (captureSession$State.ordinal() > this.i.ordinal()) {
            this.i = captureSession$State;
        }
        this.j = captureSession$State;
        if (!jzz0.a() || this.i.ordinal() < CaptureSession$State.GET_SURFACE.ordinal()) {
            return;
        }
        Trace.setCounter(ffx.f0("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]"), captureSession$State.ordinal());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0009, B:6:0x0011, B:8:0x007a, B:12:0x0015, B:14:0x0019, B:15:0x001e, B:17:0x0043, B:18:0x0049, B:20:0x004d, B:21:0x0059, B:22:0x005b, B:24:0x005d, B:25:0x0075, B:26:0x007e, B:27:0x0091), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0009, B:6:0x0011, B:8:0x007a, B:12:0x0015, B:14:0x0019, B:15:0x001e, B:17:0x0043, B:18:0x0049, B:20:0x004d, B:21:0x0059, B:22:0x005b, B:24:0x005d, B:25:0x0075, B:26:0x007e, B:27:0x0091), top: B:3:0x0009 }] */
    @Override // defpackage.f48
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final euy release() {
        synchronized (this.a) {
            try {
                int ordinal = this.j.ordinal();
                if (ordinal == 0) {
                    throw new IllegalStateException("release() should not be possible in state: " + this.j);
                }
                switch (ordinal) {
                    case 2:
                        r(CaptureSession$State.RELEASED);
                        return hiv.c;
                    case 3:
                        d6z.v(this.d, "The Opener shouldn't null in state:" + this.j);
                        this.d.r();
                        r(CaptureSession$State.RELEASED);
                        return hiv.c;
                    case 4:
                        if (this.k == null) {
                            this.k = jx81.r(new e48(0, this));
                        }
                        return this.k;
                    case 5:
                    case 7:
                        b1x0 b1x0Var = this.e;
                        if (b1x0Var != null) {
                            ((e1x0) b1x0Var).n();
                        }
                        r(CaptureSession$State.RELEASING);
                        this.p.c();
                        d6z.v(this.d, "The Opener shouldn't null in state:" + this.j);
                        if (this.d.r()) {
                            m();
                            return hiv.c;
                        }
                        if (this.k == null) {
                        }
                        return this.k;
                    case 6:
                        r(CaptureSession$State.RELEASING);
                        this.p.c();
                        d6z.v(this.d, "The Opener shouldn't null in state:" + this.j);
                        if (this.d.r()) {
                        }
                        if (this.k == null) {
                        }
                        return this.k;
                    default:
                        return hiv.c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.a) {
            if (this.j != CaptureSession$State.OPENED) {
                sgb1.d("CaptureSession", "Unable to stop repeating. Incorrect state:" + this.j);
            } else {
                try {
                    d1x0 d1x0Var = (d1x0) this.e;
                    d6z.v(d1x0Var.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((hh5) d1x0Var.f.b).b).stopRepeating();
                } catch (CameraAccessException e) {
                    sgb1.e("CaptureSession", "Unable to stop repeating.", e);
                }
            }
        }
    }
}
