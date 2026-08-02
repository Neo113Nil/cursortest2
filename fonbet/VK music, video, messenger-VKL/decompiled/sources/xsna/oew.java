package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.Source;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.ets0;
import xsna.nts0;
import xsna.oew;

/* compiled from: ImVideoMessageController.kt */
/* loaded from: classes7.dex */
public final class oew implements ets0 {
    public final kew a;
    public final kkm b;
    public boolean c;
    public nts0 d;
    public final a e = new a();
    public final som0 f;
    public ets0.a g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    /* compiled from: ImVideoMessageController.kt */
    public final class a implements nts0.a {
        public a() {
        }

        @Override // xsna.nts0.a
        public final void a() {
            oew oewVar = oew.this;
            oewVar.j = false;
            nts0 nts0Var = oewVar.d;
            if (nts0Var != null) {
                nts0Var.performHapticFeedback(0, 2);
            }
            if (oewVar.h) {
                oewVar.f();
                return;
            }
            ets0.a aVar = oewVar.g;
            if (aVar != null) {
                aVar.a();
            }
            nts0 nts0Var2 = oewVar.d;
            if (nts0Var2 != null) {
                nts0Var2.f();
            }
        }

        @Override // xsna.nts0.a
        public final void b(File file, int i, boolean z) {
            oew oewVar = oew.this;
            if (!oewVar.j) {
                a();
                return;
            }
            oewVar.j = false;
            nts0 nts0Var = oewVar.d;
            if (nts0Var != null) {
                nts0Var.performHapticFeedback(0, 2);
            }
            ets0.a aVar = oewVar.g;
            if (aVar != null) {
                aVar.b(file, i, z);
            }
            oewVar.f();
        }

        @Override // xsna.nts0.a
        public final void c(long j) {
            ets0.a aVar = oew.this.g;
            if (aVar != null) {
                aVar.c(j);
            }
        }

        @Override // xsna.nts0.a
        public final void d() {
            oew oewVar = oew.this;
            oewVar.i = true;
            if (oewVar.h || oewVar.k) {
                oewVar.e();
            }
        }

        @Override // xsna.nts0.a
        public final void e() {
            oew.this.f();
        }

        @Override // xsna.nts0.a
        public final void onRecordStarted() {
            oew oewVar = oew.this;
            oewVar.j = true;
            nts0 nts0Var = oewVar.d;
            if (nts0Var != null) {
                nts0Var.performHapticFeedback(0, 2);
            }
        }
    }

    public oew(kew kewVar, kkm kkmVar) {
        this.a = kewVar;
        this.b = kkmVar;
        zdw zdwVar = i7o0.b;
        this.f = new som0((zdwVar == null ? null : zdwVar).b);
    }

    @Override // xsna.ets0
    public final void a() {
        this.k = false;
        this.a.e(true);
        if (this.j) {
            return;
        }
        f();
    }

    @Override // xsna.ets0
    public final boolean a0() {
        if (!this.c) {
            return false;
        }
        this.a.e(true);
        return f();
    }

    @Override // xsna.ets0
    public final void b(final ViewGroup viewGroup, final int i, final long j, final boolean z) {
        if (this.c) {
            return;
        }
        this.c = true;
        Context context = viewGroup.getContext();
        gzs<s3q0> gzsVar = new gzs() { // from class: xsna.mew
            @Override // xsna.gzs
            public final Object invoke() {
                oew oewVar = oew.this;
                som0 som0Var = oewVar.f;
                m1k m1kVar = new m1k(oewVar, 16);
                io.reactivex.rxjava3.internal.operators.single.b0 E = ((a1w) som0Var.b).E(som0Var, new bxs0(Source.CACHE));
                asu0 asu0Var = asu0.a;
                E.q(asu0Var.c()).m(asu0Var.d()).subscribe(new kjs(m1kVar, 28));
                ViewGroup viewGroup2 = viewGroup;
                Context context2 = viewGroup2.getContext();
                kew kewVar = oewVar.a;
                EmptyList emptyList = EmptyList.b;
                oew.a aVar = oewVar.e;
                kkm kkmVar = oewVar.b;
                long j2 = j;
                boolean z2 = z;
                oewVar.d = new nts0(context2, kewVar, emptyList, aVar, j2, z2, kkmVar);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(2, i);
                viewGroup2.addView(oewVar.d, layoutParams);
                oewVar.h = z2;
                if (z2) {
                    nts0 nts0Var = oewVar.d;
                    if (nts0Var != null) {
                        nts0Var.d(false);
                    }
                } else {
                    nts0 nts0Var2 = oewVar.d;
                    if (nts0Var2 != null) {
                        nts0Var2.f();
                    }
                }
                return s3q0.a;
            }
        };
        Cnew cnew = new Cnew(this, 0);
        PermissionHelper permissionHelper = PermissionHelper.a;
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(context);
        permissionHelper.getClass();
        String[] strArr = PermissionHelper.j;
        if (!PermissionHelper.u(h, rl3.u0(strArr))) {
            permissionHelper.d(e3m.h(context), strArr, R.string.vk_permissions_camera_video_msg, R.string.vk_permissions_video_msg_camera_settings, gzsVar, new zkh(cnew, 24));
            return;
        }
        Activity h2 = e3m.h(context);
        h2.startActivityForResult(PermissionHelper.m(h2), 7534);
        cnew.invoke();
    }

    @Override // xsna.ets0
    public final void c() {
        this.k = false;
        this.a.e(false);
        if (this.j) {
            return;
        }
        f();
    }

    @Override // xsna.ets0
    public final void d(ets0.a aVar) {
        this.g = aVar;
    }

    @Override // xsna.ets0
    public final void e() {
        PrivateFiles.a b;
        if (!this.i) {
            this.k = true;
            return;
        }
        nts0 nts0Var = this.d;
        if (nts0Var != null) {
            float f = nts0.D;
            nts0Var.d(true);
        }
        b = e8r.a.b(r2, PrivateSubdir.IM.h(), true);
        File file = new File(b.a, "video_message_" + (System.currentTimeMillis() / 1000) + ".mp4");
        L.e("VideoMessageLog", z9r.a(file, "onStartRecordRequest file "));
        ung0 ung0Var = this.a.d.get();
        if (ung0Var != null) {
            ung0Var.u(file);
        }
    }

    public final boolean f() {
        if (!this.c) {
            return false;
        }
        this.c = false;
        kew kewVar = this.a;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ung0 ung0Var = kewVar.d.get();
        if (ung0Var != null) {
            qb6 qb6Var = new qb6(15, countDownLatch, kewVar);
            oo9 cameraPreview = ung0Var.getCameraPreview();
            tng0 tng0Var = new tng0(qb6Var);
            syf0 syf0Var = (syf0) ((mo9) cameraPreview).g.l.b;
            if (syf0Var != null) {
                syf0Var.sendMessage(syf0Var.obtainMessage(5, tng0Var));
            }
        }
        countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
        ets0.a aVar = this.g;
        if (aVar != null) {
            aVar.onClose();
        }
        nts0 nts0Var = this.d;
        ViewParent parent = nts0Var != null ? nts0Var.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.d);
        }
        this.d = null;
        return true;
    }

    @Override // xsna.ets0
    public final void onPause() {
        if (this.c) {
            this.a.e(true);
            f();
        }
    }
}
