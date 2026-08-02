package com.yandex.go.sharing_personal_goals;

import android.graphics.drawable.BitmapDrawable;
import androidx.core.app.v;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import defpackage.a60;
import defpackage.arr0;
import defpackage.avj0;
import defpackage.brr0;
import defpackage.dsr0;
import defpackage.evu0;
import defpackage.gsr0;
import defpackage.hsr0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.nrr0;
import defpackage.ny61;
import defpackage.qu;
import defpackage.v770;
import defpackage.w511;
import defpackage.xk60;
import defpackage.xrr0;
import defpackage.yqr0;
import defpackage.zqr0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes13.dex */
public final class c {
    public final com.yandex.go.sharing_personal_goals.data.a a;
    public final hsr0 b;
    public final dsr0 c;

    public c(com.yandex.go.sharing_personal_goals.data.a aVar, hsr0 hsr0Var, dsr0 dsr0Var) {
        this.a = aVar;
        this.b = hsr0Var;
        this.c = dsr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(brr0 brr0Var, xrr0 xrr0Var, SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName, ContinuationImpl continuationImpl) {
        SharingPersonalGoalsUiActionInteractor$handleButtonAction$1 sharingPersonalGoalsUiActionInteractor$handleButtonAction$1;
        int i;
        SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName2;
        nrr0 nrr0Var;
        CharSequence charSequence;
        int i2;
        if (continuationImpl instanceof SharingPersonalGoalsUiActionInteractor$handleButtonAction$1) {
            sharingPersonalGoalsUiActionInteractor$handleButtonAction$1 = (SharingPersonalGoalsUiActionInteractor$handleButtonAction$1) continuationImpl;
            int i3 = sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.label = i3 - Integer.MIN_VALUE;
                Object obj = sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(brr0Var instanceof yqr0)) {
                        if (brr0Var instanceof arr0) {
                            ((a60) xrr0Var.a.H).c(((arr0) brr0Var).a, v770.b);
                        } else if (jl40.l(brr0Var, zqr0.a)) {
                            xrr0Var.a.r(new qu(9));
                        } else if (brr0Var != null) {
                            w511.b();
                            return null;
                        }
                        return zy11.a;
                    }
                    String str = ((yqr0) brr0Var).a;
                    sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.L$0 = null;
                    sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.L$1 = null;
                    sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.L$2 = sharingPersonalGoalsServiceName;
                    sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.label = 1;
                    obj = this.a.a(str, sharingPersonalGoalsUiActionInteractor$handleButtonAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sharingPersonalGoalsServiceName2 = sharingPersonalGoalsServiceName;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sharingPersonalGoalsServiceName2 = (SharingPersonalGoalsServiceName) sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.L$2;
                    kotlin.b.b(obj);
                }
                nrr0Var = (nrr0) obj;
                if (nrr0Var != null) {
                    hsr0 hsr0Var = this.b;
                    hsr0Var.getClass();
                    CharSequence charSequence2 = nrr0Var.a;
                    if ((charSequence2 != null && !evu0.J(charSequence2)) || ((charSequence = nrr0Var.b) != null && !evu0.J(charSequence))) {
                        hsr0Var.b.g("sharing", 3, ((avj0) hsr0Var.a).h(kyh0.sharing_personal_goals_notification_channel_default), null, true);
                        xk60 xk60Var = hsr0Var.b;
                        CharSequence charSequence3 = nrr0Var.b;
                        CharSequence charSequence4 = nrr0Var.a;
                        BitmapDrawable bitmapDrawable = nrr0Var.c;
                        v i4 = xk60Var.i(charSequence3, charSequence4, bitmapDrawable != null ? bitmapDrawable.getBitmap() : null, "sharing", null, 0L);
                        xk60 xk60Var2 = hsr0Var.b;
                        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
                        int i5 = gsr0.a[sharingPersonalGoalsServiceName2.ordinal()];
                        if (i5 == 1) {
                            i2 = 42001;
                        } else if (i5 == 2) {
                            i2 = 42002;
                        } else {
                            if (i5 != 3) {
                                w511.b();
                                return null;
                            }
                            i2 = 42003;
                        }
                        builder.a = i2;
                        xk60Var2.l(builder, i4);
                    }
                }
                return zy11.a;
            }
        }
        sharingPersonalGoalsUiActionInteractor$handleButtonAction$1 = new SharingPersonalGoalsUiActionInteractor$handleButtonAction$1(this, continuationImpl);
        Object obj2 = sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharingPersonalGoalsUiActionInteractor$handleButtonAction$1.label;
        if (i != 0) {
        }
        nrr0Var = (nrr0) obj2;
        if (nrr0Var != null) {
        }
        return zy11.a;
    }
}
