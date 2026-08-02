package xsna;

import com.vk.api.generated.market.dto.MarketGetCategoriesNewResponseDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeDto;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.xn50;

/* compiled from: CityParameterFeature.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class sec extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sec(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((wj50) this.receiver).b((bfc) obj);
                return s3q0.a;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 2:
                int intValue = ((Number) obj).intValue();
                ugv ugvVar = (ugv) this.receiver;
                uuk uukVar = ugvVar.c;
                if (uukVar != null) {
                    AbstractList abstractList = ((ListDataSet) uukVar).d;
                    int i = 0;
                    while (i < abstractList.size()) {
                        wgv wgvVar = (wgv) abstractList.get(i);
                        boolean z = i == intValue;
                        if (wgvVar.f != z) {
                            wgvVar.f = z;
                            ugvVar.c.d(i);
                        }
                        s3q0 s3q0Var = s3q0.a;
                        i++;
                    }
                }
                ugvVar.e.invoke(uukVar.c(intValue));
                return s3q0.a;
            case 3:
                String str = ((uv00) this.receiver).b;
                List<MarketMarketCategoryTreeDto> d = ((MarketGetCategoriesNewResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(uv00.a((MarketMarketCategoryTreeDto) it.next()));
                }
                return new MarketBridgeCategory(-1, str, null, arrayList, null, 20, null);
            case 4:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 5:
                rt40 rt40Var = (rt40) this.receiver;
                rt40Var.getClass();
                xn50.a.c(rt40Var, (lr40) obj);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((yq70) this.receiver).a((sxp) obj));
            case 7:
                return ((vpc0) this.receiver).f((PostingState) obj);
            case 8:
                v6j0 v6j0Var = (v6j0) this.receiver;
                v6j0Var.getClass();
                xn50.a.c(v6j0Var, (t6j0) obj);
                return s3q0.a;
            case 9:
                return ((xsl0) this.receiver).j((as80) obj);
            default:
                ((com.vk.metrics.eventtracking.b) this.receiver).q((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sec(Object obj, int i) {
        super(1, obj, uv00.class, "mapResponse", "mapResponse(Lcom/vk/api/generated/market/dto/MarketGetCategoriesNewResponseDto;)Lcom/vk/ecomm/categories/api/MarketBridgeCategory;", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
            case 6:
            case 8:
            default:
                break;
            case 7:
                super(1, obj, vpc0.class, "mapToolbarViewState", "mapToolbarViewState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/presentation/model/PostingToolbarViewState;", 0);
                break;
            case 9:
                super(1, obj, xsl0.class, "preloadStoriesContainerContent", "preloadStoriesContainerContent(Lcom/vk/story/api/domain/interactor/common/OpenStoriesRequest;)Lio/reactivex/rxjava3/disposables/Disposable;", 0);
                break;
            case 10:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
