package com.yandex.mobile.drive.scan.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.video.g;
import androidx.camera.video.h;
import androidx.camera.view.PreviewView;
import com.adjust.sdk.Constants;
import com.yandex.mobile.drive.scan.service.f;
import com.yandex.mobile.drive.scan.tools.ScanReporter;
import defpackage.a84;
import defpackage.ar7;
import defpackage.bgc;
import defpackage.crg0;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.dq7;
import defpackage.e2c;
import defpackage.e70;
import defpackage.g70;
import defpackage.g8e;
import defpackage.gym;
import defpackage.h2b1;
import defpackage.hh5;
import defpackage.hxj0;
import defpackage.ic0;
import defpackage.ike;
import defpackage.ir1;
import defpackage.j85;
import defpackage.jl40;
import defpackage.kgg0;
import defpackage.l0b1;
import defpackage.m0h0;
import defpackage.ny61;
import defpackage.ody;
import defpackage.pdy;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.q64;
import defpackage.qgg0;
import defpackage.qgn0;
import defpackage.qp7;
import defpackage.qq1;
import defpackage.qx60;
import defpackage.r0r;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tk31;
import defpackage.tob1;
import defpackage.ulm0;
import defpackage.vlm0;
import defpackage.wlm0;
import defpackage.ws7;
import defpackage.wxh0;
import defpackage.xs7;
import defpackage.zy11;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b extends j85 {
    public final Executor A;
    public final Context c;
    public final boolean d;
    public final Window e;
    public final pey f;
    public final File g;
    public final ScanActivity h;
    public final f i;
    public final qx60 j;
    public final e2c k;
    public final ir1 l;
    public ike o;
    public boolean p;
    public pdy q;
    public h r;
    public Integer s;
    public long t;
    public long u;
    public pzt0 v;
    public Bitmap w;
    public Integer x;
    public boolean y;
    public final ScanReporter m = new ScanReporter();
    public sls n = new bgc(12);
    public final ExecutorService z = Executors.newSingleThreadExecutor();
    public final wlm0 B = new wlm0(this);

    public b(Context context, boolean z, Window window, ScanActivity scanActivity, File file, ScanActivity scanActivity2, f fVar, qx60 qx60Var, e2c e2cVar, ir1 ir1Var) {
        this.c = context;
        this.d = z;
        this.e = window;
        this.f = scanActivity;
        this.g = file;
        this.h = scanActivity2;
        this.i = fVar;
        this.j = qx60Var;
        this.k = e2cVar;
        this.l = ir1Var;
        this.A = context.getMainExecutor();
    }

    public static final void b(b bVar, pdy pdyVar, ScanMeta scanMeta, Size size) {
        c cVar = (c) bVar.a();
        View view = cVar.e;
        File file = new File(bVar.g, g8e.o("video_", scanMeta.getMode()));
        file.delete();
        Integer num = bVar.s;
        if (num == null) {
            num = (scanMeta.isSelfie() && pdyVar.j(xs7.b)) ? 0 : pdyVar.j(xs7.c) ? 1 : null;
        }
        pdyVar.z();
        ws7 ws7Var = new ws7();
        if (num != null) {
            ws7Var.b(num.intValue());
        }
        xs7 a = ws7Var.a();
        bVar.s = num;
        bVar.w = null;
        bVar.x = null;
        try {
            bVar.d(pdyVar, a, size);
        } catch (IllegalArgumentException unused) {
            if (size != null) {
                hh5 hh5Var = new hh5(size);
                tob1.b();
                hh5 hh5Var2 = pdyVar.j;
                if (hh5Var2 != hh5Var && (hh5Var2 == null || hh5Var2 != hh5Var)) {
                    pdyVar.j = hh5Var;
                    pdyVar.v(Integer.valueOf(pdyVar.i.J()), Integer.valueOf(pdyVar.i.K()), Integer.valueOf(pdyVar.i.L()));
                    pdyVar.t(null);
                }
            }
            pdyVar.o(a);
            pdyVar.q();
            pdyVar.p(2);
            pey peyVar = bVar.f;
            tob1.b();
            pdyVar.O = peyVar;
            pdyVar.t(null);
            bVar.m.a(ScanReporter.CaptureStrategy.AnalysisAndFfmpeg, size);
        }
        cVar.c.setController(pdyVar);
        tob1.b();
        ody odyVar = pdyVar.s;
        ar7 c = odyVar == null ? null : odyVar.c();
        view.setVisibility(c != null && ((g70) c).p() ? 0 : 8);
        tob1.b();
        ody odyVar2 = pdyVar.s;
        qp7 b = odyVar2 == null ? null : odyVar2.b();
        if (b != null) {
            ((e70) b).f(bVar.y);
        }
        view.setBackgroundResource(bVar.y ? m0h0.torch_enabled : m0h0.torch_disabled);
        ((c) bVar.a()).d.setVisibility(scanMeta.getSwitchAllowed() && pdyVar.j(xs7.c) && pdyVar.j(xs7.b) ? 0 : 8);
        bVar.p = false;
        bVar.k.setListener(new vlm0(bVar, 7));
        tob1.b();
        if ((pdyVar.b & 4) == 0) {
            l0b1.h(new AssertionError("no available strategies", null));
            return;
        }
        if (pdyVar.m()) {
            return;
        }
        bVar.t = SystemClock.uptimeMillis();
        r0r j = new gym(file).j();
        Executor executor = bVar.A;
        a aVar = new a(bVar, bVar.i.a());
        tob1.b();
        d6z.y("Camera not initialized.", pdyVar.l());
        tob1.b();
        d6z.y("VideoCapture disabled.", (pdyVar.b & 4) != 0);
        d6z.y("Recording video. Only one recording can be active at a time.", !pdyVar.m());
        Context context = pdyVar.J;
        dq7 dq7Var = new dq7(pdyVar, context.getMainExecutor(), aVar);
        h a2 = new androidx.camera.video.b(context, (g) pdyVar.l.N(), j).a(executor, dq7Var);
        pdyVar.n.put(dq7Var, a2);
        pdyVar.m = a2;
        bVar.r = a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, tk31 tk31Var, ContinuationImpl continuationImpl) {
        ScanPresenter$processPictureAndVideo$1 scanPresenter$processPictureAndVideo$1;
        int i;
        String mode;
        tk31 tk31Var2;
        c cVar;
        ScanReporter.PhotoSource photoSource;
        Bitmap bitmap;
        View view;
        String str;
        c cVar2;
        bVar.getClass();
        ScanReporter scanReporter = bVar.m;
        if (continuationImpl instanceof ScanPresenter$processPictureAndVideo$1) {
            scanPresenter$processPictureAndVideo$1 = (ScanPresenter$processPictureAndVideo$1) continuationImpl;
            int i2 = scanPresenter$processPictureAndVideo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scanPresenter$processPictureAndVideo$1.label = i2 - Integer.MIN_VALUE;
                ScanPresenter$processPictureAndVideo$1 scanPresenter$processPictureAndVideo$12 = scanPresenter$processPictureAndVideo$1;
                Object obj = scanPresenter$processPictureAndVideo$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scanPresenter$processPictureAndVideo$12.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar3 = (c) bVar.a();
                    cVar3.i.setVisibility(8);
                    cVar3.b.setVisibility(0);
                    mode = bVar.i.a().getMode();
                    tk31Var2 = tk31Var;
                    scanPresenter$processPictureAndVideo$12.L$0 = tk31Var2;
                    scanPresenter$processPictureAndVideo$12.L$1 = cVar3;
                    scanPresenter$processPictureAndVideo$12.L$2 = mode;
                    scanPresenter$processPictureAndVideo$12.label = 1;
                    Object obj3 = bVar.w;
                    if (obj3 != null) {
                        pdy pdyVar = bVar.q;
                        if (pdyVar != null) {
                            tob1.b();
                            if ((pdyVar.b & 1) != 0) {
                                photoSource = ScanReporter.PhotoSource.ImageCapture;
                                scanReporter.getClass();
                                ScanReporter.c(photoSource);
                            }
                        }
                        photoSource = ScanReporter.PhotoSource.Analysis;
                        scanReporter.getClass();
                        ScanReporter.c(photoSource);
                    } else {
                        obj3 = bVar.i(scanPresenter$processPictureAndVideo$12);
                    }
                    if (obj3 != obj2) {
                        cVar = cVar3;
                        obj = obj3;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scanPresenter$processPictureAndVideo$12.L$2;
                    cVar2 = (c) scanPresenter$processPictureAndVideo$12.L$1;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        scanReporter.b(str, "post-processing failure", null);
                        bVar.f();
                        return zy11Var;
                    }
                    scanReporter.getClass();
                    HashMap h = kotlin.collections.b.h(new Pair("name", str));
                    Map map = scanReporter.a;
                    if (map == null) {
                        map = kotlin.collections.b.f();
                    }
                    LinkedHashMap n = kotlin.collections.b.n(h, map);
                    qgn0 qgn0Var = h2b1.c;
                    if (qgn0Var != null) {
                        qgn0Var.n("video_create_success", n);
                    }
                    scanReporter.a = null;
                    bVar.n = new ScanPresenter$processPictureAndVideo$2(0, bVar.i, f.class, "revertPicture", "revertPicture()V", 0);
                    cVar2.a(true);
                    return zy11Var;
                }
                mode = (String) scanPresenter$processPictureAndVideo$12.L$2;
                c cVar4 = (c) scanPresenter$processPictureAndVideo$12.L$1;
                tk31 tk31Var3 = (tk31) scanPresenter$processPictureAndVideo$12.L$0;
                kotlin.b.b(obj);
                cVar = cVar4;
                tk31Var2 = tk31Var3;
                String str2 = mode;
                bitmap = (Bitmap) obj;
                view = cVar.j;
                if (view.getVisibility() == 0) {
                    view.animate().alpha(0.0f).withEndAction(new hxj0(25, cVar));
                }
                if (bitmap != null) {
                    scanReporter.b(str2, "no picture", null);
                    return zy11Var;
                }
                ImageView imageView = cVar.n;
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(0);
                f fVar = bVar.i;
                tk31 tk31Var4 = tk31Var2;
                Integer num = bVar.x;
                boolean z = bVar.d;
                scanPresenter$processPictureAndVideo$12.L$0 = null;
                scanPresenter$processPictureAndVideo$12.L$1 = cVar;
                scanPresenter$processPictureAndVideo$12.L$2 = str2;
                scanPresenter$processPictureAndVideo$12.L$3 = null;
                scanPresenter$processPictureAndVideo$12.label = 2;
                obj = fVar.b(bitmap, tk31Var4, num, z, scanPresenter$processPictureAndVideo$12);
                if (obj != obj2) {
                    str = str2;
                    cVar2 = cVar;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return obj2;
            }
        }
        scanPresenter$processPictureAndVideo$1 = new ScanPresenter$processPictureAndVideo$1(bVar, continuationImpl);
        ScanPresenter$processPictureAndVideo$1 scanPresenter$processPictureAndVideo$122 = scanPresenter$processPictureAndVideo$1;
        Object obj4 = scanPresenter$processPictureAndVideo$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scanPresenter$processPictureAndVideo$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        String str22 = mode;
        bitmap = (Bitmap) obj4;
        view = cVar.j;
        if (view.getVisibility() == 0) {
        }
        if (bitmap != null) {
        }
    }

    public final void d(pdy pdyVar, xs7 xs7Var, Size size) {
        if (size != null && !jl40.l(Build.DEVICE, "generic_x86")) {
            a84 a84Var = kgg0.b;
            List g = scc.g(a84Var, kgg0.a, kgg0.c);
            q64 q64Var = q64.c;
            qgg0 a = qgg0.a(g, new q64(a84Var, 1));
            pdyVar.getClass();
            tob1.b();
            pdyVar.o = a;
            if (pdyVar.l()) {
                pdyVar.t.a(pdyVar.l);
            }
            pdyVar.l = pdyVar.f();
            pdyVar.t(null);
        }
        if (size != null) {
            hh5 hh5Var = new hh5(size);
            pdyVar.getClass();
            tob1.b();
            hh5 hh5Var2 = pdyVar.f;
            if (hh5Var2 != hh5Var && (hh5Var2 == null || hh5Var2 != hh5Var)) {
                pdyVar.f = hh5Var;
                tob1.b();
                pdyVar.w(Integer.valueOf(pdyVar.e.q));
                pdyVar.t(null);
            }
        }
        pdyVar.o(xs7Var);
        pdyVar.p(5);
        tob1.b();
        pdyVar.O = this.f;
        pdyVar.t(null);
        this.m.a(ScanReporter.CaptureStrategy.VideoAndImage, size);
    }

    public final void e() {
        pdy pdyVar = this.q;
        if (pdyVar == null || this.p) {
            return;
        }
        this.p = true;
        this.k.setListener(null);
        c cVar = (c) a();
        ike ikeVar = this.o;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new ScanPresenter$capturePhoto$1(this, cVar, pdyVar, null), 3);
        }
    }

    public final void f() {
        c cVar = (c) a();
        ScanMeta a = this.i.a();
        String captionTextName = a.getCaptionTextName();
        String captionTextDesc = a.getCaptionTextDesc();
        CameraPattern pattern = a.getPattern();
        cVar.a(false);
        cVar.p.setText(captionTextName);
        TextView textView = cVar.q;
        textView.setText(captionTextDesc);
        textView.setVisibility(8);
        cVar.r.setPattern(pattern);
        cVar.n.setVisibility(8);
        cVar.c.setVisibility(0);
        Iterator it = cVar.s.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
        pzt0 pzt0Var = this.v;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ike ikeVar = this.o;
        this.v = ikeVar != null ? tje.N(ikeVar, null, null, new ScanPresenter$recordVideo$1(this, a, null), 3) : null;
    }

    public final void g() {
        if (!this.p) {
            f();
        } else if (cvu0.t(Build.MANUFACTURER, Constants.REFERRER_API_XIAOMI, true) && cvu0.x(Build.MODEL, "mi", true)) {
            this.n.invoke();
            this.n = new bgc(12);
            f();
        }
    }

    public final void h() {
        this.u = SystemClock.uptimeMillis();
        h hVar = this.r;
        if (hVar != null) {
            hVar.close();
        }
        this.r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        ScanPresenter$takePreviewImage$1 scanPresenter$takePreviewImage$1;
        int i;
        c cVar;
        if (continuationImpl instanceof ScanPresenter$takePreviewImage$1) {
            scanPresenter$takePreviewImage$1 = (ScanPresenter$takePreviewImage$1) continuationImpl;
            int i2 = scanPresenter$takePreviewImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scanPresenter$takePreviewImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scanPresenter$takePreviewImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scanPresenter$takePreviewImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar2 = (c) a();
                    PreviewView previewView = cVar2.c;
                    ScanPresenter$takePreviewImage$image$1 scanPresenter$takePreviewImage$image$1 = new ScanPresenter$takePreviewImage$image$1(cVar2, null);
                    scanPresenter$takePreviewImage$1.L$0 = cVar2;
                    scanPresenter$takePreviewImage$1.label = 1;
                    Object a = com.yandex.mobile.drive.scan.camerax.a.a(previewView, this.e, this.m, scanPresenter$takePreviewImage$image$1, scanPresenter$takePreviewImage$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    cVar = cVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (c) scanPresenter$takePreviewImage$1.L$0;
                    kotlin.b.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                cVar.o.animate().alpha(1.0f);
                cVar.m.animate().alpha(1.0f);
                cVar.l.animate().alpha(1.0f);
                return bitmap;
            }
        }
        scanPresenter$takePreviewImage$1 = new ScanPresenter$takePreviewImage$1(this, continuationImpl);
        Object obj2 = scanPresenter$takePreviewImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scanPresenter$takePreviewImage$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        cVar.o.animate().alpha(1.0f);
        cVar.m.animate().alpha(1.0f);
        cVar.l.animate().alpha(1.0f);
        return bitmap2;
    }

    public final void j() {
        if (this.i.c == 0) {
            this.h.toPreviousScreen();
            return;
        }
        Integer valueOf = Integer.valueOf(wxh0.camera_photo_removal_title);
        Integer valueOf2 = Integer.valueOf(wxh0.camera_photo_removal_ok);
        Integer valueOf3 = Integer.valueOf(wxh0.camera_alert_cancel);
        ulm0 ulm0Var = new ulm0(this, 1);
        bgc bgcVar = new bgc(12);
        bgc bgcVar2 = new bgc(12);
        ir1 ir1Var = this.l;
        ir1Var.getClass();
        ir1Var.b().show(valueOf, null, null, null, scc.g(new qq1(valueOf3, new ic0(4, bgcVar), 0, 504), new qq1(valueOf2, new ic0(5, ulm0Var), crg0.dark_blue, 496)), null, false, bgcVar2);
    }
}
