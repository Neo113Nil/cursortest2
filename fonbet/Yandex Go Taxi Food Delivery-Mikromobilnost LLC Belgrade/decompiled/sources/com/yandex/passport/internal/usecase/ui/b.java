package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.ui.bouncer.model.r2;
import defpackage.uvc;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class b implements Comparator {
    public static int a(r2 r2Var, r2 r2Var2) {
        ModernAccount modernAccount = r2Var.a;
        ModernAccount modernAccount2 = r2Var2.a;
        int compareTo = Integer.valueOf(r2Var2.b.size()).compareTo(Integer.valueOf(r2Var.b.size()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(modernAccount2.getHasPlus()).compareTo(Boolean.valueOf(modernAccount.getHasPlus()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        int compareTo3 = Boolean.valueOf(modernAccount2.isPortal()).compareTo(Boolean.valueOf(modernAccount.isPortal()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        int compareTo4 = Boolean.valueOf(modernAccount.isPhonish()).compareTo(Boolean.valueOf(modernAccount2.isPhonish()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        String primaryDisplayName = modernAccount.getPrimaryDisplayName();
        Locale locale = Locale.ROOT;
        int compareTo5 = primaryDisplayName.toLowerCase(locale).compareTo(modernAccount2.getPrimaryDisplayName().toLowerCase(locale));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        String secondaryDisplayName = modernAccount.getSecondaryDisplayName();
        String lowerCase = secondaryDisplayName != null ? secondaryDisplayName.toLowerCase(locale) : null;
        String secondaryDisplayName2 = modernAccount2.getSecondaryDisplayName();
        int b = uvc.b(lowerCase, secondaryDisplayName2 != null ? secondaryDisplayName2.toLowerCase(locale) : null);
        if (b != 0) {
            return b;
        }
        String displayLogin = modernAccount.getDisplayLogin();
        String lowerCase2 = displayLogin != null ? displayLogin.toLowerCase(locale) : null;
        String displayLogin2 = modernAccount2.getDisplayLogin();
        return uvc.b(lowerCase2, displayLogin2 != null ? displayLogin2.toLowerCase(locale) : null);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((r2) obj, (r2) obj2);
    }
}
