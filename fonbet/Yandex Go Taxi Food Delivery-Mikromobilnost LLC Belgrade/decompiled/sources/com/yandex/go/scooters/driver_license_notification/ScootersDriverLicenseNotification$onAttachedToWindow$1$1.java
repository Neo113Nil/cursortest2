package com.yandex.go.scooters.driver_license_notification;

import android.graphics.Bitmap;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xno0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.driver_license_notification.ScootersDriverLicenseNotification$onAttachedToWindow$1$1", f = "ScootersDriverLicenseNotification.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersDriverLicenseNotification$onAttachedToWindow$1$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ScootersDriverLicenseNotification this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDriverLicenseNotification$onAttachedToWindow$1$1(ScootersDriverLicenseNotification scootersDriverLicenseNotification, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersDriverLicenseNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersDriverLicenseNotification$onAttachedToWindow$1$1 scootersDriverLicenseNotification$onAttachedToWindow$1$1 = new ScootersDriverLicenseNotification$onAttachedToWindow$1$1(this.this$0, continuation);
        scootersDriverLicenseNotification$onAttachedToWindow$1$1.L$0 = obj;
        return scootersDriverLicenseNotification$onAttachedToWindow$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDriverLicenseNotification$onAttachedToWindow$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ListItemComponent listItemComponent;
        xno0 xno0Var;
        ListItemComponent listItemComponent2;
        xno0 xno0Var2;
        xno0 xno0Var3;
        ListItemComponent listItemComponent3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new ScootersDriverLicenseNotification$onAttachedToWindow$1$1$iconAsync$1(this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = h.s(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            listItemComponent3 = this.this$0.listItemComponent;
            listItemComponent3.setLeadImage(bitmap);
        }
        listItemComponent = this.this$0.listItemComponent;
        xno0Var = this.this$0.topBannerCommunication;
        listItemComponent.setTitle(xno0Var.b);
        listItemComponent2 = this.this$0.listItemComponent;
        xno0Var2 = this.this$0.topBannerCommunication;
        listItemComponent2.setSubtitle(xno0Var2.c);
        ScootersDriverLicenseNotification scootersDriverLicenseNotification = this.this$0;
        xno0Var3 = scootersDriverLicenseNotification.topBannerCommunication;
        scootersDriverLicenseNotification.applyStyle(xno0Var3.f);
        return zy11.a;
    }
}
