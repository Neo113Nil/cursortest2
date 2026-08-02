package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import java.util.List;
import xsna.q630;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class all0 implements zzs<cry, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ izs c;

    public all0(List list, izs izsVar) {
        this.b = list;
        this.c = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(cry cryVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ImageSize Fb;
        cry cryVar2 = cryVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(cryVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1942245546, i, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
            }
            GoodAlbum goodAlbum = (GoodAlbum) this.b.get(intValue);
            aVar2.K(-416994525);
            izs izsVar = this.c;
            boolean J = ((((i & 112) ^ 48) > 32 && aVar2.o(intValue)) || (i & 48) == 32) | aVar2.J(izsVar) | aVar2.y(goodAlbum);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new ykl0(izsVar, goodAlbum, intValue);
                aVar2.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            Photo photo = goodAlbum.e;
            xi1.b(0, aVar2, (photo == null || (Fb = photo.Fb(176, true)) == null) ? null : Fb.d.d, goodAlbum.d, c);
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
