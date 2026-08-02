package com.yandex.payment.sdk.ui.payment.sbp;

import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.g8e;
import defpackage.hjm0;
import defpackage.kp4;
import defpackage.lp4;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.ryj0;
import defpackage.sv90;
import defpackage.wj00;
import defpackage.y22;
import defpackage.y891;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class c implements ryj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                PaymentKitError.Companion.getClass();
                dVar.a0(new hjm0(new PaymentKitError(PaymentKitError.Kind.sbpBanksNotFound, PaymentKitError.Trigger.nspk, null, null, "Bank applications not found", null)));
                break;
            default:
                dVar.b0();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    @Override // defpackage.ryj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSuccess(Object obj) {
        String string;
        String string2;
        String string3;
        String string4;
        Object obj2;
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    dVar.J = SbpViewModel$BankListState.Full;
                    dVar.F = null;
                    dVar.G = d.W(dVar);
                    rwo rwoVar = dVar.A;
                    sv90 sv90Var = qv90.a;
                    String str = dVar.z;
                    if (str == null) {
                        str = d.W(dVar);
                    }
                    sv90Var.getClass();
                    String concat = str != null ? "Список всех банков отображен, выбранный банк: ".concat(str) : "Список всех банков отображен";
                    wj00 wj00Var = new wj00(0);
                    if (str != null) {
                        wj00Var.k("selected_bank", str);
                    }
                    wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
                    ((y22) rwoVar).a(y891.c("sbp_other_bank_list-shown", wj00Var));
                    d.X(dVar, list, false);
                    break;
                } else {
                    PaymentKitError.Companion.getClass();
                    dVar.a0(new hjm0(new PaymentKitError(PaymentKitError.Kind.sbpBanksNotFound, PaymentKitError.Trigger.nspk, null, null, "Bank applications not found", null)));
                    break;
                }
            default:
                List list2 = (List) obj;
                SharedPreferences sharedPreferences = dVar.y;
                String string5 = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_NAME", null);
                lp4 lp4Var = (string5 == null || (string = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_SCHEME", null)) == null || (string2 = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_ICON_URI", null)) == null || (string3 = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_URL_TEMPLATE", null)) == null || (string4 = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_WEB_CLIENT_URI", null)) == null) ? null : new lp4(string5, string, Uri.parse(string2), string4, sharedPreferences.getBoolean("com.yandex.payment.LAST_USED_BANK_IS_WEB_CLIENT_ACTIVE", false), string3, sharedPreferences.getBoolean("com.yandex.payment.LAST_USED_BANK_SBP_TOKEN_BINDING_ON", true));
                if (lp4Var != null) {
                    List list3 = list2;
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((kp4) obj2).b.equals(lp4Var.b)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 == null) {
                        dVar.F = 0;
                        list2 = kotlin.collections.a.m0(list3, Collections.singletonList(lp4Var));
                        if (!list2.isEmpty()) {
                            dVar.b0();
                            break;
                        } else {
                            dVar.J = SbpViewModel$BankListState.Installed;
                            dVar.G = d.W(dVar);
                            rwo rwoVar2 = dVar.A;
                            sv90 sv90Var2 = qv90.a;
                            ArrayList c0 = d.c0(dVar.D);
                            String str2 = dVar.z;
                            if (str2 == null) {
                                str2 = d.W(dVar);
                            }
                            sv90Var2.getClass();
                            String concat2 = "Список установленных банков отображен: ".concat(kotlin.collections.a.X(c0, Extension.FIX_SPACE, null, null, null, 62));
                            if (str2 != null) {
                                concat2 = g8e.p(concat2, "; выбранный банк: ", str2);
                            }
                            wj00 wj00Var2 = new wj00(0);
                            wj00Var2.b.put("bank_list", sv90.y0(c0));
                            if (str2 != null) {
                                wj00Var2.k("selected_bank", str2);
                            }
                            wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat2);
                            ((y22) rwoVar2).a(y891.c("sbp_installed_bank_list-shown", wj00Var2));
                            d.X(dVar, list2, true);
                            break;
                        }
                    }
                }
                dVar.F = null;
                if (!list2.isEmpty()) {
                }
                break;
        }
    }
}
