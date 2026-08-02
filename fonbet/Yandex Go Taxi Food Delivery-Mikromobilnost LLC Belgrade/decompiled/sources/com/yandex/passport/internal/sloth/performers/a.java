package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import android.content.pm.SigningInfo;
import android.util.Base64;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.v;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.g8e;
import defpackage.iqn;
import defpackage.oyr;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class a implements s {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        String s;
        Context context = this.a;
        try {
            String packageName = context.getPackageName();
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(packageName, SelfTester_JCP.DECRYPT_CNT).signingInfo;
            String f = oyr.f(HexString.CHAR_SPACE, packageName, (signingInfo != null ? signingInfo.getApkContentsSigners() : null)[0].toCharsString());
            MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA_256);
            messageDigest.update(f.getBytes(StandardCharsets.UTF_8));
            s = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3).substring(0, 11);
        } catch (Throwable th) {
            s = g8e.s(th, new StringBuilder("Error: "));
        }
        return new iqn(new v(s));
    }
}
