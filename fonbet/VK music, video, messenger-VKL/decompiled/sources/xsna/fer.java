package xsna;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Size;
import com.vk.photo.editor.gl.GlShaderId;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.moo0;

/* compiled from: FilterTextureSource.kt */
/* loaded from: classes4.dex */
public final class fer extends moo0 {
    public static final /* synthetic */ qcy<Object>[] m;
    public volatile edr g;
    public volatile edr h;
    public final cyy i;
    public f2t j;
    public float k;
    public String l;

    /* compiled from: FilterTextureSource.kt */
    public static final class a implements moo0.a {
        public final utk0 a;
        public final we0 b;
        public final gzs<p0u> c;

        public a(we0 we0Var, gzs gzsVar, utk0 utk0Var) {
            this.a = utk0Var;
            this.b = we0Var;
            this.c = gzsVar;
        }

        @Override // xsna.moo0.a
        public final moo0 a(Size size) {
            return new fer(size, this.b, this.c, this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(fer.class, "filterShader", "getFilterShader()Lcom/vk/photo/editor/features/collage/gl/shaders/FilterShader;", 0);
        fpf0.a.getClass();
        m = new qcy[]{propertyReference1Impl};
    }

    public fer(Size size, we0 we0Var, gzs gzsVar, utk0 utk0Var) {
        super(size, we0Var, gzsVar);
        this.i = d(35632, GlShaderId.Filter, new bhh(this, 17));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(utk0Var, new eer(this, null)), (yvj) we0Var.invoke());
        this.h = (edr) utk0Var.getValue();
    }

    @Override // xsna.moo0
    public final boolean b(int i, boolean z) {
        Bitmap bitmap;
        List<ota0> list;
        GLES20.glBindFramebuffer(36160, this.d.a);
        GLES20.glViewport(0, 0, this.a.getWidth(), this.a.getHeight());
        edr edrVar = this.h;
        if (edrVar != null) {
            this.g = edrVar;
            this.h = null;
            edr edrVar2 = this.g;
            if (edrVar2 != null) {
                aa00 aa00Var = edrVar2.a;
                String str = aa00Var != null ? aa00Var.a : null;
                if (!epx.f(this.l, str) || this.j == null) {
                    aa00 aa00Var2 = edrVar2.a;
                    ota0 ota0Var = (aa00Var2 == null || (list = aa00Var2.c) == null) ? null : (ota0) j5g.Y(list);
                    ld7 ld7Var = ota0Var instanceof ld7 ? (ld7) ota0Var : null;
                    if (ld7Var != null && (bitmap = ld7Var.a) != null) {
                        this.j = up2.b(bitmap);
                    }
                }
                this.k = edrVar2.b / 100.0f;
                this.l = str;
            }
            z = true;
        }
        if (z) {
            f().a = i;
            vdr f = f();
            f2t f2tVar = this.j;
            f.m = f2tVar != null ? Integer.valueOf(f2tVar.a) : null;
            f().n = this.k;
            f().b(this.a);
        }
        return z;
    }

    public final vdr f() {
        qcy<Object> qcyVar = m[0];
        return (vdr) this.i.a();
    }
}
