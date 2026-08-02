package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.AccountType;
import com.yandex.passport.internal.ui.bouncer.model.r2;
import com.yandex.passport.internal.ui.bouncer.model.s2;
import com.yandex.passport.internal.ui.bouncer.model.t2;
import defpackage.uvc;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a implements Comparator {
    public final b a = new b();
    public final c b = new c();

    public static int a(r2 r2Var, s2 s2Var) {
        Integer valueOf = Integer.valueOf(s2Var.i.size());
        List list = r2Var.b;
        ModernAccount modernAccount = r2Var.a;
        int compareTo = valueOf.compareTo(Integer.valueOf(list.size()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(s2Var.g == AccountType.PORTAL).compareTo(Boolean.valueOf(modernAccount.isPortal()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        String publicName = modernAccount.getPublicName();
        String lowerCase = publicName != null ? publicName.toLowerCase(Locale.ROOT) : null;
        String str = s2Var.d;
        int b = uvc.b(lowerCase, str != null ? str.toLowerCase(Locale.ROOT) : null);
        if (b != 0) {
            return b;
        }
        String displayLogin = modernAccount.getDisplayLogin();
        String lowerCase2 = displayLogin != null ? displayLogin.toLowerCase(Locale.ROOT) : null;
        String str2 = s2Var.c;
        return uvc.b(lowerCase2, str2 != null ? str2.toLowerCase(Locale.ROOT) : null);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        t2 t2Var = (t2) obj;
        t2 t2Var2 = (t2) obj2;
        boolean z = t2Var instanceof r2;
        if (z && (t2Var2 instanceof r2)) {
            this.a.getClass();
            return b.a((r2) t2Var, (r2) t2Var2);
        }
        boolean z2 = t2Var instanceof s2;
        if (!z2 || !(t2Var2 instanceof s2)) {
            return (z && (t2Var2 instanceof s2)) ? a((r2) t2Var, (s2) t2Var2) : (z2 && (t2Var2 instanceof r2)) ? a((r2) t2Var2, (s2) t2Var) * (-1) : Boolean.valueOf(t2Var2 instanceof r2).compareTo(Boolean.valueOf(z));
        }
        this.b.getClass();
        return c.a((s2) t2Var, (s2) t2Var2);
    }
}
