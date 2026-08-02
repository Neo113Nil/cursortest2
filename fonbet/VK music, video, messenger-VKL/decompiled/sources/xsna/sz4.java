package xsna;

import android.util.Range;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.qy4;

/* compiled from: AudioTracksSampleController.kt */
/* loaded from: classes3.dex */
public final class sz4 {
    public final f100 a;
    public final ArrayList b;
    public final Range<Long> c;
    public final long[] d;
    public final long[] e;
    public final a[] f;
    public final Boolean[] g;
    public final Boolean[] h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioTracksSampleController.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a EXTRACTOR;
        public static final a NONE;
        public static final a SILENT;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a("EXTRACTOR", 1);
            EXTRACTOR = aVar2;
            a aVar3 = new a("SILENT", 2);
            SILENT = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: AudioTracksSampleController.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.EXTRACTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SILENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sz4(f100 f100Var, ArrayList arrayList, Range range, long j) {
        this.a = f100Var;
        this.b = arrayList;
        this.c = range;
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = j;
        }
        this.d = jArr;
        long[] jArr2 = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr2[i2] = -2;
        }
        this.e = jArr2;
        a[] aVarArr = new a[size];
        for (int i3 = 0; i3 < size; i3++) {
            aVarArr[i3] = a.NONE;
        }
        this.f = aVarArr;
        Boolean[] boolArr = new Boolean[size];
        for (int i4 = 0; i4 < size; i4++) {
            boolArr[i4] = Boolean.FALSE;
        }
        this.g = boolArr;
        Boolean[] boolArr2 = new Boolean[size];
        for (int i5 = 0; i5 < size; i5++) {
            boolArr2[i5] = Boolean.FALSE;
        }
        this.h = boolArr2;
    }

    public final qy4.c a(int i) {
        long longValue;
        long j;
        a[] aVarArr = this.f;
        a aVar = aVarArr[i];
        aVarArr[i] = a.SILENT;
        int i2 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        Boolean[] boolArr = this.g;
        Range<Long> range = this.c;
        long[] jArr = this.d;
        if (i2 == 1) {
            long longValue2 = range.getUpper().longValue() - jArr[i];
            boolArr[i] = Boolean.TRUE;
            if (longValue2 > 0) {
                c(i, range.getUpper().longValue());
                return new qy4.c(longValue2);
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                long j2 = jArr[i];
                ArrayList arrayList = this.b;
                if (j2 <= ((kz4) arrayList.get(i)).a) {
                    longValue = ((kz4) arrayList.get(i)).a;
                    j = jArr[i];
                } else {
                    boolArr[i] = Boolean.TRUE;
                    longValue = range.getUpper().longValue();
                    j = jArr[i];
                }
                long j3 = longValue - j;
                c(i, jArr[i] + j3);
                return new qy4.c(j3);
            }
            f100 f100Var = this.a;
            if (f100Var != null) {
                f100Var.a("AudioTracksSampleController", new IllegalStateException("retrieving sequential silence samples"));
                return null;
            }
        }
        return null;
    }

    public final boolean b(int i) {
        kz4 kz4Var = (kz4) this.b.get(i);
        long j = this.d[i];
        if (this.h[i].booleanValue()) {
            return false;
        }
        long j2 = kz4Var.a;
        return j >= j2 && j < j2 + kz4Var.h;
    }

    public final void c(int i, long j) {
        this.d[i] = Math.min(j, this.c.getUpper().longValue());
    }

    public final void d(int i, long j) {
        int i2 = b.$EnumSwitchMapping$0[this.f[i].ordinal()];
        long[] jArr = this.e;
        ArrayList arrayList = this.b;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!this.g[i].booleanValue()) {
                c(i, ((kz4) arrayList.get(i)).a);
            }
        } else if (j > ((kz4) arrayList.get(i)).b) {
            c(i, ((kz4) arrayList.get(i)).a + ((kz4) arrayList.get(i)).h);
        } else if (this.h[i].booleanValue()) {
            c(i, ((kz4) arrayList.get(i)).j);
        } else {
            c(i, an10.c((j - jArr[i]) / ((kz4) arrayList.get(i)).d) + this.d[i]);
        }
        if (j != -2) {
            jArr[i] = j;
        }
    }
}
