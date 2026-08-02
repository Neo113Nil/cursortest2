package defpackage;

import com.yandex.smartcamera.arscene.ar_core.samplerender.Mesh$PrimitiveMode;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Shader$BlendFactor;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$ColorFormat;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$WrapMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class nhc0 {
    public static final float n = (float) (1.0d / Math.sqrt(3.0d));
    public static final float[] o = {0.2f, 0.4f, 2.0f, 1.5f};
    public final zr10 a;
    public final ern b;
    public final r2x0 c;
    public final yfr0 d;
    public FloatBuffer e = ByteBuffer.allocateDirect(HProv.ALG_TYPE_BLOCK).order(ByteOrder.nativeOrder()).asFloatBuffer();
    public IntBuffer f = ByteBuffer.allocateDirect(2304).order(ByteOrder.nativeOrder()).asIntBuffer();
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public final float[] i = new float[16];
    public final float[] j = new float[16];
    public final float[] k = new float[4];
    public final float[] l = new float[3];
    public final HashMap m = new HashMap();

    public nhc0(wyl0 wyl0Var) {
        uxj c = cob1.c(wyl0Var, "models/trigrid.png", Texture$WrapMode.REPEAT, Texture$ColorFormat.LINEAR);
        yfr0 D = r100.D(wyl0Var, "shaders/plane.vert", "shaders/plane.frag", null);
        D.k("u_Texture", c);
        D.o("u_GridControl", o);
        Shader$BlendFactor shader$BlendFactor = Shader$BlendFactor.DST_ALPHA;
        Shader$BlendFactor shader$BlendFactor2 = Shader$BlendFactor.ONE;
        Shader$BlendFactor shader$BlendFactor3 = Shader$BlendFactor.ZERO;
        Shader$BlendFactor shader$BlendFactor4 = Shader$BlendFactor.ONE_MINUS_SRC_ALPHA;
        D.B = shader$BlendFactor;
        D.C = shader$BlendFactor2;
        D.D = shader$BlendFactor3;
        D.E = shader$BlendFactor4;
        D.z = false;
        this.d = D;
        ern ernVar = new ern((IntBuffer) null);
        this.b = ernVar;
        r2x0 r2x0Var = new r2x0(3, null);
        this.c = r2x0Var;
        this.a = new zr10(Mesh$PrimitiveMode.TRIANGLE_STRIP, ernVar, new r2x0[]{r2x0Var});
    }
}
