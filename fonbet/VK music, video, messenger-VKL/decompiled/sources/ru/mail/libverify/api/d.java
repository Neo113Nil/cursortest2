package ru.mail.libverify.api;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ru.mail.libverify.InternalApi;

@InternalApi
/* loaded from: classes9.dex */
public class d {
    @Nullable
    public static String a(@NonNull Context context, @NonNull String str) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return null;
            }
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(signature.toByteArray());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                if (i != 0) {
                    sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String hexString = Integer.toHexString(digest[i] & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("d", "name not found " + e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            Log.e("d", "no such an algorithm " + e2);
            return null;
        } catch (Exception e3) {
            Log.e("d", "exception " + e3);
            return null;
        }
    }
}
