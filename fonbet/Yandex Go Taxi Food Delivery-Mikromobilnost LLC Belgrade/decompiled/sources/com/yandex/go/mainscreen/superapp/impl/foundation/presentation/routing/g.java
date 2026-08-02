package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.search.router.FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
import defpackage.e870;
import defpackage.gb0;
import defpackage.hxx;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.x7w0;
import defpackage.y7w0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class g {
    public final gb0 a;
    public final oep0 b;
    public final com.yandex.go.shortcuts.impl.experiments.a c;

    public g(gb0 gb0Var, oep0 oep0Var, com.yandex.go.shortcuts.impl.experiments.a aVar) {
        this.a = gb0Var;
        this.b = oep0Var;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdditionalAction additionalAction, FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection, String str, String str2, ContinuationImpl continuationImpl) {
        SuperAppWhereToNavigator$showCompositeAddressPicker$2 superAppWhereToNavigator$showCompositeAddressPicker$2;
        int i;
        boolean a;
        if (continuationImpl instanceof SuperAppWhereToNavigator$showCompositeAddressPicker$2) {
            superAppWhereToNavigator$showCompositeAddressPicker$2 = (SuperAppWhereToNavigator$showCompositeAddressPicker$2) continuationImpl;
            int i2 = superAppWhereToNavigator$showCompositeAddressPicker$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppWhereToNavigator$showCompositeAddressPicker$2.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppWhereToNavigator$showCompositeAddressPicker$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppWhereToNavigator$showCompositeAddressPicker$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppWhereToNavigator$showCompositeAddressPicker$2.L$0 = additionalAction;
                    superAppWhereToNavigator$showCompositeAddressPicker$2.L$1 = fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
                    superAppWhereToNavigator$showCompositeAddressPicker$2.L$2 = str;
                    superAppWhereToNavigator$showCompositeAddressPicker$2.L$3 = str2;
                    superAppWhereToNavigator$showCompositeAddressPicker$2.label = 1;
                    obj = this.c.a(superAppWhereToNavigator$showCompositeAddressPicker$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) superAppWhereToNavigator$showCompositeAddressPicker$2.L$3;
                    str = (String) superAppWhereToNavigator$showCompositeAddressPicker$2.L$2;
                    fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection = (FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection) superAppWhereToNavigator$showCompositeAddressPicker$2.L$1;
                    additionalAction = (AdditionalAction) superAppWhereToNavigator$showCompositeAddressPicker$2.L$0;
                    kotlin.b.b(obj);
                }
                AdditionalAction additionalAction2 = additionalAction;
                FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection2 = fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
                String str3 = str;
                String str4 = str2;
                a = ((e870) obj).a();
                gb0 gb0Var = this.a;
                oep0 oep0Var = this.b;
                if (a) {
                    ((pep0) oep0Var).f((m950) gb0Var.get(), new y7w0(additionalAction2, str4), hxx.a);
                } else {
                    ((pep0) oep0Var).f((m950) gb0Var.get(), new x7w0(false, fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection2, additionalAction2, str3, true, str4), hxx.a);
                }
                return zy11.a;
            }
        }
        superAppWhereToNavigator$showCompositeAddressPicker$2 = new SuperAppWhereToNavigator$showCompositeAddressPicker$2(this, continuationImpl);
        Object obj2 = superAppWhereToNavigator$showCompositeAddressPicker$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppWhereToNavigator$showCompositeAddressPicker$2.label;
        if (i != 0) {
        }
        AdditionalAction additionalAction22 = additionalAction;
        FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection22 = fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
        String str32 = str;
        String str42 = str2;
        a = ((e870) obj2).a();
        gb0 gb0Var2 = this.a;
        oep0 oep0Var2 = this.b;
        if (a) {
        }
        return zy11.a;
    }
}
