package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import xsna.epx;

/* loaded from: classes10.dex */
public final class h20 implements uq3 {
    public final vq3 a;
    public final gg1 b;
    public final f20 c;

    public /* synthetic */ h20(Context context, jp2 jp2Var) {
        this(new vq3(), new gg1(), new f20(context, jp2Var));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.uq3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        this.a.getClass();
        int i = 2;
        String str = null;
        xmlPullParser2.require(2, null, "Creative");
        this.a.getClass();
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        e20 e20Var = null;
        String str2 = null;
        r13 r13Var = 0;
        String str3 = null;
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            this.a.getClass();
            if (xmlPullParser2.next() == 3) {
                ArrayList arrayList5 = arrayList2;
                if (!z3) {
                    return null;
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof lm1) {
                        arrayList6.add(next);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 instanceof uc1) {
                        arrayList7.add(next2);
                    }
                }
                return new b20(arrayList6, arrayList7, arrayList3, arrayList4, e20Var, str2, r13Var, attributeValue, i2, str3);
            }
            this.a.getClass();
            if (xmlPullParser2.getEventType() == i) {
                String name = xmlPullParser2.getName();
                if ("Linear".equals(name)) {
                    gg1 gg1Var = this.b;
                    gg1Var.a.getClass();
                    xmlPullParser2.require(i, str, "Linear");
                    gg1Var.d.getClass();
                    String attributeValue2 = xmlPullParser2.getAttributeValue(str, "skipoffset");
                    if (attributeValue2 == null) {
                        attributeValue2 = "";
                    }
                    Object r13Var2 = attributeValue2.length() > 0 ? new r13(attributeValue2) : str;
                    while (true) {
                        gg1Var.a.getClass();
                        if (xmlPullParser2.next() != 3) {
                            gg1Var.a.getClass();
                            if (xmlPullParser2.getEventType() == i) {
                                String name2 = xmlPullParser2.getName();
                                if (name2 != null) {
                                    switch (name2.hashCode()) {
                                        case -2049897434:
                                            if (name2.equals("VideoClicks")) {
                                                gi3 a = gg1Var.b.a(xmlPullParser2);
                                                str2 = a.b;
                                                for (Iterator it3 = a.a.iterator(); it3.hasNext(); it3 = it3) {
                                                    arrayList4.add(new b93("clickTracking", (String) it3.next(), null));
                                                }
                                                break;
                                            }
                                            break;
                                        case -1927368268:
                                            if (name2.equals("Duration")) {
                                                el0 el0Var = gg1Var.c;
                                                el0Var.a.getClass();
                                                xmlPullParser2.require(i, str, "Duration");
                                                el0Var.a.getClass();
                                                Long a2 = bi3.a(vq3.a(xmlPullParser2));
                                                if (a2 != null) {
                                                    i2 = (int) a2.longValue();
                                                    break;
                                                } else {
                                                    i2 = 0;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        case -1348833651:
                                            if (name2.equals("AdParameters")) {
                                                gg1Var.a.getClass();
                                                str3 = vq3.a(xmlPullParser2);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -385055469:
                                            if (name2.equals("MediaFiles")) {
                                                arrayList2.addAll(gg1Var.e.a(xmlPullParser2, knVar));
                                                break;
                                            }
                                            break;
                                        case 70476538:
                                            if (name2.equals("Icons")) {
                                                arrayList3.addAll(gg1Var.f.a(xmlPullParser2, knVar));
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name2.equals("TrackingEvents")) {
                                                Iterator it4 = gg1Var.g.a(xmlPullParser2, knVar).iterator();
                                                while (it4.hasNext()) {
                                                    arrayList4.add((b93) it4.next());
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                                gg1Var.a.getClass();
                                vq3.b(xmlPullParser2);
                            }
                            i = 2;
                            str = null;
                        } else {
                            z3 = true;
                            r13Var = r13Var2;
                            i = 2;
                            str = null;
                        }
                    }
                } else if ("CreativeExtensions".equals(name)) {
                    f20 f20Var = this.c;
                    f20Var.a.getClass();
                    xmlPullParser2.require(2, null, "CreativeExtensions");
                    er0 er0Var = null;
                    ArrayList arrayList8 = null;
                    eg1 eg1Var = null;
                    while (true) {
                        f20Var.a.getClass();
                        ArrayList arrayList9 = arrayList2;
                        if (xmlPullParser2.next() != 3) {
                            f20Var.a.getClass();
                            if (xmlPullParser2.getEventType() != 2) {
                                z2 = z3;
                            } else if ("CreativeExtension".equals(xmlPullParser2.getName())) {
                                String attributeValue3 = xmlPullParser2.getAttributeValue(null, "type");
                                if ("false_click".equals(attributeValue3)) {
                                    er0Var = (er0) f20Var.c.a(xmlPullParser2, knVar);
                                } else if (epx.f(f20.e, attributeValue3)) {
                                    arrayList8 = f20Var.d.a(xmlPullParser2, knVar);
                                } else if (epx.f(f20.f, attributeValue3)) {
                                    fg1 fg1Var = f20Var.b;
                                    fg1Var.getClass();
                                    try {
                                        fg1Var.b.getClass();
                                        JSONObject jSONObject = new JSONObject(vq3.a(xmlPullParser2));
                                        Iterator<String> keys = jSONObject.keys();
                                        List list = EmptyList.b;
                                        while (keys.hasNext()) {
                                            Iterator<String> it5 = keys;
                                            String next3 = keys.next();
                                            boolean z4 = z3;
                                            if ("assets".equals(next3)) {
                                                list = fg1Var.a.a(jSONObject, knVar);
                                            } else if ("link".equals(next3)) {
                                                fg1Var.c.a(jSONObject.getJSONObject(next3), knVar);
                                            }
                                            z3 = z4;
                                            keys = it5;
                                        }
                                        z2 = z3;
                                        eg1Var = new eg1(list);
                                    } catch (Exception e) {
                                        throw new JSONException(e.getMessage());
                                    }
                                } else {
                                    z2 = z3;
                                    f20Var.a.getClass();
                                    vq3.b(xmlPullParser);
                                }
                                arrayList2 = arrayList9;
                            } else {
                                z2 = z3;
                                f20Var.a.getClass();
                                vq3.b(xmlPullParser);
                            }
                            xmlPullParser2 = xmlPullParser;
                            arrayList2 = arrayList9;
                            z3 = z2;
                        } else {
                            e20Var = new e20(er0Var, arrayList8, eg1Var);
                            arrayList2 = arrayList9;
                            i = 2;
                            str = null;
                            xmlPullParser2 = xmlPullParser;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    z = z3;
                    this.a.getClass();
                    vq3.b(xmlPullParser);
                }
            } else {
                arrayList = arrayList2;
                z = z3;
            }
            xmlPullParser2 = xmlPullParser;
            arrayList2 = arrayList;
            z3 = z;
            r13Var = r13Var;
            i = 2;
            str = null;
        }
    }

    public h20(vq3 vq3Var, gg1 gg1Var, f20 f20Var) {
        this.a = vq3Var;
        this.b = gg1Var;
        this.c = f20Var;
    }
}
