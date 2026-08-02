package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class p0r0 implements m0r0 {
    public HandlerThread c;
    public String f;
    public final HashSet g;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();
    public int h = -1;

    public p0r0(List list) {
        this.g = sia1.h(list);
    }

    public static q0r0 n(xn7 xn7Var, HashMap hashMap) {
        if (xn7Var instanceof rnw0) {
            return new q0r0(((r84) xn7Var).a, ((rnw0) xn7Var).d());
        }
        if (!(xn7Var instanceof mdv)) {
            if (xn7Var instanceof pm40) {
                w511.x("MultiResolutionImageReader not supported yet");
                return null;
            }
            throw new UnsupportedOperationException("Unsupported Camera2OutputConfig:" + xn7Var);
        }
        mdv mdvVar = (mdv) xn7Var;
        ImageReader newInstance = ImageReader.newInstance(mdvVar.f().getWidth(), mdvVar.f().getHeight(), mdvVar.d(), mdvVar.e());
        int i = ((x64) xn7Var).a;
        hashMap.put(Integer.valueOf(i), newInstance);
        q0r0 q0r0Var = new q0r0(i, newInstance.getSurface());
        ni91.g(q0r0Var.e).c(new mmp0(7, newInstance), geb1.b());
        return q0r0Var;
    }

    @Override // defpackage.m0r0
    public final void c() {
        sgb1.d("SessionProcessorBase", "deInitSession: cameraId=" + this.f);
        o();
        synchronized (this.e) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((DeferrableSurface) it.next()).a();
                }
                this.d.clear();
                this.a.clear();
                this.b.clear();
                this.h = -1;
            } catch (Throwable th) {
                throw th;
            }
        }
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.c = null;
        }
    }

    @Override // defpackage.m0r0
    public final jyq0 i(ar7 ar7Var, q74 q74Var) {
        ar7 ar7Var2 = ar7Var;
        ao7 p = p(ar7Var2.c(), sia1.e(ar7Var2), q74Var);
        dyq0 dyq0Var = new dyq0();
        synchronized (this.e) {
            try {
                Iterator it = p.b.iterator();
                while (it.hasNext()) {
                    xn7 xn7Var = (xn7) it.next();
                    q0r0 n = n(xn7Var, this.a);
                    this.d.add(n);
                    this.b.put(Integer.valueOf(xn7Var.getId()), xn7Var);
                    g84 a = gyq0.a(n);
                    a.c = xn7Var.b();
                    a.e = Integer.valueOf(xn7Var.a());
                    List<xn7> c = xn7Var.c();
                    if (c != null && !c.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (xn7 xn7Var2 : c) {
                            this.b.put(Integer.valueOf(xn7Var2.getId()), xn7Var2);
                            arrayList.add(n(xn7Var2, this.a));
                        }
                        a.b = arrayList;
                    }
                    h84 a2 = a.a();
                    dyq0Var.a.add(a2);
                    r38 r38Var = dyq0Var.b;
                    r38Var.d(a2.a);
                    Iterator it2 = a2.b.iterator();
                    while (it2.hasNext()) {
                        r38Var.d((DeferrableSurface) it2.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        q7j0 q7j0Var = new q7j0();
        for (CaptureRequest.Key key : p.a.keySet()) {
            q7j0Var.b(key, p.a.get(key));
        }
        v5c0 a3 = q7j0Var.a();
        r38 r38Var2 = dyq0Var.b;
        r38Var2.getClass();
        r38Var2.b = yy40.p(a3);
        dyq0Var.b.c = p.c;
        dyq0Var.h = p.d;
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.c = handlerThread;
        handlerThread.start();
        this.f = ar7Var2.c();
        sgb1.g(3, "SessionProcessorBase");
        return dyq0Var.d();
    }

    @Override // defpackage.m0r0
    public final HashSet j() {
        return this.g;
    }

    public abstract void o();

    public abstract ao7 p(String str, LinkedHashMap linkedHashMap, q74 q74Var);

    public final void q(final int i, final hdv hdvVar) {
        ImageReader imageReader;
        final String b;
        synchronized (this.e) {
            imageReader = (ImageReader) this.a.get(Integer.valueOf(i));
            xn7 xn7Var = (xn7) this.b.get(Integer.valueOf(i));
            b = xn7Var == null ? null : xn7Var.b();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: n0r0
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    hdv hdvVar2 = hdv.this;
                    int i2 = i;
                    String str = b;
                    try {
                        Image acquireNextImage = imageReader2.acquireNextImage();
                        hdvVar2.onNextImageAvailable(i2, acquireNextImage.getTimestamp(), new o0r0(acquireNextImage), str);
                    } catch (IllegalStateException e) {
                        sgb1.e("SessionProcessorBase", "Failed to acquire next image.", e);
                    }
                }
            }, new Handler(this.c.getLooper()));
        }
    }
}
