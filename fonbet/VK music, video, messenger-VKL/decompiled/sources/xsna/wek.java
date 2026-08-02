package xsna;

import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CronetNativeByteBufferPool.kt */
/* loaded from: classes.dex */
public final class wek {
    public static final bpn0 c = new bpn0(new w94(5));
    public final ReentrantLock a = new ReentrantLock();
    public final sk3<ByteBuffer> b = new sk3<>(10);

    public final void a(ByteBuffer byteBuffer) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            byteBuffer.clear();
            if (this.b.size() < 10) {
                this.b.addLast(byteBuffer);
                CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.NATIVE_BUFFER;
                Object[] objArr = {"recycle " + this.b.size()};
                qek qekVar = vek.a;
                if (qekVar != null) {
                    qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
                }
            } else {
                CronetHttpLogger$DebugType cronetHttpLogger$DebugType2 = CronetHttpLogger$DebugType.NATIVE_BUFFER;
                Object[] objArr2 = {"recycle buffer has max elements " + this.b.size()};
                qek qekVar2 = vek.a;
                if (qekVar2 != null) {
                    qekVar2.a(cronetHttpLogger$DebugType2, Arrays.copyOf(objArr2, 1));
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
