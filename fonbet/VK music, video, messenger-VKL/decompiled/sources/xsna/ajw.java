package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class ajw implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ izs c;

    public ajw(wow wowVar, izs izsVar) {
        this.b = wowVar;
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
        boolean z = true;
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            ImageGalleryItem.ImageGalleryImageItem imageGalleryImageItem = (ImageGalleryItem.ImageGalleryImageItem) this.b.b.get(intValue);
            aVar2.K(1694056383);
            String str = imageGalleryImageItem.d;
            izs izsVar = this.c;
            boolean J = aVar2.J(izsVar);
            if ((((i & 112) ^ 48) <= 32 || !aVar2.o(intValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = J | z;
            Object x = aVar2.x();
            if (z2 || x == a.C0011a.a) {
                x = new yiw(izsVar, intValue);
                aVar2.R(x);
            }
            bjw.b(0, aVar2, str, (gzs) x, null);
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
