package com.yandex.go.navigator.driving;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.yandex.go.navigator.driving.r;
import com.yandex.go.navigator.notifications.cartech.CartechDeeplinkPayloadDto;
import com.yandex.go.navigator.notifications.cartech.StationType;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.evu0;
import defpackage.g16;
import defpackage.gpv;
import defpackage.i19;
import defpackage.i3y;
import defpackage.kyh0;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.pav;
import defpackage.sls;
import defpackage.tje;
import defpackage.uhm;
import defpackage.uyb0;
import defpackage.v2h0;
import defpackage.vng;
import defpackage.wsk0;
import defpackage.x1l0;
import defpackage.xng0;
import defpackage.ymj;
import defpackage.zuj0;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class r {
    public final Context a;
    public final zuj0 b;
    public final x1l0 c;
    public final gpv d;
    public final pav e;
    public final i19 f;
    public final wsk0 g;
    public final i3y h;
    public final i3y i;

    public r(Context context, zuj0 zuj0Var, x1l0 x1l0Var, gpv gpvVar, pav pavVar, i19 i19Var, wsk0 wsk0Var) {
        this.a = context;
        this.b = zuj0Var;
        this.c = x1l0Var;
        this.d = gpvVar;
        this.e = pavVar;
        this.f = i19Var;
        this.g = wsk0Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: vkm
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int u;
                int i2 = i;
                r rVar = this.b;
                switch (i2) {
                    case 0:
                        u = tje.u(16, rVar.a);
                        break;
                    default:
                        u = tje.u(4, rVar.a);
                        break;
                }
                return Integer.valueOf(u);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.i = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: vkm
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int u;
                int i22 = i2;
                r rVar = this.b;
                switch (i22) {
                    case 0:
                        u = tje.u(16, rVar.a);
                        break;
                    default:
                        u = tje.u(4, rVar.a);
                        break;
                }
                return Integer.valueOf(u);
            }
        });
    }

    public static ButtonComponent a(r rVar, uyb0 uyb0Var, Integer num, Integer num2, Integer num3, int i) {
        int i2 = 1;
        int i3 = (i & 2) != 0 ? 0 : 1;
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        boolean z = (i & 16) != 0;
        if ((i & 32) != 0) {
            num3 = null;
        }
        float f = (i & 64) != 0 ? 13.0f : 16.0f;
        rVar.getClass();
        ButtonComponent buttonComponent = new ButtonComponent(rVar.a, null, 0, 6, null);
        buttonComponent.setButtonSize(i3);
        if (num3 != null) {
            buttonComponent.setRoundedCornersRadius(num3.intValue());
        }
        buttonComponent.setTextTypeface(3);
        buttonComponent.setTextSize(f);
        buttonComponent.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, z ? ((Number) rVar.h.getValue()).intValue() : ((Number) rVar.i.getValue()).intValue(), 0);
        buttonComponent.setLayoutParams(layoutParams);
        buttonComponent.setText(uyb0Var.a);
        buttonComponent.setButtonBackground(new bdc(num != null ? num.intValue() : xng0.controlMinor));
        buttonComponent.setButtonTitleColor(new bdc(num2 != null ? num2.intValue() : xng0.textMain));
        buttonComponent.setDebounceClickListener(new uhm(i2, uyb0Var));
        return buttonComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, int i, int i2, nfv nfvVar, ContinuationImpl continuationImpl) {
        DrivingModeNotificationMapper$iconByUrl$1 drivingModeNotificationMapper$iconByUrl$1;
        int i3;
        Bitmap bitmap;
        if (continuationImpl instanceof DrivingModeNotificationMapper$iconByUrl$1) {
            drivingModeNotificationMapper$iconByUrl$1 = (DrivingModeNotificationMapper$iconByUrl$1) continuationImpl;
            int i4 = drivingModeNotificationMapper$iconByUrl$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                drivingModeNotificationMapper$iconByUrl$1.label = i4 - Integer.MIN_VALUE;
                Object obj = drivingModeNotificationMapper$iconByUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = drivingModeNotificationMapper$iconByUrl$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        g16 e = this.e.b().b(str).g(i, i2).e(nfvVar);
                        drivingModeNotificationMapper$iconByUrl$1.L$0 = null;
                        drivingModeNotificationMapper$iconByUrl$1.L$1 = null;
                        drivingModeNotificationMapper$iconByUrl$1.I$0 = i;
                        drivingModeNotificationMapper$iconByUrl$1.I$1 = i2;
                        drivingModeNotificationMapper$iconByUrl$1.label = 1;
                        obj = ru.yandex.taxi.utils.a.b(e, drivingModeNotificationMapper$iconByUrl$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i3 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new BitmapDrawable(this.a.getResources(), bitmap);
                }
                return null;
            }
        }
        drivingModeNotificationMapper$iconByUrl$1 = new DrivingModeNotificationMapper$iconByUrl$1(this, continuationImpl);
        Object obj2 = drivingModeNotificationMapper$iconByUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = drivingModeNotificationMapper$iconByUrl$1.label;
        if (i3 != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CartechDeeplinkPayloadDto cartechDeeplinkPayloadDto, ContinuationImpl continuationImpl) {
        DrivingModeNotificationMapper$mapDestinationNotification$1 drivingModeNotificationMapper$mapDestinationNotification$1;
        int i;
        Drawable drawable;
        String str;
        CartechDeeplinkPayloadDto cartechDeeplinkPayloadDto2 = cartechDeeplinkPayloadDto;
        if (continuationImpl instanceof DrivingModeNotificationMapper$mapDestinationNotification$1) {
            drivingModeNotificationMapper$mapDestinationNotification$1 = (DrivingModeNotificationMapper$mapDestinationNotification$1) continuationImpl;
            int i2 = drivingModeNotificationMapper$mapDestinationNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingModeNotificationMapper$mapDestinationNotification$1.label = i2 - Integer.MIN_VALUE;
                DrivingModeNotificationMapper$mapDestinationNotification$1 drivingModeNotificationMapper$mapDestinationNotification$12 = drivingModeNotificationMapper$mapDestinationNotification$1;
                Object obj = drivingModeNotificationMapper$mapDestinationNotification$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingModeNotificationMapper$mapDestinationNotification$12.label;
                zuj0 zuj0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int u = tje.u(40, ((avj0) zuj0Var).a);
                    String str2 = cartechDeeplinkPayloadDto2.d;
                    drivingModeNotificationMapper$mapDestinationNotification$12.L$0 = cartechDeeplinkPayloadDto2;
                    drivingModeNotificationMapper$mapDestinationNotification$12.I$0 = u;
                    drivingModeNotificationMapper$mapDestinationNotification$12.label = 1;
                    obj = b(str2, u, u, nfv.a, drivingModeNotificationMapper$mapDestinationNotification$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CartechDeeplinkPayloadDto cartechDeeplinkPayloadDto3 = (CartechDeeplinkPayloadDto) drivingModeNotificationMapper$mapDestinationNotification$12.L$0;
                    kotlin.b.b(obj);
                    cartechDeeplinkPayloadDto2 = cartechDeeplinkPayloadDto3;
                }
                drawable = (BitmapDrawable) obj;
                if (drawable == null) {
                    StationType stationType = cartechDeeplinkPayloadDto2.f;
                    Integer valueOf = (stationType == StationType.FUEL || stationType == StationType.GAS) ? Integer.valueOf(v2h0.ic_gas_station_bg_rounded_blue_40) : (stationType == StationType.CAR_WASH || stationType == StationType.CAR_WASH_BOOKING) ? Integer.valueOf(v2h0.ic_wash_car_bg_rounded_blue_40) : null;
                    drawable = valueOf != null ? vng.t(valueOf.intValue(), ((avj0) zuj0Var).a) : null;
                }
                Drawable drawable2 = drawable;
                String str3 = cartechDeeplinkPayloadDto2.a;
                String str4 = cartechDeeplinkPayloadDto2.b;
                String str5 = cartechDeeplinkPayloadDto2.c;
                str = evu0.J(str5) ? null : str5;
                if (str == null) {
                    str = ((avj0) zuj0Var).h(kyh0.navigator_tanker_notification_refuel_button);
                }
                return new DrivingModeNotification(this.a, "1012", drawable2, str3, str4, Collections.singletonList(a(this, new uyb0(new ymj(13, this, cartechDeeplinkPayloadDto2), str), new Integer(xng0.bgInvert), new Integer(xng0.textInvert), new Integer(tje.u(25, this.a)), 16)), null, -1L, false, cartechDeeplinkPayloadDto2, 3, 64, null);
            }
        }
        drivingModeNotificationMapper$mapDestinationNotification$1 = new DrivingModeNotificationMapper$mapDestinationNotification$1(this, continuationImpl);
        DrivingModeNotificationMapper$mapDestinationNotification$1 drivingModeNotificationMapper$mapDestinationNotification$122 = drivingModeNotificationMapper$mapDestinationNotification$1;
        Object obj3 = drivingModeNotificationMapper$mapDestinationNotification$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingModeNotificationMapper$mapDestinationNotification$122.label;
        zuj0 zuj0Var2 = this.b;
        if (i != 0) {
        }
        drawable = (BitmapDrawable) obj3;
        if (drawable == null) {
        }
        Drawable drawable22 = drawable;
        String str32 = cartechDeeplinkPayloadDto2.a;
        String str42 = cartechDeeplinkPayloadDto2.b;
        String str52 = cartechDeeplinkPayloadDto2.c;
        if (evu0.J(str52)) {
        }
        if (str == null) {
        }
        return new DrivingModeNotification(this.a, "1012", drawable22, str32, str42, Collections.singletonList(a(this, new uyb0(new ymj(13, this, cartechDeeplinkPayloadDto2), str), new Integer(xng0.bgInvert), new Integer(xng0.textInvert), new Integer(tje.u(25, this.a)), 16)), null, -1L, false, cartechDeeplinkPayloadDto2, 3, 64, null);
    }
}
