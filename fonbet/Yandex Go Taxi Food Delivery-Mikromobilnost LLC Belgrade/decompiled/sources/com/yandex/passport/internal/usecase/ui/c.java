package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.entities.AccountType;
import com.yandex.passport.internal.ui.bouncer.model.s2;
import defpackage.uvc;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class c implements Comparator {
    public static int a(s2 s2Var, s2 s2Var2) {
        int compareTo = Integer.valueOf(s2Var2.i.size()).compareTo(Integer.valueOf(s2Var.i.size()));
        if (compareTo != 0) {
            return compareTo;
        }
        AccountType accountType = s2Var2.g;
        AccountType accountType2 = AccountType.PORTAL;
        int compareTo2 = Boolean.valueOf(accountType == accountType2).compareTo(Boolean.valueOf(s2Var.g == accountType2));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        String str = s2Var.d;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        String str2 = s2Var2.d;
        int b = uvc.b(lowerCase, str2 != null ? str2.toLowerCase(Locale.ROOT) : null);
        if (b != 0) {
            return b;
        }
        String str3 = s2Var.c;
        String lowerCase2 = str3 != null ? str3.toLowerCase(Locale.ROOT) : null;
        String str4 = s2Var2.c;
        return uvc.b(lowerCase2, str4 != null ? str4.toLowerCase(Locale.ROOT) : null);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((s2) obj, (s2) obj2);
    }
}
