package defpackage;

import android.media.MediaCodec;

/* loaded from: classes7.dex */
public final class l271 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final tcf j;

    public l271() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = rf71.a >= 24 ? new tcf(1, cryptoInfo) : null;
    }
}
