package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: TransitionInflater.java */
/* loaded from: classes12.dex */
public final class omp0 {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final zk3<String, Constructor<?>> c = new zk3<>();
    public final Context a;

    public omp0(Context context) {
        this.a = context;
    }

    public static omp0 c(Context context) {
        return new omp0(context);
    }

    public final Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            zk3<String, Constructor<?>> zk3Var = c;
            synchronized (zk3Var) {
                try {
                    Constructor<?> constructor = zk3Var.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = asSubclass.getConstructor(b);
                        constructor.setAccessible(true);
                        zk3Var.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(this.a, attributeSet);
                } finally {
                }
            }
            return newInstance;
        } catch (Exception e) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x02a7, code lost:
    
        return r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [xsna.omp0] */
    /* JADX WARN: Type inference failed for: r19v0, types: [xsna.vlp0] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [xsna.dnp0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [xsna.vlp0] */
    /* JADX WARN: Type inference failed for: r7v10, types: [xsna.jta] */
    /* JADX WARN: Type inference failed for: r7v11, types: [xsna.vlp0] */
    /* JADX WARN: Type inference failed for: r7v12, types: [xsna.x9q] */
    /* JADX WARN: Type inference failed for: r7v13, types: [xsna.a0k0, xsna.p4u0] */
    /* JADX WARN: Type inference failed for: r7v14, types: [xsna.wra] */
    /* JADX WARN: Type inference failed for: r7v15, types: [xsna.vlp0] */
    /* JADX WARN: Type inference failed for: r7v16, types: [xsna.p4u0] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [xsna.vlp0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [xsna.dnp0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [xsna.vlp0] */
    /* JADX WARN: Type inference failed for: r7v8, types: [xsna.dnp0, xsna.mk5] */
    /* JADX WARN: Type inference failed for: r7v9, types: [xsna.vlp0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vlp0 b(XmlPullParser xmlPullParser, AttributeSet attributeSet, vlp0 vlp0Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        ?? r5 = vlp0Var instanceof dnp0 ? (dnp0) vlp0Var : 0;
        loop0: while (true) {
            ?? r7 = 0;
            while (true) {
                int next = xmlPullParser.next();
                int i = 3;
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    int i2 = 2;
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        boolean equals = "fade".equals(name);
                        Context context = this.a;
                        if (equals) {
                            r7 = new biq(context, attributeSet);
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jtm0.e);
                            r7.setMode(ytp0.f(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, r7.getMode()));
                            obtainStyledAttributes.recycle();
                        } else if ("changeBounds".equals(name)) {
                            r7 = new wra(context, attributeSet);
                        } else if ("slide".equals(name)) {
                            r7 = new a0k0(context, attributeSet);
                            r7.b = a0k0.k;
                            r7.c = 80;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, jtm0.g);
                            int f = ytp0.f(obtainStyledAttributes2, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
                            obtainStyledAttributes2.recycle();
                            r7.a(f);
                        } else if ("explode".equals(name)) {
                            r7 = new x9q(context, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            r7 = new asa(context, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            r7 = new jta(context, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            r7 = new xra(context, attributeSet);
                        } else if ("autoTransition".equals(name)) {
                            r7 = new mk5(context, attributeSet);
                            r7.j();
                        } else if ("changeScroll".equals(name)) {
                            r7 = new usa(context, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            r7 = new dnp0(context, attributeSet);
                        } else if ("transition".equals(name)) {
                            r7 = (vlp0) a(attributeSet, vlp0.class, "transition");
                        } else if ("targets".equals(name)) {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if ((next2 == i && xmlPullParser.getDepth() <= depth2) || next2 == 1) {
                                    break;
                                }
                                if (next2 != i2) {
                                    i = 3;
                                } else {
                                    if (!xmlPullParser.getName().equals("target")) {
                                        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                                    }
                                    TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, jtm0.a);
                                    int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "targetId") != null ? obtainStyledAttributes3.getResourceId(1, 0) : 0;
                                    if (resourceId != 0) {
                                        vlp0Var.addTarget(resourceId);
                                    } else {
                                        int resourceId2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "excludeId") != null ? obtainStyledAttributes3.getResourceId(i2, 0) : 0;
                                        if (resourceId2 != 0) {
                                            vlp0Var.excludeTarget(resourceId2, true);
                                        } else {
                                            String h = ytp0.h(obtainStyledAttributes3, xmlPullParser, "targetName", 4);
                                            if (h != null) {
                                                vlp0Var.addTarget(h);
                                            } else {
                                                String h2 = ytp0.h(obtainStyledAttributes3, xmlPullParser, "excludeName", 5);
                                                if (h2 != null) {
                                                    vlp0Var.excludeTarget(h2, true);
                                                } else {
                                                    String h3 = ytp0.h(obtainStyledAttributes3, xmlPullParser, "excludeClass", 3);
                                                    if (h3 != null) {
                                                        try {
                                                            vlp0Var.excludeTarget(Class.forName(h3), true);
                                                        } catch (ClassNotFoundException e) {
                                                            obtainStyledAttributes3.recycle();
                                                            throw new RuntimeException(go9.b("Could not create ", h3), e);
                                                        }
                                                    } else {
                                                        String h4 = ytp0.h(obtainStyledAttributes3, xmlPullParser, "targetClass", 0);
                                                        if (h4 != null) {
                                                            vlp0Var.addTarget(Class.forName(h4));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    obtainStyledAttributes3.recycle();
                                    i = 3;
                                    i2 = 2;
                                }
                            }
                        } else if ("arcMotion".equals(name)) {
                            if (vlp0Var == 0) {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                            cg3 cg3Var = new cg3();
                            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            cg3Var.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            cg3Var.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            cg3Var.c = cg3.d;
                            TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, jtm0.i);
                            XmlPullParser xmlPullParser2 = (XmlPullParser) attributeSet;
                            cg3Var.b = cg3.b(ytp0.e(obtainStyledAttributes4, xmlPullParser2, "minimumVerticalAngle", 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "minimumHorizontalAngle") != null) {
                                f2 = obtainStyledAttributes4.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                            cg3Var.a = cg3.b(f2);
                            cg3Var.c = cg3.b(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "maximumAngle") != null ? obtainStyledAttributes4.getFloat(2, 70.0f) : 70.0f);
                            obtainStyledAttributes4.recycle();
                            vlp0Var.setPathMotion(cg3Var);
                        } else if ("pathMotion".equals(name)) {
                            if (vlp0Var == 0) {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                            vlp0Var.setPathMotion((pq90) a(attributeSet, pq90.class, "pathMotion"));
                        } else {
                            if (!"patternPathMotion".equals(name)) {
                                throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                            }
                            if (vlp0Var == 0) {
                                throw new RuntimeException("Invalid use of patternPathMotion element");
                            }
                            vlp0Var.setPathMotion(new dr90(context, attributeSet));
                        }
                        if (r7 == 0) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                b(xmlPullParser, attributeSet, r7);
                            }
                            if (r5 != 0) {
                                break;
                            }
                            if (vlp0Var != 0) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            r5.c(r7);
        }
    }

    public final vlp0 d() {
        XmlResourceParser xml = this.a.getResources().getXml(R.transition.fade_out);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }
}
