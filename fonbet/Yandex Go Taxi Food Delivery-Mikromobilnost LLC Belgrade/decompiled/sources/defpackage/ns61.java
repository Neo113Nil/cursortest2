package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InputStream;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.MSCAPI.Sspi;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.cl_88;
import ru.CryptoPro.sspiSSL.SSLSocketImpl;

/* loaded from: classes4.dex */
public final class ns61 extends InputStream {
    public static final byte[] C = new byte[1024];
    public boolean a;
    public final SSLSocketImpl b;
    public byte[] z;
    public final byte[] c = new byte[cl_88.o];
    public final byte[] w = new byte[cl_88.o];
    public final byte[] x = new byte[1];
    public int y = 0;
    public int A = 0;
    public int B = 0;

    public ns61(SSLSocketImpl sSLSocketImpl) {
        this.b = sSLSocketImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        r12 = r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r12 == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        r7 = ru.CryptoPro.JCP.tools.Array.copy(r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        r7 = new byte[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        byte[] bArr = this.w;
        byte[] bArr2 = this.c;
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int i = 0;
        byte[] bArr3 = null;
        while (true) {
            SSLSocketImpl sSLSocketImpl = this.b;
            int n = sSLSocketImpl.n();
            if (n == 6 || n == 4 || n == 7) {
                break;
            }
            try {
                c();
                iArr[0] = this.y;
            } catch (EOFException e) {
                boolean z = sSLSocketImpl.n() <= 1;
                boolean z2 = qt61.c || z;
                StringBuilder sb = new StringBuilder();
                sb.append(Thread.currentThread());
                sb.append(", received EOFException: ");
                sb.append(z2 ? "error" : "ignored");
                SSLLogger.fine(sb.toString());
                if (z2) {
                    Throwable sSLHandshakeException = z ? new SSLHandshakeException("Remote host closed connection during handshake") : new SSLProtocolException("Remote host closed connection incorrectly");
                    sSLHandshakeException.initCause(e);
                    throw sSLHandshakeException;
                }
                sSLSocketImpl.e(false);
            } catch (Exception e2) {
                sSLSocketImpl.c(e2);
                throw null;
            }
            while (bArr2[0] != 21) {
                Array.clear(bArr);
                iArr2[0] = bArr.length;
                if (sSLSocketImpl.n() == 2) {
                    sSLSocketImpl.getEngine().u();
                    try {
                        i = Sspi.decryptMessage(sSLSocketImpl.getEngine().g, bArr2, iArr, bArr, iArr2);
                        if (i == 0) {
                            this.y = iArr[0];
                        }
                        if (i == 0 && iArr2[0] == 0 && iArr[0] != 0) {
                        }
                    } finally {
                        sSLSocketImpl.getEngine().v();
                    }
                }
                if (i != 0 && i != 590625 && i != 590615 && i != -2146893032) {
                    throw new SSLException("Error due read 0x" + Integer.toHexString(i));
                }
                if (SSLLogger.isAllEnabled() && bArr3 != null && bArr3.length > 0) {
                    SSLLogger.dump("[Raw read decrypted]: length = ", Integer.valueOf(bArr3.length), ByteBuffer.wrap(bArr3));
                }
                if (i != 590625) {
                    if (i != -2146893032) {
                        break;
                    }
                    if (this.y >= 16921) {
                        throw new SSLException("Incomplete message is too long");
                    }
                } else {
                    SSLLogger.fine("Server requested renegotiation");
                    byte[] bArr4 = new byte[cl_88.o];
                    int renegotiation = sSLSocketImpl.getEngine().renegotiation(bArr2, this.y, bArr4);
                    this.y = renegotiation;
                    System.arraycopy(bArr4, 0, bArr2, 0, renegotiation);
                    if (SSLLogger.isAllEnabled()) {
                        ByteBuffer wrap = ByteBuffer.wrap(bArr2, 0, this.y);
                        SSLLogger.dump("[Raw read (EXTRA)]: length = ", Integer.valueOf(wrap.remaining()), wrap);
                    }
                }
            }
            sSLSocketImpl.e(false);
            return new byte[0];
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.getSockInput().available() + this.y;
    }

    public final void c() {
        if (this.a) {
            return;
        }
        int i = this.y;
        byte[] bArr = this.c;
        if (i <= 5 || i < ((bArr[3] & 255) << 8) + (bArr[4] & 255) + 5) {
            InputStream sockInput = this.b.getSockInput();
            int i2 = this.y;
            int read = sockInput.read(bArr, i2, 16921 - i2);
            if (read < 0) {
                throw new EOFException("SSL peer shut down incorrectly");
            }
            if (SSLLogger.isAllEnabled()) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, this.y, read);
                SSLLogger.dump("[Raw read]: length = ", Integer.valueOf(wrap.remaining()), wrap);
            }
            this.y += read;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = true;
        this.b.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[0];
        bArr.getClass();
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            ny61.s();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        SSLSocketImpl sSLSocketImpl = this.b;
        if (sSLSocketImpl.n() == 1) {
            this.y = sSLSocketImpl.startConnHandshake(this.c);
        }
        int i3 = this.B;
        int i4 = this.A;
        if (i3 - i4 > 0) {
            int min = Math.min(i3 - i4, i2);
            System.arraycopy(this.z, this.A, bArr, i, min);
            this.A += min;
            return min;
        }
        while (bArr2 != null && bArr2.length == 0) {
            int n = sSLSocketImpl.n();
            if (n == 0) {
                throw new SocketException("Socket is not connected");
            }
            if (n != 1 && n != 2 && n != 3 && n != 5) {
                if (n != 7) {
                    return -1;
                }
                throw new SocketException("Socket is closed");
            }
            try {
                bArr2 = a();
            } catch (Exception e) {
                throw new SSLException(e);
            }
        }
        if (bArr2 == null) {
            return -1;
        }
        if (bArr2.length <= i2) {
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            return bArr2.length;
        }
        System.arraycopy(bArr2, 0, bArr, i, i2);
        byte[] bArr3 = this.z;
        if (bArr3 == null || bArr3.length <= bArr2.length - i2) {
            this.z = Arrays.copyOfRange(bArr2, i2, bArr2.length);
        } else {
            System.arraycopy(bArr2, i2, bArr3, 0, bArr2.length - i2);
        }
        this.A = 0;
        this.B = bArr2.length - i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final synchronized long skip(long j) {
        long j2;
        j2 = 0;
        while (j > 0) {
            int read = read(C, 0, (int) Math.min(j, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
            if (read <= 0) {
                break;
            }
            long j3 = read;
            j -= j3;
            j2 += j3;
        }
        return j2;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        if (read(this.x, 0, 1) <= 0) {
            return -1;
        }
        return this.x[0] & 255;
    }
}
