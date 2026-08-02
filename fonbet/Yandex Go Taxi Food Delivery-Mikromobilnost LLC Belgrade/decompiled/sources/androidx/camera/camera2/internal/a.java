package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import android.text.TextUtils;
import defpackage.d6z;
import defpackage.euy;
import defpackage.hiv;
import defpackage.jx81;
import defpackage.mm7;
import defpackage.ni91;
import defpackage.sk7;
import defpackage.tf61;
import defpackage.u34;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sk7 sk7Var;
        sk7 sk7Var2;
        int i = 1;
        switch (this.a) {
            case 0:
                ((Camera2CameraControlImpl$CameraControlSessionCallback) this.b).lambda$onCaptureCompleted$0((TotalCaptureResult) this.c);
                break;
            case 1:
                l lVar = (l) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    u34 u34Var = (u34) it.next();
                    if (lVar.a.e(u34Var.a)) {
                        lVar.a.a.remove(u34Var.a);
                        arrayList2.add(u34Var.a);
                        if (u34Var.b == androidx.camera.core.g.class) {
                            z = true;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    lVar.w("Use cases [" + TextUtils.join(Extension.FIX_SPACE, arrayList2) + "] now DETACHED for camera");
                    if (z) {
                        lVar.A.h.e = null;
                    }
                    lVar.s();
                    if (lVar.a.d().isEmpty()) {
                        b bVar = lVar.A;
                        tf61 tf61Var = bVar.m;
                        boolean z2 = tf61Var.d;
                        tf61Var.d = false;
                        bVar.D(false);
                    } else {
                        lVar.O();
                        lVar.N();
                    }
                    if (!lVar.a.c().isEmpty()) {
                        lVar.M();
                        lVar.F();
                        if (lVar.x == Camera2CameraImpl$InternalState.OPENED) {
                            lVar.E();
                            break;
                        }
                    } else {
                        lVar.A.s();
                        lVar.F();
                        lVar.A.C(false);
                        lVar.F = lVar.C();
                        lVar.w("Closing camera.");
                        switch (lVar.x.ordinal()) {
                            case 3:
                            case 4:
                                d6z.y(null, lVar.D == null);
                                lVar.G(Camera2CameraImpl$InternalState.INITIALIZED);
                                break;
                            case 5:
                            default:
                                lVar.w("close() ignored due to being in state: " + lVar.x);
                                break;
                            case 6:
                            case 7:
                            case 8:
                                if (lVar.B.cancelScheduledReopen() || ((sk7Var = (sk7) lVar.h0.a) != null && !((AtomicBoolean) sk7Var.c).get())) {
                                    r2 = true;
                                }
                                lVar.h0.g();
                                lVar.G(Camera2CameraImpl$InternalState.CLOSING);
                                if (r2) {
                                    d6z.y(null, lVar.J.isEmpty());
                                    lVar.u();
                                    break;
                                }
                                break;
                            case 9:
                            case 10:
                                lVar.G(Camera2CameraImpl$InternalState.CLOSING);
                                lVar.t();
                                break;
                        }
                    }
                }
                break;
            default:
                l lVar2 = (l) this.b;
                androidx.concurrent.futures.b bVar2 = (androidx.concurrent.futures.b) this.c;
                if (lVar2.H == null) {
                    if (lVar2.x != Camera2CameraImpl$InternalState.RELEASED) {
                        lVar2.H = jx81.r(new mm7(lVar2, i));
                    } else {
                        lVar2.H = hiv.c;
                    }
                }
                euy euyVar = lVar2.H;
                switch (lVar2.x.ordinal()) {
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        if (lVar2.B.cancelScheduledReopen() || ((sk7Var2 = (sk7) lVar2.h0.a) != null && !((AtomicBoolean) sk7Var2.c).get())) {
                            r2 = true;
                        }
                        lVar2.h0.g();
                        lVar2.G(Camera2CameraImpl$InternalState.RELEASING);
                        if (r2) {
                            d6z.y(null, lVar2.J.isEmpty());
                            lVar2.u();
                            break;
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                        d6z.y(null, lVar2.D == null);
                        lVar2.G(Camera2CameraImpl$InternalState.RELEASING);
                        d6z.y(null, lVar2.J.isEmpty());
                        lVar2.u();
                        break;
                    case 9:
                    case 10:
                        lVar2.G(Camera2CameraImpl$InternalState.RELEASING);
                        lVar2.t();
                        break;
                    default:
                        lVar2.w("release() ignored due to being in state: " + lVar2.x);
                        break;
                }
                ni91.h(euyVar, bVar2);
                break;
        }
    }
}
