package xsna;

import android.opengl.GLES20;
import android.util.Size;
import com.vk.photo.editor.gl.GlShaderId;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.moo0;

/* compiled from: CgTextureSource.kt */
/* loaded from: classes4.dex */
public final class qqa extends moo0 {
    public static final /* synthetic */ qcy<Object>[] m = {new PropertyReference1Impl(qqa.class, "grainShader", "getGrainShader()Lcom/vk/photo/editor/features/collage/gl/shaders/SimpleShader;", 0), fp.c(0, qqa.class, "cgShader", "getCgShader()Lcom/vk/photo/editor/features/collage/gl/shaders/CgShader;", fpf0.a)};
    public dyf0 g;
    public final cyy h;
    public final cyy i;
    public boolean j;
    public volatile n1t k;
    public volatile boolean l;

    /* compiled from: CgTextureSource.kt */
    public static final class a implements moo0.a {
        public final we0 a;
        public final gzs<p0u> b;
        public final utk0 c;

        public a(we0 we0Var, gzs gzsVar, utk0 utk0Var) {
            this.a = we0Var;
            this.b = gzsVar;
            this.c = utk0Var;
        }

        @Override // xsna.moo0.a
        public final moo0 a(Size size) {
            return new qqa(size, this.a, this.b, this.c);
        }
    }

    public qqa(Size size, we0 we0Var, gzs gzsVar, utk0 utk0Var) {
        super(size, we0Var, gzsVar);
        this.h = d(35632, GlShaderId.Grain, new on(this, 11));
        this.i = d(35632, GlShaderId.ColorGrading, new k00(this, 15));
        this.j = true;
        bpn0 bpn0Var = n1t.m;
        this.k = (n1t) bpn0Var.getValue();
        this.l = true;
        this.g = up2.h(size);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(utk0Var, new pqa(this, null)), (yvj) we0Var.invoke());
        n1t n1tVar = (n1t) utk0Var.getValue();
        this.k = n1tVar == null ? (n1t) bpn0Var.getValue() : n1tVar;
        this.l = true;
    }

    @Override // xsna.moo0
    public final void a() {
        super.a();
        up2.i(this.g);
    }

    @Override // xsna.moo0
    public final boolean b(int i, boolean z) {
        boolean z2 = true;
        boolean z3 = z || this.l;
        if (this.j) {
            GLES20.glBindFramebuffer(36160, this.g.a);
            GLES20.glViewport(0, 0, this.a.getWidth(), this.a.getHeight());
            cyy cyyVar = this.h;
            qcy<Object> qcyVar = m[0];
            ((ksj0) cyyVar.a()).b(this.a);
            this.j = false;
        } else {
            z2 = z3;
        }
        if (z2) {
            GLES20.glBindFramebuffer(36160, this.d.a);
            GLES20.glViewport(0, 0, this.a.getWidth(), this.a.getHeight());
            f().a = i;
            f().n = this.k;
            f().m = this.g.c;
            f().b(this.a);
        }
        this.l = false;
        return z2;
    }

    @Override // xsna.moo0
    public final void e(Size size) {
        super.e(size);
        up2.i(this.g);
        this.g = up2.h(size);
        this.j = true;
    }

    public final oqa f() {
        qcy<Object> qcyVar = m[1];
        return (oqa) this.i.a();
    }
}
