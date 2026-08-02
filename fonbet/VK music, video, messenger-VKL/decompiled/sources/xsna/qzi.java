package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoFile;
import java.util.List;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class qzi implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qzi(int i, Object obj, List list) {
        this.b = i;
        this.c = list;
        this.d = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                ksy ksyVar = (ksy) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                izs izsVar = (izs) this.d;
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(ksyVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    xzi xziVar = (xzi) this.c.get(intValue);
                    aVar.K(2016334449);
                    long j = xziVar.a;
                    String str = xziVar.b;
                    String str2 = xziVar.c;
                    String str3 = xziVar.d;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new nzi(izsVar);
                        aVar.R(x);
                    }
                    h0j.a(j, str, str2, str3, (izs) x, null, aVar, 0);
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                Object obj5 = (ksy) obj;
                int intValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Number) obj4).intValue();
                btp btpVar = (btp) this.d;
                if ((intValue4 & 6) == 0) {
                    i2 = (aVar2.J(obj5) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= aVar2.o(intValue3) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    atp atpVar = (atp) this.c.get(intValue3);
                    aVar2.K(-1214234935);
                    boolean z = btpVar.d;
                    boolean J2 = aVar2.J(btpVar) | aVar2.y(atpVar);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == a.C0011a.a) {
                        x2 = new pjs0(btpVar, atpVar);
                        aVar2.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    VideoFile videoFile = atpVar.b;
                    String h = ixj0.h(videoFile.e1().b);
                    if (h == null) {
                        h = "";
                    }
                    String str4 = h;
                    String str5 = atpVar.i;
                    String str6 = atpVar.h;
                    int i3 = atpVar.g;
                    boolean z2 = atpVar.e;
                    boolean z3 = atpVar.d;
                    boolean z4 = !atpVar.f;
                    TimelineThumbs B0 = videoFile.B0();
                    qsp.a(new rsp(str4, str5, str6, i3, z2, z3, z4, B0 != null ? new nwo0(B0) : null, z, gzsVar), q630.a.a, aVar2, 48);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
