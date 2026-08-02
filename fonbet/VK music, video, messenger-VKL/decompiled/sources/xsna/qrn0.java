package xsna;

import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import kotlin.NoWhenBranchMatchedException;
import one.video.upload.exceptions.TlsBufferOverflowException;
import one.video.upload.exceptions.TlsConnectionClosedException;

/* compiled from: TLSReadable.kt */
/* loaded from: classes8.dex */
public final class qrn0 implements t7f0 {
    public final t3j a;
    public final srn0 b;

    /* compiled from: TLSReadable.kt */
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
                iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qrn0(t3j t3jVar, srn0 srn0Var) {
        this.a = t3jVar;
        this.b = srn0Var;
    }

    @Override // xsna.t7f0
    public final int read(ByteBuffer byteBuffer) {
        srn0 srn0Var = this.b;
        SSLEngine sSLEngine = (SSLEngine) srn0Var.a;
        t3j t3jVar = this.a;
        if (t3jVar.f.a.read(srn0Var.c()) == -1) {
            return -1;
        }
        srn0Var.c().flip();
        int i = 0;
        while (true) {
            try {
                srn0Var.b().clear();
                SSLEngineResult unwrap = sSLEngine.unwrap(srn0Var.c(), srn0Var.b());
                srn0Var.b().flip();
                SSLEngineResult.Status status = unwrap.getStatus();
                int i2 = status == null ? -1 : a.$EnumSwitchMapping$0[status.ordinal()];
                if (i2 == 1) {
                    byteBuffer.put(srn0Var.b());
                    i += unwrap.bytesProduced();
                    if (!srn0Var.c().hasRemaining()) {
                        break;
                    }
                } else {
                    if (i2 == 2) {
                        throw new TlsConnectionClosedException("SSLEngine.unwrap error. Connection closed. " + unwrap, null, 2, null);
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new TlsBufferOverflowException("SSLEngine.unwrap error. " + unwrap, null, 2, null);
                    }
                    t3jVar.m();
                }
            } catch (Throwable th) {
                srn0Var.c().compact();
                throw th;
            }
        }
        srn0Var.c().compact();
        return i;
    }
}
