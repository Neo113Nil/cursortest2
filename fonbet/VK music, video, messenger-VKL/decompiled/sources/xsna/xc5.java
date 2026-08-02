package xsna;

import androidx.compose.runtime.a;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import java.util.List;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class xc5 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ PostingAuthorUiModel c;
    public final /* synthetic */ izs d;

    public xc5(List list, PostingAuthorUiModel postingAuthorUiModel, izs izsVar) {
        this.b = list;
        this.c = postingAuthorUiModel;
        this.d = izsVar;
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
            PostingAuthorUiModel postingAuthorUiModel = (PostingAuthorUiModel) this.b.get(intValue);
            aVar2.K(1358788643);
            boolean f = epx.f(postingAuthorUiModel.e(), this.c.e());
            izs izsVar = this.d;
            boolean J = aVar2.J(izsVar) | aVar2.J(postingAuthorUiModel);
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new tc5(izsVar, postingAuthorUiModel);
                aVar2.R(x);
            }
            gzs gzsVar = (gzs) x;
            if ((((i & 112) ^ 48) <= 32 || !aVar2.o(intValue)) && (i & 48) != 32) {
                z = false;
            }
            Object x2 = aVar2.x();
            if (z || x2 == c0012a) {
                x2 = new uc5(intValue);
                aVar2.R(x2);
            }
            yc5.a(postingAuthorUiModel, f, gzsVar, egi0.b(q630.a.a, false, (izs) x2), aVar2, 0);
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
