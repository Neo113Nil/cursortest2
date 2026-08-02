package xsna;

import android.content.res.ColorStateList;
import android.widget.TextView;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.photos.dto.PhotosPhotoFeedGetResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetV5113ResponseDto;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.params.api.SearchParamsWithCity;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.xn50;

/* compiled from: AllInOnePollFragment.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class ou1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SubscribeStatus subscribeStatus;
        Integer m;
        switch (this.b) {
            case 0:
                nu1 nu1Var = (nu1) this.receiver;
                nu1Var.getClass();
                xn50.a.c(nu1Var, (xrb0) obj);
                return s3q0.a;
            case 1:
                xje xjeVar = (xje) this.receiver;
                xjeVar.getClass();
                xn50.a.c(xjeVar, (uje) obj);
                return s3q0.a;
            case 2:
                kym0 kym0Var = (kym0) obj;
                com.vk.profile.community.impl.ui.profile.a aVar = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
                aVar.getClass();
                if (epx.f(kym0Var.b, aVar.i.a) && (subscribeStatus = kym0Var.a) != aVar.L) {
                    aVar.L = subscribeStatus;
                    aVar.C(new CommunityProfileAction.o(false));
                }
                return s3q0.a;
            case 3:
                ((pzh0) this.receiver).n((set0) obj);
                return s3q0.a;
            case 4:
                ((e3a) this.receiver).getClass();
                return e3a.c((CatalogCatalogResponseObjectDto) obj);
            case 5:
                String str = (String) obj;
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) this.receiver;
                if (epx.f(musicCatalogRootVh.I.r, vyh0.a) && str != null && str.length() != 0) {
                    hqh0 hqh0Var = musicCatalogRootVh.B;
                    SearchInputMethod searchInputMethod = SearchInputMethod.GoogleVoice;
                    hqh0Var.r = str;
                    hqh0Var.a().T(str, searchInputMethod, null, null);
                }
                return s3q0.a;
            case 6:
                ((pj70) this.receiver).getClass();
                Map map = obj instanceof Map ? (Map) obj : null;
                Object obj2 = map != null ? map.get("count") : null;
                if (obj2 instanceof Number) {
                    r2 = ((Number) obj2).intValue();
                } else if ((obj2 instanceof String) && (m = arm0.m(10, (String) obj2)) != null) {
                    r2 = m.intValue();
                }
                return Integer.valueOf(r2);
            case 7:
                ri80 ri80Var = (ri80) this.receiver;
                ri80Var.getClass();
                xn50.a.c(ri80Var, (xrb0) obj);
                return s3q0.a;
            case 8:
                ((ufa0) this.receiver).getClass();
                return ufa0.a((PhotosPhotoFeedGetResponseDto) obj);
            case 9:
                dxh0 dxh0Var = (dxh0) this.receiver;
                dxh0Var.getClass();
                dxh0Var.c.Tn(((SearchParamsWithCity) obj).I() ? 8 : 0);
                return s3q0.a;
            case 10:
                return ((rsl0) this.receiver).a((StoriesGetV5113ResponseDto) obj);
            case 11:
                ((TextView) this.receiver).setTextColor((ColorStateList) obj);
                return s3q0.a;
            case 12:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) this.receiver;
                int i = VideoProfileFragmentOld.p0;
                return videoProfileFragmentOld.getFeature().Y((c9t0) obj);
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou1(Object obj, int i) {
        super(1, obj, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, MusicCatalogRootVh.class, "onVoiceSearchResult", "onVoiceSearchResult(Ljava/lang/String;)V", 0);
                break;
            case 6:
                super(1, obj, pj70.class, "parse", "parse(Ljava/lang/Object;)I", 0);
                break;
            case 7:
            case 10:
            case 11:
            case 12:
            default:
                break;
            case 8:
                super(1, obj, ufa0.class, "map", "map(Lcom/vk/api/generated/photos/dto/PhotosPhotoFeedGetResponseDto;)Lcom/vk/dto/common/data/VKList;", 0);
                break;
            case 9:
                super(1, obj, dxh0.class, "updateEndTitleButtonVisibility", "updateEndTitleButtonVisibility(Lcom/vk/search/params/api/SearchParamsWithCity;)V", 0);
                break;
            case 13:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou1(rsl0 rsl0Var) {
        super(1, rsl0Var, rsl0.class, "map", "map(Lcom/vk/api/generated/stories/dto/StoriesGetV5113ResponseDto;)Lcom/vk/dto/stories/model/GetStoriesResponse;", 0);
        this.b = 10;
    }
}
