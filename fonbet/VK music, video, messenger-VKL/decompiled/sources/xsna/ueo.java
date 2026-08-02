package xsna;

import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.articles.dto.ArticlesGetOwnerPublishedResponseDto;
import com.vk.dto.common.data.VKList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ueo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ueo(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                sgi0<Integer> sgi0Var = weo.b;
                qcy<Object> qcyVar = weo.a[0];
                Integer valueOf = Integer.valueOf(this.c);
                sgi0Var.getClass();
                ((tgi0) obj).a(sgi0Var, valueOf);
                return s3q0.a;
            case 1:
                qgi0.r((tgi0) obj, "musicDynamicGridItemVhVkTile_" + this.c);
                return s3q0.a;
            default:
                ArticlesGetOwnerPublishedResponseDto articlesGetOwnerPublishedResponseDto = (ArticlesGetOwnerPublishedResponseDto) obj;
                List<ArticlesArticleDto> d = articlesGetOwnerPublishedResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        VKList vKList = new VKList(arrayList);
                        vKList.o(articlesGetOwnerPublishedResponseDto.getCount());
                        vKList.n(articlesGetOwnerPublishedResponseDto.d().size() >= 45 ? String.valueOf(this.c + 45) : null);
                        return vKList;
                    }
                    arrayList.add(ne7.B((ArticlesArticleDto) it.next(), null));
                }
        }
    }
}
