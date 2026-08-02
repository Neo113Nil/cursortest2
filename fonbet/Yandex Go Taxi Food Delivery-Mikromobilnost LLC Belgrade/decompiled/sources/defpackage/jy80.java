package defpackage;

import android.media.MediaParser$InputReader;

/* loaded from: classes10.dex */
public final class jy80 implements apg {
    public MediaParser$InputReader a;

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        MediaParser$InputReader mediaParser$InputReader = this.a;
        int i3 = tw21.a;
        read = iy80.j(mediaParser$InputReader).read(bArr, i, i2);
        return read;
    }
}
