package com.yandex.go.scooters.passes.active.v3.renew.menu;

import android.content.Context;
import defpackage.atm0;
import defpackage.avm0;
import defpackage.bia0;
import defpackage.btm0;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.rea0;
import defpackage.ysm0;
import defpackage.yum0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class e {
    public final Context a;
    public final ru.yandex.taxi.widget.c b;
    public final bia0 c;
    public final rea0 d;

    public e(Context context, ru.yandex.taxi.widget.c cVar, bia0 bia0Var, rea0 rea0Var) {
        this.a = context;
        this.b = cVar;
        this.c = bia0Var;
        this.d = rea0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, yum0 yum0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1 scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1) {
            scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1 = (ScootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = eVar.b;
                    FormattedText formattedText = yum0Var.i;
                    scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1.L$0 = null;
                    scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1.label = 1;
                    obj = e(cVar, formattedText, scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? eVar.a.getString(kyh0.common_close) : charSequence;
            }
        }
        scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1 = new ScootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1(eVar, continuationImpl);
        Object obj2 = scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewMenuUiStateMapper$getCloseButtonText$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, avm0 avm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewMenuUiStateMapper$getDescription$1 scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3RenewMenuUiStateMapper$getDescription$1) {
            scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1 = (ScootersActivePassesV3RenewMenuUiStateMapper$getDescription$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = eVar.b;
                    FormattedText formattedText = avm0Var.g.a;
                    scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1.L$0 = null;
                    scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1.label = 1;
                    obj = e(cVar, formattedText, scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new ysm0((CharSequence) obj);
            }
        }
        scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1 = new ScootersActivePassesV3RenewMenuUiStateMapper$getDescription$1(eVar, continuationImpl);
        Object obj2 = scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewMenuUiStateMapper$getDescription$1.label;
        if (i != 0) {
        }
        return new ysm0((CharSequence) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, avm0 avm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1 scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        CharSequence charSequence;
        eVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1) {
            scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1 = (ScootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1 scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12 = scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1;
                Object obj = scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = eVar.b;
                    FormattedText formattedText = avm0Var.g.f;
                    scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.L$0 = avm0Var;
                    scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.L$1;
                        kotlin.b.b(obj);
                        return new atm0(charSequence, (CharSequence) obj);
                    }
                    avm0Var = (avm0) scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar2 = eVar.b;
                FormattedText formattedText2 = avm0Var.g.h;
                scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.L$0 = null;
                scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.L$1 = charSequence2;
                scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12.label = 2;
                e = e(cVar2, formattedText2, scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$12);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence = charSequence2;
                    return new atm0(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1 = new ScootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1(eVar, continuationImpl);
        ScootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1 scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$122 = scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$1;
        Object obj2 = scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$122.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        ru.yandex.taxi.widget.c cVar22 = eVar.b;
        FormattedText formattedText22 = avm0Var.g.h;
        scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$122.L$0 = null;
        scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$122.L$1 = charSequence22;
        scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$122.label = 2;
        e = e(cVar22, formattedText22, scootersActivePassesV3RenewMenuUiStateMapper$getRenewItem$122);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e eVar, avm0 avm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewMenuUiStateMapper$getTitle$1 scootersActivePassesV3RenewMenuUiStateMapper$getTitle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        CharSequence charSequence;
        CharSequence charSequence2;
        eVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3RenewMenuUiStateMapper$getTitle$1) {
            scootersActivePassesV3RenewMenuUiStateMapper$getTitle$1 = (ScootersActivePassesV3RenewMenuUiStateMapper$getTitle$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewMenuUiStateMapper$getTitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewMenuUiStateMapper$getTitle$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3RenewMenuUiStateMapper$getTitle$1 scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12 = scootersActivePassesV3RenewMenuUiStateMapper$getTitle$1;
                Object obj = scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = eVar.b;
                    FormattedText formattedText = avm0Var.c;
                    scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.L$0 = avm0Var;
                    scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.L$1;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        if (charSequence2 == null) {
                            charSequence2 = "";
                        }
                        return new btm0(charSequence, charSequence2);
                    }
                    avm0Var = (avm0) scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar2 = eVar.b;
                FormattedText formattedText2 = avm0Var.d;
                scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.L$0 = null;
                scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.L$1 = charSequence3;
                scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12.label = 2;
                e = e(cVar2, formattedText2, scootersActivePassesV3RenewMenuUiStateMapper$getTitle$12);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence = charSequence3;
                    charSequence2 = (CharSequence) obj;
                    if (charSequence2 == null) {
                    }
                    return new btm0(charSequence, charSequence2);
                }
                return coroutineSingletons;
            }
        }
        scootersActivePassesV3RenewMenuUiStateMapper$getTitle$1 = new ScootersActivePassesV3RenewMenuUiStateMapper$getTitle$1(eVar, continuationImpl);
        ScootersActivePassesV3RenewMenuUiStateMapper$getTitle$1 scootersActivePassesV3RenewMenuUiStateMapper$getTitle$122 = scootersActivePassesV3RenewMenuUiStateMapper$getTitle$1;
        Object obj2 = scootersActivePassesV3RenewMenuUiStateMapper$getTitle$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewMenuUiStateMapper$getTitle$122.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        ru.yandex.taxi.widget.c cVar22 = eVar.b;
        FormattedText formattedText22 = avm0Var.d;
        scootersActivePassesV3RenewMenuUiStateMapper$getTitle$122.L$0 = null;
        scootersActivePassesV3RenewMenuUiStateMapper$getTitle$122.L$1 = charSequence32;
        scootersActivePassesV3RenewMenuUiStateMapper$getTitle$122.label = 2;
        e = e(cVar22, formattedText22, scootersActivePassesV3RenewMenuUiStateMapper$getTitle$122);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static Object e(ru.yandex.taxi.widget.c cVar, FormattedText formattedText, ContinuationImpl continuationImpl) {
        if (formattedText == null) {
            return null;
        }
        Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, continuationImpl, 30);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : (CharSequence) e;
    }
}
