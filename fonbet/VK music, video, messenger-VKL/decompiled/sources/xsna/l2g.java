package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.gl.GlShaderId;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.moo0;
import xsna.s2k0;

/* compiled from: CollageTextureSource.kt */
/* loaded from: classes4.dex */
public final class l2g extends moo0 {
    public static final /* synthetic */ qcy<Object>[] x;
    public final ozf g;
    public dyf0 h;
    public final cyy i;
    public final cyy j;
    public final cyy k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public volatile List<m1t> o;
    public volatile List<m1t> p;
    public volatile Object q;
    public volatile Object r;
    public volatile float s;
    public volatile boolean t;
    public volatile float u;
    public volatile boolean v;
    public volatile boolean w;

    /* compiled from: CollageTextureSource.kt */
    public static final class a implements moo0.a {
        public final utk0 a;
        public final utk0 b;
        public final we0 c;
        public final gzs<p0u> d;
        public final utk0 e;
        public final ozf f;

        public a(utk0 utk0Var, utk0 utk0Var2, we0 we0Var, gzs gzsVar, utk0 utk0Var3, ozf ozfVar) {
            this.a = utk0Var;
            this.b = utk0Var2;
            this.c = we0Var;
            this.d = gzsVar;
            this.e = utk0Var3;
            this.f = ozfVar;
        }

        @Override // xsna.moo0.a
        public final moo0 a(Size size) {
            return new l2g(size, this.c, this.d, this.a, this.b, this.e, this.f);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(l2g.class, "slotFragmentShaderHandle", "getSlotFragmentShaderHandle()I", 0);
        hpf0 hpf0Var = fpf0.a;
        x = new qcy[]{propertyReference1Impl, fp.c(0, l2g.class, "slotSharpnessFragmentShaderHandle", "getSlotSharpnessFragmentShaderHandle()I", hpf0Var), ep.a(0, l2g.class, "bgShader", "getBgShader()Lcom/vk/photo/editor/features/collage/gl/shaders/SimpleShader;", hpf0Var)};
    }

