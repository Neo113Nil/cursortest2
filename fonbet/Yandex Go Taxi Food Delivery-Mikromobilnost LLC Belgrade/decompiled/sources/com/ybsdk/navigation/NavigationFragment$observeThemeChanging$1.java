package com.ybsdk.navigation;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$ThemeSetupThemeEvent;
import com.ybsdk.core.design.theme.ThemeType;
import defpackage.ci51;
import defpackage.em3;
import defpackage.hh51;
import defpackage.jy00;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.ye60;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.navigation.NavigationFragment$observeThemeChanging$1", f = "NavigationFragment.kt", l = {857}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NavigationFragment$observeThemeChanging$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $baseContext;
    final /* synthetic */ hh51 $initDependencies;
    int label;
    final /* synthetic */ NavigationFragment this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/core/design/theme/ThemeType;", "newTheme", "Lzy11;", "<anonymous>", "(Lcom/ybsdk/core/design/theme/ThemeType;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.navigation.NavigationFragment$observeThemeChanging$1$2", f = "NavigationFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.navigation.NavigationFragment$observeThemeChanging$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Context $baseContext;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NavigationFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NavigationFragment navigationFragment, Context context, Continuation continuation) {
            super(2, continuation);
            this.this$0 = navigationFragment;
            this.$baseContext = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$baseContext, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((ThemeType) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppAnalyticsReporter reporter;
            CommonEvents$ThemeSetupThemeEvent commonEvents$ThemeSetupThemeEvent;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ThemeType themeType = (ThemeType) this.L$0;
            reporter = this.this$0.getReporter();
            em3 em3Var = reporter.o;
            int i = ci51.b[themeType.ordinal()];
            if (i == 1) {
                commonEvents$ThemeSetupThemeEvent = CommonEvents$ThemeSetupThemeEvent.LIGHT;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                commonEvents$ThemeSetupThemeEvent = CommonEvents$ThemeSetupThemeEvent.DARK;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, commonEvents$ThemeSetupThemeEvent.getOriginalValue());
            em3Var.a.a("theme.setup_theme", linkedHashMap);
            r0 r0Var = (r0) this.this$0.getThemeType();
            r0Var.getClass();
            r0Var.m(null, themeType);
            jy00.c(themeType.getStyleRes(), this.$baseContext);
            this.this$0.reattachFragmentsIfPossible();
            this.this$0.closePlusHomeBottomSheet();
            this.this$0.closeBottomSheet();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationFragment$observeThemeChanging$1(hh51 hh51Var, NavigationFragment navigationFragment, Context context, Continuation continuation) {
        super(2, continuation);
        this.$initDependencies = hh51Var;
        this.this$0 = navigationFragment;
        this.$baseContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigationFragment$observeThemeChanging$1(this.$initDependencies, this.this$0, this.$baseContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationFragment$observeThemeChanging$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        n4u0 n4u0Var = this.$initDependencies.h;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$baseContext, null);
        this.label = 1;
        Object collect = n4u0Var.collect(new c(new i0(ye60.a, anonymousClass2)), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
