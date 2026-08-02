package com.pichillilorenzo.flutter_inappwebview_android;

import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import defpackage.da20;
import defpackage.ea20;
import defpackage.x920;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes11.dex */
public class PlatformUtil extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "PlatformUtil";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_platformutil";
    public InAppWebViewFlutterPlugin plugin;

    public PlatformUtil(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String formatDate(long j, String str, Locale locale, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    public static Locale getLocaleFromString(String str) {
        if (str == null) {
            return Locale.US;
        }
        String[] split = str.split("_");
        return new Locale(split[0], split.length > 1 ? split[1] : "", split.length > 2 ? split[2] : "");
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        str.getClass();
        if (!str.equals("formatDate")) {
            if (str.equals("getSystemVersion")) {
                da20Var.success(String.valueOf(Build.VERSION.SDK_INT));
                return;
            } else {
                da20Var.notImplemented();
                return;
            }
        }
        long longValue = ((Long) x920Var.a(MetaDataField.DATE_FIELD)).longValue();
        String str2 = (String) x920Var.a("format");
        Locale localeFromString = getLocaleFromString((String) x920Var.a("locale"));
        String str3 = (String) x920Var.a("timezone");
        if (str3 == null) {
            str3 = "UTC";
        }
        da20Var.success(formatDate(longValue, str2, localeFromString, TimeZone.getTimeZone(str3)));
    }
}
