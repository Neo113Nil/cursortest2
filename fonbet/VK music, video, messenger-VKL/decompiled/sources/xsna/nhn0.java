package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.view.PreviewView;
import com.vk.camera.ui.SuperappQrCameraUiConfig;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import xsna.e4z;
import xsna.gfw;
import xsna.n3d0;
import xsna.vfq0;

/* compiled from: SuperappQrCameraFragment.kt */
/* loaded from: classes16.dex */
public final class nhn0 extends uhv0 implements arf0 {
    public ViewGroup h;
    public PreviewView i;
    public n3d0 l;
    public gfw m;
    public lgd0 n;
    public volatile boolean o;
    public DisplayManager p;
    public pne0 q;
    public ExecutorService r;
    public SuperappQrCameraUiConfig s;
    public int j = -1;
    public int k = 1;
    public final a t = new a();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.uhv0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.q = (pne0) context;
        Bundle arguments = getArguments();
        SuperappQrCameraUiConfig superappQrCameraUiConfig = arguments != null ? (SuperappQrCameraUiConfig) arguments.getParcelable("qr_ui_config") : null;
        if (superappQrCameraUiConfig == null) {
            superappQrCameraUiConfig = null;
        }
        if (superappQrCameraUiConfig == null) {
            superappQrCameraUiConfig = new SuperappQrCameraUiConfig(false, 1, null);
        }
        this.s = superappQrCameraUiConfig;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.r = asu0.C();
        return layoutInflater.inflate(R.layout.vk_superapp_camera_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ExecutorService executorService = this.r;
        if (executorService == null) {
            executorService = null;
        }
        executorService.shutdown();
        DisplayManager displayManager = this.p;
        (displayManager != null ? displayManager : null).unregisterDisplayListener(this.t);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"MissingPermission"})
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        this.h = viewGroup;
        PreviewView previewView = (PreviewView) viewGroup.findViewById(R.id.camera_preview);
        this.i = previewView;
        DisplayManager displayManager = (DisplayManager) previewView.getContext().getSystemService("display");
        this.p = displayManager;
        if (displayManager == null) {
            displayManager = null;
        }
        displayManager.registerDisplayListener(this.t, null);
        PreviewView previewView2 = this.i;
        if (previewView2 == null) {
            previewView2 = null;
        }
        previewView2.post(new qc9(this, 7));
        PreviewView previewView3 = this.i;
        if (previewView3 == null) {
            previewView3 = null;
        }
        previewView3.postDelayed(new tsk(this, 10), 1000L);
        View findViewById = view.findViewById(R.id.tv_qr_scanner_prompt);
        SuperappQrCameraUiConfig superappQrCameraUiConfig = this.s;
        awt0.v(findViewById, (superappQrCameraUiConfig != null ? superappQrCameraUiConfig : null).b);
        view.findViewById(R.id.vk_superapp_qr_camera_close).setOnClickListener(new naj(this, 7));
    }

    public final void tn() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        PreviewView previewView = this.i;
        PreviewView previewView2 = null;
        if (previewView == null) {
            previewView = null;
        }
        previewView.getDisplay().getRealMetrics(displayMetrics);
        xgx0 xgx0Var = xgx0.a;
        String str = "Screen metrics: " + displayMetrics.widthPixels + " x " + displayMetrics.heightPixels;
        xgx0Var.getClass();
        xgx0.a(str);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        double max = Math.max(i, i2) / Math.min(i, i2);
        int i3 = Math.abs(max - 1.3333333333333333d) <= Math.abs(max - 1.7777777777777777d) ? 0 : 1;
        xgx0.a("Preview aspect ratio: " + i3);
        PreviewView previewView3 = this.i;
        if (previewView3 == null) {
            previewView3 = null;
        }
        int rotation = previewView3.getDisplay().getRotation();
        lgd0 lgd0Var = this.n;
        if (lgd0Var == null) {
            throw new IllegalStateException("Camera initialization failed.");
        }
        LinkedHashSet<pi9> linkedHashSet = new LinkedHashSet<>();
        int i4 = this.k;
        f2z f2zVar = new f2z();
        f2zVar.a = i4;
        linkedHashSet.add(f2zVar);
        nl9 nl9Var = new nl9();
        nl9Var.a = linkedHashSet;
        n3d0.b bVar = new n3d0.b();
        androidx.camera.core.impl.n nVar = bVar.a;
        androidx.camera.core.impl.a aVar = androidx.camera.core.impl.l.b;
        nVar.C(aVar, Integer.valueOf(i3));
        androidx.camera.core.impl.n nVar2 = bVar.a;
        androidx.camera.core.impl.a aVar2 = androidx.camera.core.impl.l.c;
        nVar2.C(aVar2, Integer.valueOf(rotation));
        androidx.camera.core.impl.n nVar3 = bVar.a;
        androidx.camera.core.impl.a aVar3 = androidx.camera.core.impl.l.b;
        nVar3.getClass();
        try {
            obj = nVar3.f(aVar3);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        if (obj != null) {
            try {
                obj4 = nVar3.f(androidx.camera.core.impl.l.d);
            } catch (IllegalArgumentException unused2) {
                obj4 = null;
            }
            if (obj4 != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
        }
        n3d0 n3d0Var = new n3d0(new androidx.camera.core.impl.p(androidx.camera.core.impl.o.y(nVar3)));
        n3d0Var.m = n3d0.s;
        n3d0Var.p = false;
        this.l = n3d0Var;
        gfw.c cVar = new gfw.c();
        cVar.a.C(aVar, Integer.valueOf(i3));
        cVar.a.C(aVar2, Integer.valueOf(rotation));
        cVar.a.C(androidx.camera.core.impl.i.t, 0);
        androidx.camera.core.impl.n nVar4 = cVar.a;
        nVar4.getClass();
        try {
            obj2 = nVar4.f(aVar);
        } catch (IllegalArgumentException unused3) {
            obj2 = null;
        }
        if (obj2 != null) {
            try {
                obj3 = nVar4.f(androidx.camera.core.impl.l.d);
            } catch (IllegalArgumentException unused4) {
                obj3 = null;
            }
            if (obj3 != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
        }
        gfw gfwVar = new gfw(new androidx.camera.core.impl.i(androidx.camera.core.impl.o.y(cVar.a)));
        ExecutorService executorService = this.r;
        if (executorService == null) {
            executorService = null;
        }
        xme0 xme0Var = new xme0(requireContext(), new gqe0(this, 11));
        synchronized (gfwVar.m) {
            jfw jfwVar = gfwVar.l;
            d4n d4nVar = new d4n(gfwVar, xme0Var);
            synchronized (jfwVar.e) {
                jfwVar.b = d4nVar;
                jfwVar.d = executorService;
            }
            if (gfwVar.n == null) {
                gfwVar.c = vfq0.c.ACTIVE;
                gfwVar.j();
            }
            gfwVar.n = xme0Var;
        }
        this.m = gfwVar;
        fsk.m();
        e4z e4zVar = lgd0Var.a;
        synchronized (e4zVar.a) {
            Iterator it = e4zVar.b.keySet().iterator();
            while (it.hasNext()) {
                d4z d4zVar = (d4z) e4zVar.b.get((e4z.a) it.next());
                synchronized (d4zVar.b) {
                    CameraUseCaseAdapter cameraUseCaseAdapter = d4zVar.d;
                    cameraUseCaseAdapter.l((ArrayList) cameraUseCaseAdapter.k());
                }
                e4zVar.f(d4zVar.f());
            }
        }
        try {
            lgd0Var.a(this, nl9Var, this.l, this.m);
            n3d0 n3d0Var2 = this.l;
            if (n3d0Var2 != null) {
                PreviewView previewView4 = this.i;
                if (previewView4 != null) {
                    previewView2 = previewView4;
                }
                n3d0Var2.v(previewView2.getSurfaceProvider());
            }
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
        }
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.QR_SCANNER;
    }

    /* compiled from: SuperappQrCameraFragment.kt */
    public static final class a implements DisplayManager.DisplayListener {
        public a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        @SuppressLint({"UnsafeExperimentalUsageError,UnsafeOptInUsageError"})
        public final void onDisplayChanged(int i) {
            CameraInternal a;
            nhn0 nhn0Var = nhn0.this;
            View view = nhn0Var.getView();
            if (view == null || i != nhn0Var.j) {
                return;
            }
            xgx0 xgx0Var = xgx0.a;
            String str = "Rotation changed: " + view.getDisplay().getRotation();
            xgx0Var.getClass();
            xgx0.a(str);
            n3d0 n3d0Var = nhn0Var.l;
            if (n3d0Var != null && n3d0Var.s(view.getDisplay().getRotation())) {
                n3d0Var.u();
            }
            gfw gfwVar = nhn0Var.m;
            if (gfwVar == null || !gfwVar.s(view.getDisplay().getRotation()) || (a = gfwVar.a()) == null) {
                return;
            }
            gfwVar.l.c = a.c().g(((androidx.camera.core.impl.l) gfwVar.f).p(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }
}
