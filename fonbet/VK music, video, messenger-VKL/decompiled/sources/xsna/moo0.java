package xsna;

import android.util.Size;
import com.vk.photo.editor.gl.GlShaderId;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: TextureSource.kt */
/* loaded from: classes4.dex */
public abstract class moo0 {
    public static final /* synthetic */ qcy<Object>[] f;
    public Size a;
    public final we0 b;
    public final gzs<p0u> c;
    public dyf0 d;
    public final cyy e = d(35633, GlShaderId.Vertext, new b40(27));

    /* compiled from: TextureSource.kt */
    public interface a {
        moo0 a(Size size);
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(moo0.class, "baseVertexShaderHandle", "getBaseVertexShaderHandle()I", 0);
        fpf0.a.getClass();
        f = new qcy[]{propertyReference1Impl};
    }

    public moo0(Size size, we0 we0Var, gzs gzsVar) {
        this.a = size;
        this.b = we0Var;
        this.c = gzsVar;
        this.d = up2.h(size);
    }

    public void a() {
        up2.i(this.d);
    }

    public abstract boolean b(int i, boolean z);

    public final int c() {
        qcy<Object> qcyVar = f[0];
        return ((Number) this.e.a()).intValue();
    }

    public final <T> cyy<T> d(int i, GlShaderId glShaderId, izs<? super Integer, ? extends T> izsVar) {
        cyy<T> cyyVar = new cyy<>(i, glShaderId, izsVar, this.c, this.b);
        cyyVar.b();
        return cyyVar;
    }

    public void e(Size size) {
        this.a = size;
        up2.i(this.d);
        this.d = up2.h(size);
    }
}
