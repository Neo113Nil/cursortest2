package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.phw;

/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class r2h implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ izs c;

    public r2h(ArrayList arrayList, izs izsVar) {
        this.b = arrayList;
        this.c = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
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
            f2h f2hVar = (f2h) this.b.get(intValue);
            aVar2.K(-1539520062);
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(js5.a(100, f2hVar.b), null, null, null, aVar2, 0, 62), null, null, null, null, aVar2, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, aVar2, 100663344, 252), null, aVar2, 2);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(f2hVar.c, null, null, 0, null, null, aVar2, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar2, 196608, 30);
            izs izsVar = this.c;
            boolean J = aVar2.J(izsVar) | aVar2.y(f2hVar);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new com.vk.profile.community.impl.ui.events.c(izsVar, f2hVar);
                aVar2.R(x);
            }
            wiu0.b(null, false, a, a2, null, (gzs) x, null, aVar2, 0, 83);
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
