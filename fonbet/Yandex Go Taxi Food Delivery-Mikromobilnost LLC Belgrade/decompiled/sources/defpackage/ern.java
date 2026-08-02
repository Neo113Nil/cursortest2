package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ern implements Closeable {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public ern(File file) {
        if (file.exists()) {
            this.b = new FileInputStream(file).getChannel();
        } else {
            ny61.g("File is null or does not exist");
            throw null;
        }
    }

    public List a() {
        drn drnVar;
        long j;
        long j2;
        FileChannel fileChannel = (FileChannel) this.b;
        long j3 = 0;
        fileChannel.position(0L);
        ArrayList arrayList = new ArrayList();
        fileChannel.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        if (e(allocate, 0L) != 1179403647) {
            ny61.g("Invalid ELF Magic!");
            return null;
        }
        c(4L, allocate, 1);
        short s = (short) (allocate.get() & 255);
        long j4 = 5;
        c(5L, allocate, 1);
        int i = 0;
        boolean z = ((short) (allocate.get() & 255)) == 2;
        if (s == 1) {
            drnVar = new drn(z, this, 0);
        } else {
            if (s != 2) {
                ny61.r("Invalid class type!");
                return null;
            }
            drnVar = new drn(z, this, 1);
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(8);
        if (drnVar.a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        allocate2.order(byteOrder);
        long j5 = drnVar.e;
        if (j5 == 65535) {
            j5 = drnVar.c().a;
        }
        long j6 = 0;
        while (true) {
            if (j6 >= j5) {
                j = j3;
                break;
            }
            brn b = drnVar.b(j6);
            j = j3;
            if (b.a == 2) {
                j3 = b.b;
                break;
            }
            j6++;
            j3 = j;
        }
        if (j3 == j) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j7 = j;
        while (true) {
            zqn a = drnVar.a(i, j3);
            long j8 = j4;
            long j9 = a.a;
            if (j9 == 1) {
                arrayList2.add(Long.valueOf(a.b));
            } else if (j9 == j8) {
                j7 = a.b;
            }
            i++;
            if (a.a == j) {
                break;
            }
            j4 = j8;
        }
        if (j7 == j) {
            ny61.r("String table offset not found!");
            return null;
        }
        long j10 = j;
        while (j10 < j5) {
            brn b2 = drnVar.b(j10);
            if (b2.a == 1) {
                long j11 = b2.c;
                if (j11 <= j7) {
                    j2 = j10;
                    if (j7 <= b2.d + j11) {
                        long j12 = (j7 - j11) + b2.b;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Long) it.next()).longValue() + j12;
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                long j13 = longValue + 1;
                                c(longValue, allocate2, 1);
                                short s2 = (short) (allocate2.get() & 255);
                                if (s2 != 0) {
                                    sb.append((char) s2);
                                    longValue = j13;
                                }
                            }
                            arrayList.add(sb.toString());
                        }
                        return arrayList;
                    }
                    j10 = j2 + 1;
                }
            }
            j2 = j10;
            j10 = j2 + 1;
        }
        ny61.r("Could not map vma to file offset!");
        return null;
    }

    public void c(long j, ByteBuffer byteBuffer, int i) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = ((FileChannel) this.b).read(byteBuffer, j + j2);
            if (read == -1) {
                ny61.b();
                return;
            }
            j2 += read;
        }
        byteBuffer.position(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((FileChannel) obj).close();
                break;
            case 1:
                ((zi6) obj).f();
                break;
            default:
                ((jci0) obj).close();
                break;
        }
    }

    public int d(ByteBuffer byteBuffer, long j) {
        c(j, byteBuffer, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long e(ByteBuffer byteBuffer, long j) {
        c(j, byteBuffer, 4);
        return byteBuffer.getInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
    }

    public ern(IntBuffer intBuffer) {
        this.b = new zi6(34963, intBuffer);
    }

    public ern(jci0 jci0Var) {
        this.b = jci0Var;
    }
}
