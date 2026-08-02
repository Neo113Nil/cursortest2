package xsna;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class v501 implements w101 {
    public final FileChannel b;
    public final long c;
    public final long d;

    public v501(FileChannel fileChannel, long j, long j2) {
        this.b = fileChannel;
        this.c = j;
        this.d = j2;
    }

    @Override // xsna.w101
    public final void b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.b.map(FileChannel.MapMode.READ_ONLY, this.c + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // xsna.w101
    public final long zza() {
        return this.d;
    }
}
