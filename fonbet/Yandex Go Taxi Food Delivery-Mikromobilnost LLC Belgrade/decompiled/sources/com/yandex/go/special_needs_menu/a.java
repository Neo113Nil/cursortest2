package com.yandex.go.special_needs_menu;

import android.net.Uri;
import com.yandex.go.special_needs_menu.experiment.SpecialNeedsMenuItemExperiment;
import defpackage.evu0;
import defpackage.f600;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.kq41;
import defpackage.m950;
import defpackage.not0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.oot0;
import defpackage.pep0;
import defpackage.tpr;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.experiments.d;

/* loaded from: classes8.dex */
public final class a extends not0 {
    public final oot0 b;
    public final yvf0 c;
    public final h3y d;

    public a(oot0 oot0Var, yvf0 yvf0Var, h3y h3yVar) {
        this.b = oot0Var;
        this.c = yvf0Var;
        this.d = h3yVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ContinuationImpl continuationImpl) {
        SpecialNeedsDeeplinkHandler$handleDeeplink$1 specialNeedsDeeplinkHandler$handleDeeplink$1;
        int i;
        String str;
        if (continuationImpl instanceof SpecialNeedsDeeplinkHandler$handleDeeplink$1) {
            specialNeedsDeeplinkHandler$handleDeeplink$1 = (SpecialNeedsDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = specialNeedsDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                specialNeedsDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = specialNeedsDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = specialNeedsDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    tpr a = d.a(this.b);
                    specialNeedsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    specialNeedsDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    specialNeedsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    specialNeedsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    specialNeedsDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = e.A(a, specialNeedsDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oep0Var = (oep0) specialNeedsDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                }
                SpecialNeedsMenuItemExperiment specialNeedsMenuItemExperiment = (SpecialNeedsMenuItemExperiment) obj;
                str = specialNeedsMenuItemExperiment != null ? specialNeedsMenuItemExperiment.e : null;
                if (str != null && !evu0.J(str)) {
                    ((f600) this.d.get()).f();
                    ((pep0) oep0Var).f((m950) this.c.get(), new kq41(Uri.parse(str)), hxx.a);
                }
                return zy11.a;
            }
        }
        specialNeedsDeeplinkHandler$handleDeeplink$1 = new SpecialNeedsDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = specialNeedsDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = specialNeedsDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        SpecialNeedsMenuItemExperiment specialNeedsMenuItemExperiment2 = (SpecialNeedsMenuItemExperiment) obj2;
        if (specialNeedsMenuItemExperiment2 != null) {
        }
        if (str != null) {
            ((f600) this.d.get()).f();
            ((pep0) oep0Var).f((m950) this.c.get(), new kq41(Uri.parse(str)), hxx.a);
        }
        return zy11.a;
    }
}
