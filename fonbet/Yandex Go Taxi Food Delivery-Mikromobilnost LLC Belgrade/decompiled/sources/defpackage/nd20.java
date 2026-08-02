package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.n;

/* loaded from: classes8.dex */
public final class nd20 extends n implements pd20 {
    public final void c(ByteString byteString) {
        copyOnWrite();
        ((od20) this.instance).setCompressedLogData(byteString);
    }

    public final void d(ByteString byteString) {
        copyOnWrite();
        ((od20) this.instance).setHash(byteString);
    }

    public final void e(long j) {
        copyOnWrite();
        ((od20) this.instance).setTimestamp(j);
    }
}
