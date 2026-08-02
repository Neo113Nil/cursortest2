package com.yandex.passport.internal.authsdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.passport.R;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.core.accounts.d;
import com.yandex.passport.internal.entities.o;
import com.yandex.passport.internal.filter.i;
import com.yandex.passport.internal.ui.authsdk.AuthSdkProperties;
import com.yandex.passport.internal.util.p;
import defpackage.oyr;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {
    public final d a;
    public final i b;

    public b(d dVar, i iVar) {
        this.a = dVar;
        this.b = iVar;
    }

    public static boolean b(Context context, String str) {
        boolean z;
        for (String str2 : context.getResources().getStringArray(R.array.passport_trusted_application_fingerprints)) {
            String[] split = str2.split(":");
            if (TextUtils.equals(split[0], str)) {
                PackageManager packageManager = context.getPackageManager();
                String str3 = split[1];
                try {
                    byte[] bArr = o.c;
                    z = Arrays.equals(p.f(packageManager, str).a(), Base64.decode(str3, 0));
                } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle a() {
        List d = this.b.d(this.a.a().f(), AuthSdkProperties.createDefaultFilter(false));
        Bundle bundle = new Bundle();
        bundle.putInt("com.yandex.auth.ACCOUNTS_COUNT", d.size());
        for (int i = 0; i < d.size(); i++) {
            ModernAccount modernAccount = (ModernAccount) d.get(i);
            bundle.putLong(oyr.j(i, "account-", "-com.yandex.auth.UID_VALUE"), modernAccount.getUid().getValue());
            bundle.putString("account-" + i + "-com.yandex.auth.PRIMARY_DISPLAY_NAME", modernAccount.getPrimaryDisplayName());
            bundle.putString("account-" + i + "-com.yandex.auth.SECONDARY_DISPLAY_NAME", modernAccount.getSecondaryDisplayName());
            bundle.putBoolean("account-" + i + "-com.yandex.auth.IS_AVATAR_EMPTY", modernAccount.isAvatarEmpty());
            String str = "account-" + i + "-com.yandex.auth.AVATAR_URL";
            String m296getAvatarUrlxSnV4o = modernAccount.m296getAvatarUrlxSnV4o();
            if (m296getAvatarUrlxSnV4o == null) {
                m296getAvatarUrlxSnV4o = null;
            }
            bundle.putString(str, m296getAvatarUrlxSnV4o);
        }
        return bundle;
    }
}
