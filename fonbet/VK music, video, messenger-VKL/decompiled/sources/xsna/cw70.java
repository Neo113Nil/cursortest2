package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* compiled from: OggFileChunkReader.kt */
/* loaded from: classes.dex */
public final class cw70 {
    public ByteBuffer a;
    public final int[] b = new int[3];

    /* compiled from: OggFileChunkReader.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final byte[] a;
        public int b = 0;
        public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public boolean d = false;

        public a(byte[] bArr) {
            this.a = bArr;
        }

        public final byte[] a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final boolean c() {
            return this.d;
        }

        public final float d() {
            return this.c;
        }

        public final void e(int i) {
            this.b = i;
        }

        public final void f(boolean z) {
            this.d = z;
        }

        public final void g(float f) {
            this.c = f;
        }
    }
}
