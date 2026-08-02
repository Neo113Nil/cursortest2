package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final class e03 {
    public static final String a = psr.class.getName().concat(".aot-shared-library-name");
    public static final String b = psr.class.getName().concat(".vm-snapshot-data");
    public static final String c = psr.class.getName().concat(".isolate-snapshot-data");
    public static final String d = psr.class.getName().concat(".flutter-assets-dir");

    public static gl a(Context context) {
        int i;
        String str = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String string = bundle == null ? null : bundle.getString(a, null);
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                bundle2.getString(b, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            if (bundle3 != null) {
                bundle3.getString(c, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String string2 = bundle4 == null ? null : bundle4.getString(d, null);
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                b(xml, jSONArray, false);
                            }
                        }
                    }
                    str = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str2 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            boolean z = bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true;
            gl glVar = new gl();
            if (string == null) {
                string = "libapp.so";
            }
            glVar.b = string;
            if (string2 == null) {
                string2 = "flutter_assets";
            }
            glVar.c = string2;
            glVar.x = str2;
            if (str == null) {
                str = "";
            }
            glVar.w = str;
            glVar.a = z;
            return glVar;
        } catch (PackageManager.NameNotFoundException e) {
            ny61.j(e);
            return null;
        }
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        ny61.r("Expected text");
                        return;
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        ny61.r("Expected end of domain tag");
                        return;
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
