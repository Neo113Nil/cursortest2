package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.q630;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class wzk implements zzs<cry, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ k9x b;
    public final /* synthetic */ wz8 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ izs<Integer, s3q0> f;
    public final /* synthetic */ eai0 g;
    public final /* synthetic */ vxk h;

    /* JADX WARN: Multi-variable type inference failed */
    public wzk(k9x k9xVar, wz8 wz8Var, int i, int i2, izs<? super Integer, s3q0> izsVar, eai0 eai0Var, vxk vxkVar) {
        this.b = k9xVar;
        this.c = wz8Var;
        this.d = i;
        this.e = i2;
        this.f = izsVar;
        this.g = eai0Var;
        this.h = vxkVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(cry cryVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 48) == 0) {
            intValue2 |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(674613074, intValue2, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2088)");
            }
            int i = intValue + this.b.b;
            String a = vz8.a(i, this.c.a, 7);
            q630 n = txj0.n(q630.a.a, zzk.D, zzk.C);
            boolean z = i == this.d;
            boolean z2 = i == this.e;
            izs<Integer, s3q0> izsVar = this.f;
            boolean J = aVar2.J(izsVar) | aVar2.o(i);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new sif(i, 1, izsVar);
                aVar2.R(x);
            }
            this.g.getClass();
            lzk.m(a, n, z, z2, (gzs) x, true, String.format(e7b0.b(R.string.m3c_date_picker_navigate_to_year_description, aVar2), Arrays.copyOf(new Object[]{a}, 1)), this.h, aVar2, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
