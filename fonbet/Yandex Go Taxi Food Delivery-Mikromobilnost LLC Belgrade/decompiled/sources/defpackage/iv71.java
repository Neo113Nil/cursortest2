package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import yads.cc1;

/* loaded from: classes7.dex */
public final class iv71 implements zc81 {
    public final xf81 a;
    public final e071 b;
    public final fs71 c;
    public final c671 w;

    public iv71() {
        xf81 xf81Var = new xf81();
        e071 e071Var = new e071();
        fs71 fs71Var = new fs71();
        c671 c671Var = new c671();
        this.a = xf81Var;
        this.b = e071Var;
        this.c = fs71Var;
        this.w = c671Var;
    }

    @Override // defpackage.zc81
    public final Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        this.a.getClass();
        xmlPullParser.require(2, null, "Verification");
        String attributeValue = xmlPullParser.getAttributeValue(null, DRMInfoProvider.MediaDRMKeys.VENDOR);
        HashMap hashMap = new HashMap();
        cc1 cc1Var = null;
        String str = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    xf81 xf81Var = this.b.a;
                    xmlPullParser.require(2, null, "JavaScriptResource");
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "apiFramework");
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "browserOptional");
                    Boolean valueOf = attributeValue3 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue3)) : null;
                    String a = xf81.a(xmlPullParser);
                    cc1Var = (attributeValue2 == null || attributeValue2.length() == 0 || valueOf == null || a.length() <= 0) ? null : new cc1(attributeValue2, a, valueOf.booleanValue());
                } else if ("VerificationParameters".equals(name)) {
                    xf81 xf81Var2 = this.c.a;
                    xmlPullParser.require(2, null, "VerificationParameters");
                    str = xf81.a(xmlPullParser);
                    if (str.length() == 0) {
                        str = null;
                    }
                } else if ("TrackingEvents".equals(name)) {
                    c671 c671Var = this.w;
                    c671Var.a.getClass();
                    xmlPullParser.require(2, null, "TrackingEvents");
                    HashMap hashMap2 = new HashMap();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if ("Tracking".equals(xmlPullParser.getName())) {
                                tz61 a2 = c671Var.b.a(xmlPullParser);
                                if (a2 != null) {
                                    String str2 = a2.a;
                                    String str3 = a2.b;
                                    if (!hashMap2.containsKey(str2)) {
                                        hashMap2.put(str2, new ArrayList());
                                    }
                                    List list = (List) hashMap2.get(str2);
                                    if (list != null) {
                                        list.add(str3);
                                    }
                                }
                            } else {
                                xf81.b(xmlPullParser);
                            }
                        }
                    }
                    hashMap = hashMap2;
                } else {
                    xf81.b(xmlPullParser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new zi71(attributeValue, cc1Var, str, hashMap);
    }
}
