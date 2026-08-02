package xsna;

import android.opengl.GLES20;
import com.vk.media.pipeline.custom.utils.GLException;
import java.util.List;

/* compiled from: LayersRenderer.kt */
/* loaded from: classes3.dex */
public final class nny {
    public final f100 a;
    public final List<uq10> b;
    public final boolean c;
    public final int[] d;
    public w1t e;
    public float[] f;

    /* JADX WARN: Multi-variable type inference failed */
    public nny(f100 f100Var, List<? extends uq10> list) {
        this.a = f100Var;
        this.b = list;
        this.c = !list.isEmpty();
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = -1;
        }
        this.d = iArr;
        this.f = new float[16];
    }

    public final void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String a = et.a(glGetError, ho8.b(str, ": glError 0x"));
            f100 f100Var = this.a;
            if (f100Var != null) {
                f100Var.c("LayersRenderer", new GLException(a));
            }
        }
    }

    public final void b(float[] fArr, boolean z) {
        List<uq10> list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int[] iArr = this.d;
            if (iArr[i] != -1 && list.get(i).c() == z) {
                a("before drawLayer, layer_idx=" + i);
                w1t w1tVar = this.e;
                if (w1tVar != null) {
                    w1tVar.d = this.f;
                    w1tVar.e = fArr;
                    w1tVar.c = iArr[i];
                    w1tVar.d();
                    a("after glProgram render");
                }
                a("after drawLayer, layer_idx=" + i);
            }
        }
    }
}
