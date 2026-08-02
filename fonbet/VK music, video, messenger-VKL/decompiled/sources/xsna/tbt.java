package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.games.model.GamesCatalogSection;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.edt;
import xsna.iet;
import xsna.udt;

/* compiled from: GamesCatalogFeature.kt */
@b6l(c = "com.vk.games.presentation.catalog.mvi.GamesCatalogFeature$launchGenerateNextGame$1", f = "GamesCatalogFeature.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class tbt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ GamesCatalogScreenTab $tab;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xbt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbt(xbt xbtVar, GamesCatalogScreenTab gamesCatalogScreenTab, spj<? super tbt> spjVar) {
        super(2, spjVar);
        this.this$0 = xbtVar;
        this.$tab = gamesCatalogScreenTab;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        tbt tbtVar = new tbt(this.this$0, this.$tab, spjVar);
        tbtVar.L$0 = obj;
        return tbtVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tbt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                ddt ddtVar = this.this$0.f;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = ddtVar.a.d(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = (GamesCatalogSection.e) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        xbt xbtVar = this.this$0;
        GamesCatalogScreenTab gamesCatalogScreenTab = this.$tab;
        if (!(failure instanceof Result.Failure)) {
            GamesCatalogSection.e eVar = (GamesCatalogSection.e) failure;
            if (eVar != null) {
                String str = eVar.b;
                wdt wdtVar = eVar.c;
                xbtVar.T(new edt.f.C2795f(new udt.c(str, wdtVar != null ? ydt.a(wdtVar, str) : null, d7t.a(eVar)), gamesCatalogScreenTab));
            } else {
                xbtVar.getClass();
                xbtVar.X(iet.l.a);
                xbtVar.T(new edt.f.b(gamesCatalogScreenTab));
            }
        }
        xbt xbtVar2 = this.this$0;
        GamesCatalogScreenTab gamesCatalogScreenTab2 = this.$tab;
        if (Result.a(failure) != null) {
            xbtVar2.getClass();
            xbtVar2.X(iet.l.a);
            xbtVar2.T(new edt.f.b(gamesCatalogScreenTab2));
        }
        return s3q0.a;
    }
}
