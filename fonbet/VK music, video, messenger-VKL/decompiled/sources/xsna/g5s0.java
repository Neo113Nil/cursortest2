package xsna;

import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import kotlin.NoWhenBranchMatchedException;
import xsna.m5s0;

/* compiled from: VideoBaseImmediateFeature.kt */
/* loaded from: classes17.dex */
public final class g5s0 {
    public final i5s0 a;
    public final boolean b;
    public final okh0 c;
    public final m3i0 d;
    public final di5 e;
    public final jnp0 f;
    public final izs<Boolean, s3q0> g;

    /* JADX WARN: Multi-variable type inference failed */
    public g5s0(i5s0 i5s0Var, boolean z, okh0 okh0Var, m3i0 m3i0Var, di5 di5Var, jnp0 jnp0Var, izs<? super Boolean, s3q0> izsVar) {
        this.a = i5s0Var;
        this.b = z;
        this.c = okh0Var;
        this.d = m3i0Var;
        this.e = di5Var;
        this.f = jnp0Var;
        this.g = izsVar;
    }

    public final void a(SdkClipVideoFile sdkClipVideoFile, kih0 kih0Var, j4b0 j4b0Var, e3i0 e3i0Var) {
        m5s0 m5s0Var = this.a.b;
        if (e3i0Var != null) {
            this.d.b(e3i0Var);
        }
        if (m5s0Var instanceof m5s0.b) {
            c(sdkClipVideoFile, kih0Var, j4b0Var);
        } else {
            if (!(m5s0Var instanceof m5s0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (epx.f(((m5s0.a) m5s0Var).a.a, sdkClipVideoFile.r1())) {
                return;
            }
            c(sdkClipVideoFile, kih0Var, j4b0Var);
        }
    }

    public final void b(boolean z) {
        m5s0 m5s0Var = this.a.b;
        if (m5s0Var instanceof m5s0.a) {
            if (z) {
                ((VideoTextureViewAdapter) this.e.a).b(((m5s0.a) m5s0Var).b);
            }
            this.g.invoke(Boolean.valueOf(z));
        }
    }

    public final void c(SdkClipVideoFile sdkClipVideoFile, kih0 kih0Var, j4b0 j4b0Var) {
        if (kih0Var.a() && this.b) {
            kih0Var.y();
        }
        String r1 = sdkClipVideoFile.r1();
        rlh0 rlh0Var = new rlh0(sdkClipVideoFile.getWidth(), sdkClipVideoFile.getHeight());
        SdkVideoRestriction O = sdkClipVideoFile.O();
        boolean z = false;
        if (O != null && O.f) {
            z = true;
        }
        this.a.b(new m5s0.a(new f5s0(r1, rlh0Var, z, sdkClipVideoFile.I7()), kih0Var, j4b0Var, rlh0Var, false, this.f.b(kih0Var), false));
    }

    public final void d() {
        this.f.a(this);
        m5s0 m5s0Var = this.a.b;
        if (m5s0Var instanceof m5s0.a) {
            kih0 kih0Var = ((m5s0.a) m5s0Var).b;
            if (kih0Var.isPlaying()) {
                ((VideoTextureViewAdapter) this.e.a).b(kih0Var);
            }
        }
    }

    public final void e(boolean z) {
        i5s0 i5s0Var = this.a;
        m5s0 m5s0Var = i5s0Var.b;
        if (m5s0Var instanceof m5s0.a) {
            m3i0 m3i0Var = this.d;
            if (z) {
                m3i0Var.d();
            } else {
                ((lh5) this.e.b).a(((m5s0.a) m5s0Var).b);
                m3i0Var.a();
            }
            m5s0 m5s0Var2 = i5s0Var.b;
            if (m5s0Var2 instanceof m5s0.a) {
                i5s0Var.b(m5s0.a.a((m5s0.a) m5s0Var2, null, null, z, false, false, 111));
            }
        }
    }

    public final void f(j4b0 j4b0Var) {
        i5s0 i5s0Var = this.a;
        m5s0 m5s0Var = i5s0Var.b;
        if (m5s0Var instanceof m5s0.a) {
            boolean n = ((m5s0.a) m5s0Var).b.n(((VideoTextureViewAdapter) this.e.a).getView());
            if (n) {
                this.c.g();
            }
            m5s0 m5s0Var2 = i5s0Var.b;
            if (m5s0Var2 instanceof m5s0.a) {
                m5s0.a aVar = (m5s0.a) m5s0Var2;
                i5s0Var.b(m5s0.a.a(aVar, j4b0Var, null, false, false, aVar.g || n, 59));
            }
        }
    }

    public final void g() {
        i5s0 i5s0Var = this.a;
        m5s0 m5s0Var = i5s0Var.b;
        if ((m5s0Var instanceof m5s0.a) && m5s0Var != null) {
            i5s0Var.b(m5s0.a.a((m5s0.a) m5s0Var, null, null, false, false, false, 63));
        }
    }
}
