package xsna;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bJ;

/* compiled from: QuicFrame.java */
/* loaded from: classes8.dex */
public abstract class ihy0 {
    public static int d(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bq, bJ {
        try {
            return alk.j(byteBuffer);
        } catch (one.video.calls.sdk_private.bp unused) {
            throw new bJ(ap$a.INTERNAL_ERROR, "value too large");
        }
    }

    public abstract int a();

    public abstract void b(ByteBuffer byteBuffer);

    public abstract void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar);

    public boolean h() {
        return !(this instanceof yby0);
    }
}
