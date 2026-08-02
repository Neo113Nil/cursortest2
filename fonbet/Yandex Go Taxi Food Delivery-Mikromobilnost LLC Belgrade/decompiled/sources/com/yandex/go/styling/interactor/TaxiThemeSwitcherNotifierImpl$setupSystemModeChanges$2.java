package com.yandex.go.styling.interactor;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.fvy0;
import defpackage.i891;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qje;
import defpackage.rrq0;
import defpackage.say0;
import defpackage.tls;
import defpackage.tse;
import defpackage.vrq0;
import defpackage.wls;
import defpackage.xng0;
import defpackage.xvy0;
import defpackage.zql0;
import defpackage.zy11;
import defpackage.zz2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.themes.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.styling.interactor.TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2", f = "TaxiThemeSwitcherNotifierImpl.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.styling.interactor.TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2$1", f = "TaxiThemeSwitcherNotifierImpl.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.styling.interactor.TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.yandex.go.styling.interactor.TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C00721 extends FunctionReferenceImpl implements tls {
            public final void i(ThemeType themeType) {
                b bVar = (b) this.receiver;
                MainActivity mainActivity = bVar.a;
                if (bVar.b(themeType)) {
                    say0 say0Var = bVar.c;
                    ((r0) ((pz40) say0Var.b.getValue())).l(themeType);
                    say0Var.a.setValue(say0Var, say0.c[0], Integer.valueOf(themeType.ordinal()));
                    fvy0 fvy0Var = bVar.b;
                    zz2 zz2Var = fvy0Var.a;
                    String name = themeType.name();
                    ThemeChangeMode themeChangeMode = (ThemeChangeMode) ((r0) ((pz40) fvy0Var.c.d.getValue())).getValue();
                    zz2Var.b("Application.Theme.Change", name, fvy0Var.a().getEventValue(), themeChangeMode != null ? themeChangeMode.getId() : null);
                    TaxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1 taxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1 = new TaxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1(bVar, null);
                    int u = qje.u(mainActivity.getTheme(), xng0.bgMain);
                    rrq0 a = vrq0.a(taxiThemeSwitcherNotifierImpl$notifyAll$viewSequence$1);
                    while (a.hasNext()) {
                        xvy0.b((View) a.next(), themeType, true, new zql0(u, 1));
                    }
                    if (mainActivity.getLifecycle().b().a(Lifecycle.State.RESUMED)) {
                        i891.f(mainActivity);
                    }
                }
            }

            @Override // defpackage.tls
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                i((ThemeType) obj);
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar = (g) this.this$0.g.get();
                C00721 c00721 = new C00721(1, this.this$0, b.class, "receiveNewThemeType", "receiveNewThemeType(Lru/yandex/taxi/theme/ThemeType;)V", 0);
                this.label = 1;
                if (gVar.c(c00721, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiThemeSwitcherNotifierImpl$setupSystemModeChanges$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Lifecycle lifecycle = this.this$0.a.getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
