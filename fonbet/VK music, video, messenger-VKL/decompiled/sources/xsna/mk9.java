package xsna;

import android.text.TextUtils;
import android.util.Log;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.gles.EglTexture;
import com.vk.media.render.RenderBase;
import com.vk.media.render.RenderTexture;
import com.vk.media.rotation.Rotation;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import ru.ok.gleffects.EffectRegistry;
import xsna.ci9;
import xsna.rl9;
import xsna.sk9;

/* compiled from: CameraProcessRender.kt */
/* loaded from: classes3.dex */
public final class mk9 extends sk9 {
    public ii9 n0;
    public MediaUtils.g o0;

    @Override // xsna.sk9
    public final void i(boolean z, boolean z2) {
        com.vk.media.ok.b bVar;
        File file;
        if (z2 || !this.j0) {
            o(this.h0);
            Objects.toString(j());
            ii9 ii9Var = this.n0;
            if (ii9Var != null && ii9Var.b) {
                if (!z) {
                    int i = ii9Var.c;
                    String str = ii9Var.d;
                    File n = TextUtils.isEmpty(str) ? null : f9t.n(str);
                    EffectRegistry.EffectId b = pw70.b(i);
                    com.vk.media.ok.b bVar2 = this.B;
                    if (bVar2 != null) {
                        bVar2.B(b, n);
                    } else {
                        this.b0 = new o9p(b, n);
                    }
                }
                this.j0 = true;
                return;
            }
            File m = f9t.m(ii9Var != null ? ii9Var.a : null);
            if (!m.exists()) {
                this.j0 = false;
                com.vk.media.ok.b bVar3 = this.B;
                if (bVar3 != null) {
                    bVar3.B(null, null);
                    return;
                }
                return;
            }
            File file2 = new File(m.getAbsolutePath());
            String path = file2.getPath();
            com.vk.media.ok.b bVar4 = this.B;
            boolean f = epx.f(path, (bVar4 == null || (file = bVar4.q0) == null) ? null : file.getPath());
            if (!f && (bVar = this.B) != null) {
                bVar.B(null, null);
            }
            if (z) {
                RenderBase.RenderingState renderingState = RenderBase.RenderingState.PAUSE;
                this.h = renderingState;
                d(new jx8(6, this, renderingState));
            }
            if (f) {
                return;
            }
            EffectRegistry.EffectId b2 = pw70.b(-16000);
            com.vk.media.ok.b bVar5 = this.B;
            if (bVar5 != null) {
                bVar5.B(b2, file2);
            } else {
                this.b0 = new o9p(b2, file2);
            }
        }
    }

    @Override // xsna.sk9
    public final MediaUtils.e j() {
        MediaUtils.e eVar;
        int i;
        int i2;
        MediaUtils.g gVar = this.o0;
        if (gVar != null) {
            sk9.a aVar = this.l0;
            MediaUtils.e f = aVar != null ? aVar.a.f() : null;
            sk9.a aVar2 = this.l0;
            MediaUtils.e f2 = aVar2 != null ? aVar2.b.f() : null;
            sk9.a aVar3 = this.l0;
            MediaUtils.e f3 = aVar3 != null ? aVar3.c.f() : null;
            sk9.a aVar4 = this.l0;
            Iterator it = e43.a(f, f2, f3, aVar4 != null ? aVar4.d.f() : null).iterator();
            while (it.hasNext()) {
                eVar = (MediaUtils.e) it.next();
                if (epx.f(eVar, gVar) || (eVar != null && (((i = eVar.b) == (i2 = gVar.b) && eVar.a == gVar.a) || (i == gVar.a && eVar.a == i2)))) {
                    gVar.toString();
                    Objects.toString(eVar);
                    break;
                }
            }
        }
        eVar = null;
        if (eVar != null) {
            return eVar;
        }
        sk9.a aVar5 = this.l0;
        MediaUtils.e f4 = aVar5 != null ? aVar5.b.f() : null;
        if (this.w) {
            sk9.a aVar6 = this.l0;
            f4 = aVar6 != null ? aVar6.a.f() : null;
        }
        if (!l()) {
            return f4;
        }
        sk9.a aVar7 = this.l0;
        if (aVar7 != null) {
            return aVar7.c.f();
        }
        return null;
    }

    @Override // xsna.sk9
    public final boolean l() {
        return !TextUtils.isEmpty(this.n0 != null ? r0.a : null);
    }

    public final void r() {
        Rotation rotation;
        com.vk.media.gles.a aVar;
        aj9 aj9Var = this.s;
        com.vk.media.gles.a aVar2 = null;
        if (aj9Var.g()) {
            int d = io9.d();
            rotation = d != 1 ? d != 2 ? d != 3 ? Rotation.ROTATION_0 : Rotation.ROTATION_270 : Rotation.ROTATION_180 : Rotation.ROTATION_90;
        } else {
            rotation = null;
        }
        RenderTexture renderTexture = this.b;
        try {
            aVar = new com.vk.media.gles.a(new EglTexture(EglTexture.ProgramType.TEXTURE_EXT));
            renderTexture.a(aVar.c.a());
        } catch (Throwable th) {
            Log.e("RenderUtils", "cant't init error=" + th, th);
            aVar = null;
        }
        if (aVar != null) {
            aVar.i(rotation);
            aVar2 = aVar;
        }
        this.z = aVar2;
        try {
            com.vk.media.gles.b bVar = new com.vk.media.gles.b(EglTexture.ProgramType.TEXTURE_2D_YUV);
            new MediaUtils.d();
            ci9.b bVar2 = new ci9.b(bVar);
            this.A = bVar2;
            bVar2.h = aj9Var.g();
        } catch (Throwable th2) {
            L.f("CameraRenderBase", "init error", th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r1 < (-5999)) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(jhu0 jhu0Var, ii9 ii9Var, rl9.c... cVarArr) {
        boolean z = true;
        boolean z2 = this.h0 != jhu0Var.a();
        int i = ii9Var != null ? ii9Var.c : 0;
        String str = ii9Var != null ? ii9Var.a : null;
        if (l()) {
            ii9 ii9Var2 = this.n0;
            if (TextUtils.equals(ii9Var2 != null ? ii9Var2.a : null, str)) {
                k9x k9xVar = qw70.a;
                if (-6999 <= i) {
                }
                if ((this.k0 || !z || z2) && this.b.c != null) {
                    Objects.toString(this.n0);
                    Objects.toString(jhu0Var.r());
                    Objects.toString(ii9Var);
                    this.n0 = ii9Var;
                    p(jhu0Var, (rl9.c[]) Arrays.copyOf(cVarArr, cVarArr.length));
                }
                return;
            }
        }
        z = false;
        if (this.k0) {
        }
        Objects.toString(this.n0);
        Objects.toString(jhu0Var.r());
        Objects.toString(ii9Var);
        this.n0 = ii9Var;
        p(jhu0Var, (rl9.c[]) Arrays.copyOf(cVarArr, cVarArr.length));
    }
}
