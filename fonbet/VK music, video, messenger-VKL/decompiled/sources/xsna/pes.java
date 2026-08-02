package xsna;

import com.vk.log.L;
import com.vk.media.MediaUtils;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: Frame.java */
/* loaded from: classes3.dex */
public final class pes extends MediaUtils.d {
    public IntBuffer c = null;
    public ByteBuffer d = null;
    public long e = 0;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;

    /* compiled from: Frame.java */
    public static class a {
        public long a;
    }

    /* compiled from: Frame.java */
    public static class b {
        public pes a = new pes();
    }

    public final void e() {
        this.c = null;
        this.d = null;
        this.a = 0;
        this.b = 0;
        this.e = 0L;
        this.f = true;
        this.g = false;
        this.h = false;
    }

    public final void f(pes pesVar) {
        int i = this.b;
        int i2 = this.a;
        if (i * i2 > 0) {
            pesVar.h(i2, i);
            IntBuffer intBuffer = this.c;
            if (intBuffer != null && pesVar.c != null) {
                intBuffer.rewind();
                pesVar.c.rewind();
                int[] array = pesVar.c.array();
                int[] array2 = this.c.array();
                if (array.length <= array2.length) {
                    System.arraycopy(array2, 0, array, 0, array.length);
                }
            }
            ByteBuffer byteBuffer = this.d;
            pesVar.g(byteBuffer != null ? byteBuffer.array() : null);
            pesVar.e = this.e;
            int i3 = this.a;
            int i4 = this.b;
            pesVar.a = i3;
            pesVar.b = i4;
            pesVar.g = this.g;
            pesVar.f = this.f;
            pesVar.h = this.h;
        }
    }

    public final void g(byte[] bArr) {
        if (bArr == null || !this.f) {
            return;
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null || byteBuffer.array().length < bArr.length) {
            this.d = ByteBuffer.allocateDirect(bArr.length);
        }
        this.d.rewind();
        System.arraycopy(bArr, 0, this.d.array(), 0, bArr.length);
    }

    public final void h(int i, int i2) {
        IntBuffer intBuffer;
        try {
            if (this.g && ((intBuffer = this.c) == null || intBuffer.array().length != i * i2)) {
                this.c = null;
                this.c = IntBuffer.allocate(i * i2);
            }
        } catch (Exception unused) {
            L.G("Frame", "can't resize buffer!");
        }
        this.a = i;
        this.b = i2;
    }

    public final ByteBuffer i() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.rewind();
        return this.d;
    }

    @Override // com.vk.media.MediaUtils.d
    public final String toString() {
        return "frame: " + this.a + "x" + this.b + ", time:" + this.e + " rotation:0 processed:" + this.h;
    }
}
