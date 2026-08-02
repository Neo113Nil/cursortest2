package xsna;

import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import kotlin.NoWhenBranchMatchedException;
import one.video.upload.exceptions.TlsBufferOverflowException;
import one.video.upload.exceptions.TlsBufferUnderflowException;
import one.video.upload.exceptions.TlsConnectionClosedException;
import one.video.upload.exceptions.TlsHandshakeEndOfStreamException;
import one.video.upload.impl.io.AsyncSocket;

/* compiled from: TLSHandshakeHelper.kt */
/* loaded from: classes8.dex */
public final class prn0 {
    public final t3j a;
    public final srn0 b;
    public final SSLEngine c;

    /* compiled from: TLSHandshakeHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public prn0(t3j t3jVar, srn0 srn0Var, c4j c4jVar) {
        this.a = t3jVar;
        this.b = srn0Var;
        this.c = (SSLEngine) srn0Var.a;
    }

    public final void a() {
        int i;
        t3j t3jVar = this.a;
        AsyncSocket asyncSocket = t3jVar.f;
        ByteBuffer allocate = ByteBuffer.allocate(0);
        while (true) {
            SSLEngine sSLEngine = this.c;
            SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngine.getHandshakeStatus();
            new StringBuilder("handshakeStatus == ").append(handshakeStatus);
            int i2 = handshakeStatus == null ? -1 : a.$EnumSwitchMapping$1[handshakeStatus.ordinal()];
            if (i2 == 1) {
                t3jVar.n();
                return;
            }
            if (i2 != 2) {
                srn0 srn0Var = this.b;
                if (i2 == 3) {
                    srn0Var.d().clear();
                    SSLEngineResult wrap = sSLEngine.wrap(allocate, srn0Var.d());
                    StringBuilder sb = new StringBuilder("wrap result:\n");
                    sb.append(wrap);
                    sb.append("\n-");
                    SSLEngineResult.Status status = wrap.getStatus();
                    i = status != null ? a.$EnumSwitchMapping$0[status.ordinal()] : -1;
                    if (i != 1) {
                        if (i == 2) {
                            throw new TlsConnectionClosedException("SSLEngine.wrap error while handshake. Connection closed. " + wrap, null, 2, null);
                        }
                        if (i == 3) {
                            throw new TlsBufferOverflowException("SSLEngine.wrap error while handshake. " + wrap, null, 2, null);
                        }
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new TlsBufferUnderflowException("SSLEngine.wrap error while handshake. " + wrap, null, 2, null);
                    }
                    srn0Var.d().flip();
                    while (srn0Var.d().hasRemaining()) {
                        int write = asyncSocket.a.write(srn0Var.d());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(write);
                        sb2.append(" bytes written");
                    }
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                    int read = asyncSocket.a.read(srn0Var.c());
                    if (read == -1) {
                        throw new TlsHandshakeEndOfStreamException("Unexpected end of stream while handshaking");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(read);
                    sb3.append(" bytes read");
                    srn0Var.c().flip();
                    int remaining = srn0Var.c().remaining();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(remaining);
                    sb4.append(" bytes remaining");
                    srn0Var.b().clear();
                    SSLEngineResult unwrap = sSLEngine.unwrap(srn0Var.c(), srn0Var.b());
                    StringBuilder sb5 = new StringBuilder("unwrap result:\n");
                    sb5.append(unwrap);
                    sb5.append("\n-");
                    srn0Var.c().compact();
                    SSLEngineResult.Status status2 = unwrap.getStatus();
                    i = status2 != null ? a.$EnumSwitchMapping$0[status2.ordinal()] : -1;
                    if (i != 1) {
                        if (i == 2) {
                            throw new TlsConnectionClosedException("SSLEngine.unwrap error. Connection closed. " + unwrap, null, 2, null);
                        }
                        if (i == 3) {
                            throw new TlsBufferOverflowException("SSLEngine.unwrap error. " + unwrap, null, 2, null);
                        }
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t3jVar.m();
                        return;
                    }
                }
            } else {
                for (Runnable delegatedTask = sSLEngine.getDelegatedTask(); delegatedTask != null; delegatedTask = sSLEngine.getDelegatedTask()) {
                    delegatedTask.run();
                }
            }
        }
    }
}
