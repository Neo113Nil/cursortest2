package xsna;

import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import kotlin.NoWhenBranchMatchedException;
import one.video.upload.exceptions.TlsBufferOverflowException;
import one.video.upload.exceptions.TlsBufferUnderflowException;
import one.video.upload.exceptions.TlsConnectionClosedException;
import one.video.upload.impl.io.AsyncSocket;

/* compiled from: TLSWritable.kt */
/* loaded from: classes8.dex */
public final class trn0 implements yzx0 {
    public final t3j a;
    public final srn0 b;

    /* compiled from: TLSWritable.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            try {
                iArr[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SSLEngineResult.Status.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public trn0(t3j t3jVar, srn0 srn0Var) {
        this.a = t3jVar;
        this.b = srn0Var;
    }

    @Override // xsna.yzx0
    public final int write(ByteBuffer byteBuffer) {
        AsyncSocket asyncSocket = this.a.f;
        srn0 srn0Var = this.b;
        SSLEngine sSLEngine = (SSLEngine) srn0Var.a;
        ByteBuffer d = srn0Var.d();
        if (d.hasRemaining()) {
            asyncSocket.a.write(d);
            return 0;
        }
        d.clear();
        SSLEngineResult wrap = sSLEngine.wrap(byteBuffer, d);
        SSLEngineResult.Status status = wrap.getStatus();
        int i = status == null ? -1 : a.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            d.flip();
            asyncSocket.a.write(d);
            return wrap.bytesConsumed();
        }
        if (i == 2) {
            throw new TlsConnectionClosedException("SSLEngine.wrap error. Connection closed. " + wrap, null, 2, null);
        }
        if (i == 3) {
            throw new TlsBufferOverflowException("SSLEngine.wrap error. " + wrap, null, 2, null);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new TlsBufferUnderflowException("SSLEngine.wrap error. " + wrap, null, 2, null);
    }
}
