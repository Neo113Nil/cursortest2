package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: CencSampleAuxiliaryDataFormat.java */
/* loaded from: classes14.dex */
public final class kpa {
    public byte[] a = new byte[0];
    public j[] b = null;

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public abstract class a implements j {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            j jVar = (j) obj;
            return clear() == jVar.clear() && a() == jVar.a();
        }

        public final String toString() {
            return "P(" + clear() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a() + ")";
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class b extends a {
        public byte a;
        public byte b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class c extends a {
        public byte a;
        public int b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class d extends a {
        public byte a;
        public long b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class e extends a {
        public byte a;
        public short b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class f extends a {
        public int a;
        public byte b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class g extends a {
        public int a;
        public int b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class h extends a {
        public int a;
        public long b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class i extends a {
        public int a;
        public short b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public interface j {
        long a();

        int clear();
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class k extends a {
        public short a;
        public byte b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class l extends a {
        public short a;
        public int b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class m extends a {
        public short a;
        public long b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public class n extends a {
        public short a;
        public short b;

        @Override // xsna.kpa.j
        public final long a() {
            return this.b;
        }

        @Override // xsna.kpa.j
        public final int clear() {
            return this.a;
        }
    }

    public static a a(int i2, long j2) {
        if (i2 <= 127) {
            if (j2 <= 127) {
                b bVar = new b();
                bVar.a = (byte) i2;
                bVar.b = (byte) j2;
                return bVar;
            }
            if (j2 <= 32767) {
                e eVar = new e();
                eVar.a = (byte) i2;
                eVar.b = (short) j2;
                return eVar;
            }
            if (j2 <= 2147483647L) {
                c cVar = new c();
                cVar.a = (byte) i2;
                cVar.b = (int) j2;
                return cVar;
            }
            d dVar = new d();
            dVar.a = (byte) i2;
            dVar.b = j2;
            return dVar;
        }
        if (i2 <= 32767) {
            if (j2 <= 127) {
                k kVar = new k();
                kVar.a = (short) i2;
                kVar.b = (byte) j2;
                return kVar;
            }
            if (j2 <= 32767) {
                n nVar = new n();
                nVar.a = (short) i2;
                nVar.b = (short) j2;
                return nVar;
            }
            if (j2 <= 2147483647L) {
                l lVar = new l();
                lVar.a = (short) i2;
                lVar.b = (int) j2;
                return lVar;
            }
            m mVar = new m();
            mVar.a = (short) i2;
            mVar.b = j2;
            return mVar;
        }
        if (j2 <= 127) {
            f fVar = new f();
            fVar.a = i2;
            fVar.b = (byte) j2;
            return fVar;
        }
        if (j2 <= 32767) {
            i iVar = new i();
            iVar.a = i2;
            iVar.b = (short) j2;
            return iVar;
        }
        if (j2 <= 2147483647L) {
            g gVar = new g();
            gVar.a = i2;
            gVar.b = (int) j2;
            return gVar;
        }
        h hVar = new h();
        hVar.a = i2;
        hVar.b = j2;
        return hVar;
    }

    public final int b() {
        int length = this.a.length;
        j[] jVarArr = this.b;
        if (jVarArr == null || jVarArr.length <= 0) {
            return length;
        }
        return (jVarArr.length * 6) + length + 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kpa.class != obj.getClass()) {
            return false;
        }
        kpa kpaVar = (kpa) obj;
        if (!new BigInteger(this.a).equals(new BigInteger(kpaVar.a))) {
            return false;
        }
        j[] jVarArr = this.b;
        j[] jVarArr2 = kpaVar.b;
        return jVarArr == null ? jVarArr2 == null : Arrays.equals(jVarArr, jVarArr2);
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        j[] jVarArr = this.b;
        return hashCode + (jVarArr != null ? Arrays.hashCode(jVarArr) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry{iv=");
        sb.append(skd.c(0, this.a));
        sb.append(", pairs=");
        return ho8.a(sb, Arrays.toString(this.b), '}');
    }
}
