package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.impl.CameraInternal$State;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig$ConfigSource;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import defpackage.a73;
import defpackage.anw0;
import defpackage.ar7;
import defpackage.br7;
import defpackage.c06;
import defpackage.ceb1;
import defpackage.co7;
import defpackage.ct7;
import defpackage.d6z;
import defpackage.dn7;
import defpackage.dvy;
import defpackage.e1x0;
import defpackage.ep7;
import defpackage.euy;
import defpackage.evy;
import defpackage.f48;
import defpackage.ffx;
import defpackage.ft7;
import defpackage.geb1;
import defpackage.gl7;
import defpackage.gq60;
import defpackage.gym;
import defpackage.gzj;
import defpackage.hh5;
import defpackage.ht7;
import defpackage.hyq0;
import defpackage.i34;
import defpackage.iiv;
import defpackage.ikp;
import defpackage.iru0;
import defpackage.jdv;
import defpackage.jm7;
import defpackage.jp7;
import defpackage.jx81;
import defpackage.jyq0;
import defpackage.jzz0;
import defpackage.k6u;
import defpackage.kr7;
import defpackage.ln7;
import defpackage.lru0;
import defpackage.m0r0;
import defpackage.md6;
import defpackage.mm7;
import defpackage.ni91;
import defpackage.nm7;
import defpackage.np7;
import defpackage.om7;
import defpackage.oru0;
import defpackage.q8n;
import defpackage.qp7;
import defpackage.r501;
import defpackage.rm7;
import defpackage.sgb1;
import defpackage.sk7;
import defpackage.sr4;
import defpackage.szd;
import defpackage.tf61;
import defpackage.ti21;
import defpackage.u34;
import defpackage.u920;
import defpackage.uf61;
import defpackage.ui21;
import defpackage.v920;
import defpackage.vmn0;
import defpackage.wvb1;
import defpackage.x34;
import defpackage.x84;
import defpackage.xbj;
import defpackage.xi21;
import defpackage.xib1;
import defpackage.yci0;
import defpackage.zt7;
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class l implements br7 {
    public final b A;
    public final Camera2CameraImpl$StateCallback B;
    public final rm7 C;
    public CameraDevice D;
    public int E;
    public f48 F;
    public final AtomicInteger G;
    public euy H;
    public androidx.concurrent.futures.b I;
    public final LinkedHashMap J;
    public int K;
    public final Camera2CameraImpl$CameraAvailability L;
    public final jm7 M;
    public final ht7 N;
    public final zt7 O;
    public final boolean P;
    public final boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public v920 U;
    public final u V;
    public final vmn0 W;
    public final HashSet Z;
    public final ui21 a;
    public jp7 a0;
    public final kr7 b;
    public final Object b0;
    public final androidx.camera.core.impl.utils.executor.b c;
    public m0r0 c0;
    public boolean d0;
    public final gzj e0;
    public final gym f0;
    public final y g0;
    public final c06 h0;
    public final k6u w;
    public volatile Camera2CameraImpl$InternalState x = Camera2CameraImpl$InternalState.INITIALIZED;
    public final evy y;
    public final ct7 z;

    public l(Context context, kr7 kr7Var, String str, rm7 rm7Var, jm7 jm7Var, ht7 ht7Var, Executor executor, Handler handler, gzj gzjVar, long j, zt7 zt7Var) {
        evy evyVar = new evy();
        this.y = evyVar;
        this.E = 0;
        this.G = new AtomicInteger(0);
        this.J = new LinkedHashMap();
        this.K = 0;
        this.R = false;
        this.S = false;
        this.T = true;
        this.Z = new HashSet();
        this.a0 = np7.a;
        this.b0 = new Object();
        this.d0 = false;
        c06 c06Var = new c06();
        c06Var.b = this;
        c06Var.a = null;
        this.h0 = c06Var;
        this.b = kr7Var;
        this.M = jm7Var;
        this.N = ht7Var;
        k6u k6uVar = new k6u(handler);
        this.w = k6uVar;
        androidx.camera.core.impl.utils.executor.b bVar = new androidx.camera.core.impl.utils.executor.b(executor);
        this.c = bVar;
        this.B = new Camera2CameraImpl$StateCallback(this, bVar, k6uVar, j);
        this.a = new ui21(str);
        evyVar.a.m(new dvy(CameraInternal$State.CLOSED));
        ct7 ct7Var = new ct7(ht7Var);
        this.z = ct7Var;
        u uVar = new u(bVar);
        this.V = uVar;
        this.e0 = gzjVar;
        this.O = zt7Var;
        try {
            ep7 a = kr7Var.a(str);
            int i = 10;
            b bVar2 = new b(a, k6uVar, bVar, new hh5(i, this), rm7Var.j);
            this.A = bVar2;
            this.C = rm7Var;
            rm7Var.C(bVar2);
            rm7Var.h.o(ct7Var.b);
            this.f0 = gym.l(a);
            this.F = C();
            this.W = new vmn0(bVar, k6uVar, handler, uVar, rm7Var.j, xbj.a);
            a73 a73Var = rm7Var.j;
            this.P = a73Var.a(LegacyCameraOutputConfigNullPointerQuirk.class) || a73Var.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.Q = rm7Var.j.a(LegacyCameraSurfaceCleanupQuirk.class);
            Camera2CameraImpl$CameraAvailability camera2CameraImpl$CameraAvailability = new Camera2CameraImpl$CameraAvailability(this, str);
            this.L = camera2CameraImpl$CameraAvailability;
            h hVar = new h(this);
            synchronized (ht7Var.b) {
                d6z.y("Camera is already registered: " + this, !ht7Var.e.containsKey(this));
                ht7Var.e.put(this, new ft7(bVar, hVar, camera2CameraImpl$CameraAvailability));
            }
            ((CameraManager) kr7Var.a.b).registerAvailabilityCallback(bVar, camera2CameraImpl$CameraAvailability);
            this.g0 = new y(context, str, kr7Var, new r501(i), ikp.g2);
        } catch (CameraAccessExceptionCompat e) {
            throw ceb1.b(e);
        }
    }

    public static String A(androidx.camera.core.j jVar) {
        return jVar.i() + jVar.hashCode();
    }

    public static String y(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String z(v920 v920Var) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        v920Var.getClass();
        sb.append(v920Var.hashCode());
        return sb.toString();
    }

    public final boolean B(v920 v920Var) {
        int i;
        zt7 zt7Var;
        v920Var.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (this.b0) {
            try {
                i = this.M.b() == 2 ? 1 : 0;
            } finally {
            }
        }
        ui21 ui21Var = this.a;
        ui21Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ui21Var.a.entrySet()) {
            if (((ti21) entry.getValue()).e) {
                arrayList2.add((ti21) entry.getValue());
            }
        }
        for (ti21 ti21Var : Collections.unmodifiableCollection(arrayList2)) {
            List list = ti21Var.d;
            if (list == null || list.get(0) != UseCaseConfigFactory$CaptureType.METERING_REPEATING) {
                if (ti21Var.c == null || ti21Var.d == null) {
                    ti21Var.toString();
                    sgb1.g(5, "Camera2CameraImpl");
                    break;
                }
                jyq0 jyq0Var = ti21Var.a;
                xi21 xi21Var = ti21Var.b;
                for (DeferrableSurface deferrableSurface : jyq0Var.b()) {
                    y yVar = this.g0;
                    int inputFormat = xi21Var.getInputFormat();
                    Size size = deferrableSurface.h;
                    StreamUseCase x = xi21Var.x();
                    x84 l = yVar.l(inputFormat);
                    SurfaceConfig$ConfigSource surfaceConfig$ConfigSource = SurfaceConfig$ConfigSource.CAPTURE_SESSION_TABLES;
                    StreamUseCase streamUseCase = anw0.e;
                    int i2 = i;
                    anw0 d = xib1.d(inputFormat, size, l, i2, surfaceConfig$ConfigSource, x);
                    int inputFormat2 = xi21Var.getInputFormat();
                    Size size2 = deferrableSurface.h;
                    q8n b = ti21Var.c.b();
                    List list2 = ti21Var.d;
                    szd d2 = ti21Var.c.d();
                    int g = ti21Var.c.g();
                    Range c = ti21Var.c.c();
                    Boolean bool = (Boolean) xi21Var.g(xi21.q4, Boolean.FALSE);
                    Objects.requireNonNull(bool);
                    arrayList.add(new i34(d, inputFormat2, size2, b, list2, d2, g, c, bool.booleanValue()));
                    i = i2;
                }
            }
        }
        int i3 = i;
        HashMap hashMap = new HashMap();
        hashMap.put((u920) v920Var.c, Collections.singletonList((Size) v920Var.w));
        try {
            this.g0.j(i3, arrayList, hashMap, false, false, false);
            w("Surface combination with metering repeating supported!");
            zt7Var = this.O;
        } catch (IllegalArgumentException unused) {
            w("Surface combination with metering repeating  not supported!");
        }
        return (zt7Var == null || ((Boolean) zt7Var.a.g(zt7.F, Boolean.TRUE)).booleanValue()) ? false : true;
    }

    public final f48 C() {
        synchronized (this.b0) {
            try {
                zt7 zt7Var = this.O;
                if (zt7Var != null && zt7Var.a.g(ln7.a, null) != null) {
                    throw new ClassCastException();
                }
                if (this.c0 == null) {
                    return new s(this.f0, this.C.j, false);
                }
                return new x(this.c0, this.C, this.f0, this.c, this.w);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(boolean z) {
        if (!z) {
            this.B.resetReopenMonitor();
        }
        this.B.cancelScheduledReopen();
        this.h0.g();
        w("Opening camera.");
        G(Camera2CameraImpl$InternalState.OPENING);
        try {
            kr7 kr7Var = this.b;
            String str = this.C.a;
            androidx.camera.core.impl.utils.executor.b bVar = this.c;
            CameraDevice.StateCallback v = v();
            sr4 sr4Var = kr7Var.a;
            sr4Var.getClass();
            try {
                ((CameraManager) sr4Var.b).openCamera(str, bVar, v);
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (CameraAccessExceptionCompat e2) {
            w("Unable to open camera due to " + e2.getMessage());
            if (e2.a() == 10001) {
                H(Camera2CameraImpl$InternalState.INITIALIZED, new androidx.camera.core.b(7, e2), true);
                return;
            }
            c06 c06Var = this.h0;
            Camera2CameraImpl$InternalState camera2CameraImpl$InternalState = ((l) c06Var.b).x;
            Camera2CameraImpl$InternalState camera2CameraImpl$InternalState2 = Camera2CameraImpl$InternalState.OPENING;
            l lVar = (l) c06Var.b;
            if (camera2CameraImpl$InternalState != camera2CameraImpl$InternalState2) {
                lVar.w("Don't need the onError timeout handler.");
                return;
            }
            lVar.w("Camera waiting for onError.");
            c06Var.g();
            c06Var.a = new sk7(c06Var);
        } catch (SecurityException e3) {
            w("Unable to open camera due to " + e3.getMessage());
            G(Camera2CameraImpl$InternalState.REOPENING);
            this.B.scheduleCameraReopen();
        } catch (RuntimeException unused) {
            w("Unexpected error occurred when opening camera.");
            H(Camera2CameraImpl$InternalState.OPENING_WITH_ERROR, new androidx.camera.core.b(6, null), true);
        }
    }

    public final void E() {
        d6z.y(null, this.x == Camera2CameraImpl$InternalState.OPENED);
        hyq0 b = this.a.b();
        if (!b.c()) {
            w("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.N.e(this.D.getId(), this.M.c(this.D.getId()))) {
            w("Unable to create capture session in camera operating mode = " + this.M.b());
            return;
        }
        HashMap hashMap = new HashMap();
        Collection<jyq0> c = this.a.c();
        Collection d = this.a.d();
        x34 x34Var = oru0.a;
        ArrayList arrayList = new ArrayList(d);
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jyq0 jyq0Var = (jyq0) it.next();
            if (jyq0Var.g.b.a.containsKey(x34Var) && jyq0Var.b().size() != 1) {
                sgb1.d("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(jyq0Var.b().size())}, 1)));
                break;
            }
            if (jyq0Var.g.b.a.containsKey(x34Var)) {
                int i = 0;
                for (jyq0 jyq0Var2 : c) {
                    if (((xi21) arrayList.get(i)).y() == UseCaseConfigFactory$CaptureType.METERING_REPEATING) {
                        d6z.y("MeteringRepeating should contain a surface", !jyq0Var2.b().isEmpty());
                        hashMap.put(jyq0Var2.b().get(0), 1L);
                    } else if (jyq0Var2.g.b.a.containsKey(x34Var) && !jyq0Var2.b().isEmpty()) {
                        hashMap.put(jyq0Var2.b().get(0), jyq0Var2.g.b.f(x34Var));
                    }
                    i++;
                }
            }
        }
        hashMap.toString();
        sgb1.g(3, "StreamUseCaseUtil");
        this.F.a(hashMap);
        f48 f48Var = this.F;
        jyq0 b2 = b.b();
        CameraDevice cameraDevice = this.D;
        cameraDevice.getClass();
        vmn0 vmn0Var = this.W;
        ni91.a(f48Var.b(b2, cameraDevice, new e1x0((a73) vmn0Var.x, (a73) vmn0Var.y, (u) vmn0Var.w, (androidx.camera.core.impl.utils.executor.b) vmn0Var.a, (k6u) vmn0Var.b, (Handler) vmn0Var.c)), new g(this, f48Var), this.c);
    }

    public final void F() {
        boolean z = false;
        d6z.y(null, this.F != null);
        w("Resetting Capture Session");
        f48 f48Var = this.F;
        jyq0 c = f48Var.c();
        List h = f48Var.h();
        f48 C = C();
        this.F = C;
        C.g(c);
        this.F.d(h);
        if (this.x.ordinal() != 9) {
            w("Skipping Capture Session state check due to current camera state: " + this.x + " and previous session status: " + f48Var.e());
        } else if (this.P && f48Var.e()) {
            w("Close camera before creating new session");
            G(Camera2CameraImpl$InternalState.REOPENING_QUIRK);
        }
        if (this.Q && f48Var.e()) {
            w("ConfigAndClose is required when close the camera.");
            this.R = true;
        }
        f48Var.close();
        euy release = f48Var.release();
        w("Releasing session in state " + this.x.name());
        this.J.put(f48Var, release);
        ni91.a(release, new md6(this, f48Var, z, 11), geb1.b());
    }

    public final void G(Camera2CameraImpl$InternalState camera2CameraImpl$InternalState) {
        H(camera2CameraImpl$InternalState, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Camera2CameraImpl$InternalState camera2CameraImpl$InternalState, androidx.camera.core.b bVar, boolean z) {
        CameraInternal$State cameraInternal$State;
        CameraInternal$State cameraInternal$State2;
        ft7 ft7Var;
        w("Transitioning camera internal state: " + this.x + " --> " + camera2CameraImpl$InternalState);
        if (jzz0.a()) {
            Trace.setCounter(ffx.f0("CX:C2State[" + this + "]"), camera2CameraImpl$InternalState.ordinal());
            if (bVar != null) {
                this.K++;
            }
            if (this.K > 0) {
                Trace.setCounter(ffx.f0("CX:C2StateErrorCode[" + this + "]"), bVar != null ? bVar.a : 0);
            }
        }
        this.x = camera2CameraImpl$InternalState;
        switch (camera2CameraImpl$InternalState.ordinal()) {
            case 0:
                cameraInternal$State = CameraInternal$State.RELEASED;
                break;
            case 1:
                cameraInternal$State = CameraInternal$State.RELEASING;
                break;
            case 2:
                cameraInternal$State = CameraInternal$State.CLOSED;
                break;
            case 3:
                cameraInternal$State = CameraInternal$State.PENDING_OPEN;
                break;
            case 4:
            case 5:
            case 6:
                cameraInternal$State = CameraInternal$State.CLOSING;
                break;
            case 7:
            case 8:
                cameraInternal$State = CameraInternal$State.OPENING;
                break;
            case 9:
                cameraInternal$State = CameraInternal$State.OPEN;
                break;
            case 10:
                cameraInternal$State = CameraInternal$State.CONFIGURED;
                break;
            default:
                yci0.k(camera2CameraImpl$InternalState, "Unknown state: ");
                return;
        }
        ht7 ht7Var = this.N;
        synchronized (ht7Var.b) {
            try {
                int i = ht7Var.f;
                CameraInternal$State cameraInternal$State3 = CameraInternal$State.RELEASED;
                HashMap hashMap = ht7Var.e;
                HashMap hashMap2 = null;
                if (cameraInternal$State == cameraInternal$State3) {
                    ft7 ft7Var2 = (ft7) hashMap.remove(this);
                    if (ft7Var2 != null) {
                        ht7Var.b();
                        cameraInternal$State2 = ft7Var2.a;
                    } else {
                        cameraInternal$State2 = null;
                    }
                } else {
                    ft7 ft7Var3 = (ft7) hashMap.get(this);
                    d6z.v(ft7Var3, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    CameraInternal$State cameraInternal$State4 = ft7Var3.a;
                    ft7Var3.a = cameraInternal$State;
                    CameraInternal$State cameraInternal$State5 = CameraInternal$State.OPENING;
                    if (cameraInternal$State == cameraInternal$State5) {
                        d6z.y("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", (cameraInternal$State != null && cameraInternal$State.a()) || cameraInternal$State4 == cameraInternal$State5);
                    }
                    if (cameraInternal$State4 != cameraInternal$State) {
                        ht7.c(this, cameraInternal$State);
                        ht7Var.b();
                    }
                    cameraInternal$State2 = cameraInternal$State4;
                }
                if (cameraInternal$State2 != cameraInternal$State) {
                    if (ht7Var.d.b() == 2 && cameraInternal$State == CameraInternal$State.CONFIGURED) {
                        String c = ht7Var.d.c(f().c());
                        if (c != null) {
                            ft7Var = ht7Var.a(c);
                            if (i >= 1 && ht7Var.f > 0) {
                                hashMap2 = new HashMap();
                                for (Map.Entry entry : ht7Var.e.entrySet()) {
                                    if (((ft7) entry.getValue()).a == CameraInternal$State.PENDING_OPEN) {
                                        hashMap2.put((co7) entry.getKey(), (ft7) entry.getValue());
                                    }
                                }
                            } else if (cameraInternal$State == CameraInternal$State.PENDING_OPEN && ht7Var.f > 0) {
                                hashMap2 = new HashMap();
                                hashMap2.put(this, (ft7) ht7Var.e.get(this));
                            }
                            if (hashMap2 != null && !z) {
                                hashMap2.remove(this);
                            }
                            if (hashMap2 != null) {
                                for (ft7 ft7Var4 : hashMap2.values()) {
                                    ft7Var4.getClass();
                                    try {
                                        ft7Var4.b.execute(new dn7(5, ft7Var4.d));
                                    } catch (RejectedExecutionException e) {
                                        sgb1.e("CameraStateRegistry", "Unable to notify camera to open.", e);
                                    }
                                }
                            }
                            if (ft7Var != null) {
                                try {
                                    ft7Var.b.execute(new dn7(6, ft7Var.c));
                                } catch (RejectedExecutionException e2) {
                                    sgb1.e("CameraStateRegistry", "Unable to notify camera to configure.", e2);
                                }
                            }
                        }
                    }
                    ft7Var = null;
                    if (i >= 1) {
                    }
                    if (cameraInternal$State == CameraInternal$State.PENDING_OPEN) {
                        hashMap2 = new HashMap();
                        hashMap2.put(this, (ft7) ht7Var.e.get(this));
                    }
                    if (hashMap2 != null) {
                        hashMap2.remove(this);
                    }
                    if (hashMap2 != null) {
                    }
                    if (ft7Var != null) {
                    }
                }
            } finally {
            }
        }
        this.y.a.m(new dvy(cameraInternal$State));
        this.z.a(cameraInternal$State, bVar);
    }

    public final ArrayList I(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.j jVar = (androidx.camera.core.j) it.next();
            arrayList2.add(new u34(A(jVar), jVar.getClass(), this.T ? jVar.o : jVar.p, jVar.h, jVar.d(), jVar.i, jVar.e() == null ? null : iru0.L(jVar)));
        }
        return arrayList2;
    }

    public final void J(ArrayList arrayList) {
        Size size;
        boolean isEmpty = this.a.c().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            u34 u34Var = (u34) it.next();
            if (!this.a.e(u34Var.a)) {
                ui21 ui21Var = this.a;
                String str = u34Var.a;
                jyq0 jyq0Var = u34Var.c;
                xi21 xi21Var = u34Var.d;
                lru0 lru0Var = u34Var.f;
                List list = u34Var.g;
                LinkedHashMap linkedHashMap = ui21Var.a;
                ti21 ti21Var = (ti21) linkedHashMap.get(str);
                if (ti21Var == null) {
                    ti21Var = new ti21(jyq0Var, xi21Var, lru0Var, list);
                    linkedHashMap.put(str, ti21Var);
                }
                ti21Var.e = true;
                ui21Var.f(str, jyq0Var, xi21Var, lru0Var, list);
                arrayList2.add(u34Var.a);
                if (u34Var.b == androidx.camera.core.g.class && (size = u34Var.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        w("Use cases [" + TextUtils.join(Extension.FIX_SPACE, arrayList2) + "] now ATTACHED");
        if (isEmpty) {
            this.A.C(true);
            b bVar = this.A;
            synchronized (bVar.d) {
                bVar.q++;
            }
        }
        s();
        O();
        N();
        M();
        F();
        Camera2CameraImpl$InternalState camera2CameraImpl$InternalState = this.x;
        Camera2CameraImpl$InternalState camera2CameraImpl$InternalState2 = Camera2CameraImpl$InternalState.OPENED;
        if (camera2CameraImpl$InternalState == camera2CameraImpl$InternalState2) {
            E();
        } else {
            int ordinal = this.x.ordinal();
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                K(false);
            } else if (ordinal != 5) {
                w("open() ignored due to being in state: " + this.x);
            } else {
                G(Camera2CameraImpl$InternalState.REOPENING);
                if (!this.J.isEmpty() && !this.S && this.E == 0) {
                    d6z.y("Camera Device should be open if session close is not complete", this.D != null);
                    G(camera2CameraImpl$InternalState2);
                    E();
                }
            }
        }
        if (rational != null) {
            this.A.h.e = rational;
        }
    }

    public final void K(boolean z) {
        w("Attempting to force open the camera.");
        if (this.N.d(this)) {
            D(z);
        } else {
            w("No cameras available. Waiting for available camera before opening camera.");
            G(Camera2CameraImpl$InternalState.PENDING_OPEN);
        }
    }

    public final void L(boolean z) {
        w("Attempting to open the camera.");
        if (this.L.isCameraAvailable() && this.N.d(this)) {
            D(z);
        } else {
            w("No cameras available. Waiting for available camera before opening camera.");
            G(Camera2CameraImpl$InternalState.PENDING_OPEN);
        }
    }

    public final void M() {
        hyq0 a = this.a.a();
        boolean c = a.c();
        b bVar = this.A;
        if (!c) {
            bVar.z = 1;
            bVar.h.n = 1;
            bVar.o.h = 1;
            this.F.g(bVar.u());
            return;
        }
        int i = a.b().g.c;
        bVar.z = i;
        bVar.h.n = i;
        bVar.o.h = i;
        a.a(bVar.u());
        this.F.g(a.b());
    }

    public final void N() {
        if (wvb1.c(this.C.b)) {
            hyq0 a = this.a.a();
            if (a.c()) {
                int intValue = ((Integer) a.b().g.a().getUpper()).intValue();
                b bVar = this.A;
                if (intValue > 30) {
                    bVar.D(true);
                } else {
                    bVar.D(false);
                }
            }
        }
    }

    public final void O() {
        Iterator it = this.a.d().iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((Boolean) ((xi21) it.next()).g(xi21.r4, Boolean.FALSE)).booleanValue();
        }
        tf61 tf61Var = this.A.m;
        if (tf61Var.d != z && z) {
            uf61 uf61Var = tf61Var.c;
            while (!uf61Var.f()) {
                ((jdv) uf61Var.b()).close();
            }
        }
        tf61Var.d = z;
    }

    @Override // defpackage.br7
    public final gq60 a() {
        return this.y;
    }

    @Override // defpackage.br7
    public final void d(jp7 jp7Var) {
        if (jp7Var == null) {
            jp7Var = np7.a;
        }
        m0r0 u = jp7Var.u();
        this.a0 = jp7Var;
        synchronized (this.b0) {
            this.c0 = u;
        }
    }

    @Override // defpackage.si21
    public final void e(androidx.camera.core.j jVar) {
        this.c.execute(new om7(this, A(jVar), this.T ? jVar.o : jVar.p, jVar.h, jVar.i, jVar.e() == null ? null : iru0.L(jVar), 0));
    }

    @Override // defpackage.br7
    public final ar7 f() {
        return this.C;
    }

    @Override // defpackage.br7
    public final void h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(I(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            androidx.camera.core.j jVar = (androidx.camera.core.j) it.next();
            String A = A(jVar);
            HashSet hashSet = this.Z;
            if (hashSet.contains(A)) {
                jVar.y();
                hashSet.remove(A);
            }
        }
        this.c.execute(new a(1, this, arrayList3));
    }

    @Override // defpackage.br7
    public final void i() {
        this.c.execute(new c(this, 1));
    }

    @Override // defpackage.br7
    public final void j(boolean z) {
        this.T = z;
    }

    @Override // defpackage.si21
    public final void k(androidx.camera.core.j jVar) {
        this.c.execute(new om7(this, A(jVar), this.T ? jVar.o : jVar.p, jVar.h, jVar.i, jVar.e() == null ? null : iru0.L(jVar), 1));
    }

    @Override // defpackage.br7
    public final qp7 l() {
        return this.A;
    }

    @Override // defpackage.br7
    public final jp7 m() {
        return this.a0;
    }

    @Override // defpackage.br7
    public final void n(final boolean z) {
        this.c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                boolean z2 = z;
                lVar.d0 = z2;
                if (z2) {
                    if (lVar.x == Camera2CameraImpl$InternalState.PENDING_OPEN || lVar.x == Camera2CameraImpl$InternalState.OPENING_WITH_ERROR) {
                        lVar.K(false);
                    }
                }
            }
        });
    }

    @Override // defpackage.br7
    public final void o(Collection collection) {
        b bVar = this.A;
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (bVar.d) {
            bVar.q++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        HashSet hashSet = this.Z;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            androidx.camera.core.j jVar = (androidx.camera.core.j) it.next();
            String A = A(jVar);
            if (!hashSet.contains(A)) {
                hashSet.add(A);
                jVar.x();
                jVar.v();
            }
        }
        try {
            this.c.execute(new nm7(2, this, new ArrayList(I(arrayList))));
        } catch (RejectedExecutionException unused) {
            w("Unable to attach use cases.");
            bVar.s();
        }
    }

    @Override // defpackage.si21
    public final void p(androidx.camera.core.j jVar) {
        this.c.execute(new d(this, A(jVar), this.T ? jVar.o : jVar.p, jVar.h, jVar.i, jVar.e() == null ? null : iru0.L(jVar)));
    }

    @Override // defpackage.si21
    public final void r(androidx.camera.core.j jVar) {
        this.c.execute(new nm7(3, this, A(jVar)));
    }

    @Override // defpackage.br7
    public final euy release() {
        return jx81.r(new mm7(this, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r0 == false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        ui21 ui21Var = this.a;
        hyq0 b = ui21Var.b();
        LinkedHashMap linkedHashMap = ui21Var.a;
        jyq0 b2 = b.b();
        int size = Collections.unmodifiableList(b2.g.a).size();
        int size2 = b2.b().size();
        v920 v920Var = this.U;
        boolean z = false;
        z = false;
        if (v920Var == null ? false : ui21Var.e(z(v920Var))) {
            Object[] objArr = size != 1 || size2 == 1;
            if (objArr != false || B(this.U)) {
                if (this.U != null) {
                    StringBuilder sb = new StringBuilder("MeteringRepeating");
                    this.U.getClass();
                    sb.append(this.U.hashCode());
                    String sb2 = sb.toString();
                    if (linkedHashMap.containsKey(sb2)) {
                        ti21 ti21Var = (ti21) linkedHashMap.get(sb2);
                        ti21Var.e = false;
                        if (!ti21Var.f) {
                            linkedHashMap.remove(sb2);
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("MeteringRepeating");
                    this.U.getClass();
                    sb3.append(this.U.hashCode());
                    String sb4 = sb3.toString();
                    if (linkedHashMap.containsKey(sb4)) {
                        ti21 ti21Var2 = (ti21) linkedHashMap.get(sb4);
                        ti21Var2.f = false;
                        if (!ti21Var2.e) {
                            linkedHashMap.remove(sb4);
                        }
                    }
                    v920 v920Var2 = this.U;
                    v920Var2.getClass();
                    sgb1.g(3, "MeteringRepeating");
                    iiv iivVar = (iiv) v920Var2.a;
                    if (iivVar != null) {
                        iivVar.a();
                    }
                    v920Var2.a = null;
                    this.U = null;
                }
            }
            z = true;
        } else {
            if (size == 0 && size2 > 0) {
                if (this.U == null) {
                    this.U = new v920(this.C.b, this.e0, new mm7(this, z ? 1 : 0));
                }
                if (!B(this.U)) {
                    v920 v920Var3 = this.U;
                    if (v920Var3 != null) {
                        String z2 = z(v920Var3);
                        v920 v920Var4 = this.U;
                        jyq0 jyq0Var = (jyq0) v920Var4.b;
                        u920 u920Var = (u920) v920Var4.c;
                        UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType = UseCaseConfigFactory$CaptureType.METERING_REPEATING;
                        List singletonList = Collections.singletonList(useCaseConfigFactory$CaptureType);
                        LinkedHashMap linkedHashMap2 = ui21Var.a;
                        ti21 ti21Var3 = (ti21) linkedHashMap2.get(z2);
                        if (ti21Var3 == null) {
                            ti21Var3 = new ti21(jyq0Var, u920Var, null, singletonList);
                            linkedHashMap2.put(z2, ti21Var3);
                        }
                        ti21Var3.e = true;
                        ui21Var.f(z2, jyq0Var, u920Var, null, singletonList);
                        v920 v920Var5 = this.U;
                        jyq0 jyq0Var2 = (jyq0) v920Var5.b;
                        u920 u920Var2 = (u920) v920Var5.c;
                        List singletonList2 = Collections.singletonList(useCaseConfigFactory$CaptureType);
                        LinkedHashMap linkedHashMap3 = ui21Var.a;
                        ti21 ti21Var4 = (ti21) linkedHashMap3.get(z2);
                        if (ti21Var4 == null) {
                            ti21Var4 = new ti21(jyq0Var2, u920Var2, null, singletonList2);
                            linkedHashMap3.put(z2, ti21Var4);
                        }
                        ti21Var4.f = true;
                    }
                }
            }
            z = true;
        }
        this.A.w = z;
        if (z) {
            return;
        }
        sgb1.d("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
    }

    public final void t() {
        d6z.y("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.x + " (error: " + y(this.E) + Extension.C_BRAKE, this.x == Camera2CameraImpl$InternalState.CLOSING || this.x == Camera2CameraImpl$InternalState.RELEASING || (this.x == Camera2CameraImpl$InternalState.REOPENING && this.E != 0));
        F();
        this.F.f();
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.C.a);
    }

    public final void u() {
        int i = 0;
        d6z.y(null, this.x == Camera2CameraImpl$InternalState.RELEASING || this.x == Camera2CameraImpl$InternalState.CLOSING);
        d6z.y(null, this.J.isEmpty());
        if (!this.R) {
            x();
            return;
        }
        if (this.S) {
            w("Ignored since configAndClose is processing");
            return;
        }
        if (!this.L.isCameraAvailable()) {
            this.R = false;
            x();
            w("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            w("Open camera to configAndClose");
            gl7 r = jx81.r(new f(this));
            this.S = true;
            r.b.c(new c(this, i), this.c);
        }
    }

    public final CameraDevice.StateCallback v() {
        ArrayList arrayList = new ArrayList(this.a.b().b().c);
        arrayList.add(this.V.f);
        arrayList.add(this.B);
        return m.b(arrayList);
    }

    public final void w(String str) {
        toString();
        sgb1.g(3, "Camera2CameraImpl");
    }

    public final void x() {
        d6z.y(null, this.x == Camera2CameraImpl$InternalState.RELEASING || this.x == Camera2CameraImpl$InternalState.CLOSING);
        d6z.y(null, this.J.isEmpty());
        this.D = null;
        if (this.x == Camera2CameraImpl$InternalState.CLOSING) {
            G(Camera2CameraImpl$InternalState.INITIALIZED);
            return;
        }
        ((CameraManager) this.b.a.b).unregisterAvailabilityCallback(this.L);
        G(Camera2CameraImpl$InternalState.RELEASED);
        androidx.concurrent.futures.b bVar = this.I;
        if (bVar != null) {
            bVar.b(null);
            this.I = null;
        }
    }
}
