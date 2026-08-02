package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.memories.dto.MemoriesIsNewMemoriesAvailableResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetCatalogTemplatesExtendedResponseDto;
import com.vk.api.generated.stories.dto.StoriesTemplateDto;
import com.vk.api.generated.stories.dto.StoriesTemplatePreviewDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stories.model.template.MemoriesIsNewMemoriesAvailableData;
import com.vk.dto.stories.model.template.StoryTemplateData;
import com.vk.dto.stories.model.template.StoryTemplatesContainerData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoryTemplateRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class mjm0 implements rvl0 {
    public final avl0 a;
    public final znk0 b;
    public final svl0 c;
    public final m220 d;
    public final io.reactivex.rxjava3.subjects.d<Integer> e;
    public final io.reactivex.rxjava3.subjects.h f;

    /* compiled from: StoryTemplateRepositoryImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<StoriesGetCatalogTemplatesExtendedResponseDto, StoryTemplatesContainerData> {
        @Override // xsna.izs
        public final StoryTemplatesContainerData invoke(StoriesGetCatalogTemplatesExtendedResponseDto storiesGetCatalogTemplatesExtendedResponseDto) {
            List list;
            Image image;
            List<BaseImageDto> d;
            StoriesGetCatalogTemplatesExtendedResponseDto storiesGetCatalogTemplatesExtendedResponseDto2 = storiesGetCatalogTemplatesExtendedResponseDto;
            ((svl0) this.receiver).getClass();
            int f = storiesGetCatalogTemplatesExtendedResponseDto2.f();
            Integer e = storiesGetCatalogTemplatesExtendedResponseDto2.e();
            int intValue = e != null ? e.intValue() : 0;
            List<StoriesTemplateDto> d2 = storiesGetCatalogTemplatesExtendedResponseDto2.d();
            if (d2 == null) {
                list = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList();
                for (StoriesTemplateDto storiesTemplateDto : d2) {
                    int g = storiesTemplateDto.g();
                    String f2 = storiesTemplateDto.f();
                    StoryTemplateData storyTemplateData = null;
                    if (f2 != null) {
                        String title = storiesTemplateDto.getTitle();
                        StoriesTemplatePreviewDto d3 = storiesTemplateDto.d();
                        if (d3 == null || (d = d3.d()) == null) {
                            image = null;
                        } else {
                            List<BaseImageDto> list2 = d;
                            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                            for (BaseImageDto baseImageDto : list2) {
                                arrayList2.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                            }
                            image = new Image(arrayList2);
                        }
                        int e2 = storiesTemplateDto.e();
                        Boolean i = storiesTemplateDto.i();
                        storyTemplateData = new StoryTemplateData(g, title, image, f2, i != null ? i.booleanValue() : false, Integer.valueOf(e2));
                    }
                    if (storyTemplateData != null) {
                        arrayList.add(storyTemplateData);
                    }
                }
                list = arrayList;
            }
            return new StoryTemplatesContainerData(f, intValue, list);
        }
    }

    /* compiled from: StoryTemplateRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<MemoriesIsNewMemoriesAvailableResponseDto, MemoriesIsNewMemoriesAvailableData> {
        @Override // xsna.izs
        public final MemoriesIsNewMemoriesAvailableData invoke(MemoriesIsNewMemoriesAvailableResponseDto memoriesIsNewMemoriesAvailableResponseDto) {
            MemoriesIsNewMemoriesAvailableResponseDto memoriesIsNewMemoriesAvailableResponseDto2 = memoriesIsNewMemoriesAvailableResponseDto;
            ((m220) this.receiver).getClass();
            Boolean l = memoriesIsNewMemoriesAvailableResponseDto2.l();
            Boolean k = memoriesIsNewMemoriesAvailableResponseDto2.k();
            Boolean n = memoriesIsNewMemoriesAvailableResponseDto2.n();
            Boolean d = memoriesIsNewMemoriesAvailableResponseDto2.d();
            Boolean o = memoriesIsNewMemoriesAvailableResponseDto2.o();
            Boolean j = memoriesIsNewMemoriesAvailableResponseDto2.j();
            Boolean f = memoriesIsNewMemoriesAvailableResponseDto2.f();
            Boolean bool = Boolean.TRUE;
            return new MemoriesIsNewMemoriesAvailableData(l, k, n, d, o, j, epx.f(f, bool), epx.f(memoriesIsNewMemoriesAvailableResponseDto2.g(), bool), epx.f(memoriesIsNewMemoriesAvailableResponseDto2.e(), bool), epx.f(memoriesIsNewMemoriesAvailableResponseDto2.i(), bool));
        }
    }

    public mjm0(avl0 avl0Var, znk0 znk0Var, svl0 svl0Var, m220 m220Var) {
        this.a = avl0Var;
        this.b = znk0Var;
        this.c = svl0Var;
        this.d = m220Var;
        io.reactivex.rxjava3.subjects.d<Integer> O0 = io.reactivex.rxjava3.subjects.d.O0(0);
        this.e = O0;
        this.f = O0.M0();
    }

    @Override // xsna.rvl0
    public final io.reactivex.rxjava3.core.x<MemoriesIsNewMemoriesAvailableData> a() {
        this.b.getClass();
        return rsg0.W(yfb.x(new tfx("memories.isNewMemoriesAvailable", new vp(24), new wp(21))), 7).l(new zj0(new b(1, this.d, m220.class, "map", "map(Lcom/vk/api/generated/memories/dto/MemoriesIsNewMemoriesAvailableResponseDto;)Lcom/vk/dto/stories/model/template/MemoriesIsNewMemoriesAvailableData;", 0), 29));
    }

    @Override // xsna.rvl0
    public final io.reactivex.rxjava3.core.x<StoryTemplatesContainerData> b() {
        this.a.getClass();
        tfx tfxVar = new tfx("stories.getCatalogTemplates", new wul0(0), new dq(29));
        tfxVar.f(50, 1, 100, "count");
        return rsg0.W(yfb.x(tfxVar), 7).l(new tj60(new a(1, this.c, svl0.class, "map", "map(Lcom/vk/api/generated/stories/dto/StoriesGetCatalogTemplatesExtendedResponseDto;)Lcom/vk/dto/stories/model/template/StoryTemplatesContainerData;", 0), 14));
    }

    @Override // xsna.rvl0
    public final void c(int i) {
        this.f.onNext(Integer.valueOf(i));
    }

    @Override // xsna.rvl0
    public final io.reactivex.rxjava3.core.q<Integer> d() {
        return this.f;
    }

    @Override // xsna.rvl0
    public final int e() {
        Integer P0 = this.e.P0();
        if (P0 != null) {
            return P0.intValue();
        }
        return 0;
    }

    @Override // xsna.rvl0
    public final io.reactivex.rxjava3.core.a f() {
        this.a.getClass();
        return rsg0.Z(yfb.x(new tfx("stories.templatesSetLastView", new a690(7), new v11(27))));
    }
}