    public l2g(Size size, we0 we0Var, gzs gzsVar, utk0 utk0Var, utk0 utk0Var2, utk0 utk0Var3, ozf ozfVar) {
        super(size, we0Var, gzsVar);
        this.g = ozfVar;
        this.h = up2.h(size);
        this.i = d(35632, GlShaderId.CollageSlot, new b40(27));
        this.j = d(35632, GlShaderId.CollageSlotSharpness, new b40(27));
        this.k = d(35632, GlShaderId.Main, new mre(this, 4));
        this.l = new float[16];
        this.m = new float[16];
        this.n = new float[16];
        EmptyList emptyList = EmptyList.b;
        this.o = emptyList;
        this.q = emptyList;
        this.r = emptyList;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(utk0Var, new i2g(this, null)), (yvj) we0Var.invoke());
        this.p = (List) utk0Var.getValue();
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(utk0Var2, new j2g(this, null)), (yvj) we0Var.invoke());
        ag5 ag5Var = (ag5) utk0Var2.getValue();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.s = (ag5Var != null ? ag5Var.a : 0.0f) / 100.0f;
        this.t = true;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(utk0Var3, new k2g(this, null)), (yvj) we0Var.invoke());
        n1t n1tVar = (n1t) utk0Var3.getValue();
        this.u = n1tVar != null ? n1tVar.f : f;
        this.v = true;
        f();
    }

    @Override // xsna.moo0
    public final void a() {
        super.a();
        up2.i(this.h);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    @Override // xsna.moo0
    public final boolean b(int i, boolean z) {
        ozf ozfVar;
        int i2 = 1;
        boolean z2 = z || this.t || this.v || this.w;
        List<m1t> list = this.p;
        if (list != null) {
            this.o = list;
            this.p = null;
            g();
            z2 = true;
        }
        if (z2) {
            GLES20.glBindFramebuffer(36160, this.h.a);
            GLES20.glViewport(0, 0, this.a.getWidth(), this.a.getHeight());
            int i3 = 16640;
            GLES20.glClear(16640);
            cyy cyyVar = this.k;
            qcy<Object>[] qcyVarArr = x;
            qcy<Object> qcyVar = qcyVarArr[2];
            ((ksj0) cyyVar.a()).a = i;
            cyy cyyVar2 = this.k;
            qcy<Object> qcyVar2 = qcyVarArr[2];
            ((ksj0) cyyVar2.a()).b(this.a);
            for (s2k0 s2k0Var : this.q) {
                s2k0Var.d = this.s;
                Size size = this.a;
                int i4 = s2k0Var.i;
                int i5 = s2k0Var.f;
                s2k0.c cVar = s2k0Var.a;
                GLES20.glUseProgram(s2k0Var.e);
                GLES20.glActiveTexture(33984);
                int i6 = s2k0Var.b;
                GLES20.glBindTexture(3553, i6);
                GLES20.glUniform1i(s2k0Var.h, 0);
                GLES20.glActiveTexture(33985);
                Integer num = s2k0Var.c;
                if (num != null) {
                    i6 = num.intValue();
                }
                GLES20.glBindTexture(3553, i6);
                GLES20.glUniform1i(s2k0Var.l, i2);
                GLES20.glUniformMatrix4fv(s2k0Var.g, i2, false, cVar.c, 0);
                float f = cVar.b.a;
                float width = size.getWidth();
                float f2 = width - ((width - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * (1.0f - f));
                float f3 = cVar.b.b;
                float height = size.getHeight();
                float f4 = height - ((height - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * (1.0f - f3));
                float f5 = cVar.b.c;
                int i7 = i3;
                float width2 = size.getWidth();
                float f6 = width2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f7 = cVar.b.d;
                float height2 = size.getHeight();
                float f8 = height2 - ((height2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * (1.0f - f7));
                GLES20.glUniform1f(s2k0Var.m, f2 - 0.25f);
                GLES20.glUniform1f(s2k0Var.n, f4 - 0.25f);
                GLES20.glUniform1f(s2k0Var.o, (width2 - (f6 * (1.0f - f5))) + 0.25f);
                GLES20.glUniform1f(s2k0Var.p, f8 + 0.25f);
                GLES20.glUniform1i(s2k0Var.j, num == null ? 0 : 1);
                GLES20.glUniform1f(s2k0Var.k, s2k0Var.d);
                GLES20.glVertexAttribPointer(s2k0Var.f, 3, 5126, false, s2k0Var.q, (Buffer) s2k0Var.r);
                GLES20.glVertexAttribPointer(s2k0Var.i, 3, 5126, false, s2k0Var.q, (Buffer) s2k0Var.s);
                GLES20.glEnableVertexAttribArray(i5);
                GLES20.glEnableVertexAttribArray(i4);
                GLES20.glDrawElements(4, 6, 5123, s2k0Var.t);
                GLES20.glDisableVertexAttribArray(i5);
                GLES20.glDisableVertexAttribArray(i4);
                i3 = i7;
                i2 = 1;
            }
            GLES20.glBindFramebuffer(36160, this.d.a);
            GLES20.glViewport(0, 0, this.a.getWidth(), this.a.getHeight());
            GLES20.glClear(i3);
            for (t2k0 t2k0Var : this.r) {
                t2k0Var.a = this.h.c;
                t2k0Var.n = this.u;
                t2k0Var.b(this.a);
            }
            if (!((Collection) this.q).isEmpty() && (ozfVar = this.g) != null) {
                ozfVar.invoke();
            }
        }
        this.t = false;
        this.v = false;
        this.w = false;
        return z2;
    }

    @Override // xsna.moo0
    public final void e(Size size) {
        super.e(size);
        up2.i(this.h);
        this.h = up2.h(size);
        this.w = true;
        f();
        g();
    }

    public final void f() {
        float width = this.a.getWidth() / this.a.getHeight();
        Matrix.orthoM(this.l, 0, -width, width, -1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5.0f);
        Matrix.setLookAtM(this.m, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix.multiplyMM(this.n, 0, this.l, 0, this.m, 0);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (m1t m1tVar : this.o) {
            f2t f2tVar = m1tVar.j;
            if (f2tVar != null) {
                s2k0.c a2 = s2k0.a.a(m1tVar, this.a, f2tVar, this.n);
                int c = c();
                cyy cyyVar = this.i;
                qcy<Object>[] qcyVarArr = x;
                qcy<Object> qcyVar = qcyVarArr[0];
                int intValue = ((Number) cyyVar.a()).intValue();
                int i = m1tVar.j.a;
                f2t f2tVar2 = m1tVar.k;
                arrayList.add(new s2k0(c, intValue, a2, i, f2tVar2 != null ? Integer.valueOf(f2tVar2.a) : null));
                int c2 = c();
                cyy cyyVar2 = this.j;
                qcy<Object> qcyVar2 = qcyVarArr[1];
                arrayList2.add(new t2k0(c2, ((Number) cyyVar2.a()).intValue(), a2.b));
            }
        }
        this.q = arrayList;
        this.r = arrayList2;
    }
}
