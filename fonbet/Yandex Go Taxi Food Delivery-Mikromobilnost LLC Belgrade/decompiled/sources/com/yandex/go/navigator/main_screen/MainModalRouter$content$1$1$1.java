package com.yandex.go.navigator.main_screen;

import android.net.Uri;
import com.yandex.go.navigator.analitycs.NavigationAnalytics$SettingsSource;
import defpackage.gdp;
import defpackage.iez;
import defpackage.jl40;
import defpackage.k700;
import defpackage.m700;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n700;
import defpackage.ndr0;
import defpackage.ny61;
import defpackage.o700;
import defpackage.p700;
import defpackage.q700;
import defpackage.qu;
import defpackage.r700;
import defpackage.s700;
import defpackage.sy60;
import defpackage.t700;
import defpackage.tle;
import defpackage.tse;
import defpackage.u700;
import defpackage.ule;
import defpackage.v700;
import defpackage.w511;
import defpackage.w700;
import defpackage.wle;
import defpackage.wls;
import defpackage.xle;
import defpackage.zle;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainModalRouter$content$1$1$1", f = "MainModalRouter.kt", l = {128}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ w700 $action;
    final /* synthetic */ k700 $innerNavigator;
    final /* synthetic */ k $mainModalUiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainModalRouter$content$1$1$1(k kVar, w700 w700Var, k700 k700Var, Continuation continuation) {
        super(2, continuation);
        this.$mainModalUiActionInteractor = kVar;
        this.$action = w700Var;
        this.$innerNavigator = k700Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainModalRouter$content$1$1$1(this.$mainModalUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0117 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.$mainModalUiActionInteractor;
        w700 w700Var = this.$action;
        k700 k700Var = this.$innerNavigator;
        this.label = 1;
        com.yandex.go.navigator.analitycs.a aVar = kVar.f;
        if (!(w700Var instanceof u700)) {
            if (!(w700Var instanceof n700)) {
                if (jl40.l(w700Var, r700.a)) {
                    aVar.h();
                    obj2 = kVar.a(k700Var, this);
                } else if (jl40.l(w700Var, q700.a)) {
                    kVar.c.a();
                } else if (jl40.l(w700Var, v700.a)) {
                    kVar.b.a();
                } else if (jl40.l(w700Var, s700.a)) {
                    aVar.i();
                    k700Var.a.r(new iez(17));
                } else if (jl40.l(w700Var, t700.a)) {
                    aVar.j();
                    k700Var.a.r(new iez(18));
                } else if (w700Var instanceof o700) {
                    zle zleVar = ((o700) w700Var).a;
                    if (zleVar != null) {
                        kVar.g.d(zleVar.getId());
                        if (zleVar instanceof tle) {
                            kVar.a.a(Uri.parse(((tle) zleVar).b), DeeplinkSource.UNSPECIFIED);
                        } else if (zleVar instanceof ule) {
                            k700Var.getClass();
                        } else if (zleVar instanceof wle) {
                            obj2 = kVar.a(k700Var, this);
                        } else if (zleVar instanceof xle) {
                            i iVar = k700Var.a;
                            iVar.A((m950) iVar.I.get(), new ndr0(NavigationAnalytics$SettingsSource.MainScreen), sy60.Q2);
                        }
                    }
                } else if (w700Var instanceof m700) {
                    k700Var.a.r(new gdp(((m700) w700Var).a, 2));
                } else {
                    if (!jl40.l(w700Var, p700.a)) {
                        w511.b();
                        return null;
                    }
                    kVar.e.a();
                }
                return obj2 != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            aVar.d();
            k700Var.a.r(new qu(9));
        }
        obj2 = zy11Var;
        if (obj2 != coroutineSingletons) {
        }
    }
}
