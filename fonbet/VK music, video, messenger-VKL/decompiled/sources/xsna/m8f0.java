package xsna;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: RealDeviceIdProvider.kt */
/* loaded from: classes.dex */
public final class m8f0 {
    public static volatile String a = new String();
    public static volatile String b = new String();
    public static volatile w83 c;

    public static String a() {
        String str = Build.PRODUCT + Build.BOARD + Build.BOOTLOADER + Build.BRAND + Build.DEVICE + Build.DISPLAY + Build.FINGERPRINT + Build.HARDWARE + Build.HOST + Build.ID + Build.MANUFACTURER + Build.MODEL + Build.TAGS;
        char[] cArr = vb00.a;
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(Charset.forName(C.UTF8_NAME)));
            ((StringBuilder) vb00.b.getValue()).setLength(0);
            for (byte b2 : digest) {
                bpn0 bpn0Var = vb00.b;
                StringBuilder sb = (StringBuilder) bpn0Var.getValue();
                char[] cArr2 = vb00.a;
                sb.append(cArr2[(b2 & 240) >> 4]);
                ((StringBuilder) bpn0Var.getValue()).append(cArr2[b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER]);
            }
            return ((StringBuilder) vb00.b.getValue()).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        if (b.length() > 0) {
            return b;
        }
        L.e("next_device_id is null or empty: " + a);
        w83 w83Var = c;
        if (w83Var == null) {
            w83Var = null;
        }
        b = w83Var.a();
        if (TextUtils.isEmpty(b)) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            String a2 = a();
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(string)) {
                string = BuildConfig.FLAVOR;
            }
            arrayList.add(string);
            if (TextUtils.isEmpty(a2)) {
                a2 = BuildConfig.FLAVOR;
            }
            arrayList.add(a2);
            b = j5g.g0(arrayList, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, 0, null, 62);
            w83 w83Var2 = c;
            (w83Var2 != null ? w83Var2 : null).b(b);
        }
        L.e("new next_device_id: " + b);
        return b;
    }

    public static boolean c(Context context, JSONObject jSONObject) {
        String optString;
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("installed_after");
            } catch (Exception e) {
                L.g("couldn't check whether device id should be requested", e);
                return false;
            }
        } else {
            optString = null;
        }
        if (optString != null && optString.length() != 0) {
            Date parse = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(optString);
            Long valueOf = parse != null ? Long.valueOf(parse.getTime()) : null;
            if (valueOf != null) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime > valueOf.longValue();
            }
            L.l("Cannot parse date: ".concat(optString));
            return false;
        }
        L.l("No installed_after date supplied!");
        return false;
    }
}
