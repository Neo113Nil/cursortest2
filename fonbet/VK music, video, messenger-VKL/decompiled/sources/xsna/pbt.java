package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.GamesCatalogNotificationBadgeType;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sct;

/* compiled from: GamesCatalogEventBusImpl.kt */
@b6l(c = "com.vk.games.event.GamesCatalogEventBusImpl$handleOnGameLoadedEvent$1", f = "GamesCatalogEventBusImpl.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class pbt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ GamesCatalogNotificationBadgeType $badgeType;
    final /* synthetic */ WebApiApplication $game;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ rbt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbt(rbt rbtVar, WebApiApplication webApiApplication, GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType, spj<? super pbt> spjVar) {
        super(2, spjVar);
        this.this$0 = rbtVar;
        this.$game = webApiApplication;
        this.$badgeType = gamesCatalogNotificationBadgeType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        pbt pbtVar = new pbt(this.this$0, this.$game, this.$badgeType, spjVar);
        pbtVar.L$0 = obj;
        return pbtVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pbt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                rbt rbtVar = this.this$0;
                WebApiApplication webApiApplication = this.$game;
                GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType2 = this.$badgeType;
                kdt kdtVar = rbtVar.a;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = kdtVar.j(webApiApplication, gamesCatalogNotificationBadgeType2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = (GamesCatalogNotificationBadgeType) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType3 = this.$badgeType;
        rbt rbtVar2 = this.this$0;
        WebApiApplication webApiApplication2 = this.$game;
        if (!(failure instanceof Result.Failure) && (gamesCatalogNotificationBadgeType = (GamesCatalogNotificationBadgeType) failure) != gamesCatalogNotificationBadgeType3) {
            rbtVar2.c.e(new sct.c(webApiApplication2.b, gamesCatalogNotificationBadgeType != null ? gamesCatalogNotificationBadgeType.i() : null));
        }
        return s3q0.a;
    }
}
