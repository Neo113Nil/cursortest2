package xsna;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.function.Consumer;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bB;
import one.video.calls.sdk_private.bC$a;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.by;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: QuicPacket.java */
/* loaded from: classes8.dex */
public abstract class tly0 {
    public kgy0 a;
    public ArrayList c;
    public byte[] e;
    public boolean f;
    public long b = -1;
    public int d = -1;

    public tly0() {
        this.c = new ArrayList();
        this.c = new ArrayList();
    }

    public static byte a(long j, byte b) {
        int i;
        if (j <= 255) {
            return b;
        }
        if (j <= 65535) {
            i = b | 1;
        } else if (j <= 16777215) {
            i = b | 2;
        } else {
            if (j > 4294967295L) {
                throw new bB("cannot encode pn > 4 bytes");
            }
            i = b | 3;
        }
        return (byte) i;
    }

    public static int c(long j) {
        if (j <= 255) {
            return 1;
        }
        if (j <= 65535) {
            return 2;
        }
        return j <= 16777215 ? 3 : 4;
    }

    public static byte[] m(long j) {
        if (j <= 255) {
            return new byte[]{(byte) j};
        }
        if (j <= 65535) {
            return new byte[]{(byte) (j >> 8), (byte) (j & 255)};
        }
        if (j <= 16777215) {
            return new byte[]{(byte) (j >> 16), (byte) (j >> 8), (byte) (j & 255)};
        }
        if (j <= 4294967295L) {
            return new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) (j & 255)};
        }
        throw new bB("cannot encode pn > 4 bytes");
    }

    public abstract int b(int i);

    public abstract bC$a d(bF bFVar, com.vk.movika.sdk.base.data.converter.c cVar);

    /* JADX WARN: Code restructure failed: missing block: B:170:0x029b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(ByteBuffer byteBuffer, byte b, int i, nby0 nby0Var, long j) throws one.video.calls.sdk_private.bt, one.video.calls.sdk_private.bz, bJ {
        ArrayList arrayList;
        ArrayList arrayList2;
        ygy0 ygy0Var;
        ecy0 ecy0Var;
        if (byteBuffer.remaining() < i) {
            throw new one.video.calls.sdk_private.bz();
        }
        int position = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            throw new one.video.calls.sdk_private.bz();
        }
        if (byteBuffer.remaining() < 16) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        byte[] b2 = nby0Var.b(bArr2);
        byte b3 = (byte) (b ^ ((b & 128) == 128 ? b2[0] & AmfConstants.TYPE_XML_DOCUMENT_MARKER : b2[0] & 31));
        l(b3);
        int i2 = (b3 & 3) + 1;
        byte[] bArr3 = new byte[i2];
        byteBuffer.get(bArr3);
        byte[] bArr4 = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            bArr4[i3] = (byte) (bArr3[i3] ^ b2[i4]);
            i3 = i4;
        }
        long j2 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j2 = (j2 << 8) | (bArr4[i5] & 255);
        }
        long j3 = j + 1;
        long j4 = 1 << (i2 << 3);
        long j5 = j4 / 2;
        long j6 = j2 | (j3 & (~(j4 - 1)));
        if (j6 <= j3 - j5 && j6 < 4611686018427387904L - j4) {
            j6 += j4;
        } else if (j6 > j3 + j5 && j6 >= j4) {
            j6 -= j4;
        }
        this.b = j6;
        int position2 = byteBuffer.position();
        int position3 = byteBuffer.position();
        byte[] bArr5 = new byte[position3];
        byteBuffer.get(bArr5);
        bArr5[0] = b3;
        System.arraycopy(bArr4, 0, bArr5, position3 - i2, i2);
        int i6 = i - i2;
        if (i6 <= 0) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr6 = new byte[i6];
        byteBuffer.get(bArr6, 0, i6);
        long j7 = this.b;
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(0);
        allocate.putLong(j7);
        if (this instanceof xly0) {
            qby0 qby0Var = (qby0) nby0Var;
            if (qby0Var.n % 2 != ((xly0) this).g) {
                if (qby0Var.f == null) {
                    qby0Var.c(false);
                }
                qby0Var.o = true;
            }
        }
        qby0 qby0Var2 = (qby0) nby0Var;
        byte[] bArr7 = qby0Var2.o ? qby0Var2.h : qby0Var2.g;
        byte[] bArr8 = new byte[12];
        byte[] array = allocate.array();
        int length = array.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            bArr8[i8] = (byte) (array[i7] ^ bArr7[i8]);
            i7++;
            i8++;
        }
        byte[] a = nby0Var.a(bArr5, bArr6, bArr8);
        this.c = new ArrayList();
        ByteBuffer wrap = ByteBuffer.wrap(a);
        while (wrap.remaining() > 0) {
            try {
                byte b4 = wrap.get();
                if (b4 == 48 || b4 == 49) {
                    ArrayList arrayList3 = this.c;
                    bcy0 bcy0Var = new bcy0();
                    int j8 = alk.j(wrap);
                    if (j8 == 49) {
                        byte[] bArr9 = new byte[alk.j(wrap)];
                        bcy0Var.b = bArr9;
                        wrap.get(bArr9);
                    } else {
                        if (j8 != 48) {
                            throw new by();
                        }
                        byte[] bArr10 = new byte[wrap.remaining()];
                        bcy0Var.b = bArr10;
                        wrap.get(bArr10);
                    }
                    arrayList3.add(bcy0Var);
                } else {
                    switch (b4) {
                        case 0:
                            ArrayList arrayList4 = this.c;
                            wgy0 wgy0Var = new wgy0();
                            byte b5 = 0;
                            while (wrap.position() < wrap.limit() && (b5 = wrap.get()) == 0) {
                                wgy0Var.b++;
                            }
                            if (b5 != 0) {
                            }
                            arrayList4.add(wgy0Var);
                            continue;
                        case 1:
                            ArrayList arrayList5 = this.c;
                            fhy0 fhy0Var = new fhy0();
                            wrap.get();
                            arrayList5.add(fhy0Var);
                            continue;
                        case 2:
                        case 3:
                            ArrayList arrayList6 = this.c;
                            yby0 yby0Var = new yby0();
                            yby0Var.j(wrap);
                            arrayList6.add(yby0Var);
                            continue;
                        case 4:
                            ArrayList arrayList7 = this.c;
                            one.video.calls.sdk_private.v vVar = new one.video.calls.sdk_private.v();
                            vVar.i(wrap);
                            arrayList7.add(vVar);
                            continue;
                        case 5:
                            ArrayList arrayList8 = this.c;
                            nhy0 nhy0Var = new nhy0();
                            nhy0Var.i(wrap);
                            arrayList8.add(nhy0Var);
                            continue;
                        case 6:
                            ArrayList arrayList9 = this.c;
                            one.video.calls.sdk_private.c cVar = new one.video.calls.sdk_private.c();
                            cVar.i(wrap);
                            arrayList9.add(cVar);
                            continue;
                        case 7:
                            arrayList = this.c;
                            vgy0 vgy0Var = new vgy0();
                            wrap.get();
                            byte[] bArr11 = new byte[alk.j(wrap)];
                            vgy0Var.b = bArr11;
                            wrap.get(bArr11);
                            ecy0Var = vgy0Var;
                            break;
                        default:
                            switch (b4) {
                                case 16:
                                    ArrayList arrayList10 = this.c;
                                    dcy0 dcy0Var = new dcy0();
                                    wrap.get();
                                    dcy0Var.b = alk.l(wrap);
                                    arrayList10.add(dcy0Var);
                                    break;
                                case 17:
                                    ArrayList arrayList11 = this.c;
                                    one.video.calls.sdk_private.d dVar = new one.video.calls.sdk_private.d();
                                    dVar.i(wrap);
                                    arrayList11.add(dVar);
                                    break;
                                case 18:
                                case 19:
                                    arrayList = this.c;
                                    ecy0 ecy0Var2 = new ecy0();
                                    byte b6 = wrap.get();
                                    if (b6 != 18 && b6 != 19) {
                                        throw new RuntimeException();
                                    }
                                    boolean z = false;
                                    ecy0Var2.c = z;
                                    ecy0Var2.b = alk.l(wrap);
                                    ecy0Var = ecy0Var2;
                                    break;
                                case 20:
                                    ArrayList arrayList12 = this.c;
                                    acy0 acy0Var = new acy0();
                                    wrap.get();
                                    acy0Var.b = alk.l(wrap);
                                    arrayList12.add(acy0Var);
                                    break;
                                case 21:
                                    ArrayList arrayList13 = this.c;
                                    phy0 phy0Var = new phy0();
                                    phy0Var.i(wrap);
                                    arrayList13.add(phy0Var);
                                    break;
                                case 22:
                                case 23:
                                    ArrayList arrayList14 = this.c;
                                    shy0 shy0Var = new shy0();
                                    shy0Var.b = wrap.get() == 22;
                                    shy0Var.c = alk.l(wrap);
                                    arrayList14.add(shy0Var);
                                    break;
                                case 24:
                                    ArrayList arrayList15 = this.c;
                                    tgy0 tgy0Var = new tgy0();
                                    tgy0Var.i(wrap);
                                    arrayList15.add(tgy0Var);
                                    break;
                                case 25:
                                    ArrayList arrayList16 = this.c;
                                    lhy0 lhy0Var = new lhy0();
                                    wrap.get();
                                    lhy0Var.b = ihy0.d(wrap);
                                    arrayList16.add(lhy0Var);
                                    break;
                                case 26:
                                    arrayList2 = this.c;
                                    ygy0 ygy0Var2 = new ygy0();
                                    if (wrap.get() != 26) {
                                        throw new RuntimeException();
                                    }
                                    byte[] bArr12 = new byte[8];
                                    ygy0Var2.b = bArr12;
                                    wrap.get(bArr12);
                                    ygy0Var = ygy0Var2;
                                    arrayList2.add(ygy0Var);
                                    break;
                                case 27:
                                    arrayList2 = this.c;
                                    ehy0 ehy0Var = new ehy0();
                                    wrap.get();
                                    byte[] bArr13 = new byte[8];
                                    ehy0Var.b = bArr13;
                                    wrap.get(bArr13);
                                    ygy0Var = ehy0Var;
                                    arrayList2.add(ygy0Var);
                                    break;
                                case 28:
                                case 29:
                                    ArrayList arrayList17 = this.c;
                                    zby0 zby0Var = new zby0();
                                    int i9 = wrap.get() & 255;
                                    zby0Var.f = i9;
                                    if (i9 != 28 && i9 != 29) {
                                        throw new RuntimeException();
                                    }
                                    zby0Var.b = alk.l(wrap);
                                    if (zby0Var.f == 28) {
                                        zby0Var.c = alk.l(wrap);
                                    }
                                    int j9 = alk.j(wrap);
                                    if (j9 > 0) {
                                        byte[] bArr14 = new byte[j9];
                                        zby0Var.d = bArr14;
                                        wrap.get(bArr14);
                                    }
                                    if (zby0Var.f == 28) {
                                        long j10 = zby0Var.b;
                                        if (j10 >= 256 && j10 < 512) {
                                            zby0Var.e = (int) (j10 - 256);
                                        }
                                    }
                                    arrayList17.add(zby0Var);
                                    break;
                                case 30:
                                    ArrayList arrayList18 = this.c;
                                    ccy0 ccy0Var = new ccy0();
                                    if (wrap.get() != 30) {
                                        throw new RuntimeException();
                                    }
                                    arrayList18.add(ccy0Var);
                                    break;
                                default:
                                    if (b4 < 8 || b4 > 15) {
                                        throw new bJ(ap$a.FRAME_ENCODING_ERROR);
                                    }
                                    ArrayList arrayList19 = this.c;
                                    one.video.calls.sdk_private.w wVar = new one.video.calls.sdk_private.w();
                                    wVar.i(wrap);
                                    arrayList19.add(wVar);
                                    break;
                            }
                    }
                    arrayList.add(ecy0Var);
                }
            } catch (IllegalArgumentException unused) {
                throw new one.video.calls.sdk_private.bz("unexpected large int value");
            } catch (BufferUnderflowException | one.video.calls.sdk_private.bp unused2) {
                throw new bJ(ap$a.FRAME_ENCODING_ERROR, "invalid frame encoding");
            } catch (one.video.calls.sdk_private.bq unused3) {
                throw new bJ(ap$a.FRAME_ENCODING_ERROR, "invalid integer encoding");
            }
        }
        e(b3);
    }

    public final void g(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, nby0 nby0Var) {
        int position = byteBuffer.position() - i;
        byte[] bArr = new byte[byteBuffer.position()];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[byteBuffer2.limit()];
        byteBuffer2.get(bArr2, 0, byteBuffer2.limit());
        long j = this.b;
        qby0 qby0Var = (qby0) nby0Var;
        byte[] bArr3 = qby0Var.o ? qby0Var.h : qby0Var.g;
        ByteBuffer allocate = ByteBuffer.allocate(bArr3.length);
        for (int i2 = 0; i2 < allocate.capacity() - 8; i2++) {
            allocate.put((byte) 0);
        }
        allocate.putLong(j);
        byte[] bArr4 = new byte[12];
        byte[] array = allocate.array();
        int length = array.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            bArr4[i4] = (byte) (array[i3] ^ bArr3[i4]);
            i3++;
            i4++;
        }
        byte[] b = qby0Var.b(bArr, bArr2, bArr4);
        byteBuffer.put(b);
        byte[] m = m(this.b);
        byte[] bArr5 = new byte[16];
        System.arraycopy(b, 4 - m.length, bArr5, 0, 16);
        byte[] b2 = qby0Var.b(bArr5);
        byte[] bArr6 = new byte[m.length];
        int i5 = 0;
        while (i5 < m.length) {
            int i6 = i5 + 1;
            bArr6[i5] = (byte) (m[i5] ^ b2[i6]);
            i5 = i6;
        }
        byte b3 = byteBuffer.get(0);
        byteBuffer.put(0, (byte) (((byte) ((b3 & 128) == 128 ? b2[0] & AmfConstants.TYPE_XML_DOCUMENT_MARKER : b2[0] & 31)) ^ b3));
        int position2 = byteBuffer.position();
        byteBuffer.put(bArr6);
    }

    public abstract void h(ByteBuffer byteBuffer, nby0 nby0Var, long j, sp spVar, int i) throws one.video.calls.sdk_private.bt, one.video.calls.sdk_private.bz, bJ;

    public final void i(ihy0 ihy0Var) {
        this.c.add(ihy0Var);
    }

    public abstract byte[] j(nby0 nby0Var);

    public final ByteBuffer k(int i) {
        final ByteBuffer allocate = ByteBuffer.allocate(1500);
        this.c.stream().forEachOrdered(new Consumer() { // from class: xsna.sly0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ihy0) obj).b(allocate);
            }
        });
        if (allocate.position() + i < 4) {
            wgy0 wgy0Var = new wgy0((4 - i) - allocate.position());
            this.c.add(wgy0Var);
            wgy0Var.b(allocate);
        }
        return allocate;
    }

    public abstract aF n();

    public abstract aG o();

    public Long p() {
        long j = this.b;
        if (j >= 0) {
            return Long.valueOf(j);
        }
        throw new IllegalStateException("PN is not yet known");
    }

    public final int q() {
        int i = this.d;
        if (i > 0) {
            return i;
        }
        throw new IllegalStateException("no size for ".concat(getClass().getSimpleName()));
    }

    public boolean r() {
        return !(this instanceof uly0);
    }

    public boolean s() {
        return this.c.stream().anyMatch(new ply0(0));
    }

    public boolean t() {
        return this.c.stream().allMatch(new rly0());
    }

    public boolean u() {
        return this.c.stream().anyMatch(new qly0());
    }

    public byte[] v() {
        return this.e;
    }

    public void e(byte b) throws bJ {
    }

    public void l(byte b) {
    }
}
