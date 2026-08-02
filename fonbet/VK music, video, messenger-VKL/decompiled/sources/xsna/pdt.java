package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsGamesCatalogDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemHeaderDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseGamesCatalogSectionDto;
import com.vk.games.model.GamesCatalogSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogRepositoryImpl.kt */
@b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl$loadNextRandomGame$2", f = "GamesCatalogRepositoryImpl.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class pdt extends SuspendLambda implements wzs<yvj, spj<? super GamesCatalogSection.e>, Object> {
    int label;
    final /* synthetic */ ldt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdt(ldt ldtVar, spj<? super pdt> spjVar) {
        super(2, spjVar);
        this.this$0 = ldtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pdt(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super GamesCatalogSection.e> spjVar) {
        return ((pdt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            iz2 A = yfb.A(new ufx("apps.getCatalogNextRandomGame", new wp(2), new cq(2)));
            this.label = 1;
            obj = evj.p(A, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        AppsGamesCatalogDto appsGamesCatalogDto = (AppsGamesCatalogDto) obj;
        List<AppsAppDto> e = appsGamesCatalogDto.e();
        ldt ldtVar = this.this$0;
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (AppsAppDto appsAppDto : e) {
            ldtVar.d.getClass();
            arrayList.add(ykg.c(appsAppDto));
        }
        this.this$0.b.a(arrayList);
        Iterator<T> it = appsGamesCatalogDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((AppsMiniappsCatalogItemDto) obj2).f() instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesListWithActionDto) {
                break;
            }
        }
        AppsMiniappsCatalogItemDto appsMiniappsCatalogItemDto = (AppsMiniappsCatalogItemDto) obj2;
        if (appsMiniappsCatalogItemDto == null) {
            return null;
        }
        ldt ldtVar2 = this.this$0;
        String i2 = appsMiniappsCatalogItemDto.i();
        if (i2 == null) {
            i2 = "";
        }
        String str = i2;
        int id = appsMiniappsCatalogItemDto.getId();
        fdt fdtVar = ldtVar2.c;
        AppsMiniappsCatalogItemHeaderDto e2 = appsMiniappsCatalogItemDto.e();
        ExploreWidgetsBaseGamesCatalogSectionDto g = appsMiniappsCatalogItemDto.g();
        AppsMiniappsCatalogItemPayloadDto f = appsMiniappsCatalogItemDto.f();
        return fdtVar.a(e2, g, f instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesListWithActionDto ? (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadGamesListWithActionDto) f : null, str, id);
    }
}
