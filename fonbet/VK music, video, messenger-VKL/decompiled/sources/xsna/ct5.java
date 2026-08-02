package xsna;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AvcDecoderConfigurationRecord.java */
/* loaded from: classes14.dex */
public final class ct5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public List<byte[]> f = new ArrayList();
    public List<byte[]> g = new ArrayList();
    public List<byte[]> l = new ArrayList();

    public ct5(ByteBuffer byteBuffer) {
        int i;
        this.h = true;
        this.i = 1;
        this.j = 0;
        this.k = 0;
        this.m = 63;
        this.n = 7;
        this.o = 31;
        this.p = 31;
        this.q = 31;
        this.a = crx0.y(byteBuffer);
        this.b = crx0.e(byteBuffer.get());
        this.c = crx0.e(byteBuffer.get());
        this.d = crx0.e(byteBuffer.get());
        lb7 lb7Var = new lb7(byteBuffer);
        this.m = lb7Var.a(6);
        this.e = lb7Var.a(2);
        this.n = lb7Var.a(3);
        int a = lb7Var.a(5);
        for (int i2 = 0; i2 < a; i2++) {
            byte[] bArr = new byte[crx0.u(byteBuffer)];
            byteBuffer.get(bArr);
            this.f.add(bArr);
        }
        long e = crx0.e(byteBuffer.get());
        for (int i3 = 0; i3 < e; i3++) {
            byte[] bArr2 = new byte[crx0.u(byteBuffer)];
            byteBuffer.get(bArr2);
            this.g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.h = false;
        }
        if (!this.h || ((i = this.b) != 100 && i != 110 && i != 122 && i != 144)) {
            this.i = -1;
            this.j = -1;
            this.k = -1;
            return;
        }
        lb7 lb7Var2 = new lb7(byteBuffer);
        this.o = lb7Var2.a(6);
        this.i = lb7Var2.a(2);
        this.p = lb7Var2.a(5);
        this.j = lb7Var2.a(3);
        this.q = lb7Var2.a(5);
        this.k = lb7Var2.a(3);
        long e2 = crx0.e(byteBuffer.get());
        for (int i4 = 0; i4 < e2; i4++) {
            byte[] bArr3 = new byte[crx0.u(byteBuffer)];
            byteBuffer.get(bArr3);
            this.l.add(bArr3);
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        aqw.w(this.a, byteBuffer);
        byteBuffer.put((byte) (this.b & 255));
        byteBuffer.put((byte) (this.c & 255));
        byteBuffer.put((byte) (this.d & 255));
        mb7 mb7Var = new mb7(byteBuffer);
        mb7Var.a(this.m, 6);
        mb7Var.a(this.e, 2);
        mb7Var.a(this.n, 3);
        mb7Var.a(this.g.size(), 5);
        for (byte[] bArr : this.f) {
            aqw.u(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (this.g.size() & 255));
        for (byte[] bArr2 : this.g) {
            aqw.u(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (this.h) {
            int i = this.b;
            if (i == 100 || i == 110 || i == 122 || i == 144) {
                mb7 mb7Var2 = new mb7(byteBuffer);
                mb7Var2.a(this.o, 6);
                mb7Var2.a(this.i, 2);
                mb7Var2.a(this.p, 5);
                mb7Var2.a(this.j, 3);
                mb7Var2.a(this.q, 5);
                mb7Var2.a(this.k, 3);
                for (byte[] bArr3 : this.l) {
                    aqw.u(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public final long b() {
        int i;
        long j = 6;
        while (this.f.iterator().hasNext()) {
            j = j + 2 + r0.next().length;
        }
        long j2 = j + 1;
        while (this.g.iterator().hasNext()) {
            j2 = j2 + 2 + r3.next().length;
        }
        if (!this.h || ((i = this.b) != 100 && i != 110 && i != 122 && i != 144)) {
            return j2;
        }
        long j3 = j2 + 4;
        while (this.l.iterator().hasNext()) {
            j3 = j3 + 2 + r0.next().length;
        }
        return j3;
    }

    public final String[] c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.g) {
            try {
                arrayList.add(wka0.q0(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList(this.g.size());
        Iterator<byte[]> it = this.g.iterator();
        while (it.hasNext()) {
            arrayList.add(skd.c(0, it.next()));
        }
        return arrayList;
    }

    public final String[] e() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f) {
            try {
                str = tki0.q0(new khc(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                str = "not parsable";
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList(this.f.size());
        Iterator<byte[]> it = this.f.iterator();
        while (it.hasNext()) {
            arrayList.add(skd.c(0, it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvcDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.a);
        sb.append(", avcProfileIndication=");
        sb.append(this.b);
        sb.append(", profileCompatibility=");
        sb.append(this.c);
        sb.append(", avcLevelIndication=");
        sb.append(this.d);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.e);
        sb.append(", hasExts=");
        sb.append(this.h);
        sb.append(", chromaFormat=");
        sb.append(this.i);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.j);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.k);
        sb.append(", lengthSizeMinusOnePaddingBits=");
        sb.append(this.m);
        sb.append(", numberOfSequenceParameterSetsPaddingBits=");
        sb.append(this.n);
        sb.append(", chromaFormatPaddingBits=");
        sb.append(this.o);
        sb.append(", bitDepthLumaMinus8PaddingBits=");
        sb.append(this.p);
        sb.append(", bitDepthChromaMinus8PaddingBits=");
        return vu5.b(sb, this.q, '}');
    }
}
