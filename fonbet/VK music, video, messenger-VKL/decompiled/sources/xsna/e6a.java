package xsna;

import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogGetShortVideoSearchScreenRefDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.toggle.features.SearchFeatures;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CatalogGetClipsSearchRequestFactory.kt */
/* loaded from: classes16.dex */
public final class e6a extends com.vk.catalog2.common.dto.api.a {
    public String s;

    /* compiled from: CatalogGetClipsSearchRequestFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogGetShortVideoSearchScreenRefDto.values().length];
            try {
                iArr[CatalogGetShortVideoSearchScreenRefDto.SEARCH_CLIPS_SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogGetShortVideoSearchScreenRefDto.SEARCH_CLIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogGetClipsSearchRequestFactory.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.c(catalogCatalogResponseObjectDto);
        }
    }

    public e6a(wba wbaVar, kca kcaVar) {
        super(wbaVar, new d6a(0, kcaVar, kca.class, "loadRecentQueries", "loadRecentQueries()Lio/reactivex/rxjava3/core/Single;", 0, 0), "local_block_id", null, null, 24);
    }

    @Override // com.vk.catalog2.common.dto.api.a
    public final io.reactivex.rxjava3.core.x<hda> p(String str) {
        CatalogGetShortVideoSearchScreenRefDto catalogGetShortVideoSearchScreenRefDto;
        CatalogGetShortVideoSearchScreenRefDto[] values = CatalogGetShortVideoSearchScreenRefDto.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                catalogGetShortVideoSearchScreenRefDto = null;
                break;
            }
            CatalogGetShortVideoSearchScreenRefDto catalogGetShortVideoSearchScreenRefDto2 = values[i];
            if (epx.f(catalogGetShortVideoSearchScreenRefDto2.i(), this.s)) {
                catalogGetShortVideoSearchScreenRefDto = catalogGetShortVideoSearchScreenRefDto2;
                break;
            }
            i++;
        }
        int i2 = catalogGetShortVideoSearchScreenRefDto == null ? -1 : a.$EnumSwitchMapping$0[catalogGetShortVideoSearchScreenRefDto.ordinal()];
        if (i2 == 1) {
            SearchFeatures searchFeatures = SearchFeatures.HUB_CLIPS_SUGGESTER;
            searchFeatures.getClass();
            z = com.vk.toggle.b.A.a(searchFeatures);
        } else if (i2 == 2) {
            z = true;
        }
        if (!z) {
            String str2 = this.s;
            SearchRequestFactory.InputMethod inputMethod = this.k;
            return rsg0.w0(new s6a(this.c, str, str2, inputMethod != null ? inputMethod.h() : null));
        }
        String str3 = null;
        wga k = k();
        Integer valueOf = z ? Integer.valueOf(this.h ? 1 : 0) : null;
        boolean z2 = this.j;
        String str4 = (z && this.k == SearchRequestFactory.InputMethod.Suggest) ? this.f : null;
        SearchRequestFactory.InputMethod inputMethod2 = this.k;
        if (inputMethod2 != null) {
            str3 = inputMethod2.h();
        }
        return rsg0.W(yfb.x(k.h(str, catalogGetShortVideoSearchScreenRefDto, Boolean.valueOf(z2), valueOf, str4, str3)), 7).l(new ux0(new b(1, j(), e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 7)).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
