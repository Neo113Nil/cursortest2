package xsna;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: AudioWaveVoiceoverStubController.kt */
/* loaded from: classes18.dex */
public final class k05 implements zz4 {
    public final Object a;
    public Object b;
    public Object c;

    public k05(mwo0 mwo0Var) {
        this.a = mwo0Var;
    }

    @Override // xsna.zz4
    public yz4 a(oy4 oy4Var) {
        j05 j05Var = (j05) this.b;
        if (oy4Var.r) {
            if (j05Var == null) {
                float f = fz4.L;
                float f2 = fz4.K;
                long[] jArr = z4h0.f;
                float f3 = igs.m * (1 / z4h0.h);
                float f4 = jfp0.u;
                j05Var = new j05(new i05(f, f2, f3, f4 - (fz4.I * 2.0f), Math.max(dn70.a() * 0.2f, fz4.J - f), f4, oy4Var.c - oy4Var.b, null));
            }
            this.b = j05Var;
        }
        return j05Var;
    }

    @Override // xsna.zz4
    public void b(oy4 oy4Var) {
        this.b = null;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public String c(long j, long j2, int i, String str) {
        ArrayList arrayList = (ArrayList) this.a;
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = (ArrayList) this.b;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            sb.append((String) arrayList.get(i2));
            if (((Integer) arrayList3.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) arrayList3.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i2), Long.valueOf(j)));
            } else if (((Integer) arrayList3.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i2), Integer.valueOf(i)));
            } else if (((Integer) arrayList3.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i2), Long.valueOf(j2)));
            }
        }
        sb.append((String) arrayList.get(arrayList3.size()));
        return sb.toString();
    }

    public k05(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }
}
