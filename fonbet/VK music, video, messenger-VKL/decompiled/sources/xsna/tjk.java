package xsna;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* compiled from: CryptoInfo.java */
/* loaded from: classes12.dex */
public final class tjk {

    @Nullable
    public byte[] a;

    @Nullable
    public byte[] b;
    public int c;

    @Nullable
    public int[] d;

    @Nullable
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;

    @Nullable
    public final a j;

    /* compiled from: CryptoInfo.java */
    public static final class a {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
        }
    }

    public tjk() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new a(cryptoInfo);
    }
}
