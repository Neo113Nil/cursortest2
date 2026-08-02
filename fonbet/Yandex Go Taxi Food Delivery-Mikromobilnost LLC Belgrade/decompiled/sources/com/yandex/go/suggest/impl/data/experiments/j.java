package com.yandex.go.suggest.impl.data.experiments;

import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import defpackage.d6z;
import defpackage.dxp0;
import defpackage.evu0;
import defpackage.f8v0;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.q1w0;
import defpackage.rqo;
import defpackage.w5o;
import defpackage.x5o;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class j {
    public final q1w0 a;
    public final com.yandex.go.coroutines.h b;
    public final com.yandex.go.coroutines.h c;

    public j(rqo rqoVar, q1w0 q1w0Var) {
        this.a = q1w0Var;
        this.b = new com.yandex.go.coroutines.h(new SuperappSuggestSettingsRepository$experiment$1(rqoVar, null));
        this.c = new com.yandex.go.coroutines.h(new SuperappSuggestSettingsRepository$geoDependentExperiment$1(rqoVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperappSuggestSettingsRepository$suggestSettingsConfiguration$1 superappSuggestSettingsRepository$suggestSettingsConfiguration$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        j jVar;
        Object a;
        SuperappSuggestExperiment superappSuggestExperiment;
        Object a2;
        SuperappSuggestGeoDependentExperiment superappSuggestGeoDependentExperiment;
        j jVar2;
        SuperappSuggestExperiment superappSuggestExperiment2;
        SuperappSuggestExperiment.BackendErrorAction backendErrorAction;
        String str;
        String str2;
        String str3;
        if (continuationImpl instanceof SuperappSuggestSettingsRepository$suggestSettingsConfiguration$1) {
            superappSuggestSettingsRepository$suggestSettingsConfiguration$1 = (SuperappSuggestSettingsRepository$suggestSettingsConfiguration$1) continuationImpl;
            int i2 = superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSuggestSettingsRepository$suggestSettingsConfiguration$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label;
                x5o x5oVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$0 = this;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label = 1;
                    obj = this.b.a(superappSuggestSettingsRepository$suggestSettingsConfiguration$1);
                    if (obj != coroutineSingletons) {
                        jVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        superappSuggestGeoDependentExperiment = (SuperappSuggestGeoDependentExperiment) superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$2;
                        superappSuggestExperiment2 = (SuperappSuggestExperiment) superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$1;
                        jVar2 = (j) superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$0;
                        kotlin.b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        jVar2.getClass();
                        int i3 = superappSuggestExperiment2.d;
                        int i4 = superappSuggestExperiment2.c;
                        SuperappSuggestExperiment.LoadingStrategy loadingStrategy = superappSuggestExperiment2.e;
                        int i5 = superappSuggestExperiment2.f;
                        SuperappSuggestExperiment.SearchScaffoldStyle searchScaffoldStyle = !booleanValue ? SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT : superappSuggestExperiment2.g;
                        SuperappSuggestExperiment.SearchTrailButton searchTrailButton = superappSuggestExperiment2.h;
                        dxp0 dxp0Var = (searchTrailButton != null || (str = searchTrailButton.a) == null || evu0.J(str) || (str2 = searchTrailButton.b) == null || evu0.J(str2) || (str3 = searchTrailButton.c) == null || evu0.J(str3)) ? null : new dxp0(searchTrailButton.a, searchTrailButton.b, searchTrailButton.c, searchTrailButton.d, searchTrailButton.e, d6z.Y(superappSuggestExperiment2, searchTrailButton.f));
                        String str4 = superappSuggestExperiment2.i;
                        boolean z = superappSuggestExperiment2.j;
                        Boolean bool = superappSuggestExperiment2.k;
                        boolean booleanValue2 = bool == null ? bool.booleanValue() : false;
                        backendErrorAction = superappSuggestExperiment2.l;
                        if (backendErrorAction != null) {
                            if (backendErrorAction.a) {
                                x5oVar = ngd0.y;
                            } else {
                                String str5 = backendErrorAction.b;
                                if (str5 != null) {
                                    x5oVar = new w5o(str5);
                                }
                            }
                        }
                        return new f8v0(i3, i4, loadingStrategy, i5, searchScaffoldStyle, dxp0Var, str4, z, booleanValue2, x5oVar, superappSuggestGeoDependentExperiment.b);
                    }
                    SuperappSuggestExperiment superappSuggestExperiment3 = (SuperappSuggestExperiment) superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$1;
                    j jVar3 = (j) superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$0;
                    kotlin.b.b(obj);
                    superappSuggestExperiment = superappSuggestExperiment3;
                    jVar = jVar3;
                    SuperappSuggestGeoDependentExperiment superappSuggestGeoDependentExperiment2 = (SuperappSuggestGeoDependentExperiment) obj;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$0 = jVar;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$1 = superappSuggestExperiment;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$2 = superappSuggestGeoDependentExperiment2;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label = 3;
                    a2 = ((com.yandex.go.flex.main_screen.experiments.j) this.a).a(superappSuggestSettingsRepository$suggestSettingsConfiguration$1);
                    if (a2 != coroutineSingletons) {
                        obj = a2;
                        superappSuggestGeoDependentExperiment = superappSuggestGeoDependentExperiment2;
                        jVar2 = jVar;
                        superappSuggestExperiment2 = superappSuggestExperiment;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        jVar2.getClass();
                        int i32 = superappSuggestExperiment2.d;
                        int i42 = superappSuggestExperiment2.c;
                        SuperappSuggestExperiment.LoadingStrategy loadingStrategy2 = superappSuggestExperiment2.e;
                        int i52 = superappSuggestExperiment2.f;
                        SuperappSuggestExperiment.SearchScaffoldStyle searchScaffoldStyle2 = !booleanValue3 ? SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT : superappSuggestExperiment2.g;
                        SuperappSuggestExperiment.SearchTrailButton searchTrailButton2 = superappSuggestExperiment2.h;
                        if (searchTrailButton2 != null) {
                        }
                        String str42 = superappSuggestExperiment2.i;
                        boolean z2 = superappSuggestExperiment2.j;
                        Boolean bool2 = superappSuggestExperiment2.k;
                        boolean booleanValue22 = bool2 == null ? bool2.booleanValue() : false;
                        backendErrorAction = superappSuggestExperiment2.l;
                        if (backendErrorAction != null) {
                        }
                        return new f8v0(i32, i42, loadingStrategy2, i52, searchScaffoldStyle2, dxp0Var, str42, z2, booleanValue22, x5oVar, superappSuggestGeoDependentExperiment.b);
                    }
                    return coroutineSingletons;
                }
                jVar = (j) superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$0;
                kotlin.b.b(obj);
                SuperappSuggestExperiment superappSuggestExperiment4 = (SuperappSuggestExperiment) obj;
                superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$0 = jVar;
                superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$1 = superappSuggestExperiment4;
                superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label = 2;
                a = this.c.a(superappSuggestSettingsRepository$suggestSettingsConfiguration$1);
                if (a != coroutineSingletons) {
                    superappSuggestExperiment = superappSuggestExperiment4;
                    obj = a;
                    SuperappSuggestGeoDependentExperiment superappSuggestGeoDependentExperiment22 = (SuperappSuggestGeoDependentExperiment) obj;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$0 = jVar;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$1 = superappSuggestExperiment;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$2 = superappSuggestGeoDependentExperiment22;
                    superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label = 3;
                    a2 = ((com.yandex.go.flex.main_screen.experiments.j) this.a).a(superappSuggestSettingsRepository$suggestSettingsConfiguration$1);
                    if (a2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        superappSuggestSettingsRepository$suggestSettingsConfiguration$1 = new SuperappSuggestSettingsRepository$suggestSettingsConfiguration$1(this, continuationImpl);
        Object obj2 = superappSuggestSettingsRepository$suggestSettingsConfiguration$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label;
        x5o x5oVar2 = null;
        if (i != 0) {
        }
        SuperappSuggestExperiment superappSuggestExperiment42 = (SuperappSuggestExperiment) obj2;
        superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$0 = jVar;
        superappSuggestSettingsRepository$suggestSettingsConfiguration$1.L$1 = superappSuggestExperiment42;
        superappSuggestSettingsRepository$suggestSettingsConfiguration$1.label = 2;
        a = this.c.a(superappSuggestSettingsRepository$suggestSettingsConfiguration$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
