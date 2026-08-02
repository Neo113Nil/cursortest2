package xsna;

import android.os.SystemClock;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import kotlin.NoWhenBranchMatchedException;
import one.video.upload.exceptions.EndOfStreamException;
import one.video.upload.exceptions.UploadServerErrorException;
import one.video.upload.exceptions.UploadUrlExpiredException;
import one.video.upload.impl.UploadMode;
import one.video.upload.impl.io.AsyncSocket;
import xsna.maq0;

/* compiled from: Connection.kt */
/* loaded from: classes8.dex */
public class t3j implements dai0 {
    public final rd7 b;
    public final SSLContext c;
    public final kdq0 d;
    public final c4j e;
    public qrn0 i;
    public trn0 j;
    public prn0 k;
    public final AsyncSocket f = new AsyncSocket();
    public final bpn0 g = new bpn0(new xqf(this, 7));
    public final bpn0 h = new bpn0(new sje(this, 12));
    public long l = -1;

    public t3j(rd7 rd7Var, SSLContext sSLContext, kdq0 kdq0Var, c4j c4jVar) {
        this.b = rd7Var;
        this.c = sSLContext;
        this.d = kdq0Var;
        this.e = c4jVar;
    }

    @Override // xsna.dai0
    public final void N1() {
        boolean b;
        prn0 prn0Var = this.k;
        if (prn0Var != null && prn0Var.c.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            prn0 prn0Var2 = this.k;
            if (prn0Var2 != null) {
                prn0Var2.a();
                return;
            }
            return;
        }
        maq0 maq0Var = (maq0) this;
        t7f0 t7f0Var = maq0Var.i;
        if (t7f0Var == null) {
            t7f0Var = (qrf0) maq0Var.g.getValue();
        }
        qsu qsuVar = maq0Var.x;
        ByteBuffer byteBuffer = qsuVar.c;
        LinkedHashMap linkedHashMap = qsuVar.b;
        int read = t7f0Var.read(byteBuffer);
        byteBuffer.flip();
        if (read > 0) {
            try {
                qsuVar.a = null;
                linkedHashMap.clear();
                b = qsuVar.b();
                if (b) {
                    byteBuffer.clear();
                } else {
                    qsuVar.a = null;
                    linkedHashMap.clear();
                    byteBuffer.compact();
                }
            } catch (Throwable th) {
                qsuVar.a = null;
                linkedHashMap.clear();
                throw th;
            }
        } else {
            if (read != 0) {
                throw new EndOfStreamException("Unexpected end of stream");
            }
            b = false;
        }
        if (b) {
            Integer num = qsuVar.a;
            if (num != null && new k9x(400, 499, 1).e(num.intValue())) {
                throw new UploadUrlExpiredException(gq.d(num, "http status code: "));
            }
            if (num != null && new k9x(500, CommonGatewayClient.CODE_599, 1).e(num.intValue())) {
                throw new UploadServerErrorException(gq.d(num, "http status code: "));
            }
            int i = maq0.b.$EnumSwitchMapping$1[maq0Var.w.ordinal()];
            c4j c4jVar = maq0Var.t;
            if (i == 1) {
                c4jVar.getClass();
                new StringBuilder("Upload status received. statusCode: ").append(num);
                String str = (String) linkedHashMap.get(Command.HTTP_HEADER_RANGE);
                int i2 = maq0.b.$EnumSwitchMapping$0[maq0Var.q.ordinal()];
                scq0 scq0Var = maq0Var.p;
                if (i2 == 1) {
                    s101.t(scq0Var, str, new d7l0(8));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s101.t(scq0Var, str, new rxc0(1));
                }
                maq0Var.o();
                tdq0 tdq0Var = (tdq0) maq0Var.v.c;
                int i3 = tdq0Var.c.b - 1;
                for (int i4 = 0; i4 < i3; i4++) {
                    tdq0Var.a(false);
                }
                maq0Var.u = false;
                return;
            }
            if (i != 2) {
                throw new IllegalStateException("Unexpected state of UploadConnection: " + maq0Var.w + " in readyForReadPayload");
            }
            c4jVar.getClass();
            new StringBuilder("Chunk status received. statusCode: ").append(num);
            if (num != null && num.intValue() == 201) {
                bcc bccVar = maq0Var.y;
                if (bccVar != null) {
                    bccVar.a();
                }
                maq0Var.o();
                return;
            }
            if (num != null && num.intValue() == 200) {
                bcc bccVar2 = maq0Var.y;
                if (bccVar2 != null) {
                    bccVar2.a();
                }
                maq0Var.y = null;
                maq0Var.p(maq0.a.SHUTDOWN);
                maq0Var.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r2 != r0.c) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (r2 != r0.c) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        r1.p(xsna.maq0.a.WAITING_FOR_CHUNK_STATUS);
        r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    @Override // xsna.dai0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        String str;
        String valueOf;
        String str2;
        prn0 prn0Var = this.k;
        if (prn0Var != null && prn0Var.c.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            prn0 prn0Var2 = this.k;
            if (prn0Var2 != null) {
                prn0Var2.a();
                return;
            }
            return;
        }
        maq0 maq0Var = (maq0) this;
        int i = maq0.b.$EnumSwitchMapping$1[maq0Var.w.ordinal()];
        bpn0 bpn0Var = maq0Var.h;
        UploadMode uploadMode = maq0Var.q;
        String str3 = maq0Var.o;
        String str4 = maq0Var.m;
        String str5 = maq0Var.n;
        if (i == 3) {
            if (!maq0Var.u) {
                maq0Var.o();
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
            printWriter.println("GET " + str5 + " HTTP/1.1");
            StringBuilder sb = new StringBuilder("Host: ");
            sb.append(str4);
            printWriter.println(sb.toString());
            printWriter.println("Content-Type: application/x-binary; charset=x-user-defined");
            printWriter.println("Content-Disposition: attachment; fileName=\"" + str3 + "\"");
            printWriter.println("Content-Length: 0");
            int i2 = laq0.$EnumSwitchMapping$0[uploadMode.ordinal()];
            if (i2 == 1) {
                str = "parallel";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "unknown-size";
            }
            printWriter.println("X-Uploading-Mode: ".concat(str));
            printWriter.println("Connection: keep-alive");
            printWriter.println("");
            printWriter.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            yzx0 yzx0Var = maq0Var.j;
            if (yzx0Var == null) {
                yzx0Var = (rrf0) bpn0Var.getValue();
            }
            yzx0Var.write(ByteBuffer.wrap(byteArray));
            maq0Var.p(maq0.a.WAITING_FOR_UPLOAD_STATUS);
            maq0Var.m();
            return;
        }
        if (i == 4) {
            bcc bccVar = maq0Var.y;
            if (bccVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            long j = bccVar.a;
            long j2 = bccVar.b;
            int[] iArr = laq0.$EnumSwitchMapping$0;
            int i3 = iArr[uploadMode.ordinal()];
            b9r b9rVar = maq0Var.s;
            if (i3 == 1) {
                valueOf = Long.valueOf(b9rVar.a);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                valueOf = b9rVar.b ? String.valueOf(b9rVar.a) : "*";
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            PrintWriter printWriter2 = new PrintWriter(byteArrayOutputStream2);
            printWriter2.println("POST " + str5 + " HTTP/1.1");
            StringBuilder sb2 = new StringBuilder("Host: ");
            sb2.append(str4);
            printWriter2.println(sb2.toString());
            printWriter2.println("Content-Type: application/x-binary; charset=x-user-defined");
            printWriter2.println("Content-Disposition: attachment; fileName=\"" + str3 + "\"");
            StringBuilder b = fp.b(j, "Content-Range: bytes ", "-");
            b.append((j + j2) - 1);
            b.append(DomExceptionUtils.SEPARATOR);
            b.append(valueOf);
            printWriter2.println(b.toString());
            printWriter2.println("Content-Length: " + j2);
            int i4 = iArr[uploadMode.ordinal()];
            if (i4 == 1) {
                str2 = "parallel";
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "unknown-size";
            }
            printWriter2.println("X-Uploading-Mode: ".concat(str2));
            printWriter2.println("Connection: keep-alive");
            printWriter2.println("");
            printWriter2.flush();
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            yzx0 yzx0Var2 = maq0Var.j;
            if (yzx0Var2 == null) {
                yzx0Var2 = (rrf0) bpn0Var.getValue();
            }
            yzx0Var2.write(ByteBuffer.wrap(byteArray2));
            maq0Var.p(maq0.a.SENDING_DATA);
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("Unexpected state of UploadConnection: " + maq0Var.w + " in readyForWritePayload");
        }
        bcc bccVar2 = maq0Var.y;
        if (bccVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        long j3 = bccVar2.b;
        while (true) {
            long j4 = bccVar2.c;
            c4j c4jVar = maq0Var.t;
            if (j4 >= j3) {
                break;
            }
            long j5 = bccVar2.a + j4;
            int min = Math.min((int) (j3 - j4), 8096);
            RandomAccessFile randomAccessFile = maq0Var.r;
            randomAccessFile.seek(j5);
            byte[] bArr = maq0Var.z;
            int read = randomAccessFile.read(bArr, 0, min);
            if (read == -1) {
                c4jVar.getClass();
                throw new RuntimeException("Upload file read error");
            }
            yzx0 yzx0Var3 = maq0Var.j;
            if (yzx0Var3 == null) {
                yzx0Var3 = (rrf0) bpn0Var.getValue();
            }
            int write = yzx0Var3.write(ByteBuffer.wrap(bArr, 0, read));
            if (write == 0) {
                c4jVar.getClass();
                fp.b(bccVar2.c, "Upload chunk: ", " of ").append(j3);
                break;
            }
            bccVar2.b(write);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AsyncSocket asyncSocket = this.f;
        asyncSocket.getClass();
        SocketChannel socketChannel = asyncSocket.a;
        try {
            socketChannel.close();
            AsyncSocket.ConnectionState connectionState = AsyncSocket.ConnectionState.DISCONNECTED;
            this.b.e(socketChannel);
        } catch (Throwable th) {
            AsyncSocket.ConnectionState connectionState2 = AsyncSocket.ConnectionState.DISCONNECTED;
            throw th;
        }
    }

    public final void m() {
        this.f.a.register((Selector) this.b.b, 1, this);
    }

    public final void n() {
        SocketChannel socketChannel = this.f.a;
        rd7 rd7Var = this.b;
        Object obj = rd7Var.a;
        socketChannel.register((Selector) rd7Var.b, 4, this);
    }

    @Override // xsna.dai0
    public final void onConnected() {
        boolean z;
        if (this.l != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.l;
            this.l = -1L;
            kdq0 kdq0Var = this.d;
            if (kdq0Var != null) {
                kdq0Var.a(elapsedRealtime);
            }
        }
        AsyncSocket asyncSocket = this.f;
        if (asyncSocket.a.finishConnect()) {
            AsyncSocket.ConnectionState connectionState = AsyncSocket.ConnectionState.DISCONNECTED;
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            n();
            SSLContext sSLContext = this.c;
            if (sSLContext == null) {
                return;
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) asyncSocket.a.getRemoteAddress();
            SSLEngine createSSLEngine = sSLContext.createSSLEngine(inetSocketAddress.getHostName(), inetSocketAddress.getPort());
            createSSLEngine.setUseClientMode(true);
            createSSLEngine.beginHandshake();
            srn0 srn0Var = new srn0(createSSLEngine);
            this.i = new qrn0(this, srn0Var);
            this.j = new trn0(this, srn0Var);
            this.k = new prn0(this, srn0Var, this.e);
        }
    }
}
