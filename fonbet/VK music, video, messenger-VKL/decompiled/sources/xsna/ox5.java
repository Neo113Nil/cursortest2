package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.f;
import com.vk.media.player.video.view.SimpleVideoView;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C5369n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import xsna.apn0;
import xsna.gs9;
import xsna.snw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ox5 implements SimpleVideoView.i, iy3, io.reactivex.rxjava3.core.a0, FunctionWithThrowable {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ox5(Context context, u7c0 u7c0Var, c7g0 c7g0Var, p8c0 p8c0Var) {
        this.b = context;
        this.c = u7c0Var;
        this.d = c7g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        return io.appmetrica.analytics.screenshot.impl.d0.a((io.appmetrica.analytics.screenshot.impl.g0) this.b, (io.appmetrica.analytics.screenshot.impl.d0) this.c, (C5369n) this.d, (ActivityManager) obj);
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.i
    public void b() {
        SimpleVideoView simpleVideoView = (SimpleVideoView) this.b;
        qx5 qx5Var = (qx5) this.c;
        SimpleVideoView.i iVar = (SimpleVideoView.i) this.d;
        if (simpleVideoView.I) {
            qx5Var.x();
            if (iVar != null) {
                iVar.b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        Context context = (Context) this.b;
        u7c0 u7c0Var = (u7c0) this.c;
        c7g0 c7g0Var = (c7g0) this.d;
        Semaphore semaphore = new Semaphore(0);
        p7c0 a = t7c0.a(context, u7c0Var, c7g0Var.b(), new x850(semaphore, 12));
        p8c0.d(a);
        semaphore.tryAcquire(5L, TimeUnit.SECONDS);
        yVar.onSuccess(a);
    }

    public /* synthetic */ ox5(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.iy3
    /* renamed from: apply, reason: collision with other method in class */
    public ugz mo416apply(Object obj) {
        snw.a aVar;
        CaptureRequest build;
        gs9 gs9Var = (gs9) this.b;
        androidx.camera.core.impl.r rVar = (androidx.camera.core.impl.r) this.c;
        CameraDevice cameraDevice = (CameraDevice) this.d;
        List list = (List) obj;
        synchronized (gs9Var.a) {
            int i = gs9.c.a[gs9Var.l.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    try {
                        androidx.camera.core.impl.h.a(gs9Var.k);
                        gs9Var.j.clear();
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            gs9Var.j.put(gs9Var.k.get(i2), (Surface) list.get(i2));
                        }
                        ArrayList arrayList = new ArrayList(new HashSet(list));
                        gs9Var.l = gs9.d.OPENING;
                        apn0 apn0Var = new apn0(Arrays.asList(gs9Var.d, new apn0.a(rVar.c)));
                        ki9 ki9Var = (ki9) rVar.f.b.g(if9.x, ki9.b());
                        gs9Var.i = ki9Var;
                        ki9Var.getClass();
                        List unmodifiableList = Collections.unmodifiableList(new ArrayList(ki9Var.a));
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = unmodifiableList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((ji9) it.next());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((ji9) it2.next()).getClass();
                        }
                        f.a aVar2 = new f.a(rVar.f);
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            aVar2.c(((androidx.camera.core.impl.f) it3.next()).b);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(new m190((Surface) it4.next()));
                        }
                        xon0 xon0Var = gs9Var.e.a;
                        xon0Var.e = apn0Var;
                        zsi0 zsi0Var = new zsi0(arrayList4, xon0Var.c, new won0(xon0Var));
                        try {
                            androidx.camera.core.impl.f d = aVar2.d();
                            if (cameraDevice == null) {
                                build = null;
                            } else {
                                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(d.c);
                                df9.a(createCaptureRequest, d.b);
                                build = createCaptureRequest.build();
                            }
                            if (build != null) {
                                zsi0Var.a.a.setSessionParameters(build);
                            }
                            return gs9Var.e.a.f(cameraDevice, zsi0Var);
                        } catch (CameraAccessException e) {
                            aVar = new snw.a(e);
                            return aVar;
                        }
                    } catch (DeferrableSurface.SurfaceClosedException e2) {
                        gs9Var.k.clear();
                        aVar = new snw.a(e2);
                    }
                } else if (i != 5) {
                    return new snw.a(new CancellationException("openCaptureSession() not execute in state: " + gs9Var.l));
                }
            }
            return new snw.a(new IllegalStateException("openCaptureSession() should not be possible in state: " + gs9Var.l));
        }
    }
}
