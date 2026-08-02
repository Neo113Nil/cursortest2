package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;

/* compiled from: SeekBarDelegate.kt */
/* loaded from: classes17.dex */
public final class i3i0 implements c3f, m3i0 {
    public final gzs<ClipSeekBarController> a;
    public final izs<Boolean, s3q0> b;
    public final a c = new a();
    public e3i0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;

    /* compiled from: SeekBarDelegate.kt */
    public final class a implements ClipSeekBarController.a {
        public a() {
        }

        @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController.a
        public final void a(float f, boolean z) {
            if (z) {
                int i = (int) (f / 1000);
                i3i0 i3i0Var = i3i0.this;
                if (i3i0Var.i != i) {
                    i3i0Var.i = i;
                }
            }
        }

        @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController.a
        public final void b(float f) {
            i3i0 i3i0Var = i3i0.this;
            i3i0Var.f = false;
            i3i0Var.b.invoke(Boolean.FALSE);
            long j = (long) (f * 1000);
            e3i0 e3i0Var = i3i0Var.d;
            kih0 kih0Var = e3i0Var != null ? e3i0Var.b : null;
            if (kih0Var != null) {
                kih0Var.K();
                kih0Var.seek(j);
                int i = i3i0Var.j;
                if (i >= 0) {
                    kih0Var.l(i, (int) j);
                }
            }
            i3i0Var.j = -1;
        }

        @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController.a
        public final void c() {
            i3i0 i3i0Var = i3i0.this;
            i3i0Var.f = true;
            i3i0Var.b.invoke(Boolean.TRUE);
            i3i0Var.j = i3i0Var.i;
            e3i0 e3i0Var = i3i0Var.d;
            kih0 kih0Var = e3i0Var != null ? e3i0Var.b : null;
            if (kih0Var != null) {
                kih0Var.F();
            }
        }

        public final void d(long j, long j2) {
            ClipSeekBarController f;
            i3i0 i3i0Var = i3i0.this;
            if (i3i0Var.f) {
                return;
            }
            long j3 = 1000;
            int i = (int) (j2 / j3);
            int i2 = (int) (j / j3);
            ClipSeekBarController f2 = i3i0Var.f();
            if (f2 != null) {
                f2.l(i);
            }
            ClipSeekBarController f3 = i3i0Var.f();
            if (f3 != null) {
                f3.e(j / 1000.0f);
            }
            if (i3i0Var.h != i && (f = i3i0Var.f()) != null) {
                f.l(i);
            }
            if (i3i0Var.h != i) {
                i3i0Var.h = i;
            }
            if (i3i0Var.i != i2) {
                i3i0Var.i = i2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i3i0(gzs<? extends ClipSeekBarController> gzsVar, izs<? super Boolean, s3q0> izsVar) {
        this.a = gzsVar;
        this.b = izsVar;
    }

    @Override // xsna.m3i0
    public final void a() {
        ClipSeekBarController f;
        if (this.f && (f = f()) != null) {
            f.m();
        }
        ClipSeekBarController f2 = f();
        if (f2 != null) {
            f2.h(this.c);
        }
        h(false);
        if (this.e) {
            this.e = false;
            c(this.g);
        }
    }

    @Override // xsna.m3i0
    public final void b(e3i0 e3i0Var) {
        this.d = e3i0Var;
    }

    @Override // xsna.c3f
    public final boolean c(boolean z) {
        boolean z2 = false;
        if (!e()) {
            return false;
        }
        if (z) {
            e3i0 e3i0Var = this.d;
            kih0 kih0Var = e3i0Var != null ? e3i0Var.b : null;
            if (kih0Var == null || !kih0Var.B()) {
                z2 = true;
            }
        }
        if (!this.e) {
            this.g = z2;
            return true;
        }
        ClipSeekBarController f = f();
        if (f != null) {
            f.a(z2);
        }
        return true;
    }

    @Override // xsna.m3i0
    public final void d() {
        e3i0 e3i0Var = this.d;
        if (e3i0Var == null) {
            return;
        }
        g(0L, false);
        boolean e = e();
        ClipSeekBarController f = f();
        if (f != null) {
            ClipSeekBarController.SeekBarVisibilityPermission seekBarVisibilityPermission = ClipSeekBarController.SeekBarVisibilityPermission.ALLOWED_TOGGLE;
            if (!e) {
                seekBarVisibilityPermission = null;
            }
            if (seekBarVisibilityPermission == null) {
                seekBarVisibilityPermission = ClipSeekBarController.SeekBarVisibilityPermission.DISABLED_TOGGLE;
            }
            f.c(seekBarVisibilityPermission);
        }
        if (e) {
            float position = r1.getPosition() / 1000.0f;
            int duration = (int) (e3i0Var.b.getDuration() / 1000);
            if (!this.e) {
                this.e = true;
                c(this.g);
            }
            SdkVideoFile sdkVideoFile = e3i0Var.a;
            e3i0 e3i0Var2 = this.d;
            if (e3i0Var2 == null || !e3i0Var2.c) {
                ClipSeekBarController f2 = f();
                if (f2 != null) {
                    f2.b();
                }
            } else {
                ClipSeekBarController f3 = f();
                if (f3 != null) {
                    f3.i();
                }
            }
            ClipSeekBarController f4 = f();
            if (f4 != null) {
                f4.g(this.c);
            }
            ClipSeekBarController f5 = f();
            if (f5 != null) {
                f5.k(sdkVideoFile != null ? sdkVideoFile.B0() : null);
            }
            ClipSeekBarController f6 = f();
            if (f6 != null) {
                f6.l(duration);
            }
            ClipSeekBarController f7 = f();
            if (f7 != null) {
                f7.e(position);
            }
            h(true);
        }
    }

    public final boolean e() {
        SdkVideoFile sdkVideoFile;
        e3i0 e3i0Var = this.d;
        return (e3i0Var == null || (sdkVideoFile = e3i0Var.a) == null || sdkVideoFile.getDuration() <= 10 || dgd.f(sdkVideoFile)) ? false : true;
    }

    public final ClipSeekBarController f() {
        return this.a.invoke();
    }

    public final void g(long j, boolean z) {
        ClipSeekBarView view;
        ClipSeekBarController f = f();
        if (f == null || (view = f.getView()) == null) {
            return;
        }
        if (j == 0) {
            awt0.v(view, z);
            s3q0 s3q0Var = s3q0.a;
        } else if (z) {
            d3m.c(view, (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(view, (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }

    public final void h(boolean z) {
        if (this.e) {
            if (!z || e()) {
                e3i0 e3i0Var = this.d;
                kih0 kih0Var = e3i0Var != null ? e3i0Var.b : null;
                g(300L, (kih0Var == null || !kih0Var.B()) && z);
            }
        }
    }
}
