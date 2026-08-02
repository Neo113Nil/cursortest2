package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsGetRequestsPlatformDto;
import com.vk.api.generated.apps.dto.AppsGetRequestsResponseDto;
import com.vk.api.generated.apps.dto.AppsRequestItemDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.GamesCatalogSection;
import com.vk.games.model.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogRepositoryImpl.kt */
@b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl$loadNotifications$2", f = "GamesCatalogRepositoryImpl.kt", l = {113, 125}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class qdt extends SuspendLambda implements wzs<yvj, spj<? super uat>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ldt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdt(ldt ldtVar, spj<? super qdt> spjVar) {
        super(2, spjVar);
        this.this$0 = ldtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qdt(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super uat> spjVar) {
        return ((qdt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0070, code lost:
    
        if (r2 == r1) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            AppsGetRequestsPlatformDto appsGetRequestsPlatformDto = AppsGetRequestsPlatformDto.HTML5;
            List l = e43.l("sex", "photo_base");
            ufx ufxVar = new ufx("apps.getRequests", new sr(2), new tr(2));
            ufx.n(ufxVar, "platform", appsGetRequestsPlatformDto.i(), 0, 12);
            if (l != null) {
                ufxVar.h("fields", l);
            }
            ufxVar.i("group", true);
            iz2 A = yfb.A(ufxVar);
            this.label = 1;
            p = evj.p(A, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uat uatVar = (uat) this.L$1;
                kotlin.a.a(obj);
                return uatVar;
            }
            kotlin.a.a(obj);
            p = obj;
        }
        AppsGetRequestsResponseDto appsGetRequestsResponseDto = (AppsGetRequestsResponseDto) p;
        List<AppsAppDto> d = appsGetRequestsResponseDto.d();
        ldt ldtVar = this.this$0;
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (AppsAppDto appsAppDto : d) {
            ldtVar.d.getClass();
            arrayList.add(ykg.c(appsAppDto));
        }
        this.this$0.b.a(arrayList);
        this.this$0.b.c(appsGetRequestsResponseDto.f());
        het hetVar = this.this$0.a.c;
        List<AppsRequestItemDto> e = appsGetRequestsResponseDto.e();
        hetVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = e.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            AppsRequestItemDto appsRequestItemDto = (AppsRequestItemDto) it.next();
            dat datVar = hetVar.c;
            WebApiApplication d2 = datVar.a.d(appsRequestItemDto.d());
            if (d2 != null) {
                GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo b = eat.b(appsRequestItemDto, new sbt(d2, null, d2.w, new String(), null, null, null, null, 242), new lrk(datVar, 17));
                if (b != null) {
                    obj2 = b.e ? new a.e(b) : new a.c(b);
                }
            }
            if (obj2 != null) {
                arrayList2.add(obj2);
            }
        }
        uat uatVar2 = new uat(1, j5g.D0(new oz2(2), arrayList2), false);
        List<com.vk.games.model.a> list = uatVar2.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((com.vk.games.model.a) it2.next()) instanceof a.e) {
                    ldt ldtVar2 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = uatVar2;
                    this.label = 2;
                    if (ldtVar2.g(this) == coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return uatVar2;
    }
}
