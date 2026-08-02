package com.yandex.go.sharing_personal_goals.data.mapper;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalButtonDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalButtonDto$Action$Accept;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalButtonDto$Action$Deeplink;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsAcceptDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockBadgeDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$Action$Deeplink;
import com.yandex.go.sharing_personal_goals.data.model.s;
import defpackage.arr0;
import defpackage.brr0;
import defpackage.bvf0;
import defpackage.crr0;
import defpackage.drr0;
import defpackage.frr0;
import defpackage.jl40;
import defpackage.nrr0;
import defpackage.ny61;
import defpackage.oqr0;
import defpackage.pqr0;
import defpackage.qqr0;
import defpackage.w511;
import defpackage.yqr0;
import defpackage.zqr0;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, SharingPersonalGoalsPromoblockBadgeDto sharingPersonalGoalsPromoblockBadgeDto, ContinuationImpl continuationImpl) {
        SharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1 sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof SharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1) {
            sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1 = (SharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1) continuationImpl;
            int i2 = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.a;
                    FormattedText formattedText = sharingPersonalGoalsPromoblockBadgeDto.a;
                    sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.L$0 = sharingPersonalGoalsPromoblockBadgeDto;
                    sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.label = 1;
                    obj = eVar.t(formattedText, sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sharingPersonalGoalsPromoblockBadgeDto = (SharingPersonalGoalsPromoblockBadgeDto) sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.L$0;
                    b.b(obj);
                }
                String str = sharingPersonalGoalsPromoblockBadgeDto.b;
                return new oqr0((CharSequence) obj);
            }
        }
        sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1 = new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1(aVar, continuationImpl);
        Object obj2 = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockBadge$1.label;
        if (i != 0) {
        }
        String str2 = sharingPersonalGoalsPromoblockBadgeDto.b;
        return new oqr0((CharSequence) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Button button, ContinuationImpl continuationImpl) {
        SharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1 sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1;
        int i;
        pqr0 pqr0Var;
        aVar.getClass();
        if (continuationImpl instanceof SharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1) {
            sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1 = (SharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1) continuationImpl;
            int i2 = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.label;
                if (i != 0) {
                    b.b(obj);
                    s sVar = button.b;
                    if (!(sVar instanceof SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$Action$Deeplink)) {
                        w511.b();
                        return null;
                    }
                    pqr0 pqr0Var2 = new pqr0(((SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed$Button$Action$Deeplink) sVar).a);
                    e eVar = aVar.a;
                    FormattedText formattedText = button.a;
                    sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.L$0 = null;
                    sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.L$1 = pqr0Var2;
                    sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.label = 1;
                    obj = eVar.t(formattedText, sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pqr0Var = pqr0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pqr0Var = (pqr0) sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.L$1;
                    b.b(obj);
                }
                return new qqr0((CharSequence) obj, pqr0Var);
            }
        }
        sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1 = new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1(aVar, continuationImpl);
        Object obj2 = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharingPersonalGoalsMapper$mapSharingMissionsPromoblockButton$1.label;
        if (i != 0) {
        }
        return new qqr0((CharSequence) obj2, pqr0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, SharingPersonalGoalButtonDto sharingPersonalGoalButtonDto, ContinuationImpl continuationImpl) {
        SharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1 sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1;
        int i;
        frr0 frr0Var;
        brr0 arr0Var;
        aVar.getClass();
        if (continuationImpl instanceof SharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1) {
            sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1 = (SharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1) continuationImpl;
            int i2 = sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.a;
                    FormattedText formattedText = sharingPersonalGoalButtonDto.a;
                    sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.L$0 = sharingPersonalGoalButtonDto;
                    sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.label = 1;
                    obj = eVar.t(formattedText, sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sharingPersonalGoalButtonDto = (SharingPersonalGoalButtonDto) sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.L$0;
                    b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                frr0Var = sharingPersonalGoalButtonDto.b;
                if (!(frr0Var instanceof SharingPersonalGoalButtonDto$Action$Accept)) {
                    arr0Var = new yqr0(((SharingPersonalGoalButtonDto$Action$Accept) frr0Var).a);
                } else if (jl40.l(frr0Var, drr0.INSTANCE)) {
                    arr0Var = zqr0.a;
                } else {
                    if (!(frr0Var instanceof SharingPersonalGoalButtonDto$Action$Deeplink)) {
                        w511.b();
                        return null;
                    }
                    arr0Var = new arr0(((SharingPersonalGoalButtonDto$Action$Deeplink) frr0Var).a);
                }
                return new crr0(charSequence, arr0Var);
            }
        }
        sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1 = new SharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1(aVar, continuationImpl);
        Object obj2 = sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharingPersonalGoalsMapper$mapSharingPersonalGoalButton$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        frr0Var = sharingPersonalGoalButtonDto.b;
        if (!(frr0Var instanceof SharingPersonalGoalButtonDto$Action$Accept)) {
        }
        return new crr0(charSequence2, arr0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(SharingPersonalGoalsAcceptDto sharingPersonalGoalsAcceptDto, ContinuationImpl continuationImpl) {
        SharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1 sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1;
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (continuationImpl instanceof SharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1) {
            sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1 = (SharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1) continuationImpl;
            int i2 = sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str = sharingPersonalGoalsAcceptDto.a;
                    String str2 = sharingPersonalGoalsAcceptDto.b;
                    String str3 = sharingPersonalGoalsAcceptDto.c;
                    sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.L$0 = null;
                    sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.L$1 = str;
                    sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.L$2 = str2;
                    sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.label = 1;
                    Object f = e.f(this.a, str3, null, sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1, 6);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    charSequence = str;
                    obj = f;
                    charSequence2 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.L$2;
                    charSequence = (CharSequence) sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.L$1;
                    b.b(obj);
                }
                return new nrr0(charSequence, charSequence2, (BitmapDrawable) obj);
            }
        }
        sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1 = new SharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1(this, continuationImpl);
        Object obj2 = sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharingPersonalGoalsMapper$mapSharingPersonalGoalNotification$1.label;
        if (i != 0) {
        }
        return new nrr0(charSequence, charSequence2, (BitmapDrawable) obj2);
    }

    public final Object e(SharingPersonalGoalsDto sharingPersonalGoalsDto, Continuation continuation) {
        return bvf0.n(new SharingPersonalGoalsMapper$mapSharingPersonalGoals$2(this, sharingPersonalGoalsDto, null), continuation);
    }

    public final Object f(SharingPersonalGoalsPromoblockDto sharingPersonalGoalsPromoblockDto, Continuation continuation) {
        return bvf0.n(new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2(sharingPersonalGoalsPromoblockDto, this, null), continuation);
    }
}
