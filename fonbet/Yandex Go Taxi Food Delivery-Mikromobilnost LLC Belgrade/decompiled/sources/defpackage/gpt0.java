package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLException;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Mesh$PrimitiveMode;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$Target;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$WrapMode;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class gpt0 implements Closeable {
    public static final String[] A;
    public static final int[] B;
    public static final FloatBuffer z;
    public final int a;
    public final uxj b;
    public final uxj c;
    public final ept0 w;
    public final yfr0[] x;
    public final int[][] y;

    static {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        z = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        A = new String[]{"PX_LOCATION", "NX_LOCATION", "PY_LOCATION", "NY_LOCATION", "PZ_LOCATION", "NZ_LOCATION"};
        B = new int[]{36064, 36065, 36066, 36067, 36068, 36069};
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0413, code lost:
    
        r2[r4] = r7;
        r4 = r4 + 1;
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gpt0(wyl0 wyl0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 8; i4 != 0; i4 >>= 1) {
            i3++;
        }
        boolean z2 = true;
        this.a = i3 + 1;
        Texture$Target texture$Target = Texture$Target.TEXTURE_CUBE_MAP;
        Texture$WrapMode texture$WrapMode = Texture$WrapMode.CLAMP_TO_EDGE;
        this.b = new uxj(texture$Target, texture$WrapMode, true);
        this.c = new uxj(texture$Target, texture$WrapMode, true);
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36063, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(glGetError));
            while (true) {
                int glGetError2 = GLES20.glGetError();
                if (glGetError2 == 0) {
                    break;
                }
                arrayList.add(Integer.valueOf(glGetError2));
                i2 = i2;
            }
        }
        if (arrayList != null && (num3 = (Integer) arrayList.get(i2)) != null) {
            throw new GLException(num3.intValue(), pva1.f("Failed to get max color attachments", "glGetIntegerv", arrayList));
        }
        ept0 ept0Var = new ept0(iArr[i2]);
        this.w = ept0Var;
        int i5 = this.a;
        int i6 = i5 - 1;
        fpt0[][] fpt0VarArr = new fpt0[i6][];
        int i7 = i2;
        while (true) {
            int i8 = 2;
            int i9 = 32;
            if (i7 >= i6) {
                break;
            }
            int i10 = i7 + 1;
            float f = i6;
            float f2 = i10 / f;
            float f3 = f2 * f2;
            int i11 = 16 >> i10;
            fpt0[][] fpt0VarArr2 = fpt0VarArr;
            float log = (float) (Math.log(12.566371f / ((i11 * 6) * i11)) / Math.log(4.0d));
            ArrayList arrayList4 = new ArrayList(32);
            boolean z3 = z2;
            float f4 = 0.0f;
            int i12 = i2;
            while (i12 < i9) {
                int i13 = i7;
                long j = i12;
                long j2 = (j << 16) | (j >>> 16);
                long j3 = ((j2 & 1431655765) << (z3 ? 1L : 0L)) | ((j2 & 2863311530L) >>> (z3 ? 1L : 0L));
                long j4 = ((j3 & 858993459) << i8) | ((j3 & 3435973836L) >>> i8);
                long j5 = ((j4 & 252645135) << 4) | ((j4 & 4042322160L) >>> 4);
                int i14 = i9;
                float[] fArr = new float[i8];
                fArr[i2] = i12 * 0.03125f;
                fArr[z3 ? 1 : 0] = (((j5 & 16711935) << 8) | ((j5 & 4278255360L) >>> 8)) * 2.3283064E-10f;
                float f5 = fArr[i2] * 6.2831855f;
                float f6 = fArr[z3 ? 1 : 0];
                float f7 = f3 + 1.0f;
                float f8 = f3 - 1.0f;
                int i15 = i8;
                float sqrt = (float) Math.sqrt((1.0f - f6) / (((f6 * f8) * f7) + 1.0f));
                int i16 = i2;
                float sqrt2 = (float) Math.sqrt(1.0f - r8);
                double d = f5;
                float f9 = log;
                float cos = ((float) Math.cos(d)) * sqrt2;
                float sin = sqrt2 * ((float) Math.sin(d));
                float[] fArr2 = new float[3];
                fArr2[i16] = cos;
                fArr2[z3 ? 1 : 0] = sin;
                fArr2[i15] = sqrt;
                float f10 = fArr2[i15];
                float f11 = f10 * f10;
                float f12 = (f11 * 2.0f) - 1.0f;
                if (f12 > 0.0f) {
                    fpt0 fpt0Var = new fpt0();
                    float f13 = f10 * 2.0f;
                    fpt0Var.a = scc.g(Float.valueOf(fArr2[i16] * f13), Float.valueOf(f13 * fArr2[z3 ? 1 : 0]), Float.valueOf(f12));
                    float f14 = (f11 * f7 * f8) + 1.0f;
                    i = i12;
                    fpt0Var.c = (float) Math.min(Math.max((((float) (Math.log(1.0f / ((((f3 * f3) / ((3.1415927f * f14) * f14)) / 4.0f) * 32.0f)) / Math.log(4.0d))) - f9) + 1.0f, 0.0d), f);
                    fpt0Var.b = f12;
                    arrayList4.add(fpt0Var);
                    f4 += f12;
                } else {
                    i = i12;
                }
                i12 = i + 1;
                log = f9;
                i7 = i13;
                i9 = i14;
                i8 = i15;
                i2 = i16;
            }
            int i17 = i2;
            int i18 = i7;
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                ((fpt0) it.next()).b /= f4;
            }
            fpt0[] fpt0VarArr3 = new fpt0[arrayList4.size()];
            fpt0VarArr2[i18] = fpt0VarArr3;
            i7 = i10;
            fpt0VarArr = fpt0VarArr2;
            z2 = z3 ? 1 : 0;
            i2 = i17;
        }
        int i19 = i2;
        fpt0[][] fpt0VarArr4 = fpt0VarArr;
        HashMap hashMap = new HashMap();
        hashMap.put("NUMBER_OF_IMPORTANCE_SAMPLES", String.valueOf(32));
        hashMap.put("NUMBER_OF_MIPMAP_LEVELS", String.valueOf(i5));
        int i20 = ept0Var.b;
        yfr0[] yfr0VarArr = new yfr0[i20];
        for (int i21 = i19; i21 < i20; i21++) {
            yfr0VarArr[i21] = null;
        }
        int i22 = ept0Var.a;
        kb kbVar = new kb(i19, i22);
        while (true) {
            int i23 = kbVar.a;
            if (i23 >= i20) {
                break;
            }
            kb kbVar2 = new kb(i23 + 1, i22);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(hashMap);
            int i24 = kbVar.b;
            for (int i25 = 0; i25 < i24; i25++) {
                String str = A[kbVar.c + i25];
                if (str != null) {
                }
            }
            yfr0 D = r100.D(wyl0Var, "shaders/cubemap_filter.vert", "shaders/cubemap_filter.frag", linkedHashMap);
            D.k("u_Cubemap", this.b);
            D.y = false;
            D.z = false;
            yfr0VarArr[i23] = D;
            kbVar = kbVar2;
        }
        for (int i26 = 0; i26 < i20; i26++) {
            yfr0 yfr0Var = yfr0VarArr[i26];
            for (int i27 = 0; i27 < i6; i27++) {
                fpt0[] fpt0VarArr5 = fpt0VarArr4[i27];
                if (fpt0VarArr5 == null) {
                    break;
                }
                String j6 = oyr.j(i27, "u_ImportanceSampleCaches[", "]");
                if (yfr0Var != null) {
                    yfr0Var.b.put(Integer.valueOf(yfr0Var.a(j6.concat(".number_of_entries"))), new vfr0(5, new int[]{fpt0VarArr5.length}));
                    int length = fpt0VarArr5.length;
                    for (int i28 = 0; i28 < length; i28++) {
                        fpt0 fpt0Var2 = fpt0VarArr5[i28];
                        if (fpt0Var2 == null) {
                            break;
                        }
                        String str2 = j6 + ".entries[" + i28 + "]";
                        yfr0Var.n(str2.concat(".direction"), a.G0(fpt0Var2.a));
                        yfr0Var.c(fpt0Var2.b, str2.concat(".contribution"));
                        yfr0Var.c(fpt0Var2.c, str2.concat(".level"));
                    }
                }
            }
        }
        this.x = (yfr0[]) j73.A(yfr0VarArr).toArray(new yfr0[0]);
        ArrayList arrayList5 = null;
        new zr10(Mesh$PrimitiveMode.TRIANGLE_STRIP, null, new r2x0[]{new r2x0(2, z)});
        ept0 ept0Var2 = this.w;
        int i29 = this.a;
        int[][] iArr2 = new int[i29][];
        int i30 = 0;
        while (i30 < i29) {
            int i31 = ept0Var2.b;
            int i32 = ept0Var2.a;
            int[] iArr3 = new int[i31];
            GLES20.glGenFramebuffers(i31, iArr3, 0);
            int glGetError3 = GLES20.glGetError();
            if (glGetError3 == 0) {
                arrayList2 = arrayList5;
            } else {
                arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(glGetError3));
                while (true) {
                    int glGetError4 = GLES20.glGetError();
                    if (glGetError4 == 0) {
                        break;
                    } else {
                        arrayList2.add(Integer.valueOf(glGetError4));
                    }
                }
            }
            if (arrayList2 != null && (num2 = (Integer) arrayList2.get(0)) != null) {
                throw new GLException(num2.intValue(), pva1.f("Could not create cubemap framebuffers", "glGenFramebuffers", arrayList2));
            }
            kb kbVar3 = new kb(0, i32);
            while (true) {
                int i33 = kbVar3.b;
                int i34 = kbVar3.a;
                if (i34 < ept0Var2.b) {
                    kb kbVar4 = new kb(i34 + 1, i32);
                    GLES20.glBindFramebuffer(36160, iArr3[i34]);
                    pva1.i("Could not bind framebuffer", "glBindFramebuffer");
                    GLES30.glDrawBuffers(i33, B, 0);
                    pva1.i("Could not bind draw buffers", "glDrawBuffers");
                    for (int i35 = 0; i35 < i33; i35++) {
                        GLES20.glFramebufferTexture2D(36160, 36064 + i35, kbVar3.c + 34069 + i35, ((int[]) this.c.c)[0], i30);
                        int glGetError5 = GLES20.glGetError();
                        if (glGetError5 == 0) {
                            arrayList3 = null;
                        } else {
                            arrayList3 = new ArrayList();
                            arrayList3.add(Integer.valueOf(glGetError5));
                            while (true) {
                                int glGetError6 = GLES20.glGetError();
                                if (glGetError6 == 0) {
                                    break;
                                } else {
                                    arrayList3.add(Integer.valueOf(glGetError6));
                                }
                            }
                        }
                        if (arrayList3 != null && (num = (Integer) arrayList3.get(0)) != null) {
                            throw new GLException(num.intValue(), pva1.f("Could not attach LD cubemap mipmap to framebuffer", "glFramebufferTexture", arrayList3));
                        }
                    }
                    kbVar3 = kbVar4;
                }
            }
        }
        this.y = (int[][]) j73.A(iArr2).toArray(new int[0][]);
        try {
            a();
        } catch (Throwable th) {
            close();
            throw th;
        }
    }

    public final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer num;
        Integer num2;
        GLES20.glBindTexture(34067, ((int[]) this.c.c)[0]);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(glGetError));
            while (true) {
                int glGetError2 = GLES20.glGetError();
                if (glGetError2 == 0) {
                    break;
                } else {
                    arrayList.add(Integer.valueOf(glGetError2));
                }
            }
        }
        if (arrayList != null && (num2 = (Integer) arrayList.get(0)) != null) {
            throw new GLException(num2.intValue(), pva1.f("Could not bind LD cubemap texture", "glBindTexture", arrayList));
        }
        for (int i = 0; i < this.a; i++) {
            int i2 = 16 >> i;
            for (int i3 = 0; i3 < 6; i3++) {
                GLES20.glTexImage2D(34069 + i3, i, 34843, i2, i2, 0, 6407, 5131, null);
                int glGetError3 = GLES20.glGetError();
                if (glGetError3 == 0) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(glGetError3));
                    while (true) {
                        int glGetError4 = GLES20.glGetError();
                        if (glGetError4 == 0) {
                            break;
                        } else {
                            arrayList2.add(Integer.valueOf(glGetError4));
                        }
                    }
                }
                if (arrayList2 != null && (num = (Integer) arrayList2.get(0)) != null) {
                    throw new GLException(num.intValue(), pva1.f("Could not initialize LD cubemap mipmap", "glTexImage2D", arrayList2));
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (int[] iArr : this.y) {
            GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
            pva1.h("gpt0", "Failed to free framebuffers", "glDeleteFramebuffers");
        }
        this.b.close();
        this.c.close();
        for (yfr0 yfr0Var : this.x) {
            yfr0Var.close();
        }
    }
}
