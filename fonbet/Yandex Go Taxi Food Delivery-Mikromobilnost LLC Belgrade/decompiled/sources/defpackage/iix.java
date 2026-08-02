package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public class iix {
    public static final HashMap b;
    public final HashMap a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", shx.class.getConstructor(null));
            hashMap.put("KeyPosition", ajx.class.getConstructor(null));
            hashMap.put("KeyCycle", whx.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", ljx.class.getConstructor(null));
            hashMap.put("KeyTrigger", qjx.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public iix(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        jhx jhxVar;
        HashMap hashMap;
        HashMap hashMap2;
        jhx ljxVar;
        try {
            eventType = xmlResourceParser.getEventType();
            jhxVar = null;
        } catch (IOException e) {
            Log.e("KeyFrames", "Error parsing XML resource", e);
            return;
        } catch (XmlPullParserException e2) {
            Log.e("KeyFrames", "Error parsing XML resource", e2);
            return;
        }
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (b.containsKey(name)) {
                    switch (name.hashCode()) {
                        case -300573030:
                            if (!name.equals("KeyTimeCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            ljxVar = new ljx();
                            ljxVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(ljxVar);
                            jhxVar = ljxVar;
                            break;
                        case -298435811:
                            if (!name.equals("KeyAttribute")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            ljxVar = new shx();
                            ljxVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(ljxVar);
                            jhxVar = ljxVar;
                            break;
                        case 540053991:
                            if (!name.equals("KeyCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            ljxVar = new whx();
                            ljxVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(ljxVar);
                            jhxVar = ljxVar;
                            break;
                        case 1153397896:
                            if (!name.equals("KeyPosition")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            ljxVar = new ajx();
                            ljxVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(ljxVar);
                            jhxVar = ljxVar;
                            break;
                        case 1308496505:
                            if (!name.equals("KeyTrigger")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            ljxVar = new qjx();
                            ljxVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(ljxVar);
                            jhxVar = ljxVar;
                            break;
                        default:
                            throw new NullPointerException("Key " + name + " not found");
                    }
                    return;
                }
                if (name.equalsIgnoreCase("CustomAttribute")) {
                    if (jhxVar != null && (hashMap2 = jhxVar.d) != null) {
                        c7e.e(context, xmlResourceParser, hashMap2);
                    }
                } else if (name.equalsIgnoreCase("CustomMethod") && jhxVar != null && (hashMap = jhxVar.d) != null) {
                    c7e.e(context, xmlResourceParser, hashMap);
                }
            } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                return;
            }
            eventType = xmlResourceParser.next();
        }
    }

    public final void a(ia30 ia30Var) {
        Integer valueOf = Integer.valueOf(ia30Var.c);
        HashMap hashMap = this.a;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            ia30Var.w.addAll(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) hashMap.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                jhx jhxVar = (jhx) it.next();
                String str = ((ConstraintLayout.LayoutParams) ia30Var.b.getLayoutParams()).constraintTag;
                String str2 = jhxVar.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    ia30Var.a(jhxVar);
                }
            }
        }
    }

    public final void b(jhx jhxVar) {
        Integer valueOf = Integer.valueOf(jhxVar.b);
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(jhxVar.b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(jhxVar.b));
        if (arrayList != null) {
            arrayList.add(jhxVar);
        }
    }

    public iix() {
    }
}
