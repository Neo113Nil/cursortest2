package com.ybsdk.screens.menu.presentation;

import com.ybsdk.core.analytics.generated.delegates.MenuEvents$MenuScreenLoadedResult;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import defpackage.dn10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk10;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.menu.presentation.MenuViewModel$loadMenuScreenData$1", f = "MenuViewModel.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MenuViewModel$loadMenuScreenData$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $shouldShowLoadingState;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuViewModel$loadMenuScreenData$1(boolean z, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$shouldShowLoadingState = z;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MenuViewModel$loadMenuScreenData$1(this.$shouldShowLoadingState, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MenuViewModel$loadMenuScreenData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        RequestStatus$Data$Source requestStatus$Data$Source = null;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$shouldShowLoadingState) {
                pz40 Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, dn10.a((dn10) value, new t8j0(), false, 30)));
            }
            this.this$0.G.J.a.a("menu_screen.initiated", null);
            com.ybsdk.screens.menu.domain.a aVar = this.this$0.H;
            this.label = 1;
            a = aVar.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        b bVar = this.this$0;
        if (!(a instanceof Result.Failure)) {
            pk10 pk10Var = (pk10) a;
            bVar.c0(MenuEvents$MenuScreenLoadedResult.OK, null);
            pz40 Y2 = bVar.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, dn10.a((dn10) value3, new r8j0(pk10Var, requestStatus$Data$Source, 14), false, 30)));
        }
        b bVar2 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            bVar2.getClass();
            bVar2.c0(MenuEvents$MenuScreenLoadedResult.ERROR, a2.getMessage());
            pz40 Y3 = bVar2.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, dn10.a((dn10) value2, new s8j0(a2), false, 30)));
        }
        return zy11.a;
    }
}
