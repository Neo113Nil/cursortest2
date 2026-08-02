package xsna;

import android.opengl.GLES20;
import android.util.Size;
import com.vk.photo.editor.gl.GlShaderId;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.moo0;

/* compiled from: SolidColorTextureSource.kt */
/* loaded from: classes4.dex */
public final class uek0 extends moo0 {
    public static final /* synthetic */ qcy<Object>[] j;
    public final cyy g;
    public volatile int h;
    public volatile boolean i;

    /* compiled from: SolidColorTextureSource.kt */
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
            return new uek0(size, this.b, this.c, this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(uek0.class, "colorShader", "getColorShader()Lcom/vk/photo/editor/features/collage/gl/shaders/SolidColorShader;", 0);
        fpf0.a.getClass();
        j = new qcy[]{propertyReference1Impl};
    }

    public uek0(Size size, we0 we0Var, gzs gzsVar, utk0 utk0Var) {
        super(size, we0Var, gzsVar);
        this.g = d(35632, GlShaderId.SolidColor, new alj0(this, 3));
        this.h = -1;
        this.i = true;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(utk0Var, new tek0(this, null)), (yvj) we0Var.invoke());
        this.h = ((Number) utk0Var.getValue()).intValue();
        this.i = true;
    }

    @Override // xsna.moo0
    public final boolean b(int i, boolean z) {
        GLES20.glBindFramebuffer(36160, this.d.a);
        GLES20.glViewport(0, 0, this.a.getWidth(), this.a.getHeight());
        boolean z2 = z || this.i;
        if (z2) {
            GLES20.glClear(16640);
            cyy cyyVar = this.g;
            qcy<Object>[] qcyVarArr = j;
            qcy<Object> qcyVar = qcyVarArr[0];
            ((sek0) cyyVar.a()).m = this.h;
            cyy cyyVar2 = this.g;
            qcy<Object> qcyVar2 = qcyVarArr[0];
            ((sek0) cyyVar2.a()).b(this.a);
        }
        this.i = false;
        return z2;
    }
}
