package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.tls;
import defpackage.w511;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes8.dex */
public abstract class g0 {
    public static x2 a(MethodRef methodRef, Bundle bundle) {
        tls tlsVar;
        switch (f0.a[methodRef.ordinal()]) {
            case 1:
                tlsVar = Method$Companion$method$1.b;
                break;
            case 2:
                tlsVar = Method$Companion$method$2.b;
                break;
            case 3:
                tlsVar = Method$Companion$method$3.b;
                break;
            case 4:
                tlsVar = Method$Companion$method$4.b;
                break;
            case 5:
                tlsVar = Method$Companion$method$5.b;
                break;
            case 6:
                tlsVar = Method$Companion$method$6.b;
                break;
            case 7:
                tlsVar = new com.yandex.passport.common.network.t(9);
                break;
            case 8:
                tlsVar = Method$Companion$method$8.b;
                break;
            case 9:
                tlsVar = Method$Companion$method$9.b;
                break;
            case 10:
                tlsVar = Method$Companion$method$10.b;
                break;
            case 11:
                tlsVar = Method$Companion$method$11.b;
                break;
            case 12:
                tlsVar = Method$Companion$method$12.b;
                break;
            case 13:
                tlsVar = Method$Companion$method$13.b;
                break;
            case 14:
                tlsVar = Method$Companion$method$14.b;
                break;
            case 15:
                tlsVar = Method$Companion$method$15.b;
                break;
            case 16:
                tlsVar = Method$Companion$method$16.b;
                break;
            case 17:
                tlsVar = Method$Companion$method$17.b;
                break;
            case 18:
                tlsVar = Method$Companion$method$18.b;
                break;
            case 19:
                tlsVar = Method$Companion$method$19.b;
                break;
            case 20:
                tlsVar = Method$Companion$method$20.b;
                break;
            case 21:
                tlsVar = Method$Companion$method$21.b;
                break;
            case 22:
                tlsVar = Method$Companion$method$22.b;
                break;
            case 23:
                tlsVar = Method$Companion$method$23.b;
                break;
            case 24:
                tlsVar = Method$Companion$method$24.b;
                break;
            case 25:
                tlsVar = Method$Companion$method$25.b;
                break;
            case 26:
                tlsVar = Method$Companion$method$26.b;
                break;
            case 27:
                tlsVar = Method$Companion$method$27.b;
                break;
            case 28:
                tlsVar = Method$Companion$method$28.b;
                break;
            case 29:
                tlsVar = Method$Companion$method$29.b;
                break;
            case 30:
                tlsVar = Method$Companion$method$30.b;
                break;
            case 31:
                tlsVar = new com.yandex.passport.common.network.t(10);
                break;
            case 32:
                tlsVar = Method$Companion$method$32.b;
                break;
            case 33:
                tlsVar = new com.yandex.passport.common.network.t(11);
                break;
            case 34:
                tlsVar = Method$Companion$method$34.b;
                break;
            case 35:
                tlsVar = Method$Companion$method$35.b;
                break;
            case 36:
                tlsVar = Method$Companion$method$36.b;
                break;
            case 37:
                tlsVar = Method$Companion$method$37.b;
                break;
            case 38:
                tlsVar = Method$Companion$method$38.b;
                break;
            case 39:
                tlsVar = Method$Companion$method$39.b;
                break;
            case 40:
                tlsVar = Method$Companion$method$40.b;
                break;
            case 41:
                tlsVar = Method$Companion$method$41.b;
                break;
            case 42:
                tlsVar = Method$Companion$method$42.b;
                break;
            case 43:
                tlsVar = Method$Companion$method$43.b;
                break;
            case 44:
                tlsVar = Method$Companion$method$44.b;
                break;
            case 45:
                tlsVar = Method$Companion$method$45.b;
                break;
            case 46:
                tlsVar = Method$Companion$method$46.b;
                break;
            case 47:
                tlsVar = Method$Companion$method$47.b;
                break;
            case 48:
                tlsVar = Method$Companion$method$48.b;
                break;
            case 49:
                tlsVar = Method$Companion$method$49.b;
                break;
            case 50:
                tlsVar = Method$Companion$method$50.b;
                break;
            case SAFETY_TIPS_VALUE:
                tlsVar = Method$Companion$method$51.b;
                break;
            case 52:
                tlsVar = new com.yandex.passport.common.network.t(12);
                break;
            case 53:
                tlsVar = Method$Companion$method$53.b;
                break;
            case 54:
                tlsVar = Method$Companion$method$54.b;
                break;
            case SODA_DE_DE_VALUE:
                tlsVar = Method$Companion$method$55.b;
                break;
            case 56:
                tlsVar = Method$Companion$method$56.b;
                break;
            case SODA_ES_ES_VALUE:
                tlsVar = Method$Companion$method$57.b;
                break;
            case 58:
                tlsVar = Method$Companion$method$58.b;
                break;
            case 59:
                tlsVar = Method$Companion$method$59.b;
                break;
            case 60:
                tlsVar = Method$Companion$method$60.b;
                break;
            case 61:
                tlsVar = Method$Companion$method$61.b;
                break;
            case 62:
                tlsVar = new com.yandex.passport.common.network.t(13);
                break;
            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                tlsVar = Method$Companion$method$63.b;
                break;
            case 64:
                tlsVar = Method$Companion$method$64.b;
                break;
            case 65:
                tlsVar = new com.yandex.passport.common.network.t(14);
                break;
            case 66:
                tlsVar = new com.yandex.passport.common.network.t(15);
                break;
            case 67:
                tlsVar = Method$Companion$method$67.b;
                break;
            case TRANSLATE_KIT_VALUE:
                tlsVar = Method$Companion$method$68.b;
                break;
            case 69:
                tlsVar = Method$Companion$method$69.b;
                break;
            case 70:
                tlsVar = Method$Companion$method$70.b;
                break;
            case 71:
                tlsVar = Method$Companion$method$71.b;
                break;
            case 72:
                tlsVar = Method$Companion$method$72.b;
                break;
            case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                tlsVar = Method$Companion$method$73.b;
                break;
            case 74:
                tlsVar = Method$Companion$method$74.b;
                break;
            case HProv.PROV_GOST_2001_DH /* 75 */:
                tlsVar = Method$Companion$method$75.b;
                break;
            case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                tlsVar = Method$Companion$method$76.b;
                break;
            case HProv.ALG_SID_SHA3_224 /* 77 */:
                tlsVar = Method$Companion$method$77.b;
                break;
            case HProv.ALG_SID_SHA3_256 /* 78 */:
                tlsVar = Method$Companion$method$78.b;
                break;
            default:
                w511.b();
                return null;
        }
        return (x2) tlsVar.invoke(bundle);
    }
}
