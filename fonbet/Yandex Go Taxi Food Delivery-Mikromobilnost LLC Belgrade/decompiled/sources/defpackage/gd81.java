package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class gd81 {
    public static final s981 e = new s981();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList(64);
    public int c = 0;
    public final int d = 4096;

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.a.add(bArr);
                int binarySearch = Collections.binarySearch(this.b, bArr, e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.b.add(binarySearch, bArr);
                this.c += bArr.length;
                synchronized (this) {
                    while (this.c > this.d) {
                        byte[] bArr2 = (byte[]) this.a.remove(0);
                        this.b.remove(bArr2);
                        this.c -= bArr2.length;
                    }
                }
            }
        }
    }

    public final synchronized byte[] b(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = (byte[]) this.b.get(i2);
            if (bArr.length >= i) {
                this.c -= bArr.length;
                this.b.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
