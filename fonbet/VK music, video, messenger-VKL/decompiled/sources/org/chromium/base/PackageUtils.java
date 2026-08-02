package org.chromium.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.provider.Settings;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes8.dex */
public class PackageUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String DEFAULT_ASSISTANT_SETTING = "assistant";
    private static final char[] HEX_CHAR_LOOKUP = "0123456789ABCDEF".toCharArray();
    private static final String TAG = "PackageUtils";

    private PackageUtils() {
    }

    public static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder((bArr.length * 3) - 1);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = HEX_CHAR_LOOKUP;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & AmfConstants.TYPE_XML_DOCUMENT_MARKER]);
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static PackageInfo getApplicationPackageInfo(int i) {
        BuildInfo buildInfo = BuildInfo.getInstance();
        if (!buildInfo.packageName.equals(buildInfo.hostPackageName)) {
            maybeWorkAroundWebViewPackageVisibility();
        }
        return getPackageInfo(buildInfo.packageName, i);
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static List<String> getCertificateSHA256FingerprintForPackage(String str) {
        PackageInfo packageInfo = getPackageInfo(str, 64);
        if (packageInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
        for (Signature signature : packageInfo.signatures) {
            try {
                arrayList.add(byteArrayToHexString(MessageDigest.getInstance("SHA256").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getEncoded())));
            } catch (NoSuchAlgorithmException | CertificateException e) {
                Log.w(TAG, "Exception", e);
                return null;
            }
        }
        return arrayList;
    }

    public static String getDefaultAssistantPackageName(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), DEFAULT_ASSISTANT_SETTING);
        if (string != null) {
            int length = string.length();
            int i = 0;
            while (i < length) {
                int codePointAt = string.codePointAt(i);
                if (!Character.isWhitespace(codePointAt)) {
                    String[] split = string.split(DomExceptionUtils.SEPARATOR);
                    if (split.length > 1) {
                        String str = split[0];
                        int length2 = str.length();
                        int i2 = 0;
                        while (i2 < length2) {
                            int codePointAt2 = str.codePointAt(i2);
                            if (!Character.isWhitespace(codePointAt2)) {
                                return split[0];
                            }
                            i2 += Character.charCount(codePointAt2);
                        }
                    }
                    return null;
                }
                i += Character.charCount(codePointAt);
            }
        }
        return null;
    }

    public static PackageInfo getPackageInfo(String str, int i) {
        try {
            return ContextUtils.getApplicationContext().getPackageManager().getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int getPackageVersion(String str) {
        PackageInfo packageInfo = getPackageInfo(str, 0);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return -1;
    }

    public static boolean isPackageInstalled(String str) {
        return getPackageInfo(str, 0) != null;
    }

    public static void maybeWorkAroundWebViewPackageVisibility() {
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 34) {
            return;
        }
        try {
            Class.forName("android.webkit.WebViewUpdateService").getDeclaredMethod("getCurrentWebViewPackageName", null).invoke(null, null);
        } catch (Exception e) {
            Log.w(TAG, "maybeWorkAroundWebViewPackageVisibility failed", (Throwable) e);
        }
    }

    public static long packageVersionCode(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }
}
