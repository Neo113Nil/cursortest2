package xsna;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KeyFrames.java */
/* loaded from: classes11.dex */
public final class kdy {
    public static final HashMap<String, Constructor<? extends zcy>> b;
    public final HashMap<Integer, ArrayList<zcy>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends zcy>> hashMap = new HashMap<>();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", ddy.class.getConstructor(null));
            hashMap.put("KeyPosition", ydy.class.getConstructor(null));
            hashMap.put("KeyCycle", edy.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", eey.class.getConstructor(null));
            hashMap.put("KeyTrigger", fey.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public kdy() {
    }

    public final void a(ea30 ea30Var) {
        Integer valueOf = Integer.valueOf(ea30Var.c);
        HashMap<Integer, ArrayList<zcy>> hashMap = this.a;
        ArrayList<zcy> arrayList = hashMap.get(valueOf);
        if (arrayList != null) {
            ea30Var.w.addAll(arrayList);
        }
        ArrayList<zcy> arrayList2 = hashMap.get(-1);
        if (arrayList2 != null) {
            Iterator<zcy> it = arrayList2.iterator();
            while (it.hasNext()) {
                zcy next = it.next();
                String str = ((ConstraintLayout.b) ea30Var.b.getLayoutParams()).Y;
                String str2 = next.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    ea30Var.w.add(next);
                }
            }
        }
    }

    public final void b(zcy zcyVar) {
        Integer valueOf = Integer.valueOf(zcyVar.b);
        HashMap<Integer, ArrayList<zcy>> hashMap = this.a;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(zcyVar.b), new ArrayList<>());
        }
        ArrayList<zcy> arrayList = hashMap.get(Integer.valueOf(zcyVar.b));
        if (arrayList != null) {
            arrayList.add(zcyVar);
        }
    }

    public kdy(Context context, XmlResourceParser xmlResourceParser) {
        Exception e;
        zcy zcyVar;
        Constructor<? extends zcy> constructor;
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            zcy zcyVar2 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends zcy>> hashMap3 = b;
                    if (hashMap3.containsKey(name)) {
                        try {
                            constructor = hashMap3.get(name);
                        } catch (Exception e2) {
                            zcy zcyVar3 = zcyVar2;
                            e = e2;
                            zcyVar = zcyVar3;
                        }
                        if (constructor != null) {
                            zcyVar = constructor.newInstance(null);
                            try {
                                zcyVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(zcyVar);
                            } catch (Exception e3) {
                                e = e3;
                                Log.e("KeyFrames", "unable to create ", e);
                                zcyVar2 = zcyVar;
                                eventType = xmlResourceParser.next();
                            }
                            zcyVar2 = zcyVar;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (zcyVar2 != null && (hashMap2 = zcyVar2.d) != null) {
                            ConstraintAttribute.d(context, xmlResourceParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && zcyVar2 != null && (hashMap = zcyVar2.d) != null) {
                        ConstraintAttribute.d(context, xmlResourceParser, hashMap);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
