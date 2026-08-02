package yads;

import android.content.Context;
import android.util.Xml;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes10.dex */
public final class ie3 {
    public final vq3 a;
    public final hd3 b;

    public /* synthetic */ ie3(Context context, jp2 jp2Var) {
        this(new vq3(), new hd3(context, jp2Var));
    }

    public final dd3 a(String str, kn knVar) {
        ye3 ye3Var;
        XmlPullParser newPullParser = Xml.newPullParser();
        boolean z = false;
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        this.a.getClass();
        newPullParser.require(2, null, "VAST");
        hd3 hd3Var = this.b;
        hd3Var.a.getClass();
        String attributeValue = newPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            hd3Var.a.getClass();
            int i = 3;
            if (newPullParser.next() == 3) {
                break;
            }
            hd3Var.a.getClass();
            if (newPullParser.getEventType() == 2) {
                if ("Ad".equals(newPullParser.getName())) {
                    bg3 bg3Var = hd3Var.b;
                    bg3Var.e.a.getClass();
                    newPullParser.require(2, null, "Ad");
                    String attributeValue2 = newPullParser.getAttributeValue(null, "id");
                    if (attributeValue2 == null || attributeValue2.length() == 0) {
                        attributeValue2 = null;
                    }
                    bg3Var.d.a.getClass();
                    newPullParser.require(2, null, "Ad");
                    Integer b = bi3.b(newPullParser.getAttributeValue(null, SignalingProtocol.KEY_SEQUENCE));
                    if (b != null && b.intValue() < 0) {
                        b = null;
                    }
                    bg3Var.a.getClass();
                    newPullParser.require(2, null, "Ad");
                    while (true) {
                        ye3Var = null;
                        while (true) {
                            bg3Var.a.getClass();
                            if (newPullParser.next() == i) {
                                break;
                            }
                            bg3Var.a.getClass();
                            if (newPullParser.getEventType() == 2) {
                                String name = newPullParser.getName();
                                if ("InLine".equals(name)) {
                                    xe3 xe3Var = new xe3(z, new oh3(bg3Var.f));
                                    xe3Var.k = attributeValue2;
                                    xe3Var.j = b;
                                    k61 k61Var = bg3Var.b;
                                    k61Var.b.getClass();
                                    newPullParser.require(2, null, "InLine");
                                    while (true) {
                                        k61Var.b.getClass();
                                        if (newPullParser.next() == 3) {
                                            break;
                                        }
                                        k61Var.b.getClass();
                                        if (newPullParser.getEventType() == 2) {
                                            k61Var.a.a(newPullParser, xe3Var, knVar);
                                        }
                                    }
                                    ye3Var = xe3Var.a();
                                    if (ye3Var.b.isEmpty()) {
                                        break;
                                    }
                                    i = 3;
                                } else if ("Wrapper".equals(name)) {
                                    xe3 xe3Var2 = new xe3(true, new oh3(bg3Var.f));
                                    xe3Var2.k = attributeValue2;
                                    xe3Var2.j = b;
                                    pq3 pq3Var = bg3Var.c;
                                    pq3Var.a.getClass();
                                    newPullParser.require(2, null, "Wrapper");
                                    pq3Var.c.getClass();
                                    xe3Var2.c = new mq3(nq3.a(newPullParser, "allowMultipleAds", z), nq3.a(newPullParser, "followAdditionalWrappers", true));
                                    while (true) {
                                        pq3Var.a.getClass();
                                        i = 3;
                                        if (newPullParser.next() == 3) {
                                            break;
                                        }
                                        pq3Var.a.getClass();
                                        if (newPullParser.getEventType() == 2) {
                                            if ("VASTAdTagURI".equals(newPullParser.getName())) {
                                                pq3Var.a.getClass();
                                                xe3Var2.h = vq3.a(newPullParser);
                                            } else {
                                                pq3Var.b.a(newPullParser, xe3Var2, knVar);
                                            }
                                        }
                                    }
                                    ye3Var = xe3Var2.a();
                                } else {
                                    i = 3;
                                    bg3Var.a.getClass();
                                    vq3.b(newPullParser);
                                }
                            }
                            z = false;
                        }
                        i = 3;
                    }
                    if (ye3Var != null) {
                        arrayList.add(ye3Var);
                    }
                } else {
                    hd3Var.a.getClass();
                    vq3.b(newPullParser);
                }
                z = false;
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new dd3(attributeValue, arrayList);
    }

    public ie3(vq3 vq3Var, hd3 hd3Var) {
        this.a = vq3Var;
        this.b = hd3Var;
    }
}
