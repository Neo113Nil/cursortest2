package androidx.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.adjust.sdk.Constants;
import defpackage.b550;
import defpackage.cvu0;
import defpackage.f550;
import defpackage.i40;
import defpackage.j550;
import defpackage.k2i0;
import defpackage.ke50;
import defpackage.l2i0;
import defpackage.nrb1;
import defpackage.ny61;
import defpackage.o550;
import defpackage.p550;
import defpackage.prb1;
import defpackage.q550;
import defpackage.r550;
import defpackage.s550;
import defpackage.t550;
import defpackage.tls;
import defpackage.v450;
import defpackage.vg10;
import defpackage.w450;
import defpackage.x450;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class h {
    public static final ThreadLocal c = new ThreadLocal();
    public final Context a;
    public final ke50 b;

    public h(Context context, ke50 ke50Var) {
        this.a = context;
        this.b = ke50Var;
    }

    public static x450 c(TypedArray typedArray, Resources resources, int i) {
        t550 t550Var;
        String str;
        t550 t550Var2;
        t550 t550Var3;
        Object obj;
        int i2;
        boolean z;
        w450 w450Var = new w450();
        w450Var.b = typedArray.getBoolean(l2i0.NavArgument_nullable, false);
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(l2i0.NavArgument_argType);
        t550 t550Var4 = t550.c;
        t550 t550Var5 = t550.j;
        t550 t550Var6 = t550.p;
        t550 t550Var7 = t550.m;
        t550 t550Var8 = t550.g;
        t550 t550Var9 = t550.d;
        t550 t550Var10 = t550.f;
        t550 t550Var11 = t550.o;
        t550 t550Var12 = t550.l;
        t550 t550Var13 = t550.i;
        t550 t550Var14 = t550.b;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if ("integer".equals(string)) {
                t550Var = t550Var10;
                str = "boolean";
                t550Var2 = t550Var14;
            } else {
                t550Var = t550Var10;
                if ("integer[]".equals(string)) {
                    str = "boolean";
                    t550Var2 = t550Var9;
                } else {
                    if ("List<Int>".equals(string)) {
                        t550Var2 = t550.e;
                    } else if (Constants.LONG.equals(string)) {
                        str = "boolean";
                        t550Var2 = t550Var;
                    } else if ("long[]".equals(string)) {
                        str = "boolean";
                        t550Var2 = t550Var8;
                    } else if ("List<Long>".equals(string)) {
                        t550Var2 = t550.h;
                    } else if ("boolean".equals(string)) {
                        str = "boolean";
                        t550Var2 = t550Var12;
                    } else if ("boolean[]".equals(string)) {
                        str = "boolean";
                        t550Var2 = t550Var7;
                    } else if ("List<Boolean>".equals(string)) {
                        t550Var2 = t550.n;
                    } else {
                        if (!"string".equals(string)) {
                            if ("string[]".equals(string)) {
                                str = "boolean";
                                t550Var2 = t550Var6;
                            } else if ("List<String>".equals(string)) {
                                t550Var2 = t550.q;
                            } else if ("float".equals(string)) {
                                str = "boolean";
                                t550Var2 = t550Var13;
                            } else if ("float[]".equals(string)) {
                                str = "boolean";
                                t550Var2 = t550Var5;
                            } else if ("List<Float>".equals(string)) {
                                t550Var2 = t550.k;
                            } else if ("reference".equals(string)) {
                                str = "boolean";
                                t550Var2 = t550Var4;
                            } else if (string.length() != 0) {
                                try {
                                    str = "boolean";
                                    String concat = (!cvu0.x(string, Extension.DOT_CHAR, false) || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                                    boolean s = cvu0.s(string, "[]", false);
                                    if (s) {
                                        z = s;
                                        concat = concat.substring(0, concat.length() - 2);
                                    } else {
                                        z = s;
                                    }
                                    Class<?> cls = Class.forName(concat);
                                    t550 p550Var = Parcelable.class.isAssignableFrom(cls) ? z ? new p550(cls) : new q550(cls) : (!Enum.class.isAssignableFrom(cls) || z) ? Serializable.class.isAssignableFrom(cls) ? z ? new r550(cls) : new s550(cls) : null : new o550(cls);
                                    if (p550Var == null) {
                                        throw new IllegalArgumentException(concat.concat(" is not Serializable or Parcelable.").toString());
                                    }
                                    t550Var2 = p550Var;
                                } catch (ClassNotFoundException e) {
                                    ny61.j(e);
                                    return null;
                                }
                            }
                        }
                        str = "boolean";
                        t550Var2 = t550Var11;
                    }
                    str = "boolean";
                }
            }
        } else {
            t550Var = t550Var10;
            str = "boolean";
            t550Var2 = null;
        }
        if (typedArray.getValue(l2i0.NavArgument_android_defaultValue, typedValue)) {
            int i3 = typedValue.resourceId;
            if (t550Var2 == t550Var4) {
                if (i3 != 0) {
                    i2 = i3;
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String b = t550Var2.b();
                        sb.append("' for ");
                        sb.append(b);
                        sb.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    i2 = 0;
                }
                obj = Integer.valueOf(i2);
            } else {
                if (i3 != 0) {
                    if (t550Var2 != null) {
                        StringBuilder sb2 = new StringBuilder("unsupported value '");
                        sb2.append((Object) typedValue.string);
                        String b2 = t550Var2.b();
                        sb2.append("' for ");
                        sb2.append(b2);
                        sb2.append(". You must use a \"reference\" type to reference other resources.");
                        throw new XmlPullParserException(sb2.toString());
                    }
                    obj = Integer.valueOf(i3);
                } else if (t550Var2 == t550Var11) {
                    obj = typedArray.getString(l2i0.NavArgument_android_defaultValue);
                } else {
                    int i4 = typedValue.type;
                    if (i4 == 3) {
                        String obj2 = typedValue.string.toString();
                        if (t550Var2 == null) {
                            try {
                                t550Var14.d(obj2);
                                t550Var2 = t550Var14;
                            } catch (IllegalArgumentException unused) {
                                t550Var3 = t550Var;
                                try {
                                    try {
                                        try {
                                            t550Var3.d(obj2);
                                            t550Var2 = t550Var3;
                                        } catch (IllegalArgumentException unused2) {
                                            t550Var2 = t550Var11;
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        t550Var12.d(obj2);
                                        t550Var2 = t550Var12;
                                    }
                                } catch (IllegalArgumentException unused4) {
                                    t550Var13.d(obj2);
                                    t550Var2 = t550Var13;
                                }
                            }
                        }
                        t550Var3 = t550Var;
                        t550Var4 = t550Var2;
                        obj = t550Var4.d(obj2);
                    } else if (i4 == 4) {
                        t550Var4 = prb1.a(typedValue, t550Var2, t550Var13, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        t550Var4 = prb1.a(typedValue, t550Var2, t550Var14, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        t550Var4 = prb1.a(typedValue, t550Var2, t550Var12, string, str);
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (t550Var2 == t550Var13) {
                            t550Var4 = prb1.a(typedValue, t550Var2, t550Var13, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            t550Var4 = prb1.a(typedValue, t550Var2, t550Var14, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
                t550Var3 = t550Var;
            }
            t550Var4 = t550Var2;
            t550Var3 = t550Var;
        } else {
            t550Var3 = t550Var;
            t550Var4 = t550Var2;
            obj = null;
        }
        if (obj != null) {
            w450Var.c = obj;
            w450Var.d = true;
        }
        if (t550Var4 != null) {
            w450Var.a = t550Var4;
        }
        t550 t550Var15 = w450Var.a;
        if (t550Var15 == null) {
            Object obj3 = w450Var.c;
            if (obj3 instanceof Integer) {
                t550Var11 = t550Var14;
            } else if (obj3 instanceof int[]) {
                t550Var11 = t550Var9;
            } else if (obj3 instanceof Long) {
                t550Var11 = t550Var3;
            } else if (obj3 instanceof long[]) {
                t550Var11 = t550Var8;
            } else if (obj3 instanceof Float) {
                t550Var11 = t550Var13;
            } else if (obj3 instanceof float[]) {
                t550Var11 = t550Var5;
            } else if (obj3 instanceof Boolean) {
                t550Var11 = t550Var12;
            } else if (obj3 instanceof boolean[]) {
                t550Var11 = t550Var7;
            } else if (!(obj3 instanceof String) && obj3 != null) {
                if ((obj3 instanceof Object[]) && (((Object[]) obj3) instanceof String[])) {
                    t550Var11 = t550Var6;
                } else if (obj3.getClass().isArray() && Parcelable.class.isAssignableFrom(obj3.getClass().getComponentType())) {
                    t550Var11 = new p550(obj3.getClass().getComponentType());
                } else if (obj3.getClass().isArray() && Serializable.class.isAssignableFrom(obj3.getClass().getComponentType())) {
                    t550Var11 = new r550(obj3.getClass().getComponentType());
                } else if (obj3 instanceof Parcelable) {
                    t550Var11 = new q550(obj3.getClass());
                } else if (obj3 instanceof Enum) {
                    t550Var11 = new o550(obj3.getClass());
                } else {
                    if (!(obj3 instanceof Serializable)) {
                        vg10.i("Object of type ", obj3.getClass().getName(), " is not supported for navigation arguments.");
                        return null;
                    }
                    t550Var11 = new s550(obj3.getClass());
                }
            }
            t550Var15 = t550Var11;
        }
        return new x450(t550Var15, w450Var.b, w450Var.c, w450Var.d);
    }

    public final f550 a(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        f b = b(resources, xml, asAttributeSet, i);
        if (b instanceof f550) {
            return (f550) b;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x011b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x027d, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        Context context;
        LinkedHashMap linkedHashMap;
        int depth2;
        Object obj;
        int i2 = i;
        f a = this.b.b(xmlResourceParser.getName()).a();
        Context context2 = this.a;
        a.e(context2, attributeSet);
        LinkedHashMap linkedHashMap2 = a.z;
        int i3 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i3 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth3) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, l2i0.NavArgument);
                    String string = obtainAttributes.getString(l2i0.NavArgument_android_name);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    linkedHashMap2.put(string, c(obtainAttributes, resources, i2));
                    obtainAttributes.recycle();
                } else if ("deepLink".equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, l2i0.NavDeepLink);
                    String string2 = obtainAttributes2.getString(l2i0.NavDeepLink_uri);
                    String string3 = obtainAttributes2.getString(l2i0.NavDeepLink_action);
                    String string4 = obtainAttributes2.getString(l2i0.NavDeepLink_mimeType);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        break;
                    }
                    b550 b550Var = new b550();
                    int i4 = i3;
                    if (string2 != null) {
                        b550Var.a = cvu0.v(string2, "${applicationId}", context2.getPackageName(), false);
                    }
                    if (string3 != null && string3.length() != 0) {
                        String v = cvu0.v(string3, "${applicationId}", context2.getPackageName(), false);
                        if (v.length() <= 0) {
                            ny61.g("The NavDeepLink cannot have an empty action.");
                            return null;
                        }
                        b550Var.b = v;
                    }
                    if (string4 != null) {
                        b550Var.c = cvu0.v(string4, "${applicationId}", context2.getPackageName(), false);
                    }
                    int i5 = depth3;
                    String str = b550Var.a;
                    final e eVar = new e(str, b550Var.b, b550Var.c);
                    ArrayList a2 = nrb1.a(linkedHashMap2, new tls() { // from class: androidx.navigation.NavDestination$addDeepLink$missingRequiredArguments$1
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(!e.this.b().contains((String) obj2));
                        }
                    });
                    if (!a2.isEmpty()) {
                        vg10.l("Deep link ", str, " can't be used to open destination ", a, ".\nFollowing required arguments are missing: ", a2);
                        return null;
                    }
                    a.x.add(eVar);
                    obtainAttributes2.recycle();
                    depth3 = i5;
                    i3 = i4;
                } else {
                    int i6 = depth3;
                    int i7 = i3;
                    if ("action".equals(name)) {
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l2i0.NavAction, 0, 0);
                        int resourceId = obtainStyledAttributes.getResourceId(l2i0.NavAction_android_id, 0);
                        v450 v450Var = new v450(obtainStyledAttributes.getResourceId(l2i0.NavAction_destination, 0));
                        j550 j550Var = new j550();
                        j550Var.a = obtainStyledAttributes.getBoolean(l2i0.NavAction_launchSingleTop, false);
                        j550Var.b = obtainStyledAttributes.getBoolean(l2i0.NavAction_restoreState, false);
                        int resourceId2 = obtainStyledAttributes.getResourceId(l2i0.NavAction_popUpTo, -1);
                        context = context2;
                        boolean z = obtainStyledAttributes.getBoolean(l2i0.NavAction_popUpToInclusive, false);
                        linkedHashMap = linkedHashMap2;
                        boolean z2 = obtainStyledAttributes.getBoolean(l2i0.NavAction_popUpToSaveState, false);
                        j550Var.c = resourceId2;
                        j550Var.d = null;
                        j550Var.e = z;
                        j550Var.f = z2;
                        j550Var.g = obtainStyledAttributes.getResourceId(l2i0.NavAction_enterAnim, -1);
                        j550Var.h = obtainStyledAttributes.getResourceId(l2i0.NavAction_exitAnim, -1);
                        j550Var.i = obtainStyledAttributes.getResourceId(l2i0.NavAction_popEnterAnim, -1);
                        j550Var.j = obtainStyledAttributes.getResourceId(l2i0.NavAction_popExitAnim, -1);
                        v450Var.b = j550Var.a();
                        Bundle bundle = new Bundle();
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i7 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                                break;
                            }
                            if (next2 == 2 && depth2 <= depth4) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, l2i0.NavArgument);
                                    String string5 = obtainAttributes3.getString(l2i0.NavArgument_android_name);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    x450 c2 = c(obtainAttributes3, resources, i2);
                                    boolean z3 = c2.c;
                                    if (z3 && z3 && (obj = c2.d) != null) {
                                        c2.a.e(bundle, string5, obj);
                                    }
                                    obtainAttributes3.recycle();
                                }
                                i2 = i;
                            }
                            i7 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            v450Var.c = bundle;
                        }
                        if (a instanceof i40) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (resourceId == 0) {
                            ny61.g("Cannot have an action with actionId 0");
                            return null;
                        }
                        a.y.d(resourceId, v450Var);
                        obtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        linkedHashMap = linkedHashMap2;
                        if ("include".equals(name) && (a instanceof f550)) {
                            TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, k2i0.NavInclude);
                            ((f550) a).f(a(obtainAttributes4.getResourceId(k2i0.NavInclude_graph, 0)));
                            obtainAttributes4.recycle();
                        } else if (a instanceof f550) {
                            ((f550) a).f(b(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i2 = i;
                    depth3 = i6;
                    context2 = context;
                    linkedHashMap2 = linkedHashMap;
                    i3 = 1;
                }
            }
        }
    }
}
