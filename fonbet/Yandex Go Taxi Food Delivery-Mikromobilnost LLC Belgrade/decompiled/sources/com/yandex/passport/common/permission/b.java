package com.yandex.passport.common.permission;

import android.accounts.Account;
import android.text.TextUtils;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.network.mappers.h;
import com.yandex.passport.internal.push.l0;
import defpackage.jl40;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes8.dex */
public final class b {
    public static final AccountRow a(List list, Account account, Uid uid, String str, h hVar) {
        AccountRow accountRow = null;
        String lowerCase = str != null ? str.replace('.', LicenseUtility.SEPARATOR).toLowerCase(Locale.US) : null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AccountRow accountRow2 = (AccountRow) it.next();
            if (account != null && jl40.l(account.name, accountRow2.name)) {
                return accountRow2;
            }
            if (TextUtils.equals(lowerCase, accountRow2.name.replace('.', LicenseUtility.SEPARATOR).toLowerCase(Locale.US))) {
                accountRow = accountRow2;
            }
            ModernAccount b = hVar.b(accountRow2);
            if (b != null && uid != null && uid.equals(b.getUid())) {
                return accountRow2;
            }
        }
        return accountRow;
    }

    public static final ModernAccount b(List list, Uid uid, String str, h hVar) {
        String lowerCase = str != null ? str.replace('.', LicenseUtility.SEPARATOR).toLowerCase(Locale.US) : null;
        Iterator it = list.iterator();
        ModernAccount modernAccount = null;
        while (it.hasNext()) {
            AccountRow accountRow = (AccountRow) it.next();
            ModernAccount b = hVar.b(accountRow);
            if (b != null) {
                if (uid != null && uid.equals(b.getUid())) {
                    return b;
                }
                if (TextUtils.equals(lowerCase, accountRow.name.replace('.', LicenseUtility.SEPARATOR).toLowerCase(Locale.US))) {
                    modernAccount = b;
                }
            }
        }
        if (modernAccount == null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "ModernAccount not found for uid = " + uid, 8);
            }
        }
        return modernAccount;
    }

    public static String c(PushPlatform pushPlatform) {
        int i = l0.a[pushPlatform.ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return ".hms";
        }
        if (i == 3) {
            return ".rustore";
        }
        w511.b();
        return null;
    }

    public static String d(Uid uid, PushPlatform pushPlatform) {
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        return sb.toString().concat(c(pushPlatform));
    }
}
