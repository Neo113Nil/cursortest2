package xsna;

import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsContentTabDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.dto.common.id.UserId;
import com.vk.search.integration.api.SearchTab;
import com.vk.search.params.api.SearchParams;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SearchInCommunityCatalogRequestFactory.kt */
/* loaded from: classes16.dex */
public final class nvh0 extends SearchRequestFactory {
    public final UserId p;
    public SearchTab q;
    public final bpn0 r;

    /* compiled from: SearchInCommunityCatalogRequestFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchTab.values().length];
            try {
                iArr[SearchTab.CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchTab.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchTab.MUSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchTab.VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchTab.PHOTOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchTab.WALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nvh0(wba wbaVar, UserId userId, SearchTab searchTab) {
        super(wbaVar, (SearchRequestFactory.a) null, 6);
        this.p = userId;
        this.q = searchTab;
        this.r = new bpn0(new w2a0(6));
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q h(String str, SearchParams searchParams, SearchRequestFactory.a aVar, boolean z) {
        CatalogGetSearchGroupsContentTabDto catalogGetSearchGroupsContentTabDto;
        wga k = k();
        UserId a2 = fkq0.a(this.p);
        switch (a.$EnumSwitchMapping$0[this.q.ordinal()]) {
            case 1:
                catalogGetSearchGroupsContentTabDto = CatalogGetSearchGroupsContentTabDto.SHORT_VIDEOS;
                break;
            case 2:
                catalogGetSearchGroupsContentTabDto = CatalogGetSearchGroupsContentTabDto.MARKET;
                break;
            case 3:
                catalogGetSearchGroupsContentTabDto = null;
                break;
            case 4:
                catalogGetSearchGroupsContentTabDto = CatalogGetSearchGroupsContentTabDto.VIDEOS;
                break;
            case 5:
                catalogGetSearchGroupsContentTabDto = CatalogGetSearchGroupsContentTabDto.PHOTOS;
                break;
            case 6:
                catalogGetSearchGroupsContentTabDto = CatalogGetSearchGroupsContentTabDto.WALL;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return rsg0.T(yfb.x(k.s(a2, str, catalogGetSearchGroupsContentTabDto))).U(new nh40(new ovh0(1, (e3a) this.r.getValue(), e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 13)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final io.reactivex.rxjava3.core.q i(String str, boolean z) {
        return h(str, this.g, this.d, z);
    }
}
