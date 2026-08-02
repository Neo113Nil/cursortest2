package com.yandex.go.account.phonish_upgrade;

import com.yandex.go.account.phonish_upgrade.ForcePhonishUpgradeExperiment;
import defpackage.cne0;
import defpackage.hzk;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.YandexTaxiFragment;

/* loaded from: classes.dex */
public final class i implements vpr {
    public final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        ForcePhonishUpgradeExperiment.ForceOpenMenuShowPolicy forceOpenMenuShowPolicy = (ForcePhonishUpgradeExperiment.ForceOpenMenuShowPolicy) obj;
        j jVar = this.a;
        BaseFragment a = jVar.c.a();
        if (a instanceof YandexTaxiFragment) {
            YandexTaxiFragment yandexTaxiFragment = (YandexTaxiFragment) a;
            if (yandexTaxiFragment.isAttachedAndActive()) {
                z = yandexTaxiFragment.canOpenMainMenu();
                zy11 zy11Var = zy11.a;
                if (z) {
                    p pVar = jVar.e;
                    ForcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$3$1 forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$3$1 = new ForcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$3$1(jVar.b);
                    hzk hzkVar = pVar.a;
                    if (forceOpenMenuShowPolicy == null) {
                        forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$3$1.invoke(continuation);
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    } else if (((cne0) hzkVar.b).i("show_count", 0) < forceOpenMenuShowPolicy.a && hzkVar.i() < forceOpenMenuShowPolicy.b) {
                        tje.N(pVar.b, null, null, new ForcePhonishUpgradeShowPolicyInteractor$showIfNeed$2(pVar, null), 3);
                        forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$3$1.invoke(continuation);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    }
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                }
                return zy11Var;
            }
        }
        z = false;
        zy11 zy11Var2 = zy11.a;
        if (z) {
        }
        return zy11Var2;
    }
}
