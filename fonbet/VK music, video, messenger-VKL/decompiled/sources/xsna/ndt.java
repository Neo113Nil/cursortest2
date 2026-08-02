package xsna;

import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsActivityItemDto;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppFieldsDto;
import com.vk.api.generated.apps.dto.AppsGetActivityPlatformDto;
import com.vk.api.generated.apps.dto.AppsGetActivityResponseDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.GamesCatalogActivityType;
import com.vk.games.model.GamesCatalogSection;
import com.vk.games.model.GamesCatalogUser;
import com.vk.games.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogRepositoryImpl.kt */
@b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl$loadActivity$2", f = "GamesCatalogRepositoryImpl.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ndt extends SuspendLambda implements wzs<yvj, spj<? super uat>, Object> {
    final /* synthetic */ int $count;
    final /* synthetic */ int $offset;
    int label;
    final /* synthetic */ ldt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndt(ldt ldtVar, int i, int i2, spj<? super ndt> spjVar) {
        super(2, spjVar);
        this.this$0 = ldtVar;
        this.$offset = i;
        this.$count = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ndt(this.this$0, this.$offset, this.$count, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super uat> spjVar) {
        return ((ndt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Object p;
        a.C1079a c1079a;
        WebApiApplication d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            AppsGetActivityPlatformDto appsGetActivityPlatformDto = AppsGetActivityPlatformDto.HTML5;
            List l = e43.l("sex", "photo_base");
            q73 q73Var = this.this$0.e;
            Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
            List a = WebApiApplication.a.a();
            q73Var.getClass();
            ArrayList b = q73.b(a);
            String valueOf = String.valueOf(this.$offset);
            Integer num = new Integer(this.$count);
            ufx ufxVar = new ufx("apps.getActivity", new hq(1), new iq(1));
            if (appsGetActivityPlatformDto != null) {
                ufx.n(ufxVar, "platform", appsGetActivityPlatformDto.i(), 0, 12);
            }
            if (l != null) {
                ufxVar.h("fields", l);
            }
            if (b != null) {
                arrayList = new ArrayList(c5g.u(b, 10));
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AppsAppFieldsDto) it.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ufxVar.h("app_fields", arrayList);
            }
            if (valueOf != null) {
                ufx.n(ufxVar, "start_from", valueOf, 0, 12);
            }
            ufxVar.f(num.intValue(), 0, 1000, "count");
            iz2 A = yfb.A(ufxVar);
            this.label = 1;
            p = evj.p(A, this);
            if (p == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            p = obj;
        }
        AppsGetActivityResponseDto appsGetActivityResponseDto = (AppsGetActivityResponseDto) p;
        List<AppsAppDto> d2 = appsGetActivityResponseDto.d();
        ldt ldtVar = this.this$0;
        ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
        for (AppsAppDto appsAppDto : d2) {
            ldtVar.d.getClass();
            arrayList2.add(ykg.c(appsAppDto));
        }
        this.this$0.b.a(arrayList2);
        this.this$0.b.c(appsGetActivityResponseDto.f());
        het hetVar = this.this$0.a.c;
        List<AppsActivityItemDto> e = appsGetActivityResponseDto.e();
        hetVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (AppsActivityItemDto appsActivityItemDto : e) {
            cct cctVar = hetVar.c.a;
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) cctVar.b.get(appsActivityItemDto.getUserId());
            if (usersUserFullDto == null) {
                c1079a = null;
            } else {
                sbt sbtVar = (appsActivityItemDto.j() == AppsActivityItemDto.TypeDto.STICKERS_ACHIEVEMENT || (d = cctVar.d((long) appsActivityItemDto.d())) == null) ? null : new sbt(d, null, d.w, new String(), null, null, null, null, 242);
                GamesCatalogUser a2 = eat.a(usersUserFullDto);
                GamesCatalogActivityType a3 = dat.a(appsActivityItemDto.j());
                int e2 = appsActivityItemDto.e();
                Integer k = appsActivityItemDto.k();
                Integer g = appsActivityItemDto.g();
                String i2 = appsActivityItemDto.i();
                List<BaseImageDto> f = appsActivityItemDto.f();
                c1079a = new a.C1079a(new GamesCatalogSection.a.C1078a(sbtVar, a2, a3, e2, k, g, i2, f != null ? dat.b(f) : null));
            }
            if (c1079a != null) {
                arrayList3.add(c1079a);
            }
        }
        return new uat(1, arrayList3, !appsGetActivityResponseDto.e().isEmpty());
    }
}
