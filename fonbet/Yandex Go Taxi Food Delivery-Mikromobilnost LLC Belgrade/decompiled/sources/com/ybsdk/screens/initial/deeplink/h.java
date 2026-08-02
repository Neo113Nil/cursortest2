package com.ybsdk.screens.initial.deeplink;

import android.net.Uri;
import com.ybsdk.api.DepositType;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.bzk0;
import defpackage.evu0;
import defpackage.gtu0;
import defpackage.jl40;
import defpackage.tm60;
import defpackage.x4c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DeeplinkAction.Topup a(Uri uri) {
        BigDecimal bigDecimal;
        boolean i;
        DepositType depositType;
        ArrayList arrayList;
        boolean i2;
        String o = bzk0.o(uri, SdkUri$QueryParam.DEPOSIT_TYPE);
        String o2 = bzk0.o(uri, SdkUri$QueryParam.AMOUNT);
        if (o2 != null) {
            Locale locale = tm60.a;
            bigDecimal = tm60.g(o2);
        } else {
            bigDecimal = null;
        }
        String o3 = bzk0.o(uri, SdkUri$QueryParam.CURRENCY);
        if (o3 != null) {
            if (evu0.J(o3)) {
                o3 = null;
            }
        }
        o3 = NumberFormatUtils$Currencies.RUB.getIso();
        i = bzk0.i(uri, SdkUri$QueryParam.OPEN_KYC_EDS, false);
        if (jl40.l(o, "exact")) {
            depositType = DepositType.ExactAmount;
        } else if (jl40.l(o, "order")) {
            depositType = DepositType.OrderAmount;
        } else if (o == null) {
            depositType = DepositType.ExactAmount;
        } else {
            x4c.g("Failed to parse depositType; setting DepositType.ExactAmount", null, o, null, 10);
            depositType = DepositType.ExactAmount;
        }
        DepositType depositType2 = depositType;
        String o4 = bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID);
        String o5 = bzk0.o(uri, SdkUri$QueryParam.PAYMENT_METHOD_ID);
        String o6 = bzk0.o(uri, SdkUri$QueryParam.SUGGEST_AMOUNTS);
        if (o6 != null) {
            ArrayList d = gtu0.d(o6);
            Locale locale2 = tm60.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = d.iterator();
            while (it.hasNext()) {
                BigDecimal g = tm60.g((String) it.next());
                if (g != null) {
                    arrayList2.add(g);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
                String o7 = bzk0.o(uri, SdkUri$QueryParam.SUGGEST_BEHAVIOUR);
                i2 = bzk0.i(uri, SdkUri$QueryParam.SELECT_MAIN_ACCOUNT_ON_ENTER, false);
                return new DeeplinkAction.Topup(bigDecimal != null ? new DeeplinkAction.Topup.DepositAmount(o3, bigDecimal) : null, false, o4, depositType2, false, null, i, i2, o5, arrayList, o7, 50, null);
            }
        }
        arrayList = null;
        String o72 = bzk0.o(uri, SdkUri$QueryParam.SUGGEST_BEHAVIOUR);
        i2 = bzk0.i(uri, SdkUri$QueryParam.SELECT_MAIN_ACCOUNT_ON_ENTER, false);
        return new DeeplinkAction.Topup(bigDecimal != null ? new DeeplinkAction.Topup.DepositAmount(o3, bigDecimal) : null, false, o4, depositType2, false, null, i, i2, o5, arrayList, o72, 50, null);
    }
}
