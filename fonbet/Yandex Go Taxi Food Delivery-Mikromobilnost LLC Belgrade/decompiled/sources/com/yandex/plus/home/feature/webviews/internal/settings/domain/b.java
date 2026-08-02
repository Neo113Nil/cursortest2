package com.yandex.plus.home.feature.webviews.internal.settings.domain;

import com.yandex.plus.home.feature.webviews.internal.settings.domain.ChangePlusSettingsInteractor$ChangeSettingError;
import defpackage.ba6;
import defpackage.dvw;
import defpackage.j18;
import defpackage.jse;
import defpackage.ny61;
import defpackage.p4z;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {
    public final p4z a;
    public final jse b;

    public b(p4z p4zVar, jse jseVar) {
        this.a = p4zVar;
        this.b = jseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ba6 ba6Var, ContinuationImpl continuationImpl) {
        ChangePlusSettingsInteractor$changeBooleanSettingIfCan$1 changePlusSettingsInteractor$changeBooleanSettingIfCan$1;
        int i;
        p4z p4zVar = bVar.a;
        if (continuationImpl instanceof ChangePlusSettingsInteractor$changeBooleanSettingIfCan$1) {
            changePlusSettingsInteractor$changeBooleanSettingIfCan$1 = (ChangePlusSettingsInteractor$changeBooleanSettingIfCan$1) continuationImpl;
            int i2 = changePlusSettingsInteractor$changeBooleanSettingIfCan$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePlusSettingsInteractor$changeBooleanSettingIfCan$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePlusSettingsInteractor$changeBooleanSettingIfCan$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePlusSettingsInteractor$changeBooleanSettingIfCan$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba6 ba6Var2 = (ba6) changePlusSettingsInteractor$changeBooleanSettingIfCan$1.L$2;
                    kotlin.b.b(obj);
                    return ba6Var2;
                }
                kotlin.b.b(obj);
                String str = ba6Var.a;
                if (str == null || !p4zVar.j(str)) {
                    throw new ChangePlusSettingsInteractor$ChangeSettingError.UnSupportedSettingError(ba6Var);
                }
                if (!p4zVar.h(str)) {
                    throw new ChangePlusSettingsInteractor$ChangeSettingError.IllegalChangeDisabledSettingError(ba6.a(ba6Var, p4zVar.d(str), 15));
                }
                ba6 a = ba6.a(ba6Var, false, 27);
                changePlusSettingsInteractor$changeBooleanSettingIfCan$1.L$0 = null;
                changePlusSettingsInteractor$changeBooleanSettingIfCan$1.L$1 = null;
                changePlusSettingsInteractor$changeBooleanSettingIfCan$1.L$2 = a;
                changePlusSettingsInteractor$changeBooleanSettingIfCan$1.label = 1;
                j18 j18Var = new j18(1, dvw.b(changePlusSettingsInteractor$changeBooleanSettingIfCan$1));
                j18Var.u();
                String str2 = a.a;
                if (str2 == null) {
                    str2 = "";
                }
                p4zVar.i(str2, a.c, new a(j18Var, a, bVar, str));
                Object s = j18Var.s();
                if (s != coroutineSingletons) {
                    s = zy11.a;
                }
                return s == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        changePlusSettingsInteractor$changeBooleanSettingIfCan$1 = new ChangePlusSettingsInteractor$changeBooleanSettingIfCan$1(bVar, continuationImpl);
        Object obj2 = changePlusSettingsInteractor$changeBooleanSettingIfCan$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePlusSettingsInteractor$changeBooleanSettingIfCan$1.label;
        if (i == 0) {
        }
    }
}
