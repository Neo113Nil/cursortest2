package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoFile;
import java.util.List;
import xsna.dt1;
import xsna.wkj;

/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class mjs0 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ hjs0 c;

    public mjs0(List list, hjs0 hjs0Var) {
        this.b = list;
        this.c = hjs0Var;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        String h;
        wkj wkjVar;
        dt1 dt1Var;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            atp atpVar = (atp) this.b.get(intValue);
            aVar2.K(-905565741);
            hjs0 hjs0Var = this.c;
            boolean z = hjs0Var.b;
            boolean J = aVar2.J(hjs0Var) | aVar2.y(atpVar);
            Object x = aVar2.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new icj(1, hjs0Var, atpVar);
                aVar2.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean J2 = aVar2.J(hjs0Var) | aVar2.y(atpVar);
            Object x2 = aVar2.x();
            if (J2 || x2 == obj) {
                x2 = new jjs0(hjs0Var, atpVar);
                aVar2.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            int i2 = atpVar.g;
            VideoFile videoFile = atpVar.b;
            TimelineThumbs B0 = videoFile.B0();
            nwo0 nwo0Var = B0 != null ? new nwo0(B0) : null;
            if ((nwo0Var == null || (h = nwo0Var.b(i2)) == null) && (h = ixj0.h(videoFile.e1().b)) == null) {
                h = "";
            }
            String str = atpVar.i;
            String str2 = h;
            String str3 = atpVar.h;
            if (nwo0Var == null || (wkjVar = nwo0Var.e) == null) {
                wkjVar = wkj.a.a;
            }
            if (nwo0Var == null || (dt1Var = nwo0Var.a(i2)) == null) {
                dt1.a.getClass();
                dt1Var = dt1.a.f;
            }
            zsp.a(new ysp(str2, str, str3, wkjVar, dt1Var, atpVar.e, atpVar.d, !atpVar.f, z, gzsVar, gzsVar2), null, aVar2, 0);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
